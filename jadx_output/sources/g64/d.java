package g64;

/* loaded from: classes4.dex */
public abstract class d extends lc3.b0 {
    @Override // lc3.b0
    public void t(lc3.a0 data) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.MBJsApiSnsAdLoggedAsyncBase");
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("SnsAdMB.JsApi", "the async jsapi " + f() + " is called");
        java.util.Map map = w44.c.f442896a;
        java.lang.String name = f();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("jsApi", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.NamedJsApi");
        kotlin.jvm.internal.o.g(name, "name");
        w44.d dVar = (w44.d) ((java.util.LinkedHashMap) w44.c.f442896a).get(name);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jsApi", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.NamedJsApi");
        jz5.f0 f0Var = null;
        if (dVar != null) {
            lc3.e eVar = this.f317890a;
            dVar.e(new w44.b(eVar != null ? eVar.B0() : null, new m54.l(), true, new g64.b(this), new g64.c(this)), data);
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("shouldNeedActivity", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.MBJsApiSnsAdLoggedAsyncBase");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shouldNeedActivity", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.MBJsApiSnsAdLoggedAsyncBase");
            com.tencent.mars.xlog.Log.i("SnsAdMB.JsApi", "the async jsapi need activity");
            lc3.e eVar2 = this.f317890a;
            if (eVar2 == null || eVar2.B0() == null) {
                com.tencent.mars.xlog.Log.e("SnsAdMB.JsApi", "the async jsapi need activity, but the activity is null");
                u(j(lc3.x.f317937d, "the activity is null, please check it!"));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.MBJsApiSnsAdLoggedAsyncBase");
                return;
            }
            try {
                v(data);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.w("SnsAdMB.JsApi", "there is something exception: " + th6.getMessage());
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getERROR_EXCEPTION", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.MBErrorCodeSnsAd");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getERROR_EXCEPTION", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.MBErrorCodeSnsAd");
                u(j(g64.a.f269187a, "there is something exception: " + th6.getMessage()));
            }
        }
        com.tencent.mars.xlog.Log.i("SnsAdMB.JsApi", "the async jsapi " + f() + " end");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.MBJsApiSnsAdLoggedAsyncBase");
    }

    public final void u(lc3.a0 data) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("backToJs", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.MBJsApiSnsAdLoggedAsyncBase");
        kotlin.jvm.internal.o.g(data, "data");
        try {
            s().invoke(data);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAdMB.JsApi", "call back to js has an exception, " + th6.getMessage());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("backToJs", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.MBJsApiSnsAdLoggedAsyncBase");
    }

    public void v(lc3.a0 data) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.MBJsApiSnsAdLoggedAsyncBase");
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.MBJsApiSnsAdLoggedAsyncBase");
    }
}
