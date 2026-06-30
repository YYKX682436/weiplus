package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class yi implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.cj f115201d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.u f115202e;

    public yi(com.tencent.mm.plugin.finder.live.plugin.cj cjVar, cm2.u uVar) {
        this.f115201d = cjVar;
        this.f115202e = uVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.finder.live.plugin.r60 r60Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveGamePromoteBubble$refreshView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.plugin.cj cjVar = this.f115201d;
        int i17 = cjVar.f112156d.getResources().getConfiguration().orientation;
        cm2.u uVar = this.f115202e;
        if (i17 == 2) {
            qo0.c cVar = cjVar.f112158f;
            com.tencent.mm.plugin.finder.live.view.k0 k0Var = cVar instanceof com.tencent.mm.plugin.finder.live.view.k0 ? (com.tencent.mm.plugin.finder.live.view.k0) cVar : null;
            if (k0Var != null && (r60Var = (com.tencent.mm.plugin.finder.live.plugin.r60) k0Var.getPlugin(com.tencent.mm.plugin.finder.live.plugin.r60.class)) != null) {
                java.lang.String str = cjVar.f112161i;
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putByteArray(cjVar.f112162m, uVar.f43400v.toByteArray());
                r60Var.p1(str, bundle);
            }
        } else {
            r45.n63 n63Var = uVar.f43400v;
            cjVar.getClass();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGamePromoteBubble$refreshView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
