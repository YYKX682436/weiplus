package k24;

/* loaded from: classes11.dex */
public final class e implements com.tencent.mm.ui.widget.dialog.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.notify.SettingSwitchNotifyInvite f303756a;

    public e(com.tencent.mm.plugin.setting.ui.setting_new.settings.notify.SettingSwitchNotifyInvite settingSwitchNotifyInvite) {
        this.f303756a = settingSwitchNotifyInvite;
    }

    @Override // com.tencent.mm.ui.widget.dialog.b1
    public void a() {
        ip.l.s(true);
        com.tencent.mm.plugin.setting.ui.setting_new.settings.notify.SettingSwitchNotifyInvite settingSwitchNotifyInvite = this.f303756a;
        settingSwitchNotifyInvite.f161955i = true;
        settingSwitchNotifyInvite.s7();
        c01.a9.b(false, true);
    }
}
