package com.example.kotlin.repository

import com.example.kotlin.domain.Habit
import org.springframework.stereotype.Repository

@Repository
class HabitRepository {
	val habitMap: Map<Integer, Habit> = mapOf()

	fun findAll(): List<Habit>{
		val strList: List<Habit> = listOf(
			Habit(1, "test", true),
			Habit(2, "test", false))
		return strList
	}
}