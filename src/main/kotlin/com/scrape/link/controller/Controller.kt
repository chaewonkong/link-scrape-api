package com.scrape.link.controller

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class Controller {

    @GetMapping("/healthcheck")
    fun healthCheck(): String {
        return "ok"
    }

    @PostMapping("/link")
    fun scrapeLink(@RequestBody url: String): String {

        return "ok"
    }
}