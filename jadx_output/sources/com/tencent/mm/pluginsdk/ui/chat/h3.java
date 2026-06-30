package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class h3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190341d;

    public h3(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190341d = chatFooter;
    }

    @Override // java.lang.Runnable
    public void run() {
        hv4.l lVar = com.tencent.mm.pluginsdk.ui.chat.ChatFooter.f189950x6;
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190341d;
        chatFooter.f190095x5 = java.lang.Math.round(com.tencent.mm.ui.gk.a(chatFooter.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a8t)));
        chatFooter.B5 = java.lang.Math.round(com.tencent.mm.ui.gk.a(chatFooter.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a8s)));
        int bottom = (chatFooter.f189956a4.getBottom() - com.tencent.mm.ui.zk.a(chatFooter.getContext(), 48)) - com.tencent.mm.ui.bk.p(chatFooter.getContext());
        chatFooter.f190102y5 = bottom;
        int i17 = chatFooter.f190057r5;
        if (bottom <= i17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "invalid maxHeight, value:%s", java.lang.Integer.valueOf(bottom));
            chatFooter.f190102y5 = i17 * 2;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "transMinHeight:%s, transHeight:%s, normalHeight:%s, maxHeight:%s, cancelWidth:%s, voiceWidth:%s, transWidth:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(chatFooter.f190095x5), java.lang.Integer.valueOf(chatFooter.B5), java.lang.Integer.valueOf(chatFooter.f190102y5), java.lang.Integer.valueOf(chatFooter.f190069t5), java.lang.Integer.valueOf(chatFooter.C5), java.lang.Integer.valueOf(chatFooter.f190063s5));
    }
}
