package ze5;

/* loaded from: classes9.dex */
public class g5 extends ze5.w8 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f471944s;

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
        if (f9Var == null) {
            return false;
        }
        return ze5.o5.f472128a.e(item, ui6, f9Var);
    }

    @Override // ze5.w8, com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 menu, android.view.View v17, rd5.d msgData) {
        yb5.d dVar;
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        com.tencent.mm.storage.f9 f9Var = msgData.f394254d.f445300b;
        if (f9Var == null || (dVar = this.f471944s) == null) {
            return false;
        }
        return ze5.o5.f472128a.d(menu, v17, f9Var, dVar);
    }

    @Override // ze5.w8, com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        if (dVar == null || f9Var == null) {
            return false;
        }
        ze5.o5.f472128a.b(dVar, f9Var);
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void S(yb5.d ui6, rd5.d dVar) {
        sb5.e0 e0Var;
        kotlin.jvm.internal.o.g(ui6, "ui");
        if (dVar == null || (e0Var = (sb5.e0) ui6.f460708c.a(sb5.e0.class)) == null) {
            return;
        }
        ((com.tencent.mm.ui.chatting.component.f7) e0Var).m0(dVar.f394254d.f445300b);
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean a0() {
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
        com.tencent.mm.mvvm.MvvmView q17 = ((bf5.a) ((q31.t) ((q31.r) c17)).Ai()).q(context);
        q17.setBackgroundResource(com.tencent.mm.R.drawable.f481182mi);
        q17.setForeground(context.getResources().getDrawable(com.tencent.mm.R.drawable.f481145lu));
        q17.setPadding(i65.a.b(context, 5), 0, 0, 0);
        return q17;
    }

    @Override // ze5.w8
    public void h0(ze5.n8 holder, yb5.d ui6, com.tencent.mm.storage.f9 msg, java.lang.String str) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msg, "msg");
        this.f471944s = ui6;
        l15.c cVar = new l15.c();
        java.lang.String U1 = msg.U1();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (U1 == null) {
            U1 = "";
        }
        cVar.fromXml(U1);
        te5.t.a(str, ui6, msg, cVar);
    }

    @Override // ze5.w8
    public q31.p i0(yb5.d ui6, rd5.d msgData, java.lang.String str) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        z01.g0 a17 = ze5.n5.a(ze5.o5.f472128a, ui6, msgData.f394254d.f445300b);
        a17.f469038n = w(ui6);
        return a17;
    }
}
