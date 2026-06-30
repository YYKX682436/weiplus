package com.tencent.mm.plugin.webview.core;

/* loaded from: classes.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.core.r0 f181848d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.tencent.mm.plugin.webview.core.r0 r0Var) {
        super(0);
        this.f181848d = r0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String stringExtra = this.f181848d.d0().getStringExtra("KWebPrefetcherId");
        return stringExtra == null ? "" : stringExtra;
    }
}
