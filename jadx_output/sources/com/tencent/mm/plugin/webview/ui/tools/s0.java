package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes5.dex */
public final class s0 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.oo0 f186827d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.OpenSdkFaceDetectInfoLayout f186828e;

    public s0(r45.oo0 oo0Var, com.tencent.mm.plugin.webview.ui.tools.OpenSdkFaceDetectInfoLayout openSdkFaceDetectInfoLayout) {
        this.f186827d = oo0Var;
        this.f186828e = openSdkFaceDetectInfoLayout;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View v17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(v17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/OpenSdkFaceDetectInfoLayout$initPrompt$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(v17, "v");
        r45.oo0 oo0Var = this.f186827d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(oo0Var.f382390e)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenSdkFaceDetectInfoLayout", "promptInfo url is null");
        } else {
            java.lang.String url = oo0Var.f382390e;
            kotlin.jvm.internal.o.f(url, "url");
            int i17 = com.tencent.mm.plugin.webview.ui.tools.OpenSdkFaceDetectInfoLayout.f183641n;
            com.tencent.mm.plugin.webview.ui.tools.OpenSdkFaceDetectInfoLayout openSdkFaceDetectInfoLayout = this.f186828e;
            openSdkFaceDetectInfoLayout.getClass();
            if (com.tencent.mm.sdk.platformtools.t8.K0(url)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.OpenSdkFaceDetectInfoLayout", "jumpToWebView url is null");
            } else {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", url);
                intent.putExtra("showShare", false);
                intent.putExtra("geta8key_username", c01.z1.r());
                j45.l.j(openSdkFaceDetectInfoLayout.getActivityContext(), "webview", ".ui.tools.WebViewUI", intent, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/OpenSdkFaceDetectInfoLayout$initPrompt$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        kotlin.jvm.internal.o.g(textPaint, "textPaint");
        textPaint.setColor(this.f186828e.getResources().getColor(com.tencent.mm.R.color.f479308vo));
    }
}
