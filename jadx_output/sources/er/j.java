package er;

/* loaded from: classes12.dex */
public final class j extends er.f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.mm.storage.emotion.EmojiInfo emojiInfo) {
        super(emojiInfo);
        kotlin.jvm.internal.o.g(emojiInfo, "emojiInfo");
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
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("KEY_DATA", this.f255930f);
        bundle.setClassLoader(com.tencent.mm.storage.emotion.EmojiInfo.class.getClassLoader());
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.x2.f193072b, bundle, er.h.class, new er.i(this));
    }
}
