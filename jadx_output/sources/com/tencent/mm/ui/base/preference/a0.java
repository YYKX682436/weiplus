package com.tencent.mm.ui.base.preference;

/* loaded from: classes11.dex */
public class a0 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.MMPreference f197791d;

    public a0(com.tencent.mm.ui.base.preference.MMPreference mMPreference) {
        this.f197791d = mMPreference;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mm.ui.base.preference.h0 h0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/preference/MMPreference$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.ui.base.preference.Preference preference = (com.tencent.mm.ui.base.preference.Preference) adapterView.getAdapter().getItem(i17);
        if (preference == null) {
            yj0.a.h(this, "com/tencent/mm/ui/base/preference/MMPreference$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        if (preference.r() && preference.f197783t) {
            if (preference instanceof com.tencent.mm.ui.base.preference.CheckBoxPreference) {
                yj0.a.h(this, "com/tencent/mm/ui/base/preference/MMPreference$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            if (preference instanceof com.tencent.mm.ui.base.preference.DialogPreference) {
                com.tencent.mm.ui.base.preference.DialogPreference dialogPreference = (com.tencent.mm.ui.base.preference.DialogPreference) preference;
                dialogPreference.M();
                dialogPreference.N = new com.tencent.mm.ui.base.preference.y(this, dialogPreference, preference);
            }
            if (preference instanceof com.tencent.mm.ui.base.preference.EditPreference) {
                com.tencent.mm.ui.base.preference.EditPreference editPreference = (com.tencent.mm.ui.base.preference.EditPreference) preference;
                editPreference.M();
                editPreference.M = new com.tencent.mm.ui.base.preference.z(this, editPreference, preference);
            }
            com.tencent.mm.ui.base.preference.MMPreference mMPreference = this.f197791d;
            h0Var = mMPreference.adapter;
            mMPreference.dispatchClick(h0Var, preference);
        }
        yj0.a.h(this, "com/tencent/mm/ui/base/preference/MMPreference$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
