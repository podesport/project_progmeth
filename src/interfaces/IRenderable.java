// 
// Decompiled by Procyon v0.5.36
// 

package interfaces;

import javafx.scene.canvas.GraphicsContext;

public interface IRenderable
{
    int getZ();
    
    void draw(final GraphicsContext p0);
    
    boolean isVisible();
    
    boolean isDestroy();
}
