package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes14.dex */
public class z2 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {
    public android.widget.LinearLayout A;
    public android.widget.LinearLayout B;
    public android.widget.TextView C;
    public com.tencent.mm.ui.widget.dialog.p3 D;
    public com.tencent.mm.ui.widget.dialog.p3 E;
    public com.tencent.mm.ui.widget.dialog.p3 F;
    public android.view.View G;
    public final boolean H;
    public final boolean I;

    /* renamed from: J, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.q3 f212054J;
    public com.tencent.mm.ui.widget.dialog.r3 K;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.a4 f212055d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.o3 f212056e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f212057f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f212058g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f212059h;

    /* renamed from: i, reason: collision with root package name */
    public int f212060i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f212061m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.ViewTreeObserver f212062n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f212063o;

    /* renamed from: p, reason: collision with root package name */
    public int f212064p;

    /* renamed from: q, reason: collision with root package name */
    public int f212065q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.LinearLayout f212066r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.LinearLayout f212067s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.Button f212068t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.Button f212069u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.ui.widget.button.WeButton f212070v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.ui.widget.button.WeButton f212071w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.Button f212072x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.LinearLayout f212073y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.LinearLayout f212074z;

    public z2(android.content.Context context) {
        this.f212059h = false;
        this.f212063o = false;
        this.H = true;
        this.I = false;
        this.f212057f = context;
        this.f212064p = 0;
        this.f212065q = 0;
        f(context);
    }

    public static void a(com.tencent.mm.ui.widget.dialog.z2 z2Var, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        z2Var.f212067s.setVisibility(0);
        z2Var.f212066r.setVisibility(8);
        com.tencent.mm.ui.widget.button.WeButton weButton = z2Var.f212071w;
        if (weButton == null || z2Var.f212070v == null) {
            return;
        }
        weButton.setText(charSequence);
        z2Var.f212070v.setText(charSequence2);
        z2Var.f212071w.setOnClickListener(new com.tencent.mm.ui.widget.dialog.i3(z2Var));
        z2Var.f212070v.setOnClickListener(new com.tencent.mm.ui.widget.dialog.j3(z2Var));
    }

    public void A(int i17) {
        this.f212055d.getWindow().getAttributes().softInputMode = i17;
    }

    public void B() {
        com.tencent.mm.ui.widget.dialog.a4 a4Var = this.f212055d;
        if (a4Var == null) {
            com.tencent.mm.ui.widget.dialog.q3 q3Var = this.f212054J;
            if (q3Var != null) {
                q3Var.dismiss();
                return;
            }
            return;
        }
        android.content.Context context = this.f212057f;
        if (!(context instanceof android.app.Activity)) {
            a4Var.dismiss();
        } else {
            if (context == null || ((android.app.Activity) context).isFinishing() || ((android.app.Activity) context).isDestroyed()) {
                return;
            }
            this.f212055d.dismiss();
        }
    }

