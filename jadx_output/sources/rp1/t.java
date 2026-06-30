package rp1;

/* loaded from: classes14.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.view.ContentFloatBallView f398524d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView) {
        super(0);
        this.f398524d = contentFloatBallView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        rp1.v0 idleHelper;
        idleHelper = this.f398524d.getIdleHelper();
        idleHelper.b();
        return jz5.f0.f302826a;
    }
}
