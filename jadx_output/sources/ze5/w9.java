package ze5;

/* loaded from: classes9.dex */
public class w9 extends com.tencent.mm.ui.chatting.viewitems.a0 implements qd5.c {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f472287s;

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.e1l);
        ze5.ia iaVar = new ze5.ia();
        iaVar.a(xgVar, true);
        xgVar.setTag(iaVar);
        return xgVar;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        ((com.tencent.mm.ui.chatting.component.jo) ((sb5.p2) dVar.f460708c.a(sb5.p2.class))).n0(menuItem, dVar2.f394254d.f445300b);
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        int i17;
        com.tencent.mm.storage.f9 f9Var = dVar.f394254d.f445300b;
        if (c01.d9.b().E()) {
            int d17 = ((com.tencent.mm.ui.chatting.viewitems.er) view.getTag()).d();
            ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
            t21.v2 g17 = t21.o2.Ui().g(f9Var.z0());
            g4Var.c(d17, 130, 0, view.getContext().getString(com.tencent.mm.R.string.b3w), com.tencent.mm.R.raw.icons_filled_volume_off);
            if (!c01.ia.x(f9Var) && !c01.ia.y(f9Var) && !c01.ia.A(f9Var)) {
                g4Var.c(d17, 107, 0, view.getContext().getString(com.tencent.mm.R.string.f492836i24), com.tencent.mm.R.raw.icons_filled_share);
            }
            j45.l.g("favorite");
            if (!c01.ia.A(f9Var)) {
                g4Var.c(d17, 116, 0, view.getContext().getString(com.tencent.mm.R.string.hjg), com.tencent.mm.R.raw.icons_filled_favorites);
            }
            int i18 = jt.x.M0;
            if ((((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.openway.RepairerConfigMsgMenuOpenDisable()) == 0) && !((gb0.n) ((fb0.k) i95.n0.c(fb0.k.class))).Ai(f9Var)) {
                com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent exDeviceHaveBindNetworkDeviceEvent = new com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent();
                long msgId = f9Var.getMsgId();
                am.b6 b6Var = exDeviceHaveBindNetworkDeviceEvent.f54141g;
                b6Var.f6219a = msgId;
                b6Var.f6220b = f9Var.Q0();
                exDeviceHaveBindNetworkDeviceEvent.e();
                if (exDeviceHaveBindNetworkDeviceEvent.f54142h.f6336a) {
                    g4Var.c(d17, 129, 0, view.getContext().getString(com.tencent.mm.R.string.b3x), com.tencent.mm.R.raw.icons_filled_open);
                }
            }
            if (g17 != null && (((i17 = g17.f415011i) == 199 || i17 == 199) && r01.z.f() && !this.f472287s.F())) {
                g4Var.add(d17, 114, 0, view.getContext().getString(com.tencent.mm.R.string.b3l));
            }
            if (c01.ia.A(f9Var) || c01.ia.L(f9Var)) {
                g4Var.clear();
                g4Var.c(d17, 130, 0, view.getContext().getString(com.tencent.mm.R.string.b3w), com.tencent.mm.R.raw.icons_filled_volume_off);
            }
            t21.j3 d18 = (!t21.d3.s() || g17 == null) ? null : t21.j3.f414800h.d(g17.g());
            if (d18 != null && d18.f414804b) {
                g4Var.clear();
            }
            if (!this.f472287s.F()) {
                g4Var.c(d17, 100, 0, view.getContext().getString(com.tencent.mm.R.string.b3q), com.tencent.mm.R.raw.icons_filled_delete);
            }
        }
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        return true;
    }

    @Override // qd5.c
    public qd5.a a(rd5.d dVar) {
        return ze5.ka.b(dVar);
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public com.tencent.mm.storage.a9 i(com.tencent.mm.storage.f9 f9Var, android.content.Context context, yb5.q qVar, yb5.a aVar) {
        return new ze5.v9(f9Var, qVar, aVar);
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        this.f472287s = dVar;
        ze5.ia iaVar = (ze5.ia) g0Var;
        ze5.ia.d(this, iaVar, dVar2, true, iaVar, dVar, com.tencent.mm.R.drawable.bzt, u(dVar));
        ze5.v9 v9Var = (ze5.v9) f9Var.f193927g2;
        lf5.f.f318534a.a(dVar, f9Var, iaVar, this, v9Var.f472267h, v9Var.f472268i);
        ze5.ka.a(iaVar.f472020m, dVar2, dVar, iaVar);
    }
}
