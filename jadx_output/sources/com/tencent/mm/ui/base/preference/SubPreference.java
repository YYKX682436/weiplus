package com.tencent.mm.ui.base.preference;

/* loaded from: classes3.dex */
public class SubPreference extends com.tencent.mm.ui.base.preference.Preference {
    public android.view.View L;

    public SubPreference(android.content.Context context) {
        this(context, null);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.m7k);
        this.L = findViewById;
        if (this.f197772f != null) {
            findViewById.setOnClickListener(new com.tencent.mm.ui.base.preference.s0(this));
        }
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) this.f197770d.getSystemService("layout_inflater");
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.tencent.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        layoutInflater.inflate(com.tencent.mm.R.layout.c1h, viewGroup2);
        return u17;
    }

    public SubPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SubPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
