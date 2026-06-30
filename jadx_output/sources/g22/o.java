package g22;

/* loaded from: classes15.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeBaseFragment f267851d;

    public o(com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeBaseFragment emojiStoreV3HomeBaseFragment) {
        this.f267851d = emojiStoreV3HomeBaseFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeBaseFragment emojiStoreV3HomeBaseFragment = this.f267851d;
        java.lang.String str = emojiStoreV3HomeBaseFragment.f98412d;
        i22.s m07 = emojiStoreV3HomeBaseFragment.m0();
        androidx.recyclerview.widget.RecyclerView recyclerView = emojiStoreV3HomeBaseFragment.f98419n;
        m07.y(recyclerView != null ? recyclerView.getLayoutManager() : null);
    }
}
