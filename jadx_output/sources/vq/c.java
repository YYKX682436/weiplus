package vq;

/* loaded from: classes.dex */
public final class c extends vq.a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f439136a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.a f439137b;

    /* renamed from: c, reason: collision with root package name */
    public yz5.a f439138c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.debug.EmojiDebugUI f439139d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI, java.lang.String title, yz5.a valueGetter, yz5.a aVar) {
        super(emojiDebugUI);
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(valueGetter, "valueGetter");
        this.f439139d = emojiDebugUI;
        this.f439136a = title;
        this.f439137b = valueGetter;
        this.f439138c = aVar;
    }

    @Override // vq.a
    public void a() {
        androidx.recyclerview.widget.f2 adapter;
        yz5.a aVar = this.f439138c;
        if (aVar != null) {
            aVar.invoke();
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f439139d.f;
        if (recyclerView == null || (adapter = recyclerView.getAdapter()) == null) {
            return;
        }
        adapter.notifyDataSetChanged();
    }

    @Override // vq.a
    public java.lang.String c() {
        return this.f439136a;
    }

    @Override // vq.a
    public java.lang.String d() {
        return (java.lang.String) this.f439137b.invoke();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI, java.lang.String title, java.lang.String value, yz5.a aVar) {
        this(emojiDebugUI, title, new vq.b(value), aVar);
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(value, "value");
    }
}
