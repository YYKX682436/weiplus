package com.tencent.weui.base.preference;

/* loaded from: classes3.dex */
public class PreferenceCategory extends android.preference.Preference {
    public PreferenceCategory(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreferenceCategory(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        setLayoutResource(com.tencent.mm.R.layout.byz);
    }
}
