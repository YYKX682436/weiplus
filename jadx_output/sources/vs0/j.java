package vs0;

/* loaded from: classes10.dex */
public class j extends ts0.b {
    public final float A;
    public final java.util.concurrent.Semaphore B;
    public android.hardware.camera2.CameraManager C;
    public android.hardware.camera2.CameraDevice D;
    public android.hardware.camera2.CaptureRequest.Builder E;
    public android.hardware.camera2.CameraCaptureSession F;
    public android.hardware.camera2.CaptureRequest G;
    public android.hardware.camera2.CameraCharacteristics H;
    public vs0.b I;

    /* renamed from: J, reason: collision with root package name */
    public android.graphics.Rect f439854J;
    public boolean K;
    public boolean L;
    public android.view.Surface M;
    public android.graphics.Rect N;
    public float[] O;
    public android.media.ImageReader P;
    public final vs0.h Q;
    public final vs0.f R;
    public int S;
    public final android.hardware.camera2.CameraCaptureSession.CaptureCallback T;
    public int U;

    /* renamed from: w, reason: collision with root package name */
    public boolean f439855w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f439856x;

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.String f439857y;

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.String f439858z;

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        sparseIntArray.append(0, 90);
        sparseIntArray.append(1, 0);
        sparseIntArray.append(2, 270);
        sparseIntArray.append(3, 180);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(android.content.Context context) {
        super(context);
        int i17;
        kotlin.jvm.internal.o.g(context, "context");
        this.f439855w = true;
        this.f439857y = "MicroMsg.CommonCamera2";
        this.f439858z = "MicroMsg.CommonCamera2.FoucsTag";
        this.A = 0.1f;
        this.B = new java.util.concurrent.Semaphore(1);
        wo.g1 g1Var = wo.v1.f447829i;
        if ((g1Var == null || (i17 = g1Var.f447707u) == -1 || i17 != 1) ? false : true) {
            ws0.g gVar = new ws0.g(context);
            new java.lang.Thread(new ws0.e(gVar, new ws0.f(gVar, vs0.d.f439849d))).start();
            vs0.c cVar = vs0.c.f439830a;
            vs0.c.f439835f = true;
            vs0.c.f439836g = false;
            vs0.c.f439837h = true;
            vs0.c.f439839j = true;
            vs0.c.f439840k = null;
            vs0.c.f439841l = 40;
            vs0.c.f439842m = 40;
            vs0.c.f439843n = false;
            vs0.c.f439845p = null;
        }
        this.Q = new vs0.h(this);
        this.R = new vs0.f(this);
        this.T = new vs0.g(this);
    }

    @Override // ts0.r
    public float[] A() {
        android.hardware.camera2.CameraCharacteristics cameraCharacteristics;
        if (this.O == null && (cameraCharacteristics = this.H) != null) {
            java.lang.Float f17 = (java.lang.Float) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
            if (f17 == null) {
                f17 = java.lang.Float.valueOf(0.0f);
            }
            float f18 = 10;
            int floatValue = (int) (((((int) (f17.floatValue() * f18)) * 1.0f) / f18) * f18);
            this.O = new float[floatValue];
            for (int i17 = 0; i17 < floatValue; i17++) {
                float[] fArr = this.O;
                kotlin.jvm.internal.o.d(fArr);
                fArr[i17] = 1 + ((i17 * 1.0f) / f18);
            }
        }
        return this.O;
    }

    @Override // ts0.r
    public void B(int i17) {
        gt0.c cVar;
        java.util.HashMap hashMap;
        gt0.b bVar;
        java.lang.Boolean bool;
        java.util.HashMap hashMap2;
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
        com.tencent.mars.xlog.Log.i(this.f439857y, "startPreview Texture:: sightTest %s, config list: setFPS[%s], setYUV420SP[%B], useMetering[%B], useContinueFocus[%B] mUseContinueVideoFocusMode[%B]", objArr);
        boolean z17 = !(eVar.f447678w == 1 && (valueOf.intValue() == 0 || valueOf.intValue() == 1)) && eVar.f447677v == 1 && (valueOf.intValue() == 0 || valueOf.intValue() == 5);
        gt0.c cVar2 = this.f421531m;
        if (cVar2 != null) {
            if ((cVar2 != null ? cVar2.f275368a : null) != null) {
                if (((cVar2 == null || (hashMap2 = cVar2.f275368a) == null) ? null : (gt0.b) hashMap2.get(java.lang.Integer.valueOf(e()))) != null && (cVar = this.f421531m) != null && (hashMap = cVar.f275368a) != null && (bVar = (gt0.b) hashMap.get(java.lang.Integer.valueOf(e()))) != null && (bool = bVar.f275367d) != null) {
                    z17 = bool.booleanValue();
                }
            }
        }
        android.hardware.camera2.CameraCharacteristics cameraCharacteristics = this.H;
        if (cameraCharacteristics != null) {
            java.lang.String str = this.f421521c;
            try {
                if (z17) {
                    c0(cameraCharacteristics, i17);
                } else {
                    b0(cameraCharacteristics, i17);
                }
                android.hardware.camera2.CaptureRequest.Builder builder = this.E;
                com.tencent.mars.xlog.Log.i(str, "use fix mode %B, supported preview frame rates %s", java.lang.Boolean.valueOf(z17), builder != null ? (android.util.Range) builder.get(android.hardware.camera2.CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE) : null);
                U();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.i(str, "setPreviewFrameRate Exception, %s, %s", android.os.Looper.myLooper(), e17.getMessage());
            }
        }
    }

    @Override // ts0.b
    public boolean D() {
        vs0.c cVar = vs0.c.f439830a;
        int i17 = vs0.c.f439833d;
        return i17 == 90 || i17 == 270;
    }

