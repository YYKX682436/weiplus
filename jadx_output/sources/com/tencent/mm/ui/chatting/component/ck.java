package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.s1.class)
/* loaded from: classes9.dex */
public class ck extends com.tencent.mm.ui.chatting.component.a implements sb5.s1, com.tencent.mm.modelbase.u0, xg3.h0 {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f198893e = new com.tencent.mm.ui.chatting.RevokeMsgListener(com.tencent.mm.ui.chatting.mc.CHATTING_ITEM_VIDEO, null);

    /* renamed from: f, reason: collision with root package name */
    public int f198894f = 0;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.j0 f198895g = null;

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void E() {
        c01.d9.e().a(594, this);
    }

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void I() {
        super.I();
        this.f198893e.dead();
        c01.d9.e().q(594, this);
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void K() {
        c01.d9.e().q(594, this);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().za(this);
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void a() {
        int d17;
        if (((com.tencent.mm.ui.chatting.component.h3) ((sb5.s) this.f198580d.f460708c.a(sb5.s.class))).u()) {
            d17 = ((com.tencent.mm.plugin.finder.service.v1) ((zy2.g6) i95.n0.c(zy2.g6.class))).wi(this.f198580d.x());
        } else if (((com.tencent.mm.ui.chatting.component.h4) ((sb5.x) this.f198580d.f460708c.a(sb5.x.class))).t()) {
            d17 = ((z53.q) ((u53.a0) i95.n0.c(u53.a0.class))).Ui(this.f198580d.x());
        } else if (((com.tencent.mm.ui.chatting.component.u7) ((sb5.h0) this.f198580d.f460708c.a(sb5.h0.class))).G()) {
            d17 = ((ki4.a0) ((bi4.x0) i95.n0.c(bi4.x0.class))).wi(this.f198580d.x());
        } else if (((com.tencent.mm.ui.chatting.component.h0) ((sb5.g) this.f198580d.f460708c.a(sb5.g.class))).n0()) {
            ((zv.o0) ((bw.j) i95.n0.c(bw.j.class))).getClass();
            if (zv.q.f476079a.g()) {
                com.tencent.wechat.mm.brand_service.g0 c17 = yw.a3.f466266a.c();
                d17 = (int) (c17 != null ? c17.e() : 0L);
            }
            d17 = 0;
        } else if (((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) this.f198580d.f460708c.a(sb5.f.class))).G0()) {
            d17 = yq1.u0.Di().D0(this.f198580d.x());
        } else if (((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) this.f198580d.f460708c.a(sb5.f.class))).H0()) {
            d17 = yq1.u0.Vi().D0(this.f198580d.x());
        } else if (((com.tencent.mm.ui.chatting.component.b9) ((sb5.j0) this.f198580d.f460708c.a(sb5.j0.class))).s()) {
            d17 = ((fr4.g0) ((gr4.f) i95.n0.c(gr4.f.class))).aj(this.f198580d.x());
        } else {
            com.tencent.mm.ui.chatting.component.biz.a aVar = (com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) this.f198580d.f460708c.a(sb5.f.class));
            if (aVar.f198753r) {
                d17 = aVar.f198761z;
            } else {
                com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.storage.m4) c01.d9.b().r()).p(this.f198580d.x());
                if (p17 != null) {
                    d17 = p17.d1();
                }
                d17 = 0;
            }
        }
        this.f198894f = d17;
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().n0(this, android.os.Looper.getMainLooper());
        jc5.b bVar = jc5.b.f299016a;
        java.lang.String x17 = this.f198580d.x();
        jc5.b.f299017b.remove(x17);
        jc5.b.f299018c.remove(x17);
        java.util.Map map = jc5.b.f299019d;
        map.remove(x17);
        jc5.b.f299020e.remove(x17);
        map.put(this.f198580d.x(), java.lang.Integer.valueOf(this.f198894f));
    }

    @Override // xg3.h0
    public void c0(xg3.m0 m0Var, xg3.l0 l0Var) {
        java.lang.String str;
        int i17;
        int i18;
        if (l0Var == null || (str = l0Var.f454410a) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingUI.RevokeMsgComponent", "onNotifyChange: notifyInfo is null or notifyInfo.talker is null");
            return;
        }
        if (str.equals(this.f198580d.x())) {
            java.lang.String str2 = l0Var.f454411b;
            if (str2.equals("delete") && (i18 = l0Var.f454415f) > 0) {
                this.f198894f -= i18;
            }
            this.f198894f = java.lang.Math.max(this.f198894f, 0);
            if (str2.equals("insert") && (i17 = l0Var.f454414e) > 0) {
                this.f198894f += i17;
            }
            jc5.b bVar = jc5.b.f299016a;
            jc5.b.f299019d.put(this.f198580d.x(), java.lang.Integer.valueOf(this.f198894f));
        }
    }

    public void m0(com.tencent.mm.storage.f9 f9Var, java.lang.String str, boolean z17, boolean z18) {
        java.util.Map d17;
        if (f9Var.getType() != 1107296305 || (d17 = com.tencent.mm.sdk.platformtools.aa.d(f9Var.J0(), "msg", null)) == null) {
            java.lang.String revokeMsgBatchId = dh3.c.f232489a.h(f9Var);
            if (!z18 || com.tencent.mm.sdk.platformtools.t8.K0(revokeMsgBatchId) || j62.e.g().c(new com.tencent.mm.repairer.config.msgsend.RepairerConfigBatchRevokeMsg()) != 1) {
                cd0.b0.f40525a.c(f9Var, str, this.f198580d, null, z17);
                return;
            }
            yb5.d chattingContext = this.f198580d;
            kotlin.jvm.internal.o.g(chattingContext, "chattingContext");
            kotlin.jvm.internal.o.g(revokeMsgBatchId, "revokeMsgBatchId");
            if (!chattingContext.I()) {
                dh3.e eVar = new dh3.e();
                java.lang.String t17 = dh3.c.f232490b.t(revokeMsgBatchId);
                if (t17 != null) {
                    eVar.fromXml(t17);
                }
                long scene = eVar.getScene();
                com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) chattingContext.g(), 1, false);
                k0Var.f211872n = new cd0.u(chattingContext);
                k0Var.f211881s = new cd0.v(f9Var, str, chattingContext, null, z17, scene, revokeMsgBatchId, k0Var);
                k0Var.f211856e = new cd0.w(scene, f9Var, revokeMsgBatchId);
                k0Var.C = new cd0.x(scene, f9Var, revokeMsgBatchId);
                k0Var.v();
            }
            return;
        }
        java.lang.String str2 = (java.lang.String) d17.get(".msg.appmsg.announcement_id");
        java.lang.String str3 = "" + c01.y1.a(c01.z1.r(), f9Var.getCreateTime()).hashCode();
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.RevokeMsgComponent", "revoke announcement, msgID:%s, clientId:%s, announcementID:%s, chatroomName:%s", java.lang.Long.valueOf(f9Var.I0()), str3, str2, f9Var.Q0());
        r45.ps5 ps5Var = new r45.ps5();
        ps5Var.f383390d = f9Var.I0();
        ps5Var.f383393g = str3;
        ps5Var.f383391e = f9Var.Q0();
        ps5Var.f383392f = str2;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 8006;
        lVar.f70666c = "/cgi-bin/micromsg-bin/revokechatroomannouncement";
        lVar.f70664a = ps5Var;
        lVar.f70665b = new r45.qs5();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        com.tencent.mm.modelbase.i iVar = new com.tencent.mm.modelbase.i();
        iVar.p(a17);
        iVar.l().h(new com.tencent.mm.ui.chatting.component.xj(this, f9Var, str2));
        if (this.f198580d.I()) {
            return;
        }
        yb5.d dVar = this.f198580d;
        dVar.W(dVar.g(), null, this.f198580d.s().getString(com.tencent.mm.R.string.b5q), true, true, new com.tencent.mm.ui.chatting.component.yj(this, f9Var, iVar));
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.RevokeMsgComponent", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str + " sceneType:" + m1Var.getType());
        this.f198580d.b();
        com.tencent.mm.ui.widget.dialog.j0 j0Var = this.f198895g;
        if (j0Var != null) {
            j0Var.dismiss();
            this.f198895g = null;
        }
        yb5.d dVar = this.f198580d;
        if (!dVar.f460714i) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.RevokeMsgComponent", "onSceneEnd fragment not foreground, return");
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.U0(dVar.g())) {
            android.app.Activity g17 = this.f198580d.g();
            if (com.tencent.mm.ui.pc.a(g17, i17, i18, str, 7) || com.tencent.mm.plugin.account.ui.d.a(g17, i17, i18, new android.content.Intent().setClass(g17, com.tencent.mm.ui.LauncherUI.class).putExtra("Intro_Switch", true).putExtra("animation_pop_in", true).addFlags(67108864), str)) {
                return;
            }
            if (i17 == 0 && i18 == 0) {
                if (m1Var.getType() == 594 && (m1Var instanceof com.tencent.mm.modelsimple.d1)) {
                    r45.xs5 xs5Var = (r45.xs5) ((com.tencent.mm.modelsimple.d1) m1Var).f71311h.f70711b.f70700a;
                    if (com.tencent.mm.sdk.platformtools.t8.K0(xs5Var.f390380d)) {
                        return;
                    }
                    db5.e1.y(this.f198580d.g(), xs5Var.f390380d, "", this.f198580d.s().getString(com.tencent.mm.R.string.b5m), new com.tencent.mm.ui.chatting.component.zj(this));
                    return;
                }
                return;
            }
            if (m1Var.getType() == 594 && (m1Var instanceof com.tencent.mm.modelsimple.d1)) {
                r45.xs5 xs5Var2 = (r45.xs5) ((com.tencent.mm.modelsimple.d1) m1Var).f71311h.f70711b.f70700a;
                if (i18 == 0 || com.tencent.mm.sdk.platformtools.t8.K0(xs5Var2.f390381e)) {
                    this.f198895g = db5.e1.y(this.f198580d.g(), this.f198580d.s().getString(com.tencent.mm.R.string.b5n), "", this.f198580d.s().getString(com.tencent.mm.R.string.b5m), new com.tencent.mm.ui.chatting.component.bk(this));
                } else {
                    this.f198895g = db5.e1.y(this.f198580d.g(), xs5Var2.f390381e, "", this.f198580d.s().getString(com.tencent.mm.R.string.b5m), new com.tencent.mm.ui.chatting.component.ak(this));
                }
            }
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void x() {
        com.tencent.mm.sdk.event.d dVar = com.tencent.mm.sdk.event.d.f192370d;
        com.tencent.mm.sdk.event.IListener iListener = this.f198893e;
        if (dVar.b(iListener)) {
            return;
        }
        iListener.alive();
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void y() {
        this.f198893e.dead();
    }
}
