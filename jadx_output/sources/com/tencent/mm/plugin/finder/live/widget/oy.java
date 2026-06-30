package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class oy implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.fr1 f119336d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.qy f119337e;

    public oy(r45.fr1 fr1Var, com.tencent.mm.plugin.finder.live.widget.qy qyVar) {
        this.f119336d = fr1Var;
        this.f119337e = qyVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        xu2.u uVar;
        xu2.v vVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameEntranceWidget$mount$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        r45.fr1 fr1Var = this.f119336d;
        ml2.r0.Uj(r0Var, 2, 0, null, fr1Var != null ? ml2.s0.b(fr1Var) : null, 6, null);
        com.tencent.mm.plugin.finder.live.widget.qy qyVar = this.f119337e;
        if (((mm2.c1) qyVar.f119560f.P0(mm2.c1.class)).M7() && (uVar = (xu2.u) qyVar.f119560f.X0(xu2.u.class)) != null && (vVar = uVar.f457232r) != null) {
            vVar.a();
            vVar.c(2021);
        }
        qyVar.getClass();
        qo0.c.a(qyVar.f119559e, qo0.b.C2, null, 2, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameEntranceWidget$mount$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
