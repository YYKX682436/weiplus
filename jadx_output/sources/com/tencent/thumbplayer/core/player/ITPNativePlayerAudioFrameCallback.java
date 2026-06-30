package com.tencent.thumbplayer.core.player;

/* loaded from: classes16.dex */
public interface ITPNativePlayerAudioFrameCallback {
    public static final int FLAG_EOS = 1;

    void onAudioFrame(com.tencent.thumbplayer.core.common.TPAudioFrame tPAudioFrame, int i17);
}
