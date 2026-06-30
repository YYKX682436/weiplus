package m04;

/* loaded from: classes12.dex */
public class a implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.search.ui.FTSInfoUI f322553d;

    public a(com.tencent.mm.plugin.search.ui.FTSInfoUI fTSInfoUI) {
        this.f322553d = fTSInfoUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f322553d.finish();
        return false;
    }
}
