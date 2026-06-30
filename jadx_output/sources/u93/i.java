package u93;

/* loaded from: classes.dex */
public class i extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.tencent.mars.xlog.Log.i("LiteAppJsApiOpenGameLifeChatroom", "Invoke openGameLifeChatroom");
        if (jSONObject == null) {
            this.f143443f.a("fail: data is null");
            return;
        }
        java.lang.String optString = jSONObject.optString("chatroom_name");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            this.f143443f.a("data is null");
            return;
        }
        java.lang.String optString2 = jSONObject.optString("chatroom_icon");
        boolean optBoolean = jSONObject.optBoolean("is_auto_join", false);
        long optLong = jSONObject.optLong("sourceid", 0L);
        long optLong2 = jSONObject.optLong(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_SSID, 0L);
        boolean optBoolean2 = jSONObject.optBoolean("backToRoomList", false);
        int optInt = jSONObject.optInt("targetChannelId", -1);
        long optLong3 = jSONObject.optLong("targetSeq", -1L);
        com.tencent.mars.xlog.Log.i("LiteAppJsApiOpenGameLifeChatroom", "chatRoomName:%s, iconUrl:%s, isAutoJoin:%b, sourceId:%d, ssid:%d, backToRoomList:%b, targetChannelId:%s, targetSeq:%s", optString, optString2, java.lang.Boolean.valueOf(optBoolean), java.lang.Long.valueOf(optLong), java.lang.Long.valueOf(optLong2), java.lang.Boolean.valueOf(optBoolean2), java.lang.Integer.valueOf(optInt), java.lang.Long.valueOf(optLong3));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("chatroom_name", optString);
        hashMap.put("chatroom_icon", optString2);
        hashMap.put("is_auto_join", java.lang.String.valueOf(optBoolean));
        hashMap.put("sourceid", java.lang.String.valueOf(optLong));
        hashMap.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_SSID, java.lang.String.valueOf(optLong2));
        hashMap.put("backToRoomList", java.lang.String.valueOf(optBoolean2));
        hashMap.put("targetChannelId", java.lang.String.valueOf(optInt));
        hashMap.put("targetSeq", java.lang.String.valueOf(optLong3));
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(c(), com.tencent.mm.plugin.lite.ui.WxaLiteAppApiProxyUI.class);
        intent.putExtra("proxyui_action_code_key", 8);
        intent.putExtra("open_game_life_chatroom_params", hashMap);
        int i17 = m93.j.f325057q + 1;
        m93.j.f325057q = i17;
        m93.j.f325058r.put(java.lang.Integer.valueOf(i17), this);
        intent.putExtra("callback_id", m93.j.f325057q);
        android.content.Context c17 = c();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c17, arrayList.toArray(), "com/tencent/mm/plugin/lite/jsapi/gamecenter/LiteAppJsApiOpenGameLifeChatroom", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        c17.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(c17, "com/tencent/mm/plugin/lite/jsapi/gamecenter/LiteAppJsApiOpenGameLifeChatroom", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public void t() {
        this.f143443f.d(false);
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public int z() {
        return 1;
    }
}
