package gc3;

/* loaded from: classes9.dex */
public final class b implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.voice.LuckyMoneyVoiceInputLayout f270422d;

    public b(com.tencent.mm.plugin.luckymoney.ui.voice.LuckyMoneyVoiceInputLayout luckyMoneyVoiceInputLayout) {
        this.f270422d = luckyMoneyVoiceInputLayout;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        com.tencent.mm.plugin.luckymoney.ui.voice.LuckyMoneyVoiceInputLayout luckyMoneyVoiceInputLayout = this.f270422d;
        z21.e eVar = luckyMoneyVoiceInputLayout.f147596f;
        if (eVar == null) {
            return true;
        }
        kotlin.jvm.internal.o.d(eVar);
        int maxAmplitudeRate = eVar.getMaxAmplitudeRate();
        if (luckyMoneyVoiceInputLayout.getCurrentState() == 2) {
            luckyMoneyVoiceInputLayout.i(maxAmplitudeRate);
        }
        return true;
    }
}
