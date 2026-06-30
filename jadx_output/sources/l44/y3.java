package l44;

/* loaded from: classes4.dex */
public class y3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f316425a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f316426b;

    /* renamed from: c, reason: collision with root package name */
    public final int f316427c;

    public y3(java.lang.String str, java.lang.String str2, int i17) {
        this.f316425a = str;
        this.f316426b = str2;
        this.f316427c = i17;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader$WeAppInfo");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader$WeAppInfo");
            return true;
        }
        if (obj instanceof l44.y3) {
            l44.y3 y3Var = (l44.y3) obj;
            if (this.f316427c == y3Var.f316427c && u46.l.c(this.f316425a, y3Var.f316425a) && u46.l.c(this.f316426b, y3Var.f316426b)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader$WeAppInfo");
                return true;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader$WeAppInfo");
        return false;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader$WeAppInfo");
        java.lang.String str = this.f316425a + "|" + this.f316427c + "|" + this.f316426b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader$WeAppInfo");
        return str;
    }
}
