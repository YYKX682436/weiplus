package vq;

/* loaded from: classes.dex */
public final class y0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.o4 f439235d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.debug.EmojiDebugUI f439236e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(com.tencent.mm.sdk.platformtools.o4 o4Var, com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI) {
        super(0);
        this.f439235d = o4Var;
        this.f439236e = emojiDebugUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.recyclerview.widget.f2 adapter;
        this.f439235d.putBoolean("multi_thread", !r0.getBoolean("multi_thread", false));
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f439236e.f;
        if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null) {
            adapter.notifyDataSetChanged();
        }
        return jz5.f0.f302826a;
    }
}