    @Override // ts0.b
    public android.util.Size[] F() {
        android.hardware.camera2.CameraCharacteristics cameraCharacteristics;
        android.hardware.camera2.CameraCharacteristics cameraCharacteristics2;
        try {
            android.hardware.camera2.CameraManager cameraManager = this.C;
            if (cameraManager != null) {
                vs0.c cVar = vs0.c.f439830a;
                java.lang.String str = vs0.c.f439832c;
                kotlin.jvm.internal.o.d(str);
                cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
            } else {
                cameraCharacteristics = null;
            }
            this.H = cameraCharacteristics;
            vs0.c cVar2 = vs0.c.f439830a;
            java.lang.String str2 = vs0.c.f439832c;
            if (str2 == null) {
                str2 = cVar2.b(1);
            }
            android.hardware.camera2.CameraManager cameraManager2 = vs0.c.f439831b;
            android.hardware.camera2.params.StreamConfigurationMap streamConfigurationMap = (cameraManager2 == null || (cameraCharacteristics2 = cameraManager2.getCameraCharacteristics(str2)) == null) ? null : (android.hardware.camera2.params.StreamConfigurationMap) cameraCharacteristics2.get(android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            r0 = streamConfigurationMap != null ? streamConfigurationMap.getOutputSizes(android.graphics.SurfaceTexture.class) : null;
            kotlin.jvm.internal.o.d(r0);
            cVar2.d(r0, "preview");
        } catch (java.lang.Exception unused) {
        }
        return r0;
    }

    @Override // ts0.b
    public boolean I(int i17) {
        java.lang.String str = this.f439857y;
        try {
            super.I(i17);
            boolean D = D();
            android.graphics.Point E = E();
            vs0.c cVar = vs0.c.f439830a;
            di3.s c17 = di3.t.c(cVar.c(), E, i17, D);
            if (c17.f232757a == null) {
                c17 = di3.t.h(cVar.c(), new android.graphics.Point(java.lang.Math.min(E().x, E().y), java.lang.Math.max(E().x, E().y)), this.f421522d, D);
            }
            if (c17.f232757a == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Camera2ProcessIDKeyStat", "markErrorFindImage");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1099L, 12L, 1L);
                com.tencent.mars.xlog.Log.i(str, "checkMore start %s", c17.toString());
                c17.f232757a = c17.f232760d;
                c17.f232758b = c17.f232761e;
                c17.f232759c = c17.f232762f;
            }
            vs0.c.f439834e = E;
            android.graphics.Point point = c17.f232757a;
            android.util.Size size = new android.util.Size(point.x, point.y);
            android.media.ImageReader newInstance = android.media.ImageReader.newInstance(size.getWidth(), size.getHeight(), 35, 1);
            us0.c cVar2 = this.f421523e;
            newInstance.setOnImageAvailableListener(cVar2.f430459m, cVar2.f430449c);
            this.P = newInstance;
            return true;
        } catch (android.hardware.camera2.CameraAccessException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(str, e17, "selectNoCropPreviewSize Exception by camera access exception, %s, %s", android.os.Looper.myLooper(), e17.getMessage());
            return false;
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace(str, e18, "selectNoCropPreviewSize Exception, %s, %s", android.os.Looper.myLooper(), e18.getMessage());
            return false;
        }
    }

    @Override // ts0.b
    public boolean J(int i17, int i18) {
        try {
            android.graphics.SurfaceTexture surfaceTexture = this.f421532n;
            kotlin.jvm.internal.o.d(surfaceTexture);
            surfaceTexture.setDefaultBufferSize(i17, i18);
            return true;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    @Override // ts0.b
    public void L(android.view.SurfaceHolder surfaceHolder, boolean z17, int i17) {
        java.util.concurrent.Semaphore semaphore = this.B;
        semaphore.acquire();
        semaphore.release();
        this.f421533o = surfaceHolder;
        this.f421527i = z17;
        this.f421534p = i17;
        Z(null, surfaceHolder, i17);
    }

    public final void N() {
        V(this.H);
        android.hardware.camera2.CaptureRequest.Builder builder = this.E;
        if (builder != null) {
            builder.set(android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE, 1);
        }
        android.hardware.camera2.CaptureRequest.Builder builder2 = this.E;
        if (builder2 != null) {
            builder2.set(android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER, 2);
        }
        android.hardware.camera2.CaptureRequest.Builder builder3 = this.E;
        if (builder3 != null) {
            builder3.set(android.hardware.camera2.CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 0);
        }
        android.hardware.camera2.CaptureRequest.Builder builder4 = this.E;
        android.hardware.camera2.CaptureRequest build = builder4 != null ? builder4.build() : null;
        kotlin.jvm.internal.o.d(build);
        this.G = build;
        if (!this.K) {
            try {
                android.hardware.camera2.CameraCaptureSession cameraCaptureSession = this.F;
                if (cameraCaptureSession != null) {
                    cameraCaptureSession.setRepeatingRequest(build, this.T, this.f421523e.f430449c);
                }
            } catch (android.hardware.camera2.CameraAccessException unused) {
                com.tencent.mars.xlog.Log.e(this.f439857y, "setRepeatingRequest failed, errMsg: ");
            }
        }
        this.S = 0;
    }

    public final void O() {
        java.lang.String str = this.f439857y;
        try {
            if (this.S == 4) {
                com.tencent.mm.sdk.platformtools.Log.c(str, "capture still picture more than twice", new java.lang.Object[0]);
                return;
            }
            this.S = 4;
            com.tencent.mars.xlog.Log.i(str, "captureStillPicture");
            if (this.D == null) {
                return;
            }
            android.hardware.camera2.CaptureRequest.Builder builder = this.E;
            android.graphics.Rect rect = builder != null ? (android.graphics.Rect) builder.get(android.hardware.camera2.CaptureRequest.SCALER_CROP_REGION) : null;
            android.hardware.camera2.CameraDevice cameraDevice = this.D;
            if (cameraDevice != null && !this.K) {
                android.hardware.camera2.CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(2);
                if (createCaptureRequest != null) {
                    createCaptureRequest.set(android.hardware.camera2.CaptureRequest.SCALER_CROP_REGION, rect);
                    android.media.ImageReader imageReader = this.P;
                    android.view.Surface surface = imageReader != null ? imageReader.getSurface() : null;
                    kotlin.jvm.internal.o.d(surface);
                    createCaptureRequest.addTarget(surface);
                    android.media.ImageReader imageReader2 = this.P;
                    if (imageReader2 != null) {
                        us0.c cVar = this.f421523e;
                        imageReader2.setOnImageAvailableListener(cVar.f430459m, cVar.f430449c);
                    }
                    S(createCaptureRequest);
                    createCaptureRequest.set(android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE, 4);
                    W(createCaptureRequest);
                } else {
                    createCaptureRequest = null;
                }
                this.E = createCaptureRequest;
                android.hardware.camera2.CameraCaptureSession cameraCaptureSession = this.F;
                if (cameraCaptureSession != null) {
                    cameraCaptureSession.stopRepeating();
                    com.tencent.mars.xlog.Log.i(this.f439858z, "this time happened a cancel auto foucs while capture");
                    android.hardware.camera2.CaptureRequest.Builder builder2 = this.E;
                    if (builder2 != null) {
                        builder2.set(android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER, 2);
                    }
                    android.hardware.camera2.CaptureRequest.Builder builder3 = this.E;
                    android.hardware.camera2.CaptureRequest build = builder3 != null ? builder3.build() : null;
                    kotlin.jvm.internal.o.d(build);
                    cameraCaptureSession.capture(build, new vs0.e(this), null);
                }
            }
        } catch (java.lang.Exception e17) {
            if (!kotlin.jvm.internal.o.b(vs0.c.f439832c, vs0.c.f439830a.b(1))) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Camera2ProcessIDKeyStat", "markCamera2TakePhotoBackError");
                vo.c.INSTANCE.b(1099L, 7L, 1L);
            }
            com.tencent.mars.xlog.Log.e(str, e17.toString());
        }
    }

    public final void P() {
        java.util.concurrent.Semaphore semaphore = this.B;
        try {
            try {
                android.hardware.camera2.CaptureRequest.Builder builder = this.E;
                if (builder != null) {
                    vs0.c cVar = vs0.c.f439830a;
                    kotlin.jvm.internal.o.d(builder);
                    cVar.e(builder);
                }
                semaphore.acquire();
                android.hardware.camera2.CameraCaptureSession cameraCaptureSession = this.F;
                if (cameraCaptureSession != null) {
                    cameraCaptureSession.close();
                }
                this.F = null;
                android.hardware.camera2.CameraDevice cameraDevice = this.D;
                if (cameraDevice != null) {
                    cameraDevice.close();
                }
                this.D = null;
                android.media.ImageReader imageReader = this.P;
                if (imageReader != null) {
                    imageReader.setOnImageAvailableListener(null, this.f421523e.f430449c);
                }
                android.media.ImageReader imageReader2 = this.P;
                if (imageReader2 != null) {
                    imageReader2.close();
                }
                this.P = null;
            } catch (java.lang.InterruptedException e17) {
                throw new java.lang.RuntimeException("Interrupt while trying to lock camera closing", e17);
            }
        } finally {
            semaphore.release();
        }
    }

    public boolean Q(android.graphics.SurfaceTexture surfaceTexture, android.view.SurfaceHolder surfaceHolder) {
        int a17;
        android.hardware.camera2.CaptureRequest.Builder builder = this.E;
        if (builder == null) {
            return false;
        }
        java.lang.String str = this.f439857y;
        if (surfaceTexture == null && surfaceHolder == null) {
            com.tencent.mars.xlog.Log.i(str, "doStartPreview error, surfaceTexture and surface is null");
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markCameraOpenFailed");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(985L, 5L, 1L);
            com.tencent.mars.xlog.Log.i("MicroMsg.Camera2ProcessIDKeyStat", "markCamera2OpenFailed");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1099L, 2L, 1L);
            return false;
        }
        if (surfaceTexture != null) {
            this.M = new android.view.Surface(surfaceTexture);
        } else if (surfaceHolder != null) {
            this.M = surfaceHolder.getSurface();
        }
        android.view.Surface surface = this.M;
        kotlin.jvm.internal.o.d(surface);
        builder.addTarget(surface);
        vs0.c cVar = vs0.c.f439830a;
        boolean z17 = vs0.c.f439848s != null ? !r13.isEmpty() : false;
        us0.c cVar2 = this.f421523e;
        vs0.h hVar = this.Q;
        if (z17) {
            if (this.L) {
                android.hardware.camera2.CaptureRequest.Builder builder2 = this.E;
                kotlin.jvm.internal.o.d(builder2);
                a17 = cVar.a(builder2, kz5.b0.c("cameraeffect.request.stabilization"));
                if (android.os.Build.VERSION.SDK_INT >= 28) {
                    android.view.Surface surface2 = this.M;
                    kotlin.jvm.internal.o.d(surface2);
                    android.hardware.camera2.params.SessionConfiguration sessionConfiguration = new android.hardware.camera2.params.SessionConfiguration(a17, kz5.b0.c(new android.hardware.camera2.params.OutputConfiguration(surface2)), android.os.AsyncTask.THREAD_POOL_EXECUTOR, hVar);
                    android.hardware.camera2.CameraDevice cameraDevice = this.D;
                    kotlin.jvm.internal.o.d(cameraDevice);
                    cameraDevice.createCaptureSession(sessionConfiguration);
                }
            } else {
                android.hardware.camera2.CaptureRequest.Builder builder3 = this.E;
                kotlin.jvm.internal.o.d(builder3);
                a17 = cVar.a(builder3, kz5.c0.i("cameraeffect.request.hdr", "cameraeffect.request.denois", "cameraeffect.request.hdrchecker"));
                if (android.os.Build.VERSION.SDK_INT >= 28) {
                    android.hardware.camera2.params.OutputConfiguration[] outputConfigurationArr = new android.hardware.camera2.params.OutputConfiguration[2];
                    android.view.Surface surface3 = this.M;
                    kotlin.jvm.internal.o.d(surface3);
                    outputConfigurationArr[0] = new android.hardware.camera2.params.OutputConfiguration(surface3);
                    android.media.ImageReader imageReader = this.P;
                    android.view.Surface surface4 = imageReader != null ? imageReader.getSurface() : null;
                    kotlin.jvm.internal.o.d(surface4);
                    outputConfigurationArr[1] = new android.hardware.camera2.params.OutputConfiguration(surface4);
                    android.hardware.camera2.params.SessionConfiguration sessionConfiguration2 = new android.hardware.camera2.params.SessionConfiguration(a17, kz5.c0.i(outputConfigurationArr), android.os.AsyncTask.THREAD_POOL_EXECUTOR, hVar);
                    android.hardware.camera2.CameraDevice cameraDevice2 = this.D;
                    kotlin.jvm.internal.o.d(cameraDevice2);
                    cameraDevice2.createCaptureSession(sessionConfiguration2);
                }
            }
            if (a17 == 0) {
                android.hardware.camera2.CameraDevice cameraDevice3 = this.D;
                kotlin.jvm.internal.o.d(cameraDevice3);
                android.view.Surface[] surfaceArr = new android.view.Surface[2];
                surfaceArr[0] = this.M;
                android.media.ImageReader imageReader2 = this.P;
                surfaceArr[1] = imageReader2 != null ? imageReader2.getSurface() : null;
                cameraDevice3.createCaptureSession(kz5.c0.i(surfaceArr), hVar, cVar2.f430449c);
            }
        } else {
            android.hardware.camera2.CameraDevice cameraDevice4 = this.D;
            kotlin.jvm.internal.o.d(cameraDevice4);
            android.view.Surface[] surfaceArr2 = new android.view.Surface[2];
            surfaceArr2[0] = this.M;
            android.media.ImageReader imageReader3 = this.P;
            surfaceArr2[1] = imageReader3 != null ? imageReader3.getSurface() : null;
            cameraDevice4.createCaptureSession(kz5.c0.i(surfaceArr2), hVar, cVar2.f430449c);
        }
        com.tencent.mars.xlog.Log.i(str, "doStartPreview finish");
        return true;
    }

    public final boolean R(boolean z17) {
        java.lang.Integer num;
        if (z17) {
            android.hardware.camera2.CameraCharacteristics cameraCharacteristics = this.H;
            kotlin.jvm.internal.o.d(cameraCharacteristics);
            java.lang.Object obj = cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
            kotlin.jvm.internal.o.d(obj);
            num = (java.lang.Integer) obj;
        } else {
            android.hardware.camera2.CameraCharacteristics cameraCharacteristics2 = this.H;
            kotlin.jvm.internal.o.d(cameraCharacteristics2);
            java.lang.Object obj2 = cameraCharacteristics2.get(android.hardware.camera2.CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
            kotlin.jvm.internal.o.d(obj2);
            num = (java.lang.Integer) obj2;
        }
        return num.intValue() > 0;
    }

    public final void S(android.hardware.camera2.CaptureRequest.Builder builder) {
        builder.set(android.hardware.camera2.CaptureRequest.CONTROL_MODE, 1);
        android.hardware.camera2.CameraCharacteristics cameraCharacteristics = this.H;
        java.lang.Float f17 = cameraCharacteristics != null ? (java.lang.Float) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE) : null;
        if (!(f17 == null || kotlin.jvm.internal.o.a(f17, 0.0f))) {
            android.hardware.camera2.CameraCharacteristics cameraCharacteristics2 = this.H;
            if (yo.a.a(cameraCharacteristics2 != null ? (int[]) cameraCharacteristics2.get(android.hardware.camera2.CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES) : null, 4)) {
                builder.set(android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE, 4);
            } else {
                builder.set(android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE, 1);
            }
        }
        builder.set(android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE, 1);
        android.hardware.camera2.CameraCharacteristics cameraCharacteristics3 = this.H;
        if (yo.a.a(cameraCharacteristics3 != null ? (int[]) cameraCharacteristics3.get(android.hardware.camera2.CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES) : null, 1)) {
            builder.set(android.hardware.camera2.CaptureRequest.CONTROL_AWB_MODE, 1);
        }
    }

    public final void T(java.lang.String str) {
        android.content.Context context = this.f421519a;
        kotlin.jvm.internal.o.d(context);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        iz5.a.d(null, context);
        if (!(context.getPackageManager().checkPermission("android.permission.CAMERA", context.getPackageName()) == 0)) {
            com.tencent.mars.xlog.Log.e(this.f439857y, "it was lack of the camera permision to open camera");
            return;
        }
        try {
            if (!this.B.tryAcquire(2500L, java.util.concurrent.TimeUnit.MILLISECONDS)) {
                throw new java.lang.RuntimeException("Time out waiting to lock camera opening");
            }
            try {
                android.hardware.camera2.CameraManager cameraManager = this.C;
                kotlin.jvm.internal.o.d(cameraManager);
                vs0.f fVar = this.R;
                android.os.Handler handler = this.f421523e.f430449c;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(handler);
                arrayList.add(fVar);
                arrayList.add(str);
                java.util.Collections.reverse(arrayList);
                yj0.a.k(cameraManager, arrayList.toArray(), "com/tencent/mm/media/widget/camera2/CommonCamera2", "openCamera", "(Ljava/lang/String;)V", "android/hardware/camera2/CameraManager", "openCamera", "(Ljava/lang/String;Landroid/hardware/camera2/CameraDevice$StateCallback;Landroid/os/Handler;)V");
            } catch (android.hardware.camera2.CameraAccessException unused) {
            }
            vs0.c cVar = vs0.c.f439830a;
            vs0.c.f439832c = str;
            kotlin.jvm.internal.o.d(str);
            android.hardware.camera2.CameraManager cameraManager2 = vs0.c.f439831b;
            android.hardware.camera2.CameraCharacteristics cameraCharacteristics = cameraManager2 != null ? cameraManager2.getCameraCharacteristics(str) : null;
            kotlin.jvm.internal.o.d(cameraCharacteristics);
            java.lang.Object obj = cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION);
            kotlin.jvm.internal.o.d(obj);
            vs0.c.f439833d = ((java.lang.Number) obj).intValue();
        } catch (java.lang.InterruptedException e17) {
            throw new java.lang.RuntimeException("interrupt while  trying to lock camera opening", e17);
        }
    }

