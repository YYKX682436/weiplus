package mm3;

/* loaded from: classes10.dex */
public final class x implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.free.MusicMvFreeMakerPreviewUI f329683d;

    public x(com.tencent.mm.plugin.mv.ui.free.MusicMvFreeMakerPreviewUI musicMvFreeMakerPreviewUI) {
        this.f329683d = musicMvFreeMakerPreviewUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f329683d.onBackPressed();
        return true;
    }
}
