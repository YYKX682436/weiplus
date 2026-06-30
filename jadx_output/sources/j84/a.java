package j84;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f298167a;

    /* renamed from: b, reason: collision with root package name */
    public final float f298168b;

    /* renamed from: c, reason: collision with root package name */
    public final float f298169c;

    /* renamed from: d, reason: collision with root package name */
    public float f298170d;

    public a(float f17, float f18, float f19, float f27) {
        this.f298167a = f17;
        this.f298168b = f18;
        this.f298169c = f19;
        this.f298170d = f27;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardAnimationManager$PeekCircle");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardAnimationManager$PeekCircle");
            return true;
        }
        if (!(obj instanceof j84.a)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardAnimationManager$PeekCircle");
            return false;
        }
        j84.a aVar = (j84.a) obj;
        if (java.lang.Float.compare(this.f298167a, aVar.f298167a) != 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardAnimationManager$PeekCircle");
            return false;
        }
        if (java.lang.Float.compare(this.f298168b, aVar.f298168b) != 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardAnimationManager$PeekCircle");
            return false;
        }
        if (java.lang.Float.compare(this.f298169c, aVar.f298169c) != 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardAnimationManager$PeekCircle");
            return false;
        }
        int compare = java.lang.Float.compare(this.f298170d, aVar.f298170d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardAnimationManager$PeekCircle");
        return compare == 0;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardAnimationManager$PeekCircle");
        int hashCode = (((((java.lang.Float.hashCode(this.f298167a) * 31) + java.lang.Float.hashCode(this.f298168b)) * 31) + java.lang.Float.hashCode(this.f298169c)) * 31) + java.lang.Float.hashCode(this.f298170d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardAnimationManager$PeekCircle");
        return hashCode;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardAnimationManager$PeekCircle");
        java.lang.String str = "PeekCircle(x=" + this.f298167a + ", y=" + this.f298168b + ", radius=" + this.f298169c + ", scale=" + this.f298170d + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardAnimationManager$PeekCircle");
        return str;
    }
}
