package dz3;

/* loaded from: classes15.dex */
public class i implements tz3.a {
    public static final boolean A;
    public static final float B;
    public static final boolean C;
    public static int D;
    public static int E;
    public static int F;
    public static volatile dz3.f H;
    public static volatile dz3.f I;

    /* renamed from: z, reason: collision with root package name */
    public static final int f245132z;

    /* renamed from: a, reason: collision with root package name */
    public boolean f245133a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f245134b;

    /* renamed from: c, reason: collision with root package name */
    public tz3.c f245135c;

    /* renamed from: d, reason: collision with root package name */
    public dz3.g f245136d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f245137e;

    /* renamed from: f, reason: collision with root package name */
    public int f245138f;

    /* renamed from: g, reason: collision with root package name */
    public android.hardware.SensorManager f245139g;

    /* renamed from: h, reason: collision with root package name */
    public android.hardware.Sensor f245140h;

    /* renamed from: i, reason: collision with root package name */
    public android.hardware.Sensor f245141i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f245142j;

    /* renamed from: k, reason: collision with root package name */
    public final dz3.h f245143k;

    /* renamed from: l, reason: collision with root package name */
    public float f245144l;

    /* renamed from: m, reason: collision with root package name */
    public float f245145m;

    /* renamed from: n, reason: collision with root package name */
    public float f245146n;

    /* renamed from: o, reason: collision with root package name */
    public float f245147o;

    /* renamed from: p, reason: collision with root package name */
    public float f245148p;

    /* renamed from: q, reason: collision with root package name */
    public float f245149q;

    /* renamed from: r, reason: collision with root package name */
    public double f245150r;

    /* renamed from: s, reason: collision with root package name */
    public long f245151s;

    /* renamed from: t, reason: collision with root package name */
    public long f245152t;

    /* renamed from: u, reason: collision with root package name */
    public long f245153u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f245154v;

    /* renamed from: w, reason: collision with root package name */
    public long f245155w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f245156x;
    public static final dz3.i G = new dz3.i();

    /* renamed from: y, reason: collision with root package name */
    public static int f245131y = bz3.h.f36779f;

    static {
        boolean a17 = bz3.h.a();
        C = a17;
        int intValue = ((java.lang.Number) ((jz5.n) bz3.h.f36785l).getValue()).intValue();
        f245132z = intValue;
        bz3.h hVar = bz3.h.f36774a;
        A = ((java.lang.Boolean) ((jz5.n) bz3.h.f36786m).getValue()).booleanValue();
        B = ((java.lang.Number) ((jz5.n) bz3.h.f36787n).getValue()).floatValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.ReIdAiScanImageDecodeQueue", "scanConfig enableFilterCodeFrame: %s, sensorSkipStableMs: %s", java.lang.Boolean.valueOf(a17), java.lang.Integer.valueOf(intValue));
        H = null;
        I = null;
    }

    public i() {
        com.tencent.mm.plugin.scanner.model.y0 y0Var = com.tencent.mm.plugin.scanner.model.y0.f159102d;
        this.f245138f = 0;
        this.f245142j = false;
        this.f245143k = new dz3.h(this);
        this.f245154v = false;
    }

    public static void p(com.tencent.mm.plugin.scanner.model.e1 e1Var) {
        ((ku5.t0) ku5.t0.f312615d).h(e1Var, "ReIdAiScanImageDecodeQueue_decode_task");
    }

    @Override // tz3.a
    public void a() {
        dz3.g gVar = this.f245136d;
        if (gVar != null) {
            gVar.f245121j++;
        }
    }

    @Override // tz3.a
    public void b(int i17) {
        dz3.g gVar = this.f245136d;
        if (gVar != null) {
            if (i17 == 0) {
                gVar.f245126o++;
                return;
            }
            if (i17 == 2) {
                gVar.f245125n++;
                return;
            }
            if (i17 == 3) {
                gVar.f245127p++;
            } else if (i17 == 4) {
                gVar.f245128q++;
            } else {
                if (i17 != 5) {
                    return;
                }
                gVar.f245129r++;
            }
        }
    }

    @Override // tz3.a
    public void c(int i17) {
    }

    @Override // tz3.a
    public void d(int i17, int i18, int i19, int i27) {
    }

    @Override // tz3.a
    public void e(int i17, sz3.a1 a1Var, sz3.x0 x0Var, android.graphics.RectF rectF, byte[] bArr, int i18, int i19, tz3.c cVar) {
        if (this.f245137e) {
            p(new dz3.a(this, bArr, rectF, cVar, i17, i18, i19));
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.ReIdAiScanImageDecodeQueue", "decodeFullImage is not working");
        }
    }

    @Override // tz3.a
    public void f(com.tencent.wechat.aff.iam_scan.n nVar) {
    }

    @Override // tz3.a
    public void g(long j17) {
        if (this.f245137e) {
            if (this.f245139g == null) {
                this.f245139g = (android.hardware.SensorManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("sensor");
            }
            android.hardware.SensorManager sensorManager = this.f245139g;
            if (sensorManager != null) {
                if (this.f245140h == null) {
                    this.f245140h = sensorManager.getDefaultSensor(10);
                }
                if (A && this.f245141i == null) {
                    this.f245141i = this.f245139g.getDefaultSensor(4);
                }
            }
            if (this.f245139g != null && !this.f245142j) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ReIdAiScanImageDecodeQueue", "startSensorShakeDetect");
                android.hardware.Sensor sensor = this.f245140h;
                dz3.h hVar = this.f245143k;
                if (sensor != null) {
                    this.f245139g.registerListener(hVar, sensor, 3);
                }
                android.hardware.Sensor sensor2 = this.f245141i;
                if (sensor2 != null) {
                    this.f245139g.registerListener(hVar, sensor2, 3);
                }
                this.f245142j = true;
            }
            this.f245155w = 0L;
            this.f245156x = false;
        }
    }

