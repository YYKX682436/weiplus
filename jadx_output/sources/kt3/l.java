package kt3;

/* loaded from: classes10.dex */
public final class l extends com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout implements ju3.d0 {
    public static final /* synthetic */ int F = 0;
    public boolean A;
    public com.tencent.mm.plugin.api.recordView.MMSightCameraGLSurfaceView B;
    public final android.graphics.Point C;
    public int D;
    public float E;

    /* renamed from: h, reason: collision with root package name */
    public final int f311991h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.WindowManager f311992i;

    /* renamed from: m, reason: collision with root package name */
    public int f311993m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView f311994n;

    /* renamed from: o, reason: collision with root package name */
    public st3.b f311995o;

    /* renamed from: p, reason: collision with root package name */
    public at0.n f311996p;

    /* renamed from: q, reason: collision with root package name */
    public di3.d f311997q;

    /* renamed from: r, reason: collision with root package name */
    public bi3.i f311998r;

    /* renamed from: s, reason: collision with root package name */
    public bi3.j f311999s;

    /* renamed from: t, reason: collision with root package name */
    public bi3.c f312000t;

    /* renamed from: u, reason: collision with root package name */
    public bi3.f f312001u;

    /* renamed from: v, reason: collision with root package name */
    public bi3.e f312002v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.api.recordView.i f312003w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.api.recordView.m f312004x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f312005y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f312006z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(android.content.Context context) {
        super(context, null);
        kotlin.jvm.internal.o.g(context, "context");
        this.f311991h = 1;
        this.f311993m = 0;
        this.f312005y = true;
        this.C = new android.graphics.Point(0, 0);
    }

    private final int getScreenRotation() {
        if (this.f311992i == null) {
            java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("window");
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            this.f311992i = (android.view.WindowManager) systemService;
        }
        android.view.WindowManager windowManager = this.f311992i;
        if (windowManager == null) {
            return 0;
        }
        android.view.Display defaultDisplay = windowManager != null ? windowManager.getDefaultDisplay() : null;
        java.lang.Integer valueOf = defaultDisplay != null ? java.lang.Integer.valueOf(defaultDisplay.getRotation()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            return 0;
        }
        if (valueOf != null && valueOf.intValue() == 1) {
            return 90;
        }
        if (valueOf != null && valueOf.intValue() == 2) {
            return 180;
        }
        return (valueOf != null && valueOf.intValue() == 3) ? 270 : 0;
    }

    public final int getCameraRotation() {
        at0.n nVar = this.f311996p;
        if (nVar != null) {
            return nVar.f13594b.d();
        }
        return 90;
    }

    public final android.graphics.Bitmap getCurrentFramePicture() {
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        at0.n nVar = this.f311996p;
        kotlin.jvm.internal.o.d(nVar);
        nVar.o(new kt3.a(this, h0Var));
        return (android.graphics.Bitmap) h0Var.f310123d;
    }

    public final float getDisplayRatio() {
        return this.E;
    }

    public final android.graphics.Point getDrawSizePoint() {
        return this.C;
    }

    public final int getFlashMode() {
        at0.n nVar = this.f311996p;
        if (nVar != null) {
            return nVar.f13594b.getFlashMode();
        }
        return 0;
    }

    public final android.graphics.Point getPictureSize() {
        st3.b bVar = this.f311995o;
        return new android.graphics.Point(0, 0);
    }

    public final android.graphics.Point getPreviewSize() {
        android.graphics.Point v17;
        at0.n nVar = this.f311996p;
        return (nVar == null || (v17 = nVar.f13594b.v(false)) == null) ? new android.graphics.Point() : v17;
    }

    public final float[] getSupportZoomRatios() {
        at0.n nVar = this.f311996p;
        if (nVar == null || nVar.f13604l != 0) {
            return null;
        }
        return nVar.f13594b.A();
    }

