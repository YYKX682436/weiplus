package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class sc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ad f114239d;

    public sc(com.tencent.mm.plugin.finder.live.plugin.ad adVar) {
        this.f114239d = adVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveChargePayLazyPlugin$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - qd2.h.f361767a >= 500) {
            z17 = false;
        } else {
            com.tencent.mars.xlog.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f361767a);
            z17 = true;
        }
        qd2.h.f361767a = currentTimeMillis;
        if (z17) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveChargePayLazyPlugin$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.plugin.finder.live.plugin.ad adVar = this.f114239d;
        if (adVar.C == 3) {
            java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_CHARGE_VISITOR_LICENSE_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
            kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.Boolean");
            if (((java.lang.Boolean) m17).booleanValue()) {
                com.tencent.mm.plugin.finder.live.plugin.ad.u1(adVar);
            } else {
                android.content.Context context = adVar.f365323d.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                dt2.d dVar = new dt2.d(context, false, ((mm2.c1) adVar.P0(mm2.c1.class)).f328801f2 == 2, ((mm2.e1) adVar.P0(mm2.e1.class)).f328983m);
                java.lang.String string = dVar.getContext().getResources().getString(com.tencent.mm.R.string.d9i);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                java.lang.String string2 = dVar.getContext().getResources().getString(com.tencent.mm.R.string.d9g);
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                dVar.b(true, string, string2, new com.tencent.mm.plugin.finder.live.plugin.rc(adVar));
            }
        } else {
            adVar.A1(true, false);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveChargePayLazyPlugin$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
