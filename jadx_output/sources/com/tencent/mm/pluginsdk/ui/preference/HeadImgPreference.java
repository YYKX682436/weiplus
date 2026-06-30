package com.tencent.mm.pluginsdk.ui.preference;

/* loaded from: classes.dex */
public final class HeadImgPreference extends com.tencent.mm.ui.base.preference.Preference {
    public final int L;
    public android.widget.ImageView M;

    public HeadImgPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        if (this.M == null) {
            this.M = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.h9k);
        }
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.jlx);
        int i17 = this.L;
        if (i17 != -1) {
            linearLayout.setMinimumHeight(i17);
        }
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.tencent.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        android.view.View.inflate(this.f197770d, com.tencent.mm.R.layout.bzg, viewGroup2);
        this.M = (android.widget.ImageView) u17.findViewById(com.tencent.mm.R.id.h9k);
        return u17;
    }

    public HeadImgPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = -1;
        this.G = com.tencent.mm.R.layout.byv;
    }
}