    public final android.graphics.Point getVideoSize() {
        st3.b bVar = this.f311995o;
        return new android.graphics.Point(0, 0);
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout, yt3.r2
    public void onPause() {
        super.onPause();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCameraPluginLayout", "onPause");
        at0.n nVar = this.f311996p;
        kotlin.jvm.internal.o.d(nVar);
        nVar.k();
        di3.d dVar = this.f311997q;
        kotlin.jvm.internal.o.d(dVar);
        dVar.disable();
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout, yt3.r2
    public void onResume() {
        super.onResume();
        di3.d dVar = this.f311997q;
        kotlin.jvm.internal.o.d(dVar);
        dVar.enable();
        at0.n nVar = this.f311996p;
        if (nVar != null) {
            kt3.f fVar = new kt3.f(this);
            ts0.r rVar = nVar.f13594b;
            ((ts0.b) rVar).f421528j = true;
            rVar.k(new at0.a(fVar));
        }
        at0.n nVar2 = this.f311996p;
        kotlin.jvm.internal.o.d(nVar2);
        at0.n.i(nVar2, this.f312005y, null, new kt3.g(this), 2, null);
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout, yt3.r2
    public void release() {
        super.release();
        com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView cameraPreviewGLSurfaceView = this.f311994n;
        if (cameraPreviewGLSurfaceView != null) {
            cameraPreviewGLSurfaceView.setOnTouchListener(null);
        }
        com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView cameraPreviewGLSurfaceView2 = this.f311994n;
        if (cameraPreviewGLSurfaceView2 != null) {
            cameraPreviewGLSurfaceView2.release();
        }
        this.f311994n = null;
        at0.n nVar = this.f311996p;
        if (nVar != null) {
            nVar.d();
        }
        this.f311996p = null;
        di3.d dVar = this.f311997q;
        if (dVar != null) {
            dVar.f232689g = null;
        }
        if (dVar != null) {
            dVar.disable();
        }
        this.f311997q = null;
        this.f311995o = null;
    }

    public final void setDisplayRatio(float f17) {
        this.E = f17;
    }

    public final void setFlashMode(int i17) {
        at0.n nVar = this.f311996p;
        if (nVar != null) {
            nVar.f13594b.setFlashMode(i17);
        }
    }

    public final void setForceZoomTargetRatio(float f17) {
        at0.n nVar = this.f311996p;
        if (nVar == null || nVar.f13604l != 0) {
            return;
        }
        nVar.f13594b.l(f17);
    }

    public final void setFrameDataCallback(bi3.c cVar) {
        this.f312000t = cVar;
    }

    public final void setInitDoneCallback(bi3.e eVar) {
        this.f312002v = eVar;
    }

    public final void setInitErrorCallback(bi3.f fVar) {
        this.f312001u = fVar;
    }

    public final void setPreviewMode(int i17) {
        this.f311993m = i17;
    }

    public final void setRGBSizeLimit(int i17) {
        this.D = i17;
    }

    public final void setRecordCallback(bi3.j jVar) {
        this.f311999s = jVar;
    }

    public final void setTouchListener(com.tencent.mm.plugin.api.recordView.h callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.plugin.api.recordView.i iVar = new com.tencent.mm.plugin.api.recordView.i();
        this.f312003w = iVar;
        iVar.f74748g = callback;
    }

    public final void setUseBackCamera(boolean z17) {
        this.f312005y = z17;
    }

    @Override // ju3.d0
    public void w(ju3.c0 status, android.os.Bundle bundle) {
        boolean z17;
        bi3.f fVar;
        ht0.b bVar;
        kotlin.jvm.internal.o.g(status, "status");
        int ordinal = status.ordinal();
        if (ordinal == 0) {
            if (bundle != null) {
                at0.n nVar = this.f311996p;
                kotlin.jvm.internal.o.d(nVar);
                int i17 = bundle.getInt("PARAM_PREPARE_CAMERA_ZOOM_LOCATION_INT");
                if (nVar.f13604l == 0) {
                    nVar.f13594b.u(i17, 10);
                    return;
                }
                return;
            }
            return;
        }
        if (ordinal == 1) {
            if (bundle != null) {
                at0.n nVar2 = this.f311996p;
                kotlin.jvm.internal.o.d(nVar2);
                nVar2.p(bundle.getBoolean("PARAM_PREPARE_CAMERA_ZOOM_BOOLEAN", true), bundle.getBoolean("PARAM_PREPARE_CAMERA_ZOOM_SCROLL_BOOLEAN", true), bundle.getInt("PARAM_PREPARE_CAMERA_ZOOM_FACTOR_INT"));
                return;
            }
            return;
        }
        if (ordinal == 2) {
            z17 = bundle != null ? bundle.getBoolean("PARAM_PREPARE_CAMERA_IGNORE_FLIP_CHECK_BOOLEAN", false) : false;
            at0.n nVar3 = this.f311996p;
            kotlin.jvm.internal.o.d(nVar3);
            nVar3.m(z17);
            z();
            return;
        }
        if (ordinal == 4) {
            if (bundle != null) {
                float f17 = bundle.getFloat("PARAM_POINT_X");
                float f18 = bundle.getFloat("PARAM_POINT_Y");
                at0.n nVar4 = this.f311996p;
                kotlin.jvm.internal.o.d(nVar4);
                com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView cameraPreviewGLSurfaceView = this.f311994n;
                kotlin.jvm.internal.o.d(cameraPreviewGLSurfaceView);
                int width = cameraPreviewGLSurfaceView.getWidth();
                com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView cameraPreviewGLSurfaceView2 = this.f311994n;
                kotlin.jvm.internal.o.d(cameraPreviewGLSurfaceView2);
                nVar4.c(f17, f18, width, cameraPreviewGLSurfaceView2.getHeight(), 400L);
                return;
            }
            return;
        }
        if (ordinal == 5) {
            boolean z18 = bundle != null ? bundle.getBoolean("PARAM_RECORD_RESULT_MIRROR_BOOLEAN", true) : true;
            z17 = bundle != null ? bundle.getBoolean("PARAM_RECORD_MUTED_BOOLEAN", false) : false;
            at0.n nVar5 = this.f311996p;
            if (nVar5 != null) {
                nVar5.f13610r = z18;
            }
            if (nVar5 != null && (bVar = nVar5.f13595c) != null) {
                bVar.setMute(z17);
            }
            at0.n nVar6 = this.f311996p;
            kotlin.jvm.internal.o.d(nVar6);
            di3.d dVar = this.f311997q;
            kotlin.jvm.internal.o.d(dVar);
            boolean c17 = dVar.c();
            di3.d dVar2 = this.f311997q;
            kotlin.jvm.internal.o.d(dVar2);
            if (nVar6.j(c17, dVar2.a()) || (fVar = this.f312001u) == null) {
                return;
            }
            fVar.a();
            return;
        }
        if (ordinal == 6) {
            at0.n nVar7 = this.f311996p;
            kotlin.jvm.internal.o.d(nVar7);
            if (nVar7.l(new kt3.k(this))) {
                return;
            }
            bi3.j jVar = this.f311999s;
            if (jVar != null) {
                jVar.a(true);
            }
            at0.n nVar8 = this.f311996p;
            if (nVar8 != null) {
                nVar8.e();
                return;
            }
            return;
        }
        if (ordinal != 15) {
            return;
        }
        at0.n nVar9 = this.f311996p;
        kotlin.jvm.internal.o.d(nVar9);
        nVar9.f13594b.s(this.f312006z);
        at0.n nVar10 = this.f311996p;
        kotlin.jvm.internal.o.d(nVar10);
        boolean z19 = this.A;
        kt3.j jVar2 = new kt3.j(this);
        if (z19) {
            nVar10.o(new at0.m(nVar10, jVar2));
        } else {
            nVar10.o(new at0.j(jVar2));
        }
    }

    public final boolean y(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        if (this.f312004x != null) {
            int screenRotation = getScreenRotation();
            com.tencent.mm.plugin.api.recordView.m mVar = this.f312004x;
            if (mVar != null && (mVar.f74764j || mVar.f74757c != null)) {
                com.tencent.mm.plugin.api.recordView.k kVar = new com.tencent.mm.plugin.api.recordView.k(mVar, bArr, screenRotation);
                if (mVar.f74755a.isAlive()) {
                    mVar.f74756b.post(kVar);
                }
            }
        }
        if (this.f312000t == null) {
            return true;
        }
        android.graphics.Point previewSize = getPreviewSize();
        bi3.c cVar = this.f312000t;
        if (cVar == null) {
            return true;
        }
        cVar.a(bArr, previewSize.x, previewSize.y);
        return true;
    }

    public final void z() {
        android.graphics.Point previewSize = getPreviewSize();
        android.graphics.Point point = this.C;
        int i17 = this.D;
        point.y = i17;
        point.x = (previewSize.x * i17) / previewSize.y;
        if (getScreenRotation() == 0 || getScreenRotation() == 180) {
            int i18 = point.y;
            point.y = point.x;
            point.x = i18;
        }
        com.tencent.mm.plugin.api.recordView.m mVar = this.f312004x;
        if (mVar != null) {
            int i19 = previewSize.x;
            int i27 = previewSize.y;
            at0.n nVar = this.f311996p;
            int d17 = nVar != null ? nVar.f13594b.d() : 0;
            int i28 = point.x;
            int i29 = point.y;
            com.tencent.mars.xlog.Log.i("MicroMsg.YUVDateRenderToRBGBufferThread", "setFrameInfo, width: %s, height: %s, rotate: %s ,targetWidth:%d ,targetHeight:%d , this: %s ", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(d17), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29), mVar);
            if (i19 != mVar.f74759e || i27 != mVar.f74760f || d17 != mVar.f74761g) {
                mVar.f74759e = i19;
                mVar.f74760f = i27;
                mVar.f74761g = d17;
            }
            mVar.f74762h = i28;
            mVar.f74763i = i29;
        }
    }
}
