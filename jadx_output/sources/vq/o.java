package vq;

/* loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.debug.EmojiDebugUI f439200d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f439201e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f439202f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI, int i17, int i18) {
        super(0);
        this.f439200d = emojiDebugUI;
        this.f439201e = i17;
        this.f439202f = i18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        dp.a.makeText((android.content.Context) this.f439200d, (java.lang.CharSequence) ("errType=" + this.f439201e + ", errCode=" + this.f439202f), 0).show();
        return jz5.f0.f302826a;
    }
}
