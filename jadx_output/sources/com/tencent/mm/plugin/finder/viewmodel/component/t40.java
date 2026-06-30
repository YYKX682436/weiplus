package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class t40 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.f50 f135977d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.xk f135978e;

    public t40(com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var, r45.xk xkVar) {
        this.f135977d = f50Var;
        this.f135978e = xkVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$refreshSelf$4$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
        com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var = this.f135977d;
        com.tencent.mm.plugin.finder.viewmodel.component.ny e17 = iyVar.e(f50Var.getActivity());
        com.tencent.mm.plugin.finder.report.b6.d(com.tencent.mm.plugin.finder.report.b6.f124969a, e17 != null ? e17.V6() : null, "biz_identity_tips", 1, null, false, null, 56, null);
        r45.xk xkVar = this.f135978e;
        if (xkVar != null) {
            android.content.Intent intent = new android.content.Intent();
            com.tencent.mm.plugin.finder.viewmodel.component.iy.d(iyVar, f50Var.getActivity(), intent, 0L, null, 0, 0, false, 0, null, 508, null);
            intent.putExtra("Contact_User", xkVar.getString(0));
            intent.putExtra("Contact_Scene", 213);
            intent.putExtra("force_get_contact", true);
            intent.putExtra("key_use_new_contact_profile", true);
            intent.putExtra("biz_profile_tab_type", 1);
            j45.l.j(f50Var.getActivity(), com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$refreshSelf$4$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
