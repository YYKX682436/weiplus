package ze5;

/* loaded from: classes9.dex */
public class p1 extends com.tencent.mm.ui.chatting.viewitems.a0 implements we5.b {

    /* renamed from: t, reason: collision with root package name */
    public static final ze5.h1 f472138t = new ze5.h1(null);

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f472139s;

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.e1b);
        ze5.g1 g1Var = new ze5.g1();
        g1Var.a(xgVar, false);
        xgVar.setTag(g1Var);
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
                db5.e1.k(ui6.g(), com.tencent.mm.R.string.ie8, com.tencent.mm.R.string.ie_, com.tencent.mm.R.string.f490598zk, com.tencent.mm.R.string.b5k, true, new ze5.n1(str, ui6), new ze5.o1(ui6, f9Var, this, str));
            }
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

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0105, code lost:
    
        if (com.tencent.mm.ui.chatting.component.z4.f(r14, r8.field_fileFullPath) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c1, code lost:
    
        if (ez.v0.b(r0, r14, r1, null, 4, null) != false) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0135  */
    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean Q(db5.g4 r26, android.view.View r27, rd5.d r28) {
        /*
            Method dump skipped, instructions count: 685
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ze5.p1.Q(db5.g4, android.view.View, rd5.d):boolean");
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        return f472138t.a(dVar, msg);
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

    @Override // we5.b
    public void e(yb5.d ui6, rd5.d msgData, java.lang.String str, we5.y0 uiBlock) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        kotlin.jvm.internal.o.g(uiBlock, "uiBlock");
        com.tencent.mm.storage.f9 f9Var = msgData.f394254d.f445300b;
        this.f472139s = ui6;
        uiBlock.d(new ze5.i1(ui6, f9Var));
        java.lang.String U1 = f9Var.U1();
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        ot0.q v17 = ot0.q.v(U1);
        h0Var.f310123d = v17;
        if (v17 != null) {
            lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
            java.lang.Object obj = h0Var.f310123d;
            java.lang.String str2 = ((ot0.q) obj).f348646d;
            int i17 = ((ot0.q) obj).G;
            ((kt.c) i0Var).getClass();
            com.tencent.mm.pluginsdk.model.app.m i18 = com.tencent.mm.pluginsdk.model.app.w.i(str2, i17);
            ze5.b2.a(ze5.d2.f471873a, f9Var, (ot0.q) h0Var.f310123d, null);
            if (i18 != null) {
                q(ui6, (ot0.q) h0Var.f310123d, f9Var);
            }
            if (te5.e2.e((ot0.q) h0Var.f310123d)) {
                uiBlock.d(new ze5.j1(h0Var, ui6, f9Var));
            } else {
                uiBlock.d(ze5.k1.f472042d);
            }
            uiBlock.d(ze5.l1.f472060d);
        }
        z01.m e17 = ze5.g2.e(f9Var, ui6);
        e17.D = w(ui6);
        e17.E = u(ui6);
        sb5.z zVar = (sb5.z) ui6.f460708c.a(sb5.z.class);
        e17.F = zVar != null ? ((com.tencent.mm.ui.chatting.adapter.k) zVar).B1 : null;
        uiBlock.d(new ze5.m1(e17, msgData, ui6, h0Var));
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
