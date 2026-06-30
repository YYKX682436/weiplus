package ee0;

@j95.b
/* loaded from: classes4.dex */
public class l4 extends i95.w implements fe0.h4 {
    public p94.h0 wi() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getISnsComment", "com.tencent.mm.feature.sns.SnsFactoryFeatureService");
        if (!gm0.j1.b().m()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getISnsComment", "com.tencent.mm.feature.sns.SnsFactoryFeatureService");
            return null;
        }
        com.tencent.mm.plugin.sns.storage.w1 Aj = com.tencent.mm.plugin.sns.model.l4.Aj();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getISnsComment", "com.tencent.mm.feature.sns.SnsFactoryFeatureService");
        return Aj;
    }
}
