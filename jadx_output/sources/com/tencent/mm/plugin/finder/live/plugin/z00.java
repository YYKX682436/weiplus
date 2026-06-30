package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class z00 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.f10 f115250d;

    public z00(com.tencent.mm.plugin.finder.live.plugin.f10 f10Var) {
        this.f115250d = f10Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveNewVisitorPostPlugin$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.plugin.f10 f10Var = this.f115250d;
        if (!((mm2.e0) f10Var.P0(mm2.e0.class)).P6()) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("PARAM_IS_ENTERING_COMMENT", true);
            bundle.putBoolean("PARAM_IS_ENTERING_EMOJI", true);
            bundle.putInt("PARAM_FINDER_LIVE_INPUT_SOURCE", 1);
            f10Var.f112480p.statusChange(qo0.b.W, bundle);
            com.tencent.mars.xlog.Log.i(f10Var.f112481q, "[click-emoji-icon] inputSource:1");
        } else if (com.tencent.mm.plugin.finder.live.plugin.f10.t1(f10Var)) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putBoolean("PARAM_IS_ENTERING_COMMENT", true);
            bundle2.putBoolean("PARAM_IS_ENTERING_EMOJI", true);
            bundle2.putInt("PARAM_FINDER_LIVE_INPUT_SOURCE", 1);
            f10Var.f112480p.statusChange(qo0.b.W, bundle2);
            com.tencent.mars.xlog.Log.i(f10Var.f112481q, "[click-emoji-icon-box] inputSource:1");
        }
        ((ml2.r0) i95.n0.c(ml2.r0.class)).ak(2, 6, kz5.b1.e(new jz5.l(ya.b.SOURCE, "1")));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveNewVisitorPostPlugin$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
