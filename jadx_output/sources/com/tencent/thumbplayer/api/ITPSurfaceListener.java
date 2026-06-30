package com.tencent.thumbplayer.api;

/* loaded from: classes16.dex */
public interface ITPSurfaceListener {
    void onFlush();

    void onRenderInfo(com.tencent.thumbplayer.api.TPSurfaceRenderInfo tPSurfaceRenderInfo);

    void onVideoPacket(com.tencent.thumbplayer.api.TPVideoPacketBuffer tPVideoPacketBuffer, long j17);
}
