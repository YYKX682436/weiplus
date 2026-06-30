package com.tencent.thumbplayer.adapter.player;

/* loaded from: classes16.dex */
public interface ITPCapture {
    void generateImageAsyncAtTime(long j17, com.tencent.thumbplayer.core.imagegenerator.TPImageGeneratorParams tPImageGeneratorParams, com.tencent.thumbplayer.api.TPCaptureCallBack tPCaptureCallBack);

    void release();
}
