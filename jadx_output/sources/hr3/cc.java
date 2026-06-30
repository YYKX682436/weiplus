package hr3;

/* loaded from: classes.dex */
public class cc implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.PermissionSettingUI2 f283452d;

    public cc(com.tencent.mm.plugin.profile.ui.PermissionSettingUI2 permissionSettingUI2) {
        this.f283452d = permissionSettingUI2;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.profile.ui.PermissionSettingUI2 permissionSettingUI2 = this.f283452d;
        permissionSettingUI2.hideVKB();
        permissionSettingUI2.setResult(-1, new android.content.Intent());
        permissionSettingUI2.finish();
        return true;
    }
}
