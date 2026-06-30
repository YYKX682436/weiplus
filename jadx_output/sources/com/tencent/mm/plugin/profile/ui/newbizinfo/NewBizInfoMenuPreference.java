package com.tencent.mm.plugin.profile.ui.newbizinfo;

/* loaded from: classes.dex */
public class NewBizInfoMenuPreference extends com.tencent.mm.ui.base.preference.Preference {
    public NewBizInfoMenuPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.f483884cc1);
        if (linearLayout == null) {
            return;
        }
        linearLayout.setVisibility(8);
    }

    public NewBizInfoMenuPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
