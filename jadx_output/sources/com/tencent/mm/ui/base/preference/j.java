package com.tencent.mm.ui.base.preference;

/* loaded from: classes11.dex */
public class j implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.DialogPreference f197832d;

    public j(com.tencent.mm.ui.base.preference.DialogPreference dialogPreference) {
        this.f197832d = dialogPreference;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/preference/DialogPreference$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.ui.base.preference.DialogPreference dialogPreference = this.f197832d;
        com.tencent.mm.ui.widget.dialog.j0 j0Var = dialogPreference.P;
        if (j0Var != null) {
            j0Var.dismiss();
        }
        com.tencent.mm.ui.base.preference.i iVar = dialogPreference.L;
        java.lang.String str = (java.lang.String) iVar.f197828g[i17];
        iVar.f197829h = str;
        com.tencent.mm.ui.base.preference.k kVar = dialogPreference.N;
        if (kVar != null) {
            kVar.a(true);
        }
        com.tencent.mm.ui.base.preference.q0 q0Var = dialogPreference.M;
        if (q0Var != null) {
            q0Var.a(dialogPreference, iVar.f197829h);
        }
        yj0.a.h(this, "com/tencent/mm/ui/base/preference/DialogPreference$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
