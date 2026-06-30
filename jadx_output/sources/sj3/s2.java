package sj3;

/* loaded from: classes14.dex */
public final class s2 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f408737a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sj3.g3 f408738b;

    public s2(com.tencent.mm.ui.widget.dialog.z2 z2Var, sj3.g3 g3Var) {
        this.f408737a = z2Var;
        this.f408738b = g3Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        this.f408737a.B();
        com.tencent.mm.plugin.multitalk.model.u0.f150146f++;
        if (com.tencent.mm.plugin.multitalk.model.e3.Ri().f150177t != null) {
            java.lang.String str = com.tencent.mm.plugin.multitalk.model.e3.Ri().f150177t.f71606d;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenProjectReportHelper", "markClickFileScreenProject");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1538L, 0L, 1L);
        this.f408738b.f408520a.U6();
    }
}
