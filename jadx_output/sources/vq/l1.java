package vq;

/* loaded from: classes.dex */
public final class l1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.debug.EmojiDebugUI f439185d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI) {
        super(0);
        this.f439185d = emojiDebugUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        n22.m.f334296b = !n22.m.f334296b;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f439185d.f;
        androidx.recyclerview.widget.f2 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        kotlin.jvm.internal.o.e(adapter, "null cannot be cast to non-null type com.tencent.mm.emoji.debug.EmojiDebugUI.DebugAdapter");
        ((vq.g) adapter).notifyDataSetChanged();
        return jz5.f0.f302826a;
    }
}
