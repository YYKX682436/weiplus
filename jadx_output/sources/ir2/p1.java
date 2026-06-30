package ir2;

/* loaded from: classes2.dex */
public class p1 {

    /* renamed from: a, reason: collision with root package name */
    public final ir2.a1 f294206a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlinx.coroutines.flow.i2 f294207b;

    /* renamed from: c, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j f294208c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f294209d;

    /* renamed from: e, reason: collision with root package name */
    public final ir2.q1 f294210e;

    public p1(ir2.a1 loader) {
        kotlin.jvm.internal.o.g(loader, "loader");
        this.f294206a = loader;
        kotlinx.coroutines.flow.i2 b17 = kotlinx.coroutines.flow.r2.b(0, 0, null, 7, null);
        this.f294207b = b17;
        this.f294208c = b17;
        this.f294209d = new java.util.ArrayList();
        this.f294210e = new ir2.q1();
        kotlinx.coroutines.l.d(loader.getLifecycleScope(), null, null, new ir2.h1(this, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    public static final void a(ir2.p1 p1Var, ir2.x xVar) {
        int i17;
        int i18;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject2;
        int i19;
        so2.j5 j5Var;
        p1Var.getClass();
        com.tencent.mars.xlog.Log.i("Finder.DataMerger", "merge event:" + xVar);
        java.util.HashSet hashSet = new java.util.HashSet();
        if (!((java.util.ArrayList) p1Var.f294209d).isEmpty()) {
            java.util.ListIterator listIterator = ((java.util.ArrayList) p1Var.f294209d).listIterator();
            while (listIterator.hasNext()) {
                int nextIndex = listIterator.nextIndex();
                ir2.i1 i1Var = (ir2.i1) listIterator.next();
                long itemId = i1Var.getItemId();
                com.tencent.mars.xlog.Log.i("Finder.DataMerger", "filterSnapShot index: " + nextIndex + " id:" + itemId + " lastItem:" + i1Var);
                if (i1Var.f294155e == 1) {
                    hashSet.add(java.lang.Long.valueOf(itemId));
                    listIterator.remove();
                }
            }
        }
        ir2.a1 a1Var = p1Var.f294206a;
        java.util.List list = a1Var.f294091d;
        com.tencent.mars.xlog.Log.i("Finder.DataMerger", "filterOriginLoaderData");
        if (!hashSet.isEmpty()) {
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                if (hashSet.contains(java.lang.Long.valueOf(((so2.j5) it.next()).getItemId()))) {
                    it.remove();
                }
            }
        }
        if (xVar instanceof ir2.r) {
            ir2.r rVar = (ir2.r) xVar;
            p1Var.e(new ir2.s1(rVar.f294212a), list, rVar.f294212a);
            return;
        }
        if (xVar instanceof ir2.v) {
            ir2.v vVar = (ir2.v) xVar;
            p1Var.e(new ir2.u1(vVar.f294228a), list, vVar.f294228a);
            return;
        }
        if (xVar instanceof ir2.t) {
            ir2.t tVar = (ir2.t) xVar;
            p1Var.e(new ir2.t1(tVar.f294218a), list, tVar.f294218a);
            return;
        }
        boolean z17 = xVar instanceof ir2.w;
        java.util.List dataList = a1Var.f294091d;
        java.lang.String str = null;
        str = null;
        if (z17) {
            ir2.w wVar = (ir2.w) xVar;
            long j17 = wVar.f294231a;
            ir2.a2 a2Var = wVar instanceof ir2.a2 ? (ir2.a2) wVar : null;
            java.lang.Object obj = a2Var != null ? a2Var.f294104e : null;
            ir2.a2 a2Var2 = (ir2.a2) wVar;
            kotlin.jvm.internal.o.g(dataList, "dataList");
            long j18 = a2Var2.f294231a;
            if (j18 != -1) {
                java.util.Iterator it6 = ((java.util.ArrayList) dataList).iterator();
                int i27 = 0;
                while (true) {
                    if (!it6.hasNext()) {
                        i19 = -1;
                        break;
                    }
                    if ((((so2.j5) it6.next()).getItemId() == j18) == true) {
                        i19 = i27;
                        break;
                    }
                    i27++;
                }
            } else {
                i19 = a2Var2.f294102c;
            }
            if (i19 >= 0) {
                java.util.ArrayList arrayList = (java.util.ArrayList) dataList;
                if (i19 < arrayList.size() && (j5Var = a2Var2.f294103d) != null) {
                    arrayList.set(i19, j5Var);
                }
            }
            com.tencent.mars.xlog.Log.i("Finder.DataMerger", "update index：" + i19 + " updateId:" + j17 + " updatePayload:" + obj);
            if (wVar.f294232b) {
                pm0.v.X(new ir2.n1(p1Var));
            } else {
                java.util.List list2 = p1Var.f294209d;
                android.util.ArrayMap arrayMap = new android.util.ArrayMap();
                arrayMap.put(java.lang.Integer.valueOf(i19), obj);
                p1Var.b(androidx.recyclerview.widget.h0.a(new ir2.l1(list2, dataList, p1Var, arrayMap), true), 1);
            }
            if (i19 >= 0) {
                java.util.ArrayList arrayList2 = (java.util.ArrayList) dataList;
                if (i19 < arrayList2.size()) {
                    d(p1Var, true, false, false, i19, (so2.j5) arrayList2.get(i19), 0, 38, null);
                    return;
                }
            }
            com.tencent.mars.xlog.Log.i("Finder.DataMerger", "update index " + i19 + ", but datalist size is " + ((java.util.ArrayList) dataList).size());
            return;
        }
        if (!(xVar instanceof ir2.s)) {
            if (!(xVar instanceof ir2.q)) {
                if (xVar instanceof ir2.u) {
                    com.tencent.mars.xlog.Log.i("Finder.DataMerger", "query");
                    ((ir2.u) xVar).a(dataList);
                    return;
                }
                return;
            }
            com.tencent.mars.xlog.Log.i("Finder.DataMerger", "delete");
            ir2.e eVar = (ir2.e) ((ir2.q) xVar);
            eVar.getClass();
            kotlin.jvm.internal.o.g(dataList, "dataList");
            long j19 = eVar.f294125b;
            if (j19 != -1) {
                java.util.Iterator it7 = ((java.util.ArrayList) dataList).iterator();
                i17 = 0;
                while (true) {
                    if (!it7.hasNext()) {
                        i17 = -1;
                        break;
                    } else if ((((so2.j5) it7.next()).getItemId() == j19) == true) {
                        break;
                    } else {
                        i17++;
                    }
                }
            } else {
                i17 = eVar.f294124a;
            }
            long j27 = eVar.f294126c;
            if (j27 != -1) {
                java.util.Iterator it8 = ((java.util.ArrayList) dataList).iterator();
                i17 = 0;
                while (true) {
                    if (!it8.hasNext()) {
                        i17 = -1;
                        break;
                    }
                    so2.j5 j5Var2 = (so2.j5) it8.next();
                    if (((j5Var2 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) && ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var2).getFeedObject().getLocalId() == j27) == true) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
            if (i17 > -1) {
                java.util.ArrayList arrayList3 = (java.util.ArrayList) dataList;
                if (i17 < arrayList3.size()) {
                    arrayList3.remove(i17);
                    p1Var.b(c(p1Var, p1Var.f294209d, dataList, null, 4, null), 1);
                    d(p1Var, false, true, false, i17, null, 0, 53, null);
                    return;
                }
            }
            i17 = -1;
            p1Var.b(c(p1Var, p1Var.f294209d, dataList, null, 4, null), 1);
            d(p1Var, false, true, false, i17, null, 0, 53, null);
            return;
        }
        ir2.s sVar = (ir2.s) xVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("insert size:");
        sb6.append(((java.util.ArrayList) p1Var.f294209d).size());
        sb6.append(' ');
        java.lang.Object Z = kz5.n0.Z(dataList);
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = Z instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) Z : null;
        sb6.append((baseFinderFeed == null || (feedObject2 = baseFinderFeed.getFeedObject()) == null) ? null : feedObject2.getDescription());
        com.tencent.mars.xlog.Log.i("Finder.DataMerger", sb6.toString());
        ir2.b0 b0Var = (ir2.b0) sVar;
        b0Var.getClass();
        java.util.HashSet hashSet2 = new java.util.HashSet();
        long j28 = b0Var.f294111d;
        if (j28 != -1) {
            java.util.Iterator it9 = ((java.util.ArrayList) dataList).iterator();
            i18 = 0;
            while (true) {
                if (!it9.hasNext()) {
                    i18 = -1;
                    break;
                } else if ((((so2.j5) it9.next()).getItemId() == j28) == true) {
                    break;
                } else {
                    i18++;
                }
            }
        } else {
            i18 = b0Var.f294110c;
        }
        if (i18 == -1) {
            i18 = ((java.util.ArrayList) dataList).size();
        }
        java.util.ArrayList arrayList4 = (java.util.ArrayList) dataList;
        java.util.List list3 = b0Var.f294214a;
        arrayList4.addAll(i18, list3);
        for (int i28 = 0; i28 < list3.size(); i28++) {
            hashSet2.add(java.lang.Integer.valueOf(i18));
            i18++;
        }
        if (sVar.f294215b) {
            pm0.v.X(new ir2.n1(p1Var));
        } else {
            p1Var.b(c(p1Var, p1Var.f294209d, dataList, null, 4, null), 1);
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("insert size after:");
        sb7.append(arrayList4.size());
        sb7.append("  ");
        java.lang.Object Z2 = kz5.n0.Z(dataList);
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = Z2 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) Z2 : null;
        if (baseFinderFeed2 != null && (feedObject = baseFinderFeed2.getFeedObject()) != null) {
            str = feedObject.getDescription();
        }
        sb7.append(str);
        com.tencent.mars.xlog.Log.i("Finder.DataMerger", sb7.toString());
        java.util.Iterator it10 = hashSet2.iterator();
        while (it10.hasNext()) {
            int intValue = ((java.lang.Number) it10.next()).intValue();
            if (intValue < 0 || intValue >= arrayList4.size()) {
                com.tencent.mars.xlog.Log.i("Finder.DataMerger", "insert index " + intValue + ", but datalist size is " + arrayList4.size());
            } else {
                d(p1Var, false, false, true, intValue, (so2.j5) arrayList4.get(intValue), 0, 35, null);
            }
        }
    }

    public static androidx.recyclerview.widget.c0 c(ir2.p1 p1Var, java.util.List list, java.util.List list2, java.util.Map map, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDiffResult");
        }
        if ((i17 & 4) != 0) {
            map = null;
        }
        p1Var.getClass();
        return androidx.recyclerview.widget.h0.a(new ir2.l1(list, list2, p1Var, map), true);
    }

    public static void d(ir2.p1 p1Var, boolean z17, boolean z18, boolean z19, int i17, so2.j5 j5Var, int i18, int i19, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleSnapShot");
        }
        if ((i19 & 1) != 0) {
            z17 = false;
        }
        if ((i19 & 2) != 0) {
            z18 = false;
        }
        if ((i19 & 4) != 0) {
            z19 = false;
        }
        if ((i19 & 8) != 0) {
            i17 = -1;
        }
        if ((i19 & 16) != 0) {
            j5Var = null;
        }
        if ((i19 & 32) != 0) {
            i18 = 2;
        }
        p1Var.getClass();
        if (z17 && i17 != -1 && j5Var != null) {
            p1Var.f294209d.set(i17, new ir2.i1(p1Var, j5Var, i18));
        }
        if (z18 && i17 != -1) {
            p1Var.f294209d.remove(i17);
        }
        if (!z19 || i17 == -1 || j5Var == null) {
            return;
        }
        p1Var.f294209d.add(i17, new ir2.i1(p1Var, j5Var, i18));
    }

