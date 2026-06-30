package com.tencent.mm.ui.base.preference;

/* loaded from: classes3.dex */
public class RightBelowPreference extends com.tencent.mm.ui.base.preference.SummaryBelowPreference {
    public java.lang.CharSequence M;

    public RightBelowPreference(android.content.Context context) {
        super(context, null);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        if (!com.tencent.mm.sdk.platformtools.t8.J0(this.M)) {
            ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.m3t)).setText(this.M);
        }
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.m38);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/ui/base/preference/RightBelowPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/ui/base/preference/RightBelowPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.ui.base.preference.SummaryBelowPreference, com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        ((android.view.ViewGroup) ((android.view.ViewGroup) u17.findViewById(com.tencent.mm.R.id.cgi)).findViewById(android.R.id.widget_frame)).addView((android.view.ViewGroup) android.view.View.inflate(this.f197770d, com.tencent.mm.R.layout.c_c, null));
        return u17;
    }

    public RightBelowPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RightBelowPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
