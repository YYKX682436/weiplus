package f64;

/* loaded from: classes4.dex */
public final class d extends g64.e {
    @Override // lc3.c0
    public java.lang.String f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getName", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiGetScreenSizeSync");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getName", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiGetScreenSizeSync");
        return "getScreenSizeSync";
    }

    @Override // g64.e
    public lc3.a0 s(lc3.a0 data) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiGetScreenSizeSync");
        kotlin.jvm.internal.o.g(data, "data");
        lc3.e eVar = this.f317890a;
        android.app.Activity B0 = eVar != null ? eVar.B0() : null;
        if (B0 == null) {
            com.tencent.mars.xlog.Log.e("SnsAdMB.JsApi", "activity is null");
            lc3.a0 j17 = j(lc3.x.f317937d, ": activity is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiGetScreenSizeSync");
            return j17;
        }
        lc3.a0 a0Var = new lc3.a0();
        int[] c17 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ka.c(B0);
        a0Var.put("screenWidth", c17[0]);
        a0Var.put("screenHeight", c17[1]);
        if (com.tencent.mm.ui.bk.u(B0, false)) {
            a0Var.put("cutout", com.tencent.mm.ui.bk.p(B0));
        } else {
            a0Var.put("cutout", 0);
        }
        a0Var.put("navigationBar", com.tencent.mm.ui.bk.j(B0));
        m(a0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiGetScreenSizeSync");
        return a0Var;
    }
}
