package com.example.kotlin.service

import com.example.kotlin.domain.Habit
import com.example.kotlin.repository.HabitRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class HabitService {
	@Autowired
	var habitRepository: HabitRepository? = null


	fun findAll(): List<Habit>{
		return habitRepository!!.findAll()
	}
}