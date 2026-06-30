package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public class v2 extends com.tencent.mm.sdk.platformtools.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.u3 f187580h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(com.tencent.mm.plugin.webview.ui.tools.widget.u3 u3Var, long j17, java.lang.String str) {
        super(j17, str);
        this.f187580h = u3Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.d8
    public java.lang.Object b() {
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f187580h.f187549b;
        return mMWebView == null ? "" : mMWebView.getUrl();
    }
}
