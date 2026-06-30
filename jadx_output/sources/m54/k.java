package m54;

/* loaded from: classes4.dex */
public abstract class k {
    public static final m54.y a(java.lang.String dynamicCanvas, java.lang.String onetimeCanvas) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("PageElement", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoaderKt");
        kotlin.jvm.internal.o.g(dynamicCanvas, "dynamicCanvas");
        kotlin.jvm.internal.o.g(onetimeCanvas, "onetimeCanvas");
        m54.y yVar = new m54.y(dynamicCanvas, onetimeCanvas, 0L);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("PageElement", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoaderKt");
        return yVar;
    }
}
