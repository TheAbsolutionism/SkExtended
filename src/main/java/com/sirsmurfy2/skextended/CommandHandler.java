package com.sirsmurfy2.skextended;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class CommandHandler implements CommandExecutor {
	@Override
	public boolean onCommand(
		@NotNull CommandSender sender,
		@NotNull Command command,
		@NotNull String label,
		@NotNull String @NotNull [] args
	) {
		return false;
	}
}
