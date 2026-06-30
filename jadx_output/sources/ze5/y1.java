package ze5;

/* loaded from: classes9.dex */
public class y1 extends com.tencent.mm.ui.chatting.viewitems.a0 implements com.tencent.mm.ui.chatting.l6, we5.b {

    /* renamed from: t, reason: collision with root package name */
    public static final ze5.q1 f472306t = new ze5.q1(null);

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f472307s;

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.e1q);
        ze5.g1 g1Var = new ze5.g1();
        g1Var.a(xgVar, true);
        xgVar.setTag(g1Var);
        return xgVar;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem item, yb5.d ui6, rd5.d msgData) {
        ot0.q v17;
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        com.tencent.mm.storage.f9 f9Var = msgData.f394254d.f445300b;
        if (f9Var == null) {
            return false;
        }
        int itemId = item.getItemId();
        if (itemId == 111) {
            if (f9Var.k2() && (v17 = ot0.q.v(f9Var.j())) != null) {
                int i17 = v17.f348666i;
                if (i17 == 40) {
                    db5.e1.y(ui6.g(), ui6.g().getString(com.tencent.mm.R.string.c96), "", ui6.g().getString(com.tencent.mm.R.string.l_e), null);
                    return false;
                }
                if (i17 == 33 && !com.tencent.mm.sdk.platformtools.f9.SessionAppbrand.k(ui6.g(), null)) {
                    return false;
                }
            }
            com.tencent.mm.ui.chatting.viewitems.s1.c(ui6, f9Var, A(ui6, f9Var), -1, null);
        } else if (itemId == 114) {
            java.lang.String j17 = f9Var.j();
            if (j17 != null && ot0.q.v(j17) != null) {
                com.tencent.mm.ui.chatting.ed.b(f9Var, c01.w9.l(ui6.D(), f9Var.j(), f9Var.A0()), ui6.g(), 256);
            }
        } else if (itemId == 174) {
            ze5.g2.c(f9Var, ui6);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ab, code lost:
    
        if (ez.v0.b(r8, r14, null, null, 6, null) != false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00d7  */
    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean Q(db5.g4 r19, android.view.View r20, rd5.d r21) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ze5.y1.Q(db5.g4, android.view.View, rd5.d):boolean");
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        return f472306t.a(dVar, msg);
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean a0() {
        return true;
    }

    @Override // we5.b
    public rd5.d b(we5.a params) {
        kotlin.jvm.internal.o.g(params, "params");
        return new ze5.f1(params);
    }

    @Override // we5.b
    public boolean c() {
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.l6
    public void d(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        if (view == null || dVar == null || f9Var == null) {
            return;
        }
        db5.e1.A(dVar.g(), dVar.s().getString(com.tencent.mm.R.string.b5h), "", dVar.s().getString(com.tencent.mm.R.string.f490543y2), dVar.s().getString(com.tencent.mm.R.string.f490347sg), new ze5.w1(f9Var, dVar), ze5.x1.f472291d);
    }

    @Override // we5.b
    public void e(yb5.d ui6, rd5.d msgData, java.lang.String str, we5.y0 uiBlock) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        kotlin.jvm.internal.o.g(uiBlock, "uiBlock");
        com.tencent.mm.storage.f9 f9Var = msgData.f394254d.f445300b;
        this.f472307s = ui6;
        com.tencent.mm.ui.chatting.manager.c cVar = ui6.f460708c;
        sb5.e0 e0Var = (sb5.e0) cVar.a(sb5.e0.class);
        if (e0Var != null) {
            ((com.tencent.mm.ui.chatting.component.f7) e0Var).n0(f9Var);
        }
        sb5.e0 e0Var2 = (sb5.e0) cVar.a(sb5.e0.class);
        if (e0Var2 != null) {
            ((com.tencent.mm.ui.chatting.component.f7) e0Var2).m0(f9Var);
        }
        java.lang.String U1 = f9Var.U1();
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        ot0.q v17 = ot0.q.v(U1);
        h0Var.f310123d = v17;
        if (v17 != null) {
            ze5.b2.a(ze5.d2.f471873a, f9Var, v17, null);
            if (te5.e2.e((ot0.q) h0Var.f310123d)) {
                uiBlock.d(new ze5.r1(h0Var, ui6, f9Var));
            } else {
                uiBlock.d(ze5.s1.f472186d);
            }
            uiBlock.d(new ze5.t1(this, f9Var));
        }
        z01.m e17 = ze5.g2.e(f9Var, ui6);
        e17.D = w(ui6);
        e17.E = u(ui6);
        sb5.z zVar = (sb5.z) cVar.a(sb5.z.class);
        e17.F = zVar != null ? ((com.tencent.mm.ui.chatting.adapter.k) zVar).B1 : null;
        uiBlock.d(new ze5.u1(e17, msgData, ui6, h0Var));
        uiBlock.d(new ze5.v1(this, msgData, ui6));
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public com.tencent.mm.storage.a9 i(com.tencent.mm.storage.f9 f9Var, android.content.Context context, yb5.q talkerInfo, yb5.a componentProvider) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(talkerInfo, "talkerInfo");
        kotlin.jvm.internal.o.g(componentProvider, "componentProvider");
        return new ze5.c2(f9Var);
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 tag, yb5.d ui6, rd5.d msgData, java.lang.String str) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        ze5.g1 g1Var = tag instanceof ze5.g1 ? (ze5.g1) tag : null;
        if (g1Var != null) {
            e(ui6, msgData, str, new we5.y0(new we5.u0(g1Var)));
        }
    }
}
