package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class s5 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Boolean f185398d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185399e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f185400f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f185401g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185402h;

    public s5(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, java.lang.Boolean bool, java.lang.String str, android.content.Intent intent, int i17) {
        this.f185402h = c1Var;
        this.f185398d = bool;
        this.f185399e = str;
        this.f185400f = intent;
        this.f185401g = i17;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        java.lang.Boolean bool = this.f185398d;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.j jVar = com.tencent.mm.plugin.webview.ui.tools.jsapi.j.f185203a;
        android.content.Intent intent = this.f185400f;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185402h;
        if (itemId == 1) {
            if (gm0.j1.a()) {
                c1Var.m5(this.f185399e, intent, 14, "image");
                return;
            } else {
                jVar.b(this.f185402h, 14, false, true, bool.booleanValue());
                return;
            }
        }
        if (itemId != 2) {
            return;
        }
        if (gm0.j1.a()) {
            c1Var.l5(intent, 14);
        } else {
            jVar.a(this.f185402h, 14, false, true, this.f185401g, bool.booleanValue());
        }
    }
}
