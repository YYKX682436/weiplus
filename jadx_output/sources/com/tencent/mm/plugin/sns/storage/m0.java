package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f166061a;

    @za4.k1(resType = 5)
    private final com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo clickActionInfo;

    @za4.l1
    private final java.util.List<com.tencent.mm.plugin.sns.storage.g1> gridItems;

    public m0(com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo clickActionInfo, java.util.List gridItems, int i17) {
        kotlin.jvm.internal.o.g(clickActionInfo, "clickActionInfo");
        kotlin.jvm.internal.o.g(gridItems, "gridItems");
        this.clickActionInfo = clickActionInfo;
        this.gridItems = gridItems;
        this.f166061a = i17;
    }

    public static final com.tencent.mm.plugin.sns.storage.m0 d(java.util.Map map, java.lang.String str) {
        com.tencent.mm.plugin.sns.storage.g1 g1Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.storage.AdCombinedGridInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.storage.AdCombinedGridInfo$Companion");
        com.tencent.mm.plugin.sns.storage.m0 m0Var = null;
        if (map != null) {
            if (str != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.String concat = str.concat(".gridItems.item");
                int i17 = 0;
                while (true) {
                    if (i17 >= 3) {
                        com.tencent.mm.plugin.sns.storage.m0 m0Var2 = new com.tencent.mm.plugin.sns.storage.m0(com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo.f(map, str.concat(".clickActionInfo")), arrayList, com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(str.concat(".displayMode")), 0));
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.AdCombinedGridInfo$Companion");
                        m0Var = m0Var2;
                        break;
                    }
                    java.lang.String str2 = concat + (i17 != 0 ? java.lang.String.valueOf(i17) : "");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.storage.GridItemInfo$Companion");
                    r45.jj4 a17 = com.tencent.mm.plugin.sns.storage.k1.f166036a.a(str2 + ".media", map);
                    if (a17 == null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.GridItemInfo$Companion");
                        g1Var = null;
                    } else {
                        a17.N = true;
                        g1Var = new com.tencent.mm.plugin.sns.storage.g1(a17, com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo.f(map, str2 + ".clickActionInfo"));
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.GridItemInfo$Companion");
                    }
                    if (g1Var == null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.AdCombinedGridInfo$Companion");
                        break;
                    }
                    arrayList.add(g1Var);
                    i17++;
                }
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.AdCombinedGridInfo$Companion");
            }
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.AdCombinedGridInfo$Companion");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.AdCombinedGridInfo");
        return m0Var;
    }

    public final com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getClickActionInfo", "com.tencent.mm.plugin.sns.storage.AdCombinedGridInfo");
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo = this.clickActionInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getClickActionInfo", "com.tencent.mm.plugin.sns.storage.AdCombinedGridInfo");
        return adClickActionInfo;
    }

    public final int b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDisplayMode", "com.tencent.mm.plugin.sns.storage.AdCombinedGridInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDisplayMode", "com.tencent.mm.plugin.sns.storage.AdCombinedGridInfo");
        return this.f166061a;
    }

    public final java.util.List c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGridItems", "com.tencent.mm.plugin.sns.storage.AdCombinedGridInfo");
        java.util.List<com.tencent.mm.plugin.sns.storage.g1> list = this.gridItems;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGridItems", "com.tencent.mm.plugin.sns.storage.AdCombinedGridInfo");
        return list;
    }
}
