package n72;

/* loaded from: classes14.dex */
public class q implements android.view.TextureView.SurfaceTextureListener {
    public com.tencent.mm.plugin.facedetectlight.ui.PreviewFrameLayout A;
    public android.widget.ImageView C;
    public android.widget.ImageView D;
    public android.graphics.Bitmap E;
    public boolean F;
    public final int G;
    public k72.i H;
    public wo.h I;
    public final boolean M;
    public final boolean N;
    public final android.hardware.Camera.PreviewCallback P;
    public final com.tencent.mm.plugin.facedetect.model.u Q;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMTextureView f335272d;

    /* renamed from: e, reason: collision with root package name */
    public android.os.HandlerThread f335273e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f335274f;

    /* renamed from: g, reason: collision with root package name */
    public wo.d1 f335275g;

    /* renamed from: h, reason: collision with root package name */
    public int f335276h;

    /* renamed from: i, reason: collision with root package name */
    public int f335277i;

    /* renamed from: m, reason: collision with root package name */
    public int f335278m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f335279n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f335280o;

    /* renamed from: p, reason: collision with root package name */
    public volatile boolean f335281p;

    /* renamed from: q, reason: collision with root package name */
    public volatile boolean f335282q;

    /* renamed from: r, reason: collision with root package name */
    public volatile boolean f335283r;

    /* renamed from: s, reason: collision with root package name */
    public int f335284s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f335285t;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.plugin.facedetectaction.ui.FaceActionUI f335289x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f335290y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.facedetectaction.ui.FaceActionMask f335291z;

    /* renamed from: u, reason: collision with root package name */
    public android.graphics.Point f335286u = null;

    /* renamed from: v, reason: collision with root package name */
    public android.graphics.Point f335287v = null;

    /* renamed from: w, reason: collision with root package name */
    public android.graphics.Point f335288w = null;
    public int B = 0;

