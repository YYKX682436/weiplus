package zf4;

/* loaded from: classes13.dex */
public class a0 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: q, reason: collision with root package name */
    public static int f472635q;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Queue f472636d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Queue f472637e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f472638f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public boolean f472639g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f472640h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f472641i = false;

    /* renamed from: m, reason: collision with root package name */
    public int f472642m = 0;

    /* renamed from: n, reason: collision with root package name */
    public long f472643n = 0;

    /* renamed from: o, reason: collision with root package name */
    public final fp.j f472644o = new fp.j();

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f472645p = new com.tencent.mm.sdk.platformtools.b4(gm0.j1.e().a(), (com.tencent.mm.sdk.platformtools.a4) new zf4.z(this), false);

    public a0() {
        c01.d9.e().a(329, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0235  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(zf4.a0 r23) {
        /*
            Method dump skipped, instructions count: 641
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zf4.a0.a(zf4.a0):void");
    }

    public final void b() {
        ((java.util.HashMap) this.f472638f).clear();
        ((java.util.LinkedList) this.f472636d).clear();
        ((java.util.LinkedList) this.f472637e).clear();
        this.f472640h = false;
        this.f472639g = false;
        this.f472641i = false;
        this.f472644o.a();
    }

    public void c() {
        gm0.j1.e().j(new zf4.y(this));
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        gm0.j1.e().j(new zf4.x(this, m1Var, i17, i18));
    }
}
