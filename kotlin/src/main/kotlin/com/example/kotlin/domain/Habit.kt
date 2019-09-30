package com.example.kotlin.domain


import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor


@Data
@AllArgsConstructor
@NoArgsConstructor
class Habit(id: Int, habit: String, actCheck: Boolean) {
	val id: Int? = id
	val habit: String = habit
	val actCheck: Boolean = actCheck
}