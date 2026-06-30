package k24;

/* loaded from: classes11.dex */
public final class f implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.notify.SettingSwitchNotifyInvite f303757d;

    public f(com.tencent.mm.plugin.setting.ui.setting_new.settings.notify.SettingSwitchNotifyInvite settingSwitchNotifyInvite) {
        this.f303757d = settingSwitchNotifyInvite;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public void onDismiss() {
        ip.l.s(true);
        com.tencent.mm.plugin.setting.ui.setting_new.settings.notify.SettingSwitchNotifyInvite settingSwitchNotifyInvite = this.f303757d;
        settingSwitchNotifyInvite.f161955i = true;
        settingSwitchNotifyInvite.s7();
        c01.a9.b(false, true);
    }
}
