package f54;

/* loaded from: classes4.dex */
public class f extends ab4.d0 {
    public java.util.List F = new java.util.ArrayList();
    public f54.d G;
    public float H;
    public float I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f259719J;
    public java.lang.String K;

    @za4.k1
    public s34.p dropCardAnimInfo;

    @za4.k1(resType = 2)
    public java.lang.String newCollectionBackImg;

    @za4.k1(resType = 2)
    public java.lang.String newCollectionCoverImg;

    @za4.k1
    public f54.e randomPickCardTipInfo;

    @za4.k1(resType = 2)
    public java.lang.String recollectedCoverImg;

    @za4.k1
    public s34.w twistCardAnimInfo;

    @Override // ab4.d0
    public java.util.List a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAllChildrenCompInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingEggCardContainerInfo");
        java.util.List list = this.F;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAllChildrenCompInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingEggCardContainerInfo");
        return list;
    }
}
