package com.tencent.mm.plugin.wallet_index.ui;

/* loaded from: classes9.dex */
public class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_index.ui.k0 f181178d;

    public j0(com.tencent.mm.plugin.wallet_index.ui.k0 k0Var) {
        this.f181178d = k0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.wallet_index.ui.k0 k0Var = this.f181178d;
        intent.putExtra("closeWebView", (java.lang.String) ((java.util.HashMap) k0Var.f181180a.f181120f).get("closeWebView"));
        k0Var.f181180a.setResult(-1, intent);
        k0Var.f181180a.finish();
    }
}
