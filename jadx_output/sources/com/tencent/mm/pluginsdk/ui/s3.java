package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes15.dex */
public class s3 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.VoiceInputLayout f191104d;

    public s3(com.tencent.mm.pluginsdk.ui.VoiceInputLayout voiceInputLayout) {
        this.f191104d = voiceInputLayout;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.pluginsdk.ui.VoiceInputLayout voiceInputLayout = this.f191104d;
        z21.w wVar = voiceInputLayout.f189854e;
        if (wVar == null) {
            return true;
        }
        int maxAmplitudeRate = wVar.getMaxAmplitudeRate();
        if (voiceInputLayout.f189856g == 2) {
            voiceInputLayout.e(maxAmplitudeRate);
        }
        return true;
    }
}
