package rp1;

/* loaded from: classes14.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.view.ContentFloatBallView f398505d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView) {
        super(0);
        this.f398505d = contentFloatBallView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        pp1.z recyclerViewHelper;
        com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView = this.f398505d;
        com.tencent.mm.plugin.ball.view.ContentFloatBallView.S(contentFloatBallView, 0, false, 2, null);
        recyclerViewHelper = contentFloatBallView.getRecyclerViewHelper();
        recyclerViewHelper.k();
        return jz5.f0.f302826a;
    }
}
