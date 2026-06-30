package p74;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final float f352564a;

    /* renamed from: b, reason: collision with root package name */
    public final float f352565b;

    public j(float f17, float f18, float f19, float f27) {
        this.f352564a = f17;
        this.f352565b = f18;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper$CardSizeInfo");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper$CardSizeInfo");
            return true;
        }
        if (!(obj instanceof p74.j)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper$CardSizeInfo");
            return false;
        }
        p74.j jVar = (p74.j) obj;
        if (java.lang.Float.compare(this.f352564a, jVar.f352564a) != 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper$CardSizeInfo");
            return false;
        }
        if (java.lang.Float.compare(this.f352565b, jVar.f352565b) != 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper$CardSizeInfo");
            return false;
        }
        if (java.lang.Float.compare(28.0f, 28.0f) != 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper$CardSizeInfo");
            return false;
        }
        int compare = java.lang.Float.compare(24.0f, 24.0f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper$CardSizeInfo");
        return compare == 0;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper$CardSizeInfo");
        int hashCode = (((((java.lang.Float.hashCode(this.f352564a) * 31) + java.lang.Float.hashCode(this.f352565b)) * 31) + java.lang.Float.hashCode(28.0f)) * 31) + java.lang.Float.hashCode(24.0f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper$CardSizeInfo");
        return hashCode;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper$CardSizeInfo");
        java.lang.String str = "CardSizeInfo(widthDp=" + this.f352564a + ", heightDp=" + this.f352565b + ", exposeDistance2Dp=28.0, exposeDistance3Dp=24.0)";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper$CardSizeInfo");
        return str;
    }
}
