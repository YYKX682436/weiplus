package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public class g3 implements hy4.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.w3 f182214a;

    public g3(com.tencent.mm.plugin.webview.luggage.w3 w3Var) {
        this.f182214a = w3Var;
    }

    @Override // hy4.r
    public void a(java.lang.String str) {
        com.tencent.mm.plugin.webview.luggage.w3 w3Var = this.f182214a;
        w3Var.getClass();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("type", 1);
        bundle.putString("img_path", str);
        bundle.putInt("x_down", w3Var.f182669j.f182191x0);
        bundle.putInt("y_down", w3Var.f182669j.f182194y0);
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.mm.plugin.webview.luggage.LuggageWebViewLongClickHelper$QBarLogicTask.class, new com.tencent.mm.plugin.webview.luggage.h3(w3Var, str));
    }
}
