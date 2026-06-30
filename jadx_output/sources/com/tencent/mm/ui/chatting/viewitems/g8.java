package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes10.dex */
public final class g8 extends com.tencent.mm.ui.chatting.viewitems.a0 implements com.tencent.mm.ui.chatting.l6 {

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.viewitems.i8 f204019s = new com.tencent.mm.ui.chatting.viewitems.i8(false);

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        return this.f204019s.b(layoutInflater, view);
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return !this.f204019s.f204170a;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem item, yb5.d ui6, rd5.d msgData) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        com.tencent.mm.storage.f9 msg = msgData.f394254d.f445300b;
        this.f204019s.getClass();
        kotlin.jvm.internal.o.g(msg, "msg");
        item.getItemId();
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 menu, android.view.View v17, rd5.d msgData) {
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        return this.f204019s.c(this, menu, v17, msgData);
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        this.f204019s.d(view, dVar, msg);
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.l6
    public void d(android.view.View v17, yb5.d ui6, com.tencent.mm.storage.f9 msg) {
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msg, "msg");
        this.f204019s.e(v17, ui6, msg);
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 holder, yb5.d ui6, rd5.d msgData, java.lang.String str) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        this.f204019s.a(this, holder instanceof com.tencent.mm.ui.chatting.viewitems.ChattingItemAppMsgFinderOrder$AppMsgFinderOrderHolder ? (com.tencent.mm.ui.chatting.viewitems.ChattingItemAppMsgFinderOrder$AppMsgFinderOrderHolder) holder : null, holder, ui6, msgData, str);
    }
}
