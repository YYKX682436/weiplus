package gc3;

/* loaded from: classes9.dex */
public final class r implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.voice.LuckyMoneyVoiceTransLayout f270439d;

    public r(com.tencent.mm.plugin.luckymoney.ui.voice.LuckyMoneyVoiceTransLayout luckyMoneyVoiceTransLayout) {
        this.f270439d = luckyMoneyVoiceTransLayout;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        android.view.View view;
        com.tencent.mm.plugin.luckymoney.ui.voice.LuckyMoneyVoiceTransLayout luckyMoneyVoiceTransLayout = this.f270439d;
        long j17 = luckyMoneyVoiceTransLayout.f147617q;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        luckyMoneyVoiceTransLayout.f147618r = java.lang.System.currentTimeMillis() - j17;
        gc3.n voiceListener = luckyMoneyVoiceTransLayout.getVoiceListener();
        if (voiceListener == null) {
            return true;
        }
        int i17 = (int) luckyMoneyVoiceTransLayout.f147618r;
        com.tencent.mm.plugin.luckymoney.ui.nh nhVar = (com.tencent.mm.plugin.luckymoney.ui.nh) voiceListener;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearSendUIV2", "onDetectProcess useTime:%s", java.lang.Integer.valueOf(i17));
        if (i17 < 50000) {
            return true;
        }
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2 = nhVar.f147242a;
        if (!luckyMoneyNewYearSendUIV2.F2.e() || (view = luckyMoneyNewYearSendUIV2.f146405h) == null) {
            return true;
        }
        view.post(new com.tencent.mm.plugin.luckymoney.ui.jh(nhVar));
        return true;
    }
}
