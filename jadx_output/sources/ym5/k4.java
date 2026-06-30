package ym5;

/* loaded from: classes10.dex */
public final class k4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.RefreshLoadMoreLayout f463419d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f463420e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout, int i17) {
        super(0);
        this.f463419d = refreshLoadMoreLayout;
        this.f463420e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("MicroMsg.RLMoreLayout", "[onFinishRefresh]");
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f463419d;
        refreshLoadMoreLayout.setRefreshing(false);
        refreshLoadMoreLayout.s(new com.tencent.mm.view.d(refreshLoadMoreLayout, this.f463420e));
        return jz5.f0.f302826a;
    }
}
