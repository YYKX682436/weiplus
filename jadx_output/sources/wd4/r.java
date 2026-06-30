package wd4;

/* loaded from: classes4.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final wd4.r f445015a = new wd4.r();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f445016b = jz5.h.b(wd4.l.f444946d);

    public static final wd4.g a(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, r45.jj4 jj4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildMaterialInfo", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials");
        if (snsInfo == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandOpenMaterials", "buildMaterialInfo, snsInfo is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildMaterialInfo", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials");
            return null;
        }
        if (jj4Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandOpenMaterials", "buildMaterialInfo, mediaObj is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildMaterialInfo", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials");
            return null;
        }
        boolean e17 = wd4.x0.e(snsInfo);
        java.lang.String c17 = wd4.x0.c(e17, jj4Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandOpenMaterials", "buildMaterialInfo, isImage: " + e17 + ", mediaPath: " + c17);
        wd4.g gVar = new wd4.g(com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel.b(c17, e17 ? "jpg" : "mp4"), e17 ? bi1.g.SNS_IMAGE : bi1.g.SNS_VIDEO);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildMaterialInfo", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials");
        return gVar;
    }

    public static /* synthetic */ java.lang.Object d(wd4.r rVar, wd4.h hVar, java.util.List list, java.util.List list2, java.util.List list3, yz5.a aVar, kotlin.coroutines.Continuation continuation, int i17, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("tryEnable$default", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials");
        java.lang.Object c17 = rVar.c(hVar, list, list2, list3, (i17 & 16) != 0 ? null : aVar, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryEnable$default", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials");
        return c17;
    }

    public final wd4.a b(com.tencent.mm.plugin.appbrand.service.k5 k5Var, wd4.h hVar, java.util.List list) {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkConditions", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        boolean z18 = true;
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                wd4.e eVar = (wd4.e) it.next();
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandOpenMaterials", "checkConditions, condition: " + eVar.getName());
                if (eVar instanceof wd4.d) {
                    z17 = ((wd4.q) ((wd4.d) eVar)).c(k5Var, hVar);
                } else {
                    if (!(eVar instanceof wd4.c)) {
                        jz5.j jVar = new jz5.j();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkConditions", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials");
                        throw jVar;
                    }
                    java.lang.Boolean a17 = ((wd4.c) eVar).a(k5Var, hVar);
                    if (kotlin.jvm.internal.o.b(java.lang.Boolean.FALSE, a17)) {
                        z17 = false;
                    } else {
                        if (a17 == null) {
                            arrayList.add(eVar);
                        }
                        z17 = true;
                    }
                }
                if (!z17) {
                    z18 = false;
                    break;
                }
            }
        }
        wd4.a aVar = new wd4.a(z18, arrayList);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkConditions", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials");
        return aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0039  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(wd4.h r34, java.util.List r35, java.util.List r36, java.util.List r37, yz5.a r38, kotlin.coroutines.Continuation r39) {
        /*
            Method dump skipped, instructions count: 762
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wd4.r.c(wd4.h, java.util.List, java.util.List, java.util.List, yz5.a, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
