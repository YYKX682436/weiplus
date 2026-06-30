package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f165955a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f165956b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f165957c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f165958d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f165959e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f165960f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f165961g;

    public d() {
        this.f165955a = 0;
        this.f165956b = new java.util.ArrayList();
        this.f165957c = new java.util.HashMap();
        this.f165958d = "";
        this.f165959e = "";
        this.f165960f = "";
        this.f165961g = false;
    }

    public java.util.List a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getReasonList", "com.tencent.mm.plugin.sns.storage.ADInfo$AdUnlikeInfo");
        java.lang.String f17 = com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a);
        if (!"zh_CN".equals(f17) && !"zh_TW".equals(f17) && !"zh_HK".equals(f17)) {
            f17 = "en";
        }
        java.util.Map map = this.f165957c;
        if (!((java.util.HashMap) map).containsKey(f17)) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = ((java.util.ArrayList) this.f165956b).iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.sns.storage.c cVar = (com.tencent.mm.plugin.sns.storage.c) it.next();
                if ("zh_CN".equals(f17) && !com.tencent.mm.sdk.platformtools.t8.K0(cVar.f165942a)) {
                    arrayList.add(cVar);
                } else if (("zh_TW".equals(f17) || "zh_HK".equals(f17)) && !com.tencent.mm.sdk.platformtools.t8.K0(cVar.f165943b)) {
                    arrayList.add(cVar);
                } else if ("en".equals(f17) && !com.tencent.mm.sdk.platformtools.t8.K0(cVar.f165944c)) {
                    arrayList.add(cVar);
                }
            }
            ((java.util.HashMap) map).put(f17, arrayList);
        }
        java.util.List list = (java.util.List) ((java.util.HashMap) map).get(f17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getReasonList", "com.tencent.mm.plugin.sns.storage.ADInfo$AdUnlikeInfo");
        return list;
    }

    public d(java.util.Map map, java.lang.String str) {
        this.f165955a = 0;
        this.f165956b = new java.util.ArrayList();
        this.f165957c = new java.util.HashMap();
        this.f165958d = "";
        this.f165959e = "";
        this.f165960f = "";
        this.f165961g = false;
        java.lang.String str2 = str + ".dislikeInfo.ReasonList";
        int i17 = 0;
        while (true) {
            java.lang.String str3 = str2 + ".Reason";
            if (i17 > 0) {
                str3 = str3 + i17;
            }
            if (map.get(str3 + ".ReasonId") == null) {
                break;
            }
            java.util.List list = this.f165956b;
            java.lang.String str4 = (java.lang.String) map.get(str3 + ".Wording.zh");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            str4 = str4 == null ? "" : str4;
            java.lang.String str5 = (java.lang.String) map.get(str3 + ".Wording.tw");
            str5 = str5 == null ? "" : str5;
            java.lang.String str6 = (java.lang.String) map.get(str3 + ".Wording.en");
            if (str6 == null) {
                str6 = "";
            }
            list.add(new com.tencent.mm.plugin.sns.storage.c(str4, str5, str6, com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str3 + ".ReasonId"), 0)));
            i17++;
        }
        this.f165955a = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".dislikeInfo.unReceiveAdInterval"), 0);
        java.lang.String str7 = (java.lang.String) map.get(str + ".dislikeInfo.forbidClickReason.zh");
        this.f165958d = str7 == null ? "" : str7;
        java.lang.String str8 = (java.lang.String) map.get(str + ".dislikeInfo.forbidClickReason.tw");
        this.f165959e = str8 == null ? "" : str8;
        java.lang.String str9 = (java.lang.String) map.get(str + ".dislikeInfo.forbidClickReason.en");
        this.f165960f = str9 != null ? str9 : "";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append(".dislikeInfo.useNewStyle");
        this.f165961g = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(sb6.toString()), 0) == 1;
    }
}
