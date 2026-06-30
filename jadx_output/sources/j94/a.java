package j94;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f298541a;

    /* renamed from: b, reason: collision with root package name */
    public final int f298542b;

    /* renamed from: c, reason: collision with root package name */
    public final int f298543c;

    public a(java.lang.String iconUrl, int i17, int i18) {
        kotlin.jvm.internal.o.g(iconUrl, "iconUrl");
        this.f298541a = iconUrl;
        this.f298542b = i17;
        this.f298543c = i18;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper$BrandIconRenderInfo");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper$BrandIconRenderInfo");
            return true;
        }
        if (!(obj instanceof j94.a)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper$BrandIconRenderInfo");
            return false;
        }
        j94.a aVar = (j94.a) obj;
        if (!kotlin.jvm.internal.o.b(this.f298541a, aVar.f298541a)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper$BrandIconRenderInfo");
            return false;
        }
        if (this.f298542b != aVar.f298542b) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper$BrandIconRenderInfo");
            return false;
        }
        int i17 = this.f298543c;
        int i18 = aVar.f298543c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper$BrandIconRenderInfo");
        return i17 == i18;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper$BrandIconRenderInfo");
        int hashCode = (((this.f298541a.hashCode() * 31) + java.lang.Integer.hashCode(this.f298542b)) * 31) + java.lang.Integer.hashCode(this.f298543c);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper$BrandIconRenderInfo");
        return hashCode;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper$BrandIconRenderInfo");
        java.lang.String str = "BrandIconRenderInfo(iconUrl=" + this.f298541a + ", widthDp=" + this.f298542b + ", heightDp=" + this.f298543c + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper$BrandIconRenderInfo");
        return str;
    }
}
