package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class d1 implements z21.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190257a;

    public d1(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190257a = chatFooter;
    }

    @Override // z21.b
    public void a(java.lang.String[] strArr, java.util.List list) {
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190257a;
        com.tencent.mm.plugin.transvoice.model.c cVar = chatFooter.f190038o6;
        db5.d5 d5Var = chatFooter.X3;
        if (d5Var != null && !d5Var.isShowing()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChatFooter", "newVoice2txt onRes return, newVoice2txtWindow is not showing.");
            return;
        }
        ((java.util.ArrayList) chatFooter.f190058r6).clear();
        if (!com.tencent.mm.sdk.platformtools.t8.L0(list)) {
            ((java.util.ArrayList) chatFooter.f190058r6).addAll(list);
        }
        if (!chatFooter.f190076u6) {
            chatFooter.f190076u6 = true;
            chatFooter.f189961b4.setFocusable(true);
            chatFooter.f189961b4.setFocusableInTouchMode(true);
            chatFooter.f189961b4.requestFocus();
            chatFooter.f189961b4.setCursorVisible(true);
        }
        com.tencent.mm.plugin.transvoice.model.c cVar2 = chatFooter.f190038o6;
        if (cVar2 != null && !cVar2.f175374m) {
            chatFooter.f190070t6.removeMessages(5000);
            chatFooter.f190070t6.sendEmptyMessageDelayed(5000, 5000L);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(strArr[0])) {
            return;
        }
        ((java.util.HashMap) chatFooter.f189980e6).put(java.lang.Integer.valueOf(chatFooter.f190082v6), strArr[0]);
        if (chatFooter.f189980e6 != null) {
            chatFooter.N3.f175395s = strArr[0].length();
        }
    }

    @Override // z21.b
    public void b(java.util.List list) {
    }

    @Override // z21.b
    public void c() {
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00b1  */
    @Override // z21.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(int r7) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.ui.chat.d1.d(int):void");
    }

    @Override // z21.b
    public void e(int i17, int i18, int i19, long j17) {
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190257a;
        com.tencent.mm.plugin.transvoice.model.e eVar = chatFooter.N3;
        eVar.f175398v = 0;
        eVar.f175394r = java.lang.System.currentTimeMillis();
        chatFooter.f190026m6 = false;
        chatFooter.f189961b4.setImportantForAccessibility(0);
    }

    @Override // z21.b
    public void f(java.lang.String str, boolean z17) {
    }

    @Override // z21.b
    public void g() {
    }
}
