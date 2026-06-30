package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes9.dex */
public final class n5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.z5 f187446d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f187447e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f187448f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f187449g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.o f187450h;

    public n5(com.tencent.mm.plugin.webview.ui.tools.widget.z5 z5Var, int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        this.f187446d = z5Var;
        this.f187447e = i17;
        this.f187448f = i18;
        this.f187449g = str;
        this.f187450h = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nw4.n nVar;
        com.tencent.mm.plugin.webview.ui.tools.widget.z5 z5Var = this.f187446d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = z5Var.getWebView().T2;
        if (u3Var != null && u3Var.isShowing()) {
            u3Var.dismiss();
        }
        if (z5Var.getWeakThis$plugin_webview_release().get() != null) {
            com.tencent.mm.plugin.webview.ui.tools.widget.z5 z5Var2 = z5Var.getWeakThis$plugin_webview_release().get();
            kotlin.jvm.internal.o.e(z5Var2, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.widget.MPWriteCommentLayout");
            com.tencent.mm.plugin.webview.ui.tools.widget.z5 z5Var3 = z5Var2;
            com.tencent.mm.modelbase.o rr6 = this.f187450h;
            kotlin.jvm.internal.o.f(rr6, "$rr");
            int i17 = this.f187448f;
            if (i17 != 0) {
                java.lang.String str = this.f187449g;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    db5.e1.y(z5Var3.getContext(), str, "", z5Var3.getContext().getString(com.tencent.mm.R.string.f490507x1), null);
                    return;
                }
            }
            com.tencent.mm.protobuf.f fVar = rr6.f70710a.f70684a;
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.AppMsgLikeCommentReq");
            r45.k9 k9Var = (r45.k9) fVar;
            if (this.f187447e == 0 && i17 == 0) {
                int i18 = k9Var.f378502h;
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = z5Var3.f187628v;
                if (i18 != 1) {
                    if (i18 == 2 && (nVar = webViewUI.f183844p0) != null) {
                        nVar.S("praiseComment", k9Var.f378499e, "", k9Var.f378503i, k9Var.f378501g);
                        return;
                    }
                    return;
                }
                nw4.n nVar2 = webViewUI.f183844p0;
                if (nVar2 != null) {
                    nVar2.S("praiseComment", k9Var.f378499e, "", 0, k9Var.f378501g);
                }
            }
        }
    }
}
