package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f165966a = new java.util.ArrayList();

    public e(java.util.Map map) {
        java.lang.String str;
        int i17 = 0;
        while (true) {
            java.lang.String str2 = ".ADInfo.adActionExt.adVoteInfoExt.voteItemList.voteResultInfo";
            if (i17 != 0) {
                str2 = ".ADInfo.adActionExt.adVoteInfoExt.voteItemList.voteResultInfo" + i17;
            }
            java.lang.String str3 = (java.lang.String) map.get(str2 + ".id");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            str3 = str3 == null ? "" : str3;
            if (android.text.TextUtils.isEmpty(str3)) {
                return;
            }
            com.tencent.mm.plugin.sns.storage.f fVar = new com.tencent.mm.plugin.sns.storage.f();
            fVar.f165973a = str3;
            fVar.f165974b = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str2 + ".scoring"), 0);
            com.tencent.mm.sdk.platformtools.t8.C1((java.lang.String) map.get(str2 + ".friends"));
            java.lang.String str4 = str2 + ".friendsList.userName";
            int i18 = 0;
            while (true) {
                if (i18 == 0) {
                    str = str4;
                } else {
                    str = str4 + i18;
                }
                java.lang.String str5 = (java.lang.String) map.get(str);
                str5 = str5 == null ? "" : str5;
                if (android.text.TextUtils.isEmpty(str5)) {
                    break;
                }
                fVar.f165975c.add(str5);
                i18++;
            }
            this.f165966a.add(fVar);
            i17++;
        }
    }

    public com.tencent.mm.plugin.sns.storage.f a(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getResultInfoById", "com.tencent.mm.plugin.sns.storage.ADInfo$AdVoteInfoExt");
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getResultInfoById", "com.tencent.mm.plugin.sns.storage.ADInfo$AdVoteInfoExt");
            return null;
        }
        java.util.Iterator it = this.f165966a.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.sns.storage.f fVar = (com.tencent.mm.plugin.sns.storage.f) it.next();
            if (str.equals(fVar.f165973a)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getResultInfoById", "com.tencent.mm.plugin.sns.storage.ADInfo$AdVoteInfoExt");
                return fVar;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getResultInfoById", "com.tencent.mm.plugin.sns.storage.ADInfo$AdVoteInfoExt");
        return null;
    }

    public e() {
    }
}
