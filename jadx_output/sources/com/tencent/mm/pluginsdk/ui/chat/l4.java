package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class l4 implements xg3.h0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190462d;

    public l4(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190462d = chatFooter;
    }

    @Override // xg3.h0
    public void c0(xg3.m0 m0Var, xg3.l0 l0Var) {
        java.lang.String str;
        boolean z17;
        if (m0Var == null || l0Var == null || (str = l0Var.f454410a) == null) {
            return;
        }
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190462d;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(chatFooter.U2) && str.equals(chatFooter.U2)) {
            java.util.Iterator it = l0Var.f454412c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z17 = false;
                    break;
                }
                com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) it.next();
                z17 = true;
                if (f9Var.A0() == 1 && (f9Var.getType() == 1 || f9Var.getType() == 822083633)) {
                    break;
                }
            }
            if (z17) {
                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().za(chatFooter.V2);
                i45.j jVar = i45.j.f288415a;
                i45.c g17 = jVar.g();
                if (g17 == null || !jVar.a(jVar.g())) {
                    return;
                }
                com.tencent.mm.sdk.platformtools.o4.M("mmkv_wetype").putLong("mmkv_key_voice_to_text_after_config_insert_last_time", c01.id.a());
                com.tencent.mm.sdk.platformtools.o4.M("mmkv_wetype").putLong("mmkv_key_voice_to_text_after_config_insert_time", com.tencent.mm.sdk.platformtools.o4.M("mmkv_wetype").getLong("mmkv_key_voice_to_text_after_config_insert_time", 0L) + 1);
                com.tencent.mm.storage.f9 f9Var2 = new com.tencent.mm.storage.f9();
                f9Var2.j1(0);
                f9Var2.u1(chatFooter.f189955a3.c());
                f9Var2.r1(3);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("<_wc_custom_link_ href='weixin://wetype/'>");
                java.lang.String str2 = g17.f288397b;
                sb6.append(str2);
                sb6.append("</_wc_custom_link_>");
                f9Var2.d1(g17.f288396a.replaceFirst(str2, sb6.toString()));
                f9Var2.e1(c01.w9.m(chatFooter.f189955a3.c(), c01.id.a() / 1000));
                f9Var2.setType(10000);
                f9Var2.f1(f9Var2.w0() | 8);
                c01.w9.x(f9Var2);
                com.tencent.mm.autogen.mmdata.rpt.VoiceToTextChatInterfaceStruct voiceToTextChatInterfaceStruct = new com.tencent.mm.autogen.mmdata.rpt.VoiceToTextChatInterfaceStruct();
                voiceToTextChatInterfaceStruct.f61699d = 1L;
                voiceToTextChatInterfaceStruct.k();
                com.tencent.mm.autogen.mmdata.rpt.VoiceToTextChatInterfaceStruct voiceToTextChatInterfaceStruct2 = new com.tencent.mm.autogen.mmdata.rpt.VoiceToTextChatInterfaceStruct();
                voiceToTextChatInterfaceStruct2.f61699d = 2L;
                voiceToTextChatInterfaceStruct2.k();
            }
        }
    }
}
