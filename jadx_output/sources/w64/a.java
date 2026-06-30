package w64;

/* loaded from: classes4.dex */
public abstract class a implements v64.c {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo f443283a;

    @Override // v64.c
    public boolean a(android.view.View view, int i17, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, v64.d dVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AbsAdActionButtonClick");
        if (snsInfo == null || snsInfo.getAdXml() == null) {
            com.tencent.mars.xlog.Log.w("SnsAd.AdActionButtonClick", "the sns info or adxml is null!!!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AbsAdActionButtonClick");
            return false;
        }
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo = this.f443283a;
        if (adClickActionInfo != null) {
            try {
                boolean c17 = c(view, i17, snsInfo, adClickActionInfo, dVar);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AbsAdActionButtonClick");
                return c17;
            } catch (java.lang.Throwable unused) {
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AbsAdActionButtonClick");
        return false;
    }

    public abstract boolean c(android.view.View view, int i17, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo, v64.d dVar);
}
