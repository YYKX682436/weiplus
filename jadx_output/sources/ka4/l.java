package ka4;

/* loaded from: classes4.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final ka4.l f306135d = new ka4.l();

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$startKaraPredict$1");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsKaraOptionConfig", "startKaraPredict >> " + ka4.m.a() + ", " + ka4.m.b());
        if (ka4.m.a() == 0 || ka4.m.a() == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsInfoLimit", "com.tencent.mm.plugin.sns.storage.SnsInfoStorageKt");
            p75.i0 i17 = dm.va.TABLE.i();
            i17.e(dm.va.CREATETIME.u());
            i17.c(100, 0);
            java.util.List k17 = i17.a().k(com.tencent.mm.plugin.sns.model.l4.aj(), com.tencent.mm.plugin.sns.storage.SnsInfo.class);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getSnsInfoLimit >>  size: ");
            java.util.ArrayList arrayList = (java.util.ArrayList) k17;
            sb6.append(arrayList.size());
            sb6.append(", limit: 100");
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsInfoStorageKt", sb6.toString());
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = (com.tencent.mm.plugin.sns.storage.SnsInfo) it.next();
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsInfoStorageKt", "getSnsInfoLimit >> " + snsInfo.getCreateTime() + ", " + snsInfo.getSnsId() + ". " + snsInfo.localid);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsInfoLimit", "com.tencent.mm.plugin.sns.storage.SnsInfoStorageKt");
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsKaraOptionConfig", "startKaraPredict getSnsInfoLimit >> " + arrayList.size());
            if (!arrayList.isEmpty()) {
                ka4.m mVar = ka4.m.f306136a;
                int createTime = ((com.tencent.mm.plugin.sns.storage.SnsInfo) kz5.n0.X(k17)).getCreateTime();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMaxKaraTimeStamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                ka4.m.f306141f = createTime;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMaxKaraTimeStamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                int createTime2 = ((com.tencent.mm.plugin.sns.storage.SnsInfo) kz5.n0.i0(k17)).getCreateTime();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMinKaraTimeStamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                ka4.m.f306142g = createTime2;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMinKaraTimeStamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                ka4.m.c(ka4.m.f306136a, (java.util.ArrayList) k17, true, ka4.c.f306122e);
            }
        } else {
            com.tencent.mm.plugin.sns.storage.i2 i2Var = com.tencent.mm.plugin.sns.storage.i2.f166022a;
            java.util.List a17 = i2Var.a(ka4.m.a());
            java.util.List b17 = i2Var.b(ka4.m.b(), 50);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("startKaraPredict getSnsInfoLargeThanCreateTime >> ");
            sb7.append(((java.util.ArrayList) a17).size());
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsKaraOptionConfig", sb7.toString());
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("startKaraPredict getSnsInfoSmallThanCreateTimeAndLimit >> ");
            sb8.append(((java.util.ArrayList) b17).size());
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsKaraOptionConfig", sb8.toString());
            if (!r10.isEmpty()) {
                int createTime3 = ((com.tencent.mm.plugin.sns.storage.SnsInfo) kz5.n0.X(a17)).getCreateTime();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMaxKaraTimeStamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                ka4.m.f306141f = createTime3;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMaxKaraTimeStamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                ka4.m.c(ka4.m.f306136a, (java.util.ArrayList) a17, true, ka4.c.f306123f);
            }
            if (!r11.isEmpty()) {
                int createTime4 = ((com.tencent.mm.plugin.sns.storage.SnsInfo) kz5.n0.i0(b17)).getCreateTime();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMinKaraTimeStamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                ka4.m.f306142g = createTime4;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMinKaraTimeStamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                ka4.m.c(ka4.m.f306136a, (java.util.ArrayList) b17, true, ka4.c.f306124g);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$startKaraPredict$1");
    }
}
