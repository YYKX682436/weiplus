package com.tencent.mm.plugin.game.ui;

@db5.a(19)
@gm0.a2
/* loaded from: classes8.dex */
public class GameCenterUI extends com.tencent.mm.ui.MMBaseActivity {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.game.model.e1 f140718e;

    public void O6(java.lang.String str) {
        r45.sp1 sp1Var = new r45.sp1();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            sp1Var.set(0, java.lang.Long.valueOf(jSONObject.optLong("objectId")));
            sp1Var.set(1, java.lang.Long.valueOf(jSONObject.optLong("liveId")));
            sp1Var.set(2, jSONObject.optString(dm.i4.COL_USERNAME));
            sp1Var.set(4, jSONObject.optString("objectNonceId"));
            sp1Var.set(7, jSONObject.optString("streamUrl"));
            sp1Var.set(3, jSONObject.optString("nickname"));
            sp1Var.set(6, jSONObject.optString("coverUrl"));
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GameCenterUI", e17, "", new java.lang.Object[0]);
        }
        java.lang.String Gj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Gj(9, 2, 65);
        r45.wk0 wk0Var = new r45.wk0();
        wk0Var.set(3, -1);
        wk0Var.set(4, -1);
        wk0Var.set(5, 1);
        wk0Var.set(0, Gj);
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.protocal.protobuf.FinderObject Mk = ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Mk(sp1Var);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(Mk);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("noticeId", this.f140718e.T2);
        hashMap.put("msgId", this.f140718e.field_gameMsgId);
        hashMap.put("extData", this.f140718e.U2);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("gameReport", hashMap);
        } catch (org.json.JSONException e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GameCenterUI", e18, "", new java.lang.Object[0]);
        }
        intent.putExtra("key_chnl_extra", jSONObject2.toString());
        ((vd2.f1) ((ss5.e0) i95.n0.c(ss5.e0.class))).Ni(getBaseContext(), intent, arrayList, 0, wk0Var, null);
    }

    public final void P6(boolean z17) {
        if (com.tencent.mm.plugin.game.model.d0.d(this, getIntent())) {
            return;
        }
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.game.ui.tab.GameRouteUI.class);
        android.os.Bundle extras = getIntent().getExtras();
        if (extras != null) {
            intent.putExtras(extras);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/game/ui/GameCenterUI", "jumpNativeIndex", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/game/ui/GameCenterUI", "jumpNativeIndex", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        if (z17) {
            overridePendingTransition(com.tencent.mm.R.anim.f477815c9, com.tencent.mm.R.anim.f477815c9);
        } else {
            overridePendingTransition(com.tencent.mm.ui.uc.f211078a, com.tencent.mm.ui.uc.f211079b);
        }
        if (getIntent().getBooleanExtra("from_find_more_friend", false)) {
            com.tencent.mm.plugin.game.model.d0.g(6, false, null, 1001);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(848L, 4L, 1L, false);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.game.model.e1 m17;
        super.onCreate(bundle);
        l33.c.c();
        getIntent().putExtra("gamecenterui_createtime", java.lang.System.currentTimeMillis());
        java.lang.Long l17 = (java.lang.Long) gm0.j1.u().c().m(com.tencent.mm.storage.u3.GAME_DISCOVERY_ENTRANCE_MSGID_LONG_SYNC, 0L);
        if (l17.longValue() != 0) {
            this.f140718e = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().L0(l17.longValue());
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GameCenterUI", "gamelog.activity, GameCenterUI, onCreate, time: " + java.lang.System.currentTimeMillis());
        if (getIntent().getIntExtra("game_report_from_scene", 0) == 901) {
            r53.d dVar = r53.b.f392640a;
            r53.c cVar = dVar.f392649c;
            cVar.f392642a = 0L;
            cVar.f392643b = 0L;
            cVar.f392644c = 0L;
            cVar.f392645d = 0L;
            cVar.f392642a = java.lang.System.currentTimeMillis();
            dVar.f392649c.f392645d = java.lang.System.currentTimeMillis();
        }
        if (getIntent().getBooleanExtra("game_check_float", false)) {
            int intExtra = getIntent().getIntExtra("game_sourceScene", 0);
            com.tencent.mm.plugin.game.model.e1 l18 = ((com.tencent.mm.plugin.game.n1) ((m33.r1) i95.n0.c(m33.r1.class))).Ai().l();
            if (l18 != null) {
                l18.t0();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(l18.f140291p2.f140323a)) {
                    r53.f.r(getBaseContext(), l18, "game_center_h5_floatlayer");
                }
            }
            com.tencent.mm.plugin.game.model.d0.f(l18, intExtra, 1);
            finish();
            return;
        }
        boolean booleanExtra = getIntent().getBooleanExtra("switch_country_no_anim", false);
        m53.e1 g17 = com.tencent.mm.plugin.game.commlib.i.g();
        if (g17 == null) {
            P6(booleanExtra);
            return;
        }
        int i17 = g17.f323642d;
        if (i17 == 0) {
            P6(booleanExtra);
            return;
        }
        if (i17 != 1) {
            if (i17 != 3) {
                if (i17 != 5) {
                    P6(booleanExtra);
                    return;
                } else {
                    P6(booleanExtra);
                    return;
                }
            }
            android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.game.ui.GameDownloadGuidanceUI.class);
            android.os.Bundle extras = getIntent().getExtras();
            if (extras != null) {
                intent.putExtras(extras);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/game/ui/GameCenterUI", "jumpToDownloadGuidanceIndex", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/game/ui/GameCenterUI", "jumpToDownloadGuidanceIndex", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            if (booleanExtra) {
                overridePendingTransition(com.tencent.mm.R.anim.f477815c9, com.tencent.mm.R.anim.f477815c9);
            } else {
                overridePendingTransition(com.tencent.mm.ui.uc.f211078a, com.tencent.mm.ui.uc.f211079b);
            }
            if (getIntent().getBooleanExtra("from_find_more_friend", false)) {
                com.tencent.mm.plugin.game.model.d0.g(6, false, null, 1002);
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(848L, 6L, 1L, false);
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(g17.f323643e)) {
            P6(booleanExtra);
            return;
        }
        java.lang.String str = g17.f323643e;
        getIntent().putExtra("rawUrl", str);
        if (((kj0.i) ((kj0.l) i95.n0.c(kj0.l.class))).Bi(e42.d0.game_luggage, true)) {
            android.content.Intent intent2 = getIntent();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && intent2 != null) {
                boolean booleanExtra2 = intent2.getBooleanExtra("from_find_more_friend", false);
                int intExtra2 = intent2.getIntExtra("game_report_from_scene", 0);
                com.tencent.mm.plugin.game.model.e1 k17 = ((com.tencent.mm.plugin.game.n1) ((m33.r1) i95.n0.c(m33.r1.class))).Ai().k();
                java.lang.String a17 = com.tencent.mm.plugin.game.model.d0.a(str, k17, intent2, true);
                intent2.putExtra("rawUrl", a17);
                intent2.putExtra("from_find_more_friend", true);
                if (booleanExtra2) {
                    if (!((com.tencent.mm.plugin.game.n1) ((m33.r1) i95.n0.c(m33.r1.class))).Bi().b() && (m17 = ((com.tencent.mm.plugin.game.n1) ((m33.r1) i95.n0.c(m33.r1.class))).Ai().m()) != null) {
                        m17.t0();
                        if (m17.S2 == 107) {
                            intent2.putExtra("from_download_floagt_ball_shutdown_entrance", true);
                        }
                    }
                    com.tencent.mm.plugin.game.model.d0.c(intent2, "game_center_entrance", true, k17, intExtra2, a17);
                    r53.f.F(intent2, this);
                    com.tencent.mm.plugin.game.model.d0.g(7, true, a17, intExtra2);
                } else {
                    com.tencent.mm.plugin.game.model.d0.c(intent2, "game_center_entrance", false, k17, intExtra2, a17);
                    r53.f.F(intent2, this);
                }
            }
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.idkeyStat(848L, 3L, 1L, false);
            g0Var.idkeyStat(848L, 9L, 1L, false);
        } else {
            android.content.Intent intent3 = getIntent();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && intent3 != null) {
                boolean booleanExtra3 = intent3.getBooleanExtra("from_find_more_friend", false);
                int intExtra3 = intent3.getIntExtra("game_report_from_scene", 0);
                com.tencent.mm.plugin.game.model.e1 k18 = ((com.tencent.mm.plugin.game.n1) ((m33.r1) i95.n0.c(m33.r1.class))).Ai().k();
                java.lang.String a18 = com.tencent.mm.plugin.game.model.d0.a(str, k18, intent3, true);
                intent3.putExtra("rawUrl", a18);
                if (booleanExtra3) {
                    com.tencent.mm.plugin.game.model.d0.e(this, intent3, "game_center_entrance", true, k18, intExtra3);
                    com.tencent.mm.plugin.game.model.d0.g(7, true, a18, intExtra3);
                } else {
                    com.tencent.mm.plugin.game.model.d0.e(this, intent3, "game_center_entrance", false, k18, intExtra3);
                }
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(848L, 3L, 1L, false);
        }
        com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("game_center_pref", 0).edit().putLong("game_index_last_visit_time", java.lang.System.currentTimeMillis()).commit();
    }

    @Override // com.tencent.mm.ui.MMBaseActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        m53.x0 x0Var;
        java.lang.String b17;
        super.onPause();
        com.tencent.mm.plugin.game.commlib.i.e();
        com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse getGameCenterGlobalSettingResponse = com.tencent.mm.plugin.game.commlib.i.f139381a;
        if (getGameCenterGlobalSettingResponse != null) {
            x0Var = getGameCenterGlobalSettingResponse.GameDyeReportSetting;
            if (x0Var != null) {
                java.util.LinkedList linkedList = x0Var.f324167d;
                if (!com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.GameConfigManager", "getGameDyeReportInfo gameDyeReportInfoControl.PackageInfoList.size = :%d", java.lang.Integer.valueOf(linkedList.size()));
                }
            }
        } else {
            com.tencent.mm.plugin.game.commlib.i.s();
            x0Var = null;
        }
        if (x0Var != null) {
            java.util.LinkedList linkedList2 = x0Var.f324167d;
            if (!(linkedList2 == null || linkedList2.isEmpty())) {
                ((ku5.t0) ku5.t0.f312615d).g(new r53.b0(x0Var));
            }
        }
        if (isFinishing()) {
            return;
        }
        com.tencent.mm.plugin.game.model.e1 e1Var = this.f140718e;
        if (e1Var != null) {
            e1Var.t0();
            if (com.tencent.mm.plugin.game.commlib.util.d.c()) {
                try {
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f140718e.f140279d2.f140415f)) {
                        org.json.JSONObject jSONObject = new org.json.JSONObject(this.f140718e.f140279d2.f140415f);
                        if (com.tencent.mm.plugin.game.commlib.util.d.b() && !this.f140718e.field_isRedDotExited && !com.tencent.mm.sdk.platformtools.t8.K0(jSONObject.optString("objectNonceId"))) {
                            O6(this.f140718e.f140279d2.f140415f);
                            finish();
                            return;
                        }
                    }
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GameCenterUI", e17, "", new java.lang.Object[0]);
                }
            }
            if (com.tencent.mm.plugin.game.commlib.i.k() != null && com.tencent.mm.plugin.game.commlib.i.k().f323979h) {
                com.tencent.mm.plugin.game.model.q0 q0Var = this.f140718e.f140279d2;
                if (q0Var.f140417h == 1 && !com.tencent.mm.sdk.platformtools.t8.K0(q0Var.f140416g)) {
                    com.tencent.mm.plugin.game.model.r0 r0Var = new com.tencent.mm.plugin.game.model.r0();
                    r0Var.f140429d = 5;
                    com.tencent.mm.plugin.game.model.e1 e1Var2 = this.f140718e;
                    if (com.tencent.mm.sdk.platformtools.t8.K0(e1Var2.f140279d2.f140416g)) {
                        b17 = null;
                    } else {
                        com.tencent.mm.plugin.game.model.q0 q0Var2 = e1Var2.f140279d2;
                        b17 = com.tencent.mm.plugin.game.model.d0.b(com.tencent.mm.plugin.game.model.d0.b(q0Var2.f140416g, "localMsgId=" + e1Var2.field_msgId), "gameMsgId=" + e1Var2.field_gameMsgId);
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(e1Var2.V2)) {
                            try {
                                b17 = com.tencent.mm.plugin.game.model.d0.b(b17, "business_data=" + java.net.URLEncoder.encode(e1Var2.V2, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding));
                            } catch (java.io.UnsupportedEncodingException unused) {
                            }
                        }
                        if (com.tencent.mm.plugin.game.commlib.i.k() != null && com.tencent.mm.plugin.game.commlib.i.k().f323979h && q0Var2.f140417h == 1) {
                            b17 = com.tencent.mm.plugin.game.model.d0.b(b17, "fromReddotExternPage=1");
                        }
                    }
                    r0Var.f140430e = b17;
                    r0Var.jump_url = b17;
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    try {
                        jSONObject2.put("preInjectData", this.f140718e.N2.f140356a);
                    } catch (org.json.JSONException e18) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.GameCenterUI", e18.getMessage());
                    }
                    r53.f.s(this, r0Var, "", jSONObject2.toString(), null);
                    overridePendingTransition(com.tencent.mm.ui.uc.f211078a, com.tencent.mm.ui.uc.f211079b);
                }
            }
        }
        finish();
    }
}
