package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes.dex */
public class i7 implements db5.l4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.c6 f184829a;

    public i7(com.tencent.mm.plugin.webview.ui.tools.c6 c6Var) {
        this.f184829a = c6Var;
    }

    @Override // db5.l4
    public void a(android.widget.TextView textView, android.view.MenuItem menuItem) {
        java.lang.CharSequence charSequence;
        java.lang.String str = ((java.lang.Object) menuItem.getTitle()) + "";
        if (textView != null) {
            boolean z17 = menuItem instanceof db5.h4;
            com.tencent.mm.plugin.webview.ui.tools.c6 c6Var = this.f184829a;
            if (z17 && (charSequence = ((db5.h4) menuItem).f228371o) != null) {
                java.lang.String charSequence2 = charSequence.toString();
                c6Var.getClass();
                textView.setText(charSequence2);
                return;
            }
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
