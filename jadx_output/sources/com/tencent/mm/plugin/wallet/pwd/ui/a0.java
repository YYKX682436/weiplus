package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes.dex */
public class a0 implements yz5.l {
    public a0(com.tencent.mm.plugin.wallet.pwd.ui.b0 b0Var) {
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View view = (android.view.View) obj;
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.beb);
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f483599be3);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (textView != null) {
            sb6.append(textView.getText());
        }
        if (textView2 != null) {
            sb6.append("," + ((java.lang.Object) textView2.getText()));
        }
        return sb6.toString();
    }
}
