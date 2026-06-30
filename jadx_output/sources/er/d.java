package er;

/* loaded from: classes12.dex */
public class d extends er.f {

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f255927q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.mm.storage.emotion.EmojiInfo emojiInfo) {
        super(emojiInfo);
        kotlin.jvm.internal.o.g(emojiInfo, "emojiInfo");
        this.f255927q = "MicroMsg.EmojiLoadTask";
    }

    @Override // er.f
    public java.lang.String e() {
        java.lang.String md52 = this.f255930f.getMd5();
        kotlin.jvm.internal.o.f(md52, "getMd5(...)");
        return md52;
    }

    @Override // er.f, java.lang.Runnable
    public void run() {
        super.run();
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = this.f255930f;
        boolean E0 = iEmojiInfo.E0();
        java.lang.String str = this.f255927q;
        if (E0) {
            com.tencent.mars.xlog.Log.i(str, "IEmojiLoadTask exist " + iEmojiInfo.getMd5());
            f(true);
            return;
        }
        zq.h hVar = zq.h.f474972a;
        if (zq.h.f474975d) {
            com.tencent.mars.xlog.Log.w(str, iEmojiInfo.getMd5() + ": mock download fail");
            f(false);
            return;
        }
        com.tencent.mars.xlog.Log.i(str, "IEmojiLoadTask run " + iEmojiInfo.getMd5());
        kotlin.jvm.internal.o.e(iEmojiInfo, "null cannot be cast to non-null type com.tencent.mm.storage.emotion.EmojiInfo");
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = (com.tencent.mm.storage.emotion.EmojiInfo) iEmojiInfo;
        new cr.k(emojiInfo, new cr.l(emojiInfo, new er.c(this)));
    }
}
