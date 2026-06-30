package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public class d3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f182166d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.e3 f182167e;

    public d3(com.tencent.mm.plugin.webview.luggage.e3 e3Var, android.os.Bundle bundle) {
        this.f182167e = e3Var;
        this.f182166d = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        o72.e4 e4Var = (o72.e4) i95.n0.c(o72.e4.class);
        int i17 = this.f182166d.getInt("fav_simple_img_result");
        com.tencent.mm.plugin.webview.luggage.w3 w3Var = this.f182167e.f182205d.f182210a;
        android.app.Activity activity = (android.app.Activity) w3Var.f182669j.f406610d;
        com.tencent.mm.ui.widget.snackbar.g gVar = w3Var.f182671l;
        ((com.tencent.mm.pluginsdk.model.s1) e4Var).getClass();
        com.tencent.mm.plugin.fav.ui.u1.g(i17, 34, activity, gVar);
    }
}
