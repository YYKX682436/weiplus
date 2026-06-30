package vq;

/* loaded from: classes.dex */
public final class e extends vq.a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f439148a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.storage.u3 f439149b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f439150c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f439151d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.debug.EmojiDebugUI f439152e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI, java.lang.String title, com.tencent.mm.storage.u3 configKey, java.util.List contentArray, java.util.List valueArray) {
        super(emojiDebugUI);
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(configKey, "configKey");
        kotlin.jvm.internal.o.g(contentArray, "contentArray");
        kotlin.jvm.internal.o.g(valueArray, "valueArray");
        this.f439152e = emojiDebugUI;
        this.f439148a = title;
        this.f439149b = configKey;
        this.f439150c = contentArray;
        this.f439151d = valueArray;
    }

    @Override // vq.a
    public void a() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        int size = this.f439150c.size();
        for (int i17 = 0; i17 < size; i17++) {
            linkedList.add(java.lang.Integer.valueOf(i17));
        }
        com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI = this.f439152e;
        java.util.List list = this.f439150c;
        db5.e1.b(emojiDebugUI, "", list, kz5.n0.S0(kz5.c0.g(list)), "", new vq.d(this.f439152e, this));
    }

    @Override // vq.a
    public java.lang.String c() {
        return this.f439148a;
    }

    @Override // vq.a
    public java.lang.String d() {
        java.util.List list = this.f439151d;
        java.lang.Object obj = list.get(0);
        boolean z17 = com.tencent.mm.emoji.debug.EmojiDebugUI.g;
        this.f439152e.getClass();
        int indexOf = list.indexOf(gm0.j1.u().c().m(this.f439149b, obj));
        java.util.List list2 = this.f439150c;
        return (indexOf < 0 || indexOf >= list2.size()) ? (java.lang.String) list2.get(0) : (java.lang.String) list2.get(indexOf);
    }
}
