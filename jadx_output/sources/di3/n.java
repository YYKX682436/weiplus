package di3;

/* loaded from: classes10.dex */
public class n implements android.hardware.SensorEventListener {
    public static boolean R = true;

    /* renamed from: J, reason: collision with root package name */
    public final com.tencent.mm.modelcontrol.VideoTransPara f232736J;

    /* renamed from: n, reason: collision with root package name */
    public wo.h f232744n;

    /* renamed from: o, reason: collision with root package name */
    public android.hardware.SensorManager f232745o;

    /* renamed from: p, reason: collision with root package name */
    public android.hardware.Sensor f232746p;

    /* renamed from: x, reason: collision with root package name */
    public byte[] f232754x;

    /* renamed from: d, reason: collision with root package name */
    public int f232737d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f232738e = -1;

    /* renamed from: g, reason: collision with root package name */
    public boolean f232740g = false;

    /* renamed from: h, reason: collision with root package name */
    public wo.d1 f232741h = null;

    /* renamed from: i, reason: collision with root package name */
    public boolean f232742i = false;

    /* renamed from: m, reason: collision with root package name */
    public int f232743m = 0;

    /* renamed from: q, reason: collision with root package name */
    public float f232747q = 0.0f;

    /* renamed from: r, reason: collision with root package name */
    public float f232748r = 0.0f;

    /* renamed from: s, reason: collision with root package name */
    public float f232749s = 0.0f;

    /* renamed from: t, reason: collision with root package name */
    public android.content.Context f232750t = null;

    /* renamed from: u, reason: collision with root package name */
    public android.graphics.Point f232751u = null;

    /* renamed from: v, reason: collision with root package name */
    public android.graphics.Point f232752v = null;

    /* renamed from: w, reason: collision with root package name */
    public android.graphics.Point f232753w = null;

    /* renamed from: y, reason: collision with root package name */
    public boolean f232755y = false;

    /* renamed from: z, reason: collision with root package name */
    public xp1.a f232756z = new xp1.a();
    public final java.util.List A = new java.util.ArrayList();
    public boolean B = false;
    public di3.l C = di3.l.Preview;
    public final di3.c D = new di3.c("prevcameraCallback");
    public final di3.c E = new di3.c("cameraCallback");
    public final di3.c F = new di3.c("cameraPreviewCallback");
    public final di3.c G = new di3.c("cameraCropCallback");
    public final di3.c H = new di3.c("mirrorCameraCallback");
    public final di3.c I = new di3.c("finishCallbackTimeCallback");
    public volatile byte[] K = null;
    public volatile boolean L = false;
    public boolean M = false;
    public final android.hardware.Camera.AutoFocusCallback N = new di3.k(this);
    public final di3.m P = new di3.m(this, android.os.Looper.getMainLooper());
    public boolean Q = true;

    /* renamed from: f, reason: collision with root package name */
    public final di3.g0 f232739f = di3.g0.a();

    public n(com.tencent.mm.modelcontrol.VideoTransPara videoTransPara, int i17) {
        this.f232736J = videoTransPara;
    }

