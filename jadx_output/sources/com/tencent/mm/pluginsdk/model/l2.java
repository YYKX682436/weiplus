package com.tencent.mm.pluginsdk.model;

/* loaded from: classes12.dex */
public class l2 implements com.tencent.mm.pluginsdk.model.app.h3 {

    /* renamed from: e, reason: collision with root package name */
    public static boolean f189361e;

    /* renamed from: f, reason: collision with root package name */
    public static com.tencent.mm.pluginsdk.model.l2 f189362f;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.model.j2 f189363d;

    @Override // com.tencent.mm.pluginsdk.model.app.h3
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.pluginsdk.model.app.u3 u3Var) {
        com.tencent.mm.pluginsdk.model.k2 k2Var;
        java.util.Map d17;
        if (gm0.j1.a()) {
            if (u3Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.GetUserInfoInAppLogic", "scene == null");
                return;
            }
            if (i17 == 0 && i18 == 0 && u3Var.b() == 14) {
                if (com.tencent.mm.sdk.platformtools.x2.f193071a == null || ap3.e.a() == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.GetUserInfoInAppLogic", "wrong environment");
                    return;
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.GetUserInfoInAppLogic", "NetSceneGetUserInfoInApp come back", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                com.tencent.mm.pluginsdk.model.k3 k3Var = (com.tencent.mm.pluginsdk.model.k3) u3Var;
                com.tencent.mm.pluginsdk.model.j2 j2Var = this.f189363d;
                if (j2Var != null) {
                    n62.e eVar = (n62.e) j2Var;
                    com.tencent.mm.modelbase.o oVar = k3Var.f189090d;
                    java.util.Iterator it = (oVar == null ? null : (r45.nq3) oVar.f70711b.f70700a).f381596e.iterator();
                    boolean z17 = false;
                    while (it.hasNext()) {
                        r45.ew6 ew6Var = (r45.ew6) it.next();
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(ew6Var.f373765d) && !com.tencent.mm.sdk.platformtools.t8.K0(ew6Var.f373766e)) {
                            com.tencent.mm.storage.z3 q17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).q(ew6Var.f373765d);
                            if (q17 == null || ((int) q17.E2) <= 0) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.SubCoreExt", "contact is null");
                            } else if (q17.k2()) {
                                com.tencent.mars.xlog.Log.w("MicroMsg.SubCoreExt", "isBizContact");
                            } else {
                                java.lang.String str2 = ew6Var.f373766e;
                                if (str2 != null && (d17 = com.tencent.mm.sdk.platformtools.aa.d(str2, "PersonalAppSetting", null)) != null) {
                                    java.lang.String str3 = (java.lang.String) d17.get(".PersonalAppSetting.OpenID");
                                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                                        k2Var = new com.tencent.mm.pluginsdk.model.k2();
                                        k2Var.f189352a = str3;
                                        if (k2Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(k2Var.f189352a)) {
                                            n62.k.Ui().replace(new com.tencent.mm.storage.eb(k3Var.f189353e, ew6Var.f373765d, k2Var.f189352a));
                                            z17 = true;
                                        }
                                    }
                                }
                                k2Var = null;
                                if (k2Var != null) {
                                    n62.k.Ui().replace(new com.tencent.mm.storage.eb(k3Var.f189353e, ew6Var.f373765d, k2Var.f189352a));
                                    z17 = true;
                                }
                            }
                        }
                    }
                    if (z17) {
                        com.tencent.mm.sdk.platformtools.n3 n3Var = eVar.f335190a.f335203m;
                        n3Var.removeMessages(0);
                        n3Var.sendEmptyMessageDelayed(0, 1600L);
                    }
                }
            }
        }
    }
}
