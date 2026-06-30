package com.tencent.mm.ui.base.preference;

/* loaded from: classes11.dex */
public class BigIconSummaryPreference extends com.tencent.mm.ui.base.preference.IconSummaryPreference {
    public BigIconSummaryPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }

    @Override // com.tencent.mm.ui.base.preference.IconSummaryPreference, com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        u17.setMinimumHeight(u17.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479878hr));
        return u17;
    }

    public BigIconSummaryPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
