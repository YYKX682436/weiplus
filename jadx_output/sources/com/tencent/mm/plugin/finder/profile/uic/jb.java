package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class jb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ob f123848d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ct4 f123849e;

    public jb(com.tencent.mm.plugin.finder.profile.uic.ob obVar, r45.ct4 ct4Var) {
        this.f123848d = obVar;
        this.f123849e = ct4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$showPlayCount$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        com.tencent.mm.plugin.finder.profile.uic.ob obVar = this.f123848d;
        i0Var.kk(obVar.getActivity(), obVar.getUsername(), this.f123849e);
        obVar.g7().setVisibility(8);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$showPlayCount$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
