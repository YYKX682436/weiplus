package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class je extends com.tencent.mm.ui.chatting.viewitems.a0 implements com.tencent.mm.ui.chatting.l6 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f204252s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f204253t;

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if ((view != null ? view.getTag() : null) == null) {
            view = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.f488557x3);
            com.tencent.mm.ui.chatting.viewitems.pe peVar = new com.tencent.mm.ui.chatting.viewitems.pe();
            peVar.a(view, false);
            view.setTag(peVar);
        }
        this.f204253t = view.findViewById(com.tencent.mm.R.id.q3t);
        return view;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem item, yb5.d ui6, rd5.d msgData) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        com.tencent.mm.ui.chatting.viewitems.re.a(com.tencent.mm.ui.chatting.viewitems.re.f205424a, this, item, ui6, msgData.f394254d.f445300b, this.f204253t);
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 menu, android.view.View v17, rd5.d msgData) {
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        com.tencent.mm.ui.chatting.viewitems.re.b(com.tencent.mm.ui.chatting.viewitems.re.f205424a, this, this.f204252s, menu, v17, msgData.f394254d.f445300b, false);
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d ui6, com.tencent.mm.storage.f9 msg) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mm.ui.chatting.viewitems.re.c(com.tencent.mm.ui.chatting.viewitems.re.f205424a, this, ui6, msg);
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.l6
    public void d(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        if (f9Var != null) {
            f9Var.unsetOmittedFailResend();
            android.util.Pair z17 = com.tencent.mm.pluginsdk.model.app.k0.z(f9Var);
            if (z17 == null || z17.second != null) {
                c01.w9.f(f9Var.getMsgId(), f9Var.Q0());
            }
            if (dVar != null) {
                dVar.L(true);
            }
        }
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 tag, yb5.d ui6, rd5.d msgData, java.lang.String str) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        com.tencent.mm.storage.f9 f9Var = msgData.f394254d.f445300b;
        this.f204252s = ui6;
        com.tencent.mm.ui.chatting.viewitems.pe peVar = (com.tencent.mm.ui.chatting.viewitems.pe) tag;
        com.tencent.mm.ui.chatting.viewitems.pe.f205255h.a(this, peVar, msgData, false, tag, ui6, str);
        V(peVar, msgData, ui6.t(), ui6.D(), ui6, this);
    }
}
