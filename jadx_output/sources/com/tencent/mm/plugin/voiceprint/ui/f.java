package com.tencent.mm.plugin.voiceprint.ui;

/* loaded from: classes15.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voiceprint.ui.BaseVoicePrintUI f176246d;

    public f(com.tencent.mm.plugin.voiceprint.ui.BaseVoicePrintUI baseVoicePrintUI) {
        this.f176246d = baseVoicePrintUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.voiceprint.ui.BaseVoicePrintUI baseVoicePrintUI = this.f176246d;
        baseVoicePrintUI.f176168h.setErr(com.tencent.mm.R.string.k_4);
        baseVoicePrintUI.f176168h.c();
        com.tencent.mm.plugin.voiceprint.ui.VoicePrintVolumeMeter voicePrintVolumeMeter = baseVoicePrintUI.f176167g;
        voicePrintVolumeMeter.f176222p = false;
        voicePrintVolumeMeter.f176221o = -1.0f;
        voicePrintVolumeMeter.f176223q = false;
        voicePrintVolumeMeter.f176220n = 0.0f;
        voicePrintVolumeMeter.postInvalidate();
        voicePrintVolumeMeter.f176223q = false;
        voicePrintVolumeMeter.f176217h.d();
        voicePrintVolumeMeter.postInvalidate();
    }
}
