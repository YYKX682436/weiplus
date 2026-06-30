package fg4;

/* loaded from: classes8.dex */
public class a implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.subapp.ui.openapi.AddAppUI f262466d;

    public a(com.tencent.mm.plugin.subapp.ui.openapi.AddAppUI addAppUI) {
        this.f262466d = addAppUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f262466d.finish();
        return true;
    }
}
