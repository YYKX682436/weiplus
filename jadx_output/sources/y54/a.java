package y54;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f459516a;

    /* renamed from: b, reason: collision with root package name */
    public int f459517b;

    /* renamed from: c, reason: collision with root package name */
    public int f459518c;

    public a(int i17, int i18, int i19, int i27, kotlin.jvm.internal.i iVar) {
        i17 = (i27 & 1) != 0 ? 0 : i17;
        i18 = (i27 & 2) != 0 ? 0 : i18;
        i19 = (i27 & 4) != 0 ? 0 : i19;
        this.f459516a = i17;
        this.f459517b = i18;
        this.f459518c = i19;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ConfigData");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ConfigData");
            return true;
        }
        if (!(obj instanceof y54.a)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ConfigData");
            return false;
        }
        y54.a aVar = (y54.a) obj;
        if (this.f459516a != aVar.f459516a) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ConfigData");
            return false;
        }
        if (this.f459517b != aVar.f459517b) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ConfigData");
            return false;
        }
        int i17 = this.f459518c;
        int i18 = aVar.f459518c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ConfigData");
        return i17 == i18;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ConfigData");
        int hashCode = (((java.lang.Integer.hashCode(this.f459516a) * 31) + java.lang.Integer.hashCode(this.f459517b)) * 31) + java.lang.Integer.hashCode(this.f459518c);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ConfigData");
        return hashCode;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ConfigData");
        java.lang.String str = "ConfigData(orientation=" + this.f459516a + ", screenWidthDp=" + this.f459517b + ", screenHeightDp=" + this.f459518c + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ConfigData");
        return str;
    }
}
