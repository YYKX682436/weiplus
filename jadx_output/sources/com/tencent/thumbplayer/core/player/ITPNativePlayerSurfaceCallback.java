package com.tencent.thumbplayer.core.player;

/* loaded from: classes16.dex */
public interface ITPNativePlayerSurfaceCallback {
    void onFlush();

    void onRenderInfo(com.tencent.thumbplayer.core.player.TPNativePlayerSurfaceRenderInfo tPNativePlayerSurfaceRenderInfo);

    void onVideoPacket(com.tencent.thumbplayer.core.common.TPVideoPacket tPVideoPacket, long j17);
}
