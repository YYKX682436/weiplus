package yq4;

/* loaded from: classes14.dex */
public abstract class b implements fo4.a, fo4.b, xq4.b {
    public static final java.util.regex.Pattern E = java.util.regex.Pattern.compile(",");
    public xq4.c B;
    public int C;

    /* renamed from: g, reason: collision with root package name */
    public wo.d1 f464563g;

    /* renamed from: h, reason: collision with root package name */
    public android.hardware.Camera.Parameters f464564h;

    /* renamed from: i, reason: collision with root package name */
    public wo.q1 f464565i;

    /* renamed from: m, reason: collision with root package name */
    public int f464566m;

    /* renamed from: q, reason: collision with root package name */
    public android.graphics.SurfaceTexture f464570q;

    /* renamed from: t, reason: collision with root package name */
    public xq4.d f464573t;

    /* renamed from: w, reason: collision with root package name */
    public int f464576w;

    /* renamed from: x, reason: collision with root package name */
    public int f464577x;

    /* renamed from: y, reason: collision with root package name */
    public int f464578y;

    /* renamed from: d, reason: collision with root package name */
    public boolean f464560d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f464561e = false;

    /* renamed from: f, reason: collision with root package name */
    public int f464562f = 0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f464567n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f464568o = false;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.video.ObservableSurfaceView f464569p = null;

    /* renamed from: r, reason: collision with root package name */
    public boolean f464571r = false;

    /* renamed from: s, reason: collision with root package name */
    public int f464572s = -1;

    /* renamed from: u, reason: collision with root package name */
    public boolean f464574u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f464575v = false;

    /* renamed from: z, reason: collision with root package name */
    public boolean f464579z = false;
    public byte[] A = null;
    public final android.hardware.Camera.PreviewCallback D = new yq4.a(this);

    public b(int i17, int i18) {
        this.f464576w = i17;
        this.f464577x = i18;
        xq4.e.b(com.tencent.mm.sdk.platformtools.x2.f193071a.getApplicationContext());
    }

