package fn5;

/* loaded from: classes14.dex */
public final class n0 extends androidx.lifecycle.c1 {
    public static final java.util.List E = kz5.c0.i("4", "27", "28", "152", "153", "156", "157", "159", "160");
    public aq.b A;
    public boolean B;
    public boolean C;
    public boolean D;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.j0 f264721d = new androidx.lifecycle.j0();

    /* renamed from: e, reason: collision with root package name */
    public final androidx.lifecycle.j0 f264722e = new androidx.lifecycle.j0(en5.d.f255371d);

    /* renamed from: f, reason: collision with root package name */
    public final androidx.lifecycle.j0 f264723f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.lifecycle.g0 f264724g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.lifecycle.j0 f264725h;

    /* renamed from: i, reason: collision with root package name */
    public final androidx.lifecycle.j0 f264726i;

    /* renamed from: m, reason: collision with root package name */
    public final androidx.lifecycle.j0 f264727m;

    /* renamed from: n, reason: collision with root package name */
    public final androidx.lifecycle.j0 f264728n;

    /* renamed from: o, reason: collision with root package name */
    public final androidx.lifecycle.j0 f264729o;

    /* renamed from: p, reason: collision with root package name */
    public final androidx.lifecycle.j0 f264730p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.ArrayList f264731q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.ArrayList f264732r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.ArrayList f264733s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.ArrayList f264734t;

    /* renamed from: u, reason: collision with root package name */
    public java.util.Map f264735u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.ArrayList f264736v;

    /* renamed from: w, reason: collision with root package name */
    public kotlinx.coroutines.r2 f264737w;

    /* renamed from: x, reason: collision with root package name */
    public kotlinx.coroutines.r2 f264738x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f264739y;

    /* renamed from: z, reason: collision with root package name */
    public kotlinx.coroutines.r2 f264740z;

