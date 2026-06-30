package sj3;

/* loaded from: classes14.dex */
public class j4 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f408602a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sj3.a5 f408603b;

    public j4(sj3.a5 a5Var, com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f408603b = a5Var;
        this.f408602a = z2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public void a() {
        this.f408602a.B();
        com.tencent.mm.plugin.multitalk.model.u0.f150146f++;
        if (com.tencent.mm.plugin.multitalk.model.e3.Ri().f150177t != null) {
            java.lang.String str = com.tencent.mm.plugin.multitalk.model.e3.Ri().f150177t.f71606d;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenProjectReportHelper", "markClickFileScreenProject");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1538L, 0L, 1L);
        this.f408603b.f408417d.U6();
    }
}
