package com.example.mycollections.controllers;

import com.example.mycollections.models.Album;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/albums")
public class AlbumController {

    private final List<Album> albums = new ArrayList<>() {{
        add(new Album("Midnights", "Taylor Swift", 2022, 13));
        add(new Album("Renaissance", "Beyoncé", 2022, 16));
        add(new Album("DAMN.", "Kendrick Lamar", 2017, 14));
    }};

    @GetMapping("/json")
    public List<Album> getAlbumsJson() {
        return albums;
    }

    @GetMapping("/html")
    public String getAlbumsHtml() {
        StringBuilder albumList = new StringBuilder();
        for (Album album : albums) {
            albumList.append("<li>").append(album).append("</li>");
        }

        return """
               <html>
                 <body>
                   <h1>Albums</h1>
                   <ul>
               """ + albumList + """
                   </ul>
                 </body>
               </html>
               """;
    }
}