package com.tencent.mm.plugin.webview.core;

/* loaded from: classes8.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.core.r0 f181910d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.tencent.mm.plugin.webview.core.r0 r0Var) {
        super(0);
        this.f181910d = r0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.webview.core.r0 r0Var = this.f181910d;
        kotlin.jvm.internal.o.e(r0Var, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.permission.AuthCallback<com.tencent.mm.protocal.protobuf.GetA8KeyResp>");
        return new com.tencent.mm.plugin.webview.permission.s(new java.lang.ref.WeakReference(r0Var));
    }
}
