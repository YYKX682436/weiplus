package com.tencent.mm.plugin.mmsight.ui;

@db5.a(3)
/* loaded from: classes10.dex */
public class SightCaptureUI extends com.tencent.mm.ui.MMActivity implements r90.j, ei3.k {
    public static final /* synthetic */ int N1 = 0;
    public android.view.ViewGroup A;
    public android.widget.ImageView B;
    public com.tencent.mm.plugin.mmsight.ui.cameraglview.MMSightCameraGLSurfaceView C;
    public hi3.b D;
    public android.widget.TextView E;
    public android.graphics.Point E1;
    public com.tencent.mm.plugin.mmsight.ui.MMSightCaptureTouchView F;
    public android.view.View G;
    public com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView H;
    public java.lang.String H1;
    public com.tencent.mm.plugin.mmsight.ui.VideoSeekBarEditorView I;
    public java.lang.String I1;

    /* renamed from: J, reason: collision with root package name */
    public com.tencent.mm.plugin.mmsight.ui.MMSightTopCountdownCoverView f149227J;
    public boolean J1;
    public com.tencent.mm.plugin.mmsight.ui.a2 K;
    public android.os.Bundle K1;
    public byte[] N;
    public int P;
    public int Q;
    public int R;
    public int S;
    public byte[] T;
    public int U;
    public com.tencent.mm.plugin.mmsight.SightParams V;
    public di3.d X;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.modelcontrol.VideoTransPara f149232h;

    /* renamed from: i, reason: collision with root package name */
    public di3.n f149233i;

    /* renamed from: m, reason: collision with root package name */
    public ei3.m f149235m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.video.ObservableTextureView f149236n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton f149237o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f149238p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ImageView f149241q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f149242r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f149243s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f149244t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.ViewGroup f149245u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.ViewGroup f149246v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.ImageView f149247w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.ImageView f149248x;

    /* renamed from: x0, reason: collision with root package name */
    public fp.e f149249x0;

    /* renamed from: x1, reason: collision with root package name */
    public wu5.c f149250x1;

    /* renamed from: y, reason: collision with root package name */
    public android.graphics.SurfaceTexture f149251y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.mmsight.ui.CameraFrontSightView f149254z;

    /* renamed from: d, reason: collision with root package name */
    public int f149228d = 1;

    /* renamed from: e, reason: collision with root package name */
    public int f149229e = 2;

    /* renamed from: f, reason: collision with root package name */
    public boolean f149230f = true;

    /* renamed from: g, reason: collision with root package name */
    public int f149231g = -1;
    public boolean L = true;
    public r45.vh4 M = new r45.vh4();
    public final k55.k W = new k55.k(com.tencent.mm.sdk.platformtools.x2.f193071a);
    public boolean Y = false;
    public boolean Z = false;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f149239p0 = false;

    /* renamed from: y0, reason: collision with root package name */
    public int f149252y0 = 0;

    /* renamed from: l1, reason: collision with root package name */
    public boolean f149234l1 = false;

    /* renamed from: p1, reason: collision with root package name */
    public int f149240p1 = 0;

    /* renamed from: y1, reason: collision with root package name */
    public long f149253y1 = -1;

