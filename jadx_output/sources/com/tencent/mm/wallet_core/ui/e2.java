package com.tencent.mm.wallet_core.ui;

/* loaded from: classes11.dex */
public final class e2 extends com.tencent.mm.ui.contact.a5 implements l75.z0 {

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.wallet_core.ui.c2 f214133n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.HashMap f214134o;

    /* renamed from: p, reason: collision with root package name */
    public android.util.SparseArray f214135p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.List f214136q;

    /* renamed from: r, reason: collision with root package name */
    public java.util.List f214137r;

    /* renamed from: s, reason: collision with root package name */
    public int f214138s;

    public e2(com.tencent.mm.ui.contact.MMBaseSelectContactUI mMBaseSelectContactUI, java.util.List list, boolean z17, boolean z18, com.tencent.mm.wallet_core.ui.c2 c2Var) {
        super((com.tencent.mm.ui.contact.l4) mMBaseSelectContactUI, list, z17, z18, false);
        this.f214136q = new java.util.ArrayList();
        this.f214137r = new java.util.ArrayList();
        com.tencent.mars.xlog.Log.i("MicroMsg.AlphabetContactAdapter", "create!");
        if (c2Var != null) {
            this.f214133n = c2Var;
        } else {
            this.f214133n = new com.tencent.mm.wallet_core.ui.c2();
        }
        com.tencent.mm.storage.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
        com.tencent.mm.wallet_core.ui.c2 c2Var2 = this.f214133n;
        kotlin.jvm.internal.o.d(c2Var2);
        a17.W0(c2Var2.f214123c);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().a(this);
        s();
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 stg, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(stg, "stg");
        kotlin.jvm.internal.o.g(obj, "obj");
        com.tencent.mars.xlog.Log.i("MicroMsg.AlphabetContactAdapter", "onNotifyChange evnet = " + i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.AlphabetContactAdapter", "onNotifyChange stg = " + stg);
        com.tencent.mars.xlog.Log.i("MicroMsg.AlphabetContactAdapter", "onNotifyChange obj = " + obj);
        com.tencent.mm.storage.z3 L = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().L(obj.toString());
        if (L == null || !L.r2()) {
            return;
        }
        s();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        int size = this.f214137r.size();
        android.util.SparseArray sparseArray = this.f214135p;
        return size + (sparseArray != null ? sparseArray.size() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.ui.contact.p4
    public com.tencent.mm.ui.contact.item.d j(int i17) {
        com.tencent.mm.ui.contact.item.u uVar;
        android.util.SparseArray sparseArray = this.f214135p;
        kotlin.jvm.internal.o.d(sparseArray);
        boolean z17 = false;
        if (sparseArray.indexOfKey(i17) >= 0) {
            android.util.SparseArray sparseArray2 = this.f214135p;
            kotlin.jvm.internal.o.d(sparseArray2);
            java.lang.Object obj = sparseArray2.get(i17);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            com.tencent.mm.wallet_core.ui.y1 y1Var = new com.tencent.mm.wallet_core.ui.y1(i17);
            y1Var.f214271y = (java.lang.String) obj;
            y1Var.f206834c = false;
            if (i17 == 0 && this.f214138s > 0) {
                z17 = true;
            }
            y1Var.f214272z = z17;
            uVar = y1Var;
        } else {
            int i18 = i17;
            int i19 = 0;
            do {
                android.util.SparseArray sparseArray3 = this.f214135p;
                kotlin.jvm.internal.o.d(sparseArray3);
                if (i19 > sparseArray3.size()) {
                    break;
                }
                android.util.SparseArray sparseArray4 = this.f214135p;
                kotlin.jvm.internal.o.d(sparseArray4);
                if (sparseArray4.indexOfKey(i18) >= 0) {
                    i19++;
                }
                i18--;
            } while (i18 >= 0);
            com.tencent.mm.storage.z3 z3Var = ((com.tencent.mm.wallet_core.ui.f2) ((java.util.ArrayList) this.f214137r).get(i17 - i19)).f214142b;
            com.tencent.mm.ui.contact.item.u uVar2 = new com.tencent.mm.ui.contact.item.u(i17);
            uVar2.f(z3Var);
            com.tencent.mm.wallet_core.ui.c2 c2Var = this.f214133n;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(c2Var.f214123c)) {
                uVar2.f206849r = c2Var.f214123c;
            }
            if (com.tencent.mm.storage.z3.R4(z3Var.d1())) {
                uVar2.f206836e = false;
                uVar2.f206839h = false;
                uVar2.f206838g = false;
                uVar2.F = true;
            } else {
                uVar2.f206836e = this.f207078f;
                uVar2.f206839h = this.f207079g;
                uVar2.F = false;
            }
            uVar2.f206834c = false;
            uVar2.G = false;
            uVar = uVar2;
        }
        return uVar;
    }

    @Override // com.tencent.mm.ui.contact.p4
    public void k() {
        h();
        com.tencent.mars.xlog.Log.i("MicroMsg.AlphabetContactAdapter", "finish!");
        this.f214137r.clear();
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().e(this);
    }

    @Override // com.tencent.mm.ui.contact.p4
    public int m() {
        return 0;
    }

    @Override // com.tencent.mm.ui.contact.p4
    public boolean o(com.tencent.mm.ui.contact.item.d item) {
        kotlin.jvm.internal.o.g(item, "item");
        int i17 = item.f206833b + 1;
        android.util.SparseArray sparseArray = this.f214135p;
        kotlin.jvm.internal.o.d(sparseArray);
        return sparseArray.indexOfKey(i17) >= 0;
    }

    @Override // com.tencent.mm.ui.contact.a5
    public int r(java.lang.String header) {
        kotlin.jvm.internal.o.g(header, "header");
        int hashCode = header.hashCode();
        if (hashCode == -1010580210 ? header.equals("openIm") : !(hashCode == 8593 ? !header.equals("↑") : !(hashCode == 1772656 && header.equals("🔍")))) {
            return 0;
        }
        java.util.HashMap hashMap = this.f214134o;
        if (hashMap != null) {
            kotlin.jvm.internal.o.d(hashMap);
            if (hashMap.containsKey(header)) {
                java.util.HashMap hashMap2 = this.f214134o;
                kotlin.jvm.internal.o.d(hashMap2);
                java.lang.Object obj = hashMap2.get(header);
                kotlin.jvm.internal.o.d(obj);
                return ((java.lang.Number) obj).intValue() + this.f207076d.O3().getHeaderViewsCount();
            }
        }
        return -1;
    }

    @Override // com.tencent.mm.ui.contact.a5
    public void s() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AlphabetContactAdapter", "resetData");
        ((java.util.ArrayList) this.f214137r).clear();
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f214136q;
        arrayList.clear();
        java.util.HashMap hashMap = this.f214134o;
        if (hashMap != null) {
            hashMap.clear();
        } else {
            this.f214134o = new java.util.HashMap();
        }
        android.util.SparseArray sparseArray = this.f214135p;
        if (sparseArray != null) {
            sparseArray.clear();
        } else {
            this.f214135p = new android.util.SparseArray();
        }
        com.tencent.mm.wallet_core.ui.c2 c2Var = this.f214133n;
        boolean z17 = c2Var.f214121a;
        java.lang.Object obj = this.f207076d;
        if (z17) {
            java.lang.String str = null;
            java.util.List O1 = !com.tencent.mm.sdk.platformtools.t8.K0(c2Var.f214122b) ? com.tencent.mm.sdk.platformtools.t8.O1(c2Var.f214122b, ",") : null;
            if (com.tencent.mm.sdk.platformtools.t8.L0(O1)) {
                ((java.util.ArrayList) this.f214137r).clear();
            } else {
                int i17 = 1;
                if (O1 != null) {
                    ((java.util.ArrayList) this.f214137r).clear();
                    int size = O1.size();
                    for (int i18 = 0; i18 < size; i18++) {
                        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n((java.lang.String) O1.get(i18), true);
                        com.tencent.mm.storage.a3 z07 = !com.tencent.mm.sdk.platformtools.t8.K0(c2Var.f214123c) ? ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(c2Var.f214123c) : null;
                        rd0.g1 g1Var = (rd0.g1) i95.n0.c(rd0.g1.class);
                        kotlin.jvm.internal.o.d(n17);
                        ((qd0.u0) g1Var).getClass();
                        ((java.util.ArrayList) this.f214137r).add(new com.tencent.mm.wallet_core.ui.f2(si5.b.f408325a.c(0, n17, z07), n17));
                    }
                }
                if (((java.util.ArrayList) this.f214137r).size() > 0) {
                    kz5.g0.t(this.f214137r, com.tencent.mm.wallet_core.ui.d2.f214129d);
                    java.util.List S0 = kz5.n0.S0(this.f214137r);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    ((java.util.ArrayList) this.f214137r).clear();
                    int size2 = S0.size();
                    for (int i19 = 0; i19 < size2; i19++) {
                        if (com.tencent.mm.storage.z3.m4(((com.tencent.mm.wallet_core.ui.f2) S0.get(i19)).f214142b.d1())) {
                            ((java.util.ArrayList) this.f214137r).add(S0.get(i19));
                        } else {
                            arrayList2.add(S0.get(i19));
                        }
                    }
                    this.f214138s = ((java.util.ArrayList) this.f214137r).size();
                    this.f214137r = kz5.n0.V0(kz5.n0.t0(this.f214137r, arrayList2));
                }
                arrayList.add("🔍");
                if (this.f214138s > 0) {
                    kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type android.content.Context");
                    java.lang.String string = ((android.content.Context) obj).getString(com.tencent.mm.R.string.gnl);
                    kotlin.jvm.internal.o.f(string, "getString(...)");
                    t(0, string);
                    arrayList.add("openIm");
                } else {
                    i17 = 0;
                }
                java.util.Iterator it = ((java.util.ArrayList) this.f214137r).iterator();
                int i27 = 0;
                while (it.hasNext()) {
                    int i28 = i27 + 1;
                    com.tencent.mm.wallet_core.ui.f2 f2Var = (com.tencent.mm.wallet_core.ui.f2) it.next();
                    int i29 = this.f214138s;
                    if (i27 < i29) {
                        i27 = i28;
                    } else {
                        java.lang.String str2 = f2Var.f214141a.f408328c;
                        if (i27 != i29 || str2 == null) {
                            if (str != null && !kotlin.jvm.internal.o.b(str2, str) && str2 != null) {
                                t(i27 + i17, str2);
                                arrayList.add(str2);
                            }
                            i27 = i28;
                            str = str2;
                        } else {
                            t(i27 + i17, str2);
                            arrayList.add(str2);
                        }
                        i17++;
                        i27 = i28;
                        str = str2;
                    }
                }
            }
        }
        if (arrayList.size() > 0) {
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyExclusiveSelectContactUI");
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyExclusiveSelectContactUI luckyMoneyExclusiveSelectContactUI = (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyExclusiveSelectContactUI) obj;
            java.lang.String[] strArr = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
            luckyMoneyExclusiveSelectContactUI.I = strArr;
            com.tencent.mm.ui.base.AlphabetScrollBar alphabetScrollBar = luckyMoneyExclusiveSelectContactUI.f206447e;
            if (alphabetScrollBar != null) {
                alphabetScrollBar.setAlphabet(strArr);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AlphabetContactAdapter", "memberList:%d headerPosMap=%s", java.lang.Integer.valueOf(((java.util.ArrayList) this.f214137r).size()), java.lang.String.valueOf(this.f214134o));
        h();
        notifyDataSetChanged();
    }

    public final void t(int i17, java.lang.String str) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.util.HashMap hashMap = this.f214134o;
        kotlin.jvm.internal.o.d(hashMap);
        hashMap.put(str, valueOf);
        android.util.SparseArray sparseArray = this.f214135p;
        kotlin.jvm.internal.o.d(sparseArray);
        sparseArray.put(i17, str);
    }
}
