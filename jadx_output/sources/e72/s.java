package e72;

/* loaded from: classes14.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e72.v f249925d;

    public s(e72.v vVar) {
        this.f249925d = vVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f249925d.f249944q) {
            if (this.f249925d.f249939l) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NumberFaceMotion", "hy: user already start. do nothing");
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.NumberFaceMotion", "hy: not triggered symbol. auto start");
                e72.v vVar = this.f249925d;
                vVar.f249939l = true;
                long j17 = vVar.f249937j;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
                com.tencent.mars.xlog.Log.i("MicroMsg.NumberFaceMotion", "hy: delta after request");
                if (elapsedRealtime < 0) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.NumberFaceMotion", "hy: too fast. regard as fake");
                } else if (elapsedRealtime < 1000) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.NumberFaceMotion", "hy: too fast. wait until normal");
                    com.tencent.mm.sdk.platformtools.u3.i(new e72.t(vVar), 1000 - elapsedRealtime);
                } else {
                    vVar.f249949v.start();
                }
            }
        }
    }
}
