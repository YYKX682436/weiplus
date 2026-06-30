package com.tencent.mm.xwebutil;

/* loaded from: classes13.dex */
public class t extends java.util.TimerTask {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.xwebutil.XWebAudioPlayerProgress f214887d;

    public t(com.tencent.mm.xwebutil.XWebAudioPlayerProgress xWebAudioPlayerProgress) {
        this.f214887d = xWebAudioPlayerProgress;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        java.lang.Runnable runnable;
        com.tencent.mm.xwebutil.XWebAudioPlayerProgress xWebAudioPlayerProgress = this.f214887d;
        com.tencent.mm.xwebutil.XWebAudioPlayerProgressBall xWebAudioPlayerProgressBall = xWebAudioPlayerProgress.f214813i;
        if (xWebAudioPlayerProgressBall == null || (runnable = xWebAudioPlayerProgress.f214816o) == null) {
            return;
        }
        xWebAudioPlayerProgressBall.post(runnable);
    }
}
