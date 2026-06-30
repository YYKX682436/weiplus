package kz3;

/* loaded from: classes15.dex */
public final class p implements uy3.u {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f313906d;

    /* renamed from: e, reason: collision with root package name */
    public final kz3.r f313907e;

    /* renamed from: f, reason: collision with root package name */
    public ry3.m f313908f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f313909g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f313910h;

    /* renamed from: i, reason: collision with root package name */
    public int f313911i;

    /* renamed from: m, reason: collision with root package name */
    public int f313912m;

    /* renamed from: n, reason: collision with root package name */
    public final int f313913n;

    /* renamed from: o, reason: collision with root package name */
    public final int f313914o;

    /* renamed from: p, reason: collision with root package name */
    public float f313915p;

    /* renamed from: q, reason: collision with root package name */
    public float f313916q;

    /* renamed from: r, reason: collision with root package name */
    public final kz3.q f313917r;

    /* renamed from: s, reason: collision with root package name */
    public lz3.e f313918s;

    /* renamed from: t, reason: collision with root package name */
    public int f313919t;

    /* renamed from: u, reason: collision with root package name */
    public lz3.c f313920u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f313921v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f313922w;

    public p(android.content.Context context, kz3.r ocrViewModel) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(ocrViewModel, "ocrViewModel");
        this.f313906d = context;
        this.f313907e = ocrViewModel;
        this.f313917r = new kz3.q();
        this.f313913n = com.tencent.mm.ui.bl.h(context);
        this.f313914o = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv);
    }

    @Override // uy3.u
    public void a(int i17, float f17, float f18) {
        this.f313922w = true;
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Float.valueOf(f17);
        objArr[2] = java.lang.Float.valueOf(f18);
        objArr[3] = java.lang.Integer.valueOf(this.f313913n);
        ry3.m mVar = this.f313908f;
        objArr[4] = mVar != null ? java.lang.Boolean.valueOf(mVar.f401524a) : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageOcrResultDialogMoveListener", "onDialogShowAnimationStart dialogHeight: %s, startTransY: %s, endTransY: %s, statusBarHeight: %s, enableFullScreen: %s", objArr);
        this.f313915p = f17;
        this.f313916q = f18;
        m(false);
        lz3.c cVar = new lz3.c();
        cVar.f322367a = this.f313909g;
        cVar.f322369c.set(this.f313912m, this.f313911i);
        cVar.f322370d.set(k(), j());
        this.f313920u = cVar;
        lz3.e eVar = this.f313918s;
        if (eVar != null) {
            eVar.e(cVar);
        }
        lz3.c cVar2 = this.f313920u;
        kotlin.jvm.internal.o.d(cVar2);
        boolean z17 = cVar2.f322368b;
        kz3.q qVar = this.f313917r;
        qVar.f313923a = z17;
        lz3.c cVar3 = this.f313920u;
        kotlin.jvm.internal.o.d(cVar3);
        qVar.f313925c = cVar3.f322372f.f322373a.x;
        lz3.c cVar4 = this.f313920u;
        kotlin.jvm.internal.o.d(cVar4);
        if (cVar4.f322368b && (this.f313909g instanceof db5.f0)) {
            kotlin.jvm.internal.o.e(this.f313909g, "null cannot be cast to non-null type com.tencent.mm.ui.base.IZoomableImageView");
            qVar.f313924b = (k() * 1.0f) / ((db5.f0) r0).getImageWidth();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageOcrResultDialogMoveListener", "onDialogShowAnimationStart isLongImage: %s, showDefaultScale: %s, showDoubleScale: %s", java.lang.Boolean.valueOf(qVar.f313923a), java.lang.Float.valueOf(qVar.f313925c), java.lang.Float.valueOf(qVar.f313924b));
        o();
        g();
        android.view.View view = this.f313909g;
        if (view instanceof com.tencent.mm.ui.base.WxImageView) {
            kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type com.tencent.mm.ui.base.WxImageView");
            ((com.tencent.mm.ui.base.WxImageView) view).setAllowInterceptTouchEvent(false);
        }
    }

    @Override // uy3.u
    public void b() {
        ((kz3.l) this.f313907e).f313900r = false;
    }

    @Override // uy3.u
    public void c() {
        lz3.e eVar;
        this.f313922w = true;
        if (this.f313921v) {
            this.f313921v = false;
            return;
        }
        lz3.c cVar = this.f313920u;
        if (cVar != null && (eVar = this.f313918s) != null) {
            eVar.a(cVar);
        }
        m(false);
        n(false);
        if (this.f313919t == 1 && !l()) {
            int i17 = this.f313911i;
            android.view.View view = this.f313910h;
            if (view == null) {
                return;
            }
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = i17;
            } else {
                layoutParams = null;
            }
            view.setLayoutParams(layoutParams);
        }
    }

    @Override // uy3.u
    public void d(int i17, float f17, float f18) {
        lz3.e eVar;
        lz3.e eVar2;
        float min = java.lang.Math.min(java.lang.Math.max((java.lang.Math.abs(this.f313915p - f17) * 1.0f) / java.lang.Math.abs(this.f313916q - this.f313915p), 0.0f), 1.0f);
        if (i17 == 0) {
            if (this.f313919t == 1 && !l()) {
                int j17 = this.f313911i + ((int) ((j() - r6) * min));
                int k17 = k();
                i((int) (this.f313912m + ((k17 - r3) * min)), j17);
                android.view.View view = this.f313910h;
                if (view != null) {
                    view.getLayoutParams();
                }
                android.view.View view2 = this.f313910h;
                if (view2 != null) {
                    view2.getLayoutParams();
                }
            }
            if (this.f313909g instanceof db5.f0) {
                lz3.e eVar3 = this.f313918s;
                if ((eVar3 != null && eVar3.d()) && (eVar2 = this.f313918s) != null) {
                    eVar2.c(min);
                }
            }
        } else {
            int k18 = k();
            float f19 = this.f313912m + ((k18 - r2) * min);
            if (this.f313919t == 1 && !l()) {
                int i18 = (int) f19;
                android.view.View view3 = this.f313910h;
                if (view3 != null) {
                    android.view.ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.width = i18;
                    } else {
                        layoutParams = null;
                    }
                    view3.setLayoutParams(layoutParams);
                }
            }
            if (this.f313909g instanceof db5.f0) {
                lz3.e eVar4 = this.f313918s;
                if ((eVar4 != null && eVar4.d()) && (eVar = this.f313918s) != null) {
                    eVar.b(1.0f - min);
                }
            }
        }
        if (min < 1.0f) {
            n(false);
        } else {
            n(true);
            this.f313921v = false;
        }
    }

    @Override // uy3.u
    public void e() {
        this.f313922w = false;
        m(true);
        android.view.KeyEvent.Callback callback = this.f313909g;
        if (callback instanceof db5.f0) {
            kotlin.jvm.internal.o.e(callback, "null cannot be cast to non-null type com.tencent.mm.ui.base.IZoomableImageView");
            ((db5.f0) callback).f();
        }
        android.view.View view = this.f313909g;
        if (view instanceof com.tencent.mm.ui.base.WxImageView) {
            kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type com.tencent.mm.ui.base.WxImageView");
            ((com.tencent.mm.ui.base.WxImageView) view).setAllowInterceptTouchEvent(true);
        }
        android.view.View view2 = this.f313909g;
        if (view2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ocr/ImageOCRResultDialogMoveListener", "onDialogDismissAnimationEnd", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/scanner/ocr/ImageOCRResultDialogMoveListener", "onDialogDismissAnimationEnd", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        if (this.f313919t == 1 && l() && (this.f313909g instanceof db5.f0)) {
            i(this.f313911i, this.f313912m);
            android.view.KeyEvent.Callback callback2 = this.f313909g;
            kotlin.jvm.internal.o.e(callback2, "null cannot be cast to non-null type com.tencent.mm.ui.base.IZoomableImageView");
            ((db5.f0) callback2).i();
        }
    }

    @Override // uy3.u
    public void f() {
        this.f313922w = false;
        if (this.f313919t == 1 && l()) {
            n(true);
        }
    }

    public final void g() {
        android.view.View view = this.f313909g;
        if (view instanceof com.tencent.mm.ui.base.WxImageView) {
            kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type com.tencent.mm.ui.base.WxImageView");
            float minScale = ((com.tencent.mm.ui.base.WxImageView) view).getMinScale();
            kz3.q qVar = this.f313917r;
            if (minScale > qVar.f313925c) {
                android.view.View view2 = this.f313909g;
                kotlin.jvm.internal.o.e(view2, "null cannot be cast to non-null type com.tencent.mm.ui.base.WxImageView");
                ((com.tencent.mm.ui.base.WxImageView) view2).setMinScale(qVar.f313925c);
            }
        }
    }

    @Override // uy3.u
    public void h() {
        c();
        this.f313921v = true;
    }

    public final void i(int i17, int i18) {
        android.view.ViewGroup.LayoutParams layoutParams;
        android.view.View view = this.f313910h;
        if (view == null) {
            return;
        }
        if (view == null || (layoutParams = view.getLayoutParams()) == null) {
            layoutParams = null;
        } else {
            layoutParams.width = i17;
            layoutParams.height = i18;
        }
        view.setLayoutParams(layoutParams);
    }

    public final int j() {
        ry3.m mVar = this.f313908f;
        return (int) (mVar != null ? mVar.f401524a : true ? this.f313916q + this.f313913n : this.f313916q);
    }

    public final int k() {
        return this.f313912m - (this.f313914o * 2);
    }

    public final boolean l() {
        return this.f313906d.getResources().getConfiguration().orientation == 2;
    }

    public final void m(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageOcrResultDialogMoveListener", "setCanRefresh %b, view: %s", java.lang.Boolean.valueOf(z17), this.f313909g);
        android.view.KeyEvent.Callback callback = this.f313909g;
        if (callback instanceof db5.f0) {
            kotlin.jvm.internal.o.e(callback, "null cannot be cast to non-null type com.tencent.mm.ui.base.IZoomableImageView");
            ((db5.f0) callback).setCanRefresh(z17);
        }
    }

    public final void n(boolean z17) {
        android.view.View view;
        java.lang.Object obj = ((kz3.l) this.f313907e).f313897o;
        if (!(obj instanceof android.view.View) || (view = (android.view.View) obj) == null) {
            return;
        }
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ocr/ImageGalleryImageOCRHelper", "showBackgroundOpView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/scanner/ocr/ImageGalleryImageOCRHelper", "showBackgroundOpView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void o() {
        android.view.KeyEvent.Callback callback = this.f313909g;
        if ((callback instanceof db5.f0) && this.f313919t == 1) {
            kotlin.jvm.internal.o.e(callback, "null cannot be cast to non-null type com.tencent.mm.ui.base.IZoomableImageView");
            ((db5.f0) callback).setCustomScaleRate(java.lang.Float.valueOf(this.f313917r.f313925c));
        }
    }
}
