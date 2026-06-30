package rl2;

/* loaded from: classes3.dex */
public final class b extends be2.b {

    /* renamed from: e, reason: collision with root package name */
    public static final l75.e0 f397181e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f397182f;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f397183d;

    static {
        l75.e0 initAutoDBInfo = dm.k4.initAutoDBInfo(dm.k4.class);
        f397181e = initAutoDBInfo;
        f397182f = new java.lang.String[]{l75.n0.getCreateSQLs(initAutoDBInfo, "FinderLiveAigcGiftStatus")};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l75.k0 db6) {
        super(db6, f397181e, "FinderLiveAigcGiftStatus", dm.k4.f237990n);
        kotlin.jvm.internal.o.g(db6, "db");
        this.f397183d = db6;
    }

    public ce2.b y0(java.lang.String productId) {
        kotlin.jvm.internal.o.g(productId, "productId");
        p75.i0 i17 = dm.k4.f237988i.i();
        i17.f352657d = dm.k4.f237989m.j(productId);
        return (ce2.b) i17.a().o(this.f397183d, ce2.b.class);
    }
}
