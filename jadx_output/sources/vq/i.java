package vq;

/* loaded from: classes.dex */
public final class i extends vq.a {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.a f439165a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.a f439166b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.a f439167c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI, yz5.a title, yz5.a value, yz5.a aVar) {
        super(emojiDebugUI);
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(value, "value");
        this.f439165a = title;
        this.f439166b = value;
        this.f439167c = aVar;
    }

    @Override // vq.a
    public void a() {
        yz5.a aVar = this.f439167c;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // vq.a
    public java.lang.String c() {
        return (java.lang.String) this.f439165a.invoke();
    }

    @Override // vq.a
    public java.lang.String d() {
        return (java.lang.String) this.f439166b.invoke();
    }
}
