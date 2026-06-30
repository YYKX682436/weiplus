package com.tencent.mm.ui.base.preference;

/* loaded from: classes.dex */
public class PreferenceHeaderCategory extends com.tencent.mm.ui.base.preference.Preference {
    public PreferenceHeaderCategory(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        u17.findViewById(android.R.id.title).setBackgroundResource(com.tencent.mm.R.drawable.bfk);
        return u17;
    }

    public PreferenceHeaderCategory(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.G = com.tencent.mm.R.layout.c08;
    }
}
