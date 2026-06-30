package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes15.dex */
public class p3 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.VoiceInputLayout f191052a;

    public p3(com.tencent.mm.pluginsdk.ui.VoiceInputLayout voiceInputLayout) {
        this.f191052a = voiceInputLayout;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        int i17 = message.what;
        com.tencent.mm.pluginsdk.ui.VoiceInputLayout voiceInputLayout = this.f191052a;
        if (i17 != 0) {
            if (i17 != 1) {
                return;
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.VoiceInputLayout", "Recognized revealTime force finished %s", java.lang.Integer.valueOf(voiceInputLayout.f189856g));
            }
        }
        int i18 = voiceInputLayout.f189856g;
        if (voiceInputLayout.f189856g != 3) {
            return;
        }
        voiceInputLayout.f189861o.removeMessages(0);
        voiceInputLayout.f189861o.removeMessages(1);
        z21.w wVar = voiceInputLayout.f189854e;
        if (wVar != null) {
            wVar.cancel(true);
        }
        voiceInputLayout.h(true);
    }
}
