package wd4;

/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public int f445020a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f445021b;

    /* renamed from: c, reason: collision with root package name */
    public final wd4.t0 f445022c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.storage.z3 f445023d;

    public s0(int i17, java.lang.String str, wd4.t0 t0Var, com.tencent.mm.storage.z3 z3Var, int i18, kotlin.jvm.internal.i iVar) {
        str = (i18 & 2) != 0 ? null : str;
        t0Var = (i18 & 4) != 0 ? null : t0Var;
        z3Var = (i18 & 8) != 0 ? null : z3Var;
        this.f445020a = i17;
        this.f445021b = str;
        this.f445022c = t0Var;
        this.f445023d = z3Var;
    }

    public final wd4.t0 a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLabel", "com.tencent.mm.plugin.sns.ui.sheet.ItemInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLabel", "com.tencent.mm.plugin.sns.ui.sheet.ItemInfo");
        return this.f445022c;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ui.sheet.ItemInfo");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.sheet.ItemInfo");
            return true;
        }
        if (!(obj instanceof wd4.s0)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.sheet.ItemInfo");
            return false;
        }
        wd4.s0 s0Var = (wd4.s0) obj;
        if (this.f445020a != s0Var.f445020a) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.sheet.ItemInfo");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f445021b, s0Var.f445021b)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.sheet.ItemInfo");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f445022c, s0Var.f445022c)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.sheet.ItemInfo");
            return false;
        }
        boolean b17 = kotlin.jvm.internal.o.b(this.f445023d, s0Var.f445023d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.sheet.ItemInfo");
        return b17;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.sheet.ItemInfo");
        int hashCode = java.lang.Integer.hashCode(this.f445020a) * 31;
        java.lang.String str = this.f445021b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        wd4.t0 t0Var = this.f445022c;
        int hashCode3 = (hashCode2 + (t0Var == null ? 0 : t0Var.hashCode())) * 31;
        com.tencent.mm.storage.z3 z3Var = this.f445023d;
        int hashCode4 = hashCode3 + (z3Var != null ? z3Var.hashCode() : 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.sheet.ItemInfo");
        return hashCode4;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.sheet.ItemInfo");
        java.lang.String str = "ItemInfo(type=" + this.f445020a + ", title=" + this.f445021b + ", label=" + this.f445022c + ", contact=" + this.f445023d + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.sheet.ItemInfo");
        return str;
    }
}
