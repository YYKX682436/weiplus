package s74;

/* loaded from: classes4.dex */
public final class h3 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f404328a;

    /* renamed from: b, reason: collision with root package name */
    public final float f404329b;

    /* renamed from: c, reason: collision with root package name */
    public final org.json.JSONObject f404330c;

    public h3(android.view.View view, float f17, org.json.JSONObject obj) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(obj, "obj");
        this.f404328a = view;
        this.f404329b = f17;
        this.f404330c = obj;
    }

    public final org.json.JSONObject a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getObj", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$OutlineInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getObj", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$OutlineInfo");
        return this.f404330c;
    }
}
