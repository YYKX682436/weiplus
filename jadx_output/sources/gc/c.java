package gc;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final gc.c f270083a = new gc.c();

    public final java.util.List a(java.util.List list, int i17, int i18, int i19, boolean z17) {
        int i27 = i19 / i18;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.List<gc.a> list2 : kz5.n0.N(list, i18)) {
            int size = (!z17 || list2.size() == i18) ? 0 : (i19 - (list2.size() * i27)) / 2;
            for (gc.a aVar : list2) {
                int i28 = size + i27;
                android.graphics.Rect rect = new android.graphics.Rect(size, i17, i28, i17 + i27);
                if (!(!kotlin.jvm.internal.o.b(rect, aVar.f270082c))) {
                    rect = null;
                }
                if (rect != null) {
                    aVar.f270082c = rect;
                    arrayList.add(aVar);
                }
                size = i28;
            }
            i17 += i27;
        }
        return arrayList;
    }

    public final java.util.List b(java.util.List layoutList, int i17, int i18, int i19) {
        int i27;
        kotlin.jvm.internal.o.g(layoutList, "layoutList");
        layoutList.size();
        java.util.List F0 = kz5.n0.F0(layoutList, new gc.b());
        int i28 = 0;
        boolean z17 = true;
        if (i17 < 0) {
            return a(F0, (F0.size() > 2 || i19 == 0) ? 0 : (i19 - (i18 / 2)) / 2, F0.size() <= 4 ? 2 : 3, i18, F0.size() < 4);
        }
        if (F0.size() <= 4) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            gc.a aVar = (gc.a) kz5.n0.a0(F0, i17);
            if (aVar != null) {
                android.graphics.Rect rect = new android.graphics.Rect(0, 0, i18, i18);
                gc.a aVar2 = kotlin.jvm.internal.o.b(aVar.f270082c, rect) ^ true ? aVar : null;
                if (aVar2 != null) {
                    aVar2.f270082c = rect;
                    arrayList.add(aVar2);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : F0) {
                if (((gc.a) obj).f270080a != i17) {
                    arrayList2.add(obj);
                }
            }
            arrayList.addAll(a(arrayList2, i18, 3, i18, false));
            return arrayList;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        int i29 = i17 / 3;
        if (i17 >= 3) {
            arrayList3.addAll(a(F0.subList(0, i17 - (i17 % 3)), 0, 3, i18, false));
        }
        int i37 = i18 / 3;
        int i38 = (i29 * i37) + 0;
        int i39 = i29 * 3;
        int i47 = (i29 + 1) * 3;
        java.util.List subList = F0.subList(i39, java.lang.Math.min(i47, F0.size()));
        int i48 = i17 % 3;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        boolean z18 = false;
        int i49 = 0;
        int i57 = 0;
        int i58 = 0;
        for (java.lang.Object obj2 : subList) {
            int i59 = i28 + 1;
            if (i28 < 0) {
                kz5.c0.p();
                throw null;
            }
            gc.a aVar3 = (gc.a) obj2;
            if (i28 == i48) {
                if (i49 == 0) {
                    i57 = i37 * 2;
                }
                int i66 = i37 * 2;
                android.graphics.Rect rect2 = new android.graphics.Rect(i49, i38, i49 + i66, i66 + i38);
                if (!(kotlin.jvm.internal.o.b(aVar3.f270082c, rect2) ^ z17)) {
                    aVar3 = null;
                }
                if (aVar3 != null) {
                    aVar3.f270082c = rect2;
                    arrayList4.add(aVar3);
                }
                i27 = i48;
                z18 = z17;
            } else {
                if (!z18) {
                    i49 = i37;
                }
                int i67 = i38 + i58;
                i27 = i48;
                android.graphics.Rect rect3 = new android.graphics.Rect(i57, i67, i57 + i37, i67 + i37);
                z17 = true;
                if (!(!kotlin.jvm.internal.o.b(aVar3.f270082c, rect3))) {
                    aVar3 = null;
                }
                if (aVar3 != null) {
                    aVar3.f270082c = rect3;
                    arrayList4.add(aVar3);
                }
                i58 += i37;
            }
            i48 = i27;
            i28 = i59;
        }
        arrayList3.addAll(arrayList4);
        int i68 = (i37 * 2) + i38;
        if (i47 < F0.size()) {
            arrayList3.addAll(a(F0.subList(i47, F0.size()), i68, 3, i18, false));
        }
        return arrayList3;
    }
}
