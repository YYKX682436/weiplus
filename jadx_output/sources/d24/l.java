package d24;

/* loaded from: classes11.dex */
public final class l implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonExitAccount f225941a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f225942b;

    public l(com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonExitAccount settingButtonExitAccount, com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f225941a = settingButtonExitAccount;
        this.f225942b = z2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11545, java.lang.Integer.valueOf(this.f225941a.f161843h));
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseSettingItem", "reprot: MM_LightPushCloseWechat == OP_CloseCancel");
        this.f225942b.B();
    }
}
