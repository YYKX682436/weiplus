package com.tencent.mm.ui.tools;

/* loaded from: classes15.dex */
public class ZoneRecommandPreference extends com.tencent.mm.ui.base.preference.Preference {
    public com.tencent.mm.storage.RegionCodeDecoder$Region L;
    public com.tencent.mm.storage.RegionCodeDecoder$Region M;
    public com.tencent.mm.storage.RegionCodeDecoder$Region N;
    public int P;
    public android.widget.TextView Q;
    public android.widget.TextView R;
    public android.widget.ImageView S;

    public ZoneRecommandPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void M() {
        android.widget.TextView textView = this.Q;
        if (textView == null || this.R == null) {
            return;
        }
        int i17 = this.P;
        if (i17 == 0) {
            textView.setVisibility(8);
            this.R.setVisibility(0);
            this.R.setText(com.tencent.mm.R.string.iok);
            this.S.setImageResource(com.tencent.mm.R.raw.get_location_icon);
            w(false);
            if (this.f197783t) {
                this.f197783t = false;
                return;
            }
            return;
        }
        if (i17 != 1) {
            if (i17 != 2) {
                return;
            }
            textView.setVisibility(8);
            this.R.setVisibility(0);
            this.R.setText(com.tencent.mm.R.string.ioh);
            this.S.setImageResource(com.tencent.mm.R.raw.get_location_failed_icon);
            w(false);
            if (this.f197783t) {
                this.f197783t = false;
                return;
            }
            return;
        }
        textView.setVisibility(0);
        this.R.setVisibility(8);
        this.S.setImageResource(com.tencent.mm.R.raw.get_location_icon);
        com.tencent.mm.storage.RegionCodeDecoder$Region regionCodeDecoder$Region = this.L;
        java.lang.String str = "";
        if (regionCodeDecoder$Region != null && !com.tencent.mm.sdk.platformtools.t8.K0(regionCodeDecoder$Region.getName())) {
            str = "" + this.L.getName();
        }
        com.tencent.mm.storage.RegionCodeDecoder$Region regionCodeDecoder$Region2 = this.M;
        if (regionCodeDecoder$Region2 != null && !com.tencent.mm.sdk.platformtools.t8.K0(regionCodeDecoder$Region2.getName())) {
            str = str + " " + this.M.getName();
        }
        com.tencent.mm.storage.RegionCodeDecoder$Region regionCodeDecoder$Region3 = this.N;
        if (regionCodeDecoder$Region3 != null && !com.tencent.mm.sdk.platformtools.t8.K0(regionCodeDecoder$Region3.getName())) {
            str = str + " " + this.N.getName();
        }
        this.Q.setText(str);
        w(true);
        if (!this.f197783t) {
            this.f197783t = true;
        }
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        M();
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) this.f197770d.getSystemService("layout_inflater");
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.tencent.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        layoutInflater.inflate(com.tencent.mm.R.layout.f489288c02, viewGroup2);
        this.Q = (android.widget.TextView) u17.findViewById(com.tencent.mm.R.id.pte);
        this.R = (android.widget.TextView) u17.findViewById(com.tencent.mm.R.id.nhj);
        this.S = (android.widget.ImageView) u17.findViewById(com.tencent.mm.R.id.nhw);
        return u17;
    }

    public ZoneRecommandPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.P = 0;
        this.G = com.tencent.mm.R.layout.byv;
    }
}
