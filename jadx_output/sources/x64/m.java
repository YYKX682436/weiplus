package x64;

/* loaded from: classes4.dex */
public class m extends w64.a {
    public m(com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo) {
        this.f443283a = adClickActionInfo;
    }

    @Override // w64.a
    public boolean c(android.view.View view, int i17, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo, v64.d dVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderTopicActionButtonClick");
        if (snsInfo == null || adClickActionInfo == null || view == null) {
            com.tencent.mars.xlog.Log.w("SnsAd.FinderTopicActionButton", "the input param is invalid!!!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderTopicActionButtonClick");
            return false;
        }
        boolean a17 = d44.i.a(view.getContext(), adClickActionInfo.f162578e0, adClickActionInfo.f162580f0, snsInfo, 6, dVar);
        if (a17 && dVar != null) {
            a84.u0.a((com.tencent.mm.modelsns.SnsAdClick) dVar.a("snsAdClick", null), 46);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderTopicActionButtonClick");
        return a17;
    }
}
