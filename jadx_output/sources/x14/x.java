package x14;

/* loaded from: classes15.dex */
public final class x implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.view.SettingPermissionView f451469d;

    public x(com.tencent.mm.plugin.setting.ui.setting.view.SettingPermissionView settingPermissionView) {
        this.f451469d = settingPermissionView;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public final void onDismiss() {
        java.lang.String string;
        com.tencent.mm.plugin.setting.ui.setting.view.SettingPermissionView settingPermissionView = this.f451469d;
        android.widget.TextView textView = settingPermissionView.f161662i;
        if (textView == null) {
            kotlin.jvm.internal.o.o("mItemStatusTextView");
            throw null;
        }
        com.tencent.mm.sdk.platformtools.o4 o4Var = settingPermissionView.f161663m;
        if (o4Var == null) {
            kotlin.jvm.internal.o.o("mmkv");
            throw null;
        }
        if (o4Var.getBoolean(settingPermissionView.getBusiness(), settingPermissionView.a(settingPermissionView.getPermission(), settingPermissionView.getBusiness()))) {
            string = "";
        } else {
            android.content.Context context = settingPermissionView.f161658e;
            if (context == null) {
                kotlin.jvm.internal.o.o("mContext");
                throw null;
            }
            string = context.getString(com.tencent.mm.R.string.ivr);
        }
        textView.setText(string);
    }
}
