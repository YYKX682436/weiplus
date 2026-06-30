package s65;

/* loaded from: classes11.dex */
public class g0 extends com.tencent.mm.sandbox.monitor.l {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String[] f403456g;

    /* renamed from: h, reason: collision with root package name */
    public s65.f0 f403457h;

    /* renamed from: i, reason: collision with root package name */
    public q65.b f403458i;

    /* renamed from: j, reason: collision with root package name */
    public int f403459j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f403460k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f403461l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f403462m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f403463n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f403464o;

    /* renamed from: p, reason: collision with root package name */
    public final q65.b f403465p;

    public g0(int i17, java.lang.String str, int i18, java.lang.String[] strArr, boolean z17) {
        super(i17, str, i18, z17);
        this.f403457h = null;
        this.f403459j = 0;
        this.f403460k = false;
        this.f403463n = false;
        this.f403464o = new s65.a0(this);
        this.f403465p = new s65.c0(this);
        this.f403456g = strArr;
    }

    public static void e(s65.g0 g0Var, r45.js5 js5Var) {
        g0Var.getClass();
        try {
            s75.d.b(new s65.b0(g0Var, js5Var), "NetSceneGetUpdatePackFromCDN_genApk");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetUpdatePackFromCDN", "exception in genNewAPKInNewThread()");
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneGetUpdatePackFromCDN", e17, "", new java.lang.Object[0]);
            android.os.Message obtain = android.os.Message.obtain();
            obtain.what = 1;
            obtain.arg1 = 3;
            obtain.obj = js5Var;
            g0Var.f403464o.sendMessage(obtain);
        }
    }

    @Override // q65.c
    public void a(q65.b bVar) {
        this.f403458i = bVar;
        if (!fp.m.c().equals("mounted")) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetUpdatePackFromCDN", "SDCard not available.");
            bVar.d(-1, -1, null);
            return;
        }
        if (this.f403463n) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetUpdatePackFromCDN", "netscene had been canceled.");
            bVar.d(-1, -1, null);
            return;
        }
        int i17 = 0;
        boolean z17 = this.f192301e ? !com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a) : false;
        boolean z18 = this.f403460k;
        java.lang.String[] strArr = this.f403456g;
        if (z17 || f() >= strArr.length) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetUpdatePackFromCDN", "exceed max download url. url count = " + strArr.length);
            if (z18) {
                bVar.d(1, -1, null);
                return;
            } else {
                bVar.d(-1, -1, null);
                return;
            }
        }
        if (!fp.i.c(this.f192298b)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetUpdatePackFromCDN", "SDCard full");
            if (z18) {
                bVar.d(13, -1, null);
                return;
            } else {
                bVar.d(-1, -1, null);
                return;
            }
        }
        int i18 = this.f192298b;
        java.lang.String d17 = d();
        if (d17 != null) {
            java.io.File file = new java.io.File(d17);
            if (file.exists()) {
                i17 = (int) file.length();
            }
        }
        s65.f0 f0Var = new s65.f0(this, i18, i17, this.f403465p);
        this.f403457h = f0Var;
        f0Var.execute(strArr[f()]);
    }

    @Override // com.tencent.mm.sandbox.monitor.l
    public java.lang.String b() {
        boolean z17 = this.f403460k;
        java.lang.String str = com.tencent.mm.sandbox.monitor.l.f192296f;
        if (z17) {
            return str + this.f403462m + ".apk";
        }
        return str + this.f192300d + ".apk";
    }

    @Override // q65.c
    public void cancel() {
        this.f403463n = true;
        s65.f0 f0Var = this.f403457h;
        if (f0Var == null || f0Var.isCancelled()) {
            return;
        }
        this.f403457h.cancel(true);
    }

    @Override // com.tencent.mm.sandbox.monitor.l
    public java.lang.String d() {
        if (!this.f403460k) {
            return super.d();
        }
        return com.tencent.mm.sandbox.monitor.l.f192296f + this.f403461l + ".temp";
    }

    public final int f() {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetUpdatePackFromCDN", "requestCount=" + this.f403459j + ", curLinkIdx = " + (this.f403459j / 5));
        return this.f403459j / 5;
    }

    public g0(int i17, java.lang.String str, int i18, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z17) {
        super(i17, str, i18, z17);
        this.f403457h = null;
        this.f403459j = 0;
        this.f403460k = false;
        this.f403463n = false;
        this.f403464o = new s65.a0(this);
        this.f403465p = new s65.c0(this);
        this.f403456g = new java.lang.String[]{str2};
        this.f403460k = true;
        this.f403461l = str3;
        this.f403462m = str4;
    }
}
