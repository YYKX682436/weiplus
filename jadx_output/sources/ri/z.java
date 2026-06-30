package ri;

/* loaded from: classes12.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.health.HealthStats f396019d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f396020e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(android.os.health.HealthStats healthStats, long j17) {
        super(1);
        this.f396019d = healthStats;
        this.f396020e = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.Map myDict = (java.util.Map) obj;
        kotlin.jvm.internal.o.g(myDict, "myDict");
        android.os.health.HealthStats healthStats = this.f396019d;
        long b17 = ri.b0.b(healthStats, 10054) + ri.b0.b(healthStats, 10055);
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("netstats");
        if (systemService != null) {
            try {
                android.app.usage.NetworkStats queryDetails = ((android.app.usage.NetworkStatsManager) systemService).queryDetails(0, null, this.f396020e, java.lang.System.currentTimeMillis());
                try {
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                    while (queryDetails.hasNextBucket()) {
                        android.app.usage.NetworkStats.Bucket bucket = new android.app.usage.NetworkStats.Bucket();
                        if (queryDetails.getNextBucket(bucket) && bucket.getUid() == android.os.Process.myUid()) {
                            java.lang.Integer valueOf = java.lang.Integer.valueOf(bucket.getTag());
                            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(bucket.getTag());
                            java.lang.Object obj2 = linkedHashMap.get(valueOf2);
                            if (obj2 == null) {
                                obj2 = new jz5.l(new java.util.concurrent.atomic.AtomicLong(), new java.util.concurrent.atomic.AtomicLong());
                                linkedHashMap.put(valueOf2, obj2);
                            }
                            jz5.l lVar = (jz5.l) obj2;
                            ((java.util.concurrent.atomic.AtomicLong) lVar.f302833d).addAndGet(bucket.getRxPackets() + bucket.getTxPackets());
                            ((java.util.concurrent.atomic.AtomicLong) lVar.f302834e).addAndGet(bucket.getRxBytes() + bucket.getRxBytes());
                            linkedHashMap.put(valueOf, obj2);
                        }
                    }
                    long b18 = ri.b0.b(healthStats, 10054) + ri.b0.b(healthStats, 10055);
                    if (b18 > 0) {
                        java.util.Iterator it = linkedHashMap.values().iterator();
                        long j17 = 0;
                        while (it.hasNext()) {
                            j17 += ((java.util.concurrent.atomic.AtomicLong) ((jz5.l) it.next()).f302833d).get();
                        }
                        float f17 = (float) b18;
                        myDict.put("packet-ratio", java.lang.Long.valueOf(a06.d.c((((float) j17) * 100.0f) / f17)));
                        if (j17 > 0) {
                            int i17 = 0;
                            for (java.lang.Object obj3 : kz5.c1.q(kz5.n0.F0(kz5.e1.v(linkedHashMap), new ri.x())).entrySet()) {
                                int i18 = i17 + 1;
                                if (i17 < 0) {
                                    kz5.c0.p();
                                    throw null;
                                }
                                java.util.Map.Entry entry = (java.util.Map.Entry) obj3;
                                int intValue = ((java.lang.Number) entry.getKey()).intValue();
                                jz5.l lVar2 = (jz5.l) entry.getValue();
                                myDict.put("packet-tag-top-" + i18, java.lang.Integer.valueOf(intValue));
                                if (b17 > 0) {
                                    myDict.put("packet-tag-ratio-" + intValue, java.lang.Long.valueOf(a06.d.c((((float) ((java.util.concurrent.atomic.AtomicLong) lVar2.f302833d).get()) * 100.0f) / ((float) b17))));
                                }
                                i17 = i18;
                            }
                        }
                        java.util.Iterator it6 = linkedHashMap.values().iterator();
                        long j18 = 0;
                        while (it6.hasNext()) {
                            j18 += ((java.util.concurrent.atomic.AtomicLong) ((jz5.l) it6.next()).f302834e).get();
                        }
                        myDict.put("byte-ratio", java.lang.Long.valueOf(a06.d.c((((float) j18) * 100.0f) / f17)));
                        if (j18 > 0) {
                            int i19 = 0;
                            for (java.lang.Object obj4 : kz5.c1.q(kz5.n0.F0(kz5.e1.v(linkedHashMap), new ri.y())).entrySet()) {
                                int i27 = i19 + 1;
                                if (i19 < 0) {
                                    kz5.c0.p();
                                    throw null;
                                }
                                java.util.Map.Entry entry2 = (java.util.Map.Entry) obj4;
                                int intValue2 = ((java.lang.Number) entry2.getKey()).intValue();
                                jz5.l lVar3 = (jz5.l) entry2.getValue();
                                myDict.put("byte-tag-top-" + i27, java.lang.Integer.valueOf(intValue2));
                                if (b17 > 0) {
                                    myDict.put("byte-tag-ratio-" + intValue2, java.lang.Long.valueOf(a06.d.c((((float) ((java.util.concurrent.atomic.AtomicLong) lVar3.f302834e).get()) * 100.0f) / ((float) b17))));
                                }
                                i19 = i27;
                            }
                        }
                    }
                    wz5.a.a(queryDetails, null);
                } finally {
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.w("Matrix.battery.BatteryReporter", "queryDetails err: " + th6.getMessage());
            }
        }
        return jz5.f0.f302826a;
    }
}
