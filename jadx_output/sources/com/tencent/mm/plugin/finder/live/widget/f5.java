package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class f5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.g5 f118312d;

    public f5(com.tencent.mm.plugin.finder.live.widget.g5 g5Var) {
        this.f118312d = g5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorFlipCameraWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.widget.g5 g5Var = this.f118312d;
        com.tencent.mars.xlog.Log.i(g5Var.f118403f, "clickFlipCamera");
        com.tencent.mm.plugin.finder.live.plugin.a5 a5Var = (com.tencent.mm.plugin.finder.live.plugin.a5) g5Var.f118402e.X0(com.tencent.mm.plugin.finder.live.plugin.a5.class);
        mm2.c1 c1Var = (mm2.c1) dk2.ef.f233372a.i(mm2.c1.class);
        boolean z17 = false;
        if (c1Var != null && c1Var.l7()) {
            z17 = true;
        }
        if (z17) {
            if (a5Var != null) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putBoolean("PARAM_FINDER_LIVE_CAMERA_ACTION_SHOULD_TRY_OPEN", true);
                ml2.m1[] m1VarArr = ml2.m1.f327711d;
                bundle.putInt("PARAM_FINDER_LIVE_CAMERA_ACTION_OPEN_SOURCE", 1);
                a5Var.z1(bundle);
            }
        } else if (a5Var != null) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            ml2.m1[] m1VarArr2 = ml2.m1.f327711d;
            bundle2.putInt("PARAM_FINDER_LIVE_CAMERA_ACTION_OPEN_SOURCE", 1);
            a5Var.z1(bundle2);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorFlipCameraWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
