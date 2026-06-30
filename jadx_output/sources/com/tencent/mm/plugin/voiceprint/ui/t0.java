package com.tencent.mm.plugin.voiceprint.ui;

/* loaded from: classes15.dex */
public class t0 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voiceprint.ui.VoicePrintVolumeMeter f176277d;

    public t0(com.tencent.mm.plugin.voiceprint.ui.VoicePrintVolumeMeter voicePrintVolumeMeter) {
        this.f176277d = voicePrintVolumeMeter;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.voiceprint.ui.VoicePrintVolumeMeter voicePrintVolumeMeter = this.f176277d;
        if (voicePrintVolumeMeter.f176223q) {
            if (voicePrintVolumeMeter.f176222p) {
                voicePrintVolumeMeter.f176220n *= com.tencent.mm.plugin.voiceprint.ui.VoicePrintVolumeMeter.f176211v + 1.0f;
            } else {
                voicePrintVolumeMeter.f176220n *= 1.0f - com.tencent.mm.plugin.voiceprint.ui.VoicePrintVolumeMeter.f176212w;
            }
            voicePrintVolumeMeter.postInvalidate();
        }
        return voicePrintVolumeMeter.f176223q;
    }
}
