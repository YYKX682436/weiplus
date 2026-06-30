package com.tencent.mm.ui.feature.api.screenshot;

/* loaded from: classes8.dex */
public final class o0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qj5.n f208536d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.feature.api.screenshot.j1 f208537e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qj5.q f208538f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f208539g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f208540h;

    public o0(qj5.n nVar, com.tencent.mm.ui.feature.api.screenshot.j1 j1Var, qj5.q qVar, android.app.Activity activity, java.util.HashMap hashMap) {
        this.f208536d = nVar;
        this.f208537e = j1Var;
        this.f208538f = qVar;
        this.f208539g = activity;
        this.f208540h = hashMap;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.String str = this.f208536d.f363986t2;
        if (str == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ScreenShotShareService", "image is null");
            return;
        }
        int itemId = menuItem.getItemId();
        java.util.HashMap hashMap = this.f208540h;
        com.tencent.mm.ui.feature.api.screenshot.j1 j1Var = this.f208537e;
        if (itemId != 910524420) {
            if (itemId != 910524424) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotShareService", "saveToLocal onClick");
            j1Var.getClass();
            zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
            android.app.Activity activity = this.f208539g;
            ((yb0.g) b0Var).Ni(activity, new com.tencent.mm.ui.feature.api.screenshot.x0(activity, str, j1Var, this.f208538f), new com.tencent.mm.ui.feature.api.screenshot.y0(activity));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("function_usage_btn", "view_clk", kz5.c1.n(hashMap, new jz5.l("function_type", 5)), 36458);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotShareService", "edit onClick");
        j1Var.Bi(com.tencent.mm.ui.feature.api.screenshot.w.f208569n);
        android.app.Activity activity2 = this.f208539g;
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider b17 = com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider.b(str, "");
        com.tencent.mm.component.api.jumper.UICustomParam uICustomParam = new com.tencent.mm.component.api.jumper.UICustomParam((hp.a) null);
        java.util.Map map = uICustomParam.f64779h;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        java.util.HashMap hashMap2 = (java.util.HashMap) map;
        hashMap2.put("plugin_filter", bool);
        hashMap2.put("plugin_poi", bool);
        hashMap2.put("plugin_tip", bool);
        hashMap2.put("plugin_menu", bool);
        b17.f155677o = uICustomParam;
        fu3.e.f266880a.b(b17);
        ut3.m.f431182a.g(activity2, 910524420, com.tencent.mm.R.anim.f477876e0, -1, b17, 1, 2, new com.tencent.mm.ui.feature.api.screenshot.a0(j1Var));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("function_usage_btn", "view_clk", kz5.c1.n(hashMap, new jz5.l("function_type", 1)), 36458);
    }
}
