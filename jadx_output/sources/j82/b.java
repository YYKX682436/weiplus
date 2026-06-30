package j82;

/* loaded from: classes8.dex */
public class b implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.offline.ui.FavOfflineWebViewUI f298152d;

    public b(com.tencent.mm.plugin.fav.offline.ui.FavOfflineWebViewUI favOfflineWebViewUI) {
        this.f298152d = favOfflineWebViewUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f298152d.finish();
        return true;
    }
}
