package s74;

/* loaded from: classes4.dex */
public final class t3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f404550d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f404551e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(yz5.l lVar, yz5.l lVar2) {
        super(1);
        this.f404550d = lVar;
        this.f404551e = lVar2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$traverseObjByJSONArray$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$traverseObjByJSONArray$2");
        if (obj instanceof org.json.JSONObject) {
            s74.u3.f404562a.B((org.json.JSONObject) obj, this.f404550d, this.f404551e);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$traverseObjByJSONArray$2");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$traverseObjByJSONArray$2");
        return f0Var;
    }
}
