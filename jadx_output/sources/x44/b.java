package x44;

/* loaded from: classes4.dex */
public final class b extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.AdWorldCupAvatarUpdateDone");
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        try {
            java.lang.String c17 = env.b().c();
            if (c17 == null) {
                c17 = "";
            }
            java.lang.String optString = data.optString("avatarUrl", "");
            java.lang.String optString2 = data.optString("avatarMd5", "");
            boolean z17 = true;
            if (c17.length() == 0) {
                com.tencent.mars.xlog.Log.w("SnsAdJs.AdWorldCupAvatarUpdateDone", "aid empty from pageParam, fail");
                b(g("aid not found"));
            } else {
                kotlin.jvm.internal.o.d(optString);
                if (optString.length() == 0) {
                    com.tencent.mars.xlog.Log.i("SnsAdJs.AdWorldCupAvatarUpdateDone", "doAction RESET, aid=" + c17 + ", clear avatar");
                    m84.a0.a(c17);
                    com.tencent.mm.autogen.events.SnsAdWorldCupAvatarUpdateEvent snsAdWorldCupAvatarUpdateEvent = new com.tencent.mm.autogen.events.SnsAdWorldCupAvatarUpdateEvent();
                    am.kv kvVar = snsAdWorldCupAvatarUpdateEvent.f54802g;
                    kvVar.f7183a = c17;
                    kvVar.f7184b = "";
                    kvVar.getClass();
                    snsAdWorldCupAvatarUpdateEvent.e();
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("aid", c17);
                    jSONObject.put("isReset", 1);
                    m(jSONObject);
                    b(jSONObject);
                } else {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doAction SET, aid=");
                    sb6.append(c17);
                    sb6.append(", avatarUrlLen=");
                    sb6.append(optString.length());
                    sb6.append(", hasMd5=");
                    kotlin.jvm.internal.o.d(optString2);
                    sb6.append(optString2.length() > 0);
                    com.tencent.mars.xlog.Log.i("SnsAdJs.AdWorldCupAvatarUpdateDone", sb6.toString());
                    if (optString2.length() <= 0) {
                        z17 = false;
                    }
                    if (!z17) {
                        optString2 = null;
                    }
                    m84.a0.e(c17, new m84.z(optString, optString2, java.lang.System.currentTimeMillis()));
                    com.tencent.mm.autogen.events.SnsAdWorldCupAvatarUpdateEvent snsAdWorldCupAvatarUpdateEvent2 = new com.tencent.mm.autogen.events.SnsAdWorldCupAvatarUpdateEvent();
                    am.kv kvVar2 = snsAdWorldCupAvatarUpdateEvent2.f54802g;
                    kvVar2.f7183a = c17;
                    kvVar2.f7184b = optString;
                    kvVar2.getClass();
                    snsAdWorldCupAvatarUpdateEvent2.e();
                    w64.t.e(optString, null, null);
                    com.tencent.mars.xlog.Log.i("SnsAdJs.AdWorldCupAvatarUpdateDone", "trigger preload for state-publish emoji, aid=" + c17 + ", urlLen=" + optString.length());
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put("aid", c17);
                    jSONObject2.put("isReset", 0);
                    m(jSONObject2);
                    b(jSONObject2);
                }
            }
        } catch (java.lang.Throwable th6) {
            ca4.q.c("SnsAdJs.AdWorldCupAvatarUpdateDone", th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.AdWorldCupAvatarUpdateDone");
    }
}
