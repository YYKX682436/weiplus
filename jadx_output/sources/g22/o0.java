package g22;

/* loaded from: classes15.dex */
public final class o0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3SingleProductAlbumUI f267852d;

    public o0(com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3SingleProductAlbumUI emojiStoreV3SingleProductAlbumUI) {
        this.f267852d = emojiStoreV3SingleProductAlbumUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3SingleProductAlbumUI context = this.f267852d;
        int i17 = context.f98460q;
        java.lang.String setTitle = context.f98454h;
        java.lang.String setDesc = context.f98455i;
        java.lang.String setIconURL = context.f98456m;
        java.lang.String setAdURL = context.f98457n;
        int i18 = context.f98458o;
        int i19 = context.f98468y;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(setTitle, "setTitle");
        kotlin.jvm.internal.o.g(setDesc, "setDesc");
        kotlin.jvm.internal.o.g(setIconURL, "setIconURL");
        kotlin.jvm.internal.o.g(setAdURL, "setAdURL");
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) context, 1, false);
        k0Var.f211872n = new n22.d(1001, context, 1000);
        k0Var.f211881s = new n22.e(1001, setTitle, setDesc, i17, setIconURL, setAdURL, i18, context, 1000);
        k0Var.v();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13224, 2, 0, "", java.lang.Integer.valueOf(i17));
        return false;
    }
}
