package f64;

/* loaded from: classes4.dex */
public final class e extends g64.e {
    @Override // lc3.c0
    public java.lang.String f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getName", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiGetServerTimeMillisSync");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getName", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiGetServerTimeMillisSync");
        return "getServerTimeMillisSync";
    }

    @Override // g64.e
    public lc3.a0 s(lc3.a0 data) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiGetServerTimeMillisSync");
        kotlin.jvm.internal.o.g(data, "data");
        lc3.a0 a0Var = new lc3.a0();
        a0Var.put("serverTime", c01.id.c());
        m(a0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiGetServerTimeMillisSync");
        return a0Var;
    }
}
