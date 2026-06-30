package iy2;

/* loaded from: classes15.dex */
public final class f implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputLayout f295893d;

    public f(com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputLayout finderLiveVoiceInputLayout) {
        this.f295893d = finderLiveVoiceInputLayout;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputLayout finderLiveVoiceInputLayout = this.f295893d;
        z21.e eVar = finderLiveVoiceInputLayout.f136746f;
        if (eVar == null) {
            return true;
        }
        kotlin.jvm.internal.o.d(eVar);
        int maxAmplitudeRate = eVar.getMaxAmplitudeRate();
        if (finderLiveVoiceInputLayout.getCurrentState() == finderLiveVoiceInputLayout.getSTATE_STARTED()) {
            finderLiveVoiceInputLayout.d(maxAmplitudeRate);
        }
        return true;
    }
}
