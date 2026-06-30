package com.tencent.mm.plugin.record.ui.viewWrappers;

/* loaded from: classes9.dex */
public class q implements com.tencent.mm.plugin.record.ui.g0 {

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.record.ui.f0 f155553b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f155554c;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f155556e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f155557f;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f155564m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f155565n;

    /* renamed from: a, reason: collision with root package name */
    public int f155552a = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f155555d = false;

    /* renamed from: g, reason: collision with root package name */
    public int f155558g = -1;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f155559h = "";

    /* renamed from: i, reason: collision with root package name */
    public int f155560i = 0;

    /* renamed from: j, reason: collision with root package name */
    public final yo0.f f155561j = new yo0.f();

    /* renamed from: k, reason: collision with root package name */
    public final android.view.View.OnClickListener f155562k = new com.tencent.mm.plugin.record.ui.viewWrappers.n(this);

    /* renamed from: l, reason: collision with root package name */
    public final android.view.View.OnClickListener f155563l = new com.tencent.mm.plugin.record.ui.viewWrappers.o(this);

    public q(com.tencent.mm.plugin.record.ui.f0 f0Var, com.tencent.mm.sdk.platformtools.n3 n3Var) {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f155564m = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MusicPlayerEvent>(a0Var) { // from class: com.tencent.mm.plugin.record.ui.viewWrappers.OtherViewWrapper$3
            {
                this.__eventId = -1155728636;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent) {
                com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent2 = musicPlayerEvent;
                if (!(musicPlayerEvent2 instanceof com.tencent.mm.autogen.events.MusicPlayerEvent)) {
                    return false;
                }
                int i17 = musicPlayerEvent2.f54512g.f7036b;
                com.tencent.mm.plugin.record.ui.viewWrappers.q qVar = com.tencent.mm.plugin.record.ui.viewWrappers.q.this;
                if (i17 != 0 && i17 != 1 && i17 != 2 && i17 != 3) {
                    if (i17 == 4) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.OtherViewWrapper", "musicPlayerListener error");
                        com.tencent.mm.sdk.platformtools.n3 n3Var2 = qVar.f155554c;
                        n3Var2.sendMessageAtFrontOfQueue(n3Var2.obtainMessage(1));
                        il4.l lVar = il4.l.f292142a;
                        return false;
                    }
                    if (i17 != 7) {
                        return false;
                    }
                }
                com.tencent.mm.sdk.platformtools.n3 n3Var3 = qVar.f155554c;
                n3Var3.sendMessageAtFrontOfQueue(n3Var3.obtainMessage(1));
                return false;
            }
        };
        this.f155565n = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MusicCheckErrorEvent>(a0Var) { // from class: com.tencent.mm.plugin.record.ui.viewWrappers.OtherViewWrapper$4
            {
                this.__eventId = -1443570203;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.MusicCheckErrorEvent musicCheckErrorEvent) {
                com.tencent.mars.xlog.Log.i("MicroMsg.OtherViewWrapper", "musicCheckErrorListener check error");
                if (musicCheckErrorEvent.f54511g.f6956a == 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.OtherViewWrapper", "musicCheckErrorListener, must has error.");
                    return false;
                }
                com.tencent.mm.plugin.record.ui.viewWrappers.q.this.getClass();
                il4.l lVar = il4.l.f292142a;
                return false;
            }
        };
        this.f155553b = f0Var;
        this.f155554c = n3Var;
    }

    public static void c(com.tencent.mm.plugin.record.ui.viewWrappers.q qVar, android.view.View view, r45.hp0 hp0Var) {
        qVar.getClass();
        if (view == null) {
            return;
        }
        r45.qp0 qp0Var = hp0Var.f376369w;
        if ((qp0Var == null || qp0Var.f384162d < 0) && hp0Var.f376370x == null) {
            return;
        }
        int[] iArr = new int[2];
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationInWindow(iArr);
        r45.qp0 qp0Var2 = hp0Var.f376369w;
        if (qp0Var2 == null) {
            qp0Var2 = hp0Var.f376370x;
        }
        if (qp0Var2 == null) {
            return;
        }
        r45.rp0 rp0Var = new r45.rp0();
        qp0Var2.f384172q = rp0Var;
        rp0Var.f385070d = iArr[0];
        rp0Var.f385071e = iArr[1];
        rp0Var.f385072f = width;
        rp0Var.f385073g = height;
    }

    public static void d(android.content.Context context, com.tencent.mm.storage.f9 f9Var, r45.dv2 dv2Var) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("TITLE_WORDING", dv2Var.getString(1));
        intent.putExtra("AUTO_REFRESH", true);
        try {
            intent.putExtra("FINDER_SHARE_ALBUM", dv2Var.toByteArray());
        } catch (java.io.IOException unused) {
        }
        intent.putExtra("GET_REL_SCENE", 14);
        intent.putExtra("STREAM_CARD_BUFFER", dv2Var.getByteString(5).g());
        intent.putExtra("COMMENT_SCENE", 51);
        intent.putExtra("CARD_ID", ca4.z0.F0(dv2Var.getString(0)));
        intent.putExtra("SHARED_USERNAME", f9Var.Q0());
        intent.putExtra("FROM_SHARE_SCENE", com.tencent.mm.storage.z3.R4(f9Var.Q0()) ? 2 : 1);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("FinderRouterApi", "[enterRelatedTimelineUI] ".concat(context.getClass().getName()));
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).Ni(context, intent);
    }

    public static void e(android.content.Context context, com.tencent.mm.storage.f9 f9Var, r45.ev2 ev2Var) {
        int i17 = com.tencent.mm.storage.z3.R4(f9Var.Q0()) ? 3 : 2;
        if (ev2Var != null) {
            int integer = ev2Var.getInteger(6);
            ya2.e1 e1Var = ya2.e1.f460472a;
            if (integer != 0) {
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                e1Var.u(context, ev2Var, i17);
            } else {
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                e1Var.n(context, ev2Var, i17);
            }
        }
    }

    public static void f(com.tencent.mm.plugin.record.ui.viewWrappers.q qVar, android.content.Context context, et3.b bVar) {
        r45.ip0 ip0Var;
        r45.pp0 pp0Var;
        qVar.getClass();
        if (context == null) {
            return;
        }
        r45.hp0 hp0Var = bVar.f256590a.J1;
        java.lang.String str = null;
        if (hp0Var != null) {
            pp0Var = hp0Var.f376354e;
            ip0Var = hp0Var.f376353d;
        } else {
            ip0Var = null;
            pp0Var = null;
        }
        if (ip0Var != null) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(ip0Var.f377237o)) {
                tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                java.lang.String str2 = ip0Var.f377231f;
                ((sg3.a) v0Var).getClass();
                str = c01.a2.e(str2);
            } else {
                tg3.v0 v0Var2 = (tg3.v0) i95.n0.c(tg3.v0.class);
                java.lang.String str3 = ip0Var.f377237o;
                ((sg3.a) v0Var2).getClass();
                str = c01.a2.e(str3);
            }
        }
        if (ip0Var == null && bVar.f256594e == 1) {
            tg3.v0 v0Var3 = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String str4 = bVar.f256591b.field_fromUser;
            ((sg3.a) v0Var3).getClass();
            str = c01.a2.e(str4);
        }
        if (pp0Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OtherViewWrapper", "go to location error, locItem null, dataid[%s]", bVar.f256590a.T);
            db5.e1.T(context, context.getString(com.tencent.mm.R.string.cc9));
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("kwebmap_slat", pp0Var.f383268f);
        intent.putExtra("kwebmap_lng", pp0Var.f383266d);
        intent.putExtra("kPoiName", pp0Var.f383274o);
        intent.putExtra("Kwebmap_locaion", pp0Var.f383272m);
        intent.putExtra("kPoiid", pp0Var.f383276q);
        intent.putExtra("KIsFromPoiList", pp0Var.A);
        intent.putExtra("KPoiCategoryTips", pp0Var.f383278s);
        intent.putExtra("kPoiBusinessHour", pp0Var.f383280u);
        intent.putExtra("KPoiPhone", pp0Var.f383282w);
        intent.putExtra("KPoiPriceTips", pp0Var.f383284y);
        intent.putExtra("kBuildingID", pp0Var.C);
        intent.putExtra("kFloorName", pp0Var.E);
        int i17 = pp0Var.f383270h;
        if (i17 >= 0) {
            intent.putExtra("kwebmap_scale", i17);
        }
        intent.putExtra("kisUsername", str);
        intent.putExtra("kwebmap_from_to", true);
        int i18 = bVar.f256594e;
        if (i18 != 1) {
            if (i18 == 0) {
                intent.putExtra("map_view_type", 1);
                intent.putExtra("map_indoor_support", 1);
                j45.l.n(context, ya.b.LOCATION, ".ui.RedirectUI", intent, 1002);
                return;
            }
            return;
        }
        intent.putExtra("KFavLocSigleView", true);
        intent.putExtra("map_view_type", 2);
        intent.putExtra("kFavInfoLocalId", bVar.f256591b.field_localId);
        intent.putExtra("kFavCanDel", false);
        intent.putExtra("kFavCanRemark", false);
        j45.l.n(context, ya.b.LOCATION, ".ui.RedirectUI", intent, 1);
    }

    public static void g(com.tencent.mm.plugin.record.ui.viewWrappers.q qVar, android.content.Context context, et3.b bVar) {
        r45.gp0 gp0Var;
        r45.hp0 hp0Var;
        r45.ip0 ip0Var;
        r45.bq0 bq0Var;
        r45.jq0 jq0Var;
        qVar.getClass();
        if (bVar.f256590a == null && bVar.f256591b == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OtherViewWrapper", "No valid data, null == recordData.dataItem && null == recordData.favItemInfo");
            return;
        }
        if (((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Ri()) {
            o72.r2 r2Var = bVar.f256591b;
            java.lang.String str = (r2Var == null || (bq0Var = r2Var.field_favProto) == null || (jq0Var = bq0Var.f370962d) == null) ? "" : jq0Var.f378050w;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str) && (gp0Var = bVar.f256590a) != null && (hp0Var = gp0Var.J1) != null && (ip0Var = hp0Var.f376353d) != null) {
                str = ip0Var.f377245w;
            }
            o72.x1.s0(context, bVar.f256590a, str, java.lang.Boolean.FALSE, true, qVar.H(), qVar.G(bVar.f256591b), java.lang.Boolean.valueOf(!com.tencent.mm.sdk.platformtools.t8.K0(qVar.f155559h)), qVar.f155557f, qVar.f155556e);
        }
    }

    public static void h(com.tencent.mm.plugin.record.ui.viewWrappers.q qVar, android.content.Context context, et3.b bVar) {
        qVar.getClass();
        android.content.Intent intent = new android.content.Intent();
        if (com.tencent.mm.sdk.platformtools.t8.K0(bVar.f256590a.A)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OtherViewWrapper", "go to music[webpage], web url is null, use data url instead, dataid[%s]", bVar.f256590a.T);
            intent.putExtra("rawUrl", bVar.f256590a.C);
        } else {
            intent.putExtra("rawUrl", bVar.f256590a.A);
        }
        if (bVar.f256594e == 1) {
            intent.putExtra("is_favorite_item", true);
            intent.putExtra("fav_local_id", bVar.f256591b.field_localId);
            intent.putExtra("key_detail_can_delete", false);
            java.lang.String name = com.tencent.mm.pluginsdk.model.y1.class.getName();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("mm_event_class", name);
            bundle.putInt("mm_rpt_fav_id", bVar.f256591b.field_id);
            intent.putExtra("mm_report_bundle", bundle);
            int i17 = bVar.f256591b.field_id;
            java.lang.String str = bVar.f256590a.T;
        }
        intent.putExtra("key_enable_teen_mode_check", true);
        intent.putExtra("key_enable_fts_quick", true);
        j45.l.n(context, "webview", ".ui.tools.WebViewUI", intent, 1);
    }

    public static void i(com.tencent.mm.plugin.record.ui.viewWrappers.q qVar, android.content.Context context, et3.b bVar) {
        r45.hp0 hp0Var;
        qVar.getClass();
        r45.gp0 gp0Var = bVar.f256590a;
        if (gp0Var == null && bVar.f256591b == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OtherViewWrapper", "No valid data, null == recordData.dataItem && null == recordData.favItemInfo");
            return;
        }
        r45.km6 km6Var = (gp0Var == null || (hp0Var = gp0Var.J1) == null) ? null : hp0Var.G;
        if (km6Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OtherViewWrapper", "No valid data, null == shareObject");
            return;
        }
        bw5.o50 v17 = il4.d.v(km6Var.f378839e);
        if (v17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OtherViewWrapper", "goToMusicAlbum categoryItem null");
            return;
        }
        il4.e eVar = new il4.e();
        eVar.f292106c = qVar.H().f25422d;
        eVar.f292114k = qVar.G(bVar.f256591b);
        boolean z17 = !com.tencent.mm.sdk.platformtools.t8.K0(qVar.f155559h);
        il4.f fVar = eVar.f292122s;
        if (z17) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(qVar.f155557f)) {
                fVar.f292132d.put("msgid", qVar.f155557f);
            }
            java.util.Map map = fVar.f292132d;
            java.lang.String str = eVar.f292114k;
            map.put("chat", str != null ? str : "");
        } else {
            java.util.Map map2 = fVar.f292132d;
            java.lang.String str2 = eVar.f292114k;
            map2.put("favid", str2 != null ? str2 : "");
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(qVar.f155556e)) {
            fVar.f292132d.put("sourceuser", qVar.f155556e);
        }
        ((rk4.k8) ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj()).o(context, v17, qVar.H(), eVar, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a4, code lost:
    
        if (((ht.a) ((jt.v) i95.n0.c(jt.v.class))).Bi(bt3.g2.t(r13.f256590a, r13.f256600k, r13.f256592c, 1), r13.f256590a.K, 2) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00eb, code lost:
    
        if (((ht.a) ((jt.v) i95.n0.c(jt.v.class))).Bi(bt3.z0.b(r13), r13.f256590a.K, 2) == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void j(com.tencent.mm.plugin.record.ui.viewWrappers.q r11, android.content.Context r12, et3.b r13) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.record.ui.viewWrappers.q.j(com.tencent.mm.plugin.record.ui.viewWrappers.q, android.content.Context, et3.b):void");
    }

    public static void k(com.tencent.mm.plugin.record.ui.viewWrappers.q qVar, android.content.Context context, et3.b bVar) {
        qVar.getClass();
        r45.gp0 gp0Var = bVar.f256590a;
        r45.hp0 hp0Var = gp0Var.J1;
        if (hp0Var == null || hp0Var.f376356g == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OtherViewWrapper", "go to mall product error, get data proto item null, dataid[%s]", gp0Var.T);
            db5.e1.T(context, context.getString(com.tencent.mm.R.string.cc8));
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_product_info", bVar.f256590a.J1.f376356g.f370194m);
        if (bVar.f256594e == 1) {
            intent.putExtra("key_product_scene", 4);
        }
        j45.l.n(context, "product", ".ui.MallProductUI", intent, 1);
    }

    public static void l(com.tencent.mm.plugin.record.ui.viewWrappers.q qVar, android.content.Context context, et3.b bVar) {
        qVar.getClass();
        r45.gp0 gp0Var = bVar.f256590a;
        r45.hp0 hp0Var = gp0Var.J1;
        if (hp0Var == null || hp0Var.f376357h == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OtherViewWrapper", "go to tv error, get data proto item null, dataid[%s]", gp0Var.T);
            db5.e1.T(context, context.getString(com.tencent.mm.R.string.cc8));
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_TV_getProductInfoScene", 3);
        intent.putExtra("key_TV_xml", bVar.f256590a.J1.f376357h.f380741m);
        if (bVar.f256594e == 1) {
            intent.putExtra("key_is_favorite_item", true);
            intent.putExtra("key_favorite_local_id", bVar.f256591b.field_localId);
            intent.putExtra("key_can_delete_favorite_item", false);
        }
        j45.l.n(context, "shake", ".ui.TVInfoUI", intent, 1);
    }

    public static void m(com.tencent.mm.plugin.record.ui.viewWrappers.q qVar, android.content.Context context, et3.b bVar) {
        qVar.getClass();
        r45.gp0 gp0Var = bVar.f256590a;
        if (gp0Var.J1 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OtherViewWrapper", "go to friend card error, get data proto item null, dataid[%s]", gp0Var.T);
            db5.e1.T(context, context.getString(com.tencent.mm.R.string.cc8));
            return;
        }
        com.tencent.mm.storage.y8 D3 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).D3(gp0Var.f375408f);
        if (c01.e2.G(D3.f196358a)) {
            if (!com.tencent.mm.sdk.platformtools.f9.SessionOa.k(context, null)) {
                return;
            }
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(D3.f196358a, true);
            if (((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
                int h47 = ((uh4.c0) i95.n0.c(uh4.c0.class)).h4();
                boolean R4 = com.tencent.mm.storage.z3.R4(D3.f196358a);
                if (h47 == 0 && !n17.r2()) {
                    ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(context);
                    ((qk.s6) gm0.j1.s(qk.s6.class)).U6(R4 ? 2 : 1, D3.f196358a, D3.f196359b);
                    return;
                } else if (h47 == 2) {
                    ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(context);
                    ((qk.s6) gm0.j1.s(qk.s6.class)).U6(R4 ? 2 : 1, D3.f196358a, D3.f196359b);
                    return;
                }
            }
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", D3.f196358a);
        intent.putExtra("Contact_Alias", D3.f196360c);
        intent.putExtra("Contact_Nick", D3.f196359b);
        intent.putExtra("Contact_QuanPin", D3.f196361d);
        intent.putExtra("Contact_PyInitial", D3.f196362e);
        intent.putExtra("Contact_Uin", D3.f196367j);
        intent.putExtra("Contact_Mobile_MD5", D3.f196365h);
        intent.putExtra("Contact_full_Mobile_MD5", D3.f196366i);
        intent.putExtra("Contact_QQNick", D3.g());
        intent.putExtra("User_From_Fmessage", false);
        intent.putExtra("Contact_Scene", D3.f196364g);
        intent.putExtra("Contact_FMessageCard", true);
        intent.putExtra("Contact_RemarkName", D3.f196369l);
        intent.putExtra("Contact_VUser_Info_Flag", D3.f196374q);
        intent.putExtra("Contact_VUser_Info", D3.f196375r);
        intent.putExtra("Contact_BrandIconURL", D3.f196376s);
        intent.putExtra("Contact_Province", D3.f());
        intent.putExtra("Contact_City", D3.b());
        intent.putExtra("Contact_Sex", D3.f196372o);
        intent.putExtra("Contact_Signature", D3.f196373p);
        intent.putExtra("Contact_ShowUserName", false);
        intent.putExtra("Contact_KSnsIFlag", 0);
        qVar.L(context, intent);
        j45.l.n(context, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, 1);
        k45.a.a(D3.f196364g);
    }

    public static void n(com.tencent.mm.plugin.record.ui.viewWrappers.q qVar, android.content.Context context, et3.b bVar) {
        qVar.getClass();
        j41.y yVar = (j41.y) i95.n0.c(j41.y.class);
        java.lang.String str = bVar.f256590a.f375408f;
        ((l41.b2) yVar).getClass();
        k41.k0 b17 = k41.o0.b(str);
        if (b17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OtherViewWrapper", "go to kefu card error, desc: %s", bVar.f256590a.f375408f);
            db5.e1.T(context, context.getString(com.tencent.mm.R.string.cc8));
            return;
        }
        com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest openIMKefuStartConversationRequest = new com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest();
        openIMKefuStartConversationRequest.f72272d = context;
        openIMKefuStartConversationRequest.f72274f = 2;
        openIMKefuStartConversationRequest.f72276h = j41.f0.a(2);
        openIMKefuStartConversationRequest.f72287v = true;
        openIMKefuStartConversationRequest.f72283r = true;
        openIMKefuStartConversationRequest.f72285t = true;
        openIMKefuStartConversationRequest.f72281p = true;
        openIMKefuStartConversationRequest.f72282q = context.getString(com.tencent.mm.R.string.hez);
        r45.s4 s4Var = new r45.s4();
        openIMKefuStartConversationRequest.f72277i = s4Var;
        s4Var.f385488f = b17.f304023g;
        s4Var.f385490h = b17.f304017a;
        openIMKefuStartConversationRequest.f72273e = java.lang.System.currentTimeMillis();
        ((l41.g2) ((j41.z) i95.n0.c(j41.z.class))).Bi(openIMKefuStartConversationRequest);
    }

    public static void o(com.tencent.mm.plugin.record.ui.viewWrappers.q qVar, android.content.Context context, et3.b bVar) {
        qVar.getClass();
        if (context == null) {
            return;
        }
        int i17 = bVar.f256594e;
        if (i17 != 0) {
            if (i17 == 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.OtherViewWrapper", "goToRecordForFav");
                r45.gp0 gp0Var = bVar.f256590a;
                if (gp0Var.Z1 == null || gp0Var.f375451y2 == null) {
                    return;
                }
                android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.record.ui.FavSubRecordDetailUI.class);
                intent.putExtra("key_detail_info_id", bVar.f256591b.field_localId);
                intent.putExtra("from_scene", bVar.f256595f);
                intent.putExtra("record_xml", bVar.f256590a.Z1);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/record/ui/viewWrappers/OtherViewWrapper", "goToRecordForFav", "(Landroid/content/Context;Lcom/tencent/mm/plugin/record/ui/recordData/RecordData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/record/ui/viewWrappers/OtherViewWrapper", "goToRecordForFav", "(Landroid/content/Context;Lcom/tencent/mm/plugin/record/ui/recordData/RecordData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return;
            }
            return;
        }
        java.lang.String str = bVar.f256590a.Z1;
        if (str != null) {
            r45.ul5 A = bt3.g2.A(str);
            if (A == null || A.f387467h == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.OtherViewWrapper", "goToRecordForMsgHistory");
                android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.record.ui.RecordMsgDetailUI.class);
                intent2.putExtra("message_id", bVar.f256592c);
                intent2.putExtra("message_talker", bVar.f256600k);
                intent2.putExtra("record_xml", bVar.f256590a.Z1);
                intent2.putExtra("record_nest", true);
                intent2.putExtra("from_scene", qVar.f155560i);
                qVar.L(context, intent2);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent2);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/record/ui/viewWrappers/OtherViewWrapper", "goToRecordForMsgHistory", "(Landroid/content/Context;Lcom/tencent/mm/plugin/record/ui/recordData/RecordData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/record/ui/viewWrappers/OtherViewWrapper", "goToRecordForMsgHistory", "(Landroid/content/Context;Lcom/tencent/mm/plugin/record/ui/recordData/RecordData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return;
            }
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            java.lang.String str3 = bVar.f256593d;
            if (str3 == null || str3.isEmpty()) {
                str3 = bVar.f256590a.Z1;
            }
            if (str3 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.OtherViewWrapper", "goToRecordForNote, noteXml is null or empty.");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.OtherViewWrapper", "goToRecordForNote, noteXml: ".concat(str3));
            com.tencent.mm.autogen.events.OpenNoteFromSessionEvent openNoteFromSessionEvent = new com.tencent.mm.autogen.events.OpenNoteFromSessionEvent();
            am.sn snVar = openNoteFromSessionEvent.f54599g;
            snVar.f7906c = context;
            snVar.f7904a = bVar.f256592c;
            snVar.f7909f = bVar.f256600k;
            snVar.f7907d = bVar.f256596g == 2;
            snVar.f7905b = str3;
            snVar.f7910g = 6;
            openNoteFromSessionEvent.e();
        }
    }

    public static void p(com.tencent.mm.plugin.record.ui.viewWrappers.q qVar, android.content.Context context, et3.b bVar) {
        r45.hp0 hp0Var;
        r45.dp0 dp0Var;
        java.lang.String str;
        java.lang.String str2;
        android.content.Intent intent;
        qVar.getClass();
        if (context == null || (hp0Var = bVar.f256590a.J1) == null || (dp0Var = hp0Var.f376368v) == null) {
            return;
        }
        int i17 = qVar.f155558g;
        java.lang.String str3 = qVar.f155559h;
        l81.b1 b1Var = new l81.b1();
        b1Var.f317032k = 1096;
        r45.ip0 ip0Var = hp0Var.f376353d;
        if (ip0Var != null) {
            b1Var.f317034l = ip0Var.f377231f;
        }
        b1Var.f317012a = dp0Var.f372634d;
        b1Var.f317022f = dp0Var.f372639i;
        b1Var.f317016c = dp0Var.f372636f;
        int i18 = -1;
        b1Var.f317018d = -1;
        b1Var.f317014b = dp0Var.f372635e;
        b1Var.Q = i17;
        if (i17 != -1 && !android.text.TextUtils.isEmpty(str3)) {
            if (!android.text.TextUtils.isEmpty(b1Var.f317034l)) {
                b1Var.f317034l += ":";
            }
            b1Var.f317034l += i17 + ":" + str3;
        }
        int i19 = 2;
        if (!(context instanceof android.app.Activity) || (intent = ((android.app.Activity) context).getIntent()) == null) {
            str = null;
            str2 = null;
        } else {
            i18 = intent.getIntExtra("preChatTYPE", 2);
            str = intent.getStringExtra("preUsername");
            str2 = intent.getStringExtra("preChatName");
        }
        if (i18 == 1) {
            i19 = 1;
        } else if (i18 != 2) {
            i19 = i18 != 15 ? 0 : 5;
        }
        com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer();
        appBrandLaunchReferrer.f77322d = 6;
        appBrandLaunchReferrer.f77326h = dp0Var.f372644q;
        b1Var.f317035m = i19;
        b1Var.f317036n = java.lang.String.format("%s:%s", str, str2);
        b1Var.f317041s = appBrandLaunchReferrer;
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(context, b1Var);
    }

    public static void q(com.tencent.mm.plugin.record.ui.viewWrappers.q qVar, android.content.Context context, et3.b bVar) {
        r45.op0 op0Var;
        qVar.getClass();
        r45.gp0 gp0Var = bVar.f256590a;
        r45.hp0 hp0Var = gp0Var.J1;
        if (hp0Var == null || (op0Var = hp0Var.H) == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OtherViewWrapper", "go to liteapp error, get data proto item null, dataid[%s]", gp0Var.T);
            db5.e1.T(context, context.getString(com.tencent.mm.R.string.ccb));
            return;
        }
        q80.d0 d0Var = new q80.d0();
        d0Var.f360649a = op0Var.f382417q;
        d0Var.f360650b = op0Var.f382415o;
        d0Var.f360651c = op0Var.f382416p;
        d0Var.f360652d = java.lang.Boolean.valueOf(op0Var.f382419s);
        com.tencent.liteapp.storage.LiteAppReferrerInfo liteAppReferrerInfo = new com.tencent.liteapp.storage.LiteAppReferrerInfo();
        liteAppReferrerInfo.scene = bVar.f256596g == 1 ? com.tencent.liteapp.gen.LiteAppOpenScene.SINGLE_CHAT : com.tencent.liteapp.gen.LiteAppOpenScene.GROUP_CHAT;
        d0Var.f360674z = liteAppReferrerInfo;
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).lk(context, d0Var, new com.tencent.mm.plugin.record.ui.viewWrappers.p(qVar, d0Var, context));
    }

    public static void r(com.tencent.mm.plugin.record.ui.viewWrappers.q qVar, android.content.Context context, et3.b bVar) {
        r45.hp0 hp0Var;
        r45.ip0 ip0Var;
        qVar.getClass();
        if (context == null || (hp0Var = bVar.f256590a.J1) == null || (ip0Var = hp0Var.f376353d) == null) {
            return;
        }
        java.lang.String str = ip0Var.f377231f;
        r45.wp0 wp0Var = hp0Var.K;
        if (wp0Var == null || com.tencent.mm.sdk.platformtools.t8.K0(wp0Var.f389359d) || !com.tencent.mm.sdk.platformtools.f9.SessionOa.k(context, null)) {
            return;
        }
        java.lang.String str2 = wp0Var.f389359d;
        java.lang.String str3 = wp0Var.f389360e;
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str2, true);
        if (n17 != null && ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
            int h47 = ((uh4.c0) i95.n0.c(uh4.c0.class)).h4();
            if (h47 == 0 && !n17.r2()) {
                ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(context);
                ((qk.s6) gm0.j1.s(qk.s6.class)).U6(1, str2, str3);
                return;
            } else if (h47 == 2) {
                ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(context);
                ((qk.s6) gm0.j1.s(qk.s6.class)).U6(1, str2, str3);
                return;
            }
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", str2);
        intent.putExtra("Contact_Nick", str3);
        intent.putExtra("Contact_VUser_Info_Flag", wp0Var.f389362g);
        intent.putExtra("Contact_BrandIconURL", wp0Var.f389361f);
        intent.putExtra("Contact_ShowUserName", true);
        intent.putExtra("Contact_KSnsIFlag", 0);
        intent.putExtra("Contact_Source_FMessage", 17);
        intent.putExtra("source_from_user_name", str);
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        intent.putExtra("source_from_nick_name", c01.a2.b(str));
        if ((wp0Var.f389362g & 8) > 0) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str) || ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true) == null || !((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true).k2()) {
                intent.putExtra("Contact_Scene", 17);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10298, str + ",17");
            } else {
                intent.putExtra("Contact_Scene", 41);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10298, str + ",41");
            }
        }
        j45.l.j(context, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
    }

    public static void s(android.content.Context context, com.tencent.mm.storage.f9 f9Var, r45.mv2 mv2Var) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_topic_title", mv2Var.getString(0));
        intent.putExtra("key_topic_type", mv2Var.getInteger(1));
        if (mv2Var.getInteger(1) == 4) {
            intent.putExtra("KEY_FOLLOW_ID", mv2Var.getString(5));
        } else if (mv2Var.getInteger(1) == 7 && ((r45.ht0) mv2Var.getCustom(6)) != null) {
            intent.putExtra("key_activity_name", ((r45.ht0) mv2Var.getCustom(6)).getString(1));
            intent.putExtra("key_activity_id", pm0.v.Z(((r45.ht0) mv2Var.getCustom(6)).getString(0)));
            intent.putExtra("key_nick_name", ((r45.ht0) mv2Var.getCustom(6)).getString(2));
            intent.putExtra("key_cover_url", mv2Var.getString(2));
            intent.putExtra("key_display_mask", ((r45.ht0) mv2Var.getCustom(6)).getLong(4));
        }
        r45.ze2 ze2Var = new r45.ze2();
        if (((r45.hv2) mv2Var.getCustom(4)) != null) {
            ze2Var.set(5, ((r45.hv2) mv2Var.getCustom(4)).getString(0));
            ze2Var.set(0, java.lang.Float.valueOf(((r45.hv2) mv2Var.getCustom(4)).getFloat(1)));
            ze2Var.set(1, java.lang.Float.valueOf(((r45.hv2) mv2Var.getCustom(4)).getFloat(2)));
            try {
                intent.putExtra("key_topic_poi_location", ze2Var.toByteArray());
            } catch (java.io.IOException unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.OtherViewWrapper", "location toByteArray exception");
            }
        }
        intent.putExtra("key_finder_teen_mode_check", true);
        intent.putExtra("key_from_user", f9Var.Q0());
        intent.putExtra("key_report_scene", com.tencent.mm.storage.z3.R4(f9Var.Q0()) ? 2 : 1);
        intent.putExtra("KEY_TAB_TYPE", 6);
        if (com.tencent.mm.storage.z3.R4(f9Var.Q0())) {
            intent.putExtra("key_finder_teen_mode_scene", 2);
        } else {
            intent.putExtra("key_finder_teen_mode_scene", 1);
        }
        intent.putExtra("key_finder_teen_mode_user_name", "");
        intent.putExtra("key_finder_teen_mode_user_id", "");
        int i17 = mv2Var.getInteger(1) != 7 ? 22 : 59;
        intent.putExtra("key_activity_profile_src_type", "3");
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(com.tencent.mm.storage.z3.R4(f9Var.Q0()) ? 3 : 2, 2, i17, intent);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1.f460472a.m(context, intent, 4);
    }

    public static void t(android.content.Context context, r45.hd2 hd2Var) {
        if (hd2Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OtherViewWrapper", "goToFinderThemeLive: error, shareObject is null");
            return;
        }
        java.lang.String string = hd2Var.getString(3);
        if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OtherViewWrapper", "goToFinderThemeLive: error, themeId is empty");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KEY_SHARE_TYPE", 4);
        ((v40.s) ((uc.n) i95.n0.c(uc.n.class))).Bi(context, intent, string);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void u(android.content.Context r7, com.tencent.mm.storage.f9 r8, r45.mv2 r9) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.record.ui.viewWrappers.q.u(android.content.Context, com.tencent.mm.storage.f9, r45.mv2):void");
    }

    public static void v(android.content.Context context, com.tencent.mm.storage.f9 f9Var, r45.jv2 jv2Var) {
        if (ot0.q.v(f9Var.U1()) == null || jv2Var == null || com.tencent.mm.sdk.platformtools.t8.K0(jv2Var.getString(0))) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        if (com.tencent.mm.storage.z3.R4(f9Var.Q0())) {
            intent.putExtra("key_finder_teen_mode_scene", 2);
            intent.putExtra("report_scene", 2);
        } else {
            intent.putExtra("key_finder_teen_mode_scene", 1);
            intent.putExtra("report_scene", 1);
        }
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(com.tencent.mm.storage.z3.R4(f9Var.Q0()) ? 3 : 2, 3, 32, intent);
        intent.putExtra("key_enter_profile_type", 4);
        intent.putExtra("key_from_comment_scene", 11);
        intent.putExtra("from_user", f9Var.Q0());
        intent.putExtra("finder_username", jv2Var.getString(0));
        intent.putExtra("key_finder_teen_mode_check", true);
        intent.putExtra("key_finder_teen_mode_user_name", jv2Var.getString(1));
        intent.putExtra("key_finder_teen_mode_user_id", jv2Var.getString(0));
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1.f460472a.w(context, intent);
    }

    public static void w(android.content.Context context, com.tencent.mm.storage.f9 f9Var, r45.jv2 jv2Var) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_member_inlet_source", 5);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        java.lang.String authorFinderUsername = jv2Var.getString(0);
        int i17 = com.tencent.mm.storage.z3.R4(f9Var.Q0()) ? 3 : 2;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(authorFinderUsername, "authorFinderUsername");
        ((com.tencent.mm.plugin.finder.assist.i0) ((c61.ub) i95.n0.c(c61.ub.class))).Nk(context, intent, authorFinderUsername, i17, 3);
    }

    public final void A(android.widget.TextView textView, android.widget.TextView textView2, com.tencent.mm.ui.MMImageView mMImageView, r45.gp0 gp0Var) {
        r45.hd2 hd2Var;
        r45.hp0 hp0Var = gp0Var.J1;
        if (hp0Var == null || (hd2Var = hp0Var.I) == null) {
            return;
        }
        java.lang.String str = gp0Var.f375404d;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        textView.setText(str);
        textView.setVisibility(0);
        textView2.setVisibility(8);
        if (com.tencent.mm.sdk.platformtools.t8.K0(hd2Var.getString(2))) {
            return;
        }
        vo0.e eVar = vo0.e.f438467a;
        vo0.a aVar = vo0.e.f438468b;
        java.lang.String string = hd2Var.getString(2);
        yo0.f fVar = this.f155561j;
        fVar.f464078b = true;
        fVar.f464077a = true;
        aVar.c(string, mMImageView, fVar.a());
    }

    public final void B(android.widget.TextView textView, android.widget.TextView textView2, com.tencent.mm.ui.MMImageView mMImageView, r45.gp0 gp0Var) {
        r45.jv2 jv2Var;
        r45.hp0 hp0Var = gp0Var.J1;
        if (hp0Var == null || (jv2Var = hp0Var.A) == null) {
            return;
        }
        java.lang.String str = gp0Var.f375404d;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        textView.setText(str);
        textView.setVisibility(0);
        textView2.setVisibility(8);
        if (com.tencent.mm.sdk.platformtools.t8.K0(jv2Var.getString(2))) {
            return;
        }
        vo0.e eVar = vo0.e.f438467a;
        vo0.a aVar = vo0.e.f438468b;
        java.lang.String string = jv2Var.getString(2);
        yo0.f fVar = this.f155561j;
        fVar.f464078b = true;
        fVar.f464077a = true;
        aVar.c(string, mMImageView, fVar.a());
    }

    public final void C(android.widget.TextView textView, android.widget.TextView textView2, android.widget.ImageView imageView, r45.gp0 gp0Var) {
        bw5.g9 g9Var;
        r45.hp0 hp0Var = gp0Var.J1;
        if (hp0Var == null || (g9Var = hp0Var.F) == null) {
            return;
        }
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.cd6, g9Var.getNickname());
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (string == null) {
            string = "";
        }
        textView.setText(string);
        textView.setVisibility(0);
        textView2.setVisibility(8);
        if (com.tencent.mm.sdk.platformtools.t8.K0(g9Var.b())) {
            return;
        }
        vo0.e eVar = vo0.e.f438467a;
        vo0.a aVar = vo0.e.f438468b;
        java.lang.String b17 = g9Var.b();
        yo0.f fVar = this.f155561j;
        fVar.f464078b = true;
        fVar.f464077a = true;
        aVar.c(b17, imageView, fVar.a());
    }

    public final void D(android.widget.TextView textView, android.widget.TextView textView2, android.widget.TextView textView3, android.widget.ImageView imageView, r45.gp0 gp0Var) {
        r45.wp0 wp0Var = gp0Var.J1.K;
        if (wp0Var == null) {
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(wp0Var.f389359d)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OtherViewWrapper", "parse photo account msg failed");
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = textView.getContext();
        java.lang.String str = wp0Var.f389360e;
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, str));
        textView2.setVisibility(8);
        textView3.setText(((ox.g) ((tk.o) i95.n0.c(tk.o.class))).wi() ? com.tencent.mm.R.string.njb : com.tencent.mm.R.string.f490851b14);
        textView3.setVisibility(0);
        K(imageView, wp0Var.f389359d);
    }

    public final void E(android.widget.TextView textView, android.widget.TextView textView2, android.widget.TextView textView3, r45.gp0 gp0Var) {
        r45.hp0 hp0Var;
        r45.hp0 hp0Var2;
        r45.tq0 tq0Var = (gp0Var == null || (hp0Var2 = gp0Var.J1) == null) ? null : hp0Var2.f376355f;
        java.lang.String str = tq0Var != null ? tq0Var.f386664d : "";
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) && gp0Var != null) {
            str = gp0Var.f375404d;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            textView.setVisibility(8);
        } else {
            textView.setText(str);
            textView.setVisibility(0);
        }
        textView2.setVisibility(8);
        java.lang.String N = tq0Var != null ? com.tencent.mm.sdk.platformtools.t8.N(tq0Var.f386668h) : "";
        r45.ip0 ip0Var = (gp0Var == null || (hp0Var = gp0Var.J1) == null) ? null : hp0Var.f376353d;
        if (ip0Var != null) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(ip0Var.f377245w)) {
                java.lang.String F = F(textView3.getContext(), ip0Var.f377245w);
                N = F != null ? F : "";
            } else if (!com.tencent.mm.sdk.platformtools.t8.K0(ip0Var.B)) {
                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(ip0Var.B, true);
                if (n17 == null || !n17.d1().equals(ip0Var.B)) {
                    ((c01.k7) c01.n8.a()).b(ip0Var.B, 7, null);
                } else {
                    N = n17.g2();
                }
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(N) || N.equals(ip0Var.B)) {
                N = com.tencent.mm.sdk.platformtools.t8.N(ip0Var.f377247y);
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(N)) {
            textView3.setVisibility(8);
        } else {
            textView3.setText(N);
            textView3.setVisibility(0);
        }
    }

    public java.lang.String F(android.content.Context context, java.lang.String str) {
        return ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Zi(context, str);
    }

    public java.lang.String G(o72.r2 r2Var) {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f155559h)) {
            return this.f155559h;
        }
        if (r2Var == null) {
            return null;
        }
        return r2Var.field_id + "";
    }

    public bw5.ar0 H() {
        return 1 == this.f155560i ? bw5.ar0.TingScene_Fav : bw5.ar0.TingScene_ChatHistory;
    }

    public final void I(int i17, android.content.Intent intent, r45.gp0 gp0Var, android.content.Context context, java.lang.String str, java.lang.String str2, boolean z17) {
        intent.putExtra("key_detail_fav_path", str);
        intent.putExtra("key_detail_fav_thumb_path", str2);
        intent.putExtra("key_detail_fav_video_duration", gp0Var.f375448y);
        intent.putExtra("key_detail_statExtStr", gp0Var.R1);
        intent.putExtra("key_detail_is_data_exist", z17);
        intent.putExtra("key_detail_msg_uuid", gp0Var.f375431q2);
        if ((((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.chatting.RepairerConfigMediaGalleryUIFav()) == 1) && i17 == 1) {
            J(intent, gp0Var, context, bi5.a.class);
            return;
        }
        if ((((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.msgsend.RepairerConfigNewRecordDetail()) == 1) && i17 == 0) {
            J(intent, gp0Var, context, gi5.h.class);
        } else {
            o72.x1.M0(context, ".ui.detail.FavoriteVideoPlayUI", intent, 1, null);
        }
    }

    public final void J(android.content.Intent intent, r45.gp0 gp0Var, android.content.Context context, java.lang.Class cls) {
        r45.rp0 rp0Var;
        r45.hp0 hp0Var = gp0Var.J1;
        r45.qp0 qp0Var = hp0Var.f376369w;
        if (qp0Var == null) {
            qp0Var = hp0Var.f376370x;
        }
        if (qp0Var != null && (rp0Var = qp0Var.f384172q) != null) {
            intent.putExtra("img_gallery_width", rp0Var.f385072f).putExtra("img_gallery_height", qp0Var.f384172q.f385073g).putExtra("img_gallery_left", qp0Var.f384172q.f385070d).putExtra("img_gallery_top", qp0Var.f384172q.f385071e);
        }
        pf5.j0.a(intent, cls);
        o72.x1.M0(context, "com.tencent.mm.ui.media.MediaGalleryContainerUI", intent, 1, null);
    }

    public void K(android.widget.ImageView imageView, java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            imageView.setImageResource(com.tencent.mm.R.drawable.bhm);
        } else {
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, str, null);
        }
    }

    public final void L(android.content.Context context, android.content.Intent intent) {
        android.content.Intent intent2;
        if (!(context instanceof android.app.Activity) || (intent2 = ((android.app.Activity) context).getIntent()) == null) {
            return;
        }
        intent.putExtra("prePublishId", intent2.getStringExtra("prePublishId"));
        intent.putExtra("preUsername", intent2.getStringExtra("preUsername"));
        intent.putExtra("preChatName", intent2.getStringExtra("preChatName"));
        intent.putExtra("preChatTYPE", intent2.getIntExtra("preChatTYPE", 0));
    }

    @Override // com.tencent.mm.plugin.record.ui.g0
    public android.view.View a(android.content.Context context) {
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.f489382cd0, null);
        this.f155552a = i65.a.b(context, 75);
        this.f155564m.alive();
        this.f155565n.alive();
        return inflate;
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x07f0, code lost:
    
        if (((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).Zi(r0.getString(1), null, null, r29) != false) goto L110;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0124. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:30:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0684  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x05c5  */
    @Override // com.tencent.mm.plugin.record.ui.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(android.view.View r32, int r33, et3.b r34, java.lang.Object r35) {
        /*
            Method dump skipped, instructions count: 3556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.record.ui.viewWrappers.q.b(android.view.View, int, et3.b, java.lang.Object):void");
    }

    @Override // com.tencent.mm.plugin.record.ui.g0
    public void destroy() {
        this.f155553b = null;
        this.f155554c = null;
        this.f155564m.dead();
        this.f155565n.dead();
        this.f155555d = false;
    }

    @Override // com.tencent.mm.plugin.record.ui.g0
    public void pause() {
    }

    public final boolean x(com.tencent.mm.plugin.record.ui.c0 c0Var, et3.b bVar) {
        r45.hp0 hp0Var;
        r45.gp0 gp0Var = bVar.f256590a;
        if (gp0Var == null || (hp0Var = gp0Var.J1) == null) {
            return false;
        }
        return com.tencent.mm.plugin.fav.ui.b0.a(c0Var.f155356a, hp0Var.f376368v, 0.0f);
    }

    public final void y(android.widget.TextView textView, android.widget.TextView textView2, android.widget.TextView textView3, r45.gp0 gp0Var) {
        textView.setText(gp0Var.f375404d);
        textView2.setVisibility(0);
        textView2.setText(com.tencent.mm.sdk.platformtools.t8.T((float) gp0Var.R));
        textView3.setVisibility(8);
        if (gp0Var.X1 == 2) {
            textView2.setText(">" + ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).vj() + "MB");
        }
    }

    public final void z(android.widget.TextView textView, android.widget.TextView textView2, com.tencent.mm.ui.MMImageView mMImageView, r45.gp0 gp0Var) {
        r45.ev2 ev2Var;
        r45.hp0 hp0Var = gp0Var.J1;
        if (hp0Var == null || (ev2Var = hp0Var.f376352J) == null) {
            return;
        }
        java.lang.String str = gp0Var.f375404d;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        textView.setText(str);
        textView.setVisibility(0);
        textView2.setVisibility(8);
        if (com.tencent.mm.sdk.platformtools.t8.K0(ev2Var.getString(3))) {
            return;
        }
        vo0.e eVar = vo0.e.f438467a;
        vo0.a aVar = vo0.e.f438468b;
        java.lang.String string = ev2Var.getString(3);
        yo0.f fVar = this.f155561j;
        fVar.f464078b = true;
        fVar.f464077a = true;
        aVar.c(string, mMImageView, fVar.a());
    }
}
