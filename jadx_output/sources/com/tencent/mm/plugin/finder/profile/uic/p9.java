package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class p9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ob f124121d;

    public p9(com.tencent.mm.plugin.finder.profile.uic.ob obVar) {
        this.f124121d = obVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$initEditLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[initEditLayout] onClick username:");
        com.tencent.mm.plugin.finder.profile.uic.ob obVar = this.f124121d;
        sb6.append(obVar.getUsername());
        com.tencent.mars.xlog.Log.i("Finder.FinderProfileHeaderUIC", sb6.toString());
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.finder.viewmodel.component.iy.d(com.tencent.mm.plugin.finder.viewmodel.component.ny.L1, obVar.getActivity(), intent, 0L, null, 0, 0, false, 0, null, 384, null);
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).rk(obVar.getActivity(), intent, 10010, obVar.getUsername());
        r45.f03 b07 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().b0("FinderSetting", obVar.getUsername());
        com.tencent.mm.plugin.finder.extension.reddot.jb S0 = zy2.ia.S0(((c61.l7) i95.n0.c(c61.l7.class)).nk(), "FinderSetting", obVar.getUsername(), false, false, 12, null);
        if (S0 != null && b07 != null) {
            com.tencent.mm.plugin.finder.report.x2.i(com.tencent.mm.plugin.finder.report.x2.f125429a, "3", S0, b07, 2, obVar.getContextObj(), 0, null, 0, 0, 480, null);
        }
        ((c61.l7) i95.n0.c(c61.l7.class)).nk().y("FinderSetting", obVar.getUsername());
        ((c61.l7) i95.n0.c(c61.l7.class)).nk().O("ProfileEntrance", new int[]{1000}, obVar.getUsername());
        ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).bj(obVar.getUsername(), c01.id.a(), 1);
        obVar.g7().setVisibility(8);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$initEditLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
