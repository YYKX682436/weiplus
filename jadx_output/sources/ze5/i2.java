package ze5;

/* loaded from: classes9.dex */
public final class i2 extends ze5.h2 {
    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return false;
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
        if (c01.ia.A(f9Var) || c01.ia.x(f9Var)) {
            return true;
        }
        menu.c(0, 111, 0, v17.getContext().getString(com.tencent.mm.R.string.f492836i24), com.tencent.mm.R.raw.icons_filled_share);
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.l6
    public void d(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
    }

    @Override // ze5.w8
    public com.tencent.mm.mvvm.MvvmView d0(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        int i17 = q31.r.f359919c1;
        i95.m c17 = i95.n0.c(q31.r.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.mvvm.MvvmView f17 = ((bf5.a) ((q31.t) ((q31.r) c17)).Ai()).f(context);
        f17.setBackgroundResource(com.tencent.mm.R.drawable.f481182mi);
        f17.setForeground(context.getResources().getDrawable(com.tencent.mm.R.drawable.f481145lu));
        f17.setPadding(i65.a.b(context, 5), 0, 0, 0);
        return f17;
    }
}
