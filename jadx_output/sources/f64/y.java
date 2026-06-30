package f64;

/* loaded from: classes4.dex */
public final class y extends g64.d {
    @Override // lc3.c0
    public java.lang.String f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getName", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiZTestAsync");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getName", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiZTestAsync");
        return "testAsyncJsApi";
    }

    @Override // g64.d
    public void v(lc3.a0 data) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiZTestAsync");
        kotlin.jvm.internal.o.g(data, "data");
        if (data.optInt("param") == 0) {
            u(j(lc3.x.f317937d, "the input test is 0"));
        } else {
            lc3.a0 a0Var = new lc3.a0();
            a0Var.put("result", 100);
            m(a0Var);
            u(a0Var);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiZTestAsync");
    }
}
