package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public class f3 implements com.tencent.mm.pluginsdk.ui.tools.g9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.w3 f182210a;

    public f3(com.tencent.mm.plugin.webview.luggage.w3 w3Var) {
        this.f182210a = w3Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.g9
    public void a(java.lang.String str) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("image_path", str);
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.mm.plugin.webview.luggage.p3.class, new com.tencent.mm.plugin.webview.luggage.e3(this));
    }
}
