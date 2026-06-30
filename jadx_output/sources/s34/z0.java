package s34;

/* loaded from: classes4.dex */
public final class z0 {

    /* renamed from: c, reason: collision with root package name */
    public static final s34.y0 f402836c = new s34.y0(null);

    /* renamed from: a, reason: collision with root package name */
    public s34.m1 f402837a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.List f402838b;

    public static final boolean d(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAdSlideItemProductInfoValid", "com.tencent.mm.plugin.sns.ad.adxml.AdSlideItemProductInfo");
        boolean a17 = f402836c.a(snsInfo);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdSlideItemProductInfoValid", "com.tencent.mm.plugin.sns.ad.adxml.AdSlideItemProductInfo");
        return a17;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final s34.z0 e(java.util.Map r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s34.z0.e(java.util.Map, java.lang.String):s34.z0");
    }

    public final boolean a() {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkProductInfoPAGValid", "com.tencent.mm.plugin.sns.ad.adxml.AdSlideItemProductInfo");
        s34.m1 m1Var = this.f402837a;
        boolean z17 = false;
        if (m1Var != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWidth", "com.tencent.mm.plugin.sns.ad.adxml.OpeningPAGInfo");
            int i18 = m1Var.f402714c;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWidth", "com.tencent.mm.plugin.sns.ad.adxml.OpeningPAGInfo");
            if (i18 > 0) {
                s34.m1 m1Var2 = this.f402837a;
                if (m1Var2 != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHeight", "com.tencent.mm.plugin.sns.ad.adxml.OpeningPAGInfo");
                    i17 = m1Var2.f402715d;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHeight", "com.tencent.mm.plugin.sns.ad.adxml.OpeningPAGInfo");
                } else {
                    i17 = 0;
                }
                if (i17 > 0) {
                    java.lang.String[] strArr = new java.lang.String[3];
                    s34.m1 m1Var3 = this.f402837a;
                    java.lang.String str = null;
                    strArr[0] = m1Var3 != null ? m1Var3.a() : null;
                    s34.m1 m1Var4 = this.f402837a;
                    strArr[1] = m1Var4 != null ? m1Var4.b() : null;
                    s34.m1 m1Var5 = this.f402837a;
                    if (m1Var5 != null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPagMD5", "com.tencent.mm.plugin.sns.ad.adxml.OpeningPAGInfo");
                        java.lang.String str2 = m1Var5.f402713b;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPagMD5", "com.tencent.mm.plugin.sns.ad.adxml.OpeningPAGInfo");
                        str = str2;
                    }
                    strArr[2] = str;
                    if (!com.tencent.mm.sdk.platformtools.t8.N0(strArr)) {
                        z17 = true;
                    }
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkProductInfoPAGValid", "com.tencent.mm.plugin.sns.ad.adxml.AdSlideItemProductInfo");
        return z17;
    }

    public final s34.m1 b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOpeningPAGInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdSlideItemProductInfo");
        s34.m1 m1Var = this.f402837a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOpeningPAGInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdSlideItemProductInfo");
        return m1Var;
    }

    public final java.util.List c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getProductInfoList", "com.tencent.mm.plugin.sns.ad.adxml.AdSlideItemProductInfo");
        java.util.List list = this.f402838b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getProductInfoList", "com.tencent.mm.plugin.sns.ad.adxml.AdSlideItemProductInfo");
        return list;
    }
}
