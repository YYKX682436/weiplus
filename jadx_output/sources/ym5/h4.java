package ym5;

/* loaded from: classes10.dex */
public final class h4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.RefreshLoadMoreLayout f463373d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f463374e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout, int i17) {
        super(0);
        this.f463373d = refreshLoadMoreLayout;
        this.f463374e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("MicroMsg.RLMoreLayout", "[onFinishLoadMore]");
        this.f463373d.setLoadingMore(false);
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f463373d;
        com.tencent.mm.view.RefreshLoadMoreLayout.r(refreshLoadMoreLayout, false, null, new ym5.g4(refreshLoadMoreLayout, this.f463374e), 3, null);
        return jz5.f0.f302826a;
    }
}
