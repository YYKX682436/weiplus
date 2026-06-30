package o;

/* loaded from: classes15.dex */
public final class n0 extends o.c0 implements android.widget.PopupWindow.OnDismissListener, android.view.View.OnKeyListener {
    public boolean A;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f341754e;

    /* renamed from: f, reason: collision with root package name */
    public final o.r f341755f;

    /* renamed from: g, reason: collision with root package name */
    public final o.o f341756g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f341757h;

    /* renamed from: i, reason: collision with root package name */
    public final int f341758i;

    /* renamed from: m, reason: collision with root package name */
    public final int f341759m;

    /* renamed from: n, reason: collision with root package name */
    public final int f341760n;

    /* renamed from: o, reason: collision with root package name */
    public final androidx.appcompat.widget.o1 f341761o;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.PopupWindow.OnDismissListener f341764r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f341765s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f341766t;

    /* renamed from: u, reason: collision with root package name */
    public o.f0 f341767u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.ViewTreeObserver f341768v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f341769w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f341770x;

    /* renamed from: y, reason: collision with root package name */
    public int f341771y;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.ViewTreeObserver.OnGlobalLayoutListener f341762p = new o.l0(this);

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View.OnAttachStateChangeListener f341763q = new o.m0(this);

    /* renamed from: z, reason: collision with root package name */
    public int f341772z = 0;

