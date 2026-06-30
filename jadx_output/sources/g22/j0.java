package g22;

/* loaded from: classes15.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3SingleProductAlbumUI f267842d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3SingleProductAlbumUI emojiStoreV3SingleProductAlbumUI) {
        super(0);
        this.f267842d = emojiStoreV3SingleProductAlbumUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3SingleProductAlbumUI.f98449z;
        com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3SingleProductAlbumUI emojiStoreV3SingleProductAlbumUI = this.f267842d;
        if (emojiStoreV3SingleProductAlbumUI.f98462s != g22.g0.f267816e) {
            emojiStoreV3SingleProductAlbumUI.setBounceEnabled(false);
            com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3SingleProductRecyclerView emojiStoreV3SingleProductRecyclerView = emojiStoreV3SingleProductAlbumUI.f98451e;
            if (emojiStoreV3SingleProductRecyclerView != null) {
                emojiStoreV3SingleProductRecyclerView.post(new g22.p0(emojiStoreV3SingleProductAlbumUI));
            }
            emojiStoreV3SingleProductAlbumUI.T6();
        }
        return jz5.f0.f302826a;
    }
}
