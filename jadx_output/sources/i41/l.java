package i41;

@j95.b
/* loaded from: classes4.dex */
public class l extends i95.w implements j41.c0 {

    /* renamed from: n, reason: collision with root package name */
    public static final java.util.HashMap f288372n;

    /* renamed from: d, reason: collision with root package name */
    public u41.d f288373d;

    /* renamed from: e, reason: collision with root package name */
    public u41.b f288374e;

    /* renamed from: f, reason: collision with root package name */
    public u41.l f288375f;

    /* renamed from: g, reason: collision with root package name */
    public u41.h f288376g;

    /* renamed from: h, reason: collision with root package name */
    public u41.j f288377h;

    /* renamed from: i, reason: collision with root package name */
    public k41.r0 f288378i;

    /* renamed from: m, reason: collision with root package name */
    public u41.f f288379m;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        f288372n = hashMap;
        hashMap.put(-923510998, new i41.e());
        hashMap.put(1560773163, new i41.f());
        hashMap.put(-565094361, new i41.g());
        hashMap.put(64785613, new i41.h());
        hashMap.put(-256987579, new i41.i());
        hashMap.put(340868664, new i41.j());
        hashMap.put(-862743677, new i41.k());
    }

    public u41.d Ai() {
        gm0.j1.b().c();
        if (this.f288373d == null) {
            gm0.j1.i();
            this.f288373d = new u41.d(gm0.j1.u().f273153f);
        }
        return this.f288373d;
    }

    public u41.f Bi() {
        gm0.j1.b().c();
        if (this.f288379m == null) {
            gm0.j1.i();
            this.f288379m = new u41.f(gm0.j1.u().f273153f);
        }
        return this.f288379m;
    }

    public k41.r0 Di() {
        gm0.j1.b().c();
        if (this.f288378i == null) {
            gm0.j1.i();
            this.f288378i = new k41.r0(gm0.j1.u().f273153f);
        }
        return this.f288378i;
    }

    public u41.h Ni() {
        gm0.j1.b().c();
        if (this.f288376g == null) {
            gm0.j1.i();
            this.f288376g = new u41.h(gm0.j1.u().f273153f);
        }
        return this.f288376g;
    }

    public u41.j Ri() {
        gm0.j1.b().c();
        if (this.f288377h == null) {
            gm0.j1.i();
            this.f288377h = new u41.j(gm0.j1.u().f273153f);
        }
        return this.f288377h;
    }

    public u41.l Ui() {
        gm0.j1.b().c();
        if (this.f288375f == null) {
            gm0.j1.i();
            this.f288375f = new u41.l(gm0.j1.u().f273153f);
        }
        return this.f288375f;
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginOpenIM", "onAccountInitialized");
        ((l41.b2) ((j41.y) i95.n0.c(j41.y.class))).getClass();
        k41.h1 h1Var = k41.h1.f304007d;
        gm0.j1.d().a(4010, h1Var);
        gm0.j1.d().a(6849, h1Var);
        gm0.j1.d().a(5997, h1Var);
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginOpenIM", "onAccountRelease");
        ((l41.b2) ((j41.y) i95.n0.c(j41.y.class))).getClass();
        k41.h1 h1Var = k41.h1.f304007d;
        gm0.j1.d().q(4010, h1Var);
        gm0.j1.d().q(6849, h1Var);
        gm0.j1.d().q(5997, h1Var);
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            q25.b.b(new y41.a(), "//im");
        } else {
            if (com.tencent.mm.sdk.platformtools.x2.s()) {
                return;
            }
            com.tencent.mm.sdk.platformtools.x2.j();
        }
    }

    public u41.b wi() {
        gm0.j1.b().c();
        if (this.f288374e == null) {
            gm0.j1.i();
            this.f288374e = new u41.b(gm0.j1.u().f273153f);
        }
        return this.f288374e;
    }
}
