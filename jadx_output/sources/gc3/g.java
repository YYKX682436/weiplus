package gc3;

/* loaded from: classes12.dex */
public class g implements com.tencent.mm.modelbase.e1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.voice.LuckyMoneyVoiceLayout f270427a;

    public g(com.tencent.mm.plugin.luckymoney.ui.voice.LuckyMoneyVoiceLayout luckyMoneyVoiceLayout) {
        this.f270427a = luckyMoneyVoiceLayout;
    }

    @Override // com.tencent.mm.modelbase.e1
    public void a() {
        com.tencent.mm.plugin.luckymoney.ui.voice.LuckyMoneyVoiceLayout luckyMoneyVoiceLayout = this.f270427a;
        com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyVoiceLayout", "onError state:%s errState:%s", java.lang.Integer.valueOf(luckyMoneyVoiceLayout.f147606f.getStatus()), java.lang.Integer.valueOf(luckyMoneyVoiceLayout.f147606f.a()));
        luckyMoneyVoiceLayout.getClass();
    }
}
