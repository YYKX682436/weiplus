package kc2;

/* loaded from: classes12.dex */
public final class a2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f306314a;

    /* renamed from: b, reason: collision with root package name */
    public final kc2.x1 f306315b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f306316c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f306317d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f306318e;

    /* renamed from: f, reason: collision with root package name */
    public final int f306319f;

    /* renamed from: g, reason: collision with root package name */
    public int f306320g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f306321h;

    /* renamed from: i, reason: collision with root package name */
    public final long f306322i;

    public a2(java.util.List timeList, kc2.x1 action) {
        kotlin.jvm.internal.o.g(timeList, "timeList");
        kotlin.jvm.internal.o.g(action, "action");
        this.f306314a = timeList;
        this.f306315b = action;
        this.f306316c = "FinderKaraInfoManager.WCDBTimeList";
        this.f306317d = jz5.h.b(kc2.y1.f306544d);
        this.f306318e = new java.util.concurrent.atomic.AtomicBoolean(false);
        com.tencent.mm.plugin.finder.storage.aj0 aj0Var = com.tencent.mm.plugin.finder.storage.aj0.f126440a;
        this.f306319f = ((java.lang.Number) com.tencent.mm.plugin.finder.storage.z70.f(com.tencent.mm.plugin.finder.storage.z70.f128432a, com.tencent.mm.plugin.finder.storage.t70.f127590a, "发现页红点AI模型时间序列特征更新时间精度（秒）", e42.c0.clicfg_finder_reddot_freq_ctrl_mode_timelist_accuracy, 3, false, com.tencent.mm.plugin.finder.storage.sg0.f127549d, 8, null)).intValue();
        this.f306322i = 604800L;
    }

    public static void a(kc2.a2 a2Var, int i17, boolean z17, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            z17 = true;
        }
        a2Var.f();
        a2Var.f306314a.add(java.lang.Integer.valueOf(i17));
        if (c(a2Var, a2Var.f306314a, 0, false, 6, null)) {
            com.tencent.mars.xlog.Log.i(a2Var.f306316c, "add time=" + i17 + " and remove outOfDateItem!");
        }
        if (z17) {
            c66.q qVar = c66.q.f39493a;
            int i19 = a2Var.f306315b.f306539d;
            if (i19 > 0) {
                try {
                    com.tencent.wcdb.core.Table table = (com.tencent.wcdb.core.Table) ((jz5.n) c66.q.f39504l).getValue();
                    ni0.l lVar = new ni0.l();
                    lVar.f337245b = i19;
                    lVar.f337246c = i17;
                    table.insertObject(lVar);
                    com.tencent.mars.xlog.Log.i("Finder.WCFinderWCDB", "addTimeItem actionType=" + i19 + " time=" + i17 + " success");
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.w("Finder.WCFinderWCDB", "addTimeItem actionType=" + i19 + " time=" + i17 + " fail, " + e17.getMessage());
                }
            }
        }
        a2Var.f306321h = a2Var.b(c01.id.e());
    }

    public static boolean c(kc2.a2 a2Var, java.util.List list, int i17, boolean z17, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            i17 = c01.id.e();
        }
        int i19 = i17;
        if ((i18 & 4) != 0) {
            z17 = true;
        }
        boolean z18 = z17;
        a2Var.getClass();
        jz5.g gVar = kc2.m.f306454a;
        kc2.i iVar = (kc2.i) kz5.n0.k0((java.util.List) ((jz5.n) kc2.m.f306454a).getValue());
        return pm0.v.I(list, new kc2.z1(i19, iVar != null ? iVar.f306414d : a2Var.f306322i, z18, a2Var));
    }

    public final java.util.List b(int i17) {
        java.util.List list;
        long j17;
        int i18;
        f();
        jz5.g gVar = kc2.m.f306454a;
        java.util.List<kc2.i> list2 = (java.util.List) ((jz5.n) kc2.m.f306454a).getValue();
        int size = list2.size();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (int i19 = 0; i19 < size; i19++) {
            linkedList.add(0);
        }
        long elapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
        java.lang.StringBuilder sb6 = ((java.lang.Boolean) ((jz5.n) this.f306317d).getValue()).booleanValue() ? new java.lang.StringBuilder("TimeListCountAll curTime=" + i17 + ',') : null;
        java.util.List list3 = this.f306314a;
        synchronized (list3) {
            try {
                int size2 = this.f306314a.size() - 1;
                if (size2 >= 0) {
                    int i27 = 0;
                    while (true) {
                        int i28 = size2 - 1;
                        int intValue = ((java.lang.Number) this.f306314a.get(size2)).intValue();
                        int i29 = i27;
                        while (true) {
                            if (i27 >= size) {
                                j17 = elapsedRealtimeNanos;
                                list = list3;
                                break;
                            }
                            list = list3;
                            try {
                                j17 = elapsedRealtimeNanos;
                                if (i17 - intValue <= ((kc2.i) list2.get(i27)).f306414d) {
                                    linkedList.set(i29, java.lang.Integer.valueOf(this.f306314a.size() - size2));
                                    break;
                                }
                                i29++;
                                i27++;
                                list3 = list;
                                elapsedRealtimeNanos = j17;
                            } catch (java.lang.Throwable th6) {
                                th = th6;
                                throw th;
                            }
                        }
                        if (i29 < size && i28 >= 0) {
                            size2 = i28;
                            i27 = i29;
                            list3 = list;
                            elapsedRealtimeNanos = j17;
                        }
                    }
                } else {
                    j17 = elapsedRealtimeNanos;
                    list = list3;
                }
                for (int i37 = 0; i37 < size; i37++) {
                    java.lang.Integer num = (java.lang.Integer) linkedList.get(i37);
                    if (num != null && num.intValue() == 0) {
                        java.lang.Integer num2 = (java.lang.Integer) kz5.n0.a0(linkedList, i37 - 1);
                        linkedList.set(i37, java.lang.Integer.valueOf(num2 != null ? num2.intValue() : 0));
                    }
                }
                if (sb6 != null) {
                    sb6.append("fastCntCost=" + (android.os.SystemClock.elapsedRealtimeNanos() - j17) + ",result=" + linkedList + '\n');
                }
                if (((java.lang.Boolean) ((jz5.n) this.f306317d).getValue()).booleanValue()) {
                    java.util.LinkedList linkedList2 = new java.util.LinkedList();
                    long elapsedRealtimeNanos2 = android.os.SystemClock.elapsedRealtimeNanos();
                    for (kc2.i iVar : list2) {
                        synchronized (this.f306314a) {
                            java.util.List list4 = this.f306314a;
                            if ((list4 instanceof java.util.Collection) && list4.isEmpty()) {
                                i18 = 0;
                            } else {
                                java.util.Iterator it = list4.iterator();
                                i18 = 0;
                                while (it.hasNext()) {
                                    if ((((long) (i17 - ((java.lang.Number) it.next()).intValue())) <= iVar.f306414d) && (i18 = i18 + 1) < 0) {
                                        kz5.c0.o();
                                        throw null;
                                    }
                                }
                            }
                        }
                        linkedList2.add(java.lang.Integer.valueOf(i18));
                    }
                    boolean b17 = kotlin.jvm.internal.o.b(linkedList, linkedList2);
                    if (sb6 != null) {
                        sb6.append("normalCntCost=" + (android.os.SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos2) + ",result=" + linkedList2);
                    }
                    if (!b17) {
                        com.tencent.mars.xlog.Log.i(this.f306316c, "TimeListCountAll action" + this.f306315b + "_countAllErr");
                        pm0.z.b(xy2.b.f458155b, "action" + this.f306315b + "_countAllErr", false, null, null, false, false, null, 124, null);
                    }
                }
                if (sb6 != null) {
                    com.tencent.mars.xlog.Log.i(this.f306316c, sb6.toString());
                }
                this.f306320g = i17;
                return linkedList;
            } catch (java.lang.Throwable th7) {
                th = th7;
                list = list3;
            }
        }
    }

    public final java.lang.String d() {
        int e17 = c01.id.e();
        int i17 = this.f306320g;
        if (i17 <= 0 || e17 - i17 >= this.f306319f || this.f306321h == null) {
            this.f306321h = b(e17);
        }
        return kc2.l1.f(this.f306321h, (char) 0, 1, null);
    }

    public final java.util.List e(com.tencent.mm.feature.api.discover.DiscoveryReddotFeatures features) {
        kotlin.jvm.internal.o.g(features, "features");
        int e17 = c01.id.e();
        int i17 = this.f306320g;
        if (i17 <= 0 || e17 - i17 >= this.f306319f || this.f306321h == null) {
            this.f306321h = b(e17);
        }
        java.util.List list = this.f306321h;
        if (list == null || list.isEmpty()) {
            return this.f306321h;
        }
        java.util.List list2 = this.f306321h;
        if (list2 != null) {
            kc2.t.f306489a.a(features, this.f306315b, list2);
        }
        return this.f306321h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f() {
        if (this.f306318e.compareAndSet(false, true)) {
            c66.q qVar = c66.q.f39493a;
            kc2.x1 x1Var = this.f306315b;
            int i17 = x1Var.f306539d;
            kz5.p0 p0Var = kz5.p0.f313996d;
            if (i17 > 0) {
                try {
                    java.util.Collection allObjects = ((com.tencent.wcdb.core.Table) ((jz5.n) c66.q.f39504l).getValue()).getAllObjects(ni0.f.f337221d.eq(i17), ni0.f.f337222e.order(com.tencent.wcdb.winq.Order.Asc));
                    kotlin.jvm.internal.o.f(allObjects, "getAllObjects(...)");
                    java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(allObjects, 10));
                    java.util.Iterator it = allObjects.iterator();
                    while (it.hasNext()) {
                        arrayList.add(java.lang.Integer.valueOf(((ni0.l) it.next()).f337246c));
                    }
                    p0Var = arrayList;
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.w("Finder.WCFinderWCDB", "getTimeList actionType=" + i17 + " fail, " + e17.getMessage());
                }
            }
            java.util.List V0 = kz5.n0.V0(p0Var);
            java.lang.String str = x1Var + " getTimeList " + V0 + ",countAccuracy=" + this.f306319f;
            java.lang.String str2 = this.f306316c;
            com.tencent.mars.xlog.Log.i(str2, str);
            if (c(this, V0, 0, false, 6, null)) {
                com.tencent.mars.xlog.Log.i(str2, "init and remove outOfDateItem!");
            }
            java.util.List list = this.f306314a;
            list.clear();
            list.addAll(V0);
        }
    }
}
