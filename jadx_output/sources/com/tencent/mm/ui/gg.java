package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class gg {

    /* renamed from: h, reason: collision with root package name */
    public static com.tencent.mm.ui.gg f208692h;

    /* renamed from: a, reason: collision with root package name */
    public int f208693a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final android.util.SparseIntArray f208694b = new android.util.SparseIntArray();

    /* renamed from: c, reason: collision with root package name */
    public final android.util.SparseArray f208695c = new android.util.SparseArray();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f208696d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final android.util.SparseArray f208697e = new android.util.SparseArray();

    /* renamed from: f, reason: collision with root package name */
    public long f208698f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f208699g = false;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (bk0.a.g().b(262159, 266248) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(boolean r10) {
        /*
            r9 = this;
            java.lang.String r0 = "MicroMsg.PlusMenaDataManager"
            r1 = 0
            r9.b(r10)     // Catch: java.lang.Exception -> L7
            goto Lf
        L7:
            r10 = move-exception
            java.lang.String r2 = ""
            java.lang.Object[] r3 = new java.lang.Object[r1]
            com.tencent.mars.xlog.Log.printErrStackTrace(r0, r10, r2, r3)
        Lf:
            android.util.SparseArray r10 = r9.f208697e
            r10.clear()
            r9.f208693a = r1
            r2 = r1
        L17:
            java.util.ArrayList r3 = r9.f208696d
            int r4 = r3.size()
            if (r1 >= r4) goto L7c
            java.lang.Object r3 = r3.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            android.util.SparseArray r4 = r9.f208695c
            java.lang.Object r4 = r4.get(r3)
            com.tencent.mm.ui.ng r4 = (com.tencent.mm.ui.ng) r4
            com.tencent.mm.ui.pg r5 = com.tencent.mm.ui.rg.f(r3)
            if (r5 != 0) goto L38
            goto L79
        L38:
            com.tencent.mm.ui.og r6 = new com.tencent.mm.ui.og
            r6.<init>(r5)
            r10.put(r2, r6)
            android.util.SparseIntArray r5 = r9.f208694b
            int r5 = r5.get(r3)
            int r7 = r4.f209421b
            r8 = 1
            if (r7 != r8) goto L4f
            int r4 = r4.f209422c
            if (r5 != r4) goto L70
        L4f:
            r4 = 20
            if (r3 != r4) goto L77
            java.lang.Class<d70.i> r3 = d70.i.class
            i95.m r3 = i95.n0.c(r3)
            d70.i r3 = (d70.i) r3
            c70.e r3 = (c70.e) r3
            r3.getClass()
            bk0.a r3 = bk0.a.g()
            r4 = 262159(0x4000f, float:3.67363E-40)
            r5 = 266248(0x41008, float:3.73093E-40)
            boolean r3 = r3.b(r4, r5)
            if (r3 == 0) goto L77
        L70:
            r6.f209475a = r8
            int r3 = r9.f208693a
            int r3 = r3 + r8
            r9.f208693a = r3
        L77:
            int r2 = r2 + 1
        L79:
            int r1 = r1 + 1
            goto L17
        L7c:
            int r1 = r3.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r10 = r10.size()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Object[] r10 = new java.lang.Object[]{r1, r10}
            java.lang.String r1 = "dynaMenuOrder.size() %s menuDataMap.size() %s"
            com.tencent.mars.xlog.Log.i(r0, r1, r10)
            r3.size()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.gg.a(boolean):void");
    }

    public final void b(boolean z17) {
        java.util.ArrayList arrayList;
        if (!z17) {
            if (!(this.f208695c.size() == 0 || java.lang.System.currentTimeMillis() - this.f208698f > 3600000)) {
                return;
            }
        }
        java.lang.System.currentTimeMillis();
        ip.j b17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b();
        synchronized (b17) {
            if (!b17.f293570b) {
                com.tencent.mars.xlog.Log.e("MicroMsg.DynamicConfig", "DynamicConfig hadnot load");
                b17.f();
            }
            arrayList = new java.util.ArrayList();
            if (!com.tencent.mm.sdk.platformtools.t8.K0("TopRightMenu\\d*")) {
                for (java.lang.String str : b17.f293569a.keySet()) {
                    if (str.matches("TopRightMenu\\d*")) {
                        arrayList.add((java.lang.String) b17.f293569a.get(str));
                    }
                }
            }
            arrayList.size();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PlusMenaDataManager", "dynaConfigs size %d", java.lang.Integer.valueOf(arrayList.size()));
        synchronized (this) {
            this.f208695c.clear();
            this.f208696d.clear();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d((java.lang.String) it.next(), "Menu", null);
                if (d17 != null && d17.size() != 0) {
                    int D1 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) d17.get(".Menu.$id"), 0);
                    int D12 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) d17.get(".Menu.$shownew"), 0);
                    int D13 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) d17.get(".Menu.$seq"), 0);
                    int D14 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) d17.get(".Menu.$order"), 0);
                    this.f208695c.put(D1, new com.tencent.mm.ui.ng(D1, D12, D13, D14));
                    int i17 = 0;
                    while (i17 < this.f208696d.size() && ((com.tencent.mm.ui.ng) this.f208695c.get(((java.lang.Integer) this.f208696d.get(i17)).intValue())).f209423d <= D14) {
                        i17++;
                    }
                    this.f208696d.add(i17, java.lang.Integer.valueOf(D1));
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.PlusMenaDataManager", "dynaMenuOrder size %d", java.lang.Integer.valueOf(this.f208696d.size()));
            if (this.f208696d.size() == 0) {
                c();
            }
        }
        if (this.f208695c.size() != 0) {
            android.util.SparseIntArray sparseIntArray = this.f208694b;
            sparseIntArray.clear();
            java.lang.String str2 = (java.lang.String) c01.d9.b().p().l(299010, null);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                for (java.lang.String str3 : str2.split("\\|")) {
                    java.lang.String[] split = str3.split("\\:");
                    if (split.length == 2) {
                        sparseIntArray.put(com.tencent.mm.sdk.platformtools.t8.D1(split[0], 0), com.tencent.mm.sdk.platformtools.t8.D1(split[1], 0));
                    }
                }
            }
            this.f208699g = true;
        }
        this.f208698f = java.lang.System.currentTimeMillis();
    }

    public final void c() {
        android.util.SparseArray sparseArray = this.f208695c;
        sparseArray.clear();
        java.util.ArrayList arrayList = this.f208696d;
        arrayList.clear();
        java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("TopRightMenus");
        if (com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
            return;
        }
        java.util.Map d18 = com.tencent.mm.sdk.platformtools.aa.d(d17, "TopRightMenus", null);
        if (d18 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PlusMenaDataManager", "TopRightMenus is not right");
            return;
        }
        int i17 = 0;
        while (i17 < 100) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(".TopRightMenus.Menu");
            sb6.append(i17 == 0 ? "" : java.lang.Integer.valueOf(i17));
            java.lang.String sb7 = sb6.toString();
            java.lang.String str = (java.lang.String) d18.get(sb7 + ".$id");
            if (str == null || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                return;
            }
            sparseArray.put(com.tencent.mm.sdk.platformtools.t8.D1(str, 0), new com.tencent.mm.ui.ng(com.tencent.mm.sdk.platformtools.t8.D1(str, 0), com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) d18.get(sb7 + ".$shownew"), 0), com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) d18.get(sb7 + ".$seq"), 0), 0));
            arrayList.add(java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.D1(str, 0)));
            i17++;
        }
    }
}
