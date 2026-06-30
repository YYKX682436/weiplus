package com.tencent.thumbplayer.core.player;

/* loaded from: classes16.dex */
public interface ITPNativePlayerVideoFrameCallback {
    public static final int FLAG_EOS = 1;
    public static final int FLAG_MULTITRACK_END = 4;
    public static final int FLAG_MULTITRACK_START = 2;

    void onVideoFrame(com.tencent.thumbplayer.core.common.TPVideoFrame tPVideoFrame, int i17);
}
