package com.tencent.mm.plugin.webview.luggage.menu;

/* loaded from: classes8.dex */
public class j implements db5.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.e0 f182566a;

    public j(com.tencent.mm.plugin.webview.luggage.menu.k kVar, com.tencent.mm.plugin.webview.luggage.e0 e0Var) {
        this.f182566a = e0Var;
    }

    @Override // db5.d1
    public void a(int i17, int i18) {
        if (i18 != -1) {
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        com.tencent.mm.plugin.webview.luggage.e0 e0Var = this.f182566a;
        bundle.putLong("fav_local_id", e0Var.f406657n.getLong("fav_local_id", -1L));
        com.tencent.mm.plugin.webview.luggage.FavUrlTask favUrlTask = new com.tencent.mm.plugin.webview.luggage.FavUrlTask();
        favUrlTask.f182116f = 4;
        favUrlTask.f182117g = bundle;
        favUrlTask.s();
        if (favUrlTask.f182119i) {
            e0Var.p(true);
        }
    }
}
