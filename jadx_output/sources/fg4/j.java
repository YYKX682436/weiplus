package fg4;

/* loaded from: classes8.dex */
public class j implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.subapp.ui.openapi.AppProfileUI f262477d;

    public j(com.tencent.mm.plugin.subapp.ui.openapi.AppProfileUI appProfileUI) {
        this.f262477d = appProfileUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f262477d.finish();
        return true;
    }
}
