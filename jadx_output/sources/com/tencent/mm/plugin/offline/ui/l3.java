package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes.dex */
public class l3 implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.m3 f152668d;

    public l3(com.tencent.mm.plugin.offline.ui.m3 m3Var) {
        this.f152668d = m3Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.offline.ui.m3 m3Var = this.f152668d;
        android.widget.TextView textView = (android.widget.TextView) m3Var.findViewById(com.tencent.mm.R.id.pf9);
        android.widget.TextView textView2 = (android.widget.TextView) m3Var.findViewById(com.tencent.mm.R.id.pf8);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (textView != null) {
            sb6.append(textView.getText());
        }
        if (textView2 != null) {
            sb6.append(textView2.getText());
        }
        return sb6.toString();
    }
}