    public n0() {
        androidx.lifecycle.j0 j0Var = new androidx.lifecycle.j0(fn5.o0.f264743d);
        this.f264723f = j0Var;
        this.f264724g = j0Var;
        this.f264725h = new androidx.lifecycle.j0("");
        this.f264726i = new androidx.lifecycle.j0(new java.util.ArrayList());
        this.f264727m = new androidx.lifecycle.j0(0);
        this.f264728n = new androidx.lifecycle.j0();
        this.f264729o = new androidx.lifecycle.j0(fn5.p0.f264747d);
        this.f264730p = new androidx.lifecycle.j0();
        this.f264731q = new java.util.ArrayList();
        this.f264732r = new java.util.ArrayList();
        this.f264733s = new java.util.ArrayList();
        this.f264734t = new java.util.ArrayList();
        this.f264735u = new java.util.LinkedHashMap();
        this.f264736v = new java.util.ArrayList();
        this.A = aq.b.f12837f;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object N6(fn5.n0 r4, java.util.ArrayList r5, kotlin.coroutines.Continuation r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof fn5.m0
            if (r0 == 0) goto L16
            r0 = r6
            fn5.m0 r0 = (fn5.m0) r0
            int r1 = r0.f264715g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f264715g = r1
            goto L1b
        L16:
            fn5.m0 r0 = new fn5.m0
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r6 = r0.f264713e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f264715g
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.f264712d
            fn5.n0 r4 = (fn5.n0) r4
            kotlin.ResultKt.throwOnFailure(r6)
            goto L6c
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            kotlin.ResultKt.throwOnFailure(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r2 = "updateNormalData >> "
            r6.<init>(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            r6.append(r2)
            r2 = 32
            r6.append(r2)
            int r2 = r5.size()
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            java.lang.String r2 = "MicroMsg.ImageQueryViewModel"
            com.tencent.mars.xlog.Log.i(r2, r6)
            r0.f264712d = r4
            r0.f264715g = r3
            java.lang.Object r6 = r4.a7(r5, r0)
            if (r6 != r1) goto L6c
            goto Lda
        L6c:
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            androidx.lifecycle.j0 r5 = r4.f264722e
            java.lang.Object r5 = r5.getValue()
            en5.d r5 = (en5.d) r5
            if (r5 != 0) goto L7a
            r5 = -1
            goto L82
        L7a:
            int[] r0 = fn5.u.f264766a
            int r5 = r5.ordinal()
            r5 = r0[r5]
        L82:
            java.lang.String r0 = "get(...)"
            if (r5 == r3) goto La7
            r1 = 2
            if (r5 == r1) goto L9a
            r2 = 3
            if (r5 == r2) goto L8d
            goto Lb4
        L8d:
            java.lang.Object r5 = r6.get(r1)
            kotlin.jvm.internal.o.f(r5, r0)
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r4.b7(r5)
            goto Lb4
        L9a:
            java.lang.Object r5 = r6.get(r3)
            kotlin.jvm.internal.o.f(r5, r0)
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r4.b7(r5)
            goto Lb4
        La7:
            r5 = 0
            java.lang.Object r5 = r6.get(r5)
            kotlin.jvm.internal.o.f(r5, r0)
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r4.b7(r5)
        Lb4:
            androidx.lifecycle.j0 r5 = r4.f264729o
            java.lang.Object r5 = r5.getValue()
            fn5.p0 r5 = (fn5.p0) r5
            if (r5 == 0) goto Lc3
            java.lang.String r5 = r5.name()
            goto Lc4
        Lc3:
            r5 = 0
        Lc4:
            java.lang.String r1 = "PERSON"
            boolean r5 = kotlin.jvm.internal.o.b(r5, r1)
            if (r5 == 0) goto Ld8
            java.lang.Object r5 = r6.get(r3)
            kotlin.jvm.internal.o.f(r5, r0)
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r4.Q6(r5)
        Ld8:
            jz5.f0 r1 = jz5.f0.f302826a
        Lda:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: fn5.n0.N6(fn5.n0, java.util.ArrayList, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void O6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryViewModel", "applyReq");
        java.util.ArrayList arrayList = this.f264736v;
        boolean z17 = true;
        if (!(arrayList == null || arrayList.isEmpty())) {
            java.util.Iterator it = E.iterator();
            while (it.hasNext()) {
                if (arrayList.contains((java.lang.String) it.next())) {
                    break;
                }
            }
        }
        z17 = false;
        androidx.lifecycle.j0 j0Var = this.f264729o;
        if (z17) {
            j0Var.setValue(fn5.p0.f264748e);
            this.f264738x = kotlinx.coroutines.l.d(androidx.lifecycle.d1.a(this), kotlinx.coroutines.q1.f310568a, null, new fn5.e0(this, null), 2, null);
            return;
        }
        j0Var.setValue(fn5.p0.f264747d);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryViewModel", "applyNormalReq: " + java.lang.Thread.currentThread().getName());
        this.f264737w = kotlinx.coroutines.l.d(androidx.lifecycle.d1.a(this), kotlinx.coroutines.q1.f310568a, null, new fn5.z(this, null), 2, null);
    }

    public final void P6(java.lang.String text, java.util.List list) {
        kotlin.jvm.internal.o.g(text, "text");
        this.f264725h.setValue(text);
        this.f264721d.setValue(new java.util.ArrayList());
        androidx.lifecycle.j0 j0Var = this.f264723f;
        j0Var.setValue(fn5.o0.f264744e);
        java.util.ArrayList arrayList = this.f264736v;
        arrayList.clear();
        this.A = aq.b.f12837f;
        this.f264730p.setValue(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.fzv));
        kotlinx.coroutines.r2 r2Var = this.f264740z;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f264740z = kotlinx.coroutines.l.d(androidx.lifecycle.d1.a(this), kotlinx.coroutines.q1.f310570c, null, new fn5.k0(this, null), 2, null);
        if (list != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(java.lang.String.valueOf(((java.lang.Number) it.next()).intValue()));
            }
            arrayList.addAll(arrayList2);
            O6();
            return;
        }
        if (text.length() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryViewModel", "confirmToSearch >> text is empty");
            j0Var.setValue(fn5.o0.f264745f);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryViewModel", "getLabelIdByText: ".concat(text));
        aq.r0 r0Var = aq.r0.f12940a;
        java.util.ArrayList h17 = r0Var.h(text, false);
        java.util.HashSet hashSet = new java.util.HashSet();
        if (h17 == null || h17.isEmpty()) {
            java.util.ArrayList i17 = r0Var.i(text, false);
            if (i17 != null) {
                java.util.Iterator it6 = i17.iterator();
                while (it6.hasNext()) {
                    java.lang.Object second = ((android.util.Pair) it6.next()).second;
                    kotlin.jvm.internal.o.f(second, "second");
                    java.lang.Iterable iterable = (java.lang.Iterable) second;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(iterable, 10));
                    java.util.Iterator it7 = iterable.iterator();
                    while (it7.hasNext()) {
                        arrayList3.add(java.lang.String.valueOf(((java.lang.Number) it7.next()).intValue()));
                    }
                    hashSet.addAll(arrayList3);
                }
            }
        } else {
            java.util.Iterator it8 = h17.iterator();
            while (it8.hasNext()) {
                java.lang.Object second2 = ((android.util.Pair) it8.next()).second;
                kotlin.jvm.internal.o.f(second2, "second");
                java.lang.Iterable iterable2 = (java.lang.Iterable) second2;
                java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(iterable2, 10));
                java.util.Iterator it9 = iterable2.iterator();
                while (it9.hasNext()) {
                    arrayList4.add(java.lang.String.valueOf(((java.lang.Number) it9.next()).intValue()));
                }
                hashSet.addAll(arrayList4);
            }
        }
        if (hashSet.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryViewModel", "current query label is null，go to check Intercept");
            kotlinx.coroutines.l.d(androidx.lifecycle.d1.a(this), null, null, new fn5.f0(text, this, null), 3, null);
        } else {
            arrayList.addAll(hashSet);
            O6();
        }
    }

    public final void Q6(java.util.ArrayList arrayList) {
        int i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryViewModel", java.lang.Thread.currentThread().getName() + " dealPeopleData >> data size: " + arrayList.size());
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            i17 = 0;
            if (!it.hasNext()) {
                break;
            }
            com.tencent.mm.api.QueryImageData queryImageData = (com.tencent.mm.api.QueryImageData) it.next();
            java.lang.String str = queryImageData.f53208i;
            kotlin.jvm.internal.o.f(str, "getCropLabelId(...)");
            for (java.lang.String str2 : r26.n0.f0(str, new java.lang.String[]{"#"}, false, 0, 6, null)) {
                if (str2.length() > 0) {
                    if (this.f264735u.containsKey(str2)) {
                        java.util.ArrayList arrayList2 = (java.util.ArrayList) this.f264735u.get(str2);
                        if (arrayList2 != null) {
                            arrayList2.add(queryImageData);
                        }
                    } else {
                        java.util.Map map = this.f264735u;
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        arrayList3.add(queryImageData);
                        map.put(str2, arrayList3);
                    }
                }
            }
        }
        this.f264735u = kz5.c1.t(kz5.c1.q(kz5.n0.F0(kz5.e1.v(this.f264735u), new fn5.h0())));
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (java.lang.Object obj : this.f264735u.entrySet()) {
            int i18 = i17 + 1;
            java.lang.String str3 = null;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            if (i17 <= 9) {
                java.lang.String str4 = (java.lang.String) entry.getKey();
                com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryViewModel", "getCropImagePath >> labelId: " + str4);
                java.util.Iterator it6 = this.f264734t.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    aq.a aVar = (aq.a) it6.next();
                    if (kotlin.jvm.internal.o.b(aVar.f12826a, str4)) {
                        str3 = aVar.f12827b;
                        break;
                    }
                }
                if (str3 != null) {
                    arrayList4.add(new aq.a((java.lang.String) entry.getKey(), str3));
                }
            }
            i17 = i18;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryViewModel", "dealPeopleData >> personMapSize: " + this.f264735u.size() + ", headerItemListSize: " + arrayList4.size());
        if (!arrayList4.isEmpty()) {
            this.B = true;
        }
        androidx.lifecycle.j0 j0Var = this.f264728n;
        j0Var.setValue(arrayList4);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dealPeopleData >> personCropImageLiveDataSize: ");
        java.lang.Object value = j0Var.getValue();
        kotlin.jvm.internal.o.d(value);
        sb6.append(((java.util.ArrayList) value).size());
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryViewModel", sb6.toString());
    }

