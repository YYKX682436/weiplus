package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class f4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190308d;

    public f4(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190308d = chatFooter;
    }

    @Override // java.lang.Runnable
    public void run() {
        hv4.l lVar = com.tencent.mm.pluginsdk.ui.chat.ChatFooter.f189950x6;
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190308d;
        chatFooter.U0(true);
        chatFooter.setToSendTextColor(true);
        boolean showSoftInput = chatFooter.U1.showSoftInput(chatFooter.f190021m.j(), 0);
        chatFooter.f190066t2++;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "showSoftInput %b, %s", java.lang.Boolean.valueOf(showSoftInput), java.lang.Integer.valueOf(chatFooter.f190066t2));
        if (showSoftInput || chatFooter.f190066t2 >= 10) {
            return;
        }
        chatFooter.postDelayed(this, 100L);
    }
}
