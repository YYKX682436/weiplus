package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class j3 {
    public j3(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.String a(com.tencent.mm.plugin.finder.storage.FinderItem finderItem) {
        java.lang.String str;
        int P;
        r45.ze2 location;
        java.lang.String string;
        r45.n03 topic;
        kotlin.jvm.internal.o.g(finderItem, "finderItem");
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderItem.getFeedObject().getObjectDesc();
        if (objectDesc == null || (topic = objectDesc.getTopic()) == null || (str = topic.getString(0)) == null) {
            str = "";
        }
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str, "finder", null);
        if (d17 == null || (P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".finder.valuecount"), -1)) < 0) {
            return "[]";
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (int i17 = 0; i17 < P; i17++) {
            java.lang.String str2 = (java.lang.String) d17.get(".finder.value" + i17 + ".topic");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("topic", str2);
                    jSONObject.put("type", 1);
                    jSONObject.put("count", 0);
                    jSONArray.put(jSONObject);
                } catch (java.lang.Exception unused) {
                }
            }
        }
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc2 = finderItem.getFeedObject().getObjectDesc();
        if (objectDesc2 != null && (location = objectDesc2.getLocation()) != null && (string = location.getString(2)) != null) {
            try {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("topic", string);
                jSONObject2.put("type", 2);
                jSONObject2.put("count", 0);
                jSONArray.put(jSONObject2);
            } catch (java.lang.Exception unused2) {
            }
        }
        java.lang.String jSONArray2 = jSONArray.toString();
        kotlin.jvm.internal.o.f(jSONArray2, "toString(...)");
        return jSONArray2;
    }
}
