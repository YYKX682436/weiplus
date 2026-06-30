package fk3;

/* loaded from: classes8.dex */
public final class o extends ek3.a {

    /* renamed from: a, reason: collision with root package name */
    public ak3.c f263585a;

    /* renamed from: b, reason: collision with root package name */
    public jk3.e f263586b;

    /* renamed from: c, reason: collision with root package name */
    public ek3.d f263587c;

    /* renamed from: d, reason: collision with root package name */
    public ek3.e f263588d;

    /* renamed from: e, reason: collision with root package name */
    public kk3.d f263589e;

    /* renamed from: f, reason: collision with root package name */
    public long f263590f = -1;

    /* renamed from: g, reason: collision with root package name */
    public boolean f263591g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f263592h;

    @Override // ek3.a
    public void a(int i17) {
        b(i17, true, true);
    }

    public final void b(int i17, boolean z17, boolean z18) {
        if (!c().c()) {
            kk3.d dVar = this.f263589e;
            if (dVar == null || dVar == null) {
                return;
            }
            dVar.e(i17);
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.u3.e()) {
            kk3.d dVar2 = this.f263589e;
            if (dVar2 == null || dVar2 == null) {
                return;
            }
            dVar2.e(i17);
            return;
        }
        c().f(new fk3.g(this));
        if (z18) {
            com.tencent.mm.sdk.platformtools.u3.h(new fk3.h(this, i17, z17));
            return;
        }
        ek3.d dVar3 = this.f263587c;
        if ((dVar3 != null ? dVar3.f253607v : null) != null) {
            d(i17, z17, this.f263589e);
            return;
        }
        kk3.d dVar4 = this.f263589e;
        if (dVar4 == null || dVar4 == null) {
            return;
        }
        dVar4.e(i17);
    }

    public final ak3.c c() {
        ak3.c cVar = this.f263585a;
        if (cVar != null) {
            return cVar;
        }
        kotlin.jvm.internal.o.o("pageAdapter");
        throw null;
    }

