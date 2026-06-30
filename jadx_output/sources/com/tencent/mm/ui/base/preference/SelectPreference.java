package com.tencent.mm.ui.base.preference;

/* loaded from: classes3.dex */
public class SelectPreference extends com.tencent.mm.ui.base.preference.Preference {
    public android.view.View L;
    public android.widget.TextView M;
    public java.lang.String N;
    public boolean P;

    public SelectPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.G = com.tencent.mm.R.layout.byv;
    }

    public void M(java.lang.String str) {
        this.N = str;
        if (this.M != null) {
            if (android.text.TextUtils.isEmpty(str)) {
                this.M.setVisibility(8);
                this.M.setText("");
            } else {
                this.M.setVisibility(0);
                this.M.setText(str);
            }
        }
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        E(8);
        ((com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.nh8)).setVisibility(this.P ? 0 : 8);
        this.M = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f484050cu2);
        M(this.N);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.tencent.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        android.view.View.inflate(this.f197770d, com.tencent.mm.R.layout.c0w, viewGroup2);
        this.L = u17;
        return u17;
    }

    public SelectPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
