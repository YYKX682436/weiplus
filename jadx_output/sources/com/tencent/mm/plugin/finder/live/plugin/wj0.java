package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class wj0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.xj0 f114951d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.e3 f114952e;

    public wj0(com.tencent.mm.plugin.finder.live.plugin.xj0 xj0Var, com.tencent.mm.plugin.finder.view.e3 e3Var) {
        this.f114951d = xj0Var;
        this.f114952e = e3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.Object obj;
        pk2.o9 o9Var;
        pk2.d9 d9Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorOnlyAudioModePlugin$showNetWorkHalf$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        ml2.b4 b4Var = ml2.b4.X1;
        cl0.g gVar = new cl0.g();
        gVar.h("type", "4");
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        ml2.r0.hj(r0Var, b4Var, r26.i0.t(gVar2, ",", ";", false), 0L, null, null, null, null, null, 252, null);
        com.tencent.mm.plugin.finder.live.plugin.xj0 xj0Var = this.f114951d;
        java.util.List list = ((mm2.o4) xj0Var.P0(mm2.o4.class)).f329327v;
        kotlin.jvm.internal.o.f(list, "<get-audienceLinkMicUserList>(...)");
        synchronized (list) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (com.tencent.mm.sdk.platformtools.t8.D0(((km2.q) obj).f309170a, ((mm2.c1) xj0Var.P0(mm2.c1.class)).m8())) {
                        break;
                    }
                }
            }
        }
        boolean z17 = obj != null;
        boolean E7 = ((mm2.o4) xj0Var.P0(mm2.o4.class)).E7();
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorOnlyAudioModePlugin", "showCustomerVideoLevel linking:" + z17 + ",linkWait:" + E7);
        if (z17 || E7) {
            db5.t7.b(xj0Var.f365323d.getContext(), com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.egv));
        } else {
            boolean z18 = ((mm2.c1) xj0Var.P0(mm2.c1.class)).V4 != 0;
            boolean isConnected = com.tencent.mars.comm.NetStatusUtil.isConnected(com.tencent.mm.sdk.platformtools.x2.f193071a);
            if (z18 || !isConnected) {
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorOnlyAudioModePlugin", "anchor pause live:" + z18 + ",networkEnable:" + isConnected + '!');
                db5.t7.b(xj0Var.f365323d.getContext(), com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.egu));
            } else {
                kn0.r c18 = com.tencent.mm.plugin.finder.live.widget.yx.f120478f.c(z17);
                df2.ox oxVar = (df2.ox) xj0Var.U0(df2.ox.class);
                if (oxVar != null && (o9Var = oxVar.f231016q) != null && (d9Var = o9Var.f356082f) != null) {
                    if (d9Var.f355667j == null) {
                        android.content.Context context = xj0Var.f365323d.getContext();
                        kotlin.jvm.internal.o.f(context, "getContext(...)");
                        d9Var.f355667j = new com.tencent.mm.plugin.finder.live.widget.yx(context, xj0Var.S0());
                    }
                    com.tencent.mm.plugin.finder.live.widget.yx yxVar = d9Var.f355667j;
                    if (yxVar != null) {
                        yxVar.f120482d = c18;
                    }
                    if (yxVar != null) {
                        yxVar.b(xj0Var.x0(), 2);
                    }
                }
            }
        }
        this.f114952e.h();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorOnlyAudioModePlugin$showNetWorkHalf$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
