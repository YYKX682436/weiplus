package k14;

/* loaded from: classes11.dex */
public class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f303402a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f303403b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f303404c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.CountDownLatch f303405d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f303406e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f303407f = new java.lang.Object();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashSet f303408g = new java.util.HashSet();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashSet f303409h = new java.util.HashSet();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashSet f303410i = new java.util.HashSet();

    /* renamed from: j, reason: collision with root package name */
    public final java.util.HashSet f303411j = new java.util.HashSet();

    /* renamed from: k, reason: collision with root package name */
    public k14.w0 f303412k;

    /* renamed from: l, reason: collision with root package name */
    public final com.tencent.mm.plugin.setting.ui.setting.hq f303413l;

    /* renamed from: m, reason: collision with root package name */
    public long f303414m;

    /* renamed from: n, reason: collision with root package name */
    public wu5.b f303415n;

    public x0(boolean z17, boolean z18, boolean z19, com.tencent.mm.plugin.setting.ui.setting.hq hqVar) {
        this.f303402a = z17;
        this.f303403b = z18;
        this.f303404c = z19;
        int i17 = (z18 ? 1 : 0) + (z17 ? 1 : 0) + (z19 ? 1 : 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.UnfamiliarContactEngine", "[UnfamiliarContactEngine] count:%s [%s:%s:%s]", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z19));
        this.f303405d = new java.util.concurrent.CountDownLatch(i17);
        this.f303406e = new com.tencent.mm.sdk.platformtools.n3("UnfamiliarContactEngine");
        this.f303413l = hqVar;
    }

    public final void a(java.util.LinkedList linkedList, int i17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int i18 = i17 + 10;
        if (i18 >= linkedList.size()) {
            i18 = linkedList.size();
        }
        int i19 = i18;
        java.util.List subList = linkedList.subList(i17, i19);
        p13.u uVar = new p13.u();
        uVar.f351140b = 8;
        uVar.f351141c = com.tencent.mm.sdk.platformtools.t8.c1(subList, ",");
        uVar.f351151m = new k14.t0(this, i19, subList, linkedList, currentTimeMillis);
        uVar.f351152n = this.f303406e;
        ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(2, uVar);
    }
}
