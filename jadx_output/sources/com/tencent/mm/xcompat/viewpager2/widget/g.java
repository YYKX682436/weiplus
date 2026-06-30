package com.tencent.mm.xcompat.viewpager2.widget;

/* loaded from: classes15.dex */
public final class g extends com.tencent.mm.xcompat.recyclerview.widget.k1 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.xcompat.viewpager2.widget.o f214761a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.xcompat.viewpager2.widget.ViewPager2 f214762b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.xcompat.recyclerview.widget.RecyclerView f214763c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.xcompat.recyclerview.widget.e0 f214764d;

    /* renamed from: e, reason: collision with root package name */
    public int f214765e;

    /* renamed from: f, reason: collision with root package name */
    public int f214766f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.xcompat.viewpager2.widget.f f214767g;

    /* renamed from: h, reason: collision with root package name */
    public int f214768h;

    /* renamed from: i, reason: collision with root package name */
    public int f214769i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f214770j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f214771k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f214772l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f214773m;

    public g(com.tencent.mm.xcompat.viewpager2.widget.ViewPager2 viewPager2) {
        this.f214762b = viewPager2;
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView = viewPager2.f214741p;
        this.f214763c = recyclerView;
        this.f214764d = (com.tencent.mm.xcompat.recyclerview.widget.e0) recyclerView.getLayoutManager();
        this.f214767g = new com.tencent.mm.xcompat.viewpager2.widget.f();
        d();
    }

    @Override // com.tencent.mm.xcompat.recyclerview.widget.k1
    public void a(com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView, int i17) {
        com.tencent.mm.xcompat.viewpager2.widget.o oVar;
        com.tencent.mm.xcompat.viewpager2.widget.o oVar2;
        int i18 = this.f214765e;
        boolean z17 = true;
        if (!(i18 == 1 && this.f214766f == 1) && i17 == 1) {
            this.f214773m = false;
            this.f214765e = 1;
            int i19 = this.f214769i;
            if (i19 != -1) {
                this.f214768h = i19;
                this.f214769i = -1;
            } else if (this.f214768h == -1) {
                this.f214768h = this.f214764d.N();
            }
            c(1);
            return;
        }
        if ((i18 == 1 || i18 == 4) && i17 == 2) {
            if (this.f214771k) {
                c(2);
                this.f214770j = true;
                return;
            }
            return;
        }
        boolean z18 = i18 == 1 || i18 == 4;
        com.tencent.mm.xcompat.viewpager2.widget.f fVar = this.f214767g;
        if (z18 && i17 == 0) {
            e();
            if (!this.f214771k) {
                int i27 = fVar.f214758a;
                if (i27 != -1 && (oVar2 = this.f214761a) != null) {
                    oVar2.b(i27, 0.0f, 0);
                }
            } else if (fVar.f214760c == 0) {
                int i28 = this.f214768h;
                int i29 = fVar.f214758a;
                if (i28 != i29 && (oVar = this.f214761a) != null) {
                    oVar.c(i29);
                }
            } else {
                z17 = false;
            }
            if (z17) {
                c(0);
                d();
            }
        }
        if (this.f214765e == 2 && i17 == 0 && this.f214772l) {
            e();
            if (fVar.f214760c == 0) {
                int i37 = this.f214769i;
                int i38 = fVar.f214758a;
                if (i37 != i38) {
                    if (i38 == -1) {
                        i38 = 0;
                    }
                    com.tencent.mm.xcompat.viewpager2.widget.o oVar3 = this.f214761a;
                    if (oVar3 != null) {
                        oVar3.c(i38);
                    }
                }
                c(0);
                d();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        if (r7 == (n3.v0.d(r8) == 1)) goto L17;
     */
    @Override // com.tencent.mm.xcompat.recyclerview.widget.k1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(com.tencent.mm.xcompat.recyclerview.widget.RecyclerView r6, int r7, int r8) {
        /*
            r5 = this;
            r6 = 1
            r5.f214771k = r6
            r5.e()
            boolean r0 = r5.f214770j
            r1 = -1
            com.tencent.mm.xcompat.viewpager2.widget.f r2 = r5.f214767g
            r3 = 0
            if (r0 == 0) goto L4a
            r5.f214770j = r3
            if (r8 > 0) goto L2f
            if (r8 != 0) goto L2d
            if (r7 >= 0) goto L18
            r7 = r6
            goto L19
        L18:
            r7 = r3
        L19:
            com.tencent.mm.xcompat.viewpager2.widget.ViewPager2 r8 = r5.f214762b
            com.tencent.mm.xcompat.recyclerview.widget.e0 r8 = r8.f214738m
            com.tencent.mm.xcompat.recyclerview.widget.RecyclerView r8 = r8.f214522b
            java.util.WeakHashMap r0 = n3.l1.f334362a
            int r8 = n3.v0.d(r8)
            if (r8 != r6) goto L29
            r8 = r6
            goto L2a
        L29:
            r8 = r3
        L2a:
            if (r7 != r8) goto L2d
            goto L2f
        L2d:
            r7 = r3
            goto L30
        L2f:
            r7 = r6
        L30:
            if (r7 == 0) goto L3a
            int r7 = r2.f214760c
            if (r7 == 0) goto L3a
            int r7 = r2.f214758a
            int r7 = r7 + r6
            goto L3c
        L3a:
            int r7 = r2.f214758a
        L3c:
            r5.f214769i = r7
            int r8 = r5.f214768h
            if (r8 == r7) goto L5a
            com.tencent.mm.xcompat.viewpager2.widget.o r8 = r5.f214761a
            if (r8 == 0) goto L5a
            r8.c(r7)
            goto L5a
        L4a:
            int r7 = r5.f214765e
            if (r7 != 0) goto L5a
            int r7 = r2.f214758a
            if (r7 != r1) goto L53
            r7 = r3
        L53:
            com.tencent.mm.xcompat.viewpager2.widget.o r8 = r5.f214761a
            if (r8 == 0) goto L5a
            r8.c(r7)
        L5a:
            int r7 = r2.f214758a
            if (r7 != r1) goto L5f
            r7 = r3
        L5f:
            float r8 = r2.f214759b
            int r0 = r2.f214760c
            com.tencent.mm.xcompat.viewpager2.widget.o r4 = r5.f214761a
            if (r4 == 0) goto L6a
            r4.b(r7, r8, r0)
        L6a:
            int r7 = r2.f214758a
            int r8 = r5.f214769i
            if (r7 == r8) goto L72
            if (r8 != r1) goto L80
        L72:
            int r7 = r2.f214760c
            if (r7 != 0) goto L80
            int r7 = r5.f214766f
            if (r7 == r6) goto L80
            r5.c(r3)
            r5.d()
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.xcompat.viewpager2.widget.g.b(com.tencent.mm.xcompat.recyclerview.widget.RecyclerView, int, int):void");
    }

    public final void c(int i17) {
        if ((this.f214765e == 3 && this.f214766f == 0) || this.f214766f == i17) {
            return;
        }
        this.f214766f = i17;
        com.tencent.mm.xcompat.viewpager2.widget.o oVar = this.f214761a;
        if (oVar != null) {
            oVar.a(i17);
        }
    }

    public final void d() {
        this.f214765e = 0;
        this.f214766f = 0;
        com.tencent.mm.xcompat.viewpager2.widget.f fVar = this.f214767g;
        fVar.f214758a = -1;
        fVar.f214759b = 0.0f;
        fVar.f214760c = 0;
        this.f214768h = -1;
        this.f214769i = -1;
        this.f214770j = false;
        this.f214771k = false;
        this.f214773m = false;
        this.f214772l = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0123, code lost:
    
        if (r6[r3 - 1][1] >= r5) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0147 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.xcompat.viewpager2.widget.g.e():void");
    }
}
