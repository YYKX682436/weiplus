package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class v7 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.w7 f120048d;

    public v7(com.tencent.mm.plugin.finder.live.widget.w7 w7Var) {
        this.f120048d = w7Var;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.live.widget.w7 w7Var = this.f120048d;
        java.util.ArrayList arrayList = w7Var.f120156m;
        if (arrayList == null) {
            kotlin.jvm.internal.o.o("dataList");
            throw null;
        }
        vm2.b0 b0Var = (vm2.b0) kz5.n0.a0(arrayList, i17);
        if (b0Var == null) {
            return;
        }
        int i18 = b0Var.f438082d;
        com.tencent.mars.xlog.Log.i("FinderLiveAnchorOptionWidget", "dispatchItemClick: " + i18);
        com.tencent.mm.plugin.finder.live.widget.x7 x7Var = w7Var.f120154h;
        if (i18 == 1) {
            df2.q1 q1Var = (df2.q1) x7Var;
            q1Var.getClass();
            com.tencent.mars.xlog.Log.i("FinderLiveAnchorOptionController", "onBeautyClick");
            ml2.h1[] h1VarArr = ml2.h1.f327520d;
            q1Var.a7(4);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("PARAM_FINDER_LIVE_CAMERA_OPT_SCENE", 1);
            com.tencent.mm.plugin.finder.live.viewmodel.r5 r5Var = (com.tencent.mm.plugin.finder.live.viewmodel.r5) q1Var.controller(com.tencent.mm.plugin.finder.live.viewmodel.r5.class);
            if (r5Var != null) {
                r5Var.d7(bundle);
            }
        } else if (i18 == 2) {
            df2.q1 q1Var2 = (df2.q1) x7Var;
            q1Var2.getClass();
            com.tencent.mars.xlog.Log.i("FinderLiveAnchorOptionController", "onFlipCameraClick");
            com.tencent.mm.plugin.finder.live.viewmodel.r5 r5Var2 = (com.tencent.mm.plugin.finder.live.viewmodel.r5) q1Var2.controller(com.tencent.mm.plugin.finder.live.viewmodel.r5.class);
            if (r5Var2 != null) {
                ml2.m1[] m1VarArr = ml2.m1.f327711d;
                r5Var2.e7(2);
            }
        } else if (i18 == 3) {
            ((df2.q1) x7Var).Z6(df2.kx.f230607d);
        } else {
            if (i18 != 4) {
                return;
            }
            ((df2.q1) x7Var).Z6(df2.kx.f230608e);
        }
        w7Var.a();
    }
}
