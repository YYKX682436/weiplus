package com.tencent.mm.plugin.scanner.model;

/* loaded from: classes15.dex */
public abstract class n0 {
    public static java.util.LinkedList a(java.util.List list) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (int i17 = 0; i17 < list.size(); i17++) {
            java.util.LinkedList linkedList2 = ((com.tencent.mm.plugin.scanner.model.b) list.get(i17)).f158816f;
            for (int i18 = 0; i18 < linkedList2.size(); i18++) {
                com.tencent.mm.plugin.scanner.model.a aVar = (com.tencent.mm.plugin.scanner.model.a) linkedList2.get(i18);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(aVar.f158800t)) {
                    linkedList.add(aVar.f158800t);
                }
            }
        }
        return linkedList;
    }

    public static boolean b(java.util.List list, java.util.Map map) {
        if (map == null || map.size() <= 0 || list == null) {
            return false;
        }
        boolean z17 = false;
        for (int i17 = 0; i17 < list.size(); i17++) {
            if (list.get(i17) != null) {
                java.util.LinkedList linkedList = ((com.tencent.mm.plugin.scanner.model.b) list.get(i17)).f158816f;
                boolean z18 = false;
                for (int i18 = 0; i18 < linkedList.size(); i18++) {
                    com.tencent.mm.plugin.scanner.model.a aVar = (com.tencent.mm.plugin.scanner.model.a) linkedList.get(i18);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(aVar.f158800t)) {
                        com.tencent.mm.plugin.scanner.model.a aVar2 = (com.tencent.mm.plugin.scanner.model.a) map.get(aVar.f158800t);
                        if (aVar2 != null) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.ProductUpdateLogic", "Updating action , info: key=" + aVar.f158800t);
                            linkedList.remove(i18);
                            linkedList.add(i18, aVar2);
                            z17 = true;
                            z18 = true;
                        }
                    } else {
                        z18 = true;
                    }
                }
                ((com.tencent.mm.plugin.scanner.model.b) list.get(i17)).f158815e = z18;
            }
        }
        return z17;
    }
}
