package com.tencent.mm.ui.chatting.viewitems;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.if, reason: invalid class name */
/* loaded from: classes9.dex */
public class Cif extends com.tencent.mm.ui.chatting.viewitems.a0 implements com.tencent.mm.ui.chatting.l6 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f204179s;

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.f488558x4);
        com.tencent.mm.ui.chatting.viewitems.lf lfVar = new com.tencent.mm.ui.chatting.viewitems.lf();
        lfVar.a(xgVar, false);
        xgVar.setTag(lfVar);
        return xgVar;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        ot0.q v17;
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        int itemId = menuItem.getItemId();
        if (itemId != 103) {
            if (itemId != 111) {
                return false;
            }
            com.tencent.mm.ui.chatting.viewitems.s1.c(dVar, f9Var, A(dVar, f9Var), -1, null);
            return false;
        }
        java.lang.String j17 = f9Var.j();
        if (j17 != null && (v17 = ot0.q.v(j17)) != null && v17.f348666i == 16) {
            com.tencent.mm.autogen.events.GiftCardEvent giftCardEvent = new com.tencent.mm.autogen.events.GiftCardEvent();
            java.lang.String str = v17.T0;
            am.yg ygVar = giftCardEvent.f54423g;
            ygVar.f8458a = str;
            ygVar.f8459b = f9Var.getMsgId();
            ygVar.f8460c = f9Var.Q0();
            giftCardEvent.e();
        }
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        ot0.q v17;
        com.tencent.mm.storage.f9 f9Var = dVar.f394254d.f445300b;
        int d17 = ((com.tencent.mm.ui.chatting.viewitems.er) view.getTag()).d();
        if (f9Var.j() == null || (v17 = ot0.q.v(c01.w9.l(this.f204179s.D(), f9Var.j(), f9Var.A0()))) == null) {
            return true;
        }
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String str = v17.f348646d;
        ((kt.c) i0Var).getClass();
        if (((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).nj(com.tencent.mm.pluginsdk.model.app.w.j(str, false, false)) && !com.tencent.mm.ui.chatting.n3.k(f9Var)) {
            g4Var.c(d17, 111, 0, this.f204179s.s().getString(com.tencent.mm.R.string.f492836i24), com.tencent.mm.R.raw.icons_filled_share);
        }
        if ((f9Var.P0() == 2 || f9Var.P0() == 3 || f9Var.h2() == 1) && com.tencent.mm.ui.chatting.viewitems.a0.L(f9Var, this.f204179s) && com.tencent.mm.ui.chatting.viewitems.a0.J(f9Var.Q0())) {
            g4Var.c(d17, 123, 0, view.getContext().getString(com.tencent.mm.R.string.f490869b40), com.tencent.mm.R.raw.icons_filled_previous);
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
        if (!this.f204179s.F()) {
            g4Var.c(d17, 100, 0, this.f204179s.s().getString(com.tencent.mm.R.string.b3p), com.tencent.mm.R.raw.icons_filled_delete);
        }
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        ot0.q v17;
        ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Di(f9Var.Q0(), 1);
        java.lang.String j17 = f9Var.j();
        if (j17 == null || (v17 = ot0.q.v(j17)) == null) {
            return false;
        }
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String str = v17.f348646d;
        ((kt.c) i0Var).getClass();
        com.tencent.mm.pluginsdk.model.app.m h17 = com.tencent.mm.pluginsdk.model.app.w.h(str);
        if (h17 != null && !com.tencent.mm.sdk.platformtools.t8.K0(h17.field_appId)) {
            com.tencent.mm.ui.chatting.w5.e(dVar, v17, c01.z1.r(), h17, f9Var.I0(), dVar.x());
        }
        com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent();
        java.lang.String str2 = v17.f348677k2;
        am.nx nxVar = startAppBrandUIFromOuterEvent.f54857g;
        nxVar.f7473h = str2;
        nxVar.f7466a = v17.f348673j2;
        nxVar.f7467b = v17.f348669i2;
        int i17 = v17.f348737z2;
        nxVar.f7468c = i17;
        nxVar.f7477l = v17.f348685m2;
        nxVar.f7474i = v17.A2;
        nxVar.f7478m = i17 != 0;
        java.lang.String str3 = v17.f348689n2;
        if (dVar.D()) {
            nxVar.f7469d = 1044;
            nxVar.f7470e = dVar.x() + ":" + A(dVar, f9Var) + ":" + str3;
        } else {
            nxVar.f7469d = 1007;
            nxVar.f7470e = A(dVar, f9Var) + ":" + str3;
        }
        nxVar.f7480o.f70415d = dVar.x();
        nxVar.f7480o.f70416e = v17.f348693o2;
        com.tencent.mm.ui.chatting.viewitems.nf.c(startAppBrandUIFromOuterEvent, v17);
        java.lang.String x17 = dVar.x();
        if (!dVar.D()) {
            x17 = "";
        }
        nxVar.f7483r = x17;
        nxVar.f7484s = dVar.x();
        nxVar.f7486u = java.lang.String.valueOf(f9Var.getMsgId());
        nxVar.f7488w = 1;
        nxVar.f7487v = dVar.x();
        java.lang.String d17 = te5.e2.d(f9Var);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
            if (te5.e2.a(dVar.x(), d17)) {
                nxVar.f7485t = d17;
                if (nxVar.f7480o == null) {
                    nxVar.f7480o = new com.tencent.mm.modelappbrand.LaunchParamsOptional();
                }
            }
            if (te5.e2.b(dVar.x(), d17)) {
                nxVar.f7480o.f70420i = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchModeParams("subpackage");
            } else if (te5.e2.c(d17)) {
                nxVar.f7480o.f70420i = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchModeParams("allPage");
            }
        }
        startAppBrandUIFromOuterEvent.e();
        com.tencent.mm.ui.chatting.viewitems.nf.d(dVar, v17);
        com.tencent.mm.ui.chatting.component.c0.w0(dVar, view, f9Var);
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.l6
    public void d(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        if (f9Var.k2()) {
            android.util.Pair z17 = com.tencent.mm.pluginsdk.model.app.k0.z(f9Var);
            if (z17 == null || z17.second != null) {
                c01.w9.f(f9Var.getMsgId(), f9Var.Q0());
            }
            dVar.L(true);
        }
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public com.tencent.mm.storage.a9 i(com.tencent.mm.storage.f9 f9Var, android.content.Context context, yb5.q qVar, yb5.a aVar) {
        return new com.tencent.mm.ui.chatting.viewitems.kf(com.tencent.mm.ui.chatting.viewitems.mf.a(this.f204179s), f9Var);
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        int i17;
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        com.tencent.mm.ui.chatting.viewitems.lf lfVar = (com.tencent.mm.ui.chatting.viewitems.lf) g0Var;
        this.f204179s = dVar;
        com.tencent.mm.ui.chatting.component.f7 f7Var = (com.tencent.mm.ui.chatting.component.f7) ((sb5.e0) dVar.f460708c.a(sb5.e0.class));
        f7Var.n0(f9Var);
        com.tencent.mm.ui.chatting.component.c0.x0(dVar, g0Var.convertView, f9Var);
        f7Var.m0(f9Var);
        ot0.q v17 = ot0.q.v(f9Var.U1());
        com.tencent.mm.ui.chatting.viewitems.er erVar = new com.tencent.mm.ui.chatting.viewitems.er(dVar2, dVar.D(), g0Var, null);
        if (v17 != null) {
            lfVar.f204465d.setVisibility(8);
            lfVar.f204464c.setVisibility(8);
            lfVar.f204463b.setVisibility(8);
            lfVar.f204476o.setVisibility(8);
            k91.v5 Bi = ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Bi(v17.f348673j2);
            java.lang.String str2 = Bi != null ? Bi.field_nickname : v17.f348726x;
            java.lang.String str3 = Bi != null ? Bi.field_smallHeadURL : v17.B2;
            lfVar.f204476o.setVisibility(0);
            lfVar.f204471j.setVisibility(8);
            lfVar.f204479r.setText(v17.f348654f);
            lfVar.f204471j.setText(v17.f348658g);
            lfVar.f204474m.setText(str2);
            int i18 = v17.f348737z2;
            if (i18 == 1) {
                lfVar.f204475n.setText(com.tencent.mm.R.string.f490289qt);
            } else if (i18 != 2) {
                lfVar.f204475n.setText(com.tencent.mm.R.string.f490115lc);
            } else {
                lfVar.f204475n.setText(com.tencent.mm.R.string.f490288qs);
            }
            n11.a.b().h(str3, lfVar.f204473l, com.tencent.mm.ui.chatting.viewitems.lf.f204462t);
            Z(g0Var, f9Var.P0() < 2, true);
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            java.lang.String D2 = m11.b1.Di().D2(f9Var, f9Var.z0(), true);
            lfVar.f204477p.setImageBitmap(null);
            lfVar.f204477p.setVisibility(4);
            lfVar.f204478q.setVisibility(0);
            l01.d0.f314761a.n(new com.tencent.mm.ui.chatting.viewitems.gf(this, lfVar), "file://" + D2, null, ((ij1.j) ((k01.u0) i95.n0.c(k01.u0.class))).Bi(240, 192));
            lfVar.f204472k.setVisibility(8);
            android.widget.TextView textView = lfVar.f204472k;
            java.lang.String str4 = v17.f348693o2;
            if (str4 == null) {
                str4 = "";
            }
            textView.setTag(str4);
            lfVar.f204480s.setVisibility(8);
            ot0.a aVar = (ot0.a) v17.y(ot0.a.class);
            if (aVar != null && (aVar.f348349e || aVar.Q)) {
                java.lang.String str5 = v17.f348693o2;
                tt0.e Ai = ((oh1.k2) ((k01.x0) i95.n0.c(k01.x0.class))).Ai(str5);
                com.tencent.mm.ui.chatting.viewitems.nf.a(dVar, lfVar, aVar, Ai);
                com.tencent.mm.ui.chatting.viewitems.nf.b(dVar, lfVar, aVar, v17, Ai);
                int i19 = (Ai == null || (i17 = Ai.field_updatePeroid) == 0) ? aVar.f348356l : i17;
                if (i19 > 0) {
                    ((oh1.k2) ((k01.x0) i95.n0.c(k01.x0.class))).wi(com.tencent.mm.ui.chatting.viewitems.mf.a(dVar), v17.f348677k2, str5, i19, aVar.f348358n, te5.e2.d(f9Var), new com.tencent.mm.ui.chatting.viewitems.hf(this, lfVar, aVar));
                }
            }
            k01.f.c(v17.f348673j2, Bi, v17);
        }
        lfVar.clickArea.setTag(erVar);
        lfVar.clickArea.setOnClickListener(w(dVar));
        c01.l2 c17 = c01.n2.d().c(com.tencent.mm.ui.chatting.viewitems.mf.a(dVar), true);
        com.tencent.mm.ui.chatting.viewitems.jf jfVar = (com.tencent.mm.ui.chatting.viewitems.jf) c17.c(com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, null);
        if (jfVar == null) {
            jfVar = new com.tencent.mm.ui.chatting.viewitems.jf();
            c17.i(com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, jfVar);
            if (dVar.f460714i) {
                jfVar.x();
            }
        }
        jfVar.f204254d = new java.lang.ref.WeakReference(dVar);
        com.tencent.mm.ui.chatting.manager.c cVar = dVar.f460708c;
        ((com.tencent.mm.ui.chatting.component.y4) ((yn.j) cVar.a(yn.j.class))).b(jfVar);
        lfVar.clickArea.setOnLongClickListener(u(dVar));
        lfVar.clickArea.setOnTouchListener(((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) cVar.a(sb5.z.class))).B1);
        V(lfVar, dVar2, dVar.t(), dVar.D(), dVar, this);
    }
}
