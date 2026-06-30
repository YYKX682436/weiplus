package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes.dex */
public final class SnsArtistPreference extends com.tencent.mm.ui.base.preference.Preference {
    public final java.lang.String L;
    public java.lang.String M;
    public final int N;
    public final int P;
    public android.widget.TextView Q;
    public java.lang.String R;
    public final com.tencent.mm.ui.MMActivity S;

    public SnsArtistPreference(android.content.Context context) {
        this(context, null);
        this.S = (com.tencent.mm.ui.MMActivity) context;
    }

    public void M() {
        java.lang.String str;
        com.tencent.mm.ui.MMActivity mMActivity;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateArtistName", "com.tencent.mm.plugin.sns.ui.SnsArtistPreference");
        if (this.Q != null && (str = this.R) != null && !str.equals("") && (mMActivity = this.S) != null) {
            this.Q.setText(mMActivity.getString(com.tencent.mm.R.string.iye, this.R));
            this.Q.setVisibility(0);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateArtistName", "com.tencent.mm.plugin.sns.ui.SnsArtistPreference");
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBindView", "com.tencent.mm.plugin.sns.ui.SnsArtistPreference");
        super.t(view);
        this.Q = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.a59);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f482920rt);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getmTitle", "com.tencent.mm.plugin.sns.ui.SnsArtistPreference");
        java.lang.String str = this.M;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getmTitle", "com.tencent.mm.plugin.sns.ui.SnsArtistPreference");
        textView.setText(str);
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.o58);
        if (textView2 != null) {
            textView2.setVisibility(this.P);
            textView2.setText(this.L);
            int i17 = this.N;
            if (i17 != -1) {
                textView2.setBackgroundDrawable(i65.a.i(this.S, i17));
            }
        }
        M();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindView", "com.tencent.mm.plugin.sns.ui.SnsArtistPreference");
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreateView", "com.tencent.mm.plugin.sns.ui.SnsArtistPreference");
        android.view.View u17 = super.u(viewGroup);
        android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) this.f197770d.getSystemService("layout_inflater");
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.tencent.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        this.M = this.S.getString(com.tencent.mm.R.string.iyg);
        layoutInflater.inflate(com.tencent.mm.R.layout.byx, viewGroup2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateView", "com.tencent.mm.plugin.sns.ui.SnsArtistPreference");
        return u17;
    }

    public SnsArtistPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.S = (com.tencent.mm.ui.MMActivity) context;
    }

    public SnsArtistPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = "";
        this.M = "";
        this.N = -1;
        this.P = 8;
        this.Q = null;
        this.R = "";
        this.S = (com.tencent.mm.ui.MMActivity) context;
        this.G = com.tencent.mm.R.layout.byv;
    }
}
