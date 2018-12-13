package org.checkania.scoreboard;

import org.bukkit.*;
import org.bukkit.entity.*;
import org.bukkit.scoreboard.*;
import java.util.*;
import org.bukkit.event.*;
import org.bukkit.event.player.*;

public class Events implements Listener
{
    private Scoreboard scoreboard;
    private String title;
    private Map<String, Integer> scores;
    private List<Team> teams;
    private HashMap<UUID, Scoreboard> myHashMap;
    
    public Events() {
        this.myHashMap = new HashMap<UUID, Scoreboard>();
    }
    
    @EventHandler
    private void move(final PlayerJoinEvent e) {
        final Player p = e.getPlayer();
        final ScoreboardManager manager = Bukkit.getScoreboardManager();
        final Scoreboard board = manager.getNewScoreboard();
        final Objective obj = board.registerNewObjective("Kills", "Player");
        obj.setDisplayName(new StringBuilder().append(ChatColor.GOLD).append(ChatColor.BOLD).append("Checken").toString());
        obj.setDisplaySlot(DisplaySlot.SIDEBAR);
        final Score score = obj.getScore(new StringBuilder().append(ChatColor.BLUE).append(ChatColor.BOLD).append("You: ").append(ChatColor.YELLOW).append(ChatColor.BOLD).append(p.getName()).toString());
        score.setScore(1);
        
        if (p.hasPermission("scoreboard.admin")) {
        final Score score2 = obj.getScore(new StringBuilder().append(ChatColor.BLUE).append(ChatColor.BOLD).append("Rank: ").append(ChatColor.DARK_RED).append(ChatColor.BOLD).append("Admin").toString());
        score2.setScore(2);
        p.setScoreboard(manager.getNewScoreboard());
        p.setScoreboard(board);
        } 
        if (p.hasPermission("scoreboard.mod")) {
            final Score score2 = obj.getScore(new StringBuilder().append(ChatColor.BLUE).append(ChatColor.BOLD).append("Rank: ").append(ChatColor.GREEN).append(ChatColor.BOLD).append("Mod").toString());
            score2.setScore(2);
            p.setScoreboard(manager.getNewScoreboard());
            p.setScoreboard(board);
        }
        if (p.hasPermission("scoreboard.builder")) {
            final Score score2 = obj.getScore(new StringBuilder().append(ChatColor.BLUE).append(ChatColor.BOLD).append("Rank: ").append(ChatColor.DARK_GREEN).append(ChatColor.BOLD).append("Builder").toString());
            score2.setScore(2);
            p.setScoreboard(manager.getNewScoreboard());
            p.setScoreboard(board);
        }
        if (p.hasPermission("scoreboard.default")) {
        	final Score score2 = obj.getScore(new StringBuilder().append(ChatColor.BLUE).append(ChatColor.BOLD).append("Rank: ").append(ChatColor.GRAY).append(ChatColor.BOLD).append("Default").toString());
            score2.setScore(2);
            p.setScoreboard(manager.getNewScoreboard());
            p.setScoreboard(board);
        }
        	
        }
    
    @EventHandler
    private void move(final PlayerQuitEvent e) {
        final Player p = e.getPlayer();
        final ScoreboardManager manager = Bukkit.getScoreboardManager();
        final Scoreboard board = manager.getNewScoreboard();
        final Objective obj = board.registerNewObjective("Kills", "Player");
        obj.setDisplayName(new StringBuilder().append(ChatColor.GOLD).append(ChatColor.BOLD).append("Checken").toString());
        obj.setDisplaySlot(DisplaySlot.SIDEBAR);
        final Score score = obj.getScore(new StringBuilder().append(ChatColor.BLUE).append(ChatColor.BOLD).append("You: ").append(ChatColor.YELLOW).append(ChatColor.BOLD).append(p.getName()).toString());
        score.setScore(1);
        
        if (p.hasPermission("scoreboard.admin")) {
        final Score score2 = obj.getScore(new StringBuilder().append(ChatColor.BLUE).append(ChatColor.BOLD).append("Rank: ").append(ChatColor.DARK_RED).append(ChatColor.BOLD).append("Admin").toString());
        score2.setScore(2);
        p.setScoreboard(manager.getNewScoreboard());
        p.setScoreboard(board);
        } 
        if (p.hasPermission("scoreboard.mod")) {
            final Score score2 = obj.getScore(new StringBuilder().append(ChatColor.BLUE).append(ChatColor.BOLD).append("Rank: ").append(ChatColor.GREEN).append(ChatColor.BOLD).append("Mod").toString());
            score2.setScore(2);
            p.setScoreboard(manager.getNewScoreboard());
            p.setScoreboard(board);
        }
        if (p.hasPermission("scoreboard.builder")) {
            final Score score2 = obj.getScore(new StringBuilder().append(ChatColor.BLUE).append(ChatColor.BOLD).append("Rank: ").append(ChatColor.DARK_GREEN).append(ChatColor.BOLD).append("Builder").toString());
            score2.setScore(2);
            p.setScoreboard(manager.getNewScoreboard());
            p.setScoreboard(board);
        }
        else {
        	final Score score2 = obj.getScore(new StringBuilder().append(ChatColor.BLUE).append(ChatColor.BOLD).append("Rank: ").append(ChatColor.GRAY).append(ChatColor.BOLD).append("Default").toString());
            score2.setScore(2);
            p.setScoreboard(manager.getNewScoreboard());
            p.setScoreboard(board);
        }
        	
        }
}
    