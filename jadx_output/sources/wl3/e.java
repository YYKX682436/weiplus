package wl3;

/* loaded from: classes10.dex */
public final class e implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f447056d;

    /* renamed from: e, reason: collision with root package name */
    public android.app.Dialog f447057e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f447058f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f447059g;

    /* renamed from: h, reason: collision with root package name */
    public int f447060h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f447061i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.ViewTreeObserver f447062m;

    /* renamed from: n, reason: collision with root package name */
    public com.google.android.material.bottomsheet.BottomSheetBehavior f447063n;

    public e(android.content.Context context, boolean z17) {
        this.f447056d = context;
        if (context instanceof android.app.Activity) {
            android.view.View decorView = ((android.app.Activity) context).getWindow().getDecorView();
            kotlin.jvm.internal.o.e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
            this.f447061i = ((android.view.ViewGroup) decorView).findViewById(com.tencent.mm.R.id.cgi);
        }
        kotlin.jvm.internal.o.d(context);
        this.f447057e = new y9.i(context, com.tencent.mm.R.style.f30do);
        this.f447058f = android.view.View.inflate(context, com.tencent.mm.R.layout.c4d, null);
        this.f447059g = a();
        android.view.View view = this.f447058f;
        if (view != null) {
            android.app.Dialog dialog = this.f447057e;
            kotlin.jvm.internal.o.d(dialog);
            dialog.setContentView(view);
            java.lang.Object parent = view.getParent();
            kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.View");
            com.google.android.material.bottomsheet.BottomSheetBehavior A = com.google.android.material.bottomsheet.BottomSheetBehavior.A((android.view.View) parent);
            this.f447063n = A;
            if (A != null) {
                A.D(3);
            }
            com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = this.f447063n;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.f44453z = new wl3.c();
            }
            android.app.Dialog dialog2 = this.f447057e;
            kotlin.jvm.internal.o.d(dialog2);
            dialog2.setOnDismissListener(new wl3.d(this));
        }
    }

    public final boolean a() {
        android.content.Context context = this.f447056d;
        kotlin.jvm.internal.o.d(context);
        return context.getResources().getConfiguration().orientation == 2;
    }

    public final boolean b() {
        android.app.Dialog dialog = this.f447057e;
        if (dialog != null) {
            kotlin.jvm.internal.o.d(dialog);
            if (dialog.isShowing()) {
                return true;
            }
        }
        return false;
    }

    public final void c() {
        android.app.Dialog dialog = this.f447057e;
        if (dialog != null) {
            android.content.Context context = this.f447056d;
            if (!(context instanceof android.app.Activity)) {
                kotlin.jvm.internal.o.d(dialog);
                dialog.dismiss();
            } else if (context != null && !((android.app.Activity) context).isFinishing() && !((android.app.Activity) context).isDestroyed()) {
                android.app.Dialog dialog2 = this.f447057e;
                kotlin.jvm.internal.o.d(dialog2);
                dialog2.dismiss();
            }
            com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = this.f447063n;
            if (bottomSheetBehavior != null) {
                kotlin.jvm.internal.o.d(bottomSheetBehavior);
                bottomSheetBehavior.f44443p = true;
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (b()) {
            android.view.View view = this.f447061i;
            if (view == null || !(view.isShown() || view.getVisibility() == 0)) {
                c();
                return;
            }
            if (b()) {
                if (this.f447059g == a()) {
                    int i17 = this.f447060h;
                    android.content.Context context = this.f447056d;
                    if (i17 == (context instanceof android.app.Activity ? ((android.app.Activity) context).getWindow().getWindowManager().getDefaultDisplay().getRotation() : 0)) {
                        return;
                    }
                }
                c();
            }
        }
    }
}
