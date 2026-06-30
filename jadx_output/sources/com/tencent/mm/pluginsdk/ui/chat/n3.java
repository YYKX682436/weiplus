package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class n3 implements com.tencent.mm.sdk.platformtools.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190497d;

    public n3(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190497d = chatFooter;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        if (message.what == 5000) {
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190497d;
            com.tencent.mm.plugin.transvoice.model.e eVar = chatFooter.N3;
            eVar.f175393q = 1;
            eVar.f175394r = java.lang.System.currentTimeMillis();
            chatFooter.N3.f175398v = 0;
            chatFooter.f190064s6.d();
            com.tencent.mm.plugin.transvoice.model.c cVar = chatFooter.f190038o6;
            if (cVar != null) {
                cVar.a(false, false);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) ((java.util.HashMap) chatFooter.f189980e6).get(java.lang.Integer.valueOf(chatFooter.f190082v6)))) {
                chatFooter.f189961b4.setFocusable(true);
                chatFooter.f189961b4.setFocusableInTouchMode(true);
                chatFooter.f189961b4.requestFocus();
            }
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter.e(chatFooter);
            chatFooter.f190026m6 = false;
        }
        return true;
    }
}
