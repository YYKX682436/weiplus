package com.tencent.mm.plugin.game.luggage.page;

/* loaded from: classes8.dex */
public class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f139960d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.page.c1 f139961e;

    public z0(com.tencent.mm.plugin.game.luggage.page.c1 c1Var, android.os.Bundle bundle) {
        this.f139961e = c1Var;
        this.f139960d = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.luggage.page.c1 c1Var = this.f139961e;
        c1Var.f406655i.c(new com.tencent.mm.plugin.game.luggage.page.y0(this));
        java.lang.String string = this.f139960d.getString("KGamePreloadData");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PreloadGameWebPage", "preloadData:%s", string);
            c1Var.o(java.lang.String.format("javascript:(function() {window.__game_center_present_custom_data__=\"%s\";})();", string), null);
        }
        c1Var.o("javascript:(function() {window.__game_center_preload_page_present__=true;})();", null);
    }
}
