package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f166150a;

    public static com.tencent.mm.plugin.sns.storage.v a(java.util.Map map, java.lang.String str) {
        java.lang.String str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.storage.ADXml$FloatWebViewInfo");
        int i17 = 0;
        while (true) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getValueKey", "com.tencent.mm.plugin.sns.storage.ADXml$FloatWebViewInfo");
            if (i17 == 0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getValueKey", "com.tencent.mm.plugin.sns.storage.ADXml$FloatWebViewInfo");
                str2 = str;
            } else {
                str2 = str + i17;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getValueKey", "com.tencent.mm.plugin.sns.storage.ADXml$FloatWebViewInfo");
            }
            java.lang.String str3 = (java.lang.String) map.get(str2 + ".type");
            if (android.text.TextUtils.isEmpty(str3)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.ADXml$FloatWebViewInfo");
                return null;
            }
            if (com.tencent.mm.sdk.platformtools.t8.D1(str3, 0) == 136) {
                com.tencent.mm.plugin.sns.storage.v vVar = new com.tencent.mm.plugin.sns.storage.v();
                vVar.f166150a = (java.lang.String) map.get(str2 + ".webViewUrl");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.ADXml$FloatWebViewInfo");
                return vVar;
            }
            i17++;
        }
    }
}
