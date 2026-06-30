package u81;

/* loaded from: classes7.dex */
public class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u81.n0 f425445d;

    public m0(u81.n0 n0Var) {
        this.f425445d = n0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        u81.n0 n0Var = this.f425445d;
        n0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.SyncTask", "task run manualFinish = false");
        n0Var.getClass();
        n0Var.c(n0Var.b());
        long j17 = n0Var.f425450d;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        n0Var.f425451e = android.os.SystemClock.elapsedRealtime() - j17;
    }
}
