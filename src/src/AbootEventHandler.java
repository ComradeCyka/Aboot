package src;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;


public class AbootEventHandler implements Listener{
	@EventHandler(priority = EventPriority.NORMAL)
	public void onPlayerChat(PlayerChatEvent event)
	{
		if(Aboot.config.contains(event.getPlayer().getName()) || Aboot.aboot.containsKey(event.getPlayer().getName()))
		{
			String s = event.getMessage();
			s = s.replaceAll("(?i)about", "aboot");
			s = s + " eh?";
			event.setMessage(s);
		}
	}
	
}
