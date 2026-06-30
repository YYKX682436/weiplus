package n44;

/* loaded from: classes3.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f335004a;

    /* renamed from: b, reason: collision with root package name */
    public final int f335005b;

    public n0(int i17, int i18) {
        this.f335004a = i17;
        this.f335005b = i18;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageStatistic$GridItem");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageStatistic$GridItem");
            return true;
        }
        if (!(obj instanceof n44.n0)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageStatistic$GridItem");
            return false;
        }
        n44.n0 n0Var = (n44.n0) obj;
        if (this.f335004a != n0Var.f335004a) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageStatistic$GridItem");
            return false;
        }
        int i17 = this.f335005b;
        int i18 = n0Var.f335005b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageStatistic$GridItem");
        return i17 == i18;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageStatistic$GridItem");
        int hashCode = (java.lang.Integer.hashCode(this.f335004a) * 31) + java.lang.Integer.hashCode(this.f335005b);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageStatistic$GridItem");
        return hashCode;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageStatistic$GridItem");
        java.lang.String str = "GridItem(index=" + this.f335004a + ", exposureCount=" + this.f335005b + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageStatistic$GridItem");
        return str;
    }
}
