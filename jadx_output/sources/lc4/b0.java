package lc4;

/* loaded from: classes4.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f317947a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f317948b;

    /* renamed from: c, reason: collision with root package name */
    public final int f317949c;

    /* renamed from: d, reason: collision with root package name */
    public final int f317950d;

    public b0(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, kotlin.jvm.internal.i iVar) {
        str = (i19 & 1) != 0 ? null : str;
        str2 = (i19 & 2) != 0 ? null : str2;
        i17 = (i19 & 4) != 0 ? -1 : i17;
        i18 = (i19 & 8) != 0 ? -1 : i18;
        this.f317947a = str;
        this.f317948b = str2;
        this.f317949c = i17;
        this.f317950d = i18;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveLoadInfo");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveLoadInfo");
            return true;
        }
        if (!(obj instanceof lc4.b0)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveLoadInfo");
            return false;
        }
        lc4.b0 b0Var = (lc4.b0) obj;
        if (!kotlin.jvm.internal.o.b(this.f317947a, b0Var.f317947a)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveLoadInfo");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f317948b, b0Var.f317948b)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveLoadInfo");
            return false;
        }
        if (this.f317949c != b0Var.f317949c) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveLoadInfo");
            return false;
        }
        int i17 = this.f317950d;
        int i18 = b0Var.f317950d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveLoadInfo");
        return i17 == i18;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveLoadInfo");
        java.lang.String str = this.f317947a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f317948b;
        int hashCode2 = ((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f317949c)) * 31) + java.lang.Integer.hashCode(this.f317950d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveLoadInfo");
        return hashCode2;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveLoadInfo");
        java.lang.String str = "ImproveLoadInfo(seqUpLimit=" + this.f317947a + ", seqDownLimit=" + this.f317948b + ", adTimeUpLimit=" + this.f317949c + ", adTimeDownLimit=" + this.f317950d + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveLoadInfo");
        return str;
    }
}
