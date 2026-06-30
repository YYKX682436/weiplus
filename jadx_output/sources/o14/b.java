package o14;

/* loaded from: classes11.dex */
public class b implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.fixtools.FixSearchUI f342269d;

    public b(com.tencent.mm.plugin.setting.ui.fixtools.FixSearchUI fixSearchUI) {
        this.f342269d = fixSearchUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f342269d.finish();
        return true;
    }
}
