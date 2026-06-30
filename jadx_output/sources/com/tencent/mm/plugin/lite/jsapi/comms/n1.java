package com.tencent.mm.plugin.lite.jsapi.comms;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/n1;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class n1 extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null) {
            this.f143443f.a("emoticonPatchGetEmotionList:productId is isNullOrBlank");
            return;
        }
        int optInt = jSONObject.optInt("precedingScene", 0);
        long optLong = jSONObject.optLong(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, 0L);
        int optInt2 = jSONObject.optInt("reqType", 0);
        int optInt3 = jSONObject.optInt("reqBufLen", 0);
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c), null, null, new com.tencent.mm.plugin.lite.jsapi.comms.m1(optInt, optLong, optInt2, jSONObject.optString("reqBufStr", ""), optInt3, this, null), 3, null);
    }
}
