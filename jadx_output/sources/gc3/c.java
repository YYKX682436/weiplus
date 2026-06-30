package gc3;

/* loaded from: classes9.dex */
public final class c extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.voice.LuckyMoneyVoiceInputLayout f270423a;

    public c(com.tencent.mm.plugin.luckymoney.ui.voice.LuckyMoneyVoiceInputLayout luckyMoneyVoiceInputLayout) {
        this.f270423a = luckyMoneyVoiceInputLayout;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message msg) {
        gc3.a aVar;
        kotlin.jvm.internal.o.g(msg, "msg");
        int i17 = msg.what;
        com.tencent.mm.plugin.luckymoney.ui.voice.LuckyMoneyVoiceInputLayout luckyMoneyVoiceInputLayout = this.f270423a;
        if (i17 != 0) {
            if (i17 != 1) {
                return;
            }
            android.os.Bundle data = msg.getData();
            data.getInt("localCode");
            data.getInt("errType");
            data.getInt("errCode");
            luckyMoneyVoiceInputLayout.getClass();
            return;
        }
        int i18 = luckyMoneyVoiceInputLayout.currentState;
        if (i18 != 2) {
            return;
        }
        if (i18 == 2 && (aVar = luckyMoneyVoiceInputLayout.voiceDetectListener) != null) {
            ((gc3.o) aVar).a();
        }
        luckyMoneyVoiceInputLayout.currentState = 3;
        com.tencent.mm.sdk.platformtools.n3 n3Var = luckyMoneyVoiceInputLayout.f147601n;
        n3Var.removeMessages(0);
        n3Var.sendEmptyMessageDelayed(0, luckyMoneyVoiceInputLayout.f147599i);
        n3Var.sendEmptyMessageDelayed(1, luckyMoneyVoiceInputLayout.f147600m);
        luckyMoneyVoiceInputLayout.e(false);
    }
}
