package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes15.dex */
public class r3 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.VoiceInputLayout f191098a;

    public r3(com.tencent.mm.pluginsdk.ui.VoiceInputLayout voiceInputLayout) {
        this.f191098a = voiceInputLayout;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        int i17 = message.what;
        com.tencent.mm.pluginsdk.ui.VoiceInputLayout voiceInputLayout = this.f191098a;
        if (i17 == 0) {
            if (voiceInputLayout.f189856g != 2) {
                return;
            }
            voiceInputLayout.f189856g = 3;
            com.tencent.mm.sdk.platformtools.n3 n3Var = voiceInputLayout.f189861o;
            n3Var.removeMessages(0);
            n3Var.sendEmptyMessageDelayed(0, voiceInputLayout.f189858i);
            n3Var.sendEmptyMessageDelayed(1, voiceInputLayout.f189859m);
            voiceInputLayout.d(false);
            return;
        }
        if (i17 != 1) {
            return;
        }
        android.os.Bundle data = message.getData();
        int i18 = data.getInt("localCode");
        int i19 = data.getInt("errType");
        int i27 = data.getInt("errCode");
        voiceInputLayout.f189856g = 1;
        voiceInputLayout.f();
        com.tencent.mm.pluginsdk.ui.u3 u3Var = voiceInputLayout.f189853d;
        if (u3Var != null) {
            u3Var.g(i18, i19, i27);
        }
    }
}
