package com.tencent.mm.plugin.scanner.ui;

@db5.a(3)
/* loaded from: classes12.dex */
public class ScanTranslationCaptureUI extends com.tencent.mm.ui.MMActivity implements android.view.TextureView.SurfaceTextureListener, android.hardware.Camera.PreviewCallback, com.tencent.mm.modelbase.u0, e04.v2 {
    public static final /* synthetic */ int S = 0;
    public com.tencent.mm.ui.tools.MMGestureGallery A;
    public android.animation.ValueAnimator C;
    public android.animation.ValueAnimator D;
    public android.view.View E;
    public int F;
    public int G;
    public int H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f159349J;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMTextureView f159350d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.SurfaceTexture f159351e;

    /* renamed from: f, reason: collision with root package name */
    public xy3.a f159352f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f159353g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f159354h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f159355i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f159356m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f159357n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ImageView f159358o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f159359p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f159360q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f159361r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f159362s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.ImageView f159363t;

    /* renamed from: u, reason: collision with root package name */
    public android.graphics.Bitmap f159364u;

    /* renamed from: v, reason: collision with root package name */
    public android.graphics.Bitmap f159365v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f159366w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f159367x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f159368y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.scanner.ui.a3 f159369z;
    public boolean B = true;
    public int K = 0;
    public int L = 0;
    public int M = 0;
    public final com.tencent.mm.autogen.mmdata.rpt.OCRTranslateReportStruct N = new com.tencent.mm.autogen.mmdata.rpt.OCRTranslateReportStruct();
    public final long[] P = new long[2];
    public final com.tencent.mm.sdk.event.IListener Q = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.PlayScanTranslateAnimEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI.1
        {
            this.__eventId = 352096572;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.PlayScanTranslateAnimEvent playScanTranslateAnimEvent) {
            android.graphics.Bitmap J2;
            if (playScanTranslateAnimEvent.f54617g.f7172a != 2) {
                return false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationCaptureUI", "receive play open translate anim event");
            com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI scanTranslationCaptureUI = com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI.this;
            java.lang.String stringExtra = scanTranslationCaptureUI.getIntent().getStringExtra("key_first_background");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra) && (J2 = com.tencent.mm.sdk.platformtools.x.J(stringExtra, new android.graphics.BitmapFactory.Options())) != null) {
                scanTranslationCaptureUI.A.setVisibility(0);
                scanTranslationCaptureUI.c7(J2);
                com.tencent.mm.vfs.w6.h(stringExtra);
            }
            android.view.View view = scanTranslationCaptureUI.E;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI$1", "callback", "(Lcom/tencent/mm/autogen/events/PlayScanTranslateAnimEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI$1", "callback", "(Lcom/tencent/mm/autogen/events/PlayScanTranslateAnimEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
            scanTranslationCaptureUI.D.start();
            scanTranslationCaptureUI.f159350d.setVisibility(0);
            scanTranslationCaptureUI.f159349J = true;
            return true;
        }
    };
    public final com.tencent.mm.network.s0 R = new com.tencent.mm.plugin.scanner.ui.q2(this);

