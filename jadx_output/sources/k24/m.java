package k24;

/* loaded from: classes11.dex */
public final class m implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.notify.SettingSwitchNotifyNewMsg f303764d;

    public m(com.tencent.mm.plugin.setting.ui.setting_new.settings.notify.SettingSwitchNotifyNewMsg settingSwitchNotifyNewMsg) {
        this.f303764d = settingSwitchNotifyNewMsg;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public void onDismiss() {
        ip.l.r(true);
        com.tencent.mm.plugin.setting.ui.setting_new.settings.notify.SettingSwitchNotifyNewMsg settingSwitchNotifyNewMsg = this.f303764d;
        settingSwitchNotifyNewMsg.f161957i = true;
        settingSwitchNotifyNewMsg.s7();
    }
}
