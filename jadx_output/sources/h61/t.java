package h61;

/* loaded from: classes9.dex */
public class t implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f279170d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f279171e = 0;

    /* renamed from: f, reason: collision with root package name */
    public java.util.Map f279172f;

    /* renamed from: g, reason: collision with root package name */
    public km5.b f279173g;

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LaunchAALogic", "onSceneEnd, errType: %s, errCode: %s, scene: %s, mode: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), m1Var, java.lang.Integer.valueOf(this.f279171e));
        if (m1Var.getType() == 1624) {
            this.f279170d = false;
            if (i17 != 0 || i18 != 0) {
                km5.b bVar = this.f279173g;
                if (bVar != null) {
                    bVar.a(java.lang.Boolean.FALSE);
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(407L, 1L, 1L, false);
                return;
            }
            i61.f fVar = (i61.f) m1Var;
            r45.j jVar = fVar.f288910f;
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = java.lang.Integer.valueOf(jVar.f377426d);
            objArr[1] = jVar.f377427e;
            objArr[2] = java.lang.Boolean.valueOf(jVar.f377429g == null);
            objArr[3] = jVar.f377428f;
            com.tencent.mars.xlog.Log.i("MicroMsg.LaunchAALogic", "launchAAByMoney, onSceneEnd, retCode: %s, retmsg: %s, msgXml==null: %s, billNo: %s", objArr);
            int i19 = jVar.f377426d;
            if (i19 == 0) {
                java.lang.String str2 = jVar.f377429g;
                java.lang.String str3 = fVar.f288912h;
                if (str2 != null) {
                    h61.o.p(jVar.f377428f, str3, str2);
                    km5.u.h(this.f279173g, java.lang.Boolean.TRUE);
                } else {
                    h61.o.m(jVar.f377428f, false, 0L);
                    km5.u.h(this.f279173g, java.lang.Boolean.TRUE);
                }
                h61.o.b(str3);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(407L, 0L, 1L, false);
                return;
            }
            km5.b bVar2 = this.f279173g;
            if (bVar2 != null) {
                if (i19 > 0) {
                    r45.g0 g0Var = jVar.f377430h;
                    if (g0Var == null || g0Var.f374759d <= 0) {
                        r45.a aVar = jVar.f377431i;
                        if (aVar != null && aVar.f369567d == 1 && !com.tencent.mm.sdk.platformtools.t8.K0(aVar.f369571h) && !com.tencent.mm.sdk.platformtools.t8.K0(jVar.f377431i.f369569f) && !com.tencent.mm.sdk.platformtools.t8.K0(jVar.f377431i.f369570g) && !com.tencent.mm.sdk.platformtools.t8.K0(jVar.f377431i.f369568e)) {
                            this.f279173g.a(jVar.f377431i);
                        } else if (com.tencent.mm.sdk.platformtools.t8.K0(jVar.f377427e)) {
                            this.f279173g.a(java.lang.Boolean.FALSE);
                        } else {
                            this.f279173g.a(jVar.f377427e);
                        }
                    } else {
                        bVar2.a(g0Var);
                    }
                } else {
                    bVar2.a(java.lang.Boolean.FALSE);
                }
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(407L, 2L, 1L, false);
            return;
        }
        if (m1Var.getType() == 1655) {
            this.f279170d = false;
            if (i17 != 0 || i18 != 0) {
                km5.b bVar3 = this.f279173g;
                if (bVar3 != null) {
                    bVar3.a(java.lang.Boolean.FALSE);
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(407L, 4L, 1L, false);
                return;
            }
            i61.g gVar = (i61.g) m1Var;
            r45.n nVar = gVar.f288915f;
            java.lang.Object[] objArr2 = new java.lang.Object[3];
            objArr2[0] = java.lang.Integer.valueOf(nVar.f380960d);
            objArr2[1] = nVar.f380961e;
            objArr2[2] = java.lang.Boolean.valueOf(nVar.f380963g == null);
            com.tencent.mars.xlog.Log.i("MicroMsg.LaunchAALogic", "launchAAByPerson, onSceneEnd, retCode: %s, retmsg: %s, msgxml==null: %s", objArr2);
            java.lang.String str4 = nVar.f380962f;
            int i27 = nVar.f380960d;
            if (i27 == 0) {
                java.lang.String str5 = nVar.f380963g;
                java.lang.String str6 = gVar.f288917h;
                if (str5 != null) {
                    h61.o.p(str4, str6, str5);
                    km5.u.h(this.f279173g, java.lang.Boolean.TRUE, nVar.f380962f);
                } else {
                    h61.o.m(str4, false, 0L);
                    km5.u.h(this.f279173g, java.lang.Boolean.TRUE, nVar.f380962f);
                }
                h61.o.b(str6);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(407L, 3L, 1L, false);
                return;
            }
            if (i27 > 0) {
                r45.g0 g0Var2 = nVar.f380964h;
                if (g0Var2 == null || g0Var2.f374759d <= 0) {
                    r45.a aVar2 = nVar.f380965i;
                    if (aVar2 != null && aVar2.f369567d == 1 && !com.tencent.mm.sdk.platformtools.t8.K0(aVar2.f369571h) && !com.tencent.mm.sdk.platformtools.t8.K0(nVar.f380965i.f369569f) && !com.tencent.mm.sdk.platformtools.t8.K0(nVar.f380965i.f369570g) && !com.tencent.mm.sdk.platformtools.t8.K0(nVar.f380965i.f369568e)) {
                        this.f279173g.a(nVar.f380965i);
                    } else if (com.tencent.mm.sdk.platformtools.t8.K0(nVar.f380961e)) {
                        this.f279173g.a(java.lang.Boolean.FALSE);
                    } else {
                        this.f279173g.a(nVar.f380961e);
                    }
                } else {
                    this.f279173g.a(g0Var2);
                }
            } else {
                this.f279173g.a(java.lang.Boolean.FALSE);
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(407L, 5L, 1L, false);
            return;
        }
        if (m1Var.getType() == 2831) {
            this.f279170d = false;
            if (i17 != 0 || i18 != 0) {
                km5.b bVar4 = this.f279173g;
                if (bVar4 != null) {
                    bVar4.a(java.lang.Boolean.FALSE);
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(407L, 4L, 1L, false);
                return;
            }
            i61.h hVar = (i61.h) m1Var;
            r45.l lVar = hVar.f288920f;
            java.lang.Object[] objArr3 = new java.lang.Object[3];
            objArr3[0] = java.lang.Integer.valueOf(lVar.f379051d);
            objArr3[1] = lVar.f379052e;
            objArr3[2] = java.lang.Boolean.valueOf(lVar.f379054g == null);
            com.tencent.mars.xlog.Log.i("MicroMsg.LaunchAALogic", "launchAAByPersonCustomize, onSceneEnd, retCode: %s, retmsg: %s, msgxml==null: %s", objArr3);
            com.tencent.mars.xlog.Log.i("MicroMsg.LaunchAALogic", "launchAAByPersonCustomize, onSceneEnd, retMsg: %s, billNo: %s", lVar.f379052e, lVar.f379053f);
            int i28 = lVar.f379051d;
            if (i28 == 0) {
                java.lang.String str7 = lVar.f379054g;
                java.lang.String str8 = hVar.f288922h;
                if (str7 != null) {
                    h61.o.p(lVar.f379053f, str8, str7);
                    km5.u.h(this.f279173g, java.lang.Boolean.TRUE, lVar.f379053f);
                } else {
                    h61.o.m(lVar.f379053f, false, 0L);
                    km5.u.h(this.f279173g, java.lang.Boolean.TRUE, lVar.f379053f);
                }
                h61.o.b(str8);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(407L, 3L, 1L, false);
                return;
            }
            if (i28 > 0) {
                r45.g0 g0Var3 = lVar.f379055h;
                if (g0Var3 == null || g0Var3.f374759d <= 0) {
                    r45.a aVar3 = lVar.f379056i;
                    if (aVar3 != null && aVar3.f369567d == 1 && !com.tencent.mm.sdk.platformtools.t8.K0(aVar3.f369571h) && !com.tencent.mm.sdk.platformtools.t8.K0(lVar.f379056i.f369569f) && !com.tencent.mm.sdk.platformtools.t8.K0(lVar.f379056i.f369570g) && !com.tencent.mm.sdk.platformtools.t8.K0(lVar.f379056i.f369568e)) {
                        this.f279173g.a(lVar.f379056i);
                    } else if (com.tencent.mm.sdk.platformtools.t8.K0(lVar.f379052e)) {
                        this.f279173g.a(java.lang.Boolean.FALSE);
                    } else {
                        this.f279173g.a(lVar.f379052e);
                    }
                } else {
                    this.f279173g.a(g0Var3);
                }
            } else {
                this.f279173g.a(java.lang.Boolean.FALSE);
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(407L, 5L, 1L, false);
        }
    }
}
