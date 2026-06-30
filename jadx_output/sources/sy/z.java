package sy;

@j95.b
/* loaded from: classes5.dex */
public final class z extends i95.w implements ty.j0 {
    public void Ai(java.lang.String talkerName, android.content.Intent intent) {
        kotlin.jvm.internal.o.g(talkerName, "talkerName");
        com.tencent.mars.xlog.Log.i("HalfScreenChattingService", "startHalfChatting inner called with: talkerName = ".concat(talkerName));
        if (r26.n0.N(talkerName)) {
            return;
        }
        android.content.Intent intent2 = new android.content.Intent("com.tencent.mm.Intent.ACTION_HALF_SCREEN_CHATTING");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.putExtra("Chat_User", talkerName);
        intent2.setPackage(com.tencent.mm.sdk.platformtools.x2.f193072b);
        intent2.putExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA, intent);
        com.tencent.mm.sdk.platformtools.x2.f193071a.sendBroadcast(intent2);
    }

    public void wi(android.content.Context activity, java.lang.String talkerName, android.content.Intent extraData) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(talkerName, "talkerName");
        kotlin.jvm.internal.o.g(extraData, "extraData");
        extraData.putExtra("Chat_User", talkerName);
        if (!extraData.hasExtra("Chat_BackBtnStyle")) {
            extraData.putExtra("Chat_BackBtnStyle", 1);
        }
        ((rb5.m) ((wn.o) i95.n0.c(wn.o.class))).Di(activity, talkerName, extraData);
    }
}
