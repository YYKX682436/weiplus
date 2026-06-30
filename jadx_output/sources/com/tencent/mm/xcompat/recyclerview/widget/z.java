package com.tencent.mm.xcompat.recyclerview.widget;

/* loaded from: classes15.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.ThreadLocal f214722h = new java.lang.ThreadLocal();

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.Comparator f214723i = new com.tencent.mm.xcompat.recyclerview.widget.w();

    /* renamed from: e, reason: collision with root package name */
    public long f214725e;

    /* renamed from: f, reason: collision with root package name */
    public long f214726f;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f214724d = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f214727g = new java.util.ArrayList();

    public void a(com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        if (recyclerView.isAttachedToWindow()) {
            if (com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.Y1 && !this.f214724d.contains(recyclerView)) {
                throw new java.lang.IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f214725e == 0) {
                this.f214725e = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        com.tencent.mm.xcompat.recyclerview.widget.x xVar = recyclerView.E1;
        xVar.f214686a = i17;
        xVar.f214687b = i18;
    }

    public void b(long j17) {
        com.tencent.mm.xcompat.recyclerview.widget.y yVar;
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView;
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView2;
        com.tencent.mm.xcompat.recyclerview.widget.y yVar2;
        java.util.ArrayList arrayList = this.f214724d;
        int size = arrayList.size();
        int i17 = 0;
        for (int i18 = 0; i18 < size; i18++) {
            com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView3 = (com.tencent.mm.xcompat.recyclerview.widget.RecyclerView) arrayList.get(i18);
            if (recyclerView3.getWindowVisibility() == 0) {
                com.tencent.mm.xcompat.recyclerview.widget.x xVar = recyclerView3.E1;
                xVar.b(recyclerView3, false);
                i17 += xVar.f214689d;
            }
        }
        java.util.ArrayList arrayList2 = this.f214727g;
        arrayList2.ensureCapacity(i17);
        int i19 = 0;
        for (int i27 = 0; i27 < size; i27++) {
            com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView4 = (com.tencent.mm.xcompat.recyclerview.widget.RecyclerView) arrayList.get(i27);
            if (recyclerView4.getWindowVisibility() == 0) {
                com.tencent.mm.xcompat.recyclerview.widget.x xVar2 = recyclerView4.E1;
                int abs = java.lang.Math.abs(xVar2.f214686a) + java.lang.Math.abs(xVar2.f214687b);
                for (int i28 = 0; i28 < xVar2.f214689d * 2; i28 += 2) {
                    if (i19 >= arrayList2.size()) {
                        yVar2 = new com.tencent.mm.xcompat.recyclerview.widget.y();
                        arrayList2.add(yVar2);
                    } else {
                        yVar2 = (com.tencent.mm.xcompat.recyclerview.widget.y) arrayList2.get(i19);
                    }
                    int[] iArr = xVar2.f214688c;
                    int i29 = iArr[i28 + 1];
                    yVar2.f214697a = i29 <= abs;
                    yVar2.f214698b = abs;
                    yVar2.f214699c = i29;
                    yVar2.f214700d = recyclerView4;
                    yVar2.f214701e = iArr[i28];
                    i19++;
                }
            }
        }
        java.util.Collections.sort(arrayList2, f214723i);
        for (int i37 = 0; i37 < arrayList2.size() && (recyclerView = (yVar = (com.tencent.mm.xcompat.recyclerview.widget.y) arrayList2.get(i37)).f214700d) != null; i37++) {
            com.tencent.mm.xcompat.recyclerview.widget.y1 c17 = c(recyclerView, yVar.f214701e, yVar.f214697a ? com.tencent.wcdb.core.Database.DictDefaultMatchValue : j17);
            if (c17 != null && c17.f214704e != null && c17.h() && !c17.j() && (recyclerView2 = (com.tencent.mm.xcompat.recyclerview.widget.RecyclerView) c17.f214704e.get()) != null) {
                if (recyclerView2.I && recyclerView2.f214402i.h() != 0) {
                    com.tencent.mm.xcompat.recyclerview.widget.b1 b1Var = recyclerView2.S;
                    if (b1Var != null) {
                        b1Var.e();
                    }
                    com.tencent.mm.xcompat.recyclerview.widget.g1 g1Var = recyclerView2.f214413t;
                    com.tencent.mm.xcompat.recyclerview.widget.n1 n1Var = recyclerView2.f214399f;
                    if (g1Var != null) {
                        g1Var.v(n1Var);
                        recyclerView2.f214413t.w(n1Var);
                    }
                    n1Var.f214588a.clear();
                    n1Var.e();
                }
                com.tencent.mm.xcompat.recyclerview.widget.x xVar3 = recyclerView2.E1;
                xVar3.b(recyclerView2, true);
                if (xVar3.f214689d != 0) {
                    try {
                        java.lang.reflect.Method method = j3.v.f297343b;
                        j3.t.a("RV Nested Prefetch");
                        com.tencent.mm.xcompat.recyclerview.widget.u1 u1Var = recyclerView2.F1;
                        com.tencent.mm.xcompat.recyclerview.widget.u0 u0Var = recyclerView2.f214412s;
                        u1Var.f214649d = 1;
                        u1Var.f214650e = u0Var.a();
                        u1Var.f214652g = false;
                        u1Var.f214653h = false;
                        u1Var.f214654i = false;
                        for (int i38 = 0; i38 < xVar3.f214689d * 2; i38 += 2) {
                            c(recyclerView2, xVar3.f214688c[i38], j17);
                        }
                        j3.t.b();
                        yVar.f214697a = false;
                        yVar.f214698b = 0;
                        yVar.f214699c = 0;
                        yVar.f214700d = null;
                        yVar.f214701e = 0;
                    } catch (java.lang.Throwable th6) {
                        java.lang.reflect.Method method2 = j3.v.f297343b;
                        j3.t.b();
                        throw th6;
                    }
                }
            }
            yVar.f214697a = false;
            yVar.f214698b = 0;
            yVar.f214699c = 0;
            yVar.f214700d = null;
            yVar.f214701e = 0;
        }
    }

    public final com.tencent.mm.xcompat.recyclerview.widget.y1 c(com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView, int i17, long j17) {
        boolean z17;
        int h17 = recyclerView.f214402i.h();
        int i18 = 0;
        while (true) {
            if (i18 >= h17) {
                z17 = false;
                break;
            }
            com.tencent.mm.xcompat.recyclerview.widget.y1 K = com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.K(recyclerView.f214402i.g(i18));
            if (K.f214705f == i17 && !K.j()) {
                z17 = true;
                break;
            }
            i18++;
        }
        if (z17) {
            return null;
        }
        com.tencent.mm.xcompat.recyclerview.widget.n1 n1Var = recyclerView.f214399f;
        try {
            recyclerView.P();
            com.tencent.mm.xcompat.recyclerview.widget.y1 j18 = n1Var.j(i17, false, j17);
            if (j18 != null) {
                if (!j18.h() || j18.j()) {
                    n1Var.a(j18, false);
                } else {
                    n1Var.g(j18.f214703d);
                }
            }
            return j18;
        } finally {
            recyclerView.Q(false);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            java.lang.reflect.Method method = j3.v.f297343b;
            j3.t.a("RV Prefetch");
            java.util.ArrayList arrayList = this.f214724d;
            if (arrayList.isEmpty()) {
                this.f214725e = 0L;
                j3.t.b();
                return;
            }
            int size = arrayList.size();
            long j17 = 0;
            for (int i17 = 0; i17 < size; i17++) {
                com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView = (com.tencent.mm.xcompat.recyclerview.widget.RecyclerView) arrayList.get(i17);
                if (recyclerView.getWindowVisibility() == 0) {
                    j17 = java.lang.Math.max(recyclerView.getDrawingTime(), j17);
                }
            }
            if (j17 == 0) {
                this.f214725e = 0L;
                j3.t.b();
            } else {
                b(java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(j17) + this.f214726f);
                this.f214725e = 0L;
                j3.t.b();
            }
        } catch (java.lang.Throwable th6) {
            this.f214725e = 0L;
            java.lang.reflect.Method method2 = j3.v.f297343b;
            j3.t.b();
            throw th6;
        }
    }
}
