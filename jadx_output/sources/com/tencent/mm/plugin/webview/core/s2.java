package com.tencent.mm.plugin.webview.core;

/* loaded from: classes.dex */
public final class s2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.core.e3 f181974d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(com.tencent.mm.plugin.webview.core.e3 e3Var) {
        super(0);
        this.f181974d = e3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Boolean.valueOf(this.f181974d.d0().getBooleanExtra("neverBlockLocalRequest", false));
    }
}
