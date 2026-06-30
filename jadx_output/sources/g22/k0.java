package g22;

/* loaded from: classes15.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3SingleProductAlbumUI f267844d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3SingleProductAlbumUI emojiStoreV3SingleProductAlbumUI) {
        super(1);
        this.f267844d = emojiStoreV3SingleProductAlbumUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3SingleProductAlbumUI emojiStoreV3SingleProductAlbumUI = this.f267844d;
        if (booleanValue) {
            emojiStoreV3SingleProductAlbumUI.setMMTitle("");
        } else {
            emojiStoreV3SingleProductAlbumUI.setMMTitle(emojiStoreV3SingleProductAlbumUI.f98454h);
        }
        return jz5.f0.f302826a;
    }
}
