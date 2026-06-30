package com.tencent.mm.ui.base.preference;

/* loaded from: classes4.dex */
public class PreferenceCategory extends com.tencent.mm.ui.base.preference.Preference {
    public PreferenceCategory(android.content.Context context) {
        this(context, null);
    }

    public PreferenceCategory(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreferenceCategory(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.G = com.tencent.mm.R.layout.byz;
    }
}
