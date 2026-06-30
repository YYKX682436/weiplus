package gl2;

/* loaded from: classes3.dex */
public final class d implements hn0.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gl2.e f272804a;

    public d(gl2.e eVar) {
        this.f272804a = eVar;
    }

    @Override // hn0.i
    public void callback(int i17, android.os.Bundle bundle) {
        com.tencent.mm.plugin.finder.report.p1 p1Var;
        gl2.e eVar = this.f272804a;
        com.tencent.mars.xlog.Log.i(eVar.f272809k, "preload, notify first frame from preload");
        if (i17 == 2001) {
            com.tencent.mm.plugin.finder.report.p1 p1Var2 = com.tencent.mm.plugin.finder.report.q1.f125258d;
            if (p1Var2 == null) {
                return;
            }
            p1Var2.f125233d = android.os.SystemClock.elapsedRealtime();
            return;
        }
        if (i17 == 2008) {
            com.tencent.mm.plugin.finder.report.p1 p1Var3 = com.tencent.mm.plugin.finder.report.q1.f125258d;
            if (p1Var3 == null) {
                return;
            }
            p1Var3.f125234e = android.os.SystemClock.elapsedRealtime();
            return;
        }
        if (i17 == 2003) {
            com.tencent.mm.plugin.finder.report.r5.f125335a.a();
            com.tencent.mm.plugin.finder.report.q1.f125255a.d(eVar.f272805g, null);
            com.tencent.mars.xlog.Log.i(eVar.f272809k, "TXLivePlayer:receive first frame");
        } else if (i17 == 2004 && (p1Var = com.tencent.mm.plugin.finder.report.q1.f125258d) != null) {
            p1Var.f125235f = android.os.SystemClock.elapsedRealtime();
        }
    }
}
