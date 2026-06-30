package zq4;

/* loaded from: classes14.dex */
public class b extends xq4.a {

    /* renamed from: o, reason: collision with root package name */
    public static final java.util.regex.Pattern f475040o = java.util.regex.Pattern.compile(",");

    /* renamed from: d, reason: collision with root package name */
    public volatile wo.d1 f475044d;

    /* renamed from: e, reason: collision with root package name */
    public android.hardware.Camera.Parameters f475045e;

    /* renamed from: f, reason: collision with root package name */
    public android.util.Size f475046f;

    /* renamed from: g, reason: collision with root package name */
    public int f475047g;

    /* renamed from: i, reason: collision with root package name */
    public xq4.d f475049i;

    /* renamed from: k, reason: collision with root package name */
    public int f475051k;

    /* renamed from: l, reason: collision with root package name */
    public int f475052l;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.SurfaceTexture f475054n;

    /* renamed from: a, reason: collision with root package name */
    public boolean f475041a = true;

    /* renamed from: b, reason: collision with root package name */
    public int f475042b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f475043c = 0;

    /* renamed from: h, reason: collision with root package name */
    public boolean f475048h = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f475050j = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f475053m = false;

    public b(int i17, int i18) {
        this.f475051k = i17;
        this.f475052l = i18;
        xq4.e.b(com.tencent.mm.sdk.platformtools.x2.f193071a.getApplicationContext());
    }

    public static android.util.Size h(wo.d1 d1Var, int i17, int i18) {
        android.hardware.Camera.Parameters c17 = d1Var.c();
        android.graphics.Point point = new android.graphics.Point(i17, i18);
        java.lang.String str = c17.get("preview-size-values");
        if (str == null) {
            str = c17.get("preview-size-value");
        }
        android.graphics.Point point2 = null;
        if (str != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Voip.CaptureRender", "preview-size-values parameter: ".concat(str));
            java.lang.String[] split = f475040o.split(str);
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
        return new android.util.Size(point2.x, point2.y);
    }

    @Override // xq4.a
    public void a() {
        if (!this.f475048h) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Voip.CaptureRender", "exchangeCapture: failed by camera not opened");
            return;
        }
        if (xq4.e.f456113a.f464581b < 2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Voip.CaptureRender", "ExchangeCapture...gCameraNum= " + xq4.e.f456113a.f464581b);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.CaptureRender", "ExchangeCapture start, gCameraNum= " + xq4.e.f456113a.f464581b);
        xq4.d dVar = this.f475049i;
        if (dVar != null) {
            dVar.q(19);
        }
        e();
        b(this.f475049i, !this.f475041a);
        c();
        gq4.v.Bi().J(this.f475043c);
    }

    @Override // xq4.a
    public int b(xq4.d dVar, boolean z17) {
        yq4.c cVar = xq4.e.f456113a;
        if (cVar.f464581b <= 0) {
            this.f475043c = 1;
            com.tencent.mars.xlog.Log.e("MicroMsg.Voip.CaptureRender", "ENUM_VideoDevStartFailed");
            return -1;
        }
        if (z17) {
            if (!cVar.f464582c) {
                z17 = false;
            }
        } else if (!cVar.f464583d) {
            z17 = true;
        }
        this.f475049i = dVar;
        if (i(z17, this.f475051k, this.f475052l) <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Voip.CaptureRender", "try init camera again");
            int i17 = i(z17, this.f475051k, this.f475052l);
            if (i17 <= 0) {
                this.f475043c = 1;
                xq4.d dVar2 = this.f475049i;
                if (dVar2 != null) {
                    dVar2.o();
                }
                return i17;
            }
        }
        this.f475043c = 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.CaptureRender", "ENUM_VideoDevStartNormal");
        return 1;
    }

    @Override // xq4.a
    public int c() {
        if (!this.f475048h) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Voip.CaptureRender", "StartCapture: failed without open camera");
            this.f475043c = 1;
            return -1;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.CaptureRender", "StartCapture now, isUesSurfacePreivew: %b", java.lang.Boolean.FALSE);
        if (this.f475054n != null) {
            try {
                this.f475044d.i(this.f475054n);
            } catch (java.lang.Exception e17) {
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var.idkeyStat(159L, 0L, 1L, false);
                g0Var.idkeyStat(159L, 2L, 1L, false);
                this.f475043c = 1;
                com.tencent.mars.xlog.Log.e("MicroMsg.Voip.CaptureRender", "StartCapture:error:" + e17.toString());
            }
        }
        d();
        return 1;
    }

