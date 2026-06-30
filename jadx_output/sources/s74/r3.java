package s74;

/* loaded from: classes.dex */
public final class r3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f404527d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(int i17) {
        super(1);
        this.f404527d = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$processGridElementContainer$1$1");
        org.json.JSONObject it = (org.json.JSONObject) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$processGridElementContainer$1$1");
        kotlin.jvm.internal.o.g(it, "it");
        it.put("grid-item-index", java.lang.String.valueOf(this.f404527d));
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(it.optJSONArray("children") == null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$processGridElementContainer$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$processGridElementContainer$1$1");
        return valueOf;
    }
}
