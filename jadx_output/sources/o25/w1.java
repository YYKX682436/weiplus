package o25;

/* loaded from: classes4.dex */
public abstract class w1 {
    public static p94.i0 a() {
        ((ee0.l4) ((fe0.h4) i95.n0.c(fe0.h4.class))).getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsCoverStg", "com.tencent.mm.feature.sns.SnsFactoryFeatureService");
        if (!gm0.j1.b().m()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsCoverStg", "com.tencent.mm.feature.sns.SnsFactoryFeatureService");
            return null;
        }
        com.tencent.mm.plugin.sns.storage.a2 Bj = com.tencent.mm.plugin.sns.model.l4.Bj();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsCoverStg", "com.tencent.mm.feature.sns.SnsFactoryFeatureService");
        return Bj;
    }

    public static p94.p0 b() {
        ((ee0.l4) ((fe0.h4) i95.n0.c(fe0.h4.class))).getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsSyncListener", "com.tencent.mm.feature.sns.SnsFactoryFeatureService");
        if (!gm0.j1.b().m()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsSyncListener", "com.tencent.mm.feature.sns.SnsFactoryFeatureService");
            return null;
        }
        p94.p0 p0Var = (p94.p0) i95.n0.c(com.tencent.mm.plugin.sns.model.l4.class);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsSyncListener", "com.tencent.mm.feature.sns.SnsFactoryFeatureService");
        return p0Var;
    }
}
