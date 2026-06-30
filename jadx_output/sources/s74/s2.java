package s74;

/* loaded from: classes4.dex */
public final class s2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f404541d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(org.json.JSONObject jSONObject) {
        super(0);
        this.f404541d = jSONObject;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker$checkLayoutDynamicInfo$checkAnimsResult$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker$checkLayoutDynamicInfo$checkAnimsResult$1");
        s74.x2 x2Var = s74.x2.f404589a;
        org.json.JSONArray optJSONArray = this.f404541d.optJSONArray("animations");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$checkAnimations", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkAnimations", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        c0Var.f310112d = true;
        if (optJSONArray != null) {
            c75.c.d(optJSONArray, new s74.r2(c0Var));
        }
        boolean z17 = c0Var.f310112d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkAnimations", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$checkAnimations", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker$checkLayoutDynamicInfo$checkAnimsResult$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker$checkLayoutDynamicInfo$checkAnimsResult$1");
        return valueOf;
    }
}
