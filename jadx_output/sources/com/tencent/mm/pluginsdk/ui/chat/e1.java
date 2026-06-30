package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.NotifyChatRoomStatusChangeEvent f190291d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f190292e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter.AnonymousClass122 f190293f;

    public e1(com.tencent.mm.pluginsdk.ui.chat.ChatFooter.AnonymousClass122 anonymousClass122, com.tencent.mm.autogen.events.NotifyChatRoomStatusChangeEvent notifyChatRoomStatusChangeEvent, com.tencent.mm.storage.z3 z3Var) {
        this.f190293f = anonymousClass122;
        this.f190291d = notifyChatRoomStatusChangeEvent;
        this.f190292e = z3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f190291d.f54538g.f7048a;
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter.AnonymousClass122 anonymousClass122 = this.f190293f;
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, com.tencent.mm.pluginsdk.ui.chat.ChatFooter.this.f189955a3.c())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "try to refresh footer.");
            com.tencent.mm.pluginsdk.ui.chat.y4 y4Var = com.tencent.mm.pluginsdk.ui.chat.ChatFooter.this.f189955a3;
            if (y4Var != null) {
                ((com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) y4Var.a().f460708c.a(sb5.s0.class))).n0(this.f190292e);
            }
            fl5.i iVar = com.tencent.mm.pluginsdk.ui.chat.ChatFooter.this.f190021m;
            if (iVar != null) {
                iVar.setText("");
            }
        }
    }
}
