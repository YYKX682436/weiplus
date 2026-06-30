package ze5;

/* loaded from: classes9.dex */
public final class m7 extends ze5.w8 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f472097s;

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return false;
    }

    @Override // ze5.w8, com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem item, yb5.d ui6, rd5.d msgData) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        return ze5.r7.d(ze5.s7.f472191a, item, ui6, msgData.f394254d.f445300b);
    }

    @Override // ze5.w8, com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 menu, android.view.View v17, rd5.d msgData) {
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        com.tencent.mm.storage.f9 f9Var = msgData.f394254d.f445300b;
        yb5.d dVar = this.f472097s;
        if (dVar != null) {
            return ze5.r7.c(ze5.s7.f472191a, dVar, menu, v17, f9Var);
        }
        return false;
    }

    @Override // ze5.w8, com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        if (dVar == null || f9Var == null) {
            return false;
        }
        ze5.r7.b(ze5.s7.f472191a, f9Var, dVar);
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
        com.tencent.mm.mvvm.MvvmView l17 = ((bf5.a) ((q31.t) ((q31.r) c17)).Ai()).l(context);
        l17.setBackgroundResource(com.tencent.mm.R.drawable.f481182mi);
        l17.setForeground(context.getResources().getDrawable(com.tencent.mm.R.drawable.f481145lu));
        l17.setPadding(i65.a.b(context, 5), 0, 0, 0);
        return l17;
    }

    @Override // ze5.w8
    public void h0(ze5.n8 holder, yb5.d ui6, com.tencent.mm.storage.f9 msg, java.lang.String str) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msg, "msg");
        this.f472097s = ui6;
    }

    @Override // ze5.w8
    public q31.p i0(yb5.d ui6, rd5.d msgData, java.lang.String str) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        z01.s a17 = ze5.r7.a(ze5.s7.f472191a, ui6, msgData.f394254d.f445300b);
        a17.f469160h = w(ui6);
        return a17;
    }
}
