package j84;

/* loaded from: classes4.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f298213a;

    /* renamed from: b, reason: collision with root package name */
    public final float f298214b;

    public j0(float f17, float f18) {
        this.f298213a = f17;
        this.f298214b = f18;
    }

    public final float a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getEndX", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCoverView$Segment");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEndX", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCoverView$Segment");
        return this.f298214b;
    }

    public final float b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStartX", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCoverView$Segment");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStartX", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCoverView$Segment");
        return this.f298213a;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCoverView$Segment");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCoverView$Segment");
            return true;
        }
        if (!(obj instanceof j84.j0)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCoverView$Segment");
            return false;
        }
        j84.j0 j0Var = (j84.j0) obj;
        if (java.lang.Float.compare(this.f298213a, j0Var.f298213a) != 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCoverView$Segment");
            return false;
        }
        int compare = java.lang.Float.compare(this.f298214b, j0Var.f298214b);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCoverView$Segment");
        return compare == 0;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCoverView$Segment");
        int hashCode = (java.lang.Float.hashCode(this.f298213a) * 31) + java.lang.Float.hashCode(this.f298214b);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCoverView$Segment");
        return hashCode;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCoverView$Segment");
        java.lang.String str = "Segment(startX=" + this.f298213a + ", endX=" + this.f298214b + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCoverView$Segment");
        return str;
    }
}
