package cr0;

/* loaded from: classes12.dex */
public final class l {
    public l(kotlin.jvm.internal.i iVar) {
    }

    public final cr0.p a() {
        cr0.p pVar = new cr0.p();
        if (cr0.w3.f221800a.b()) {
            com.tencent.mm.matrix.battery.AccNetworkStats.Companion.getClass();
            java.util.ArrayList<com.tencent.mm.matrix.battery.AccNetworkStats> arrayList = new java.util.ArrayList();
            java.lang.String[] b17 = com.tencent.mm.sdk.platformtools.o4.M("full-charge-proc-life-stats.bin").b();
            if (b17 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.String str : b17) {
                    kotlin.jvm.internal.o.d(str);
                    if (r26.i0.y(str, "key_proc_network_stats_prefix", false)) {
                        arrayList2.add(str);
                    }
                }
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    java.lang.String str2 = (java.lang.String) it.next();
                    mh.k kVar = mh.k.f326271a;
                    kotlin.jvm.internal.o.d(str2);
                    com.tencent.matrix.battery.accumulate.persist.FlattParcelable a17 = kVar.a(str2, com.tencent.mm.matrix.battery.AccNetworkStats.class, "full-charge-proc-life-stats.bin");
                    if (a17 instanceof com.tencent.mm.matrix.battery.AccNetworkStats) {
                        if (((com.tencent.mm.matrix.battery.AccNetworkStats) a17).isInvalid()) {
                            kVar.d(str2, "full-charge-proc-life-stats.bin");
                        } else {
                            arrayList.add(a17);
                        }
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                com.tencent.mm.matrix.battery.AccNetworkStats accNetworkStats = new com.tencent.mm.matrix.battery.AccNetworkStats();
                for (com.tencent.mm.matrix.battery.AccNetworkStats accNetworkStats2 : arrayList) {
                    java.util.LinkedHashMap e17 = pVar.e();
                    java.lang.String accProcName = accNetworkStats2.getAccProcName();
                    java.util.Iterator<T> it6 = accNetworkStats2.getAccRxStats().values().iterator();
                    long j17 = 0;
                    long j18 = 0;
                    while (it6.hasNext()) {
                        j18 += kz5.n0.J0(((java.util.Map) it6.next()).values());
                    }
                    java.util.Iterator<T> it7 = accNetworkStats2.getAccTxStats().values().iterator();
                    while (it7.hasNext()) {
                        j17 += kz5.n0.J0(((java.util.Map) it7.next()).values());
                    }
                    e17.put(accProcName, java.lang.Long.valueOf(j18 + j17));
                    accNetworkStats.lock(new cr0.k(accNetworkStats, accNetworkStats2));
                }
                cr0.h0.f221633k.a(pVar, accNetworkStats);
                pVar.f();
            }
        }
        return pVar;
    }
}
