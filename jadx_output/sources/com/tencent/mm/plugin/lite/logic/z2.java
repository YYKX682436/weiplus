package com.tencent.mm.plugin.lite.logic;

/* loaded from: classes14.dex */
public final class z2 {
    public z2(kotlin.jvm.internal.i iVar) {
    }

    public final java.util.ArrayList a() {
        java.lang.String[] strArr;
        java.util.Collection collection;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            com.tencent.liteapp.storage.WxaLiteAppBaselibInfo u17 = com.tencent.mm.plugin.lite.logic.g1.s().u(null);
            if (u17 != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppUDRCheckService", "configCheckParameters baselibInfo: %s", u17);
                java.lang.String baseLibVersionByPath = com.tencent.mm.plugin.lite.LiteAppCenter.getBaseLibVersionByPath(u17.path);
                if (baseLibVersionByPath != null) {
                    java.util.List g17 = new r26.t("\\.").g(baseLibVersionByPath, 0);
                    if (!g17.isEmpty()) {
                        java.util.ListIterator listIterator = g17.listIterator(g17.size());
                        while (listIterator.hasPrevious()) {
                            if (!(((java.lang.String) listIterator.previous()).length() == 0)) {
                                collection = kz5.n0.K0(g17, listIterator.nextIndex() + 1);
                                break;
                            }
                        }
                    }
                    collection = kz5.p0.f313996d;
                    strArr = (java.lang.String[]) collection.toArray(new java.lang.String[0]);
                } else {
                    strArr = null;
                }
                e06.k kVar = strArr != null ? new e06.k(0, strArr.length - 1) : null;
                kotlin.jvm.internal.o.d(kVar);
                int i17 = kVar.f246209d;
                int i18 = kVar.f246210e;
                long j17 = 0;
                if (i17 <= i18) {
                    while (true) {
                        j17 += java.lang.Long.parseLong(strArr[i17]) << (((strArr.length - i17) - 1) * 10);
                        if (i17 == i18) {
                            break;
                        }
                        i17++;
                    }
                }
                com.tencent.wechat.aff.udr.v vVar = new com.tencent.wechat.aff.udr.v();
                vVar.d("baselib_version");
                vVar.f217581g = j17;
                vVar.f217584m[4] = true;
                vVar.e(2);
                arrayList.add(vVar);
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppUDRCheckService", "getParameter: %s", arrayList);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.LiteApp.LiteAppUDRCheckService", "baselib info is null.");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteApp.LiteAppUDRCheckService", e17.toString());
        }
        return arrayList;
    }
}
