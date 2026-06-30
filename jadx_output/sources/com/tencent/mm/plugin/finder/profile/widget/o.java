package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes2.dex */
public final class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f124650d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.q f124651e;

    public o(java.lang.String str, com.tencent.mm.plugin.finder.profile.widget.q qVar) {
        this.f124650d = str;
        this.f124651e = qVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/widget/HeaderActivityWidget$initActivity$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kk.l lVar = com.tencent.mm.plugin.finder.profile.uic.p2.f124101r;
        com.tencent.mm.plugin.finder.profile.uic.l2 l2Var = (com.tencent.mm.plugin.finder.profile.uic.l2) com.tencent.mm.plugin.finder.profile.uic.p2.f124101r.get(this.f124650d);
        r45.e21 e21Var = l2Var != null ? l2Var.f123919h : null;
        if (e21Var != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_activity_id", e21Var.getLong(0));
            intent.putExtra("key_activity_name", e21Var.getString(2));
            com.tencent.mars.xlog.Log.i("Finder.FinderProfileHeaderUIC", "eventTopicId :" + e21Var.getLong(0) + " eventName:" + e21Var.getString(2));
            com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
            com.tencent.mm.plugin.finder.profile.widget.q qVar = this.f124651e;
            com.tencent.mm.plugin.finder.viewmodel.component.iy.d(iyVar, qVar.f124674a, intent, 0L, null, 0, 0, false, 0, null, 384, null);
            intent.putExtra("key_activity_profile_src_type", "2");
            s92.g.f405006a.a(qVar.f124674a, intent, c01.id.c(), 2);
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ((com.tencent.mm.plugin.finder.assist.i0) c17).Bi(qVar.f124674a, intent, false);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/widget/HeaderActivityWidget$initActivity$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
