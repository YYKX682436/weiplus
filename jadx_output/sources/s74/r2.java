package s74;

/* loaded from: classes4.dex */
public final class r2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f404526d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(kotlin.jvm.internal.c0 c0Var) {
        super(1);
        this.f404526d = c0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker$checkAnimations$1");
        org.json.JSONObject it = (org.json.JSONObject) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker$checkAnimations$1");
        kotlin.jvm.internal.o.g(it, "it");
        org.json.JSONArray optJSONArray = it.optJSONArray("modified-property");
        if (optJSONArray != null) {
            c75.c.d(optJSONArray, new s74.q2(this.f404526d));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker$checkAnimations$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker$checkAnimations$1");
        return f0Var;
    }
}
