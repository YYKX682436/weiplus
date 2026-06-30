package com.tencent.mm.plugin.lite.jsapi.comms;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/j3;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class j3 extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject data, boolean z17) {
        kotlin.jvm.internal.o.g(data, "data");
        try {
            java.lang.String string = data.getString("messageSvrId");
            kotlin.jvm.internal.o.f(string, "getString(...)");
            long parseLong = java.lang.Long.parseLong(string);
            java.lang.String string2 = data.getString("chatName");
            com.tencent.mm.storage.f9 l17 = pt0.f0.f358209b1.l(string2, parseLong);
            if (l17 == null) {
                throw new java.lang.IllegalStateException("msgInfo".toString());
            }
            android.content.Context c17 = c();
            android.content.Intent intent = new android.content.Intent();
            intent.setClassName(c(), "com.tencent.mm.ui.chatting.ChattingUI");
            intent.putExtra("msg_local_id", l17.getMsgId());
            intent.putExtra("from_global_search", true);
            intent.putExtra("need_hight_item", true);
            intent.putExtra("Chat_User", string2);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c17, arrayList.toArray(), "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiLocateToChatPosition", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            c17.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(c17, "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiLocateToChatPosition", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            this.f143442e.d();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppJsApiLocateToChatPosition", e17.getMessage() + ": " + jz5.a.b(e17));
            this.f143442e.a();
        }
    }
}
