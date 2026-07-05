package com.example.company_intranet_portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.company_intranet_portal.model.Announcement;
import com.example.company_intranet_portal.service.AnnouncementService;

@Controller
public class AnnouncementController {
    private final AnnouncementService announcementService;

    public AnnouncementController(AnnouncementService announcementService) {
        this.announcementService = announcementService;
    }

    @GetMapping("/")
    public String viewPortal(Model model) {
        model.addAttribute("announcements", announcementService.getAllAnnouncements());
        model.addAttribute("newAnnouncement", new Announcement());
        return "index";
    }

    @PostMapping("/announcement/add")
    public String addAnnouncement(@ModelAttribute Announcement announcement) {
        announcementService.addAnnouncement(announcement);
        return "redirect:/";
    }
}