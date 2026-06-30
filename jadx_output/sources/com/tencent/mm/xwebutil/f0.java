package com.tencent.mm.xwebutil;

/* loaded from: classes8.dex */
final class f0 implements com.tencent.mm.ipcinvoker.k0 {
    private f0() {
    }

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        int i17;
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        android.os.Bundle bundle = new android.os.Bundle();
        try {
            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
            if (com.tencent.mm.sdk.platformtools.t8.K0(iPCString.f68406d)) {
                i17 = 0;
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(29724, "6," + iPCString.f68406d);
                com.tencent.mars.xlog.Log.i("XWeb.MM.GetHostByNameFromHttpTask", "httpdns: start get host ip:" + iPCString.f68406d);
                tr5.z a17 = kr5.r.b().a(iPCString.f68406d);
                com.tencent.mars.xlog.Log.i("XWeb.MM.GetHostByNameFromHttpTask", "httpdns: end get host ip:" + iPCString.f68406d);
                java.lang.String[] strArr = a17.f421511f;
                if (strArr != null) {
                    int length = strArr.length;
                    int i18 = 0;
                    i17 = 0;
                    while (i18 < length) {
                        arrayList.add(strArr[i18]);
                        i18++;
                        i17 = 4;
                    }
                } else {
                    i17 = 0;
                }
                java.lang.String[] strArr2 = a17.f421509d;
                if (strArr2 != null) {
                    int length2 = strArr2.length;
                    int i19 = 0;
                    while (i19 < length2) {
                        arrayList.add(strArr2[i19]);
                        i19++;
                        i17 = 4;
                    }
                }
                java.lang.String[] strArr3 = a17.f421510e;
                if (strArr3 != null) {
                    int length3 = strArr3.length;
                    int i27 = 0;
                    while (i27 < length3) {
                        arrayList.add(strArr3[i27]);
                        i27++;
                        i17 = 4;
                    }
                }
            }
            if (arrayList.size() != 0) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(29724, "7," + iPCString.f68406d);
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(29724, "9," + iPCString.f68406d);
            }
            bundle.putStringArrayList("ipList", arrayList);
            bundle.putInt("result", i17);
            com.tencent.mars.xlog.Log.i("XWeb.MM.GetHostByNameFromHttpTask", "httpdns: host:" + iPCString.f68406d + ",result:" + i17 + ", ipList:" + arrayList);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("XWeb.MM.GetHostByNameFromHttpTask", e17, "httpdns error", new java.lang.Object[0]);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(29724, "8," + iPCString.f68406d);
        }
        return bundle;
    }
}
