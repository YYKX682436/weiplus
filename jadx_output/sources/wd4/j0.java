package wd4;

/* loaded from: classes4.dex */
public abstract class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static java.util.WeakHashMap f444936a;

    public static final void a(com.tencent.mm.plugin.sns.ui.FlipView flipView) {
        java.util.HashSet hashSet;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("tryEnableOpenMaterialsForCurrentMaterial", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials");
        kotlin.jvm.internal.o.g(flipView, "<this>");
        com.tencent.mm.ui.widget.dialog.k0 bottomSheet = flipView.getBottomSheet();
        if (bottomSheet == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandOpenMaterials_FlipView", "tryEnableOpenMaterialsForCurrentMaterial, bottomSheet is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryEnableOpenMaterialsForCurrentMaterial", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials");
            return;
        }
        wd4.g currentMaterialInfo = flipView.getCurrentMaterialInfo();
        if (currentMaterialInfo == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandOpenMaterials_FlipView", "tryEnableOpenMaterialsForCurrentMaterial, currentMaterialInfo is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryEnableOpenMaterialsForCurrentMaterial", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials");
            return;
        }
        int hashCode = bottomSheet.hashCode() + currentMaterialInfo.hashCode();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandOpenMaterials_FlipView", "tryEnableOpenMaterialsForCurrentMaterial, currentMaterialInfo: " + currentMaterialInfo + ", token: " + hashCode);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isTokenInProgress", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials");
        java.util.WeakHashMap weakHashMap = f444936a;
        boolean contains = (weakHashMap == null || (hashSet = (java.util.HashSet) weakHashMap.get(flipView)) == null) ? false : hashSet.contains(java.lang.Integer.valueOf(hashCode));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isTokenInProgress", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials");
        if (contains) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandOpenMaterials_FlipView", "tryEnableOpenMaterialsForCurrentMaterial, duplicate");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryEnableOpenMaterialsForCurrentMaterial", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("markTokenInProgress", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandOpenMaterials_FlipView", "markTokenInProgress, token: " + hashCode);
        java.util.WeakHashMap weakHashMap2 = f444936a;
        if (weakHashMap2 == null) {
            weakHashMap2 = new java.util.WeakHashMap();
            f444936a = weakHashMap2;
        }
        java.lang.Object obj = weakHashMap2.get(flipView);
        if (obj == null) {
            obj = new java.util.HashSet();
            weakHashMap2.put(flipView, obj);
        }
        ((java.util.HashSet) obj).add(java.lang.Integer.valueOf(hashCode));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("markTokenInProgress", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials");
        ((kotlinx.coroutines.c3) kotlinx.coroutines.l.d(v65.m.a(flipView), null, null, new wd4.h0(flipView, currentMaterialInfo, bottomSheet, null), 3, null)).p(new wd4.i0(flipView, hashCode));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryEnableOpenMaterialsForCurrentMaterial", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials");
    }
}
