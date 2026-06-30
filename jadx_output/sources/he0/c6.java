package he0;

/* loaded from: classes4.dex */
public class c6 extends com.tencent.mm.sdk.event.n {
    public c6() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsResetLuckyListener");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsResetLuckyListener");
        if (gm0.j1.a()) {
            ha4.h.a().getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unMarkLuckyAlert", "com.tencent.mm.plugin.sns.lucky.model.NewYearSnsCtrlV2");
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_NEWYEAR_2016_HONGBAO_SNS_CTRLMARKFULLSCREEN_STRING_SYNC;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unmardRedotList", "com.tencent.mm.plugin.sns.lucky.model.RedDotUtil");
            wa4.t tVar = new wa4.t();
            try {
                gm0.j1.i();
                gm0.j1.u().c().x(u3Var, new java.lang.String(tVar.toByteArray(), java.nio.charset.Charset.forName(com.tencent.kinda.framework.app.KindaConfigCacheStg.SAVE_CHARSET)));
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.RedDotUtil", "mardRedotList save exception:" + e17.getLocalizedMessage());
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unmardRedotList", "com.tencent.mm.plugin.sns.lucky.model.RedDotUtil");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unMarkLuckyAlert", "com.tencent.mm.plugin.sns.lucky.model.NewYearSnsCtrlV2");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsResetLuckyListener");
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.SnsResetLuckyListener", "SnsResetLuckyEvent arrived before account was ready, ignore it.");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsResetLuckyListener");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsResetLuckyListener");
        return false;
    }
}
