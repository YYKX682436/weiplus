package qr;

/* loaded from: classes10.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final qr.a0 f365999a = new qr.a0();

    /* renamed from: b, reason: collision with root package name */
    public static final fp0.o f366000b;

    static {
        fp0.o oVar = new fp0.o(new gp0.g(new gp0.b(20, Integer.MAX_VALUE), new gp0.h(1, 5), 1, "EmojiUpload"));
        f366000b = oVar;
        oVar.g(new qr.z());
    }

    public final void a(com.tencent.mm.storage.emotion.EmojiInfo emojiInfo) {
        kotlin.jvm.internal.o.g(emojiInfo, "emojiInfo");
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiUploadManager", "addUploadTask: " + emojiInfo.getMd5());
        f366000b.a(new qr.h(emojiInfo));
    }
}
