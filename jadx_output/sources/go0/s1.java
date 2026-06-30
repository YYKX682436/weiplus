package go0;

/* loaded from: classes14.dex */
public final class s1 {

    /* renamed from: a, reason: collision with root package name */
    public int f273841a;

    /* renamed from: b, reason: collision with root package name */
    public go0.c f273842b;

    /* renamed from: c, reason: collision with root package name */
    public os0.d f273843c;

    /* renamed from: d, reason: collision with root package name */
    public int f273844d;

    /* renamed from: e, reason: collision with root package name */
    public int f273845e;

    /* renamed from: f, reason: collision with root package name */
    public int f273846f;

    /* renamed from: g, reason: collision with root package name */
    public int f273847g;

    /* renamed from: h, reason: collision with root package name */
    public int f273848h;

    /* renamed from: i, reason: collision with root package name */
    public int f273849i;

    /* renamed from: j, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f273850j;

    /* renamed from: k, reason: collision with root package name */
    public long f273851k;

    public s1(java.lang.String userId, int i17) {
        kotlin.jvm.internal.o.g(userId, "userId");
        this.f273841a = 1;
        this.f273844d = 2;
        this.f273850j = new com.tencent.mm.sdk.platformtools.b4("LiveVisitorRendererCounter", (com.tencent.mm.sdk.platformtools.a4) new go0.r1(this), true);
    }

    public final void a() {
        com.tencent.mars.xlog.Log.i("LiveVisitorRenderer", "queue release");
        go0.c cVar = this.f273842b;
        if (cVar != null) {
            cVar.n();
        }
        this.f273842b = null;
        os0.d dVar = this.f273843c;
        if (dVar != null) {
            dVar.n();
        }
        this.f273843c = null;
        this.f273850j.d();
    }
}
