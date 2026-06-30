package s34;

/* loaded from: classes4.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public android.util.SparseArray f402717a;

    public static s34.n a(java.util.Map map, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdDynamicUpdateInfo");
        try {
            s34.n b17 = b(map, str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdDynamicUpdateInfo");
            return b17;
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("AdDynamicUpdateInfo", "parse the update info failed!!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdDynamicUpdateInfo");
            return null;
        }
    }

    public static s34.n b(java.util.Map map, java.lang.String str) {
        s34.m a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseInternal", "com.tencent.mm.plugin.sns.ad.adxml.AdDynamicUpdateInfo");
        s34.n nVar = null;
        if (a84.b0.c(map)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseInternal", "com.tencent.mm.plugin.sns.ad.adxml.AdDynamicUpdateInfo");
            return null;
        }
        android.util.SparseArray sparseArray = null;
        for (int i17 = 0; i17 < 20; i17++) {
            if (i17 == 0) {
                a17 = s34.m.a(map, str + ".action");
                if (a17 != null) {
                    sparseArray = new android.util.SparseArray();
                }
            } else {
                a17 = s34.m.a(map, str + ".action" + i17);
            }
            if (a17 == null || sparseArray == null) {
                break;
            }
            sparseArray.put(a17.f402706a, a17);
        }
        if (sparseArray != null && sparseArray.size() > 0) {
            nVar = new s34.n();
            nVar.f402717a = sparseArray;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseInternal", "com.tencent.mm.plugin.sns.ad.adxml.AdDynamicUpdateInfo");
        return nVar;
    }
}
