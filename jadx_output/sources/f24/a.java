package f24;

/* loaded from: classes11.dex */
public final class a implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.display.SettingSwitchHorizontalScreen f259088a;

    public a(com.tencent.mm.plugin.setting.ui.setting_new.settings.display.SettingSwitchHorizontalScreen settingSwitchHorizontalScreen) {
        this.f259088a = settingSwitchHorizontalScreen;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        com.tencent.mm.plugin.setting.ui.setting_new.settings.display.SettingSwitchHorizontalScreen settingSwitchHorizontalScreen = this.f259088a;
        android.preference.PreferenceManager.getDefaultSharedPreferences(settingSwitchHorizontalScreen.getContext()).edit().putBoolean("settings_landscape_mode", z17).apply();
        settingSwitchHorizontalScreen.f161909h = z17;
        settingSwitchHorizontalScreen.t7(settingSwitchHorizontalScreen.getActivity().getIntent());
        if (z17) {
            com.tencent.mm.ui.ee.c(1);
            settingSwitchHorizontalScreen.getContext().setRequestedOrientation(-1);
        } else {
            com.tencent.mm.ui.ee.c(0);
            settingSwitchHorizontalScreen.getContext().setRequestedOrientation(1);
        }
    }
}
