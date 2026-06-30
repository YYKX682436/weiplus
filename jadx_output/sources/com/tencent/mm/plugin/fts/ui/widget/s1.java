package com.tencent.mm.plugin.fts.ui.widget;

/* loaded from: classes15.dex */
public class s1 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.widget.VoiceInputLayout f138323d;

    public s1(com.tencent.mm.plugin.fts.ui.widget.VoiceInputLayout voiceInputLayout) {
        this.f138323d = voiceInputLayout;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.fts.ui.widget.VoiceInputLayout voiceInputLayout = this.f138323d;
        z21.e eVar = voiceInputLayout.f138232e;
        if (eVar == null) {
            return true;
        }
        int maxAmplitudeRate = eVar.getMaxAmplitudeRate();
        if (voiceInputLayout.f138233f == 2) {
            voiceInputLayout.i(maxAmplitudeRate);
        }
        return true;
    }
}
