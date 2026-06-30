package com.tencent.mm.plugin.flash;

/* loaded from: classes14.dex */
public class d0 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMTextureView f137198a;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f137200c;

    /* renamed from: d, reason: collision with root package name */
    public wo.d1 f137201d;

    /* renamed from: e, reason: collision with root package name */
    public int f137202e;

    /* renamed from: f, reason: collision with root package name */
    public int f137203f;

    /* renamed from: g, reason: collision with root package name */
    public int f137204g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f137205h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f137206i;

    /* renamed from: p, reason: collision with root package name */
    public wo.h f137213p;

    /* renamed from: q, reason: collision with root package name */
    public android.content.Context f137214q;

    /* renamed from: l, reason: collision with root package name */
    public android.graphics.Point f137209l = null;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.Point f137210m = null;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.Point f137211n = null;

    /* renamed from: o, reason: collision with root package name */
    public int f137212o = 0;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.plugin.facedetect.model.u f137215r = new com.tencent.mm.plugin.flash.z(this);

    /* renamed from: k, reason: collision with root package name */
    public boolean f137208k = false;

    /* renamed from: b, reason: collision with root package name */
    public android.os.HandlerThread f137199b = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f137207j = false;

    public d0(android.content.Context context) {
        this.f137214q = context;
    }

    public static boolean a(com.tencent.mm.plugin.flash.d0 d0Var) {
        boolean z17;
        android.graphics.Point point;
        boolean z18;
        java.util.Iterator it;
        float f17;
        android.graphics.Point point2;
        d0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerCamera", "start open camera");
        boolean z19 = false;
        d0Var.f137207j = false;
        boolean z27 = true;
        d0Var.f137206i = true;
        int numberOfCameras = android.hardware.Camera.getNumberOfCameras();
        int i17 = 0;
        while (true) {
            if (i17 >= numberOfCameras) {
                i17 = -1;
                break;
            }
            try {
                android.hardware.Camera.CameraInfo cameraInfo = new android.hardware.Camera.CameraInfo();
                android.hardware.Camera.getCameraInfo(i17, cameraInfo);
                int i18 = cameraInfo.facing;
                if (i18 == 1 && d0Var.f137206i) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.FaceFlashManagerCamera", "openCamera found front Camera ");
                    break;
                }
                if (i18 == 0 && !d0Var.f137206i) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.FaceFlashManagerCamera", "openCamera found front Camera");
                    break;
                }
                i17++;
            } catch (java.lang.Exception e17) {
                z17 = false;
                com.tencent.mars.xlog.Log.e("MicroMsg.FaceFlashManagerCamera", "find camera info failed：%s", e17.getMessage());
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerCamera", "find camera info success");
        if (i17 == -1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerCamera", "not found available camera id");
        } else {
            boolean z28 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            if (d0Var.f137213p == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerCamera", "openCameraRes is null");
                try {
                    d0Var.f137213p = wo.i.d(d0Var.f137214q, i17, null);
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FaceFlashManagerCamera", e18, "MicroMsg.FaceFlashManagerError", new java.lang.Object[0]);
                }
            }
            if (d0Var.f137213p == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FaceFlashManagerCamera", "in open(), openCameraRes == null");
            } else {
                d0Var.f137212o = i17;
                d0Var.f137207j = true;
                com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerCamera", "openCamera done, cameraId=[%s] costTime=[%s]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
                wo.h hVar = d0Var.f137213p;
                int i19 = hVar.f447714b;
                d0Var.f137204g = i19;
                boolean z29 = i19 % 180 != 0;
                d0Var.f137205h = z29;
                wo.d1 d1Var = hVar.f447713a;
                d0Var.f137201d = d1Var;
                if (d1Var == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerCamera", "in open(), camera == null, bNeedRotate=[%s]", java.lang.Boolean.valueOf(z29));
                } else {
                    try {
                        android.hardware.Camera.Parameters c17 = d1Var.c();
                        if (c17 != null) {
                            android.graphics.Point point3 = new android.graphics.Point(d0Var.f137214q.getResources().getDisplayMetrics().widthPixels, d0Var.f137214q.getResources().getDisplayMetrics().heightPixels);
                            d0Var.f137210m = point3;
                            java.lang.String str = c17.get("preview-size-values");
                            if (str == null) {
                                str = c17.get("preview-size-value");
                            }
                            if (str != null) {
                                java.util.ArrayList arrayList = new java.util.ArrayList(c17.getSupportedPreviewSizes());
                                java.util.Collections.sort(arrayList, new com.tencent.mm.plugin.flash.c0(null));
                                float f18 = point3.x / point3.y;
                                long w17 = com.tencent.mm.sdk.platformtools.t8.w(com.tencent.mm.sdk.platformtools.x2.f193071a);
                                java.util.Iterator it6 = arrayList.iterator();
                                float f19 = Float.POSITIVE_INFINITY;
                                android.graphics.Point point4 = null;
                                while (true) {
                                    if (it6.hasNext()) {
                                        android.hardware.Camera.Size size = (android.hardware.Camera.Size) it6.next();
                                        int i27 = size.width;
                                        int i28 = size.height;
                                        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerCamera", "realWidth: %d, realHeight: %d", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28));
                                        int i29 = i27 * i28;
                                        if (i29 >= 150400 && i29 <= 983040) {
                                            boolean z37 = i27 > i28 ? z27 : z19;
                                            int i37 = z37 ? i28 : i27;
                                            int i38 = z37 ? i27 : i28;
                                            if (i37 == point3.x && i38 == point3.y) {
                                                it = it6;
                                                if (((double) w17) / (((((((double) i37) * ((double) i38)) * 3.0d) / 2.0d) / 1024.0d) / 1024.0d) >= 5.0d) {
                                                    point = new android.graphics.Point(i27, i28);
                                                    com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerCamera", "Found preview size exactly matching screen size: " + point);
                                                    break;
                                                }
                                            } else {
                                                it = it6;
                                            }
                                            float abs = java.lang.Math.abs((i37 / i38) - f18);
                                            if (i27 % 10 == 0) {
                                                if (abs < f19) {
                                                    f17 = f18;
                                                    point2 = point3;
                                                    if (((double) w17) / (((((((double) i27) * ((double) i28)) * 3.0d) / 2.0d) / 1024.0d) / 1024.0d) >= 5.0d) {
                                                        f19 = abs;
                                                        point4 = new android.graphics.Point(i27, i28);
                                                    }
                                                } else {
                                                    f17 = f18;
                                                    point2 = point3;
                                                }
                                                com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerCamera", "diff:[%s] newdiff:[%s] w:[%s] h:[%s]", java.lang.Float.valueOf(f19), java.lang.Float.valueOf(abs), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28));
                                                z19 = false;
                                                z27 = true;
                                                point3 = point2;
                                                f18 = f17;
                                                it6 = it;
                                            }
                                        } else {
                                            it = it6;
                                        }
                                        f17 = f18;
                                        point2 = point3;
                                        z19 = false;
                                        z27 = true;
                                        point3 = point2;
                                        f18 = f17;
                                        it6 = it;
                                    } else {
                                        if (point4 == null) {
                                            android.hardware.Camera.Size previewSize = c17.getPreviewSize();
                                            if (previewSize != null) {
                                                point4 = new android.graphics.Point(previewSize.width, previewSize.height);
                                                com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerCamera", "No suitable preview sizes, using default: " + point4);
                                            } else {
                                                com.tencent.mars.xlog.Log.e("MicroMsg.FaceFlashManagerCamera", "hy: can not find default size!!");
                                            }
                                        }
                                        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerCamera", "Found best approximate preview size: " + point4);
                                        point = point4;
                                    }
                                }
                            } else {
                                point = null;
                            }
                            if (point == null) {
                                throw null;
                            }
                            d0Var.f137209l = point;
                            d0Var.f137211n = new android.graphics.Point(d0Var.f137209l);
                            java.util.Objects.toString(d0Var.f137210m);
                            java.util.Objects.toString(d0Var.f137209l);
                            java.util.Objects.toString(d0Var.f137211n);
                            android.graphics.Point point5 = d0Var.f137209l;
                            int i39 = point5.x;
                            d0Var.f137202e = i39;
                            int i47 = point5.y;
                            d0Var.f137203f = i47;
                            c17.setPreviewSize(i39, i47);
                            c17.setZoom(0);
                            c17.setSceneMode("auto");
                            try {
                                if (c17.getSupportedFocusModes() == null || !c17.getSupportedFocusModes().contains("auto")) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerCamera", "camera not support FOCUS_MODE_AUTO");
                                } else {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerCamera", "set FocusMode to FOCUS_MODE_AUTO");
                                    c17.setFocusMode("auto");
                                }
                            } catch (java.lang.Exception e19) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.FaceFlashManagerCamera", "set focus mode error: %s", e19.getMessage());
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
                                com.tencent.mars.xlog.Log.e("MicroMsg.FaceFlashManagerCamera", "Preview not support PixelFormat.YCbCr_420_SP, but hasYU12");
                                c17.setPreviewFormat(842094169);
                            } else {
                                com.tencent.mars.xlog.Log.e("MicroMsg.FaceFlashManagerCamera", "Preview not support PixelFormat.YCbCr_420_SP. Use format: %s", supportedPreviewFormats.get(0));
                                c17.setPreviewFormat(supportedPreviewFormats.get(0).intValue());
                            }
                            if (d0Var.f137205h) {
                                c17.setRotation(d0Var.f137204g);
                            }
                            if (wo.v1.f447822b.f447675t > 0) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerCamera", "set frame rate > 0, do not try set preview fps range");
                            } else {
                                java.util.List<int[]> supportedPreviewFpsRange = c17.getSupportedPreviewFpsRange();
                                if (supportedPreviewFpsRange != null && supportedPreviewFpsRange.size() != 0) {
                                    int size2 = supportedPreviewFpsRange.size();
                                    int i48 = Integer.MIN_VALUE;
                                    int i49 = Integer.MIN_VALUE;
                                    boolean z39 = false;
                                    for (int i57 = 0; i57 < size2; i57++) {
                                        int[] iArr = supportedPreviewFpsRange.get(i57);
                                        if (iArr != null && iArr.length > 1) {
                                            int i58 = iArr[0];
                                            int i59 = iArr[1];
                                            com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerCamera", "dkfps %d:[%d %d]", java.lang.Integer.valueOf(i57), java.lang.Integer.valueOf(i58), java.lang.Integer.valueOf(i59));
                                            if (i58 >= 0 && i59 >= i58) {
                                                if (i59 >= i49 && !z39) {
                                                    i49 = i59;
                                                    i48 = i58;
                                                }
                                                if (i59 >= 30000) {
                                                    z39 = true;
                                                }
                                            }
                                        }
                                    }
                                    com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerCamera", "dkfps get fit  [%d %d], max target fps %d", java.lang.Integer.valueOf(i48), java.lang.Integer.valueOf(i49), 30);
                                    if (i48 != Integer.MAX_VALUE && i49 != Integer.MAX_VALUE) {
                                        try {
                                            c17.setPreviewFpsRange(i48, i49);
                                            com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerCamera", "set fps range %d %d", java.lang.Integer.valueOf(i48), java.lang.Integer.valueOf(i49));
                                        } catch (java.lang.Exception e27) {
                                            com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerCamera", "trySetPreviewFpsRangeParameters Exception, %s, %s", android.os.Looper.myLooper(), e27.getMessage());
                                        }
                                    }
                                }
                            }
                            java.util.List<int[]> supportedPreviewFpsRange2 = c17.getSupportedPreviewFpsRange();
                            supportedPreviewFpsRange2.size();
                            for (int i66 = 0; i66 < supportedPreviewFpsRange2.size(); i66++) {
                                for (int i67 : supportedPreviewFpsRange2.get(i66)) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerCamera", "Camera SupportedPreviewFpsRange：", java.lang.Integer.valueOf(i67));
                                }
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerCamera", "Camera preview-fps-range：" + c17.get("preview-fps-range"));
                            com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerCamera", "Camera preview-fps-range：" + c17.get("preview-frame-rate"));
                            try {
                                d0Var.f137201d.f(c17);
                            } catch (java.lang.Exception e28) {
                                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FaceFlashManagerCamera", e28, "setParameters error", new java.lang.Object[0]);
                            }
                            return d0Var.f137207j;
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerCamera", "in open(), parameters == null");
                    } catch (java.lang.Exception e29) {
                        z17 = false;
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FaceFlashManagerCamera", e29, "camera getParameters error: %s", e29.getMessage());
                    }
                }
            }
        }
        z17 = false;
        return z17;
    }

    public float b() {
        try {
            java.lang.String str = this.f137201d.c().get("preview-size");
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerCamera", "preview size:%s", str);
            java.lang.String[] split = str.split("x");
            return (java.lang.Integer.parseInt(split[0]) * 1.0f) / java.lang.Integer.parseInt(split[1]);
        } catch (java.lang.Exception unused) {
            return 1.0f;
        }
    }

    public android.graphics.Point c() {
        try {
            java.lang.String str = this.f137201d.c().get("preview-size");
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerCamera", "preview size:%s", str);
            java.lang.String[] split = str.split("x");
            this.f137202e = java.lang.Integer.parseInt(split[0]);
            this.f137203f = java.lang.Integer.parseInt(split[1]);
        } catch (java.lang.Exception unused) {
        }
        return new android.graphics.Point(this.f137202e, this.f137203f);
    }

    public void d(com.tencent.mm.ui.base.MMTextureView mMTextureView, com.tencent.mm.plugin.flash.b0 b0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerCamera", "openCameraForSurfaceTexture");
        this.f137198a = mMTextureView;
        if (this.f137199b == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerCamera", "start camera thread");
            int i17 = pu5.i.f358473b;
            android.os.HandlerThread a17 = pu5.f.a("cameraBackground", 5);
            this.f137199b = a17;
            a17.start();
            this.f137200c = new com.tencent.mm.sdk.platformtools.n3(this.f137199b.getLooper());
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f137200c;
        if (n3Var != null) {
            n3Var.post(new com.tencent.mm.plugin.flash.v(this, b0Var));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerCamera", "back thread is not running");
        }
    }

    public void e(android.hardware.Camera.PreviewCallback previewCallback) {
        wo.d1 d1Var = this.f137201d;
        if (d1Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FaceFlashManagerCamera", "hy: camera is null. setPreviewCallback failed");
            return;
        }
        int bitsPerPixel = ((this.f137202e * this.f137203f) * android.graphics.ImageFormat.getBitsPerPixel(d1Var.c().getPreviewFormat())) / 8;
        for (int i17 = 0; i17 < 5; i17++) {
            this.f137201d.a(com.tencent.mm.plugin.facedetect.model.s.f100033d.m(java.lang.Integer.valueOf(bitsPerPixel)));
        }
        this.f137201d.h(new com.tencent.mm.plugin.flash.y(this, previewCallback));
        com.tencent.mm.plugin.facedetect.model.v.b().a(this.f137215r);
    }

    public boolean f(android.graphics.SurfaceTexture surfaceTexture, com.tencent.mm.plugin.flash.b0 b0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerCamera", "mIsPreviewing is " + this.f137208k);
        if (this.f137201d != null && !this.f137208k) {
            this.f137208k = true;
            this.f137200c.post(new com.tencent.mm.plugin.flash.x(this, surfaceTexture, b0Var));
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerCamera", "start preview, is previewing");
        }
        return this.f137208k;
    }

    public void g() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerCamera", "stopPreview, isPreviewing: %s", java.lang.Boolean.valueOf(this.f137208k));
        wo.d1 d1Var = this.f137201d;
        if (d1Var == null || d1Var.f447654c || !this.f137208k) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerCamera", "just stopPreview");
        this.f137201d.l();
        this.f137208k = false;
        com.tencent.mm.plugin.facedetect.model.s.f100033d.c();
    }
}
