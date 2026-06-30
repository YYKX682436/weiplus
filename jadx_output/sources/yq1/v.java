package yq1;

/* loaded from: classes7.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f464485d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f464486e;

    public v(java.util.List list, int i17) {
        this.f464485d = list;
        this.f464486e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f464486e;
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1 t1Var = com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.f94435a;
        java.util.List<java.util.List> items = this.f464485d;
        kotlin.jvm.internal.o.g(items, "items");
        if (!items.isEmpty()) {
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1 t1Var2 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.f94435a;
            int i18 = i17 != 1 ? i17 != 2 ? 0 : 2 : 1;
            if (i18 != 0) {
                for (java.util.List list : items) {
                    com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                    java.lang.Object[] objArr = new java.lang.Object[11];
                    objArr[0] = java.lang.Integer.valueOf(i18);
                    objArr[1] = t1Var2.q(list, 3, "");
                    objArr[2] = fp.s0.a((java.lang.String) list.get(0));
                    objArr[3] = t1Var2.q(list, 4, "");
                    objArr[4] = t1Var2.q(list, 5, "");
                    objArr[5] = 1;
                    objArr[6] = list.get(1);
                    objArr[7] = t1Var2.q(list, 6, "");
                    objArr[8] = t1Var2.q(list, 7, "");
                    objArr[9] = t1Var2.q(list, 8, "");
                    objArr[10] = java.lang.Integer.valueOf((kotlin.jvm.internal.o.b(list.get(1), "-1") && hy4.i.l((java.lang.String) list.get(0))) ? 1 : 0);
                    g0Var.d(16468, objArr);
                }
            }
            if (com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.e(t1Var2.s(i17))) {
                int m17 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.m(i17);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : items) {
                    if (!(!hy4.i.l((java.lang.String) ((java.util.List) obj).get(0)))) {
                        arrayList.add(obj);
                    }
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    java.util.List list2 = (java.util.List) it.next();
                    arrayList2.add(new com.tencent.mm.plugin.brandservice.ui.timeline.preload.z0((java.lang.String) list2.get(0), t1Var2.j(java.lang.Integer.parseInt((java.lang.String) list2.get(1))), (java.lang.String) t1Var2.q(list2, 2, "")));
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.util.Iterator it6 = arrayList2.iterator();
                while (it6.hasNext()) {
                    java.lang.Object next = it6.next();
                    com.tencent.mm.plugin.brandservice.ui.timeline.preload.z0 z0Var = (com.tencent.mm.plugin.brandservice.ui.timeline.preload.z0) next;
                    java.lang.String str = z0Var.f94485a;
                    if (!(!hy4.i.p(str) || com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.f94443i.b(str, z0Var.f94486b))) {
                        arrayList3.add(next);
                    }
                }
                int size = arrayList3.size();
                int max = java.lang.Math.max(arrayList3.size() - m17, 0);
                java.util.List K0 = kz5.n0.K0(arrayList3, m17);
                if (!K0.isEmpty()) {
                    ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).y(i17, size, K0.size(), K0.size() / size, max, m17);
                    t1Var2.d(K0, i17, max, 1);
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preloadData preloadByIdAndUrls toStrip:");
                    sb6.append(m17);
                    sb6.append(" strip:");
                    sb6.append(max);
                    sb6.append(" dispatch:");
                    java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(K0, 10));
                    java.util.Iterator it7 = K0.iterator();
                    while (it7.hasNext()) {
                        arrayList4.add(com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.d(((com.tencent.mm.plugin.brandservice.ui.timeline.preload.z0) it7.next()).f94485a));
                    }
                    sb6.append(arrayList4);
                    com.tencent.mars.xlog.Log.i("MicroMsg.PreloadLogic", sb6.toString());
                }
            }
        }
    }
}
