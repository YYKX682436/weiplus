package mi1;

/* loaded from: classes7.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.AppBrandRuntime f326702a;

    /* renamed from: b, reason: collision with root package name */
    public mi1.h f326703b;

    /* renamed from: c, reason: collision with root package name */
    public mi1.i f326704c;

    /* renamed from: d, reason: collision with root package name */
    public mi1.h0 f326705d;

    /* renamed from: e, reason: collision with root package name */
    public final mi1.m0 f326706e;

    /* renamed from: f, reason: collision with root package name */
    public final mi1.q1 f326707f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f326708g;

    /* renamed from: h, reason: collision with root package name */
    public int f326709h;

    /* renamed from: i, reason: collision with root package name */
    public mi1.u0 f326710i;

    /* renamed from: j, reason: collision with root package name */
    public mi1.f f326711j;

    /* renamed from: k, reason: collision with root package name */
    public final mi1.m f326712k;

    /* renamed from: l, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.page.v5 f326713l;

    /* renamed from: m, reason: collision with root package name */
    public al1.a0 f326714m;

    public v(com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        this.f326702a = runtime;
        mi1.m0 m0Var = new mi1.m0();
        this.f326706e = m0Var;
        mi1.q1 q1Var = new mi1.q1(runtime);
        this.f326707f = q1Var;
        m0Var.a((mi1.x2) ((jz5.n) q1Var.f326664e).getValue());
        m0Var.a(new mi1.b3(runtime));
        this.f326708g = jz5.h.a(jz5.i.f302830e, new mi1.p(this));
        this.f326712k = new mi1.m(this);
    }

    public final android.view.View a(int i17) {
        return c().findViewById(i17);
    }

    public final mi1.f b() {
        com.tencent.mm.plugin.appbrand.o6 a17;
        u81.h hVar;
        mi1.h0 h0Var = this.f326705d;
        if (h0Var == null) {
            mi1.f fVar = this.f326711j;
            if (fVar != null) {
                return fVar;
            }
            kotlin.jvm.internal.o.o("blinkHelperExport");
            throw null;
        }
        mi1.f fVar2 = this.f326711j;
        if (fVar2 == null) {
            kotlin.jvm.internal.o.o("blinkHelperExport");
            throw null;
        }
        com.tencent.mm.plugin.appbrand.c8 c8Var = (com.tencent.mm.plugin.appbrand.c8) h0Var;
        com.tencent.mm.plugin.appbrand.o6 o6Var = c8Var.f77038b;
        wa1.a aVar = wa1.b.f444100a;
        if (!aVar.b(o6Var) || (a17 = aVar.a(c8Var.f77038b)) == null) {
            return fVar2;
        }
        mi1.b0 b0Var = c8Var.f77037a;
        if (b0Var == null || b0Var.f326516e != a17.f74821z.b()) {
            mi1.b0 b0Var2 = c8Var.f77037a;
            if (b0Var2 != null && (hVar = b0Var2.f326515d.N) != null) {
                hVar.c(b0Var2.f326517f);
            }
            c8Var.f77037a = new mi1.b0(c8Var.f77038b, a17.f74821z.b());
        }
        return c8Var.f77037a;
    }

    public final mi1.h c() {
        mi1.h hVar = this.f326703b;
        if (hVar != null) {
            return hVar;
        }
        kotlin.jvm.internal.o.o("capsuleBarContainerLayout");
        throw null;
    }

    public final com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandOptionButton d() {
        mi1.i iVar = this.f326704c;
        if (iVar == null) {
            kotlin.jvm.internal.o.o("capsuleBarView");
            throw null;
        }
        com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandOptionButton optionBtn = iVar.getOptionBtn();
        kotlin.jvm.internal.o.f(optionBtn, "getOptionBtn(...)");
        return optionBtn;
    }

    public final com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandTranslateLayout e() {
        if (this.f326714m == null) {
            this.f326714m = new mi1.q(this);
            mi1.i iVar = this.f326704c;
            if (iVar == null) {
                kotlin.jvm.internal.o.o("capsuleBarView");
                throw null;
            }
            com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandTranslateLayout translateLayout = iVar.getTranslateLayout();
            al1.a0 a0Var = this.f326714m;
            kotlin.jvm.internal.o.d(a0Var);
            translateLayout.setOnTranslateClick(a0Var);
        }
        mi1.i iVar2 = this.f326704c;
        if (iVar2 == null) {
            kotlin.jvm.internal.o.o("capsuleBarView");
            throw null;
        }
        com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandTranslateLayout translateLayout2 = iVar2.getTranslateLayout();
        kotlin.jvm.internal.o.f(translateLayout2, "getTranslateLayout(...)");
        return translateLayout2;
    }

    public final void g(com.tencent.mm.plugin.appbrand.page.v5 page, com.tencent.mm.plugin.appbrand.page.wd type) {
        kotlin.jvm.internal.o.g(page, "page");
        kotlin.jvm.internal.o.g(type, "type");
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f326713l;
        mi1.m mVar = this.f326712k;
        if (v5Var != null) {
            mVar.getClass();
            mi1.l lVar = (mi1.l) mVar.f326616a.get(v5Var.hashCode(), null);
            if (lVar != null) {
                lVar.r();
            }
        }
        this.f326713l = page;
        mVar.getClass();
        android.util.SparseArray sparseArray = mVar.f326616a;
        mi1.l lVar2 = (mi1.l) sparseArray.get(page.hashCode(), null);
        if (lVar2 == null) {
            lVar2 = new mi1.l(mVar.f326617b, page);
            sparseArray.put(page.hashCode(), lVar2);
        }
        lVar2.f326608h = true;
        com.tencent.mm.plugin.appbrand.page.v5 v5Var2 = lVar2.f326604d;
        xi1.m C1 = v5Var2.C1();
        if (C1 != null && C1.c()) {
            lVar2.o();
        } else {
            lVar2.p();
        }
        xi1.m C12 = v5Var2.C1();
        if (C12 != null) {
            C12.d(lVar2);
        }
        mi1.i iVar = lVar2.f326609i.f326704c;
        if (iVar == null) {
            kotlin.jvm.internal.o.o("capsuleBarView");
            throw null;
        }
        iVar.addOnLayoutChangeListener(lVar2);
        com.tencent.mm.plugin.appbrand.page.capsulebar.AppBrandCapsuleBarPlaceHolderView capsuleView = v5Var2.r1().getCapsuleView();
        android.view.ViewParent parent = capsuleView != null ? capsuleView.getParent() : null;
        android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (view != null) {
            view.addOnLayoutChangeListener(lVar2);
        }
        v5Var2.r1().addOnLayoutChangeListener(lVar2);
        lVar2.d(lVar2.f326606f);
        lVar2.e(((mi1.l2) ((jz5.n) lVar2.f326607g).getValue()).f326614d);
        lVar2.k(lVar2.f326605e);
        lVar2.q();
    }

    public final void h(int i17) {
        android.view.View view;
        int childCount = c().getChildCount();
        int i18 = 0;
        while (true) {
            if (i18 >= childCount) {
                view = null;
                break;
            }
            view = c().getChildAt(i18);
            if (view.getId() == i17) {
                break;
            } else {
                i18++;
            }
        }
        c().removeView(view);
    }

    public final void i(android.content.Context newBase) {
        kotlin.jvm.internal.o.g(newBase, "newBase");
        mi1.h c17 = c();
        if (c17.getContext() instanceof android.content.MutableContextWrapper) {
            if (c17.f326563w > 0) {
                c17.setLayoutFrozen(!(newBase instanceof android.app.Activity));
            } else {
                c17.setLayoutFrozen(false);
            }
            ((android.content.MutableContextWrapper) c17.getContext()).setBaseContext(newBase);
        }
    }

    public final void j() {
        if (this.f326703b != null) {
            c().setVisibility(this.f326709h);
            com.tencent.mars.xlog.Log.i("AppBrandCapsuleBarManager", "restoreCapsuleBarVisibility, savedCapsuleBarContainerLayoutVisibility=" + this.f326709h);
        }
    }

    public final void k() {
        if (this.f326703b != null) {
            this.f326709h = c().getVisibility();
            com.tencent.mars.xlog.Log.i("AppBrandCapsuleBarManager", "saveCapsuleBarVisibility, savedCapsuleBarContainerLayoutVisibility=" + this.f326709h);
        }
    }

    public final void l() {
        mi1.i iVar = this.f326704c;
        if (iVar != null) {
            if (iVar == null) {
                kotlin.jvm.internal.o.o("capsuleBarView");
                throw null;
            }
            iVar.f326581u = false;
            int i17 = iVar.f326572i;
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = iVar.f326575o;
            if (i17 == -1) {
                constraintLayout.setBackgroundResource(com.tencent.mm.R.drawable.f480787cl);
            } else {
                constraintLayout.setBackgroundResource(com.tencent.mm.R.drawable.f480788cm);
            }
        }
    }

    public final void m() {
        mi1.i iVar = this.f326704c;
        if (iVar != null) {
            if (iVar == null) {
                kotlin.jvm.internal.o.o("capsuleBarView");
                throw null;
            }
            iVar.f326581u = true;
            int i17 = iVar.f326572i;
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = iVar.f326575o;
            if (i17 == -1) {
                constraintLayout.setBackgroundResource(com.tencent.mm.R.drawable.f480773yk);
            } else {
                constraintLayout.setBackgroundResource(com.tencent.mm.R.drawable.aen);
            }
        }
    }
}
