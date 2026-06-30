package uf;

/* loaded from: classes7.dex */
public final class c2 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.AppBrandRuntime f426994d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f426995e;

    /* renamed from: f, reason: collision with root package name */
    public final uf.c1 f426996f;

    /* renamed from: g, reason: collision with root package name */
    public android.app.Dialog f426997g;

    /* renamed from: h, reason: collision with root package name */
    public final android.content.Context f426998h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f426999i;

    /* renamed from: m, reason: collision with root package name */
    public uf.v1 f427000m;

    /* renamed from: n, reason: collision with root package name */
    public int f427001n;

    /* renamed from: o, reason: collision with root package name */
    public com.google.android.material.bottomsheet.BottomSheetBehavior f427002o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f427003p;

    /* renamed from: q, reason: collision with root package name */
    public int f427004q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.View f427005r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.ViewTreeObserver f427006s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f427007t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f427008u;

    /* renamed from: v, reason: collision with root package name */
    public yz5.a f427009v;

    /* renamed from: w, reason: collision with root package name */
    public yz5.p f427010w;

    /* renamed from: x, reason: collision with root package name */
    public yz5.l f427011x;

    /* renamed from: y, reason: collision with root package name */
    public final uf.w1 f427012y;

    public c2(android.content.Context context, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, boolean z17, boolean z18, uf.c1 deviceManager, int i17, kotlin.jvm.internal.i iVar) {
        android.app.Dialog iVar2;
        int i18;
        int e17;
        boolean z19 = (i17 & 4) != 0 ? true : z17;
        kotlin.jvm.internal.o.g(deviceManager, "deviceManager");
        this.f426994d = appBrandRuntime;
        this.f426995e = z18;
        this.f426996f = deviceManager;
        this.f426998h = context;
        this.f427007t = true;
        this.f427008u = z19;
        this.f427011x = uf.b2.f426979d;
        uf.w1 w1Var = new uf.w1(this);
        this.f427012y = w1Var;
        if (context instanceof android.app.Activity) {
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            android.view.View decorView = ((android.app.Activity) context).getWindow().getDecorView();
            kotlin.jvm.internal.o.e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
            this.f427005r = ((android.view.ViewGroup) decorView).findViewById(android.R.id.content);
        }
        if (z19) {
            kotlin.jvm.internal.o.d(context);
            iVar2 = new com.tencent.mm.ui.widget.dialog.c(context);
        } else {
            kotlin.jvm.internal.o.d(context);
            iVar2 = new y9.i(context, 0);
        }
        this.f426997g = iVar2;
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.bpl, null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f426999i = inflate;
        zk1.j jVar = zk1.m.f473414l;
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.oqh);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        jVar.a(findViewById, (r27 & 2) != 0 ? null : null, (r27 & 4) != 0 ? null : null, (r27 & 8) != 0 ? false : false, (r27 & 16) != 0 ? null : java.lang.Boolean.TRUE, (r27 & 32) != 0 ? null : null, (r27 & 64) != 0 ? null : null, (r27 & 128) != 0 ? null : null, (r27 & 256) != 0 ? null : null, (r27 & 512) != 0 ? null : null, (r27 & 1024) != 0 ? null : null, (r27 & 2048) != 0 ? null : null, (r27 & 4096) == 0 ? null : null);
        android.view.View view = this.f426999i;
        if (view == null) {
            kotlin.jvm.internal.o.o("rootView");
            throw null;
        }
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.ong);
        findViewById2.setOnClickListener(new uf.x1(this, context));
        jVar.a(findViewById2, (r27 & 2) != 0 ? null : android.widget.Button.class, (r27 & 4) != 0 ? null : java.lang.Integer.valueOf(com.tencent.mm.R.string.aws), (r27 & 8) != 0 ? false : false, (r27 & 16) != 0 ? null : null, (r27 & 32) != 0 ? null : null, (r27 & 64) != 0 ? null : null, (r27 & 128) != 0 ? null : null, (r27 & 256) != 0 ? null : null, (r27 & 512) != 0 ? null : null, (r27 & 1024) != 0 ? null : null, (r27 & 2048) != 0 ? null : null, (r27 & 4096) == 0 ? null : null);
        android.view.View view2 = this.f426999i;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("rootView");
            throw null;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) view2.findViewById(com.tencent.mm.R.id.avc);
        recyclerView.setHasFixedSize(true);
        android.view.View view3 = this.f426999i;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("rootView");
            throw null;
        }
        android.view.View findViewById3 = view3.findViewById(com.tencent.mm.R.id.hkt);
        findViewById3.setOnClickListener(new uf.y1(this));
        jVar.a(findViewById3, (r27 & 2) != 0 ? null : android.widget.Button.class, (r27 & 4) != 0 ? null : java.lang.Integer.valueOf(com.tencent.mm.R.string.f490336s5), (r27 & 8) != 0 ? false : false, (r27 & 16) != 0 ? null : null, (r27 & 32) != 0 ? null : null, (r27 & 64) != 0 ? null : null, (r27 & 128) != 0 ? null : null, (r27 & 256) != 0 ? null : null, (r27 & 512) != 0 ? null : null, (r27 & 1024) != 0 ? null : null, (r27 & 2048) != 0 ? null : null, (r27 & 4096) == 0 ? null : null);
        android.view.View view4 = this.f426999i;
        if (view4 == null) {
            kotlin.jvm.internal.o.o("rootView");
            throw null;
        }
        android.widget.ImageView imageView = (android.widget.ImageView) view4.findViewById(com.tencent.mm.R.id.hks);
        nf.y yVar = nf.x.f336616b;
        if (yVar != null ? yVar.isDarkMode() : false) {
            kotlin.jvm.internal.o.d(context);
            imageView.setImageDrawable(b3.l.getDrawable(context, com.tencent.mm.R.drawable.buc));
        } else {
            kotlin.jvm.internal.o.d(context);
            imageView.setImageDrawable(b3.l.getDrawable(context, com.tencent.mm.R.drawable.bu9));
        }
        this.f427003p = d();
        int e18 = com.tencent.mm.ui.zk.e(context, com.tencent.mm.R.dimen.f480144pj);
        if (this.f427003p) {
            i18 = (int) (e18 * 4.5d);
            e17 = com.tencent.mm.ui.zk.e(context, com.tencent.mm.R.dimen.f480137pc);
        } else {
            i18 = (int) (e18 * 6.5d);
            e17 = com.tencent.mm.ui.zk.e(context, com.tencent.mm.R.dimen.f480137pc);
        }
        this.f427001n = i18 + e17;
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
        recyclerView.setFocusable(false);
        uf.v1 v1Var = new uf.v1(this);
        this.f427000m = v1Var;
        recyclerView.setAdapter(v1Var);
        recyclerView.setOverScrollMode(1);
        android.app.Dialog dialog = this.f426997g;
        if (dialog == null) {
            kotlin.jvm.internal.o.o("mBottomSheetDialog");
            throw null;
        }
        android.view.View view5 = this.f426999i;
        if (view5 == null) {
            kotlin.jvm.internal.o.o("rootView");
            throw null;
        }
        dialog.setContentView(view5);
        if (!z19) {
            android.view.View view6 = this.f426999i;
            if (view6 == null) {
                kotlin.jvm.internal.o.o("rootView");
                throw null;
            }
            java.lang.Object parent = view6.getParent();
            kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.View");
            com.google.android.material.bottomsheet.BottomSheetBehavior A = com.google.android.material.bottomsheet.BottomSheetBehavior.A((android.view.View) parent);
            this.f427002o = A;
            kotlin.jvm.internal.o.d(A);
            A.C(this.f427001n);
        }
        android.app.Dialog dialog2 = this.f426997g;
        if (dialog2 == null) {
            kotlin.jvm.internal.o.o("mBottomSheetDialog");
            throw null;
        }
        dialog2.setOnCancelListener(new uf.z1(this));
        android.app.Dialog dialog3 = this.f426997g;
        if (dialog3 == null) {
            kotlin.jvm.internal.o.o("mBottomSheetDialog");
            throw null;
        }
        dialog3.setOnDismissListener(new uf.a2(this));
        android.app.Dialog dialog4 = this.f426997g;
        if (dialog4 == null) {
            kotlin.jvm.internal.o.o("mBottomSheetDialog");
            throw null;
        }
        dialog4.setCancelable(false);
        if (appBrandRuntime != null) {
            appBrandRuntime.P(4, -1, w1Var);
        }
        deviceManager.f426986e = new uf.q1(this);
    }

    public static final boolean a(uf.c2 c2Var) {
        return !c2Var.f426996f.f426985d.isEmpty();
    }

    public static final void b(uf.c2 c2Var, x91.h hVar, int i17) {
        if (hVar != null) {
            uf.c1 c1Var = c2Var.f426996f;
            c1Var.getClass();
            ((b06.b) c1Var.f426983b).a(c1Var, uf.c1.f426981m[0], hVar);
        }
        yz5.p pVar = c2Var.f427010w;
        if (pVar != null) {
            pVar.invoke(hVar, java.lang.Integer.valueOf(i17));
        }
    }

    public final int c() {
        android.content.Context context = this.f426998h;
        if (!(context instanceof android.app.Activity)) {
            return 0;
        }
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        return ((android.app.Activity) context).getWindow().getWindowManager().getDefaultDisplay().getRotation();
    }

    public final boolean d() {
        android.content.Context context = this.f426998h;
        kotlin.jvm.internal.o.d(context);
        return context.getResources().getConfiguration().orientation == 2;
    }

    public final boolean e() {
        android.app.Dialog dialog = this.f426997g;
        if (dialog != null) {
            if (dialog == null) {
                kotlin.jvm.internal.o.o("mBottomSheetDialog");
                throw null;
            }
            if (dialog.isShowing()) {
                return true;
            }
        }
        return false;
    }

    public final void f() {
        if (this.f426997g != null) {
            com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = this.f427002o;
            if (bottomSheetBehavior != null) {
                kotlin.jvm.internal.o.d(bottomSheetBehavior);
                bottomSheetBehavior.f44443p = true;
            }
            android.content.Context context = this.f426998h;
            if (context != null && (context instanceof android.app.Activity)) {
                kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                if (!((android.app.Activity) context).isFinishing()) {
                    android.app.Dialog dialog = this.f426997g;
                    if (dialog == null) {
                        kotlin.jvm.internal.o.o("mBottomSheetDialog");
                        throw null;
                    }
                    dialog.dismiss();
                }
            }
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = this.f426994d;
        if (appBrandRuntime != null) {
            appBrandRuntime.B1(this.f427012y);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (e()) {
            android.view.View view = this.f427005r;
            if (view == null || !(view.isShown() || view.getVisibility() == 0)) {
                f();
            } else if (e()) {
                if (this.f427003p == d() && this.f427004q == c()) {
                    return;
                }
                f();
            }
        }
    }
}
