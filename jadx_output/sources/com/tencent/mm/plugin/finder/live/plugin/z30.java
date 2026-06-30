package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class z30 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cm2.b0 f115278d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.c40 f115279e;

    public z30(cm2.b0 b0Var, com.tencent.mm.plugin.finder.live.plugin.c40 c40Var) {
        this.f115278d = b0Var;
        this.f115279e = c40Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveOtherBubble$refreshView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        cm2.b0 b0Var = this.f115278d;
        java.lang.Integer g17 = b0Var.g();
        com.tencent.mm.plugin.finder.live.plugin.c40 c40Var = this.f115279e;
        if (g17 != null) {
            int intValue = g17.intValue();
            bf2.c cVar = bf2.c.f19598a;
            gk2.e eVar = c40Var.f112109e;
            java.lang.String jump_id = b0Var.f43331v.getJump_id();
            if (jump_id == null) {
                jump_id = "";
            }
            bf2.c.c(cVar, eVar, 2, intValue, jump_id, 0, null, 0, 0, null, 0, 1008, null);
        }
        com.tencent.mars.xlog.Log.i(c40Var.f112112h, "close promote");
        qo0.c cVar2 = c40Var.f112110f;
        qo0.b bVar = qo0.b.O2;
        android.os.Bundle bundle = new android.os.Bundle();
        r45.f52 f52Var = new r45.f52();
        f52Var.set(4, java.lang.Long.valueOf(b0Var.f43385d));
        f52Var.set(0, java.lang.Integer.valueOf(b0Var.f43332w));
        f52Var.set(2, new com.tencent.mm.protobuf.g(b0Var.f43331v.toByteArray()));
        bundle.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", f52Var.toByteArray());
        cVar2.statusChange(bVar, bundle);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveOtherBubble$refreshView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
