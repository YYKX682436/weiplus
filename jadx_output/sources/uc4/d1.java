package uc4;

/* loaded from: classes4.dex */
public final class d1 implements com.tencent.mm.pluginsdk.ui.span.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final xc4.p f426387a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f426388b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.ref.WeakReference f426389c;

    public d1(android.app.Activity activity, xc4.p info) {
        kotlin.jvm.internal.o.g(info, "info");
        this.f426387a = info;
        this.f426388b = "ImproveStatusIconClick";
        this.f426389c = new java.lang.ref.WeakReference(activity);
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.c1
    public void a(android.view.View view, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveStatusIconClick");
        android.app.Activity activity = (android.app.Activity) this.f426389c.get();
        if (activity == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveStatusIconClick");
            return;
        }
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveStatusIconClick");
            return;
        }
        we0.j1 j1Var = (we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class));
        if (j1Var.tj(activity, str)) {
            com.tencent.mars.xlog.Log.i(this.f426388b, "click iconSpan, showForbidToastWhenNotFoundStatus");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveStatusIconClick");
            return;
        }
        xc4.p pVar = this.f426387a;
        com.tencent.mm.storage.z3 L0 = pVar.L0();
        java.lang.String d17 = L0 != null ? L0.d1() : null;
        if (d17 == null) {
            d17 = "";
        }
        java.lang.String t07 = ca4.z0.t0(pVar.c1().field_snsId);
        kotlin.jvm.internal.o.f(t07, "longToString(...)");
        java.lang.String Ni = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ni();
        kotlin.jvm.internal.o.f(Ni, "requestSessionId(...)");
        j1Var.nj("sns_status_icon", "view_clk", new xe0.o0(d17, t07, Ni));
        j1Var.sj(activity, new bi4.h1(str, 14, 153L, false, false, new bi4.g1(bi4.f1.f21042e, 0L, 2, null), new bi4.i1(0.0f, 0, 3, null), null));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveStatusIconClick");
    }
}
