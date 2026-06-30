package vq;

/* loaded from: classes11.dex */
public final class g0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.debug.EmojiDebugUI f439160a;

    public g0(com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI) {
        this.f439160a = emojiDebugUI;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.storage.emotion.EmojiInfo u17 = com.tencent.mm.storage.n5.f().c().u1("9bd1281af3a31710a45b84d736363691");
        com.tencent.mm.storage.emotion.EmojiInfo u18 = com.tencent.mm.storage.n5.f().c().u1("08f223fa83f1ca34e143d1e580252c7c");
        u17.field_catalog = 18;
        u18.field_catalog = 18;
        u17.field_reserved3 = 0;
        u18.field_reserved3 = 0;
        com.tencent.mm.storage.n5.f().c().G2(u17);
        com.tencent.mm.storage.n5.f().c().G2(u18);
        dp.a.makeText((android.content.Context) this.f439160a, (java.lang.CharSequence) "done", 0).show();
        return jz5.f0.f302826a;
    }
}
