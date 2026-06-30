package com.tencent.mm.ui.base.preference;

/* loaded from: classes3.dex */
public class SummaryBelowPreference extends com.tencent.mm.ui.base.preference.Preference {
    public android.view.View L;

    public SummaryBelowPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        if (this.L == null) {
            android.view.View u17 = super.u(viewGroup);
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.tencent.mm.R.id.cgi);
            viewGroup2.removeAllViews();
            android.view.View.inflate(this.f197770d, com.tencent.mm.R.layout.f489295c11, viewGroup2);
            this.L = u17;
        }
        return this.L;
    }

    public SummaryBelowPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.G = com.tencent.mm.R.layout.byv;
    }
}
