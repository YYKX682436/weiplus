package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class v4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.w4 f120035d;

    public v4(com.tencent.mm.plugin.finder.live.widget.w4 w4Var) {
        this.f120035d = w4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorCameraOptionWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, ml2.t1.U, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f327916f), null, null, null, null, false, 124, null);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("PARAM_FINDER_LIVE_CAMERA_OPT_SCENE", 1);
        com.tencent.mm.plugin.finder.live.widget.w4 w4Var = this.f120035d;
        w4Var.f120132e.statusChange(qo0.b.f365350f3, bundle);
        ll2.e eVar = ll2.e.f319133a;
        ll2.e.b(eVar, w4Var.f120138n, false, false, 6, null);
        ll2.e.b(eVar, w4Var.f120139o, false, false, 6, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorCameraOptionWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
