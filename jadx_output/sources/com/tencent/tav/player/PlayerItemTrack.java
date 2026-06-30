package com.tencent.tav.player;

/* loaded from: classes16.dex */
public class PlayerItemTrack {
    private com.tencent.tav.asset.AssetTrack assetTrack;
    private float currentVideoFrameRate;
    private boolean enabled = true;
    private java.lang.String videoFieldMode;

    public com.tencent.tav.asset.AssetTrack getAssetTrack() {
        return this.assetTrack;
    }

    public float getCurrentVideoFrameRate() {
        return this.currentVideoFrameRate;
    }

    public java.lang.String getVideoFieldMode() {
        return this.videoFieldMode;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public void setAssetTrack(com.tencent.tav.asset.AssetTrack assetTrack) {
        this.assetTrack = assetTrack;
    }

    public void setCurrentVideoFrameRate(float f17) {
        this.currentVideoFrameRate = f17;
    }

    public void setEnabled(boolean z17) {
        this.enabled = z17;
    }

    public void setVideoFieldMode(java.lang.String str) {
        this.videoFieldMode = str;
    }
}
