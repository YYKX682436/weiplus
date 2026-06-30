package hr3;

/* loaded from: classes.dex */
public class wb implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.PermissionSettingUI f284153d;

    public wb(com.tencent.mm.plugin.profile.ui.PermissionSettingUI permissionSettingUI) {
        this.f284153d = permissionSettingUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.profile.ui.PermissionSettingUI permissionSettingUI = this.f284153d;
        permissionSettingUI.hideVKB();
        permissionSettingUI.setResult(-1, new android.content.Intent());
        permissionSettingUI.finish();
        return true;
    }
}
