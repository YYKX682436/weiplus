package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class q2 implements com.tencent.mm.pluginsdk.ui.chat.y4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190568a;

    public q2(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190568a = chatFooter;
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.y4
    public yb5.d a() {
        com.tencent.mm.pluginsdk.ui.chat.y4 y4Var = this.f190568a.f189955a3;
        if (y4Var == null) {
            return null;
        }
        return y4Var.a();
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.y4
    public java.lang.String b() {
        com.tencent.mm.pluginsdk.ui.chat.y4 y4Var = this.f190568a.f189955a3;
        return y4Var == null ? "" : y4Var.b();
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.y4
    public java.lang.String c() {
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190568a;
        com.tencent.mm.pluginsdk.ui.chat.y4 y4Var = chatFooter.f189955a3;
        return y4Var == null ? chatFooter.f189969d : y4Var.c();
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.y4
    public int d() {
        com.tencent.mm.pluginsdk.ui.chat.y4 y4Var = this.f190568a.f189955a3;
        if (y4Var == null) {
            return 0;
        }
        return y4Var.d();
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.y4
    public com.tencent.mm.ui.chatting.manager.e e() {
        return null;
    }
}
