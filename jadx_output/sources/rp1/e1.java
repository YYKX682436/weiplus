package rp1;

/* loaded from: classes14.dex */
public class e1 implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.view.FloatBallView f398386d;

    public e1(com.tencent.mm.plugin.ball.view.FloatBallView floatBallView) {
        this.f398386d = floatBallView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        float idleAlpha;
        com.tencent.mm.plugin.ball.view.FloatBallView floatBallView = this.f398386d;
        idleAlpha = floatBallView.getIdleAlpha();
        floatBallView.H0(((idleAlpha - 1.0f) * ((java.lang.Float) obj).floatValue()) + 1.0f);
        return null;
    }
}
