package n44;

/* loaded from: classes15.dex */
public final class a0 {
    public a0(kotlin.jvm.internal.i iVar) {
    }

    public final int a(float f17, float f18, int i17, int i18, boolean z17, y54.c materialSizeData) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calculateMaterialDataSize", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageHelper$Companion");
        kotlin.jvm.internal.o.g(materialSizeData, "materialSizeData");
        if (f17 / f18 >= i17 / i18) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMaterialWidth", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$MaterialSizeData");
            materialSizeData.f459529a = i17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMaterialWidth", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$MaterialSizeData");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMaterialHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$MaterialSizeData");
            materialSizeData.f459530b = (int) java.lang.Math.ceil((materialSizeData.d() * f18) / f17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMaterialHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$MaterialSizeData");
            if (!z17) {
                i18 = materialSizeData.a();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMaterialLeft", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$MaterialSizeData");
            materialSizeData.f459531c = 0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMaterialLeft", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$MaterialSizeData");
            int a17 = (i18 - materialSizeData.a()) / 2;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMaterialTop", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$MaterialSizeData");
            materialSizeData.f459532d = a17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMaterialTop", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$MaterialSizeData");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMaterialHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$MaterialSizeData");
            materialSizeData.f459530b = i18;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMaterialHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$MaterialSizeData");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMaterialWidth", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$MaterialSizeData");
            materialSizeData.f459529a = (int) java.lang.Math.ceil((materialSizeData.a() * f17) / f18);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMaterialWidth", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$MaterialSizeData");
            int d17 = (i17 - materialSizeData.d()) / 2;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMaterialLeft", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$MaterialSizeData");
            materialSizeData.f459531c = d17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMaterialLeft", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$MaterialSizeData");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMaterialTop", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$MaterialSizeData");
            materialSizeData.f459532d = 0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMaterialTop", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$MaterialSizeData");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calculateMaterialDataSize", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageHelper$Companion");
        return i18;
    }
}
