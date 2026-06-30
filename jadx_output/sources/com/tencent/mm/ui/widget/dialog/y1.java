package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes3.dex */
public class y1 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {
    public int A;
    public android.view.ViewGroup B;
    public android.view.ViewGroup C;
    public final java.util.LinkedList D;
    public com.tencent.mm.ui.al E;
    public boolean F;
    public boolean G;
    public boolean H;

    /* renamed from: d, reason: collision with root package name */
    public android.app.Dialog f212025d;

    /* renamed from: e, reason: collision with root package name */
    public android.content.Context f212026e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f212027f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f212028g;

    /* renamed from: h, reason: collision with root package name */
    public int f212029h;

    /* renamed from: i, reason: collision with root package name */
    public int f212030i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f212031m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.ViewTreeObserver f212032n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f212033o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f212034p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f212035q;

    /* renamed from: r, reason: collision with root package name */
    public com.google.android.material.bottomsheet.BottomSheetBehavior f212036r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.h2 f212037s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.i2 f212038t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f212039u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.LinearLayout f212040v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f212041w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f212042x;

    /* renamed from: y, reason: collision with root package name */
    public int f212043y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f212044z;

    public y1(android.content.Context context) {
        this(context, 0);
        this.E = new com.tencent.mm.ui.al(context);
    }

    public void a() {
        this.B.setBackgroundColor(this.f212026e.getResources().getColor(com.tencent.mm.R.color.a9e));
    }

