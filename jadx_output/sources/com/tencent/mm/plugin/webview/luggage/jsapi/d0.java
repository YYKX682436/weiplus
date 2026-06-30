package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class d0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182293d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f182294e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.g0 f182295f;

    public d0(com.tencent.mm.plugin.webview.luggage.jsapi.g0 g0Var, java.lang.String str, android.content.Intent intent) {
        this.f182295f = g0Var;
        this.f182293d = str;
        this.f182294e = intent;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        android.content.Intent intent = this.f182294e;
        com.tencent.mm.plugin.webview.luggage.jsapi.g0 g0Var = this.f182295f;
        if (itemId == 1) {
            g0Var.g(this.f182293d, intent);
        } else {
            if (itemId != 2) {
                return;
            }
            g0Var.f(intent);
        }
    }
}