    public final void b(androidx.recyclerview.widget.c0 c0Var, int i17) {
        this.f294209d.size();
        pf5.e.launchUI$default(this.f294206a, null, null, new ir2.k1(c0Var, this, i17, null), 3, null);
    }

    public final void e(ir2.v1 v1Var, java.util.List list, ir2.e1 e1Var) {
        boolean isEmpty = list.isEmpty();
        java.util.List list2 = e1Var.f294129a;
        e1Var.b(list);
        if (!list2.isEmpty()) {
            if (isEmpty || e1Var.f294130b) {
                pf5.e.launchUI$default(this.f294206a, null, null, new ir2.m1(this, null), 3, null);
            } else {
                b(c(this, this.f294209d, list, null, 4, null), e1Var.f294129a.size());
            }
            com.tencent.mars.xlog.Log.i("Finder.DataMerger", "handleState: " + this.f294209d.size() + " size:" + list.size());
            int c17 = e1Var.c();
            java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new ir2.i1(this, (so2.j5) it.next(), c17));
            }
            this.f294209d = arrayList;
        }
        com.tencent.mars.xlog.Log.i("Finder.DataMerger", "sendState: " + v1Var);
        kotlinx.coroutines.l.d(this.f294206a.getLifecycleScope(), null, null, new ir2.o1(this, v1Var, null), 3, null);
    }
}
