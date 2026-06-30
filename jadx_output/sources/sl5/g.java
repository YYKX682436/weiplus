package sl5;

/* loaded from: classes10.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final sl5.d f409304a;

    /* renamed from: b, reason: collision with root package name */
    public final sl5.a f409305b;

    /* renamed from: c, reason: collision with root package name */
    public final tl5.s f409306c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f409307d;

    /* renamed from: e, reason: collision with root package name */
    public float f409308e;

    /* renamed from: f, reason: collision with root package name */
    public int f409309f;

    /* renamed from: g, reason: collision with root package name */
    public final sl5.c f409310g;

    public g(sl5.d host, sl5.a config, int i17, kotlin.jvm.internal.i iVar) {
        config = (i17 & 2) != 0 ? new sl5.a(0.0f, 0.0f, 0, 0, 0L, 31, null) : config;
        kotlin.jvm.internal.o.g(host, "host");
        kotlin.jvm.internal.o.g(config, "config");
        this.f409304a = host;
        this.f409305b = config;
        this.f409306c = new tl5.s(host, config);
        this.f409308e = 1.0f;
        cd5.a aVar = (cd5.a) host;
        sl5.c cVar = new sl5.c(aVar.c(), new sl5.f(this), config);
        this.f409310g = cVar;
        aVar.c().U0(cVar);
        aVar.c().P(cVar);
    }

    public final void a() {
        int i17 = 0;
        if (this.f409307d) {
            sl5.d dVar = this.f409304a;
            int i18 = ((cd5.a) dVar).e(true) == null ? 0 : 1;
            i17 = ((cd5.a) dVar).e(false) != null ? i18 | 2 : i18;
        }
        this.f409310g.f409292h = i17;
    }
}