    public static boolean a(di3.n nVar, byte[] bArr) {
        nVar.getClass();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        android.os.SystemClock.elapsedRealtime();
        java.util.List list = nVar.A;
        boolean z18 = false;
        if (list != null) {
            java.util.ArrayList arrayList = (java.util.ArrayList) list;
            if (arrayList.size() != 0) {
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    z18 |= ((di3.o) it.next()).a(bArr);
                }
            }
        }
        return z18;
    }

    public final void b() {
        try {
            android.hardware.SensorManager sensorManager = this.f232745o;
            if (sensorManager != null && this.f232746p != null) {
                sensorManager.unregisterListener(this);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCamera", this.D.c());
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCamera", this.E.c());
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCamera", this.F.c());
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCamera", this.G.c());
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCamera", this.H.c());
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCamera", this.I.c());
            if (this.f232741h != null) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCamera", "release camera beg, %s", android.os.Looper.myLooper());
                this.P.removeCallbacksAndMessages(null);
                this.P.f232730a = true;
                this.f232741h.g(null);
                this.f232741h.l();
                this.f232741h.d();
                this.f232741h = null;
                this.f232742i = false;
                com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCamera", "release camera end, use %dms, %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), android.os.Looper.myLooper());
            }
            this.f232747q = 0.0f;
            this.f232748r = 0.0f;
            this.f232749s = 0.0f;
            R = true;
            this.f232750t = null;
            this.M = false;
            this.f232752v = null;
            this.f232753w = null;
            this.K = null;
            this.B = false;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMSightCamera", e17, "cameraRelease error", new java.lang.Object[0]);
        }
    }

    public int c() {
        wo.h hVar = this.f232744n;
        if (hVar == null || !this.f232742i) {
            return -1;
        }
        return hVar.f447714b;
    }

    public int d() {
        wo.h hVar;
        if (this.f232741h != null && (hVar = this.f232744n) != null) {
            try {
                if (this.f232755y && this.f232754x != null) {
                    int i17 = hVar.f447714b;
                    if (i17 != 0 && i17 != 180) {
                        return this.f232752v.x;
                    }
                    return this.f232752v.y;
                }
                android.graphics.Point point = this.f232753w;
                if (point == null) {
                    int i18 = hVar.f447714b;
                    di3.g0 g0Var = this.f232739f;
                    return (i18 == 0 || i18 == 180) ? g0Var.f232710b : g0Var.f232711c;
                }
                int i19 = hVar.f447714b;
                if (i19 != 0 && i19 != 180) {
                    return point.x;
                }
                return point.y;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MMSightCamera", "getPreviewHeight: %s", e17.getMessage());
            }
        }
        return 0;
    }

    public int e() {
        wo.h hVar;
        if (this.f232741h != null && (hVar = this.f232744n) != null) {
            try {
                if (this.f232755y && this.f232754x != null) {
                    int i17 = hVar.f447714b;
                    if (i17 != 0 && i17 != 180) {
                        return this.f232752v.y;
                    }
                    return this.f232752v.x;
                }
                android.graphics.Point point = this.f232753w;
                if (point == null) {
                    int i18 = hVar.f447714b;
                    di3.g0 g0Var = this.f232739f;
                    return (i18 == 0 || i18 == 180) ? g0Var.f232711c : g0Var.f232710b;
                }
                int i19 = hVar.f447714b;
                if (i19 != 0 && i19 != 180) {
                    return point.y;
                }
                return point.x;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MMSightCamera", "getPreviewWidth: %s", e17.getMessage());
            }
        }
        return 0;
    }

    public boolean f(android.content.Context context, boolean z17) {
        java.lang.Object obj;
        if (!di3.w.f232770d.f232707h) {
            android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("sensor");
            this.f232745o = sensorManager;
            this.f232746p = sensorManager.getDefaultSensor(1);
        } else if (wo.v1.f447822b.f447681z == 0 && this.f232745o == null && this.f232746p == null) {
            android.hardware.SensorManager sensorManager2 = (android.hardware.SensorManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("sensor");
            this.f232745o = sensorManager2;
            this.f232746p = sensorManager2.getDefaultSensor(1);
        }
        if (this.f232741h == null) {
            b();
            this.Q = z17;
            try {
                if (z17) {
                    this.f232743m = wo.i.a();
                } else {
                    this.f232743m = wo.i.b();
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMSightCamera", e17, "try to get cameraid error %s, useBackCamera: %s", e17.getMessage(), java.lang.Boolean.valueOf(this.Q));
                this.f232743m = 0;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCamera", "use camera id %d, SrvDeviceInfo id %d", java.lang.Integer.valueOf(this.f232743m), java.lang.Integer.valueOf(wo.v1.f447822b.B));
            this.M = false;
            this.f232750t = context;
            di3.e0 e0Var = new di3.e0();
            int i17 = this.f232743m;
            wo.h hVar = null;
            if (context != null) {
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                long id6 = java.lang.Thread.currentThread().getId();
                java.lang.Object obj2 = e0Var.f232696a;
                synchronized (obj2) {
                    try {
                        e0Var.f232697b = false;
                        e0Var.f232698c = null;
                        obj = obj2;
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        obj = obj2;
                    }
                    try {
                        s75.d.b(new di3.d0(e0Var, id6, currentTimeMillis, context, i17), "SightCamera_openCamera");
                        try {
                            e0Var.f232696a.wait(30000L);
                        } catch (java.lang.InterruptedException e18) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.SightCamera.OpenCameraThread", "Lock wait failed e:%s", e18.getMessage());
                        }
                        wo.h hVar2 = e0Var.f232698c;
                        if (hVar2 == null || hVar2.f447713a == null) {
                            e0Var.f232697b = true;
                            com.tencent.mars.xlog.Log.e("MicroMsg.SightCamera.OpenCameraThread", "Open Camera Timeout:%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
                        } else {
                            com.tencent.mars.xlog.Log.i("MicroMsg.SightCamera.OpenCameraThread", "Open Camera Succ thread:%d Time:%d camera:%s", java.lang.Long.valueOf(id6), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), e0Var.f232698c.f447713a);
                            hVar = e0Var.f232698c;
                        }
                    } catch (java.lang.Throwable th7) {
                        th = th7;
                        throw th;
                    }
                }
            }
            this.f232744n = hVar;
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCamera", "open camera end, %s", android.os.Looper.myLooper());
            wo.h hVar3 = this.f232744n;
            if (hVar3 == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCamera", "open camera FAILED, %s", android.os.Looper.myLooper());
                n();
                return false;
            }
            wo.d1 d1Var = hVar3.f447713a;
            this.f232741h = d1Var;
            this.P.f232730a = false;
            this.f232739f.f232713e = hVar3.f447714b;
            if (d1Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MMSightCamera", "start camera FAILED!");
                n();
                return false;
            }
        }
        return true;
    }

    public boolean g(wo.d1 d1Var) {
        if (d1Var == null) {
            return false;
        }
        try {
            android.hardware.Camera.Parameters c17 = d1Var.c();
            java.util.List<java.lang.String> supportedFocusModes = c17.getSupportedFocusModes();
            if (supportedFocusModes != null && supportedFocusModes.contains("continuous-picture")) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCameraSetting", "support continuous picture");
                c17.setFocusMode("continuous-picture");
            } else if (supportedFocusModes != null && supportedFocusModes.contains("continuous-video")) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCameraSetting", "support continuous video");
                c17.setFocusMode("continuous-video");
            } else if (supportedFocusModes == null || !supportedFocusModes.contains("auto")) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCameraSetting", "not support continuous video or auto focus");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCameraSetting", "support auto focus");
                c17.setFocusMode("auto");
            }
            d1Var.f(c17);
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCameraSetting", "setFocusMode Exception, %s, %s", android.os.Looper.myLooper(), e17.getMessage());
            return false;
        }
    }

    public boolean h(wo.d1 d1Var) {
        if (d1Var == null) {
            return false;
        }
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCameraSetting", "safeSetMetering");
            android.hardware.Camera.Parameters c17 = d1Var.c();
            if (c17.getMaxNumMeteringAreas() > 0) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(new android.hardware.Camera.Area(new android.graphics.Rect(-1000, -1000, 1000, 1000), 600));
                c17.setMeteringAreas(arrayList);
            }
            d1Var.f(c17);
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCameraSetting", "safeSetMetering Exception, %s, %s", android.os.Looper.myLooper(), e17.getMessage());
            return false;
        }
    }

    public boolean i(wo.d1 d1Var) {
        if (d1Var == null) {
            return false;
        }
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCameraSetting", "safeSetPreviewFormat");
            android.hardware.Camera.Parameters c17 = d1Var.c();
            java.util.List<java.lang.Integer> supportedPreviewFormats = c17.getSupportedPreviewFormats();
            if (supportedPreviewFormats == null || !supportedPreviewFormats.contains(17)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MMSightCameraSetting", "not support YCbCr_420_SP");
            }
            c17.setPreviewFormat(17);
            d1Var.f(c17);
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCameraSetting", "setPreviewFormat Exception, %s, %s", android.os.Looper.myLooper(), e17.getMessage());
            return false;
        }
    }

    public boolean j(wo.d1 d1Var, boolean z17) {
        if (d1Var == null) {
            return false;
        }
        try {
            android.hardware.Camera.Parameters c17 = d1Var.c();
            if (z17) {
                s(c17);
            } else {
                r(c17);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCameraSetting", "use fix mode %B, supported preview frame rates %s", java.lang.Boolean.valueOf(z17), c17.getSupportedPreviewFrameRates());
            d1Var.f(c17);
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCameraSetting", "setPreviewFrameRate Exception, %s, %s", android.os.Looper.myLooper(), e17.getMessage());
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x02fc, code lost:
    
        r2 = r2.f232706g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0300, code lost:
    
        if (r2 != 1080) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0302, code lost:
    
        r2 = r22.f232753w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0304, code lost:
    
        if (r2 != null) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0306, code lost:
    
        r5 = r7.x;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x030b, code lost:
    
        r5 = r5 / 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x030d, code lost:
    
        if (r2 != null) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x030f, code lost:
    
        r2 = r7.y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0316, code lost:
    
        r2 = r2 / 2;
        r9 = r22.f232753w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x031b, code lost:
    
        if (r9 != null) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x031d, code lost:
    
        r9 = r7.x;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0322, code lost:
    
        r5 = ai3.d.s(r5, r9);
        r9 = r22.f232753w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0328, code lost:
    
        if (r9 != null) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x032a, code lost:
    
        r9 = r7.y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x032f, code lost:
    
        r22.f232752v = new android.graphics.Point(r5, ai3.d.s(r2, r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x032d, code lost:
    
        r9 = r9.y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0320, code lost:
    
        r9 = r9.x;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0313, code lost:
    
        r2 = r2.y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0309, code lost:
    
        r5 = r2.x;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0339, code lost:
    
        if (r2 != 720) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x033b, code lost:
    
        r2 = r22.f232753w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x033d, code lost:
    
        if (r2 != null) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x033f, code lost:
    
        r5 = r7.x;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0344, code lost:
    
        r5 = (int) (r5 * 0.75f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0347, code lost:
    
        if (r2 != null) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0349, code lost:
    
        r2 = r7.y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x034e, code lost:
    
        r2 = (int) (r2 * 0.75f);
        r9 = r22.f232753w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0355, code lost:
    
        if (r9 != null) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0357, code lost:
    
        r9 = r7.x;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x035c, code lost:
    
        r5 = ai3.d.s(r5, r9);
        r9 = r22.f232753w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0362, code lost:
    
        if (r9 != null) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0364, code lost:
    
        r9 = r7.y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0369, code lost:
    
        r22.f232752v = new android.graphics.Point(r5, ai3.d.s(r2, r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0367, code lost:
    
        r9 = r9.y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x035a, code lost:
    
        r9 = r9.x;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x034c, code lost:
    
        r2 = r2.y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0342, code lost:
    
        r5 = r2.x;
     */
    /* JADX WARN: Removed duplicated region for block: B:146:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x01a8 A[Catch: Exception -> 0x043d, TryCatch #0 {Exception -> 0x043d, blocks: (B:6:0x000e, B:8:0x001c, B:11:0x004c, B:16:0x0058, B:22:0x0062, B:27:0x0072, B:30:0x00a6, B:32:0x00d6, B:34:0x00dd, B:36:0x00eb, B:41:0x0103, B:45:0x0112, B:47:0x0118, B:50:0x013d, B:52:0x0150, B:54:0x0157, B:56:0x0161, B:58:0x0186, B:59:0x0267, B:61:0x026d, B:67:0x0281, B:69:0x0287, B:71:0x028b, B:72:0x0290, B:74:0x0294, B:76:0x029b, B:78:0x02a2, B:79:0x02a7, B:81:0x02af, B:82:0x02b4, B:83:0x02b2, B:84:0x02a5, B:85:0x0298, B:86:0x028e, B:88:0x02c1, B:90:0x02c5, B:91:0x02ca, B:93:0x02cf, B:94:0x02d4, B:96:0x02dd, B:97:0x02e2, B:99:0x02ea, B:100:0x02ef, B:101:0x02ed, B:102:0x02e0, B:103:0x02d2, B:104:0x02c8, B:106:0x02fc, B:108:0x0302, B:110:0x0306, B:111:0x030b, B:113:0x030f, B:115:0x0316, B:117:0x031d, B:118:0x0322, B:120:0x032a, B:121:0x032f, B:122:0x032d, B:123:0x0320, B:124:0x0313, B:125:0x0309, B:127:0x033b, B:129:0x033f, B:130:0x0344, B:132:0x0349, B:133:0x034e, B:135:0x0357, B:136:0x035c, B:138:0x0364, B:139:0x0369, B:140:0x0367, B:141:0x035a, B:142:0x034c, B:143:0x0342, B:144:0x0372, B:147:0x0381, B:149:0x0388, B:153:0x0395, B:155:0x03a7, B:156:0x041d, B:158:0x03da, B:160:0x03e0, B:162:0x03e8, B:164:0x03ef, B:168:0x03fc, B:170:0x0400, B:172:0x0404, B:174:0x040a, B:176:0x041b, B:178:0x0167, B:183:0x0172, B:184:0x0179, B:185:0x0182, B:186:0x01a8, B:188:0x01ae, B:191:0x01b6, B:196:0x01c3, B:198:0x01d9, B:200:0x01e0, B:202:0x0215, B:204:0x022b, B:206:0x0232, B:207:0x011e, B:209:0x0126, B:211:0x012c, B:214:0x0135, B:216:0x00aa, B:221:0x00d0, B:225:0x0079, B:230:0x0089, B:232:0x008e, B:237:0x009e, B:239:0x0030), top: B:5:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x012c A[Catch: Exception -> 0x043d, TryCatch #0 {Exception -> 0x043d, blocks: (B:6:0x000e, B:8:0x001c, B:11:0x004c, B:16:0x0058, B:22:0x0062, B:27:0x0072, B:30:0x00a6, B:32:0x00d6, B:34:0x00dd, B:36:0x00eb, B:41:0x0103, B:45:0x0112, B:47:0x0118, B:50:0x013d, B:52:0x0150, B:54:0x0157, B:56:0x0161, B:58:0x0186, B:59:0x0267, B:61:0x026d, B:67:0x0281, B:69:0x0287, B:71:0x028b, B:72:0x0290, B:74:0x0294, B:76:0x029b, B:78:0x02a2, B:79:0x02a7, B:81:0x02af, B:82:0x02b4, B:83:0x02b2, B:84:0x02a5, B:85:0x0298, B:86:0x028e, B:88:0x02c1, B:90:0x02c5, B:91:0x02ca, B:93:0x02cf, B:94:0x02d4, B:96:0x02dd, B:97:0x02e2, B:99:0x02ea, B:100:0x02ef, B:101:0x02ed, B:102:0x02e0, B:103:0x02d2, B:104:0x02c8, B:106:0x02fc, B:108:0x0302, B:110:0x0306, B:111:0x030b, B:113:0x030f, B:115:0x0316, B:117:0x031d, B:118:0x0322, B:120:0x032a, B:121:0x032f, B:122:0x032d, B:123:0x0320, B:124:0x0313, B:125:0x0309, B:127:0x033b, B:129:0x033f, B:130:0x0344, B:132:0x0349, B:133:0x034e, B:135:0x0357, B:136:0x035c, B:138:0x0364, B:139:0x0369, B:140:0x0367, B:141:0x035a, B:142:0x034c, B:143:0x0342, B:144:0x0372, B:147:0x0381, B:149:0x0388, B:153:0x0395, B:155:0x03a7, B:156:0x041d, B:158:0x03da, B:160:0x03e0, B:162:0x03e8, B:164:0x03ef, B:168:0x03fc, B:170:0x0400, B:172:0x0404, B:174:0x040a, B:176:0x041b, B:178:0x0167, B:183:0x0172, B:184:0x0179, B:185:0x0182, B:186:0x01a8, B:188:0x01ae, B:191:0x01b6, B:196:0x01c3, B:198:0x01d9, B:200:0x01e0, B:202:0x0215, B:204:0x022b, B:206:0x0232, B:207:0x011e, B:209:0x0126, B:211:0x012c, B:214:0x0135, B:216:0x00aa, B:221:0x00d0, B:225:0x0079, B:230:0x0089, B:232:0x008e, B:237:0x009e, B:239:0x0030), top: B:5:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0150 A[Catch: Exception -> 0x043d, TryCatch #0 {Exception -> 0x043d, blocks: (B:6:0x000e, B:8:0x001c, B:11:0x004c, B:16:0x0058, B:22:0x0062, B:27:0x0072, B:30:0x00a6, B:32:0x00d6, B:34:0x00dd, B:36:0x00eb, B:41:0x0103, B:45:0x0112, B:47:0x0118, B:50:0x013d, B:52:0x0150, B:54:0x0157, B:56:0x0161, B:58:0x0186, B:59:0x0267, B:61:0x026d, B:67:0x0281, B:69:0x0287, B:71:0x028b, B:72:0x0290, B:74:0x0294, B:76:0x029b, B:78:0x02a2, B:79:0x02a7, B:81:0x02af, B:82:0x02b4, B:83:0x02b2, B:84:0x02a5, B:85:0x0298, B:86:0x028e, B:88:0x02c1, B:90:0x02c5, B:91:0x02ca, B:93:0x02cf, B:94:0x02d4, B:96:0x02dd, B:97:0x02e2, B:99:0x02ea, B:100:0x02ef, B:101:0x02ed, B:102:0x02e0, B:103:0x02d2, B:104:0x02c8, B:106:0x02fc, B:108:0x0302, B:110:0x0306, B:111:0x030b, B:113:0x030f, B:115:0x0316, B:117:0x031d, B:118:0x0322, B:120:0x032a, B:121:0x032f, B:122:0x032d, B:123:0x0320, B:124:0x0313, B:125:0x0309, B:127:0x033b, B:129:0x033f, B:130:0x0344, B:132:0x0349, B:133:0x034e, B:135:0x0357, B:136:0x035c, B:138:0x0364, B:139:0x0369, B:140:0x0367, B:141:0x035a, B:142:0x034c, B:143:0x0342, B:144:0x0372, B:147:0x0381, B:149:0x0388, B:153:0x0395, B:155:0x03a7, B:156:0x041d, B:158:0x03da, B:160:0x03e0, B:162:0x03e8, B:164:0x03ef, B:168:0x03fc, B:170:0x0400, B:172:0x0404, B:174:0x040a, B:176:0x041b, B:178:0x0167, B:183:0x0172, B:184:0x0179, B:185:0x0182, B:186:0x01a8, B:188:0x01ae, B:191:0x01b6, B:196:0x01c3, B:198:0x01d9, B:200:0x01e0, B:202:0x0215, B:204:0x022b, B:206:0x0232, B:207:0x011e, B:209:0x0126, B:211:0x012c, B:214:0x0135, B:216:0x00aa, B:221:0x00d0, B:225:0x0079, B:230:0x0089, B:232:0x008e, B:237:0x009e, B:239:0x0030), top: B:5:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x026d A[Catch: Exception -> 0x043d, TryCatch #0 {Exception -> 0x043d, blocks: (B:6:0x000e, B:8:0x001c, B:11:0x004c, B:16:0x0058, B:22:0x0062, B:27:0x0072, B:30:0x00a6, B:32:0x00d6, B:34:0x00dd, B:36:0x00eb, B:41:0x0103, B:45:0x0112, B:47:0x0118, B:50:0x013d, B:52:0x0150, B:54:0x0157, B:56:0x0161, B:58:0x0186, B:59:0x0267, B:61:0x026d, B:67:0x0281, B:69:0x0287, B:71:0x028b, B:72:0x0290, B:74:0x0294, B:76:0x029b, B:78:0x02a2, B:79:0x02a7, B:81:0x02af, B:82:0x02b4, B:83:0x02b2, B:84:0x02a5, B:85:0x0298, B:86:0x028e, B:88:0x02c1, B:90:0x02c5, B:91:0x02ca, B:93:0x02cf, B:94:0x02d4, B:96:0x02dd, B:97:0x02e2, B:99:0x02ea, B:100:0x02ef, B:101:0x02ed, B:102:0x02e0, B:103:0x02d2, B:104:0x02c8, B:106:0x02fc, B:108:0x0302, B:110:0x0306, B:111:0x030b, B:113:0x030f, B:115:0x0316, B:117:0x031d, B:118:0x0322, B:120:0x032a, B:121:0x032f, B:122:0x032d, B:123:0x0320, B:124:0x0313, B:125:0x0309, B:127:0x033b, B:129:0x033f, B:130:0x0344, B:132:0x0349, B:133:0x034e, B:135:0x0357, B:136:0x035c, B:138:0x0364, B:139:0x0369, B:140:0x0367, B:141:0x035a, B:142:0x034c, B:143:0x0342, B:144:0x0372, B:147:0x0381, B:149:0x0388, B:153:0x0395, B:155:0x03a7, B:156:0x041d, B:158:0x03da, B:160:0x03e0, B:162:0x03e8, B:164:0x03ef, B:168:0x03fc, B:170:0x0400, B:172:0x0404, B:174:0x040a, B:176:0x041b, B:178:0x0167, B:183:0x0172, B:184:0x0179, B:185:0x0182, B:186:0x01a8, B:188:0x01ae, B:191:0x01b6, B:196:0x01c3, B:198:0x01d9, B:200:0x01e0, B:202:0x0215, B:204:0x022b, B:206:0x0232, B:207:0x011e, B:209:0x0126, B:211:0x012c, B:214:0x0135, B:216:0x00aa, B:221:0x00d0, B:225:0x0079, B:230:0x0089, B:232:0x008e, B:237:0x009e, B:239:0x0030), top: B:5:0x000e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean k(wo.d1 r23, boolean r24, int r25) {
        /*
            Method dump skipped, instructions count: 1106
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: di3.n.k(wo.d1, boolean, int):boolean");
    }

    public void l() {
        wo.d1 d1Var = this.f232741h;
        if (d1Var != null) {
            try {
                android.hardware.Camera.Parameters c17 = d1Var.c();
                com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCamera", "setPreviewCallbackImpl");
                di3.g0 g0Var = this.f232739f;
                int bitsPerPixel = ((g0Var.f232711c * g0Var.f232710b) * android.graphics.ImageFormat.getBitsPerPixel(c17.getPreviewFormat())) / 8;
                for (int i17 = 0; i17 < 5; i17++) {
                    this.f232741h.a(ei3.x.f253187d.m(java.lang.Integer.valueOf(bitsPerPixel)));
                }
                this.D.d();
                this.E.d();
                this.F.d();
                this.G.d();
                this.H.d();
                this.I.d();
                this.f232756z = new xp1.a();
                this.f232741h.h(new di3.j(this));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MMSightCamera", "setPreviewCallbackImpl error: %s", e17.getMessage());
            }
        }
    }

    public void m(di3.l lVar) {
        this.C = lVar;
        if (lVar == di3.l.Stoping) {
            di3.b b17 = di3.b.b();
            java.lang.String b18 = this.E.b();
            java.lang.String b19 = this.D.b();
            xp1.a aVar = this.f232756z;
            int i17 = aVar.f455869b;
            int i18 = i17 == 0 ? 0 : aVar.f455868a / i17;
            b17.getClass();
            b17.f232670s = (int) (com.tencent.mm.sdk.platformtools.t8.A1(b18) * 10.0d);
            b17.f232671t = (int) (com.tencent.mm.sdk.platformtools.t8.A1(b19) * 10.0d);
            b17.B = i18;
        }
    }

    public final void n() {
        if (true == this.M || this.f232750t == null) {
            return;
        }
        if (!android.os.Build.MANUFACTURER.equalsIgnoreCase("meizu") || zo.e.d()) {
            com.tencent.mm.autogen.events.PermissionShowDlgEvent permissionShowDlgEvent = new com.tencent.mm.autogen.events.PermissionShowDlgEvent();
            permissionShowDlgEvent.f54614g.f6856a = 2;
            permissionShowDlgEvent.e();
            permissionShowDlgEvent.f54615h.getClass();
            com.tencent.mm.ui.widget.dialog.j0 i17 = db5.e1.i(this.f232750t, com.tencent.mm.R.string.j4f, com.tencent.mm.R.string.f490573yv);
            if (i17 != null) {
                i17.setCancelable(false);
                i17.setCanceledOnTouchOutside(false);
                i17.show();
                this.M = true;
            }
        }
    }

    public int o(android.graphics.SurfaceTexture surfaceTexture, boolean z17, int i17) {
        android.hardware.SensorManager sensorManager;
        android.hardware.Sensor sensor;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        this.B = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCamera", "start preview, previewing %B, %s %s autoConfig %s", java.lang.Boolean.valueOf(this.f232742i), android.os.Looper.myLooper(), surfaceTexture, java.lang.Boolean.valueOf(z17));
        if (this.f232742i) {
            return 0;
        }
        if (surfaceTexture == null) {
            return 0 - fp.k.a();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCamera", "this texture %s", surfaceTexture);
        try {
            k(this.f232741h, z17, i17);
            com.tencent.mm.plugin.mmsight.SightParams sightParams = ei3.y.f253189b.f253190a;
            java.lang.Integer valueOf = sightParams != null ? java.lang.Integer.valueOf(sightParams.f148830t) : 0;
            java.lang.Object[] objArr = new java.lang.Object[6];
            objArr[0] = valueOf;
            wo.e eVar = wo.v1.f447822b;
            objArr[1] = eVar.f447678w == 1 ? "Range" : eVar.f447677v == 1 ? "Fix" : "Error";
            objArr[2] = java.lang.Boolean.valueOf(eVar.f447679x == 1);
            objArr[3] = java.lang.Boolean.valueOf(eVar.f447680y == 1);
            objArr[4] = java.lang.Boolean.valueOf(eVar.f447681z == 1);
            objArr[5] = java.lang.Boolean.valueOf(eVar.A == 1);
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCamera", "startPreview Texture:: sightTest %s, config list: setFPS[%s], setYUV420SP[%B], useMetering[%B], useContinueFocus[%B] mUseContinueVideoFocusMode[%B]", objArr);
            if (eVar.f447678w == 1 && (valueOf.intValue() == 0 || valueOf.intValue() == 1)) {
                j(this.f232741h, false);
            } else if (eVar.f447677v == 1 && (valueOf.intValue() == 0 || valueOf.intValue() == 5)) {
                j(this.f232741h, true);
            }
            if (eVar.f447679x == 1 && (valueOf.intValue() == 0 || valueOf.intValue() == 2)) {
                i(this.f232741h);
            }
            int i18 = wo.v1.f447829i.f447695i;
            if (i18 != -1 && i18 == 1 && fp.h.b(14)) {
                h(this.f232741h);
            }
            if (eVar.f447681z == 1 && (valueOf.intValue() == 0 || valueOf.intValue() == 4)) {
                g(this.f232741h);
            }
            if (eVar.A == 1 && valueOf.intValue() != 0) {
                valueOf.intValue();
            }
            wo.d1 d1Var = this.f232741h;
            try {
                android.hardware.Camera.Parameters c17 = d1Var.c();
                if (c17.isZoomSupported()) {
                    c17.setZoom(0);
                }
                d1Var.f(c17);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MMSightCamera", "safeResetZoom error: %s", e17.getMessage());
            }
            l();
            this.f232741h.i(surfaceTexture);
            this.f232741h.k();
            if (!di3.w.f232770d.f232707h) {
                this.f232745o.registerListener(this, this.f232746p, 2);
            } else if (wo.v1.f447822b.f447681z == 0 && (sensorManager = this.f232745o) != null && (sensor = this.f232746p) != null) {
                sensorManager.registerListener(this, sensor, 2);
            }
            this.f232742i = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCamera", "start preview end, use %dms %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), android.os.Looper.myLooper());
            return 0;
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMSightCamera", "start preview FAILED, %s, %s", android.os.Looper.myLooper(), e18.getMessage());
            return 0 - fp.k.a();
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor sensor, int i17) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        float f17 = fArr[0];
        float f18 = fArr[1];
        float f19 = fArr[2];
        if (java.lang.Math.abs(this.f232747q - f17) > 5.0f || java.lang.Math.abs(this.f232748r - f18) > 5.0f || java.lang.Math.abs(this.f232749s - f19) > 5.0f) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCamera", "match accel limit %f, try auto focus x %s y %s z %s", java.lang.Float.valueOf(5.0f), java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18), java.lang.Float.valueOf(f19));
            this.P.c(this.f232741h);
            this.f232747q = f17;
            this.f232748r = f18;
            this.f232749s = f19;
        }
    }

    public boolean p(android.content.Context context, android.graphics.SurfaceTexture surfaceTexture, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCamera", "switch camera, current useBack: %s", java.lang.Boolean.valueOf(this.Q));
        try {
            b();
            f(context, !this.Q);
            o(surfaceTexture, z17, 0);
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMSightCamera", "switchCamera error: %s", e17);
            return false;
        }
    }

    public void q(boolean z17, boolean z18, int i17) {
        int i18;
        if (this.f232741h == null || !this.f232742i) {
            return;
        }
        try {
            try {
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MMSightCamera", "triggerSmallZoom error: %s", e17.getMessage());
            }
            if (this.f232740g) {
                return;
            }
            android.hardware.Camera.Parameters c17 = this.f232741h.c();
            if (c17.isZoomSupported()) {
                this.f232740g = true;
                int zoom = c17.getZoom();
                int maxZoom = c17.getMaxZoom();
                if (z18) {
                    i18 = this.f232738e;
                    if (i18 <= 0) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.MMSightCamera", "scroll zoom error, scrollSmallZoomStep: %s", java.lang.Integer.valueOf(i18));
                        return;
                    }
                } else {
                    if (this.f232737d <= 0) {
                        int round = java.lang.Math.round(maxZoom / 15.0f);
                        this.f232737d = round;
                        if (round > 5) {
                            this.f232737d = 5;
                        }
                    }
                    i18 = this.f232737d;
                }
                if (i17 >= 1) {
                    i18 *= i17;
                }
                if (z17) {
                    if (zoom >= maxZoom) {
                        return;
                    }
                    int i19 = zoom + i18;
                    if (i19 < maxZoom) {
                        maxZoom = i19;
                    }
                } else {
                    if (zoom == 0) {
                        return;
                    }
                    maxZoom = zoom - i18;
                    if (maxZoom <= 0) {
                        maxZoom = 0;
                    }
                }
                c17.setZoom(maxZoom);
                this.f232741h.f(c17);
            }
        } finally {
            this.f232740g = false;
        }
    }

    public final void r(android.hardware.Camera.Parameters parameters) {
        if (wo.v1.f447822b.f447675t > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCameraSetting", "set frame rate > 0, do not try set preview fps range");
            return;
        }
        java.util.List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        if (supportedPreviewFpsRange == null || supportedPreviewFpsRange.size() == 0) {
            return;
        }
        int size = supportedPreviewFpsRange.size();
        int i17 = Integer.MIN_VALUE;
        int i18 = Integer.MIN_VALUE;
        boolean z17 = false;
        for (int i19 = 0; i19 < size; i19++) {
            int[] iArr = supportedPreviewFpsRange.get(i19);
            if (iArr != null && iArr.length > 1) {
                int i27 = iArr[0];
                int i28 = iArr[1];
                com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCamera", "dkfps %d:[%d %d]", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28));
                if (i27 >= 0 && i28 >= i27) {
                    if (i28 >= i18 && !z17) {
                        i18 = i28;
                        i17 = i27;
                    }
                    if (i28 >= 30000) {
                        z17 = true;
                    }
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCameraSetting", "dkfps get fit  [%d %d], max target fps %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), 30);
        if (i17 == Integer.MAX_VALUE || i18 == Integer.MAX_VALUE) {
            return;
        }
        try {
            parameters.setPreviewFpsRange(i17, i18);
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCameraSetting", "set fps range %d %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCameraSetting", "trySetPreviewFpsRangeParameters Exception, %s, %s", android.os.Looper.myLooper(), e17.getMessage());
        }
    }

    public final void s(android.hardware.Camera.Parameters parameters) {
        if (wo.v1.f447822b.f447675t > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCameraSetting", "set frame rate > 0, do not try set preview frame rate");
            return;
        }
        if (parameters == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMSightCamera", "trySetPreviewFrameRateParameters error, p is null!");
            return;
        }
        try {
            java.util.List<java.lang.Integer> supportedPreviewFrameRates = parameters.getSupportedPreviewFrameRates();
            if (supportedPreviewFrameRates == null || supportedPreviewFrameRates.size() <= 0) {
                return;
            }
            int min = java.lang.Math.min(30, ((java.lang.Integer) java.util.Collections.max(supportedPreviewFrameRates)).intValue());
            parameters.setPreviewFrameRate(min);
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCameraSetting", "set preview frame rate %d", java.lang.Integer.valueOf(min));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCameraSetting", "trySetPreviewFrameRateParameters Exception, %s, %s", android.os.Looper.myLooper(), e17.getMessage());
        }
    }
}
