package s74;

/* loaded from: classes.dex */
public final class v2 implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f404570a;

    public v2(java.lang.String str) {
        this.f404570a = str;
    }

    @Override // za4.e0
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker$traversalObjAndPreload$1");
        com.tencent.mars.xlog.Log.e("DynamicView.DynamicInfoChecker", "url download  failed!");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker$traversalObjAndPreload$1");
    }

    @Override // za4.e0
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker$traversalObjAndPreload$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker$traversalObjAndPreload$1");
    }

    @Override // za4.e0
    public void c(java.lang.String path) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker$traversalObjAndPreload$1");
        kotlin.jvm.internal.o.g(path, "path");
        com.tencent.mars.xlog.Log.i("DynamicView.DynamicInfoChecker", "onDownloaded url " + this.f404570a + "  path " + path);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker$traversalObjAndPreload$1");
    }
}
