package com.tencent.mm.plugin.profile.ui;

/* loaded from: classes.dex */
public class MultiSummaryPreference extends com.tencent.mm.ui.base.preference.Preference {
    public MultiSummaryPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.G = com.tencent.mm.R.layout.byv;
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.obc)).setText((java.lang.CharSequence) null);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.ns_);
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.nsa);
        linearLayout.setVisibility(8);
        linearLayout2.setVisibility(8);
        android.view.View view2 = (android.view.View) view.findViewById(com.tencent.mm.R.id.m38).getParent();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/MultiSummaryPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/profile/ui/MultiSummaryPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) this.f197770d.getSystemService("layout_inflater");
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.tencent.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        layoutInflater.inflate(com.tencent.mm.R.layout.c2p, viewGroup2);
        return u17;
    }

    public MultiSummaryPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.G = com.tencent.mm.R.layout.byv;
    }
}
