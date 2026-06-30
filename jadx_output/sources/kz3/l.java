package kz3;

/* loaded from: classes15.dex */
public final class l implements sy3.c, kz3.r {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f313883a;

    /* renamed from: b, reason: collision with root package name */
    public final int f313884b;

    /* renamed from: c, reason: collision with root package name */
    public ry3.m f313885c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f313886d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f313887e;

    /* renamed from: f, reason: collision with root package name */
    public sy3.a f313888f;

    /* renamed from: g, reason: collision with root package name */
    public long f313889g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f313890h;

    /* renamed from: i, reason: collision with root package name */
    public sy3.e f313891i;

    /* renamed from: j, reason: collision with root package name */
    public final kz3.m f313892j;

    /* renamed from: k, reason: collision with root package name */
    public final kz3.p f313893k;

    /* renamed from: l, reason: collision with root package name */
    public final kz3.w f313894l;

    /* renamed from: m, reason: collision with root package name */
    public uy3.j0 f313895m;

    /* renamed from: n, reason: collision with root package name */
    public final uy3.v f313896n;

    /* renamed from: o, reason: collision with root package name */
    public uy3.q f313897o;

    /* renamed from: p, reason: collision with root package name */
    public final kz3.g f313898p;

    /* renamed from: q, reason: collision with root package name */
    public final db5.e0 f313899q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f313900r;

    /* renamed from: s, reason: collision with root package name */
    public final kz3.i f313901s;

    public l(android.content.Context context, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f313892j = new kz3.n();
        this.f313894l = new kz3.w(this);
        this.f313896n = new kz3.h(this);
        this.f313898p = new kz3.g(this);
        this.f313899q = new kz3.j(this);
        this.f313901s = new kz3.i(this);
        this.f313883a = context;
        this.f313884b = i17;
        this.f313893k = new kz3.p(context, this);
    }

    public void a(android.view.View view) {
        this.f313886d = view;
        if (view instanceof com.tencent.mm.ui.base.WxImageView) {
            kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type com.tencent.mm.ui.base.WxImageView");
            ((com.tencent.mm.ui.base.WxImageView) view).setOnDoubleTapListener(new kz3.f(this));
        }
        android.view.KeyEvent.Callback callback = this.f313886d;
        if (callback instanceof db5.f0) {
            kotlin.jvm.internal.o.e(callback, "null cannot be cast to non-null type com.tencent.mm.ui.base.IZoomableImageView");
            ((db5.f0) callback).setOnZoomScaleChangedListener(this.f313899q);
        }
    }

    public boolean b(long j17) {
        boolean z17;
        kz3.m mVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryImageOCRHelper", "cancelImageOCR sessionId: %s, uploadFinish: %s", java.lang.Long.valueOf(j17), java.lang.Boolean.valueOf(this.f313890h));
        boolean z18 = false;
        if (j17 == 0 || this.f313890h) {
            z17 = false;
        } else {
            ((yz3.w) ((ry3.j) i95.n0.c(ry3.j.class))).wi(j17);
            z17 = true;
        }
        uy3.j0 j0Var = this.f313895m;
        if (j0Var != null) {
            kotlin.jvm.internal.o.d(j0Var);
            if (j0Var.D()) {
                uy3.j0 j0Var2 = this.f313895m;
                kotlin.jvm.internal.o.d(j0Var2);
                z18 = j0Var2.isShowing();
                com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryImageOCRHelper", "cancelImageOCR dismiss dialog handled: %s", java.lang.Boolean.valueOf(z18));
                uy3.j0 j0Var3 = this.f313895m;
                kotlin.jvm.internal.o.d(j0Var3);
                j0Var3.dismiss();
                z17 = true;
            }
        }
        if (z17 && (mVar = this.f313892j) != null) {
            kz3.n nVar = (kz3.n) mVar;
            if (nVar.f313902a == j17 && !nVar.f313903b) {
                nVar.f313903b = true;
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(21699, java.lang.String.valueOf(j17), 1, -1);
            }
        }
        return z18;
    }

    public boolean c() {
        uy3.j0 j0Var = this.f313895m;
        if (j0Var != null) {
            kotlin.jvm.internal.o.d(j0Var);
            if (j0Var.isShowing()) {
                return true;
            }
        }
        return false;
    }

