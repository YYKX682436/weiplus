package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class p10 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.z10 f113815d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.y f113816e;

    public p10(com.tencent.mm.plugin.finder.live.plugin.z10 z10Var, cm2.y yVar) {
        this.f113815d = z10Var;
        this.f113816e = yVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveNoticeBubble$refreshView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.plugin.z10 z10Var = this.f113815d;
        java.lang.String str = z10Var.f115260i;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("close promote, id:");
        cm2.y yVar = this.f113816e;
        sb6.append(yVar.f43408v.getString(4));
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        bf2.c cVar = bf2.c.f19598a;
        gk2.e eVar = z10Var.f115256e;
        java.lang.String string = yVar.f43408v.getString(4);
        if (string == null) {
            string = "";
        }
        java.lang.String str2 = string;
        r45.ov2 a17 = zl2.t.a(yVar.f43408v);
        bf2.c.c(cVar, eVar, 2, 1, str2, 0, a17 != null ? a17.getString(1) : null, 0, 0, null, 0, sb1.a.CTRL_INDEX, null);
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        if (k0Var != null) {
            qo0.b bVar = qo0.b.O2;
            android.os.Bundle bundle = new android.os.Bundle();
            r45.f52 f52Var = new r45.f52();
            f52Var.set(4, java.lang.Long.valueOf(yVar.f43385d));
            f52Var.set(0, 1);
            f52Var.set(2, new com.tencent.mm.protobuf.g(yVar.f43408v.toByteArray()));
            bundle.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", f52Var.toByteArray());
            k0Var.statusChange(bVar, bundle);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveNoticeBubble$refreshView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
