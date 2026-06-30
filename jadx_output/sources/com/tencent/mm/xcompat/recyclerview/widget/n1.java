package com.tencent.mm.xcompat.recyclerview.widget;

/* loaded from: classes15.dex */
public final class n1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f214588a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.ArrayList f214589b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f214590c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f214591d;

    /* renamed from: e, reason: collision with root package name */
    public int f214592e;

    /* renamed from: f, reason: collision with root package name */
    public int f214593f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.xcompat.recyclerview.widget.m1 f214594g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.xcompat.recyclerview.widget.RecyclerView f214595h;

    public n1(com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView) {
        this.f214595h = recyclerView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f214588a = arrayList;
        this.f214589b = null;
        this.f214590c = new java.util.ArrayList();
        this.f214591d = java.util.Collections.unmodifiableList(arrayList);
        this.f214592e = 2;
        this.f214593f = 2;
    }

    public void a(com.tencent.mm.xcompat.recyclerview.widget.y1 y1Var, boolean z17) {
        int i17;
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView;
        com.tencent.mm.xcompat.recyclerview.widget.u0 adapter;
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.j(y1Var);
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView2 = this.f214595h;
        com.tencent.mm.xcompat.recyclerview.widget.a2 a2Var = recyclerView2.M1;
        android.view.View view = y1Var.f214703d;
        if (a2Var != null) {
            com.tencent.mm.xcompat.recyclerview.widget.z1 z1Var = a2Var.f214452f;
            n3.l1.l(view, z1Var instanceof com.tencent.mm.xcompat.recyclerview.widget.z1 ? (n3.c) ((java.util.WeakHashMap) z1Var.f214729f).remove(view) : null);
        }
        if (z17) {
            recyclerView2.getClass();
            java.util.List list = recyclerView2.f214414u;
            if (((java.util.ArrayList) list).size() > 0) {
                android.support.v4.media.f.a(((java.util.ArrayList) list).get(0));
                throw null;
            }
            if (recyclerView2.f214412s != null) {
                mf3.r rVar = (mf3.r) y1Var;
                if (rVar.f214721y == null || (recyclerView = rVar.f214720x) == null || (adapter = recyclerView.getAdapter()) == null || (i17 = rVar.f214720x.I(rVar)) == -1 || rVar.f214721y != adapter) {
                    i17 = -1;
                }
                if (i17 != -1) {
                    rVar.recycle();
                }
            }
            if (recyclerView2.F1 != null) {
                recyclerView2.f214404m.d(y1Var);
            }
            if (com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.Z1) {
                java.util.Objects.toString(y1Var);
            }
        }
        y1Var.f214721y = null;
        y1Var.f214720x = null;
        com.tencent.mm.xcompat.recyclerview.widget.m1 b17 = b();
        b17.getClass();
        int i18 = y1Var.f214708i;
        java.util.ArrayList arrayList = b17.a(i18).f214568a;
        if (((com.tencent.mm.xcompat.recyclerview.widget.l1) b17.f214580a.get(i18)).f214569b <= arrayList.size()) {
            s3.a.a(view);
        } else {
            if (com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.Y1 && arrayList.contains(y1Var)) {
                throw new java.lang.IllegalArgumentException("this scrap item already exists");
            }
            y1Var.w();
            arrayList.add(y1Var);
        }
    }

    public com.tencent.mm.xcompat.recyclerview.widget.m1 b() {
        if (this.f214594g == null) {
            this.f214594g = new com.tencent.mm.xcompat.recyclerview.widget.m1();
            c();
        }
        return this.f214594g;
    }

    public final void c() {
        if (this.f214594g != null) {
            com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView = this.f214595h;
            if (recyclerView.f214412s == null || !recyclerView.isAttachedToWindow()) {
                return;
            }
            com.tencent.mm.xcompat.recyclerview.widget.m1 m1Var = this.f214594g;
            m1Var.f214582c.add(recyclerView.f214412s);
        }
    }

    public final void d(com.tencent.mm.xcompat.recyclerview.widget.u0 u0Var, boolean z17) {
        com.tencent.mm.xcompat.recyclerview.widget.m1 m1Var = this.f214594g;
        if (m1Var == null) {
            return;
        }
        java.util.Set set = m1Var.f214582c;
        set.remove(u0Var);
        if (set.size() != 0 || z17) {
            return;
        }
        int i17 = 0;
        while (true) {
            android.util.SparseArray sparseArray = m1Var.f214580a;
            if (i17 >= sparseArray.size()) {
                return;
            }
            java.util.ArrayList arrayList = ((com.tencent.mm.xcompat.recyclerview.widget.l1) sparseArray.get(sparseArray.keyAt(i17))).f214568a;
            for (int i18 = 0; i18 < arrayList.size(); i18++) {
                s3.a.a(((com.tencent.mm.xcompat.recyclerview.widget.y1) arrayList.get(i18)).f214703d);
            }
            i17++;
        }
    }

    public void e() {
        java.util.ArrayList arrayList = this.f214590c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f(size);
        }
        arrayList.clear();
        if (com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.f214392e2) {
            com.tencent.mm.xcompat.recyclerview.widget.x xVar = this.f214595h.E1;
            int[] iArr = xVar.f214688c;
            if (iArr != null) {
                java.util.Arrays.fill(iArr, -1);
            }
            xVar.f214689d = 0;
        }
    }

    public void f(int i17) {
        boolean z17 = com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.Y1;
        java.util.ArrayList arrayList = this.f214590c;
        com.tencent.mm.xcompat.recyclerview.widget.y1 y1Var = (com.tencent.mm.xcompat.recyclerview.widget.y1) arrayList.get(i17);
        if (com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.Z1) {
            java.util.Objects.toString(y1Var);
        }
        a(y1Var, true);
        arrayList.remove(i17);
    }

    public void g(android.view.View view) {
        com.tencent.mm.xcompat.recyclerview.widget.y1 K = com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.K(view);
        boolean s17 = K.s();
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView = this.f214595h;
        if (s17) {
            recyclerView.removeDetachedView(view, false);
        }
        if (K.r()) {
            K.f214716t.k(K);
        } else {
            int i17 = K.f214712p;
            if ((i17 & 32) != 0) {
                K.f214712p = i17 & (-33);
            }
        }
        h(K);
        if (recyclerView.S == null || K.k()) {
            return;
        }
        recyclerView.S.d(K);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a1, code lost:
    
        if (r7 == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a3, code lost:
    
        r5 = r5 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a5, code lost:
    
        if (r5 < 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a7, code lost:
    
        r7 = ((com.tencent.mm.xcompat.recyclerview.widget.y1) r6.get(r5)).f214705f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b1, code lost:
    
        if (r8.f214688c == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b3, code lost:
    
        r9 = r8.f214689d * 2;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b8, code lost:
    
        if (r10 >= r9) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00be, code lost:
    
        if (r8.f214688c[r10] != r7) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c2, code lost:
    
        r10 = r10 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c0, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c6, code lost:
    
        if (r7 != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c8, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00c5, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(com.tencent.mm.xcompat.recyclerview.widget.y1 r13) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.xcompat.recyclerview.widget.n1.h(com.tencent.mm.xcompat.recyclerview.widget.y1):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i(android.view.View r6) {
        /*
            r5 = this;
            com.tencent.mm.xcompat.recyclerview.widget.y1 r6 = com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.K(r6)
            int r0 = r6.f214712p
            r1 = 12
            r1 = r1 & r0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto Lf
            r1 = r2
            goto L10
        Lf:
            r1 = r3
        L10:
            com.tencent.mm.xcompat.recyclerview.widget.RecyclerView r4 = r5.f214595h
            if (r1 != 0) goto L5f
            r0 = r0 & 2
            if (r0 == 0) goto L1a
            r0 = r2
            goto L1b
        L1a:
            r0 = r3
        L1b:
            if (r0 == 0) goto L5f
            com.tencent.mm.xcompat.recyclerview.widget.b1 r0 = r4.S
            if (r0 == 0) goto L46
            java.util.List r1 = r6.f()
            com.tencent.mm.xcompat.recyclerview.widget.q r0 = (com.tencent.mm.xcompat.recyclerview.widget.q) r0
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L40
            boolean r0 = r0.f214467g
            if (r0 == 0) goto L3a
            boolean r0 = r6.j()
            if (r0 == 0) goto L38
            goto L3a
        L38:
            r0 = r3
            goto L3b
        L3a:
            r0 = r2
        L3b:
            if (r0 == 0) goto L3e
            goto L40
        L3e:
            r0 = r3
            goto L41
        L40:
            r0 = r2
        L41:
            if (r0 == 0) goto L44
            goto L46
        L44:
            r0 = r3
            goto L47
        L46:
            r0 = r2
        L47:
            if (r0 == 0) goto L4a
            goto L5f
        L4a:
            java.util.ArrayList r0 = r5.f214589b
            if (r0 != 0) goto L55
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.f214589b = r0
        L55:
            r6.f214716t = r5
            r6.f214717u = r2
            java.util.ArrayList r0 = r5.f214589b
            r0.add(r6)
            goto L92
        L5f:
            boolean r0 = r6.j()
            if (r0 == 0) goto L89
            boolean r0 = r6.m()
            if (r0 == 0) goto L6c
            goto L89
        L6c:
            com.tencent.mm.xcompat.recyclerview.widget.u0 r6 = r4.f214412s
            r6.getClass()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool."
            r0.<init>(r1)
            java.lang.String r1 = r4.B()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L89:
            r6.f214716t = r5
            r6.f214717u = r3
            java.util.ArrayList r0 = r5.f214588a
            r0.add(r6)
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.xcompat.recyclerview.widget.n1.i(android.view.View):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:258:0x03f9, code lost:
    
        if (r10.j() == false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x044a, code lost:
    
        if ((r11 == 0 || r11 + r8 < r26) == false) goto L253;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x065b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x019e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.xcompat.recyclerview.widget.y1 j(int r24, boolean r25, long r26) {
        /*
            Method dump skipped, instructions count: 1684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.xcompat.recyclerview.widget.n1.j(int, boolean, long):com.tencent.mm.xcompat.recyclerview.widget.y1");
    }

    public void k(com.tencent.mm.xcompat.recyclerview.widget.y1 y1Var) {
        if (y1Var.f214717u) {
            this.f214589b.remove(y1Var);
        } else {
            this.f214588a.remove(y1Var);
        }
        y1Var.f214716t = null;
        y1Var.f214717u = false;
        y1Var.f214712p &= -33;
    }

    public void l() {
        com.tencent.mm.xcompat.recyclerview.widget.g1 g1Var = this.f214595h.f214413t;
        this.f214593f = this.f214592e + (g1Var != null ? g1Var.f214528h : 0);
        java.util.ArrayList arrayList = this.f214590c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f214593f; size--) {
            f(size);
        }
    }
}
