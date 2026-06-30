package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes14.dex */
public final class ge implements tl.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestEnvironmentUI f161075a;

    public ge(com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestEnvironmentUI settingsHearingAidTestEnvironmentUI) {
        this.f161075a = settingsHearingAidTestEnvironmentUI;
    }

    @Override // tl.c
    public void a(int i17, int i18) {
        com.tencent.mars.xlog.Log.e("MicroMsg.SettingsHearingAidTestEnvironmentUI", "audioDetect onRecError: " + i17 + ", " + i18);
    }

    @Override // tl.c
    public void b(byte[] bArr, int i17) {
        wd0.l1 l1Var = (wd0.l1) i95.n0.c(wd0.l1.class);
        com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestEnvironmentUI settingsHearingAidTestEnvironmentUI = this.f161075a;
        long j17 = settingsHearingAidTestEnvironmentUI.f160451u;
        ((u14.t) l1Var).getClass();
        int EstAmbSoundLevel = com.tencent.mm.plugin.setting.ui.setting.WaveAudioHAid.EstAmbSoundLevel(j17, bArr, com.tencent.mapsdk.internal.km.f50100e, 16000, 1);
        if (EstAmbSoundLevel == -100 || EstAmbSoundLevel == -200) {
            return;
        }
        settingsHearingAidTestEnvironmentUI.f160450t.add(java.lang.Integer.valueOf(EstAmbSoundLevel));
        if (settingsHearingAidTestEnvironmentUI.f160450t.size() % 5 == 0) {
            double L = kz5.n0.L(settingsHearingAidTestEnvironmentUI.f160450t.subList(r14.size() - 3, settingsHearingAidTestEnvironmentUI.f160450t.size()));
            settingsHearingAidTestEnvironmentUI.getClass();
            double d17 = 1;
            double d18 = 2;
            int max = java.lang.Math.max((int) (java.lang.Math.max((java.lang.Math.tanh((L - (-20.0d)) / 8.0d) + d17) / d18, (((java.lang.Math.tanh((-10) / 8.0d) + d17) / d18) / 30) * (60 + L)) * 100), 1);
            com.tencent.mm.transvoice.ui.SoundWaveView soundWaveView = settingsHearingAidTestEnvironmentUI.f160440g;
            if (soundWaveView == null) {
                kotlin.jvm.internal.o.o("newVoice2txtTxtReactWave");
                throw null;
            }
            soundWaveView.i(max);
        }
        if (settingsHearingAidTestEnvironmentUI.f160450t.size() == 25) {
            android.os.Message message = new android.os.Message();
            message.obj = java.lang.Boolean.valueOf(((float) ((int) kz5.n0.L(settingsHearingAidTestEnvironmentUI.f160450t))) < settingsHearingAidTestEnvironmentUI.f160448r);
            settingsHearingAidTestEnvironmentUI.f160455y.sendMessage(message);
            settingsHearingAidTestEnvironmentUI.f160450t.clear();
        }
    }
}