    public final void d(int i17, boolean z17, kk3.d dVar) {
        ek3.d dVar2;
        android.graphics.Rect rect;
        float width;
        float f17;
        ek3.e eVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskSwipeBackAndEnterAnimWrapperMS", "initMaskView, way:%d", java.lang.Integer.valueOf(i17));
        if (c().getMaskView() == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MultiTaskSwipeBackAndEnterAnimWrapperMS", "doMaskAnimation, page mask view is null");
            if (dVar != null) {
                dVar.e(i17);
                return;
            }
            return;
        }
        if (c().getContentView() == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MultiTaskSwipeBackAndEnterAnimWrapperMS", "doMaskAnimation, page content view is null");
            if (dVar != null) {
                dVar.e(i17);
                return;
            }
            return;
        }
        if (c().a() == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MultiTaskSwipeBackAndEnterAnimWrapperMS", "doMaskAnimation, page root view is null");
            if (dVar != null) {
                dVar.e(i17);
                return;
            }
            return;
        }
        if (this.f263592h) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MultiTaskSwipeBackAndEnterAnimWrapperMS", "isExitAnimating now!");
            return;
        }
        c();
        android.graphics.Bitmap bitmap = c().getBitmap();
        if (bitmap == null || bitmap.isRecycled() || bitmap.getWidth() == 0 || bitmap.getHeight() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MultiTaskSwipeBackAndEnterAnimWrapperMS", "doMaskAnimation, page get bitmap is null");
            if (dVar != null) {
                dVar.e(i17);
                return;
            }
            return;
        }
        ek3.e eVar2 = this.f263588d;
        if (eVar2 == null || eVar2.getParent() == null) {
            ek3.e eVar3 = new ek3.e(c().getActivity(), bitmap);
            this.f263588d = eVar3;
            eVar3.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
            android.view.ViewGroup a17 = c().a();
            if (a17 != null) {
                a17.setBackgroundColor(0);
            }
            if (a17 != null) {
                a17.addView(this.f263588d, a17.getChildCount());
            }
        }
        jk3.e eVar4 = this.f263586b;
        java.lang.String q17 = eVar4 != null ? ((jk3.b) eVar4).q(i17) : null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(q17)) {
            if (i17 == 4) {
                jk3.e eVar5 = this.f263586b;
                if (eVar5 != null) {
                    q17 = eVar5.e();
                }
                q17 = null;
            } else {
                jk3.e eVar6 = this.f263586b;
                if (eVar6 != null) {
                    q17 = eVar6.getPosition();
                }
                q17 = null;
            }
        }
        if (q17 != null) {
            try {
                java.lang.String[] strArr = (java.lang.String[]) new r26.t(",").g(q17, 0).toArray(new java.lang.String[0]);
                if (strArr.length == 4 && (dVar2 = this.f263587c) != null) {
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(strArr[0]);
                    kotlin.jvm.internal.o.f(valueOf, "valueOf(...)");
                    int intValue = valueOf.intValue();
                    java.lang.Integer valueOf2 = java.lang.Integer.valueOf(strArr[1]);
                    kotlin.jvm.internal.o.f(valueOf2, "valueOf(...)");
                    int intValue2 = valueOf2.intValue();
                    java.lang.Integer valueOf3 = java.lang.Integer.valueOf(strArr[2]);
                    kotlin.jvm.internal.o.f(valueOf3, "valueOf(...)");
                    int intValue3 = valueOf3.intValue();
                    java.lang.Integer valueOf4 = java.lang.Integer.valueOf(strArr[3]);
                    kotlin.jvm.internal.o.f(valueOf4, "valueOf(...)");
                    dVar2.f253607v = new android.graphics.Rect(new android.graphics.Rect(intValue, intValue2, intValue3, valueOf4.intValue()));
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MultiTaskSwipeBackAndEnterAnimWrapperMS", "refreshPosition, get pos failed, %s", e17.getMessage());
            }
        }
        android.view.View contentView = c().getContentView();
        if (contentView != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(contentView, arrayList.toArray(), "com/tencent/mm/plugin/multitask/animation/swipeback/multiscene/MultiTaskSwipeBackAnimWrapperMS", "initMaskView", "(IZLcom/tencent/mm/plugin/multitask/listener/OnMultiTaskFBTransformationListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            contentView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(contentView, "com/tencent/mm/plugin/multitask/animation/swipeback/multiscene/MultiTaskSwipeBackAnimWrapperMS", "initMaskView", "(IZLcom/tencent/mm/plugin/multitask/listener/OnMultiTaskFBTransformationListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (!z17) {
            if (dVar != null) {
                ek3.e eVar7 = this.f263588d;
                dVar.d(eVar7 != null ? eVar7.getContentBitmap() : null, true, i17);
                return;
            }
            return;
        }
        jk3.e eVar8 = this.f263586b;
        boolean f18 = eVar8 != null ? eVar8.f() : false;
        int i18 = f18 ? 90 : 0;
        this.f263592h = true;
        int width2 = (int) (bitmap.getWidth() * 1.0f);
        int height = (int) (bitmap.getHeight() * 1.0f);
        android.graphics.Rect rect2 = new android.graphics.Rect(0, 0, width2, height);
        ek3.d dVar3 = this.f263587c;
        if (dVar3 == null || (rect = dVar3.f253607v) == null) {
            rect = new android.graphics.Rect();
        }
        android.graphics.Rect rect3 = rect;
        int width3 = rect3.left + (rect3.width() / 2);
        int height2 = rect3.top + (rect3.height() / 2);
        if (f18) {
            width = rect3.height();
            f17 = height;
        } else {
            width = rect3.width();
            f17 = width2;
        }
        float f19 = width / f17;
        rect3.width();
        float width4 = (width3 - (rect2.left + (rect2.width() / 2))) * f19;
        float height3 = (height2 - (rect2.top + (rect2.height() / 2))) * f19;
        if (f18 && (eVar = this.f263588d) != null) {
            eVar.setGradientOrientation(android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT);
        }
        oa5.b.b(this.f263588d).m(width4).n(height3).e(f19).f(f19).k(new fk3.j(f18, width2, height, f19, rect3, this, width3, height2, i18)).h(new android.view.animation.AccelerateInterpolator()).p(new fk3.k(this, dVar, bitmap, i17)).o(new fk3.m(this, dVar, bitmap, i17)).g(250L).l();
    }

    public void e(ak3.c pageAdapter, jk3.e multiTaskHelper, kk3.d dVar) {
        kotlin.jvm.internal.o.g(pageAdapter, "pageAdapter");
        kotlin.jvm.internal.o.g(multiTaskHelper, "multiTaskHelper");
        this.f263585a = pageAdapter;
        this.f263586b = multiTaskHelper;
        this.f263589e = dVar;
        c().h(new fk3.n(this, multiTaskHelper));
        android.view.animation.Interpolator loadInterpolator = android.view.animation.AnimationUtils.loadInterpolator(c().getActivity(), com.tencent.mm.R.anim.f477822cg);
        android.view.ViewGroup a17 = c().a();
        if (a17 != null) {
            pm0.v.X(new fk3.i(this, a17, loadInterpolator));
        }
    }
}
