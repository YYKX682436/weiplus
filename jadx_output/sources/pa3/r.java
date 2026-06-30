package pa3;

/* loaded from: classes8.dex */
public final class r extends ak3.i {

    /* renamed from: q, reason: collision with root package name */
    public android.app.Activity f352999q;

    public r(android.app.Activity activity) {
        super(activity);
        this.f352999q = activity;
    }

    @Override // ak3.i, ak3.c
    public boolean g() {
        return true;
    }

    @Override // ak3.i, ak3.c
    public android.app.Activity getActivity() {
        return this.f352999q;
    }

    @Override // ak3.i, ak3.c
    public android.graphics.Bitmap getBitmap() {
        android.view.View maskView = getMaskView();
        if (maskView != null) {
            return pa3.w.b(pa3.w.f353012a, maskView, java.lang.Integer.valueOf(maskView.getWidth()), java.lang.Integer.valueOf(maskView.getHeight()), null, 8, null);
        }
        return null;
    }

    @Override // ak3.i, ak3.c
    public android.view.View getContentView() {
        android.app.Activity activity = this.f352999q;
        com.tencent.mm.ext.ui.SwipeBackActivity swipeBackActivity = activity instanceof com.tencent.mm.ext.ui.SwipeBackActivity ? (com.tencent.mm.ext.ui.SwipeBackActivity) activity : null;
        if (swipeBackActivity != null) {
            return swipeBackActivity.f64958d;
        }
        return null;
    }

    @Override // ak3.i, ak3.c
    public android.view.View getMaskView() {
        android.view.Window window;
        android.app.Activity activity = this.f352999q;
        if (activity == null || (window = activity.getWindow()) == null) {
            return null;
        }
        return window.getDecorView();
    }

    @Override // ak3.i, ak3.c
    public void h(ak3.a aVar) {
        com.tencent.mm.ext.ui.SwipeBackLayout swipeBackLayout;
        jz5.f0 f0Var;
        super.h(aVar);
        ak3.d dVar = this.f5584f;
        pa3.q qVar = null;
        if (dVar != null) {
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(((rk3.i) dVar).f396522b != null);
            if (valueOf != null) {
                valueOf.booleanValue();
                ak3.d dVar2 = this.f5584f;
                if (dVar2 != null) {
                    al5.g3 g3Var = this.f5585g;
                    com.tencent.mm.plugin.multitask.ui.base.MultiTaskViewPager multiTaskViewPager = ((rk3.i) dVar2).f396522b;
                    if (multiTaskViewPager != null) {
                        multiTaskViewPager.setSwipeBackListener(g3Var);
                    }
                    f0Var = jz5.f0.f302826a;
                } else {
                    f0Var = null;
                }
                if (f0Var != null) {
                    return;
                }
            }
        }
        android.app.Activity activity = this.f352999q;
        com.tencent.mm.ext.ui.SwipeBackActivity swipeBackActivity = activity instanceof com.tencent.mm.ext.ui.SwipeBackActivity ? (com.tencent.mm.ext.ui.SwipeBackActivity) activity : null;
        if (swipeBackActivity == null || (swipeBackLayout = swipeBackActivity.f64958d) == null) {
            return;
        }
        if (this.f5585g == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MultiTaskPageAdapter", "swipeBackListener is null");
        } else {
            qVar = new pa3.q(this);
        }
        swipeBackLayout.setSwipeBackListener(qVar);
    }

    @Override // ak3.i, ak3.c
    public void i(boolean z17) {
        com.tencent.mm.ext.ui.SwipeBackLayout swipeBackLayout;
        android.app.Activity activity = this.f352999q;
        pa3.q qVar = null;
        com.tencent.mm.ext.ui.SwipeBackActivity swipeBackActivity = activity instanceof com.tencent.mm.ext.ui.SwipeBackActivity ? (com.tencent.mm.ext.ui.SwipeBackActivity) activity : null;
        if (swipeBackActivity == null || (swipeBackLayout = swipeBackActivity.f64958d) == null) {
            return;
        }
        swipeBackLayout.setEnableGesture(z17);
        if (z17) {
            if (this.f5585g == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MultiTaskPageAdapter", "swipeBackListener is null");
            } else {
                qVar = new pa3.q(this);
            }
        }
        swipeBackLayout.setSwipeBackListener(qVar);
    }

    @Override // ak3.i, ak3.c
    public void j(boolean z17, jk3.e helper) {
        kotlin.jvm.internal.o.g(helper, "helper");
        super.j(z17, helper);
        android.app.Activity activity = this.f352999q;
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // ak3.i, ak3.c
    public void k(jk3.e eVar) {
        if (this.f5584f == null) {
            com.tencent.mm.plugin.multitask.l0 l0Var = (com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class);
            android.app.Activity activity = this.f352999q;
            ((com.tencent.mm.plugin.multitask.p1) l0Var).getClass();
            this.f5584f = new rk3.i(activity);
        }
        ak3.d dVar = this.f5584f;
        if (dVar != null) {
            ((rk3.i) dVar).a(this, eVar);
        }
    }

    @Override // ak3.i, ak3.c
    public void l() {
        com.tencent.mm.ext.ui.SwipeBackLayout swipeBackLayout;
        android.content.res.Resources resources;
        android.util.DisplayMetrics displayMetrics;
        android.app.Activity activity = this.f352999q;
        com.tencent.mm.ext.ui.SwipeBackActivity swipeBackActivity = activity instanceof com.tencent.mm.ext.ui.SwipeBackActivity ? (com.tencent.mm.ext.ui.SwipeBackActivity) activity : null;
        if (swipeBackActivity == null || (swipeBackLayout = swipeBackActivity.f64958d) == null) {
            return;
        }
        float f17 = (activity == null || (resources = activity.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? 0.0f : displayMetrics.density;
        float f18 = 20 * f17;
        float B = (i65.a.B(com.tencent.mm.sdk.platformtools.x2.f193071a) / 5) - f18;
        float f19 = (100 * f17) + 0.5f;
        if (B > 0.0f) {
            f18 = B;
        }
        swipeBackLayout.setEdgeSizeAndInitEdgeTouched((int) java.lang.Math.min(f19, f18));
    }

    @Override // ak3.i
    public void r(android.app.Activity activity) {
        this.f352999q = activity;
    }
}
