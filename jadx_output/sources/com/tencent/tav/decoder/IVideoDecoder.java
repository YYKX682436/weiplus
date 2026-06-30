package com.tencent.tav.decoder;

/* loaded from: classes16.dex */
public interface IVideoDecoder extends com.tencent.tav.decoder.IDecoder {
    long getPreReadCost();

    com.tencent.tav.coremedia.TextureInfo getTextureInfo();

    void init(java.lang.String str, com.tencent.tav.coremedia.CGSize cGSize, com.tencent.tav.decoder.IDecoderTrack.SurfaceCreator surfaceCreator);

    boolean isLastFrameValid();

    com.tencent.tav.coremedia.CMTime nextFrameTime(com.tencent.tav.coremedia.CMTime cMTime);

    android.view.Surface outputSurface();

    com.tencent.tav.coremedia.CMSampleBuffer readVideoSampleBuffer(com.tencent.tav.coremedia.CMTime cMTime);

    void release(boolean z17);

    void seekTo(com.tencent.tav.coremedia.CMTime cMTime, boolean z17);

    @Override // com.tencent.tav.decoder.IDecoder
    void setLogger(com.tencent.tav.decoder.logger.WXLogger wXLogger);

    void switchFrame();
}
