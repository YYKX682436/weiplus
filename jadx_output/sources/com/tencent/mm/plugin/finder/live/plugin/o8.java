package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class o8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.t8 f113713d;

    public o8(com.tencent.mm.plugin.finder.live.plugin.t8 t8Var) {
        this.f113713d = t8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorPausePlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - qd2.h.f361767a >= 500) {
            z17 = false;
        } else {
            com.tencent.mars.xlog.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f361767a);
            z17 = true;
        }
        qd2.h.f361767a = currentTimeMillis;
        com.tencent.mm.plugin.finder.live.plugin.t8 t8Var = this.f113713d;
        if (z17) {
            com.tencent.mars.xlog.Log.i(t8Var.f114355q, "reset pause click too fast!");
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorPausePlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        t8Var.getClass();
        qo0.b bVar = qo0.b.f365409r4;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_FINDER_LIVE_ANCHOR_PAUSE_RECOVERY", true);
        t8Var.f114354p.statusChange(bVar, bundle);
        ((ml2.j0) i95.n0.c(ml2.j0.class)).Aj(2, t8Var.f114357s);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorPausePlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
