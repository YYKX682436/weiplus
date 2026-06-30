package ze5;

/* loaded from: classes9.dex */
public class r6 extends com.tencent.mm.ui.chatting.viewitems.a0 implements qd5.c {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f472181s;

    /* renamed from: t, reason: collision with root package name */
    public ze5.u6 f472182t;

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.e1k);
        ze5.w6 w6Var = new ze5.w6();
        w6Var.a(xgVar, true);
        xgVar.setTag(w6Var);
        return xgVar;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return false;
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
        if (137 == menuItem.getItemId() || 170 == menuItem.getItemId()) {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            m11.b0 b27 = m11.b1.Di().b2(f9Var.Q0(), f9Var.I0());
            cc0.l lVar = (cc0.l) i95.n0.c(cc0.l.class);
            tg3.u0 u0Var = (tg3.u0) i95.n0.c(tg3.u0.class);
            rq3.k kVar = (rq3.k) lVar;
            kVar.fj(((k90.b) u0Var).aj(f9Var, bm5.c0.f22550a.d(b27.l()), b27.f322637e, "", ""), f9Var.getMsgId(), 1);
        }
        ((com.tencent.mm.ui.chatting.component.lk) ((sb5.w1) dVar.f460708c.a(sb5.w1.class))).m0(menuItem, f9Var);
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        m11.b0 b0Var;
        com.tencent.mm.storage.f9 f9Var = dVar.f394254d.f445300b;
        if (c01.d9.b().E() && view != null && f9Var != null) {
            int d17 = ((com.tencent.mm.ui.chatting.viewitems.er) view.getTag()).d();
            if (f9Var.getMsgId() > 0) {
                ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                b0Var = m11.b1.Di().T1(f9Var.Q0(), f9Var.getMsgId());
            } else {
                b0Var = null;
            }
            if ((b0Var == null || b0Var.f322633a <= 0) && f9Var.I0() > 0) {
                ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                b0Var = m11.b1.Di().b2(f9Var.Q0(), f9Var.I0());
            }
            m11.b0 b0Var2 = b0Var;
            if (!c01.ia.y(f9Var) && !c01.ia.x(f9Var)) {
                g4Var.c(d17, 110, 0, view.getContext().getString(com.tencent.mm.R.string.f492836i24), com.tencent.mm.R.raw.icons_filled_share);
            }
            if (r01.z.d() && !this.f472181s.F()) {
                g4Var.add(d17, 114, 0, view.getContext().getString(com.tencent.mm.R.string.b3l));
            }
            j45.l.g("favorite");
            g4Var.c(d17, 116, 0, view.getContext().getString(com.tencent.mm.R.string.hjg), com.tencent.mm.R.raw.icons_filled_favorites);
            if (b0Var2 != null && b0Var2.f322648p != -1) {
                android.view.MenuItem c17 = g4Var.c(d17, 131, 0, view.getContext().getString(com.tencent.mm.R.string.b2d), com.tencent.mm.R.raw.icons_filled_pencil);
                int[] iArr = new int[2];
                int width = view.getWidth();
                int height = view.getHeight();
                view.getLocationOnScreen(iArr);
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("img_gallery_width", width).putExtra("img_gallery_height", height).putExtra("img_gallery_left", iArr[0]).putExtra("img_gallery_top", iArr[1]);
                ((db5.h4) c17).B = intent;
            }
            int i17 = jt.x.M0;
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
            if (!this.f472181s.F()) {
                g4Var.c(d17, 100, 0, view.getContext().getString(com.tencent.mm.R.string.b3o), com.tencent.mm.R.raw.icons_filled_delete);
            }
            if (c01.ia.A(f9Var) || c01.ia.z(f9Var) || c01.ia.L(f9Var)) {
                g4Var.clear();
                if (!this.f472181s.F()) {
                    g4Var.c(d17, 100, 0, view.getContext().getString(com.tencent.mm.R.string.b3o), com.tencent.mm.R.raw.icons_filled_delete);
                }
            }
        }
        return true;
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
    public boolean c0(yb5.d dVar) {
        return dVar.D();
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public com.tencent.mm.storage.a9 i(com.tencent.mm.storage.f9 f9Var, android.content.Context context, yb5.q qVar, yb5.a aVar) {
        return new ze5.v6(f9Var, qVar, aVar);
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        this.f472181s = dVar;
        ((com.tencent.mm.ui.chatting.component.f7) ((sb5.e0) dVar.f460708c.a(sb5.e0.class))).p0(f9Var);
        ze5.w6 w6Var = (ze5.w6) g0Var;
        z01.q qVar = new z01.q();
        af5.y0.b(qVar, f9Var);
        if (this.f472182t == null) {
            this.f472182t = new ze5.u6(this.f472181s, this, true);
        }
        ze5.u6 u6Var = this.f472182t;
        u6Var.f472226h = 0;
        qVar.f469141f = u6Var;
        qVar.f469142g = u(dVar);
        qVar.f469143h = ((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) dVar.f460708c.a(sb5.z.class))).B1;
        w6Var.f472284c.setViewModel(qVar);
        w6Var.f472284c.setItemTag(new com.tencent.mm.ui.chatting.viewitems.er(dVar2, dVar.D(), w6Var, f9Var.Q0()));
        w6Var.f472283b.setViewModel(ze5.o6.a(f9Var, this, dVar, w6Var));
        ym5.a1.h(g0Var.convertView, new ze5.q6(this, f9Var));
        ze5.v6 v6Var = (ze5.v6) f9Var.f193927g2;
        lf5.f.f318534a.a(dVar, f9Var, w6Var, this, v6Var.f472255f, v6Var.f472257h);
        ze5.o6.b(w6Var.f472285d, dVar2, dVar, w6Var);
    }
}
