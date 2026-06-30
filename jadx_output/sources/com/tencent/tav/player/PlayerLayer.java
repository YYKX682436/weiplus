package com.tencent.tav.player;

/* loaded from: classes16.dex */
public class PlayerLayer {
    private boolean needReleaseSurface;
    private com.tencent.tav.player.Player player;
    private boolean readyForDisplay;
    private com.tencent.tav.player.PlayerLayer.PlayerLayerReadyListener readyListener;
    android.view.Surface surface;
    int surfaceHeight;
    int surfaceWidth;
    private int videoGravity;
    private android.graphics.Rect videoRect;

    /* loaded from: classes16.dex */
    public interface PlayerLayerReadyListener {
        void finish(com.tencent.tav.player.PlayerLayer playerLayer);
    }

    public PlayerLayer(android.view.Surface surface, int i17, int i18) {
        this.needReleaseSurface = false;
        this.readyListener = null;
        this.surface = surface;
        this.surfaceWidth = i17;
        this.surfaceHeight = i18;
    }

    public com.tencent.tav.player.Player getPlayer() {
        return this.player;
    }

    public android.view.Surface getSurface() {
        return this.surface;
    }

    public int getSurfaceHeight() {
        return this.surfaceHeight;
    }

    public int getSurfaceWidth() {
        return this.surfaceWidth;
    }

    public int getVideoGravity() {
        return this.videoGravity;
    }

    public android.graphics.Rect getVideoRect() {
        return this.videoRect;
    }

    public boolean isReadyForDisplay() {
        return this.readyForDisplay;
    }

    public void release() {
        if (this.needReleaseSurface) {
            this.surface.release();
        }
    }

    public void setPlayer(com.tencent.tav.player.Player player) {
        this.player = player;
        if (player != null) {
            player.bindLayer(this);
        }
    }

    public void setReadyForDisplay(com.tencent.tav.player.PlayerLayer.PlayerLayerReadyListener playerLayerReadyListener) {
        this.readyListener = playerLayerReadyListener;
    }

    public void setVideoGravity(int i17) {
        this.videoGravity = i17;
    }

    public PlayerLayer(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        this.needReleaseSurface = false;
        this.readyListener = null;
        this.surface = new android.view.Surface(surfaceTexture);
        this.needReleaseSurface = true;
        this.surfaceWidth = i17;
        this.surfaceHeight = i18;
    }
}
