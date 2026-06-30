package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes10.dex */
public abstract class x0 extends com.tencent.mm.ui.widget.dialog.g2 {
    public com.tencent.mm.ui.widget.dialog.y1 A;
    public com.tencent.mm.plugin.finder.live.widget.x0 B;
    public kotlinx.coroutines.y0 C;
    public boolean D;
    public boolean E;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f120254e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f120255f;

    /* renamed from: g, reason: collision with root package name */
    public final zl2.u4 f120256g;

    /* renamed from: h, reason: collision with root package name */
    public final float f120257h;

    /* renamed from: i, reason: collision with root package name */
    public com.google.android.material.tabs.TabLayout f120258i;

    /* renamed from: m, reason: collision with root package name */
    public androidx.viewpager.widget.ViewPager f120259m;

    /* renamed from: n, reason: collision with root package name */
    public androidx.viewpager.widget.ViewPager.OnPageChangeListener f120260n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.f0 f120261o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f120262p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f120263q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f120264r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f120265s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f120266t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f120267u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f120268v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f120269w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f120270x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f120271y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f120272z;

    public x0(android.content.Context context, boolean z17, zl2.u4 uiMode, float f17, int i17, kotlin.jvm.internal.i iVar) {
        z17 = (i17 & 2) != 0 ? true : z17;
        uiMode = (i17 & 4) != 0 ? zl2.u4.f473988d : uiMode;
        f17 = (i17 & 8) != 0 ? -1.0f : f17;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(uiMode, "uiMode");
        this.f120254e = context;
        this.f120255f = z17;
        this.f120256g = uiMode;
        this.f120257h = f17;
        this.f120262p = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.q0(this));
        this.f120263q = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.t0(this));
        this.f120264r = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.h0(this));
        this.f120265s = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.u0(this));
        this.f120266t = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.j0(this));
        this.f120267u = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.g0(this));
        this.f120268v = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.i0(this));
        this.f120269w = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.p0(this));
        this.f120270x = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.r0(this));
        this.f120271y = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.s0(this));
        this.f120272z = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.v0(this));
    }

    public static void i(com.tencent.mm.plugin.finder.live.widget.x0 x0Var, boolean z17, int i17, java.lang.Object obj) {
        com.tencent.mm.ui.widget.dialog.y1 y1Var;
        com.tencent.mm.ui.widget.dialog.y1 y1Var2;
        com.tencent.mm.ui.widget.dialog.y1 y1Var3;
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: closePanel");
        }
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        com.tencent.mm.plugin.finder.live.widget.x0 x0Var2 = x0Var.B;
        if (x0Var2 != null) {
            if (x0Var2.u()) {
                if (z17) {
                    com.tencent.mm.plugin.finder.live.widget.x0 x0Var3 = x0Var.B;
                    if (x0Var3 != null && (y1Var3 = x0Var3.A) != null) {
                        y1Var3.g(x0Var);
                    }
                } else {
                    com.tencent.mm.plugin.finder.live.widget.x0 x0Var4 = x0Var.B;
                    if (x0Var4 != null && (y1Var2 = x0Var4.A) != null) {
                        y1Var2.c(x0Var, false);
                    }
                }
                x0Var.B = null;
                return;
            }
        }
        x0Var.B = null;
        com.tencent.mm.ui.widget.dialog.y1 y1Var4 = x0Var.A;
        if (!(y1Var4 != null && y1Var4.f()) || (y1Var = x0Var.A) == null) {
            return;
        }
        y1Var.q();
    }

    @Override // com.tencent.mm.ui.widget.dialog.g2
    public android.view.View a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        return s();
    }

    public final com.tencent.mm.plugin.finder.live.widget.x0 r(com.tencent.mm.plugin.finder.live.widget.x0 x0Var) {
        return (x0Var != null ? x0Var.B : null) == null ? x0Var : r(x0Var.B);
    }

    public final android.view.View s() {
        java.lang.Object value = ((jz5.n) this.f120265s).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final androidx.viewpager.widget.ViewPager t() {
        androidx.viewpager.widget.ViewPager viewPager = this.f120259m;
        if (viewPager != null) {
            return viewPager;
        }
        kotlin.jvm.internal.o.o("viewPager");
        throw null;
    }

    public boolean u() {
        com.tencent.mm.ui.widget.dialog.y1 y1Var;
        com.tencent.mm.ui.widget.dialog.y1 y1Var2 = this.A;
        if (y1Var2 != null && y1Var2.f()) {
            return true;
        }
        com.tencent.mm.plugin.finder.live.widget.x0 x0Var = this.B;
        return x0Var != null && (y1Var = x0Var.A) != null && y1Var.f();
    }

    public abstract void v();

    public final void w(int i17) {
        if (i17 >= 0 && i17 < ((fn2.s1) this).H.length) {
            com.google.android.material.tabs.TabLayout tabLayout = this.f120258i;
            if (tabLayout == null) {
                kotlin.jvm.internal.o.o("tabLayout");
                throw null;
            }
            oa.i k17 = tabLayout.k(i17);
            if (k17 != null) {
                k17.b();
            }
            if (t().getCurrentItem() != i17) {
                t().setCurrentItem(i17);
            }
            androidx.viewpager.widget.ViewPager.OnPageChangeListener onPageChangeListener = this.f120260n;
            if (onPageChangeListener != null) {
                onPageChangeListener.onPageSelected(i17);
            } else {
                kotlin.jvm.internal.o.o("pageChangeListener");
                throw null;
            }
        }
    }
}
