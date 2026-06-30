package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes10.dex */
public class l3 implements com.tencent.mm.pluginsdk.ui.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.VoiceInputFooter f190888a;

    public l3(com.tencent.mm.pluginsdk.ui.VoiceInputFooter voiceInputFooter) {
        this.f190888a = voiceInputFooter;
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void a(java.lang.String str) {
        try {
            this.f190888a.f189844q.n(str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.VoiceInputFooter", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void b() {
        com.tencent.mm.pluginsdk.ui.VoiceInputFooter voiceInputFooter = this.f190888a;
        voiceInputFooter.f189844q.getInputConnection().sendKeyEvent(new android.view.KeyEvent(0, 67));
        voiceInputFooter.f189844q.getInputConnection().sendKeyEvent(new android.view.KeyEvent(1, 67));
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void c(boolean z17) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void d() {
    }
}
