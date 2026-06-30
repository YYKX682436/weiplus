package v74;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public r45.jj4 f433861a;

    /* renamed from: b, reason: collision with root package name */
    public long f433862b = 4000;

    /* renamed from: c, reason: collision with root package name */
    public long f433863c = 1000;

    public final r45.jj4 a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCardMedia", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo$SplashCardInfo");
        r45.jj4 jj4Var = this.f433861a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCardMedia", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo$SplashCardInfo");
        return jj4Var;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo$SplashCardInfo");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[delay=");
        sb6.append(this.f433862b);
        sb6.append(", duration=");
        sb6.append(this.f433863c);
        sb6.append(", mediaId=");
        r45.jj4 jj4Var = this.f433861a;
        sb6.append(jj4Var != null ? jj4Var.f377855d : null);
        sb6.append(']');
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo$SplashCardInfo");
        return sb7;
    }
}
