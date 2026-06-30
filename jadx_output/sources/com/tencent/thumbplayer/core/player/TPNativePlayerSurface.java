package com.tencent.thumbplayer.core.player;

/* loaded from: classes16.dex */
public class TPNativePlayerSurface extends android.view.Surface {
    private com.tencent.thumbplayer.core.player.ITPNativePlayerSurfaceCallback mSurfaceCallback;

    public TPNativePlayerSurface(android.graphics.SurfaceTexture surfaceTexture) {
        super(surfaceTexture);
    }

    public void setTPSurfaceCallback(com.tencent.thumbplayer.core.player.ITPNativePlayerSurfaceCallback iTPNativePlayerSurfaceCallback) {
        this.mSurfaceCallback = iTPNativePlayerSurfaceCallback;
    }
}
