package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f166101a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f166102b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f166103c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f166104d = new java.util.ArrayList();

    public void a(java.lang.String str, java.util.Map map, java.lang.String str2) {
        java.lang.String str3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.storage.ADXml$AdTurnInfo");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String str4 = (java.lang.String) map.get(str2 + ".adxml.adTurnActionExtWeApp.appUserName");
        if (!android.text.TextUtils.isEmpty(str4)) {
            this.f166101a = str4;
            this.f166103c = (java.lang.String) map.get(str2 + ".adxml.adTurnActionExtWeApp.appVersion");
            this.f166102b = (java.lang.String) map.get(str2 + ".adxml.adTurnActionExtWeApp.relativePagePath");
        }
        java.lang.String str5 = str2 + ".adxml.adTurnInfo.materialInfo";
        int i17 = 0;
        while (true) {
            if (i17 > 0) {
                str3 = str5 + i17;
            } else {
                str3 = str5;
            }
            if (map.get(str3 + ".displayType") == null) {
                break;
            }
            if (((java.lang.String) map.get(str3 + ".displayType")).length() <= 0) {
                break;
            }
            com.tencent.mm.plugin.sns.storage.w wVar = new com.tencent.mm.plugin.sns.storage.w();
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mm.sdk.platformtools.t8.C1((java.lang.String) map.get(str3 + ".displayType"));
            ((java.util.ArrayList) this.f166104d).add(wVar);
            i17++;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.ADXml$AdTurnInfo");
    }
}
