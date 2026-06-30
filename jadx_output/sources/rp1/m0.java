package rp1;

/* loaded from: classes14.dex */
public final class m0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.view.FloatBallBlurView f398476d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f398477e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(com.tencent.mm.plugin.ball.view.FloatBallBlurView floatBallBlurView, java.lang.String str) {
        super(0);
        this.f398476d = floatBallBlurView;
        this.f398477e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.ball.view.FloatBallBlurView floatBallBlurView = this.f398476d;
        java.lang.String str = this.f398477e;
        floatBallBlurView.e(com.tencent.mm.plugin.ball.view.FloatBallBlurView.a(floatBallBlurView, str), str, false);
        return jz5.f0.f302826a;
    }
}
