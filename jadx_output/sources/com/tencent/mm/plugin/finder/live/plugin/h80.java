package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class h80 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.i80 f112787d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.f0 f112788e;

    public h80(com.tencent.mm.plugin.finder.live.plugin.i80 i80Var, cm2.f0 f0Var) {
        this.f112787d = i80Var;
        this.f112788e = f0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveRedPacketBubble$refreshView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bf2.c cVar = bf2.c.f19598a;
        com.tencent.mm.plugin.finder.live.plugin.i80 i80Var = this.f112787d;
        bf2.c.c(cVar, i80Var.f112938e, 2, 7, null, 0, null, 0, 0, null, 0, 1016, null);
        com.tencent.mars.xlog.Log.i(i80Var.f112942i, "close promote");
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        if (k0Var != null) {
            qo0.b bVar = qo0.b.O2;
            android.os.Bundle bundle = new android.os.Bundle();
            r45.f52 f52Var = new r45.f52();
            cm2.f0 f0Var = this.f112788e;
            f52Var.set(4, java.lang.Long.valueOf(f0Var.f43385d));
            f52Var.set(0, 7);
            f52Var.set(2, new com.tencent.mm.protobuf.g(f0Var.f43342v.toByteArray()));
            bundle.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", f52Var.toByteArray());
            k0Var.statusChange(bVar, bundle);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRedPacketBubble$refreshView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
