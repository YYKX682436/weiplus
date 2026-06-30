package vq;

/* loaded from: classes11.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.debug.EmojiDebugUI f439133d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI) {
        super(0);
        this.f439133d = emojiDebugUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        new pr.t(1, null, false).a();
        dp.a.makeText((android.content.Context) this.f439133d, (java.lang.CharSequence) "done", 0).show();
        return jz5.f0.f302826a;
    }
}
