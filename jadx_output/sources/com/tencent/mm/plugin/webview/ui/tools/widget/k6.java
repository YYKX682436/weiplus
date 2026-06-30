package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public final class k6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.m6 f187369d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f187370e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(com.tencent.mm.plugin.webview.ui.tools.widget.m6 m6Var, kotlin.jvm.internal.f0 f0Var) {
        super(0);
        this.f187369d = m6Var;
        this.f187370e = f0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.webview.core.u0 u0Var;
        java.lang.ref.WeakReference weakReference = this.f187369d.f187412g;
        if (weakReference != null && (u0Var = (com.tencent.mm.plugin.webview.core.u0) weakReference.get()) != null) {
            int i17 = this.f187370e.f310116d;
            com.tencent.mm.plugin.webview.core.r0 r0Var = ((com.tencent.mm.plugin.webview.ui.tools.widget.o4) u0Var).G;
            if (r0Var != null) {
                r0Var.z0(i17);
            }
        }
        return jz5.f0.f302826a;
    }
}
