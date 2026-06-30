package g22;

/* loaded from: classes15.dex */
public final class i0 extends androidx.recyclerview.widget.t0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3SingleProductAlbumUI f267839c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.GridLayoutManager f267840d;

    public i0(com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3SingleProductAlbumUI emojiStoreV3SingleProductAlbumUI, androidx.recyclerview.widget.GridLayoutManager gridLayoutManager) {
        this.f267839c = emojiStoreV3SingleProductAlbumUI;
        this.f267840d = gridLayoutManager;
    }

    @Override // androidx.recyclerview.widget.t0
    public int c(int i17) {
        i22.g0 g0Var = this.f267839c.f98452f;
        java.lang.Integer valueOf = g0Var != null ? java.lang.Integer.valueOf(g0Var.getItemViewType(i17)) : null;
        androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = this.f267840d;
        if (valueOf != null && valueOf.intValue() == 7) {
            return gridLayoutManager.f11861w;
        }
        if (valueOf != null && valueOf.intValue() == 8) {
            return gridLayoutManager.f11861w;
        }
        return 1;
    }
}
