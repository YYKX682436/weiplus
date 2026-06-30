package gc3;

/* loaded from: classes9.dex */
public final class e extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.voice.LuckyMoneyVoiceInputLayout f270425a;

    public e(com.tencent.mm.plugin.luckymoney.ui.voice.LuckyMoneyVoiceInputLayout luckyMoneyVoiceInputLayout) {
        this.f270425a = luckyMoneyVoiceInputLayout;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        int i17 = msg.what;
        com.tencent.mm.plugin.luckymoney.ui.voice.LuckyMoneyVoiceInputLayout luckyMoneyVoiceInputLayout = this.f270425a;
        if (i17 != 0) {
            if (i17 != 1) {
                return;
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.LuckyMoneyVoiceInputLayout", "Recognized revealTime force finished %s", java.lang.Integer.valueOf(luckyMoneyVoiceInputLayout.getCurrentState()));
            }
        }
        luckyMoneyVoiceInputLayout.getCurrentState();
        if (luckyMoneyVoiceInputLayout.getCurrentState() != 3) {
            return;
        }
        removeMessages(0);
        removeMessages(1);
        z21.e eVar = luckyMoneyVoiceInputLayout.f147596f;
        if (eVar != null) {
            eVar.cancel(true);
        }
        if (luckyMoneyVoiceInputLayout.currentState == 1) {
            return;
        }
        luckyMoneyVoiceInputLayout.currentState = 1;
        luckyMoneyVoiceInputLayout.j();
        if (luckyMoneyVoiceInputLayout.voiceDetectListener != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyVoiceTransLayout", "onStateReset, someone like prepare state");
        }
    }
}
