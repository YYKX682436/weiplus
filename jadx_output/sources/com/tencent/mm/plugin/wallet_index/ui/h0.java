package com.tencent.mm.plugin.wallet_index.ui;

/* loaded from: classes9.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_index.ui.i0 f181175d;

    public h0(com.tencent.mm.plugin.wallet_index.ui.i0 i0Var) {
        this.f181175d = i0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.wallet_index.ui.i0 i0Var = this.f181175d;
        intent.putExtra("closeWebView", (java.lang.String) ((java.util.HashMap) i0Var.f181177a.f181120f).get("closeWebView"));
        i0Var.f181177a.setResult(-1, intent);
        i0Var.f181177a.finish();
    }
}
