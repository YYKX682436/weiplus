package u24;

/* loaded from: classes.dex */
public final class b implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f424117a;

    public b(android.content.Context context) {
        this.f424117a = context;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        android.content.Context context = this.f424117a;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.setting.SettingsModifyAliasUI.class);
        intent.putExtra("WizardRootClass", com.tencent.mm.plugin.setting.ui.setting.SettingsAccountInfoUI.class.getCanonicalName());
        com.tencent.mm.ui.MMWizardActivity.X6(context, intent);
    }
}