    public android.view.Window b() {
        android.app.Dialog dialog = this.f212025d;
        if (dialog != null) {
            return dialog.getWindow();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(com.tencent.mm.ui.widget.dialog.g2 r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.widget.dialog.y1.c(com.tencent.mm.ui.widget.dialog.g2, boolean):void");
    }

    public void d(boolean z17) {
        android.widget.LinearLayout linearLayout = this.f212040v;
        if (linearLayout == null) {
            return;
        }
        if (z17) {
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setVisibility(0);
        }
    }

    public final boolean e() {
        return this.f212026e.getResources().getConfiguration().orientation == 2;
    }

    public boolean f() {
        android.app.Dialog dialog = this.f212025d;
        return dialog != null && dialog.isShowing();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(com.tencent.mm.ui.widget.dialog.g2 r14) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.widget.dialog.y1.g(com.tencent.mm.ui.widget.dialog.g2):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(com.tencent.mm.ui.widget.dialog.g2 r15) {
        /*
            Method dump skipped, instructions count: 515
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.widget.dialog.y1.h(com.tencent.mm.ui.widget.dialog.g2):void");
    }

    public void i(boolean z17) {
        android.app.Dialog dialog = this.f212025d;
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(z17);
            this.f212025d.setCancelable(z17);
        }
    }

    public com.tencent.mm.ui.widget.dialog.y1 j(int i17) {
        android.view.LayoutInflater.from(this.f212027f.getContext()).inflate(i17, this.B, true);
        return this;
    }

    public com.tencent.mm.ui.widget.dialog.y1 k(android.view.View view) {
        this.B.addView(view, 0);
        return this;
    }

    public com.tencent.mm.ui.widget.dialog.y1 l(android.view.View view, android.widget.FrameLayout.LayoutParams layoutParams) {
        this.B.addView(view, 0, layoutParams);
        return this;
    }

    public void m(java.lang.Boolean bool) {
        this.f212034p = bool.booleanValue();
    }

    public void n(android.content.DialogInterface.OnCancelListener onCancelListener) {
        android.app.Dialog dialog = this.f212025d;
        if (dialog != null) {
            dialog.setOnCancelListener(onCancelListener);
        }
    }

    public void o(com.tencent.mm.ui.widget.dialog.h2 h2Var) {
        this.f212037s = h2Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (f()) {
            android.view.View view = this.f212031m;
            if (view == null || !(view.isShown() || view.getVisibility() == 0)) {
                q();
                return;
            }
            if (f()) {
                if (this.f212028g == e()) {
                    int i17 = this.f212029h;
                    android.content.Context context = this.f212026e;
                    if (i17 == (context instanceof android.app.Activity ? ((android.app.Activity) context).getWindow().getWindowManager().getDefaultDisplay().getRotation() : 0)) {
                        if (this.f212030i != this.B.getHeight()) {
                            this.f212030i = this.B.getHeight();
                            int width = this.B.getWidth();
                            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.C.getLayoutParams();
                            layoutParams.height = this.f212030i;
                            layoutParams.width = width;
                            layoutParams.gravity = 85;
                            this.C.setLayoutParams(layoutParams);
                            return;
                        }
                        return;
                    }
                }
                q();
            }
        }
    }

    public com.tencent.mm.ui.widget.dialog.y1 p(boolean z17) {
        if (this.f212027f != null) {
            if (z17) {
                this.B.setBackgroundResource(com.tencent.mm.R.drawable.b8l);
                this.f212041w.setBackgroundColor(this.f212026e.getResources().getColor(com.tencent.mm.R.color.f478513v));
                this.f212042x.setTextColor(this.f212026e.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8));
                this.f212042x.setBackgroundResource(com.tencent.mm.R.drawable.f481339qv);
            } else {
                this.B.setBackgroundResource(com.tencent.mm.R.drawable.b8p);
            }
        }
        return this;
    }

    public void q() {
        android.app.Dialog dialog = this.f212025d;
        if (dialog != null) {
            android.content.Context context = this.f212026e;
            if (!(context instanceof android.app.Activity)) {
                this.f212039u = true;
                dialog.dismiss();
            } else if (context != null && !((android.app.Activity) context).isFinishing() && !((android.app.Activity) this.f212026e).isDestroyed()) {
                this.f212039u = true;
                this.f212025d.dismiss();
            }
            com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = this.f212036r;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.f44443p = true;
            }
        }
    }

    public void r(boolean z17) {
        this.f212033o = z17;
        q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void s() {
        this.f212028g = e();
        android.content.Context context = this.f212026e;
        this.f212029h = context instanceof android.app.Activity ? ((android.app.Activity) context).getWindow().getWindowManager().getDefaultDisplay().getRotation() : 0;
        if (this.f212025d != null) {
            ((android.view.ViewGroup) this.f212027f.getParent()).setVisibility(0);
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.f212027f.getLayoutParams();
            if (!this.f212035q && this.f212028g && this.f212031m != null && this.F) {
                android.graphics.Rect rect = new android.graphics.Rect();
                this.f212031m.getWindowVisibleDisplayFrame(rect);
                layoutParams.width = java.lang.Math.min(rect.right, rect.bottom);
                layoutParams.gravity = 1;
                android.view.ViewParent parent = this.f212027f.getParent();
                if (parent instanceof android.view.View) {
                    ((android.view.View) parent).setOnTouchListener(new com.tencent.mm.ui.widget.dialog.d2(this, parent));
                }
                if (parent instanceof android.view.ViewGroup) {
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
                    if (viewGroup.getLayoutParams() instanceof androidx.coordinatorlayout.widget.c) {
                        androidx.coordinatorlayout.widget.c cVar = (androidx.coordinatorlayout.widget.c) viewGroup.getLayoutParams();
                        com.tencent.mm.ui.widget.dialog.e2 e2Var = new com.tencent.mm.ui.widget.dialog.e2(this);
                        e2Var.f44453z = new com.tencent.mm.ui.widget.dialog.f2(this);
                        cVar.b(e2Var);
                        this.f212036r = e2Var;
                        if (this.f212043y > 0) {
                            e2Var.D(4);
                            this.f212036r.C(this.f212043y);
                        } else {
                            e2Var.D(3);
                        }
                    }
                }
            }
            if (this.f212028g && this.f212031m != null) {
                android.graphics.Rect rect2 = new android.graphics.Rect();
                this.f212031m.getWindowVisibleDisplayFrame(rect2);
                if (this.f212035q) {
                    layoutParams.width = (int) ((rect2.right * 1.0f) / 2.0f);
                    int i17 = this.A;
                    if (i17 != 0) {
                        layoutParams.width = i17;
                    }
                    if (com.tencent.mm.ui.bl.m(this.f212026e)) {
                        layoutParams.height = rect2.bottom - com.tencent.mm.ui.bl.j(this.f212026e);
                    } else {
                        layoutParams.height = rect2.bottom;
                    }
                } else {
                    layoutParams.width = java.lang.Math.min(rect2.right, rect2.bottom);
                    int i18 = this.A;
                    if (i18 != 0) {
                        layoutParams.width = i18;
                    }
                }
            }
            this.f212027f.setLayoutParams(layoutParams);
            this.f212025d.getWindow().addFlags(Integer.MIN_VALUE);
            if (this.f212034p) {
                this.f212025d.getWindow().setFlags(8, 8);
                this.f212025d.getWindow().addFlags(131200);
                this.f212025d.getWindow().getDecorView().setSystemUiVisibility(6);
            } else {
                this.f212025d.getWindow().clearFlags(8);
                this.f212025d.getWindow().clearFlags(131072);
                this.f212025d.getWindow().clearFlags(128);
                this.f212025d.getWindow().getDecorView().setSystemUiVisibility(0);
            }
            if (this.f212034p && this.G) {
                this.f212025d.getWindow().clearFlags(8);
                this.f212025d.getWindow().clearFlags(131072);
            }
            android.view.View view = this.f212031m;
            if (view != null) {
                boolean z17 = this.f212032n == null;
                android.view.ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.f212032n = viewTreeObserver;
                if (z17) {
                    viewTreeObserver.addOnGlobalLayoutListener(this);
                }
            }
            android.content.Context context2 = this.f212026e;
            if ((context2 instanceof android.app.Activity) && !((android.app.Activity) context2).isFinishing()) {
                this.f212025d.show();
            }
            com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = this.f212036r;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.f44443p = this.f212044z;
            }
        }
    }

    public y1(android.content.Context context, int i17) {
        this(context, i17, false, false);
        this.E = new com.tencent.mm.ui.al(context);
    }

    public y1(android.content.Context context, int i17, boolean z17, boolean z18) {
        this(context, i17, z17, z18, com.tencent.mm.R.style.f494143fd);
    }

    public y1(android.content.Context context, int i17, boolean z17, boolean z18, int i18) {
        this.f212028g = false;
        this.f212033o = false;
        this.f212034p = false;
        this.f212035q = false;
        this.f212037s = null;
        this.f212038t = null;
        this.f212039u = false;
        this.A = 0;
        this.D = new java.util.LinkedList();
        this.F = true;
        this.G = false;
        this.H = true;
        this.f212026e = context;
        this.E = new com.tencent.mm.ui.al(context);
        this.f212035q = z18;
        android.content.Context context2 = this.f212026e;
        if (context2 instanceof android.app.Activity) {
            this.f212031m = ((android.view.ViewGroup) ((android.app.Activity) context2).getWindow().getDecorView()).findViewById(android.R.id.content);
        }
        this.f212043y = i17;
        android.content.Context context3 = this.f212026e;
        if (this.f212035q) {
            this.f212025d = new com.tencent.mm.ui.widget.dialog.c(context3);
        } else if (z17) {
            this.f212025d = new com.tencent.mm.ui.widget.dialog.a4(context3, i18);
        } else {
            this.f212025d = new y9.i(context3, com.tencent.mm.R.style.f30do);
        }
        android.view.View inflate = android.view.View.inflate(context3, com.tencent.mm.R.layout.bya, null);
        this.f212027f = inflate;
        this.B = (android.view.ViewGroup) inflate.findViewById(com.tencent.mm.R.id.f483444av5);
        this.C = (android.view.ViewGroup) this.f212027f.findViewById(com.tencent.mm.R.id.avd);
        this.f212040v = (android.widget.LinearLayout) this.f212027f.findViewById(com.tencent.mm.R.id.f483441av3);
        this.f212041w = this.f212027f.findViewById(com.tencent.mm.R.id.b5t);
        this.f212042x = (android.widget.TextView) this.f212027f.findViewById(com.tencent.mm.R.id.b5u);
        this.f212040v.setOnClickListener(new com.tencent.mm.ui.widget.dialog.z1(this));
        this.f212028g = e();
        this.f212025d.requestWindowFeature(1);
        this.f212025d.setContentView(this.f212027f);
        if (!this.f212035q && !z17) {
            com.google.android.material.bottomsheet.BottomSheetBehavior A = com.google.android.material.bottomsheet.BottomSheetBehavior.A((android.view.View) this.f212027f.getParent());
            this.f212036r = A;
            if (A != null) {
                if (this.f212043y > 0) {
                    A.D(4);
                    this.f212036r.C(this.f212043y);
                } else {
                    A.D(3);
                }
            }
        }
        this.f212025d.setOnKeyListener(new android.content.DialogInterface.OnKeyListener() { // from class: com.tencent.mm.ui.widget.dialog.y1$$a
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(android.content.DialogInterface dialogInterface, int i19, android.view.KeyEvent keyEvent) {
                com.tencent.mm.ui.widget.dialog.y1 y1Var = com.tencent.mm.ui.widget.dialog.y1.this;
                boolean z19 = false;
                if (i19 != 4) {
                    y1Var.getClass();
                    return false;
                }
                java.util.LinkedList linkedList = y1Var.D;
                if (!linkedList.isEmpty()) {
                    y1Var.g((com.tencent.mm.ui.widget.dialog.g2) linkedList.getLast());
                    z19 = true;
                }
                if (!z19 && y1Var.H) {
                    dialogInterface.dismiss();
                }
                return true;
            }
        });
        this.f212025d.setOnDismissListener(new com.tencent.mm.ui.widget.dialog.a2(this));
        if (com.tencent.mm.ui.b4.c(context3)) {
            android.view.View view = this.f212027f;
            com.tencent.mm.ui.widget.dialog.y1$$b y1__b = new com.tencent.mm.ui.widget.dialog.y1$$b();
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.a1.u(view, y1__b);
        }
    }
}
