package i53;

/* loaded from: classes3.dex */
public class j2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.media.GameTabGalleryUI f288617d;

    public j2(com.tencent.mm.plugin.game.media.GameTabGalleryUI gameTabGalleryUI) {
        this.f288617d = gameTabGalleryUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f288617d.finish();
        return false;
    }
}
