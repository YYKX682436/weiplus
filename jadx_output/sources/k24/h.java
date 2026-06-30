package k24;

/* loaded from: classes11.dex */
public final class h implements j35.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.notify.SettingSwitchNotifyNewMsg f303759a;

    public h(com.tencent.mm.plugin.setting.ui.setting_new.settings.notify.SettingSwitchNotifyNewMsg settingSwitchNotifyNewMsg) {
        this.f303759a = settingSwitchNotifyNewMsg;
    }

    @Override // j35.g0
    public final void a(int i17, int i18, android.content.Intent intent) {
        boolean u17 = ip.b.u();
        com.tencent.mm.plugin.setting.ui.setting_new.settings.notify.SettingSwitchNotifyNewMsg settingSwitchNotifyNewMsg = this.f303759a;
        if (!u17) {
            settingSwitchNotifyNewMsg.s7();
            return;
        }
        settingSwitchNotifyNewMsg.f161957i = true;
        ip.l.r(true);
        settingSwitchNotifyNewMsg.s7();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(500L, 0L, 1L, false);
        c01.a9.b(true, false);
    }
}
