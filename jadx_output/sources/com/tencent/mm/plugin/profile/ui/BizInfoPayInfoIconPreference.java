package com.tencent.mm.plugin.profile.ui;

/* loaded from: classes3.dex */
public class BizInfoPayInfoIconPreference extends com.tencent.mm.ui.base.preference.Preference {
    public final android.view.LayoutInflater L;
    public android.widget.LinearLayout M;
    public java.util.List N;
    public int P;

    public BizInfoPayInfoIconPreference(android.content.Context context) {
        this(context, null);
    }

    public final void M(int i17) {
        android.widget.ImageView imageView = (android.widget.ImageView) this.L.inflate(com.tencent.mm.R.layout.f488681a14, (android.view.ViewGroup) null);
        android.content.Context context = this.f197770d;
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(i65.a.b(context, 20), i65.a.b(context, 20));
        layoutParams.rightMargin = i65.a.b(context, 6);
        imageView.setImageResource(i17);
        this.M.addView(imageView, layoutParams);
    }

    public void N(int i17) {
        if (i17 == this.P) {
            return;
        }
        this.P = i17;
        Q();
    }

    public void O(java.util.List list) {
        this.N = list;
        Q();
    }

    public final void Q() {
        android.widget.LinearLayout linearLayout = this.M;
        if (linearLayout == null) {
            return;
        }
        linearLayout.removeAllViews();
        int i17 = this.P;
        if (i17 >= 0) {
            for (int i18 = 0; i18 < 5; i18++) {
                if (i17 <= 0) {
                    M(com.tencent.mm.R.raw.biz_info_brand_unselect);
                } else {
                    if (i17 <= 10) {
                        M(com.tencent.mm.R.raw.biz_info_brand_half_selected);
                    } else if (i17 <= 20) {
                        M(com.tencent.mm.R.raw.biz_info_brand_selected);
                    } else {
                        M(com.tencent.mm.R.raw.biz_info_brand_selected);
                    }
                    i17 -= 20;
                }
            }
            return;
        }
        java.util.List<java.lang.String> list = this.N;
        if (list != null) {
            for (java.lang.String str : list) {
                android.content.Context context = this.f197770d;
                com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView = new com.tencent.mm.pluginsdk.ui.applet.CdnImageView(context, null);
                cdnImageView.setUrl(str);
                android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(i65.a.b(context, 20), i65.a.b(context, 20));
                layoutParams.rightMargin = i65.a.b(context, 6);
                this.M.addView(cdnImageView, layoutParams);
            }
        }
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        this.M = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.ns9);
        Q();
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.tencent.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        this.L.inflate(com.tencent.mm.R.layout.a27, viewGroup2);
        return u17;
    }

    public BizInfoPayInfoIconPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BizInfoPayInfoIconPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.P = -1;
        this.L = (android.view.LayoutInflater) context.getSystemService("layout_inflater");
        this.G = com.tencent.mm.R.layout.byv;
    }
}
