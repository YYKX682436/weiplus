package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes14.dex */
public final class lc extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardViewManager f161291d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f161292e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lc(com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardViewManager settingsHearingAidAudioCardViewManager, int i17) {
        super(0);
        this.f161291d = settingsHearingAidAudioCardViewManager;
        this.f161292e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardViewManager settingsHearingAidAudioCardViewManager = this.f161291d;
        ((android.widget.LinearLayout) settingsHearingAidAudioCardViewManager.f160413i.get(settingsHearingAidAudioCardViewManager.f160411g)).setVisibility(8);
        int i17 = this.f161292e;
        settingsHearingAidAudioCardViewManager.f160411g = i17;
        settingsHearingAidAudioCardViewManager.f160412h = false;
        if (settingsHearingAidAudioCardViewManager.isAutoPlay) {
            settingsHearingAidAudioCardViewManager.f160410f = true;
            java.lang.Object obj = settingsHearingAidAudioCardViewManager.f160413i.get(i17);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            java.lang.Object k17 = q26.h0.k(new n3.r1((android.view.ViewGroup) obj));
            kotlin.jvm.internal.o.e(k17, "null cannot be cast to non-null type com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView");
            int i18 = com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView.f160392v;
            ((com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView) k17).a(false);
        }
        return jz5.f0.f302826a;
    }
}
