package we0;

/* loaded from: classes11.dex */
public final class t1 implements gm0.e2, gm0.i2, com.tencent.mm.modelbase.j1 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f445168d;

    @Override // gm0.e2
    public java.util.HashMap U5() {
        return kz5.c1.i(new jz5.l(1719732168, we0.r1.f445156a));
    }

    @Override // gm0.i2
    public void kh(int i17) {
        if (i17 != com.tencent.mm.sdk.platformtools.z.f193112h) {
            java.text.SimpleDateFormat simpleDateFormat = bi4.v1.f21093a;
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_text_state_input_level, 1) == 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TextStatusStaticCallbacks", "onClientUpgraded: " + i17 + ", " + com.tencent.mm.sdk.platformtools.z.f193112h);
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_text_status_permission_check_enable, false)) {
                    gm0.j1.d().g(new ej4.i());
                }
                this.f445168d = true;
            }
        }
    }

    @Override // com.tencent.mm.modelbase.j1
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        r45.dw6 dw6Var;
        pj4.e1 e1Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatusStaticCallbacks", "onSceneEnd: errType：" + i17 + " errCode:" + i18 + " errMsg:" + str + " scene:" + m1Var);
        if (m1Var instanceof ej4.e) {
            if (i17 == 0 && i18 == 0 && (e1Var = ((ej4.e) m1Var).f253343g) != null) {
                pm0.v.O("TextStatusThread", new we0.s1(e1Var, m1Var));
                return;
            }
            return;
        }
        if (i17 == 0 && i18 == 0) {
            com.tencent.mm.modelsimple.p0 p0Var = m1Var instanceof com.tencent.mm.modelsimple.p0 ? (com.tencent.mm.modelsimple.p0) m1Var : null;
            com.tencent.mm.network.v0 reqResp = p0Var != null ? p0Var.getReqResp() : null;
            com.tencent.mm.modelbase.o oVar = reqResp instanceof com.tencent.mm.modelbase.o ? (com.tencent.mm.modelbase.o) reqResp : null;
            java.lang.Object obj = oVar != null ? oVar.f70711b.f70700a : null;
            r45.tl3 tl3Var = obj instanceof r45.tl3 ? (r45.tl3) obj : null;
            if (tl3Var != null && (dw6Var = tl3Var.f386544e) != null) {
                if (di4.i.f232782a.e()) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("statusData is empty ");
                    java.lang.String str2 = dw6Var.P;
                    sb6.append(str2 == null || str2.length() == 0);
                    com.tencent.mars.xlog.Log.i("MicroMsg.TextStatusStaticCallbacks", sb6.toString());
                    ((zh4.k) i95.n0.c(zh4.k.class)).Ai(dw6Var.P, bk4.k1.a());
                } else {
                    java.lang.String str3 = dw6Var.X;
                    java.lang.String str4 = dw6Var.Y;
                    com.tencent.mars.xlog.Log.i("MicroMsg.TextStatusStaticCallbacks", "statusID: " + str3 + ", extInfo: " + str4);
                    xe0.l0 l0Var = (xe0.l0) i95.n0.c(xe0.l0.class);
                    java.lang.Boolean bool = java.lang.Boolean.TRUE;
                    ((we0.j1) l0Var).uj(str3, str4, bool, bool);
                }
            }
        }
        if (this.f445168d) {
            return;
        }
        java.text.SimpleDateFormat simpleDateFormat = bi4.v1.f21093a;
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_text_state_input_level, 1) == 1) {
            gm0.j1.d().g(new ej4.i());
        }
    }
}
