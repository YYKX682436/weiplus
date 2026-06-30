package g22;

/* loaded from: classes15.dex */
public final class n0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3SingleProductAlbumUI f267850d;

    public n0(com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3SingleProductAlbumUI emojiStoreV3SingleProductAlbumUI) {
        this.f267850d = emojiStoreV3SingleProductAlbumUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f267850d.finish();
        return false;
    }
}
