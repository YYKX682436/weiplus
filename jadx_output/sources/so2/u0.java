package so2;

/* loaded from: classes2.dex */
public final class u0 {

    /* renamed from: l, reason: collision with root package name */
    public static final so2.s0 f410617l = new so2.q0();

    /* renamed from: m, reason: collision with root package name */
    public static final so2.s0 f410618m = new so2.p0();

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f410619a;

    /* renamed from: b, reason: collision with root package name */
    public final so2.r0 f410620b;

    /* renamed from: c, reason: collision with root package name */
    public int f410621c;

    /* renamed from: d, reason: collision with root package name */
    public int f410622d;

    /* renamed from: e, reason: collision with root package name */
    public int f410623e;

    /* renamed from: f, reason: collision with root package name */
    public long f410624f;

    /* renamed from: g, reason: collision with root package name */
    public int f410625g;

    /* renamed from: h, reason: collision with root package name */
    public androidx.recyclerview.widget.w2 f410626h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.p f410627i;

    /* renamed from: j, reason: collision with root package name */
    public yz5.l f410628j;

    /* renamed from: k, reason: collision with root package name */
    public yz5.l f410629k;

    public u0(java.lang.String tag, so2.r0 config) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(config, "config");
        this.f410619a = tag;
        this.f410620b = config;
        this.f410625g = -1;
    }

    public final void a(androidx.recyclerview.widget.RecyclerView recyclerView, boolean z17, so2.s0 s0Var) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        com.tencent.mars.xlog.Log.i("FinderFastScrollHelper", "attachRecyclerView " + z17 + ' ' + recyclerView + ' ' + s0Var + ' ' + this.f410620b);
        androidx.recyclerview.widget.w2 w2Var = this.f410626h;
        if (w2Var == null) {
            w2Var = new so2.t0(this, s0Var);
        }
        this.f410626h = w2Var;
        com.tencent.mars.xlog.Log.i("FinderFastScrollHelper", "attachRecyclerView " + z17 + ' ' + recyclerView + ' ' + this.f410626h);
        recyclerView.V0(w2Var);
        recyclerView.i(w2Var);
        if (z17) {
            this.f410621c = 0;
            this.f410622d = 0;
            this.f410623e = 0;
            this.f410624f = 0L;
        }
    }

    public final void b(java.lang.String str) {
        boolean z17;
        boolean z18 = false;
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            z17 = false;
        }
        if (z17 || z65.c.a()) {
            z18 = true;
        } else {
            kb2.b bVar = kb2.b.f306225a;
        }
        if (z18) {
            com.tencent.mars.xlog.Log.i("FinderFastScrollHelper_" + this.f410619a, str);
        }
    }
}
