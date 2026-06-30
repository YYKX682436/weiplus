package h34;

/* loaded from: classes15.dex */
public class a implements com.tencent.mm.modelbase.u0 {

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f278462i;

    /* renamed from: m, reason: collision with root package name */
    public tl.w f278463m;

    /* renamed from: o, reason: collision with root package name */
    public h34.t f278465o;

    /* renamed from: d, reason: collision with root package name */
    public int f278457d = 400;

    /* renamed from: e, reason: collision with root package name */
    public int f278458e = 8194;

    /* renamed from: f, reason: collision with root package name */
    public int f278459f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f278460g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f278461h = 1;

    /* renamed from: n, reason: collision with root package name */
    public h34.s f278464n = null;

    /* renamed from: p, reason: collision with root package name */
    public volatile byte[] f278466p = new byte[8194];

    /* renamed from: q, reason: collision with root package name */
    public int f278467q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f278468r = 0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f278469s = false;

    /* renamed from: t, reason: collision with root package name */
    public final tl.v f278470t = new h34.b(this);

    public final void a() {
        tl.w wVar = this.f278463m;
        if (wVar != null) {
            wVar.l();
            this.f278463m = null;
        }
    }

    public boolean b() {
        c01.d9.e().q(5245, this);
        tl.w wVar = this.f278463m;
        if (wVar == null) {
            return true;
        }
        wVar.l();
        this.f278463m = null;
        return true;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var.getType() != 5245) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MusicAndSingRecorder", "clientId: %d, onSceneEnd >> errType: %d, errCode: %d", java.lang.Integer.valueOf(this.f278459f), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 == 0 && i18 == 0) {
            h34.j jVar = (h34.j) m1Var;
            if (jVar.H() != null) {
                r45.gh4 gh4Var = (r45.gh4) jVar.H();
                int i19 = gh4Var.f375247e;
                this.f278457d = i19;
                this.f278458e = gh4Var.f375248f;
                com.tencent.mars.xlog.Log.i("MicroMsg.MusicAndSingRecorder", "onSceneEnd: pullInterval: %d, maxPacketSize: %d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(this.f278458e));
                if (gh4Var.f375249g == 1) {
                    java.util.LinkedList linkedList = gh4Var.f375251i;
                    if (linkedList == null || linkedList.size() <= 0) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.MusicAndSingRecorder", "NetSceneShakeMedia isRecoFailed stop now clientId: %d", java.lang.Integer.valueOf(this.f278459f));
                        b();
                        ik1.h0.b(new h34.a$$b(this, null));
                        return;
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.MusicAndSingRecorder", "NetSceneShakeMedia isRecoSuccess stop now ! clientId: %d", java.lang.Integer.valueOf(this.f278459f));
                        b();
                        ik1.h0.b(new h34.a$$b(this, gh4Var));
                        return;
                    }
                }
                if (this.f278462i) {
                    int i27 = this.f278468r + 1;
                    this.f278468r = i27;
                    if (i27 >= 5) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.MusicAndSingRecorder", "null package count is max");
                        ik1.h0.b(new h34.a$$b(this, null));
                        return;
                    }
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f278460g;
                    int i28 = this.f278461h;
                    this.f278461h = i28 + 1;
                    gm0.j1.e().j(new h34.a$$a(this, new byte[1], currentTimeMillis, i28));
                    return;
                }
                return;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.MusicAndSingRecorder", "network error, errType: %d, errCode: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        a();
        ik1.h0.b(new h34.a$$b(this, null));
    }
}
