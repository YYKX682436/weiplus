package gg4;

/* loaded from: classes8.dex */
public class v implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.subapp.ui.pluginapp.ContactSearchUI f271780d;

    public v(com.tencent.mm.plugin.subapp.ui.pluginapp.ContactSearchUI contactSearchUI) {
        this.f271780d = contactSearchUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.subapp.ui.pluginapp.ContactSearchUI contactSearchUI = this.f271780d;
        contactSearchUI.hideVKB();
        contactSearchUI.finish();
        return true;
    }
}
