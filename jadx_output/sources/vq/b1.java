package vq;

/* loaded from: classes.dex */
public final class b1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.o4 f439134d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.debug.EmojiDebugUI f439135e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(com.tencent.mm.sdk.platformtools.o4 o4Var, com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI) {
        super(0);
        this.f439134d = o4Var;
        this.f439135e = emojiDebugUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.recyclerview.widget.f2 adapter;
        com.tencent.mm.sdk.platformtools.o4 o4Var = this.f439134d;
        o4Var.putBoolean("effect", true ^ o4Var.getBoolean("effect", true));
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f439135e.f;
        if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null) {
            adapter.notifyDataSetChanged();
        }
        return jz5.f0.f302826a;
    }
}
