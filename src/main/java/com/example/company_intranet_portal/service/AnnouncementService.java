package com.example.company_intranet_portal.service;

import com.example.company_intranet_portal.model.Announcement;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class AnnouncementService {
    private final List<Announcement> announcements = new ArrayList<>();

    public AnnouncementService() {
        // Initial mock data for a realistic company portal experience
        announcements.add(new Announcement(1L, "Q3 Hackathon", "Registration is now open for the annual internal hackathon!", "IT Team", "High"));
        announcements.add(new Announcement(2L, "Investment Declarations", "Please submit your tax investment declarations by month-end.", "HR Team", "Medium"));
        announcements.add(new Announcement(3L, "Scheduled Network Outage", "Core router upgrades scheduled for this Sunday at 2 AM IST.", "IT Support", "Low"));
    }

    public List<Announcement> getAllAnnouncements() {
        return announcements;
    }

    public void addAnnouncement(Announcement announcement) {
        announcement.setId((long) (announcements.size() + 1));
        announcements.add(announcement);
    }
}