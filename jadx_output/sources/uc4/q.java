package uc4;

/* loaded from: classes4.dex */
public final class q implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f426441d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uc4.v f426442e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xc4.p f426443f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.e86 f426444g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f426445h;

    public q(kotlin.jvm.internal.h0 h0Var, uc4.v vVar, xc4.p pVar, r45.e86 e86Var, android.view.View view) {
        this.f426441d = h0Var;
        this.f426442e = vVar;
        this.f426443f = pVar;
        this.f426444g = e86Var;
        this.f426445h = view;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick$clickSelfComment$menuItemSelectedListener$1");
        int itemId = menuItem.getItemId();
        r45.e86 e86Var = this.f426444g;
        xc4.p pVar = this.f426443f;
        uc4.v vVar = this.f426442e;
        if (itemId == 0) {
            kotlin.jvm.internal.h0 h0Var = this.f426441d;
            if (com.tencent.mm.sdk.platformtools.b0.f((java.lang.CharSequence) h0Var.f310123d)) {
                db5.e1.T(vVar.b(), vVar.b().getString(com.tencent.mm.R.string.f490361st));
                w04.a.INSTANCE.A9(4, pVar.a1() + ':' + e86Var.f373132m, com.tencent.mm.sdk.platformtools.t8.o0((java.lang.String) h0Var.f310123d));
            } else {
                db5.e1.T(vVar.b(), vVar.b().getString(com.tencent.mm.R.string.f490360ss));
            }
        } else if (itemId == 1) {
            com.tencent.mm.plugin.sns.model.q2 q2Var = new com.tencent.mm.plugin.sns.model.q2(pVar.y0(), pVar.isAd() ? 6 : 4, e86Var);
            gm0.j1.n().f273288b.g(q2Var);
            android.content.Context context = vVar.b();
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC improveMainUIC = (com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC.class);
            java.lang.String string = vVar.b().getString(com.tencent.mm.R.string.f490573yv);
            java.lang.String string2 = vVar.b().getString(com.tencent.mm.R.string.j9z);
            uc4.p pVar2 = new uc4.p(q2Var);
            improveMainUIC.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showOpDialog", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
            com.tencent.mars.xlog.Log.i("MicroMsg.Improve.MainUIC", "showOpDialog: ");
            improveMainUIC.f168707s = db5.e1.Q(improveMainUIC.getContext(), string, string2, true, true, pVar2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showOpDialog", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
            int i18 = e86Var.f373132m;
            java.lang.String str = e86Var.f373126d;
            ad4.g gVar = ad4.g.f3183a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("relocateFeed$default", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveFeedRelocateUtil");
            gVar.a(this.f426445h, 0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("relocateFeed$default", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveFeedRelocateUtil");
            com.tencent.mm.plugin.sns.statistics.s0.f164937k0.I(pVar.c1(), i18, str, 1);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick$clickSelfComment$menuItemSelectedListener$1");
    }
}
