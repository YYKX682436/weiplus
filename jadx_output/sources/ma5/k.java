package ma5;

/* loaded from: classes15.dex */
public class k extends androidx.appcompat.app.b implements androidx.appcompat.widget.h {

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f325253a;

    /* renamed from: b, reason: collision with root package name */
    public android.content.Context f325254b;

    /* renamed from: c, reason: collision with root package name */
    public final android.app.Activity f325255c;

    /* renamed from: d, reason: collision with root package name */
    public androidx.appcompat.widget.ActionBarContainer f325256d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.appcompat.widget.x0 f325257e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.appcompat.widget.ActionBarContextView f325258f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f325259g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f325260h;

    /* renamed from: i, reason: collision with root package name */
    public ma5.j f325261i;

    /* renamed from: j, reason: collision with root package name */
    public n.b f325262j;

    /* renamed from: k, reason: collision with root package name */
    public n.a f325263k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f325264l;

    /* renamed from: p, reason: collision with root package name */
    public boolean f325268p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f325269q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f325270r;

    /* renamed from: t, reason: collision with root package name */
    public n.l f325272t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f325273u;

    /* renamed from: y, reason: collision with root package name */
    public static final android.view.animation.Interpolator f325251y = new android.view.animation.AccelerateInterpolator();

    /* renamed from: z, reason: collision with root package name */
    public static final android.view.animation.Interpolator f325252z = new android.view.animation.DecelerateInterpolator();
    public static final boolean A = true;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f325265m = new java.util.ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public int f325266n = 0;

    /* renamed from: o, reason: collision with root package name */
    public boolean f325267o = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f325271s = true;

    /* renamed from: v, reason: collision with root package name */
    public final n3.c2 f325274v = new ma5.g(this);

    /* renamed from: w, reason: collision with root package name */
    public final n3.c2 f325275w = new ma5.h(this);

    /* renamed from: x, reason: collision with root package name */
    public final n3.e2 f325276x = new ma5.i(this);

