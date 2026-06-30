package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class i6 extends com.tencent.mm.ui.contact.o4 {
    public final java.util.Map A;
    public final java.util.Map B;
    public int C;
    public final com.tencent.mm.ui.contact.k1 D;
    public final com.tencent.mm.sdk.platformtools.n3 E;
    public final o13.x F;
    public final int G;
    public final int H;
    public int I;

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f206792m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.Map f206793n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Map f206794o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.Map f206795p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.List f206796q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.List f206797r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.List f206798s;

    /* renamed from: t, reason: collision with root package name */
    public p13.c f206799t;

    /* renamed from: u, reason: collision with root package name */
    public java.util.List f206800u;

    /* renamed from: v, reason: collision with root package name */
    public int f206801v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.Map f206802w;

    /* renamed from: x, reason: collision with root package name */
    public int[] f206803x;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.List f206804y;

    /* renamed from: z, reason: collision with root package name */
    public android.database.Cursor f206805z;

    public i6(com.tencent.mm.ui.contact.MMBaseSelectContactUI mMBaseSelectContactUI, java.util.List list, java.util.List list2, java.util.List list3, boolean z17, int i17) {
        super(mMBaseSelectContactUI, z17, i17);
        this.f206792m = new java.util.LinkedList();
        this.f206793n = null;
        this.f206794o = new java.util.HashMap();
        this.f206795p = null;
        this.f206801v = 0;
        this.f206802w = new java.util.HashMap();
        this.A = new java.util.HashMap();
        this.B = new java.util.HashMap();
        this.C = 0;
        this.D = new com.tencent.mm.ui.contact.k1();
        this.E = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.F = new com.tencent.mm.ui.contact.h6(this);
        this.G = 1;
        this.H = 1;
        this.I = 0;
        this.f206797r = list;
        this.f206796q = list2;
        this.f206798s = list3;
        this.f206804y = new java.util.ArrayList();
        y();
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A(java.lang.String r25, boolean r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 882
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.contact.i6.A(java.lang.String, boolean, boolean):void");
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.I;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.ui.contact.p4
    public com.tencent.mm.ui.contact.item.d j(int i17) {
        int i18;
        int i19;
        com.tencent.mm.ui.contact.item.x0 x0Var;
        int i27;
        if (i17 >= this.I) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MultiSearchContactAdapter", "createDataItem err %d %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.I));
            return null;
        }
        java.util.List list = this.f206792m;
        boolean z17 = this.f207079g;
        com.tencent.mm.ui.contact.l4 l4Var = this.f207076d;
        int i28 = this.G;
        if (list == null || list.size() <= 0) {
            i18 = 0;
        } else {
            if (i17 < this.f206792m.size() + i28) {
                if (i17 == 0) {
                    java.lang.String string = l4Var.getActivity().getString(com.tencent.mm.R.string.ifx);
                    com.tencent.mm.ui.contact.item.n0 n0Var = new com.tencent.mm.ui.contact.item.n0(i17);
                    n0Var.f206903y = string;
                    return n0Var;
                }
                gm0.j1.i();
                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n((java.lang.String) this.f206792m.get(i17 - i28), true);
                com.tencent.mm.ui.contact.item.u uVar = new com.tencent.mm.ui.contact.item.u(i17);
                uVar.f(n17);
                if (com.tencent.mm.storage.z3.R4(n17.d1())) {
                    uVar.f206836e = false;
                    uVar.f206839h = false;
                    uVar.f206838g = false;
                    uVar.F = true;
                } else {
                    uVar.f206836e = this.f207078f;
                    uVar.f206839h = z17;
                    uVar.F = false;
                }
                return uVar;
            }
            i18 = this.f206792m.size() + i28 + 0;
        }
        int i29 = this.C;
        java.util.Map map = this.f206794o;
        int i37 = 3;
        if (i17 < i29) {
            for (java.lang.String str : this.f206800u) {
                if (((java.util.HashMap) this.f206793n).get(str) == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.MultiSearchContactAdapter", "word:%s, position:%d, count:%d", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.I));
                } else {
                    int size = ((java.util.List) ((java.util.HashMap) this.f206793n).get(str)).size();
                    if (z() && size > i37) {
                        if (!((java.lang.Boolean) ((java.util.HashMap) map).get(str)).booleanValue()) {
                            size = i37;
                        }
                        int i38 = this.H;
                        if (i17 < i18 + size + i28 + i38) {
                            i19 = i17 - i18;
                            break;
                        }
                        i27 = size + i28 + i38;
                        i18 += i27;
                        i37 = 3;
                    } else {
                        if (i17 < i18 + size + i28) {
                            i19 = i17 - i18;
                            break;
                        }
                        i27 = size + i28;
                        i18 += i27;
                        i37 = 3;
                    }
                }
            }
            str = null;
            i19 = 0;
            i29 = i18;
        } else {
            str = null;
            i19 = 0;
        }
        if (str == null) {
            int i39 = i17 - i29;
            java.util.HashMap hashMap = (java.util.HashMap) this.A;
            if (hashMap.get(java.lang.Integer.valueOf(i39)) != null) {
                java.lang.String str2 = (java.lang.String) hashMap.get(java.lang.Integer.valueOf(i39));
                com.tencent.mm.ui.contact.item.n0 n0Var2 = new com.tencent.mm.ui.contact.item.n0(i17);
                n0Var2.f206903y = str2;
                return n0Var2;
            }
            android.database.Cursor cursor = this.f206805z;
            java.util.Iterator it = hashMap.keySet().iterator();
            int i47 = 0;
            while (it.hasNext()) {
                if (i39 > ((java.lang.Integer) it.next()).intValue()) {
                    i47++;
                }
            }
            if (!cursor.moveToPosition(i39 - i47)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MultiSearchContactAdapter", "create contact item error: position=%d, %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.I));
                return null;
            }
            com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3();
            z3Var.convertFrom(this.f206805z);
            com.tencent.mm.ui.contact.item.u uVar2 = new com.tencent.mm.ui.contact.item.u(i17);
            uVar2.f(z3Var);
            if (com.tencent.mm.storage.z3.R4(z3Var.d1())) {
                uVar2.f206836e = false;
                uVar2.f206839h = false;
                uVar2.f206838g = false;
                uVar2.F = true;
            } else {
                uVar2.f206836e = this.f207078f;
                uVar2.f206839h = z17;
                uVar2.F = false;
            }
            return uVar2;
        }
        if (i19 == 0) {
            java.lang.String str3 = "\"" + str + "\"";
            if (!z()) {
                str3 = l4Var.getActivity().getResources().getString(com.tencent.mm.R.string.ffq);
            }
            com.tencent.mm.ui.contact.item.n0 n0Var3 = new com.tencent.mm.ui.contact.item.n0(i17);
            n0Var3.f206903y = str3;
            x0Var = n0Var3;
        } else if (i19 > ((!z() || ((java.lang.Boolean) ((java.util.HashMap) map).get(str)).booleanValue()) ? ((java.util.List) ((java.util.HashMap) this.f206793n).get(str)).size() : 3)) {
            boolean z18 = !((java.lang.Boolean) ((java.util.HashMap) map).get(str)).booleanValue();
            com.tencent.mm.ui.contact.item.a1 a1Var = new com.tencent.mm.ui.contact.item.a1(i17);
            a1Var.C = com.tencent.mm.R.string.ffq;
            a1Var.D = z18;
            x0Var = a1Var;
        } else {
            p13.y yVar = (p13.y) ((java.util.List) ((java.util.HashMap) this.f206793n).get(str)).get(i19 - 1);
            if (yVar.f351183a > 0) {
                com.tencent.mm.ui.contact.item.u uVar3 = new com.tencent.mm.ui.contact.item.u(i17);
                uVar3.C = yVar;
                uVar3.f206836e = this.f207078f;
                uVar3.f206855x = true;
                uVar3.f206854w = i19 + 1;
                int i48 = yVar.f351184b;
                int i49 = yVar.f351185c;
                uVar3.f206853v = i48;
                uVar3.f206852u = i49;
                x0Var = uVar3;
            } else {
                x0Var = new com.tencent.mm.ui.contact.item.x0(i17);
            }
        }
        x0Var.f206848q = str;
        if (x0Var instanceof com.tencent.mm.ui.contact.item.a) {
            x0Var.A = (p13.r) ((java.util.HashMap) this.f206795p).get(str);
        }
        x0Var.f206851t = this.f207080h;
        return x0Var;
    }

    @Override // com.tencent.mm.ui.contact.p4
    public void k() {
        h();
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiSearchContactAdapter", "finish!");
        r();
    }

    @Override // com.tencent.mm.ui.contact.p4
    public int m() {
        return this.f206792m.size();
    }

    @Override // com.tencent.mm.ui.contact.p4
    public boolean n(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mm.ui.contact.l4 l4Var = this.f207076d;
        com.tencent.mm.ui.contact.item.d item = getItem(i17 - l4Var.O3().getHeaderViewsCount());
        if (item instanceof com.tencent.mm.ui.contact.item.a1) {
            java.util.Map map = this.f206794o;
            java.util.HashMap hashMap = (java.util.HashMap) map;
            hashMap.put(item.f206848q, java.lang.Boolean.valueOf(!((java.lang.Boolean) hashMap.get(r4)).booleanValue()));
            A(null, true, false);
            l4Var.O3().setSelection(l4Var.O3().getSelectedItemPosition());
            return true;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(item.f206848q) || !(item instanceof com.tencent.mm.ui.contact.item.u)) {
            return false;
        }
        com.tencent.mm.storage.z3 z3Var = ((com.tencent.mm.ui.contact.item.u) item).B;
        boolean contains = this.f206796q.contains(z3Var.d1());
        java.util.Map map2 = this.f206802w;
        if (contains) {
            java.util.HashMap hashMap2 = (java.util.HashMap) map2;
            if (hashMap2.get(item.f206848q) != null) {
                ((java.util.LinkedList) hashMap2.get(item.f206848q)).remove(z3Var.d1());
            }
        } else {
            java.util.HashMap hashMap3 = (java.util.HashMap) map2;
            if (hashMap3.get(item.f206848q) == null) {
                hashMap3.put(item.f206848q, new java.util.LinkedList());
            }
            ((java.util.LinkedList) hashMap3.get(item.f206848q)).add(z3Var.d1());
        }
        com.tencent.mm.ui.contact.k1 k1Var = this.D;
        k1Var.f206983a = null;
        k1Var.f206984b = null;
        ((java.util.LinkedList) k1Var.f206985c).clear();
        return false;
    }

    @Override // com.tencent.mm.ui.contact.p4
    public boolean o(com.tencent.mm.ui.contact.item.d dVar) {
        int i17 = dVar.f206833b + 1;
        if (i17 >= this.I) {
            return true;
        }
        int i18 = this.C;
        if (i17 >= i18) {
            if (((java.util.HashMap) this.A).get(java.lang.Integer.valueOf(i17 - i18)) != null) {
                return true;
            }
        }
        if (this.f206792m.size() > 0 && i17 == this.f206792m.size() + this.G) {
            return true;
        }
        if (i17 >= this.C) {
            return false;
        }
        com.tencent.mm.ui.contact.item.d j17 = j(i17);
        return j17 == null && (j17 instanceof com.tencent.mm.ui.contact.item.n0);
    }

    @Override // com.tencent.mm.ui.contact.o4
    public void r() {
        ((java.util.HashMap) this.f206802w).clear();
        ((java.util.HashMap) this.f206794o).clear();
        y();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009b A[LOOP:2: B:26:0x0099->B:27:0x009b, LOOP_END] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List] */
    @Override // com.tencent.mm.ui.contact.o4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void s(java.lang.String r7, int[] r8, boolean r9) {
        /*
            r6 = this;
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            r6.f206793n = r9
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            r6.f206795p = r9
            java.util.List r9 = r6.f206792m
            r9.clear()
            android.database.Cursor r9 = r6.f206805z
            if (r9 == 0) goto L2b
            r9.close()
            r9 = 0
            r6.f206805z = r9
            java.util.Map r9 = r6.A
            java.util.HashMap r9 = (java.util.HashMap) r9
            r9.clear()
            java.util.Map r9 = r6.B
            java.util.HashMap r9 = (java.util.HashMap) r9
            r9.clear()
        L2b:
            r9 = 0
            r6.I = r9
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.lang.String r1 = " "
            java.lang.String[] r1 = r7.split(r1)
            int r2 = r1.length
            r3 = r9
        L3b:
            if (r3 >= r2) goto L4f
            r4 = r1[r3]
            java.lang.String r5 = r4.trim()
            boolean r5 = com.tencent.mm.sdk.platformtools.t8.K0(r5)
            if (r5 != 0) goto L4c
            r0.add(r4)
        L4c:
            int r3 = r3 + 1
            goto L3b
        L4f:
            java.util.Map r1 = r6.f206802w
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.util.Set r1 = r1.keySet()
            r0.addAll(r1)
            java.util.List r1 = r6.f206800u
            if (r1 == 0) goto L84
            int r1 = r0.size()
            java.util.List r2 = r6.f206800u
            int r2 = r2.size()
            if (r1 == r2) goto L6b
            goto L8a
        L6b:
            java.util.Iterator r1 = r0.iterator()
        L6f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L84
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.util.List r3 = r6.f206800u
            boolean r2 = r3.contains(r2)
            if (r2 != 0) goto L6f
            goto L8a
        L84:
            java.util.List r1 = r6.f206800u
            if (r1 != 0) goto L89
            goto L8a
        L89:
            r0 = r1
        L8a:
            r6.f206800u = r0
            r6.f206801v = r9
            r6.f206803x = r8
            java.util.List r0 = r6.f206804y
            r1 = r0
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.clear()
            int r1 = r8.length
        L99:
            if (r9 >= r1) goto Laa
            r2 = r8[r9]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = r0
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r3.add(r2)
            int r9 = r9 + 1
            goto L99
        Laa:
            java.util.List r8 = r6.f206800u
            java.lang.Object[] r7 = new java.lang.Object[]{r7, r8}
            java.lang.String r8 = "MicroMsg.MultiSearchContactAdapter"
            java.lang.String r9 = "doSearch: queryString:%s, queryWords:%s"
            com.tencent.mars.xlog.Log.i(r8, r9, r7)
            r6.w()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.contact.i6.s(java.lang.String, int[], boolean):void");
    }

    @Override // com.tencent.mm.ui.contact.o4
    public int t(java.lang.String str) {
        java.util.Map map = this.B;
        if (((java.util.HashMap) map).get(str) != null) {
            return ((java.lang.Integer) ((java.util.HashMap) map).get(str)).intValue() + this.C;
        }
        return 0;
    }

    @Override // com.tencent.mm.ui.contact.o4
    public boolean v() {
        return z();
    }

    public final boolean w() {
        java.util.List list = this.f206804y;
        if (((java.util.ArrayList) list).size() <= 0 || this.f206800u.size() <= 0) {
            if (this.f206801v >= this.f206800u.size() - 1) {
                return true;
            }
            this.f206801v++;
            ((java.util.ArrayList) list).clear();
            for (int i17 : this.f206803x) {
                ((java.util.ArrayList) list).add(java.lang.Integer.valueOf(i17));
            }
            w();
            return false;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        int intValue = ((java.lang.Integer) ((java.util.ArrayList) list).remove(0)).intValue();
        p13.u uVar = new p13.u();
        uVar.f351141c = (java.lang.String) this.f206800u.get(this.f206801v);
        uVar.f351145g = new int[]{intValue};
        uVar.f351148j = hashSet;
        uVar.f351151m = this.F;
        uVar.f351152n = this.E;
        if (intValue == 131075) {
            uVar.f351140b = 32;
            uVar.f351150l = r13.a.f368601d;
        } else {
            uVar.f351140b = 16;
            uVar.f351150l = r13.b.f368602d;
        }
        this.f206799t = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(2, uVar);
        return false;
    }

    public java.lang.String x() {
        java.util.Map map = this.f206802w;
        for (java.lang.String str : ((java.util.HashMap) map).keySet()) {
            for (java.lang.String str2 : (java.lang.String[]) ((java.util.LinkedList) ((java.util.HashMap) map).get(str)).toArray(new java.lang.String[0])) {
                if (!this.f206796q.contains(str2)) {
                    ((java.util.LinkedList) ((java.util.HashMap) map).get(str)).remove(str2);
                }
            }
        }
        java.util.Iterator it = ((java.util.HashMap) map).keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.String str3 = (java.lang.String) it.next();
            if (((java.util.LinkedList) ((java.util.HashMap) map).get(str3)).size() == 0) {
                ((java.util.HashMap) map).remove(str3);
                break;
            }
        }
        java.lang.String str4 = "";
        for (java.lang.String str5 : this.f206800u) {
            if (!((java.util.HashMap) map).containsKey(str5)) {
                str4 = str4 + str5 + " ";
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str4) && z()) {
            str4 = " ";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiSearchContactAdapter", "getRealSearchText %s", str4);
        return str4;
    }

    public final void y() {
        this.f206801v = 0;
        this.f206793n = new java.util.HashMap();
        this.f206795p = new java.util.HashMap();
        this.f206792m.clear();
        android.database.Cursor cursor = this.f206805z;
        if (cursor != null) {
            cursor.close();
            this.f206805z = null;
            this.A.clear();
            this.B.clear();
        }
        h();
        notifyDataSetChanged();
        if (this.f206799t != null) {
            ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni(this.f206799t);
            this.f206799t = null;
        }
        h();
    }

    public final boolean z() {
        java.util.List list = this.f206800u;
        return list != null && list.size() > 1;
    }
}
