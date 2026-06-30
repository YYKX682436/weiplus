package com.tencent.mm.plugin.voiceprint.ui;

/* loaded from: classes15.dex */
public class e implements com.tencent.mm.sdk.platformtools.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voiceprint.ui.BaseVoicePrintUI f176243d;

    public e(com.tencent.mm.plugin.voiceprint.ui.BaseVoicePrintUI baseVoicePrintUI) {
        this.f176243d = baseVoicePrintUI;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        if (message.what != 1) {
            return false;
        }
        com.tencent.mm.sdk.platformtools.v5.c(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.f493318jq2, new com.tencent.mm.plugin.voiceprint.ui.d(this));
        com.tencent.mm.plugin.voiceprint.ui.BaseVoicePrintUI baseVoicePrintUI = this.f176243d;
        baseVoicePrintUI.f176171n = "voice_pt_voice_print_record.rec";
        fq4.d0 d0Var = baseVoicePrintUI.f176169i;
        d0Var.f265581b = "voice_pt_voice_print_record.rec";
        eq4.b bVar = d0Var.f265585f;
        bVar.getClass();
        ym1.f.f463134h.h(bVar, "record");
        bVar.f255904l = new fp.e(baseVoicePrintUI);
        int r17 = bVar.r("record", 4);
        bVar.f255905m = false;
        if (r17 != 0) {
            bVar.o(100);
        } else {
            new eq4.a(bVar).sendEmptyMessageDelayed(0, 50L);
        }
        baseVoicePrintUI.f176177t.c(100L, 100L);
        baseVoicePrintUI.f176168h.a();
        com.tencent.mm.plugin.voiceprint.ui.VoiceTipInfoView voiceTipInfoView = baseVoicePrintUI.f176168h;
        voiceTipInfoView.f176224d.getVisibility();
        if (voiceTipInfoView.f176224d.getVisibility() != 0 || voiceTipInfoView.f176225e) {
            voiceTipInfoView.f176224d.clearAnimation();
            voiceTipInfoView.f176224d.setVisibility(4);
            voiceTipInfoView.f176224d.invalidate();
        } else {
            voiceTipInfoView.f176224d.clearAnimation();
            voiceTipInfoView.f176225e = true;
            com.tencent.mm.plugin.voiceprint.ui.g1.a(voiceTipInfoView.f176224d, voiceTipInfoView.getContext(), new com.tencent.mm.plugin.voiceprint.ui.w0(voiceTipInfoView));
        }
        baseVoicePrintUI.f176168h.setTipText(baseVoicePrintUI.f176172o);
        com.tencent.mm.sdk.platformtools.b4 b4Var = baseVoicePrintUI.f176178u;
        b4Var.d();
        b4Var.c(500L, 500L);
        android.view.View view = baseVoicePrintUI.f176166f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/voiceprint/ui/BaseVoicePrintUI", "pressMic", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/voiceprint/ui/BaseVoicePrintUI", "pressMic", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.voiceprint.ui.VoicePrintVolumeMeter voicePrintVolumeMeter = baseVoicePrintUI.f176167g;
        voicePrintVolumeMeter.f176222p = false;
        voicePrintVolumeMeter.f176221o = -1.0f;
        voicePrintVolumeMeter.f176223q = false;
        voicePrintVolumeMeter.f176220n = 0.0f;
        voicePrintVolumeMeter.postInvalidate();
        voicePrintVolumeMeter.f176223q = true;
        com.tencent.mm.sdk.platformtools.b4 b4Var2 = voicePrintVolumeMeter.f176217h;
        long j17 = com.tencent.mm.plugin.voiceprint.ui.VoicePrintVolumeMeter.f176209t;
        b4Var2.c(j17, j17);
        voicePrintVolumeMeter.b();
        return true;
    }
}