    public static wo.q1 b(wo.d1 d1Var, int i17, int i18) {
        android.hardware.Camera.Parameters c17 = d1Var.c();
        android.graphics.Point point = new android.graphics.Point(i17, i18);
        java.lang.String str = c17.get("preview-size-values");
        if (str == null) {
            str = c17.get("preview-size-value");
        }
        android.graphics.Point point2 = null;
        if (str != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Voip.CaptureRender", "preview-size-values parameter: ".concat(str));
            java.lang.String[] split = E.split(str);
            int length = split.length;
            int i19 = Integer.MAX_VALUE;
            int i27 = 0;
            int i28 = 0;
            int i29 = 0;
            while (true) {
                if (i27 >= length) {
                    break;
                }
                java.lang.String trim = split[i27].trim();
                int indexOf = trim.indexOf(120);
                if (indexOf < 0) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.Voip.CaptureRender", "Bad preview-size: ".concat(trim));
                } else {
                    try {
                        int P = com.tencent.mm.sdk.platformtools.t8.P(trim.substring(0, indexOf), 0);
                        int P2 = com.tencent.mm.sdk.platformtools.t8.P(trim.substring(indexOf + 1), 0);
                        int abs = java.lang.Math.abs(P - point.x) + java.lang.Math.abs(P2 - point.y);
                        if (abs == 0) {
                            i29 = P2;
                            i28 = P;
                            break;
                        }
                        if (abs < i19 && P != P2) {
                            i29 = P2;
                            i19 = abs;
                            i28 = P;
                        }
                    } catch (java.lang.NumberFormatException unused) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.Voip.CaptureRender", "Bad preview-size: ".concat(trim));
                    }
                }
                i27++;
            }
            if (i28 > 0 && i29 > 0) {
                point2 = new android.graphics.Point(i28, i29);
            }
        }
        if (point2 == null) {
            point2 = new android.graphics.Point((point.x >> 3) << 3, (point.y >> 3) << 3);
        }
        return new wo.q1(point2.x, point2.y);
    }

    public void a() {
        if (xq4.e.f456113a.f464581b < 2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Voip.CaptureRender", "ExchangeCapture...gCameraNum= " + xq4.e.f456113a.f464581b);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Voip.CaptureRender", "ExchangeCapture start, gCameraNum= " + xq4.e.f456113a.f464581b);
            i();
            d(this.f464573t, this.f464560d ^ true);
            h();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:(2:3|(4:245|246|(1:248)|249)(28:5|6|(18:8|(4:12|13|(1:15)(1:81)|(18:17|19|20|(3:69|70|71)(1:22)|23|24|26|27|28|(3:30|(2:33|31)|34)|35|36|37|(3:41|(2:44|42)|45)|46|(3:50|(2:53|51)|54)|56|(2:58|59)(1:61)))|84|(0)(0)|23|24|26|27|28|(0)|35|36|37|(4:39|41|(1:42)|45)|46|(4:48|50|(1:51)|54)|56|(0)(0))|85|86|(1:88)|90|(1:92)(13:147|148|(1:150)|151|(2:156|(5:159|160|161|162|163)(1:158))|170|(1:172)(1:228)|173|(2:187|(4:191|(4:196|(5:198|(3:203|(3:209|(1:222)(1:214)|(2:218|219))|208)|224|225|208)|226|227)|186|(0)(0))(1:190))(1:177)|178|(3:183|184|(0)(0))|186|(0)(0))|93|(1:95)(1:146)|(1:97)(1:145)|(1:99)(1:144)|100|101|103|104|105|(2:107|(2:110|(2:112|113)))(2:133|(2:135|(2:137|138)))|114|115|116|(1:118)|120|(1:122)|123|124|125|126))|115|116|(0)|120|(0)|123|124|125|126) */
    /* JADX WARN: Can't wrap try/catch for region: R(18:8|(4:12|13|(1:15)(1:81)|(18:17|19|20|(3:69|70|71)(1:22)|23|24|26|27|28|(3:30|(2:33|31)|34)|35|36|37|(3:41|(2:44|42)|45)|46|(3:50|(2:53|51)|54)|56|(2:58|59)(1:61)))|84|(0)(0)|23|24|26|27|28|(0)|35|36|37|(4:39|41|(1:42)|45)|46|(4:48|50|(1:51)|54)|56|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(26:(2:3|(4:245|246|(1:248)|249)(28:5|6|(18:8|(4:12|13|(1:15)(1:81)|(18:17|19|20|(3:69|70|71)(1:22)|23|24|26|27|28|(3:30|(2:33|31)|34)|35|36|37|(3:41|(2:44|42)|45)|46|(3:50|(2:53|51)|54)|56|(2:58|59)(1:61)))|84|(0)(0)|23|24|26|27|28|(0)|35|36|37|(4:39|41|(1:42)|45)|46|(4:48|50|(1:51)|54)|56|(0)(0))|85|86|(1:88)|90|(1:92)(13:147|148|(1:150)|151|(2:156|(5:159|160|161|162|163)(1:158))|170|(1:172)(1:228)|173|(2:187|(4:191|(4:196|(5:198|(3:203|(3:209|(1:222)(1:214)|(2:218|219))|208)|224|225|208)|226|227)|186|(0)(0))(1:190))(1:177)|178|(3:183|184|(0)(0))|186|(0)(0))|93|(1:95)(1:146)|(1:97)(1:145)|(1:99)(1:144)|100|101|103|104|105|(2:107|(2:110|(2:112|113)))(2:133|(2:135|(2:137|138)))|114|115|116|(1:118)|120|(1:122)|123|124|125|126))|85|86|(0)|90|(0)(0)|93|(0)(0)|(0)(0)|(0)(0)|100|101|103|104|105|(0)(0)|114|115|116|(0)|120|(0)|123|124|125|126) */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0540, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0541, code lost:
    
        com.tencent.mars.xlog.Log.e("MicroMsg.Voip.CaptureRender", "setDisplayOrientation failed: %s", r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x043e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0442, code lost:
    
        com.tencent.mars.xlog.Log.e("MicroMsg.Voip.CaptureRender", "getCameraResolution failed: %s", r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0440, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0441, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01ee, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01ef, code lost:
    
        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Voip.CaptureRender", r0, "", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x015e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x015f, code lost:
    
        r0.toString();
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x014d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x014e, code lost:
    
        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Voip.CaptureRender", r0, "get camori error", new java.lang.Object[0]);
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0520 A[Catch: Exception -> 0x0580, TRY_LEAVE, TryCatch #8 {Exception -> 0x0580, blocks: (B:116:0x0512, B:118:0x0520), top: B:115:0x0512 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0213 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0397 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x019b A[Catch: Exception -> 0x01ee, TryCatch #1 {Exception -> 0x01ee, blocks: (B:37:0x0191, B:39:0x019b, B:41:0x01a1, B:42:0x01a5, B:44:0x01ab, B:46:0x01b4, B:48:0x01be, B:50:0x01c4, B:51:0x01c8, B:53:0x01ce), top: B:36:0x0191 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ab A[Catch: Exception -> 0x01ee, LOOP:1: B:42:0x01a5->B:44:0x01ab, LOOP_END, TryCatch #1 {Exception -> 0x01ee, blocks: (B:37:0x0191, B:39:0x019b, B:41:0x01a1, B:42:0x01a5, B:44:0x01ab, B:46:0x01b4, B:48:0x01be, B:50:0x01c4, B:51:0x01c8, B:53:0x01ce), top: B:36:0x0191 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01be A[Catch: Exception -> 0x01ee, TryCatch #1 {Exception -> 0x01ee, blocks: (B:37:0x0191, B:39:0x019b, B:41:0x01a1, B:42:0x01a5, B:44:0x01ab, B:46:0x01b4, B:48:0x01be, B:50:0x01c4, B:51:0x01c8, B:53:0x01ce), top: B:36:0x0191 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ce A[Catch: Exception -> 0x01ee, LOOP:2: B:51:0x01c8->B:53:0x01ce, LOOP_END, TRY_LEAVE, TryCatch #1 {Exception -> 0x01ee, blocks: (B:37:0x0191, B:39:0x019b, B:41:0x01a1, B:42:0x01a5, B:44:0x01ab, B:46:0x01b4, B:48:0x01be, B:50:0x01c4, B:51:0x01c8, B:53:0x01ce), top: B:36:0x0191 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0203 A[Catch: Exception -> 0x059d, TRY_LEAVE, TryCatch #13 {Exception -> 0x059d, blocks: (B:86:0x01ff, B:88:0x0203), top: B:85:0x01ff }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(boolean r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 1516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yq4.b.c(boolean, int, int):int");
    }

    public int d(xq4.d dVar, boolean z17) {
        int c17;
        yq4.c cVar = xq4.e.f456113a;
        if (cVar.f464581b <= 0) {
            this.f464562f = 1;
            return -1;
        }
        if (z17) {
            if (!cVar.f464582c) {
                z17 = false;
            }
        } else if (!cVar.f464583d) {
            z17 = true;
        }
        this.f464573t = dVar;
        if (c(z17, this.f464576w, this.f464577x) <= 0 && (c17 = c(z17, this.f464576w, this.f464577x)) <= 0) {
            this.f464562f = 1;
            return c17;
        }
        g();
        this.f464562f = 0;
        return 1;
    }

    @Override // xq4.b
    public void e(int i17) {
        this.C = i17;
        this.f464573t.e(i17);
    }

    public final void f(wo.d1 d1Var) {
        android.hardware.Camera.CameraInfo cameraInfo = new android.hardware.Camera.CameraInfo();
        android.hardware.Camera.getCameraInfo(this.f464560d ? xq4.e.f456114b : xq4.e.f456115c, cameraInfo);
        int rotation = ((android.view.WindowManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("window")).getDefaultDisplay().getRotation();
        int i17 = 0;
        if (rotation != 0) {
            if (rotation == 1) {
                i17 = 90;
            } else if (rotation == 2) {
                i17 = 180;
            } else if (rotation == 3) {
                i17 = 270;
            }
        }
        int i18 = this.f464560d ? (360 - ((cameraInfo.orientation + i17) % com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1)) % com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1 : ((cameraInfo.orientation - i17) + com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1) % com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1;
        d1Var.e(i18);
        this.f464578y = i18;
    }

    public abstract void g();

    public int h() {
        if (!this.f464567n) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Voip.CaptureRender", "StartCapture: failed without open camera");
            this.f464562f = 1;
            return -1;
        }
        if (this.f464574u) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Voip.CaptureRender", "StartCapture: is in capture already ");
            return -1;
        }
        com.tencent.mm.plugin.video.ObservableSurfaceView observableSurfaceView = this.f464569p;
        if (observableSurfaceView != null && !observableSurfaceView.f175525f) {
            this.f464575v = true;
            return 0;
        }
        if (observableSurfaceView == null || !this.f464568o) {
            android.graphics.SurfaceTexture surfaceTexture = this.f464570q;
            if (surfaceTexture != null && this.f464571r) {
                try {
                    this.f464563g.i(surfaceTexture);
                } catch (java.lang.Exception e17) {
                    com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                    g0Var.idkeyStat(159L, 0L, 1L, false);
                    g0Var.idkeyStat(159L, 2L, 1L, false);
                    this.f464562f = 1;
                    com.tencent.mars.xlog.Log.e("MicroMsg.Voip.CaptureRender", "StartCapture:error: texture preview" + e17.toString());
                }
            }
        } else {
            try {
                wo.d1 d1Var = this.f464563g;
                android.view.SurfaceHolder surfaceHolder = observableSurfaceView.getSurfaceHolder();
                android.hardware.Camera camera = d1Var.f447652a;
                if (camera != null) {
                    camera.setPreviewDisplay(surfaceHolder);
                }
            } catch (java.lang.Exception e18) {
                com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var2.idkeyStat(159L, 0L, 1L, false);
                g0Var2.idkeyStat(159L, 2L, 1L, false);
                this.f464562f = 1;
                com.tencent.mars.xlog.Log.e("MicroMsg.Voip.CaptureRender", "StartCapture:error:" + e18.toString());
            }
        }
        try {
            this.f464563g.k();
        } catch (java.lang.Exception e19) {
            com.tencent.mm.plugin.report.service.g0 g0Var3 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var3.idkeyStat(159L, 0L, 1L, false);
            g0Var3.idkeyStat(159L, 2L, 1L, false);
            this.f464562f = 1;
            xq4.d dVar = this.f464573t;
            if (dVar != null) {
                dVar.o();
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.Voip.CaptureRender", "startPreview:error" + e19.toString());
        }
        this.f464574u = true;
        if (this.B == null) {
            this.B = new xq4.c(this);
        }
        this.f464573t.e(this.C);
        return 1;
    }

    public void i() {
        wo.d1 d1Var;
        if (this.f464574u && (d1Var = this.f464563g) != null) {
            this.f464575v = false;
            if (!d1Var.f447654c) {
                this.f464563g.g(null);
            }
            try {
                this.f464563g.l();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Voip.CaptureRender", "stopPreview:error" + e17.toString());
            }
            this.f464574u = false;
        }
        if (1 == this.f464562f) {
            com.tencent.mm.autogen.events.PermissionShowDlgEvent permissionShowDlgEvent = new com.tencent.mm.autogen.events.PermissionShowDlgEvent();
            permissionShowDlgEvent.f54614g.f6856a = 2;
            permissionShowDlgEvent.e();
        }
        if (this.f464567n) {
            this.f464562f = 0;
            this.f464575v = false;
            wo.d1 d1Var2 = this.f464563g;
            if (d1Var2 != null && !d1Var2.f447654c) {
                this.f464563g.g(null);
                this.f464563g.d();
            }
            this.f464563g = null;
            this.f464567n = false;
        } else {
            wo.d1 d1Var3 = this.f464563g;
            if (d1Var3 != null) {
                if (!d1Var3.f447654c) {
                    this.f464563g.g(null);
                }
                this.f464563g.d();
                this.f464563g = null;
                this.f464567n = false;
            }
        }
        xq4.c cVar = this.B;
        if (cVar != null) {
            cVar.disable();
            cVar.f456112c = null;
            this.B = null;
        }
    }

    public boolean j(wo.d1 d1Var, int i17, int i18) {
        if (d1Var == null) {
            return false;
        }
        try {
            android.hardware.Camera.Parameters c17 = d1Var.c();
            if (i17 > 0 && i18 > 0) {
                c17.setPreviewSize(i17, i18);
            }
            d1Var.f(c17);
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(159L, 0L, 1L, false);
            com.tencent.mars.xlog.Log.e("MicroMsg.Voip.CaptureRender", "TryPreviewSize fail:" + e17.toString());
            return false;
        }
    }

    public boolean k(wo.d1 d1Var, boolean z17) {
        if (d1Var == null) {
            return false;
        }
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.Voip.CaptureRender", "trySetAutoFocus, isFrontCamera:%s", java.lang.Boolean.valueOf(z17));
            android.hardware.Camera.Parameters c17 = d1Var.c();
            java.util.List<java.lang.String> supportedFocusModes = c17.getSupportedFocusModes();
            if (supportedFocusModes != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Voip.CaptureRender", "supported focus modes size = " + supportedFocusModes.size());
                java.util.Iterator<java.lang.String> it = supportedFocusModes.iterator();
                while (it.hasNext()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Voip.CaptureRender", "supported focus modes : " + it.next());
                }
                int i17 = wo.v1.f447822b.H;
                if (i17 == 0 && z17) {
                    if (supportedFocusModes.contains("auto")) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.CaptureRender", "camera support auto focus");
                        c17.setFocusMode("auto");
                    } else if (supportedFocusModes.contains("continuous-video")) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.CaptureRender", "camera support continuous video focus");
                        c17.setFocusMode("continuous-video");
                    }
                } else if (i17 == 1 || !z17) {
                    if (supportedFocusModes.contains("continuous-video")) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.CaptureRender", "camera support continuous video focus");
                        c17.setFocusMode("continuous-video");
                    } else if (supportedFocusModes.contains("auto")) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.CaptureRender", "camera support auto focus");
                        c17.setFocusMode("auto");
                    }
                }
                d1Var.f(c17);
            }
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(159L, 0L, 1L, false);
            com.tencent.mars.xlog.Log.e("MicroMsg.Voip.CaptureRender", "TrySetAutoFocus fail:" + e17.toString());
            return false;
        }
    }

    @Override // fo4.b
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        boolean z17 = this.f464567n;
        if (!z17 || surfaceTexture == null) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Boolean.valueOf(z17);
            objArr[1] = java.lang.Boolean.valueOf(surfaceTexture == null);
            com.tencent.mars.xlog.Log.e("MicroMsg.Voip.CaptureRender", "onSurfaceTextureAvailable failed, CameraOpen: %b, surface: %b", objArr);
            return;
        }
        try {
            if (!this.f464563g.f447654c) {
                this.f464563g.g(null);
            }
            this.f464563g.l();
            this.f464563g.i(surfaceTexture);
            g();
            this.f464563g.k();
        } catch (java.lang.Exception e17) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.idkeyStat(159L, 0L, 1L, false);
            g0Var.idkeyStat(159L, 2L, 1L, false);
            com.tencent.mars.xlog.Log.e("MicroMsg.Voip.CaptureRender", "surfaceChange failed" + e17.getMessage());
            this.f464562f = 1;
        }
        if (this.f464575v) {
            h();
            this.f464575v = false;
        }
    }
}
