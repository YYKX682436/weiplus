package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class ff extends com.tencent.mm.ui.chatting.viewitems.a0 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f203965s;

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.f488514vj);
        com.tencent.mm.ui.chatting.viewitems.lf lfVar = new com.tencent.mm.ui.chatting.viewitems.lf();
        lfVar.a(xgVar, true);
        xgVar.setTag(lfVar);
        return xgVar;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        if (menuItem.getItemId() != 111) {
            return false;
        }
        com.tencent.mm.ui.chatting.viewitems.s1.c(dVar, f9Var, A(dVar, f9Var), -1, null);
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        com.tencent.mm.storage.f9 f9Var = dVar.f394254d.f445300b;
        int d17 = ((com.tencent.mm.ui.chatting.viewitems.er) view.getTag()).d();
        ot0.q v17 = ot0.q.v(c01.w9.l(this.f203965s.D(), f9Var.j(), f9Var.A0()));
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String str = v17.f348646d;
        ((kt.c) i0Var).getClass();
        if (((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).nj(com.tencent.mm.pluginsdk.model.app.w.j(str, false, false)) && !com.tencent.mm.ui.chatting.n3.k(f9Var)) {
            if (ez.v0.f257777a.j(java.lang.Integer.valueOf(v17.f348666i))) {
                com.tencent.mm.pluginsdk.model.app.d h17 = com.tencent.mm.pluginsdk.model.app.k0.h(v17.f348694p);
                if ((h17 == null || !com.tencent.mm.ui.chatting.component.z4.f(f9Var, h17.field_fileFullPath)) && !f9Var.z2()) {
                    g4Var.c(d17, 111, 0, this.f203965s.s().getString(com.tencent.mm.R.string.f492836i24), com.tencent.mm.R.raw.icons_filled_share);
                }
            } else {
                g4Var.c(d17, 111, 0, this.f203965s.s().getString(com.tencent.mm.R.string.f492836i24), com.tencent.mm.R.raw.icons_filled_share);
            }
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
        if (!this.f203965s.F()) {
            g4Var.c(d17, 100, 0, this.f203965s.s().getString(com.tencent.mm.R.string.b3p), com.tencent.mm.R.raw.icons_filled_delete);
        }
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        ot0.q v17;
        com.tencent.mm.modelstat.b.c(f9Var, com.tencent.mm.modelstat.a.Click);
        ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Di(f9Var.Q0(), 1);
        if (f9Var.j() == null || (v17 = ot0.q.v(c01.w9.l(dVar.D(), f9Var.j(), f9Var.A0()))) == null) {
            return false;
        }
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String str = v17.f348646d;
        ((kt.c) i0Var).getClass();
        com.tencent.mm.pluginsdk.model.app.m j17 = com.tencent.mm.pluginsdk.model.app.w.j(str, false, false);
        if (j17 != null) {
            com.tencent.mm.ui.chatting.w5.e(dVar, v17, com.tencent.mm.ui.chatting.viewitems.a0.t(dVar, f9Var), j17, f9Var.I0(), dVar.x());
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgWxaDynamicFrom", "username: %s , path: %s ,appid %s ,url : %s, pkgType : %s, md5 : %s", v17.f348673j2, v17.f348669i2, v17.f348677k2, v17.f348674k, java.lang.Integer.valueOf(v17.f348737z2), v17.f348685m2);
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
        nxVar.f7480o.f70415d = dVar.x();
        nxVar.f7480o.f70416e = v17.f348693o2;
        java.lang.String str3 = v17.f348689n2;
        if (dVar.D()) {
            nxVar.f7469d = 1044;
            nxVar.f7470e = dVar.x() + ":" + A(dVar, f9Var) + ":" + str3;
        } else {
            nxVar.f7469d = 1007;
            nxVar.f7470e = A(dVar, f9Var) + ":" + str3;
        }
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

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public com.tencent.mm.storage.a9 i(com.tencent.mm.storage.f9 f9Var, android.content.Context context, yb5.q qVar, yb5.a aVar) {
        return new com.tencent.mm.ui.chatting.viewitems.kf(com.tencent.mm.ui.chatting.viewitems.mf.a(this.f203965s), f9Var);
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        int i17;
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        this.f203965s = dVar;
        com.tencent.mm.ui.chatting.viewitems.lf lfVar = (com.tencent.mm.ui.chatting.viewitems.lf) g0Var;
        com.tencent.mm.ui.chatting.component.f7 f7Var = (com.tencent.mm.ui.chatting.component.f7) ((sb5.e0) dVar.f460708c.a(sb5.e0.class));
        f7Var.m0(f9Var);
        f7Var.p0(f9Var);
        f7Var.n0(f9Var);
        com.tencent.mm.ui.chatting.component.c0.x0(dVar, g0Var.convertView, f9Var);
        ot0.q v17 = ot0.q.v(f9Var.U1());
        com.tencent.mm.ui.chatting.viewitems.er erVar = new com.tencent.mm.ui.chatting.viewitems.er(dVar2, dVar.D(), g0Var, null);
        if (v17 != null) {
            lfVar.f204465d.setVisibility(8);
            lfVar.f204464c.setVisibility(8);
            lfVar.f204476o.setVisibility(8);
            lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
            java.lang.String str2 = v17.f348646d;
            int i18 = v17.G;
            ((kt.c) i0Var).getClass();
            com.tencent.mm.pluginsdk.model.app.m i19 = com.tencent.mm.pluginsdk.model.app.w.i(str2, i18);
            if (i19 != null) {
                q(dVar, v17, f9Var);
            }
            java.lang.String str3 = v17.f348730y;
            if (str3 == null || str3.length() == 0) {
                lfVar.f204466e.setVisibility(8);
            } else {
                lfVar.f204466e.setVisibility(0);
                G(dVar, lfVar.f204466e, com.tencent.mm.ui.chatting.viewitems.er.a(v17.f348730y));
            }
            k91.v5 Bi = ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Bi(v17.f348673j2);
            lfVar.f204468g.setVisibility(0);
            lfVar.f204463b.setVisibility(8);
            lfVar.f204470i.setVisibility(0);
            lfVar.f204469h.setVisibility(8);
            lfVar.f204474m.setText(Bi != null ? Bi.field_nickname : v17.f348726x);
            java.lang.String str4 = Bi != null ? Bi.field_smallHeadURL : v17.B2;
            n11.a b17 = n11.a.b();
            android.widget.ImageView imageView = lfVar.f204473l;
            o11.g gVar = com.tencent.mm.ui.chatting.viewitems.lf.f204462t;
            b17.h(str4, imageView, gVar);
            lfVar.f204476o.setVisibility(0);
            lfVar.f204471j.setVisibility(8);
            lfVar.f204471j.setText(v17.f348658g);
            lfVar.f204479r.setText(v17.f348654f);
            int i27 = v17.f348737z2;
            if (i27 == 1) {
                lfVar.f204475n.setText(com.tencent.mm.R.string.f490289qt);
            } else if (i27 != 2) {
                lfVar.f204475n.setText(com.tencent.mm.R.string.f490115lc);
            } else {
                lfVar.f204475n.setText(com.tencent.mm.R.string.f490288qs);
            }
            n11.a.b().h(str4, lfVar.f204473l, gVar);
            if (dVar.D()) {
                lfVar.f204467f.setVisibility(8);
            } else if (((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).mj(i19)) {
                lfVar.f204467f.setVisibility(0);
                android.widget.ImageView imageView2 = lfVar.f204467f;
                com.tencent.mm.ui.chatting.viewitems.er erVar2 = new com.tencent.mm.ui.chatting.viewitems.er();
                erVar2.f203927w = v17;
                erVar2.f203905a = dVar2;
                com.tencent.mm.ui.chatting.w5.o(dVar, imageView2, erVar2);
            } else {
                lfVar.f204467f.setVisibility(8);
            }
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            java.lang.String D2 = m11.b1.Di().D2(f9Var, f9Var.z0(), true);
            lfVar.f204477p.setImageBitmap(null);
            lfVar.f204477p.setVisibility(4);
            lfVar.f204478q.setVisibility(0);
            l01.d0.f314761a.n(new com.tencent.mm.ui.chatting.viewitems.df(this, lfVar), "file://" + D2, null, ((ij1.j) ((k01.u0) i95.n0.c(k01.u0.class))).Bi(240, 192));
            lfVar.f204472k.setVisibility(8);
            android.widget.TextView textView = lfVar.f204472k;
            java.lang.String str5 = v17.f348693o2;
            if (str5 == null) {
                str5 = "";
            }
            textView.setTag(str5);
            lfVar.f204480s.setVisibility(8);
            ot0.a aVar = (ot0.a) v17.y(ot0.a.class);
            if (aVar != null && (aVar.f348349e || aVar.Q)) {
                java.lang.String str6 = v17.f348693o2;
                tt0.e Ai = ((oh1.k2) ((k01.x0) i95.n0.c(k01.x0.class))).Ai(str6);
                com.tencent.mm.ui.chatting.viewitems.nf.a(dVar, lfVar, aVar, Ai);
                com.tencent.mm.ui.chatting.viewitems.nf.b(dVar, lfVar, aVar, v17, Ai);
                int i28 = (Ai == null || (i17 = Ai.field_updatePeroid) == 0) ? aVar.f348356l : i17;
                if (i28 > 0) {
                    ((oh1.k2) ((k01.x0) i95.n0.c(k01.x0.class))).wi(com.tencent.mm.ui.chatting.viewitems.mf.a(dVar), v17.f348677k2, str6, i28, aVar.f348358n, te5.e2.d(f9Var), new com.tencent.mm.ui.chatting.viewitems.ef(this, lfVar, aVar));
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
    }
}
