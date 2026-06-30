package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public class bn implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f198841d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.TranslateMessageResultEvent f198842e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f198843f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f198844g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.TranslateComponent$2 f198845h;

    public bn(com.tencent.mm.ui.chatting.component.TranslateComponent$2 translateComponent$2, int i17, com.tencent.mm.autogen.events.TranslateMessageResultEvent translateMessageResultEvent, java.lang.String str, java.lang.String str2) {
        this.f198845h = translateComponent$2;
        this.f198841d = i17;
        this.f198842e = translateMessageResultEvent;
        this.f198843f = str;
        this.f198844g = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.viewitems.io ioVar = com.tencent.mm.ui.chatting.viewitems.io.NoTransform;
        java.lang.String str = this.f198843f;
        com.tencent.mm.ui.chatting.component.TranslateComponent$2 translateComponent$2 = this.f198845h;
        int i17 = this.f198841d;
        if (i17 != 0) {
            if (i17 == 3) {
                db5.e1.T(translateComponent$2.f198569d.f198580d.g(), translateComponent$2.f198569d.f198580d.s().getString(com.tencent.mm.R.string.b6n));
            } else if (i17 != 5) {
                db5.e1.T(translateComponent$2.f198569d.f198580d.g(), translateComponent$2.f198569d.f198580d.s().getString(com.tencent.mm.R.string.b6c));
            }
            translateComponent$2.f198569d.m0(com.tencent.mm.sdk.platformtools.t8.E1(str), ioVar);
            translateComponent$2.f198569d.f198580d.J();
            return;
        }
        am.kz kzVar = this.f198842e.f54905g;
        boolean equals = kzVar.f7194b.equals(kzVar.f7195c);
        com.tencent.mm.ui.chatting.viewitems.io ioVar2 = com.tencent.mm.ui.chatting.viewitems.io.Transformed;
        final java.lang.String talker = this.f198844g;
        if (!equals) {
            com.tencent.mm.ui.chatting.component.ym ymVar = translateComponent$2.f198569d;
            ymVar.f200339m++;
            ymVar.m0(com.tencent.mm.sdk.platformtools.t8.E1(str), ioVar2);
            long E1 = com.tencent.mm.sdk.platformtools.t8.E1(str);
            com.tencent.mm.ui.chatting.component.ym ymVar2 = translateComponent$2.f198569d;
            ymVar2.getClass();
            ymVar2.f200334e.a(new com.tencent.mm.ui.chatting.component.an(ymVar2, talker, E1));
            return;
        }
        boolean n07 = translateComponent$2.f198569d.n0(com.tencent.mm.sdk.platformtools.t8.E1(str));
        com.tencent.mm.ui.chatting.component.ym ymVar3 = translateComponent$2.f198569d;
        if (!n07) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.TranslateComponent", "translateListener callback id: %s, original text equal translated text, auto translate, ", str);
            ymVar3.m0(com.tencent.mm.sdk.platformtools.t8.E1(str), ioVar);
            return;
        }
        java.util.regex.Pattern pattern = com.tencent.mm.plugin.record.ui.l2.f155438h;
        if (!(j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepaireConfigTransKeep()) == 1)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.TranslateComponent", "translateListener callback id: %s, same text long click translate, translateKeepOn switch off", str);
            ymVar3.f200339m++;
            ymVar3.m0(com.tencent.mm.sdk.platformtools.t8.E1(str), ioVar2);
            long E12 = com.tencent.mm.sdk.platformtools.t8.E1(str);
            ymVar3.getClass();
            ymVar3.f200334e.a(new com.tencent.mm.ui.chatting.component.an(ymVar3, talker, E12));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.TranslateComponent", "translateListener callback id: %s, original text equal translated text, long click translate", str);
        android.app.Activity g17 = ymVar3.f198580d.g();
        final com.tencent.mm.storage.f9 f27 = pt0.f0.f2(talker, com.tencent.mm.sdk.platformtools.t8.E1(str));
        if (f27 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingUI.TranslateComponent", "translateListener callback id: %s, msg is null", str);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.TranslateComponent", "translateListener callback id: %s, hideTranslate", str);
        ymVar3.s0(f27);
        final java.lang.String langCode = com.tencent.mm.sdk.platformtools.m2.c(g17);
        kotlin.jvm.internal.o.g(talker, "talker");
        kotlin.jvm.internal.o.g(langCode, "langCode");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("msgid", java.lang.String.valueOf(f27.getMsgId()));
        hashMap.put("chat_username", talker);
        hashMap.put("current_language_code", langCode);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("same_language_popup", "view_exp", hashMap, 35268);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.TranslateComponent", "translateListener callback id: %s, show dialog", str);
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(g17);
        u1Var.g(g17.getString(com.tencent.mm.R.string.n9d));
        u1Var.n(g17.getString(com.tencent.mm.R.string.lsg));
        u1Var.j(g17.getString(com.tencent.mm.R.string.aq7));
        u1Var.l(new com.tencent.mm.ui.widget.dialog.w1() { // from class: com.tencent.mm.ui.chatting.component.bn$$a
            @Override // com.tencent.mm.ui.widget.dialog.w1
            public final void a(boolean z17, java.lang.String str2) {
                com.tencent.mm.ui.chatting.component.bn bnVar = com.tencent.mm.ui.chatting.component.bn.this;
                bnVar.getClass();
                com.tencent.mm.storage.f9 f9Var = f27;
                com.tencent.mm.ui.chatting.component.jn.a(f9Var, talker, langCode, 2);
                wd0.k2 k2Var = wd0.k2.SAME_LANGUAGE_WINDOW;
                com.tencent.mm.feature.setting.api.SettingsTranslateLanguageRequest settingsTranslateLanguageRequest = new com.tencent.mm.feature.setting.api.SettingsTranslateLanguageRequest();
                settingsTranslateLanguageRequest.f67821d = k2Var;
                settingsTranslateLanguageRequest.f67822e = java.lang.String.valueOf(f9Var.getMsgId());
                settingsTranslateLanguageRequest.f67824g = 2;
                com.tencent.mm.ui.chatting.component.TranslateComponent$2 translateComponent$22 = bnVar.f198845h;
                translateComponent$22.f198569d.f200340n = settingsTranslateLanguageRequest.clone();
                java.lang.String Q0 = f9Var.Q0();
                com.tencent.mm.ui.chatting.component.ym ymVar4 = translateComponent$22.f198569d;
                ymVar4.f200341o = Q0;
                ((vd0.o3) ((wd0.z1) i95.n0.c(wd0.z1.class))).fj(ymVar4.f198580d.g(), settingsTranslateLanguageRequest);
            }
        });
        u1Var.i(new com.tencent.mm.ui.widget.dialog.w1() { // from class: com.tencent.mm.ui.chatting.component.bn$$b
            @Override // com.tencent.mm.ui.widget.dialog.w1
            public final void a(boolean z17, java.lang.String str2) {
                com.tencent.mm.ui.chatting.component.jn.a(com.tencent.mm.storage.f9.this, talker, langCode, 1);
            }
        });
        u1Var.a(true);
        u1Var.q(true);
    }
}
