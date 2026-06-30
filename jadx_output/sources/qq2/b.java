package qq2;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader f365930a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.dd2 f365931b;

    /* renamed from: c, reason: collision with root package name */
    public final int f365932c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f365933d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f365934e;

    /* renamed from: f, reason: collision with root package name */
    public final int f365935f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f365936g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f365937h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f365938i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f365939j;

    /* renamed from: k, reason: collision with root package name */
    public long f365940k;

    public b(androidx.recyclerview.widget.RecyclerView recyclerView, com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader feedLoader, r45.dd2 dd2Var, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(feedLoader, "feedLoader");
        this.f365930a = feedLoader;
        this.f365931b = dd2Var;
        this.f365932c = i17;
        this.f365933d = "FeedStreamPreload";
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        this.f365934e = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.N4).getValue()).r()).intValue() == 1;
        this.f365935f = ((java.lang.Number) t70Var.V0().r()).intValue();
        this.f365938i = true;
        recyclerView.i(new qq2.a(this));
    }

    public final void a(boolean z17) {
        com.tencent.mars.xlog.Log.i(this.f365933d, "finishPreload hasMore:" + z17 + " preloadTime:" + (java.lang.System.currentTimeMillis() - this.f365940k));
        this.f365937h = false;
        this.f365938i = z17;
    }
}
