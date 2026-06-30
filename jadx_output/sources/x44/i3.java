package x44;

/* loaded from: classes4.dex */
public final class i3 extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.StopApkWatcher");
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString("pkg", "");
        y44.a aVar = y44.a.f459356d;
        kotlin.jvm.internal.o.d(optString);
        aVar.a(optString);
        b(l());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.StopApkWatcher");
    }
}
