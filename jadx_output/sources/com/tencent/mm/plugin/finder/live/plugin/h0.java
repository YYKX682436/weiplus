package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.q0 f112745d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.tencent.mm.plugin.finder.live.plugin.q0 q0Var) {
        super(2);
        this.f112745d = q0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int i17;
        int i18;
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        com.tencent.mm.plugin.finder.live.plugin.q0 q0Var = this.f112745d;
        ((mm2.w) q0Var.P0(mm2.w.class)).f329505q = intValue;
        ((mm2.w) q0Var.P0(mm2.w.class)).f329506r = intValue2;
        zl2.r4 r4Var = zl2.r4.f473950a;
        android.content.Context context = q0Var.f113940p.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        int i19 = ((mm2.c1) q0Var.P0(mm2.c1.class)).f328879s2;
        int i27 = ((mm2.c1) q0Var.P0(mm2.c1.class)).f328885t2;
        int i28 = com.tencent.mm.ui.bl.b(context).x;
        int i29 = com.tencent.mm.ui.bl.b(context).y;
        android.graphics.Rect rect = new android.graphics.Rect(0, 0, i28, i29);
        if (intValue2 <= 0 || intValue <= 0) {
            com.tencent.mars.xlog.Log.e("FinderLiveUtil", "getTargetLiveViewRect video size = 0");
        } else {
            int i37 = context.getResources().getConfiguration().orientation;
            boolean Z1 = r4Var.Z1(intValue, intValue2);
            if (Z1 && 1 == i37) {
                i17 = (int) (i28 * ((intValue2 * 1.0f) / intValue));
                if (i17 <= i29 * 0.68799996f) {
                    i18 = r4Var.B0(i19, i27);
                    rect.left = 0;
                    rect.top = i18;
                    rect.right = i28;
                    rect.bottom = i17 + i18;
                    com.tencent.mars.xlog.Log.i("FinderLiveUtil", "getTargetLiveViewRect fitLandscapeVideo:" + Z1 + ",curOrientation:" + i37 + " screenSize:" + i28 + " x " + i29 + " targetRect:" + rect);
                }
            }
            i17 = i29;
            i18 = 0;
            rect.left = 0;
            rect.top = i18;
            rect.right = i28;
            rect.bottom = i17 + i18;
            com.tencent.mars.xlog.Log.i("FinderLiveUtil", "getTargetLiveViewRect fitLandscapeVideo:" + Z1 + ",curOrientation:" + i37 + " screenSize:" + i28 + " x " + i29 + " targetRect:" + rect);
        }
        if (r4Var.Z1(intValue, intValue2)) {
            mm2.h v17 = q0Var.v1();
            if (v17 != null) {
                v17.setScaleType(1);
            }
        } else {
            mm2.h v18 = q0Var.v1();
            if (v18 != null) {
                v18.setScaleType(0);
            }
        }
        com.tencent.mars.xlog.Log.i("FinderLiveAdVideoPlugin", "onVideoSizeChange [" + intValue + " x " + intValue2 + "] targetRect:" + rect);
        android.widget.FrameLayout frameLayout = q0Var.f113942r;
        android.view.ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
        layoutParams2.width = rect.width();
        layoutParams2.height = rect.height();
        layoutParams2.topMargin = rect.top;
        frameLayout.requestLayout();
        return jz5.f0.f302826a;
    }
}
