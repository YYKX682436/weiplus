package com.tencent.mm.ui.tools;

/* loaded from: classes15.dex */
public class ZoneSelectOtherCountryPreference extends com.tencent.mm.ui.base.preference.Preference {
    public java.lang.String L;
    public com.tencent.mm.ui.tools.xd M;

    public ZoneSelectOtherCountryPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.pte);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.L)) {
            textView.setText(this.L);
        }
        view.setOnClickListener(new com.tencent.mm.ui.tools.wd(this));
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) this.f197770d.getSystemService("layout_inflater");
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.tencent.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        layoutInflater.inflate(com.tencent.mm.R.layout.f489287c01, viewGroup2);
        return u17;
    }

    public ZoneSelectOtherCountryPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.G = com.tencent.mm.R.layout.byv;
    }
}