    public final void U() {
        android.hardware.camera2.CaptureRequest.Builder builder = this.E;
        if (builder == null || this.D == null || this.K) {
            return;
        }
        if (builder != null) {
            builder.set(android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE, 4);
        }
        android.hardware.camera2.CaptureRequest.Builder builder2 = this.E;
        kotlin.jvm.internal.o.d(builder2);
        W(builder2);
        android.hardware.camera2.CameraCaptureSession cameraCaptureSession = this.F;
        if (cameraCaptureSession != null) {
            android.hardware.camera2.CaptureRequest.Builder builder3 = this.E;
            android.hardware.camera2.CaptureRequest build = builder3 != null ? builder3.build() : null;
            kotlin.jvm.internal.o.d(build);
            cameraCaptureSession.setRepeatingRequest(build, this.T, this.f421523e.f430449c);
        }
    }

    public boolean V(android.hardware.camera2.CameraCharacteristics cameraCharacteristics) {
        int[] iArr;
        if (this.D == null) {
            return false;
        }
        java.lang.String str = this.f439857y;
        if (cameraCharacteristics != null) {
            try {
                iArr = (int[]) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.i(str, "setFocusMode Exception, %s, %s", android.os.Looper.myLooper(), e17.getMessage());
                return false;
            }
        } else {
            iArr = null;
        }
        if (iArr != null && kz5.z.F(iArr, 4)) {
            com.tencent.mars.xlog.Log.i(str, "support continuous picture");
            android.hardware.camera2.CaptureRequest.Builder builder = this.E;
            if (builder != null) {
                builder.set(android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE, 4);
            }
        } else if (iArr != null && kz5.z.F(iArr, 3)) {
            com.tencent.mars.xlog.Log.i(str, "support continuous video");
            android.hardware.camera2.CaptureRequest.Builder builder2 = this.E;
            if (builder2 != null) {
                builder2.set(android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE, 3);
            }
        } else if (iArr == null || !kz5.z.F(iArr, 1)) {
            com.tencent.mars.xlog.Log.i(str, "not support continuous video or auto focus");
        } else {
            com.tencent.mars.xlog.Log.i(str, "support auto focus");
            android.hardware.camera2.CaptureRequest.Builder builder3 = this.E;
            if (builder3 != null) {
                builder3.set(android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE, 1);
            }
        }
        return true;
    }

    public final void W(android.hardware.camera2.CaptureRequest.Builder builder) {
        vs0.c cVar = vs0.c.f439830a;
        kotlin.jvm.internal.o.g(builder, "builder");
        java.lang.String str = vs0.c.f439832c;
        kotlin.jvm.internal.o.d(str);
        if (new xs0.b(builder, str, vs0.c.f439846q).a("cameraeffect.request.hdr", 2)) {
            java.lang.String str2 = vs0.c.f439832c;
            kotlin.jvm.internal.o.d(str2);
            new xs0.b(builder, str2, vs0.c.f439846q).b("cameraeffect.request.hdr", vs0.c.f439835f, 2);
        }
        java.lang.String str3 = vs0.c.f439832c;
        kotlin.jvm.internal.o.d(str3);
        if (new xs0.b(builder, str3, vs0.c.f439846q).a("cameraeffect.request.denois", 2)) {
            java.lang.String str4 = vs0.c.f439832c;
            kotlin.jvm.internal.o.d(str4);
            new xs0.b(builder, str4, vs0.c.f439846q).b("cameraeffect.request.denois", vs0.c.f439836g, 2);
        }
        java.lang.String str5 = vs0.c.f439832c;
        kotlin.jvm.internal.o.d(str5);
        if (new xs0.b(builder, str5, vs0.c.f439846q).a("cameraeffect.request.hdrchecker", 1)) {
            java.lang.String str6 = vs0.c.f439832c;
            kotlin.jvm.internal.o.d(str6);
            new xs0.b(builder, str6, vs0.c.f439846q).b("cameraeffect.request.hdrchecker", vs0.c.f439837h, 1);
        }
        if (vs0.c.f439843n) {
            java.lang.String str7 = vs0.c.f439832c;
            kotlin.jvm.internal.o.d(str7);
            xs0.b bVar = new xs0.b(builder, str7, vs0.c.f439846q);
            boolean z17 = vs0.c.f439839j;
            java.lang.String str8 = vs0.c.f439840k;
            kotlin.jvm.internal.o.d(str8);
            bVar.c("cameraeffect.request.facebeauty", ya.b.LEVEL, z17, str8, 1);
            java.lang.String str9 = vs0.c.f439832c;
            kotlin.jvm.internal.o.d(str9);
            new xs0.b(builder, str9, vs0.c.f439846q).c("cameraeffect.request.facebeauty", "slim", vs0.c.f439839j, java.lang.Integer.valueOf(vs0.c.f439841l), 1);
            java.lang.String str10 = vs0.c.f439832c;
            kotlin.jvm.internal.o.d(str10);
            new xs0.b(builder, str10, vs0.c.f439846q).c("cameraeffect.request.facebeauty", "skin", vs0.c.f439839j, java.lang.Integer.valueOf(vs0.c.f439842m), 1);
        } else {
            java.lang.String str11 = vs0.c.f439832c;
            kotlin.jvm.internal.o.d(str11);
            if (new xs0.b(builder, str11, vs0.c.f439846q).a("cameraeffect.request.facebeauty", 1)) {
                java.lang.String str12 = vs0.c.f439832c;
                kotlin.jvm.internal.o.d(str12);
                new xs0.b(builder, str12, vs0.c.f439846q).b("cameraeffect.request.facebeauty", vs0.c.f439839j, 1);
            }
        }
        java.lang.String str13 = vs0.c.f439832c;
        kotlin.jvm.internal.o.d(str13);
        if (new xs0.b(builder, str13, vs0.c.f439846q).a("cameraeffect.request.stabilization", 4)) {
            java.lang.String str14 = vs0.c.f439832c;
            kotlin.jvm.internal.o.d(str14);
            new xs0.b(builder, str14, vs0.c.f439846q).b("cameraeffect.request.stabilization", vs0.c.f439838i, 4);
        }
    }

