package l24;

/* loaded from: classes.dex */
public final class c implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.notify.content.SettingSwitchNotifyContentDisplayName f315208a;

    public c(com.tencent.mm.plugin.setting.ui.setting_new.settings.notify.content.SettingSwitchNotifyContentDisplayName settingSwitchNotifyContentDisplayName) {
        this.f315208a = settingSwitchNotifyContentDisplayName;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        w14.d dVar = w14.d.f442234d;
        dVar.c();
        int i17 = w14.d.f442235e.f442233d;
        if (!z17) {
            dVar.h(3);
        } else if (i17 == 0 || i17 == 3) {
            dVar.g(true);
            dVar.h(1);
        }
        this.f315208a.s7();
    }
}
