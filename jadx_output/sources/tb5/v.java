package tb5;

/* loaded from: classes12.dex */
public final class v {

    /* renamed from: r, reason: collision with root package name */
    public static final tb5.c f417082r = new tb5.c(null);

    /* renamed from: s, reason: collision with root package name */
    public static final jz5.g f417083s = jz5.h.b(tb5.b.f417031d);

    /* renamed from: a, reason: collision with root package name */
    public boolean f417084a;

    /* renamed from: d, reason: collision with root package name */
    public long f417087d;

    /* renamed from: e, reason: collision with root package name */
    public long f417088e;

    /* renamed from: f, reason: collision with root package name */
    public wu5.c f417089f;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f417098o;

    /* renamed from: p, reason: collision with root package name */
    public final tb5.f f417099p;

    /* renamed from: q, reason: collision with root package name */
    public long f417100q;

    /* renamed from: b, reason: collision with root package name */
    public final tb5.j0 f417085b = new tb5.k(this);

    /* renamed from: c, reason: collision with root package name */
    public final tb5.j0 f417086c = new tb5.l(this);

    /* renamed from: g, reason: collision with root package name */
    public final tb5.d f417090g = new tb5.d(0.0f, 0.0f, 0.0f, 0, 15, null);

    /* renamed from: h, reason: collision with root package name */
    public final tb5.d f417091h = new tb5.d(0.0f, 0.0f, 0.0f, 0, 15, null);

    /* renamed from: i, reason: collision with root package name */
    public final tb5.j f417092i = new tb5.j(new java.util.ArrayList(), new java.util.ArrayList(), new java.util.ArrayList());

    /* renamed from: j, reason: collision with root package name */
    public final java.util.HashMap f417093j = new java.util.HashMap();

    /* renamed from: k, reason: collision with root package name */
    public final java.util.HashMap f417094k = new java.util.HashMap();

    /* renamed from: l, reason: collision with root package name */
    public final java.util.HashMap f417095l = new java.util.HashMap();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashMap f417096m = new java.util.HashMap();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f417097n = new java.util.ArrayList();

    public v() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(gm0.m.i());
        sb6.append('_');
        sb6.append(c06.e.f37716d.d(Integer.MAX_VALUE));
        this.f417098o = sb6.toString();
        this.f417099p = new tb5.f(new java.util.LinkedHashMap());
    }

    public static final void a(tb5.v vVar, jx3.a aVar) {
        vVar.getClass();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(aVar.g());
        java.lang.String n17 = aVar.n();
        kotlin.jvm.internal.o.f(n17, "toShowString(...)");
        com.tencent.mars.xlog.Log.i("ChattingFpsCollector", "report%s %s", valueOf, r26.i0.t(n17, com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE, " ", false));
    }
}
