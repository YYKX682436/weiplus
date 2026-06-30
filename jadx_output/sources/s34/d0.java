package s34;

/* loaded from: classes3.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f402617a;

    public d0(java.lang.String str) {
        this.f402617a = str;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveProductInfo");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveProductInfo");
            return true;
        }
        if (!(obj instanceof s34.d0)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveProductInfo");
            return false;
        }
        boolean b17 = kotlin.jvm.internal.o.b(this.f402617a, ((s34.d0) obj).f402617a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveProductInfo");
        return b17;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveProductInfo");
        java.lang.String str = this.f402617a;
        int hashCode = str == null ? 0 : str.hashCode();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveProductInfo");
        return hashCode;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveProductInfo");
        java.lang.String str = "AdFinderLiveProductInfo(numberRequestParams=" + this.f402617a + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveProductInfo");
        return str;
    }
}
