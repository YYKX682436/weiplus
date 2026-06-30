package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.i2.class)
/* loaded from: classes14.dex */
public final class fm extends com.tencent.mm.ui.chatting.component.a implements sb5.i2 {

    /* renamed from: e, reason: collision with root package name */
    public long f199059e;

    /* renamed from: f, reason: collision with root package name */
    public long f199060f;

    /* renamed from: i, reason: collision with root package name */
    public sb5.h2 f199063i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f199064m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f199065n;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.Boolean f199067p;

    /* renamed from: g, reason: collision with root package name */
    public final x21.l f199061g = new x21.l(false, 1, null);

    /* renamed from: h, reason: collision with root package name */
    public final y21.h f199062h = new y21.h(false, false, 3, null);

    /* renamed from: o, reason: collision with root package name */
    public r45.uc6 f199066o = new r45.uc6();

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void K() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TextToSpeechComponent", "onChattingExitAnimStart!!");
        yb5.d mChattingContext = this.f198580d;
        kotlin.jvm.internal.o.f(mChattingContext, "mChattingContext");
        w0(mChattingContext, false);
        com.tencent.mm.ui.tools.b1.a();
    }

    public final void m0(int i17) {
        r45.uc6 uc6Var = this.f199066o;
        if (uc6Var == null || uc6Var.f387226d == 0 || uc6Var.f387229g) {
            return;
        }
        com.tencent.mm.autogen.mmdata.rpt.CareModeTxt2VoiceUsageStruct careModeTxt2VoiceUsageStruct = new com.tencent.mm.autogen.mmdata.rpt.CareModeTxt2VoiceUsageStruct();
        r45.uc6 uc6Var2 = this.f199066o;
        careModeTxt2VoiceUsageStruct.f55581d = uc6Var2.f387227e;
        careModeTxt2VoiceUsageStruct.f55582e = uc6Var2.f387228f;
        if (uc6Var2.f387230h) {
            careModeTxt2VoiceUsageStruct.f55585h = 2L;
        } else {
            careModeTxt2VoiceUsageStruct.f55585h = 1L;
        }
        careModeTxt2VoiceUsageStruct.f55586i = uc6Var2.f387226d;
        careModeTxt2VoiceUsageStruct.f55587j = i17;
        careModeTxt2VoiceUsageStruct.k();
        this.f199066o.f387229g = true;
        this.f199066o = new r45.uc6();
    }

    public final void n0(yb5.d ui6) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        ym1.e eVar = ym1.f.f463134h;
        boolean j17 = eVar.j();
        boolean i17 = eVar.i();
        if (j17 || !i17) {
            if (q0()) {
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.chatting.component.ql(ui6));
            }
        } else {
            if (this.f199065n) {
                return;
            }
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.chatting.component.pl(ui6));
            this.f199065n = true;
        }
    }

    public final void o0(yb5.d ui6) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("audio");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        if (((android.media.AudioManager) systemService).getStreamVolume(3) == 0) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.chatting.component.rl(ui6));
        }
    }

    public final void p0(yb5.d ui6, java.util.ArrayList inputText, long j17) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(inputText, "inputText");
        android.app.Activity g17 = ui6.g();
        com.tencent.mm.ui.chatting.component.vl vlVar = new com.tencent.mm.ui.chatting.component.vl(this, ui6, j17, inputText);
        synchronized (com.tencent.mm.ui.tools.b1.class) {
            if (com.tencent.mm.ui.tools.b1.f210281a == null) {
                com.tencent.mm.ui.tools.b1.f210281a = new android.speech.tts.TextToSpeech(g17.getApplicationContext(), vlVar);
            }
            android.media.AudioManager audioManager = (android.media.AudioManager) g17.getSystemService("audio");
            com.tencent.mm.ui.tools.b1.f210282b = audioManager;
            audioManager.setMode(0);
        }
    }

    public final boolean q0() {
        return c01.d9.b().p().n(26, false);
    }

    public void r0(yb5.d ui6, com.tencent.mm.storage.f9 msg, java.lang.CharSequence chatText) {
        boolean booleanValue;
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(chatText, "chatText");
        java.util.ArrayList x07 = x0(chatText);
        long msgId = msg.getMsgId();
        this.f199066o.f387230h = com.tencent.mm.storage.z3.R4(msg.Q0());
        this.f199060f = msgId;
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.chatting.component.yl(ui6));
        java.lang.Boolean bool = this.f199067p;
        if (bool != null) {
            booleanValue = bool.booleanValue();
        } else {
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_text_to_speech_stream, false));
            this.f199067p = valueOf;
            kotlin.jvm.internal.o.d(valueOf);
            booleanValue = valueOf.booleanValue();
        }
        if (!booleanValue) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TextToSpeechComponent", "saveAndPlaySpeech!!");
            u0(ui6, msgId, msg.I0(), x07, false);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TextToSpeechComponent", "saveAndPlaySpeechStream!!");
        long I0 = msg.I0();
        java.lang.String msgText = chatText.toString();
        kotlin.jvm.internal.o.g(msgText, "msgText");
        com.tencent.mars.xlog.Log.i("MicroMsg.TextToSpeechComponent", "saveAndPlaySpeechStream");
        p0(ui6, x07, I0);
        boolean z17 = !q0();
        android.media.AudioManager audioManager = com.tencent.mm.ui.tools.b1.f210282b;
        if (audioManager != null) {
            if (z17) {
                audioManager.setSpeakerphoneOn(true);
                com.tencent.mm.ui.tools.b1.f210282b.setMode(0);
            } else {
                audioManager.setSpeakerphoneOn(false);
                com.tencent.mm.ui.tools.b1.f210282b.setMode(3);
            }
        }
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        kotlin.jvm.internal.c0 c0Var2 = new kotlin.jvm.internal.c0();
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        if (msgText.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TextToSpeechComponent", "msg is null");
            return;
        }
        kotlin.jvm.internal.c0 c0Var3 = new kotlin.jvm.internal.c0();
        java.lang.String v07 = v0();
        kotlinx.coroutines.y0 y0Var = gm0.j1.b().f273245h.f273145e;
        if (y0Var == null) {
            y0Var = kotlinx.coroutines.z0.b();
        }
        pn4.e1 e1Var = new pn4.e1(msgId, msgText, v07, y0Var);
        e1Var.f357089h = new com.tencent.mm.ui.chatting.component.em(c0Var3, this, ui6, msgId, I0, msgText);
        java.lang.String str = e1Var.f357086e;
        com.tencent.mars.xlog.Log.i(str, "start trans");
        if (com.tencent.mm.vfs.w6.j(e1Var.f())) {
            com.tencent.mars.xlog.Log.i(str, "already downloaded");
            kotlinx.coroutines.l.d(e1Var.f357085d, null, null, new pn4.b1(e1Var, null), 3, null);
            e1Var.h(pn4.u0.f357230e);
        } else {
            e1Var.h(pn4.u0.f357231f);
            kotlinx.coroutines.l.d(e1Var.f357085d, null, null, new pn4.c1(e1Var, null), 3, null);
        }
        y21.h hVar = this.f199062h;
        hVar.b(e1Var);
        hVar.f(!q0());
        hVar.c(new com.tencent.mm.ui.chatting.component.cm(c0Var, this, ui6, msgId, I0, msgText, f0Var, x07, c0Var2, e1Var));
        hVar.d();
    }

    public final void s0(int i17, long j17, java.lang.String subText) {
        kotlin.jvm.internal.o.g(subText, "subText");
        java.util.HashMap<java.lang.String, java.lang.String> hashMap = new java.util.HashMap<>();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(j17);
        sb6.append('_');
        sb6.append(i17);
        hashMap.put("utteranceId", sb6.toString());
        synchronized (com.tencent.mm.ui.tools.b1.class) {
            if (com.tencent.mm.ui.tools.b1.f210281a != null && !android.text.TextUtils.isEmpty(subText)) {
                com.tencent.mm.ui.tools.b1.f210281a.speak(subText.toString(), 1, hashMap);
            }
        }
    }

    public final void t0(yb5.d ui6) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.chatting.component.zl(this, ui6));
    }

    public final void u0(yb5.d ui6, long j17, long j18, java.util.ArrayList inputText, boolean z17) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(inputText, "inputText");
        p0(ui6, inputText, j18);
        boolean z18 = !q0();
        android.media.AudioManager audioManager = com.tencent.mm.ui.tools.b1.f210282b;
        if (audioManager != null) {
            if (z18) {
                audioManager.setSpeakerphoneOn(true);
                com.tencent.mm.ui.tools.b1.f210282b.setMode(0);
            } else {
                audioManager.setSpeakerphoneOn(false);
                com.tencent.mm.ui.tools.b1.f210282b.setMode(3);
            }
        }
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        kotlin.jvm.internal.c0 c0Var2 = new kotlin.jvm.internal.c0();
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        x21.l lVar = this.f199061g;
        lVar.b();
        boolean z19 = !q0();
        java.lang.String str = lVar.f451545b;
        com.tencent.mars.xlog.Log.i(str, "switchSpeaker: " + z19);
        x21.c.d(lVar.f451548e, z19, 0, 2, null);
        lVar.c();
        com.tencent.mm.ui.chatting.component.xl xlVar = new com.tencent.mm.ui.chatting.component.xl(inputText, this, c0Var, ui6, j17, j18, f0Var, c0Var2);
        com.tencent.mars.xlog.Log.i(str, "setAudioFilePlayStateListener");
        lVar.f451550g = xlVar;
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
        if (lifecycleScope != null) {
            v65.i.b(lifecycleScope, null, new com.tencent.mm.ui.chatting.component.am(inputText, this, j17, z17, null), 1, null);
        }
    }

    public final java.lang.String v0() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (context == null || context.getCacheDir() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TextToSpeechComponent", "path is empty, MMApplicationContext.getContext() == null");
            return "";
        }
        java.lang.String str = gm0.j1.u().h() + "speech";
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f213279f;
        if (str2 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (!(m17.a() ? m17.f213266a.F(m17.f213267b) : false)) {
            com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a17, m17);
            if (m18.a()) {
                m18.f213266a.r(m18.f213267b);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.TextToSpeechComponent", "path is not exists, mkdir path: %s", str);
        }
        return str;
    }

    public void w0(yb5.d ui6, boolean z17) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        com.tencent.mars.xlog.Log.i("MicroMsg.TextToSpeechComponent", "stopSpeech!!");
        if (!(this.f199061g.f451546c != null ? r0.d() : true)) {
            x21.l.d(this.f199061g, true, false, 2, null);
            this.f199061g.b();
        }
        if (this.f199062h.a()) {
            y21.h.e(this.f199062h, true, false, 2, null);
        }
        android.speech.tts.TextToSpeech textToSpeech = com.tencent.mm.ui.tools.b1.f210281a;
        if (textToSpeech != null && textToSpeech.isSpeaking()) {
            synchronized (com.tencent.mm.ui.tools.b1.class) {
                android.speech.tts.TextToSpeech textToSpeech2 = com.tencent.mm.ui.tools.b1.f210281a;
                if (textToSpeech2 != null) {
                    textToSpeech2.stop();
                }
            }
        }
        m0(1);
        this.f199063i = null;
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f199064m;
        if (b4Var != null) {
            b4Var.d();
        }
        this.f199064m = null;
        if (z17 || this.f199059e != 0 || this.f199060f != 0) {
            t0(ui6);
        }
        this.f199059e = 0L;
        this.f199060f = 0L;
        x21.l lVar = this.f199061g;
        com.tencent.mars.xlog.Log.i(lVar.f451545b, "setAudioFilePlayStateListener");
        lVar.f451550g = null;
        this.f199062h.c(null);
    }

    public java.util.ArrayList x0(java.lang.CharSequence msgText) {
        kotlin.jvm.internal.o.g(msgText, "msgText");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String[] strArr = {"。", "，", "?", "？", "!", "！", ";", "；", "\n"};
        java.lang.String[] strArr2 = {",", "~", "～", "、", "-", "—", "(", ")", "（", "）", " "};
        int length = msgText.length();
        java.lang.String[] strArr3 = new java.lang.String[length];
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (i17 < length) {
            int i27 = i17 + 1;
            java.lang.String obj = msgText.subSequence(i17, i27).toString();
            strArr3[i17] = obj;
            if (i17 >= i18 + 10) {
                if (i17 < i18 + 22) {
                    if (kz5.z.G(strArr, obj)) {
                        r45.tc6 tc6Var = new r45.tc6();
                        tc6Var.f386315d = msgText.subSequence(i18, i27).toString();
                        tc6Var.f386316e = i18;
                        arrayList.add(tc6Var);
                        i18 = i27;
                        i19 = i18;
                    }
                } else if (kz5.z.G(strArr, obj) || kz5.z.G(strArr2, strArr3[i17])) {
                    r45.tc6 tc6Var2 = new r45.tc6();
                    tc6Var2.f386315d = msgText.subSequence(i18, i27).toString();
                    tc6Var2.f386316e = i18;
                    arrayList.add(tc6Var2);
                    i18 = i27;
                    i19 = i18;
                }
            }
            if (i17 == length - 1 && (i17 == 0 || i19 < i17)) {
                r45.tc6 tc6Var3 = new r45.tc6();
                tc6Var3.f386315d = msgText.subSequence(i18, i27).toString();
                tc6Var3.f386316e = i18;
                arrayList.add(tc6Var3);
                i19 = i27;
            }
            i17 = i27;
        }
        return arrayList;
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void y() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TextToSpeechComponent", "onChattingExitAnimStart!!");
        yb5.d mChattingContext = this.f198580d;
        kotlin.jvm.internal.o.f(mChattingContext, "mChattingContext");
        w0(mChattingContext, false);
        com.tencent.mm.ui.tools.b1.a();
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void z() {
        sb5.z0 z0Var = (sb5.z0) this.f198580d.f460708c.a(sb5.z0.class);
        boolean z17 = (j65.e.b() && j65.e.f()) ? false : 8;
        com.tencent.mm.ui.j jVar = ((com.tencent.mm.ui.chatting.component.pe) z0Var).f199692p;
        boolean z18 = !z17;
        jVar.getClass();
        jVar.f208980m.setVisibility(z18 ? 0 : 8);
    }
}
