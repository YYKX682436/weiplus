package ym5;

/* loaded from: classes10.dex */
public final class j4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f463407d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.RefreshLoadMoreLayout f463408e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(ym5.s3 s3Var, com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout) {
        super(0);
        this.f463407d = s3Var;
        this.f463408e = refreshLoadMoreLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onFinishLoadMore2] reason=");
        ym5.s3 s3Var = this.f463407d;
        sb6.append(s3Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.RLMoreLayout", sb6.toString());
        this.f463408e.setLoadingMore(false);
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f463408e;
        com.tencent.mm.view.RefreshLoadMoreLayout.r(refreshLoadMoreLayout, false, null, new ym5.i4(refreshLoadMoreLayout, s3Var), 3, null);
        return jz5.f0.f302826a;
    }
}
