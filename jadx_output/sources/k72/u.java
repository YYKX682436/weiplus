package k72;

/* loaded from: classes14.dex */
public class u implements com.tencent.mm.modelbase.u0 {
    public static k72.u B = new k72.u();
    public k72.v A;

    /* renamed from: d, reason: collision with root package name */
    public k72.n f304749d;

    /* renamed from: e, reason: collision with root package name */
    public k72.d0 f304750e;

    /* renamed from: f, reason: collision with root package name */
    public int f304751f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f304752g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f304753h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f304754i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f304755m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f304756n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f304757o;

    /* renamed from: p, reason: collision with root package name */
    public float f304758p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f304759q;

    /* renamed from: r, reason: collision with root package name */
    public k72.t f304760r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.ui.MMActivity f304761s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f304762t;

    /* renamed from: u, reason: collision with root package name */
    public int f304763u;

    /* renamed from: v, reason: collision with root package name */
    public int f304764v;

    /* renamed from: w, reason: collision with root package name */
    public int f304765w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.facedetectaction.ui.FaceActionUI f304766x;

    /* renamed from: y, reason: collision with root package name */
    public int f304767y = 0;

    /* renamed from: z, reason: collision with root package name */
    public boolean f304768z = false;

    public void a() {
        com.tencent.mm.plugin.facedetectaction.ui.FaceActionUI faceActionUI = this.f304766x;
        if (faceActionUI != null) {
            int i17 = this.f304767y;
            if (i17 == 0 || i17 == 1) {
                faceActionUI.U6("cancel", 90004, null, java.lang.Boolean.valueOf(faceActionUI.f100190w));
            } else if (i17 == 2) {
                faceActionUI.U6("cancel", 0, null, java.lang.Boolean.valueOf(faceActionUI.f100190w));
            } else if (i17 == 3) {
                faceActionUI.U6("cancel", 90006, null, java.lang.Boolean.valueOf(faceActionUI.f100190w));
            }
        }
    }

    public void b(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceCheckActionMgr", "release, recreate: %s", java.lang.Boolean.valueOf(z17));
        if (this.f304749d != null) {
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.FaceCheckActionEngine", "release");
                com.tencent.mm.plugin.facedetect.e.wi();
                com.tencent.youtu.ytposedetect.YTPoseDetectInterface.releaseModel();
                com.tencent.youtu.ytfacetrack.YTFaceTrack.GlobalRelease();
                k72.j.f304725a.f304735j = null;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FaceCheckActionEngine", e17, "release error", new java.lang.Object[0]);
            }
            this.f304749d = new k72.n();
        }
        if (this.f304750e != null) {
            if (h72.s.e().h()) {
                h72.s.e().d();
            }
            this.f304750e = null;
        }
        if (z17) {
            com.tencent.mm.sdk.platformtools.n3 n3Var = this.f304762t;
            if (n3Var != null) {
                n3Var.getSerial().f457303b.g();
                this.f304762t = null;
            }
            B = new k72.u();
        }
        k72.v vVar = this.A;
        if (vVar != null) {
            android.hardware.SensorManager sensorManager = vVar.f304769d;
            if (sensorManager != null) {
                sensorManager.unregisterListener(vVar);
            }
            this.A = null;
        }
    }

    public void c(com.tencent.mm.plugin.facedetectaction.ui.FaceActionUI faceActionUI) {
        vz2.c.j("reqCfg");
        j72.a aVar = new j72.a(this.f304751f, this.f304752g, this.f304753h);
        gm0.j1.d().a(2696, this);
        gm0.j1.d().g(aVar);
        this.f304766x = faceActionUI;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a8  */
    @Override // com.tencent.mm.modelbase.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSceneEnd(int r30, int r31, java.lang.String r32, com.tencent.mm.modelbase.m1 r33) {
        /*
            Method dump skipped, instructions count: 677
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k72.u.onSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }
}
