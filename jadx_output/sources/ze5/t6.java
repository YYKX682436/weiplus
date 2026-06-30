package ze5;

/* loaded from: classes9.dex */
public class t6 extends com.tencent.mm.ui.chatting.viewitems.a0 implements com.tencent.mm.ui.chatting.l6, qd5.c {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f472206s;

    /* renamed from: t, reason: collision with root package name */
    public ze5.u6 f472207t;

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.e1z);
        ze5.w6 w6Var = new ze5.w6();
        w6Var.a(xgVar, false);
        xgVar.setTag(w6Var);
        return xgVar;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        if (100 == menuItem.getItemId()) {
            ze5.o6.c(f9Var, this, dVar);
            return false;
        }
        if (131 == menuItem.getItemId()) {
            ze5.o6.d(dVar, menuItem, f9Var);
            return false;
        }
        if (123 == menuItem.getItemId()) {
            nc5.a.f336188a.b(f9Var, 1);
            return false;
        }
        ((com.tencent.mm.ui.chatting.component.lk) ((sb5.w1) dVar.f460708c.a(sb5.w1.class))).m0(menuItem, f9Var);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0295  */
    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean Q(db5.g4 r18, android.view.View r19, rd5.d r20) {
        /*
            Method dump skipped, instructions count: 811
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ze5.t6.Q(db5.g4, android.view.View, rd5.d):boolean");
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        return false;
    }

    @Override // qd5.c
    public qd5.a a(rd5.d dVar) {
        return ze5.o6.e(dVar);
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean a0() {
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.l6
    public void d(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        f9Var.unsetOmittedFailResend();
        ((com.tencent.mm.storage.g9) c01.d9.b().u()).lb(f9Var.getMsgId(), f9Var, true);
        com.tencent.mm.ui.chatting.component.lk lkVar = (com.tencent.mm.ui.chatting.component.lk) ((sb5.w1) dVar.f460708c.a(sb5.w1.class));
        lkVar.getClass();
        if (f9Var.J2()) {
            if (!c01.d9.b().E()) {
                db5.t7.k(lkVar.f198580d.g(), lkVar.f198580d.f460717l.getContentView());
                return;
            }
            if (!lkVar.f198580d.x().equals("medianote")) {
                ((e21.z0) c01.d9.b().w()).c(new e21.n(f9Var.Q0(), f9Var.I0()));
            }
            com.tencent.mm.ui.chatting.ic.e(f9Var);
            lkVar.f198580d.L(true);
        }
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public com.tencent.mm.storage.a9 i(com.tencent.mm.storage.f9 f9Var, android.content.Context context, yb5.q qVar, yb5.a aVar) {
        return new ze5.v6(f9Var, qVar, aVar);
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        this.f472206s = dVar;
        ze5.w6 w6Var = (ze5.w6) g0Var;
        z01.q qVar = new z01.q();
        af5.y0.b(qVar, f9Var);
        if (this.f472207t == null) {
            this.f472207t = new ze5.u6(this.f472206s, this, false);
        }
        qVar.f469141f = this.f472207t;
        qVar.f469142g = u(dVar);
        qVar.f469143h = ((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) dVar.f460708c.a(sb5.z.class))).B1;
        w6Var.f472284c.setViewModel(qVar);
        w6Var.f472284c.setItemTag(new com.tencent.mm.ui.chatting.viewitems.er(dVar2, dVar.D(), w6Var, f9Var.Q0()));
        W(w6Var, dVar2, dVar.t(), false, dVar.D(), dVar, this);
        w6Var.f472283b.setViewModel(ze5.o6.a(f9Var, this, dVar, w6Var));
        ym5.a1.h(g0Var.convertView, new ze5.s6(this, f9Var));
        ze5.v6 v6Var = (ze5.v6) f9Var.f193927g2;
        lf5.f.f318534a.a(dVar, f9Var, w6Var, this, v6Var.f472255f, v6Var.f472257h);
        ze5.o6.b(w6Var.f472285d, dVar2, dVar, w6Var);
    }
}
