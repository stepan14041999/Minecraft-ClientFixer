package com.gamerforea.clientfixer.loader;

import static com.gamerforea.clientfixer.loader.CoreMod.MODID;
import static com.gamerforea.clientfixer.loader.CoreMod.NAME;
import static com.gamerforea.clientfixer.loader.CoreMod.VERSION;
import net.minecraftforge.fml.common.DummyModContainer;
import net.minecraftforge.fml.common.LoadController;
import net.minecraftforge.fml.common.ModMetadata;

import com.google.common.eventbus.EventBus;

public class ModContainer extends DummyModContainer
{
	private ModMetadata meta = new ModMetadata();

	public ModContainer()
	{
		this.meta.autogenerated = false;
		this.meta.authorList.add("gamerforEA");
		this.meta.credits = "Created by gamerforEA.";
		this.meta.modId = this.getModId();
		this.meta.name = this.getName();
		this.meta.version = this.getVersion();
	}

	@Override
	public boolean registerBus(EventBus bus, LoadController controller)
	{
		return true;
	}

	@Override
	public String getModId()
	{
		return MODID;
	}

	@Override
	public String getName()
	{
		return NAME;
	}

	@Override
	public String getVersion()
	{
		return VERSION;
	}

	@Override
	public String getDisplayVersion()
	{
		return this.getVersion();
	}

	@Override
	public ModMetadata getMetadata()
	{
		return this.meta;
	}
}