    @Override // tz3.a
    public void h(tz3.c cVar) {
        this.f245135c = cVar;
    }

    @Override // tz3.a
    public void i(byte[] bArr, tz3.b bVar) {
    }

    @Override // tz3.a
    public void init() {
        this.f245136d = new dz3.g(this);
        this.f245137e = true;
        f245131y = e04.j2.a();
        this.f245155w = 0L;
        this.f245156x = false;
    }

    @Override // tz3.a
    public void j() {
        dz3.g gVar = this.f245136d;
        if (gVar != null) {
            gVar.f245122k++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0116  */
    @Override // tz3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k(com.tencent.wechat.aff.iam_scan.y r17, tz3.d r18) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dz3.i.k(com.tencent.wechat.aff.iam_scan.y, tz3.d):void");
    }

    @Override // tz3.a
    public void l(long j17) {
        if (this.f245137e) {
            if (this.f245139g != null && this.f245142j) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ReIdAiScanImageDecodeQueue", "stopSensorShakeDetect");
                this.f245139g.unregisterListener(this.f245143k);
            }
            this.f245142j = false;
            this.f245155w = 0L;
            this.f245156x = false;
        }
        this.f245138f = 0;
        p(new dz3.d(this));
    }

    @Override // tz3.a
    public void m() {
        dz3.g gVar = this.f245136d;
        if (gVar != null) {
            int i17 = gVar.f245123l;
            if (!(i17 > 0)) {
                gVar.f245124m = gVar.f245121j;
            }
            gVar.f245123l = i17 + 1;
        }
    }

    public final void n(com.tencent.wechat.aff.iam_scan.y yVar, tz3.d dVar, boolean z17) {
        if (this.f245134b) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ReIdAiScanImageDecodeQueue", "dealDecodeImage image is decoding");
            return;
        }
        if (H == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ReIdAiScanImageDecodeQueue", "dealDecodeImage sPendingImage is null");
            return;
        }
        if (I != null && H.f245110a == I.f245110a) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ReIdAiScanImageDecodeQueue", "dealDecodeImage image id is same, do not decode");
            return;
        }
        this.f245134b = true;
        dz3.g gVar = this.f245136d;
        if (gVar != null) {
            gVar.f245116e++;
        }
        if (z17) {
            p(new dz3.b(this, yVar, dVar));
        } else {
            o(yVar, dVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x031a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(com.tencent.wechat.aff.iam_scan.y r30, tz3.d r31) {
        /*
            Method dump skipped, instructions count: 798
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dz3.i.o(com.tencent.wechat.aff.iam_scan.y, tz3.d):void");
    }

    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.hardware.SensorManager, android.hardware.Sensor, dz3.g] */
    @Override // tz3.a
    public void release() {
        java.lang.String str;
        ?? r17;
        dz3.i iVar = this;
        com.tencent.mars.xlog.Log.i("MicroMsg.ReIdAiScanImageDecodeQueue", "release");
        p(new dz3.c(iVar));
        iVar.f245137e = false;
        iVar.f245138f = 0;
        iVar.f245135c = null;
        dz3.g gVar = iVar.f245136d;
        if (gVar == null) {
            str = "MicroMsg.ReIdAiScanImageDecodeQueue";
            r17 = 0;
        } else {
            str = "MicroMsg.ReIdAiScanImageDecodeQueue";
            r17 = 0;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(24190, 0, java.lang.Integer.valueOf(gVar.f245112a), java.lang.Integer.valueOf(gVar.f245113b), java.lang.Integer.valueOf(gVar.f245114c), java.lang.Integer.valueOf(gVar.f245116e), java.lang.Integer.valueOf(gVar.f245117f), java.lang.Integer.valueOf(gVar.f245118g), java.lang.Integer.valueOf(gVar.f245119h), java.lang.Integer.valueOf(gVar.f245120i), java.lang.Integer.valueOf(gVar.f245121j), java.lang.Integer.valueOf(gVar.f245122k), java.lang.Integer.valueOf(gVar.f245123l), java.lang.Integer.valueOf(gVar.f245124m), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, java.lang.Integer.valueOf(gVar.f245125n), java.lang.Integer.valueOf(gVar.f245126o), java.lang.Integer.valueOf(gVar.f245127p), java.lang.Integer.valueOf(gVar.f245128q), java.lang.Integer.valueOf(gVar.f245129r), java.lang.Integer.valueOf(gVar.f245115d));
            iVar = this;
        }
        iVar.f245136d = r17;
        if (iVar.f245139g != null && iVar.f245142j) {
            com.tencent.mars.xlog.Log.i(str, "stopSensorShakeDetect");
            iVar.f245139g.unregisterListener(iVar.f245143k);
        }
        iVar.f245142j = false;
        iVar.f245139g = r17;
        iVar.f245140h = r17;
        iVar.f245155w = 0L;
        iVar.f245156x = false;
        if (D == 0 || E == 0) {
            return;
        }
        com.tencent.mm.plugin.scanner.model.c cVar = new com.tencent.mm.plugin.scanner.model.c(0);
        cVar.f158832i = ((int) ((F * 100.0f) / E)) + "_" + ((int) ((E * 100.0f) / D)) + "_" + D + "_" + E + "_" + F;
        com.tencent.mm.plugin.scanner.model.d.a(140, cVar);
        D = 0;
        E = 0;
        F = 0;
    }
}