    public final n0.e5 R6(n0.o oVar, int i17) {
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.U(-1735455997);
        java.lang.Object obj = n0.e1.f333492a;
        n0.e5 a17 = v0.c.a(this.f264726i, new java.util.ArrayList(), y0Var, 72);
        y0Var.o(false);
        return a17;
    }

    public final n0.e5 S6(n0.o oVar, int i17) {
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.U(1010966032);
        java.lang.Object obj = n0.e1.f333492a;
        n0.e5 a17 = v0.c.a(this.f264730p, com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.fzv), y0Var, 8);
        y0Var.o(false);
        return a17;
    }

    public final n0.e5 T6(n0.o oVar, int i17) {
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.U(1660768815);
        java.lang.Object obj = n0.e1.f333492a;
        n0.e5 a17 = v0.c.a(this.f264723f, fn5.o0.f264743d, y0Var, 56);
        y0Var.o(false);
        return a17;
    }

    public final n0.e5 U6(n0.o oVar, int i17) {
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.U(-808356205);
        java.lang.Object obj = n0.e1.f333492a;
        n0.e5 a17 = v0.c.a(this.f264725h, "", y0Var, 56);
        y0Var.o(false);
        return a17;
    }

    public final n0.e5 V6(n0.o oVar, int i17) {
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.U(-1171320090);
        java.lang.Object obj = n0.e1.f333492a;
        n0.e5 a17 = v0.c.a(this.f264722e, en5.d.f255371d, y0Var, 56);
        y0Var.o(false);
        return a17;
    }

    public final n0.e5 W6(n0.o oVar, int i17) {
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.U(866073633);
        java.lang.Object obj = n0.e1.f333492a;
        n0.e5 a17 = v0.c.a(this.f264729o, fn5.p0.f264747d, y0Var, 56);
        y0Var.o(false);
        return a17;
    }

    public final boolean X6(java.util.ArrayList arrayList) {
        return ((arrayList == null || arrayList.isEmpty()) || kotlin.jvm.internal.o.b(((aq.d) kz5.n0.X(arrayList)).f12849a, "TOP")) ? false : true;
    }

    public final boolean Y6(java.util.ArrayList arrayList, com.tencent.mm.api.QueryImageData queryImageData) {
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.o.b(((com.tencent.mm.api.QueryImageData) it.next()).f53205f, queryImageData.f53205f)) {
                return true;
            }
        }
        return false;
    }

    public final boolean Z6(java.lang.String imagePath) {
        kotlin.jvm.internal.o.g(imagePath, "imagePath");
        java.util.Iterator it = this.f264733s.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.o.b(((com.tencent.mm.api.QueryImageData) it.next()).f53205f, imagePath)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0120, code lost:
    
        r0 = r8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x018a -> B:11:0x018d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x01b5 -> B:20:0x01b6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a7(java.util.ArrayList r30, kotlin.coroutines.Continuation r31) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fn5.n0.a7(java.util.ArrayList, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void b7(java.util.ArrayList arrayList) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryViewModel", java.lang.Thread.currentThread().getName() + " updateDataFromCustom >> data size: " + arrayList.size());
        if (arrayList.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryViewModel", "the data is no need, so spilt dataList is empty");
            return;
        }
        androidx.lifecycle.j0 j0Var = this.f264726i;
        java.lang.Object value = j0Var.getValue();
        bm5.v0 v0Var = bm5.v0.f22754a;
        androidx.lifecycle.j0 j0Var2 = this.f264727m;
        if (value == null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            v0Var.a(arrayList, arrayList2);
            arrayList2.add(0, new aq.d("TOP", new java.util.ArrayList()));
            arrayList2.add(new aq.d("BOTTOM", new java.util.ArrayList()));
            j0Var.setValue(arrayList2);
            j0Var2.setValue(java.lang.Integer.valueOf(arrayList2.size() - 1));
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(java.lang.Thread.currentThread().getName());
        sb6.append(" updateDataFromCustom current live data size ");
        java.lang.Object value2 = j0Var.getValue();
        kotlin.jvm.internal.o.d(value2);
        sb6.append(((java.util.ArrayList) value2).size());
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryViewModel", sb6.toString());
        java.lang.Object value3 = j0Var.getValue();
        kotlin.jvm.internal.o.d(value3);
        java.util.ArrayList arrayList3 = new java.util.ArrayList((java.util.Collection) value3);
        v0Var.a(arrayList, arrayList3);
        if (X6(arrayList3)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryViewModel", "data num before, add top");
            arrayList3.add(0, new aq.d("TOP", new java.util.ArrayList()));
        }
        if (!arrayList3.isEmpty()) {
            arrayList3.add(new aq.d("BOTTOM", new java.util.ArrayList()));
        }
        j0Var.setValue(arrayList3);
        java.lang.Object value4 = j0Var.getValue();
        kotlin.jvm.internal.o.d(value4);
        if (((java.util.ArrayList) value4).size() > 0) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("data num before ");
            sb7.append(j0Var2.getValue());
            sb7.append(", ");
            java.lang.Object value5 = j0Var.getValue();
            kotlin.jvm.internal.o.d(value5);
            sb7.append(((aq.d) ((java.util.ArrayList) value5).get(0)).f12850b.size());
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryViewModel", sb7.toString());
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("data num before ");
        sb8.append(j0Var2.getValue());
        sb8.append(", ");
        java.lang.Object value6 = j0Var.getValue();
        kotlin.jvm.internal.o.d(value6);
        sb8.append(((aq.d) ((java.util.ArrayList) value6).get(0)).f12850b.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryViewModel", sb8.toString());
        java.lang.Object value7 = j0Var2.getValue();
        kotlin.jvm.internal.o.d(value7);
        j0Var2.setValue(java.lang.Integer.valueOf(((java.lang.Number) value7).intValue() + arrayList.size()));
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryViewModel", "data num after " + j0Var2.getValue());
        f65.n nVar = f65.n.f259909a;
        nVar.d(this.f264731q.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryReportProvider", "reportSearchResultExpose,  " + aq.o.f12920a);
        if (!aq.o.f12920a && !f65.o.f259932u && f65.o.f259923l != 0) {
            com.tencent.mm.autogen.mmdata.rpt.IntelligentMsgActionLogStruct intelligentMsgActionLogStruct = new com.tencent.mm.autogen.mmdata.rpt.IntelligentMsgActionLogStruct();
            intelligentMsgActionLogStruct.f58525s = intelligentMsgActionLogStruct.b("Username", f65.o.f259913b, true);
            intelligentMsgActionLogStruct.f58510d = intelligentMsgActionLogStruct.b("sessionid", f65.o.f259914c, true);
            intelligentMsgActionLogStruct.f58512f = 56L;
            intelligentMsgActionLogStruct.f58511e = intelligentMsgActionLogStruct.b("searchsessionid", f65.o.f259917f, true);
            intelligentMsgActionLogStruct.f58524r = f65.o.f259920i;
            intelligentMsgActionLogStruct.f58528v = f65.o.f259928q;
            f65.o.f259932u = true;
            intelligentMsgActionLogStruct.p(f65.o.f259918g);
            intelligentMsgActionLogStruct.f58519m = f65.o.f259923l;
            intelligentMsgActionLogStruct.f58523q = java.lang.System.currentTimeMillis() - f65.o.f259930s;
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryReporter", "searchResultExpose >> action: " + intelligentMsgActionLogStruct.f58512f);
            intelligentMsgActionLogStruct.k();
        }
        fn5.p0 p0Var = (fn5.p0) this.f264729o.getValue();
        if (kotlin.jvm.internal.o.b(p0Var != null ? p0Var.name() : null, "PERSON")) {
            nVar.e(this.f264732r.size());
        }
    }

    public final void c7(java.lang.String text) {
        kotlin.jvm.internal.o.g(text, "text");
        this.f264725h.setValue(text);
        this.f264722e.setValue(en5.d.f255371d);
        if (text.length() == 0) {
            this.f264721d.setValue(new java.util.ArrayList());
        }
        java.util.ArrayList arrayList = this.f264731q;
        int size = arrayList.size();
        java.util.ArrayList arrayList2 = this.f264732r;
        if (size != 0) {
            f65.n nVar = f65.n.f259909a;
            nVar.d(arrayList.size());
            nVar.g(arrayList.size());
            fn5.p0 p0Var = (fn5.p0) this.f264729o.getValue();
            if (kotlin.jvm.internal.o.b(p0Var != null ? p0Var.name() : null, "PERSON")) {
                nVar.e(arrayList2.size());
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryReportProvider", "reportSetPrintQuery >> " + text + ", " + aq.o.f12920a);
        if (!aq.o.f12920a) {
            f65.o.f259921j = r26.i0.t(text, ",", " ", false);
        }
        if (text.length() > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryReportProvider", "reportInternalReport >> 51, " + aq.o.f12920a);
            if (!aq.o.f12920a) {
                f65.o.f259912a.c(51);
            }
        }
        kotlinx.coroutines.r2 r2Var = this.f264738x;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        kotlinx.coroutines.r2 r2Var2 = this.f264737w;
        if (r2Var2 != null) {
            kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
        }
        this.f264726i.setValue(new java.util.ArrayList());
        this.f264727m.setValue(0);
        arrayList.clear();
        arrayList2.clear();
        this.f264733s.clear();
        this.f264734t.clear();
        ((java.util.LinkedHashMap) this.f264735u).clear();
        this.f264730p.setValue(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.fzv));
        kotlinx.coroutines.r2 r2Var3 = this.f264740z;
        if (r2Var3 != null) {
            kotlinx.coroutines.p2.a(r2Var3, null, 1, null);
        }
        aq.n nVar2 = aq.o.f12922c;
        if (nVar2 != null) {
            nVar2.f12914i = null;
            nVar2.f12915j = null;
        }
    }

    public final void d7(en5.d type) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.o.g(type, "type");
        androidx.lifecycle.j0 j0Var = this.f264722e;
        j0Var.setValue(type);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int ordinal = type.ordinal();
        java.util.ArrayList arrayList3 = this.f264732r;
        if (ordinal == 0) {
            arrayList = this.f264731q;
        } else if (ordinal == 1) {
            arrayList = arrayList3;
        } else {
            if (ordinal != 2) {
                throw new jz5.j();
            }
            arrayList = this.f264733s;
        }
        bm5.v0.f22754a.a(arrayList, arrayList2);
        if (X6(arrayList2)) {
            arrayList2.add(0, new aq.d("TOP", new java.util.ArrayList()));
        }
        if (true ^ arrayList2.isEmpty()) {
            arrayList2.add(new aq.d("BOTTOM", new java.util.ArrayList()));
        }
        fn5.p0 p0Var = (fn5.p0) this.f264729o.getValue();
        if (kotlin.jvm.internal.o.b(p0Var != null ? p0Var.name() : null, "PERSON")) {
            this.f264728n.setValue(new java.util.ArrayList());
            ((java.util.LinkedHashMap) this.f264735u).clear();
            this.B = false;
            en5.d dVar = (en5.d) j0Var.getValue();
            if (!kotlin.jvm.internal.o.b(dVar != null ? dVar.name() : null, "OCR")) {
                Q6(arrayList3);
            }
        }
        this.f264727m.setValue(java.lang.Integer.valueOf(arrayList.size()));
        this.f264726i.setValue(arrayList2);
    }
}
