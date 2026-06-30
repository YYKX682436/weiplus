package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f190549d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f190550e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190551f;

    public p0(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter, boolean z17, int i17) {
        this.f190551f = chatFooter;
        this.f190549d = z17;
        this.f190550e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190551f;
        boolean z17 = this.f190549d;
        if (!z17 && chatFooter.f189964c2) {
            db5.e1.s(chatFooter.getContext(), chatFooter.getContext().getString(this.f190550e), "");
            chatFooter.b1();
            return;
        }
        if (z17) {
            return;
        }
        chatFooter.b1();
        com.tencent.mm.ui.chatting.component.n9 n9Var = (com.tencent.mm.ui.chatting.component.n9) ((sb5.g2) chatFooter.f189955a3.a().f460708c.a(sb5.g2.class));
        com.tencent.mm.ui.chatting.component.jb jbVar = (com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) n9Var.f198580d.f460708c.a(sb5.s0.class));
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter2 = jbVar.f199263e;
        if (chatFooter2 == null) {
            return;
        }
        n9Var.f199572m = chatFooter2.getLastQuoteMsgId();
        n9Var.f199575p = jbVar.f199263e.getLastPartialQuoteText();
        n9Var.f199574o = jbVar.f199263e.getLastQuoteMsgTalker();
        com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.storage.m4) c01.d9.b().r()).p(n9Var.f198580d.x());
        if (p17 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Conversation", "clearQuoteInfo");
            p17.r1(0L);
            pt0.m mVar = (pt0.m) i95.n0.c(pt0.m.class);
            java.lang.String msgTalker = p17.h1();
            ((ez.j) mVar).getClass();
            kotlin.jvm.internal.o.g(msgTalker, "msgTalker");
            ti3.c cVar = ti3.c.f419579a;
            g15.b a17 = cVar.a(msgTalker);
            if (a17 == null) {
                a17 = new g15.b();
            }
            a17.q(null);
            cVar.d(a17, msgTalker, "");
            ((com.tencent.mm.storage.m4) c01.d9.b().r()).W(p17, p17.h1());
        }
    }
}
