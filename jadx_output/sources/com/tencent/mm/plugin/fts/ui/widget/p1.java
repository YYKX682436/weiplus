package com.tencent.mm.plugin.fts.ui.widget;

/* loaded from: classes15.dex */
public class p1 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.widget.VoiceInputLayout f138314a;

    public p1(com.tencent.mm.plugin.fts.ui.widget.VoiceInputLayout voiceInputLayout) {
        this.f138314a = voiceInputLayout;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        int i17 = message.what;
        com.tencent.mm.plugin.fts.ui.widget.VoiceInputLayout voiceInputLayout = this.f138314a;
        if (i17 != 0) {
            if (i17 != 1) {
                return;
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.VoiceInputLayout", "Recognized revealTime force finished %s", java.lang.Integer.valueOf(voiceInputLayout.f138233f));
            }
        }
        int i18 = voiceInputLayout.f138233f;
        if (voiceInputLayout.f138233f != 3) {
            return;
        }
        voiceInputLayout.f138238n.removeMessages(0);
        voiceInputLayout.f138238n.removeMessages(1);
        z21.e eVar = voiceInputLayout.f138232e;
        if (eVar != null) {
            eVar.cancel(true);
        }
        voiceInputLayout.k(true);
    }
}
