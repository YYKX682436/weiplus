package rp1;

/* loaded from: classes14.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.view.ContentFloatBallView f398467d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f398468e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView, int i17) {
        super(1);
        this.f398467d = contentFloatBallView;
        this.f398468e = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        float intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView = this.f398467d;
        int floatBallHeight = (int) (intValue - ((contentFloatBallView.getFloatBallHeight() - this.f398468e) / 2.0f));
        rp1.h hVar = com.tencent.mm.plugin.ball.view.ContentFloatBallView.T;
        android.graphics.Point point = contentFloatBallView.B;
        kotlin.jvm.internal.o.d(point);
        int i17 = point.y - qp1.c0.f365701j;
        int i18 = qp1.c0.f365702k;
        return java.lang.Boolean.valueOf(floatBallHeight == java.lang.Math.max(java.lang.Math.min(floatBallHeight, i17 - i18), i18));
    }
}
