package com.tencent.xweb;

/* loaded from: classes13.dex */
public interface VideoJsCallback {
    boolean onSetRequestedOrientation(int i17);

    void onVideoEmptied();

    void onVideoEnded();

    void onVideoEnterFullscreen(boolean z17, long j17, double d17, double d18, boolean z18, boolean z19, double d19, double d27, double[] dArr);

    void onVideoError(int i17, java.lang.String str);

    void onVideoExitFullscreen();

    void onVideoPause();

    void onVideoPlay();

    void onVideoPlaying();

    void onVideoRateChange(double d17);

    void onVideoSeeked();

    void onVideoSeeking();

    void onVideoSizeUpdate(double d17, double d18);

    void onVideoTimeUpdate(double d17, double d18, double[] dArr);

    void onVideoVolumeChange(boolean z17);

    void onVideoWaiting();
}
