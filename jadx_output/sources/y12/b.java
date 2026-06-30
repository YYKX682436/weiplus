package y12;

/* loaded from: classes9.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.emotion.EmojiInfo f458850d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y12.c f458851e;

    public b(y12.c cVar, com.tencent.mm.storage.emotion.EmojiInfo emojiInfo) {
        this.f458851e = cVar;
        this.f458850d = emojiInfo;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = this.f458850d;
        if (emojiInfo == null || emojiInfo.E0()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiFileCheckerMgr", "chatting emoji broken. try to recover:%s", emojiInfo.getMd5());
        this.f458851e.a(emojiInfo, true);
    }
}
