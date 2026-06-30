package com.tencent.mm.plugin.recharge.ui.form;

/* loaded from: classes9.dex */
public class InstantAutoCompleteTextView extends android.widget.AutoCompleteTextView {

    /* renamed from: d, reason: collision with root package name */
    public boolean f155160d;

    public InstantAutoCompleteTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        if (android.os.Build.VERSION.SDK_INT < 35 || !com.tencent.mm.ui.b4.b(getContext())) {
            return;
        }
        setLocalePreferredLineHeightForMinimumUsed(false);
    }

    @Override // android.widget.AutoCompleteTextView
    public void dismissDropDown() {
        super.dismissDropDown();
    }

    @Override // android.widget.AutoCompleteTextView
    public boolean enoughToFilter() {
        return this.f155160d || super.enoughToFilter();
    }

    public void setShowAlways(boolean z17) {
        this.f155160d = z17;
    }

    public InstantAutoCompleteTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        if (android.os.Build.VERSION.SDK_INT < 35 || !com.tencent.mm.ui.b4.b(getContext())) {
            return;
        }
        setLocalePreferredLineHeightForMinimumUsed(false);
    }
}
