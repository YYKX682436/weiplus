package dd4;

/* loaded from: classes4.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.jj4 f229058d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f229059e;

    public t(r45.jj4 jj4Var, java.lang.String str) {
        this.f229058d = jj4Var;
        this.f229059e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleResourceHelper$Companion$getMediaDownloader$1");
        java.util.Iterator it = t21.d3.o(this.f229058d.f377855d).iterator();
        while (it.hasNext()) {
            t21.v2 v2Var = (t21.v2) it.next();
            java.lang.String str = v2Var.B;
            boolean z17 = false;
            if (str != null && r26.n0.B(str, this.f229059e, false)) {
                z17 = true;
            }
            if (z17) {
                dw3.c0.f244182a.j(v2Var.C);
                t21.d3.e(v2Var.d());
                com.tencent.mars.xlog.Log.i("MicroMsg.FlexibleResourceHelper", "delete video info:" + v2Var);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleResourceHelper$Companion$getMediaDownloader$1");
    }
}
