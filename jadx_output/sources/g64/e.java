package g64;

/* loaded from: classes4.dex */
public abstract class e extends lc3.d0 {
    @Override // lc3.d0
    public final lc3.a0 r(lc3.a0 data) {
        lc3.a0 i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.MBJsApiSnsAdLoggedBase");
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("SnsAdMB.JsApi", "the jsapi " + f() + " is called");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("shouldNeedActivity", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.MBJsApiSnsAdLoggedBase");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shouldNeedActivity", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.MBJsApiSnsAdLoggedBase");
        lc3.e eVar = this.f317890a;
        if (eVar == null || eVar.B0() == null) {
            com.tencent.mars.xlog.Log.w("SnsAdMB.JsApi", "the activity is null");
            lc3.a0 i18 = i(lc3.x.f317937d);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.MBJsApiSnsAdLoggedBase");
            return i18;
        }
        try {
            i17 = s(data);
            com.tencent.mars.xlog.Log.i("SnsAdMB.JsApi", "the jsapi " + f() + " end, result is " + i17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("SnsAdMB.JsApi", "there is something exception: " + e17.getMessage());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getERROR_EXCEPTION", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.MBErrorCodeSnsAd");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getERROR_EXCEPTION", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.MBErrorCodeSnsAd");
            i17 = i(g64.a.f269187a);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.MBJsApiSnsAdLoggedBase");
        return i17;
    }

    public abstract lc3.a0 s(lc3.a0 a0Var);
}
