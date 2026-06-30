package he0;

/* loaded from: classes4.dex */
public class q5 extends com.tencent.mm.sdk.event.n {
    public q5() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsClearDbListener");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsClearDbListener");
        if (gm0.j1.a()) {
            int i17 = com.tencent.mm.plugin.sns.model.s5.f164676d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("printAllDbFeedsId", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            com.tencent.mm.plugin.sns.storage.f2 Fj = com.tencent.mm.plugin.sns.model.l4.Fj();
            Fj.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdCursorForTimeLine", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            java.lang.String str = com.tencent.mm.plugin.sns.storage.f2.f165981n + " from SnsInfo where ";
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            com.tencent.mm.plugin.sns.storage.f2.C1();
            sb6.append(" (sourceType & 2 != 0 ) ");
            java.lang.String sb7 = sb6.toString();
            if (Fj.b3("")) {
                sb7 = sb7 + " AND " + Fj.p1("");
            }
            if (Fj.b3("")) {
                sb7 = sb7 + " AND " + Fj.z1("");
            }
            java.lang.String str2 = sb7 + " AND createTime >= 0";
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAdLowTimeLimitZero", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdLowTimeLimitZero", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            i64.u1.a(25, 1);
            try {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1612, 28);
            } catch (java.lang.Throwable unused) {
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsInfoStorage", "getAdCursorForTimeLine: downTime=0, upTime=0, downSeq=, upSeq=");
            android.database.Cursor B = Fj.f165994d.B(str2 + com.tencent.mm.plugin.sns.storage.f2.f165982o, null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdCursorForTimeLine", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            if (B != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsInfoStorageLogic", "all timeline snsId begin");
                while (B.moveToNext()) {
                    com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = new com.tencent.mm.plugin.sns.storage.SnsInfo();
                    snsInfo.convertFrom(B);
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsInfoStorageLogic", snsInfo.getSnsId());
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsInfoStorageLogic", "all timeline snsId end");
                B.close();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("printAllDbFeedsId", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            com.tencent.mm.plugin.sns.storage.f2 Fj2 = com.tencent.mm.plugin.sns.model.l4.Fj();
            Fj2.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clearInfo", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            Fj2.f165994d.A(dm.va.TABLE_NAME, "delete from SnsInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearInfo", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            com.tencent.mm.plugin.sns.model.l4.Ej().z0("@__weixintimtline");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsClearDbListener");
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.SnsClearDbListener", "SnsClearDBEvent arrived before account was ready, ignore it.");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsClearDbListener");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsClearDbListener");
        return false;
    }
}
