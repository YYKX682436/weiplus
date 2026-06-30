package com.tencent.mm.ui.base.preference;

/* loaded from: classes4.dex */
public class PreferenceFooterCategory extends com.tencent.mm.ui.base.preference.Preference {
    public android.widget.TextView L;
    public boolean M;

    public PreferenceFooterCategory(android.content.Context context) {
        super(context);
        this.M = false;
        this.G = com.tencent.mm.R.layout.c0g;
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(android.R.id.title);
        this.L = textView;
        if (textView == null) {
            return;
        }
        java.lang.CharSequence charSequence = this.f197774h;
        if (charSequence == null || charSequence.length() <= 0) {
            this.L.setVisibility(8);
            return;
        }
        this.L.setVisibility(0);
        this.L.setText(this.f197774h);
        if (this.M) {
            this.L.setTextSize(0, 38.0f);
            return;
        }
        this.L.setTextSize(0, i65.a.f(r2, com.tencent.mm.R.dimen.f479628b3) * i65.a.m(this.f197770d));
    }

    public PreferenceFooterCategory(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.M = false;
        this.G = com.tencent.mm.R.layout.c0g;
    }

    public PreferenceFooterCategory(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.M = false;
        this.G = com.tencent.mm.R.layout.c0g;
    }
}
