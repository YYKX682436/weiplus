package com.tencent.mm.pluginsdk.ui.preference;

/* loaded from: classes.dex */
public class LabelPreference extends com.tencent.mm.ui.base.preference.Preference {
    public android.view.View L;

    public LabelPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/preference/LabelPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/preference/LabelPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        if (this.L == null) {
            android.view.View u17 = super.u(viewGroup);
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.tencent.mm.R.id.cgi);
            viewGroup2.removeAllViews();
            android.view.LayoutInflater.from(this.f197770d).inflate(com.tencent.mm.R.layout.caz, viewGroup2);
            this.L = u17;
        }
        return this.L;
    }

    public LabelPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
