package m54;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f324248a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f324249b;

    public b0(int i17, java.lang.Object value) {
        kotlin.jvm.internal.o.g(value, "value");
        this.f324248a = i17;
        this.f324249b = value;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDowngradeSupport$VangoghDowngradeData");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDowngradeSupport$VangoghDowngradeData");
            return true;
        }
        if (!(obj instanceof m54.b0)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDowngradeSupport$VangoghDowngradeData");
            return false;
        }
        m54.b0 b0Var = (m54.b0) obj;
        if (this.f324248a != b0Var.f324248a) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDowngradeSupport$VangoghDowngradeData");
            return false;
        }
        boolean b17 = kotlin.jvm.internal.o.b(this.f324249b, b0Var.f324249b);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDowngradeSupport$VangoghDowngradeData");
        return b17;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDowngradeSupport$VangoghDowngradeData");
        int hashCode = (java.lang.Integer.hashCode(this.f324248a) * 31) + this.f324249b.hashCode();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDowngradeSupport$VangoghDowngradeData");
        return hashCode;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDowngradeSupport$VangoghDowngradeData");
        java.lang.String str = "VangoghDowngradeData(type=" + this.f324248a + ", value=" + this.f324249b + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDowngradeSupport$VangoghDowngradeData");
        return str;
    }
}
