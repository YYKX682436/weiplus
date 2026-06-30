package u64;

/* loaded from: classes4.dex */
public final class i extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f424998d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f424999e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f425000f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f425001g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f425002h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f425003i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object f425004m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Object f425005n;

    /* renamed from: o, reason: collision with root package name */
    public int f425006o;

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f425007p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ u64.j f425008q;

    /* renamed from: r, reason: collision with root package name */
    public int f425009r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(u64.j jVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f425008q = jVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2$emit$1");
        this.f425007p = obj;
        this.f425009r |= Integer.MIN_VALUE;
        java.lang.Object a17 = this.f425008q.a(null, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2$emit$1");
        return a17;
    }
}
