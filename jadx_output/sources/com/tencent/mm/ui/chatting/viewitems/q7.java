package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes10.dex */
public final class q7 extends com.tencent.mm.ui.chatting.viewitems.a0 implements com.tencent.mm.ui.chatting.l6 {

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.viewitems.r7 f205327s = new com.tencent.mm.ui.chatting.viewitems.r7(false);

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        return this.f205327s.b(layoutInflater, view);
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return !this.f205327s.f205410a;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem item, yb5.d ui6, rd5.d msgData) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        return this.f205327s.c(item, ui6, msgData.f394254d.f445300b);
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 menu, android.view.View v17, rd5.d msgData) {
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        return this.f205327s.d(this, menu, v17, msgData);
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d ui6, com.tencent.mm.storage.f9 msg) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msg, "msg");
        this.f205327s.getClass();
        com.tencent.mm.ui.chatting.viewitems.s7.f205494a.a("FinderLiveThemeDelegate", view, ui6, msg);
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.l6
    public void d(android.view.View v17, yb5.d ui6, com.tencent.mm.storage.f9 msg) {
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mm.ui.chatting.viewitems.r7 r7Var = this.f205327s;
        r7Var.getClass();
        if (r7Var.f205410a || !msg.k2()) {
            return;
        }
        com.tencent.mm.pluginsdk.model.app.k0.z(msg);
        c01.w9.f(msg.getMsgId(), msg.Q0());
        ui6.L(true);
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 holder, yb5.d ui6, rd5.d msgData, java.lang.String str) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        this.f205327s.a(this, holder instanceof com.tencent.mm.ui.chatting.viewitems.o7 ? (com.tencent.mm.ui.chatting.viewitems.o7) holder : null, holder, ui6, msgData, str);
    }
}
