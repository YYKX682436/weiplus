package ze5;

/* loaded from: classes9.dex */
public class p5 extends ze5.w8 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f472147s;

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
        if (f9Var == null || (dVar = this.f472147s) == null) {
            return false;
        }
        return ze5.o5.f472128a.d(menu, v17, f9Var, dVar);
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
        com.tencent.mm.mvvm.MvvmView h17 = ((bf5.a) ((q31.t) ((q31.r) c17)).Ai()).h(context);
        h17.setBackgroundResource(com.tencent.mm.R.drawable.f481182mi);
        h17.setForeground(context.getResources().getDrawable(com.tencent.mm.R.drawable.f481145lu));
        h17.setPadding(i65.a.b(context, 5), 0, 0, 0);
        return h17;
    }

    @Override // ze5.w8
    public void h0(ze5.n8 holder, yb5.d ui6, com.tencent.mm.storage.f9 msg, java.lang.String str) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msg, "msg");
        this.f472147s = ui6;
        ze5.u5.b(ze5.v5.f472252a, holder, ui6, msg, str);
    }

    @Override // ze5.w8
    public q31.p i0(yb5.d ui6, rd5.d msgData, java.lang.String str) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        return ze5.u5.a(ze5.v5.f472252a, ui6, msgData.f394254d.f445300b);
    }
}
