package u93;

/* loaded from: classes8.dex */
public class k extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.tencent.mars.xlog.Log.i("LiteAppJsApiQuitGameLifeChatroom", "Invoke startGameLifeConversation");
        if (jSONObject == null) {
            this.f143443f.a("fail: data is null");
            return;
        }
        java.lang.String optString = jSONObject.optString("chatroom_name");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            this.f143443f.a("data is null");
            return;
        }
        com.tencent.mars.xlog.Log.i("LiteAppJsApiQuitGameLifeChatroom", "chatRoomName:%s", optString);
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("com.tencent.mm.game.ACTION_QUIT_CHAT_ROOM");
        intent.putExtra("chatroom_name", optString);
        intent.setPackage(com.tencent.mm.sdk.platformtools.x2.f193072b);
        com.tencent.mm.sdk.platformtools.x2.f193071a.sendBroadcast(intent, com.tencent.mm.plugin.game.g0.f139448a);
        com.tencent.mm.plugin.lite.LiteAppCenter.closeWindow(this.f143443f.f143440a.f299024a, new android.content.Intent());
        this.f143443f.d(false);
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public int z() {
        return 0;
    }
}
