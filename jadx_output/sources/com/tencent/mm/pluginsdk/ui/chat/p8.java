package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public final class p8 implements z21.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.h9 f190565a;

    public p8(com.tencent.mm.pluginsdk.ui.chat.h9 h9Var) {
        this.f190565a = h9Var;
    }

    @Override // z21.b
    public void a(java.lang.String[] strArr, java.util.List list) {
        if (strArr == null) {
            return;
        }
        com.tencent.mm.pluginsdk.ui.chat.h9 h9Var = this.f190565a;
        h9Var.E = true;
        java.lang.String d07 = kz5.z.d0(strArr, "", null, null, 0, null, null, 62, null);
        h9Var.getClass();
        h9Var.f190354J = d07;
        if (!(list == null || list.isEmpty())) {
            if (h9Var.f190356b.length() == 0) {
                h9Var.f190356b = (java.lang.String) kz5.n0.i0(list);
            }
        }
        if ((d07.length() > 0) && !h9Var.f190357c) {
            h9Var.f190357c = true;
            java.lang.String sttVoiceSessionId = h9Var.f190355a;
            com.tencent.mm.pluginsdk.ui.chat.y4 chattingContext = h9Var.f190359e.getChattingContext();
            java.lang.String c17 = chattingContext != null ? chattingContext.c() : null;
            if (c17 == null) {
                c17 = "";
            }
            java.lang.String voiceId = h9Var.f190356b;
            kotlin.jvm.internal.o.g(sttVoiceSessionId, "sttVoiceSessionId");
            kotlin.jvm.internal.o.g(voiceId, "voiceId");
            com.tencent.mars.xlog.Log.i("MicroMsg.QuickVoice2TxtReporter", "reportFirstResult sessionId:%s, chatUsername:%s, voiceId:%s", sttVoiceSessionId, c17, voiceId);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("stt_voice_session_id", sttVoiceSessionId);
            hashMap.put("chat_username", c17);
            hashMap.put("voiceid", voiceId);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("sst_long_press_process", hashMap, 35963);
        }
        strArr.toString();
        java.util.Objects.toString(list);
        boolean z17 = h9Var.E;
    }

    @Override // z21.b
    public void b(java.util.List list) {
    }

    @Override // z21.b
    public void c() {
    }

    @Override // z21.b
    public void d(int i17) {
        kotlinx.coroutines.r2 r2Var = this.f190565a.Q;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        com.tencent.mm.pluginsdk.ui.chat.h9 h9Var = this.f190565a;
        h9Var.Q = null;
        if (h9Var.L) {
            com.tencent.mars.xlog.Log.w("MicroMsg.QuickVoice2TxtHelper", "onRecognizeFinish duplicate callback, ignore. endFlag=" + i17);
            return;
        }
        this.f190565a.L = true;
        if (this.f190565a.f190354J.length() == 0) {
            this.f190565a.E = false;
        }
        com.tencent.mm.pluginsdk.ui.chat.h9 h9Var2 = this.f190565a;
        com.tencent.mm.pluginsdk.ui.chat.k8 k8Var = h9Var2.M;
        if (k8Var != null) {
            ((com.tencent.mm.ui.chatting.component.u8) k8Var).a(h9Var2.f190354J);
        }
    }

    @Override // z21.b
    public void e(int i17, int i18, int i19, long j17) {
        com.tencent.mm.pluginsdk.ui.chat.h9 h9Var = this.f190565a;
        kotlinx.coroutines.l.d(h9Var.f190362h, null, null, new com.tencent.mm.pluginsdk.ui.chat.o8(i17, h9Var, null), 3, null);
    }

    @Override // z21.b
    public void f(java.lang.String str, boolean z17) {
    }

    @Override // z21.b
    public void g() {
    }
}
