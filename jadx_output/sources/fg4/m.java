package fg4;

/* loaded from: classes8.dex */
public class m implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.subapp.ui.openapi.ServiceAppUI f262482d;

    public m(com.tencent.mm.plugin.subapp.ui.openapi.ServiceAppUI serviceAppUI) {
        this.f262482d = serviceAppUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f262482d.finish();
        return true;
    }
}
