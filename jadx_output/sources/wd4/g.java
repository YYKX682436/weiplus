package wd4;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel f444903a;

    /* renamed from: b, reason: collision with root package name */
    public final bi1.g f444904b;

    public g(com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel model, bi1.g scene) {
        kotlin.jvm.internal.o.g(model, "model");
        kotlin.jvm.internal.o.g(scene, "scene");
        this.f444903a = model;
        this.f444904b = scene;
    }

    public final com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getModel", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$MaterialInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getModel", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$MaterialInfo");
        return this.f444903a;
    }

    public final bi1.g b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getScene", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$MaterialInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getScene", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$MaterialInfo");
        return this.f444904b;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$MaterialInfo");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$MaterialInfo");
            return true;
        }
        if (!(obj instanceof wd4.g)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$MaterialInfo");
            return false;
        }
        wd4.g gVar = (wd4.g) obj;
        if (!kotlin.jvm.internal.o.b(this.f444903a, gVar.f444903a)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$MaterialInfo");
            return false;
        }
        bi1.g gVar2 = this.f444904b;
        bi1.g gVar3 = gVar.f444904b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$MaterialInfo");
        return gVar2 == gVar3;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$MaterialInfo");
        int hashCode = (this.f444903a.hashCode() * 31) + this.f444904b.hashCode();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$MaterialInfo");
        return hashCode;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$MaterialInfo");
        java.lang.String str = "MaterialInfo(model=" + this.f444903a + ", scene=" + this.f444904b + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$MaterialInfo");
        return str;
    }
}
