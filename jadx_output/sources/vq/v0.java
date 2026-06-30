package vq;

/* loaded from: classes9.dex */
public final class v0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.debug.EmojiDebugUI f439229d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI) {
        super(0);
        this.f439229d = emojiDebugUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str = com.tencent.mm.smiley.q0.f193338f;
        java.lang.String str2 = str + "_temp";
        com.tencent.mm.vfs.w6.R(str2, com.tencent.mm.vfs.w6.N(str, 0, 2097152));
        com.tencent.mm.vfs.w6.c(str2, str);
        com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI = this.f439229d;
        com.tencent.mars.xlog.Log.i(emojiDebugUI.d, "make new emoji not entire finish");
        dp.a.makeText((android.content.Context) emojiDebugUI, (java.lang.CharSequence) "done", 0).show();
        return jz5.f0.f302826a;
    }
}
