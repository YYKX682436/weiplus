package com.tencent.mm.plugin.webview.core;

/* loaded from: classes7.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.core.r0 f182021d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182022e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f182023f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.tencent.mm.plugin.webview.core.r0 r0Var, java.lang.String str, yz5.l lVar) {
        super(0);
        this.f182021d = r0Var;
        this.f182022e = str;
        this.f182023f = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f182021d.f181916a;
        yz5.l lVar = this.f182023f;
        mMWebView.evaluateJavascript(this.f182022e, lVar != null ? new com.tencent.mm.plugin.webview.core.x(lVar) : null);
        return jz5.f0.f302826a;
    }
}
