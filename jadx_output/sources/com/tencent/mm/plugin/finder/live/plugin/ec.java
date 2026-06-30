package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ec implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cm2.i0 f112396d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.gc f112397e;

    public ec(cm2.i0 i0Var, com.tencent.mm.plugin.finder.live.plugin.gc gcVar) {
        this.f112396d = i0Var;
        this.f112397e = gcVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveBulkBuyBubble$refreshView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        cm2.i0 i0Var = this.f112396d;
        r45.ce0 ce0Var = (r45.ce0) i0Var.f43354v.getCustom(15);
        com.tencent.mm.plugin.finder.live.plugin.gc gcVar = this.f112397e;
        if (ce0Var != null) {
            i95.m c17 = i95.n0.c(c61.yb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            android.content.Context context = gcVar.f112677d;
            r45.ac4 ac4Var = new r45.ac4();
            ac4Var.set(1, (com.tencent.mm.protocal.protobuf.FinderJumpInfo) ce0Var.getCustom(9));
            c61.yb.Yi((c61.yb) c17, context, ac4Var, null, null, 8, null);
        }
        com.tencent.mm.plugin.finder.live.plugin.gc.a(gcVar, i0Var.f43354v, "");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveBulkBuyBubble$refreshView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
