package rp1;

/* loaded from: classes14.dex */
public final class h {
    public h(kotlin.jvm.internal.i iVar) {
    }

    public final float a() {
        return ((java.lang.Number) ((jz5.n) com.tencent.mm.plugin.ball.view.ContentFloatBallView.U).getValue()).floatValue();
    }

    public final int b(int i17, int i18) {
        float f17 = com.tencent.mm.plugin.ball.view.ContentFloatBallView.f93416x0;
        if (f17 > 0.0f) {
            i18 = (int) (f17 * i17);
        }
        int i19 = i17 - qp1.c0.f365701j;
        int i27 = qp1.c0.f365702k;
        return java.lang.Math.max(java.lang.Math.min(i18, i19 - i27), i27);
    }
}
