package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class q3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.f4 f124141d;

    public q3(com.tencent.mm.plugin.finder.profile.uic.f4 f4Var) {
        this.f124141d = f4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileEduUIC$onCreateAfter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.profile.uic.f4 f4Var = this.f124141d;
        f4Var.W6().toggle();
        com.tencent.mm.plugin.finder.profile.uic.f4.O6(f4Var);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_WXPROFILE_ENTRY_EDU_INT_SYNC, 1);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileEduUIC$onCreateAfter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
