package n64;

/* loaded from: classes4.dex */
public final class c extends n64.f {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo f335217e;

    public final com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getClickInfo", "com.tencent.mm.plugin.sns.ad.preload.detector.ClickPreloadItem");
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo = this.f335217e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getClickInfo", "com.tencent.mm.plugin.sns.ad.preload.detector.ClickPreloadItem");
        return adClickActionInfo;
    }

    @Override // n64.f
    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.preload.detector.ClickPreloadItem");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ClickItem[");
        sb6.append(super.toString());
        sb6.append(", clickType=");
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo = this.f335217e;
        sb6.append(adClickActionInfo != null ? java.lang.Integer.valueOf(adClickActionInfo.f162571b) : null);
        sb6.append(", scene=");
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo2 = this.f335217e;
        sb6.append(adClickActionInfo2 != null ? java.lang.Integer.valueOf(adClickActionInfo2.f162569a) : null);
        sb6.append(']');
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.preload.detector.ClickPreloadItem");
        return sb7;
    }
}
