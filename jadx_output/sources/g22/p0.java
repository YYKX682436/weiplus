package g22;

/* loaded from: classes15.dex */
public final class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3SingleProductAlbumUI f267854d;

    public p0(com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3SingleProductAlbumUI emojiStoreV3SingleProductAlbumUI) {
        this.f267854d = emojiStoreV3SingleProductAlbumUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i22.g0 g0Var = this.f267854d.f98452f;
        if (g0Var != null) {
            java.util.List list = g0Var.f287967e;
            if (!(!list.isEmpty()) || ((i22.n0) kz5.n0.i0(list)).getType() == 8) {
                return;
            }
            list.add(g0Var.f287974o);
            g0Var.notifyItemChanged(g0Var.getItemCount() - 1);
        }
    }
}
