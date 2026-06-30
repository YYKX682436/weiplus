package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes3.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f166126a;

    @za4.l1(flag = 2, resType = 2)
    private final java.util.List<java.lang.String> imageUrls;

    public s0(java.util.List imageUrls, java.lang.String productDesc) {
        kotlin.jvm.internal.o.g(imageUrls, "imageUrls");
        kotlin.jvm.internal.o.g(productDesc, "productDesc");
        this.imageUrls = imageUrls;
        this.f166126a = productDesc;
    }

    public static final com.tencent.mm.plugin.sns.storage.s0 b(java.util.Map map, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.storage.AdMultiProductsInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.storage.AdMultiProductsInfo$Companion");
        com.tencent.mm.plugin.sns.storage.s0 s0Var = null;
        if (map == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.AdMultiProductsInfo$Companion");
        } else if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.AdMultiProductsInfo$Companion");
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.String concat = str.concat(".imageUrl");
            int i17 = 0;
            while (true) {
                if (i17 >= 3) {
                    break;
                }
                java.lang.String str2 = (java.lang.String) map.get(concat + (i17 != 0 ? java.lang.String.valueOf(i17) : ""));
                java.lang.String str3 = str2 != null ? str2 : "";
                if (!r26.n0.N(str3)) {
                    arrayList.add(str3);
                }
                i17++;
            }
            java.lang.String str4 = (java.lang.String) map.get(str.concat(".productDesc"));
            com.tencent.mm.plugin.sns.storage.s0 s0Var2 = new com.tencent.mm.plugin.sns.storage.s0(arrayList, str4 != null ? str4 : "");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.AdMultiProductsInfo$Companion");
            s0Var = s0Var2;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.AdMultiProductsInfo");
        return s0Var;
    }

    public final java.util.List a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getImageUrls", "com.tencent.mm.plugin.sns.storage.AdMultiProductsInfo");
        java.util.List<java.lang.String> list = this.imageUrls;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getImageUrls", "com.tencent.mm.plugin.sns.storage.AdMultiProductsInfo");
        return list;
    }
}
