package com.tencent.mm.plugin.finder.widget.pref;

/* loaded from: classes.dex */
public class PreferenceHeaderCategory extends com.tencent.mm.ui.base.preference.Preference {
    public android.widget.TextView L;

    public PreferenceHeaderCategory(android.content.Context context) {
        super(context);
        this.G = com.tencent.mm.R.layout.edh;
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
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
        this.L.setTextSize(0, i65.a.f(r2, com.tencent.mm.R.dimen.f479628b3) * i65.a.m(this.f197770d));
    }

    public PreferenceHeaderCategory(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.G = com.tencent.mm.R.layout.edh;
    }

    public PreferenceHeaderCategory(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.G = com.tencent.mm.R.layout.edh;
    }
}
