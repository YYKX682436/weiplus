package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class vj0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.xj0 f114775d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.e3 f114776e;

    public vj0(com.tencent.mm.plugin.finder.live.plugin.xj0 xj0Var, com.tencent.mm.plugin.finder.view.e3 e3Var) {
        this.f114775d = xj0Var;
        this.f114776e = e3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorOnlyAudioModePlugin$showNetWorkHalf$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        ml2.b4 b4Var = ml2.b4.X1;
        cl0.g gVar = new cl0.g();
        gVar.h("type", "1");
        gVar.h("operate_way", "2");
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        ml2.r0.hj(r0Var, b4Var, r26.i0.t(gVar2, ",", ";", false), 0L, null, null, null, null, null, 252, null);
        this.f114775d.v1(true);
        this.f114776e.h();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorOnlyAudioModePlugin$showNetWorkHalf$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