    public void d(android.content.res.Configuration configuration) {
        uy3.j0 j0Var = this.f313895m;
        if (j0Var != null) {
            kotlin.jvm.internal.o.d(j0Var);
            if (j0Var.D()) {
                kz3.p pVar = this.f313893k;
                if (pVar != null) {
                    if (configuration != null && configuration.orientation == 2) {
                        pVar.n(false);
                        int i17 = pVar.f313919t;
                        if (i17 == 1) {
                            android.view.KeyEvent.Callback callback = pVar.f313909g;
                            if (callback instanceof db5.f0) {
                                kotlin.jvm.internal.o.e(callback, "null cannot be cast to non-null type com.tencent.mm.ui.base.IZoomableImageView");
                                ((db5.f0) callback).f();
                            }
                            pVar.i(-1, -1);
                        } else if (i17 == 2) {
                            pVar.i(-1, -1);
                        }
                        if (pVar.f313909g instanceof db5.f0) {
                            pVar.m(true);
                            android.view.KeyEvent.Callback callback2 = pVar.f313909g;
                            kotlin.jvm.internal.o.e(callback2, "null cannot be cast to non-null type com.tencent.mm.ui.base.IZoomableImageView");
                            ((db5.f0) callback2).i();
                            return;
                        }
                        return;
                    }
                    if (configuration != null && configuration.orientation == 1) {
                        int i18 = pVar.f313919t;
                        if (i18 == 1) {
                            pVar.o();
                            pVar.g();
                            pVar.n(true);
                            pVar.i(pVar.k(), pVar.j());
                        } else if (i18 == 2) {
                            pVar.n(false);
                            pVar.i(-1, -1);
                        }
                        if (pVar.f313909g instanceof db5.f0) {
                            pVar.m(true);
                            android.view.KeyEvent.Callback callback3 = pVar.f313909g;
                            kotlin.jvm.internal.o.e(callback3, "null cannot be cast to non-null type com.tencent.mm.ui.base.IZoomableImageView");
                            ((db5.f0) callback3).i();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
        android.view.View view = this.f313887e;
        if (view == null) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -1;
            layoutParams.height = -1;
        } else {
            layoutParams = null;
        }
        view.setLayoutParams(layoutParams);
    }

    public boolean e(android.view.MotionEvent motionEvent) {
        uy3.j0 j0Var;
        if (motionEvent != null && (j0Var = this.f313895m) != null) {
            kotlin.jvm.internal.o.d(j0Var);
            if (j0Var.isShowing() && (this.f313886d instanceof db5.f0)) {
                this.f313894l.c(db5.s.b(motionEvent, 0), db5.s.c(motionEvent, 0));
                return true;
            }
        }
        return false;
    }

    public final void f(int i17, int i18) {
        com.tencent.mars.xlog.Log.e("MicroMsg.ImageGalleryImageOCRHelper", "onError errType: " + i17 + ", errCode: " + i18);
        sy3.e eVar = this.f313891i;
        if (eVar != null) {
            eVar.onError(i17, i18);
        }
        kz3.m mVar = this.f313892j;
        if (mVar != null) {
            kz3.n nVar = (kz3.n) mVar;
            if (i18 == 202) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(21699, java.lang.String.valueOf(nVar.f313902a), 7, -1);
            } else if (i17 == 4) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(21699, java.lang.String.valueOf(nVar.f313902a), 6, -1);
            } else if (i18 == 301 || i18 == 201) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(21699, java.lang.String.valueOf(nVar.f313902a), 6, -1);
            } else if (i17 == 3) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(21699, java.lang.String.valueOf(nVar.f313902a), 8, -1);
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(21699, java.lang.String.valueOf(nVar.f313902a), 99, -1);
            }
        }
        boolean z17 = gm0.j1.d().n() == 6 || gm0.j1.d().n() == 4;
        android.content.Context context = this.f313883a;
        if (!z17) {
            java.lang.String string = context.getString(com.tencent.mm.R.string.i_7);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            h(string);
            return;
        }
        boolean z18 = i18 == 101 || i18 == 102 || i18 == 999;
        if (i17 == 4) {
            if (z18) {
                java.lang.String string2 = context.getString(com.tencent.mm.R.string.i_6);
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                h(string2);
                return;
            } else {
                java.lang.String string3 = context.getString(com.tencent.mm.R.string.i_8);
                kotlin.jvm.internal.o.f(string3, "getString(...)");
                h(string3);
                return;
            }
        }
        if (i17 == 3 && z18) {
            java.lang.String string4 = context.getString(com.tencent.mm.R.string.i_6);
            kotlin.jvm.internal.o.f(string4, "getString(...)");
            h(string4);
        } else {
            java.lang.String string5 = context.getString(com.tencent.mm.R.string.i_7);
            kotlin.jvm.internal.o.f(string5, "getString(...)");
            h(string5);
        }
    }

