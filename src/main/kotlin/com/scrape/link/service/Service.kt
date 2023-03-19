package com.scrape.link.service

import com.scrape.link.model.http.SiteMeta

class Service {
    fun scrapeMeta(url: String): SiteMeta {
        // TODO: scrape https://kyleplatt.com/scraping-meta-tags-for-social-media-with-kotlin/
        return SiteMeta(url)
    }
}