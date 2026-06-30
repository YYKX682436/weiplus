package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f166023a = new java.util.ArrayList();

    public com.tencent.mm.plugin.sns.storage.j a(java.util.Map map, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.storage.ADXml$AdCardTagInfo");
        int i17 = 0;
        while (true) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            sb6.append(com.tencent.mm.plugin.sns.storage.ADXml.PRE_KEY_CARD_TAG_LIST);
            sb6.append(i17 == 0 ? "" : java.lang.Integer.valueOf(i17));
            java.lang.String sb7 = sb6.toString();
            if (!map.containsKey(sb7)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.ADXml$AdCardTagInfo");
                return this;
            }
            com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.sns.storage.ADXml.TAG, "card ad tag %s", map.get(sb7));
            if (!com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) map.get(sb7))) {
                com.tencent.mm.plugin.sns.storage.k kVar = new com.tencent.mm.plugin.sns.storage.k();
                java.lang.String str2 = (java.lang.String) map.get(sb7);
                if (str2 == null) {
                    str2 = "";
                }
                kVar.f166028a = str2;
                java.lang.Object obj = sb7 + com.tencent.mm.plugin.sns.storage.ADXml.SUFF_KEY_CARD_TAG_ICON_LIGHT_MODE_URL;
                java.lang.Object obj2 = sb7 + com.tencent.mm.plugin.sns.storage.ADXml.SUFF_KEY_CARD_TAG_ICON_DARK_MODE_URL;
                java.lang.Object obj3 = sb7 + com.tencent.mm.plugin.sns.storage.ADXml.SUFF_KEY_CARD_TAG_BACKGROUND_LIGHT_MODE_COLOR;
                java.lang.Object obj4 = sb7 + com.tencent.mm.plugin.sns.storage.ADXml.SUFF_KEY_CARD_TAG_BACKGROUND_DARK_MODE_COLOR;
                java.lang.Object obj5 = sb7 + com.tencent.mm.plugin.sns.storage.ADXml.SUFF_KEY_CARD_TAG_CONTENT_LIGHT_MODE_COLOR;
                java.lang.Object obj6 = sb7 + com.tencent.mm.plugin.sns.storage.ADXml.SUFF_KEY_CARD_TAG_CONTENT_DARK_MODE_COLOR;
                java.lang.String str3 = (java.lang.String) map.get(obj);
                if (str3 == null) {
                    str3 = "";
                }
                kVar.f166029b = str3;
                java.lang.String str4 = (java.lang.String) map.get(obj2);
                if (str4 == null) {
                    str4 = "";
                }
                kVar.f166030c = str4;
                java.lang.String str5 = (java.lang.String) map.get(obj3);
                if (str5 == null) {
                    str5 = "";
                }
                kVar.f166031d = str5;
                java.lang.String str6 = (java.lang.String) map.get(obj4);
                if (str6 == null) {
                    str6 = "";
                }
                kVar.f166032e = str6;
                java.lang.String str7 = (java.lang.String) map.get(obj5);
                if (str7 == null) {
                    str7 = "";
                }
                kVar.f166033f = str7;
                java.lang.String str8 = (java.lang.String) map.get(obj6);
                kVar.f166034g = str8 != null ? str8 : "";
                com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.sns.storage.ADXml.TAG, "Tag content = ", kVar.f166028a + ", Tag light iconUrl = " + kVar.f166029b + ", Tag dark iconUrl = " + kVar.f166030c + ", Tag background light color = " + kVar.f166031d + ", Tag background dark color = " + kVar.f166032e + ", Tag content light color = " + kVar.f166033f + ", Tag content dark color = " + kVar.f166034g);
                ((java.util.ArrayList) this.f166023a).add(kVar);
            }
            i17++;
        }
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.storage.ADXml$AdCardTagInfo");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.storage.ADXml$AdCardTagInfo");
            return true;
        }
        if (obj == null || com.tencent.mm.plugin.sns.storage.j.class != obj.getClass()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.storage.ADXml$AdCardTagInfo");
            return false;
        }
        boolean equals = java.util.Objects.equals(this.f166023a, ((com.tencent.mm.plugin.sns.storage.j) obj).f166023a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.storage.ADXml$AdCardTagInfo");
        return equals;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.storage.ADXml$AdCardTagInfo");
        int hash = java.util.Objects.hash(this.f166023a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.storage.ADXml$AdCardTagInfo");
        return hash;
    }
}
