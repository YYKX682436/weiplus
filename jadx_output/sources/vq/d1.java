package vq;

/* loaded from: classes.dex */
public final class d1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.debug.EmojiDebugUI f439146d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f439147e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI, int i17) {
        super(0);
        this.f439146d = emojiDebugUI;
        this.f439147e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.emoji.debug.EmojiDebugUI.h = !com.tencent.mm.emoji.debug.EmojiDebugUI.h;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f439146d.f;
        androidx.recyclerview.widget.f2 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        kotlin.jvm.internal.o.e(adapter, "null cannot be cast to non-null type com.tencent.mm.emoji.debug.EmojiDebugUI.DebugAdapter");
        ((vq.g) adapter).notifyItemChanged(this.f439147e);
        return jz5.f0.f302826a;
    }
}
