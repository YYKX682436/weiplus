package uj3;

/* loaded from: classes14.dex */
public abstract class v0 extends android.widget.RelativeLayout implements uj3.b {
    public boolean A;
    public float B;
    public wu5.c C;
    public wu5.c D;
    public com.tencent.mm.sdk.platformtools.n3 E;
    public volatile boolean F;

    /* renamed from: d, reason: collision with root package name */
    public uj3.k f428358d;

    /* renamed from: e, reason: collision with root package name */
    public int f428359e;

    /* renamed from: f, reason: collision with root package name */
    public int f428360f;

    /* renamed from: g, reason: collision with root package name */
    public uj3.k1 f428361g;

    /* renamed from: h, reason: collision with root package name */
    public long f428362h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.FrameLayout f428363i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.FrameLayout f428364m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.FrameLayout f428365n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.FrameLayout f428366o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.FrameLayout f428367p;

    /* renamed from: q, reason: collision with root package name */
    public uj3.c f428368q;

    /* renamed from: r, reason: collision with root package name */
    public uj3.l0 f428369r;

    /* renamed from: s, reason: collision with root package name */
    public uj3.j1 f428370s;

    /* renamed from: t, reason: collision with root package name */
    public uj3.b0 f428371t;

    /* renamed from: u, reason: collision with root package name */
    public uj3.f1 f428372u;

    /* renamed from: v, reason: collision with root package name */
    public yj3.g f428373v;

    /* renamed from: w, reason: collision with root package name */
    public volatile android.view.Surface f428374w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f428375x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f428376y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f428377z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.A = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setBitmapBackgroundRenderTarget(android.view.Surface surface) {
        this.f428374w = surface;
    }

