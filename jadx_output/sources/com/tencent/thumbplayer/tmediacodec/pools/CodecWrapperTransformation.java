package com.tencent.thumbplayer.tmediacodec.pools;

/* loaded from: classes14.dex */
public interface CodecWrapperTransformation {
    void clearAndReleaseAll();

    com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper obtainCodecWrapper(com.tencent.thumbplayer.tmediacodec.codec.FormatWrapper formatWrapper);

    void removeFromRunning(com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper reuseCodecWrapper);

    void transToKeep(com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper reuseCodecWrapper);

    void transToRunning(com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper reuseCodecWrapper);
}
