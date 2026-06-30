package fo0;

/* loaded from: classes3.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f264815d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(boolean z17) {
        super(0);
        this.f264815d = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        gp1.v Bi = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi();
        fo0.c.f264798a.getClass();
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = ((com.tencent.mm.plugin.ball.service.d) fo0.c.f264799b.f264807a).f93132d;
        com.tencent.mm.plugin.ball.model.BallInfo.BallButtonInfo ballButtonInfo = ballInfo.f93054o;
        boolean z17 = !this.f264815d;
        ballButtonInfo.f93070e = z17;
        ballButtonInfo.f93073h = z17;
        Bi.b(ballInfo);
        return jz5.f0.f302826a;
    }
}