    @Override // xq4.a
    public boolean d() {
        try {
            xq4.d dVar = this.f475049i;
            if (dVar != null) {
                dVar.q(16);
            }
            this.f475044d.k();
            com.tencent.mars.xlog.Log.i("MicroMsg.Voip.CaptureRender", "startPreview");
            xq4.d dVar2 = this.f475049i;
            if (dVar2 != null) {
                dVar2.q(21);
            }
            android.hardware.Camera.Parameters c17 = this.f475044d.c();
            this.f475045e = c17;
            android.hardware.Camera.Size previewSize = c17.getPreviewSize();
            if (vq4.b0.f439279j) {
                android.hardware.Camera.CameraInfo cameraInfo = new android.hardware.Camera.CameraInfo();
                android.hardware.Camera.getCameraInfo(this.f475044d.f447653b, cameraInfo);
                this.f475042b = cameraInfo.orientation;
            }
            if (previewSize != null) {
                android.util.Size size = new android.util.Size(previewSize.width, previewSize.height);
                this.f475046f = size;
                this.f475049i.Y(size.getWidth(), this.f475046f.getHeight());
                com.tencent.mars.xlog.Log.i("MicroMsg.Voip.CaptureRender", "Camera Open Success, preview available : w,h:" + previewSize.width + "," + previewSize.height);
            }
            this.f475050j = true;
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.idkeyStat(159L, 0L, 1L, false);
            g0Var.idkeyStat(159L, 2L, 1L, false);
            xq4.d dVar3 = this.f475049i;
            if (dVar3 != null) {
                dVar3.q(2);
            }
            this.f475050j = false;
            this.f475043c = 1;
            xq4.d dVar4 = this.f475049i;
            if (dVar4 != null) {
                dVar4.o();
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.Voip.CaptureRender", "startPreview:error" + e17.toString());
            return false;
        }
    }

    @Override // xq4.a
    public void e() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.CaptureRender", "StopCapture....mIsInCapture = " + this.f475050j);
        if (this.f475050j && this.f475044d != null) {
            f();
            this.f475050j = false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.CaptureRender", "UnInitCapture....mCameraOpen = " + this.f475048h);
        if (this.f475048h) {
            this.f475043c = 0;
            if (this.f475044d != null && !this.f475044d.f447654c) {
                this.f475044d.d();
            }
            this.f475044d = null;
            this.f475048h = false;
        } else if (this.f475044d != null) {
            this.f475044d.d();
            this.f475044d = null;
            this.f475048h = false;
        }
        xq4.d dVar = this.f475049i;
        if (dVar != null) {
            dVar.q(22);
        }
    }

    @Override // xq4.a
    public boolean f() {
        if (!this.f475050j || this.f475044d == null) {
            return true;
        }
        try {
            xq4.d dVar = this.f475049i;
            if (dVar != null) {
                dVar.q(17);
            }
            this.f475044d.l();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Voip.CaptureRender", "stopPreview:error" + e17.toString());
        }
        this.f475050j = false;
        return true;
    }

    @Override // xq4.a
    public boolean g(int i17, int i18) {
        if (!this.f475041a ? xq4.e.f456113a.f464587h == null : xq4.e.f456113a.f464586g == null) {
            return false;
        }
        android.util.Size size = this.f475046f;
        try {
            android.util.Size h17 = h(this.f475044d, i17, i18);
            if (h17.getWidth() / h17.getHeight() != i17 / i18) {
                return false;
            }
            if (size.getWidth() == this.f475046f.getWidth() && h17.getHeight() == this.f475046f.getHeight()) {
                return false;
            }
            f();
            boolean k17 = !j(this.f475044d, h17.getWidth(), h17.getHeight()) ? k(this.f475044d, 1920, 1080) : false;
            l(this.f475044d, this.f475041a);
            android.hardware.Camera.Parameters c17 = this.f475044d.c();
            this.f475045e = c17;
            android.hardware.Camera.Size previewSize = c17.getPreviewSize();
            if (previewSize != null) {
                this.f475046f = new android.util.Size(previewSize.width, previewSize.height);
            }
            d();
            com.tencent.mars.xlog.Log.i("MicroMsg.Voip.CaptureRender", "switchPreviewSize w:" + i17 + ", h: " + i18);
            this.f475051k = i17;
            this.f475052l = i18;
            android.util.Size size2 = this.f475046f;
            return (size2 == null || size2 == size || k17) ? false : true;
        } catch (java.lang.Exception unused) {
            if (size != null) {
                try {
                    f();
                    this.f475050j = false;
                    j(this.f475044d, size.getWidth(), size.getHeight());
                    d();
                    com.tencent.mars.xlog.Log.i("MicroMsg.Voip.CaptureRender", "error repreview");
                } catch (java.lang.Exception unused2) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Voip.CaptureRender", "boom in recovery camera preview");
                }
            }
            return false;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:(2:6|(2:258|259)(28:8|9|(18:11|(4:15|16|(1:18)(1:87)|(18:20|22|23|(3:76|77|(4:79|75|58|(3:60|(1:62)|63)(2:65|(1:67)))(2:80|81))(1:25)|26|27|28|29|30|(3:32|(2:35|33)|36)|37|38|39|(3:43|(2:46|44)|47)|48|(3:52|(2:55|53)|56)|58|(0)(0)))|90|(0)(0)|26|27|28|29|30|(0)|37|38|39|(4:41|43|(1:44)|47)|48|(4:50|52|(1:53)|56)|58|(0)(0))|91|92|(1:94)|96|(1:98)(8:155|(1:242)(1:161)|162|163|(1:165)|166|(7:183|(1:185)(1:239)|186|(2:200|(3:204|(4:209|(7:211|(2:216|(7:220|(1:235)(1:225)|(5:227|(3:229|230|231)|232|233|231)|234|232|233|231))|236|234|232|233|231)|237|238)|199)(1:203))(1:190)|191|(2:196|197)|199)|(5:172|173|174|175|176)(1:171))|99|(1:101)(1:154)|(1:103)(1:153)|(1:105)(1:152)|106|107|108|109|110|(2:112|(2:115|(2:117|118)))(2:138|(2:140|(2:142|(2:144|145))))|119|120|121|(1:123)|125|126|127|(1:129)|130|131))|120|121|(0)|125|126|127|(0)|130|131) */
    /* JADX WARN: Can't wrap try/catch for region: R(17:(10:(2:6|(2:258|259)(28:8|9|(18:11|(4:15|16|(1:18)(1:87)|(18:20|22|23|(3:76|77|(4:79|75|58|(3:60|(1:62)|63)(2:65|(1:67)))(2:80|81))(1:25)|26|27|28|29|30|(3:32|(2:35|33)|36)|37|38|39|(3:43|(2:46|44)|47)|48|(3:52|(2:55|53)|56)|58|(0)(0)))|90|(0)(0)|26|27|28|29|30|(0)|37|38|39|(4:41|43|(1:44)|47)|48|(4:50|52|(1:53)|56)|58|(0)(0))|91|92|(1:94)|96|(1:98)(8:155|(1:242)(1:161)|162|163|(1:165)|166|(7:183|(1:185)(1:239)|186|(2:200|(3:204|(4:209|(7:211|(2:216|(7:220|(1:235)(1:225)|(5:227|(3:229|230|231)|232|233|231)|234|232|233|231))|236|234|232|233|231)|237|238)|199)(1:203))(1:190)|191|(2:196|197)|199)|(5:172|173|174|175|176)(1:171))|99|(1:101)(1:154)|(1:103)(1:153)|(1:105)(1:152)|106|107|108|109|110|(2:112|(2:115|(2:117|118)))(2:138|(2:140|(2:142|(2:144|145))))|119|120|121|(1:123)|125|126|127|(1:129)|130|131))|120|121|(0)|125|126|127|(0)|130|131)|91|92|(0)|96|(0)(0)|99|(0)(0)|(0)(0)|(0)(0)|106|107|108|109|110|(0)(0)|119) */
    /* JADX WARN: Can't wrap try/catch for region: R(18:11|(4:15|16|(1:18)(1:87)|(18:20|22|23|(3:76|77|(4:79|75|58|(3:60|(1:62)|63)(2:65|(1:67)))(2:80|81))(1:25)|26|27|28|29|30|(3:32|(2:35|33)|36)|37|38|39|(3:43|(2:46|44)|47)|48|(3:52|(2:55|53)|56)|58|(0)(0)))|90|(0)(0)|26|27|28|29|30|(0)|37|38|39|(4:41|43|(1:44)|47)|48|(4:50|52|(1:53)|56)|58|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x05d5, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x05d6, code lost:
    
        com.tencent.mars.xlog.Log.e("MicroMsg.Voip.CaptureRender", "getPreviewFrameRate failed: %s", r0.getMessage());
        r11 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x04b0, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x04b4, code lost:
    
        com.tencent.mars.xlog.Log.e("MicroMsg.Voip.CaptureRender", "getCameraResolution failed: %s", r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x04b2, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x04b3, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01df, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01e0, code lost:
    
        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Voip.CaptureRender", r0, "", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x014f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0150, code lost:
    
        r0.toString();
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x05c3 A[Catch: Exception -> 0x0622, TRY_LEAVE, TryCatch #14 {Exception -> 0x0622, blocks: (B:121:0x05b5, B:123:0x05c3), top: B:120:0x05b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x018c A[Catch: Exception -> 0x01df, TryCatch #10 {Exception -> 0x01df, blocks: (B:39:0x0182, B:41:0x018c, B:43:0x0192, B:44:0x0196, B:46:0x019c, B:48:0x01a5, B:50:0x01af, B:52:0x01b5, B:53:0x01b9, B:55:0x01bf), top: B:38:0x0182 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x019c A[Catch: Exception -> 0x01df, LOOP:1: B:44:0x0196->B:46:0x019c, LOOP_END, TryCatch #10 {Exception -> 0x01df, blocks: (B:39:0x0182, B:41:0x018c, B:43:0x0192, B:44:0x0196, B:46:0x019c, B:48:0x01a5, B:50:0x01af, B:52:0x01b5, B:53:0x01b9, B:55:0x01bf), top: B:38:0x0182 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01af A[Catch: Exception -> 0x01df, TryCatch #10 {Exception -> 0x01df, blocks: (B:39:0x0182, B:41:0x018c, B:43:0x0192, B:44:0x0196, B:46:0x019c, B:48:0x01a5, B:50:0x01af, B:52:0x01b5, B:53:0x01b9, B:55:0x01bf), top: B:38:0x0182 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01bf A[Catch: Exception -> 0x01df, LOOP:2: B:53:0x01b9->B:55:0x01bf, LOOP_END, TRY_LEAVE, TryCatch #10 {Exception -> 0x01df, blocks: (B:39:0x0182, B:41:0x018c, B:43:0x0192, B:44:0x0196, B:46:0x019c, B:48:0x01a5, B:50:0x01af, B:52:0x01b5, B:53:0x01b9, B:55:0x01bf), top: B:38:0x0182 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x020b A[Catch: Exception -> 0x063f, TRY_LEAVE, TryCatch #9 {Exception -> 0x063f, blocks: (B:92:0x0207, B:94:0x020b), top: B:91:0x0207 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0235  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(boolean r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 1667
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zq4.b.i(boolean, int, int):int");
    }

    public final boolean j(wo.d1 d1Var, int i17, int i18) {
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
            com.tencent.mars.xlog.Log.e("MicroMsg.Voip.CaptureRender", "TryPreviewSize fail: " + e17.toString() + ",w" + i17 + ",h" + i18);
            return false;
        }
    }

    public final boolean k(wo.d1 d1Var, int i17, int i18) {
        if (!fp.e0.h() || !fp.h.c(33)) {
            return false;
        }
        if (j(d1Var, i17, i18)) {
            return true;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.Voip.CaptureRender", "tryPreviewSizeApi33 fail: w" + i17 + ",h" + i18);
        return false;
    }

    public final boolean l(wo.d1 d1Var, boolean z17) {
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
}
