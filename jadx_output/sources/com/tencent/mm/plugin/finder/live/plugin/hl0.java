package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class hl0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ll0 f112824d;

    public hl0(com.tencent.mm.plugin.finder.live.plugin.ll0 ll0Var) {
        this.f112824d = ll0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorVRBubblePlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f112824d.t1();
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        ml2.x4[] x4VarArr = ml2.x4.f328234d;
        r0Var.Mk(java.lang.String.valueOf(4));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorVRBubblePlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
