package com.tencent.mm.ui.base.preference;

/* loaded from: classes4.dex */
public class PreferenceTitleCategory extends com.tencent.mm.ui.base.preference.PreferenceCategory {
    public PreferenceTitleCategory(android.content.Context context, android.util.AttributeSet attributeSet) {
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
        }
    }

    public PreferenceTitleCategory(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        int i18 = this.G;
        if (i18 == com.tencent.mm.R.layout.c0i && i18 == com.tencent.mm.R.layout.c0l) {
            return;
        }
        this.G = com.tencent.mm.R.layout.c0e;
    }
}
