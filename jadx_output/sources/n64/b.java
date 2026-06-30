package n64;

/* loaded from: classes4.dex */
public abstract class b implements n64.d {
    private java.util.List<? extends n64.f> mPreloadItemList;

    @Override // n64.d
    public java.util.List<n64.f> getPreloadItems() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPreloadItems", "com.tencent.mm.plugin.sns.ad.preload.detector.BaseAdPreloadable");
        java.util.List list = this.mPreloadItemList;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPreloadItems", "com.tencent.mm.plugin.sns.ad.preload.detector.BaseAdPreloadable");
        return list;
    }

    @Override // n64.d
    public void setPreloadItems(java.util.List<? extends n64.f> list) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPreloadItems", "com.tencent.mm.plugin.sns.ad.preload.detector.BaseAdPreloadable");
        this.mPreloadItemList = list;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPreloadItems", "com.tencent.mm.plugin.sns.ad.preload.detector.BaseAdPreloadable");
    }
}
