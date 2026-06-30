package g22;

/* loaded from: classes15.dex */
public final class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3SingleProductAlbumUI f267821d;

    public h0(com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3SingleProductAlbumUI emojiStoreV3SingleProductAlbumUI) {
        this.f267821d = emojiStoreV3SingleProductAlbumUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3SingleProductAlbumUI emojiStoreV3SingleProductAlbumUI = this.f267821d;
        i22.g0 g0Var = emojiStoreV3SingleProductAlbumUI.f98452f;
        if (g0Var != null) {
            com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3SingleProductRecyclerView emojiStoreV3SingleProductRecyclerView = emojiStoreV3SingleProductAlbumUI.f98451e;
            g0Var.x(emojiStoreV3SingleProductRecyclerView != null ? emojiStoreV3SingleProductRecyclerView.getLayoutManager() : null);
        }
    }
}
