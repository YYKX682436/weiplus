package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public class r implements java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public int f166107d;

    /* renamed from: e, reason: collision with root package name */
    public int f166108e;

    /* renamed from: f, reason: collision with root package name */
    public int f166109f;

    /* renamed from: g, reason: collision with root package name */
    public int f166110g;

    /* renamed from: h, reason: collision with root package name */
    public int f166111h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f166112i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f166113m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f166114n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f166115o;

    public static com.tencent.mm.plugin.sns.storage.r a(java.util.Map map, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.storage.ADXml$AdTwistInfo");
        if (map.containsKey(str)) {
            int D1 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".twistStartTime"), 0);
            int D12 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".twistEndTime"), 0);
            int D13 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".twistDegree"), 0);
            int D14 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".coverStartTime"), 0);
            int D15 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".coverEndTime"), 0);
            if (D14 == 0) {
                D14 = D1;
            }
            if (D15 == 0) {
                D15 = D12;
            }
            if (D1 >= 0 && D12 > D1 && D15 >= D14 && D14 >= D1 && D15 <= D12 && D13 > 0) {
                int D16 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".isClockwise"), 0);
                int D17 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".showSimpleTransition"), 0);
                java.lang.String str2 = (java.lang.String) map.get(str + ".title");
                if (str2 == null) {
                    str2 = "";
                }
                java.lang.String str3 = (java.lang.String) map.get(str + ".desc");
                java.lang.String str4 = str3 != null ? str3 : "";
                com.tencent.mm.plugin.sns.storage.r rVar = new com.tencent.mm.plugin.sns.storage.r();
                rVar.f166107d = D1;
                rVar.f166108e = D12;
                rVar.f166109f = D14;
                rVar.f166110g = D15;
                rVar.f166111h = D13;
                rVar.f166113m = str2;
                rVar.f166114n = str4;
                rVar.f166112i = D16 == 1;
                rVar.f166115o = D17 == 1;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.ADXml$AdTwistInfo");
                return rVar;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.ADXml$AdTwistInfo");
        return null;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.storage.ADXml$AdTwistInfo");
        java.lang.String str = "{twistStartTime=" + this.f166107d + ", twistEndTime=" + this.f166108e + ", coverStartTime=" + this.f166109f + ", coverEndTime=" + this.f166110g + ", maxDegree=" + this.f166111h + ", isClockWise=" + this.f166112i + ", title='" + this.f166113m + "', desc='" + this.f166114n + "'}";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.storage.ADXml$AdTwistInfo");
        return str;
    }
}
