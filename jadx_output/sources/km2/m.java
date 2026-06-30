package km2;

/* loaded from: classes3.dex */
public final class m implements so2.j5 {

    /* renamed from: u, reason: collision with root package name */
    public static final km2.l f309128u = new km2.l(null);

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.live.api.LiveConfig f309129d;

    /* renamed from: e, reason: collision with root package name */
    public gk2.e f309130e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore f309131f;

    /* renamed from: g, reason: collision with root package name */
    public r45.h32 f309132g;

    /* renamed from: h, reason: collision with root package name */
    public r45.jc1 f309133h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f309134i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f309135m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f309136n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.Boolean f309137o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f309138p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f309139q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.autogen.events.FeedUpdateEvent f309140r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f309141s;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.protocal.protobuf.FinderObject f309142t;

    public m(com.tencent.mm.live.api.LiveConfig liveConfig) {
        kotlin.jvm.internal.o.g(liveConfig, "liveConfig");
        gk2.e eVar = new gk2.e("from LiveData");
        this.f309130e = eVar;
        this.f309131f = new com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore(eVar);
        this.f309129d = liveConfig;
        this.f309142t = f309128u.b(this);
    }

    public final com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore a() {
        return this.f309131f;
    }

    public final java.lang.String b() {
        return hashCode() + "_config(haveExposed:" + this.f309134i + "): " + this.f309129d.b() + " LiveBuContext: " + ((mm2.c1) this.f309130e.a(mm2.c1.class)).J7();
    }

    public final java.lang.String c() {
        return "nickName:" + this.f309129d.M + ",havePlay:" + this.f309134i + ",liveId:" + this.f309129d.f68537e + ",objectId:" + this.f309129d.f68549s + "!\n";
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        if (!(obj instanceof km2.m)) {
            return -1;
        }
        com.tencent.mm.live.api.LiveConfig liveConfig = ((km2.m) obj).f309129d;
        long j17 = liveConfig.f68537e;
        com.tencent.mm.live.api.LiveConfig liveConfig2 = this.f309129d;
        if (j17 != liveConfig2.f68537e && liveConfig.f68549s != liveConfig2.f68549s) {
            return -1;
        }
        if (!zl2.q4.f473933a.E()) {
            return 0;
        }
        com.tencent.mars.xlog.Log.i("Finder.Loader", "compare feed obj:" + obj + " is same with this:" + this);
        return 0;
    }

    @Override // in5.c
    public long getItemId() {
        return this.f309129d.f68549s;
    }

    @Override // in5.c
    public int h() {
        return 9;
    }

    public java.lang.String toString() {
        try {
            return b();
        } catch (java.lang.Exception e17) {
            return e17.toString();
        }
    }

    public m(com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        kotlin.jvm.internal.o.g(finderObject, "finderObject");
        gk2.e eVar = new gk2.e("from LiveData");
        this.f309130e = eVar;
        this.f309131f = new com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore(eVar);
        this.f309142t = finderObject;
        this.f309129d = zl2.l.c(zl2.l.f473865a, finderObject, 0, false, 6, null);
    }
}
