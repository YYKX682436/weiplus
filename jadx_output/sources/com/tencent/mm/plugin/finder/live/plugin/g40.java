package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class g40 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.h40 f112632d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.c0 f112633e;

    public g40(com.tencent.mm.plugin.finder.live.plugin.h40 h40Var, cm2.c0 c0Var) {
        this.f112632d = h40Var;
        this.f112633e = c0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLivePayVideoListBubble$refreshView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.plugin.h40 h40Var = this.f112632d;
        com.tencent.mars.xlog.Log.i(h40Var.f112772i, "close promote");
        bf2.c cVar = bf2.c.f19598a;
        gk2.e eVar = h40Var.f112768e;
        zl2.r4 r4Var = zl2.r4.f473950a;
        cm2.c0 c0Var = this.f112633e;
        bf2.c.c(cVar, eVar, 2, 15, pm0.v.u(r4Var.c0(c0Var.f43334v)), 0, null, 0, 1, null, 0, nd1.y0.CTRL_INDEX, null);
        qo0.c cVar2 = h40Var.f112769f;
        qo0.b bVar = qo0.b.O2;
        android.os.Bundle bundle = new android.os.Bundle();
        r45.f52 f52Var = new r45.f52();
        f52Var.set(4, java.lang.Long.valueOf(c0Var.f43385d));
        f52Var.set(0, 20);
        f52Var.set(2, new com.tencent.mm.protobuf.g(c0Var.f43334v.toByteArray()));
        bundle.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", f52Var.toByteArray());
        cVar2.statusChange(bVar, bundle);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLivePayVideoListBubble$refreshView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
