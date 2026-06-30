package com.tencent.mm.plugin.webview.model;

/* loaded from: classes8.dex */
public final class b4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.h4 f182793d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.d4 f182794e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(com.tencent.mm.plugin.webview.model.h4 h4Var, com.tencent.mm.plugin.webview.model.d4 d4Var) {
        super(0);
        this.f182793d = h4Var;
        this.f182794e = d4Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.app.Activity activity;
        com.tencent.mm.plugin.webview.model.h4 h4Var = this.f182793d;
        if (h4Var.f182923h) {
            h4Var.f182923h = false;
            java.lang.ref.WeakReference k17 = com.tencent.mm.app.w.k();
            if (k17 == null || (activity = (android.app.Activity) k17.get()) == null) {
                java.lang.ref.WeakReference j17 = com.tencent.mm.app.w.INSTANCE.j();
                activity = j17 != null ? (android.app.Activity) j17.get() : null;
            }
            this.f182794e.hashCode();
            java.util.Objects.toString(activity);
            if ((activity instanceof com.tencent.mm.plugin.webview.ui.tools.WebViewUI) || (activity instanceof com.tencent.mm.plugin.webview.stub.WebViewStubProxyUI)) {
                h4Var.d(hy4.a0.f286074g);
            }
        }
        return jz5.f0.f302826a;
    }
}
