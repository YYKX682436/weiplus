package h34;

/* loaded from: classes11.dex */
public class r extends c34.z implements com.tencent.mm.modelbase.u0 {

    /* renamed from: e, reason: collision with root package name */
    public h34.i f278556e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.Collection f278557f;

    /* renamed from: g, reason: collision with root package name */
    public i11.e f278558g;

    /* renamed from: h, reason: collision with root package name */
    public float f278559h;

    /* renamed from: i, reason: collision with root package name */
    public float f278560i;

    /* renamed from: m, reason: collision with root package name */
    public int f278561m;

    /* renamed from: n, reason: collision with root package name */
    public final int f278562n;

    /* renamed from: o, reason: collision with root package name */
    public final int f278563o;

    /* renamed from: p, reason: collision with root package name */
    public final int f278564p;

    /* renamed from: q, reason: collision with root package name */
    public final i11.c f278565q;

    public r(c34.x xVar) {
        super(xVar);
        this.f278557f = null;
        this.f278559h = -85.0f;
        this.f278560i = -1000.0f;
        this.f278561m = -1000;
        this.f278562n = 10001;
        this.f278563o = 10002;
        this.f278564p = com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NULL;
        this.f278565q = new h34.n(this);
    }

    public static void g(c34.r rVar) {
        java.lang.String str;
        if (rVar == null || rVar.field_sex != 3) {
            return;
        }
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_IBEACON_PUSH_IS_OPEN_BOOLEAN, java.lang.Boolean.TRUE);
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_IBEACON_PUSH_OPEN_TIEMSTAMP_LONG, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()));
        try {
            str = new java.lang.String(rVar.field_lvbuffer, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
        } catch (java.io.UnsupportedEncodingException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ShakeIbeaconService", e17, "%s", "Unsupported");
            str = null;
        }
        if (str != null) {
            java.lang.String[] split = str.split(",");
            if (split.length == 4) {
                c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_IBEACON_PUSH_SHOP_ID_LONG, java.lang.Long.valueOf(split[0]));
            }
        }
    }

    @Override // c34.z
    public void a() {
        h();
        this.f38247d = null;
        c01.d9.e().q(com.tencent.mm.plugin.appbrand.jsapi.appdownload.q0.CTRL_INDEX, this);
    }

    @Override // c34.z
    public void b() {
        c01.d9.e().a(com.tencent.mm.plugin.appbrand.jsapi.appdownload.q0.CTRL_INDEX, this);
        f();
    }

    @Override // c34.z
    public void c() {
        i11.e eVar = this.f278558g;
        if (eVar != null) {
            ((i11.h) eVar).m(this.f278565q);
        }
    }

    @Override // c34.z
    public void d() {
        i11.e eVar = this.f278558g;
        if (eVar != null) {
            ((i11.h) eVar).k(this.f278565q, true);
            com.tencent.mm.plugin.report.service.b1.f(22, 10);
        }
    }

    @Override // c34.z
    public void e() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ShakeIbeaconService", "[oneliang][ShakeIbeaconService][shakezb]:start");
        b();
        h();
        if (this.f278558g == null) {
            f();
        }
        ((i11.h) this.f278558g).j(this.f278565q, true);
        com.tencent.mm.plugin.report.service.b1.f(22, 10);
        java.lang.String str = android.os.Build.VERSION.RELEASE;
        if (!str.equals("6.0") && !str.equals("6.0.0") && !com.tencent.mm.sdk.platformtools.n2.a()) {
            new com.tencent.mm.sdk.platformtools.n3().postDelayed(new h34.o(this), 1000L);
            return;
        }
        android.bluetooth.BluetoothAdapter defaultAdapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null && defaultAdapter.getState() != 12) {
            new com.tencent.mm.sdk.platformtools.n3().postDelayed(new h34.p(this), 1000L);
            return;
        }
        if (defaultAdapter == null) {
            new com.tencent.mm.sdk.platformtools.n3().postDelayed(new h34.q(this), 1000L);
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        java.util.Collection collection = this.f278557f;
        objArr[0] = java.lang.Integer.valueOf(collection != null ? collection.size() : 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.ShakeIbeaconService", "[oneliang][ShakeIbeaconService][shakezb]:beaconCollection.size:%d", objArr);
        this.f278556e = new h34.i(null, this.f278557f, 1, this.f278559h, this.f278560i, this.f278561m);
        c01.d9.e().g(this.f278556e);
    }

    public final void f() {
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        i11.h e17 = i11.h.e();
        this.f278558g = e17;
        e17.k(this.f278565q, true);
        com.tencent.mm.plugin.report.service.b1.f(22, 10);
    }

    public void h() {
        if (this.f278556e != null) {
            c01.d9.e().d(this.f278556e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0245  */
    @Override // com.tencent.mm.modelbase.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSceneEnd(int r23, int r24, java.lang.String r25, com.tencent.mm.modelbase.m1 r26) {
        /*
            Method dump skipped, instructions count: 663
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h34.r.onSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }
}
