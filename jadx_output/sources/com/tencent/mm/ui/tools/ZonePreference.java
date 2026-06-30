package com.tencent.mm.ui.tools;

/* loaded from: classes15.dex */
public class ZonePreference extends com.tencent.mm.ui.base.preference.Preference {
    public com.tencent.mm.storage.RegionCodeDecoder$Region L;
    public java.lang.CharSequence M;
    public android.widget.TextView N;

    public ZonePreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void H(java.lang.CharSequence charSequence) {
        this.M = charSequence;
        M();
    }

    public final void M() {
        if (this.N == null) {
            return;
        }
        java.lang.CharSequence charSequence = this.M;
        if (charSequence == null || com.tencent.mm.sdk.platformtools.t8.K0(charSequence.toString())) {
            this.N.setVisibility(8);
        } else {
            this.N.setVisibility(0);
        }
        this.N.setText(this.M);
    }

    public void N(com.tencent.mm.storage.RegionCodeDecoder$Region regionCodeDecoder$Region) {
        if (regionCodeDecoder$Region == null || com.tencent.mm.sdk.platformtools.t8.K0(regionCodeDecoder$Region.getName()) || com.tencent.mm.sdk.platformtools.t8.K0(regionCodeDecoder$Region.getCode())) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ZonePreference", "setZoneItem item = null");
            return;
        }
        C(regionCodeDecoder$Region.getCode() + regionCodeDecoder$Region.isCity());
        this.L = regionCodeDecoder$Region;
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        if (this.L == null) {
            return;
        }
        ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.pte)).setText(this.L.getName());
        this.N = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.nsi);
        M();
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

    public ZonePreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.G = com.tencent.mm.R.layout.byv;
    }
}
