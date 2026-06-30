package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class xb0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.dc0 f115068d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.mb0 f115069e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cm2.g0 f115070f;

    public xb0(com.tencent.mm.plugin.finder.live.plugin.dc0 dc0Var, bw5.mb0 mb0Var, cm2.g0 g0Var) {
        this.f115068d = dc0Var;
        this.f115069e = mb0Var;
        this.f115070f = g0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveTingBubble$refreshView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.plugin.dc0 dc0Var = this.f115068d;
        com.tencent.mars.xlog.Log.i(dc0Var.f112258h, "close promote");
        bf2.c cVar = bf2.c.f19598a;
        gk2.e eVar = dc0Var.f112255e;
        bw5.mb0 mb0Var = this.f115069e;
        java.lang.String b17 = mb0Var != null ? mb0Var.b() : null;
        if (b17 == null) {
            b17 = "";
        }
        bf2.c.c(cVar, eVar, 2, 12, b17, 0, null, 0, 1, null, 0, nd1.y0.CTRL_INDEX, null);
        qo0.c cVar2 = dc0Var.f112256f;
        qo0.b bVar = qo0.b.O2;
        android.os.Bundle bundle = new android.os.Bundle();
        r45.f52 f52Var = new r45.f52();
        cm2.g0 g0Var = this.f115070f;
        f52Var.set(4, java.lang.Long.valueOf(g0Var.f43385d));
        f52Var.set(0, 19);
        f52Var.set(2, new com.tencent.mm.protobuf.g(g0Var.f43346v.toByteArray()));
        bundle.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", f52Var.toByteArray());
        cVar2.statusChange(bVar, bundle);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTingBubble$refreshView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
