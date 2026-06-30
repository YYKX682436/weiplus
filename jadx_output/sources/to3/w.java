package to3;

/* loaded from: classes9.dex */
public class w implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ to3.a0 f420984d;

    public w(to3.a0 a0Var) {
        this.f420984d = a0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        long j17;
        boolean a17 = gm0.j1.a();
        to3.a0 a0Var = this.f420984d;
        if (!a17) {
            com.tencent.mm.sdk.platformtools.b4 b4Var = a0Var.f420949m;
            long j18 = a0Var.f420948i;
            b4Var.c(j18, j18);
            return false;
        }
        a0Var.a(5, 5);
        com.tencent.mm.sdk.platformtools.b4 b4Var2 = a0Var.f420949m;
        a0Var.getClass();
        long g17 = yo3.m.g();
        if (g17 <= 0) {
            j17 = a0Var.f420948i;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.OfflineTokensMgr", "OfflineTokensMgr updateInterval:" + g17);
            j17 = g17 * 1000;
        }
        b4Var2.c(j17, j17);
        return false;
    }
}
