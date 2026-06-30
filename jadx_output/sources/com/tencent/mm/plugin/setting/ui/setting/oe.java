package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes14.dex */
public final class oe extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestUI f161389d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f161390e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oe(com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestUI settingsHearingAidTestUI, boolean z17) {
        super(0);
        this.f161389d = settingsHearingAidTestUI;
        this.f161390e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestUI settingsHearingAidTestUI = this.f161389d;
        com.tencent.mm.plugin.setting.ui.setting.me meVar = settingsHearingAidTestUI.K;
        com.tencent.mm.plugin.setting.ui.setting.me meVar2 = com.tencent.mm.plugin.setting.ui.setting.me.f161327d;
        boolean z17 = this.f161390e;
        if (meVar == meVar2) {
            android.widget.TextView textView = settingsHearingAidTestUI.f160458d;
            if (textView == null) {
                kotlin.jvm.internal.o.o("titleTV");
                throw null;
            }
            textView.setText(z17 ? settingsHearingAidTestUI.getString(com.tencent.mm.R.string.o5d) : settingsHearingAidTestUI.getString(com.tencent.mm.R.string.p0p));
        } else {
            android.widget.TextView textView2 = settingsHearingAidTestUI.f160458d;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("titleTV");
                throw null;
            }
            textView2.setText(z17 ? settingsHearingAidTestUI.getString(com.tencent.mm.R.string.o5x) : settingsHearingAidTestUI.getString(com.tencent.mm.R.string.f493781p16));
        }
        android.widget.TextView textView3 = settingsHearingAidTestUI.f160458d;
        if (textView3 != null) {
            sa5.d.c(textView3, 0.0f, 0L, com.tencent.mm.plugin.setting.ui.setting.ne.f161359d, 3, null);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("titleTV");
        throw null;
    }
}
