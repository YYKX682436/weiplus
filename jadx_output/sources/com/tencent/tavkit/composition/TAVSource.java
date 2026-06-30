package com.tencent.tavkit.composition;

/* loaded from: classes10.dex */
public class TAVSource {
    private com.tencent.tav.asset.Asset asset;
    private com.tencent.tav.core.AudioMix audioMix;
    private com.tencent.tav.core.composition.VideoComposition videoComposition;

    public com.tencent.tav.asset.Asset getAsset() {
        return this.asset;
    }

    public com.tencent.tav.core.AudioMix getAudioMix() {
        return this.audioMix;
    }

    public com.tencent.tav.core.composition.VideoComposition getVideoComposition() {
        return this.videoComposition;
    }

    public void setAsset(com.tencent.tav.asset.Asset asset) {
        this.asset = asset;
    }

    public void setAudioMix(com.tencent.tav.core.AudioMix audioMix) {
        this.audioMix = audioMix;
    }

    public void setVideoComposition(com.tencent.tav.core.composition.VideoComposition videoComposition) {
        this.videoComposition = videoComposition;
    }

    public java.lang.String toString() {
        return "TAVSource{\nasset=" + this.asset + "\nvideoComposition=" + this.videoComposition + "\naudioMix=" + this.audioMix + '}';
    }
}
