package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes.dex */
public class o6 implements db5.l4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.c6 f186730a;

    public o6(com.tencent.mm.plugin.webview.ui.tools.c6 c6Var) {
        this.f186730a = c6Var;
    }

    @Override // db5.l4
    public void a(android.widget.TextView textView, android.view.MenuItem menuItem) {
        java.lang.String str = ((java.lang.Object) menuItem.getTitle()) + "";
        if (textView != null) {
            com.tencent.mm.plugin.webview.ui.tools.c6 c6Var = this.f186730a;
            java.lang.String str2 = (java.lang.String) c6Var.f184048e.get(str);
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                textView.setText(str);
                return;
            }
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI c17 = c6Var.c();
            float textSize = textView.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(c17, str2, textSize));
        }
    }
}
