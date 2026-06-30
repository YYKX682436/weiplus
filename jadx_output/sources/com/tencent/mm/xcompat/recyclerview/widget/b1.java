package com.tencent.mm.xcompat.recyclerview.widget;

/* loaded from: classes15.dex */
public abstract class b1 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.xcompat.recyclerview.widget.z0 f214461a = null;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f214462b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final long f214463c = 120;

    /* renamed from: d, reason: collision with root package name */
    public final long f214464d = 120;

    /* renamed from: e, reason: collision with root package name */
    public final long f214465e = 250;

    /* renamed from: f, reason: collision with root package name */
    public final long f214466f = 250;

    public static int b(com.tencent.mm.xcompat.recyclerview.widget.y1 y1Var) {
        int i17 = y1Var.f214712p & 14;
        if (y1Var.j()) {
            return 4;
        }
        if ((i17 & 4) != 0) {
            return i17;
        }
        int i18 = y1Var.f214706g;
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView = y1Var.f214720x;
        int I = recyclerView == null ? -1 : recyclerView.I(y1Var);
        return (i18 == -1 || I == -1 || i18 == I) ? i17 : i17 | 2048;
    }

    public abstract boolean a(com.tencent.mm.xcompat.recyclerview.widget.y1 y1Var, com.tencent.mm.xcompat.recyclerview.widget.y1 y1Var2, com.tencent.mm.xcompat.recyclerview.widget.a1 a1Var, com.tencent.mm.xcompat.recyclerview.widget.a1 a1Var2);

    public final void c(com.tencent.mm.xcompat.recyclerview.widget.y1 y1Var) {
        com.tencent.mm.xcompat.recyclerview.widget.z0 z0Var = this.f214461a;
        if (z0Var != null) {
            com.tencent.mm.xcompat.recyclerview.widget.c1 c1Var = (com.tencent.mm.xcompat.recyclerview.widget.c1) z0Var;
            boolean z17 = true;
            y1Var.x(true);
            if (y1Var.f214710n != null && y1Var.f214711o == null) {
                y1Var.f214710n = null;
            }
            y1Var.f214711o = null;
            if ((y1Var.f214712p & 16) != 0) {
                return;
            }
            com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView = c1Var.f214486a;
            recyclerView.f0();
            com.tencent.mm.xcompat.recyclerview.widget.f fVar = recyclerView.f214402i;
            com.tencent.mm.xcompat.recyclerview.widget.r0 r0Var = (com.tencent.mm.xcompat.recyclerview.widget.r0) fVar.f214507a;
            com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView2 = r0Var.f214623a;
            android.view.View view = y1Var.f214703d;
            int indexOfChild = recyclerView2.indexOfChild(view);
            if (indexOfChild == -1) {
                fVar.k(view);
            } else {
                com.tencent.mm.xcompat.recyclerview.widget.d dVar = fVar.f214508b;
                if (dVar.d(indexOfChild)) {
                    dVar.f(indexOfChild);
                    fVar.k(view);
                    r0Var.b(indexOfChild);
                } else {
                    z17 = false;
                }
            }
            if (z17) {
                com.tencent.mm.xcompat.recyclerview.widget.y1 K = com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.K(view);
                com.tencent.mm.xcompat.recyclerview.widget.n1 n1Var = recyclerView.f214399f;
                n1Var.k(K);
                n1Var.h(K);
                if (com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.Z1) {
                    java.util.Objects.toString(view);
                    recyclerView.toString();
                }
            }
            recyclerView.g0(!z17);
            if (z17 || !y1Var.s()) {
                return;
            }
            recyclerView.removeDetachedView(view, false);
        }
    }

    public abstract void d(com.tencent.mm.xcompat.recyclerview.widget.y1 y1Var);

    public abstract void e();

    public abstract boolean f();
}
