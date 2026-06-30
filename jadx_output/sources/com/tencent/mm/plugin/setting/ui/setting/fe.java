package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes14.dex */
public final class fe implements android.os.Handler.Callback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestEnvironmentUI f161034d;

    public fe(com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestEnvironmentUI settingsHearingAidTestEnvironmentUI) {
        this.f161034d = settingsHearingAidTestEnvironmentUI;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestEnvironmentUI settingsHearingAidTestEnvironmentUI = this.f161034d;
        if (settingsHearingAidTestEnvironmentUI.isFinishing() || settingsHearingAidTestEnvironmentUI.isDestroyed()) {
            return true;
        }
        java.lang.Object obj = msg.obj;
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Boolean");
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        if (java.lang.System.currentTimeMillis() - settingsHearingAidTestEnvironmentUI.f160453w < 3000) {
            return true;
        }
        android.widget.TextView textView = settingsHearingAidTestEnvironmentUI.f160439f;
        if (textView == null) {
            kotlin.jvm.internal.o.o("titleTV");
            throw null;
        }
        textView.setVisibility(0);
        if (settingsHearingAidTestEnvironmentUI.f160454x == -1) {
            settingsHearingAidTestEnvironmentUI.f160454x = java.lang.System.currentTimeMillis();
        }
        java.lang.System.currentTimeMillis();
        long j17 = settingsHearingAidTestEnvironmentUI.f160454x;
        if (booleanValue) {
            android.widget.TextView textView2 = settingsHearingAidTestEnvironmentUI.f160439f;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("titleTV");
                throw null;
            }
            textView2.setText(settingsHearingAidTestEnvironmentUI.getString(com.tencent.mm.R.string.o67));
            android.widget.TextView textView3 = settingsHearingAidTestEnvironmentUI.f160439f;
            if (textView3 == null) {
                kotlin.jvm.internal.o.o("titleTV");
                throw null;
            }
            textView3.setTextColor(settingsHearingAidTestEnvironmentUI.getResources().getColor(com.tencent.mm.R.color.Brand_100));
            com.tencent.mm.transvoice.ui.SoundWaveView soundWaveView = settingsHearingAidTestEnvironmentUI.f160440g;
            if (soundWaveView == null) {
                kotlin.jvm.internal.o.o("newVoice2txtTxtReactWave");
                throw null;
            }
            soundWaveView.setWaveColor(settingsHearingAidTestEnvironmentUI.getResources().getColor(com.tencent.mm.R.color.Brand_100));
            if (java.lang.System.currentTimeMillis() - settingsHearingAidTestEnvironmentUI.f160454x > 1700 && !settingsHearingAidTestEnvironmentUI.f160446p) {
                com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestEnvironmentUI.T6(settingsHearingAidTestEnvironmentUI);
            }
        } else {
            android.widget.TextView textView4 = settingsHearingAidTestEnvironmentUI.f160439f;
            if (textView4 == null) {
                kotlin.jvm.internal.o.o("titleTV");
                throw null;
            }
            textView4.setText(settingsHearingAidTestEnvironmentUI.getString(com.tencent.mm.R.string.o66));
            android.widget.TextView textView5 = settingsHearingAidTestEnvironmentUI.f160439f;
            if (textView5 == null) {
                kotlin.jvm.internal.o.o("titleTV");
                throw null;
            }
            textView5.setTextColor(settingsHearingAidTestEnvironmentUI.getResources().getColor(com.tencent.mm.R.color.Yellow_100));
            com.tencent.mm.transvoice.ui.SoundWaveView soundWaveView2 = settingsHearingAidTestEnvironmentUI.f160440g;
            if (soundWaveView2 == null) {
                kotlin.jvm.internal.o.o("newVoice2txtTxtReactWave");
                throw null;
            }
            soundWaveView2.setWaveColor(settingsHearingAidTestEnvironmentUI.getResources().getColor(com.tencent.mm.R.color.Yellow_100));
            settingsHearingAidTestEnvironmentUI.f160454x = -1L;
        }
        return true;
    }
}
