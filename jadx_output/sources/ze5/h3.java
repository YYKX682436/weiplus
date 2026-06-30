package ze5;

/* loaded from: classes9.dex */
public class h3 extends com.tencent.mm.ui.chatting.viewitems.a0 implements we5.b {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f471960s;

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.e1d);
        ze5.y2 y2Var = new ze5.y2();
        y2Var.a(xgVar, false);
        xgVar.setTag(y2Var);
        return xgVar;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return false;
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
            if (!com.tencent.mm.ui.chatting.la.a(f9Var)) {
                db5.e1.y(ui6.g(), ui6.g().getString(com.tencent.mm.R.string.c96), "", ui6.g().getString(com.tencent.mm.R.string.l_e), null);
                return false;
            }
            java.lang.String s17 = c01.ia.s(f9Var);
            java.lang.String str = s17 != null ? s17 : "";
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mm.ui.chatting.viewitems.s1.c(ui6, f9Var, A(ui6, f9Var), -1, null);
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(17509, 3, str);
                db5.e1.k(ui6.g(), com.tencent.mm.R.string.ie8, com.tencent.mm.R.string.ie_, com.tencent.mm.R.string.f490598zk, com.tencent.mm.R.string.b5k, true, new ze5.f3(str, ui6), new ze5.g3(ui6, f9Var, this, str));
            }
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

    /* JADX WARN: Code restructure failed: missing block: B:119:0x013a, code lost:
    
        if (com.tencent.mm.ui.chatting.component.z4.f(r14, r8.field_fileFullPath) != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f6, code lost:
    
        if (ez.v0.b(r8, r14, r0, null, 4, null) != false) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01da  */
    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean Q(db5.g4 r24, android.view.View r25, rd5.d r26) {
        /*
            Method dump skipped, instructions count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ze5.h3.Q(db5.g4, android.view.View, rd5.d):boolean");
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        if (dVar == null) {
            return false;
        }
        com.tencent.mm.modelstat.b.d(msg, com.tencent.mm.modelstat.a.Click, dVar.f460722q, dVar.k());
        android.app.Activity g17 = dVar.g();
        kotlin.jvm.internal.o.f(g17, "getContext(...)");
        if (te5.t.b(msg, g17)) {
            return false;
        }
        ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Di(msg.Q0(), 1);
        java.lang.String j17 = msg.j();
        if (j17 == null) {
            return false;
        }
        v05.b bVar = new v05.b();
        bVar.fromXml(j17);
        int i17 = bVar.f432315e + 73;
        int integer = bVar.getInteger(i17);
        int i18 = bVar.f368365d;
        if (integer != 0) {
            bVar.set(i18 + 6, java.lang.Integer.valueOf(bVar.getInteger(i17)));
        }
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String string = bVar.getString(i18 + 0);
        ((kt.c) i0Var).getClass();
        com.tencent.mm.pluginsdk.model.app.m j18 = com.tencent.mm.pluginsdk.model.app.w.j(string, false, false);
        java.lang.String t17 = com.tencent.mm.ui.chatting.viewitems.a0.t(dVar, msg);
        if (t17 == null) {
            t17 = "";
        }
        java.lang.String str = t17;
        if (j18 != null) {
            com.tencent.mm.ui.chatting.w5.f(dVar, bVar, str, j18, msg.I0(), dVar.x());
        }
        sc5.g gVar = sc5.g.f406572a;
        android.app.Activity g18 = dVar.g();
        kotlin.jvm.internal.o.f(g18, "getContext(...)");
        java.lang.String str2 = dVar.f460722q;
        kotlin.jvm.internal.o.f(str2, "getSessionConv(...)");
        gVar.f(g18, msg, new sc5.h(str2));
        return true;
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

    @Override // we5.b
    public void e(yb5.d ui6, rd5.d msgData, java.lang.String str, we5.y0 uiBlock) {
        java.lang.String version;
        java.lang.Integer h17;
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        kotlin.jvm.internal.o.g(uiBlock, "uiBlock");
        com.tencent.mm.storage.f9 f9Var = msgData.f394254d.f445300b;
        this.f471960s = ui6;
        uiBlock.d(new ze5.z2(ui6, f9Var));
        uiBlock.d(new ze5.a3(f9Var));
        java.lang.String U1 = f9Var.U1();
        l15.c cVar = new l15.c();
        cVar.fromXml(U1 == null ? "" : U1);
        v05.b bVar = new v05.b();
        if (U1 == null) {
            U1 = "";
        }
        bVar.fromXml(U1);
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        int i17 = bVar.f368365d;
        java.lang.String string = bVar.getString(i17 + 0);
        l15.b j17 = cVar.j();
        boolean z17 = false;
        int intValue = (j17 == null || (version = j17.getVersion()) == null || (h17 = r26.h0.h(version)) == null) ? 0 : h17.intValue();
        ((kt.c) i0Var).getClass();
        com.tencent.mm.pluginsdk.model.app.m i18 = com.tencent.mm.pluginsdk.model.app.w.i(string, intValue);
        ze5.u3.a(ze5.w3.f472279a, f9Var, bVar);
        int i19 = bVar.f432315e;
        if (i18 != null) {
            r(ui6, java.lang.Integer.valueOf(bVar.getInteger(i19 + 53)), bVar.getString(i17 + 0), bVar.getInteger(i17 + 6), bVar.getString(i19 + 15), f9Var);
        }
        p15.x xVar = (p15.x) bVar.getCustom(i19 + 68);
        if (xVar != null && xVar.n() == 1) {
            z17 = true;
        }
        if (z17) {
            uiBlock.d(new ze5.b3(bVar, ui6, f9Var));
        } else {
            uiBlock.d(ze5.c3.f471866d);
        }
        uiBlock.d(ze5.d3.f471874d);
        z01.m d17 = ze5.z3.d(f9Var, ui6);
        d17.D = w(ui6);
        d17.E = u(ui6);
        sb5.z zVar = (sb5.z) ui6.f460708c.a(sb5.z.class);
        d17.F = zVar != null ? ((com.tencent.mm.ui.chatting.adapter.k) zVar).B1 : null;
        uiBlock.d(new ze5.e3(d17, msgData, ui6, bVar));
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
