package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f166123a = "";

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f166124b = "";

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f166125c = new java.util.ArrayList();

    public s(com.tencent.mm.plugin.sns.storage.ADXml aDXml) {
    }

    public java.lang.String a(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDefaultTitle", "com.tencent.mm.plugin.sns.storage.ADXml$AdVoteInfo");
        if (i17 >= 0) {
            java.util.ArrayList arrayList = this.f166125c;
            if (i17 < arrayList.size()) {
                java.lang.String str = ((com.tencent.mm.plugin.sns.storage.t) arrayList.get(i17)).f166134a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDefaultTitle", "com.tencent.mm.plugin.sns.storage.ADXml$AdVoteInfo");
                return str;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDefaultTitle", "com.tencent.mm.plugin.sns.storage.ADXml$AdVoteInfo");
        return "";
    }

    public java.lang.String b(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSelectedTitle", "com.tencent.mm.plugin.sns.storage.ADXml$AdVoteInfo");
        if (i17 >= 0) {
            java.util.ArrayList arrayList = this.f166125c;
            if (i17 < arrayList.size()) {
                java.lang.String str = ((com.tencent.mm.plugin.sns.storage.t) arrayList.get(i17)).f166138e;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSelectedTitle", "com.tencent.mm.plugin.sns.storage.ADXml$AdVoteInfo");
                return str;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSelectedTitle", "com.tencent.mm.plugin.sns.storage.ADXml$AdVoteInfo");
        return "";
    }
}
