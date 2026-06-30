package com.tencent.mm.xcompat.recyclerview.widget;

/* loaded from: classes15.dex */
public abstract class g1 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.xcompat.recyclerview.widget.f f214521a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.xcompat.recyclerview.widget.RecyclerView f214522b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.xcompat.recyclerview.widget.i2 f214523c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.xcompat.recyclerview.widget.i2 f214524d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.xcompat.recyclerview.widget.t1 f214525e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f214526f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f214527g;

    /* renamed from: h, reason: collision with root package name */
    public int f214528h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f214529i;

    /* renamed from: j, reason: collision with root package name */
    public int f214530j;

    /* renamed from: k, reason: collision with root package name */
    public int f214531k;

    /* renamed from: l, reason: collision with root package name */
    public int f214532l;

    /* renamed from: m, reason: collision with root package name */
    public int f214533m;

    public g1() {
        com.tencent.mm.xcompat.recyclerview.widget.e1 e1Var = new com.tencent.mm.xcompat.recyclerview.widget.e1(this);
        com.tencent.mm.xcompat.recyclerview.widget.f1 f1Var = new com.tencent.mm.xcompat.recyclerview.widget.f1(this);
        this.f214523c = new com.tencent.mm.xcompat.recyclerview.widget.i2(e1Var);
        this.f214524d = new com.tencent.mm.xcompat.recyclerview.widget.i2(f1Var);
        this.f214526f = true;
        this.f214527g = true;
    }

    public static int d(int i17, int i18, int i19) {
        int mode = android.view.View.MeasureSpec.getMode(i17);
        int size = android.view.View.MeasureSpec.getSize(i17);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? java.lang.Math.max(i18, i19) : size : java.lang.Math.min(size, java.lang.Math.max(i18, i19));
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        if (r5 == 1073741824) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int i(int r4, int r5, int r6, int r7, boolean r8) {
        /*
            int r4 = r4 - r6
            r6 = 0
            int r4 = java.lang.Math.max(r6, r4)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r8 == 0) goto L1a
            if (r7 < 0) goto L11
            goto L1c
        L11:
            if (r7 != r1) goto L2f
            if (r5 == r2) goto L20
            if (r5 == 0) goto L2f
            if (r5 == r3) goto L20
            goto L2f
        L1a:
            if (r7 < 0) goto L1e
        L1c:
            r5 = r3
            goto L31
        L1e:
            if (r7 != r1) goto L22
        L20:
            r7 = r4
            goto L31
        L22:
            if (r7 != r0) goto L2f
            if (r5 == r2) goto L2c
            if (r5 != r3) goto L29
            goto L2c
        L29:
            r7 = r4
            r5 = r6
            goto L31
        L2c:
            r7 = r4
            r5 = r2
            goto L31
        L2f:
            r5 = r6
            r7 = r5
        L31:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.xcompat.recyclerview.widget.g1.i(int, int, int, int, boolean):int");
    }

    public static boolean s(int i17, int i18, int i19) {
        int mode = android.view.View.MeasureSpec.getMode(i18);
        int size = android.view.View.MeasureSpec.getSize(i18);
        if (i19 > 0 && i17 != i19) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i17;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i17;
        }
        return true;
    }

    public void A(int i17, int i18) {
        this.f214532l = android.view.View.MeasureSpec.getSize(i17);
        int mode = android.view.View.MeasureSpec.getMode(i17);
        this.f214530j = mode;
        if (mode == 0 && !com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.f214390c2) {
            this.f214532l = 0;
        }
        this.f214533m = android.view.View.MeasureSpec.getSize(i18);
        int mode2 = android.view.View.MeasureSpec.getMode(i18);
        this.f214531k = mode2;
        if (mode2 != 0 || com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.f214390c2) {
            return;
        }
        this.f214533m = 0;
    }

    public void B(int i17, int i18) {
        int h17 = h();
        if (h17 == 0) {
            this.f214522b.o(i17, i18);
            return;
        }
        int i19 = Integer.MIN_VALUE;
        int i27 = Integer.MAX_VALUE;
        int i28 = 0;
        int i29 = Integer.MIN_VALUE;
        int i37 = Integer.MAX_VALUE;
        while (i28 < h17) {
            android.view.View g17 = g(i28);
            android.graphics.Rect rect = this.f214522b.f214407p;
            boolean z17 = com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.Y1;
            com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.LayoutParams layoutParams = (com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.LayoutParams) g17.getLayoutParams();
            android.graphics.Rect rect2 = layoutParams.f214426b;
            int i38 = h17;
            rect.set((g17.getLeft() - rect2.left) - ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin, (g17.getTop() - rect2.top) - ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin, g17.getRight() + rect2.right + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).rightMargin, g17.getBottom() + rect2.bottom + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
            int i39 = rect.left;
            if (i39 < i37) {
                i37 = i39;
            }
            int i47 = rect.right;
            if (i47 > i19) {
                i19 = i47;
            }
            int i48 = rect.top;
            if (i48 < i27) {
                i27 = i48;
            }
            int i49 = rect.bottom;
            if (i49 > i29) {
                i29 = i49;
            }
            i28++;
            h17 = i38;
        }
        this.f214522b.f214407p.set(i37, i27, i19, i29);
        android.graphics.Rect rect3 = this.f214522b.f214407p;
        int width = rect3.width() + l() + m();
        int height = rect3.height() + n() + k();
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView = this.f214522b;
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.f(this.f214522b, d(i17, width, n3.u0.e(recyclerView)), d(i18, height, n3.u0.d(this.f214522b)));
    }

    public void C(com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f214522b = null;
            this.f214521a = null;
            this.f214532l = 0;
            this.f214533m = 0;
        } else {
            this.f214522b = recyclerView;
            this.f214521a = recyclerView.f214402i;
            this.f214532l = recyclerView.getWidth();
            this.f214533m = recyclerView.getHeight();
        }
        this.f214530j = 1073741824;
        this.f214531k = 1073741824;
    }

    public void D(com.tencent.mm.xcompat.recyclerview.widget.t1 t1Var) {
        com.tencent.mm.xcompat.recyclerview.widget.t1 t1Var2 = this.f214525e;
        if (t1Var2 != null && t1Var != t1Var2 && t1Var2.f214640e) {
            t1Var2.c();
        }
        this.f214525e = t1Var;
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView = this.f214522b;
        t1Var.getClass();
        com.tencent.mm.xcompat.recyclerview.widget.x1 x1Var = recyclerView.C1;
        x1Var.f214696m.removeCallbacks(x1Var);
        x1Var.f214692f.abortAnimation();
        t1Var.f214637b = recyclerView;
        t1Var.f214638c = this;
        int i17 = t1Var.f214636a;
        if (i17 == -1) {
            throw new java.lang.IllegalArgumentException("Invalid target position");
        }
        recyclerView.F1.f214646a = i17;
        t1Var.f214640e = true;
        t1Var.f214639d = true;
        t1Var.f214641f = recyclerView.f214413t.e(i17);
        t1Var.f214637b.C1.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.view.View r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.xcompat.recyclerview.widget.g1.a(android.view.View, int, boolean):void");
    }

    public abstract boolean b();

    public abstract boolean c();

    public abstract android.view.View e(int i17);

    public int f(android.view.View view) {
        return ((com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams()).f214426b.bottom;
    }

    public android.view.View g(int i17) {
        com.tencent.mm.xcompat.recyclerview.widget.f fVar = this.f214521a;
        if (fVar != null) {
            return fVar.d(i17);
        }
        return null;
    }

    public int h() {
        com.tencent.mm.xcompat.recyclerview.widget.f fVar = this.f214521a;
        if (fVar != null) {
            return fVar.e();
        }
        return 0;
    }

    public int j(android.view.View view) {
        return ((com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams()).f214426b.left;
    }

    public int k() {
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView = this.f214522b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public int l() {
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView = this.f214522b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public int m() {
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView = this.f214522b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public int n() {
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView = this.f214522b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int o(android.view.View view) {
        return ((com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams()).a();
    }

    public int p(android.view.View view) {
        return ((com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams()).f214426b.right;
    }

    public int q(android.view.View view) {
        return ((com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams()).f214426b.top;
    }

    public void r(android.view.View view, boolean z17, android.graphics.Rect rect) {
        android.graphics.Matrix matrix;
        if (z17) {
            android.graphics.Rect rect2 = ((com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams()).f214426b;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        } else {
            rect.set(0, 0, view.getWidth(), view.getHeight());
        }
        if (this.f214522b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            android.graphics.RectF rectF = this.f214522b.f214411r;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) java.lang.Math.floor(rectF.left), (int) java.lang.Math.floor(rectF.top), (int) java.lang.Math.ceil(rectF.right), (int) java.lang.Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract android.view.View t(android.view.View view, int i17, com.tencent.mm.xcompat.recyclerview.widget.n1 n1Var, com.tencent.mm.xcompat.recyclerview.widget.u1 u1Var);

    public abstract void u(com.tencent.mm.xcompat.recyclerview.widget.n1 n1Var, com.tencent.mm.xcompat.recyclerview.widget.u1 u1Var);

    public void v(com.tencent.mm.xcompat.recyclerview.widget.n1 n1Var) {
        int h17 = h();
        while (true) {
            h17--;
            if (h17 < 0) {
                return;
            }
            if (!com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.K(g(h17)).y()) {
                android.view.View g17 = g(h17);
                x(h17);
                n1Var.g(g17);
            }
        }
    }

    public void w(com.tencent.mm.xcompat.recyclerview.widget.n1 n1Var) {
        java.util.ArrayList arrayList;
        int size = n1Var.f214588a.size();
        int i17 = size - 1;
        while (true) {
            arrayList = n1Var.f214588a;
            if (i17 < 0) {
                break;
            }
            android.view.View view = ((com.tencent.mm.xcompat.recyclerview.widget.y1) arrayList.get(i17)).f214703d;
            com.tencent.mm.xcompat.recyclerview.widget.y1 K = com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.K(view);
            if (!K.y()) {
                K.x(false);
                if (K.s()) {
                    this.f214522b.removeDetachedView(view, false);
                }
                com.tencent.mm.xcompat.recyclerview.widget.b1 b1Var = this.f214522b.S;
                if (b1Var != null) {
                    b1Var.d(K);
                }
                K.x(true);
                com.tencent.mm.xcompat.recyclerview.widget.y1 K2 = com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.K(view);
                K2.f214716t = null;
                K2.f214717u = false;
                K2.f214712p &= -33;
                n1Var.h(K2);
            }
            i17--;
        }
        arrayList.clear();
        java.util.ArrayList arrayList2 = n1Var.f214589b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f214522b.invalidate();
        }
    }

    public void x(int i17) {
        if (g(i17) != null) {
            com.tencent.mm.xcompat.recyclerview.widget.f fVar = this.f214521a;
            int f17 = fVar.f(i17);
            com.tencent.mm.xcompat.recyclerview.widget.r0 r0Var = (com.tencent.mm.xcompat.recyclerview.widget.r0) fVar.f214507a;
            android.view.View childAt = r0Var.f214623a.getChildAt(f17);
            if (childAt == null) {
                return;
            }
            if (fVar.f214508b.f(f17)) {
                fVar.k(childAt);
            }
            r0Var.b(f17);
        }
    }

    public abstract void y(int i17);

    public void z(com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView) {
        A(android.view.View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }
}
