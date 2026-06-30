package dh4;

/* loaded from: classes11.dex */
public class u implements com.tencent.mm.sdk.platformtools.t2 {
    @Override // com.tencent.mm.sdk.platformtools.t2
    public void cancel() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        int i17 = com.tencent.mm.plugin.talkroom.model.TalkRoomReceiver.f172448a;
        android.app.PendingIntent b17 = jk.b.b(context, 107, new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.talkroom.model.TalkRoomReceiver.class).putExtra("MMBoot_Bump", true), fp.g0.a(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING), true);
        if (b17 != null) {
            jk.b.a(context, 107, b17);
            b17.cancel();
        }
    }

    @Override // com.tencent.mm.sdk.platformtools.t2
    public void prepare() {
        com.tencent.mm.plugin.talkroom.model.TalkRoomReceiver.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
    }
}
