package iy2;

/* loaded from: classes15.dex */
public final class i extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputLayout f295896a;

    public i(com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputLayout finderLiveVoiceInputLayout) {
        this.f295896a = finderLiveVoiceInputLayout;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        int i17 = msg.what;
        com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputLayout finderLiveVoiceInputLayout = this.f295896a;
        if (i17 != 0) {
            if (i17 != 1) {
                return;
            } else {
                com.tencent.mars.xlog.Log.w(finderLiveVoiceInputLayout.f136744d, "Recognized revealTime force finished %s", java.lang.Integer.valueOf(finderLiveVoiceInputLayout.getCurrentState()));
            }
        }
        java.lang.String str = finderLiveVoiceInputLayout.f136744d;
        finderLiveVoiceInputLayout.getCurrentState();
        if (finderLiveVoiceInputLayout.getCurrentState() != finderLiveVoiceInputLayout.getSTATE_WAITING()) {
            return;
        }
        removeMessages(0);
        removeMessages(1);
        z21.e eVar = finderLiveVoiceInputLayout.f136746f;
        if (eVar != null) {
            kotlin.jvm.internal.o.d(eVar);
            eVar.cancel(true);
        }
        finderLiveVoiceInputLayout.f(true);
    }
}
