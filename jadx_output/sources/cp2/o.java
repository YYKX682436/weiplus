package cp2;

/* loaded from: classes2.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader f220856d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f220857e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f220858f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f220859g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f220860h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f220861i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f220862m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.l f220863n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.IResponse f220864o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader nearbyLiveFeedLoader, java.util.LinkedList linkedList, kotlin.jvm.internal.f0 f0Var, kotlin.jvm.internal.f0 f0Var2, kotlin.jvm.internal.f0 f0Var3, kotlin.jvm.internal.f0 f0Var4, ym5.s3 s3Var, yz5.l lVar, com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse) {
        super(0);
        this.f220856d = nearbyLiveFeedLoader;
        this.f220857e = linkedList;
        this.f220858f = f0Var;
        this.f220859g = f0Var2;
        this.f220860h = f0Var3;
        this.f220861i = f0Var4;
        this.f220862m = s3Var;
        this.f220863n = lVar;
        this.f220864o = iResponse;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader nearbyLiveFeedLoader = this.f220856d;
        nearbyLiveFeedLoader.getDataList().clear();
        nearbyLiveFeedLoader.getDataList().addAll(this.f220857e);
        kotlin.jvm.internal.f0 f0Var = this.f220858f;
        if (f0Var.f310116d >= 0) {
            kotlin.jvm.internal.f0 f0Var2 = this.f220859g;
            if (f0Var2.f310116d > 0) {
                nearbyLiveFeedLoader.getDispatcher().e(f0Var.f310116d, f0Var2.f310116d);
            }
        }
        kotlin.jvm.internal.f0 f0Var3 = this.f220860h;
        int i17 = f0Var3.f310116d;
        kotlin.jvm.internal.f0 f0Var4 = this.f220861i;
        if (i17 >= 0 && f0Var4.f310116d > 0) {
            nearbyLiveFeedLoader.getDispatcher().d(f0Var3.f310116d, f0Var4.f310116d);
        }
        int i18 = f0Var4.f310116d;
        ym5.s3 s3Var = this.f220862m;
        s3Var.f463523h = i18;
        com.tencent.mm.plugin.finder.feed.model.internal.j0.f(nearbyLiveFeedLoader.getDispatcher(), s3Var, false, 2, null);
        yz5.l lVar = this.f220863n;
        if (lVar != null) {
            lVar.invoke(this.f220864o);
        }
        nearbyLiveFeedLoader.f121478v = false;
        return jz5.f0.f302826a;
    }
}
