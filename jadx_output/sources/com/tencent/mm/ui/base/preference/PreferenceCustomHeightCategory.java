package com.tencent.mm.ui.base.preference;

/* loaded from: classes8.dex */
public class PreferenceCustomHeightCategory extends com.tencent.mm.ui.base.preference.Preference {
    public int L;

    public PreferenceCustomHeightCategory(android.content.Context context) {
        super(context);
        this.L = 0;
        this.G = com.tencent.mm.R.layout.byz;
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        if (this.L != 0) {
            ((android.widget.TextView) view.findViewById(android.R.id.title)).setHeight(this.L);
        }
    }

    public PreferenceCustomHeightCategory(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.L = 0;
        this.G = com.tencent.mm.R.layout.byz;
    }

    public PreferenceCustomHeightCategory(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = 0;
        this.G = com.tencent.mm.R.layout.byz;
    }
}
