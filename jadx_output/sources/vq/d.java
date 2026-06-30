package vq;

/* loaded from: classes.dex */
public final class d implements db5.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.debug.EmojiDebugUI f439143a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vq.e f439144b;

    public d(com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI, vq.e eVar) {
        this.f439143a = emojiDebugUI;
        this.f439144b = eVar;
    }

    @Override // db5.d1
    public final void a(int i17, int i18) {
        androidx.recyclerview.widget.f2 adapter;
        vq.e eVar = this.f439144b;
        com.tencent.mm.storage.u3 u3Var = eVar.f439149b;
        java.lang.Object obj = eVar.f439151d.get(i18);
        boolean z17 = com.tencent.mm.emoji.debug.EmojiDebugUI.g;
        com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI = this.f439143a;
        emojiDebugUI.getClass();
        gm0.j1.u().c().x(u3Var, obj);
        androidx.recyclerview.widget.RecyclerView recyclerView = emojiDebugUI.f;
        if (recyclerView == null || (adapter = recyclerView.getAdapter()) == null) {
            return;
        }
        adapter.notifyDataSetChanged();
    }
}
