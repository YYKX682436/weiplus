package x44;

/* loaded from: classes4.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x44.z f451914d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x44.z zVar) {
        super(2);
        this.f451914d = zVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.GetAdChannelAppInfo$doAction$1");
        int intValue = ((java.lang.Number) obj).intValue();
        org.json.JSONObject result = (org.json.JSONObject) obj2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.GetAdChannelAppInfo$doAction$1");
        kotlin.jvm.internal.o.g(result, "result");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$toJS", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.GetAdChannelAppInfo");
        this.f451914d.q(intValue, result);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$toJS", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.GetAdChannelAppInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.GetAdChannelAppInfo$doAction$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.GetAdChannelAppInfo$doAction$1");
        return f0Var;
    }
}
