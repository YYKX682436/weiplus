package u24;

/* loaded from: classes.dex */
public final class a implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f424116d;

    public a(android.content.Context context) {
        this.f424116d = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.Context context = this.f424116d;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.setting.SettingsModifyAliasUI.class);
        intent.putExtra("WizardRootClass", com.tencent.mm.plugin.setting.ui.setting.SettingsAccountInfoUI.class.getCanonicalName());
        com.tencent.mm.ui.MMWizardActivity.X6(context, intent);
    }
}