    public final boolean X(float f17, int i17) {
        android.util.Size size;
        di3.g0 g0Var = this.f421529k;
        try {
            android.hardware.camera2.CameraCharacteristics cameraCharacteristics = this.H;
            kotlin.jvm.internal.o.d(cameraCharacteristics);
            android.hardware.camera2.params.StreamConfigurationMap streamConfigurationMap = (android.hardware.camera2.params.StreamConfigurationMap) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            if (streamConfigurationMap != null) {
                android.util.Size[] outputSizes = streamConfigurationMap.getOutputSizes(android.graphics.SurfaceTexture.class);
                kotlin.jvm.internal.o.f(outputSizes, "getOutputSizes(...)");
                if (outputSizes.length > 1) {
                    kz5.v.A(outputSizes, new vs0.i());
                }
                android.util.Size[] outputSizes2 = streamConfigurationMap.getOutputSizes(android.graphics.SurfaceTexture.class);
                kotlin.jvm.internal.o.f(outputSizes2, "getOutputSizes(...)");
                int length = outputSizes2.length;
                int i18 = 0;
                while (true) {
                    if (i18 >= length) {
                        size = null;
                        break;
                    }
                    size = outputSizes2[i18];
                    if (((double) java.lang.Math.abs(((((float) size.getWidth()) * 1.0f) / ((float) size.getHeight())) - f17)) <= 0.1d && size.getWidth() <= i17) {
                        break;
                    }
                    i18++;
                }
                if (size == null) {
                    return false;
                }
                com.tencent.mars.xlog.Log.i(this.f439857y, "selectRatioAndResolutionLimitPreviewSize final select target:" + size.getWidth() + 'x' + size.getHeight());
                android.graphics.SurfaceTexture surfaceTexture = this.f421532n;
                if (surfaceTexture != null) {
                    surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                }
                g0Var.f232711c = size.getWidth();
                g0Var.f232710b = size.getHeight();
                android.util.Size size2 = new android.util.Size(g0Var.f232711c, g0Var.f232710b);
                int width = size2.getWidth();
                int height = size2.getHeight();
                vs0.c cVar = vs0.c.f439830a;
                android.media.ImageReader newInstance = android.media.ImageReader.newInstance(width, height, 35, 1);
                us0.c cVar2 = this.f421523e;
                newInstance.setOnImageAvailableListener(cVar2.f430459m, cVar2.f430449c);
                this.P = newInstance;
                return true;
            }
        } catch (android.hardware.camera2.CameraAccessException unused) {
        }
        return false;
    }

