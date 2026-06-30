package s74;

/* loaded from: classes4.dex */
public final class q3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s74.f3 f404510d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s74.j3 f404511e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f404512f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(s74.f3 f3Var, s74.j3 j3Var, org.json.JSONObject jSONObject) {
        super(1);
        this.f404510d = f3Var;
        this.f404511e = j3Var;
        this.f404512f = jSONObject;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$createViewAndParams$1");
        java.lang.String it = (java.lang.String) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$createViewAndParams$1");
        kotlin.jvm.internal.o.g(it, "it");
        s74.f3 f3Var = this.f404510d;
        f3Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("findAnimById", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        org.json.JSONObject jSONObject = null;
        org.json.JSONArray jSONArray = f3Var.f404270d;
        if (jSONArray != null) {
            int length = jSONArray.length();
            int i17 = 0;
            while (true) {
                if (i17 >= length) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findAnimById", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
                    break;
                }
                java.lang.Object obj2 = jSONArray.get(i17);
                org.json.JSONObject jSONObject2 = obj2 instanceof org.json.JSONObject ? (org.json.JSONObject) obj2 : null;
                java.lang.String optString = jSONObject2 != null ? jSONObject2.optString("animationId") : null;
                if (optString == null) {
                    optString = "";
                }
                if (kotlin.jvm.internal.o.b(it, optString)) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findAnimById", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
                    jSONObject = jSONObject2;
                    break;
                }
                i17++;
            }
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findAnimById", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        }
        if (jSONObject != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getViewAnimations", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
            java.util.List list = f3Var.V;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewAnimations", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
            ((java.util.ArrayList) list).add(new s74.a1(this.f404511e.c(), jSONObject, this.f404512f, f3Var));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$createViewAndParams$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$createViewAndParams$1");
        return f0Var;
    }
}
