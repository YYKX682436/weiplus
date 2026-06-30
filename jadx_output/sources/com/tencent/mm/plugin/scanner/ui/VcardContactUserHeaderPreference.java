package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes3.dex */
public class VcardContactUserHeaderPreference extends com.tencent.mm.ui.base.preference.Preference {
    public android.widget.TextView L;
    public android.widget.TextView M;
    public android.widget.TextView N;
    public java.lang.String P;
    public java.lang.String Q;
    public java.lang.String R;
    public java.lang.String S;
    public final android.content.Context T;

    public VcardContactUserHeaderPreference(android.content.Context context) {
        super(context);
        this.T = context;
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        com.tencent.mars.xlog.Log.e("MicroMsg.scanner.VcardContactUserHeaderPreference", "onbindview");
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.owr);
        java.lang.String str = this.P;
        if (str != null) {
            textView.setText(str);
        }
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.ows);
        this.L = textView2;
        java.lang.String str2 = this.Q;
        android.content.Context context = this.T;
        if (str2 != null) {
            textView2.setText(context.getString(com.tencent.mm.R.string.k5l, str2));
            this.L.setVisibility(0);
        }
        android.widget.TextView textView3 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.owt);
        this.M = textView3;
        java.lang.String str3 = this.R;
        if (str3 != null) {
            textView3.setText(context.getString(com.tencent.mm.R.string.k5q, str3));
            this.M.setVisibility(0);
        }
        android.widget.TextView textView4 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.owu);
        this.N = textView4;
        java.lang.String str4 = this.S;
        if (str4 != null) {
            textView4.setText(context.getString(com.tencent.mm.R.string.k5r, str4));
            this.N.setVisibility(0);
        }
    }

    public VcardContactUserHeaderPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.T = context;
    }

    public VcardContactUserHeaderPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.T = context;
    }
}
