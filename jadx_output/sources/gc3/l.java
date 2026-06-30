package gc3;

/* loaded from: classes12.dex */
public class l implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.voice.LuckyMoneyVoiceLayout f270434d;

    public l(com.tencent.mm.plugin.luckymoney.ui.voice.LuckyMoneyVoiceLayout luckyMoneyVoiceLayout) {
        this.f270434d = luckyMoneyVoiceLayout;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.luckymoney.ui.voice.LuckyMoneyVoiceLayout luckyMoneyVoiceLayout = this.f270434d;
        tl.d dVar = luckyMoneyVoiceLayout.f147606f;
        if (dVar == null) {
            return true;
        }
        int d17 = dVar.d();
        if (luckyMoneyVoiceLayout.f147611n == 2) {
            luckyMoneyVoiceLayout.getClass();
            luckyMoneyVoiceLayout.b(new gc3.k(luckyMoneyVoiceLayout, d17));
        }
        return true;
    }
}
