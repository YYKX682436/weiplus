package com.tencent.mm.plugin.webview.core;

/* loaded from: classes8.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.core.r0 f181881d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.tencent.mm.plugin.webview.core.r0 r0Var) {
        super(0);
        this.f181881d = r0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.webview.core.r0 r0Var = this.f181881d;
        if (!r0Var.f181916a.f211371t) {
            r0Var.f0().d();
        }
        r0Var.f181919b0.compareAndSet(false, true);
        r0Var.F0();
        return jz5.f0.f302826a;
    }
}
