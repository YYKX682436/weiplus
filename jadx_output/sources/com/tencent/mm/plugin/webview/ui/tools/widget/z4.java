package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes9.dex */
public final class z4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.z5 f187622d;

    public z4(com.tencent.mm.plugin.webview.ui.tools.widget.z5 z5Var) {
        this.f187622d = z5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.webview.ui.tools.widget.MPSmileyFooter sayFooter;
        com.tencent.mm.plugin.webview.ui.tools.widget.MPSmileyFooter sayFooter2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/widget/MPWriteCommentLayout$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.webview.ui.tools.widget.z5 z5Var = this.f187622d;
        boolean z17 = z5Var.K;
        com.tencent.mm.ui.widget.MMEditText mMEditText = z5Var.B;
        if (z17) {
            java.lang.String obj = mMEditText.getText().toString();
            nw4.n nVar = z5Var.getWebView().f183844p0;
            if (nVar != null) {
                nVar.y0(1, obj, 1);
            }
        } else {
            z5Var.getWebView().hideVKB();
            sayFooter = z5Var.getSayFooter();
            if (sayFooter.h()) {
                sayFooter2 = z5Var.getSayFooter();
                sayFooter2.f187043h.h();
                sayFooter2.f187043h.setVisibility(8);
                sayFooter2.setVisibility(8);
            }
            r45.m9 m9Var = new r45.m9();
            m9Var.f380260e = mMEditText.getText().toString();
            m9Var.f380262g = 1;
            int i17 = z5Var.M;
            if (i17 != 0) {
                m9Var.f380262g = 3;
                m9Var.f380263h = i17;
            }
            z5Var.r(m9Var);
            cx4.a.c(10);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/widget/MPWriteCommentLayout$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
