package w21;

/* loaded from: classes12.dex */
public class k0 implements cv.d1 {

    /* renamed from: h, reason: collision with root package name */
    public static int f442416h = 100;

    /* renamed from: d, reason: collision with root package name */
    public tl.w f442420d;

    /* renamed from: e, reason: collision with root package name */
    public yl.h f442421e;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f442417a = null;

    /* renamed from: b, reason: collision with root package name */
    public int f442418b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f442419c = 0;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f442422f = new java.lang.Object();

    /* renamed from: g, reason: collision with root package name */
    public final tl.v f442423g = new w21.j0(this);

    @Override // tl.d
    public int a() {
        return this.f442420d.D;
    }

    @Override // tl.d
    public void b(com.tencent.mm.modelbase.e1 e1Var) {
    }

    public final void c() {
        synchronized (this.f442422f) {
            tl.w wVar = this.f442420d;
            if (wVar != null) {
                wVar.l();
                this.f442420d = null;
            }
            yl.h hVar = this.f442421e;
            if (hVar != null) {
                hVar.d();
                this.f442421e = null;
            }
        }
    }

    @Override // tl.d
    public int d() {
        int i17 = this.f442418b;
        this.f442418b = 0;
        if (i17 > f442416h) {
            f442416h = i17;
        }
        return (i17 * 100) / f442416h;
    }

    @Override // tl.d
    public int getStatus() {
        return this.f442419c;
    }

    @Override // tl.d
    public boolean startRecord(java.lang.String str) {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f442417a)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SpeexRecorder", "Duplicate Call startRecord , maybe Stop Fail Before");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SpeexRecorder", "[startRecord] fileName:%s", str);
        this.f442419c = 1;
        this.f442418b = 0;
        synchronized (this.f442422f) {
            tl.w wVar = new tl.w(16000, 1, 0);
            this.f442420d = wVar;
            wVar.f420160m = -19;
            int i17 = wo.v1.f447833m.f447751i;
            if (i17 > 0) {
                wVar.h(i17, true);
            } else {
                wVar.h(5, false);
            }
            this.f442420d.i(false);
            this.f442420d.f420172y = this.f442423g;
            yl.h hVar = new yl.h();
            this.f442421e = hVar;
            if (!hVar.b(str)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SpeexRecorder", "init speex writer failed");
                c();
                this.f442419c = -1;
                return false;
            }
            if (this.f442420d.k()) {
                this.f442417a = str;
                return true;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.SpeexRecorder", "start record failed");
            c();
            this.f442419c = -1;
            return false;
        }
    }

    @Override // tl.d
    public boolean stopRecord() {
        this.f442417a = null;
        this.f442419c = 0;
        c();
        return true;
    }
}
