package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes14.dex */
public final class mc extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardViewManager f161324d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f161325e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mc(com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardViewManager settingsHearingAidAudioCardViewManager, int i17) {
        super(0);
        this.f161324d = settingsHearingAidAudioCardViewManager;
        this.f161325e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardViewManager settingsHearingAidAudioCardViewManager = this.f161324d;
        java.util.ArrayList arrayList = settingsHearingAidAudioCardViewManager.f160413i;
        int i17 = this.f161325e;
        java.lang.Object obj = arrayList.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        sa5.d.c((android.view.View) obj, 0.0f, 0L, new com.tencent.mm.plugin.setting.ui.setting.lc(settingsHearingAidAudioCardViewManager, i17), 3, null);
        return jz5.f0.f302826a;
    }
}
