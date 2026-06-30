package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class ie extends com.tencent.mm.ui.chatting.viewitems.a0 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f204177s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f204178t;

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if ((view != null ? view.getTag() : null) == null) {
            view = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.f488513vi);
            com.tencent.mm.ui.chatting.viewitems.pe peVar = new com.tencent.mm.ui.chatting.viewitems.pe();
            peVar.a(view, true);
            view.setTag(peVar);
        }
        this.f204178t = view.findViewById(com.tencent.mm.R.id.q3t);
        return view;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem item, yb5.d ui6, rd5.d msgData) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        com.tencent.mm.ui.chatting.viewitems.re.a(com.tencent.mm.ui.chatting.viewitems.re.f205424a, this, item, ui6, msgData.f394254d.f445300b, this.f204178t);
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 menu, android.view.View v17, rd5.d msgData) {
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        com.tencent.mm.ui.chatting.viewitems.re.b(com.tencent.mm.ui.chatting.viewitems.re.f205424a, this, this.f204177s, menu, v17, msgData.f394254d.f445300b, true);
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d ui6, com.tencent.mm.storage.f9 msg) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mm.ui.chatting.viewitems.re.c(com.tencent.mm.ui.chatting.viewitems.re.f205424a, this, ui6, msg);
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 holder, yb5.d ui6, rd5.d msgData, java.lang.String str) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        com.tencent.mm.storage.f9 f9Var = msgData.f394254d.f445300b;
        this.f204177s = ui6;
        com.tencent.mm.ui.chatting.viewitems.pe.f205255h.a(this, (com.tencent.mm.ui.chatting.viewitems.pe) holder, msgData, true, holder, ui6, str);
    }
}
