package wd4;

/* loaded from: classes4.dex */
public abstract class d2 {

    /* renamed from: a, reason: collision with root package name */
    public static java.util.WeakHashMap f444892a;

    public static final void a(com.tencent.mm.plugin.sns.ui.SnsGalleryUI snsGalleryUI) {
        com.tencent.mm.ui.widget.dialog.k0 d17;
        wd4.g a17;
        java.util.HashSet hashSet;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("tryEnableOpenMaterialsForCurrentMaterial", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials");
        kotlin.jvm.internal.o.g(snsGalleryUI, "<this>");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBottomSheet", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        com.tencent.mm.plugin.sns.ui.c4 f76 = snsGalleryUI.f7();
        if (f76 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBottomSheet", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
            d17 = null;
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBottomSheet", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
            wd4.l1 l1Var = f76.f168091h;
            if (l1Var == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.GalleryTitleManager", "getBottomSheet, mShareSheet is null");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBottomSheet", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                d17 = null;
            } else {
                d17 = l1Var.d();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBottomSheet", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBottomSheet", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        }
        if (d17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandOpenMaterials_SnsGalleryUI", "tryEnableOpenMaterialsForCurrentMaterial, bottomSheet is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryEnableOpenMaterialsForCurrentMaterial", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentMaterialInfo", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        com.tencent.mm.plugin.sns.ui.c4 f77 = snsGalleryUI.f7();
        if (f77 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentMaterialInfo", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
            a17 = null;
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentMaterialInfo", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
            a17 = wd4.r.a(f77.f168094n, f77.f168096p);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentMaterialInfo", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentMaterialInfo", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        }
        if (a17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandOpenMaterials_SnsGalleryUI", "tryEnableOpenMaterialsForCurrentMaterial, currentMaterialInfo is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryEnableOpenMaterialsForCurrentMaterial", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials");
            return;
        }
        int hashCode = d17.hashCode() + a17.hashCode();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandOpenMaterials_SnsGalleryUI", "tryEnableOpenMaterialsForCurrentMaterial, currentMaterialInfo: " + a17 + ", token: " + hashCode);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isTokenInProgress", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials");
        java.util.WeakHashMap weakHashMap = f444892a;
        boolean contains = (weakHashMap == null || (hashSet = (java.util.HashSet) weakHashMap.get(snsGalleryUI)) == null) ? false : hashSet.contains(java.lang.Integer.valueOf(hashCode));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isTokenInProgress", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials");
        if (contains) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandOpenMaterials_SnsGalleryUI", "tryEnableOpenMaterialsForCurrentMaterial, duplicate");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryEnableOpenMaterialsForCurrentMaterial", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("markTokenInProgress", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandOpenMaterials_SnsGalleryUI", "markTokenInProgress, token: " + hashCode);
        java.util.WeakHashMap weakHashMap2 = f444892a;
        if (weakHashMap2 == null) {
            weakHashMap2 = new java.util.WeakHashMap();
            f444892a = weakHashMap2;
        }
        java.lang.Object obj = weakHashMap2.get(snsGalleryUI);
        if (obj == null) {
            obj = new java.util.HashSet();
            weakHashMap2.put(snsGalleryUI, obj);
        }
        ((java.util.HashSet) obj).add(java.lang.Integer.valueOf(hashCode));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("markTokenInProgress", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials");
        ((kotlinx.coroutines.c3) kotlinx.coroutines.l.d(v65.m.b(snsGalleryUI), null, null, new wd4.b2(snsGalleryUI, a17, d17, null), 3, null)).p(new wd4.c2(snsGalleryUI, hashCode));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryEnableOpenMaterialsForCurrentMaterial", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials");
    }
}
