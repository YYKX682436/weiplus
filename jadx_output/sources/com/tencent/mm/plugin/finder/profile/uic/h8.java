package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class h8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ob f123759d;

    public h8(com.tencent.mm.plugin.finder.profile.uic.ob obVar) {
        this.f123759d = obVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleFansLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        g92.b bVar = g92.b.f269769e;
        com.tencent.mm.plugin.finder.profile.uic.ob obVar = this.f123759d;
        m92.b j37 = g92.a.j3(bVar, obVar.getUsername(), false, 2, null);
        int i17 = j37 != null ? j37.field_fansAddCount : 0;
        if (i17 > 0) {
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mm.plugin.finder.report.o3.uj((com.tencent.mm.plugin.finder.report.o3) c17, "3", 1, 2, 5, 3, i17, null, null, 0L, obVar.getContextObj(), 0, 0, 3520, null);
        }
        m92.c cVar = new m92.c(xy2.c.e(obVar.getContext()));
        cVar.field_fansAddCount = 0;
        bVar.C(cVar, m92.j.f324992g);
        r45.f03 I0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("AuthorProfileFans");
        com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("AuthorProfileFans");
        if (L0 != null && I0 != null) {
            com.tencent.mm.plugin.finder.report.x2.i(com.tencent.mm.plugin.finder.report.x2.f125429a, "3", L0, I0, 2, obVar.getContextObj(), 0, null, 0, 0, 480, null);
            ((c61.l7) i95.n0.c(c61.l7.class)).nk().N("AuthorProfileFans");
        }
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).uj(obVar.getActivity(), null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleFansLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
