package hr3;

/* loaded from: classes9.dex */
public class x7 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f284173d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hr3.a8 f284174e;

    public x7(hr3.a8 a8Var, com.tencent.mm.ui.widget.dialog.u3 u3Var) {
        this.f284174e = a8Var;
        this.f284173d = u3Var;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        qk.o oVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetMiniShopHelper", "onSceneEnd, errType: %d, errCode: %d, errMsg: %s, scene: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, java.lang.Integer.valueOf(m1Var.getType()));
        if (m1Var instanceof com.tencent.mm.pluginsdk.model.m3) {
            gm0.j1.d().q(30, this);
            hr3.a8 a8Var = this.f284174e;
            if (i17 == 0 && i18 == 0) {
                java.lang.String J2 = ((com.tencent.mm.pluginsdk.model.m3) m1Var).J();
                com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetMiniShopHelper", "onSceneEnd, respUsername: " + J2);
                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n("gh_579db1f2cf89", true);
                a8Var.getClass();
                if (n17 == null || com.tencent.mm.sdk.platformtools.t8.K0(J2)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ContactWidgetMiniShopHelper", "updateContact, contact: %s, respUsername: %s", n17, J2);
                } else {
                    if (com.tencent.mm.storage.z3.E4(n17.d1())) {
                        java.lang.String d17 = n17.d1();
                        if (d17 == null) {
                            d17 = "";
                        }
                        ((c01.p0) ((qk.q6) i95.n0.c(qk.q6.class))).getClass();
                        oVar = r01.z.b(d17);
                        if (oVar == null) {
                            oVar.field_username = J2;
                        }
                        ((c01.p0) ((qk.q6) i95.n0.c(qk.q6.class))).getClass();
                        r01.q3.cj().d(d17);
                        n17.K1(d17);
                    } else {
                        oVar = null;
                    }
                    n17.X1(J2);
                    if (((int) n17.E2) == 0) {
                        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().i0(n17);
                    }
                    if (((int) n17.E2) <= 0) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.ContactWidgetMiniShopHelper", "updateContact, insert contact fail");
                    } else {
                        c01.e2.m0(n17);
                        com.tencent.mm.storage.z3 n18 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(n17.d1(), true);
                        if (oVar != null) {
                            ((c01.p0) ((qk.q6) i95.n0.c(qk.q6.class))).getClass();
                            r01.q3.cj().insert(oVar);
                        } else {
                            qk.q6 q6Var = (qk.q6) i95.n0.c(qk.q6.class);
                            java.lang.String d18 = n18.d1();
                            ((c01.p0) q6Var).getClass();
                            qk.o b17 = r01.z.b(d18);
                            if (b17 == null || b17.U0()) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetMiniShopHelper", "updateBizInfoInNeed, shouldUpdate");
                                c01.n8.a().c(n18.d1(), 5);
                                ((com.tencent.mm.feature.avatar.w) ((kv.c0) i95.n0.c(kv.c0.class))).bj(n18.d1());
                            } else if (n18.X4()) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetMiniShopHelper", "updateBizInfoInNeed, last check time:" + n18.f236576p1);
                                c01.n8.a().c(n18.d1(), 5);
                                ((com.tencent.mm.feature.avatar.w) ((kv.c0) i95.n0.c(kv.c0.class))).bj(n18.d1());
                            }
                        }
                    }
                }
                qk.q6 q6Var2 = (qk.q6) i95.n0.c(qk.q6.class);
                java.lang.String d19 = n17.d1();
                ((c01.p0) q6Var2).getClass();
                qk.o b18 = r01.z.b(d19);
                if (b18 != null) {
                    ((c01.p0) ((qk.q6) i95.n0.c(qk.q6.class))).wi(b18);
                }
                gm0.j1.u().c().w(327825, java.lang.Boolean.TRUE);
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.ContactWidgetMiniShopHelper", "onSceneEnd, fail");
                if (4 == i17 && -24 == i18 && !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, str, 1).show();
                }
            }
            this.f284173d.dismiss();
            a8Var.b();
        }
    }
}
