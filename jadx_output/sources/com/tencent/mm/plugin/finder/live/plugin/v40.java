package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class v40 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.z40 f114658d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.d0 f114659e;

    public v40(com.tencent.mm.plugin.finder.live.plugin.z40 z40Var, cm2.d0 d0Var) {
        this.f114658d = z40Var;
        this.f114659e = d0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLivePlayListBubble$refreshView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i(this.f114658d.f115285h, "close promote");
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        if (k0Var != null) {
            qo0.b bVar = qo0.b.O2;
            android.os.Bundle bundle = new android.os.Bundle();
            r45.f52 f52Var = new r45.f52();
            cm2.d0 d0Var = this.f114659e;
            f52Var.set(4, java.lang.Long.valueOf(d0Var.f43385d));
            f52Var.set(0, 13);
            f52Var.set(2, new com.tencent.mm.protobuf.g(d0Var.f43335v.toByteArray()));
            bundle.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", f52Var.toByteArray());
            bundle.putBoolean("PARAM_FINDER_LIVE_PROMOTE_DELETE_BY_VISITOR_CLICK_CLOSE", true);
            k0Var.statusChange(bVar, bundle);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLivePlayListBubble$refreshView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