    /* renamed from: z1, reason: collision with root package name */
    public long f149255z1 = -1;
    public boolean A1 = false;
    public boolean B1 = false;
    public java.lang.String C1 = "";
    public java.lang.Boolean D1 = java.lang.Boolean.FALSE;
    public final com.tencent.mm.sdk.event.IListener F1 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.HardCoderSystemEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.mmsight.ui.SightCaptureUI.2
        {
            this.__eventId = -637576831;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.HardCoderSystemEvent hardCoderSystemEvent) {
            am.hh hhVar;
            com.tencent.mm.autogen.events.HardCoderSystemEvent hardCoderSystemEvent2 = hardCoderSystemEvent;
            if (hardCoderSystemEvent2 == null || (hhVar = hardCoderSystemEvent2.f54432g) == null) {
                return false;
            }
            java.lang.Integer valueOf = java.lang.Integer.valueOf(hhVar.f6834a);
            com.tencent.mm.plugin.mmsight.ui.SightCaptureUI sightCaptureUI = com.tencent.mm.plugin.mmsight.ui.SightCaptureUI.this;
            com.tencent.mars.xlog.Log.i("MicroMsg.SightCaptureUI", "summerhardcoder system event [%s] backCamera[%s]", valueOf, java.lang.Boolean.valueOf(sightCaptureUI.L));
            if (hhVar.f6834a != 1 || !sightCaptureUI.L) {
                return false;
            }
            sightCaptureUI.g7();
            return false;
        }
    };
    public final java.lang.Runnable G1 = new com.tencent.mm.plugin.mmsight.ui.c3(this);
    public final java.lang.Runnable L1 = new com.tencent.mm.plugin.mmsight.ui.d3(this);
    public final com.tencent.mm.pluginsdk.ui.tools.a4 M1 = new com.tencent.mm.plugin.mmsight.ui.g3(this);

    /* JADX WARN: Finally extract failed */
    public static void T6(com.tencent.mm.plugin.mmsight.ui.SightCaptureUI sightCaptureUI) {
        di3.n nVar = sightCaptureUI.f149233i;
        if (nVar == null || !nVar.f232742i || sightCaptureUI.X == null || sightCaptureUI.f149234l1) {
            return;
        }
        long j17 = sightCaptureUI.f149255z1;
        if (j17 >= 0) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (android.os.SystemClock.elapsedRealtime() - j17 < 300) {
                return;
            }
        }
        sightCaptureUI.f149234l1 = true;
        android.widget.TextView textView = sightCaptureUI.E;
        if (textView != null && sightCaptureUI.f149230f) {
            textView.setVisibility(8);
        }
        int i17 = sightCaptureUI.f149231g;
        sightCaptureUI.i7(7);
        sightCaptureUI.f149237o.setTouchEnable(false);
        boolean c17 = sightCaptureUI.X.c();
        sightCaptureUI.f149239p0 = c17;
        sightCaptureUI.T = null;
        sightCaptureUI.U = -1;
        di3.n nVar2 = sightCaptureUI.f149233i;
        com.tencent.mm.plugin.mmsight.ui.l2 l2Var = new com.tencent.mm.plugin.mmsight.ui.l2(sightCaptureUI, i17);
        int a17 = sightCaptureUI.X.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCamera", "takePicture, callback: %s, currentFrameData: %s, isLandscape: %s, degree: %s", l2Var, nVar2.K, java.lang.Boolean.valueOf(c17), java.lang.Integer.valueOf(a17));
        if (nVar2.K != null) {
            try {
                try {
                    nVar2.L = true;
                    android.graphics.Point point = new android.graphics.Point();
                    android.graphics.Point point2 = nVar2.f232753w;
                    if (point2 != null) {
                        point.x = point2.x;
                        point.y = point2.y;
                    } else if (nVar2.f232754x == null || !nVar2.f232755y) {
                        di3.g0 g0Var = nVar2.f232739f;
                        point.x = g0Var.f232711c;
                        point.y = g0Var.f232710b;
                    } else {
                        android.graphics.Point point3 = nVar2.f232752v;
                        point.x = point3.x;
                        point.y = point3.y;
                    }
                    byte[] m17 = ei3.x.f253187d.m(java.lang.Integer.valueOf(nVar2.K.length));
                    java.lang.System.arraycopy(nVar2.K, 0, m17, 0, nVar2.K.length);
                    l2Var.a(m17, point.x, point.y, nVar2.f232744n.f447714b, a17);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MMSightCamera", "takePicture error: %s", e17.getMessage());
                    nVar2.L = false;
                    l2Var.a(null, 0, 0, -1, 0);
                }
                nVar2.L = false;
            } catch (java.lang.Throwable th6) {
                nVar2.L = false;
                throw th6;
            }
        } else {
            l2Var.a(null, 0, 0, -1, 0);
        }
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sightCaptureUI.f149255z1 = android.os.SystemClock.elapsedRealtime();
    }

    public static void U6(com.tencent.mm.plugin.mmsight.ui.SightCaptureUI sightCaptureUI) {
        sightCaptureUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.SightCaptureUI", "setRevertAndSendBtnPos");
        if (sightCaptureUI.f149248x.getVisibility() == 8) {
            sightCaptureUI.F.setVisibility(8);
        } else {
            sightCaptureUI.F.setVisibility(0);
        }
        android.graphics.Point f17 = ai3.d.f(sightCaptureUI);
        int dimensionPixelSize = sightCaptureUI.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a5y);
        int dimensionPixelSize2 = sightCaptureUI.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480567a60);
        sightCaptureUI.f149237o.getX();
        float f18 = dimensionPixelSize2;
        float f19 = dimensionPixelSize / 2.0f;
        sightCaptureUI.f149238p.setTranslationX(((f17.x / 2.0f) - f18) - f19);
        sightCaptureUI.f149241q.setTranslationX(((-f17.x) / 2.0f) + f18 + f19);
        sightCaptureUI.f149238p.setEnabled(false);
        sightCaptureUI.f149241q.setEnabled(false);
    }

    public static void V6(com.tencent.mm.plugin.mmsight.ui.SightCaptureUI sightCaptureUI) {
        sightCaptureUI.f149238p.animate().translationX(0.0f).setDuration(200L).setListener(new com.tencent.mm.plugin.mmsight.ui.a3(sightCaptureUI)).start();
        sightCaptureUI.f149241q.animate().translationX(0.0f).setDuration(200L).setListener(new com.tencent.mm.plugin.mmsight.ui.b3(sightCaptureUI)).start();
    }

    public final java.lang.String W6(java.lang.String str, boolean z17) {
        boolean z18 = com.tencent.mm.plugin.mmsight.model.CaptureMMProxy.getInstance().getBoolean(com.tencent.mm.storage.u3.USERINFO_WEIXIN_CAMERASAVEIMAGE_STATE_BOOLEAN, true);
        boolean z19 = com.tencent.mm.plugin.mmsight.model.CaptureMMProxy.getInstance().getBoolean(com.tencent.mm.storage.u3.USERINFO_WEIXIN_CAMERASAVEVIDEO_STATE_BOOLEAN, true);
        java.lang.String g17 = z17 ? ai3.d.g("jpg") : ai3.d.h("mp4");
        if ((z18 && z17) || (z19 && !z17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SightCaptureUI", "auto save src %s dest %s state %s %s", str, g17, java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z19));
            com.tencent.mm.vfs.w6.c(str, g17);
            q75.c.f(g17, this);
        }
        return g17;
    }

    public final void X6() {
        if (com.tencent.mm.plugin.mmsight.model.CaptureMMProxy.getInstance().getInt(com.tencent.mm.storage.u3.USERINFO_LOCAL_SIGHT_DEBUGINFO_INT_SYNC, 0) == 1) {
            android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.oyh);
            textView.setVisibility(8);
            textView.setText("");
        }
    }

    public final void Y6(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SightCaptureUI", "[clearPhotoEditCache] isDelete:%s mLastEditPhotoPath:%s mRawEditPhotoPath:%s", java.lang.Boolean.valueOf(z17), this.I1, this.H1);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.I1) && z17) {
            com.tencent.mm.vfs.w6.h(this.I1);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.H1)) {
            com.tencent.mm.vfs.w6.h(this.H1);
        }
        this.I1 = null;
        this.H1 = null;
        com.tencent.mm.autogen.events.PhotoEditOperationEvent photoEditOperationEvent = new com.tencent.mm.autogen.events.PhotoEditOperationEvent();
        photoEditOperationEvent.f54616g.getClass();
        photoEditOperationEvent.e();
    }

    public final void Z6() {
        com.tencent.mm.plugin.video.ObservableTextureView observableTextureView = this.f149236n;
        if (observableTextureView != null) {
            observableTextureView.setTextureChangeCallback(null);
        }
        di3.n nVar = this.f149233i;
        if (nVar != null) {
            this.L = nVar.Q;
            nVar.b();
            this.f149253y1 = -1L;
            this.f149255z1 = -1L;
        }
    }

    public final boolean a7(boolean z17) {
        int i17;
        com.tencent.mm.vfs.x1 m17;
        di3.o frameDataCallback;
        com.tencent.mm.sdk.platformtools.Log.a("MicroMsg.SightCaptureUI", "createRecorder, surface: %s", this.f149251y);
        this.B1 = false;
        ei3.m mVar = this.f149235m;
        if (mVar != null) {
            di3.n nVar = this.f149233i;
            if (nVar != null && (frameDataCallback = mVar.getFrameDataCallback()) != null) {
                ((java.util.ArrayList) nVar.A).remove(frameDataCallback);
            }
            this.f149235m.cancel();
        }
        if (this.f149233i == null) {
            return false;
        }
        r45.vh4 vh4Var = new r45.vh4();
        this.M = vh4Var;
        vh4Var.f388235e = true;
        vh4Var.f388234d = di3.w.f232770d.f232708i;
        com.tencent.mm.plugin.mmsight.SightParams sightParams = this.V;
        if (sightParams != null) {
            vh4Var.f388237g = sightParams.f148825o;
        }
        if (z17) {
            boolean p17 = this.f149233i.p(this, this.f149251y, true);
            this.L = this.f149233i.Q;
            if (!p17) {
                return false;
            }
        } else if (this.f149233i.o(this.f149251y, true, 0) < 0) {
            return false;
        }
        if (this.f149233i.f232752v == null) {
            return false;
        }
        com.tencent.mm.modelcontrol.VideoTransPara videoTransPara = this.f149232h;
        int i18 = di3.w.f232770d.f232700a;
        java.lang.String str = null;
        ei3.m w0Var = i18 != 1 ? i18 != 2 ? null : new ei3.w0(videoTransPara) : new ei3.k0(videoTransPara);
        this.f149235m = w0Var;
        if (w0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SightCaptureUI", "create mediaRecorder error");
            this.B1 = true;
            return false;
        }
        com.tencent.mm.plugin.mmsight.SightParams sightParams2 = this.V;
        boolean z18 = ai3.d.f5107a;
        java.lang.String str2 = sightParams2.f148822i;
        java.lang.String str3 = sightParams2.f148820g;
        java.lang.String str4 = sightParams2.f148821h;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2) || com.tencent.mm.sdk.platformtools.t8.K0(str3) || com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            java.lang.String k17 = ai3.d.k(com.tencent.mm.plugin.mmsight.model.CaptureMMProxy.getInstance().getAccVideoPath());
            java.lang.String m18 = ai3.d.m(k17);
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightUtil", "setMMSightRecorderPathDefault, filePath: %s, thumbPath: %s", k17, m18);
            w0Var.f(k17);
            w0Var.w(m18);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightUtil", "setMMSightRecorderPathByTalker, fileName: %s, filePath: %s, thumbPath: %s", str2, str3, str4);
            w0Var.f(str3);
            w0Var.w(str4);
        }
        java.lang.String subCoreImageFullPath = com.tencent.mm.plugin.mmsight.model.CaptureMMProxy.getInstance().getSubCoreImageFullPath("capture_" + java.lang.System.currentTimeMillis() + "");
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightUtil", "captureImagePath %s", subCoreImageFullPath);
        w0Var.s(subCoreImageFullPath);
        this.f149235m.u(this);
        di3.n nVar2 = this.f149233i;
        di3.o frameDataCallback2 = this.f149235m.getFrameDataCallback();
        if (frameDataCallback2 != null) {
            ((java.util.ArrayList) nVar2.A).add(frameDataCallback2);
        } else {
            nVar2.getClass();
        }
        hi3.b bVar = this.D;
        if (bVar != null) {
            bVar.b(this.f149233i.e(), this.f149233i.d(), this.f149233i.c());
        }
        com.tencent.mm.plugin.mmsight.SightParams sightParams3 = this.V;
        if (sightParams3 != null && sightParams3.f148825o == 3 && (((i17 = sightParams3.f148817d) == 2 || i17 == 0) && !com.tencent.mm.sdk.platformtools.t8.K0(sightParams3.f148823m) && !com.tencent.mm.sdk.platformtools.t8.K0(this.V.f148822i))) {
            com.tencent.mm.plugin.mmsight.SightParams sightParams4 = this.V;
            java.lang.String str5 = sightParams4.f148823m;
            java.lang.String str6 = sightParams4.f148822i;
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str5);
            java.lang.String str7 = a17.f213279f;
            if (str7 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str7, false, false);
                if (!str7.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m19 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
            if (!(m19.a() && (m17 = m19.f213266a.m(m19.f213267b)) != null && m17.f213236f)) {
                int e17 = s46.c.e(str5);
                if (e17 >= 0) {
                    if (e17 >= str5.length()) {
                        int e18 = s46.c.e(str5);
                        if (e18 >= 0) {
                            if (e18 > str5.length()) {
                                s46.c.b(str5.concat("/"));
                                str = str5.concat("/");
                            } else {
                                str = str5.substring(0, e18);
                                s46.c.b(str);
                            }
                        }
                    } else {
                        int f17 = s46.c.f(str5);
                        if (f17 < 0) {
                            str = str5.substring(0, e17);
                        } else {
                            int i19 = f17 + 1;
                            if (i19 == 0) {
                                i19++;
                            }
                            str = str5.substring(0, i19);
                        }
                    }
                }
                if (!str5.equals(str)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SightCaptureUI", "picture path with whole file path");
                }
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(s46.c.c(str6))) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SightCaptureUI", "picture path is a directory, but can't find extension from file name: %s", str6);
            } else {
                this.f149235m.s(str5 + str6);
            }
        }
        ei3.m mVar2 = this.f149235m;
        int e19 = this.f149233i.e();
        int d17 = this.f149233i.d();
        android.graphics.Point point = this.f149233i.f232752v;
        mVar2.r(e19, d17, point.x, point.y);
        boolean k18 = this.f149235m.k(this.f149233i.c());
        com.tencent.mars.xlog.Log.i("MicroMsg.SightCaptureUI", "preInit result: %s", java.lang.Boolean.valueOf(k18));
        if (!k18) {
            this.B1 = true;
        }
        return k18;
    }

    public final void b7() {
        this.B1 = true;
        i7(8);
        ei3.m mVar = this.f149235m;
        if (mVar != null) {
            try {
                mVar.cancel();
                this.f149235m = null;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SightCaptureUI", e17, "", new java.lang.Object[0]);
            }
        }
    }

    public final void c7() {
        i7(0);
        this.f149240p1 = 0;
        this.f149234l1 = false;
        this.B1 = false;
        com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView videoPlayerTextureView = this.H;
        if (videoPlayerTextureView != null) {
            videoPlayerTextureView.stop();
            this.H.setVideoCallback(null);
            try {
                android.view.ViewGroup.LayoutParams layoutParams = this.H.getLayoutParams();
                this.f149245u.removeView(this.H);
                this.f149245u.addView(this.H, 0, layoutParams);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SightCaptureUI", "clearVideoPlayViewContent, error: %s", e17.getMessage());
            }
        }
        com.tencent.mm.plugin.mmsight.ui.a2 a2Var = this.K;
        if (a2Var != null) {
            a2Var.e();
            this.K = null;
        }
        com.tencent.mm.plugin.mmsight.ui.cameraglview.MMSightCameraGLSurfaceView mMSightCameraGLSurfaceView = this.C;
        if (mMSightCameraGLSurfaceView != null) {
            mMSightCameraGLSurfaceView.setVisibility(0);
        }
        this.B.setImageBitmap(null);
        Z6();
        di3.n nVar = new di3.n(this.f149232h, this.V.f148825o);
        this.f149233i = nVar;
        di3.o oVar = this.D.f281509a;
        if (oVar != null) {
            ((java.util.ArrayList) nVar.A).add(oVar);
        }
        this.f149227J.setVisibility(8);
        if (!this.f149233i.f(this, this.L)) {
            i7(8);
            return;
        }
        if (this.f149236n.isAvailable()) {
            android.graphics.SurfaceTexture surfaceTexture = this.f149236n.getSurfaceTexture();
            this.f149251y = surfaceTexture;
            com.tencent.mars.xlog.Log.i("MicroMsg.SightCaptureUI", "surface already available, directly set local surface: %s", surfaceTexture);
            if (a7(false)) {
                i7(1);
            } else {
                i7(8);
            }
        } else {
            this.f149236n.setTextureChangeCallback(new com.tencent.mm.plugin.mmsight.ui.o2(this));
        }
        android.widget.TextView textView = this.E;
        if (textView != null && this.f149230f) {
            textView.setAlpha(1.0f);
            this.E.setVisibility(0);
        }
        di3.d dVar = this.X;
        dVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.DeviceOrientationListener", "reset");
        dVar.f232687e = -1;
        dVar.f232686d = -1;
        this.Y = false;
        this.Z = false;
    }

    public final void d7() {
        if (com.tencent.mm.plugin.mmsight.model.CaptureMMProxy.getInstance().getInt(com.tencent.mm.storage.u3.USERINFO_LOCAL_SIGHT_DEBUGINFO_INT_SYNC, 0) == 1) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("test for debug ");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb6.append(com.tencent.mm.sdk.platformtools.z3.b(true));
            com.tencent.mars.xlog.Log.i("MicroMsg.SightCaptureUI", sb6.toString());
            di3.u.f232763a.postDelayed(new com.tencent.mm.plugin.mmsight.ui.w2(this), 2000L);
        }
    }

    public final int e7() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SightCaptureUI", "startRecordImpl");
        int y17 = this.f149235m.y(this.f149233i.c(), this.X.c(), this.X.a());
        com.tencent.mars.xlog.Log.i("MicroMsg.SightCaptureUI", "startRecordImpl ret: %d", java.lang.Integer.valueOf(y17));
        if (y17 >= 0) {
            this.f149233i.m(di3.l.Recording);
        }
        return y17;
    }

    public final void f7() {
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.SightCaptureUI", "stopRecord, currentStatus: %s", java.lang.Integer.valueOf(this.f149231g));
        if (this.f149231g == 2) {
            i7(7);
            this.f149237o.setTouchEnable(false);
            if (this.V.f148829s) {
                this.f149227J.b();
            }
            this.f149235m.g(new com.tencent.mm.plugin.mmsight.ui.s2(this, this.f149233i.e(), this.f149233i.d()));
        }
    }

    public final void g7() {
        ei3.m mVar;
        long j17 = this.f149253y1;
        if (j17 > 0) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (android.os.SystemClock.elapsedRealtime() - j17 <= 500) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SightCaptureUI", "switchCameraClick, switch camera too frequently!!! ignore");
                return;
            }
        }
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mm.sdk.platformtools.z3.b(true);
        X6();
        this.Y = true;
        int i17 = this.f149231g;
        if (i17 == 2) {
            ei3.m mVar2 = this.f149235m;
            if (mVar2 == null || !mVar2.j()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SightCaptureUI", "switchCameraClick, not write camera data!");
            } else {
                java.lang.Object[] objArr = new java.lang.Object[2];
                objArr[0] = java.lang.Integer.valueOf(this.f149231g);
                ei3.m mVar3 = this.f149235m;
                objArr[1] = mVar3 != null ? mVar3.t() : "";
                com.tencent.mars.xlog.Log.i("MicroMsg.SightCaptureUI", "switchCameraOnRecord, currentStatus: %s, mediaRecorder.status: %s", objArr);
                if (this.f149231g == 2 && (mVar = this.f149235m) != null && mVar.t() == ei3.l.Start) {
                    this.f149235m.pause();
                    this.f149233i.p(this, this.f149251y, false);
                    di3.n nVar = this.f149233i;
                    this.L = nVar.Q;
                    hi3.b bVar = this.D;
                    if (bVar != null) {
                        bVar.b(nVar.e(), this.f149233i.d(), this.f149233i.c());
                    }
                    if (this.f149235m.t() != ei3.l.Pause) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.SightCaptureUI", "switchCameraOnRecord, recorder status error: %s", this.f149235m.t());
                    } else {
                        int e17 = this.f149233i.e();
                        int d17 = this.f149233i.d();
                        int c17 = this.f149233i.c();
                        android.graphics.Point m17 = this.f149235m.m();
                        int x17 = this.f149235m.x();
                        com.tencent.mars.xlog.Log.i("MicroMsg.SightCaptureUI", "switchCameraOnRecord, newPreviewSize: [%s, %s], oldPreviewSize: [%s], newOrientation: %s, oldOrientation: %s", java.lang.Integer.valueOf(e17), java.lang.Integer.valueOf(d17), m17, java.lang.Integer.valueOf(c17), java.lang.Integer.valueOf(x17));
                        if (x17 != c17 || m17.x != e17 || m17.y != d17) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.SightCaptureUI", "error oldOrientation! after switch, size or orientation not match");
                        }
                        ei3.m mVar4 = this.f149235m;
                        int e18 = this.f149233i.e();
                        int d18 = this.f149233i.d();
                        android.graphics.Point point = this.f149233i.f232752v;
                        mVar4.r(e18, d18, point.x, point.y);
                        ei3.m mVar5 = this.f149235m;
                        android.graphics.Point point2 = this.f149233i.f232752v;
                        mVar5.l(c17, point2.x, point2.y);
                    }
                }
                this.Z = true;
            }
        } else if (i17 == 1) {
            i7(6);
            if (a7(true)) {
                i7(1);
            }
        }
        d7();
        this.f149253y1 = android.os.SystemClock.elapsedRealtime();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488195k5;
    }

    public final java.lang.String h7(int i17) {
        return i17 == -1 ? "CAPTURE_STATE_BINGDING" : i17 == 0 ? "CAPTURE_STATE_INIT" : i17 == 1 ? "CAPTURE_STATE_CAPTURING" : i17 == 2 ? "CAPTURE_STATE_RECORDING" : i17 == 3 ? "CAPTURE_STATE_PREVIEW_PICTURE" : i17 == 4 ? "CAPTURE_STATE_PREVIEW_VIDEO" : i17 == 6 ? "CAPTURE_STATE_SUPERMAN" : i17 == 7 ? "CAPTURE_STATE_WAIT_TO_PREVIEW" : i17 == 8 ? "CAPTURE_STATE_INIT_ERROR" : i17 == 9 ? "CAPTURE_STATE_STOP_ERROR" : "UNKNOW";
    }

    public final void i7(int i17) {
        com.tencent.mm.plugin.mmsight.ui.cameraglview.MMSightCameraGLSurfaceView mMSightCameraGLSurfaceView;
        hi3.c cVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.SightCaptureUI", "pre state %s %s update state %s %s", java.lang.Integer.valueOf(this.f149231g), h7(this.f149231g), java.lang.Integer.valueOf(i17), h7(i17));
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f149231g);
        java.lang.String h76 = h7(this.f149231g);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i17);
        java.lang.String h77 = h7(i17);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.TestCaptureUiEvent", "pre state %s %s update state %s %s %s", valueOf, h76, valueOf2, h77, com.tencent.mm.sdk.platformtools.z3.b(true));
        if (i17 == this.f149231g || this.f149245u == null) {
            return;
        }
        ai3.d.x("TIME_RECODER_2_PLAY");
        this.f149231g = i17;
        java.lang.Runnable runnable = this.G1;
        if (i17 != 7) {
            com.tencent.mm.sdk.platformtools.u3.l(runnable);
        }
        int i18 = this.f149231g;
        if (i18 == 0) {
            this.f149245u.setVisibility(8);
            this.f149248x.setVisibility(8);
            this.f149246v.setVisibility(8);
            this.B.setVisibility(8);
            this.A.setVisibility(0);
            if (this.f149252y0 > 1) {
                this.f149247w.setVisibility(0);
            }
            di3.n nVar = this.f149233i;
            if (nVar != null) {
                nVar.m(di3.l.Preview);
            }
            di3.b.c();
            wu5.c cVar2 = this.f149250x1;
            if (cVar2 != null) {
                try {
                    cVar2.cancel(true);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SightCaptureUI", e17, "update to state init, interrupt failed: %s", e17.getMessage());
                }
                this.f149250x1 = null;
                return;
            }
            return;
        }
        if (i18 == 1 || i18 == 2) {
            this.f149245u.setVisibility(0);
            this.f149248x.setVisibility(8);
            this.f149246v.setVisibility(0);
            this.f149246v.setClipChildren(false);
            this.f149238p.setVisibility(8);
            this.f149241q.setVisibility(8);
            android.view.View view = this.f149244t;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/mmsight/ui/SightCaptureUI", "updateState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/mmsight/ui/SightCaptureUI", "updateState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f149237o.setVisibility(0);
            this.H.setVisibility(8);
            if (this.f149231g == 1) {
                this.f149237o.f();
            } else {
                this.f149237o.setTouchEnable(true);
                this.f149237o.d();
            }
            android.view.View view2 = this.G;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/mmsight/ui/SightCaptureUI", "updateState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/mmsight/ui/SightCaptureUI", "updateState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.B.setVisibility(8);
            this.F.setVisibility(0);
            if (this.f149252y0 > 1) {
                this.f149247w.setVisibility(0);
            }
            this.F.bringToFront();
            this.f149247w.bringToFront();
            X6();
            d7();
            return;
        }
        if (i18 == 4 || i18 == 3) {
            this.f149245u.setVisibility(0);
            this.f149246v.setVisibility(8);
            this.f149246v.setClipChildren(false);
            this.f149238p.setVisibility(0);
            this.f149241q.setVisibility(0);
            android.view.View view3 = this.f149244t;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/mmsight/ui/SightCaptureUI", "updateState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/mmsight/ui/SightCaptureUI", "updateState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f149237o.setVisibility(8);
            if (this.f149231g == 3) {
                if (this.V.f148828r) {
                    this.f149248x.setVisibility(0);
                }
                this.B.setVisibility(0);
                this.H.setVisibility(8);
            } else {
                this.B.setVisibility(8);
                this.H.setVisibility(0);
                this.H.setForceScaleFullScreen(true);
                android.view.ViewGroup.LayoutParams layoutParams = this.H.getLayoutParams();
                layoutParams.width = -1;
                layoutParams.height = -1;
                this.H.setLayoutParams(layoutParams);
                if (this.f149235m.h() && (mMSightCameraGLSurfaceView = this.D.f281510b) != null && (cVar = mMSightCameraGLSurfaceView.f149302d) != null) {
                    cVar.f281534u = true;
                    mMSightCameraGLSurfaceView.requestRender();
                }
                this.A.setVisibility(8);
            }
            this.F.setVisibility(8);
            return;
        }
        if (i18 == 6) {
            this.f149238p.setVisibility(8);
            this.f149241q.setVisibility(8);
            this.f149248x.setVisibility(8);
            android.view.View view4 = this.f149244t;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/mmsight/ui/SightCaptureUI", "updateState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/mmsight/ui/SightCaptureUI", "updateState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f149237o.setVisibility(8);
            return;
        }
        if (i18 == 7) {
            this.f149238p.setVisibility(8);
            this.f149241q.setVisibility(8);
            android.view.View view5 = this.f149244t;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/mmsight/ui/SightCaptureUI", "updateState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/mmsight/ui/SightCaptureUI", "updateState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f149247w.setVisibility(8);
            this.f149248x.setVisibility(8);
            this.f149237o.setTouchEnable(false);
            com.tencent.mm.sdk.platformtools.u3.i(runnable, 1500L);
            this.f149237o.c();
            return;
        }
        if (i18 != 8) {
            if (i18 == 9) {
                this.f149238p.setVisibility(8);
                this.f149241q.setVisibility(8);
                this.f149248x.setVisibility(8);
                android.view.View view6 = this.f149244t;
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                arrayList6.add(0);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/mmsight/ui/SightCaptureUI", "updateState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(view6, "com/tencent/mm/plugin/mmsight/ui/SightCaptureUI", "updateState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f149247w.setVisibility(8);
                this.f149237o.f();
                this.f149237o.setTouchEnable(false);
                this.f149237o.setEnabled(false);
                dp.a.makeText(this, com.tencent.mm.R.string.f492542gw3, 1).show();
                return;
            }
            return;
        }
        this.f149245u.setVisibility(0);
        this.f149246v.setVisibility(0);
        this.f149246v.setClipChildren(false);
        this.f149238p.setVisibility(8);
        this.f149241q.setVisibility(8);
        this.f149248x.setVisibility(8);
        android.view.View view7 = this.f149244t;
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
        arrayList7.add(0);
        java.util.Collections.reverse(arrayList7);
        yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/mmsight/ui/SightCaptureUI", "updateState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
        yj0.a.f(view7, "com/tencent/mm/plugin/mmsight/ui/SightCaptureUI", "updateState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (this.f149252y0 > 1) {
            this.f149247w.setVisibility(0);
        }
        this.f149237o.setVisibility(0);
        this.F.setVisibility(0);
        this.H.setVisibility(8);
        android.view.View view8 = this.G;
        java.util.ArrayList arrayList8 = new java.util.ArrayList();
        arrayList8.add(8);
        java.util.Collections.reverse(arrayList8);
        yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/plugin/mmsight/ui/SightCaptureUI", "updateState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
        yj0.a.f(view8, "com/tencent/mm/plugin/mmsight/ui/SightCaptureUI", "updateState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.B.setVisibility(8);
        if (this.B1) {
            dp.a.makeText(this, com.tencent.mm.R.string.f492541gw2, 1).show();
        } else {
            dp.a.makeText(this, com.tencent.mm.R.string.gw7, 1).show();
        }
        this.f149237o.setTouchEnable(false);
        this.f149237o.setEnabled(false);
    }

    @Override // ei3.k
    public void j(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SightCaptureUI", "onError: %s", java.lang.Integer.valueOf(i17));
        if (i17 != 1) {
            return;
        }
        try {
            ei3.m mVar = this.f149235m;
            if (mVar != null) {
                mVar.reset();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SightCaptureUI", "onError, reset mediaRecorder error: %s", e17.getMessage());
        }
        i7(9);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(i18);
        objArr[2] = java.lang.Boolean.valueOf(intent == null);
        com.tencent.mars.xlog.Log.i("MicroMsg.SightCaptureUI", "[onActivityResult] requestCode:%s  resultCode:%s data is null?:", objArr);
        if (i17 != 4369) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SightCaptureUI", "[handlePhotoEditResult] resultCode:%s", java.lang.Integer.valueOf(i18));
        if (i18 != -1 || intent == null || this.f149235m == null) {
            return;
        }
        this.J1 = true;
        this.K1 = intent.getBundleExtra("report_info");
        this.H1 = intent.getStringExtra("raw_photo_path");
        this.I1 = intent.getStringExtra("after_photo_edit");
        boolean z17 = com.tencent.mm.plugin.mmsight.model.CaptureMMProxy.getInstance().getBoolean(com.tencent.mm.storage.u3.USERINFO_WEIXIN_CAMERASAVEIMAGE_STATE_BOOLEAN, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.SightCaptureUI", "rawEditPhotoPath:%s lastEditPhotoPath:%s imageState:%s", this.H1, this.I1, java.lang.Boolean.valueOf(z17));
        if (z17) {
            this.f149235m.s(this.I1);
        } else {
            java.lang.String i19 = com.tencent.mm.vfs.w6.i("wcf://temp/photoEdited_" + java.lang.System.currentTimeMillis(), true);
            com.tencent.mars.xlog.Log.i("MicroMsg.SightCaptureUI", "saveFullPath:%s", i19);
            com.tencent.mm.vfs.w6.c(this.I1, i19);
            com.tencent.mm.vfs.w6.h(this.I1);
            q75.c.f(this.I1, this);
            this.f149235m.s(i19);
            this.I1 = i19;
        }
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        com.tencent.mm.sdk.platformtools.x.J(this.I1, options);
        com.tencent.mars.xlog.Log.i("MicroMsg.SightCaptureUI", "rawW:%s rawH:%s", java.lang.Integer.valueOf(options.outWidth), java.lang.Integer.valueOf(options.outHeight));
        android.graphics.Bitmap t17 = com.tencent.mm.sdk.platformtools.x.t(this.I1, options.outHeight, options.outWidth, true, false);
        this.B.setVisibility(0);
        this.B.setImageBitmap(t17);
        this.C.setVisibility(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0030 A[RETURN] */
    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBackPressed() {
        /*
            r5 = this;
            int r0 = r5.f149231g
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "MicroMsg.SightCaptureUI"
            java.lang.String r2 = "onBackPressed %d"
            com.tencent.mars.xlog.Log.i(r1, r2, r0)
            com.tencent.mm.plugin.mmsight.ui.a2 r0 = r5.K
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L31
            boolean r3 = r0.C
            if (r3 != 0) goto L1d
        L1b:
            r0 = r2
            goto L2e
        L1d:
            boolean r3 = r0.f149286v
            if (r3 == 0) goto L26
            r0.c()
            r0 = r1
            goto L2e
        L26:
            qk.o9 r0 = r0.f149275k
            if (r0 == 0) goto L1b
            boolean r0 = r0.e()
        L2e:
            if (r0 == 0) goto L31
            return
        L31:
            com.tencent.mm.plugin.mmsight.ui.a2 r0 = r5.K
            r3 = 8
            if (r0 == 0) goto L50
            r0.e()
            r0 = 0
            r5.K = r0
            r5.setSelfNavigationBarVisible(r3)
            android.widget.ImageView r0 = r5.f149238p
            r0.setVisibility(r2)
            android.widget.ImageView r0 = r5.f149241q
            r0.setVisibility(r2)
            android.widget.ImageView r0 = r5.f149248x
            r0.setVisibility(r2)
            return
        L50:
            int r0 = r5.f149231g
            r4 = 4
            if (r0 == r4) goto L60
            r4 = 3
            if (r0 == r4) goto L60
            if (r0 == r1) goto L60
            if (r0 == r3) goto L60
            r3 = 9
            if (r0 != r3) goto L61
        L60:
            r2 = r1
        L61:
            if (r2 == 0) goto L70
            super.onBackPressed()
            r0 = -1
            r2 = 2130772175(0x7f0100cf, float:1.714746E38)
            r5.overridePendingTransition(r0, r2)
            r5.Y6(r1)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.mmsight.ui.SightCaptureUI.onBackPressed():void");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.D1.booleanValue() && fp.h.c(13)) {
            android.graphics.Point point = new android.graphics.Point(configuration.screenWidthDp, configuration.screenHeightDp);
            android.graphics.Point point2 = this.E1;
            if (point2 == null || !point2.equals(point)) {
                this.E1 = point;
                c7();
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        supportRequestWindowFeature(1);
        super.onCreate(bundle);
        com.tencent.mm.plugin.mmsight.SightParams sightParams = (com.tencent.mm.plugin.mmsight.SightParams) getIntent().getParcelableExtra("KEY_SIGHT_PARAMS");
        this.V = sightParams;
        if (sightParams == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SightCaptureUI", "error!!!! sightParams is null!!");
            return;
        }
        k55.k kVar = this.W;
        com.tencent.mm.plugin.mmsight.model.CaptureMMProxy.createProxy(new com.tencent.mm.plugin.mmsight.model.CaptureMMProxy(kVar));
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        kVar.a(new com.tencent.mm.plugin.mmsight.ui.q2(this, android.os.SystemClock.elapsedRealtime()));
        this.F1.alive();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mars.xlog.Log.i("MicroMsg.SightCaptureUI", "onDestroy");
        this.W.d();
        ei3.m mVar = this.f149235m;
        if (mVar != null) {
            mVar.u(null);
            this.f149235m.g(null);
            this.f149235m.clear();
        }
        if (!(this.f149231g == -1)) {
            Z6();
            com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView videoPlayerTextureView = this.H;
            if (videoPlayerTextureView != null) {
                videoPlayerTextureView.stop();
                this.H.setVideoCallback(null);
            }
            fp.e eVar = this.f149249x0;
            if (eVar != null) {
                eVar.a();
            }
            com.tencent.mm.plugin.mmsight.ui.a2 a2Var = this.K;
            if (a2Var != null) {
                a2Var.e();
                this.K = null;
            }
        }
        di3.d dVar = this.X;
        if (dVar != null) {
            dVar.disable();
            this.X.f232689g = null;
            this.X = null;
        }
        ei3.x.f253187d.c();
        this.F1.dead();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (wo.v1.f447822b.f447661f == 1 && i17 == 700 && this.L) {
            g7();
        }
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // r90.j
    public void onOrientationChange(int i17) {
        if (this.f149252y0 > 1 && this.f149231g != 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SightCaptureUI", "onOrientationChange: %s", java.lang.Integer.valueOf(i17));
            if (i17 < 0) {
                return;
            }
            float f17 = (i17 == 90 || i17 == 270) ? i17 == 270 ? 90.0f : -90.0f : i17;
            if (this.f149247w.getRotation() == f17) {
                return;
            }
            this.f149247w.animate().rotation(f17).setDuration(100L).start();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView videoPlayerTextureView;
        super.onPause();
        com.tencent.mars.xlog.Log.i("MicroMsg.SightCaptureUI", "onPause, currentState: %s", h7(this.f149231g));
        int i17 = this.f149231g;
        if (i17 == 2) {
            f7();
            return;
        }
        if (i17 == 1) {
            Z6();
        } else {
            if (i17 != 4 || (videoPlayerTextureView = this.H) == null) {
                return;
            }
            videoPlayerTextureView.pause();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        hi3.c cVar;
        super.onResume();
        setSelfNavigationBarVisible(8);
        java.lang.Object[] objArr = new java.lang.Object[2];
        boolean z17 = false;
        objArr[0] = h7(this.f149231g);
        com.tencent.mm.plugin.video.ObservableTextureView observableTextureView = this.f149236n;
        if (observableTextureView != null && observableTextureView.isAvailable()) {
            z17 = true;
        }
        objArr[1] = java.lang.Boolean.valueOf(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.SightCaptureUI", "onResume, currentState: %s, textureview available: %s", objArr);
        int i17 = this.f149231g;
        if (i17 == 2 || i17 == 1) {
            c7();
            return;
        }
        if (i17 != 4) {
            if (i17 == 3) {
                com.tencent.mm.plugin.video.ObservableTextureView observableTextureView2 = this.f149236n;
                if (observableTextureView2 != null) {
                    observableTextureView2.setTextureChangeCallback(null);
                }
                this.D.a(this.T, this.f149239p0, this.U);
                return;
            }
            return;
        }
        com.tencent.mm.plugin.video.ObservableTextureView observableTextureView3 = this.f149236n;
        if (observableTextureView3 != null) {
            if (observableTextureView3.isAvailable()) {
                com.tencent.mm.plugin.mmsight.ui.cameraglview.MMSightCameraGLSurfaceView mMSightCameraGLSurfaceView = this.D.f281510b;
                if (mMSightCameraGLSurfaceView != null && (cVar = mMSightCameraGLSurfaceView.f149302d) != null) {
                    cVar.f281534u = true;
                    mMSightCameraGLSurfaceView.requestRender();
                }
            } else {
                this.f149236n.setTextureChangeCallback(new com.tencent.mm.plugin.mmsight.ui.h3(this));
            }
        }
        com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView videoPlayerTextureView = this.H;
        if (videoPlayerTextureView != null) {
            videoPlayerTextureView.start();
        }
    }
}
