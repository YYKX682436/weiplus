package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class p3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190556d;

    public p3(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190556d = chatFooter;
    }

    @Override // java.lang.Runnable
    public void run() {
        hv4.l lVar = com.tencent.mm.pluginsdk.ui.chat.ChatFooter.f189950x6;
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190556d;
        chatFooter.q0();
        int height = ((chatFooter.F4.getHeight() + i65.a.f(chatFooter.getContext(), com.tencent.mm.R.dimen.aqx)) - com.tencent.mm.ui.bl.c(chatFooter.getContext())) - chatFooter.f190059s.getHeight();
        com.tencent.mm.pluginsdk.ui.chat.ChattingScrollLayout chattingScrollLayout = chatFooter.f189982f2;
        if (chattingScrollLayout == null || !chattingScrollLayout.a(height)) {
            return;
        }
        chatFooter.f190105z2 = height;
        chatFooter.E1(4, true, -1);
    }
}
