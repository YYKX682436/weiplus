package y22;

/* loaded from: classes10.dex */
public final class x implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emojicapture.ui.StickerPreviewUI f459118d;

    public x(com.tencent.mm.plugin.emojicapture.ui.StickerPreviewUI stickerPreviewUI) {
        this.f459118d = stickerPreviewUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f459118d.finish();
        return true;
    }
}
