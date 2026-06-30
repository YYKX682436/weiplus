package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes14.dex */
public final class hf implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestUI f161111d;

    public hf(com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestUI settingsHearingAidTestUI) {
        this.f161111d = settingsHearingAidTestUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.TextView textView = this.f161111d.f160459e;
        if (textView != null) {
            textView.setVisibility(4);
        } else {
            kotlin.jvm.internal.o.o("tipsInfo");
            throw null;
        }
    }
}