    public static /* synthetic */ void u(uj3.v0 v0Var, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stopScreenProjectSend");
        }
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        v0Var.t(z17);
    }

    @Override // uj3.b
    public int b() {
        return 1;
    }

    @Override // uj3.b
    public boolean c() {
        return this.f428376y;
    }

    @Override // uj3.b
    public boolean d() {
        return this.f428377z;
    }

    @Override // uj3.b
    public int e() {
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.lang.Object systemService = context.getSystemService("window");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        int rotation = ((android.view.WindowManager) systemService).getDefaultDisplay().getRotation();
        if (rotation != 0) {
            if (rotation == 1) {
                return 90;
            }
            if (rotation == 2) {
                return 180;
            }
            if (rotation == 3) {
                return 270;
            }
        }
        return 0;
    }

    public void f(uj3.a status, android.os.Bundle bundle) {
        uj3.b0 b0Var;
        uj3.z zVar;
        qj3.h hVar;
        qj3.g multiTalkEditPhotoWrapper;
        ym5.w2 w2Var;
        bn5.g gVar;
        uj3.b0 b0Var2;
        uj3.z zVar2;
        qj3.h hVar2;
        qj3.g multiTalkEditPhotoWrapper2;
        ym5.w2 w2Var2;
        bn5.g gVar2;
        android.graphics.Bitmap n17;
        android.content.Context context;
        android.graphics.Bitmap n18;
        android.content.Context context2;
        android.graphics.Bitmap n19;
        android.content.Context context3;
        kotlin.jvm.internal.o.g(status, "status");
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.MultiTalkScreenProjectorView", "statusChange %s and param is %s", status, bundle);
        boolean z17 = true;
        switch (status.ordinal()) {
            case 0:
                com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.MultiTalkScreenProjectorView", "startScreenProjectSend", new java.lang.Object[0]);
                zj3.g.f473302a.b(2, 1);
                getRenderBitmap();
                com.tencent.mm.plugin.multitalk.model.e3.Ri().a0(101);
                setScreenProjectSending(true);
                return;
            case 1:
                zj3.g.f473302a.b(8, 1);
                u(this, false, 1, null);
                return;
            case 2:
                zj3.g.f473302a.b(7, 1);
                this.f428376y = true;
                android.widget.FrameLayout frameLayout = this.f428365n;
                if (frameLayout != null) {
                    frameLayout.setVisibility(4);
                }
                uj3.c cVar = this.f428368q;
                if (cVar != null && (hVar = cVar.f428250i) != null && (multiTalkEditPhotoWrapper = hVar.getMultiTalkEditPhotoWrapper()) != null && (w2Var = multiTalkEditPhotoWrapper.f363882m) != null && (gVar = (bn5.g) w2Var.getBaseBoardView()) != null) {
                    gVar.setEnableToResponseSlid(true);
                }
                m();
                if ((e() != 90 && e() != 270) || (b0Var = this.f428371t) == null || (zVar = b0Var.f428219g) == null) {
                    return;
                }
                zVar.f();
                return;
            case 3:
                zj3.g.f473302a.b(7, 1);
                uj3.c cVar2 = this.f428368q;
                if (cVar2 != null && (hVar2 = cVar2.f428250i) != null && (multiTalkEditPhotoWrapper2 = hVar2.getMultiTalkEditPhotoWrapper()) != null && (w2Var2 = multiTalkEditPhotoWrapper2.f363882m) != null && (gVar2 = (bn5.g) w2Var2.getBaseBoardView()) != null) {
                    gVar2.setEnableToResponseSlid(false);
                }
                this.f428376y = false;
                android.widget.FrameLayout frameLayout2 = this.f428365n;
                if (frameLayout2 != null) {
                    frameLayout2.setVisibility(0);
                }
                m();
                if ((e() != 90 && e() != 270) || (b0Var2 = this.f428371t) == null || (zVar2 = b0Var2.f428219g) == null) {
                    return;
                }
                zVar2.f();
                return;
            case 4:
                if (bundle != null) {
                    com.tencent.mm.plugin.multitalk.model.e3.Ri().Q(bundle.getBoolean("mic_mute_status"));
                    return;
                }
                return;
            case 5:
                j();
                return;
            case 6:
                u(this, false, 1, null);
                return;
            case 7:
                if (bundle != null) {
                    java.util.ArrayList<java.lang.String> stringArrayList = bundle.getStringArrayList("avatar_available_speaker");
                    uj3.b0 b0Var3 = this.f428371t;
                    if (b0Var3 != null) {
                        kotlin.jvm.internal.o.d(stringArrayList);
                        b0Var3.f(stringArrayList);
                    } else {
                        z17 = false;
                    }
                    this.f428377z = z17;
                    return;
                }
                return;
            case 8:
                this.f428377z = false;
                return;
            case 9:
            case 11:
            case 12:
            case 13:
            default:
                return;
            case 10:
                if (this.f428376y || this.A) {
                    return;
                }
                ((ku5.t0) ku5.t0.f312615d).B(new uj3.u0(this));
                return;
            case 14:
                this.F = false;
                return;
            case 15:
                android.widget.FrameLayout frameLayout3 = this.f428363i;
                if (frameLayout3 != null) {
                    frameLayout3.setVisibility(8);
                }
                setReadyNotAllowClick(false);
                return;
            case 16:
                android.view.View backgroundView = getBackgroundView();
                if (backgroundView == null || (n17 = n(backgroundView)) == null || (context = getContext()) == null) {
                    return;
                }
                sj3.h3 h3Var = new sj3.h3(n17, context);
                sj3.i3 i3Var = new sj3.i3(context);
                if (context instanceof android.app.Activity) {
                    ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).Ni(context, h3Var, i3Var);
                    return;
                } else {
                    i3Var.run();
                    return;
                }
            case 17:
                android.view.View backgroundView2 = getBackgroundView();
                if (backgroundView2 == null || (n18 = n(backgroundView2)) == null || (context2 = getContext()) == null) {
                    return;
                }
                sj3.j3 j3Var = new sj3.j3(n18, context2);
                sj3.k3 k3Var = new sj3.k3(context2);
                if (context2 instanceof android.app.Activity) {
                    ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).Ni(context2, j3Var, k3Var);
                    return;
                } else {
                    k3Var.run();
                    return;
                }
            case 18:
                android.view.View backgroundView3 = getBackgroundView();
                if (backgroundView3 == null || (n19 = n(backgroundView3)) == null || (context3 = getContext()) == null) {
                    return;
                }
                sj3.l3 l3Var = new sj3.l3(n19, context3);
                sj3.m3 m3Var = new sj3.m3(context3);
                if (context3 instanceof android.app.Activity) {
                    ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).Ni(context3, l3Var, m3Var);
                    return;
                } else {
                    m3Var.run();
                    return;
                }
        }
    }

    public final uj3.b0 getAvatarLayout() {
        return this.f428371t;
    }

    public final android.widget.FrameLayout getAvatarRoot() {
        return this.f428367p;
    }

    public abstract android.view.View getBackgroundView();

    public final yj3.g getBitmapRenderPrco() {
        return this.f428373v;
    }

    public final android.widget.FrameLayout getBottomRoot() {
        return this.f428366o;
    }

    public final uj3.l0 getBottomUiLayout() {
        return this.f428369r;
    }

    public abstract /* synthetic */ java.lang.String getCurrentFileMd5();

    @Override // uj3.b
    public boolean getCurrentStatus() {
        return this.f428375x;
    }

    public abstract int getLayoutId();

    public final int getMCurrentPageHeight() {
        return this.f428360f;
    }

    public final int getMCurrentPageWidth() {
        return this.f428359e;
    }

    public final float getMCurrentScale() {
        return this.B;
    }

    public final android.widget.FrameLayout getMEditLayout() {
        return this.f428364m;
    }

    public final android.widget.FrameLayout getMReadyLayout() {
        return this.f428363i;
    }

    public final uj3.k1 getMScreenReportData() {
        return this.f428361g;
    }

    public final long getMStartTimes() {
        return this.f428362h;
    }

    public final uj3.c getMultiTalkStrokeContext() {
        return this.f428368q;
    }

    public final uj3.j1 getReadyUI() {
        return this.f428370s;
    }

    public final void getRenderBitmap() {
        if (this.C != null) {
            return;
        }
        this.D = ((ku5.t0) ku5.t0.f312615d).d(new uj3.o0(this), 1000L, 1000L);
        this.E = new com.tencent.mm.sdk.platformtools.n3("screen_project");
        this.C = ((ku5.t0) ku5.t0.f312615d).d(new uj3.n0(this), 0L, 1000 / ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_multitalk_screen_project_fps, 5));
    }

    public final uj3.k getScreenFuncConfig() {
        return this.f428358d;
    }

    public final com.tencent.mm.sdk.platformtools.n3 getSendData() {
        return this.E;
    }

    public final android.widget.FrameLayout getTopRoot() {
        return this.f428365n;
    }

    public final uj3.f1 getTopUiLayout() {
        return this.f428372u;
    }

    public void h() {
    }

    public void i() {
    }

    public final void j() {
        qj3.h hVar;
        bn5.g gVar;
        uj3.c cVar = this.f428368q;
        if (cVar == null || (hVar = cVar.f428250i) == null) {
            return;
        }
        qj3.g gVar2 = hVar.f363895o;
        gVar2.f363886q = null;
        ym5.w2 w2Var = gVar2.f363882m;
        if (w2Var == null || (gVar = (bn5.g) w2Var.getBaseBoardView()) == null) {
            return;
        }
        java.util.Iterator it = ((l45.n) gVar.getPresenter()).f316463d.iterator();
        while (it.hasNext()) {
            dl.b bVar = (dl.b) it.next();
            bVar.f235045g = null;
            bVar.d().clear();
        }
        gVar.postInvalidate();
    }

    public void k() {
        yj3.g gVar = this.f428373v;
        if (gVar != null) {
            gVar.f462678d.removeCallbacksAndMessages(null);
            gVar.a(new yj3.c(gVar));
            android.os.HandlerThread handlerThread = gVar.f462679e;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
            android.view.Surface surface = gVar.f462683i;
            if (surface != null) {
                surface.release();
            }
            android.graphics.SurfaceTexture surfaceTexture = gVar.f462681g;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
        }
    }

    public void l() {
        uj3.k1 k1Var = this.f428361g;
        if (k1Var != null) {
            long j17 = this.f428362h;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            k1Var.f428306b = android.os.SystemClock.elapsedRealtime() - j17;
        }
        uj3.k1 k1Var2 = null;
        this.f428374w = null;
        k();
        uj3.b0 b0Var = this.f428371t;
        if (b0Var != null) {
            b0Var.g();
        }
        setVisibility(8);
        wu5.c cVar = this.D;
        if (cVar != null) {
            cVar.cancel(false);
        }
        this.D = null;
        wu5.c cVar2 = this.C;
        if (cVar2 != null) {
            cVar2.cancel(false);
        }
        this.C = null;
        android.widget.FrameLayout frameLayout = this.f428363i;
        if (frameLayout != null) {
            frameLayout.clearAnimation();
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.E;
        if (n3Var != null) {
            n3Var.removeCallbacksAndMessages(null);
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var2 = this.E;
        if (n3Var2 != null) {
            n3Var2.quitSafely();
        }
        this.E = null;
        uj3.j1 j1Var = this.f428370s;
        if (j1Var != null) {
            com.tencent.mm.sdk.platformtools.b4 b4Var = j1Var.f428300j;
            b4Var.d();
            android.widget.TextView textView = j1Var.f428297g;
            if (textView != null) {
                textView.setScaleX(1.0f);
            }
            android.widget.TextView textView2 = j1Var.f428297g;
            if (textView2 != null) {
                textView2.setScaleY(1.0f);
            }
            j1Var.f428299i = j1Var.f428294d;
            b4Var.quitSafely();
        }
        com.tencent.mm.plugin.multitalk.model.e3.Ri().o().getClass();
        com.tencent.mm.plugin.multitalk.model.v0 Ri = com.tencent.mm.plugin.multitalk.model.e3.Ri();
        if (Ri != null) {
            Ri.a0(104);
        }
        uj3.k1 k1Var3 = this.f428361g;
        if (k1Var3 != null) {
            java.lang.String str = k1Var3.f428311g;
            long j18 = k1Var3.f428312h;
            java.lang.String str2 = k1Var3.f428313i;
            int i17 = k1Var3.f428305a;
            long j19 = k1Var3.f428306b;
            int i18 = k1Var3.f428314j;
            long j27 = k1Var3.f428307c;
            long j28 = k1Var3.f428308d;
            long j29 = k1Var3.f428309e;
            int i19 = k1Var3.f428310f;
            com.tencent.mars.xlog.Log.i("MicroMsg.ScreenProjectReportHelper", "reportScreenProjectDone,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", str, java.lang.Long.valueOf(j18), str2, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j19), java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(j27), java.lang.Long.valueOf(j28), java.lang.Long.valueOf(j29), java.lang.Integer.valueOf(i19));
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(21350, str, java.lang.Long.valueOf(j18), str2, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j19), java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(j27), java.lang.Long.valueOf(j28), java.lang.Long.valueOf(j29), java.lang.Integer.valueOf(i19));
            k1Var2 = null;
        }
        this.f428361g = k1Var2;
    }

    public final void m() {
        uj3.c cVar = this.f428368q;
        if (cVar != null) {
            boolean z17 = cVar.f428252k;
            qj3.h hVar = cVar.f428250i;
            if (z17) {
                if (hVar != null) {
                    hVar.setVisibility(0);
                }
                if (hVar != null) {
                    hVar.f363894n.onClick(null);
                }
                cVar.f428252k = false;
                return;
            }
            if (hVar != null) {
                hVar.f363894n.onClick(null);
            }
            if (hVar != null) {
                hVar.setVisibility(0);
            }
            cVar.f428252k = true;
        }
    }

    public final android.graphics.Bitmap n(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        int measuredWidth = view.getMeasuredWidth() - (view.getMeasuredWidth() % 4);
        int measuredHeight = view.getMeasuredHeight() - (view.getMeasuredHeight() % 4);
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            return null;
        }
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(measuredHeight));
        arrayList.add(java.lang.Integer.valueOf(measuredWidth));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectRootView", "getBitmapShot", "(Landroid/view/View;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectRootView", "getBitmapShot", "(Landroid/view/View;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (createBitmap.isRecycled()) {
            return null;
        }
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        canvas.drawPaint(new android.graphics.Paint());
        canvas.setDrawFilter(new android.graphics.PaintFlagsDrawFilter(0, 3));
        view.draw(canvas);
        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
        uj3.k1 k1Var = this.f428361g;
        if (k1Var != null) {
            k1Var.f428309e = ((k1Var != null ? k1Var.f428309e : 0L) + elapsedRealtime2) / 2;
        }
        long elapsedRealtime3 = android.os.SystemClock.elapsedRealtime();
        uj3.c cVar = this.f428368q;
        if (cVar != null) {
            cVar.a(canvas);
        }
        long elapsedRealtime4 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime3;
        uj3.k1 k1Var2 = this.f428361g;
        if (k1Var2 != null) {
            k1Var2.f428308d = ((k1Var2 != null ? k1Var2.f428308d : 0L) + elapsedRealtime4) / 2;
        }
        if (measuredWidth <= measuredHeight) {
            return createBitmap;
        }
        android.graphics.Bitmap w07 = com.tencent.mm.sdk.platformtools.x.w0(createBitmap, 90.0f);
        kotlin.jvm.internal.o.f(w07, "rotate(...)");
        return w07;
    }

    public final void o() {
        android.content.res.Resources resources;
        if (!this.f428375x) {
            com.tencent.mm.plugin.multitalk.model.e3.Ri().h();
            return;
        }
        android.content.Context context = getContext();
        com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
        android.content.res.Resources resources2 = getContext().getResources();
        java.lang.Integer num = null;
        aVar.f211729s = resources2 != null ? resources2.getString(com.tencent.mm.R.string.ibt) : null;
        aVar.f211732v = of5.b.a(context).getString(com.tencent.mm.R.string.ibs);
        aVar.E = new uj3.p0(this);
        android.content.Context context2 = getContext();
        if (context2 != null && (resources = context2.getResources()) != null) {
            num = java.lang.Integer.valueOf(resources.getColor(com.tencent.mm.R.color.f478532ac));
        }
        kotlin.jvm.internal.o.d(num);
        aVar.W = num.intValue();
        aVar.f211733w = of5.b.a(context).getString(com.tencent.mm.R.string.f490347sg);
        aVar.F = uj3.q0.f428339d;
        com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(context, com.tencent.mm.R.style.f494791wd);
        j0Var.e(aVar);
        com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
        if (d0Var != null) {
            d0Var.a(j0Var.f211837r);
        }
        j0Var.show();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p() {
        /*
            Method dump skipped, instructions count: 858
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uj3.v0.p():void");
    }

    public int q() {
        android.widget.FrameLayout frameLayout = this.f428365n;
        int i17 = frameLayout != null && frameLayout.getVisibility() == 0 ? 4 : false ? 4 : 0;
        android.widget.FrameLayout frameLayout2 = this.f428365n;
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(i17);
        }
        android.widget.FrameLayout frameLayout3 = this.f428366o;
        if (frameLayout3 != null) {
            frameLayout3.setVisibility(i17);
        }
        android.widget.FrameLayout frameLayout4 = this.f428363i;
        if (frameLayout4 != null) {
            frameLayout4.setVisibility(i17);
        }
        return i17;
    }

    public void r(boolean z17) {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator startDelay;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator alpha;
        android.widget.FrameLayout frameLayout;
        android.view.View view;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f428362h = android.os.SystemClock.elapsedRealtime();
        android.widget.FrameLayout frameLayout2 = this.f428364m;
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(z17 ? 0 : 8);
        }
        uj3.l0 l0Var = this.f428369r;
        if (l0Var != null && (view = l0Var.f428319d) != null) {
            int i17 = z17 ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectBottomUI", "showReaderContent", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectBottomUI", "showReaderContent", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        uj3.c cVar = this.f428368q;
        if (cVar != null && (frameLayout = this.f428364m) != null) {
            frameLayout.addView(cVar.f428242a);
        }
        android.widget.FrameLayout frameLayout3 = this.f428363i;
        if (frameLayout3 != null) {
            frameLayout3.setVisibility(0);
        }
        android.widget.FrameLayout frameLayout4 = this.f428363i;
        if (frameLayout4 != null) {
            frameLayout4.clearAnimation();
        }
        android.widget.FrameLayout frameLayout5 = this.f428363i;
        if (frameLayout5 == null || (animate = frameLayout5.animate()) == null || (startDelay = animate.setStartDelay(3000L)) == null || (duration = startDelay.setDuration(150L)) == null || (alpha = duration.alpha(0.0f)) == null) {
            return;
        }
        alpha.start();
    }

    public final void s(boolean z17) {
        android.view.View view;
        android.widget.FrameLayout frameLayout;
        uj3.c cVar = this.f428368q;
        if (cVar != null && (frameLayout = cVar.f428242a) != null) {
            frameLayout.setVisibility(0);
        }
        if (this.f428375x || this.A) {
            return;
        }
        uj3.b.a(this, uj3.a.f428193d, null, 2, null);
        uj3.f1 f1Var = this.f428372u;
        if (f1Var != null) {
            android.view.View view2 = f1Var.f428266d;
            android.content.Context context = f1Var.f428263a;
            if (view2 != null) {
                view2.setBackground(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.drawable.aft, android.graphics.Color.parseColor("#FA5151")));
            }
            sj3.n3 n3Var = sj3.o3.f408666e;
            if (n3Var.a(context) == 90 || n3Var.a(context) == 270) {
                android.widget.TextView textView = f1Var.f428267e;
                if (textView != null) {
                    textView.setText(com.tencent.mm.R.string.ibs);
                }
            } else {
                android.widget.TextView textView2 = f1Var.f428267e;
                if (textView2 != null) {
                    textView2.setText(com.tencent.mm.R.string.ibl);
                }
            }
            if (!com.tencent.mm.ui.b4.c(context) || (view = f1Var.f428265c) == null) {
                return;
            }
            com.tencent.mm.ui.a4.g(view, false);
        }
    }

    public final void setAvatarLayout(uj3.b0 b0Var) {
        this.f428371t = b0Var;
    }

    public final void setAvatarLayoutOn(boolean z17) {
        this.f428377z = z17;
    }

    public final void setAvatarRoot(android.widget.FrameLayout frameLayout) {
        this.f428367p = frameLayout;
    }

    public final void setBitmapRenderPrco(yj3.g gVar) {
        this.f428373v = gVar;
    }

    public final void setBottomRoot(android.widget.FrameLayout frameLayout) {
        this.f428366o = frameLayout;
    }

    public final void setBottomUiLayout(uj3.l0 l0Var) {
        this.f428369r = l0Var;
    }

    public final void setDoodleLayoutOn(boolean z17) {
        this.f428376y = z17;
    }

    public final void setLockGenerateBitmap(boolean z17) {
        this.F = z17;
    }

    public final void setMCurrentPageHeight(int i17) {
        this.f428360f = i17;
    }

    public final void setMCurrentPageWidth(int i17) {
        this.f428359e = i17;
    }

    public final void setMCurrentScale(float f17) {
        this.B = f17;
    }

    public final void setMEditLayout(android.widget.FrameLayout frameLayout) {
        this.f428364m = frameLayout;
    }

    public final void setMReadyLayout(android.widget.FrameLayout frameLayout) {
        this.f428363i = frameLayout;
    }

    public final void setMScreenReportData(uj3.k1 k1Var) {
        this.f428361g = k1Var;
    }

    public final void setMStartTimes(long j17) {
        this.f428362h = j17;
    }

    public final void setMultiTalkStrokeContext(uj3.c cVar) {
        this.f428368q = cVar;
    }

    public final void setReadyNotAllowClick(boolean z17) {
        this.A = z17;
        uj3.c cVar = this.f428368q;
        if (cVar != null) {
            boolean z18 = !z17;
            qj3.h hVar = cVar.f428250i;
            if (hVar != null) {
                hVar.setDrawingEnable(z18);
            }
        }
        uj3.l0 l0Var = this.f428369r;
        if (l0Var != null) {
            l0Var.f428328m = !z17;
        }
    }

    public final void setReadyUI(uj3.j1 j1Var) {
        this.f428370s = j1Var;
    }

    public final void setScreenFuncConfig(uj3.k kVar) {
        this.f428358d = kVar;
    }

    public final void setScreenProjectSending(boolean z17) {
        this.f428375x = z17;
        com.tencent.mm.plugin.multitalk.model.e3.Ri().f150168m = z17;
    }

    public final void setSendData(com.tencent.mm.sdk.platformtools.n3 n3Var) {
        this.E = n3Var;
    }

    public final void setTopRoot(android.widget.FrameLayout frameLayout) {
        this.f428365n = frameLayout;
    }

    public final void setTopUiLayout(uj3.f1 f1Var) {
        this.f428372u = f1Var;
    }

    public final void t(boolean z17) {
        setScreenProjectSending(false);
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.E;
        if (n3Var != null) {
            n3Var.removeCallbacksAndMessages(null);
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var2 = this.E;
        if (n3Var2 != null) {
            n3Var2.quitSafely();
        }
        this.E = null;
        wu5.c cVar = this.C;
        if (cVar != null) {
            cVar.cancel(false);
        }
        this.C = null;
        wu5.c cVar2 = this.D;
        if (cVar2 != null) {
            cVar2.cancel(false);
        }
        this.D = null;
        if (z17) {
            com.tencent.mm.plugin.multitalk.model.e3.Ri().a0(102);
        } else {
            com.tencent.mm.plugin.multitalk.model.e3.Ri().a0(104);
        }
        com.tencent.mm.plugin.multitalk.model.e3.Ri().h();
    }
}
