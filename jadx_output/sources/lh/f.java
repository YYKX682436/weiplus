package lh;

/* loaded from: classes12.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rh.o2 f318596d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qh.b f318597e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.battery.accumulate.AccPowerStats f318598f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gi.w0 f318599g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ wh.n1 f318600h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(rh.o2 o2Var, qh.b bVar, com.tencent.matrix.battery.accumulate.AccPowerStats accPowerStats, gi.w0 w0Var, wh.n1 n1Var) {
        super(0);
        this.f318596d = o2Var;
        this.f318597e = bVar;
        this.f318598f = accPowerStats;
        this.f318599g = w0Var;
        this.f318600h = n1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.Map asMutable;
        java.util.Map asMutable2;
        java.util.Map asMutable3;
        java.util.Map asMutable4;
        java.util.Map asMutable5;
        java.util.Map asMutable6;
        java.util.List asMutable7;
        java.util.List asMutable8;
        java.util.Map asMutable9;
        java.util.Map asMutable10;
        java.util.Map asMutable11;
        java.util.Map asMutable12;
        java.util.List asMutable13;
        rh.o2 o2Var = this.f318596d;
        uh.f fVar = ((uh.g) o2Var.f395484a).f427677d;
        boolean z17 = true;
        qh.b bVar = this.f318597e;
        com.tencent.matrix.battery.accumulate.AccPowerStats accPowerStats = this.f318598f;
        if (fVar != null) {
            long j17 = fVar.f427670a;
            double p17 = uh.i.p((((float) j17) * 1.0f) / ((float) bVar.f363321n), 2);
            com.tencent.mars.xlog.Log.i("MicroMsg.PowerAccMonitor", "checkUseful: " + j17 + '/' + bVar.f363321n + '=' + p17);
            if (mm.o.d(com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_BASE, 50000)) {
                ap.a.a(1, "accPowerUseful", null, null, accPowerStats.getAccName(), java.lang.String.valueOf(p17), java.lang.String.valueOf(j17), java.lang.String.valueOf(bVar.f363321n));
            }
        }
        boolean j18 = mm.k.j(mm.k.f328502m, null, 1, null);
        gi.w0 w0Var = this.f318599g;
        if (!j18 || w0Var.O()) {
            accPowerStats.setAccCount(accPowerStats.getAccCount() + 1);
            accPowerStats.setAccDuringMs(accPowerStats.getAccDuringMs() + bVar.f363321n);
            accPowerStats.setAccAppBgMs(accPowerStats.getAccAppBgMs() + (((float) bVar.f363321n) * (bVar.f363309b / 100.0f)));
            accPowerStats.setAccDevChargeMs(accPowerStats.getAccDevChargeMs() + (((float) bVar.f363321n) * (bVar.f363312e / 100.0f)));
            rh.o2 t17 = w0Var.t(com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.class);
            if (t17 != null) {
                long accPidJiffies = accPowerStats.getAccPidJiffies();
                java.lang.Number number = ((com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot) t17.f395486c).f52561g.f395552a;
                kotlin.jvm.internal.o.f(number, "get(...)");
                accPowerStats.setAccPidJiffies(accPidJiffies + number.longValue());
            }
            rh.o2 t18 = w0Var.t(com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$UidJiffiesSnapshot.class);
            if (t18 != null) {
                long accUidJiffies = accPowerStats.getAccUidJiffies();
                java.lang.Number number2 = ((com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$UidJiffiesSnapshot) t18.f395486c).f52582d.f395552a;
                kotlin.jvm.internal.o.f(number2, "get(...)");
                accPowerStats.setAccUidJiffies(accUidJiffies + number2.longValue());
            }
            int i17 = 20;
            r9 = r9.intValue() > 0 ? 20 : null;
            if (r9 != null) {
                int intValue = r9.intValue();
                java.util.List o17 = w0Var.o();
                if (o17 != null && (!o17.isEmpty())) {
                    int size = o17.size();
                    int i18 = 0;
                    while (i18 < size) {
                        rh.o2 o2Var2 = (rh.o2) o17.get(i18);
                        java.util.List list = ((com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot) o2Var2.f395486c).f52562h.f395560a;
                        kotlin.jvm.internal.o.f(list, "getList(...)");
                        if (list.isEmpty() ^ z17) {
                            com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot jiffiesMonitorFeature$JiffiesSnapshot = (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot) o2Var2.f395486c;
                            java.lang.String g17 = ri.i.g(jiffiesMonitorFeature$JiffiesSnapshot.f52560f);
                            asMutable9 = accPowerStats.asMutable(accPowerStats.getAccJiffyStats());
                            kotlin.jvm.internal.o.d(g17);
                            java.lang.Object obj = asMutable9.get(g17);
                            if (obj == null) {
                                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                                asMutable9.put(g17, linkedHashMap);
                                obj = linkedHashMap;
                            }
                            java.util.Map map = (java.util.Map) obj;
                            asMutable10 = accPowerStats.asMutable(accPowerStats.getAccTidStats());
                            java.lang.Object obj2 = asMutable10.get(g17);
                            if (obj2 == null) {
                                java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
                                asMutable10.put(g17, linkedHashMap2);
                                obj2 = linkedHashMap2;
                            }
                            java.util.Map map2 = (java.util.Map) obj2;
                            java.util.List list2 = jiffiesMonitorFeature$JiffiesSnapshot.f52562h.f395560a;
                            kotlin.jvm.internal.o.f(list2, "getList(...)");
                            for (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.ThreadJiffiesSnapshot threadJiffiesSnapshot : kz5.n0.K0(list2, intValue)) {
                                java.lang.String name = threadJiffiesSnapshot.f52566c;
                                kotlin.jvm.internal.o.f(name, "name");
                                java.lang.Long l17 = (java.lang.Long) threadJiffiesSnapshot.f395552a;
                                asMutable11 = accPowerStats.asMutable(map);
                                java.lang.Object obj3 = map.get(name);
                                if (obj3 == null) {
                                    obj3 = 0L;
                                }
                                long longValue = ((java.lang.Number) obj3).longValue();
                                kotlin.jvm.internal.o.d(l17);
                                asMutable11.put(name, java.lang.Long.valueOf(longValue + l17.longValue()));
                                int i19 = threadJiffiesSnapshot.f52565b;
                                asMutable12 = accPowerStats.asMutable(map2);
                                java.lang.Object obj4 = asMutable12.get(name);
                                if (obj4 == null) {
                                    obj4 = new java.util.ArrayList();
                                    asMutable12.put(name, obj4);
                                }
                                asMutable13 = accPowerStats.asMutable((java.util.List) obj4);
                                asMutable13.add(java.lang.Integer.valueOf(i19));
                            }
                        }
                        i18++;
                        z17 = true;
                    }
                }
                i17 = 20;
            }
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            if (!(valueOf.intValue() > 0)) {
                valueOf = null;
            }
            if (valueOf != null) {
                w0Var.r(new lh.e(accPowerStats, valueOf.intValue()));
            }
            if (!bVar.g() && w0Var.B(rh.r1.class) != null && w0Var.B(rh.t1.class) != null) {
                rh.b3 B = w0Var.B(rh.r1.class);
                if (B != null) {
                    asMutable8 = accPowerStats.asMutable(accPowerStats.getAccBattCurr());
                    asMutable8.add(java.lang.Double.valueOf(B.f395316h));
                }
                rh.b3 B2 = w0Var.B(rh.t1.class);
                if (B2 != null) {
                    asMutable7 = accPowerStats.asMutable(accPowerStats.getAccBattTemp());
                    asMutable7.add(java.lang.Double.valueOf(B2.f395316h));
                }
            }
            r2 = r2.intValue() > 0 ? 10 : null;
            rh.d3 d3Var = o2Var.f395486c;
            if (r2 != null) {
                int intValue2 = r2.intValue();
                uh.g gVar = (uh.g) d3Var;
                java.util.Map map3 = gVar.f427720y0;
                java.util.Map<java.lang.String, java.lang.Long> accWakeLockPartialStats = accPowerStats.getAccWakeLockPartialStats();
                for (java.util.Map.Entry entry : kz5.n0.K0(map3.entrySet(), intValue2)) {
                    java.lang.String str = (java.lang.String) entry.getKey();
                    java.lang.Long l18 = (java.lang.Long) ((rh.x2) entry.getValue()).f395552a;
                    asMutable6 = accPowerStats.asMutable(accWakeLockPartialStats);
                    kotlin.jvm.internal.o.d(str);
                    java.lang.Long l19 = accWakeLockPartialStats.get(str);
                    if (l19 == null) {
                        l19 = 0L;
                    }
                    long longValue2 = l19.longValue();
                    kotlin.jvm.internal.o.d(l18);
                    asMutable6.put(str, java.lang.Long.valueOf(longValue2 + l18.longValue()));
                }
                java.util.Map map4 = gVar.f427722z0;
                java.util.Map<java.lang.String, java.lang.Long> accWakeLockFullStats = accPowerStats.getAccWakeLockFullStats();
                for (java.util.Map.Entry entry2 : kz5.n0.K0(map4.entrySet(), intValue2)) {
                    java.lang.String str2 = (java.lang.String) entry2.getKey();
                    java.lang.Long l27 = (java.lang.Long) ((rh.x2) entry2.getValue()).f395552a;
                    asMutable5 = accPowerStats.asMutable(accWakeLockFullStats);
                    kotlin.jvm.internal.o.d(str2);
                    java.lang.Long l28 = accWakeLockFullStats.get(str2);
                    if (l28 == null) {
                        l28 = 0L;
                    }
                    long longValue3 = l28.longValue();
                    kotlin.jvm.internal.o.d(l27);
                    asMutable5.put(str2, java.lang.Long.valueOf(longValue3 + l27.longValue()));
                }
            }
            if (((uh.g) o2Var.f395484a).f427677d != null || w0Var.O()) {
                java.util.Map b17 = gi.u0.b(this.f318600h, (uh.g) d3Var, w0Var, null);
                if (!b17.isEmpty()) {
                    for (java.util.Map.Entry entry3 : b17.entrySet()) {
                        java.lang.String str3 = (java.lang.String) entry3.getKey();
                        java.lang.Object value = entry3.getValue();
                        if (r26.i0.A(str3, "power-", false, 2, null) && (value instanceof java.util.Map)) {
                            asMutable = accPowerStats.asMutable(accPowerStats.getAccPowerStats());
                            java.lang.Object obj5 = asMutable.get(str3);
                            if (obj5 == null) {
                                obj5 = new java.util.LinkedHashMap();
                                asMutable.put(str3, obj5);
                            }
                            asMutable2 = accPowerStats.asMutable((java.util.Map) obj5);
                            for (java.util.Map.Entry entry4 : ((java.util.Map) value).entrySet()) {
                                if ((entry4.getKey() instanceof java.lang.String) && (entry4.getValue() instanceof java.lang.Number)) {
                                    java.lang.Object key = entry4.getKey();
                                    kotlin.jvm.internal.o.e(key, "null cannot be cast to non-null type kotlin.String");
                                    java.lang.String str4 = (java.lang.String) key;
                                    java.lang.Object value2 = entry4.getValue();
                                    kotlin.jvm.internal.o.e(value2, "null cannot be cast to non-null type kotlin.Number");
                                    java.lang.Number number3 = (java.lang.Number) value2;
                                    java.lang.Object obj6 = asMutable2.get(str4);
                                    if (obj6 == null) {
                                        obj6 = java.lang.Double.valueOf(0.0d);
                                    }
                                    asMutable2.put(str4, java.lang.Double.valueOf(((java.lang.Number) obj6).doubleValue() + number3.doubleValue()));
                                } else {
                                    asMutable3 = accPowerStats.asMutable(accPowerStats.getAccPowerExtra());
                                    java.lang.Object obj7 = asMutable3.get(str3);
                                    if (obj7 == null) {
                                        obj7 = new java.util.LinkedHashMap();
                                        asMutable3.put(str3, obj7);
                                    }
                                    asMutable4 = accPowerStats.asMutable((java.util.Map) obj7);
                                    java.lang.Object key2 = entry4.getKey();
                                    kotlin.jvm.internal.o.e(key2, "null cannot be cast to non-null type kotlin.String");
                                    java.lang.String str5 = (java.lang.String) key2;
                                    java.lang.Object value3 = entry4.getValue();
                                    if (value3 == null) {
                                        value3 = "";
                                    }
                                    asMutable4.put(str5, value3);
                                }
                            }
                        }
                    }
                }
            }
            lh.c cVar = new lh.c(accPowerStats);
            uh.g gVar2 = (uh.g) d3Var;
            java.util.Map procStatsCpuUsrTimeMs = gVar2.f427712u0;
            kotlin.jvm.internal.o.f(procStatsCpuUsrTimeMs, "procStatsCpuUsrTimeMs");
            if (!procStatsCpuUsrTimeMs.isEmpty()) {
                for (java.util.Map.Entry entry5 : gVar2.f427712u0.entrySet()) {
                    java.lang.String str6 = (java.lang.String) entry5.getKey();
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.x2.f193072b;
                    kotlin.jvm.internal.o.f(str7, "getApplicationId(...)");
                    if (r26.i0.A(str6, str7, false, 2, null)) {
                        com.tencent.matrix.battery.accumulate.AccProcessStats accProcessStats = (com.tencent.matrix.battery.accumulate.AccProcessStats) cVar.apply(str6);
                        long j19 = accProcessStats.f52550d;
                        java.lang.Number number4 = ((rh.x2) entry5.getValue()).f395552a;
                        kotlin.jvm.internal.o.d(number4);
                        accProcessStats.f52550d = j19 + number4.longValue();
                    }
                }
            }
            java.util.Map procStatsCpuSysTimeMs = gVar2.f427714v0;
            kotlin.jvm.internal.o.f(procStatsCpuSysTimeMs, "procStatsCpuSysTimeMs");
            if (!procStatsCpuSysTimeMs.isEmpty()) {
                for (java.util.Map.Entry entry6 : gVar2.f427714v0.entrySet()) {
                    java.lang.String str8 = (java.lang.String) entry6.getKey();
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.x2.f193072b;
                    kotlin.jvm.internal.o.f(str9, "getApplicationId(...)");
                    if (r26.i0.A(str8, str9, false, 2, null)) {
                        com.tencent.matrix.battery.accumulate.AccProcessStats accProcessStats2 = (com.tencent.matrix.battery.accumulate.AccProcessStats) cVar.apply(str8);
                        long j27 = accProcessStats2.f52551e;
                        java.lang.Number number5 = ((rh.x2) entry6.getValue()).f395552a;
                        kotlin.jvm.internal.o.d(number5);
                        accProcessStats2.f52551e = j27 + number5.longValue();
                    }
                }
            }
            java.util.Map procStatsStartCount = gVar2.f427718x0;
            kotlin.jvm.internal.o.f(procStatsStartCount, "procStatsStartCount");
            if (!procStatsStartCount.isEmpty()) {
                for (java.util.Map.Entry entry7 : gVar2.f427718x0.entrySet()) {
                    java.lang.String str10 = (java.lang.String) entry7.getKey();
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.x2.f193072b;
                    kotlin.jvm.internal.o.f(str11, "getApplicationId(...)");
                    if (r26.i0.A(str10, str11, false, 2, null)) {
                        com.tencent.matrix.battery.accumulate.AccProcessStats accProcessStats3 = (com.tencent.matrix.battery.accumulate.AccProcessStats) cVar.apply(str10);
                        long j28 = accProcessStats3.f52552f;
                        java.lang.Number number6 = ((rh.x2) entry7.getValue()).f395552a;
                        kotlin.jvm.internal.o.d(number6);
                        accProcessStats3.f52552f = j28 + number6.longValue();
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
