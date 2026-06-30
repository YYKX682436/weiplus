package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class x5 extends com.tencent.mm.ui.chatting.viewitems.a0 {

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.viewitems.z5 f205968s = new com.tencent.mm.ui.chatting.viewitems.z5(false);

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        return this.f205968s.b(layoutInflater, view);
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return this.f205968s.f206112a;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean N() {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem item, yb5.d ui6, rd5.d msgData) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        this.f205968s.c(item, ui6, msgData.f394254d.f445300b);
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 menu, android.view.View v17, rd5.d msgData) {
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        this.f205968s.d(this, menu, v17, msgData.f394254d.f445300b);
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View v17, yb5.d ui6, com.tencent.mm.storage.f9 msg) {
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msg, "msg");
        this.f205968s.e(v17, ui6, msg);
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 holder, yb5.d ui6, rd5.d msgData, java.lang.String userName) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        kotlin.jvm.internal.o.g(userName, "userName");
        this.f205968s.a(holder instanceof com.tencent.mm.ui.chatting.viewitems.w5 ? (com.tencent.mm.ui.chatting.viewitems.w5) holder : null, ui6, msgData, userName, this);
    }
}
