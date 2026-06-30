package ze5;

/* loaded from: classes9.dex */
public class h9 extends ze5.w8 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f471977s;

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return false;
    }

    @Override // ze5.w8, com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem item, yb5.d ui6, rd5.d msgData) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        ze5.m9.f472099a.a(this, item, ui6, msgData.f394254d.f445300b);
        return false;
    }

    @Override // ze5.w8, com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 menu, android.view.View v17, rd5.d msgData) {
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        com.tencent.mm.storage.f9 f9Var = msgData.f394254d.f445300b;
        yb5.d dVar = this.f471977s;
        if (dVar == null) {
            return false;
        }
        ze5.m9.f472099a.b(dVar, menu, v17, f9Var, true);
        return true;
    }

    @Override // ze5.w8, com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        if (dVar == null || f9Var == null) {
            return false;
        }
        return ze5.m9.f472099a.c(dVar, f9Var);
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
        com.tencent.mm.mvvm.MvvmView n17 = ((bf5.a) ((q31.t) ((q31.r) c17)).Ai()).n(context);
        n17.setBackgroundResource(com.tencent.mm.R.drawable.f481182mi);
        n17.setForeground(context.getResources().getDrawable(com.tencent.mm.R.drawable.f481145lu));
        n17.setPadding(i65.a.b(context, 5), 0, 0, 0);
        return n17;
    }

    @Override // ze5.w8
    public q31.p i0(yb5.d ui6, rd5.d msgData, java.lang.String str) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        this.f471977s = ui6;
        z01.e0 d17 = ze5.m9.f472099a.d(ui6, msgData.f394254d.f445300b);
        d17.f469003h = new ze5.g9(this, ui6, msgData);
        return d17;
    }
}
