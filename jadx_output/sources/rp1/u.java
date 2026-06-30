package rp1;

/* loaded from: classes13.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f398527d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.view.ContentFloatBallView f398528e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f398529f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(boolean z17, com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView, yz5.a aVar) {
        super(0);
        this.f398527d = z17;
        this.f398528e = contentFloatBallView;
        this.f398529f = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.ball.view.ContentFloatBallCollapseView collapseView;
        if (this.f398527d) {
            collapseView = this.f398528e.getCollapseView();
            collapseView.setVisibility(8);
        }
        yz5.a aVar = this.f398529f;
        if (aVar != null) {
            aVar.invoke();
        }
        return jz5.f0.f302826a;
    }
}
