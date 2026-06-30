package ka4;

/* loaded from: classes4.dex */
public final class i implements gl0.a {
    @Override // gl0.a
    public void a(fl0.b item, long j17, boolean z17, float f17) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("finish", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$karaPredictCallback$1");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsKaraOptionConfig", "finish >> " + z17 + ", " + j17);
        java.lang.Object b17 = ((pl0.e) item).b();
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = b17 instanceof com.tencent.mm.plugin.sns.storage.SnsInfo ? (com.tencent.mm.plugin.sns.storage.SnsInfo) b17 : null;
        if (snsInfo != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("finish >> ");
            sb6.append(snsInfo.getSnsId());
            sb6.append(", ");
            sb6.append(snsInfo.getCreateTime());
            sb6.append(", ");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMaxKaraVideoTimeStamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
            int i17 = ka4.m.f306143h;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMaxKaraVideoTimeStamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
            sb6.append(i17);
            sb6.append(", ");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMinKaraVideoTimestamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
            int i18 = ka4.m.f306144i;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMinKaraVideoTimestamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
            sb6.append(i18);
            sb6.append(", ");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getKaraIsGoToStart$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
            boolean z18 = ka4.m.f306145j;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getKaraIsGoToStart$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
            sb6.append(z18);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsKaraOptionConfig", sb6.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getPredictMap$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = ka4.m.f306138c;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getPredictMap$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
            ka4.a aVar = (ka4.a) concurrentHashMap.get(snsInfo.getSnsId());
            if (aVar != null) {
                ka4.b bVar = z17 ? ka4.b.f306118g : ka4.b.f306119h;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPredictType", "com.tencent.mm.plugin.sns.model.config.KaraPredictItem");
                aVar.f306113a = bVar;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPredictType", "com.tencent.mm.plugin.sns.model.config.KaraPredictItem");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPredictCost", "com.tencent.mm.plugin.sns.model.config.KaraPredictItem");
                aVar.f306115c = j17;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPredictCost", "com.tencent.mm.plugin.sns.model.config.KaraPredictItem");
                str2 = "finish";
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.SnsKaraOptionConfig", "when finish but no have sns info " + snsInfo.getSnsId());
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getPredictMap$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getPredictMap$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                str2 = "finish";
            }
            int createTime = snsInfo.getCreateTime();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMaxKaraVideoTimeStamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
            int i19 = ka4.m.f306143h;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMaxKaraVideoTimeStamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
            if (createTime == i19) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getKaraIsGoToStart$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                boolean z19 = ka4.m.f306145j;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getKaraIsGoToStart$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                if (z19) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsKaraOptionConfig", "is reach max");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAfterMaxToPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                    ((ku5.t0) ku5.t0.f312615d).h(ka4.g.f306130d, "THREAD_SNS_KARA_OPTION");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAfterMaxToPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                }
            }
            int createTime2 = snsInfo.getCreateTime();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMinKaraVideoTimestamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
            int i27 = ka4.m.f306144i;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMinKaraVideoTimestamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
            if (createTime2 == i27) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getKaraIsGoToStart$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                boolean z27 = ka4.m.f306145j;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getKaraIsGoToStart$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                if (z27) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsKaraOptionConfig", "is reach min");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBeforeMinToPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                    ((ku5.t0) ku5.t0.f312615d).h(ka4.h.f306131d, "THREAD_SNS_KARA_OPTION");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBeforeMinToPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                }
            }
            str = str2;
        } else {
            str = "finish";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$karaPredictCallback$1");
    }

    @Override // gl0.a
    public void b(fl0.b item) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("start", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$karaPredictCallback$1");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsKaraOptionConfig", "start");
        java.lang.Object b17 = ((pl0.e) item).b();
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = b17 instanceof com.tencent.mm.plugin.sns.storage.SnsInfo ? (com.tencent.mm.plugin.sns.storage.SnsInfo) b17 : null;
        if (snsInfo != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsKaraOptionConfig", "start >> snsId: " + snsInfo.getSnsId());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getPredictMap$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = ka4.m.f306138c;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getPredictMap$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("start", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$karaPredictCallback$1");
    }
}
