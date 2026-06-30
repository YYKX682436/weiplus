package p44;

/* loaded from: classes4.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f351848a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f351849b;

    /* renamed from: c, reason: collision with root package name */
    public long f351850c;

    /* renamed from: d, reason: collision with root package name */
    public int f351851d;

    /* renamed from: e, reason: collision with root package name */
    public int f351852e;

    @za4.k1(flag = 4, resType = 2)
    public java.lang.String imageUrl;

    public s() {
        this.f351851d = -1;
        this.f351852e = -1;
    }

    public final p44.s a(p44.s original) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("deepCopy", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo$CardItem");
        kotlin.jvm.internal.o.g(original, "original");
        p44.s sVar = new p44.s(original.imageUrl, original.f351848a, original.f351849b, original.f351850c, original.f351851d, original.f351852e);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deepCopy", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo$CardItem");
        return sVar;
    }

    public final java.lang.String b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCardId", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo$CardItem");
        java.lang.String str = this.f351849b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCardId", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo$CardItem");
        return str;
    }

    public final long c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPickedTime", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo$CardItem");
        long j17 = this.f351850c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPickedTime", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo$CardItem");
        return j17;
    }

    public final int d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getShowIndex", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo$CardItem");
        int i17 = this.f351852e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getShowIndex", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo$CardItem");
        return i17;
    }

    public final java.lang.String e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTitle", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo$CardItem");
        java.lang.String str = this.f351848a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTitle", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo$CardItem");
        return str;
    }

    public final int f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getXmlIndex", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo$CardItem");
        int i17 = this.f351851d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getXmlIndex", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo$CardItem");
        return i17;
    }

    public final boolean g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isPicked", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo$CardItem");
        boolean z17 = this.f351850c > 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPicked", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo$CardItem");
        return z17;
    }

    public final void h(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPickedTime", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo$CardItem");
        this.f351850c = j17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPickedTime", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo$CardItem");
    }

    public final void i(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setShowIndex", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo$CardItem");
        this.f351852e = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setShowIndex", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo$CardItem");
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo$CardItem");
        java.lang.String str = "[title=" + this.f351848a + ", cardId=" + this.f351849b + ", pickedTime=" + this.f351850c + ", xmlIndex=" + this.f351851d + ", showIndex=" + this.f351852e + ']';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo$CardItem");
        return str;
    }

    public s(java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, int i17, int i18) {
        this.imageUrl = str;
        this.f351848a = str2;
        this.f351849b = str3;
        this.f351850c = j17;
        this.f351851d = i17;
        this.f351852e = i18;
    }
}
