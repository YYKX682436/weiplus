package p00;

/* loaded from: classes11.dex */
public final class c extends com.tencent.mm.ui.contact.a5 implements l75.z0 {

    /* renamed from: n, reason: collision with root package name */
    public final p00.a f350351n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.HashMap f350352o;

    /* renamed from: p, reason: collision with root package name */
    public android.util.SparseArray f350353p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.List f350354q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.List f350355r;

    /* renamed from: s, reason: collision with root package name */
    public int f350356s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.ui.contact.MMBaseSelectContactUI mMBaseSelectContactUI, java.util.List list, boolean z17, boolean z18, p00.a option) {
        super(mMBaseSelectContactUI, list, z17, z18);
        kotlin.jvm.internal.o.g(option, "option");
        this.f350354q = new java.util.ArrayList();
        this.f350355r = new java.util.ArrayList();
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftSelectContactAdapter", "create EcsGiftSelectContactAdapter");
        this.f350351n = option;
        ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().W0(option.f350349c);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().a(this);
        s();
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftSelectContactAdapter", "onNotifyChange event = " + i17);
        if (obj == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftSelectContactAdapter", "onNotifyChange obj is null");
            return;
        }
        com.tencent.mm.storage.z3 L = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().L(obj.toString());
        if (L == null || !L.r2()) {
            return;
        }
        s();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        int size = this.f350354q.size();
        android.util.SparseArray sparseArray = this.f350353p;
        return size + (sparseArray != null ? sparseArray.size() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.ui.contact.p4
    public com.tencent.mm.ui.contact.item.d j(int i17) {
        com.tencent.mm.ui.contact.item.u uVar;
        android.util.SparseArray sparseArray = this.f350353p;
        kotlin.jvm.internal.o.d(sparseArray);
        boolean z17 = false;
        if (sparseArray.indexOfKey(i17) >= 0) {
            android.util.SparseArray sparseArray2 = this.f350353p;
            kotlin.jvm.internal.o.d(sparseArray2);
            java.lang.Object obj = sparseArray2.get(i17);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            o00.d dVar = new o00.d(i17);
            dVar.f341858y = (java.lang.String) obj;
            dVar.f206834c = false;
            if (i17 == 0 && this.f350356s > 0) {
                z17 = true;
            }
            dVar.f341859z = z17;
            uVar = dVar;
        } else {
            int i18 = i17;
            int i19 = 0;
            do {
                android.util.SparseArray sparseArray3 = this.f350353p;
                kotlin.jvm.internal.o.d(sparseArray3);
                if (i19 > sparseArray3.size()) {
                    break;
                }
                android.util.SparseArray sparseArray4 = this.f350353p;
                kotlin.jvm.internal.o.d(sparseArray4);
                if (sparseArray4.indexOfKey(i18) >= 0) {
                    i19++;
                }
                i18--;
            } while (i18 >= 0);
            com.tencent.mm.storage.z3 z3Var = ((p00.d) ((java.util.ArrayList) this.f350354q).get(i17 - i19)).f350358b;
            com.tencent.mm.ui.contact.item.u uVar2 = new com.tencent.mm.ui.contact.item.u(i17);
            uVar2.f(z3Var);
            p00.a aVar = this.f350351n;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(aVar.f350349c)) {
                uVar2.f206849r = aVar.f350349c;
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
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftSelectContactAdapter", "finish!");
        this.f350354q.clear();
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().e(this);
    }

    @Override // com.tencent.mm.ui.contact.p4
    public boolean o(com.tencent.mm.ui.contact.item.d item) {
        kotlin.jvm.internal.o.g(item, "item");
        int i17 = item.f206833b + 1;
        android.util.SparseArray sparseArray = this.f350353p;
        kotlin.jvm.internal.o.d(sparseArray);
        return sparseArray.indexOfKey(i17) >= 0;
    }

    @Override // com.tencent.mm.ui.contact.a5
    public void s() {
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftSelectContactAdapter", "res data");
        ((java.util.ArrayList) this.f350354q).clear();
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f350355r;
        arrayList.clear();
        java.util.HashMap hashMap = this.f350352o;
        if (hashMap != null) {
            hashMap.clear();
        } else {
            this.f350352o = new java.util.HashMap();
        }
        android.util.SparseArray sparseArray = this.f350353p;
        if (sparseArray != null) {
            sparseArray.clear();
        } else {
            this.f350353p = new android.util.SparseArray();
        }
        p00.a aVar = this.f350351n;
        boolean z17 = aVar.f350347a;
        java.lang.Object obj = this.f207076d;
        if (z17) {
            java.lang.String str = null;
            java.util.List O1 = !com.tencent.mm.sdk.platformtools.t8.K0(aVar.f350348b) ? com.tencent.mm.sdk.platformtools.t8.O1(aVar.f350348b, ",") : null;
            if (com.tencent.mm.sdk.platformtools.t8.L0(O1)) {
                ((java.util.ArrayList) this.f350354q).clear();
            } else {
                int i17 = 1;
                if (O1 != null) {
                    ((java.util.ArrayList) this.f350354q).clear();
                    int size = O1.size();
                    for (int i18 = 0; i18 < size; i18++) {
                        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n((java.lang.String) O1.get(i18), true);
                        com.tencent.mm.storage.a3 z07 = !com.tencent.mm.sdk.platformtools.t8.K0(aVar.f350349c) ? ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(aVar.f350349c) : null;
                        rd0.g1 g1Var = (rd0.g1) i95.n0.c(rd0.g1.class);
                        kotlin.jvm.internal.o.d(n17);
                        ((qd0.u0) g1Var).getClass();
                        ((java.util.ArrayList) this.f350354q).add(new p00.d(si5.b.f408325a.c(0, n17, z07), n17));
                    }
                }
                if (((java.util.ArrayList) this.f350354q).size() > 0) {
                    kz5.g0.t(this.f350354q, p00.b.f350350d);
                    java.util.List S0 = kz5.n0.S0(this.f350354q);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    ((java.util.ArrayList) this.f350354q).clear();
                    int size2 = S0.size();
                    for (int i19 = 0; i19 < size2; i19++) {
                        if (com.tencent.mm.storage.z3.m4(((p00.d) S0.get(i19)).f350358b.d1())) {
                            ((java.util.ArrayList) this.f350354q).add(S0.get(i19));
                        } else {
                            arrayList2.add(S0.get(i19));
                        }
                    }
                    this.f350356s = ((java.util.ArrayList) this.f350354q).size();
                    this.f350354q = kz5.n0.V0(kz5.n0.t0(this.f350354q, arrayList2));
                }
                arrayList.add("🔍");
                if (this.f350356s > 0) {
                    kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type android.content.Context");
                    java.lang.String string = ((android.content.Context) obj).getString(com.tencent.mm.R.string.neg);
                    kotlin.jvm.internal.o.f(string, "getString(...)");
                    t(0, string);
                    arrayList.add("openIm");
                } else {
                    i17 = 0;
                }
                java.util.Iterator it = ((java.util.ArrayList) this.f350354q).iterator();
                int i27 = 0;
                while (it.hasNext()) {
                    int i28 = i27 + 1;
                    p00.d dVar = (p00.d) it.next();
                    int i29 = this.f350356s;
                    if (i27 < i29) {
                        i27 = i28;
                    } else {
                        java.lang.String str2 = dVar.f350357a.f408328c;
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
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.feature.ecs.gift.ui.EcsGiftExclusiveSelectContactUI");
            com.tencent.mm.feature.ecs.gift.ui.EcsGiftExclusiveSelectContactUI ecsGiftExclusiveSelectContactUI = (com.tencent.mm.feature.ecs.gift.ui.EcsGiftExclusiveSelectContactUI) obj;
            java.lang.String[] strArr = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
            ecsGiftExclusiveSelectContactUI.E = strArr;
            com.tencent.mm.ui.base.AlphabetScrollBar alphabetScrollBar = ecsGiftExclusiveSelectContactUI.f206447e;
            if (alphabetScrollBar != null) {
                alphabetScrollBar.setAlphabet(strArr);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftSelectContactAdapter", "memberList:%d headerPosMap=%s", java.lang.Integer.valueOf(((java.util.ArrayList) this.f350354q).size()), java.lang.String.valueOf(this.f350352o));
        h();
        notifyDataSetChanged();
    }

    public final void t(int i17, java.lang.String str) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.util.HashMap hashMap = this.f350352o;
        kotlin.jvm.internal.o.d(hashMap);
        hashMap.put(str, valueOf);
        android.util.SparseArray sparseArray = this.f350353p;
        kotlin.jvm.internal.o.d(sparseArray);
        sparseArray.put(i17, str);
    }
}
