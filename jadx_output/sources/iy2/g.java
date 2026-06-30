package iy2;

/* loaded from: classes15.dex */
public final class g extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputLayout f295894a;

    public g(com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputLayout finderLiveVoiceInputLayout) {
        this.f295894a = finderLiveVoiceInputLayout;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        int i17 = msg.what;
        int i18 = com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputLayout.f136743y;
        com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputLayout finderLiveVoiceInputLayout = this.f295894a;
        finderLiveVoiceInputLayout.getClass();
        if (i17 == 0) {
            if (finderLiveVoiceInputLayout.currentState != finderLiveVoiceInputLayout.STATE_STARTED) {
                return;
            }
            finderLiveVoiceInputLayout.currentState = finderLiveVoiceInputLayout.STATE_WAITING;
            com.tencent.mm.sdk.platformtools.n3 n3Var = finderLiveVoiceInputLayout.mmHandler;
            kotlin.jvm.internal.o.d(n3Var);
            n3Var.removeMessages(0);
            n3Var.sendEmptyMessageDelayed(0, finderLiveVoiceInputLayout.f136755r);
            n3Var.sendEmptyMessageDelayed(1, finderLiveVoiceInputLayout.f136756s);
            finderLiveVoiceInputLayout.c(false);
            return;
        }
        if (i17 == finderLiveVoiceInputLayout.f136748h) {
            android.os.Bundle data = msg.getData();
            int i19 = data.getInt("localCode");
            int i27 = data.getInt("errType");
            int i28 = data.getInt("errCode");
            finderLiveVoiceInputLayout.currentState = finderLiveVoiceInputLayout.STATE_PREPARED;
            finderLiveVoiceInputLayout.e();
            iy2.e eVar = finderLiveVoiceInputLayout.voiceDetectListener;
            if (eVar != null) {
                ((iy2.z) eVar).a(i19, i27, i28);
            }
        }
    }
}