    public void Y() {
        boolean z17;
        java.lang.String str;
        android.hardware.camera2.CameraCharacteristics cameraCharacteristics;
        gt0.c cVar;
        java.util.HashMap hashMap;
        gt0.b bVar;
        java.util.HashMap hashMap2;
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
        java.lang.String str2 = this.f439857y;
        com.tencent.mars.xlog.Log.i(str2, "startPreview Texture:: sightTest %s, config list: setFPS[%s], setYUV420SP[%B], useMetering[%B], useContinueFocus[%B] mUseContinueVideoFocusMode[%B]", objArr);
        boolean z18 = !(eVar.f447678w == 1 && (valueOf.intValue() == 0 || valueOf.intValue() == 1)) && eVar.f447677v == 1 && (valueOf.intValue() == 0 || valueOf.intValue() == 5);
        gt0.c cVar2 = this.f421531m;
        java.lang.String str3 = null;
        if (cVar2 != null) {
            if ((cVar2 != null ? cVar2.f275368a : null) != null) {
                if (((cVar2 == null || (hashMap2 = cVar2.f275368a) == null) ? null : (gt0.b) hashMap2.get(java.lang.Integer.valueOf(e()))) != null && (cVar = this.f421531m) != null && (hashMap = cVar.f275368a) != null && (bVar = (gt0.b) hashMap.get(java.lang.Integer.valueOf(e()))) != null) {
                    java.lang.Integer num = bVar.f275366c;
                    if (num != null) {
                        this.U = num.intValue();
                    }
                    java.lang.Boolean bool = bVar.f275367d;
                    if (bool != null) {
                        z18 = bool.booleanValue();
                    }
                }
            }
        }
        android.hardware.camera2.CameraCharacteristics cameraCharacteristics2 = this.H;
        if (cameraCharacteristics2 != null) {
            java.lang.String str4 = this.f421521c;
            try {
                if (z18) {
                    c0(cameraCharacteristics2, this.U);
                } else {
                    b0(cameraCharacteristics2, this.U);
                }
                android.hardware.camera2.CaptureRequest.Builder builder = this.E;
                com.tencent.mars.xlog.Log.i(str4, "use fix mode %B, supported preview frame rates %s", java.lang.Boolean.valueOf(z18), builder != null ? (android.util.Range) builder.get(android.hardware.camera2.CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE) : null);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.i(str4, "setPreviewFrameRate Exception, %s, %s", android.os.Looper.myLooper(), e17.getMessage());
            }
        }
        if (wo.v1.f447822b.f447679x == 1 && valueOf.intValue() != 0) {
            valueOf.intValue();
        }
        int i17 = wo.v1.f447829i.f447695i;
        if (i17 != -1 && i17 == 1 && fp.h.b(14) && (cameraCharacteristics = this.H) != null) {
            try {
                com.tencent.mars.xlog.Log.i(str2, "safeSetMetering");
                android.graphics.Rect rect = (android.graphics.Rect) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
                android.hardware.camera2.params.MeteringRectangle[] meteringRectangleArr = new android.hardware.camera2.params.MeteringRectangle[1];
                kotlin.jvm.internal.o.d(rect != null ? java.lang.Integer.valueOf(rect.right) : null);
                meteringRectangleArr[0] = new android.hardware.camera2.params.MeteringRectangle((r11.intValue() / 2) - 500, (rect.bottom / 2) - 500, 1000, 1000, 0);
                android.hardware.camera2.CaptureRequest.Builder builder2 = this.E;
                if (builder2 != null) {
                    builder2.set(android.hardware.camera2.CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr);
                }
                android.hardware.camera2.CaptureRequest.Builder builder3 = this.E;
                if (builder3 != null) {
                    builder3.set(android.hardware.camera2.CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr);
                }
                android.hardware.camera2.CaptureRequest.Builder builder4 = this.E;
                if (builder4 != null) {
                    builder4.set(android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER, 1);
                }
                android.hardware.camera2.CaptureRequest.Builder builder5 = this.E;
                if (builder5 != null) {
                    builder5.set(android.hardware.camera2.CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
                }
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.i(str2, "safeSetMetering Exception, %s, %s", android.os.Looper.myLooper(), e18.getMessage());
            }
        }
        wo.e eVar2 = wo.v1.f447822b;
        if (eVar2.f447681z == 1 && (valueOf.intValue() == 0 || valueOf.intValue() == 4)) {
            V(this.H);
        }
        if (eVar2.A == 1 && valueOf.intValue() != 0) {
            valueOf.intValue();
        }
        android.hardware.camera2.CameraCharacteristics cameraCharacteristics3 = this.H;
        android.graphics.Rect rect2 = cameraCharacteristics3 != null ? (android.graphics.Rect) cameraCharacteristics3.get(android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE) : null;
        if (rect2 != null) {
            android.graphics.Rect rect3 = new android.graphics.Rect(rect2.left * 1, rect2.top * 1, rect2.right * 1, rect2.bottom * 1);
            android.hardware.camera2.CaptureRequest.Builder builder6 = this.E;
            if (builder6 != null) {
                builder6.set(android.hardware.camera2.CaptureRequest.SCALER_CROP_REGION, rect3);
            }
        }
        com.tencent.mars.xlog.Log.i(str2, "#safeSetStabilization isBackCamera=" + this.f421525g + " isEnableOisWhenSupport=" + this.f439855w + " isEnableEisWhenSupport=" + this.f439856x);
        if (this.f421525g) {
            android.hardware.camera2.CameraCharacteristics cameraCharacteristics4 = this.H;
            int[] iArr = cameraCharacteristics4 != null ? (int[]) cameraCharacteristics4.get(android.hardware.camera2.CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION) : null;
            android.hardware.camera2.CameraCharacteristics cameraCharacteristics5 = this.H;
            int[] iArr2 = cameraCharacteristics5 != null ? (int[]) cameraCharacteristics5.get(android.hardware.camera2.CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES) : null;
            if (!this.f439855w || iArr == null) {
                z17 = false;
            } else {
                if ((!(iArr.length == 0)) && kz5.z.F(iArr, 1)) {
                    com.tencent.mars.xlog.Log.i(str2, "#safeSetStabilization isBackCamera=" + this.f421525g + " ois enable");
                    com.tencent.mars.xlog.Log.i("MicroMsg.Camera2ProcessIDKeyStat", "markCamera2UseOISSystem");
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1099L, 9L, 1L);
                    vs0.c.f439838i = false;
                    android.hardware.camera2.CaptureRequest.Builder builder7 = this.E;
                    if (builder7 != null) {
                        builder7.set(android.hardware.camera2.CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 1);
                    }
                    z17 = true;
                } else {
                    z17 = false;
                }
                android.hardware.camera2.CaptureRequest.Builder builder8 = this.E;
                if (builder8 != null) {
                    builder8.set(android.hardware.camera2.CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
                }
            }
            if (this.f439856x && !z17) {
                if (iArr2 != null) {
                    if ((!(iArr2.length == 0)) && kz5.z.F(iArr2, 1)) {
                        com.tencent.mars.xlog.Log.i(str2, "#safeSetStabilization isBackCamera=" + this.f421525g + " esi enable");
                        com.tencent.mars.xlog.Log.i("MicroMsg.Camera2ProcessIDKeyStat", "markCamera2UseEISSystem");
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1099L, 10L, 1L);
                        android.hardware.camera2.CaptureRequest.Builder builder9 = this.E;
                        if (builder9 != null) {
                            builder9.set(android.hardware.camera2.CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
                        }
                    }
                }
                android.hardware.camera2.CaptureRequest.Builder builder10 = this.E;
                if (builder10 != null) {
                    builder10.set(android.hardware.camera2.CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 0);
                }
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#safeSetStabilization isBackCamera=");
            sb6.append(this.f421525g);
            sb6.append(" is support ois:");
            if (iArr != null) {
                str = java.util.Arrays.toString(iArr);
                kotlin.jvm.internal.o.f(str, "toString(...)");
            } else {
                str = null;
            }
            sb6.append(str);
            com.tencent.mars.xlog.Log.i(str2, sb6.toString());
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("#safeSetStabilization isBackCamera=");
            sb7.append(this.f421525g);
            sb7.append(" is support eis:");
            if (iArr2 != null) {
                str3 = java.util.Arrays.toString(iArr2);
                kotlin.jvm.internal.o.f(str3, "toString(...)");
            }
            sb7.append(str3);
            com.tencent.mars.xlog.Log.i(str2, sb7.toString());
        } else {
            com.tencent.mars.xlog.Log.i(str2, "#safeSetStabilization isBackCamera=" + this.f421525g + " do not use ois or eis in front camera");
            android.hardware.camera2.CaptureRequest.Builder builder11 = this.E;
            if (builder11 != null) {
                builder11.set(android.hardware.camera2.CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
            }
            android.hardware.camera2.CaptureRequest.Builder builder12 = this.E;
            if (builder12 != null) {
                builder12.set(android.hardware.camera2.CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 0);
            }
        }
        android.hardware.camera2.CaptureRequest.Builder builder13 = this.E;
        kotlin.jvm.internal.o.d(builder13);
        W(builder13);
    }

    public void Z(android.graphics.SurfaceTexture surfaceTexture, android.view.SurfaceHolder surfaceHolder, int i17) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.lang.String str = "start startPreviewWithGPU,Looper.myLooper(): " + android.os.Looper.myLooper() + "  ,surfaceTexture:" + surfaceTexture + ", surface:" + surfaceHolder;
        java.lang.String str2 = this.f439857y;
        com.tencent.mars.xlog.Log.i(str2, str);
        if (G()) {
            com.tencent.mars.xlog.Log.i(str2, "startPreviewWithGPU, camera previewing");
            return;
        }
        try {
            android.hardware.camera2.CaptureRequest.Builder builder = null;
            if (this.L) {
                android.hardware.camera2.CameraDevice cameraDevice = this.D;
                if (cameraDevice != null) {
                    builder = cameraDevice.createCaptureRequest(3);
                }
            } else {
                android.hardware.camera2.CameraDevice cameraDevice2 = this.D;
                if (cameraDevice2 != null) {
                    builder = cameraDevice2.createCaptureRequest(1);
                }
            }
            this.E = builder;
            I(i17);
            Y();
            if (Q(surfaceTexture, surfaceHolder)) {
                this.f421526h = ts0.a.f421516e;
                this.S = 0;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(str2, "start preview FAILED, %s, %s", android.os.Looper.myLooper(), e17.getMessage());
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markCameraOpenFailed");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(985L, 5L, 1L);
        }
        com.tencent.mars.xlog.Log.i(str2, "start preview end, use %dms %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), android.os.Looper.myLooper());
    }

    @Override // ts0.r
    public boolean a() {
        try {
            android.hardware.camera2.CaptureRequest.Builder builder = this.E;
            if (builder != null) {
                builder.set(android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER, 1);
            }
            android.hardware.camera2.CaptureRequest.Builder builder2 = this.E;
            if (builder2 != null) {
                builder2.set(android.hardware.camera2.CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
            }
            return true;
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.i(this.f439857y, "triggerAutoFocus failed");
            return false;
        }
    }

    public boolean a0() {
        this.L = true;
        vs0.c cVar = vs0.c.f439830a;
        vs0.c.f439838i = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera2ProcessIDKeyStat", "markCamera2UseRecordStream");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1099L, 18L, 1L);
        return true;
    }

    @Override // ts0.r
    public int b() {
        return 2;
    }

    public void b0(android.hardware.camera2.CameraCharacteristics cameraCharacteristics, int i17) {
        int i18 = wo.v1.f447822b.f447675t;
        java.lang.String str = this.f421521c;
        if (i18 > 0) {
            com.tencent.mars.xlog.Log.i(str, "set frame rate > 0, do not try set preview fps range");
            return;
        }
        android.util.Range[] rangeArr = cameraCharacteristics != null ? (android.util.Range[]) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES) : null;
        if (rangeArr != null) {
            if (rangeArr.length == 0) {
                return;
            }
            int length = rangeArr.length;
            int i19 = Integer.MIN_VALUE;
            boolean z17 = false;
            int i27 = Integer.MIN_VALUE;
            for (int i28 = 0; i28 < length; i28++) {
                android.util.Range range = rangeArr[i28];
                if (range != null) {
                    java.lang.Integer num = (java.lang.Integer) range.getLower();
                    java.lang.Integer num2 = (java.lang.Integer) range.getUpper();
                    com.tencent.mars.xlog.Log.i(this.f439857y, "dkfps %d:[%d %d]", java.lang.Integer.valueOf(i28), num, num2);
                    kotlin.jvm.internal.o.d(num);
                    if (num.intValue() >= 0) {
                        kotlin.jvm.internal.o.d(num2);
                        if (num2.intValue() >= num.intValue()) {
                            int i29 = i17 == 0 ? 30 : i17;
                            if (num2.intValue() >= i27 && !z17 && num2.intValue() <= i29) {
                                i19 = num.intValue();
                                i27 = num2.intValue();
                            }
                            if (i17 != 0) {
                                if (num2.intValue() != i17) {
                                }
                                z17 = true;
                            } else {
                                if (num2.intValue() != 30) {
                                }
                                z17 = true;
                            }
                        }
                    }
                }
            }
            com.tencent.mars.xlog.Log.i(str, "dkfps get fit  [%d %d], max target fps %d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), 30);
            if (i19 == Integer.MAX_VALUE || i27 == Integer.MAX_VALUE) {
                return;
            }
            try {
                android.hardware.camera2.CaptureRequest.Builder builder = this.E;
                if (builder != null) {
                    builder.set(android.hardware.camera2.CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, new android.util.Range(java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27)));
                }
                com.tencent.mars.xlog.Log.i(str, "set fps range %d %d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.i(str, "trySetPreviewFpsRangeParameters Exception, %s, %s", android.os.Looper.myLooper(), e17.getMessage());
            }
        }
    }

    @Override // ts0.r
    public boolean c(android.content.Context context, boolean z17) {
        java.lang.String str = this.f439857y;
        kotlin.jvm.internal.o.g(context, "context");
        try {
            java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("camera");
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
            android.hardware.camera2.CameraManager cameraManager = (android.hardware.camera2.CameraManager) systemService;
            this.C = cameraManager;
            vs0.c cVar = vs0.c.f439830a;
            vs0.c.f439831b = cameraManager;
            if (this.f421540v) {
                com.tencent.mars.xlog.Log.i(str, "initCamera, already open");
                return true;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markCameraOpen");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(985L, 3L, 1L);
            this.f421525g = z17;
            release();
            P();
            java.lang.String b17 = z17 ? cVar.b(1) : cVar.b(0);
            com.tencent.mm.sdk.platformtools.Log.c(str, "use camera id %s, SrvDeviceInfo id %d", b17, java.lang.Integer.valueOf(wo.v1.f447822b.B));
            com.tencent.mars.xlog.Log.i("MicroMsg.Camera2ProcessIDKeyStat", "markCamera2Open");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1099L, 0L, 1L);
            T(b17);
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(str, e17, "init camera failed!", new java.lang.Object[0]);
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markCameraOpenFailed");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(985L, 5L, 1L);
            return false;
        }
    }

    public final void c0(android.hardware.camera2.CameraCharacteristics cameraCharacteristics, int i17) {
        int i18 = wo.v1.f447822b.f447675t;
        java.lang.String str = this.f421521c;
        if (i18 > 0) {
            com.tencent.mars.xlog.Log.i(str, "set frame rate > 0, do not try set preview frame rate");
            return;
        }
        if (cameraCharacteristics == null) {
            com.tencent.mars.xlog.Log.e(this.f439857y, "trySetPreviewFrameRateParameters error, p is null!");
            return;
        }
        try {
            android.util.Range[] rangeArr = (android.util.Range[]) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
            int i19 = 0;
            if (rangeArr != null) {
                int length = rangeArr.length;
                int i27 = 0;
                while (i19 < length) {
                    android.util.Range range = rangeArr[i19];
                    java.lang.Object upper = range.getUpper();
                    kotlin.jvm.internal.o.f(upper, "getUpper(...)");
                    if (i27 < ((java.lang.Number) upper).intValue()) {
                        java.lang.Object upper2 = range.getUpper();
                        kotlin.jvm.internal.o.f(upper2, "getUpper(...)");
                        i27 = ((java.lang.Number) upper2).intValue();
                    }
                    i19++;
                }
                i19 = i27;
            }
            int min = i17 == 0 ? java.lang.Math.min(30, i19) : java.lang.Math.min(i17, i19);
            android.util.Range range2 = new android.util.Range(java.lang.Integer.valueOf(min), java.lang.Integer.valueOf(min));
            android.hardware.camera2.CaptureRequest.Builder builder = this.E;
            if (builder != null) {
                builder.set(android.hardware.camera2.CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range2);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i(str, "trySetPreviewFrameRateParameters Exception, %s, %s", android.os.Looper.myLooper(), e17.getMessage());
        }
    }

    @Override // ts0.r
    public int d() {
        vs0.c cVar = vs0.c.f439830a;
        return vs0.c.f439833d;
    }

    @Override // ts0.r
    public int e() {
        return !kotlin.jvm.internal.o.b(vs0.c.f439832c, vs0.c.f439830a.b(1)) ? 1 : 0;
    }

    @Override // ts0.r
    public void f(float f17, float f18, int i17, int i18, long j17) {
        if (fp.h.a(14) || this.D == null || this.F == null || !G()) {
            return;
        }
        android.graphics.Rect rect = new android.graphics.Rect(0, 0, i17, i18);
        this.f439854J = rect;
        android.hardware.camera2.CameraCharacteristics cameraCharacteristics = this.H;
        if (cameraCharacteristics != null) {
            this.I = new vs0.b(cameraCharacteristics, rect);
        }
        int i19 = us0.c.f430446n;
        us0.c cVar = this.f421523e;
        cVar.removeMessages(4354);
        cVar.f430453g = f17;
        cVar.f430454h = f18;
        cVar.f430455i = i17;
        cVar.f430456j = i18;
        cVar.sendMessageDelayed(cVar.obtainMessage(4354), j17);
    }

    @Override // ts0.r
    public int getFlashMode() {
        vs0.c cVar = vs0.c.f439830a;
        android.hardware.camera2.CaptureRequest.Builder builder = this.E;
        kotlin.jvm.internal.o.d(builder);
        java.lang.Integer num = (java.lang.Integer) builder.get(android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE);
        int i17 = 2;
        if (num != null && num.intValue() == 2) {
            return 3;
        }
        java.lang.Integer num2 = (java.lang.Integer) builder.get(android.hardware.camera2.CaptureRequest.FLASH_MODE);
        if (num2 == null || num2.intValue() != 0) {
            if ((num2 != null && num2.intValue() == 2) || (num2 != null && num2.intValue() == 1)) {
                i17 = 1;
            }
        }
        return i17;
    }

    @Override // ts0.r
    public void h(java.lang.String tag, boolean z17) {
        kotlin.jvm.internal.o.g(tag, "tag");
        if (kotlin.jvm.internal.o.b(tag, "cameraeffect.request.facebeauty")) {
            vs0.c cVar = vs0.c.f439830a;
            vs0.c.f439839j = z17;
        } else if (kotlin.jvm.internal.o.b(tag, "cameraeffect.request.hdr")) {
            vs0.c cVar2 = vs0.c.f439830a;
            vs0.c.f439835f = z17;
        } else if (kotlin.jvm.internal.o.b(tag, "cameraeffect.request.denois")) {
            vs0.c cVar3 = vs0.c.f439830a;
            vs0.c.f439836g = z17;
        } else if (kotlin.jvm.internal.o.b(tag, "cameraeffect.request.hdrchecker")) {
            vs0.c cVar4 = vs0.c.f439830a;
            vs0.c.f439837h = z17;
        } else if (kotlin.jvm.internal.o.b(tag, "cameraeffect.request.stabilization")) {
            vs0.c cVar5 = vs0.c.f439830a;
            vs0.c.f439838i = z17;
        }
        U();
    }

    @Override // ts0.r
    public void i(java.lang.String tag, int i17) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(tag, "tag");
        vs0.c cVar = vs0.c.f439830a;
        kotlin.jvm.internal.o.d(this.E);
        if (kotlin.jvm.internal.o.b(tag, ya.b.LEVEL)) {
            java.lang.String str = vs0.c.f439832c;
            kotlin.jvm.internal.o.d(str);
            java.util.ArrayList arrayList = vs0.c.f439846q;
            int i18 = kotlin.jvm.internal.o.b(str, "0") ? 1 : 2;
            java.lang.Object obj2 = null;
            if (arrayList != null) {
                java.util.Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    xs0.a aVar = (xs0.a) obj;
                    boolean z17 = false;
                    if (kotlin.jvm.internal.o.b(aVar.f456285a, "cameraeffect.request.facebeauty")) {
                        java.lang.Integer num = aVar.f456286b;
                        if (!(num != null && (num.intValue() & i18) == 0)) {
                            java.lang.Integer num2 = aVar.f456291g;
                            if (!(num2 != null && (num2.intValue() & 1) == 0) && kotlin.jvm.internal.o.b(aVar.f456288d, ya.b.LEVEL)) {
                                z17 = true;
                            }
                        }
                    }
                    if (z17) {
                        break;
                    }
                }
                xs0.a aVar2 = (xs0.a) obj;
                if (aVar2 != null) {
                    java.lang.Object obj3 = aVar2.f456289e;
                    if (obj3 instanceof java.util.ArrayList) {
                        kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type java.util.ArrayList<*>{ kotlin.collections.TypeAliasesKt.ArrayList<*> }");
                        obj2 = ((java.util.ArrayList) obj3).get(i17);
                    }
                }
            }
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
            vs0.c.f439840k = (java.lang.String) obj2;
        } else if (kotlin.jvm.internal.o.b(tag, "slim")) {
            vs0.c.f439841l = i17;
        } else if (kotlin.jvm.internal.o.b(tag, "skin")) {
            vs0.c.f439842m = i17;
        }
        vs0.c.f439843n = true;
        U();
    }

    @Override // ts0.r
    public void j(yz5.l lVar) {
        vs0.c cVar = vs0.c.f439830a;
        vs0.c.f439844o = lVar;
    }

    @Override // ts0.r
    public void k(di3.o oVar) {
    }

    @Override // ts0.r
    public void l(float f17) {
        android.hardware.camera2.CameraCharacteristics cameraCharacteristics;
        if (this.f421539u || (cameraCharacteristics = this.H) == null || this.E == null) {
            return;
        }
        try {
            try {
                kotlin.jvm.internal.o.d(cameraCharacteristics);
                android.graphics.Rect rect = (android.graphics.Rect) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
                kotlin.jvm.internal.o.d(rect);
                int width = rect.width() - a06.d.b(rect.width() / f17);
                int height = rect.height() - a06.d.b(rect.height() / f17);
                this.N = new android.graphics.Rect(width / 2, height / 2, rect.width() - (width / 2), rect.height() - (height / 2));
                android.hardware.camera2.CaptureRequest.Builder builder = this.E;
                kotlin.jvm.internal.o.d(builder);
                builder.set(android.hardware.camera2.CaptureRequest.SCALER_CROP_REGION, this.N);
                if (!this.K) {
                    try {
                        android.hardware.camera2.CameraCaptureSession cameraCaptureSession = this.F;
                        if (cameraCaptureSession != null) {
                            android.hardware.camera2.CaptureRequest.Builder builder2 = this.E;
                            kotlin.jvm.internal.o.d(builder2);
                            cameraCaptureSession.setRepeatingRequest(builder2.build(), this.T, this.f421523e.f430449c);
                        }
                    } catch (android.hardware.camera2.CameraAccessException unused) {
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e(this.f439857y, "setForceZoomTargetRatio error: %s", e17.getMessage());
            }
        } finally {
            this.f421539u = false;
        }
    }

    @Override // ts0.r
    public android.graphics.Rect m(float f17, float f18, float f19, int i17, int i18) {
        int i19 = (int) (f19 * 4);
        android.graphics.Rect rect = this.f439854J;
        kotlin.jvm.internal.o.d(rect);
        int width = ((int) f17) - ((rect.width() / i19) / 2);
        android.graphics.Rect rect2 = this.f439854J;
        kotlin.jvm.internal.o.d(rect2);
        int i27 = rect2.left;
        android.graphics.Rect rect3 = this.f439854J;
        kotlin.jvm.internal.o.d(rect3);
        int i28 = rect3.right;
        android.graphics.Rect rect4 = this.f439854J;
        kotlin.jvm.internal.o.d(rect4);
        int width2 = i28 - (rect4.width() / i19);
        if (width <= width2) {
            if (width < i27) {
                width = i27;
            }
            width2 = width;
        }
        int i29 = (int) f18;
        android.graphics.Rect rect5 = this.f439854J;
        kotlin.jvm.internal.o.d(rect5);
        int width3 = i29 - ((rect5.width() / i19) / 2);
        android.graphics.Rect rect6 = this.f439854J;
        kotlin.jvm.internal.o.d(rect6);
        int i37 = rect6.top;
        android.graphics.Rect rect7 = this.f439854J;
        kotlin.jvm.internal.o.d(rect7);
        int i38 = rect7.bottom;
        android.graphics.Rect rect8 = this.f439854J;
        kotlin.jvm.internal.o.d(rect8);
        int width4 = i38 - (rect8.width() / i19);
        if (width3 <= width4) {
            if (width3 < i37) {
                width3 = i37;
            }
            width4 = width3;
        }
        android.graphics.Rect rect9 = this.f439854J;
        kotlin.jvm.internal.o.d(rect9);
        float width5 = width2 + (rect9.width() / i19);
        kotlin.jvm.internal.o.d(this.f439854J);
        android.graphics.RectF rectF = new android.graphics.RectF(width2, width4, width5, width4 + (r1.width() / i19));
        vs0.b bVar = this.I;
        kotlin.jvm.internal.o.d(bVar);
        android.graphics.RectF rectF2 = new android.graphics.RectF();
        android.graphics.Matrix matrix = bVar.f439829a;
        if (matrix != null) {
            matrix.mapRect(rectF2, rectF);
        }
        return new android.graphics.Rect(java.lang.Math.round(rectF2.left), java.lang.Math.round(rectF2.top), java.lang.Math.round(rectF2.right), java.lang.Math.round(rectF2.bottom));
    }

    @Override // ts0.r
    public java.lang.String n() {
        android.hardware.camera2.CaptureRequest captureRequest = this.G;
        if (captureRequest == null) {
            kotlin.jvm.internal.o.o("previewRequest");
            throw null;
        }
        java.lang.Integer num = (java.lang.Integer) captureRequest.get(android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE);
        if (num == null || num.intValue() != 1) {
            if (num != null && num.intValue() == 4) {
                return "continue-picture";
            }
            if (num != null && num.intValue() == 3) {
                return "continue-video";
            }
        }
        return "auto";
    }

    @Override // ts0.r
    public void o() {
        if (G()) {
            int i17 = us0.c.f430446n;
            this.f421523e.removeMessages(4354);
        }
    }

    @Override // ts0.r
    public void p(android.graphics.SurfaceTexture surfaceTexture, boolean z17, int i17) {
        java.util.concurrent.Semaphore semaphore = this.B;
        semaphore.acquire();
        semaphore.release();
        this.f421532n = surfaceTexture;
        this.f421527i = z17;
        this.f421534p = i17;
        Z(surfaceTexture, null, i17);
    }

    @Override // ts0.r
    public void q(di3.o oVar) {
    }

    @Override // ts0.r
    public void r(android.graphics.SurfaceTexture surfaceTexture, boolean z17, java.lang.Float f17, int i17) {
        android.hardware.camera2.CaptureRequest.Builder createCaptureRequest;
        java.util.concurrent.Semaphore semaphore = this.B;
        semaphore.acquire();
        semaphore.release();
        this.f421532n = surfaceTexture;
        this.f421527i = z17;
        this.f421534p = i17;
        this.f421536r = f17;
        if (f17 == null) {
            p(surfaceTexture, z17, i17);
            return;
        }
        float floatValue = f17.floatValue();
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.lang.String str = "start startPreviewWithGPU,Looper.myLooper(): " + android.os.Looper.myLooper() + "  ,surfaceTexture:" + surfaceTexture + ", surface:null";
        java.lang.String str2 = this.f439857y;
        com.tencent.mars.xlog.Log.i(str2, str);
        if (G()) {
            com.tencent.mars.xlog.Log.i(str2, "startPreviewWithGPU, camera previewing");
            return;
        }
        android.hardware.camera2.CameraManager cameraManager = this.C;
        java.lang.String str3 = vs0.c.f439832c;
        if (cameraManager == null || android.text.TextUtils.isEmpty(str3)) {
            com.tencent.mars.xlog.Log.e(str2, "startPreviewWithGPURatio error");
            return;
        }
        try {
            kotlin.jvm.internal.o.d(str3);
            this.H = cameraManager.getCameraCharacteristics(str3);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(str2, "start preview FAILED, %s, %s", android.os.Looper.myLooper(), e17.getMessage());
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markCameraOpenFailed");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(985L, 5L, 1L);
        }
        if (!X(floatValue, i17)) {
            Z(surfaceTexture, null, i17);
            return;
        }
        if (this.L) {
            android.hardware.camera2.CameraDevice cameraDevice = this.D;
            if (cameraDevice != null) {
                createCaptureRequest = cameraDevice.createCaptureRequest(3);
            }
            createCaptureRequest = null;
        } else {
            android.hardware.camera2.CameraDevice cameraDevice2 = this.D;
            if (cameraDevice2 != null) {
                createCaptureRequest = cameraDevice2.createCaptureRequest(1);
            }
            createCaptureRequest = null;
        }
        this.E = createCaptureRequest;
        Y();
        if (Q(surfaceTexture, null)) {
            this.f421526h = ts0.a.f421516e;
            this.S = 0;
        }
        com.tencent.mars.xlog.Log.i(str2, "start preview end, use %dms %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), android.os.Looper.myLooper());
    }

    @Override // ts0.r
    public void release() {
        this.f421526h = ts0.a.f421515d;
        if (this.D != null) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            java.lang.Object[] objArr = {android.os.Looper.myLooper()};
            java.lang.String str = this.f439857y;
            com.tencent.mars.xlog.Log.i(str, "release camera beg, %s", objArr);
            this.f421523e.removeCallbacksAndMessages(null);
            P();
            android.view.Surface surface = this.M;
            if (surface != null) {
                surface.release();
            }
            com.tencent.mars.xlog.Log.i(str, "release camera end, use %dms, %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), android.os.Looper.myLooper());
        }
        this.f421537s = null;
        this.f421540v = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera2ProcessIDKeyStat", "markCamera2Release");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1099L, 3L, 1L);
    }

    @Override // ts0.r
    public void s(boolean z17) {
        vs0.c cVar = vs0.c.f439830a;
        android.hardware.camera2.CaptureRequest.Builder builder = this.E;
        kotlin.jvm.internal.o.d(builder);
        cVar.f(z17, builder);
    }

    @Override // ts0.r
    public void setFlashMode(int i17) {
        android.hardware.camera2.CameraCharacteristics cameraCharacteristics;
        android.hardware.camera2.CaptureRequest.Builder builder = this.E;
        if (builder != null) {
            vs0.c cVar = vs0.c.f439830a;
            if (i17 == 1) {
                cVar.f(true, builder);
                return;
            }
            if (i17 == 2) {
                cVar.f(false, builder);
            } else {
                if (i17 != 3) {
                    return;
                }
                android.hardware.camera2.CameraManager cameraManager = vs0.c.f439831b;
                if (yo.a.a((cameraManager == null || (cameraCharacteristics = cameraManager.getCameraCharacteristics(java.lang.String.valueOf(vs0.c.f439832c))) == null) ? null : (int[]) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES), 2)) {
                    builder.set(android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE, 2);
                }
            }
        }
    }

    @Override // ts0.r
    public void t(boolean z17, boolean z18, int i17) {
        if (this.D == null || !G()) {
            return;
        }
        try {
            try {
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e(this.f439857y, "triggerSmallZoom error: %s", e17.getMessage());
            }
            if (this.f421539u) {
                return;
            }
            this.f421539u = true;
            android.hardware.camera2.CaptureRequest.Builder builder = this.E;
            android.graphics.Rect rect = builder != null ? (android.graphics.Rect) builder.get(android.hardware.camera2.CaptureRequest.SCALER_CROP_REGION) : null;
            android.hardware.camera2.CameraCharacteristics cameraCharacteristics = this.H;
            android.graphics.Rect rect2 = cameraCharacteristics != null ? (android.graphics.Rect) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE) : null;
            kotlin.jvm.internal.o.d(rect2);
            float width = rect2.width();
            kotlin.jvm.internal.o.d(rect);
            float width2 = width / rect.width();
            android.hardware.camera2.CameraCharacteristics cameraCharacteristics2 = this.H;
            kotlin.jvm.internal.o.d(cameraCharacteristics2);
            java.lang.Float f17 = (java.lang.Float) cameraCharacteristics2.get(android.hardware.camera2.CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
            if (f17 == null) {
                f17 = java.lang.Float.valueOf(0.0f);
            }
            float floatValue = f17.floatValue();
            float f18 = this.A;
            if (!z17) {
                floatValue = 1.0f;
                if (width2 == 1.0f) {
                    return;
                }
                float f19 = width2 - f18;
                if (f19 > 1.0f) {
                    floatValue = f19;
                }
            } else {
                if (width2 >= floatValue) {
                    return;
                }
                float f27 = width2 + f18;
                if (f27 < floatValue) {
                    floatValue = f27;
                }
            }
            float width3 = rect2.width() / floatValue;
            float height = rect2.height() / floatValue;
            float f28 = 2;
            float width4 = (rect2.width() - width3) / f28;
            float height2 = (rect2.height() - height) / f28;
            android.graphics.Rect rect3 = new android.graphics.Rect((int) width4, (int) height2, (int) (width4 + width3), (int) (height2 + height));
            android.hardware.camera2.CaptureRequest.Builder builder2 = this.E;
            if (builder2 != null) {
                builder2.set(android.hardware.camera2.CaptureRequest.SCALER_CROP_REGION, rect3);
            }
            if (!this.K) {
                try {
                    android.hardware.camera2.CameraCaptureSession cameraCaptureSession = this.F;
                    if (cameraCaptureSession != null) {
                        android.hardware.camera2.CaptureRequest.Builder builder3 = this.E;
                        kotlin.jvm.internal.o.d(builder3);
                        cameraCaptureSession.setRepeatingRequest(builder3.build(), this.T, this.f421523e.f430449c);
                    }
                } catch (android.hardware.camera2.CameraAccessException unused) {
                }
            }
        } finally {
            this.f421539u = false;
        }
    }

    @Override // ts0.r
    public void u(int i17, int i18) {
        if (this.f421538t > 0) {
            return;
        }
        android.graphics.Point h17 = com.tencent.mm.ui.bk.h(com.tencent.mm.sdk.platformtools.x2.f193071a);
        int i19 = h17.y;
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(i17), h17};
        java.lang.String str = this.f439857y;
        com.tencent.mars.xlog.Log.i(str, "calcScrollZoomStep, recordButtonTopLocation: %s, screenSize: %s", objArr);
        if (i19 / 2 >= i17) {
            return;
        }
        try {
            android.hardware.camera2.CameraCharacteristics cameraCharacteristics = this.H;
            kotlin.jvm.internal.o.d(cameraCharacteristics);
            java.lang.Float f17 = (java.lang.Float) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
            if (f17 == null) {
                f17 = java.lang.Float.valueOf(0.0f);
            }
            float floatValue = f17.floatValue();
            double d17 = floatValue / ((i17 / 3.0d) / i18);
            if (d17 > 0.0d) {
                this.f421538t = ((int) d17) + 1;
            }
            com.tencent.mars.xlog.Log.i(str, "scrollSmallZoomStep: %s, maxZoom: %s", java.lang.Integer.valueOf(this.f421538t), java.lang.Float.valueOf(floatValue));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(str, "calcScrollZoomStep error: %s", e17.getMessage());
        }
    }

    @Override // ts0.r
    public android.graphics.Point v(boolean z17) {
        android.graphics.Point point;
        di3.g0 g0Var = this.f421529k;
        if (z17 && (point = this.f421537s) != null) {
            kotlin.jvm.internal.o.d(point);
            return point;
        }
        return new android.graphics.Point(g0Var.f232711c, g0Var.f232710b);
    }

    @Override // ts0.r
    public int w(int i17, int i18) {
        int i19 = 0;
        if (i18 != 0) {
            if (i18 == 1) {
                i19 = 90;
            } else if (i18 == 2) {
                i19 = 180;
            } else if (i18 == 3) {
                i19 = 270;
            }
        }
        if (this.f421525g) {
            vs0.c cVar = vs0.c.f439830a;
            return ((vs0.c.f439833d - i19) + com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1) % com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1;
        }
        vs0.c cVar2 = vs0.c.f439830a;
        return (360 - ((vs0.c.f439833d + i19) % com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1)) % com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1;
    }

    @Override // ts0.b, ts0.r
    public boolean x(yz5.l dataCallback) {
        android.hardware.camera2.CameraCaptureSession cameraCaptureSession;
        kotlin.jvm.internal.o.g(dataCallback, "dataCallback");
        java.lang.String str = this.f439857y;
        com.tencent.mars.xlog.Log.i(str, "takePhoto");
        this.f421526h = ts0.a.f421517f;
        boolean b17 = kotlin.jvm.internal.o.b(vs0.c.f439832c, vs0.c.f439830a.b(1));
        us0.c cVar = this.f421523e;
        if (b17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Camera2ProcessIDKeyStat", "markCamera2TakePhotoBack");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1099L, 5L, 1L);
            try {
                if (this.S != 0) {
                    N();
                }
                cVar.removeCallbacksAndMessages(null);
                android.hardware.camera2.CaptureRequest.Builder builder = this.E;
                if (builder != null) {
                    builder.set(android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER, 1);
                }
                this.S = 1;
                if (!this.K) {
                    android.hardware.camera2.CaptureRequest.Builder builder2 = this.E;
                    if ((builder2 != null ? builder2.build() : null) != null && (cameraCaptureSession = this.F) != null) {
                        android.hardware.camera2.CaptureRequest.Builder builder3 = this.E;
                        android.hardware.camera2.CaptureRequest build = builder3 != null ? builder3.build() : null;
                        kotlin.jvm.internal.o.d(build);
                        cameraCaptureSession.capture(build, this.T, cVar.f430449c);
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Camera2ProcessIDKeyStat", "markCamera2TakePhotoBackError");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1099L, 6L, 1L);
                com.tencent.mm.sdk.platformtools.Log.c(str, "take photo in back camera error", e17);
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Camera2ProcessIDKeyStat", "markCamera2TakePhotoFront");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1099L, 4L, 1L);
            O();
        }
        cVar.f430451e = dataCallback;
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(24:3|(1:5)(1:63)|6|(23:8|(2:10|(1:13)(1:12))|14|15|16|(1:18)|19|(1:21)|22|(1:26)|27|(1:31)|32|(1:34)|35|36|(1:40)|42|(1:44)|45|46|47|(3:49|(1:51)|52)(2:53|54))(0)|62|16|(0)|19|(0)|22|(2:24|26)|27|(2:29|31)|32|(0)|35|36|(2:38|40)|42|(0)|45|46|47|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b5, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b6, code lost:
    
        r12.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b0, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b1, code lost:
    
        r12.getMessage();
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c8 A[Catch: CameraAccessException -> 0x00f2, TRY_ENTER, TryCatch #0 {CameraAccessException -> 0x00f2, blocks: (B:46:0x00c2, B:49:0x00c8, B:51:0x00d1, B:53:0x00e5), top: B:45:0x00c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e5 A[Catch: CameraAccessException -> 0x00f2, TRY_ENTER, TRY_LEAVE, TryCatch #0 {CameraAccessException -> 0x00f2, blocks: (B:46:0x00c2, B:49:0x00c8, B:51:0x00d1, B:53:0x00e5), top: B:45:0x00c2 }] */
    @Override // ts0.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean y(android.graphics.Rect r12, android.graphics.Rect r13) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vs0.j.y(android.graphics.Rect, android.graphics.Rect):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0052 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // ts0.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ts0.c z() {
        /*
            r6 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = r6.f439857y
            java.lang.String r3 = "generateCameraConfig"
            com.tencent.mm.sdk.platformtools.Log.c(r2, r3, r1)
            android.hardware.camera2.CameraDevice r1 = r6.D
            r3 = 0
            if (r1 != 0) goto L15
            java.lang.String r0 = "generateCameraConfig, camera is null!!"
            com.tencent.mars.xlog.Log.i(r2, r0)
            return r3
        L15:
            boolean r1 = r6.G()
            if (r1 != 0) goto L21
            java.lang.String r0 = "generateCameraConfig, camera not previewing"
            com.tencent.mars.xlog.Log.i(r2, r0)
            return r3
        L21:
            android.hardware.camera2.CameraDevice r1 = r6.D
            di3.g0 r3 = r6.f421529k
            if (r1 != 0) goto L29
        L27:
            r1 = r0
            goto L4a
        L29:
            android.hardware.camera2.CameraManager r1 = r6.C
            if (r1 == 0) goto L27
            boolean r1 = r6.f421527i     // Catch: java.lang.Exception -> L3b
            if (r1 == 0) goto L38
            android.graphics.Point r1 = r6.f421537s     // Catch: java.lang.Exception -> L3b
            if (r1 == 0) goto L38
            int r1 = r1.x     // Catch: java.lang.Exception -> L3b
            goto L4a
        L38:
            int r1 = r3.f232711c     // Catch: java.lang.Exception -> L3b
            goto L4a
        L3b:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r4 = "getPreviewWidth: %s"
            com.tencent.mars.xlog.Log.e(r2, r4, r1)
            goto L27
        L4a:
            ts0.c.f421543c = r1
            android.hardware.camera2.CameraDevice r1 = r6.D
            if (r1 != 0) goto L52
        L50:
            r1 = r0
            goto L6f
        L52:
            boolean r1 = r6.f421527i     // Catch: java.lang.Exception -> L60
            if (r1 == 0) goto L5d
            android.graphics.Point r1 = r6.f421537s     // Catch: java.lang.Exception -> L60
            if (r1 == 0) goto L5d
            int r1 = r1.y     // Catch: java.lang.Exception -> L60
            goto L6f
        L5d:
            int r1 = r3.f232710b     // Catch: java.lang.Exception -> L60
            goto L6f
        L60:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r4 = "getPreviewHeight: %s"
            com.tencent.mars.xlog.Log.e(r2, r4, r1)
            goto L50
        L6f:
            ts0.c.f421542b = r1
            android.hardware.camera2.CameraCharacteristics r1 = r6.H
            r2 = 1
            if (r1 == 0) goto L9d
            android.hardware.camera2.CameraCharacteristics$Key r4 = android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION
            java.lang.Object r4 = r1.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 != 0) goto L81
            goto L89
        L81:
            int r4 = r4.intValue()
            r5 = 90
            if (r4 == r5) goto L9c
        L89:
            android.hardware.camera2.CameraCharacteristics$Key r4 = android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION
            java.lang.Object r1 = r1.get(r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 != 0) goto L94
            goto L9d
        L94:
            int r1 = r1.intValue()
            r4 = 270(0x10e, float:3.78E-43)
            if (r1 != r4) goto L9d
        L9c:
            r0 = r2
        L9d:
            int r1 = r3.f232711c
            ts0.c.f421546f = r1
            int r3 = r3.f232710b
            ts0.c.f421547g = r3
            if (r0 == 0) goto Lab
            ts0.c.f421546f = r3
            ts0.c.f421547g = r1
        Lab:
            boolean r0 = r6.G()
            if (r0 == 0) goto Lb4
            int r0 = vs0.c.f439833d
            goto Lb5
        Lb4:
            r0 = -1
        Lb5:
            ts0.c.f421544d = r0
            boolean r0 = r6.f421525g
            r0 = r0 ^ r2
            ts0.c.f421548h = r0
            boolean r0 = r6.f421527i
            ts0.c.f421549i = r0
            ts0.c r0 = r6.f421530l
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vs0.j.z():ts0.c");
    }
}