    public void g() {
        kz3.p pVar = this.f313893k;
        if (pVar != null) {
            pVar.f313921v = false;
        }
        kz3.w wVar = this.f313894l;
        wVar.f313936f = 0.0f;
        wVar.f313935e = 0;
        wVar.f313937g = 0;
        uy3.q qVar = this.f313897o;
        if (qVar != null) {
            ((com.tencent.mm.plugin.scanner.box.ScanOCRDialogBackgroundOpView) qVar).f158712d = null;
        }
        this.f313897o = null;
        this.f313895m = null;
        android.view.View view = this.f313886d;
        if (view instanceof com.tencent.mm.ui.base.WxImageView) {
            kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type com.tencent.mm.ui.base.WxImageView");
            ((com.tencent.mm.ui.base.WxImageView) view).setOnDoubleTapListener(null);
        }
        android.view.KeyEvent.Callback callback = this.f313886d;
        if (callback instanceof db5.f0) {
            kotlin.jvm.internal.o.e(callback, "null cannot be cast to non-null type com.tencent.mm.ui.base.IZoomableImageView");
            ((db5.f0) callback).setOnZoomScaleChangedListener(null);
        }
        this.f313886d = null;
        if (this.f313889g != 0) {
            ((yz3.w) ((ry3.j) i95.n0.c(ry3.j.class))).wi(this.f313889g);
            this.f313889g = 0L;
        }
        jz5.g gVar = kz3.d.f313872a;
        try {
            kz3.d.f313873b.clear();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BizImageOCRManager", th6, "clearOCRResult exception", new java.lang.Object[0]);
        }
    }

    public final void h(java.lang.String str) {
        android.content.Context context = this.f313883a;
        db5.e1.E(context, str, "", context.getResources().getString(com.tencent.mm.R.string.f490455vj), false, null);
    }

    public long i(ry3.p pVar, ry3.m mVar, sy3.e eVar) {
        if (pVar == null) {
            return 0L;
        }
        this.f313890h = false;
        this.f313885c = mVar;
        this.f313891i = eVar;
        long j17 = pVar.f401527a;
        this.f313889g = j17;
        if (eVar != null) {
            eVar.c(j17);
        }
        kz3.m mVar2 = this.f313892j;
        if (mVar2 != null) {
            kz3.n nVar = (kz3.n) mVar2;
            nVar.f313902a = this.f313889g;
            nVar.f313903b = false;
        }
        if (!(gm0.j1.d().n() == 6 || gm0.j1.d().n() == 4)) {
            f(3, 301);
            return 0L;
        }
        android.view.KeyEvent.Callback callback = this.f313886d;
        kz3.w wVar = this.f313894l;
        if (callback != null) {
            wVar.f313938h = 0.01f;
            wVar.f313939i = 0.01f;
            db5.f0 f0Var = callback instanceof db5.f0 ? (db5.f0) callback : null;
            if (f0Var != null) {
                wVar.f313932b = new kz3.z(f0Var);
            }
        }
        sy3.a aVar = this.f313888f;
        if (aVar != null) {
            wVar.f313932b = aVar;
            wVar.f313935e = 1;
            wVar.f313938h = 0.0f;
            wVar.f313939i = 0.0f;
            wVar.d();
            aVar.e(new kz3.t(wVar));
        }
        wVar.f313933c = mVar2;
        android.view.KeyEvent.Callback callback2 = this.f313886d;
        if (callback2 instanceof db5.f0) {
            kotlin.jvm.internal.o.e(callback2, "null cannot be cast to non-null type com.tencent.mm.ui.base.IZoomableImageView");
            ((db5.f0) callback2).i();
        }
        ry3.j jVar = (ry3.j) i95.n0.c(ry3.j.class);
        kz3.k kVar = new kz3.k(this, pVar);
        yz3.w wVar2 = (yz3.w) jVar;
        wVar2.getClass();
        pVar.f401528b = 3;
        if (pVar.f401527a == 0) {
            pVar.f401527a = java.lang.System.currentTimeMillis();
        }
        ((iz3.s) ((jz5.n) wVar2.f468548d).getValue()).d(pVar.f401527a, pVar, new yz3.u(kVar));
        long j18 = pVar.f401527a;
        this.f313889g = j18;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryImageOCRHelper", "startImageOCR uploadSessionId: %s, scene: %s", java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(this.f313884b));
        return this.f313889g;
    }
}
