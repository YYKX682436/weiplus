package com.tencent.mm.plugin.luckymoney.scaledLayout;

/* loaded from: classes9.dex */
public class ScaleLayoutManager extends com.tencent.mm.plugin.luckymoney.scaledLayout.ViewPagerLayoutManager {
    public final int P;
    public float Q;
    public final float R;
    public final float S;
    public final float T;

    public ScaleLayoutManager(android.content.Context context, int i17) {
        super(context, 0, false);
        assertNotInLayoutOrScroll(null);
        if (this.M != Integer.MAX_VALUE) {
            this.M = Integer.MAX_VALUE;
            removeAllViews();
        }
        assertNotInLayoutOrScroll(null);
        if (this.L != -1) {
            this.L = -1;
            removeAllViews();
        }
        this.P = i17;
        this.Q = 0.8f;
        this.R = 1.0f;
        this.S = 1.0f;
        this.T = 1.0f;
    }

    @Override // com.tencent.mm.plugin.luckymoney.scaledLayout.ViewPagerLayoutManager
    public float Z() {
        float f17 = this.R;
        if (f17 == 0.0f) {
            return Float.MAX_VALUE;
        }
        return 1.0f / f17;
    }

    @Override // com.tencent.mm.plugin.luckymoney.scaledLayout.ViewPagerLayoutManager
    public float d0() {
        return this.P + this.f145741w;
    }

    @Override // com.tencent.mm.plugin.luckymoney.scaledLayout.ViewPagerLayoutManager
    public void e0(android.view.View view, float f17) {
        int i17 = this.f145744z;
        float abs = java.lang.Math.abs((i17 + f17) - i17);
        float f18 = this.f145741w;
        if (abs - f18 > 0.0f) {
            abs = f18;
        }
        float f19 = 1.0f - ((abs / f18) * (1.0f - this.Q));
        view.setScaleX(f19);
        view.setScaleY(f19);
        float abs2 = java.lang.Math.abs(f17);
        float f27 = this.T;
        float f28 = this.S;
        float f29 = this.I;
        float f37 = (((f27 - f28) / f29) * abs2) + f28;
        if (abs2 < f29) {
            f27 = f37;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(f27));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/scaledLayout/ScaleLayoutManager", "setItemViewProperty", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/scaledLayout/ScaleLayoutManager", "setItemViewProperty", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
