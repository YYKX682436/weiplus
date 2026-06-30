package w52;

/* loaded from: classes15.dex */
public abstract class a {
    public static void a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        nm5.b bVar = null;
        try {
            jSONObject.put("businessId", str3);
            jSONObject.put("dataPath", str);
            jSONObject.put("value", str2);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("HABBYGE-MALI.AsyncBizCollector", e17, "AsyncBizCollector, generateParamJSONOBject, %s", e17.getMessage());
            jSONObject = null;
        }
        if (jSONObject == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.AsyncBizCollector", "_collectBizData: %s, %s, %s", str, str2, str3);
        java.lang.String a17 = x52.a.a();
        if (a17 == null || a17.isEmpty()) {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            jSONArray.put(jSONObject);
            x52.a.b(java.lang.System.currentTimeMillis() + "@" + jSONArray.toString());
            return;
        }
        if ("-1".equals(a17)) {
            com.tencent.mars.xlog.Log.e("HABBYGE-MALI.AsyncBizDao", " AsyncBizDao putBiz NOT LOGIN");
            return;
        }
        if (a17.split("@").length <= 1) {
            org.json.JSONArray jSONArray2 = new org.json.JSONArray();
            jSONArray2.put(jSONObject);
            x52.a.b(a17 + "@" + jSONArray2.toString());
            return;
        }
        if (!a17.isEmpty()) {
            java.lang.String[] split = a17.split("@");
            if (split.length > 0) {
                bVar = split.length == 1 ? nm5.j.c(split[0], null) : nm5.j.c(split[0], split[1]);
            }
        }
        if (bVar == null) {
            org.json.JSONArray jSONArray3 = new org.json.JSONArray();
            jSONArray3.put(jSONObject);
            x52.a.b(java.lang.System.currentTimeMillis() + "@" + jSONArray3.toString());
            return;
        }
        if (android.text.TextUtils.isEmpty((java.lang.CharSequence) bVar.a(1)) && !android.text.TextUtils.isEmpty((java.lang.CharSequence) bVar.a(0))) {
            org.json.JSONArray jSONArray4 = new org.json.JSONArray();
            jSONArray4.put(jSONObject);
            x52.a.b(((java.lang.String) bVar.a(0)) + "@" + jSONArray4.toString());
            return;
        }
        try {
            org.json.JSONArray jSONArray5 = new org.json.JSONArray((java.lang.String) bVar.a(1));
            jSONArray5.put(jSONObject);
            x52.a.b(((java.lang.String) bVar.a(0)) + "@" + jSONArray5.toString());
        } catch (org.json.JSONException e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("HABBYGE-MALI.AsyncBizDao", e18, "AsyncBizDao.putBiz crash: %s", e18.getMessage());
        }
    }

    public static void b(java.lang.String str) {
        java.lang.String str2;
        nm5.b a17 = w52.b.a();
        if (a17 == null) {
            com.tencent.mars.xlog.Log.e("HABBYGE-MALI.AsyncBizCollector", "getBizId, tuple2 is NULL");
            str2 = null;
        } else {
            r45.jw3 jw3Var = (r45.jw3) a17.a(0);
            int intValue = ((java.lang.Integer) a17.a(1)).intValue();
            int size = jw3Var.f378163h.size() + 1;
            java.util.LinkedList linkedList = jw3Var.f378165m;
            int size2 = linkedList.size() + 1;
            com.tencent.mm.plugin.expt.hellhound.ext.session.config.b bVar = com.tencent.mm.plugin.expt.hellhound.ext.session.config.c.f99783a;
            int i17 = size >= size2 ? size + 1 : size2 + 1;
            r45.kw3 kw3Var = new r45.kw3();
            kw3Var.f379000f = com.tencent.mm.plugin.expt.hellhound.ext.session.config.c.d(jw3Var.f378160e, i17);
            jw3Var.f378163h.add(kw3Var);
            linkedList.add(kw3Var);
            y52.b.i(jw3Var, intValue);
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.AsyncBizCollector", "getBizId, addBizIdCurPageFlowItem: %s", kw3Var.f379000f);
            str2 = kw3Var.f379000f;
        }
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.AsyncBizCollector", "AsyncBizCollector, _collectBizId: %s", str2);
        w52.g.wi().getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.HellBizService", "HABBYGE-MALI, notifyGetBizId: requestId:%s, bizId:%s", str, str2);
        com.tencent.mm.autogen.events.HellBizIdEvent hellBizIdEvent = new com.tencent.mm.autogen.events.HellBizIdEvent();
        am.ih ihVar = hellBizIdEvent.f54433g;
        ihVar.f6952a = str;
        ihVar.f6953b = str2;
        hellBizIdEvent.e();
    }
}
