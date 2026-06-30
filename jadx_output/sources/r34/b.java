package r34;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: m, reason: collision with root package name */
    public static final r34.a f368984m = new r34.a(null);

    /* renamed from: a, reason: collision with root package name */
    public long f368985a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f368986b;

    /* renamed from: c, reason: collision with root package name */
    public long f368987c;

    /* renamed from: d, reason: collision with root package name */
    public final int f368988d;

    /* renamed from: e, reason: collision with root package name */
    public int f368989e;

    /* renamed from: f, reason: collision with root package name */
    public final int f368990f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f368991g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f368992h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f368993i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f368994j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f368995k;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.List f368996l;

    public b(long j17, java.lang.String str, long j18, int i17, int i18, int i19, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z17, boolean z18, java.util.List list, int i27, kotlin.jvm.internal.i iVar) {
        long j19 = (i27 & 1) != 0 ? 0L : j17;
        java.lang.String snsIdStr = (i27 & 2) != 0 ? "" : str;
        long j27 = (i27 & 4) == 0 ? j18 : 0L;
        int i28 = (i27 & 8) != 0 ? 0 : i17;
        int i29 = (i27 & 16) != 0 ? -1 : i18;
        int i37 = (i27 & 32) != 0 ? 0 : i19;
        java.lang.String uxInfo = (i27 & 64) != 0 ? "" : str2;
        java.lang.String aboveSnsId = (i27 & 128) != 0 ? "" : str3;
        java.lang.String belowSnsId = (i27 & 256) == 0 ? str4 : "";
        boolean z19 = (i27 & 512) != 0 ? false : z17;
        boolean z27 = (i27 & 1024) == 0 ? z18 : false;
        java.util.List subAdList = (i27 & 2048) != 0 ? new java.util.ArrayList() : list;
        kotlin.jvm.internal.o.g(snsIdStr, "snsIdStr");
        kotlin.jvm.internal.o.g(uxInfo, "uxInfo");
        kotlin.jvm.internal.o.g(aboveSnsId, "aboveSnsId");
        kotlin.jvm.internal.o.g(belowSnsId, "belowSnsId");
        kotlin.jvm.internal.o.g(subAdList, "subAdList");
        this.f368985a = j19;
        this.f368986b = snsIdStr;
        this.f368987c = j27;
        this.f368988d = i28;
        this.f368989e = i29;
        this.f368990f = i37;
        this.f368991g = uxInfo;
        this.f368992h = aboveSnsId;
        this.f368993i = belowSnsId;
        this.f368994j = z19;
        this.f368995k = z27;
        this.f368996l = subAdList;
    }

    public final java.lang.String a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAboveSnsId", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord");
        java.lang.String str = this.f368992h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAboveSnsId", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord");
        return str;
    }

    public final int b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdPosAbs", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord");
        int i17 = this.f368989e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdPosAbs", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord");
        return i17;
    }

    public final java.lang.String c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBelowSnsId", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord");
        java.lang.String str = this.f368993i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBelowSnsId", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord");
        return str;
    }

    public final long d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCreateTime", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord");
        long j17 = this.f368987c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCreateTime", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord");
        return j17;
    }

    public final long e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsId", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord");
        long j17 = this.f368985a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsId", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord");
        return j17;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord");
        boolean z17 = (obj instanceof r34.b) && this.f368985a == ((r34.b) obj).f368985a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord");
        return z17;
    }

    public final java.lang.String f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsIdStr", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord");
        java.lang.String str = this.f368986b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsIdStr", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord");
        return str;
    }

    public final void g(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAboveSnsId", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord");
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.f368992h = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAboveSnsId", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord");
    }

    public final void h(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAdPosAbs", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord");
        this.f368989e = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAdPosAbs", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord");
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord");
        int hashCode = java.lang.Long.hashCode(this.f368985a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord");
        return hashCode;
    }

    public final void i(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBelowSnsId", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord");
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.f368993i = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBelowSnsId", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord");
    }

    public final void j(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsId", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord");
        this.f368985a = j17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsId", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord");
    }

    public final org.json.JSONObject k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toJson", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("snsId", this.f368986b);
        jSONObject.put("createTime", this.f368987c);
        jSONObject.put("exposeCnt", this.f368988d);
        jSONObject.put("adPosAbs", this.f368989e);
        jSONObject.put("adPosRelative", this.f368990f);
        jSONObject.put("isExpired", this.f368994j);
        jSONObject.put("aboveSnsId", this.f368992h);
        jSONObject.put("belowSnsId", this.f368993i);
        jSONObject.put("uxInfo", this.f368991g);
        jSONObject.put("isCollectedAd", this.f368995k);
        java.util.List list = this.f368996l;
        if (!list.isEmpty()) {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(((s34.w1) it.next()).a());
            }
            jSONObject.put("subAdList", jSONArray);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toJson", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord");
        return jSONObject;
    }

    public final org.json.JSONObject l() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toStorageJson", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("snsId", this.f368985a);
        jSONObject.put("createTime", this.f368987c);
        jSONObject.put("aboveSnsId", this.f368992h);
        jSONObject.put("belowSnsId", this.f368993i);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toStorageJson", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord");
        return jSONObject;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord");
        java.lang.String str = "[id=" + this.f368986b + ", topId=" + this.f368992h + ", belowId=" + this.f368993i + ", time=" + this.f368987c + ']';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord");
        return str;
    }
}
