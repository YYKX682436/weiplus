package lz1;

/* loaded from: classes13.dex */
public class b implements lz1.a {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f322321a = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f322322b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f322323c = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f322324d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public float f322325e;

    /* renamed from: f, reason: collision with root package name */
    public lz1.c f322326f;

    public final long a() {
        sy1.f fVar = cy1.a.Ui().f224690m;
        if (fVar != null) {
            return fVar.f413857l;
        }
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28, types: [int] */
    /* JADX WARN: Type inference failed for: r1v35 */
    public void b(long j17, boolean z17, boolean z18) {
        java.lang.Object obj;
        java.util.List list;
        com.tencent.mars.xlog.Log.i("Amoeba.StandardEventMonitor", "[onAppIn] time : %d, screenOn : %b, isTaskChange : %b", java.lang.Long.valueOf(j17), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        long j18 = 0;
        boolean z19 = false;
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            long j19 = com.tencent.mm.sdk.platformtools.o4.L().getLong("data_report_last_app_out_time", 0L);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("in_type", java.lang.Integer.valueOf(z17 ? 2 : 0));
            hashMap.put("in_time", java.lang.Long.valueOf(j17));
            hashMap.put("last_app_out_time", java.lang.Long.valueOf(j19));
            long j27 = j17 - j19;
            if (j27 <= 0) {
                j27 = 0;
            }
            hashMap.put("last_app_out_stay_time", java.lang.Long.valueOf(j27));
            cy1.a.Ui().Ij(j17, "app_in", hashMap);
            oz1.e.a().f(j17, "app_in", null, hashMap);
            try {
                this.f322325e = ph.t.k().c().b() / 100.0f;
            } catch (java.lang.Exception unused) {
            }
            sy1.f fVar = cy1.a.Ui().f224690m;
            if (fVar != null) {
                fVar.f413857l = j17;
            }
        }
        java.util.List list2 = this.f322323c;
        java.util.List list3 = this.f322321a;
        if (z18) {
            this.f322326f = null;
            ((java.util.concurrent.CopyOnWriteArrayList) list3).clear();
            ((java.util.concurrent.ConcurrentHashMap) this.f322322b).clear();
            ((java.util.concurrent.CopyOnWriteArrayList) list2).clear();
            ((java.util.concurrent.ConcurrentHashMap) this.f322324d).clear();
        }
        lz1.c cVar = this.f322326f;
        if (cVar != null) {
            cVar.f322328a = j17;
            cVar.f322329b = 0L;
            cVar.f322331d = false;
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("in_type", java.lang.Integer.valueOf(z17 ? 2 : 0));
            hashMap2.put("in_time", java.lang.Long.valueOf(j17));
            hashMap2.put("app_in_time", java.lang.Long.valueOf(a()));
            obj = "app_in_time";
            list = list3;
            cy1.a.Ui().Kj(j17, "biz_in", this.f322326f.f322330c, hashMap2);
            oz1.e.a().f(j17, "biz_in", this.f322326f.f322330c, hashMap2);
        } else {
            obj = "app_in_time";
            list = list3;
        }
        int i17 = 0;
        while (i17 <= ((java.util.concurrent.CopyOnWriteArrayList) list).size() - 1) {
            lz1.c cVar2 = (lz1.c) ((java.util.concurrent.CopyOnWriteArrayList) list).get(i17);
            cVar2.f322328a = j17;
            cVar2.f322329b = 0L;
            cVar2.f322331d = z19;
            java.util.HashMap hashMap3 = new java.util.HashMap();
            hashMap3.put("in_type", java.lang.Integer.valueOf((int) (z17 ? 2 : z19)));
            hashMap3.put("in_time", java.lang.Long.valueOf(j17));
            hashMap3.put(obj, java.lang.Long.valueOf(a()));
            cy1.a.Ui().Kj(j17, "session_in", cVar2.f322330c, hashMap3);
            oz1.e.a().f(j17, "session_in", cVar2.f322330c, hashMap3);
            i17++;
            z19 = false;
        }
        int i18 = 0;
        while (i18 <= ((java.util.concurrent.CopyOnWriteArrayList) list2).size() - 1) {
            lz1.c cVar3 = (lz1.c) ((java.util.concurrent.CopyOnWriteArrayList) list2).get(i18);
            if (cVar3 != null) {
                cVar3.f322328a = j17;
                cVar3.f322329b = j18;
                cVar3.f322331d = false;
                java.util.HashMap hashMap4 = new java.util.HashMap();
                hashMap4.put("in_type", java.lang.Integer.valueOf(z17 ? 2 : 0));
                hashMap4.put("in_time", java.lang.Long.valueOf(j17));
                hashMap4.put(obj, java.lang.Long.valueOf(a()));
                cy1.a.Ui().Kj(j17, "page_in", cVar3.f322330c, hashMap4);
                oz1.e.a().f(j17, "page_in", cVar3.f322330c, hashMap4);
            }
            i18++;
            j18 = 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x01af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(long r23, boolean r25) {
        /*
            Method dump skipped, instructions count: 716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lz1.b.c(long, boolean):void");
    }

    public void d(hz1.a aVar, long j17) {
        java.util.Map c17;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        if (aVar == null) {
            return;
        }
        lz1.c cVar = this.f322326f;
        if (cVar == null || !aVar.d(cVar.f322330c)) {
            com.tencent.mars.xlog.Log.i("Amoeba.StandardEventMonitor", "[onBizIn] page : " + aVar + ", time : " + j17);
            sy1.f fVar = cy1.a.Ui().f224690m;
            if (fVar != null) {
                fVar.l(aVar, "biz_in");
                int b17 = uy1.a.b(aVar);
                if (b17 > 0) {
                    if (cy1.a.Ui().f224690m != null && (c17 = fVar.c(fVar.f413865t)) != null) {
                        java.util.HashMap hashMap = (java.util.HashMap) c17;
                        if (hashMap.size() > 0) {
                            java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = (java.util.concurrent.ConcurrentHashMap) fVar.f413866u;
                            java.util.Iterator it = concurrentHashMap2.keySet().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    concurrentHashMap = null;
                                    break;
                                }
                                hz1.a aVar2 = (hz1.a) it.next();
                                if (aVar.d(aVar2)) {
                                    concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) concurrentHashMap2.get(aVar2);
                                    break;
                                }
                            }
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
                                concurrentHashMap2.put(aVar, concurrentHashMap);
                            }
                            for (java.util.Map.Entry entry : hashMap.entrySet()) {
                                if (entry.getValue() != null) {
                                    concurrentHashMap.put((java.lang.String) entry.getKey(), entry.getValue());
                                }
                            }
                        }
                    }
                    fVar.f413851f = java.lang.String.format("%s_%d", java.lang.Integer.valueOf(b17), java.lang.Long.valueOf(j17));
                    fVar.f413865t = aVar;
                    com.tencent.mars.xlog.Log.i("Amoeba.PageContext", "[bizIn] bizId : " + fVar.f413851f);
                }
            }
            lz1.c cVar2 = new lz1.c(this);
            this.f322326f = cVar2;
            cVar2.f322330c = aVar;
            cVar2.f322328a = j17;
            cVar2.f322329b = 0L;
            cVar2.f322331d = false;
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("in_type", 1);
            hashMap2.put("in_time", java.lang.Long.valueOf(j17));
            hashMap2.put("app_in_time", java.lang.Long.valueOf(a()));
            cy1.a.Ui().Kj(j17, "biz_in", aVar, hashMap2);
            oz1.e.a().f(j17, "biz_in", aVar, hashMap2);
        }
    }

    public void e(hz1.a aVar, long j17) {
        lz1.c cVar;
        hz1.a aVar2;
        if (aVar == null || (cVar = this.f322326f) == null || !aVar.d(cVar.f322330c)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("Amoeba.StandardEventMonitor", "[onBizOut] page : " + aVar + ", time : " + j17);
        lz1.c cVar2 = this.f322326f;
        long j18 = cVar2.f322328a;
        long j19 = (j17 <= j18 || j18 <= 0) ? 0L : j17 - j18;
        cVar2.f322329b = j19;
        if (j19 > 0 && !cVar2.f322331d) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("out_type", 1);
            hashMap.put("in_time", java.lang.Long.valueOf(this.f322326f.f322328a));
            hashMap.put("out_time", java.lang.Long.valueOf(j17));
            hashMap.put("stay_time", java.lang.Long.valueOf(this.f322326f.f322329b));
            hashMap.put("app_in_time", java.lang.Long.valueOf(a()));
            cy1.a.Ui().Kj(j17, "biz_out", aVar, hashMap);
            oz1.e.a().f(j17, "biz_out", aVar, hashMap);
        }
        this.f322326f.f322331d = true;
        this.f322326f = null;
        sy1.f fVar = cy1.a.Ui().f224690m;
        if (fVar == null || (aVar2 = fVar.f413865t) == null || !aVar2.d(aVar)) {
            return;
        }
        fVar.f413852g = fVar.f413851f;
        fVar.f413851f = null;
        fVar.f413865t = null;
        com.tencent.mars.xlog.Log.i("Amoeba.PageContext", "[bizOut] bizId : null");
    }

    public void f(hz1.a aVar, long j17, boolean z17) {
        hz1.a aVar2;
        java.util.List list;
        if (aVar == null) {
            return;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) this.f322324d;
        java.lang.String str = aVar.f286288b;
        if (((lz1.c) concurrentHashMap.get(str)) != null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("Amoeba.StandardEventMonitor", "[onPageIn] page : " + aVar + ", isSubPage : " + z17 + ", time : " + j17);
        sy1.f fVar = cy1.a.Ui().f224690m;
        if (fVar != null) {
            if (!z17) {
                fVar.k(aVar, j17);
            } else if (fVar.f413847b != null) {
                fVar.l(aVar, "page_in");
                vy1.b j18 = uy1.a.j(aVar, true);
                if (j18 != null) {
                    j18.f441437p = j17;
                }
                hz1.a aVar3 = fVar.f413847b;
                if (aVar3 != null) {
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = (java.util.concurrent.ConcurrentHashMap) fVar.f413848c;
                    java.util.Iterator it = concurrentHashMap2.keySet().iterator();
                    while (true) {
                        aVar2 = null;
                        if (!it.hasNext()) {
                            list = null;
                            break;
                        }
                        hz1.a aVar4 = (hz1.a) it.next();
                        if (aVar3.d(aVar4)) {
                            list = (java.util.List) concurrentHashMap2.get(aVar4);
                            break;
                        }
                    }
                    if (list == null) {
                        list = new java.util.concurrent.CopyOnWriteArrayList();
                        concurrentHashMap2.put(aVar3, list);
                    }
                    java.util.Iterator it6 = list.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            list.add(aVar);
                            if (uy1.a.c(aVar, "page_is_full_subpage", false)) {
                                if (uy1.a.k(aVar) > 0) {
                                    java.util.concurrent.ConcurrentHashMap concurrentHashMap3 = (java.util.concurrent.ConcurrentHashMap) fVar.f413849d;
                                    java.util.Iterator it7 = concurrentHashMap3.keySet().iterator();
                                    while (true) {
                                        if (!it7.hasNext()) {
                                            break;
                                        }
                                        hz1.a aVar5 = (hz1.a) it7.next();
                                        if (aVar3.d(aVar5)) {
                                            aVar2 = aVar5;
                                            break;
                                        }
                                    }
                                    if (aVar2 != null) {
                                        concurrentHashMap3.put(aVar2, aVar);
                                    } else {
                                        concurrentHashMap3.put(aVar3, aVar);
                                    }
                                }
                            }
                        } else if (((hz1.a) it6.next()).d(aVar)) {
                            break;
                        }
                    }
                }
            }
        }
        lz1.c cVar = new lz1.c(this);
        cVar.f322330c = aVar;
        cVar.f322328a = j17;
        cVar.f322329b = 0L;
        cVar.f322331d = false;
        concurrentHashMap.put(str, cVar);
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) this.f322323c;
        copyOnWriteArrayList.add(cVar);
        int size = copyOnWriteArrayList.size();
        if (pz1.a.a() && size > pz1.a.f359179d) {
            pz1.a.f359179d = size;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("5");
            arrayList.add(java.lang.String.valueOf(size));
            com.tencent.mm.plugin.report.service.g0.INSTANCE.l(24504, arrayList);
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("in_type", 1);
        hashMap.put("in_time", java.lang.Long.valueOf(j17));
        hashMap.put("app_in_time", java.lang.Long.valueOf(a()));
        hashMap.put("cur_enter_method", aVar.a());
        hashMap.put("enter_method", cVar.f322330c.b());
        cy1.a.Ui().Kj(j17, "page_in", aVar, hashMap);
        oz1.e.a().f(j17, "page_in", aVar, hashMap);
    }

    public void g(hz1.a aVar, long j17, boolean z17) {
        sy1.f fVar;
        hz1.a aVar2;
        hz1.a aVar3;
        java.util.List list;
        if (aVar == null) {
            return;
        }
        java.util.Map map = this.f322324d;
        java.lang.String str = aVar.f286288b;
        lz1.c cVar = (lz1.c) ((java.util.concurrent.ConcurrentHashMap) map).get(str);
        if (cVar == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("Amoeba.StandardEventMonitor", "[onPageOut] page : " + aVar + ", isSubPage : " + z17 + ", time : " + j17);
        if (z17 && (fVar = cy1.a.Ui().f224690m) != null && (aVar2 = fVar.f413847b) != null) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) fVar.f413848c;
            java.util.Iterator it = concurrentHashMap.keySet().iterator();
            while (true) {
                aVar3 = null;
                if (!it.hasNext()) {
                    list = null;
                    break;
                }
                hz1.a aVar4 = (hz1.a) it.next();
                if (aVar2.d(aVar4)) {
                    list = (java.util.List) concurrentHashMap.get(aVar4);
                    break;
                }
            }
            if (list != null && list.size() > 0) {
                java.util.Iterator it6 = list.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    hz1.a aVar5 = (hz1.a) it6.next();
                    if (aVar.d(aVar5)) {
                        aVar3 = aVar5;
                        break;
                    }
                }
                if (aVar3 != null) {
                    list.remove(aVar3);
                }
            }
        }
        long j18 = cVar.f322328a;
        cVar.f322329b = (j17 <= j18 || j18 <= 0) ? 0L : j17 - j18;
        ((java.util.concurrent.ConcurrentHashMap) map).remove(str);
        ((java.util.concurrent.CopyOnWriteArrayList) this.f322323c).remove(cVar);
        if (cVar.f322329b > 0 && !cVar.f322331d) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("out_type", 1);
            hashMap.put("in_time", java.lang.Long.valueOf(cVar.f322328a));
            hashMap.put("out_time", java.lang.Long.valueOf(j17));
            hashMap.put("stay_time", java.lang.Long.valueOf(cVar.f322329b));
            hashMap.put("app_in_time", java.lang.Long.valueOf(a()));
            hashMap.put("cur_enter_method", cVar.f322330c.a());
            hashMap.put("enter_method", cVar.f322330c.b());
            cy1.a.Ui().Kj(j17, "page_out", aVar, hashMap);
            oz1.e.a().f(j17, "page_out", aVar, hashMap);
        }
        cVar.f322331d = true;
    }

    public void h() {
        this.f322326f = null;
        ((java.util.concurrent.CopyOnWriteArrayList) this.f322321a).clear();
        ((java.util.concurrent.ConcurrentHashMap) this.f322322b).clear();
        ((java.util.concurrent.CopyOnWriteArrayList) this.f322323c).clear();
        ((java.util.concurrent.ConcurrentHashMap) this.f322324d).clear();
    }

    public void i(hz1.a aVar, long j17) {
        java.lang.String format;
        if (aVar == null) {
            return;
        }
        if (a() == 0) {
            sy1.f fVar = cy1.a.Ui().f224690m;
            if (fVar != null) {
                fVar.f413857l = j17;
            }
            try {
                this.f322325e = ph.t.k().c().b() / 100.0f;
            } catch (java.lang.Exception unused) {
            }
        }
        java.util.Map map = this.f322322b;
        java.lang.String str = aVar.f286288b;
        if (((lz1.c) ((java.util.concurrent.ConcurrentHashMap) map).get(str)) != null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("Amoeba.StandardEventMonitor", "[onSessionIn] page : " + aVar + ", time : " + j17 + ", isMutilTask : " + aVar.f286299m);
        sy1.f fVar2 = cy1.a.Ui().f224690m;
        if (fVar2 != null) {
            java.lang.String str2 = fVar2.f413856k;
            if (!u46.l.e(str2)) {
                aVar.f286301o = str2;
                aVar.f286300n = str2;
                aVar.f286299m = false;
            }
            fVar2.f413856k = null;
            fVar2.l(aVar, "session_in");
            vy1.b j18 = uy1.a.j(aVar, true);
            if (j18 != null) {
                j18.f441438q = j17;
            }
            java.lang.String str3 = fVar2.f413853h;
            vy1.b j19 = uy1.a.j(aVar, true);
            if (j19 != null || u46.l.e(str3)) {
                j19.f441439r = str3;
            }
            int k17 = uy1.a.k(aVar);
            if (k17 <= 0) {
                java.lang.Object[] objArr = new java.lang.Object[2];
                java.lang.String str4 = aVar.f286289c;
                if (str4 == null) {
                    str4 = "";
                }
                objArr[0] = str4;
                objArr[1] = java.lang.Long.valueOf(j17);
                format = java.lang.String.format("%s_%d", objArr);
            } else {
                format = java.lang.String.format("%d_%d", java.lang.Integer.valueOf(k17), java.lang.Long.valueOf(j17));
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[sessionIn] sessionId : ");
            sb6.append(format);
            sb6.append(", sessionIds count : ");
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) fVar2.f413862q;
            sb6.append(copyOnWriteArrayList.size());
            com.tencent.mars.xlog.Log.i("Amoeba.PageContext", sb6.toString());
            if (cy1.a.Ui().f224690m != null) {
                fVar2.g(aVar, fVar2.d(fVar2.f413846a));
            }
            ((java.util.concurrent.ConcurrentHashMap) fVar2.f413861p).put(aVar, format);
            copyOnWriteArrayList.add(format);
            boolean e17 = u46.l.e(fVar2.f413853h);
            java.util.Map map2 = fVar2.f413860o;
            if (e17) {
                ((java.util.HashMap) map2).put(format, "0-unknown_view_id");
            } else {
                ((java.util.HashMap) map2).put(format, fVar2.f413854i + "-" + fVar2.f413853h);
            }
        }
        lz1.c cVar = new lz1.c(this);
        cVar.f322330c = aVar;
        cVar.f322328a = j17;
        cVar.f322329b = 0L;
        cVar.f322331d = false;
        ((java.util.concurrent.ConcurrentHashMap) map).put(str, cVar);
        java.util.List list = this.f322321a;
        ((java.util.concurrent.CopyOnWriteArrayList) list).add(cVar);
        int size = ((java.util.concurrent.CopyOnWriteArrayList) list).size();
        if (pz1.a.a() && size > pz1.a.f359178c) {
            pz1.a.f359178c = size;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("4");
            arrayList.add(java.lang.String.valueOf(size));
            com.tencent.mm.plugin.report.service.g0.INSTANCE.l(24504, arrayList);
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("in_type", 1);
        hashMap.put("in_time", java.lang.Long.valueOf(j17));
        hashMap.put("app_in_time", java.lang.Long.valueOf(a()));
        hashMap.put("cur_enter_method", aVar.a());
        hashMap.put("enter_method", aVar.b());
        cy1.a.Ui().Kj(j17, "session_in", aVar, hashMap);
        oz1.e.a().f(j17, "session_in", aVar, hashMap);
    }

    public void j(final hz1.a aVar, long j17) {
        if (aVar == null) {
            return;
        }
        java.util.Map map = this.f322322b;
        java.lang.String str = aVar.f286288b;
        lz1.c cVar = (lz1.c) ((java.util.concurrent.ConcurrentHashMap) map).get(str);
        if (cVar == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("Amoeba.StandardEventMonitor", "[onSessionOut] page : " + aVar + ", time : " + j17);
        long j18 = cVar.f322328a;
        cVar.f322329b = (j17 <= j18 || j18 <= 0) ? 0L : j17 - j18;
        ((java.util.concurrent.ConcurrentHashMap) map).remove(str);
        ((java.util.concurrent.CopyOnWriteArrayList) this.f322321a).remove(cVar);
        if (cVar.f322329b > 0 && !cVar.f322331d) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("out_type", 1);
            hashMap.put("in_time", java.lang.Long.valueOf(cVar.f322328a));
            hashMap.put("out_time", java.lang.Long.valueOf(j17));
            hashMap.put("stay_time", java.lang.Long.valueOf(cVar.f322329b));
            hashMap.put("app_in_time", java.lang.Long.valueOf(a()));
            hashMap.put("cur_enter_method", cVar.f322330c.a());
            hashMap.put("enter_method", cVar.f322330c.b());
            cy1.a.Ui().Kj(j17, "session_out", aVar, hashMap);
            oz1.e.a().f(j17, "session_out", aVar, hashMap);
        }
        cVar.f322331d = true;
        sy1.f fVar = cy1.a.Ui().f224690m;
        if (fVar != null) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) fVar.f413861p;
            java.util.Iterator it = concurrentHashMap.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                hz1.a aVar2 = (hz1.a) it.next();
                if (aVar.d(aVar2)) {
                    java.lang.String str2 = (java.lang.String) concurrentHashMap.remove(aVar2);
                    if (!u46.l.e(str2)) {
                        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) fVar.f413862q;
                        copyOnWriteArrayList.remove(str2);
                        ((java.util.HashMap) fVar.f413863r).remove(str2);
                        ((java.util.HashMap) fVar.f413860o).remove(str2);
                        com.tencent.mars.xlog.Log.i("Amoeba.PageContext", "[sessionOut] sessionId : " + str2 + ", sessionIds count : " + copyOnWriteArrayList.size());
                    }
                }
            }
        }
        sz1.i.c(new java.lang.Runnable() { // from class: lz1.b$$a
            @Override // java.lang.Runnable
            public final void run() {
                jz1.e Di = jz1.e.Di();
                hz1.a aVar3 = hz1.a.this;
                if (aVar3 == null) {
                    Di.getClass();
                } else {
                    uz1.a aVar4 = Di.f302638e;
                    aVar4.iterator();
                    while (aVar4.hasNext()) {
                        android.view.View view = (android.view.View) aVar4.next();
                        android.content.Context g17 = sz1.a.g(view);
                        if ((g17 instanceof android.app.Activity) && g17.hashCode() == aVar3.f286287a) {
                            uy1.a.r(view, "view_exp");
                            uy1.a.r(view, "view_unexp");
                        }
                    }
                }
                kz1.e Bi = kz1.e.Bi();
                if (aVar3 == null) {
                    Bi.getClass();
                    return;
                }
                uz1.a aVar5 = Bi.f313841d;
                aVar5.iterator();
                while (aVar5.hasNext()) {
                    android.view.View view2 = (android.view.View) aVar5.next();
                    android.content.Context g18 = sz1.a.g(view2);
                    if ((g18 instanceof android.app.Activity) && g18.hashCode() == aVar3.f286287a) {
                        uy1.a.r(view2, "view_clk");
                    }
                }
            }
        });
    }

    public void k(java.util.Map map, java.util.List list, long j17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.putAll(map);
        cy1.a.Ui().Lj(j17, "view_exp", hashMap, list);
        oz1.e.a().f(j17, "view_exp", null, hashMap);
    }

    public void l(java.util.Map map, java.util.List list, long j17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.putAll(map);
        cy1.a.Ui().Lj(j17, "view_unexp", hashMap, list);
        oz1.e.a().f(j17, "view_unexp", null, hashMap);
    }
}
