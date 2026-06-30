package com.tencent.mm.plugin.webview.core;

/* loaded from: classes7.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.core.r0 f181865d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.plugin.webview.core.r0 r0Var) {
        super(0);
        this.f181865d = r0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.webview.core.r0 r0Var = this.f181865d;
        r0Var.f0().a(r0Var.H);
        java.util.Iterator it = r0Var.Z.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.webview.core.f3) it.next()).d();
        }
        return jz5.f0.f302826a;
    }
}
