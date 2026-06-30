package s74;

/* loaded from: classes4.dex */
public final class j3 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f404366a;

    /* renamed from: b, reason: collision with root package name */
    public final s74.g3 f404367b;

    /* renamed from: c, reason: collision with root package name */
    public org.json.JSONObject f404368c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f404369d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f404370e;

    public j3(android.view.View view, s74.g3 layoutParamsInfo, org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2, int i17, kotlin.jvm.internal.i iVar) {
        jSONObject = (i17 & 4) != 0 ? null : jSONObject;
        str = (i17 & 8) != 0 ? null : str;
        str2 = (i17 & 16) != 0 ? null : str2;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(layoutParamsInfo, "layoutParamsInfo");
        this.f404366a = view;
        this.f404367b = layoutParamsInfo;
        this.f404368c = jSONObject;
        this.f404369d = str;
        this.f404370e = str2;
    }

    public final java.lang.String a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getId", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$ViewNode");
        java.lang.String str = this.f404369d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getId", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$ViewNode");
        return str;
    }

    public final s74.g3 b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutParamsInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$ViewNode");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutParamsInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$ViewNode");
        return this.f404367b;
    }

    public final android.view.View c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getView", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$ViewNode");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getView", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$ViewNode");
        return this.f404366a;
    }

    public final void d(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setId", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$ViewNode");
        this.f404369d = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setId", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$ViewNode");
    }

    public final void e(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setViewType", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$ViewNode");
        this.f404370e = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setViewType", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$ViewNode");
    }
}
