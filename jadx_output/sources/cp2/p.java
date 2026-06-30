package cp2;

/* loaded from: classes2.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader f220867d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f220868e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f220869f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f220870g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.IResponse f220871h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f220872i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f220873m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f220874n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f220875o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f220876p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader nearbyLiveFeedLoader, kotlin.jvm.internal.h0 h0Var, long j17, java.util.LinkedList linkedList, com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse, kotlin.jvm.internal.f0 f0Var, kotlin.jvm.internal.f0 f0Var2, kotlin.jvm.internal.f0 f0Var3, kotlin.jvm.internal.f0 f0Var4, ym5.s3 s3Var) {
        super(0);
        this.f220867d = nearbyLiveFeedLoader;
        this.f220868e = h0Var;
        this.f220869f = j17;
        this.f220870g = linkedList;
        this.f220871h = iResponse;
        this.f220872i = f0Var;
        this.f220873m = f0Var2;
        this.f220874n = f0Var3;
        this.f220875o = f0Var4;
        this.f220876p = s3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader nearbyLiveFeedLoader = this.f220867d;
        nearbyLiveFeedLoader.getDataList().clear();
        java.util.AbstractCollection dataList = nearbyLiveFeedLoader.getDataList();
        kotlin.jvm.internal.h0 h0Var = this.f220868e;
        dataList.addAll((java.util.Collection) h0Var.f310123d);
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.f220869f;
        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
        java.lang.String p17 = hc2.o0.p((java.util.List) h0Var.f310123d);
        java.lang.String p18 = hc2.o0.p(this.f220870g);
        long elapsedRealtime3 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime2;
        java.lang.String b17 = nearbyLiveFeedLoader.getB();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mergeRefresh() mergeTime:");
        sb6.append(elapsedRealtime);
        sb6.append(" collectInfoTime:");
        sb6.append(elapsedRealtime3);
        sb6.append(" hasMore:");
        sb6.append(this.f220871h.getHasMore());
        sb6.append(" removeIndex:");
        kotlin.jvm.internal.f0 f0Var = this.f220872i;
        sb6.append(f0Var.f310116d);
        sb6.append("  removeSize:");
        kotlin.jvm.internal.f0 f0Var2 = this.f220873m;
        sb6.append(f0Var2.f310116d);
        sb6.append(" insertIndex:");
        kotlin.jvm.internal.f0 f0Var3 = this.f220874n;
        sb6.append(f0Var3.f310116d);
        sb6.append("  insertSize:");
        kotlin.jvm.internal.f0 f0Var4 = this.f220875o;
        sb6.append(f0Var4.f310116d);
        sb6.append(" newList:");
        sb6.append(p17);
        sb6.append(" oldList:");
        sb6.append(p18);
        com.tencent.mars.xlog.Log.i(b17, sb6.toString());
        if (f0Var.f310116d >= 0 && f0Var2.f310116d > 0) {
            nearbyLiveFeedLoader.getDispatcher().e(f0Var.f310116d, f0Var2.f310116d);
        }
        if (f0Var3.f310116d >= 0 && f0Var4.f310116d > 0) {
            nearbyLiveFeedLoader.getDispatcher().d(f0Var3.f310116d, f0Var4.f310116d);
        }
        int i17 = f0Var4.f310116d;
        ym5.s3 s3Var = this.f220876p;
        s3Var.f463523h = i17;
        nearbyLiveFeedLoader.getDispatcher().g(s3Var);
        return jz5.f0.f302826a;
    }
}
