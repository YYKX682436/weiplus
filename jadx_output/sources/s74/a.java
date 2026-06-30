package s74;

/* loaded from: classes4.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public final void a(java.lang.String tag) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("beginSection", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$Companion");
        kotlin.jvm.internal.o.g(tag, "tag");
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("beginSection", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$Companion");
    }

    public final void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("endSection", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$Companion");
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("endSection", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$Companion");
    }

    public final java.lang.Object c(java.lang.String tag, yz5.a block) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("runWithSection", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$Companion");
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(block, "block");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("beginSection", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$Companion");
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("beginSection", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$Companion");
        java.lang.Object invoke = block.invoke();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("endSection", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$Companion");
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("endSection", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("runWithSection", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$Companion");
        return invoke;
    }
}
