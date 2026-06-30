package o24;

/* loaded from: classes.dex */
public final class i implements js4.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.personal_info.SettingActivityItemWeCoin f342462a;

    public i(com.tencent.mm.plugin.setting.ui.setting_new.settings.personal_info.SettingActivityItemWeCoin settingActivityItemWeCoin) {
        this.f342462a = settingActivityItemWeCoin;
    }

    @Override // js4.o
    public void a(int i17, int i18, java.lang.String str) {
    }

    @Override // js4.o
    public void onSuccess(java.lang.Object obj) {
        java.lang.String str;
        r45.fs3 response = (r45.fs3) obj;
        kotlin.jvm.internal.o.g(response, "response");
        boolean z17 = response.f374586e;
        com.tencent.mm.plugin.setting.ui.setting_new.settings.personal_info.SettingActivityItemWeCoin settingActivityItemWeCoin = this.f342462a;
        if (z17) {
            str = settingActivityItemWeCoin.getString(com.tencent.mm.R.string.isy);
        } else if (response.f374585d > 0) {
            str = response.f374585d + ' ' + settingActivityItemWeCoin.getString(com.tencent.mm.R.string.j1_);
        } else {
            str = "";
        }
        settingActivityItemWeCoin.getClass();
        kotlin.jvm.internal.o.g(str, "<set-?>");
        settingActivityItemWeCoin.f161987q = str;
        settingActivityItemWeCoin.w7();
    }
}
