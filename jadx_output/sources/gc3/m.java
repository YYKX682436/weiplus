package gc3;

/* loaded from: classes12.dex */
public class m implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.voice.LuckyMoneyVoiceLayout f270435d;

    public m(com.tencent.mm.plugin.luckymoney.ui.voice.LuckyMoneyVoiceLayout luckyMoneyVoiceLayout) {
        this.f270435d = luckyMoneyVoiceLayout;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.luckymoney.ui.voice.LuckyMoneyVoiceLayout luckyMoneyVoiceLayout = this.f270435d;
        long j17 = luckyMoneyVoiceLayout.f147609i;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        luckyMoneyVoiceLayout.f147610m = java.lang.System.currentTimeMillis() - j17;
        luckyMoneyVoiceLayout.getClass();
        return true;
    }
}
