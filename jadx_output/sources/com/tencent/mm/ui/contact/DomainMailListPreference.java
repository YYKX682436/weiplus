package com.tencent.mm.ui.contact;

/* loaded from: classes.dex */
public class DomainMailListPreference extends com.tencent.mm.ui.base.preference.Preference {
    public java.lang.String L;
    public java.lang.String M;
    public android.widget.TextView N;
    public android.widget.TextView P;
    public android.widget.TextView Q;
    public android.widget.TextView R;

    public DomainMailListPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.L = "";
        this.M = "";
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        this.N = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.obc);
        this.P = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.g6l);
        this.Q = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.mfw);
        this.R = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.o5z);
        android.widget.TextView textView = this.N;
        java.lang.String str = this.L;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        textView.setText(str);
        java.lang.String[] split = this.M.split(";");
        java.lang.String str2 = this.M;
        if (str2 == null) {
            str2 = "";
        }
        if (str2.length() <= 0) {
            this.P.setVisibility(8);
            this.Q.setVisibility(8);
            this.R.setVisibility(8);
        } else {
            if (split.length > 0) {
                this.P.setVisibility(0);
                android.widget.TextView textView2 = this.P;
                java.lang.String str3 = split[0];
                if (str3 == null) {
                    str3 = "";
                }
                textView2.setText(str3);
            } else {
                this.P.setVisibility(8);
            }
            if (split.length > 1) {
                this.Q.setVisibility(0);
                android.widget.TextView textView3 = this.Q;
                java.lang.String str4 = split[1];
                if (str4 == null) {
                    str4 = "";
                }
                textView3.setText(str4);
            } else {
                this.Q.setVisibility(8);
            }
            if (split.length > 2) {
                this.R.setVisibility(0);
                android.widget.TextView textView4 = this.R;
                java.lang.String str5 = split[2];
                textView4.setText(str5 != null ? str5 : "");
            } else {
                this.R.setVisibility(8);
            }
        }
        super.t(view);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) this.f197770d.getSystemService("layout_inflater");
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.tencent.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        layoutInflater.inflate(com.tencent.mm.R.layout.bzd, viewGroup2);
        return u17;
    }

    public DomainMailListPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = "";
        this.M = "";
    }
}
