package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ei0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ji0 f112424d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f112425e;

    public ei0(com.tencent.mm.plugin.finder.live.plugin.ji0 ji0Var, android.view.ViewGroup viewGroup) {
        this.f112424d = ji0Var;
        this.f112425e = viewGroup;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorGameRankSwitchGuidePlugin$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.Rj((ml2.r0) c17, 2, null, 0, 6, null);
        com.tencent.mm.plugin.finder.live.plugin.ji0 ji0Var = this.f112424d;
        r45.z63 g76 = ((mm2.c1) ji0Var.P0(mm2.c1.class)).g7();
        if (g76 != null) {
            zl2.r4 r4Var = zl2.r4.f473950a;
            if (r4Var.D(true, g76)) {
                ji0Var.u1();
                android.content.Context context = this.f112425e.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                r4Var.g3(context, g76, new com.tencent.mm.plugin.finder.live.plugin.di0(ji0Var, g76));
            } else {
                com.tencent.mm.plugin.finder.live.plugin.ji0.t1(ji0Var, g76, true);
                ji0Var.v1(true, g76);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorGameRankSwitchGuidePlugin$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
