/*
 *   This file is part of Skript.
 *
 *  Skript is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  Skript is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with Skript.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * 
 * Copyright 2011-2016 Peter Güttinger and contributors
 * 
 */

package ch.njol.skript.bukkitutil.block;

import org.bukkit.block.Block;

/**
 * Methods which operate with blocks but are not compatible across some
 * Minecraft versions.
 */
public interface BlockCompat {
	
	/**
	 * Instance of BlockCompat for current Minecraft version.
	 */
	static final BlockCompat INSTANCE = new MagicBlockCompat();
	
	/**
	 * Gets block value from a block. The value can be compared to other values
	 * if needed, but cannot be used to retrieve any other data.
	 * @param block Block to retrieve value from.
	 * @return Block value
	 */
	BlockValues getBlockValues(Block block);
}