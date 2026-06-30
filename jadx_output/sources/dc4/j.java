package dc4;

/* loaded from: classes4.dex */
public final class j implements xd4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dc4.p f228764a;

    public j(dc4.p pVar) {
        this.f228764a = pVar;
    }

    @Override // xd4.e0
    public final void a(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem$initView$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTAG$cp", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTAG$cp", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem$Companion");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("timelineVideoView setUICallback onDestroy, the tlId is ");
        sb6.append(str);
        sb6.append(", the timelineId is ");
        dc4.p pVar = this.f228764a;
        sb6.append(pVar.f228831d.Id);
        com.tencent.mars.xlog.Log.w("AdDynamicViewDetailItem", sb6.toString());
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && kotlin.jvm.internal.o.b(str, pVar.f228831d.Id)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMHasPlayedVideo$p", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
            pVar.B = false;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMHasPlayedVideo$p", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem$initView$1");
    }
}
