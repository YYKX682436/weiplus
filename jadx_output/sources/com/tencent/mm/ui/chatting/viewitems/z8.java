package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class z8 extends com.tencent.mm.ui.chatting.viewitems.a0 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f206117s;

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.f488508va);
        com.tencent.mm.ui.chatting.viewitems.y8 y8Var = com.tencent.mm.ui.chatting.viewitems.b9.f203469a;
        y8Var.a(xgVar);
        xgVar.setTag(y8Var);
        return xgVar;
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
        com.tencent.mm.storage.f9 f9Var = msgData.f394254d.f445300b;
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 menu, android.view.View v17, rd5.d msgData) {
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        com.tencent.mm.storage.f9 f9Var = msgData.f394254d.f445300b;
        java.lang.Object tag = v17.getTag();
        kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ItemDataTag");
        int d17 = ((com.tencent.mm.ui.chatting.viewitems.er) tag).d();
        yb5.d dVar = this.f206117s;
        kotlin.jvm.internal.o.d(dVar);
        menu.c(d17, 100, 0, dVar.s().getString(com.tencent.mm.R.string.b3p), com.tencent.mm.R.raw.icons_filled_delete);
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 holder, yb5.d ui6, rd5.d msgData, java.lang.String userName) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        kotlin.jvm.internal.o.g(userName, "userName");
        com.tencent.mm.storage.f9 f9Var = msgData.f394254d.f445300b;
        this.f206117s = ui6;
        com.tencent.mm.ui.chatting.viewitems.y8 y8Var = holder instanceof com.tencent.mm.ui.chatting.viewitems.y8 ? (com.tencent.mm.ui.chatting.viewitems.y8) holder : null;
        if (y8Var != null) {
            kotlin.jvm.internal.o.d(f9Var);
            y8Var.b(y8Var, ui6, f9Var, userName, this, true);
        }
    }
}
