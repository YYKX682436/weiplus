package com.tencent.mm.xcompat.recyclerview.widget;

/* loaded from: classes15.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.xcompat.recyclerview.widget.e f214507a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.xcompat.recyclerview.widget.d f214508b = new com.tencent.mm.xcompat.recyclerview.widget.d();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f214509c = new java.util.ArrayList();

    public f(com.tencent.mm.xcompat.recyclerview.widget.e eVar) {
        this.f214507a = eVar;
    }

    public void a(android.view.View view, int i17, boolean z17) {
        com.tencent.mm.xcompat.recyclerview.widget.e eVar = this.f214507a;
        int a17 = i17 < 0 ? ((com.tencent.mm.xcompat.recyclerview.widget.r0) eVar).a() : f(i17);
        this.f214508b.e(a17, z17);
        if (z17) {
            i(view);
        }
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView = ((com.tencent.mm.xcompat.recyclerview.widget.r0) eVar).f214623a;
        recyclerView.addView(view, a17);
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.K(view);
        java.util.List list = recyclerView.H;
        if (list != null) {
            for (int size = ((java.util.ArrayList) list).size() - 1; size >= 0; size--) {
                ((com.tencent.mm.xcompat.viewpager2.widget.k) ((com.tencent.mm.xcompat.recyclerview.widget.h1) ((java.util.ArrayList) recyclerView.H).get(size))).getClass();
                com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.LayoutParams layoutParams = (com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams();
                if (((android.view.ViewGroup.MarginLayoutParams) layoutParams).width != -1 || ((android.view.ViewGroup.MarginLayoutParams) layoutParams).height != -1) {
                    throw new java.lang.IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
                }
            }
        }
    }

    public void b(android.view.View view, int i17, android.view.ViewGroup.LayoutParams layoutParams, boolean z17) {
        com.tencent.mm.xcompat.recyclerview.widget.e eVar = this.f214507a;
        int a17 = i17 < 0 ? ((com.tencent.mm.xcompat.recyclerview.widget.r0) eVar).a() : f(i17);
        this.f214508b.e(a17, z17);
        if (z17) {
            i(view);
        }
        com.tencent.mm.xcompat.recyclerview.widget.r0 r0Var = (com.tencent.mm.xcompat.recyclerview.widget.r0) eVar;
        r0Var.getClass();
        com.tencent.mm.xcompat.recyclerview.widget.y1 K = com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.K(view);
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView = r0Var.f214623a;
        if (K != null) {
            if (!K.s() && !K.y()) {
                throw new java.lang.IllegalArgumentException("Called attach on a child which is not detached: " + K + recyclerView.B());
            }
            if (com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.Z1) {
                K.toString();
            }
            K.f214712p &= -257;
        } else if (com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.Y1) {
            throw new java.lang.IllegalArgumentException("No ViewHolder found for child: " + view + ", index: " + a17 + recyclerView.B());
        }
        recyclerView.attachViewToParent(view, a17, layoutParams);
    }

    public void c(int i17) {
        int f17 = f(i17);
        this.f214508b.f(f17);
        com.tencent.mm.xcompat.recyclerview.widget.r0 r0Var = (com.tencent.mm.xcompat.recyclerview.widget.r0) this.f214507a;
        android.view.View childAt = r0Var.f214623a.getChildAt(f17);
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView = r0Var.f214623a;
        if (childAt != null) {
            com.tencent.mm.xcompat.recyclerview.widget.y1 K = com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.K(childAt);
            if (K != null) {
                if (K.s() && !K.y()) {
                    throw new java.lang.IllegalArgumentException("called detach on an already detached child " + K + recyclerView.B());
                }
                if (com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.Z1) {
                    K.toString();
                }
                K.c(256);
            }
        } else if (com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.Y1) {
            throw new java.lang.IllegalArgumentException("No view at offset " + f17 + recyclerView.B());
        }
        recyclerView.detachViewFromParent(f17);
    }

    public android.view.View d(int i17) {
        return ((com.tencent.mm.xcompat.recyclerview.widget.r0) this.f214507a).f214623a.getChildAt(f(i17));
    }

    public int e() {
        return ((com.tencent.mm.xcompat.recyclerview.widget.r0) this.f214507a).a() - ((java.util.ArrayList) this.f214509c).size();
    }

    public final int f(int i17) {
        if (i17 < 0) {
            return -1;
        }
        int a17 = ((com.tencent.mm.xcompat.recyclerview.widget.r0) this.f214507a).a();
        int i18 = i17;
        while (i18 < a17) {
            com.tencent.mm.xcompat.recyclerview.widget.d dVar = this.f214508b;
            int b17 = i17 - (i18 - dVar.b(i18));
            if (b17 == 0) {
                while (dVar.d(i18)) {
                    i18++;
                }
                return i18;
            }
            i18 += b17;
        }
        return -1;
    }

    public android.view.View g(int i17) {
        return ((com.tencent.mm.xcompat.recyclerview.widget.r0) this.f214507a).f214623a.getChildAt(i17);
    }

    public int h() {
        return ((com.tencent.mm.xcompat.recyclerview.widget.r0) this.f214507a).a();
    }

    public final void i(android.view.View view) {
        ((java.util.ArrayList) this.f214509c).add(view);
        com.tencent.mm.xcompat.recyclerview.widget.r0 r0Var = (com.tencent.mm.xcompat.recyclerview.widget.r0) this.f214507a;
        r0Var.getClass();
        com.tencent.mm.xcompat.recyclerview.widget.y1 K = com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.K(view);
        if (K != null) {
            int i17 = K.f214719w;
            android.view.View view2 = K.f214703d;
            if (i17 != -1) {
                K.f214718v = i17;
            } else {
                java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                K.f214718v = n3.u0.c(view2);
            }
            com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView = r0Var.f214623a;
            if (recyclerView.L()) {
                K.f214719w = 4;
                ((java.util.ArrayList) recyclerView.S1).add(K);
            } else {
                java.util.WeakHashMap weakHashMap2 = n3.l1.f334362a;
                n3.u0.s(view2, 4);
            }
        }
    }

    public boolean j(android.view.View view) {
        return ((java.util.ArrayList) this.f214509c).contains(view);
    }

    public final boolean k(android.view.View view) {
        if (!((java.util.ArrayList) this.f214509c).remove(view)) {
            return false;
        }
        com.tencent.mm.xcompat.recyclerview.widget.r0 r0Var = (com.tencent.mm.xcompat.recyclerview.widget.r0) this.f214507a;
        r0Var.getClass();
        com.tencent.mm.xcompat.recyclerview.widget.y1 K = com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.K(view);
        if (K == null) {
            return true;
        }
        int i17 = K.f214718v;
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView = r0Var.f214623a;
        if (recyclerView.L()) {
            K.f214719w = i17;
            ((java.util.ArrayList) recyclerView.S1).add(K);
        } else {
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.u0.s(K.f214703d, i17);
        }
        K.f214718v = 0;
        return true;
    }

    public java.lang.String toString() {
        return this.f214508b.toString() + ", hidden list:" + ((java.util.ArrayList) this.f214509c).size();
    }
}
