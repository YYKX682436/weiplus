package x64;

/* loaded from: classes4.dex */
public final class j extends w64.a {
    public j(com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo) {
        this.f443283a = adClickActionInfo;
    }

    @Override // w64.a
    public boolean c(android.view.View view, int i17, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo, v64.d dVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2");
        if (view == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2");
            return false;
        }
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2");
            return false;
        }
        if (adClickActionInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2");
            return false;
        }
        android.content.Context context = view.getContext();
        if (context == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2");
            return false;
        }
        java.lang.String str = adClickActionInfo.finderUsername;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String str2 = str == null ? "" : str;
        java.lang.String str3 = adClickActionInfo.X;
        java.lang.String str4 = str3 == null ? "" : str3;
        int c17 = l44.s4.c(adClickActionInfo.f162569a);
        java.lang.String T = ca4.z0.T(snsInfo);
        d44.h.c(T, str2, str4, new x64.h(this, T, snsInfo, i17, str2, str4, c17, dVar, context, adClickActionInfo));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2");
        return true;
    }
}
