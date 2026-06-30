package ze5;

/* loaded from: classes9.dex */
public class x9 extends com.tencent.mm.ui.chatting.viewitems.a0 implements qd5.c {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f472302s;

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.f488562e20);
        ze5.ia iaVar = new ze5.ia();
        iaVar.a(xgVar, false);
        xgVar.setTag(iaVar);
        return xgVar;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return true;
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
        if (view == null) {
            return false;
        }
        int d17 = ((com.tencent.mm.ui.chatting.viewitems.er) view.getTag()).d();
        ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
        t21.v2 g17 = t21.o2.Ui().g(f9Var.z0());
        android.view.MenuItem c17 = g4Var.c(d17, 130, 0, view.getContext().getString(com.tencent.mm.R.string.b3w), com.tencent.mm.R.raw.icons_filled_volume_off);
        int width = view.getWidth();
        int height = view.getHeight();
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("img_gallery_width", width).putExtra("img_gallery_height", height).putExtra("img_gallery_left", iArr[0]).putExtra("img_gallery_top", iArr[1]);
        ((db5.h4) c17).B = intent;
        if (g17 != null) {
            int i18 = g17.f415011i;
            if (104 != i18 && 103 != i18 && 105 != i18 && 106 != i18 && !c01.ia.y(f9Var) && !c01.ia.x(f9Var) && !c01.ia.A(f9Var)) {
                g4Var.c(d17, 107, 0, view.getContext().getString(com.tencent.mm.R.string.f492836i24), com.tencent.mm.R.raw.icons_filled_share);
            }
        } else if (f9Var.M2() && !c01.ia.x(f9Var) && !c01.ia.y(f9Var) && !c01.ia.A(f9Var)) {
            g4Var.c(d17, 107, 0, view.getContext().getString(com.tencent.mm.R.string.f492836i24), com.tencent.mm.R.raw.icons_filled_share);
        }
        if (!f9Var.t2() && ((f9Var.isVideo() || f9Var.Y2()) && com.tencent.mm.ui.chatting.viewitems.a0.L(f9Var, this.f472302s) && f9Var.K1() && com.tencent.mm.ui.chatting.viewitems.a0.J(f9Var.Q0()))) {
            g4Var.c(d17, 123, 0, view.getContext().getString(com.tencent.mm.R.string.f490869b40), com.tencent.mm.R.raw.icons_filled_previous);
        }
        if (g17 != null && ((i17 = g17.f415011i) == 199 || i17 == 199 || t21.d3.u(g17))) {
            j45.l.g("favorite");
            if (!c01.ia.A(f9Var)) {
                g4Var.c(d17, 116, 0, view.getContext().getString(com.tencent.mm.R.string.hjg), com.tencent.mm.R.raw.icons_filled_favorites);
            }
            int i19 = jt.x.M0;
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
            if (!f9Var.t2() && ((f9Var.isVideo() || f9Var.Y2()) && com.tencent.mm.ui.chatting.viewitems.a0.L(f9Var, this.f472302s) && ((g17.f415011i == 199 || t21.d3.u(g17) || g17.f415011i == 199 || f9Var.h2() == 1) && com.tencent.mm.ui.chatting.viewitems.a0.J(f9Var.Q0())))) {
                g4Var.c(d17, 123, 0, view.getContext().getString(com.tencent.mm.R.string.f490869b40), com.tencent.mm.R.raw.icons_filled_previous);
            }
            if (r01.z.f() && !this.f472302s.F()) {
                g4Var.add(d17, 114, 0, view.getContext().getString(com.tencent.mm.R.string.b3l));
            }
        } else if (f9Var.M2()) {
            j45.l.g("favorite");
            if (!c01.ia.A(f9Var)) {
                g4Var.c(d17, 116, 0, view.getContext().getString(com.tencent.mm.R.string.hjg), com.tencent.mm.R.raw.icons_filled_favorites);
            }
        }
        if (!this.f472302s.F()) {
            g4Var.c(d17, 100, 0, view.getContext().getString(com.tencent.mm.R.string.b3q), com.tencent.mm.R.raw.icons_filled_delete);
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
    public boolean a0() {
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public com.tencent.mm.storage.a9 i(com.tencent.mm.storage.f9 f9Var, android.content.Context context, yb5.q qVar, yb5.a aVar) {
        return new ze5.v9(f9Var, qVar, aVar);
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        this.f472302s = dVar;
        ze5.ia iaVar = (ze5.ia) g0Var;
        ze5.ia.d(this, iaVar, dVar2, false, iaVar, dVar, com.tencent.mm.R.drawable.bzt, u(dVar));
        ze5.v9 v9Var = (ze5.v9) f9Var.f193927g2;
        lf5.f.f318534a.a(dVar, f9Var, iaVar, this, v9Var.f472267h, v9Var.f472268i);
        ze5.ka.a(iaVar.f472020m, dVar2, dVar, iaVar);
    }
}
