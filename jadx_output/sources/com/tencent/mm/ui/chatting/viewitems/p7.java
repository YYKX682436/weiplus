package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes10.dex */
public final class p7 extends com.tencent.mm.ui.chatting.viewitems.a0 {

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.viewitems.r7 f205238s = new com.tencent.mm.ui.chatting.viewitems.r7(true);

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        return this.f205238s.b(layoutInflater, view);
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return !this.f205238s.f205410a;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem item, yb5.d ui6, rd5.d msgData) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        return this.f205238s.c(item, ui6, msgData.f394254d.f445300b);
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 menu, android.view.View v17, rd5.d msgData) {
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        return this.f205238s.d(this, menu, v17, msgData);
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d ui6, com.tencent.mm.storage.f9 msg) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msg, "msg");
        this.f205238s.getClass();
        com.tencent.mm.ui.chatting.viewitems.s7.f205494a.a("FinderLiveThemeDelegate", view, ui6, msg);
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 holder, yb5.d ui6, rd5.d msgData, java.lang.String str) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        this.f205238s.a(this, holder instanceof com.tencent.mm.ui.chatting.viewitems.o7 ? (com.tencent.mm.ui.chatting.viewitems.o7) holder : null, holder, ui6, msgData, str);
    }
}
