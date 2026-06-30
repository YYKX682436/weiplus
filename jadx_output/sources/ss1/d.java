package ss1;

/* loaded from: classes8.dex */
public final class d implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f411885d;

    /* renamed from: e, reason: collision with root package name */
    public android.app.Dialog f411886e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f411887f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f411888g;

    /* renamed from: h, reason: collision with root package name */
    public int f411889h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f411890i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.ViewTreeObserver f411891m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f411892n;

    /* renamed from: o, reason: collision with root package name */
    public com.google.android.material.bottomsheet.BottomSheetBehavior f411893o;

    /* renamed from: p, reason: collision with root package name */
    public rv.m3 f411894p;

    /* renamed from: q, reason: collision with root package name */
    public final int f411895q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f411896r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.ViewGroup f411897s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.ViewGroup f411898t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f411899u;

    public d(android.content.Context context, int i17, int i18, kotlin.jvm.internal.i iVar) {
        i17 = (i18 & 2) != 0 ? 0 : i17;
        this.f411885d = context;
        if (context instanceof android.app.Activity) {
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            android.view.View decorView = ((android.app.Activity) context).getWindow().getDecorView();
            kotlin.jvm.internal.o.e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
            this.f411890i = ((android.view.ViewGroup) decorView).findViewById(android.R.id.content);
        }
        this.f411895q = i17;
        if (context == null) {
            com.tencent.mars.xlog.Log.w("BizBottomSheet", "initView context is null");
            return;
        }
        this.f411886e = new y9.i(context, com.tencent.mm.R.style.f30do);
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.dzq, null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f411887f = inflate;
        this.f411897s = (android.view.ViewGroup) a().findViewById(com.tencent.mm.R.id.f483444av5);
        this.f411898t = (android.view.ViewGroup) a().findViewById(com.tencent.mm.R.id.gxy);
        this.f411899u = a().findViewById(com.tencent.mm.R.id.f485216gy1);
        this.f411888g = c();
        android.app.Dialog dialog = this.f411886e;
        kotlin.jvm.internal.o.d(dialog);
        dialog.requestWindowFeature(1);
        android.app.Dialog dialog2 = this.f411886e;
        kotlin.jvm.internal.o.d(dialog2);
        dialog2.setContentView(a());
        java.lang.Object parent = a().getParent();
        kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.View");
        this.f411893o = com.google.android.material.bottomsheet.BottomSheetBehavior.A((android.view.View) parent);
        e();
        android.app.Dialog dialog3 = this.f411886e;
        kotlin.jvm.internal.o.d(dialog3);
        dialog3.setOnDismissListener(new ss1.b(this));
    }

    public final android.view.View a() {
        android.view.View view = this.f411887f;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.o.o("rootView");
        throw null;
    }

    public final int b() {
        android.content.Context context = this.f411885d;
        if (!(context instanceof android.app.Activity)) {
            return 0;
        }
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        return ((android.app.Activity) context).getWindow().getWindowManager().getDefaultDisplay().getRotation();
    }

    public final boolean c() {
        android.content.Context context = this.f411885d;
        kotlin.jvm.internal.o.d(context);
        return context.getResources().getConfiguration().orientation == 2;
    }

    public final boolean d() {
        android.app.Dialog dialog = this.f411886e;
        if (dialog == null) {
            return false;
        }
        kotlin.jvm.internal.o.d(dialog);
        return dialog.isShowing();
    }

    public final void e() {
        com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = this.f411893o;
        if (bottomSheetBehavior != null) {
            int i17 = this.f411895q;
            if (i17 > 0) {
                kotlin.jvm.internal.o.d(bottomSheetBehavior);
                bottomSheetBehavior.D(4);
                com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior2 = this.f411893o;
                kotlin.jvm.internal.o.d(bottomSheetBehavior2);
                bottomSheetBehavior2.C(i17);
                return;
            }
            kotlin.jvm.internal.o.d(bottomSheetBehavior);
            bottomSheetBehavior.D(3);
            com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior3 = this.f411893o;
            kotlin.jvm.internal.o.d(bottomSheetBehavior3);
            bottomSheetBehavior3.f44444q = true;
            com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior4 = this.f411893o;
            kotlin.jvm.internal.o.d(bottomSheetBehavior4);
            bottomSheetBehavior4.f44443p = true;
        }
    }

    public final void f() {
        android.app.Dialog dialog = this.f411886e;
        if (dialog != null) {
            android.content.Context context = this.f411885d;
            if (!(context instanceof android.app.Activity)) {
                kotlin.jvm.internal.o.d(dialog);
                dialog.dismiss();
            } else if (context != null) {
                kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                if (!((android.app.Activity) context).isFinishing()) {
                    kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                    if (!((android.app.Activity) context).isDestroyed()) {
                        android.app.Dialog dialog2 = this.f411886e;
                        kotlin.jvm.internal.o.d(dialog2);
                        dialog2.dismiss();
                    }
                }
            }
            com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = this.f411893o;
            if (bottomSheetBehavior != null) {
                kotlin.jvm.internal.o.d(bottomSheetBehavior);
                bottomSheetBehavior.f44443p = true;
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (d()) {
            android.view.View view = this.f411890i;
            if (view == null || !(view.isShown() || view.getVisibility() == 0)) {
                f();
            } else if (d()) {
                if (this.f411888g == c() && this.f411889h == b()) {
                    return;
                }
                f();
            }
        }
    }
}
