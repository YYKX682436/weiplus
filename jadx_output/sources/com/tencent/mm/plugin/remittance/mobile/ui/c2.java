package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes.dex */
public class c2 implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.mobile.ui.d2 f156658d;

    public c2(com.tencent.mm.plugin.remittance.mobile.ui.d2 d2Var) {
        this.f156658d = d2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.remittance.mobile.ui.d2 d2Var = this.f156658d;
        android.widget.TextView textView = (android.widget.TextView) d2Var.findViewById(com.tencent.mm.R.id.jnp);
        android.widget.TextView textView2 = (android.widget.TextView) d2Var.findViewById(com.tencent.mm.R.id.jnq);
        if (textView == null || textView2 == null) {
            return "";
        }
        return textView.getText().toString() + textView2.getText().toString();
    }
}
