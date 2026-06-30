package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class p8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ob f124120d;

    public p8(com.tencent.mm.plugin.finder.profile.uic.ob obVar) {
        this.f124120d = obVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleMessageBtn$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.profile.uic.ob obVar = this.f124120d;
        android.app.Activity context = obVar.getContext();
        ya2.b2 profileContact = obVar.getProfileContact();
        int i17 = profileContact != null ? profileContact.field_extFlag : 0;
        kotlin.jvm.internal.o.g(context, "context");
        boolean z17 = (i17 & 64) != 0;
        if (z17) {
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(com.tencent.mm.sdk.platformtools.x2.f193071a);
            u1Var.g(context.getResources().getString(com.tencent.mm.R.string.eo6));
            u1Var.a(true);
            u1Var.m(com.tencent.mm.R.string.l_e);
            u1Var.l(com.tencent.mm.plugin.finder.profile.uic.v6.f124289a);
            u1Var.e(com.tencent.mm.plugin.finder.profile.uic.w6.f124317d);
            u1Var.q(false);
        }
        if (!z17) {
            com.tencent.mm.plugin.finder.report.k kVar = com.tencent.mm.plugin.finder.report.p.f125228g;
            kVar.c(xy2.c.e(obVar.getContext()), "", obVar.getUsername());
            com.tencent.mm.plugin.finder.report.k.a(kVar, obVar.getContextObj(), 3L, 2L, null, 8, null);
            android.content.Intent intent = new android.content.Intent();
            xy2.c.c(obVar.getActivity(), intent);
            com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
            android.app.Activity context2 = obVar.getContext();
            java.lang.String username = obVar.getUsername();
            java.lang.Integer valueOf = java.lang.Integer.valueOf(obVar.getIntent().getIntExtra("key_enter_profile_type", 0));
            android.app.Activity context3 = obVar.getContext();
            kotlin.jvm.internal.o.g(context3, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context3 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context3).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            i0Var.Zi(context2, username, 2, intent, null, valueOf, nyVar != null ? java.lang.Integer.valueOf(nyVar.V6().getInteger(7)) : null, java.lang.Long.valueOf(obVar.P1));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleMessageBtn$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
