package vq;

/* loaded from: classes5.dex */
public final class o0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.debug.EmojiDebugUI f439203d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI) {
        super(0);
        this.f439203d = emojiDebugUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI = this.f439203d;
        dp.a.makeText((android.content.Context) emojiDebugUI, (java.lang.CharSequence) "done", 0).show();
        com.tencent.mars.xlog.Log.i(emojiDebugUI.d, "dump new system emoji , done!");
        return jz5.f0.f302826a;
    }
}
