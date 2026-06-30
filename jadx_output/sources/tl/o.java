package tl;

/* loaded from: classes12.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tl.t f420063d;

    public o(tl.t tVar) {
        this.f420063d = tVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMAudioRecorder", "start to wait pcmrecorder stop, markStop: %s", java.lang.Boolean.valueOf(this.f420063d.f420131k));
        java.lang.Object obj = tl.t.f420120y;
        synchronized (obj) {
            try {
                obj.wait(300L);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMAudioRecorder", e17, "", new java.lang.Object[0]);
            }
        }
        synchronized (tl.t.f420119x) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMAudioRecorder", "wait pcmrecorder stop, timeout, mPcmRecorder: %s", this.f420063d.f420136p);
            tl.w wVar = this.f420063d.f420136p;
            if (wVar != null) {
                try {
                    wVar.l();
                    tl.t tVar = this.f420063d;
                    tVar.f420136p.f420172y = null;
                    tVar.f420136p = null;
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMAudioRecorder", e18, "", new java.lang.Object[0]);
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMAudioRecorder", "finish to pcmrecorder stop, markStop: %s", java.lang.Boolean.valueOf(this.f420063d.f420131k));
    }
}
