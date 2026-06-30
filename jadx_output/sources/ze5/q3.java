package ze5;

/* loaded from: classes9.dex */
public class q3 extends com.tencent.mm.ui.chatting.viewitems.a0 implements com.tencent.mm.ui.chatting.l6, we5.b {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f472162s;

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.e1s);
        ze5.y2 y2Var = new ze5.y2();
        y2Var.a(xgVar, true);
        xgVar.setTag(y2Var);
        return xgVar;
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
        com.tencent.mm.storage.f9 f9Var = msgData.f394254d.f445300b;
        if (f9Var == null) {
            return false;
        }
        int itemId = item.getItemId();
        if (itemId == 111) {
            if (f9Var.k2()) {
                v05.b bVar = new v05.b();
                java.lang.String j17 = f9Var.j();
                if (j17 == null) {
                    j17 = "";
                }
                bVar.fromXml(j17);
                int i17 = bVar.f368365d + 6;
                if (bVar.getInteger(i17) == 40) {
                    db5.e1.y(ui6.g(), ui6.g().getString(com.tencent.mm.R.string.c96), "", ui6.g().getString(com.tencent.mm.R.string.l_e), null);
                    return false;
                }
                if (bVar.getInteger(i17) == 33 && !com.tencent.mm.sdk.platformtools.f9.SessionAppbrand.k(ui6.g(), null)) {
                    return false;
                }
            }
            com.tencent.mm.ui.chatting.viewitems.s1.c(ui6, f9Var, A(ui6, f9Var), -1, null);
        } else if (itemId != 114) {
            if (itemId == 174) {
                ze5.z3.c(f9Var, ui6);
            }
        } else {
            if (f9Var.j() == null) {
                return false;
            }
            com.tencent.mm.ui.chatting.ed.b(f9Var, c01.w9.l(ui6.D(), f9Var.j(), f9Var.A0()), ui6.g(), 256);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00af, code lost:
    
        if (ez.v0.b(ez.v0.f257777a, r14, null, null, 6, null) != false) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x020d  */
    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean Q(db5.g4 r21, android.view.View r22, rd5.d r23) {
        /*
            Method dump skipped, instructions count: 704
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ze5.q3.Q(db5.g4, android.view.View, rd5.d):boolean");
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 msg) {
        java.lang.String j17;
        kotlin.jvm.internal.o.g(msg, "msg");
        ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Di(msg.Q0(), 1);
        if (dVar != null) {
            android.app.Activity g17 = dVar.g();
            kotlin.jvm.internal.o.f(g17, "getContext(...)");
            if (!te5.t.b(msg, g17) && (j17 = msg.j()) != null) {
                v05.b bVar = new v05.b();
                bVar.fromXml(j17);
                lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
                java.lang.String string = bVar.getString(bVar.f368365d + 0);
                ((kt.c) i0Var).getClass();
                com.tencent.mm.pluginsdk.model.app.m h17 = com.tencent.mm.pluginsdk.model.app.w.h(string);
                if (h17 != null && !com.tencent.mm.sdk.platformtools.t8.K0(h17.field_appId)) {
                    com.tencent.mm.ui.chatting.w5.f(dVar, bVar, c01.z1.r(), h17, msg.I0(), dVar.x());
                }
                sc5.g gVar = sc5.g.f406572a;
                android.app.Activity g18 = dVar.g();
                kotlin.jvm.internal.o.f(g18, "getContext(...)");
                java.lang.String str = dVar.f460722q;
                kotlin.jvm.internal.o.f(str, "getSessionConv(...)");
                gVar.f(g18, msg, new sc5.h(str));
            }
        }
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean a0() {
        return j62.e.g().c(new com.tencent.mm.repairer.config.revoke.RepairerConfigFileRevokeFix()) == 1;
    }

    @Override // we5.b
    public rd5.d b(we5.a params) {
        kotlin.jvm.internal.o.g(params, "params");
        return new ze5.x2(params);
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
        db5.e1.A(dVar.g(), dVar.s().getString(com.tencent.mm.R.string.b5h), "", dVar.s().getString(com.tencent.mm.R.string.f490543y2), dVar.s().getString(com.tencent.mm.R.string.f490347sg), new ze5.o3(f9Var, dVar), ze5.p3.f472144d);
    }

    @Override // we5.b
    public void e(yb5.d ui6, rd5.d msgData, java.lang.String str, we5.y0 uiBlock) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        kotlin.jvm.internal.o.g(uiBlock, "uiBlock");
        com.tencent.mm.storage.f9 f9Var = msgData.f394254d.f445300b;
        this.f472162s = ui6;
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
        v05.b bVar = new v05.b();
        if (U1 == null) {
            U1 = "";
        }
        bVar.fromXml(U1);
        ze5.u3.a(ze5.w3.f472279a, f9Var, bVar);
        p15.x xVar = (p15.x) bVar.getCustom(bVar.f432315e + 68);
        boolean z17 = false;
        if (xVar != null && xVar.n() == 1) {
            z17 = true;
        }
        if (z17) {
            uiBlock.d(new ze5.i3(bVar, ui6, f9Var));
        } else {
            uiBlock.d(ze5.j3.f472029d);
        }
        uiBlock.d(new ze5.k3(this, f9Var));
        z01.m d17 = ze5.z3.d(f9Var, ui6);
        d17.D = w(ui6);
        d17.E = u(ui6);
        sb5.z zVar = (sb5.z) cVar.a(sb5.z.class);
        d17.F = zVar != null ? ((com.tencent.mm.ui.chatting.adapter.k) zVar).B1 : null;
        uiBlock.d(new ze5.l3(d17, msgData, ui6, bVar));
        uiBlock.d(new ze5.m3(this, msgData, ui6));
        uiBlock.d(new ze5.n3(f9Var));
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public com.tencent.mm.storage.a9 i(com.tencent.mm.storage.f9 f9Var, android.content.Context context, yb5.q talkerInfo, yb5.a componentProvider) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(talkerInfo, "talkerInfo");
        kotlin.jvm.internal.o.g(componentProvider, "componentProvider");
        return new ze5.v3(f9Var);
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 tag, yb5.d ui6, rd5.d msgData, java.lang.String str) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        ze5.y2 y2Var = tag instanceof ze5.y2 ? (ze5.y2) tag : null;
        if (y2Var != null) {
            e(ui6, msgData, str, new we5.y0(new we5.u0(y2Var)));
        }
    }
}
