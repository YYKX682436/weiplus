package k24;

/* loaded from: classes11.dex */
public final class l implements com.tencent.mm.ui.widget.dialog.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.notify.SettingSwitchNotifyNewMsg f303763a;

    public l(com.tencent.mm.plugin.setting.ui.setting_new.settings.notify.SettingSwitchNotifyNewMsg settingSwitchNotifyNewMsg) {
        this.f303763a = settingSwitchNotifyNewMsg;
    }

    @Override // com.tencent.mm.ui.widget.dialog.b1
    public void a() {
        ip.l.r(true);
        com.tencent.mm.plugin.setting.ui.setting_new.settings.notify.SettingSwitchNotifyNewMsg settingSwitchNotifyNewMsg = this.f303763a;
        settingSwitchNotifyNewMsg.f161957i = true;
        settingSwitchNotifyNewMsg.s7();
    }
}
