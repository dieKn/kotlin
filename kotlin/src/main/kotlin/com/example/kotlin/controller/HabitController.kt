package com.example.kotlin.controller

import com.example.kotlin.domain.Habit
import com.example.kotlin.service.HabitService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class HabitController {
	@Autowired
	var habitService: HabitService? = null

	@GetMapping("/habits")
	fun getCustomerList(): List<Habit>{
		return habitService!!.findAll()
	}
}