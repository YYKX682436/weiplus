package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public class e3 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {
    public android.view.ViewGroup A;
    public android.view.View B;
    public android.view.View C;

    /* renamed from: d, reason: collision with root package name */
    public android.app.Dialog f131957d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f131958e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f131959f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f131960g;

    /* renamed from: h, reason: collision with root package name */
    public int f131961h;

    /* renamed from: i, reason: collision with root package name */
    public int f131962i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f131963m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.ViewTreeObserver f131964n;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f131966p;

    /* renamed from: q, reason: collision with root package name */
    public com.google.android.material.bottomsheet.BottomSheetBehavior f131967q;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.LinearLayout f131969s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f131970t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f131971u;

    /* renamed from: v, reason: collision with root package name */
    public final int f131972v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f131973w;

    /* renamed from: y, reason: collision with root package name */
    public android.view.ViewGroup f131975y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.ViewGroup f131976z;

    /* renamed from: o, reason: collision with root package name */
    public boolean f131965o = false;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.d3 f131968r = null;

    /* renamed from: x, reason: collision with root package name */
    public boolean f131974x = false;
    public final java.util.LinkedList D = new java.util.LinkedList();

    public e3(android.content.Context context) {
        this.f131960g = false;
        this.f131966p = false;
        this.f131958e = context;
        this.f131966p = false;
        if (context instanceof android.app.Activity) {
            this.f131963m = ((android.view.ViewGroup) ((android.app.Activity) context).getWindow().getDecorView()).findViewById(android.R.id.content);
        }
        this.f131972v = 0;
        this.f131957d = new y9.i(context, com.tencent.mm.R.style.f30do);
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.b3b, null);
        this.f131959f = inflate;
        this.f131975y = (android.view.ViewGroup) inflate.findViewById(com.tencent.mm.R.id.f483444av5);
        this.f131976z = (android.view.ViewGroup) this.f131959f.findViewById(com.tencent.mm.R.id.avd);
        this.f131969s = (android.widget.LinearLayout) this.f131959f.findViewById(com.tencent.mm.R.id.f483441av3);
        this.f131970t = this.f131959f.findViewById(com.tencent.mm.R.id.b5t);
        this.f131971u = (android.widget.TextView) this.f131959f.findViewById(com.tencent.mm.R.id.b5u);
        this.A = (android.view.ViewGroup) this.f131959f.findViewById(com.tencent.mm.R.id.gxy);
        this.B = this.f131959f.findViewById(com.tencent.mm.R.id.f485216gy1);
        this.C = this.f131959f.findViewById(com.tencent.mm.R.id.gxz);
        this.f131969s.setOnClickListener(new com.tencent.mm.plugin.finder.view.x2(this));
        this.f131960g = d();
        this.f131957d.requestWindowFeature(1);
        this.f131957d.setContentView(this.f131959f);
        com.google.android.material.bottomsheet.BottomSheetBehavior A = com.google.android.material.bottomsheet.BottomSheetBehavior.A((android.view.View) this.f131959f.getParent());
        this.f131967q = A;
        if (A != null) {
            A.D(3);
        }
        this.f131957d.setOnDismissListener(new com.tencent.mm.plugin.finder.view.y2(this));
    }

    public com.tencent.mm.plugin.finder.view.e3 a() {
        this.A.setVisibility(0);
        this.f131973w = true;
        this.f131974x = true;
        float dimension = this.f131959f.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479727dj);
        float dimension2 = this.f131959f.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479688cn);
        float dimension3 = this.f131959f.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479646bl);
        this.f131967q.f44453z = new com.tencent.mm.plugin.finder.view.z2(this, dimension, dimension3, dimension2);
        return this;
    }

    public void b() {
        this.f131975y.setBackgroundColor(this.f131958e.getResources().getColor(com.tencent.mm.R.color.a9e));
    }

    public void c(boolean z17) {
        android.widget.LinearLayout linearLayout = this.f131969s;
        if (linearLayout == null) {
            return;
        }
        if (z17) {
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setVisibility(0);
        }
    }

    public final boolean d() {
        return this.f131958e.getResources().getConfiguration().orientation == 2;
    }

    public boolean e() {
        android.app.Dialog dialog = this.f131957d;
        return dialog != null && dialog.isShowing();
    }

    public com.tencent.mm.plugin.finder.view.e3 f(int i17) {
        android.view.LayoutInflater.from(this.f131959f.getContext()).inflate(i17, this.f131975y, true);
        return this;
    }

    public com.tencent.mm.plugin.finder.view.e3 g(android.view.View view, android.widget.FrameLayout.LayoutParams layoutParams) {
        this.f131975y.addView(view, 0, layoutParams);
        return this;
    }

    public void h() {
        android.app.Dialog dialog = this.f131957d;
        if (dialog != null) {
            android.content.Context context = this.f131958e;
            if (!(context instanceof android.app.Activity)) {
                dialog.dismiss();
            } else if (context != null && !((android.app.Activity) context).isFinishing() && !((android.app.Activity) context).isDestroyed()) {
                this.f131957d.dismiss();
            }
            com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = this.f131967q;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.f44443p = true;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void i() {
        this.f131960g = d();
        android.content.Context context = this.f131958e;
        this.f131961h = context instanceof android.app.Activity ? ((android.app.Activity) context).getWindow().getWindowManager().getDefaultDisplay().getRotation() : 0;
        this.f131959f.setTranslationY(0.0f);
        if (this.f131957d != null) {
            ((android.view.ViewGroup) this.f131959f.getParent()).setVisibility(0);
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.f131959f.getLayoutParams();
            boolean z17 = this.f131966p;
            android.view.View view = this.f131963m;
            if (!z17 && this.f131960g && view != null) {
                android.graphics.Rect rect = new android.graphics.Rect();
                view.getWindowVisibleDisplayFrame(rect);
                layoutParams.width = java.lang.Math.min(rect.right, rect.bottom);
                layoutParams.gravity = 1;
                android.view.ViewParent parent = this.f131959f.getParent();
                if (parent instanceof android.view.View) {
                    ((android.view.View) parent).setOnTouchListener(new com.tencent.mm.plugin.finder.view.a3(this, parent));
                }
                if (parent instanceof android.view.ViewGroup) {
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
                    if (viewGroup.getLayoutParams() instanceof androidx.coordinatorlayout.widget.c) {
                        if (!this.f131974x) {
                            androidx.coordinatorlayout.widget.c cVar = (androidx.coordinatorlayout.widget.c) viewGroup.getLayoutParams();
                            com.tencent.mm.plugin.finder.view.b3 b3Var = new com.tencent.mm.plugin.finder.view.b3(this);
                            b3Var.f44453z = new com.tencent.mm.plugin.finder.view.c3(this);
                            cVar.b(b3Var);
                            this.f131967q = b3Var;
                        }
                        com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = this.f131967q;
                        if (bottomSheetBehavior != null) {
                            int i17 = this.f131972v;
                            if (i17 > 0) {
                                bottomSheetBehavior.D(4);
                                this.f131967q.C(i17);
                            } else {
                                bottomSheetBehavior.D(3);
                            }
                        }
                    }
                }
            }
            this.f131959f.setLayoutParams(layoutParams);
            this.f131957d.getWindow().addFlags(Integer.MIN_VALUE);
            this.f131957d.getWindow().clearFlags(8);
            this.f131957d.getWindow().clearFlags(131072);
            this.f131957d.getWindow().clearFlags(128);
            this.f131957d.getWindow().getDecorView().setSystemUiVisibility(0);
            if (view != null) {
                boolean z18 = this.f131964n == null;
                android.view.ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.f131964n = viewTreeObserver;
                if (z18) {
                    viewTreeObserver.addOnGlobalLayoutListener(this);
                }
            }
            if ((context instanceof android.app.Activity) && !((android.app.Activity) context).isFinishing()) {
                this.f131957d.show();
            }
            com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior2 = this.f131967q;
            if (bottomSheetBehavior2 != null) {
                bottomSheetBehavior2.f44443p = this.f131973w;
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (e()) {
            android.view.View view = this.f131963m;
            if (view == null || !(view.isShown() || view.getVisibility() == 0)) {
                h();
                return;
            }
            if (e()) {
                if (this.f131960g == d()) {
                    int i17 = this.f131961h;
                    android.content.Context context = this.f131958e;
                    if (i17 == (context instanceof android.app.Activity ? ((android.app.Activity) context).getWindow().getWindowManager().getDefaultDisplay().getRotation() : 0)) {
                        if (this.f131962i != this.f131975y.getHeight()) {
                            this.f131962i = this.f131975y.getHeight();
                            int width = this.f131975y.getWidth();
                            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) this.f131976z.getLayoutParams();
                            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).height = this.f131962i;
                            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).width = width;
                            this.f131976z.setLayoutParams(layoutParams);
                            if (this.f131976z.getParent() instanceof androidx.constraintlayout.widget.ConstraintLayout) {
                                androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) this.f131976z.getParent();
                                androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
                                cVar.d(constraintLayout);
                                cVar.e(this.f131976z.getId(), 2, 0, 2);
                                cVar.e(this.f131976z.getId(), 4, 0, 4);
                                cVar.b(constraintLayout);
                                constraintLayout.setConstraintSet(null);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                h();
            }
        }
    }
}
