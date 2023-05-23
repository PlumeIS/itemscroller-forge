package fi.dy.masa.itemscroller;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fi.dy.masa.malilib.event.InitializationHandler;

@Mod("itemscroller")
public class ItemScroller
{
    public static final Logger logger = LogManager.getLogger(Reference.MOD_ID);


    public ItemScroller()
    {
        InitializationHandler.getInstance().registerInitializationHandler(new InitHandler());
    }
}
