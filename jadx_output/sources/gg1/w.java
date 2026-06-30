package gg1;

/* loaded from: classes7.dex */
public final class w implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final fg1.u f271634d;

    /* renamed from: e, reason: collision with root package name */
    public final gg1.k1 f271635e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f271636f;

    /* renamed from: g, reason: collision with root package name */
    public android.app.Dialog f271637g;

    /* renamed from: h, reason: collision with root package name */
    public final android.content.Context f271638h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f271639i;

    /* renamed from: m, reason: collision with root package name */
    public gg1.p f271640m;

    /* renamed from: n, reason: collision with root package name */
    public int f271641n;

    /* renamed from: o, reason: collision with root package name */
    public com.google.android.material.bottomsheet.BottomSheetBehavior f271642o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f271643p;

    /* renamed from: q, reason: collision with root package name */
    public int f271644q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.View f271645r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.ViewTreeObserver f271646s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f271647t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f271648u;

    /* renamed from: v, reason: collision with root package name */
    public yz5.p f271649v;

    /* renamed from: w, reason: collision with root package name */
    public yz5.l f271650w;

    /* renamed from: x, reason: collision with root package name */
    public yz5.a f271651x;

    /* renamed from: y, reason: collision with root package name */
    public final gg1.q f271652y;

    public w(android.content.Context context, boolean z17, fg1.u videoCastHandler, gg1.k1 videoCastDeviceManager, boolean z18, int i17, kotlin.jvm.internal.i iVar) {
        int i18;
        int e17;
        boolean z19 = (i17 & 2) != 0 ? true : z17;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(videoCastHandler, "videoCastHandler");
        kotlin.jvm.internal.o.g(videoCastDeviceManager, "videoCastDeviceManager");
        this.f271634d = videoCastHandler;
        this.f271635e = videoCastDeviceManager;
        this.f271636f = z18;
        this.f271638h = context;
        this.f271647t = true;
        this.f271648u = z19;
        this.f271650w = gg1.v.f271632d;
        gg1.q qVar = new gg1.q(this);
        this.f271652y = qVar;
        if (context instanceof android.app.Activity) {
            android.view.View decorView = ((android.app.Activity) context).getWindow().getDecorView();
            kotlin.jvm.internal.o.e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
            this.f271645r = ((android.view.ViewGroup) decorView).findViewById(android.R.id.content);
        }
        this.f271637g = z19 ? new com.tencent.mm.ui.widget.dialog.c(context) : new y9.i(context, 0);
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.bpl, null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f271639i = inflate;
        zk1.j jVar = zk1.m.f473414l;
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.oqh);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        jVar.a(findViewById, (r27 & 2) != 0 ? null : null, (r27 & 4) != 0 ? null : null, (r27 & 8) != 0 ? false : false, (r27 & 16) != 0 ? null : java.lang.Boolean.TRUE, (r27 & 32) != 0 ? null : null, (r27 & 64) != 0 ? null : null, (r27 & 128) != 0 ? null : null, (r27 & 256) != 0 ? null : null, (r27 & 512) != 0 ? null : null, (r27 & 1024) != 0 ? null : null, (r27 & 2048) != 0 ? null : null, (r27 & 4096) == 0 ? null : null);
        android.view.View view = this.f271639i;
        if (view == null) {
            kotlin.jvm.internal.o.o("rootView");
            throw null;
        }
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.ong);
        findViewById2.setOnClickListener(new gg1.r(this));
        jVar.a(findViewById2, (r27 & 2) != 0 ? null : android.widget.Button.class, (r27 & 4) != 0 ? null : java.lang.Integer.valueOf(com.tencent.mm.R.string.aws), (r27 & 8) != 0 ? false : false, (r27 & 16) != 0 ? null : null, (r27 & 32) != 0 ? null : null, (r27 & 64) != 0 ? null : null, (r27 & 128) != 0 ? null : null, (r27 & 256) != 0 ? null : null, (r27 & 512) != 0 ? null : null, (r27 & 1024) != 0 ? null : null, (r27 & 2048) != 0 ? null : null, (r27 & 4096) == 0 ? null : null);
        android.view.View view2 = this.f271639i;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("rootView");
            throw null;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) view2.findViewById(com.tencent.mm.R.id.avc);
        recyclerView.setHasFixedSize(true);
        android.view.View view3 = this.f271639i;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("rootView");
            throw null;
        }
        android.view.View findViewById3 = view3.findViewById(com.tencent.mm.R.id.hkt);
        findViewById3.setOnClickListener(new gg1.s(this));
        jVar.a(findViewById3, (r27 & 2) != 0 ? null : android.widget.Button.class, (r27 & 4) != 0 ? null : java.lang.Integer.valueOf(com.tencent.mm.R.string.f490336s5), (r27 & 8) != 0 ? false : false, (r27 & 16) != 0 ? null : null, (r27 & 32) != 0 ? null : null, (r27 & 64) != 0 ? null : null, (r27 & 128) != 0 ? null : null, (r27 & 256) != 0 ? null : null, (r27 & 512) != 0 ? null : null, (r27 & 1024) != 0 ? null : null, (r27 & 2048) != 0 ? null : null, (r27 & 4096) == 0 ? null : null);
        android.view.View view4 = this.f271639i;
        if (view4 == null) {
            kotlin.jvm.internal.o.o("rootView");
            throw null;
        }
        android.widget.ImageView imageView = (android.widget.ImageView) view4.findViewById(com.tencent.mm.R.id.hks);
        nf.y yVar = nf.x.f336616b;
        if (yVar != null ? yVar.isDarkMode() : false) {
            imageView.setImageDrawable(b3.l.getDrawable(context, com.tencent.mm.R.drawable.buc));
        } else {
            imageView.setImageDrawable(b3.l.getDrawable(context, com.tencent.mm.R.drawable.bu9));
        }
        this.f271643p = c();
        int e18 = com.tencent.mm.ui.zk.e(context, com.tencent.mm.R.dimen.f480144pj);
        if (this.f271643p) {
            i18 = (int) (e18 * 4.5d);
            e17 = com.tencent.mm.ui.zk.e(context, com.tencent.mm.R.dimen.f480137pc);
        } else {
            i18 = (int) (e18 * 6.5d);
            e17 = com.tencent.mm.ui.zk.e(context, com.tencent.mm.R.dimen.f480137pc);
        }
        this.f271641n = i18 + e17;
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
        recyclerView.setFocusable(false);
        gg1.p pVar = new gg1.p(this);
        this.f271640m = pVar;
        recyclerView.setAdapter(pVar);
        recyclerView.setOverScrollMode(1);
        android.app.Dialog dialog = this.f271637g;
        if (dialog == null) {
            kotlin.jvm.internal.o.o("mBottomSheetDialog");
            throw null;
        }
        android.view.View view5 = this.f271639i;
        if (view5 == null) {
            kotlin.jvm.internal.o.o("rootView");
            throw null;
        }
        dialog.setContentView(view5);
        if (!z19) {
            android.view.View view6 = this.f271639i;
            if (view6 == null) {
                kotlin.jvm.internal.o.o("rootView");
                throw null;
            }
            java.lang.Object parent = view6.getParent();
            kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.View");
            com.google.android.material.bottomsheet.BottomSheetBehavior A = com.google.android.material.bottomsheet.BottomSheetBehavior.A((android.view.View) parent);
            this.f271642o = A;
            kotlin.jvm.internal.o.d(A);
            A.C(this.f271641n);
        }
        android.app.Dialog dialog2 = this.f271637g;
        if (dialog2 == null) {
            kotlin.jvm.internal.o.o("mBottomSheetDialog");
            throw null;
        }
        dialog2.setOnCancelListener(new gg1.t(this));
        android.app.Dialog dialog3 = this.f271637g;
        if (dialog3 == null) {
            kotlin.jvm.internal.o.o("mBottomSheetDialog");
            throw null;
        }
        dialog3.setOnDismissListener(new gg1.u(this));
        android.app.Dialog dialog4 = this.f271637g;
        if (dialog4 == null) {
            kotlin.jvm.internal.o.o("mBottomSheetDialog");
            throw null;
        }
        dialog4.setCancelable(false);
        com.tencent.mm.plugin.appbrand.AppBrandRuntime a17 = videoCastHandler.a();
        if (a17 != null) {
            a17.P(4, -1, qVar);
        }
    }

    public static final boolean a(gg1.w wVar) {
        return !wVar.f271635e.f271592e.isEmpty();
    }

    public final int b() {
        android.content.Context context = this.f271638h;
        if (!(context instanceof android.app.Activity)) {
            return 0;
        }
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        return ((android.app.Activity) context).getWindow().getWindowManager().getDefaultDisplay().getRotation();
    }

    public final boolean c() {
        android.content.Context context = this.f271638h;
        kotlin.jvm.internal.o.d(context);
        return context.getResources().getConfiguration().orientation == 2;
    }

    public final boolean d() {
        android.app.Dialog dialog = this.f271637g;
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

    public final void e() {
        if (this.f271637g != null) {
            com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = this.f271642o;
            if (bottomSheetBehavior != null) {
                kotlin.jvm.internal.o.d(bottomSheetBehavior);
                bottomSheetBehavior.f44443p = true;
            }
            android.content.Context context = this.f271638h;
            if (context != null) {
                kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                if (!((android.app.Activity) context).isFinishing()) {
                    android.app.Dialog dialog = this.f271637g;
                    if (dialog == null) {
                        kotlin.jvm.internal.o.o("mBottomSheetDialog");
                        throw null;
                    }
                    dialog.dismiss();
                }
            }
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntime a17 = this.f271634d.a();
        if (a17 != null) {
            a17.B1(this.f271652y);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (d()) {
            android.view.View view = this.f271645r;
            if (view == null || !(view.isShown() || view.getVisibility() == 0)) {
                e();
            } else if (d()) {
                if (this.f271643p == c() && this.f271644q == b()) {
                    return;
                }
                e();
            }
        }
    }
}
