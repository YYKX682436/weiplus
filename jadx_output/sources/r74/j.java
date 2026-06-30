package r74;

/* loaded from: classes4.dex */
public final class j implements xd4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r74.k f393208a;

    public j(r74.k kVar) {
        this.f393208a = kVar;
    }

    @Override // xd4.e0
    public final void a(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$playSightVideo$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTAG$cp", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTAG$cp", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$Companion");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("timelineVideoView setUICallback onDestroy, the tlId is ");
        sb6.append(str);
        sb6.append(", the timelineId is ");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMTimelineId$p", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
        r74.k kVar = this.f393208a;
        java.lang.String str2 = kVar.f393215w;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMTimelineId$p", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
        sb6.append(str2);
        com.tencent.mars.xlog.Log.w("AdCombineGridCardItem", sb6.toString());
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMTimelineId$p", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
            java.lang.String str3 = kVar.f393215w;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMTimelineId$p", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
            if (kotlin.jvm.internal.o.b(str, str3)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setPlayingSight$p", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
                kVar.f393212t = false;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setPlayingSight$p", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMViewLogic$p", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
                r74.a0 a0Var = kVar.f393216x;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMViewLogic$p", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
                if (a0Var != null) {
                    a0Var.m(r74.l.f393222g);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$playSightVideo$1");
    }
}
