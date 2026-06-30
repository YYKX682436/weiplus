package com.tencent.mm.xwebutil;

/* loaded from: classes13.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.xwebutil.XWebAudioPlayerProgress f214891d;

    public w(com.tencent.mm.xwebutil.XWebAudioPlayerProgress xWebAudioPlayerProgress) {
        this.f214891d = xWebAudioPlayerProgress;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.xwebutil.XWebAudioPlayerProgress xWebAudioPlayerProgress = this.f214891d;
        xWebAudioPlayerProgress.f214813i.setTotalLength(xWebAudioPlayerProgress.f214812h.getWidth());
    }
}
