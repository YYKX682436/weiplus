package com.tencent.mm.plugin.profile.ui;

/* loaded from: classes.dex */
public class ContactMobileInfoPreference extends com.tencent.mm.ui.base.preference.Preference {
    public android.widget.TextView L;
    public android.widget.TextView M;

    public ContactMobileInfoPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        this.L = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.obc);
        this.M = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.jmo);
        android.widget.TextView textView = this.L;
        if (textView != null) {
            textView.setText((java.lang.CharSequence) null);
        }
        android.widget.TextView textView2 = this.M;
        if (textView2 != null) {
            textView2.setText((java.lang.CharSequence) null);
        }
        super.t(view);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) this.f197770d.getSystemService("layout_inflater");
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.tencent.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        layoutInflater.inflate(com.tencent.mm.R.layout.bzo, viewGroup2);
        return u17;
    }

    public ContactMobileInfoPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.G = com.tencent.mm.R.layout.byv;
    }
}
