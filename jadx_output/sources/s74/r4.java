package s74;

/* loaded from: classes4.dex */
public final class r4 {

    /* renamed from: a, reason: collision with root package name */
    public final s74.j3 f404528a;

    /* renamed from: b, reason: collision with root package name */
    public final s74.f3 f404529b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f404530c;

    public r4(s74.j3 viewNode, s74.f3 dynamicViewContext, java.lang.String str) {
        kotlin.jvm.internal.o.g(viewNode, "viewNode");
        kotlin.jvm.internal.o.g(dynamicViewContext, "dynamicViewContext");
        this.f404528a = viewNode;
        this.f404529b = dynamicViewContext;
        this.f404530c = str;
    }

    public final s74.f3 a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDynamicViewContext", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.PreloadViewNode");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDynamicViewContext", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.PreloadViewNode");
        return this.f404529b;
    }
}
