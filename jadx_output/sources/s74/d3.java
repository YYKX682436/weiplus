package s74;

/* loaded from: classes.dex */
public final class d3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final s74.d3 f404247d = new s74.d3();

    public d3() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext$genAbsoluteChildren$childrenOf$1");
        org.json.JSONObject it = (org.json.JSONObject) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext$genAbsoluteChildren$childrenOf$1");
        kotlin.jvm.internal.o.g(it, "it");
        org.json.JSONArray optJSONArray = it.has("children") ? it.optJSONArray("children") : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext$genAbsoluteChildren$childrenOf$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext$genAbsoluteChildren$childrenOf$1");
        return optJSONArray;
    }
}
