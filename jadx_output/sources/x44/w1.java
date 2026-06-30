package x44;

/* loaded from: classes4.dex */
public final class w1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x44.z1 f451915d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(x44.z1 z1Var) {
        super(1);
        this.f451915d = z1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderUserInfo$doAction$1");
        org.json.JSONObject it = (org.json.JSONObject) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderUserInfo$doAction$1");
        kotlin.jvm.internal.o.g(it, "it");
        if (it.optInt("errCode", 1) == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$makeReturnOK", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderUserInfo");
            x44.z1 z1Var = this.f451915d;
            z1Var.m(it);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$makeReturnOK", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderUserInfo");
            z1Var.b(it);
        } else {
            x44.z1 z1Var2 = this.f451915d;
            z1Var2.b(w44.d.k(z1Var2, 600005, "fail: query finder user info failed!", null, 4, null));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderUserInfo$doAction$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderUserInfo$doAction$1");
        return f0Var;
    }
}
