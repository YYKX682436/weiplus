package com.tencent.thumbplayer.core.player;

/* loaded from: classes16.dex */
public interface ITPNativePlayerPostProcessFrameCallback {
    public static final int EVENT_EOS = 1;
    public static final int EVENT_FLUSH = 2;

    com.tencent.thumbplayer.core.common.TPPostProcessFrame onPostProcessFrame(com.tencent.thumbplayer.core.common.TPPostProcessFrame tPPostProcessFrame, int i17);
}
