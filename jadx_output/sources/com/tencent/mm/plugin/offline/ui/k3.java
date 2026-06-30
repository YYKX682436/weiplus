package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes.dex */
public class k3 implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.m3 f152661d;

    public k3(com.tencent.mm.plugin.offline.ui.m3 m3Var) {
        this.f152661d = m3Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.offline.ui.m3 m3Var = this.f152661d;
        android.widget.TextView textView = (android.widget.TextView) m3Var.findViewById(com.tencent.mm.R.id.j97);
        android.widget.TextView textView2 = (android.widget.TextView) m3Var.findViewById(com.tencent.mm.R.id.nqv);
        if (textView == null || textView2 == null) {
            return "";
        }
        return textView.getText().toString() + textView2.getText().toString();
    }
}
