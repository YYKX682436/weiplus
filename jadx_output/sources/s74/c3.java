package s74;

/* loaded from: classes4.dex */
public final class c3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f404231d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f404232e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s74.f3 f404233f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(org.json.JSONObject jSONObject, java.util.List list, s74.f3 f3Var) {
        super(1);
        this.f404231d = jSONObject;
        this.f404232e = list;
        this.f404233f = f3Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext$genAbsoluteChildren$1");
        org.json.JSONObject it = (org.json.JSONObject) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext$genAbsoluteChildren$1");
        kotlin.jvm.internal.o.g(it, "it");
        if (kotlin.jvm.internal.o.b(it.optString("position"), "absolute")) {
            org.json.JSONObject jSONObject = this.f404231d;
            if (!kotlin.jvm.internal.o.b(jSONObject, it)) {
                this.f404232e.add(it);
                s74.f3 f3Var = this.f404233f;
                f3Var.l(jSONObject);
                f3Var.l(it);
                f3Var.b(it);
                z17 = true;
                java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext$genAbsoluteChildren$1");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext$genAbsoluteChildren$1");
                return valueOf;
            }
        }
        z17 = false;
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext$genAbsoluteChildren$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext$genAbsoluteChildren$1");
        return valueOf2;
    }
}
