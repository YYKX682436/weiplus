package vd2;

/* loaded from: classes3.dex */
public final class a2 {

    /* renamed from: l, reason: collision with root package name */
    public static r45.o72 f435641l;

    /* renamed from: a, reason: collision with root package name */
    public vd2.t1 f435643a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.model.internal.w0 f435644b;

    /* renamed from: c, reason: collision with root package name */
    public int f435645c;

    /* renamed from: d, reason: collision with root package name */
    public int f435646d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f435647e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.model.FinderLiveRelatedBaseLoader f435648f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.FinderLiveRelatedLoader f435649g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.FinderLiveRelatedLoader f435650h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f435638i = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3861r2).getValue()).r()).intValue();

    /* renamed from: j, reason: collision with root package name */
    public static long f435639j = -1;

    /* renamed from: k, reason: collision with root package name */
    public static long f435640k = -1;

    /* renamed from: m, reason: collision with root package name */
    public static java.lang.Long f435642m = 0L;

    public a2(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f435644b = new com.tencent.mm.plugin.finder.feed.model.internal.w0(0L, 1, null);
        this.f435645c = 2;
        com.tencent.mm.plugin.finder.live.FinderLiveRelatedLoader finderLiveRelatedLoader = new com.tencent.mm.plugin.finder.live.FinderLiveRelatedLoader();
        finderLiveRelatedLoader.f111480p = context;
        finderLiveRelatedLoader.f111726d = new vd2.v1(this, finderLiveRelatedLoader);
        this.f435649g = finderLiveRelatedLoader;
        com.tencent.mm.plugin.finder.live.FinderLiveRelatedLoader finderLiveRelatedLoader2 = new com.tencent.mm.plugin.finder.live.FinderLiveRelatedLoader();
        finderLiveRelatedLoader2.f111480p = context;
        finderLiveRelatedLoader2.f111726d = new vd2.z1(this, finderLiveRelatedLoader2);
        this.f435650h = finderLiveRelatedLoader2;
    }

    public static final void a(vd2.a2 a2Var, com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse, com.tencent.mm.plugin.finder.live.model.FinderLiveRelatedBaseLoader finderLiveRelatedBaseLoader) {
        boolean z17 = (kotlin.jvm.internal.o.b(finderLiveRelatedBaseLoader, a2Var.f435649g) || kotlin.jvm.internal.o.b(finderLiveRelatedBaseLoader, a2Var.f435650h)) ? false : true;
        if (finderLiveRelatedBaseLoader != null && finderLiveRelatedBaseLoader.f111731i) {
            finderLiveRelatedBaseLoader.f111731i = false;
            ik1.h0.b(new vd2.w1(finderLiveRelatedBaseLoader, iResponse, z17, a2Var));
        } else {
            com.tencent.mars.xlog.Log.i("FinderLiveDataLoader", "loader loading is not true, isCustomLoader:" + z17);
        }
    }

    public com.tencent.mm.plugin.finder.live.model.FinderLiveRelatedBaseLoader b() {
        if (this.f435646d == 1) {
            return this.f435650h;
        }
        com.tencent.mm.plugin.finder.live.model.FinderLiveRelatedBaseLoader finderLiveRelatedBaseLoader = this.f435648f;
        if (finderLiveRelatedBaseLoader == null || this.f435647e) {
            return this.f435649g;
        }
        kotlin.jvm.internal.o.d(finderLiveRelatedBaseLoader);
        return finderLiveRelatedBaseLoader;
    }

    public final boolean c() {
        com.tencent.mm.plugin.finder.live.model.FinderLiveRelatedBaseLoader finderLiveRelatedBaseLoader;
        com.tencent.mm.plugin.finder.live.model.FinderLiveRelatedBaseLoader b17 = b();
        if (kotlin.jvm.internal.o.b(b17, this.f435648f) && (finderLiveRelatedBaseLoader = this.f435648f) != null && !this.f435647e) {
            kotlin.jvm.internal.o.d(finderLiveRelatedBaseLoader);
            if (!finderLiveRelatedBaseLoader.f111729g) {
                com.tencent.mm.plugin.finder.live.model.FinderLiveRelatedBaseLoader finderLiveRelatedBaseLoader2 = this.f435648f;
                boolean z17 = false;
                if (finderLiveRelatedBaseLoader2 != null && finderLiveRelatedBaseLoader2.c()) {
                    z17 = true;
                }
                if (z17) {
                    return this.f435649g.f111729g;
                }
            }
        }
        return b17.f111729g;
    }

    public final boolean d() {
        com.tencent.mm.plugin.finder.live.model.FinderLiveRelatedBaseLoader finderLiveRelatedBaseLoader = this.f435648f;
        if (finderLiveRelatedBaseLoader == null) {
            return false;
        }
        kotlin.jvm.internal.o.d(finderLiveRelatedBaseLoader);
        if (finderLiveRelatedBaseLoader.f111729g) {
            return false;
        }
        com.tencent.mm.plugin.finder.live.model.FinderLiveRelatedBaseLoader finderLiveRelatedBaseLoader2 = this.f435648f;
        if (!(finderLiveRelatedBaseLoader2 != null && finderLiveRelatedBaseLoader2.c())) {
            return false;
        }
        com.tencent.mm.plugin.finder.live.model.FinderLiveRelatedBaseLoader finderLiveRelatedBaseLoader3 = this.f435648f;
        java.lang.String b17 = finderLiveRelatedBaseLoader3 != null ? finderLiveRelatedBaseLoader3.b() : null;
        return !(b17 == null || b17.length() == 0);
    }
}
