package com.tencent.mm.plugin.voiceprint.ui;

/* loaded from: classes15.dex */
public class a implements fq4.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voiceprint.ui.BaseVoicePrintUI f176230a;

    public a(com.tencent.mm.plugin.voiceprint.ui.BaseVoicePrintUI baseVoicePrintUI) {
        this.f176230a = baseVoicePrintUI;
    }

    public void a() {
        com.tencent.mm.plugin.voiceprint.ui.BaseVoicePrintUI baseVoicePrintUI = this.f176230a;
        fq4.d0 d0Var = baseVoicePrintUI.f176169i;
        w21.k0 k0Var = d0Var.f265580a;
        if (k0Var != null) {
            k0Var.stopRecord();
            com.tencent.mars.xlog.Log.e("MicroMsg.VoicePrintRecoder", "Reset recorder.stopReocrd");
        }
        d0Var.f265581b = "";
        d0Var.f265583d = 0;
        d0Var.f265582c = 0L;
        d0Var.f265585f.C(true);
        com.tencent.mars.xlog.Log.e("MicroMsg.BaseVoicePrintUI", "record stop on error");
        baseVoicePrintUI.f176171n = null;
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.voiceprint.ui.f(baseVoicePrintUI));
    }
}
