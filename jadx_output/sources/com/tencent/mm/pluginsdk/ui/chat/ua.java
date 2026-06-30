package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes15.dex */
public class ua implements com.tencent.mm.pluginsdk.ui.u3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ib f190687a;

    public ua(com.tencent.mm.pluginsdk.ui.chat.ib ibVar) {
        this.f190687a = ibVar;
    }

    @Override // com.tencent.mm.pluginsdk.ui.u3
    public void a(java.lang.String[] strArr, java.util.List list) {
        if (strArr == null || strArr.length <= 0 || strArr[0].length() <= 0) {
            return;
        }
        com.tencent.mm.pluginsdk.ui.chat.ib ibVar = this.f190687a;
        if (ibVar.H) {
            ibVar.H = false;
            com.tencent.mm.ui.widget.MMEditText mMEditText = ibVar.f190411n;
            if (mMEditText != null && mMEditText.getText() != null && ibVar.f190411n.getText().length() > 0) {
                if (ibVar.I.equalsIgnoreCase("。") || ibVar.I.equalsIgnoreCase(".")) {
                    if (!ibVar.f190419u || ibVar.f190411n.getSelectionStart() >= ibVar.f190411n.getText().length()) {
                        ibVar.L.e(ibVar.f190411n, ibVar.I, true);
                        ibVar.L.c(ibVar.f190411n);
                    }
                    ibVar.I = "";
                }
                java.lang.String obj = ibVar.f190411n.getText().toString();
                com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInputPanel", "addPunctuation msg = %s,msg.length() = %s", com.tencent.mm.sdk.platformtools.t8.G1(obj), java.lang.Integer.valueOf(obj.length()));
            }
        }
        ibVar.L.e(ibVar.f190411n, strArr[0], true);
        if (ibVar.f190411n.getText().length() != 0) {
            ibVar.f190411n.setCursorVisible(true);
            ibVar.f190411n.requestFocus();
            com.tencent.mm.sdk.platformtools.t8.t0(ibVar.f190403d);
        }
        if (!ibVar.B && strArr[0].length() != 0) {
            ibVar.B = true;
            ibVar.E = java.lang.System.currentTimeMillis();
            java.lang.System.currentTimeMillis();
            long j17 = ibVar.E;
            long j18 = ibVar.D;
        }
        ((java.util.ArrayList) ibVar.K).addAll(list);
    }

    @Override // com.tencent.mm.pluginsdk.ui.u3
    public void b() {
        com.tencent.mm.pluginsdk.ui.chat.ib ibVar = this.f190687a;
        ibVar.f190410m.c(false);
        ibVar.f190411n.setHint((java.lang.CharSequence) null);
        ibVar.f190407h.setVisibility((ibVar.T.size() < 2 || ibVar.f190411n.getText().length() > 0) ? 8 : 0);
        com.tencent.mm.autogen.events.VoiceInputStartEvent voiceInputStartEvent = new com.tencent.mm.autogen.events.VoiceInputStartEvent();
        voiceInputStartEvent.f54935g.f7501a = false;
        voiceInputStartEvent.e();
    }

    @Override // com.tencent.mm.pluginsdk.ui.u3
    public void c() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.pluginsdk.ui.chat.ib ibVar = this.f190687a;
        ibVar.D = currentTimeMillis;
        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInputPanel", "VoiceDetectListener onDetectStart time %s", java.lang.Long.valueOf(currentTimeMillis));
        ibVar.k(false);
        ibVar.B = false;
        ibVar.C = true;
        ibVar.H = true;
        ibVar.E = 0L;
        ibVar.o();
        ibVar.C = false;
        com.tencent.mm.pluginsdk.ui.o3 o3Var = ibVar.L;
        o3Var.f190922h = 3;
        o3Var.c(ibVar.f190411n);
        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInputPanel", "pauseMusic");
        ym1.f.f463134h.m();
        com.tencent.mm.ui.widget.MMEditText mMEditText = ibVar.f190411n;
        if (mMEditText != null) {
            if (mMEditText.getText() != null && ibVar.f190411n.getText().length() > 0) {
                ibVar.f190411n.setCursorVisible(true);
            }
            ibVar.f190411n.requestFocus();
            com.tencent.mm.sdk.platformtools.t8.t0(ibVar.f190403d);
        }
        android.content.Context context = ibVar.f190417s;
        if (context instanceof android.app.Activity) {
            ((android.app.Activity) context).getWindow().addFlags(128);
        }
        ibVar.f190406g.setVisibility(8);
        ibVar.f190404e.setVisibility(8);
        ibVar.f190405f.setVisibility(8);
        ibVar.f190411n.setHint(ibVar.getResources().getString(com.tencent.mm.R.string.k9b));
        ibVar.f190410m.c(true);
        ibVar.f190407h.setVisibility(8);
        ibVar.l(1);
        com.tencent.mm.autogen.events.VoiceInputStartEvent voiceInputStartEvent = new com.tencent.mm.autogen.events.VoiceInputStartEvent();
        voiceInputStartEvent.f54935g.f7501a = true;
        voiceInputStartEvent.e();
    }

    @Override // com.tencent.mm.pluginsdk.ui.u3
    public void d() {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInputPanel", "VoiceDetectListener onStateReset time %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        com.tencent.mm.pluginsdk.ui.chat.ib ibVar = this.f190687a;
        ibVar.L.d(ibVar.f190411n);
        ibVar.o();
        android.content.Context context = ibVar.f190417s;
        if (context instanceof android.app.Activity) {
            ((android.app.Activity) context).getWindow().clearFlags(128);
        }
        ibVar.g(3);
        ibVar.f190410m.c(false);
        ibVar.f190411n.setHint((java.lang.CharSequence) null);
        ibVar.k(true);
        com.tencent.mm.autogen.events.VoiceInputStartEvent voiceInputStartEvent = new com.tencent.mm.autogen.events.VoiceInputStartEvent();
        voiceInputStartEvent.f54935g.f7501a = false;
        voiceInputStartEvent.e();
    }

    @Override // com.tencent.mm.pluginsdk.ui.u3
    public void e() {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInputPanel", "VoiceDetectListener onDetectFinish  time %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        com.tencent.mm.pluginsdk.ui.chat.ib ibVar = this.f190687a;
        com.tencent.mm.pluginsdk.ui.chat.ib.c(ibVar);
        ibVar.L.d(ibVar.f190411n);
        ibVar.o();
        android.content.Context context = ibVar.f190417s;
        if (context instanceof android.app.Activity) {
            ((android.app.Activity) context).getWindow().clearFlags(128);
        }
        com.tencent.mm.plugin.report.kvdata.VoiceInputBehavior voiceInputBehavior = new com.tencent.mm.plugin.report.kvdata.VoiceInputBehavior();
        voiceInputBehavior.fail = 1;
        ibVar.i(voiceInputBehavior);
        ibVar.g(1);
        ibVar.f190410m.c(false);
        ibVar.f190411n.setHint((java.lang.CharSequence) null);
        com.tencent.mm.autogen.events.VoiceInputStartEvent voiceInputStartEvent = new com.tencent.mm.autogen.events.VoiceInputStartEvent();
        voiceInputStartEvent.f54935g.f7501a = false;
        voiceInputStartEvent.e();
    }

    @Override // com.tencent.mm.pluginsdk.ui.u3
    public void f() {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInputPanel", "VoiceDetectListener onDetectCancel time " + java.lang.System.currentTimeMillis());
        com.tencent.mm.pluginsdk.ui.chat.ib ibVar = this.f190687a;
        com.tencent.mm.pluginsdk.ui.chat.ib.c(ibVar);
        ibVar.L.d(ibVar.f190411n);
        ibVar.o();
        android.content.Context context = ibVar.f190417s;
        if (context instanceof android.app.Activity) {
            ((android.app.Activity) context).getWindow().clearFlags(128);
        }
        ibVar.g(2);
        ibVar.f190410m.c(false);
        ibVar.f190411n.setHint((java.lang.CharSequence) null);
        ibVar.f190407h.setVisibility((ibVar.T.size() < 2 || ibVar.f190411n.getText().length() > 0) ? 8 : 0);
        ibVar.k(true);
        com.tencent.mm.autogen.events.VoiceInputStartEvent voiceInputStartEvent = new com.tencent.mm.autogen.events.VoiceInputStartEvent();
        voiceInputStartEvent.f54935g.f7501a = false;
        voiceInputStartEvent.e();
    }

    @Override // com.tencent.mm.pluginsdk.ui.u3
    public void g(int i17, int i18, int i19) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInputPanel", "VoiceDetectListener onDetectError localerrorType = %s errorType = %s errCode = %s time %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        com.tencent.mm.pluginsdk.ui.chat.ib ibVar = this.f190687a;
        com.tencent.mm.pluginsdk.ui.chat.ib.c(ibVar);
        ibVar.L.d(ibVar.f190411n);
        ibVar.o();
        android.content.Context context = ibVar.f190417s;
        if (context instanceof android.app.Activity) {
            ((android.app.Activity) context).getWindow().clearFlags(128);
        }
        com.tencent.mm.plugin.report.kvdata.VoiceInputBehavior voiceInputBehavior = new com.tencent.mm.plugin.report.kvdata.VoiceInputBehavior();
        voiceInputBehavior.fail = i17;
        ibVar.i(voiceInputBehavior);
        ibVar.g(i17);
        if (i17 == 12) {
            com.tencent.mm.pluginsdk.ui.chat.ib.a(ibVar, com.tencent.mm.R.string.k9c);
        } else {
            com.tencent.mm.pluginsdk.ui.chat.ib.a(ibVar, com.tencent.mm.R.string.f490391to);
        }
        ibVar.f190410m.c(false);
        ibVar.f190411n.setHint((java.lang.CharSequence) null);
        ibVar.k(true);
        com.tencent.mm.autogen.events.VoiceInputStartEvent voiceInputStartEvent = new com.tencent.mm.autogen.events.VoiceInputStartEvent();
        voiceInputStartEvent.f54935g.f7501a = false;
        voiceInputStartEvent.e();
    }
}
