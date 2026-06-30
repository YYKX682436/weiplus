package n44;

/* loaded from: classes14.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public int f335007a;

    /* renamed from: b, reason: collision with root package name */
    public int f335008b;

    /* renamed from: c, reason: collision with root package name */
    public int f335009c;

    /* renamed from: d, reason: collision with root package name */
    public int f335010d;

    public o0(int i17, int i18, int i19, int i27, int i28, kotlin.jvm.internal.i iVar) {
        i17 = (i28 & 1) != 0 ? 0 : i17;
        i18 = (i28 & 2) != 0 ? 0 : i18;
        i19 = (i28 & 4) != 0 ? 0 : i19;
        i27 = (i28 & 8) != 0 ? 0 : i27;
        this.f335007a = i17;
        this.f335008b = i18;
        this.f335009c = i19;
        this.f335010d = i27;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageStatistic$VideoInfo");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageStatistic$VideoInfo");
            return true;
        }
        if (!(obj instanceof n44.o0)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageStatistic$VideoInfo");
            return false;
        }
        n44.o0 o0Var = (n44.o0) obj;
        if (this.f335007a != o0Var.f335007a) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageStatistic$VideoInfo");
            return false;
        }
        if (this.f335008b != o0Var.f335008b) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageStatistic$VideoInfo");
            return false;
        }
        if (this.f335009c != o0Var.f335009c) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageStatistic$VideoInfo");
            return false;
        }
        int i17 = this.f335010d;
        int i18 = o0Var.f335010d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageStatistic$VideoInfo");
        return i17 == i18;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageStatistic$VideoInfo");
        int hashCode = (((((java.lang.Integer.hashCode(this.f335007a) * 31) + java.lang.Integer.hashCode(this.f335008b)) * 31) + java.lang.Integer.hashCode(this.f335009c)) * 31) + java.lang.Integer.hashCode(this.f335010d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageStatistic$VideoInfo");
        return hashCode;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageStatistic$VideoInfo");
        java.lang.String str = "VideoInfo(videoDuration=" + this.f335007a + ", playTimeInterval=" + this.f335008b + ", playCount=" + this.f335009c + ", playCompletedCount=" + this.f335010d + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageStatistic$VideoInfo");
        return str;
    }
}
