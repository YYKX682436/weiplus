package com.tencent.mm.ui.base.preference;

/* loaded from: classes.dex */
public class IconMsgPreference extends com.tencent.mm.ui.base.preference.Preference {
    public final java.lang.String L;
    public final int M;
    public final int N;
    public final int P;
    public final int Q;
    public final android.content.Context R;
    public final java.lang.String S;

    public IconMsgPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.h9o);
        if (imageView != null) {
            int i17 = this.f197777n;
            if (i17 != 0) {
                imageView.setImageResource(i17);
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.jlx);
        int i18 = this.Q;
        if (i18 != -1) {
            linearLayout.setMinimumHeight(i18);
        }
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.o58);
        if (textView != null) {
            textView.setVisibility(this.N);
            textView.setText(this.L);
            int i19 = this.M;
            if (i19 != -1) {
                textView.setBackgroundDrawable(i65.a.i(this.R, i19));
            }
        }
        ((android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.o4r)).setVisibility(this.P);
        ((android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.m4_)).setVisibility(0);
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.o59);
        java.lang.String str = this.S;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView2.setText(str);
        }
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.tencent.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        android.view.View.inflate(this.f197770d, com.tencent.mm.R.layout.c09, viewGroup2);
        u17.setMinimumHeight(u17.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479923j2));
        return u17;
    }

    public IconMsgPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = "";
        this.M = -1;
        this.N = 8;
        this.P = 8;
        this.Q = -1;
        this.S = "";
        this.R = context;
        this.G = com.tencent.mm.R.layout.byv;
    }
}
