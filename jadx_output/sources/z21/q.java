package z21;

/* loaded from: classes14.dex */
public class q implements com.tencent.mm.modelbase.u0 {

    /* renamed from: t, reason: collision with root package name */
    public static final java.lang.String f469659t;

    /* renamed from: u, reason: collision with root package name */
    public static final java.lang.String f469660u;

    /* renamed from: v, reason: collision with root package name */
    public static int f469661v;

    /* renamed from: d, reason: collision with root package name */
    public final int f469662d;

    /* renamed from: h, reason: collision with root package name */
    public final int f469666h;

    /* renamed from: m, reason: collision with root package name */
    public z21.p f469668m;

    /* renamed from: n, reason: collision with root package name */
    public tl.w f469669n;

    /* renamed from: o, reason: collision with root package name */
    public yl.b f469670o;

    /* renamed from: e, reason: collision with root package name */
    public int f469663e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f469664f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f469665g = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f469667i = false;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.qqpinyin.voicerecoapi.c f469671p = null;

    /* renamed from: q, reason: collision with root package name */
    public z21.a f469672q = null;

    /* renamed from: r, reason: collision with root package name */
    public final tl.v f469673r = new z21.m(this);

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f469674s = new z21.n(this);

    static {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = com.tencent.mm.storage.v3.f196273a;
        sb6.append(str);
        sb6.append("tmp_voiceaddr.spx");
        f469659t = sb6.toString();
        f469660u = str + "tmp_voiceaddr.amr";
        f469661v = 100;
    }

    public q(z21.p pVar, int i17) {
        this.f469662d = 1;
        this.f469666h = 500000;
        this.f469668m = null;
        this.f469668m = pVar;
        this.f469662d = i17;
        this.f469666h = i17 != 1 ? 1500000 : 500000;
        cv.j1.a();
    }

    public static java.lang.String a(z21.q qVar) {
        return !qVar.f469667i ? f469659t : f469660u;
    }

    public final void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoiceAddr", "finish");
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.SceneVoiceAddr", "finish", new java.lang.Object[0]);
        z21.a aVar = this.f469672q;
        if (aVar != null) {
            aVar.M();
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f469674s;
        n3Var.sendEmptyMessage(2);
        if (!this.f469665g) {
            n3Var.sendEmptyMessage(3);
        }
        c();
    }

    public final void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoiceAddr", "reset");
        synchronized (this) {
            tl.w wVar = this.f469669n;
            if (wVar != null) {
                wVar.l();
                this.f469669n = null;
            }
            yl.b bVar = this.f469670o;
            if (bVar != null) {
                bVar.d();
                this.f469670o = null;
            }
            com.tencent.qqpinyin.voicerecoapi.c cVar = this.f469671p;
            if (cVar != null) {
                com.tencent.qqpinyin.voicerecoapi.TRVADNative tRVADNative = cVar.f215263a;
                if (tRVADNative.mfeStop() == 0 && tRVADNative.mfeClose() == 0) {
                    tRVADNative.mfeExit();
                }
            }
            this.f469671p = null;
            z21.a aVar = this.f469672q;
            if (aVar != null) {
                aVar.M();
                this.f469672q = null;
            }
            this.f469664f = 0;
            this.f469665g = false;
        }
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (this.f469662d == 0) {
            gm0.j1.d().q(349, this);
        } else {
            gm0.j1.d().q(206, this);
        }
        z21.a aVar = (z21.a) m1Var;
        java.lang.String[] J2 = aVar.J();
        long K = aVar.K();
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(i18);
        objArr[2] = java.lang.Integer.valueOf(J2 == null ? -1 : J2.length);
        com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoiceAddr", "onSceneEnd errType:%d errCode:%d list:%d", objArr);
        z21.p pVar = this.f469668m;
        if (pVar != null) {
            if (i18 == 0 && i17 == 0) {
                ((a31.r) pVar).a(J2, K);
                return;
            }
            aVar.I();
            com.tencent.mm.modelvoiceaddr.ui.VoiceSearchLayout voiceSearchLayout = ((a31.r) pVar).f994a;
            voiceSearchLayout.f();
            a31.v vVar = ((a31.u) voiceSearchLayout.f71755e).f995a;
            y90.j jVar = vVar.f999u;
            if (jVar != null) {
                jVar.o2(false, null, -1L, vVar.f998t);
            }
            this.f469668m = null;
            b();
        }
    }
}
