package t00;

/* loaded from: classes8.dex */
public final class y {
    public y(kotlin.jvm.internal.i iVar) {
    }

    public final bw5.z7 a(org.json.JSONObject data) {
        kotlin.jvm.internal.o.g(data, "data");
        org.json.JSONArray optJSONArray = data.optJSONArray("sectionList");
        if (optJSONArray == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GetEcsSectionDataActionHandler", "invalid keys");
            return null;
        }
        bw5.z7 z7Var = new bw5.z7();
        z7Var.f35845e = data.optInt("fetchScene");
        z7Var.f35848h[2] = true;
        int length = optJSONArray.length();
        for (int i17 = 0; i17 < length; i17++) {
            org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i17);
            if (optJSONObject != null) {
                bw5.a8 a8Var = new bw5.a8();
                int optInt = optJSONObject.optInt("section");
                bw5.k9 k9Var = new bw5.k9();
                k9Var.f29300h = optInt;
                k9Var.f29301i.put(100, java.lang.Boolean.TRUE);
                a8Var.f25059e = k9Var;
                boolean[] zArr = a8Var.f25067p;
                zArr[2] = true;
                a8Var.f25063i = optJSONObject.optString("byPass");
                zArr[6] = true;
                a8Var.f25064m = optJSONObject.optString("redDotId");
                zArr[7] = true;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("section:");
                sb6.append(optInt);
                sb6.append(",redDotId:");
                sb6.append(zArr[7] ? a8Var.f25064m : "");
                com.tencent.mars.xlog.Log.i("MicroMsg.GetEcsSectionDataActionHandler", sb6.toString());
                z7Var.f35846f.add(a8Var);
            }
        }
        return z7Var;
    }

    public final org.json.JSONObject b(bw5.i9 resp, long j17) {
        kotlin.jvm.internal.o.g(resp, "resp");
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.LinkedList<bw5.h9> linkedList = resp.f28501d;
        kotlin.jvm.internal.o.f(linkedList, "getEcsRespList(...)");
        for (bw5.h9 h9Var : linkedList) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("section", h9Var.f28128m);
            java.lang.String str = "";
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, h9Var.hasFieldNumber(2) ? h9Var.f28123e : "");
            if (h9Var.hasFieldNumber(101)) {
                str = h9Var.f28129n;
            }
            jSONObject.put("rid", str);
            jSONArray.put(jSONObject);
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("kvData", jSONArray);
        jSONObject2.put("hitCache", resp.f28502e);
        jSONObject2.put("reqTime", j17);
        jSONObject2.put("respTime", c01.id.c());
        return jSONObject2;
    }
}
