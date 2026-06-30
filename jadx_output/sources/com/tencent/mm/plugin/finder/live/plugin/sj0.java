package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class sj0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.xj0 f114267d;

    public sj0(com.tencent.mm.plugin.finder.live.plugin.xj0 xj0Var) {
        this.f114267d = xj0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorOnlyAudioModePlugin$mount$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.plugin.xj0 xj0Var = this.f114267d;
        ((mm2.c1) xj0Var.P0(mm2.c1.class)).N1 = !((mm2.c1) xj0Var.P0(mm2.c1.class)).N1;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR", ((mm2.c1) xj0Var.P0(mm2.c1.class)).N1);
        xj0Var.f115091p.statusChange(qo0.b.Z2, bundle);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorOnlyAudioModePlugin$mount$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
