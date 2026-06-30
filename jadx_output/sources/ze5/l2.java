package ze5;

/* loaded from: classes9.dex */
public final class l2 extends ze5.h2 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f472061s;

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return true;
    }

    @Override // ze5.w8, com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem item, yb5.d ui6, rd5.d msgData) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        com.tencent.mm.storage.f9 f9Var = msgData.f394254d.f445300b;
        if (item.getItemId() != 111) {
            return false;
        }
        android.app.Activity g17 = ui6.g();
        if (g17 == null) {
            return true;
        }
        ze5.n2.a(ze5.o2.f472124a, g17, f9Var);
        return true;
    }

    @Override // ze5.w8, com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 menu, android.view.View v17, rd5.d msgData) {
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        com.tencent.mm.storage.f9 f9Var = msgData.f394254d.f445300b;
        java.lang.Object tag = v17.getTag();
        com.tencent.mm.ui.chatting.viewitems.er erVar = tag instanceof com.tencent.mm.ui.chatting.viewitems.er ? (com.tencent.mm.ui.chatting.viewitems.er) tag : null;
        java.lang.Integer valueOf = erVar != null ? java.lang.Integer.valueOf(erVar.d()) : null;
        if (valueOf != null) {
            if ((f9Var.P0() == 2 || f9Var.P0() == 3 || f9Var.h2() == 1) && com.tencent.mm.ui.chatting.viewitems.a0.L(f9Var, this.f472061s) && com.tencent.mm.ui.chatting.viewitems.a0.J(f9Var.Q0())) {
                yb5.d dVar = this.f472061s;
                boolean z17 = false;
                if (dVar != null && !dVar.A()) {
                    z17 = true;
                }
                if (z17) {
                    menu.c(valueOf.intValue(), 123, 0, v17.getContext().getString(com.tencent.mm.R.string.f490869b40), com.tencent.mm.R.raw.icons_filled_previous);
                }
            }
            if (!c01.ia.A(f9Var) && !c01.ia.x(f9Var)) {
                menu.c(valueOf.intValue(), 111, 0, v17.getContext().getString(com.tencent.mm.R.string.f492836i24), com.tencent.mm.R.raw.icons_filled_share);
            }
        }
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.l6
    public void d(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        android.app.Activity g17;
        if (dVar == null || f9Var == null || (g17 = dVar.g()) == null) {
            return;
        }
        db5.e1.A(g17, dVar.s().getString(com.tencent.mm.R.string.b5h), "", dVar.s().getString(com.tencent.mm.R.string.f490543y2), dVar.s().getString(com.tencent.mm.R.string.f490347sg), new ze5.j2(f9Var, dVar), ze5.k2.f472043d);
    }

    @Override // ze5.w8
    public com.tencent.mm.mvvm.MvvmView d0(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        int i17 = q31.r.f359919c1;
        i95.m c17 = i95.n0.c(q31.r.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.mvvm.MvvmView f17 = ((bf5.a) ((q31.t) ((q31.r) c17)).Ai()).f(context);
        f17.setBackgroundResource(com.tencent.mm.R.drawable.f481244ob);
        f17.setForeground(context.getResources().getDrawable(com.tencent.mm.R.drawable.f481171me));
        f17.setPadding(0, 0, i65.a.b(context, 5), 0);
        return f17;
    }

    @Override // ze5.w8
    public void h0(ze5.n8 holder, yb5.d ui6, com.tencent.mm.storage.f9 msg, java.lang.String str) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msg, "msg");
        this.f472061s = ui6;
    }
}
