package gl5;

/* loaded from: classes15.dex */
public class b0 implements gl5.p {

    /* renamed from: d, reason: collision with root package name */
    public gl5.a0 f272903d;

    /* renamed from: e, reason: collision with root package name */
    public gl5.a0 f272904e;

    /* renamed from: f, reason: collision with root package name */
    public int f272905f;

    /* renamed from: g, reason: collision with root package name */
    public int f272906g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f272907h;

    /* renamed from: m, reason: collision with root package name */
    public boolean f272909m;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ gl5.e0 f272913q;

    /* renamed from: i, reason: collision with root package name */
    public int f272908i = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f272910n = -1;

    /* renamed from: o, reason: collision with root package name */
    public boolean f272911o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f272912p = 0;

    public b0(gl5.e0 e0Var) {
        this.f272913q = e0Var;
        g();
    }

    @Override // gl5.p
    public boolean a() {
        gl5.a0 a0Var = this.f272903d;
        return a0Var != null && a0Var.k();
    }

    public void b(int i17) {
        show();
        this.f272912p = i17;
        gl5.e0 e0Var = this.f272913q;
        com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView = e0Var.U;
        gl5.f0 f0Var = e0Var.O;
        this.f272908i = customTextView.K(f0Var.f272973a, f0Var.f272974b);
        this.f272910n = e0Var.U.J(e0Var.O.f272974b);
        c();
        e0Var.U.getParent().requestDisallowInterceptTouchEvent(true);
        e0Var.U.cancelLongPress();
    }

    public void c() {
        gl5.a0 a0Var = this.f272903d;
        if (a0Var != null) {
            a0Var.i();
        }
        gl5.a0 a0Var2 = this.f272904e;
        if (a0Var2 != null) {
            a0Var2.i();
        }
    }

    public final void d() {
        if (this.f272903d == null) {
            gl5.e0 e0Var = this.f272913q;
            this.f272903d = new gl5.a0(e0Var, e0Var.G, e0Var.H, com.tencent.mm.R.id.mkq, 0);
        }
        if (this.f272904e == null) {
            gl5.e0 e0Var2 = this.f272913q;
            this.f272904e = new gl5.a0(e0Var2, e0Var2.H, e0Var2.G, com.tencent.mm.R.id.mkp, 1);
        }
        this.f272903d.o();
        this.f272904e.o();
        this.f272913q.r();
    }

    @Override // gl5.p
    public boolean e() {
        if (this.f272912p != 0) {
            return true;
        }
        gl5.a0 a0Var = this.f272903d;
        if (a0Var != null && a0Var.f273066o) {
            return true;
        }
        gl5.a0 a0Var2 = this.f272904e;
        return a0Var2 != null && a0Var2.f273066o;
    }

    public final void f() {
        this.f272908i = -1;
        this.f272912p = 0;
        this.f272911o = false;
        gl5.e0 e0Var = this.f272913q;
        int selectionStart = e0Var.U.getSelectionStart();
        int selectionEnd = e0Var.U.getSelectionEnd();
        if (selectionStart < 0 || selectionEnd < 0) {
            android.text.Selection.removeSelection((android.text.Spannable) e0Var.U.getText());
        } else if (selectionStart > selectionEnd) {
            android.text.Selection.setSelection((android.text.Spannable) e0Var.U.getText(), selectionEnd, selectionStart);
        }
    }

    public void g() {
        this.f272906g = -1;
        this.f272905f = -1;
        f();
    }

    public final void h(android.view.MotionEvent motionEvent) {
        int i17;
        int b17;
        int i18;
        gl5.e0 e0Var = this.f272913q;
        if (e0Var.U.getLayout() != null) {
            int i19 = this.f272912p;
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView = e0Var.U;
            if (i19 == 1) {
                i(this.f272908i, customTextView.K(motionEvent.getX(), motionEvent.getY()), motionEvent.isFromSource(4098));
                return;
            }
            if (i19 != 2) {
                if (i19 != 3) {
                    return;
                }
                int K = customTextView.K(motionEvent.getX(), motionEvent.getY());
                long m17 = e0Var.m(java.lang.Math.min(K, this.f272908i), java.lang.Math.max(K, this.f272908i));
                i((int) (m17 >>> 32), jl5.b.c(m17), motionEvent.isFromSource(4098));
                return;
            }
            if (this.f272909m) {
                return;
            }
            boolean isFromSource = motionEvent.isFromSource(8194);
            android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(customTextView.getContext());
            float x17 = motionEvent.getX();
            float y17 = motionEvent.getY();
            if (isFromSource) {
                i17 = customTextView.J(y17);
            } else {
                if (this.f272911o) {
                    int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
                    gl5.a0 a0Var = this.f272903d;
                    y17 -= a0Var != null ? a0Var.getIdealVerticalOffset() : scaledTouchSlop;
                }
                i17 = e0Var.i(customTextView.getLayout(), this.f272910n, y17);
                if (!this.f272911o && i17 != this.f272910n) {
                    this.f272911o = true;
                    return;
                }
            }
            int offsetForHorizontal = customTextView.getLayout().getOffsetForHorizontal(i17, customTextView.C(x17));
            if (this.f272908i < offsetForHorizontal) {
                b17 = gl5.e0.a(e0Var, offsetForHorizontal);
                i18 = gl5.e0.b(e0Var, this.f272908i);
            } else {
                b17 = gl5.e0.b(e0Var, offsetForHorizontal);
                int a17 = gl5.e0.a(e0Var, this.f272908i);
                if (a17 == b17) {
                    b17 = e0Var.l(b17, false);
                }
                i18 = a17;
            }
            this.f272910n = i17;
            i(i18, b17, motionEvent.isFromSource(4098));
        }
    }

    public final void i(int i17, int i18, boolean z17) {
        gl5.e0 e0Var = this.f272913q;
        if (z17) {
            e0Var.getClass();
        }
        android.text.Selection.setSelection((android.text.Spannable) e0Var.U.getText(), i17, i18);
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public void onTouchModeChanged(boolean z17) {
        if (z17) {
            return;
        }
        c();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a A[RETURN] */
    @Override // gl5.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void show() {
        /*
            r4 = this;
            gl5.e0 r0 = r4.f272913q
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r1 = r0.U
            gl5.e0 r1 = r1.f211589g2
            r2 = 0
            if (r1 != 0) goto La
            goto L14
        La:
            gl5.s r3 = r1.f272953k
            if (r3 == 0) goto L16
            int r1 = r3.f273090c
            if (r1 <= 0) goto L14
            r1 = 1
            goto L18
        L14:
            r1 = r2
            goto L18
        L16:
            boolean r1 = r1.f272967y
        L18:
            if (r1 == 0) goto L1b
            return
        L1b:
            r0.w(r2)
            r4.d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gl5.b0.show():void");
    }
}
