package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public final class f0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.RealnameVerifySelectGuardianUI f179371a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f179372b;

    public f0(com.tencent.mm.plugin.wallet_core.id_verify.RealnameVerifySelectGuardianUI realnameVerifySelectGuardianUI, java.lang.String str) {
        this.f179371a = realnameVerifySelectGuardianUI;
        this.f179372b = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        int i18 = fVar.f70616b;
        r45.qx6 qx6Var = (r45.qx6) fVar.f70618d;
        com.tencent.mm.plugin.wallet_core.id_verify.RealnameVerifySelectGuardianUI realnameVerifySelectGuardianUI = this.f179371a;
        if (i17 == 0 && i18 == 0 && qx6Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RealnameVerifySelectGuardianUI", "verifyParent resp retcode: " + qx6Var.f384346d);
            if (qx6Var.f384346d != 0) {
                com.tencent.mm.plugin.wallet_core.id_verify.RealnameVerifySelectGuardianUI.z7(realnameVerifySelectGuardianUI, qx6Var.f384347e);
            } else {
                r45.f7 f7Var = qx6Var.f384349g;
                if (f7Var != null) {
                    com.tencent.mm.plugin.wallet_core.id_verify.RealnameVerifySelectGuardianUI.y7(realnameVerifySelectGuardianUI, f7Var);
                } else {
                    r45.m74 m74Var = qx6Var.f384348f;
                    if (m74Var != null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.RealnameVerifySelectGuardianUI", "will send liteapp bubble msg: " + m74Var.f380181d + ", " + m74Var.f380186i);
                        com.tencent.mm.plugin.wallet_core.id_verify.x xVar = com.tencent.mm.plugin.wallet_core.id_verify.RealnameVerifySelectGuardianUI.E;
                        realnameVerifySelectGuardianUI.getClass();
                        ot0.q qVar = new ot0.q();
                        qVar.f348654f = m74Var.f380181d;
                        qVar.f348658g = m74Var.f380182e;
                        qVar.f348666i = 68;
                        com.tencent.mm.pluginsdk.ui.tools.h0 h0Var = new com.tencent.mm.pluginsdk.ui.tools.h0();
                        h0Var.f191665b = m74Var.f380186i;
                        h0Var.f191666c = m74Var.f380187m;
                        h0Var.f191667d = m74Var.f380188n;
                        qVar.f(h0Var);
                        java.lang.String str = m74Var.f380185h;
                        boolean z17 = false;
                        if (str != null) {
                            if (!(str.length() > 0)) {
                                str = null;
                            }
                            if (str != null) {
                                qVar.f348734z = str;
                            }
                        }
                        java.lang.String str2 = m74Var.f380183f;
                        if (str2 != null) {
                            if (!(str2.length() > 0)) {
                                str2 = null;
                            }
                            if (str2 != null) {
                                qVar.f348713t2 = str2;
                            }
                        }
                        java.lang.String str3 = m74Var.f380184g;
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
                        qVar.E2 = 1;
                        java.lang.String str4 = this.f179372b;
                        com.tencent.mm.plugin.wallet_core.id_verify.l0 l0Var = new com.tencent.mm.plugin.wallet_core.id_verify.l0(qVar, str4, realnameVerifySelectGuardianUI, m74Var);
                        java.lang.String str5 = m74Var.f380185h;
                        if (str5 != null) {
                            if (str5.length() > 0) {
                                z17 = true;
                            }
                        }
                        if (z17) {
                            java.lang.String icon_url = m74Var.f380185h;
                            kotlin.jvm.internal.o.f(icon_url, "icon_url");
                            com.tencent.mm.plugin.wallet_core.id_verify.k0 k0Var = new com.tencent.mm.plugin.wallet_core.id_verify.k0(l0Var);
                            com.tencent.mm.plugin.wallet_core.id_verify.c0 c0Var = realnameVerifySelectGuardianUI.D;
                            c0Var.getClass();
                            pm0.v.K(null, new com.tencent.mm.plugin.wallet_core.id_verify.b0(c0Var, icon_url, k0Var));
                        } else {
                            l0Var.invoke(null);
                        }
                        com.tencent.mm.plugin.wallet_core.id_verify.RealnameVerifySelectGuardianUI.x7(realnameVerifySelectGuardianUI, qx6Var.f384350h, str4);
                    }
                }
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.RealnameVerifySelectGuardianUI", "verifyParent error: " + i17 + ", " + i18);
            com.tencent.mm.plugin.wallet_core.id_verify.RealnameVerifySelectGuardianUI.z7(realnameVerifySelectGuardianUI, fVar.f70617c);
        }
        return jz5.f0.f302826a;
    }
}
