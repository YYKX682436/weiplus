package com.tencent.mm.plugin.lite.jsapi.comms;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/v3;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class v3 extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null) {
            this.f143443f.a("data is null");
            return;
        }
        java.lang.String optString = jSONObject.optString("extInfo");
        boolean z18 = true;
        if (optString == null || optString.length() == 0) {
            this.f143443f.a("extInfo is null");
            return;
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject(optString);
        java.lang.String optString2 = jSONObject2.optString("url");
        if (optString2 != null && optString2.length() != 0) {
            z18 = false;
        }
        if (z18) {
            com.tencent.mars.xlog.Log.e("LiteAppJsApiOpenCustomerServiceChatForFakeNative", "url is null");
            this.f143443f.a("url is null");
            return;
        }
        int optInt = jSONObject2.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 6);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest openIMKefuStartConversationRequest = new com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest();
        openIMKefuStartConversationRequest.f72272d = c();
        openIMKefuStartConversationRequest.f72273e = currentTimeMillis;
        openIMKefuStartConversationRequest.f72274f = optInt;
        r45.s4 s4Var = new r45.s4();
        s4Var.f385486d = optString2;
        r45.l05 l05Var = new r45.l05();
        l05Var.f379061f = optString2;
        l05Var.f379059d = openIMKefuStartConversationRequest.f72274f;
        l05Var.f379060e = jSONObject2.optString("entity", "");
        s4Var.f385489g = l05Var;
        openIMKefuStartConversationRequest.f72277i = s4Var;
        openIMKefuStartConversationRequest.f72276h = j41.f0.a(openIMKefuStartConversationRequest.f72274f);
        r45.g15 g15Var = new r45.g15();
        g15Var.f374805e = jSONObject.optString("sendMessageTitle");
        g15Var.f374806f = jSONObject.optString("sendMessagePath");
        g15Var.f374807g = jSONObject.optString("sendMessageImg");
        g15Var.f374808h = false;
        android.content.Intent intent = new android.content.Intent();
        openIMKefuStartConversationRequest.f72288w = intent;
        android.os.Handler createFreeHandler = com.tencent.mm.sdk.platformtools.n3.createFreeHandler(android.os.Looper.getMainLooper());
        kotlin.jvm.internal.o.f(createFreeHandler, "createFreeHandler(...)");
        intent.putExtra("key_result_receiver", new com.tencent.mm.openim.model.OpenImKefuStartChattingResultReceiver(createFreeHandler, new com.tencent.mm.plugin.lite.jsapi.comms.u3(this)));
        j41.z zVar = (j41.z) i95.n0.c(j41.z.class);
        if (zVar != null) {
            ((l41.g2) zVar).Bi(openIMKefuStartConversationRequest);
        }
        com.tencent.mars.xlog.Log.i("LiteAppJsApiOpenCustomerServiceChatForFakeNative", "openCustomerServiceChat scene: %s, data: %s", java.lang.Integer.valueOf(optInt), jSONObject);
    }
}