    /* renamed from: J, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f335271J = new com.tencent.mm.sdk.platformtools.n3("mPreviewHandlerThread");
    public final int K = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_face_action_cache_data_size, 5);
    public volatile java.util.concurrent.atomic.AtomicInteger L = new java.util.concurrent.atomic.AtomicInteger(0);

    public q(com.tencent.mm.plugin.facedetectaction.ui.FaceActionUI faceActionUI, k72.i iVar) {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_face_action_copy_data, true);
        this.M = fj6;
        boolean fj7 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_face_action_old_ui_camera_preview_sy, false);
        this.N = fj7;
        this.P = new n72.c(this);
        this.Q = new n72.m(this);
        this.G = 2;
        this.f335289x = faceActionUI;
        this.f335281p = false;
        this.f335283r = false;
        this.f335273e = null;
        this.f335281p = false;
        this.F = false;
        this.H = iVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceReflectCam", "clicfg_face_action_copy_data :%b，enableCameraPreviewSy：%b", java.lang.Boolean.valueOf(fj6), java.lang.Boolean.valueOf(fj7));
    }

    public static void a(n72.q qVar, android.graphics.SurfaceTexture surfaceTexture) {
        qVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceReflectCam", "start Preview");
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceReflectCam", "mIsPreviewing is " + qVar.f335283r);
        if (qVar.f335275g == null || qVar.f335283r) {
            return;
        }
        try {
            qVar.f335275g.i(surfaceTexture);
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceReflectCam", "start Preview failed:" + e17.getMessage());
        }
        com.tencent.mm.plugin.facedetect.model.s.o(qVar.f335276h, qVar.f335277i, 5);
        qVar.f335275g.k();
        qVar.f335283r = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceReflectCam", "start preview, is previewing");
        if (qVar.G == 1) {
            com.tencent.mm.sdk.platformtools.u3.i(new n72.j(qVar), 500L);
        }
    }

    public static boolean b(n72.q qVar) {
        boolean z17;
        android.graphics.Point point;
        boolean z18;
        java.util.Iterator it;
        float f17;
        qVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceReflectCam", "start open camera");
        boolean z19 = false;
        qVar.f335281p = false;
        boolean z27 = true;
        qVar.f335280o = true;
        int d17 = uo.q.f429532a.d();
        int i17 = 0;
        while (true) {
            if (i17 >= d17) {
                i17 = -1;
                break;
            }
            android.hardware.Camera.CameraInfo cameraInfo = new android.hardware.Camera.CameraInfo();
            android.hardware.Camera.getCameraInfo(i17, cameraInfo);
            int i18 = cameraInfo.facing;
            if ((i18 == 1 && qVar.f335280o) || (i18 == 0 && !qVar.f335280o)) {
                break;
            }
            i17++;
        }
        if (i17 != -1) {
            boolean z28 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            android.os.SystemClock.elapsedRealtime();
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceReflectCam", "openCameraRes：" + qVar.I);
            if (qVar.I == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FaceReflectCam", "openCameraRes is null");
                if (qVar.G == 1) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FaceReflectCam", "mFaceReflectController openCameraRe");
                    try {
                        qVar.I = wo.i.d(null, i17, null);
                    } catch (java.lang.Exception unused) {
                    }
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FaceReflectCam", "mFaceActionUI openCameraRe");
                    qVar.I = wo.i.d(qVar.f335289x.getContext(), i17, null);
                }
            }
            if (qVar.I != null) {
                qVar.B = i17;
                qVar.f335281p = true;
                android.os.SystemClock.elapsedRealtime();
                wo.h hVar = qVar.I;
                int i19 = hVar.f447714b;
                qVar.f335278m = i19;
                boolean z29 = i19 % 180 != 0;
                qVar.f335279n = z29;
                wo.d1 d1Var = hVar.f447713a;
                qVar.f335275g = d1Var;
                if (d1Var == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.FaceReflectCam", "in open(), camera == null, bNeedRotate=[%s]", java.lang.Boolean.valueOf(z29));
                    try {
                        throw new java.io.IOException();
                    } catch (java.io.IOException e17) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.FaceReflectCam", "set cameraRotation exception" + e17.getMessage());
                    }
                }
                try {
                    android.hardware.Camera.Parameters c17 = qVar.f335275g.c();
                    if (qVar.G == 1) {
                        throw null;
                    }
                    int i27 = qVar.f335289x.getResources().getDisplayMetrics().widthPixels;
                    int i28 = qVar.f335289x.getResources().getDisplayMetrics().heightPixels;
                    if (c17 != null) {
                        android.graphics.Point point2 = new android.graphics.Point(i27, i28);
                        qVar.f335287v = point2;
                        java.lang.String str = c17.get("preview-size-values");
                        if (str == null) {
                            str = c17.get("preview-size-value");
                        }
                        if (str != null) {
                            java.util.ArrayList arrayList = new java.util.ArrayList(c17.getSupportedPreviewSizes());
                            java.util.Collections.sort(arrayList, new n72.p(null));
                            float f18 = point2.x / point2.y;
                            long w17 = com.tencent.mm.sdk.platformtools.t8.w(com.tencent.mm.sdk.platformtools.x2.f193071a);
                            java.util.Iterator it6 = arrayList.iterator();
                            float f19 = Float.POSITIVE_INFINITY;
                            android.graphics.Point point3 = null;
                            while (true) {
                                if (it6.hasNext()) {
                                    android.hardware.Camera.Size size = (android.hardware.Camera.Size) it6.next();
                                    int i29 = size.width;
                                    int i37 = size.height;
                                    com.tencent.mars.xlog.Log.i("MicroMsg.FaceReflectCam", "realWidth: %d, realHeight: %d", java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i37));
                                    int i38 = i29 * i37;
                                    if (i38 >= 150400 && i38 <= 983040) {
                                        boolean z37 = i29 > i37 ? z27 : z19;
                                        int i39 = z37 ? i37 : i29;
                                        int i47 = z37 ? i29 : i37;
                                        if (i39 == point2.x && i47 == point2.y) {
                                            it = it6;
                                            if (((double) w17) / (((((((double) i39) * ((double) i47)) * 3.0d) / 2.0d) / 1024.0d) / 1024.0d) >= 5.0d) {
                                                point = new android.graphics.Point(i29, i37);
                                                com.tencent.mars.xlog.Log.i("MicroMsg.FaceReflectCam", "Found preview size exactly matching screen size: " + point);
                                                break;
                                            }
                                        } else {
                                            it = it6;
                                        }
                                        float abs = java.lang.Math.abs((i39 / i47) - f18);
                                        if (i29 % 10 == 0) {
                                            if (abs < f19) {
                                                f17 = f18;
                                                if (((double) w17) / (((((((double) i29) * ((double) i37)) * 3.0d) / 2.0d) / 1024.0d) / 1024.0d) >= 5.0d) {
                                                    f19 = abs;
                                                    point3 = new android.graphics.Point(i29, i37);
                                                }
                                            } else {
                                                f17 = f18;
                                            }
                                            com.tencent.mars.xlog.Log.i("MicroMsg.FaceReflectCam", "diff:[%s] newdiff:[%s] w:[%s] h:[%s]", java.lang.Float.valueOf(f19), java.lang.Float.valueOf(abs), java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i37));
                                            z19 = false;
                                            z27 = true;
                                            f18 = f17;
                                            it6 = it;
                                        }
                                    } else {
                                        it = it6;
                                    }
                                    f17 = f18;
                                    z19 = false;
                                    z27 = true;
                                    f18 = f17;
                                    it6 = it;
                                } else {
                                    if (point3 == null) {
                                        android.hardware.Camera.Size previewSize = c17.getPreviewSize();
                                        if (previewSize != null) {
                                            point3 = new android.graphics.Point(previewSize.width, previewSize.height);
                                            com.tencent.mars.xlog.Log.i("MicroMsg.FaceReflectCam", "No suitable preview sizes, using default: " + point3);
                                        } else {
                                            com.tencent.mars.xlog.Log.e("MicroMsg.FaceReflectCam", "hy: can not find default size!!");
                                        }
                                    }
                                    com.tencent.mars.xlog.Log.i("MicroMsg.FaceReflectCam", "Found best approximate preview size: " + point3);
                                    point = point3;
                                }
                            }
                        } else {
                            point = null;
                        }
                        if (point == null) {
                            throw null;
                        }
                        qVar.f335286u = point;
                        qVar.f335288w = new android.graphics.Point(qVar.f335286u);
                        java.util.Objects.toString(qVar.f335287v);
                        java.util.Objects.toString(qVar.f335286u);
                        java.util.Objects.toString(qVar.f335288w);
                        android.graphics.Point point4 = qVar.f335286u;
                        int i48 = point4.x;
                        qVar.f335276h = i48;
                        int i49 = point4.y;
                        qVar.f335277i = i49;
                        c17.setPreviewSize(i48, i49);
                        com.tencent.mars.xlog.Log.e("MicroMsg.FaceReflectCam", "mDesiredPreviewWidth：" + qVar.f335276h);
                        com.tencent.mars.xlog.Log.e("MicroMsg.FaceReflectCam", "mDesiredPreviewHeight：" + qVar.f335277i);
                        c17.setZoom(0);
                        c17.setSceneMode("auto");
                        try {
                            if (c17.getSupportedFocusModes() == null || !c17.getSupportedFocusModes().contains("auto")) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.FaceReflectCam", "camera not support FOCUS_MODE_AUTO");
                            } else {
                                com.tencent.mars.xlog.Log.i("MicroMsg.FaceReflectCam", "set FocusMode to FOCUS_MODE_AUTO");
                                c17.setFocusMode("auto");
                            }
                        } catch (java.lang.Exception e18) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.FaceReflectCam", "set focus mode error: %s", e18.getMessage());
                        }
                        java.util.List<java.lang.Integer> supportedPreviewFormats = c17.getSupportedPreviewFormats();
                        java.util.Iterator<java.lang.Integer> it7 = supportedPreviewFormats.iterator();
                        boolean z38 = false;
                        while (true) {
                            if (!it7.hasNext()) {
                                z18 = false;
                                break;
                            }
                            int intValue = it7.next().intValue();
                            if (intValue == 17) {
                                z18 = true;
                                break;
                            }
                            if (intValue == 842094169) {
                                z38 = true;
                            }
                        }
                        if (z18) {
                            c17.setPreviewFormat(17);
                        } else if (z38) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.FaceReflectCam", "Preview not support PixelFormat.YCbCr_420_SP, but hasYU12");
                            c17.setPreviewFormat(842094169);
                        } else {
                            com.tencent.mars.xlog.Log.e("MicroMsg.FaceReflectCam", "Preview not support PixelFormat.YCbCr_420_SP. Use format: %s", supportedPreviewFormats.get(0));
                            c17.setPreviewFormat(supportedPreviewFormats.get(0).intValue());
                        }
                        if (qVar.f335279n) {
                            c17.setRotation(qVar.f335278m);
                        }
                        double d18 = qVar.f335276h / qVar.f335277i;
                        if (qVar.A.getmAspectRatio() != d18) {
                            com.tencent.mm.sdk.platformtools.u3.h(new n72.i(qVar, d18));
                        }
                        if (wo.v1.f447822b.f447675t > 0) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.FaceReflectCam", "set frame rate > 0, do not try set preview fps range");
                        } else {
                            java.util.List<int[]> supportedPreviewFpsRange = c17.getSupportedPreviewFpsRange();
                            if (supportedPreviewFpsRange != null && supportedPreviewFpsRange.size() != 0) {
                                int size2 = supportedPreviewFpsRange.size();
                                int i57 = Integer.MIN_VALUE;
                                int i58 = Integer.MIN_VALUE;
                                boolean z39 = false;
                                for (int i59 = 0; i59 < size2; i59++) {
                                    int[] iArr = supportedPreviewFpsRange.get(i59);
                                    if (iArr != null && iArr.length > 1) {
                                        int i66 = iArr[0];
                                        int i67 = iArr[1];
                                        com.tencent.mars.xlog.Log.i("MicroMsg.FaceReflectCam", "dkfps %d:[%d %d]", java.lang.Integer.valueOf(i59), java.lang.Integer.valueOf(i66), java.lang.Integer.valueOf(i67));
                                        if (i66 >= 0 && i67 >= i66) {
                                            if (i67 >= i58 && !z39) {
                                                i58 = i67;
                                                i57 = i66;
                                            }
                                            if (i67 >= 30000) {
                                                z39 = true;
                                            }
                                        }
                                    }
                                }
                                com.tencent.mars.xlog.Log.i("MicroMsg.FaceReflectCam", "dkfps get fit  [%d %d], max target fps %d", java.lang.Integer.valueOf(i57), java.lang.Integer.valueOf(i58), 30);
                                if (i57 != Integer.MAX_VALUE && i58 != Integer.MAX_VALUE) {
                                    try {
                                        c17.setPreviewFpsRange(i57, i58);
                                        com.tencent.mars.xlog.Log.i("MicroMsg.FaceReflectCam", "set fps range %d %d", java.lang.Integer.valueOf(i57), java.lang.Integer.valueOf(i58));
                                    } catch (java.lang.Exception e19) {
                                        com.tencent.mars.xlog.Log.i("MicroMsg.FaceReflectCam", "trySetPreviewFpsRangeParameters Exception, %s, %s", android.os.Looper.myLooper(), e19.getMessage());
                                    }
                                }
                            }
                        }
                        java.util.List<int[]> supportedPreviewFpsRange2 = c17.getSupportedPreviewFpsRange();
                        supportedPreviewFpsRange2.size();
                        for (int i68 = 0; i68 < supportedPreviewFpsRange2.size(); i68++) {
                            for (int i69 : supportedPreviewFpsRange2.get(i68)) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.FaceReflectCam", "Camera SupportedPreviewFpsRange：", java.lang.Integer.valueOf(i69));
                            }
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.FaceReflectCam", "Camera preview-fps-range：" + c17.get("preview-fps-range"));
                        com.tencent.mars.xlog.Log.i("MicroMsg.FaceReflectCam", "Camera preview-fps-range：" + c17.get("preview-frame-rate"));
                        try {
                            qVar.f335275g.f(c17);
                        } catch (java.lang.Exception e27) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FaceReflectCam", e27, "setParameters error", new java.lang.Object[0]);
                        }
                        return qVar.f335281p;
                    }
                } catch (java.lang.Exception e28) {
                    z17 = false;
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FaceReflectCam", e28, "camera getParameters error: %s", e28.getMessage());
                }
            } else {
                z17 = false;
                com.tencent.mars.xlog.Log.i("MicroMsg.FaceReflectCam", "in open(), openCameraRes == null");
                try {
                    throw new java.io.IOException();
                } catch (java.io.IOException e29) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FaceReflectCam", "set cameraRes exception" + e29.getMessage());
                }
            }
            return z17;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceReflectCam", "not found available camera id");
        z17 = false;
        return z17;
    }

    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceReflectCam", "closeCamera start");
        this.f335272d = null;
        this.H = null;
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f335271J;
        if (n3Var != null) {
            n3Var.quit();
            this.f335271J = null;
        }
        if (this.f335275g != null) {
            try {
                if (this.f335283r) {
                    this.f335283r = false;
                    this.f335275g.l();
                    this.f335275g.g(null);
                    com.tencent.mars.xlog.Log.i("MicroMsg.FaceReflectCam", "stop preview, not previewing");
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FaceReflectCam", "Error setting camera preview: " + e17.getMessage());
            }
            try {
                try {
                    this.f335275g.d();
                    this.f335275g = null;
                    com.tencent.mm.plugin.facedetect.model.v.b().d(this.Q);
                    k72.j.f304725a.f304730e = null;
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FaceReflectCam", "Error setting camera preview: " + e18.getMessage());
                }
            } finally {
                this.f335275g = null;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceReflectCam", "closeCamera end");
    }

    public final void d(android.graphics.SurfaceTexture surfaceTexture) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceReflectCam", "openCameraForSurfaceTexture");
        if (this.G == 1) {
            throw null;
        }
        this.f335291z.setVisibility(0);
        g();
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f335274f;
        if (n3Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceReflectCam", "back thread is not running");
        } else {
            n3Var.post(new n72.f(this));
            this.f335274f.post(new n72.g(this, surfaceTexture));
        }
    }

    public void e(android.hardware.Camera.PreviewCallback previewCallback) {
        wo.d1 d1Var = this.f335275g;
        if (d1Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FaceReflectCam", "hy: camera is null. setPreviewCallback failed");
            return;
        }
        int bitsPerPixel = ((this.f335276h * this.f335277i) * android.graphics.ImageFormat.getBitsPerPixel(d1Var.c().getPreviewFormat())) / 8;
        for (int i17 = 0; i17 < this.K; i17++) {
            this.f335275g.a(com.tencent.mm.plugin.facedetect.model.s.f100033d.m(java.lang.Integer.valueOf(bitsPerPixel)));
        }
        this.f335275g.h(new n72.b(this, previewCallback));
        com.tencent.mm.plugin.facedetect.model.v.b().a(this.Q);
    }

    public void f(com.tencent.mm.ui.base.MMTextureView mMTextureView) {
        this.f335272d = mMTextureView;
        if (mMTextureView.isAvailable()) {
            d(mMTextureView.getSurfaceTexture());
        }
        this.f335272d.setSurfaceTextureListener(this);
        this.f335272d.setVisibility(0);
        this.f335272d.setAlpha(0.0f);
        if (this.G != 2 || this.F) {
            return;
        }
        com.tencent.mm.sdk.platformtools.u3.i(new n72.d(this), 700L);
    }

    public void g() {
        if (this.f335273e == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceReflectCam", "start camera thread");
            int i17 = pu5.i.f358473b;
            android.os.HandlerThread a17 = pu5.f.a("cameraBackground", 5);
            this.f335273e = a17;
            a17.start();
            this.f335274f = new com.tencent.mm.sdk.platformtools.n3(this.f335273e.getLooper());
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceReflectCam", "onSurfaceTextureAvailable, width: %s, height: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        d(surfaceTexture);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceReflectCam", "surfaceDestroyed");
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f335274f;
        if (n3Var != null) {
            n3Var.post(new n72.h(this));
            if (this.f335273e != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FaceReflectCam", "stop camera thread");
                try {
                    java.lang.Thread.sleep(500L, 0);
                } catch (java.lang.InterruptedException e17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FaceReflectCam", "background thread sleep error：" + e17.getMessage());
                }
                this.f335273e.quitSafely();
                try {
                    this.f335273e.join();
                    this.f335273e = null;
                    this.f335274f = null;
                } catch (java.lang.InterruptedException e18) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FaceReflectCam", "stop xbackground thread error：" + e18.getMessage());
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.FaceReflectCam", "stop camera thread finish");
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceReflectCam", "back thread is not running");
        }
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
    }
}
