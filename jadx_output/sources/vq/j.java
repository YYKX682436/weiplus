package vq;

/* loaded from: classes.dex */
public final class j extends vq.a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f439170a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI, java.lang.String title) {
        super(emojiDebugUI);
        kotlin.jvm.internal.o.g(title, "title");
        this.f439170a = title;
    }

    @Override // vq.a
    public void a() {
    }

    @Override // vq.a
    public float b() {
        return 30.0f;
    }

    @Override // vq.a
    public java.lang.String c() {
        return this.f439170a;
    }

    @Override // vq.a
    public java.lang.String d() {
        return "";
    }
}
