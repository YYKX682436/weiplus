package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class sx implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ty f114318d;

    public sx(com.tencent.mm.plugin.finder.live.plugin.ty tyVar) {
        this.f114318d = tyVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveMemberListPlugin$initListener$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.plugin.ty tyVar = this.f114318d;
        tyVar.u1();
        if (tyVar.f114485p.getLiveRole() == 1) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.z4 z4Var = ml2.z4.A;
            ml2.r3 r3Var = ml2.r3.f327900e;
            zy2.zb.y6(zbVar, z4Var, java.lang.String.valueOf(3), null, 4, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMemberListPlugin$initListener$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
