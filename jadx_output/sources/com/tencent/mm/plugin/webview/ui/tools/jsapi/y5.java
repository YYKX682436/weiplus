package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class y5 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185564d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f185565e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185566f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185567g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185568h;

    public y5(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, java.lang.String str, android.content.Intent intent, java.lang.String str2, nw4.y2 y2Var) {
        this.f185568h = c1Var;
        this.f185564d = str;
        this.f185565e = intent;
        this.f185566f = str2;
        this.f185567g = y2Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185568h;
        android.content.Intent intent = this.f185565e;
        if (itemId == 1) {
            c1Var.m5(this.f185564d, intent, 47, this.f185566f);
            return;
        }
        if (itemId != 2) {
            return;
        }
        java.lang.String str = (java.lang.String) this.f185567g.f340790a.get("liteAppUuid");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        intent.putExtra("liteAppUuid", str);
        c1Var.l5(intent, 47);
    }
}
