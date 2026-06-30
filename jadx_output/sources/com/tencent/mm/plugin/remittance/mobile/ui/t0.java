package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes3.dex */
public class t0 implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.mobile.ui.u0 f156720d;

    public t0(com.tencent.mm.plugin.remittance.mobile.ui.u0 u0Var) {
        this.f156720d = u0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.remittance.mobile.ui.u0 u0Var = this.f156720d;
        android.widget.TextView textView = (android.widget.TextView) u0Var.findViewById(com.tencent.mm.R.id.f485953jo1);
        android.widget.TextView textView2 = (android.widget.TextView) u0Var.findViewById(com.tencent.mm.R.id.f485956jo4);
        if (textView == null || textView2 == null) {
            return "";
        }
        return textView.getText().toString() + textView2.getText().toString();
    }
}
