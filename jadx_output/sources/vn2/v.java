package vn2;

/* loaded from: classes10.dex */
public final class v implements com.tencent.mm.ui.widget.snackbar.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f438394a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f438395b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f438396c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f438397d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f438398e;

    public v(boolean z17, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, r45.qt2 qt2Var, boolean z18, android.app.Activity activity) {
        this.f438394a = z17;
        this.f438395b = baseFinderFeed;
        this.f438396c = qt2Var;
        this.f438397d = z18;
        this.f438398e = activity;
    }

    @Override // com.tencent.mm.ui.widget.snackbar.g
    public final void a() {
        if (this.f438394a) {
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr = new jz5.l[6];
            lVarArr[0] = new jz5.l("view_id", "open_topstory_bar");
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f438395b;
            lVarArr[1] = new jz5.l("feed_id", pm0.v.u(baseFinderFeed.getItemId()));
            r45.qt2 qt2Var = this.f438396c;
            lVarArr[2] = new jz5.l("finder_context_id", qt2Var != null ? qt2Var.getString(1) : null);
            lVarArr[3] = new jz5.l("finder_tab_context_id", qt2Var != null ? qt2Var.getString(2) : null);
            lVarArr[4] = new jz5.l("comment_scene", qt2Var != null ? java.lang.Integer.valueOf(qt2Var.getInteger(5)) : null);
            java.lang.String sessionBuffer = baseFinderFeed.getFeedObject().getFeedObject().getSessionBuffer();
            if (sessionBuffer == null) {
                sessionBuffer = "";
            }
            lVarArr[5] = new jz5.l("session_buffer", sessionBuffer);
            ((cy1.a) rVar).yj("view_clk", null, kz5.c1.k(lVarArr), 1, true);
            boolean z17 = this.f438397d;
            android.app.Activity ui6 = this.f438398e;
            if (z17) {
                ui6.finish();
                mf0.g0 g0Var = (mf0.g0) i95.n0.c(mf0.g0.class);
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("feed_id", pm0.v.u(baseFinderFeed.getItemId()));
                ((lf0.h0) g0Var).Vi(ui6, 123, bundle);
                return;
            }
            wd0.z1 z1Var = (wd0.z1) i95.n0.c(wd0.z1.class);
            vn2.u uVar = new vn2.u(ui6, baseFinderFeed);
            ((vd0.o3) z1Var).getClass();
            kotlin.jvm.internal.o.g(ui6, "ui");
            com.tencent.mm.plugin.setting.ui.setting.x3 x3Var = com.tencent.mm.plugin.setting.ui.setting.SettingManageFindMoreDetailUI.f160220x;
            boolean a07 = c01.e2.a0();
            boolean z18 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("ExtFunctionSwitchEntry", 0) == 1;
            if (a07 && z18) {
                v24.o0.i(ui6, 67108864L, new com.tencent.mm.plugin.setting.ui.setting.v3(true), new com.tencent.mm.plugin.setting.ui.setting.w3(true, uVar), 2);
            } else {
                x3Var.a(true);
                uVar.invoke(java.lang.Boolean.TRUE);
            }
        }
    }
}
