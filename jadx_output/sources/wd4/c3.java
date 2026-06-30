package wd4;

/* loaded from: classes4.dex */
public abstract class c3 {
    public static final void a(com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity snsOnlineVideoActivity) {
        wd4.g gVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("tryEnableOpenMaterialsForCurrentMaterial", "com.tencent.mm.plugin.sns.ui.sheet.SnsOnlineVideoActivityOpenMaterials");
        kotlin.jvm.internal.o.g(snsOnlineVideoActivity, "<this>");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentMaterialInfo", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        java.lang.String g76 = snsOnlineVideoActivity.g7();
        if (android.text.TextUtils.isEmpty(g76)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentMaterialInfo", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            gVar = null;
        } else {
            java.util.Objects.requireNonNull(g76);
            gVar = new wd4.g(com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel.b(g76, "mp4"), bi1.g.SNS_VIDEO);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentMaterialInfo", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        }
        if (gVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandOpenMaterials_SnsOnlineVideoActivity", "tryEnableOpenMaterialsForCurrentMaterial, currentMaterialInfo is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryEnableOpenMaterialsForCurrentMaterial", "com.tencent.mm.plugin.sns.ui.sheet.SnsOnlineVideoActivityOpenMaterials");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandOpenMaterials_SnsOnlineVideoActivity", "tryEnableOpenMaterialsForCurrentMaterial, currentMaterialInfo: " + gVar);
        kotlinx.coroutines.l.d(v65.m.b(snsOnlineVideoActivity), null, null, new wd4.b3(snsOnlineVideoActivity, gVar, null), 3, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryEnableOpenMaterialsForCurrentMaterial", "com.tencent.mm.plugin.sns.ui.sheet.SnsOnlineVideoActivityOpenMaterials");
    }
}
