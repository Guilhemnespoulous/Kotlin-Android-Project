package com.example.projet4a.domain.usecase

import com.example.projet4a.data.repository.UserRepository
import com.example.projet4a.domain.entity.User
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.mockk
import junit.framework.Assert.assertEquals
import kotlinx.coroutines.runBlocking
import org.junit.Test

class GetUserUseCaseTest {
    private val userRepository: UserRepository = mockk()

    private val classUnderTest = GetUserUseCase(userRepository)

    //On teste pour un email non valide
    @Test
    fun invoke_with_invalid_email(){
     runBlocking {
         //GIVEN
         val email = ""
         coEvery { userRepository.getUser(email) } returns null

         //WHEN
         val result = classUnderTest.invoke(email)

         //THEN
         coVerify(exactly=1) { userRepository.getUser(email) }
         assertEquals(result, null)
     }

    }

    //On teste pour un email valide

    @Test
    fun invoke_with_valid_email(){
        runBlocking {
            //GIVEN
            val email = "test@test.com"
            val expectedUser = User("test@test.com")
            coEvery { userRepository.getUser(email) } returns expectedUser

            //WHEN
            val result = classUnderTest.invoke(email)

            //THEN
            coVerify(exactly=1) { userRepository.getUser(email) }
            assertEquals(result, expectedUser)
        }

    }

}