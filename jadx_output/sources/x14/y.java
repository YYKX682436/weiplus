package x14;

/* loaded from: classes8.dex */
public final class y implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.view.SettingPermissionView f451470d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.RoundedCornerFrameLayout f451471e;

    public y(com.tencent.mm.plugin.setting.ui.setting.view.SettingPermissionView settingPermissionView, com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout) {
        this.f451470d = settingPermissionView;
        this.f451471e = roundedCornerFrameLayout;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.clear();
        com.tencent.mm.plugin.setting.ui.setting.view.SettingPermissionView settingPermissionView = this.f451470d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = settingPermissionView.f161664n;
        if (k0Var != null) {
            k0Var.o(null);
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var2 = settingPermissionView.f161664n;
        if (k0Var2 != null) {
            k0Var2.o(this.f451471e);
        }
    }
}
