package com.tencent.mm.ui.chatting;

/* loaded from: classes5.dex */
public class q4 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.h4 f202598d;

    public q4(com.tencent.mm.ui.chatting.h4 h4Var) {
        this.f202598d = h4Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        db5.d5 d5Var;
        com.tencent.mm.ui.chatting.h4 h4Var = this.f202598d;
        long c17 = ((com.tencent.mm.modelbase.g1) h4Var.f201637b.b()).c();
        int ceil = (int) java.lang.Math.ceil((60000 - c17) / 1000.0d);
        yb5.d dVar = h4Var.f201645j;
        if (c17 >= 50000 && c17 <= 60000 && !h4Var.f201654s) {
            android.app.Activity g17 = dVar.g();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            android.os.Vibrator vibrator = (android.os.Vibrator) g17.getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(150L);
            }
            h4Var.f201654s = true;
        }
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = h4Var.f201636a;
        chatFooter.setVoiceReactArea(ceil);
        if (c17 < 60000) {
            return true;
        }
        db5.d5 d5Var2 = chatFooter.X3;
        if (d5Var2 != null && d5Var2.isShowing()) {
            boolean z18 = chatFooter.T3;
            if (z18) {
                if (chatFooter.f189968c6 == com.tencent.mm.pluginsdk.ui.chat.b5.MODE_VOICE) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingFooterEventImpl", "record countdown, voice mode auto send voiceAutoSendCount = %s", java.lang.Integer.valueOf(h4Var.f201655t));
                    int i17 = h4Var.f201655t;
                    if (i17 < 1) {
                        h4Var.f201655t = i17 + 1;
                        com.tencent.mm.pluginsdk.ui.chat.k5 k5Var = chatFooter.f190090x0;
                        if (k5Var != null) {
                            k5Var.f(false);
                            z21.a0 a0Var = new z21.a0(java.lang.String.valueOf(java.lang.System.nanoTime() & io.flutter.embedding.android.KeyboardMap.kValueMask));
                            chatFooter.L3 = a0Var;
                            chatFooter.K3.b(a0Var);
                            java.lang.String str = u35.d.f424435a;
                            com.tencent.mm.plugin.transvoice.model.e eVar = chatFooter.N3;
                            eVar.getClass();
                            eVar.G = str;
                            if (!chatFooter.f190090x0.q(false) && (d5Var = chatFooter.X3) != null && d5Var.isShowing()) {
                                chatFooter.X3.dismiss();
                            }
                        }
                    } else {
                        chatFooter.S0(true);
                        h4Var.f201655t = 0;
                    }
                }
            }
            if (z18) {
                if (chatFooter.f189968c6 == com.tencent.mm.pluginsdk.ui.chat.b5.MODE_CANCEL) {
                    chatFooter.S0(false);
                    h4Var.f201655t = 0;
                }
            }
            chatFooter.c1();
            h4Var.f201655t = 0;
        } else {
            h4Var.P();
            chatFooter.d1(com.tencent.mm.pluginsdk.ui.chat.f5.SendVoice);
        }
        com.tencent.mm.sdk.platformtools.v5.e(dVar.g(), com.tencent.mm.R.string.f493378jy3);
        return false;
    }
}
