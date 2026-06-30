package s34;

/* loaded from: classes4.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f402718a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f402719b;

    public n0(java.lang.String str, java.lang.String str2, kotlin.jvm.internal.i iVar) {
        this.f402718a = str;
        this.f402719b = str2;
    }

    public static final s34.n0 b(java.util.Map map, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdHeadLivingInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdHeadLivingInfo$Companion");
        s34.n0 n0Var = null;
        if (map == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdHeadLivingInfo$Companion");
        } else if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdHeadLivingInfo$Companion");
        } else {
            java.lang.String str2 = (java.lang.String) map.get(str.concat(".finderUsername"));
            if (str2 == null) {
                str2 = "";
            }
            java.lang.String str3 = (java.lang.String) map.get(str.concat(".finderLiveId"));
            s34.n0 n0Var2 = new s34.n0(str2, str3 != null ? str3 : "", null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdHeadLivingInfo$Companion");
            n0Var = n0Var2;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdHeadLivingInfo");
        return n0Var;
    }

    public final boolean a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isValid", "com.tencent.mm.plugin.sns.ad.adxml.AdHeadLivingInfo");
        boolean z17 = false;
        java.lang.String str = this.f402718a;
        if (!(str == null || str.length() == 0)) {
            java.lang.String str2 = this.f402719b;
            if (!(str2 == null || str2.length() == 0)) {
                z17 = true;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValid", "com.tencent.mm.plugin.sns.ad.adxml.AdHeadLivingInfo");
        return z17;
    }
}
