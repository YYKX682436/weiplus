package zf4;

/* loaded from: classes13.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f472692d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zf4.w f472693e;

    public v(zf4.w wVar) {
        this.f472693e = wVar;
        this.f472692d = new zf4.u(this, wVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        zf4.w wVar = this.f472693e;
        if (wVar.f472695a == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoiceRemindRecorder", "Stop Record Failed recorder == null");
            return;
        }
        synchronized (wVar) {
            try {
                oy.i iVar = (oy.i) i95.n0.c(oy.i.class);
                if (iVar != null && ((com.tencent.mm.feature.chatrecordstts.b1) iVar).f65353p != oy.k.f349823d) {
                    try {
                        java.lang.Thread.sleep(300L);
                    } catch (java.lang.Exception unused) {
                    }
                }
                zf4.w wVar2 = this.f472693e;
                if (!wVar2.f472695a.startRecord(zf4.r.b(wVar2.f472698d, true))) {
                    zf4.r.a(this.f472693e.f472698d);
                    zf4.w wVar3 = this.f472693e;
                    wVar3.f472698d = null;
                    wVar3.f472695a = null;
                }
                this.f472693e.f472699e = android.os.SystemClock.elapsedRealtime();
                java.lang.String str = this.f472693e.f472698d;
                android.os.SystemClock.elapsedRealtime();
            } catch (java.lang.Throwable th6) {
                throw th6;
            }
        }
        this.f472692d.sendEmptyMessageDelayed(0, 1L);
    }
}
