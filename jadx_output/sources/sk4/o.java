package sk4;

/* loaded from: classes15.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sk4.p f408988d;

    public o(sk4.p pVar) {
        this.f408988d = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AudioRecorderImpl", "stop");
        sk4.p pVar = this.f408988d;
        if (pVar.f408994i) {
            tl.w wVar = pVar.f408999q;
            if (!((wVar == null || wVar.l()) ? false : true)) {
                pVar.f408994i = false;
                pVar.f408998p.b(new byte[2], 2);
                pVar.f408999q = null;
                return;
            }
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.AudioRecorderImpl", "not isRunning or MMPcmRecorder stop error");
    }
}
