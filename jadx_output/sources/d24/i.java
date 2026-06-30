package d24;

/* loaded from: classes11.dex */
public final class i implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonExitAccount f225929d;

    public i(com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonExitAccount settingButtonExitAccount) {
        this.f225929d = settingButtonExitAccount;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 qscene) {
        kotlin.jvm.internal.o.g(qscene, "qscene");
        qscene.getType();
        com.tencent.mm.sdk.platformtools.u3.h(new d24.h(this.f225929d, qscene, i18, i17));
    }
}
