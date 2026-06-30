package rp1;

/* loaded from: classes14.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.view.FloatBallBlurView f398408d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.tencent.mm.plugin.ball.view.FloatBallBlurView floatBallBlurView) {
        super(1);
        this.f398408d = floatBallBlurView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        pm0.v.X(new rp1.g0(this.f398408d, (android.graphics.Bitmap) obj));
        return jz5.f0.f302826a;
    }
}
