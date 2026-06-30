package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class i1 implements ck5.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190386d;

    public i1(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190386d = chatFooter;
    }

    @Override // ck5.e
    public void R5(java.lang.String str) {
    }

    @Override // ck5.e
    public void c1(java.lang.String str) {
    }

    @Override // ck5.e
    public void w0(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "onSendTextMore !");
        com.tencent.mm.pluginsdk.ui.chat.y4 y4Var = this.f190386d.f189955a3;
        if (y4Var != null) {
            ((com.tencent.mm.ui.chatting.component.y8) ((sb5.i0) y4Var.a().f460708c.a(sb5.i0.class))).P0(102);
        }
    }
}
