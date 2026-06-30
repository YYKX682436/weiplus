package s34;

/* loaded from: classes4.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f402679a;

    public j1(java.lang.String str) {
        this.f402679a = str;
    }

    public static final s34.j1 b(java.util.Map map, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.HeadWeWorkProfileInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.HeadWeWorkProfileInfo$Companion");
        s34.j1 j1Var = null;
        if (map == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.HeadWeWorkProfileInfo$Companion");
        } else if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.HeadWeWorkProfileInfo$Companion");
        } else if (map.containsKey(str)) {
            java.lang.String str2 = (java.lang.String) map.get(str.concat(".weWorkTailName"));
            if (str2 == null) {
                str2 = "";
            }
            j1Var = new s34.j1(str2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.HeadWeWorkProfileInfo$Companion");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.HeadWeWorkProfileInfo$Companion");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.HeadWeWorkProfileInfo");
        return j1Var;
    }

    public final java.lang.String a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWeWorkTailName", "com.tencent.mm.plugin.sns.ad.adxml.HeadWeWorkProfileInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWeWorkTailName", "com.tencent.mm.plugin.sns.ad.adxml.HeadWeWorkProfileInfo");
        return this.f402679a;
    }
}
