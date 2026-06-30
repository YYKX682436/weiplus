package com.tencent.mm.ui.base.preference;

/* loaded from: classes.dex */
public class PreferenceInfoCategory extends com.tencent.mm.ui.base.preference.Preference {
    public PreferenceInfoCategory(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(android.R.id.title);
        if (textView == null) {
            return;
        }
        java.lang.CharSequence charSequence = this.f197774h;
        if (charSequence == null || charSequence.length() <= 0) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(this.f197774h);
            textView.setOnClickListener(null);
        }
        ((android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f482703lp)).setOnClickListener(null);
    }

    public PreferenceInfoCategory(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.G = com.tencent.mm.R.layout.c0j;
    }
}