    public void C() {
        this.f212059h = g();
        android.content.Context context = this.f212057f;
        this.f212060i = context instanceof android.app.Activity ? ((android.app.Activity) context).getWindow().getWindowManager().getDefaultDisplay().getRotation() : 0;
        boolean z17 = context instanceof android.app.Activity;
        if (!z17) {
            com.tencent.mm.ui.AlertActivity.f196558o = this.f212056e;
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.ui.AlertActivity.class);
            intent.setFlags(335544320);
            intent.putExtra("dialog_scene", 3);
            android.content.Context context2 = this.f212057f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/ui/widget/dialog/MMHalfBottomDialog", "tryShow", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context2, "com/tencent/mm/ui/widget/dialog/MMHalfBottomDialog", "tryShow", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        if (this.f212055d != null) {
            ((android.view.ViewGroup) this.f212058g.getParent()).setVisibility(0);
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.f212058g.getLayoutParams();
            if (this.f212059h && this.f212061m != null) {
                android.graphics.Rect rect = new android.graphics.Rect();
                this.f212061m.getWindowVisibleDisplayFrame(rect);
                layoutParams.width = java.lang.Math.min(rect.right, rect.bottom);
            }
            this.f212058g.setLayoutParams(layoutParams);
            this.f212055d.getWindow().addFlags(Integer.MIN_VALUE);
            this.f212055d.getWindow().clearFlags(8);
            this.f212055d.getWindow().clearFlags(131072);
            this.f212055d.getWindow().clearFlags(128);
            this.f212055d.getWindow().getDecorView().setSystemUiVisibility(0);
            android.view.View view = this.f212061m;
            if (view != null) {
                boolean z18 = this.f212062n == null;
                android.view.ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.f212062n = viewTreeObserver;
                if (z18) {
                    viewTreeObserver.addOnGlobalLayoutListener(this);
                }
            }
            if (z17) {
                if (((android.app.Activity) context).isFinishing()) {
                    return;
                }
                this.f212055d.show();
                return;
            }
            com.tencent.mm.ui.AlertActivity.f196558o = this.f212056e;
            android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.ui.AlertActivity.class);
            intent2.setFlags(335544320);
            intent2.putExtra("dialog_scene", 3);
            android.content.Context context3 = this.f212057f;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent2);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(context3, arrayList2.toArray(), "com/tencent/mm/ui/widget/dialog/MMHalfBottomDialog", "tryShow", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context3.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(context3, "com/tencent/mm/ui/widget/dialog/MMHalfBottomDialog", "tryShow", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    public void b(boolean z17) {
        android.widget.Button button = this.f212069u;
        if (button != null) {
            button.setEnabled(z17);
        }
    }

    public int c() {
        return com.tencent.mm.R.layout.byo;
    }

    public final void d() {
        this.f212066r = (android.widget.LinearLayout) this.f212058g.findViewById(com.tencent.mm.R.id.b0u);
        this.f212068t = (android.widget.Button) this.f212058g.findViewById(com.tencent.mm.R.id.b0e);
        this.f212069u = (android.widget.Button) this.f212058g.findViewById(com.tencent.mm.R.id.b0f);
        this.f212072x = (android.widget.Button) this.f212058g.findViewById(com.tencent.mm.R.id.b1e);
        this.f212067s = (android.widget.LinearLayout) this.f212058g.findViewById(com.tencent.mm.R.id.b0v);
        this.f212070v = (com.tencent.mm.ui.widget.button.WeButton) this.f212058g.findViewById(com.tencent.mm.R.id.b0g);
        this.f212071w = (com.tencent.mm.ui.widget.button.WeButton) this.f212058g.findViewById(com.tencent.mm.R.id.b0d);
        int i17 = this.f212064p;
        if (i17 == 0) {
            this.f212066r.setVisibility(8);
            this.f212067s.setVisibility(8);
            return;
        }
        if (i17 == 1) {
            this.f212067s.setVisibility(8);
            this.f212066r.setVisibility(0);
            this.f212072x.setVisibility(8);
            this.f212068t.setOnClickListener(new com.tencent.mm.ui.widget.dialog.k3(this));
            this.f212069u.setOnClickListener(new com.tencent.mm.ui.widget.dialog.l3(this));
            return;
        }
        if (i17 == 2) {
            this.f212067s.setVisibility(8);
            this.f212066r.setVisibility(0);
            this.f212068t.setVisibility(8);
            this.f212069u.setVisibility(8);
            this.f212072x.setOnClickListener(new com.tencent.mm.ui.widget.dialog.m3(this));
            return;
        }
        if (i17 != 3) {
            return;
        }
        this.f212067s.setVisibility(0);
        this.f212066r.setVisibility(8);
        this.f212071w.setOnClickListener(new com.tencent.mm.ui.widget.dialog.n3(this));
        this.f212070v.setOnClickListener(new com.tencent.mm.ui.widget.dialog.a3(this));
    }

    public final void e() {
        android.widget.LinearLayout linearLayout = this.f212073y;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
            int i17 = this.f212065q;
            if (i17 == 0) {
                this.f212073y.setVisibility(8);
                return;
            }
            android.content.Context context = this.f212057f;
            if (i17 != 1) {
                if (i17 == 2) {
                    android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f489165bj2, (android.view.ViewGroup) null);
                    this.C = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.odb);
                    this.f212073y.removeAllViews();
                    this.f212073y.setGravity(17);
                    this.f212073y.addView(inflate, -1, -2);
                    return;
                }
                if (i17 != 4) {
                    return;
                }
            }
            android.view.View inflate2 = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f489164bj1, (android.view.ViewGroup) null);
            android.view.View findViewById = inflate2.findViewById(com.tencent.mm.R.id.bzg);
            android.view.View findViewById2 = inflate2.findViewById(com.tencent.mm.R.id.u9x);
            android.view.View findViewById3 = inflate2.findViewById(com.tencent.mm.R.id.qlj);
            android.widget.TextView textView = (android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.u_0);
            int i18 = this.f212065q;
            if (i18 == 1) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/ui/widget/dialog/MMHalfBottomDialog", "initHeaderView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/ui/widget/dialog/MMHalfBottomDialog", "initHeaderView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/ui/widget/dialog/MMHalfBottomDialog", "initHeaderView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/ui/widget/dialog/MMHalfBottomDialog", "initHeaderView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) inflate2.findViewById(com.tencent.mm.R.id.close_icon);
                if (this.I) {
                    findViewById.setBackgroundResource(com.tencent.mm.R.drawable.f481873ag5);
                    weImageView.setIconColor(context.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8));
                }
                findViewById.setOnClickListener(new com.tencent.mm.ui.widget.dialog.b3(this));
            } else if (i18 == 4) {
                this.C = textView;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/ui/widget/dialog/MMHalfBottomDialog", "initHeaderView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/ui/widget/dialog/MMHalfBottomDialog", "initHeaderView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(findViewById, arrayList4.toArray(), "com/tencent/mm/ui/widget/dialog/MMHalfBottomDialog", "initHeaderView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/ui/widget/dialog/MMHalfBottomDialog", "initHeaderView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setOnClickListener(new com.tencent.mm.ui.widget.dialog.c3(this));
            }
            this.f212073y.removeAllViews();
            this.f212073y.setGravity(17);
            this.f212073y.addView(inflate2, -1, -2);
        }
    }

    public final void f(android.content.Context context) {
        android.content.Context context2 = this.f212057f;
        boolean z17 = context2 instanceof android.app.Activity;
        boolean z18 = this.H;
        if (!z17) {
            com.tencent.mm.ui.widget.dialog.o3 o3Var = new com.tencent.mm.ui.widget.dialog.o3(context2);
            this.f212056e = o3Var;
            int i17 = this.f212064p;
            int i18 = this.f212065q;
            com.tencent.mm.ui.widget.dialog.h hVar = o3Var.f211939b;
            hVar.f211804a = i17;
            hVar.f211805b = i18;
            hVar.f211806c = z18;
            return;
        }
        this.f212061m = ((android.view.ViewGroup) ((android.app.Activity) context2).getWindow().getDecorView()).findViewById(android.R.id.content);
        this.f212055d = new com.tencent.mm.ui.widget.dialog.a4(context);
        android.view.View inflate = android.view.View.inflate(context, c(), null);
        this.f212058g = inflate;
        if (inflate != null && this.I) {
            inflate.setBackgroundResource(com.tencent.mm.R.drawable.b8l);
        }
        this.f212073y = (android.widget.LinearLayout) this.f212058g.findViewById(com.tencent.mm.R.id.avh);
        this.f212074z = (android.widget.LinearLayout) this.f212058g.findViewById(com.tencent.mm.R.id.av7);
        this.A = (android.widget.LinearLayout) this.f212058g.findViewById(com.tencent.mm.R.id.av9);
        this.B = (android.widget.LinearLayout) this.f212058g.findViewById(com.tencent.mm.R.id.av6);
        this.G = this.f212058g.findViewById(com.tencent.mm.R.id.ohw);
        d();
        e();
        this.f212059h = g();
        this.f212055d.setContentView(this.f212058g);
        this.f212055d.setCancelable(z18);
        this.f212055d.f211745h = z18;
        if (com.tencent.mm.ui.b4.c(context)) {
            android.view.View view = this.f212058g;
            com.tencent.mm.ui.widget.dialog.z2$$a z2__a = new com.tencent.mm.ui.widget.dialog.z2$$a();
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.a1.u(view, z2__a);
        }
        this.f212055d.setOnDismissListener(new com.tencent.mm.ui.widget.dialog.f3(this));
        com.tencent.mm.ui.widget.dialog.o3 o3Var2 = this.f212056e;
        if (o3Var2 != null) {
            o3Var2.f211939b.f211814k = this.f212054J;
        }
    }

    public final boolean g() {
        return this.f212057f.getResources().getConfiguration().orientation == 2;
    }

    public boolean h() {
        com.tencent.mm.ui.widget.dialog.a4 a4Var = this.f212055d;
        return a4Var != null && a4Var.isShowing();
    }

    public com.tencent.mm.ui.widget.dialog.z2 i(int i17) {
        android.widget.LinearLayout linearLayout = this.B;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
            android.view.LayoutInflater.from(this.f212058g.getContext()).inflate(i17, (android.view.ViewGroup) this.B, true);
        }
        com.tencent.mm.ui.widget.dialog.o3 o3Var = this.f212056e;
        if (o3Var != null) {
            o3Var.f211939b.f211812i = i17;
        }
        return this;
    }

    public void j(android.view.View view) {
        android.widget.LinearLayout linearLayout = this.B;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
            this.B.removeAllViews();
            this.B.setGravity(17);
            this.B.addView(view, -1, -2);
            android.widget.Button button = (android.widget.Button) this.B.findViewById(com.tencent.mm.R.id.kao);
            android.widget.Button button2 = (android.widget.Button) this.B.findViewById(com.tencent.mm.R.id.b5i);
            if (button != null) {
                button.setOnClickListener(new com.tencent.mm.ui.widget.dialog.d3(this));
            }
            if (button2 != null) {
                button2.setOnClickListener(new com.tencent.mm.ui.widget.dialog.e3(this));
            }
        }
        com.tencent.mm.ui.widget.dialog.o3 o3Var = this.f212056e;
        if (o3Var != null) {
            o3Var.f211939b.f211807d = view;
        }
    }

    public void k(android.view.View view, int i17, int i18) {
        android.widget.LinearLayout linearLayout = this.B;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
            this.B.removeAllViews();
            this.B.setGravity(17);
            this.B.addView(view, -1, -2);
            this.B.setPadding(i17, 0, i18, 0);
        }
    }

    public void l(com.tencent.mm.ui.widget.dialog.q3 q3Var) {
        this.f212054J = q3Var;
        com.tencent.mm.ui.widget.dialog.o3 o3Var = this.f212056e;
        if (o3Var != null) {
            o3Var.f211939b.f211814k = q3Var;
        }
    }

    public void m(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        android.widget.Button button = this.f212068t;
        if (button != null && this.f212069u != null) {
            button.setText(charSequence);
            this.f212069u.setText(charSequence2);
            this.f212068t.post(new com.tencent.mm.ui.widget.dialog.g3(this, charSequence, charSequence2));
            this.f212069u.post(new com.tencent.mm.ui.widget.dialog.h3(this, charSequence, charSequence2));
        }
        com.tencent.mm.ui.widget.button.WeButton weButton = this.f212071w;
        if (weButton == null || this.f212070v == null) {
            return;
        }
        weButton.setText(charSequence);
        this.f212070v.setText(charSequence2);
    }

    public void n(int i17) {
        android.widget.Button button = this.f212068t;
        if (button != null) {
            android.content.Context context = this.f212057f;
            if (i17 == 0) {
                button.setBackgroundColor(context.getResources().getColor(com.tencent.mm.R.color.abr));
                return;
            }
            if (i17 == 2) {
                button.setBackgroundColor(context.getResources().getColor(com.tencent.mm.R.color.abq));
                return;
            }
            if (i17 == 3) {
                button.setBackgroundColor(context.getResources().getColor(com.tencent.mm.R.color.Yellow_100));
                return;
            }
            if (i17 == 4) {
                button.setBackgroundColor(context.getResources().getColor(com.tencent.mm.R.color.Blue_100));
            } else if (i17 == 5) {
                button.setBackgroundColor(context.getResources().getColor(com.tencent.mm.R.color.f478526a7));
            } else {
                if (i17 != 6) {
                    return;
                }
                button.setBackgroundColor(context.getResources().getColor(com.tencent.mm.R.color.abt));
            }
        }
    }

    public void o(int i17) {
        android.widget.Button button = this.f212069u;
        if (button != null) {
            android.content.Context context = this.f212057f;
            if (i17 == 0) {
                button.setBackgroundColor(context.getResources().getColor(com.tencent.mm.R.color.abr));
                return;
            }
            if (i17 == 2) {
                button.setBackgroundColor(context.getResources().getColor(com.tencent.mm.R.color.abq));
                return;
            }
            if (i17 == 3) {
                button.setBackgroundColor(context.getResources().getColor(com.tencent.mm.R.color.Yellow_100));
                return;
            }
            if (i17 == 4) {
                button.setBackgroundColor(context.getResources().getColor(com.tencent.mm.R.color.Blue_100));
            } else if (i17 == 5) {
                button.setBackgroundColor(context.getResources().getColor(com.tencent.mm.R.color.f478526a7));
            } else {
                if (i17 != 6) {
                    return;
                }
                button.setBackgroundColor(context.getResources().getColor(com.tencent.mm.R.color.abt));
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (h()) {
            android.view.View view = this.f212061m;
            if (view == null || !(view.isShown() || view.getVisibility() == 0)) {
                B();
                return;
            }
            if (h()) {
                if (this.f212059h == g()) {
                    int i17 = this.f212060i;
                    android.content.Context context = this.f212057f;
                    if (i17 == (context instanceof android.app.Activity ? ((android.app.Activity) context).getWindow().getWindowManager().getDefaultDisplay().getRotation() : 0)) {
                        return;
                    }
                }
                B();
            }
        }
    }

    public void p(android.view.View view) {
        android.widget.LinearLayout linearLayout = this.f212074z;
        if (linearLayout != null) {
            if (view == null) {
                linearLayout.setVisibility(8);
                this.A.setVisibility(8);
                return;
            }
            if (this.f212064p == 3) {
                linearLayout.setVisibility(8);
                this.A.setVisibility(0);
                this.A.removeAllViews();
                this.A.setGravity(17);
                this.A.addView(view, -1, -2);
                return;
            }
            this.A.setVisibility(8);
            this.f212074z.setVisibility(0);
            this.f212074z.removeAllViews();
            this.f212074z.setGravity(17);
            this.f212074z.addView(view, -1, -2);
        }
    }

    public void q(java.lang.CharSequence charSequence) {
        android.widget.TextView textView = this.C;
        if (textView != null) {
            textView.setText(charSequence);
        }
        com.tencent.mm.ui.widget.dialog.o3 o3Var = this.f212056e;
        if (o3Var != null) {
            o3Var.f211939b.f211810g = charSequence;
        }
    }

    public void r(android.content.Context context, int i17) {
        android.widget.TextView textView = this.C;
        if (textView != null) {
            textView.setTextColor(context.getResources().getColor(i17));
        }
        com.tencent.mm.ui.widget.dialog.o3 o3Var = this.f212056e;
        if (o3Var != null) {
            o3Var.f211939b.f211811h = context.getResources().getColor(i17);
        }
    }

    public void s(android.view.View view) {
        android.widget.LinearLayout linearLayout = this.f212073y;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
            this.f212073y.removeAllViews();
            this.f212073y.setGravity(17);
            this.f212073y.addView(view, -1, -2);
        }
    }

    public void t(android.view.View view) {
        android.widget.LinearLayout linearLayout = this.f212073y;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f212073y.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            this.f212073y.setLayoutParams(layoutParams);
            this.f212073y.removeAllViews();
            this.f212073y.setGravity(17);
            this.f212073y.addView(view, -1, -2);
        }
    }

    public void u(int i17) {
        if (i17 != 0) {
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.f212058g.getLayoutParams();
            layoutParams.height = i17;
            this.f212058g.setLayoutParams(layoutParams);
            this.f212058g.invalidate();
        }
    }

    public void v(int i17) {
        android.widget.Button button = this.f212068t;
        if (button != null) {
            button.setTextColor(i17);
        }
    }

    public void w(android.content.DialogInterface.OnShowListener onShowListener) {
        com.tencent.mm.ui.widget.dialog.a4 a4Var = this.f212055d;
        if (a4Var != null) {
            a4Var.setOnShowListener(onShowListener);
        }
        com.tencent.mm.ui.widget.dialog.o3 o3Var = this.f212056e;
        if (o3Var != null) {
            o3Var.f211939b.f211815l = onShowListener;
        }
    }

    public void x(int i17) {
        android.widget.Button button = this.f212072x;
        if (button != null) {
            boolean z17 = this.I;
            android.content.Context context = this.f212057f;
            android.content.res.Resources resources = context.getResources();
            button.setTextColor(z17 ? resources.getColor(com.tencent.mm.R.color.f478837in) : resources.getColor(com.tencent.mm.R.color.f478838io));
            switch (i17) {
                case 0:
                    this.f212072x.setBackgroundColor(context.getResources().getColor(com.tencent.mm.R.color.abr));
                    break;
                case 1:
                    this.f212072x.setBackgroundColor(context.getResources().getColor(z17 ? com.tencent.mm.R.color.BW_100_Alpha_0_0_8 : com.tencent.mm.R.color.f479214t2));
                    this.f212072x.setTextColor(z17 ? context.getResources().getColor(com.tencent.mm.R.color.f478838io) : context.getResources().getColor(com.tencent.mm.R.color.aax));
                    break;
                case 2:
                    this.f212072x.setBackgroundColor(context.getResources().getColor(com.tencent.mm.R.color.abq));
                    break;
                case 3:
                    this.f212072x.setBackgroundColor(context.getResources().getColor(com.tencent.mm.R.color.Yellow_100));
                    break;
                case 4:
                    this.f212072x.setBackgroundColor(context.getResources().getColor(com.tencent.mm.R.color.Blue_100));
                    break;
                case 5:
                    this.f212072x.setBackgroundColor(context.getResources().getColor(com.tencent.mm.R.color.abr));
                case 6:
                    this.f212072x.setBackgroundColor(context.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8));
                    this.f212072x.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f478744fz));
                    break;
            }
        }
        com.tencent.mm.ui.widget.dialog.o3 o3Var = this.f212056e;
        if (o3Var != null) {
            o3Var.f211939b.f211809f = i17;
        }
    }

    public void y(java.lang.CharSequence charSequence) {
        android.widget.Button button = this.f212072x;
        if (button != null) {
            button.setText(charSequence);
        }
        com.tencent.mm.ui.widget.dialog.o3 o3Var = this.f212056e;
        if (o3Var != null) {
            o3Var.f211939b.f211808e = charSequence;
        }
    }

    public void z(int i17) {
        android.widget.Button button = this.f212072x;
        if (button != null) {
            button.setTextColor(i17);
        }
    }

    public z2(android.content.Context context, int i17, int i18) {
        this.f212059h = false;
        this.f212063o = false;
        this.H = true;
        this.I = false;
        this.f212057f = context;
        this.f212064p = i17;
        this.f212065q = i18;
        f(context);
    }

    public z2(android.content.Context context, int i17, int i18, boolean z17) {
        this.f212059h = false;
        this.f212063o = false;
        this.H = true;
        this.I = false;
        this.f212057f = context;
        this.f212064p = i17;
        this.f212065q = i18;
        this.H = z17;
        f(context);
    }

    public z2(android.content.Context context, int i17, int i18, boolean z17, boolean z18) {
        this.f212059h = false;
        this.f212063o = false;
        this.H = true;
        this.I = false;
        this.f212057f = context;
        this.f212064p = i17;
        this.f212065q = i18;
        this.H = z17;
        this.I = z18;
        f(context);
    }
}
