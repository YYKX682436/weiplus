package com.tencent.mm.xwebutil;

/* loaded from: classes13.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.xwebutil.XWebAudioPlayerProgress f214889d;

    public u(com.tencent.mm.xwebutil.XWebAudioPlayerProgress xWebAudioPlayerProgress) {
        this.f214889d = xWebAudioPlayerProgress;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer;
        com.tencent.mm.xwebutil.XWebAudioPlayerProgress xWebAudioPlayerProgress = this.f214889d;
        com.tencent.mm.xwebutil.x xVar = xWebAudioPlayerProgress.f214814m;
        if (xVar != null) {
            com.tencent.mm.xwebutil.l lVar = (com.tencent.mm.xwebutil.l) xVar;
            lVar.getClass();
            long j17 = 0;
            try {
                if (com.tencent.mm.xwebutil.q.b(lVar.f214848a) && (iTPPlayer = com.tencent.mm.xwebutil.q.f214868a.f214877h) != null) {
                    int currentState = iTPPlayer.getCurrentState();
                    if (currentState != 7 && currentState != 8 && currentState != 9) {
                        j17 = iTPPlayer.getCurrentPositionMs();
                    }
                    j17 = iTPPlayer.getDurationMs();
                }
            } catch (java.lang.Throwable th6) {
                th6.getMessage();
            }
            if (xWebAudioPlayerProgress.f214813i.a(((float) j17) / ((float) xWebAudioPlayerProgress.f214809e), false)) {
                xWebAudioPlayerProgress.f214808d = j17;
                xWebAudioPlayerProgress.f214810f.setText(xWebAudioPlayerProgress.a(j17));
            }
        }
    }
}
