package va3;

/* loaded from: classes15.dex */
public class v0 implements com.tencent.mm.modelbase.u0, q21.b {
    public va3.w0 I;

    /* renamed from: f, reason: collision with root package name */
    public i11.e f434351f;

    /* renamed from: g, reason: collision with root package name */
    public va3.f0 f434352g;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f434354i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f434355m;

    /* renamed from: o, reason: collision with root package name */
    public int f434357o;

    /* renamed from: p, reason: collision with root package name */
    public r45.mw6 f434358p;

    /* renamed from: d, reason: collision with root package name */
    public int f434349d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f434350e = 1000;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashSet f434353h = new java.util.HashSet();

    /* renamed from: n, reason: collision with root package name */
    public int f434356n = 1;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.location.model.LocationInfo f434359q = new com.tencent.mm.plugin.location.model.LocationInfo(false);

    /* renamed from: r, reason: collision with root package name */
    public boolean f434360r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f434361s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f434362t = false;

    /* renamed from: u, reason: collision with root package name */
    public int f434363u = this.f434356n;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f434364v = "";

    /* renamed from: w, reason: collision with root package name */
    public boolean f434365w = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f434366x = false;

    /* renamed from: y, reason: collision with root package name */
    public va3.t0 f434367y = null;

    /* renamed from: z, reason: collision with root package name */
    public int f434368z = -1;
    public boolean A = true;
    public long B = 0;
    public long C = 0;
    public double D = -1000.0d;
    public double E = -1000.0d;
    public int F = -1;
    public long G = 0;
    public int H = 0;

