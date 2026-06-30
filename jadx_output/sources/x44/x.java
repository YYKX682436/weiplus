package x44;

/* loaded from: classes4.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q64.b f451926d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(q64.b bVar) {
        super(2);
        this.f451926d = bVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.GetAdChannelAppInfo$onServerRun$1");
        int intValue = ((java.lang.Number) obj).intValue();
        org.json.JSONObject data = (org.json.JSONObject) obj2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.GetAdChannelAppInfo$onServerRun$1");
        kotlin.jvm.internal.o.g(data, "data");
        q64.b bVar = this.f451926d;
        if (bVar != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("error", intValue);
            java.lang.String jSONObject = data.toString();
            if (jSONObject == null) {
                jSONObject = "{}";
            }
            bundle.putString("pkgInfo", jSONObject);
            ((r64.b) bVar).e(bundle);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.GetAdChannelAppInfo$onServerRun$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.GetAdChannelAppInfo$onServerRun$1");
        return f0Var;
    }
}
