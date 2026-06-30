package o74;

/* loaded from: classes4.dex */
public class f implements xd4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o74.j f343568a;

    public f(o74.j jVar) {
        this.f343568a = jVar;
    }

    @Override // xd4.e0
    public void a(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem$2");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
            o74.j jVar = this.f343568a;
            java.lang.String str2 = jVar.f343572r;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
            if (str.equals(str2)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("playOnlineVideo: timelineVideoView setUICallback onDestroy, the tlId is ");
                sb6.append(str);
                sb6.append(", the timelineId is ");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
                java.lang.String str3 = jVar.f343572r;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
                sb6.append(str3);
                com.tencent.mars.xlog.Log.w("SnsAd.AdSightTimeLineItem", sb6.toString());
                jVar.I();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem$2");
    }
}
