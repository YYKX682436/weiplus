package com.tencent.mm.plugin.webview.model;

/* loaded from: classes8.dex */
public final class a4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.h4 f182767d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.d4 f182768e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(com.tencent.mm.plugin.webview.model.h4 h4Var, com.tencent.mm.plugin.webview.model.d4 d4Var) {
        super(0);
        this.f182767d = h4Var;
        this.f182768e = d4Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.app.Activity activity;
        com.tencent.mm.plugin.webview.model.h4 h4Var = this.f182767d;
        if (!h4Var.f182923h) {
            h4Var.f182923h = true;
            java.lang.ref.WeakReference k17 = com.tencent.mm.app.w.k();
            if (k17 == null || (activity = (android.app.Activity) k17.get()) == null) {
                java.lang.ref.WeakReference j17 = com.tencent.mm.app.w.INSTANCE.j();
                activity = j17 != null ? (android.app.Activity) j17.get() : null;
            }
            this.f182768e.hashCode();
            java.util.Objects.toString(activity);
            if ((activity instanceof com.tencent.mm.plugin.webview.ui.tools.WebViewUI) || (activity instanceof com.tencent.mm.plugin.webview.stub.WebViewStubProxyUI)) {
                h4Var.d(hy4.a0.f286073f);
            }
        }
        return jz5.f0.f302826a;
    }
}
