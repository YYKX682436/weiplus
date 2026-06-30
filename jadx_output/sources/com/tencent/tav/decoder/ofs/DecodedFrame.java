package com.tencent.tav.decoder.ofs;

/* loaded from: classes16.dex */
class DecodedFrame {
    public final com.tencent.tav.coremedia.CMTime ptsInClip;
    public final com.tencent.tav.coremedia.CMTime ptsInMedia;
    public final com.tencent.tav.coremedia.TextureInfo textureInfo;

    public DecodedFrame(com.tencent.tav.coremedia.CMTimeRange cMTimeRange, com.tencent.tav.coremedia.CMTime cMTime, com.tencent.tav.coremedia.TextureInfo textureInfo) {
        this.ptsInMedia = cMTime;
        this.ptsInClip = cMTime.sub(cMTimeRange.getStart());
        this.textureInfo = textureInfo;
    }
}
