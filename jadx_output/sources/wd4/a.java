package wd4;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f444854a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f444855b;

    public a(boolean z17, java.util.List allNotReadyConditions) {
        kotlin.jvm.internal.o.g(allNotReadyConditions, "allNotReadyConditions");
        this.f444854a = z17;
        this.f444855b = allNotReadyConditions;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$CheckConditionsResult");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$CheckConditionsResult");
            return true;
        }
        if (!(obj instanceof wd4.a)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$CheckConditionsResult");
            return false;
        }
        wd4.a aVar = (wd4.a) obj;
        if (this.f444854a != aVar.f444854a) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$CheckConditionsResult");
            return false;
        }
        boolean b17 = kotlin.jvm.internal.o.b(this.f444855b, aVar.f444855b);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$CheckConditionsResult");
        return b17;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$CheckConditionsResult");
        int hashCode = (java.lang.Boolean.hashCode(this.f444854a) * 31) + this.f444855b.hashCode();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$CheckConditionsResult");
        return hashCode;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$CheckConditionsResult");
        java.lang.String str = "CheckConditionsResult(allConditionsGranted=" + this.f444854a + ", allNotReadyConditions=" + this.f444855b + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$CheckConditionsResult");
        return str;
    }
}
