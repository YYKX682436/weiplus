package tl;

/* loaded from: classes12.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tl.t f420054d;

    public j(tl.t tVar) {
        this.f420054d = tVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.tencent.mars.xlog.Log.i("MicroMsg.MMAudioRecorder", "stop try stopRecorder, pcmRecorder:%s", this.f420054d.f420136p);
        synchronized (tl.t.f420119x) {
            tl.w wVar = this.f420054d.f420136p;
            if (wVar != null) {
                wVar.l();
                tl.t tVar = this.f420054d;
                tVar.f420136p.f420172y = null;
                tVar.f420136p = null;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMAudioRecorder", "stop finish stopRecorder, cost:%s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
    }
}
