package hh;

/* loaded from: classes7.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hh.f f281434d;

    public e(hh.f fVar) {
        this.f281434d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("task run manualFinish = ");
        hh.f fVar = this.f281434d;
        sb6.append(fVar.f281439e);
        ah.i.b("MicroMsg.SDK.SyncTask", sb6.toString(), new java.lang.Object[0]);
        if (fVar.f281439e) {
            fVar.a();
        } else {
            fVar.a();
            fVar.b(null);
        }
        fVar.f281438d = android.os.SystemClock.elapsedRealtime() - fVar.f281437c;
    }
}
