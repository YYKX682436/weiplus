package com.tencent.mm.xcompat.recyclerview.widget;

/* loaded from: classes15.dex */
public class x1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f214690d;

    /* renamed from: e, reason: collision with root package name */
    public int f214691e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.OverScroller f214692f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.animation.Interpolator f214693g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f214694h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f214695i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.xcompat.recyclerview.widget.RecyclerView f214696m;

    public x1(com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView) {
        this.f214696m = recyclerView;
        android.view.animation.Interpolator interpolator = com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.f214394g2;
        this.f214693g = interpolator;
        this.f214694h = false;
        this.f214695i = false;
        this.f214692f = new android.widget.OverScroller(recyclerView.getContext(), interpolator);
    }

    public void a(int i17, int i18) {
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView = this.f214696m;
        recyclerView.setScrollState(2);
        this.f214691e = 0;
        this.f214690d = 0;
        android.view.animation.Interpolator interpolator = this.f214693g;
        android.view.animation.Interpolator interpolator2 = com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.f214394g2;
        if (interpolator != interpolator2) {
            this.f214693g = interpolator2;
            this.f214692f = new android.widget.OverScroller(recyclerView.getContext(), interpolator2);
        }
        this.f214692f.fling(0, 0, i17, i18, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        b();
    }

    public void b() {
        if (this.f214694h) {
            this.f214695i = true;
            return;
        }
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView = this.f214696m;
        recyclerView.removeCallbacks(this);
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.u0.m(recyclerView, this);
    }

    public void c(int i17, int i18, int i19, android.view.animation.Interpolator interpolator) {
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView = this.f214696m;
        if (i19 == Integer.MIN_VALUE) {
            int abs = java.lang.Math.abs(i17);
            int abs2 = java.lang.Math.abs(i18);
            boolean z17 = abs > abs2;
            int width = z17 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z17) {
                abs = abs2;
            }
            i19 = java.lang.Math.min((int) (((abs / width) + 1.0f) * 300.0f), 2000);
        }
        int i27 = i19;
        if (interpolator == null) {
            interpolator = com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.f214394g2;
        }
        if (this.f214693g != interpolator) {
            this.f214693g = interpolator;
            this.f214692f = new android.widget.OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f214691e = 0;
        this.f214690d = 0;
        recyclerView.setScrollState(2);
        this.f214692f.startScroll(0, 0, i17, i18, i27);
        b();
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        int i18;
        int i19;
        int i27;
        boolean awakenScrollBars;
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView = this.f214696m;
        if (recyclerView.f214413t == null) {
            recyclerView.removeCallbacks(this);
            this.f214692f.abortAnimation();
            return;
        }
        this.f214695i = false;
        this.f214694h = true;
        recyclerView.n();
        android.widget.OverScroller overScroller = this.f214692f;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i28 = currX - this.f214690d;
            int i29 = currY - this.f214691e;
            this.f214690d = currX;
            this.f214691e = currY;
            int m17 = recyclerView.m(i28, recyclerView.N, recyclerView.Q, recyclerView.getWidth());
            int m18 = recyclerView.m(i29, recyclerView.P, recyclerView.R, recyclerView.getHeight());
            int[] iArr = recyclerView.R1;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean u17 = recyclerView.u(m17, m18, iArr, null, 1);
            int[] iArr2 = recyclerView.R1;
            if (u17) {
                m17 -= iArr2[0];
                m18 -= iArr2[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.l(m17, m18);
            }
            if (recyclerView.f214412s != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                recyclerView.a0(m17, m18, iArr2);
                int i37 = iArr2[0];
                int i38 = iArr2[1];
                int i39 = m17 - i37;
                int i47 = m18 - i38;
                com.tencent.mm.xcompat.recyclerview.widget.t1 t1Var = recyclerView.f214413t.f214525e;
                if (t1Var != null && !t1Var.f214639d && t1Var.f214640e) {
                    int b17 = recyclerView.F1.b();
                    if (b17 == 0) {
                        t1Var.c();
                    } else if (t1Var.f214636a >= b17) {
                        t1Var.f214636a = b17 - 1;
                        t1Var.a(i37, i38);
                    } else {
                        t1Var.a(i37, i38);
                    }
                }
                i27 = i37;
                i17 = i39;
                i18 = i47;
                i19 = i38;
            } else {
                i17 = m17;
                i18 = m18;
                i19 = 0;
                i27 = 0;
            }
            if (!recyclerView.f214415v.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.R1;
            iArr3[0] = 0;
            iArr3[1] = 0;
            int i48 = i19;
            recyclerView.v(i27, i19, i17, i18, null, 1, iArr3);
            int i49 = i17 - iArr2[0];
            int i57 = i18 - iArr2[1];
            if (i27 != 0 || i48 != 0) {
                recyclerView.w(i27, i48);
            }
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            boolean z17 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i49 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i57 != 0));
            com.tencent.mm.xcompat.recyclerview.widget.t1 t1Var2 = recyclerView.f214413t.f214525e;
            if ((t1Var2 != null && t1Var2.f214639d) || !z17) {
                b();
                com.tencent.mm.xcompat.recyclerview.widget.z zVar = recyclerView.D1;
                if (zVar != null) {
                    zVar.a(recyclerView, i27, i48);
                }
            } else {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i58 = i49 < 0 ? -currVelocity : i49 > 0 ? currVelocity : 0;
                    if (i57 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i57 <= 0) {
                        currVelocity = 0;
                    }
                    if (i58 < 0) {
                        recyclerView.y();
                        if (recyclerView.N.isFinished()) {
                            recyclerView.N.onAbsorb(-i58);
                        }
                    } else if (i58 > 0) {
                        recyclerView.z();
                        if (recyclerView.Q.isFinished()) {
                            recyclerView.Q.onAbsorb(i58);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.A();
                        if (recyclerView.P.isFinished()) {
                            recyclerView.P.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.x();
                        if (recyclerView.R.isFinished()) {
                            recyclerView.R.onAbsorb(currVelocity);
                        }
                    }
                    if (i58 != 0 || currVelocity != 0) {
                        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                        n3.u0.k(recyclerView);
                    }
                }
                if (com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.f214392e2) {
                    com.tencent.mm.xcompat.recyclerview.widget.x xVar = recyclerView.E1;
                    int[] iArr4 = xVar.f214688c;
                    if (iArr4 != null) {
                        java.util.Arrays.fill(iArr4, -1);
                    }
                    xVar.f214689d = 0;
                }
            }
        }
        com.tencent.mm.xcompat.recyclerview.widget.t1 t1Var3 = recyclerView.f214413t.f214525e;
        if (t1Var3 != null && t1Var3.f214639d) {
            t1Var3.a(0, 0);
        }
        this.f214694h = false;
        if (!this.f214695i) {
            recyclerView.setScrollState(0);
            recyclerView.p(1);
        } else {
            recyclerView.removeCallbacks(this);
            java.util.WeakHashMap weakHashMap2 = n3.l1.f334362a;
            n3.u0.m(recyclerView, this);
        }
    }
}
