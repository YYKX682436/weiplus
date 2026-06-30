package x82;

@j95.b
/* loaded from: classes9.dex */
public class i extends i95.w implements o72.l4 {
    public boolean wi(android.content.Context context, o72.r2 r2Var, r45.dq0 dq0Var) {
        java.lang.String str;
        r45.hp0 hp0Var;
        java.lang.String e17;
        r45.jp0 jp0Var;
        if (context == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavItemLogic", "Context is null");
        } else if (r2Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavItemLogic", "Fav item is null");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavItemLogic", "Handler favItemInfo id %d, type %d", java.lang.Long.valueOf(r2Var.field_localId), java.lang.Integer.valueOf(r2Var.field_type));
            ((a82.y1) ((o72.s4) i95.n0.c(o72.s4.class))).Di(java.lang.Long.valueOf(r2Var.field_localId));
            k82.c cVar = k82.c.f304887a;
            cVar.c(r2Var.field_localId, r2Var.field_id, r2Var.field_type, dq0Var.f372653d, r2Var.field_sourceType);
            int i17 = r2Var.field_type;
            if (i17 != -2) {
                com.tencent.mm.sdk.platformtools.f9 f9Var = com.tencent.mm.sdk.platformtools.f9.SessionMusic;
                r45.km6 km6Var = null;
                if (i17 != 21) {
                    if (i17 == 24) {
                        r45.op0 op0Var = r2Var.field_favProto.P;
                        q80.d0 d0Var = new q80.d0();
                        d0Var.f360651c = op0Var.f382416p;
                        d0Var.f360650b = x82.k0.b(op0Var);
                        d0Var.f360649a = op0Var.f382417q;
                        d0Var.f360652d = java.lang.Boolean.valueOf(op0Var.f382419s);
                        java.lang.String str2 = d0Var.f360650b;
                        if (str2 == null || str2.isEmpty() || (str = d0Var.f360649a) == null || str.isEmpty()) {
                            o72.r2 r2Var2 = new o72.r2();
                            r2Var2.U0(r2Var.field_xml);
                            d0Var.f360650b = x82.k0.b(r2Var2.field_favProto.P);
                            d0Var.f360649a = r2Var2.field_favProto.P.f382417q;
                        }
                        com.tencent.liteapp.storage.LiteAppReferrerInfo liteAppReferrerInfo = new com.tencent.liteapp.storage.LiteAppReferrerInfo();
                        liteAppReferrerInfo.scene = com.tencent.liteapp.gen.LiteAppOpenScene.FAV_LIST;
                        d0Var.f360674z = liteAppReferrerInfo;
                        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).lk(context, d0Var, new x82.w(d0Var, r2Var, op0Var, context));
                    } else if (i17 != 32) {
                        if (i17 != 33) {
                            switch (i17) {
                                case 1:
                                    android.content.Intent intent = new android.content.Intent();
                                    intent.putExtra("key_detail_text", r2Var.field_favProto.f370974s);
                                    intent.putExtra("key_detail_info_id", r2Var.field_localId);
                                    intent.putExtra("key_detail_can_share_to_friend", r2Var.t0());
                                    intent.putExtra("key_detail_time", r2Var.field_updateTime);
                                    long j17 = r2Var.field_sourceCreateTime;
                                    if (j17 <= 0) {
                                        j17 = r2Var.field_updateTime;
                                    }
                                    intent.putExtra("key_detail_create_time", j17);
                                    x82.k0.o(dq0Var, intent);
                                    o72.z2.b("FavoriteTextDetailUI", dq0Var.f372656g);
                                    ((y30.q) ((z30.u) i95.n0.c(z30.u.class))).getClass();
                                    o72.x1.L0(context, ".ui.detail.FavoriteTextDetailUI", intent, null);
                                    break;
                                case 2:
                                    x82.k0.f(context, r2Var, dq0Var);
                                    break;
                                case 3:
                                    android.content.Intent intent2 = new android.content.Intent();
                                    x82.k0.n(r2Var, dq0Var, intent2);
                                    intent2.putExtra("key_detail_create_time", r2Var.field_favProto.f370962d.f378044q);
                                    o72.z2.b("FavoriteVoiceDetailUI", dq0Var.f372656g);
                                    ((y30.q) ((z30.u) i95.n0.c(z30.u.class))).getClass();
                                    o72.x1.L0(context, ".ui.detail.FavoriteVoiceDetailUI", intent2, null);
                                    break;
                                case 4:
                                    x82.k0.i(context, r2Var, dq0Var);
                                    break;
                                case 5:
                                    x82.k0.k(context, r2Var, true, dq0Var);
                                    break;
                                case 6:
                                    if (com.tencent.mm.sdk.platformtools.f9.SessionLocation.k(context, null)) {
                                        r45.bq0 bq0Var = r2Var.field_favProto;
                                        r45.pp0 pp0Var = bq0Var.f370966h;
                                        java.lang.String str3 = bq0Var.f370970o;
                                        r45.jq0 jq0Var = bq0Var.f370962d;
                                        if (jq0Var == null || com.tencent.mm.sdk.platformtools.t8.K0(jq0Var.f378042o)) {
                                            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                                            java.lang.String str4 = r2Var.field_fromUser;
                                            ((sg3.a) v0Var).getClass();
                                            e17 = c01.a2.e(str4);
                                        } else {
                                            tg3.v0 v0Var2 = (tg3.v0) i95.n0.c(tg3.v0.class);
                                            java.lang.String str5 = jq0Var.f378042o;
                                            ((sg3.a) v0Var2).getClass();
                                            e17 = c01.a2.e(str5);
                                        }
                                        java.lang.String str6 = e17;
                                        java.util.ArrayList arrayList = new java.util.ArrayList();
                                        java.util.LinkedList linkedList = r2Var.field_tagProto.f385096e;
                                        if (linkedList != null) {
                                            arrayList.addAll(linkedList);
                                        }
                                        o72.z2.b("RedirectUI", dq0Var.f372656g);
                                        o72.x1.N0(r2Var.field_localId, r2Var, pp0Var, str6, str3, arrayList, context, true, true);
                                        ((ku5.t0) ku5.t0.f312615d).B(new x82.j0(r2Var));
                                        break;
                                    }
                                    break;
                                case 7:
                                    if (f9Var.k(context, null)) {
                                        r45.gp0 J2 = o72.x1.J(r2Var);
                                        android.content.Intent intent3 = new android.content.Intent();
                                        intent3.putExtra("rawUrl", J2.A);
                                        intent3.putExtra("key_enable_teen_mode_check", true);
                                        intent3.putExtra("key_enable_fts_quick", true);
                                        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent3, null);
                                        ((ku5.t0) ku5.t0.f312615d).B(new x82.g0(r2Var));
                                        break;
                                    }
                                    break;
                                case 8:
                                    x82.k0.e(context, r2Var, true, dq0Var);
                                    break;
                                default:
                                    switch (i17) {
                                        case 10:
                                            long j18 = r2Var.field_localId;
                                            java.lang.String str7 = r2Var.field_favProto.f370980y.f370194m;
                                            android.content.Intent intent4 = new android.content.Intent();
                                            intent4.putExtra("key_is_favorite_item", true);
                                            intent4.putExtra("key_favorite_local_id", j18);
                                            intent4.putExtra("key_Product_xml", str7);
                                            intent4.putExtra("key_can_delete_favorite_item", true);
                                            intent4.putExtra("key_ProductUI_getProductInfoScene", 3);
                                            j45.l.j(context, "scanner", ".ui.ProductUI", intent4, null);
                                            ((ku5.t0) ku5.t0.f312615d).B(new x82.f0(r2Var));
                                            break;
                                        case 11:
                                            android.content.Intent intent5 = new android.content.Intent();
                                            intent5.putExtra("key_product_scene", 4);
                                            intent5.putExtra("key_product_info", r2Var.field_favProto.f370980y.f370194m);
                                            j45.l.j(context, "product", ".ui.MallProductUI", intent5, null);
                                            ((ku5.t0) ku5.t0.f312615d).B(new x82.d0(r2Var));
                                            break;
                                        default:
                                            switch (i17) {
                                                case 14:
                                                    x82.k0.g(context, r2Var, true, dq0Var);
                                                    break;
                                                case 15:
                                                    break;
                                                case 16:
                                                    r45.gp0 J3 = o72.x1.J(r2Var);
                                                    if (J3 != null && (jp0Var = J3.O1) != null && (!com.tencent.mm.sdk.platformtools.t8.K0(jp0Var.f377998d) || !com.tencent.mm.sdk.platformtools.t8.K0(J3.O1.f378001g))) {
                                                        com.tencent.mars.xlog.Log.i("MicroMsg.FavItemLogic", "it is ad sight.");
                                                        x82.k0.h(context, r2Var, dq0Var);
                                                        break;
                                                    } else {
                                                        x82.k0.i(context, r2Var, dq0Var);
                                                        break;
                                                    }
                                                    break;
                                                case 17:
                                                    com.tencent.mm.storage.y8 D3 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).D3(o72.x1.J(r2Var).f375408f);
                                                    if (!c01.e2.G(D3.f196358a) || com.tencent.mm.sdk.platformtools.f9.SessionOa.k(context, null)) {
                                                        android.content.Intent intent6 = new android.content.Intent();
                                                        intent6.putExtra("Contact_User", D3.f196358a);
                                                        intent6.putExtra("Contact_Alias", D3.f196360c);
                                                        intent6.putExtra("Contact_Nick", D3.f196359b);
                                                        intent6.putExtra("Contact_QuanPin", D3.f196361d);
                                                        intent6.putExtra("Contact_PyInitial", D3.f196362e);
                                                        intent6.putExtra("Contact_Uin", D3.f196367j);
                                                        intent6.putExtra("Contact_Mobile_MD5", D3.f196365h);
                                                        intent6.putExtra("Contact_full_Mobile_MD5", D3.f196366i);
                                                        intent6.putExtra("Contact_QQNick", D3.g());
                                                        intent6.putExtra("User_From_Fmessage", false);
                                                        intent6.putExtra("Contact_Scene", D3.f196364g);
                                                        intent6.putExtra("Contact_FMessageCard", true);
                                                        intent6.putExtra("Contact_RemarkName", D3.f196369l);
                                                        intent6.putExtra("Contact_VUser_Info_Flag", D3.f196374q);
                                                        intent6.putExtra("Contact_VUser_Info", D3.f196375r);
                                                        intent6.putExtra("Contact_BrandIconURL", D3.f196376s);
                                                        intent6.putExtra("Contact_Province", D3.f());
                                                        intent6.putExtra("Contact_City", D3.b());
                                                        intent6.putExtra("Contact_Sex", D3.f196372o);
                                                        intent6.putExtra("Contact_Signature", D3.f196373p);
                                                        intent6.putExtra("Contact_ShowUserName", false);
                                                        intent6.putExtra("Contact_KSnsIFlag", 0);
                                                        o72.z2.b("ContactInfoUI", dq0Var.f372656g);
                                                        j45.l.j(context, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent6, null);
                                                        k45.a.a(D3.f196364g);
                                                        ((ku5.t0) ku5.t0.f312615d).B(new x82.c0(r2Var));
                                                        break;
                                                    }
                                                    break;
                                                case 18:
                                                    x82.k0.j(context, -1L, "", -1, r2Var, true, dq0Var);
                                                    break;
                                                default:
                                                    com.tencent.mars.xlog.Log.w("MicroMsg.FavItemLogic", "Do not match any type %d", java.lang.Integer.valueOf(i17));
                                                    break;
                                            }
                                        case 12:
                                            long j19 = r2Var.field_localId;
                                            java.lang.String str8 = r2Var.field_favProto.C.f380741m;
                                            android.content.Intent intent7 = new android.content.Intent();
                                            intent7.putExtra("key_TV_getProductInfoScene", 3);
                                            intent7.putExtra("key_is_favorite_item", true);
                                            intent7.putExtra("key_favorite_local_id", j19);
                                            intent7.putExtra("key_TV_xml", str8);
                                            intent7.putExtra("key_can_delete_favorite_item", true);
                                            j45.l.j(context, "shake", ".ui.TVInfoUI", intent7, null);
                                            ((ku5.t0) ku5.t0.f312615d).B(new x82.e0(r2Var));
                                            break;
                                    }
                            }
                        } else if (f9Var.k(context, null)) {
                            r2Var.field_favProto.getClass();
                            r45.gp0 J4 = o72.x1.J(r2Var);
                            if (J4 != null && (hp0Var = J4.J1) != null) {
                                km6Var = hp0Var.G;
                            }
                            if (km6Var == null) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.FavItemLogic", "No valid data, null == shareObject");
                            } else {
                                bw5.o50 v17 = il4.d.v(km6Var.f378839e);
                                if (v17 != null) {
                                    il4.e eVar = new il4.e();
                                    bw5.ar0 ar0Var = bw5.ar0.TingScene_Fav;
                                    eVar.f292106c = 1500;
                                    eVar.f292114k = r2Var.field_id + "";
                                    ((rk4.k8) ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj()).o(context, v17, ar0Var, eVar, null);
                                    ((ku5.t0) ku5.t0.f312615d).B(new x82.h0(r2Var));
                                } else {
                                    cVar.e(r2Var.field_localId, 3);
                                    com.tencent.mars.xlog.Log.e("MicroMsg.FavItemLogic", "handleMusicAlbumItem categoryItem null");
                                }
                            }
                        }
                    }
                }
                if (f9Var.k(context, null)) {
                    r45.jq0 jq0Var2 = r2Var.field_favProto.f370962d;
                    r45.gp0 J5 = o72.x1.J(r2Var);
                    java.lang.String str9 = jq0Var2.f378050w;
                    java.lang.Boolean bool = java.lang.Boolean.FALSE;
                    o72.x1.s0(context, J5, str9, bool, true, bw5.ar0.TingScene_Fav, r2Var.field_id + "", bool, null, null);
                    ((ku5.t0) ku5.t0.f312615d).B(new x82.i0(r2Var));
                }
            } else {
                dp.a.makeText(context, com.tencent.mm.R.string.cdu, 0).show();
            }
        }
        return true;
    }
}
