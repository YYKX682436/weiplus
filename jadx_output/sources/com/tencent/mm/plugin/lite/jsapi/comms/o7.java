package com.tencent.mm.plugin.lite.jsapi.comms;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/o7;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class o7 extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiShowTingWecoinPayPanel", "showTingWecoinPayPanel appId: " + str + ", data: " + jSONObject + ", isFromView: " + z17);
        com.tencent.mm.api.TingMemberShipSubscribeRequest tingMemberShipSubscribeRequest = new com.tencent.mm.api.TingMemberShipSubscribeRequest();
        tingMemberShipSubscribeRequest.f53213f = true;
        tingMemberShipSubscribeRequest.f53211d = 3;
        java.lang.String optString = jSONObject != null ? jSONObject.optString("session_id") : null;
        if (optString == null) {
            optString = "";
        }
        tingMemberShipSubscribeRequest.f53214g = optString;
        tingMemberShipSubscribeRequest.f53215h = 2100;
        android.os.Handler createFreeHandler = com.tencent.mm.sdk.platformtools.n3.createFreeHandler(android.os.Looper.getMainLooper());
        com.tencent.mm.plugin.lite.jsapi.comms.n7 n7Var = new com.tencent.mm.plugin.lite.jsapi.comms.n7(this);
        qk.x8 x8Var = (qk.x8) i95.n0.c(qk.x8.class);
        android.content.Context c17 = c();
        kotlin.jvm.internal.o.f(c17, "getContext(...)");
        kotlin.jvm.internal.o.d(createFreeHandler);
        com.tencent.mm.api.TingMembershipSubscribeResultReceiver tingMembershipSubscribeResultReceiver = new com.tencent.mm.api.TingMembershipSubscribeResultReceiver(createFreeHandler, n7Var);
        ((ef0.o3) x8Var).getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_result_receiver", tingMembershipSubscribeResultReceiver);
        intent.putExtra("key_membership_request", tingMemberShipSubscribeRequest);
        intent.setClass(c17, com.tencent.mm.plugin.ting.TingMembershipTransparentUI.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c17, arrayList.toArray(), "com/tencent/mm/feature/ting/TingMembershipService", "startMembershipSubscribeForResult", "(Landroid/content/Context;Lcom/tencent/mm/api/TingMemberShipSubscribeRequest;Landroid/os/ResultReceiver;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        c17.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(c17, "com/tencent/mm/feature/ting/TingMembershipService", "startMembershipSubscribeForResult", "(Landroid/content/Context;Lcom/tencent/mm/api/TingMemberShipSubscribeRequest;Landroid/os/ResultReceiver;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
