package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes12.dex */
public class a1 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI f138012d;

    public a1(com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI fTSBaseVoiceSearchUI) {
        this.f138012d = fTSBaseVoiceSearchUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI fTSBaseVoiceSearchUI = this.f138012d;
        z21.e eVar = fTSBaseVoiceSearchUI.S;
        if (eVar == null) {
            return true;
        }
        int maxAmplitudeRate = eVar.getMaxAmplitudeRate();
        com.tencent.mm.transvoice.ui.SoundWaveView soundWaveView = fTSBaseVoiceSearchUI.f137922o;
        if (soundWaveView != null && soundWaveView.getVisibility() == 0) {
            fTSBaseVoiceSearchUI.f137922o.i(maxAmplitudeRate);
        }
        return true;
    }
}