    public k(android.app.Activity activity, android.view.ViewGroup viewGroup, android.view.View view) {
        androidx.appcompat.widget.x0 wrapper;
        this.f325255c = activity;
        java.lang.Object findViewById = viewGroup.findViewById(com.tencent.mm.R.id.f482432ef);
        if (findViewById instanceof androidx.appcompat.widget.x0) {
            wrapper = (androidx.appcompat.widget.x0) findViewById;
        } else {
            if (!(findViewById instanceof androidx.appcompat.widget.Toolbar)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Can't make a decor toolbar out of ");
                sb6.append(findViewById);
                throw new java.lang.IllegalStateException(sb6.toString() != null ? findViewById.getClass().getSimpleName() : "null");
            }
            wrapper = ((androidx.appcompat.widget.Toolbar) findViewById).getWrapper();
        }
        this.f325257e = wrapper;
        this.f325258f = (androidx.appcompat.widget.ActionBarContextView) viewGroup.findViewById(com.tencent.mm.R.id.f482459f3);
        androidx.appcompat.widget.ActionBarContainer actionBarContainer = (androidx.appcompat.widget.ActionBarContainer) viewGroup.findViewById(com.tencent.mm.R.id.f482435ei);
        this.f325256d = actionBarContainer;
        androidx.appcompat.widget.x0 x0Var = this.f325257e;
        if (x0Var == null || this.f325258f == null || actionBarContainer == null) {
            throw new java.lang.IllegalStateException(ma5.k.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        android.content.Context a17 = ((androidx.appcompat.widget.z2) x0Var).a();
        this.f325253a = a17;
        if ((((androidx.appcompat.widget.z2) this.f325257e).f9748b & 4) != 0) {
            this.f325260h = true;
        }
        int i17 = a17.getApplicationInfo().targetSdkVersion;
        this.f325257e.getClass();
        android.content.res.TypedArray obtainStyledAttributes = this.f325253a.obtainStyledAttributes(null, j.a.f296173a, com.tencent.mm.R.attr.f478064o, 0);
        obtainStyledAttributes.getBoolean(14, false);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            G(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
        this.f325259g = view;
    }

    @Override // androidx.appcompat.app.b
    public void A(boolean z17) {
        if (this.f325260h) {
            return;
        }
        B(z17);
    }

    @Override // androidx.appcompat.app.b
    public void B(boolean z17) {
        O(z17 ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.b
    public void C(int i17) {
        if ((i17 & 4) != 0) {
            this.f325260h = true;
        }
        ((androidx.appcompat.widget.z2) this.f325257e).d(i17);
    }

    @Override // androidx.appcompat.app.b
    public void D(boolean z17) {
        O(z17 ? 16 : 0, 16);
    }

    @Override // androidx.appcompat.app.b
    public void E(boolean z17) {
        O(z17 ? 2 : 0, 2);
    }

    @Override // androidx.appcompat.app.b
    public void F(boolean z17) {
        O(z17 ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.app.b
    public void G(float f17) {
        androidx.appcompat.widget.ActionBarContainer actionBarContainer = this.f325256d;
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.a1.s(actionBarContainer, f17);
    }

    @Override // androidx.appcompat.app.b
    public void H(int i17) {
        ((androidx.appcompat.widget.z2) this.f325257e).e(i17);
    }

    @Override // androidx.appcompat.app.b
    public void I(android.graphics.drawable.Drawable drawable) {
        androidx.appcompat.widget.z2 z2Var = (androidx.appcompat.widget.z2) this.f325257e;
        z2Var.f9752f = drawable;
        z2Var.h();
    }

    @Override // androidx.appcompat.app.b
    public void J(boolean z17) {
        n.l lVar;
        this.f325273u = z17;
        if (z17 || (lVar = this.f325272t) == null) {
            return;
        }
        lVar.a();
    }

    @Override // androidx.appcompat.app.b
    public void K(java.lang.CharSequence charSequence) {
        androidx.appcompat.widget.z2 z2Var = (androidx.appcompat.widget.z2) this.f325257e;
        if (z2Var.f9754h) {
            return;
        }
        z2Var.f9755i = charSequence;
        if ((z2Var.f9748b & 8) != 0) {
            z2Var.f9747a.setTitle(charSequence);
        }
    }

    @Override // androidx.appcompat.app.b
    public void L() {
        if (this.f325268p) {
            this.f325268p = false;
            P(false);
        }
    }

    @Override // androidx.appcompat.app.b
    public n.b M(n.a aVar) {
        ma5.j jVar = this.f325261i;
        if (jVar != null) {
            jVar.a();
        }
        androidx.appcompat.widget.ActionBarContextView actionBarContextView = this.f325258f;
        actionBarContextView.removeAllViews();
        actionBarContextView.f9307r = null;
        actionBarContextView.f9513f = null;
        ma5.j jVar2 = new ma5.j(this, this.f325258f.getContext(), aVar);
        o.r rVar = jVar2.f325247g;
        rVar.z();
        try {
            if (!jVar2.f325248h.a(jVar2, rVar)) {
                return null;
            }
            jVar2.i();
            this.f325258f.f(jVar2);
            N(true);
            this.f325258f.sendAccessibilityEvent(32);
            this.f325261i = jVar2;
            return jVar2;
        } finally {
            rVar.y();
        }
    }

    public void N(boolean z17) {
        n3.z1 g17;
        n3.z1 e17;
        if (z17) {
            if (!this.f325270r) {
                this.f325270r = true;
                P(false);
            }
        } else if (this.f325270r) {
            this.f325270r = false;
            P(false);
        }
        if (z17) {
            e17 = ((androidx.appcompat.widget.z2) this.f325257e).g(8, 100L);
            g17 = this.f325258f.e(0, 200L);
        } else {
            g17 = ((androidx.appcompat.widget.z2) this.f325257e).g(0, 200L);
            e17 = this.f325258f.e(8, 100L);
        }
        n.l lVar = new n.l();
        lVar.c(e17, g17);
        lVar.d();
    }

    public void O(int i17, int i18) {
        androidx.appcompat.widget.x0 x0Var = this.f325257e;
        int i19 = ((androidx.appcompat.widget.z2) x0Var).f9748b;
        if ((i18 & 4) != 0) {
            this.f325260h = true;
        }
        ((androidx.appcompat.widget.z2) x0Var).d((i17 & i18) | ((~i18) & i19));
    }

    public final void P(boolean z17) {
        boolean z18 = this.f325270r || !(this.f325268p || this.f325269q);
        n3.e2 e2Var = this.f325276x;
        android.view.View view = this.f325259g;
        boolean z19 = A;
        if (!z18) {
            if (this.f325271s) {
                this.f325271s = false;
                n.l lVar = this.f325272t;
                if (lVar != null) {
                    lVar.a();
                }
                int i17 = this.f325266n;
                n3.c2 c2Var = this.f325274v;
                if (i17 != 0 || !z19 || (!this.f325273u && !z17)) {
                    ((ma5.g) c2Var).b(null);
                    return;
                }
                n3.l1.m(this.f325256d, 1.0f);
                this.f325256d.setTransitioning(true);
                n.l lVar2 = new n.l();
                float f17 = -this.f325256d.getHeight();
                if (z17) {
                    this.f325256d.getLocationInWindow(new int[]{0, 0});
                    f17 -= r13[1];
                }
                n3.z1 a17 = n3.l1.a(this.f325256d);
                a17.g(f17);
                a17.e(e2Var);
                lVar2.b(a17);
                if (this.f325267o && view != null) {
                    n3.z1 a18 = n3.l1.a(view);
                    a18.g(f17);
                    lVar2.b(a18);
                }
                android.view.animation.Interpolator interpolator = f325251y;
                boolean z27 = lVar2.f333421e;
                if (!z27) {
                    lVar2.f333419c = interpolator;
                }
                if (!z27) {
                    lVar2.f333418b = 250L;
                }
                if (!z27) {
                    lVar2.f333420d = c2Var;
                }
                this.f325272t = lVar2;
                lVar2.d();
                return;
            }
            return;
        }
        if (this.f325271s) {
            return;
        }
        this.f325271s = true;
        n.l lVar3 = this.f325272t;
        if (lVar3 != null) {
            lVar3.a();
        }
        this.f325256d.setVisibility(0);
        int i18 = this.f325266n;
        n3.c2 c2Var2 = this.f325275w;
        if (i18 != 0 || !z19 || (!this.f325273u && !z17)) {
            n3.l1.m(this.f325256d, 1.0f);
            this.f325256d.setTranslationY(0.0f);
            if (this.f325267o && view != null) {
                view.setTranslationY(0.0f);
            }
            ((ma5.h) c2Var2).b(null);
            return;
        }
        androidx.appcompat.widget.ActionBarContainer actionBarContainer = this.f325256d;
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        actionBarContainer.setTranslationY(0.0f);
        float f18 = -this.f325256d.getHeight();
        if (z17) {
            this.f325256d.getLocationInWindow(new int[]{0, 0});
            f18 -= r13[1];
        }
        this.f325256d.setTranslationY(f18);
        n.l lVar4 = new n.l();
        n3.z1 a19 = n3.l1.a(this.f325256d);
        a19.g(0.0f);
        a19.e(e2Var);
        lVar4.b(a19);
        if (this.f325267o && view != null) {
            view.setTranslationY(f18);
            n3.z1 a27 = n3.l1.a(view);
            a27.g(0.0f);
            lVar4.b(a27);
        }
        android.view.animation.Interpolator interpolator2 = f325252z;
        boolean z28 = lVar4.f333421e;
        if (!z28) {
            lVar4.f333419c = interpolator2;
        }
        if (!z28) {
            lVar4.f333418b = 250L;
        }
        if (!z28) {
            lVar4.f333420d = c2Var2;
        }
        this.f325272t = lVar4;
        lVar4.d();
    }

    @Override // androidx.appcompat.widget.h
    public void a() {
        if (this.f325269q) {
            this.f325269q = false;
            P(true);
        }
    }

    @Override // androidx.appcompat.widget.h
    public void b() {
    }

    @Override // androidx.appcompat.widget.h
    public void c() {
        if (this.f325269q) {
            return;
        }
        this.f325269q = true;
        P(true);
    }

    @Override // androidx.appcompat.widget.h
    public void d() {
        n.l lVar = this.f325272t;
        if (lVar != null) {
            lVar.a();
            this.f325272t = null;
        }
    }

    @Override // androidx.appcompat.widget.h
    public void e(int i17) {
        this.f325266n = i17;
    }

    @Override // androidx.appcompat.widget.h
    public void f(boolean z17) {
        this.f325267o = z17;
    }

    @Override // androidx.appcompat.app.b
    public boolean h() {
        androidx.appcompat.widget.x0 x0Var = this.f325257e;
        if (x0Var != null) {
            androidx.appcompat.widget.u2 u2Var = ((androidx.appcompat.widget.z2) x0Var).f9747a.R;
            if ((u2Var == null || u2Var.f9729e == null) ? false : true) {
                androidx.appcompat.widget.u2 u2Var2 = ((androidx.appcompat.widget.z2) x0Var).f9747a.R;
                o.u uVar = u2Var2 == null ? null : u2Var2.f9729e;
                if (uVar != null) {
                    uVar.collapseActionView();
                }
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.app.b
    public void i(boolean z17) {
        if (z17 == this.f325264l) {
            return;
        }
        this.f325264l = z17;
        java.util.ArrayList arrayList = this.f325265m;
        if (arrayList.size() <= 0) {
            return;
        }
        android.support.v4.media.f.a(arrayList.get(0));
        throw null;
    }

    @Override // androidx.appcompat.app.b
    public android.view.View j() {
        return ((androidx.appcompat.widget.z2) this.f325257e).f9750d;
    }

    @Override // androidx.appcompat.app.b
    public int k() {
        return ((androidx.appcompat.widget.z2) this.f325257e).f9748b;
    }

    @Override // androidx.appcompat.app.b
    public int l() {
        return this.f325256d.getHeight();
    }

    @Override // androidx.appcompat.app.b
    public android.content.Context m() {
        if (this.f325254b == null) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            this.f325253a.getTheme().resolveAttribute(com.tencent.mm.R.attr.f478069t, typedValue, true);
            int i17 = typedValue.resourceId;
            if (i17 != 0) {
                this.f325254b = new android.view.ContextThemeWrapper(this.f325253a, i17);
            } else {
                this.f325254b = this.f325253a;
            }
        }
        return this.f325254b;
    }

    @Override // androidx.appcompat.app.b
    public java.lang.CharSequence n() {
        return ((androidx.appcompat.widget.z2) this.f325257e).f9747a.getTitle();
    }

    @Override // androidx.appcompat.app.b
    public void o() {
        if (this.f325268p) {
            return;
        }
        this.f325268p = true;
        P(false);
    }

    @Override // androidx.appcompat.app.b
    public boolean q() {
        int l17 = l();
        return this.f325271s && (l17 == 0 || l17 > 0);
    }

    @Override // androidx.appcompat.app.b
    public void r(android.content.res.Configuration configuration) {
        android.view.ViewGroup.LayoutParams layoutParams = ((androidx.appcompat.widget.z2) this.f325257e).f9747a.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = fp.a.c(this.f325255c);
        }
        ((androidx.appcompat.widget.z2) this.f325257e).f9747a.setLayoutParams(layoutParams);
    }

    @Override // androidx.appcompat.app.b
    public void w(android.graphics.drawable.Drawable drawable) {
        this.f325256d.setPrimaryBackground(drawable);
    }

    @Override // androidx.appcompat.app.b
    public void x(int i17) {
        y(android.view.LayoutInflater.from(m()).inflate(i17, (android.view.ViewGroup) ((androidx.appcompat.widget.z2) this.f325257e).f9747a, false));
    }

    @Override // androidx.appcompat.app.b
    public void y(android.view.View view) {
        ((androidx.appcompat.widget.z2) this.f325257e).c(view);
    }

    @Override // androidx.appcompat.app.b
    public void z(android.view.View view, androidx.appcompat.app.ActionBar$LayoutParams actionBar$LayoutParams) {
        view.setLayoutParams(actionBar$LayoutParams);
        ((androidx.appcompat.widget.z2) this.f325257e).c(view);
    }
}
