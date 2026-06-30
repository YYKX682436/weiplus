package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class b4 extends com.tencent.mm.ui.chatting.viewitems.a0 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f203454s;

    public static boolean d0(yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        if (!com.tencent.mm.sdk.platformtools.f9.SessionLuckyMoney.k(dVar.g(), null)) {
            return true;
        }
        ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Di(f9Var.Q0(), 1);
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 == null) {
            return true;
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.t8.K0(v17.f348668i1) ? v17.f348674k : v17.f348668i1;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgC2CFrom", "url==null: %s, billNo==null: %s", java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.K0(str)), java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.K0(v17.f348736z1)));
        if (com.tencent.mm.sdk.platformtools.t8.K0(f9Var.f193935o2)) {
            f9Var.f193935o2 = java.util.UUID.randomUUID().toString();
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(v17.f348704r1)) {
            java.lang.String str2 = str;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(v17.f348736z1)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgC2CFrom", "tofuliu billNo: %s, c2cNewAAType: %s, fromUser: %s", v17.f348736z1, java.lang.Integer.valueOf(v17.A1), v17.I);
                int i17 = v17.A1;
                if (i17 == 2 || i17 == 3 || i17 == 1 || i17 == 5) {
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("bill_no", v17.f348736z1);
                    intent.putExtra("launcher_user_name", v17.I);
                    intent.putExtra("enter_scene", 1);
                    intent.putExtra("chatroom", dVar.x());
                    j45.l.j(dVar.g(), "aa", ".ui.PaylistAAUI", intent, null);
                } else if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("rawUrl", str2);
                    j45.l.j(dVar.g(), "webview", ".ui.tools.WebViewUI", intent2, null);
                }
                if (com.tencent.mm.ui.chatting.x1.e(v17).f206180a == 2) {
                    int i18 = v17.A1;
                    if (i18 == 2) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13721, 4, 2, 2);
                    } else if (i18 == 3) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13721, 4, 2, 3);
                    } else if (i18 == 5) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13721, 4, 2, 4);
                    }
                } else {
                    int i19 = v17.A1;
                    if (i19 == 2) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13721, 4, 3, 2);
                    } else if (i19 == 3) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13721, 4, 3, 3);
                    } else if (i19 == 5) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13721, 4, 3, 4);
                    }
                }
            } else if ("1004".equals(v17.f348700q1) && !com.tencent.mm.sdk.platformtools.t8.K0(v17.H1)) {
                com.tencent.mm.ui.chatting.viewitems.g4.d(dVar.g(), v17.f348674k, v17.H1);
            } else if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                android.content.Intent intent3 = new android.content.Intent();
                intent3.putExtra("rawUrl", str2);
                j45.l.j(dVar.g(), "webview", ".ui.tools.WebViewUI", intent3, null);
            }
        } else {
            java.lang.String str3 = str;
            if (v17.f348704r1.startsWith("weixin://openNativeUrl/weixinHB/startreceivebizhbrequest")) {
                android.content.Intent intent4 = new android.content.Intent();
                intent4.putExtra("key_way", 1);
                intent4.putExtra("key_native_url", v17.f348704r1);
                intent4.putExtra("key_username", dVar.x());
                intent4.putExtra("key_from_username", g95.e0.d(f9Var));
                intent4.putExtra("key_static_from_scene", 100002);
                intent4.putExtra("key_msgid", f9Var.getMsgId());
                ot0.c cVar = (ot0.c) v17.y(ot0.c.class);
                intent4.putExtra("key_exclusive_username", cVar.f348421n);
                intent4.putExtra("key_cropname", cVar.f348411d);
                intent4.putExtra("key_receive_envelope_url", cVar.f348416i);
                intent4.putExtra("key_receive_envelope_md5", cVar.f348417j);
                intent4.putExtra("key_receive_envelope_dynamic_url", cVar.f348433z);
                intent4.putExtra("key_receive_envelope_dynamic_md5", cVar.A);
                intent4.putExtra("key_receive_envelope_dynamic_type", cVar.B);
                intent4.putExtra("key_receive_envelope_widget_url", cVar.f348422o);
                intent4.putExtra("key_receive_envelope_widget_md5", cVar.f348423p);
                intent4.putExtra("key_detail_envelope_url", cVar.f348418k);
                intent4.putExtra("key_detail_envelope_md5", cVar.f348419l);
                intent4.putExtra("key_detail_envelope_dynamic_url", cVar.C);
                intent4.putExtra("key_detail_envelope_dynamic_md5", cVar.D);
                intent4.putExtra("key_receive_envelope_atmosphere_dynamic_url", cVar.F);
                intent4.putExtra("key_detail_envelope_atmosphere_dynamic_url", cVar.G);
                intent4.putExtra("key_full_envelope_atmosphere_dynamic_url", cVar.H);
                ot0.j jVar = (ot0.j) v17.y(ot0.j.class);
                intent4.putExtra("key_packet_create_time", (int) f9Var.getCreateTime());
                intent4.putExtra("key_packet_source", jVar.f348540l);
                intent4.putExtra("key_about_url", jVar.f348538j);
                intent4.putExtra("key_packet_id", jVar.f348539k);
                intent4.putExtra("key_has_story", jVar.f348543o);
                intent4.putExtra("key_material_flag", jVar.f348544p);
                intent4.putExtra("key_receive_envelope_widget_status_flag", cVar.f348428u);
                intent4.putExtra("key_receive_envelope_fission_info", cVar.f348429v);
                j45.l.j(dVar.g(), "luckymoney", ".ui.LuckyMoneyBusiReceiveUI", intent4, null);
                ot0.j jVar2 = cVar.I;
                if (jVar2 != null) {
                    int i27 = !com.tencent.mm.sdk.platformtools.t8.K0(jVar2.f348541m) ? 2 : 1;
                    qg0.h0 h0Var = (qg0.h0) i95.n0.c(qg0.h0.class);
                    java.lang.String str4 = f9Var.f193935o2;
                    java.lang.String str5 = cVar.f348411d;
                    java.lang.String x17 = dVar.x();
                    ot0.j jVar3 = cVar.I;
                    ((pg0.s3) h0Var).Ri(str4, str5, x17, jVar3.f348539k, jVar3.f348543o ? 2 : 1, i27);
                    qg0.h0 h0Var2 = (qg0.h0) i95.n0.c(qg0.h0.class);
                    java.lang.String str6 = cVar.f348412e;
                    ((pg0.s3) h0Var2).getClass();
                    gb3.m.a(10, str6);
                    f9Var.f193935o2 = java.util.UUID.randomUUID().toString();
                }
            } else if (v17.f348704r1.startsWith("wxpay://c2cbizmessagehandler/hongbao/receivehongbao")) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgC2CFrom", "onChattingItemClickedFrom：hongbao");
                android.content.Intent intent5 = new android.content.Intent();
                intent5.putExtra("key_way", !dVar.D() ? 1 : 0);
                intent5.putExtra("key_native_url", v17.f348704r1);
                intent5.putExtra("key_username", dVar.x());
                intent5.putExtra("key_from_username", g95.e0.d(f9Var));
                intent5.putExtra("scene_id", java.lang.Integer.parseInt(v17.f348700q1));
                intent5.putExtra("key_invalidtime", v17.M0);
                ot0.c cVar2 = (ot0.c) v17.y(ot0.c.class);
                ot0.j jVar4 = (ot0.j) v17.y(ot0.j.class);
                intent5.putExtra("key_exclusive_username", cVar2.f348421n);
                intent5.putExtra("key_cropname", cVar2.f348411d);
                intent5.putExtra("key_receive_envelope_url", cVar2.f348416i);
                intent5.putExtra("key_receive_envelope_md5", cVar2.f348417j);
                intent5.putExtra("key_receive_envelope_dynamic_url", cVar2.f348433z);
                intent5.putExtra("key_receive_envelope_dynamic_md5", cVar2.A);
                intent5.putExtra("key_receive_envelope_dynamic_type", cVar2.B);
                intent5.putExtra("key_receive_envelope_widget_url", cVar2.f348422o);
                intent5.putExtra("key_receive_envelope_widget_md5", cVar2.f348423p);
                intent5.putExtra("key_receive_envelope_widget_status_flag", cVar2.f348428u);
                intent5.putExtra("key_receive_envelope_fission_info", cVar2.f348429v);
                intent5.putExtra("key_packet_create_time", (int) f9Var.getCreateTime());
                intent5.putExtra("key_packet_source", jVar4.f348540l);
                intent5.putExtra("key_detail_envelope_url", cVar2.f348418k);
                intent5.putExtra("key_detail_envelope_md5", cVar2.f348419l);
                intent5.putExtra("key_detail_envelope_dynamic_url", cVar2.C);
                intent5.putExtra("key_detail_envelope_dynamic_md5", cVar2.D);
                intent5.putExtra("key_receive_envelope_atmosphere_dynamic_url", cVar2.F);
                intent5.putExtra("key_detail_envelope_atmosphere_dynamic_url", cVar2.G);
                intent5.putExtra("key_full_envelope_atmosphere_dynamic_url", cVar2.H);
                intent5.putExtra("key_about_url", jVar4.f348538j);
                intent5.putExtra("key_packet_id", jVar4.f348539k);
                intent5.putExtra("key_has_story", jVar4.f348543o);
                intent5.putExtra("key_material_flag", jVar4.f348544p);
                intent5.putExtra("key_msgid", f9Var.getMsgId());
                intent5.putExtra("key_emoji_md5", ((ot0.d) v17.y(ot0.d.class)).f348438b.field_md5);
                if (((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).aj()) {
                    j45.l.j(dVar.g(), "luckymoney", ".ui.LuckyMoneyNewReceiveUI", intent5, null);
                } else {
                    j45.l.j(dVar.g(), "luckymoney", ".ui.LuckyMoneyNotHookReceiveUI", intent5, null);
                }
                java.lang.String x18 = dVar.x();
                java.util.Map map = com.tencent.mm.ui.chatting.component.z4.f200360a;
                if (c01.e2.L(x18)) {
                    gb3.n.a(1);
                }
                ot0.j jVar5 = cVar2.I;
                if (jVar5 != null) {
                    int i28 = !com.tencent.mm.sdk.platformtools.t8.K0(jVar5.f348541m) ? 2 : 1;
                    qg0.h0 h0Var3 = (qg0.h0) i95.n0.c(qg0.h0.class);
                    java.lang.String str7 = f9Var.f193935o2;
                    java.lang.String str8 = cVar2.f348411d;
                    java.lang.String x19 = dVar.x();
                    ot0.j jVar6 = cVar2.I;
                    ((pg0.s3) h0Var3).Ri(str7, str8, x19, jVar6.f348539k, jVar6.f348543o ? 2 : 1, i28);
                    qg0.h0 h0Var4 = (qg0.h0) i95.n0.c(qg0.h0.class);
                    java.lang.String str9 = cVar2.f348412e;
                    ((pg0.s3) h0Var4).getClass();
                    gb3.m.a(10, str9);
                    f9Var.f193935o2 = java.util.UUID.randomUUID().toString();
                }
                qg0.h0 h0Var5 = (qg0.h0) i95.n0.c(qg0.h0.class);
                java.lang.String str10 = v17.f348712t1;
                int i29 = f9Var.A0() == 1 ? 1 : 2;
                java.lang.String x27 = dVar.x();
                ot0.j jVar7 = cVar2.I;
                java.lang.String str11 = jVar7 != null ? jVar7.f348539k : "";
                ((pg0.s3) h0Var5).getClass();
                gb3.o.f270036b = str10;
                gb3.o.f270037c = i29;
                gb3.o.f270038d = x27;
                gb3.o.f270039e = str11;
                gb3.o.f270040f = 0;
                gb3.o.f270041g = 0;
                ((pg0.s3) ((qg0.h0) i95.n0.c(qg0.h0.class))).getClass();
                gb3.o.f270035a.a(2);
            } else if (v17.f348704r1.startsWith("frhb://c2cbizmessagehandler/hongbao/receivehongbao")) {
                android.content.Intent intent6 = new android.content.Intent();
                intent6.putExtra("key_way", !dVar.D() ? 1 : 0);
                intent6.putExtra("key_native_url", v17.f348704r1);
                intent6.putExtra("key_hk_url", str3);
                intent6.putExtra("key_username", dVar.x());
                intent6.putExtra("key_from_username", g95.e0.d(f9Var));
                intent6.putExtra("key_msgid", f9Var.getMsgId());
                intent6.putExtra("key_hk_scene", 1);
                j45.l.j(dVar.g(), "luckymoney", ".hk.ui.LuckyMoneyHKReceiveUI", intent6, null);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgC2CFrom", "native url not match:" + v17.f348704r1 + ", go webview:" + str3);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                    android.content.Intent intent7 = new android.content.Intent();
                    intent7.putExtra("rawUrl", str3);
                    j45.l.j(dVar.g(), "webview", ".ui.tools.WebViewUI", intent7, null);
                }
            }
        }
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public java.lang.String A(yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        return ((com.tencent.mm.ui.chatting.component.h0) ((sb5.g) dVar.f460708c.a(sb5.g.class))).f198580d.x().equals("BrandEcsTemplateMsg@fakeuser") ? f9Var.Q0() : super.A(dVar, f9Var);
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.f488489uo);
        com.tencent.mm.ui.chatting.viewitems.a4 a4Var = new com.tencent.mm.ui.chatting.viewitems.a4();
        a4Var.a(xgVar, false);
        xgVar.setTag(a4Var);
        return xgVar;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean N() {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        return menuItem.getItemId() == 100;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        g4Var.c(((com.tencent.mm.ui.chatting.viewitems.er) view.getTag()).d(), 100, 0, this.f203454s.s().getString(com.tencent.mm.R.string.b3p), com.tencent.mm.R.raw.icons_filled_delete);
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        d0(dVar, f9Var);
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public com.tencent.mm.storage.a9 i(com.tencent.mm.storage.f9 f9Var, android.content.Context context, yb5.q qVar, yb5.a aVar) {
        if (f9Var != null && com.tencent.mm.sdk.platformtools.t8.K0(f9Var.f193935o2)) {
            f9Var.f193935o2 = java.util.UUID.randomUUID().toString();
        }
        return com.tencent.mm.ui.chatting.viewitems.g4.a(f9Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x04a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x045a  */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.String, android.graphics.drawable.Drawable] */
    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 r29, yb5.d r30, rd5.d r31, java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 1363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.viewitems.b4.l(com.tencent.mm.ui.chatting.viewitems.g0, yb5.d, rd5.d, java.lang.String):void");
    }
}
