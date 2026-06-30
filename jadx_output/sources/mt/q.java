package mt;

/* loaded from: classes8.dex */
public class q implements com.tencent.mm.modelbase.j1 {
    @Override // com.tencent.mm.modelbase.j1
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.protobuf.f fVar;
        com.tencent.mm.pluginsdk.model.app.x5 c17 = com.tencent.mm.pluginsdk.model.app.x5.c();
        c17.getClass();
        boolean a17 = gm0.j1.a();
        java.util.List list = c17.f189146d;
        if (!a17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SuggestionAppListLogic", "getServiceAppList onSceneEnd account not ready");
            c17.f189148f = 0;
            ((java.util.LinkedList) list).clear();
            return;
        }
        c17.f189144b = false;
        if (m1Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SuggestionAppListLogic", "scene == null");
            c17.f189148f = 0;
            ((java.util.LinkedList) list).clear();
            return;
        }
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SuggestionAppListLogic", "getServiceAppList onSceneEnd : errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            c17.f189148f = 0;
            ((java.util.LinkedList) list).clear();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SuggestionAppListLogic", "getServiceAppList onSceneEnd : errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        com.tencent.mm.modelbase.o oVar = ((com.tencent.mm.pluginsdk.model.app.y3) m1Var).f189158e;
        r45.pe4 pe4Var = (oVar == null || (fVar = oVar.f70711b.f70700a) == null) ? null : (r45.pe4) fVar;
        if (pe4Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SuggestionAppListLogic", "resp == null");
            c17.f189148f = 0;
            ((java.util.LinkedList) list).clear();
            return;
        }
        java.util.LinkedList linkedList = pe4Var.f382982d;
        if (linkedList == null || linkedList.size() <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SuggestionAppListLogic", "Service_appinfo empty");
            ((kt.a) ap3.e.a()).getClass();
            c17.f(zo3.p.Ri(), list);
            c17.f189148f = 0;
            ((java.util.LinkedList) list).clear();
            gm0.j1.i();
            gm0.j1.u().c().A(352276, java.lang.System.currentTimeMillis());
            c17.f189150h = java.lang.System.currentTimeMillis();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SuggestionAppListLogic", "offset = %d, count = %s", java.lang.Integer.valueOf(c17.f189148f), java.lang.Integer.valueOf(linkedList.size()));
        ((kt.a) ap3.e.a()).getClass();
        com.tencent.mm.pluginsdk.model.app.z Ri = zo3.p.Ri();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.qe4 qe4Var = (r45.qe4) it.next();
            com.tencent.mars.xlog.Log.i("MicroMsg.SuggestionAppListLogic", "service info: %s, %s, %s, %s, %s, %s", qe4Var.f383897i, java.lang.Integer.valueOf(qe4Var.f383898m), java.lang.Integer.valueOf(qe4Var.f383902q), java.lang.Integer.valueOf(qe4Var.f383901p), java.lang.Integer.valueOf(qe4Var.f383899n), qe4Var.f383892d);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(qe4Var.f383892d) && !com.tencent.mm.sdk.platformtools.t8.K0(qe4Var.f383897i)) {
                int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue();
                l75.e0 e0Var = com.tencent.mm.pluginsdk.model.app.m.f188983f2;
                boolean z17 = true;
                if ("wx3cc22b542de028d4".equals(qe4Var.f383892d)) {
                    qe4Var.f383899n = ~(qe4Var.f383899n ^ com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR);
                } else if ("wx6fa7e3bab7e15415".equals(qe4Var.f383892d)) {
                    if (qe4Var.f383902q <= 0) {
                        if (c01.z1.G() && c01.z1.m() == 0 && intValue == 1) {
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(965, 33);
                        } else {
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(965, 35);
                        }
                    }
                } else if ("wxce6f23b478a3a2a2".equals(qe4Var.f383892d) && qe4Var.f383902q <= 0) {
                    if (c01.z1.G() && c01.z1.m() == 0 && intValue == 1) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(965, 32);
                    } else {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(965, 34);
                    }
                }
                ((java.util.LinkedList) list).add(qe4Var.f383892d);
                com.tencent.mm.pluginsdk.model.app.m h17 = com.tencent.mm.pluginsdk.model.app.w.h(qe4Var.f383892d);
                if (h17 != null) {
                    if (h17.field_serviceAppInfoFlag == qe4Var.f383899n && h17.field_serviceAppType == qe4Var.f383898m && h17.f238391x1 == qe4Var.f383901p && h17.field_serviceShowFlag == qe4Var.f383902q) {
                        java.lang.String str2 = h17.field_appName;
                        if (str2 == null) {
                            str2 = "";
                        }
                        java.lang.String str3 = qe4Var.f383897i;
                        if (str3 == null) {
                            str3 = "";
                        }
                        if (str2.equals(str3)) {
                            java.lang.String str4 = h17.field_appName_en;
                            if (str4 == null) {
                                str4 = "";
                            }
                            java.lang.String str5 = qe4Var.f383893e;
                            if (str5 == null) {
                                str5 = "";
                            }
                            if (str4.equals(str5)) {
                                java.lang.String str6 = h17.field_appName_tw;
                                if (str6 == null) {
                                    str6 = "";
                                }
                                java.lang.String str7 = qe4Var.f383894f;
                                if (str7 == null) {
                                    str7 = "";
                                }
                                if (str6.equals(str7)) {
                                    java.lang.String str8 = h17.field_appName_hk;
                                    if (str8 == null) {
                                        str8 = "";
                                    }
                                    java.lang.String str9 = qe4Var.f383906u;
                                    if (str9 == null) {
                                        str9 = "";
                                    }
                                    if (str8.equals(str9)) {
                                        java.lang.String str10 = h17.f238375l1;
                                        if (str10 == null) {
                                            str10 = "";
                                        }
                                        java.lang.String str11 = qe4Var.f383896h;
                                        if (str11 == null) {
                                            str11 = "";
                                        }
                                        if (str10.equals(str11)) {
                                            java.lang.String str12 = h17.f238393y0;
                                            if (str12 == null) {
                                                str12 = "";
                                            }
                                            java.lang.String str13 = qe4Var.f383895g;
                                            if (str13 == null) {
                                                str13 = "";
                                            }
                                            if (str12.equals(str13)) {
                                                java.lang.String str14 = h17.f238381p1;
                                                if (str14 == null) {
                                                    str14 = "";
                                                }
                                                java.lang.String str15 = qe4Var.f383900o;
                                                if (str15 == null) {
                                                    str15 = "";
                                                }
                                                if (str14.equals(str15)) {
                                                    z17 = false;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (z17) {
                        java.lang.String str16 = h17.f238375l1;
                        java.lang.String str17 = h17.f238393y0;
                        c17.a(h17, qe4Var);
                        boolean update = Ri.update(h17, new java.lang.String[0]);
                        if (str16 == null) {
                            str16 = "";
                        }
                        java.lang.String str18 = qe4Var.f383896h;
                        if (str18 == null) {
                            str18 = "";
                        }
                        if (!str16.equals(str18)) {
                            java.lang.String str19 = qe4Var.f383896h;
                            if (str19 == null) {
                                str19 = "";
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.SuggestionAppListLogic", "update serviceApp.app_icon_url_list".concat(str19));
                            zo3.p.Di().a(h17.field_appId, 5);
                        }
                        if (str17 == null) {
                            str17 = "";
                        }
                        java.lang.String str20 = qe4Var.f383895g;
                        if (str20 == null) {
                            str20 = "";
                        }
                        if (!str17.equals(str20)) {
                            java.lang.String str21 = qe4Var.f383895g;
                            com.tencent.mars.xlog.Log.i("MicroMsg.SuggestionAppListLogic", "update serviceApp.app_icon_url_panel".concat(str21 != null ? str21 : ""));
                            zo3.p.Di().a(h17.field_appId, 4);
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.SuggestionAppListLogic", "update app: AppID = %s, ret = %s", qe4Var.f383892d, java.lang.Boolean.valueOf(update));
                    }
                } else {
                    h17 = new com.tencent.mm.pluginsdk.model.app.m();
                    h17.field_appId = qe4Var.f383892d;
                    c17.a(h17, qe4Var);
                    com.tencent.mars.xlog.Log.i("MicroMsg.SuggestionAppListLogic", "insert app: AppID = %s, ret = %s", qe4Var.f383892d, java.lang.Boolean.valueOf(Ri.insert(h17)));
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(h17.field_openId)) {
                    linkedList2.add(qe4Var.f383892d);
                }
            }
        }
        if (linkedList2.size() > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SuggestionAppListLogic", "needGetOpenIdList %d", java.lang.Integer.valueOf(linkedList2.size()));
            zo3.p.Ui().c(linkedList2);
        }
        if (linkedList.size() == 20) {
            int i19 = c17.f189148f + 20;
            c17.f189148f = i19;
            c17.b(c17.f189145c, i19);
        } else {
            c17.f(Ri, list);
            c17.f189148f = 0;
            ((java.util.LinkedList) list).clear();
        }
        gm0.j1.i();
        gm0.j1.u().c().A(352276, java.lang.System.currentTimeMillis());
        c17.f189150h = java.lang.System.currentTimeMillis();
    }
}
