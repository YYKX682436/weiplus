package pr;

/* loaded from: classes15.dex */
public final class w implements pr.e0 {
    @Override // pr.e0
    public void a(int i17) {
        com.tencent.mm.emoji.sync.EmojiSyncLoaderIPC$EmojiSyncData c17 = pr.k0.f357723q.c(0);
        android.content.Intent intent = new android.content.Intent();
        int i18 = com.tencent.mm.emoji.sync.EmojiUpdateReceiver.f64930a;
        intent.setAction("com.tencent.mm.Emoji_Update");
        intent.putExtra("type", "TYPE_UPDATE_EMOJI_SYNC");
        intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, c17);
        com.tencent.mm.sdk.platformtools.x2.f193071a.sendBroadcast(intent);
    }
}