    public final void L0() {
        xy3.a aVar;
        android.hardware.Camera camera;
        try {
            if (this.f159352f.f366658c && (camera = (aVar = this.f159352f).f366656a) != null) {
                camera.stopPreview();
                aVar.f366658c = false;
                aVar.f366660e = false;
                aVar.f366661f = null;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ScanTranslationCaptureUI", e17.getMessage());
        }
        if (gm0.j1.d().n() != 6 && gm0.j1.d().n() != 4) {
            db5.e1.s(this, getString(com.tencent.mm.R.string.i_o), "");
            U6();
            return;
        }
        this.N.f59747f = 2L;
        this.G = (int) ((c01.z1.r().hashCode() + java.lang.System.currentTimeMillis()) & (-1));
        this.H = 1;
        showTitleView();
        e7();
        b7();
        if (this.I.equalsIgnoreCase("zh_CN")) {
            this.f159358o.setImageResource(com.tencent.mm.R.raw.translation_result_chinese);
        } else {
            this.f159358o.setImageResource(com.tencent.mm.R.raw.translation_result_english);
        }
        android.view.View view = this.f159360q;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI", "enterTranslateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI", "enterTranslateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f159361r;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI", "enterTranslateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI", "enterTranslateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f159357n;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI", "enterTranslateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI", "enterTranslateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f159363t.setVisibility(0);
        android.view.View view4 = this.f159356m;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI", "enterTranslateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI", "enterTranslateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.A.setVisibility(0);
        this.f159362s.setVisibility(8);
        this.C.setRepeatMode(1);
        this.C.setRepeatCount(-1);
        this.C.start();
        try {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f159366w) && this.f159364u != null) {
                this.f159368y = e04.t2.c(this.f159366w);
                java.lang.String str = this.f159366w;
                int i17 = this.L;
                if (i17 == 0) {
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    com.tencent.mm.sdk.platformtools.x.D0(this.f159364u, 80, android.graphics.Bitmap.CompressFormat.JPEG, this.f159366w, false);
                    com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationCaptureUI", "save img cost %d", java.lang.Integer.valueOf((int) (java.lang.System.currentTimeMillis() - currentTimeMillis)));
                    com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationCaptureUI", "fileSize %d", java.lang.Long.valueOf(com.tencent.mm.vfs.w6.k(this.f159366w)));
                } else if (i17 == 1) {
                    dm.aa y07 = ((com.tencent.mm.plugin.scanner.q0) i95.n0.c(com.tencent.mm.plugin.scanner.q0.class)).cj().y0(com.tencent.mm.sdk.platformtools.w2.a(this.f159366w + com.tencent.mm.vfs.w6.l(this.f159366w)));
                    if (y07 != null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationCaptureUI", "already has translation result");
                        java.lang.String str2 = y07.field_resultFile;
                        this.f159367x = str2;
                        android.graphics.Bitmap J2 = com.tencent.mm.sdk.platformtools.x.J(str2, new android.graphics.BitmapFactory.Options());
                        this.f159365v = J2;
                        if (J2 != null) {
                            com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.scanner.ui.z1(this), 500L);
                        } else {
                            com.tencent.mars.xlog.Log.w("MicroMsg.ScanTranslationCaptureUI", "can not find old translation result!");
                        }
                    }
                    if (this.M != 0) {
                        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                        str = ((com.tencent.mm.plugin.scanner.u0) ((com.tencent.mm.plugin.scanner.a0) i95.n0.c(com.tencent.mm.plugin.scanner.a0.class))).Ai("jpg");
                        com.tencent.mm.sdk.platformtools.x.D0(this.f159364u, 80, android.graphics.Bitmap.CompressFormat.JPEG, str, false);
                        com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationCaptureUI", "save img cost %d", java.lang.Integer.valueOf((int) (java.lang.System.currentTimeMillis() - currentTimeMillis2)));
                        com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationCaptureUI", "fileSize %d", java.lang.Long.valueOf(com.tencent.mm.vfs.w6.k(str)));
                    }
                }
                this.P[1] = java.lang.System.currentTimeMillis();
                e04.t2.a(this.f159368y, str, 2, new com.tencent.mm.plugin.scanner.ui.f2(this, str));
            }
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScanTranslationCaptureUI", e18, "", new java.lang.Object[0]);
        }
        gm0.j1.d().a(294, this);
    }

    public final void T6() {
        xy3.a aVar;
        android.hardware.Camera camera;
        try {
            try {
                if (this.f159352f.f366658c && (camera = (aVar = this.f159352f).f366656a) != null) {
                    camera.stopPreview();
                    aVar.f366658c = false;
                    aVar.f366660e = false;
                    aVar.f366661f = null;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ScanTranslationCaptureUI", e17.getMessage());
            }
            this.f159352f.a();
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ScanTranslationCaptureUI", e18.getMessage());
        }
    }

    public final void U6() {
        getWindow().addFlags(2097280);
        getWindow().getDecorView().setSystemUiVisibility(5894);
        try {
            if (this.f159351e == null || !this.f159352f.f366657b || this.f159352f.f366658c) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationCaptureUI", "can not start preview");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationCaptureUI", "start preview");
                this.f159352f.m(this.f159351e);
                if (this.f159352f.f366661f == null || this.f159352f.f366661f.f366677a == 0) {
                    this.f159354h.setEnabled(true);
                } else {
                    d7();
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ScanTranslationCaptureUI", e17.getMessage());
            d7();
        }
        hideTitleView();
        this.P[0] = java.lang.System.currentTimeMillis();
        if (this.L == 0 && !com.tencent.mm.sdk.platformtools.t8.K0(this.f159366w)) {
            com.tencent.mm.vfs.w6.h(this.f159366w);
        }
        this.H = 0;
        this.L = 0;
        this.f159366w = null;
        this.f159367x = null;
        this.f159364u = null;
        this.f159365v = null;
        this.M = 0;
        android.view.View view = this.f159360q;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI", "enterPreviewStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI", "enterPreviewStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f159361r;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI", "enterPreviewStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI", "enterPreviewStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f159356m;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI", "enterPreviewStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI", "enterPreviewStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view4 = this.f159357n;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI", "enterPreviewStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI", "enterPreviewStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.A.setVisibility(8);
        this.f159350d.setVisibility(0);
        this.f159362s.setVisibility(0);
        this.f159363t.setVisibility(8);
        this.C.setRepeatMode(1);
        this.C.setRepeatCount(0);
        this.C.end();
        gm0.j1.d().q(294, this);
    }

    public final void V6() {
        e7();
        this.H = 3;
        android.view.View view = this.f159357n;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI", "enterTranslateFinishStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI", "enterTranslateFinishStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (this.I.equalsIgnoreCase("zh_CN")) {
            this.f159358o.setImageResource(com.tencent.mm.R.drawable.f482187b81);
        } else {
            this.f159358o.setImageResource(com.tencent.mm.R.drawable.f482189b83);
        }
        this.f159363t.setVisibility(8);
        this.C.setRepeatMode(1);
        this.C.setRepeatCount(0);
        this.C.end();
        if (this.L == 1 && com.tencent.mm.sdk.platformtools.t8.K0(this.f159367x)) {
            java.lang.String Zi = ((com.tencent.mm.plugin.scanner.q0) i95.n0.c(com.tencent.mm.plugin.scanner.q0.class)).Zi("jpg");
            this.f159367x = Zi;
            try {
                com.tencent.mm.sdk.platformtools.x.D0(this.f159365v, 80, android.graphics.Bitmap.CompressFormat.JPEG, Zi, false);
                com.tencent.mm.plugin.scanner.model.o2 o2Var = new com.tencent.mm.plugin.scanner.model.o2();
                o2Var.field_originMD5 = com.tencent.mm.sdk.platformtools.w2.a(this.f159366w + com.tencent.mm.vfs.w6.l(this.f159366w));
                java.lang.String str = this.f159367x;
                o2Var.field_resultFile = str;
                com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationCaptureUI", "insert translate result %s", str);
                ((com.tencent.mm.plugin.scanner.q0) i95.n0.c(com.tencent.mm.plugin.scanner.q0.class)).cj().z0(o2Var);
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScanTranslationCaptureUI", e17, "save translate result file error", new java.lang.Object[0]);
            }
        }
    }

    public final void W6() {
        e04.w2 aj6 = ((com.tencent.mm.plugin.scanner.q0) i95.n0.c(com.tencent.mm.plugin.scanner.q0.class)).aj();
        aj6.f246149a = 0;
        aj6.f246150b = null;
        int i17 = this.H;
        if (i17 == 0) {
            if (this.f159349J) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationCaptureUI", "is playing animation");
                return;
            }
            this.D.addListener(new com.tencent.mm.plugin.scanner.ui.g2(this));
            this.D.reverse();
            this.f159349J = true;
            return;
        }
        if (i17 == 1 || i17 == 2 || i17 == 3) {
            com.tencent.mm.autogen.mmdata.rpt.OCRTranslateReportStruct oCRTranslateReportStruct = this.N;
            if (i17 == 1) {
                oCRTranslateReportStruct.f59750i = (int) (java.lang.System.currentTimeMillis() - this.P[1]);
            }
            if (oCRTranslateReportStruct.f59747f != 0) {
                oCRTranslateReportStruct.k();
            }
            U6();
        }
    }

    public final void X6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationCaptureUI", "curState %d", java.lang.Integer.valueOf(this.H));
        if (!this.f159352f.f366657b) {
            a7();
        }
        if (this.H == 0 && this.f159352f.f366657b) {
            U6();
        }
    }

    public final void Y6() {
        if (zo.e.d()) {
            X6();
        } else {
            db5.e1.E(this, getString(com.tencent.mm.R.string.f490565yn), getString(com.tencent.mm.R.string.f490497wr), getString(com.tencent.mm.R.string.f490498ws), true, new com.tencent.mm.plugin.scanner.ui.h2(this));
        }
    }

    public final void Z6(java.lang.String str) {
        com.tencent.mm.autogen.mmdata.rpt.OCRTranslateReportStruct oCRTranslateReportStruct = this.N;
        oCRTranslateReportStruct.f59747f = 5L;
        oCRTranslateReportStruct.f59750i = (int) (java.lang.System.currentTimeMillis() - this.P[1]);
        java.lang.String string = getString(com.tencent.mm.R.string.iaw);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = string;
        }
        db5.e1.G(this, str, "", false, new com.tencent.mm.plugin.scanner.ui.p2(this));
    }

    public final void a7() {
        try {
            if (this.f159352f.f366657b) {
                return;
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            this.f159352f.i(getWindowManager().getDefaultDisplay().getRotation());
            this.f159352f.n(new com.tencent.mm.plugin.scanner.ui.i2(this));
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationCaptureUI", "open camera cost %s, failed count %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Integer.valueOf(this.K));
            this.f159352f.u();
            android.graphics.Rect rect = new android.graphics.Rect();
            getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            this.f159352f.l(new android.graphics.Point(rect.width(), rect.height()));
            if (this.H == 0) {
                U6();
            }
            this.K = 0;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ScanTranslationCaptureUI", e17.getMessage());
            int i17 = this.K + 1;
            this.K = i17;
            if (i17 >= 5) {
                d7();
            } else {
                com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.scanner.ui.j2(this), 30L);
            }
        }
    }

    public final void b7() {
        if (com.tencent.mm.sdk.platformtools.m2.d().equalsIgnoreCase("zh_CN")) {
            this.I = com.tencent.mm.sdk.platformtools.m2.f(this);
        } else {
            this.I = com.tencent.mm.sdk.platformtools.m2.f(this);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationCaptureUI", "targetLang %s", this.I);
    }

    public final void c7(android.graphics.Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        com.tencent.mm.plugin.scanner.ui.a3 a3Var = this.f159369z;
        a3Var.f159503d = bitmap;
        a3Var.notifyDataSetChanged();
    }

    public final void d7() {
        db5.e1.G(this, getString(com.tencent.mm.R.string.i_y), getString(com.tencent.mm.R.string.f490573yv), false, new com.tencent.mm.plugin.scanner.ui.l2(this));
    }

    public final void e7() {
        getController().E0(getResources().getColor(com.tencent.mm.R.color.a9e));
        getWindow().getDecorView().setSystemUiVisibility(1796);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489427ci1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.m7j);
        this.E = findViewById;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI", "initView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        findViewById.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI", "initView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        com.tencent.mm.ui.base.MMTextureView mMTextureView = (com.tencent.mm.ui.base.MMTextureView) findViewById(com.tencent.mm.R.id.oja);
        this.f159350d = mMTextureView;
        mMTextureView.setOpaque(false);
        this.f159350d.setSurfaceTextureListener(this);
        this.A = (com.tencent.mm.ui.tools.MMGestureGallery) findViewById(com.tencent.mm.R.id.ojc);
        com.tencent.mm.plugin.scanner.ui.a3 a3Var = new com.tencent.mm.plugin.scanner.ui.a3(this, null);
        this.f159369z = a3Var;
        this.A.setAdapter((android.widget.SpinnerAdapter) a3Var);
        this.f159356m = findViewById(com.tencent.mm.R.id.b6k);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.ma7);
        this.f159353g = findViewById2;
        findViewById2.setOnClickListener(new com.tencent.mm.plugin.scanner.ui.r2(this));
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.m_b);
        this.f159354h = findViewById3;
        findViewById3.setOnClickListener(new com.tencent.mm.plugin.scanner.ui.s2(this));
        this.f159354h.setEnabled(false);
        this.f159362s = (android.widget.TextView) findViewById(com.tencent.mm.R.id.m_c);
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.ma8);
        this.f159355i = findViewById4;
        findViewById4.setOnClickListener(new com.tencent.mm.plugin.scanner.ui.t2(this));
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.m9v);
        this.f159357n = findViewById5;
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById5.findViewById(com.tencent.mm.R.id.ojh);
        this.f159358o = imageView;
        imageView.setOnClickListener(new com.tencent.mm.plugin.scanner.ui.u2(this));
        this.f159360q = findViewById(com.tencent.mm.R.id.ojg);
        this.f159361r = findViewById(com.tencent.mm.R.id.oj_);
        hideTitleView();
        setMMTitle(com.tencent.mm.R.string.i9e);
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.a9e));
        this.f159363t = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.m_h);
        android.view.View findViewById6 = this.f159357n.findViewById(com.tencent.mm.R.id.ojb);
        this.f159359p = findViewById6;
        findViewById6.setOnClickListener(new com.tencent.mm.plugin.scanner.ui.x2(this));
        setBackBtn(new com.tencent.mm.plugin.scanner.ui.y2(this));
        this.F = getWindowManager().getDefaultDisplay().getHeight();
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        this.C = ofFloat;
        ofFloat.addListener(new com.tencent.mm.plugin.scanner.ui.z2(this));
        this.C.addUpdateListener(new com.tencent.mm.plugin.scanner.ui.u1(this));
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f159357n.getLayoutParams();
        layoutParams.bottomMargin += com.tencent.mm.ui.bk.j(this);
        this.f159357n.setLayoutParams(layoutParams);
        this.C.setDuration(5000L);
        db5.f.c(this, null);
        this.E.setOnTouchListener(new com.tencent.mm.plugin.scanner.ui.w1(this));
        b7();
        android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
        this.D = ofFloat2;
        ofFloat2.addUpdateListener(new com.tencent.mm.plugin.scanner.ui.x1(this));
        this.D.addListener(new com.tencent.mm.plugin.scanner.ui.y1(this));
        this.D.setDuration(300L);
        com.tencent.mm.autogen.events.PlayScanTranslateAnimEvent playScanTranslateAnimEvent = new com.tencent.mm.autogen.events.PlayScanTranslateAnimEvent();
        playScanTranslateAnimEvent.f54617g.f7172a = 1;
        playScanTranslateAnimEvent.e();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 561 && i18 == -1) {
            java.lang.String b17 = com.tencent.mm.ui.tools.i1.b(this, intent, g83.a.a());
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationCaptureUI", "select: [%s]", b17);
            if (com.tencent.mm.sdk.platformtools.t8.K0(b17)) {
                return;
            }
            this.f159366w = b17;
            this.L = 1;
            this.N.f59745d = 2L;
            int orientationInDegree = com.tencent.mm.compatible.util.Exif.fromFile(b17).getOrientationInDegree();
            this.M = orientationInDegree;
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationCaptureUI", "degree %s", java.lang.Integer.valueOf(orientationInDegree));
            android.graphics.Bitmap K = com.tencent.mm.sdk.platformtools.x.K(b17);
            if (K != null) {
                this.f159364u = com.tencent.mm.sdk.platformtools.x.w0(K, this.M);
                L0();
                c7(this.f159364u);
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        customfixStatusbar(true);
        super.onCreate(bundle);
        this.f159352f = new xy3.a();
        initView();
        this.Q.alive();
        this.N.f59745d = 3L;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.D.removeAllUpdateListeners();
        this.C.removeAllUpdateListeners();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        W6();
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        qp1.h0.b();
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, android.hardware.Camera camera) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationCaptureUI", "get preview frame success, length %d", java.lang.Integer.valueOf(bArr.length));
        try {
            if (bArr.length > 0) {
                this.f159364u = null;
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                android.graphics.Point point = this.f159352f.f366662g;
                android.graphics.YuvImage yuvImage = new android.graphics.YuvImage(bArr, 17, point.x, point.y, null);
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                yuvImage.compressToJpeg(new android.graphics.Rect(0, 0, point.x, point.y), 100, byteArrayOutputStream);
                android.graphics.Bitmap G = com.tencent.mm.sdk.platformtools.x.G(byteArrayOutputStream.toByteArray());
                int currentTimeMillis2 = (int) (java.lang.System.currentTimeMillis() - currentTimeMillis);
                if (G != null) {
                    long currentTimeMillis3 = java.lang.System.currentTimeMillis();
                    this.f159364u = com.tencent.mm.sdk.platformtools.x.w0(G, this.f159352f.f366667l);
                    com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationCaptureUI", "decode cost %d, rotate cost %d", java.lang.Integer.valueOf(currentTimeMillis2), java.lang.Integer.valueOf((int) (java.lang.System.currentTimeMillis() - currentTimeMillis3)));
                    if (this.f159364u != null) {
                        this.f159366w = ((com.tencent.mm.plugin.scanner.u0) ((com.tencent.mm.plugin.scanner.a0) i95.n0.c(com.tencent.mm.plugin.scanner.a0.class))).wi("jpg");
                        L0();
                        c7(this.f159364u);
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScanTranslationCaptureUI", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationCaptureUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationCaptureUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 != 16) {
            return;
        }
        if (iArr.length > 0 && iArr[0] == 0) {
            Y6();
        } else {
            this.B = false;
            db5.e1.C(this, getString(com.tencent.mm.R.string.hh8), getString(com.tencent.mm.R.string.hht), getString(com.tencent.mm.R.string.g6z), getString(com.tencent.mm.R.string.f490347sg), false, new com.tencent.mm.plugin.scanner.ui.m2(this), new com.tencent.mm.plugin.scanner.ui.n2(this));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        qp1.h0.a(true, true, true);
        getWindow().addFlags(2097280);
        getWindow().getDecorView().setSystemUiVisibility(5894);
        gm0.j1.d().a(294, this);
        gm0.j1.n().a(this.R);
        if (!this.B) {
            X6();
            return;
        }
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        boolean a17 = j35.u.a(this, "android.permission.CAMERA", 16, null, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationCaptureUI", "summerper checkPermission checkCamera[%b]", java.lang.Boolean.valueOf(a17));
        if (a17) {
            Y6();
        }
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationCaptureUI", "errType %s, errCode %s, errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (i17 != 0 || i18 != 0) {
            Z6(str);
            return;
        }
        com.tencent.mm.plugin.scanner.model.e0 e0Var = (com.tencent.mm.plugin.scanner.model.e0) m1Var;
        java.util.List list = e0Var.f158878g;
        if (list == null || e0Var.f158879h != this.G) {
            return;
        }
        long currentTimeMillis = (int) (java.lang.System.currentTimeMillis() - e0Var.f158880i);
        com.tencent.mm.autogen.mmdata.rpt.OCRTranslateReportStruct oCRTranslateReportStruct = this.N;
        oCRTranslateReportStruct.f59749h = currentTimeMillis;
        java.util.LinkedList linkedList = (java.util.LinkedList) list;
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationCaptureUI", "angle %f, translationInfos length %d", java.lang.Float.valueOf(e0Var.H()), java.lang.Integer.valueOf(linkedList.size()));
        if (linkedList.size() <= 0) {
            oCRTranslateReportStruct.f59750i = (int) (java.lang.System.currentTimeMillis() - this.P[1]);
            db5.e1.G(this, getString(com.tencent.mm.R.string.iaw), "", false, new com.tencent.mm.plugin.scanner.ui.o2(this));
            return;
        }
        oCRTranslateReportStruct.f59747f = 1L;
        ((com.tencent.mm.plugin.scanner.q0) i95.n0.c(com.tencent.mm.plugin.scanner.q0.class)).aj().e(this.G, list, e0Var.H(), this.f159364u, this);
        if (com.tencent.mm.sdk.platformtools.t8.K0(e0Var.I())) {
            return;
        }
        this.I = e0Var.I();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        T6();
        gm0.j1.d().q(294, this);
        this.Q.dead();
        gm0.j1.n().d(this.R);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationCaptureUI", "surface texture available");
        this.f159350d.C();
        this.f159351e = surfaceTexture;
        if (!this.B) {
            if (this.f159352f.f366657b) {
                U6();
                return;
            } else {
                a7();
                return;
            }
        }
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        boolean a17 = j35.u.a(this, "android.permission.CAMERA", 16, null, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationCaptureUI", "summerper checkPermission checkCamera[%b]", java.lang.Boolean.valueOf(a17));
        if (a17) {
            Y6();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
    }

    @Override // e04.v2
    public void v5(final int i17, final android.graphics.Bitmap bitmap) {
        ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI$$a
            @Override // java.lang.Runnable
            public final void run() {
                int i18 = com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI.S;
                com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI scanTranslationCaptureUI = com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI.this;
                scanTranslationCaptureUI.getClass();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("drawTranslationResult() called with: session = [");
                int i19 = i17;
                sb6.append(i19);
                sb6.append("], newBitmap = [");
                android.graphics.Bitmap bitmap2 = bitmap;
                sb6.append(bitmap2);
                sb6.append("]");
                com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationCaptureUI", sb6.toString());
                if (i19 == scanTranslationCaptureUI.G) {
                    scanTranslationCaptureUI.N.f59750i = (int) (java.lang.System.currentTimeMillis() - scanTranslationCaptureUI.P[1]);
                    if (bitmap2 == null) {
                        scanTranslationCaptureUI.Z6(null);
                        return;
                    }
                    scanTranslationCaptureUI.f159365v = bitmap2;
                    scanTranslationCaptureUI.V6();
                    scanTranslationCaptureUI.c7(scanTranslationCaptureUI.f159365v);
                }
            }
        });
    }
}
