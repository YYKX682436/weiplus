package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class fi0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ji0 f112560d;

    public fi0(com.tencent.mm.plugin.finder.live.plugin.ji0 ji0Var) {
        this.f112560d = ji0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorGameRankSwitchGuidePlugin$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.Rj((ml2.r0) c17, 8, null, 0, 6, null);
        com.tencent.mm.plugin.finder.live.plugin.ji0 ji0Var = this.f112560d;
        r45.z63 g76 = ((mm2.c1) ji0Var.P0(mm2.c1.class)).g7();
        if (g76 != null) {
            ji0Var.v1(false, g76);
        }
        ji0Var.u1();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorGameRankSwitchGuidePlugin$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
