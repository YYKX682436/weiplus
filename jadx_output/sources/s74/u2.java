package s74;

/* loaded from: classes4.dex */
public final class u2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f404561d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(org.json.JSONObject jSONObject) {
        super(0);
        this.f404561d = jSONObject;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker$checkLayoutDynamicInfo$checkLayoutResult$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker$checkLayoutDynamicInfo$checkLayoutResult$1");
        s74.x2 x2Var = s74.x2.f404589a;
        org.json.JSONObject optJSONObject = this.f404561d.optJSONObject("layout");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$checkLayoutDynamicInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
        boolean b17 = x2Var.b(optJSONObject);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$checkLayoutDynamicInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(b17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker$checkLayoutDynamicInfo$checkLayoutResult$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker$checkLayoutDynamicInfo$checkLayoutResult$1");
        return valueOf;
    }
}
