package dq2;

/* loaded from: classes15.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.vertical.FinderFixedRefreshLayout f242359d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f242360e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.tencent.mm.plugin.finder.nearby.newlivesquare.vertical.FinderFixedRefreshLayout finderFixedRefreshLayout, long j17) {
        super(0);
        this.f242359d = finderFixedRefreshLayout;
        this.f242360e = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("timePassed: ");
        int i17 = com.tencent.mm.plugin.finder.nearby.newlivesquare.vertical.FinderFixedRefreshLayout.K;
        com.tencent.mm.plugin.finder.nearby.newlivesquare.vertical.FinderFixedRefreshLayout finderFixedRefreshLayout = this.f242359d;
        sb6.append(finderFixedRefreshLayout.getScroller().timePassed());
        sb6.append(" animTime: ");
        sb6.append(this.f242360e);
        sb6.append(" duration: ");
        sb6.append(finderFixedRefreshLayout.getScroller().getDuration());
        return sb6.toString();
    }
}
