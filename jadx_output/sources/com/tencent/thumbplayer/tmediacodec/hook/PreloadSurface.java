package com.tencent.thumbplayer.tmediacodec.hook;

/* loaded from: classes14.dex */
public final class PreloadSurface extends android.view.Surface {
    private final android.graphics.SurfaceTexture mSurfaceTexture;

    public PreloadSurface(android.graphics.SurfaceTexture surfaceTexture) {
        super(surfaceTexture);
        this.mSurfaceTexture = surfaceTexture;
    }

    public final android.graphics.SurfaceTexture getSurfaceTexture() {
        return this.mSurfaceTexture;
    }
}
