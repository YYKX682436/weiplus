package com.tencent.mm.plugin.webview.core;

/* loaded from: classes7.dex */
public final class a3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMWebView f181759d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(com.tencent.mm.ui.widget.MMWebView mMWebView) {
        super(0);
        this.f181759d = mMWebView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f181759d;
        return new com.tencent.mm.plugin.webview.ui.tools.u(mMWebView.getActivityContextIfHas(), mMWebView);
    }
}
