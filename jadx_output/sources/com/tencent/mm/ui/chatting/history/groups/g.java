package com.tencent.mm.ui.chatting.history.groups;

/* loaded from: classes10.dex */
public abstract class g {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.ui.chatting.history.groups.b f201751e = new com.tencent.mm.ui.chatting.history.groups.b(null);

    /* renamed from: a, reason: collision with root package name */
    public final ad5.l0[] f201752a = {ad5.q.f3294a, ad5.e.f3244a, ad5.d.f3242a};

    /* renamed from: b, reason: collision with root package name */
    public int f201753b = 1;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.mvvmlist.MvvmList f201754c;

    /* renamed from: d, reason: collision with root package name */
    public xm3.t0 f201755d;

    public g(kotlin.jvm.internal.i iVar) {
    }

    public ad5.l0[] a() {
        return this.f201752a;
    }

    public abstract int b();

    public abstract java.util.List c();

    public boolean d() {
        return false;
    }

    public final void e(int i17) {
        java.util.Map map;
        int i18;
        int i19 = i17;
        if (this.f201753b == i19) {
            return;
        }
        this.f201753b = i19;
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList = this.f201754c;
        if (mvvmList == null) {
            return;
        }
        java.util.ArrayList arrayList = mvvmList.f152065o;
        java.lang.String str = null;
        if (!kotlin.jvm.internal.m0.g(arrayList)) {
            arrayList = null;
        }
        if (arrayList == null) {
            return;
        }
        ym3.f fVar = mvvmList.f152057d;
        uc5.y yVar = fVar instanceof uc5.y ? (uc5.y) fVar : null;
        if (yVar == null || (map = yVar.f426561p) == null) {
            return;
        }
        xm3.t0 t0Var = this.f201755d;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            i18 = 1;
            if (!it.hasNext()) {
                break;
            }
            uc5.l0 l0Var = (uc5.l0) it.next();
            if (l0Var instanceof uc5.k0) {
                str = ((uc5.k0) l0Var).f426518e;
            } else if ((l0Var instanceof uc5.h0) && str != null) {
                java.lang.Integer num = (java.lang.Integer) linkedHashMap.get(str);
                linkedHashMap.put(str, java.lang.Integer.valueOf((num != null ? num.intValue() : 0) + 1));
            }
        }
        int size = arrayList.size() - 1;
        while (size >= 0) {
            uc5.l0 l0Var2 = (uc5.l0) arrayList.get(size);
            if (l0Var2 instanceof uc5.k0) {
                int i27 = size + 1;
                int i28 = i27;
                while (i28 < arrayList.size() && (arrayList.get(i28) instanceof uc5.j0)) {
                    i28++;
                }
                int i29 = i28 - i27;
                uc5.k0 k0Var = (uc5.k0) l0Var2;
                java.lang.Integer num2 = (java.lang.Integer) map.get(k0Var.f426518e);
                int intValue = num2 != null ? num2.intValue() : 0;
                java.lang.Integer num3 = (java.lang.Integer) linkedHashMap.get(k0Var.f426518e);
                int intValue2 = intValue - (num3 != null ? num3.intValue() : 0);
                if (intValue2 < 0) {
                    intValue2 = 0;
                }
                int i37 = i19 > i18 ? intValue2 % i19 : 0;
                if (i37 > i29) {
                    int i38 = i37 - i29;
                    int i39 = i27 + i29;
                    e06.k m17 = e06.p.m(i29, i37);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(m17, 10));
                    java.util.Iterator it6 = m17.iterator();
                    while (it6.hasNext()) {
                        arrayList2.add(new uc5.j0(k0Var.f426518e, ((kz5.x0) it6).b(), k0Var.f426520g));
                    }
                    arrayList.addAll(i39, arrayList2);
                    if (t0Var != null) {
                        t0Var.notifyItemRangeInserted(i39, i38);
                    }
                } else if (i37 < i29) {
                    int i47 = i29 - i37;
                    int i48 = i27 + i37;
                    for (int i49 = 0; i49 < i47; i49++) {
                        arrayList.remove(i48);
                    }
                    if (t0Var != null) {
                        t0Var.notifyItemRangeRemoved(i48, i47);
                    }
                }
                size--;
                i19 = i17;
                i18 = 1;
            } else {
                size--;
            }
        }
        mvvmList.z(com.tencent.mm.ui.chatting.history.groups.f.f201750d);
    }
}
