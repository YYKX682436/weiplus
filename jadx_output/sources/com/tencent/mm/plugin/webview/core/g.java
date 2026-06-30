package com.tencent.mm.plugin.webview.core;

/* loaded from: classes8.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.core.r0 f181834d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.plugin.webview.core.r0 r0Var) {
        super(0);
        this.f181834d = r0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.Iterator it = this.f181834d.Z.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.webview.core.f3) it.next()).m();
        }
        return jz5.f0.f302826a;
    }
}