    /* renamed from: J, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f434348J = new va3.q0(this, android.os.Looper.getMainLooper());
    public final i11.c K = new va3.r0(this);
    public final va3.d0 L = new va3.s0(this);

    public final va3.w0 a(int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, int i19, boolean z17, boolean z18) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        va3.w0 w0Var = new va3.w0();
        w0Var.f434369a = i17;
        w0Var.f434370b = i18;
        w0Var.f434371c = str2;
        w0Var.f434374f = str3;
        w0Var.f434372d = z17;
        w0Var.f434378j = z17;
        w0Var.f434379k = z18;
        w0Var.f434377i = i19;
        w0Var.f434373e = str.endsWith("@chatroom") ? 1 : 2;
        w0Var.f434375g = currentTimeMillis - j17;
        if (i17 == 4 && !str3.isEmpty() && str3.contains("_TS")) {
            try {
                w0Var.f434376h = currentTimeMillis - java.lang.Long.parseLong(str3.substring(str3.lastIndexOf("_TS") + 3));
            } catch (java.lang.NumberFormatException unused) {
                w0Var.f434376h = 0L;
            }
        }
        return w0Var;
    }

    public void b(int i17) {
        ua3.a c17;
        com.tencent.mars.xlog.Log.i("MicorMsg.TrackRefreshManager", "track endTrack");
        if (d()) {
            java.lang.String str = this.f434354i;
            this.I = a(4, 0, this.f434364v, str, this.f434355m, this.G, this.H, false, false);
            ya3.a aVar = new ya3.a(str);
            ((r45.xl0) aVar.f460589e.f70710a.f70684a).f390210e = i17;
            gm0.j1.d().g(aVar);
            this.f434354i = "";
            this.f434355m = "";
            this.G = 0L;
            this.H = 0;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f434364v) && (c17 = va3.j0.Ui().c(this.f434364v)) != null) {
            c17.f425970e.remove(c01.z1.r());
            va3.j0.Ui().g(this.f434364v, c17.f425970e, c17.f425972g, c17.f425971f, c17.f425973h, null, null);
        }
        va3.z0 Ui = va3.j0.Ui();
        ua3.b bVar = Ui.f434397b;
        if (bVar != null) {
            bVar.f425976e = "";
        }
        Ui.d(bVar);
        this.f434354i = "";
        this.f434355m = "";
        this.f434364v = "";
        this.f434360r = false;
        this.f434361s = false;
        this.D = -1000.0d;
        this.E = -1000.0d;
        this.F = -1;
        this.f434368z = -1;
    }

    public boolean c() {
        return d() && this.f434360r;
    }

    public boolean d() {
        return !com.tencent.mm.sdk.platformtools.t8.K0(this.f434354i);
    }

    public final void e() {
        if (!this.f434362t || !this.f434360r || this.f434359q == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("error to exit refresh isStart: ");
            sb6.append(this.f434362t);
            sb6.append(" isShared: ");
            sb6.append(this.f434360r);
            sb6.append(" ");
            sb6.append(this.f434359q == null);
            com.tencent.mars.xlog.Log.e("MicorMsg.TrackRefreshManager", sb6.toString());
            return;
        }
        r45.mw6 mw6Var = this.f434358p;
        if (mw6Var != null) {
            r45.wa5 wa5Var = mw6Var.f380873e;
            if (wa5Var.f389011d != -1000.0d && wa5Var.f389012e != -1000.0d) {
                java.lang.String r17 = c01.z1.r();
                r45.io6 io6Var = new r45.io6();
                com.tencent.mm.plugin.location.model.LocationInfo locationInfo = this.f434359q;
                io6Var.f377225g = locationInfo.f144589h;
                io6Var.f377222d = locationInfo.f144586e;
                io6Var.f377223e = locationInfo.f144587f;
                io6Var.f377224f = r17;
                r45.mw6 mw6Var2 = this.f434358p;
                mw6Var2.f380872d = r17;
                r45.wa5 wa5Var2 = mw6Var2.f380873e;
                va3.f0 Bi = va3.j0.Bi();
                wa5Var2.f389013f = Bi.f434286i ? Bi.f434281d : Bi.f434285h;
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("refreshLoopImpl, [trackRoomId:");
                sb7.append(this.f434354i);
                sb7.append("]");
                int i17 = this.f434356n;
                if (i17 != 0 && i17 != 1 && i17 != 2 && i17 == 3) {
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder("[ trackItem ");
                    sb8.append(io6Var.f377222d);
                    sb8.append(" ");
                    sb8.append(io6Var.f377223e);
                    sb8.append(" ]");
                }
                java.lang.StringBuilder sb9 = new java.lang.StringBuilder("[ mMyPosiItem ");
                sb9.append(this.f434358p.f380873e.f389011d);
                sb9.append(" ");
                sb9.append(this.f434358p.f380873e.f389012e);
                sb9.append(" ");
                sb9.append(this.f434358p.f380873e.f389013f);
                sb9.append(" ]");
                java.lang.String str = this.f434354i;
                int i18 = this.f434356n;
                r45.mw6 mw6Var3 = this.f434358p;
                int i19 = this.f434357o + 1;
                this.f434357o = i19;
                gm0.j1.d().g(new ya3.c(str, i18, mw6Var3, i19, io6Var));
                return;
            }
        }
        com.tencent.mars.xlog.Log.e("MicorMsg.TrackRefreshManager", "error to get my location ");
        this.f434348J.sendEmptyMessageDelayed(1, this.f434350e);
    }

    public final void f(int i17, int i18, boolean z17, boolean z18, boolean z19) {
        int i19;
        int i27;
        if (z17) {
            i19 = i17 != 0 ? (i17 == 3 || i17 != 4) ? 7 : 8 : 6;
        } else if (i17 == 0) {
            i19 = 1;
        } else {
            if (i17 != 3 && i17 == 4) {
                i27 = 3;
                va3.x0.a(a(i27, i18, this.f434364v, this.f434354i, this.f434355m, this.G, this.H, z18, z19));
            }
            i19 = 2;
        }
        i27 = i19;
        va3.x0.a(a(i27, i18, this.f434364v, this.f434354i, this.f434355m, this.G, this.H, z18, z19));
    }

    public void g() {
        this.f434366x = false;
        if (d()) {
            ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
            i11.h e17 = i11.h.e();
            this.f434351f = e17;
            e17.j(this.K, true);
            if (this.f434352g == null) {
                this.f434352g = va3.j0.Bi();
            }
            this.f434352g.a(this.L);
            e();
        }
    }

    public void h() {
        com.tencent.mars.xlog.Log.i("MicorMsg.TrackRefreshManager", "stop location");
        i11.e eVar = this.f434351f;
        if (eVar != null) {
            ((i11.h) eVar).m(this.K);
        }
        va3.f0 f0Var = this.f434352g;
        if (f0Var != null) {
            f0Var.c(this.L);
        }
        gm0.j1.d().q(uc1.o.CTRL_INDEX, this);
        gm0.j1.d().q(490, this);
        this.f434356n = 1;
        this.f434362t = false;
        this.f434368z = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:274:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0641  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r6v3 */
    @Override // com.tencent.mm.modelbase.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSceneEnd(int r27, int r28, java.lang.String r29, com.tencent.mm.modelbase.m1 r30) {
        /*
            Method dump skipped, instructions count: 1999
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: va3.v0.onSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }
}
