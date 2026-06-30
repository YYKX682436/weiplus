package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f166039a = new java.util.LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public s34.p0 f166040b = null;

    /* renamed from: c, reason: collision with root package name */
    public s34.p0 f166041c = null;

    /* renamed from: d, reason: collision with root package name */
    public s34.p0 f166042d = null;

    public com.tencent.mm.plugin.sns.storage.l a(java.lang.String str, java.util.Map map, java.lang.String str2) {
        java.lang.String str3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.storage.ADXml$AdFeedbackInfo");
        java.lang.String str4 = str2 + ".adxml.feedbackInfo.feedbackList.item";
        int i17 = 0;
        while (true) {
            if (i17 > 0) {
                str3 = str4 + i17;
            } else {
                str3 = str4;
            }
            java.lang.String str5 = str3 + ".url";
            if (map.get(str5) == null || ((java.lang.String) map.get(str5)).length() <= 0) {
                break;
            }
            com.tencent.mm.plugin.sns.storage.m mVar = new com.tencent.mm.plugin.sns.storage.m();
            java.lang.String str6 = (java.lang.String) map.get(str5);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str6 == null) {
                str6 = "";
            }
            mVar.f166060d = str6;
            java.lang.String str7 = (java.lang.String) map.get(str3 + ".Wording.zh");
            if (str7 == null) {
                str7 = "";
            }
            mVar.f166057a = str7;
            java.lang.String str8 = (java.lang.String) map.get(str3 + ".Wording.en");
            if (str8 == null) {
                str8 = "";
            }
            mVar.f166058b = str8;
            java.lang.String str9 = (java.lang.String) map.get(str3 + ".Wording.tw");
            mVar.f166059c = str9 != null ? str9 : "";
            if (mVar.f166057a.length() + mVar.f166058b.length() + mVar.f166059c.length() > 0) {
                ((java.util.LinkedList) this.f166039a).add(mVar);
            }
            i17++;
        }
        this.f166040b = s34.p0.a(map, str2 + ".adxml.feedbackInfo.receivedReasonClickAction");
        this.f166041c = s34.p0.a(map, str2 + ".adxml.feedbackInfo.likedAdsClickAction");
        this.f166042d = s34.p0.a(map, str2 + ".adxml.feedbackInfo.reasonToastClickAction");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.ADXml$AdFeedbackInfo");
        return this;
    }
}
