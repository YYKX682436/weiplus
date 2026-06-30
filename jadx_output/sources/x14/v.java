package x14;

/* loaded from: classes8.dex */
public final class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.view.SettingPermissionView f451467d;

    public v(com.tencent.mm.plugin.setting.ui.setting.view.SettingPermissionView settingPermissionView) {
        this.f451467d = settingPermissionView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/view/SettingPermissionView$showDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f451467d.f161664n;
        if (k0Var != null) {
            k0Var.u();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/view/SettingPermissionView$showDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
