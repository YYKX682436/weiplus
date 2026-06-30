package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public final class d0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.RealnameVerifySelectGuardianUI f179355a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f179356b;

    public d0(com.tencent.mm.plugin.wallet_core.id_verify.RealnameVerifySelectGuardianUI realnameVerifySelectGuardianUI, java.lang.String str) {
        this.f179355a = realnameVerifySelectGuardianUI;
        this.f179356b = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        int i18 = fVar.f70616b;
        r45.rj5 rj5Var = (r45.rj5) fVar.f70618d;
        com.tencent.mm.plugin.wallet_core.id_verify.RealnameVerifySelectGuardianUI realnameVerifySelectGuardianUI = this.f179355a;
        if (i17 == 0 && i18 == 0 && rj5Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RealnameVerifySelectGuardianUI", "VerifyGuardianResponse resp retcode: " + rj5Var.f384947d);
            if (rj5Var.f384947d != 0) {
                com.tencent.mm.plugin.wallet_core.id_verify.RealnameVerifySelectGuardianUI.z7(realnameVerifySelectGuardianUI, rj5Var.f384948e);
            } else {
                r45.f7 f7Var = rj5Var.f384950g;
                if (f7Var != null) {
                    com.tencent.mm.plugin.wallet_core.id_verify.RealnameVerifySelectGuardianUI.y7(realnameVerifySelectGuardianUI, f7Var);
                } else {
                    r45.fo foVar = rj5Var.f384949f;
                    if (foVar != null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.RealnameVerifySelectGuardianUI", "will send bubble msg: " + foVar.f374473d + ", " + foVar.f374478i);
                        com.tencent.mm.plugin.wallet_core.id_verify.x xVar = com.tencent.mm.plugin.wallet_core.id_verify.RealnameVerifySelectGuardianUI.E;
                        realnameVerifySelectGuardianUI.getClass();
                        java.lang.String weapp_username = foVar.f374478i;
                        kotlin.jvm.internal.o.f(weapp_username, "weapp_username");
                        boolean z17 = false;
                        if (!r26.i0.n(weapp_username, "@app", false)) {
                            foVar.f374478i += "@app";
                        }
                        ot0.q qVar = new ot0.q();
                        qVar.f348654f = foVar.f374473d;
                        qVar.f348658g = foVar.f374474e;
                        qVar.f348666i = 44;
                        qVar.f348697p2 = 1;
                        qVar.f348673j2 = foVar.f374478i;
                        qVar.f348669i2 = foVar.f374479m;
                        qVar.f348681l2 = 2;
                        java.lang.String str = foVar.f374477h;
                        if (str != null) {
                            if (!(str.length() > 0)) {
                                str = null;
                            }
                            if (str != null) {
                                qVar.f348734z = str;
                            }
                        }
                        java.lang.String str2 = foVar.f374475f;
                        if (str2 != null) {
                            if (!(str2.length() > 0)) {
                                str2 = null;
                            }
                            if (str2 != null) {
                                qVar.f348713t2 = str2;
                            }
                        }
                        java.lang.String str3 = foVar.f374476g;
                        if (str3 != null) {
                            if (!(str3.length() > 0)) {
                                str3 = null;
                            }
                            if (str3 != null) {
                                qVar.f348709s2 = str3;
                                qVar.f348726x = str3;
                                qVar.f348722w = "gh_3dfda90e39d6";
                            }
                        }
                        qVar.f348705r2 = 1;
                        java.lang.String str4 = this.f179356b;
                        com.tencent.mm.plugin.wallet_core.id_verify.j0 j0Var = new com.tencent.mm.plugin.wallet_core.id_verify.j0(qVar, str4, realnameVerifySelectGuardianUI, foVar);
                        java.lang.String str5 = foVar.f374477h;
                        if (str5 != null) {
                            if (str5.length() > 0) {
                                z17 = true;
                            }
                        }
                        if (z17) {
                            java.lang.String icon_url = foVar.f374477h;
                            kotlin.jvm.internal.o.f(icon_url, "icon_url");
                            com.tencent.mm.plugin.wallet_core.id_verify.g0 g0Var = new com.tencent.mm.plugin.wallet_core.id_verify.g0(j0Var);
                            com.tencent.mm.plugin.wallet_core.id_verify.c0 c0Var = realnameVerifySelectGuardianUI.D;
                            c0Var.getClass();
                            pm0.v.K(null, new com.tencent.mm.plugin.wallet_core.id_verify.b0(c0Var, icon_url, g0Var));
                        } else {
                            j0Var.invoke(null);
                        }
                        com.tencent.mm.plugin.wallet_core.id_verify.RealnameVerifySelectGuardianUI.x7(realnameVerifySelectGuardianUI, rj5Var.f384951h, str4);
                    }
                }
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.RealnameVerifySelectGuardianUI", "VerifyGuardianResponse error: " + i17 + ", " + i18);
            com.tencent.mm.plugin.wallet_core.id_verify.RealnameVerifySelectGuardianUI.z7(realnameVerifySelectGuardianUI, fVar.f70617c);
        }
        return jz5.f0.f302826a;
    }
}
