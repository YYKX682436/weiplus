package dc4;

/* loaded from: classes4.dex */
public final class a implements xd4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dc4.i f228715a;

    public a(dc4.i iVar) {
        this.f228715a = iVar;
    }

    @Override // xd4.e0
    public final void a(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem$initView$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTAG$cp", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTAG$cp", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem$Companion");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("timelineVideoView setUICallback onDestroy, the tlId is ");
        sb6.append(str);
        sb6.append(", the timelineId is ");
        dc4.i iVar = this.f228715a;
        sb6.append(iVar.f228831d.Id);
        com.tencent.mars.xlog.Log.w("AdCombineGridDetailItem", sb6.toString());
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && kotlin.jvm.internal.o.b(str, iVar.f228831d.Id)) {
            iVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMHasPlayedVideo", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
            iVar.f228761y = false;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMHasPlayedVideo", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem$initView$1");
    }
}
