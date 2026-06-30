package com.tencent.mm.plugin.fts.ui.widget;

/* loaded from: classes15.dex */
public class r1 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.widget.VoiceInputLayout f138320a;

    public r1(com.tencent.mm.plugin.fts.ui.widget.VoiceInputLayout voiceInputLayout) {
        this.f138320a = voiceInputLayout;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        int i17 = message.what;
        com.tencent.mm.plugin.fts.ui.widget.VoiceInputLayout voiceInputLayout = this.f138320a;
        if (i17 == 0) {
            if (voiceInputLayout.f138233f != 2) {
                return;
            }
            voiceInputLayout.f138233f = 3;
            com.tencent.mm.sdk.platformtools.n3 n3Var = voiceInputLayout.f138238n;
            n3Var.removeMessages(0);
            n3Var.sendEmptyMessageDelayed(0, voiceInputLayout.f138235h);
            n3Var.sendEmptyMessageDelayed(1, voiceInputLayout.f138236i);
            voiceInputLayout.e(false);
            return;
        }
        if (i17 != 1) {
            return;
        }
        android.os.Bundle data = message.getData();
        int i18 = data.getInt("localCode");
        int i19 = data.getInt("errType");
        int i27 = data.getInt("errCode");
        voiceInputLayout.f138233f = 1;
        voiceInputLayout.j();
        com.tencent.mm.plugin.fts.ui.widget.u1 u1Var = voiceInputLayout.f138231d;
        if (u1Var != null) {
            ((com.tencent.mm.plugin.fts.ui.widget.y0) u1Var).a(i18, i19, i27);
        }
    }
}
