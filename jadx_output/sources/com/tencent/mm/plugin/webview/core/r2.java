package com.tencent.mm.plugin.webview.core;

/* loaded from: classes.dex */
public final class r2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.core.e3 f181969d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(com.tencent.mm.plugin.webview.core.e3 e3Var) {
        super(0);
        this.f181969d = e3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Boolean.valueOf(this.f181969d.d0().getBooleanExtra("finishviewifloadfailed", false));
    }
}
