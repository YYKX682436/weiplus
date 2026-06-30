package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public final class y implements db5.l4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.d0 f187606a;

    public y(com.tencent.mm.plugin.webview.ui.tools.widget.d0 d0Var) {
        this.f187606a = d0Var;
    }

    @Override // db5.l4
    public final void a(android.widget.TextView textView, android.view.MenuItem menuItem) {
        java.lang.CharSequence charSequence;
        java.lang.String str = ((java.lang.Object) menuItem.getTitle()) + "";
        if (textView != null) {
            boolean z17 = menuItem instanceof db5.h4;
            com.tencent.mm.plugin.webview.ui.tools.widget.d0 d0Var = this.f187606a;
            if (z17 && (charSequence = ((db5.h4) menuItem).f228371o) != null) {
                java.lang.String obj = charSequence.toString();
                d0Var.getClass();
                textView.setText(obj);
                return;
            }
            java.lang.String str2 = (java.lang.String) d0Var.f187145c.get(str);
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                textView.setText(str);
                return;
            }
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context d17 = d0Var.d();
            float textSize = textView.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(d17, str2, textSize));
        }
    }
}
