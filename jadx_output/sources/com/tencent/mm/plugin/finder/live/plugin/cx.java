package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class cx implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.fx f112211d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.a0 f112212e;

    public cx(com.tencent.mm.plugin.finder.live.plugin.fx fxVar, cm2.a0 a0Var) {
        this.f112211d = fxVar;
        this.f112212e = a0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveMemberBubble$refreshView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.plugin.fx fxVar = this.f112211d;
        com.tencent.mars.xlog.Log.i(fxVar.f112601h, "close promote");
        bf2.c cVar = bf2.c.f19598a;
        gk2.e eVar = fxVar.f112598e;
        cm2.a0 a0Var = this.f112212e;
        bf2.c.c(cVar, eVar, 2, 10, java.lang.String.valueOf(a0Var.f43385d), 0, null, 0, 0, null, 0, 1008, null);
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        if (k0Var != null) {
            qo0.b bVar = qo0.b.O2;
            android.os.Bundle bundle = new android.os.Bundle();
            r45.f52 f52Var = new r45.f52();
            f52Var.set(4, java.lang.Long.valueOf(a0Var.f43385d));
            f52Var.set(0, 14);
            f52Var.set(2, new com.tencent.mm.protobuf.g(a0Var.f43329v.toByteArray()));
            bundle.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", f52Var.toByteArray());
            k0Var.statusChange(bVar, bundle);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMemberBubble$refreshView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
