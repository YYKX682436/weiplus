package d24;

/* loaded from: classes11.dex */
public final class g0 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonLogoutAccount f225922d;

    public g0(com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonLogoutAccount settingButtonLogoutAccount) {
        this.f225922d = settingButtonLogoutAccount;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 qscene) {
        kotlin.jvm.internal.o.g(qscene, "qscene");
        qscene.getType();
        com.tencent.mm.sdk.platformtools.u3.h(new d24.f0(this.f225922d, qscene, i18, i17));
    }
}