    public n0(android.content.Context context, o.r rVar, android.view.View view, int i17, int i18, boolean z17) {
        this.f341754e = context;
        this.f341755f = rVar;
        this.f341757h = z17;
        this.f341756g = new o.o(rVar, android.view.LayoutInflater.from(context), z17, com.tencent.mm.R.layout.f487896ax);
        this.f341759m = i17;
        this.f341760n = i18;
        android.content.res.Resources resources = context.getResources();
        this.f341758i = java.lang.Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f479973kl));
        this.f341765s = view;
        this.f341761o = new androidx.appcompat.widget.o1(context, null, i17, i18);
        rVar.b(this, context);
    }

    @Override // o.g0
    public void a(o.r rVar, boolean z17) {
        if (rVar != this.f341755f) {
            return;
        }
        dismiss();
        o.f0 f0Var = this.f341767u;
        if (f0Var != null) {
            f0Var.a(rVar, z17);
        }
    }

    @Override // o.g0
    public android.os.Parcelable b() {
        return null;
    }

    @Override // o.g0
    public void c(boolean z17) {
        this.f341770x = false;
        o.o oVar = this.f341756g;
        if (oVar != null) {
            oVar.notifyDataSetChanged();
        }
    }

    @Override // o.k0
    public void dismiss() {
        if (isShowing()) {
            this.f341761o.dismiss();
        }
    }

    @Override // o.g0
    public boolean e() {
        return false;
    }

    @Override // o.g0
    public void f(android.os.Parcelable parcelable) {
    }

    @Override // o.g0
    public void g(o.f0 f0Var) {
        this.f341767u = f0Var;
    }

    @Override // o.k0
    public android.widget.ListView getListView() {
        return this.f341761o.f9419f;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    @Override // o.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean i(o.o0 r10) {
        /*
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L7e
            o.e0 r0 = new o.e0
            android.content.Context r3 = r9.f341754e
            android.view.View r5 = r9.f341766t
            boolean r6 = r9.f341757h
            int r7 = r9.f341759m
            int r8 = r9.f341760n
            r2 = r0
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            o.f0 r2 = r9.f341767u
            r0.f341710i = r2
            o.c0 r3 = r0.f341711j
            if (r3 == 0) goto L23
            r3.g(r2)
        L23:
            boolean r2 = o.c0.t(r10)
            r0.f341709h = r2
            o.c0 r3 = r0.f341711j
            if (r3 == 0) goto L30
            r3.n(r2)
        L30:
            android.widget.PopupWindow$OnDismissListener r2 = r9.f341764r
            r0.f341712k = r2
            r2 = 0
            r9.f341764r = r2
            o.r r2 = r9.f341755f
            r2.c(r1)
            androidx.appcompat.widget.o1 r2 = r9.f341761o
            int r3 = r2.f9422i
            boolean r4 = r2.f9425o
            if (r4 != 0) goto L46
            r2 = r1
            goto L48
        L46:
            int r2 = r2.f9423m
        L48:
            int r4 = r9.f341772z
            android.view.View r5 = r9.f341765s
            java.util.WeakHashMap r6 = n3.l1.f334362a
            int r5 = n3.v0.d(r5)
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r5)
            r4 = r4 & 7
            r5 = 5
            if (r4 != r5) goto L62
            android.view.View r4 = r9.f341765s
            int r4 = r4.getWidth()
            int r3 = r3 + r4
        L62:
            boolean r4 = r0.b()
            r5 = 1
            if (r4 == 0) goto L6a
            goto L73
        L6a:
            android.view.View r4 = r0.f341707f
            if (r4 != 0) goto L70
            r0 = r1
            goto L74
        L70:
            r0.d(r3, r2, r5, r5)
        L73:
            r0 = r5
        L74:
            if (r0 == 0) goto L7e
            o.f0 r0 = r9.f341767u
            if (r0 == 0) goto L7d
            r0.c(r10)
        L7d:
            return r5
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.n0.i(o.o0):boolean");
    }

    @Override // o.k0
    public boolean isShowing() {
        return !this.f341769w && this.f341761o.isShowing();
    }

    @Override // o.c0
    public void k(o.r rVar) {
    }

    @Override // o.c0
    public void m(android.view.View view) {
        this.f341765s = view;
    }

    @Override // o.c0
    public void n(boolean z17) {
        this.f341756g.f341775f = z17;
    }

    @Override // o.c0
    public void o(int i17) {
        this.f341772z = i17;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f341769w = true;
        this.f341755f.c(true);
        android.view.ViewTreeObserver viewTreeObserver = this.f341768v;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f341768v = this.f341766t.getViewTreeObserver();
            }
            this.f341768v.removeGlobalOnLayoutListener(this.f341762p);
            this.f341768v = null;
        }
        this.f341766t.removeOnAttachStateChangeListener(this.f341763q);
        android.widget.PopupWindow.OnDismissListener onDismissListener = this.f341764r;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(android.view.View view, int i17, android.view.KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i17 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // o.c0
    public void p(int i17) {
        this.f341761o.f9422i = i17;
    }

    @Override // o.c0
    public void q(android.widget.PopupWindow.OnDismissListener onDismissListener) {
        this.f341764r = onDismissListener;
    }

    @Override // o.c0
    public void r(boolean z17) {
        this.A = z17;
    }

    @Override // o.c0
    public void s(int i17) {
        androidx.appcompat.widget.o1 o1Var = this.f341761o;
        o1Var.f9423m = i17;
        o1Var.f9425o = true;
    }

    @Override // o.k0
    public void show() {
        android.view.View view;
        boolean z17 = true;
        if (!isShowing()) {
            if (this.f341769w || (view = this.f341765s) == null) {
                z17 = false;
            } else {
                this.f341766t = view;
                androidx.appcompat.widget.o1 o1Var = this.f341761o;
                o1Var.E.setOnDismissListener(this);
                o1Var.f9432v = this;
                o1Var.D = true;
                android.widget.PopupWindow popupWindow = o1Var.E;
                popupWindow.setFocusable(true);
                android.view.View view2 = this.f341766t;
                boolean z18 = this.f341768v == null;
                android.view.ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                this.f341768v = viewTreeObserver;
                if (z18) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f341762p);
                }
                view2.addOnAttachStateChangeListener(this.f341763q);
                o1Var.f9431u = view2;
                o1Var.f9428r = this.f341772z;
                boolean z19 = this.f341770x;
                android.content.Context context = this.f341754e;
                o.o oVar = this.f341756g;
                if (!z19) {
                    this.f341771y = o.c0.l(oVar, null, context, this.f341758i);
                    this.f341770x = true;
                }
                o1Var.e(this.f341771y);
                popupWindow.setInputMethodMode(2);
                o1Var.C = this.f341689d;
                o1Var.show();
                androidx.appcompat.widget.b1 b1Var = o1Var.f9419f;
                b1Var.setOnKeyListener(this);
                if (this.A) {
                    o.r rVar = this.f341755f;
                    if (rVar.f341792s != null) {
                        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f487895aw, (android.view.ViewGroup) b1Var, false);
                        android.widget.TextView textView = (android.widget.TextView) frameLayout.findViewById(android.R.id.title);
                        if (textView != null) {
                            textView.setText(rVar.f341792s);
                        }
                        frameLayout.setEnabled(false);
                        b1Var.addHeaderView(frameLayout, null, false);
                    }
                }
                o1Var.d(oVar);
                o1Var.show();
            }
        }
        if (!z17) {
            throw new java.lang.IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }
}
