package wd4;

/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f445027a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f445028b;

    /* renamed from: c, reason: collision with root package name */
    public final int f445029c;

    public t0(int i17, java.lang.String name, int i18) {
        kotlin.jvm.internal.o.g(name, "name");
        this.f445027a = i17;
        this.f445028b = name;
        this.f445029c = i18;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ui.sheet.LabelInfo");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.sheet.LabelInfo");
            return true;
        }
        if (!(obj instanceof wd4.t0)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.sheet.LabelInfo");
            return false;
        }
        wd4.t0 t0Var = (wd4.t0) obj;
        if (this.f445027a != t0Var.f445027a) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.sheet.LabelInfo");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f445028b, t0Var.f445028b)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.sheet.LabelInfo");
            return false;
        }
        int i17 = this.f445029c;
        int i18 = t0Var.f445029c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.sheet.LabelInfo");
        return i17 == i18;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.sheet.LabelInfo");
        int hashCode = (((java.lang.Integer.hashCode(this.f445027a) * 31) + this.f445028b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f445029c);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.sheet.LabelInfo");
        return hashCode;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.sheet.LabelInfo");
        java.lang.String str = "LabelInfo(id=" + this.f445027a + ", name=" + this.f445028b + ", count=" + this.f445029c + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.sheet.LabelInfo");
        return str;
    }
}
