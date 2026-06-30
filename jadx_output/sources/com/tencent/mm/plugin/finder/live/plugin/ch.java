package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ch implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.kh f112151d;

    public ch(com.tencent.mm.plugin.finder.live.plugin.kh khVar) {
        this.f112151d = khVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        xu2.u uVar;
        xu2.v vVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin$membersGroupVisitorClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.plugin.kh khVar = this.f112151d;
        if (khVar.z1()) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.z4 z4Var = ml2.z4.A;
            ml2.r3 r3Var = ml2.r3.f327900e;
            zy2.zb.y6(zbVar, z4Var, java.lang.String.valueOf(1), null, 4, null);
        } else {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).Wj(ml2.h5.f327531o, "", 0);
        }
        if (((mm2.c1) khVar.P0(mm2.c1.class)).M7() && (uVar = (xu2.u) khVar.X0(xu2.u.class)) != null && (vVar = uVar.f457232r) != null) {
            vVar.a();
            vVar.c(2018);
        }
        if (((mm2.e1) khVar.P0(mm2.e1.class)).t7()) {
            i95.m c18 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            ((ml2.r0) c18).yk(2, (r13 & 2) != 0 ? null : null, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
        }
        qo0.c.a(khVar.f113242p, qo0.b.f365339d2, null, 2, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin$membersGroupVisitorClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
