package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes15.dex */
public abstract class q2 extends com.tencent.mm.plugin.location.ui.impl.a implements com.tencent.mm.modelbase.u0, d85.j0 {
    public final k55.k A;
    public za3.l1 B;
    public com.tencent.mm.ui.widget.dialog.k0 C;
    public boolean D;
    public java.io.Serializable E;
    public boolean F;
    public android.location.Location G;
    public final com.tencent.tencentmap.mapsdk.maps.CustomLocationProvider.MyLocationSource H;
    public final o25.y1 I;

    /* renamed from: J, reason: collision with root package name */
    public final i11.c f144875J;
    public boolean K;
    public android.app.ProgressDialog L;
    public com.tencent.mm.sdk.platformtools.n3 M;
    public final java.lang.Runnable N;
    public boolean P;
    public float Q;
    public float R;

    /* renamed from: y, reason: collision with root package name */
    public long f144876y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f144877z;

    public q2(android.app.Activity activity) {
        super(activity);
        this.f144876y = -1L;
        this.f144877z = "";
        this.A = new k55.k(this.f144728d);
        this.D = false;
        this.F = false;
        this.G = null;
        this.H = new com.tencent.mm.plugin.location.ui.impl.r2(this);
        ((com.tencent.mm.pluginsdk.forward.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
        this.I = new com.tencent.mm.pluginsdk.forward.m();
        this.f144875J = new com.tencent.mm.plugin.location.ui.impl.u2(this);
        this.K = false;
        this.L = null;
        this.M = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.N = new com.tencent.mm.plugin.location.ui.impl.v2(this);
        this.P = false;
        this.Q = 0.0f;
        this.R = 0.0f;
        gm0.j1.d().a(com.tencent.wxmm.v2helper.EMethodSetSpkEnhance, this);
    }

    public static void t(com.tencent.mm.plugin.location.ui.impl.q2 q2Var, android.view.MenuItem menuItem, int i17) {
        q2Var.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.location.model.LocationInfo locationInfo = q2Var.f144731g;
        android.app.Activity activity = q2Var.f144728d;
        switch (itemId) {
            case 0:
                if (q2Var.D) {
                    ((yb0.c0) ((zb0.c0) i95.n0.c(zb0.c0.class))).getClass();
                    com.tencent.mm.pluginsdk.ui.tools.r8.a(new com.tencent.mm.pluginsdk.ui.tools.t3());
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("show_bottom", false);
                    intent.putExtra("jsapi_args_appid", "wx751a1acca5688ba3");
                    intent.putExtra("rawUrl", q2Var.f144877z);
                    intent.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, com.tencent.mm.R.string.i9h);
                    intent.putExtra("webview_bg_color_rsID", com.tencent.mm.R.color.f478712f3);
                    j45.l.j(activity, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, null);
                    return;
                }
                return;
            case 1:
                int i18 = q2Var.f144730f;
                if (i18 == 2 || i18 == 12 || i18 == 13) {
                    o72.v2.d(q2Var.n().getLongExtra("kFavInfoLocalId", -1L), 1, 0);
                }
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("Retr_Msg_content", va3.w.b(locationInfo));
                intent2.putExtra("Retr_Msg_Type", 9);
                o72.r3.a(intent2, new com.tencent.mm.sendtowework.LocationData(locationInfo.f144591m, locationInfo.f144589h, java.lang.Double.valueOf(locationInfo.f144587f), java.lang.Double.valueOf(locationInfo.f144586e), java.lang.Double.valueOf(locationInfo.f144588g)));
                j45.l.u(activity, ".ui.transmit.MsgRetransmitUI", intent2, null);
                ((o82.i) ((o72.u4) i95.n0.c(o72.u4.class))).Ai(q2Var.n(), q2Var.f144743v, q2Var.f144742u, 3);
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                hashMap.put("view_id", "forward_button_in_menu_in_poi_page");
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_clk", null, hashMap, 27051);
                q2Var.G("forward_friend_more_poi");
                return;
            case 2:
                q2Var.z();
                return;
            case 3:
                double d17 = locationInfo.f144586e;
                android.content.Intent intent3 = new android.content.Intent();
                intent3.putExtra("kfavorite", true);
                q2Var.f144729e.getClass();
                intent3.putExtra("kopenGmapNums", 0);
                q2Var.f144729e.getClass();
                intent3.putExtra("kopenOthersNums", 0);
                q2Var.f144729e.getClass();
                intent3.putExtra("kopenreportType", -1);
                java.lang.String str = q2Var.f144736o;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                intent3.putExtra("kRemark", str != null ? str : "");
                intent3.putExtra("kwebmap_slat", locationInfo.f144586e);
                intent3.putExtra("kwebmap_lng", locationInfo.f144587f);
                intent3.putExtra("Kwebmap_locaion", locationInfo.f144589h);
                intent3.putExtra("kPoiName", q2Var.f144737p);
                intent3.putExtra("kPoiid", locationInfo.f144594p);
                intent3.putExtra("KIsFromPoiList", locationInfo.f144595q);
                intent3.putExtra("KPoiCategoryTips", locationInfo.f144596r);
                intent3.putExtra("kPoiBusinessHour", locationInfo.f144597s);
                intent3.putExtra("KPoiPhone", locationInfo.f144598t);
                intent3.putExtra("KPoiPriceTips", locationInfo.f144599u);
                intent3.putExtra("kBuildingID", locationInfo.f144600v);
                intent3.putExtra("kFloorName", locationInfo.f144601w);
                activity.setResult(-1, intent3);
                activity.finish();
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                hashMap.put("view_id", "fav_button_in_menu_in_poi_page");
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_clk", null, hashMap, 27051);
                return;
            case 4:
                db5.e1.u(activity, activity.getString(com.tencent.mm.R.string.f490369t2), "", new com.tencent.mm.plugin.location.ui.impl.s2(q2Var), null);
                ((o82.i) ((o72.u4) i95.n0.c(o72.u4.class))).Ai(q2Var.n(), q2Var.f144743v, q2Var.f144742u, 6);
                return;
            case 5:
                long longExtra = q2Var.n().getLongExtra("kFavInfoLocalId", -1L);
                android.content.Intent intent4 = new android.content.Intent();
                intent4.putExtra("key_fav_item_id", longExtra);
                intent4.putExtra("key_fav_scene", 2);
                o72.x1.L0(activity, ".ui.FavTagEditUI", intent4, null);
                ((o82.i) ((o72.u4) i95.n0.c(o72.u4.class))).Ai(q2Var.n(), q2Var.f144743v, q2Var.f144742u, 7);
                return;
            case 6:
                android.content.Intent intent5 = new android.content.Intent();
                intent5.putExtra("Retr_Msg_content", va3.w.b(locationInfo));
                intent5.putExtra("Retr_Msg_Id", q2Var.f144876y);
                intent5.putExtra("Retr_MsgTalker", q2Var.f144740s);
                j45.l.u(activity, ".ui.chatting.ChattingSendDataToDeviceUI", intent5, null);
                return;
            case 7:
                ((o82.i) ((o72.u4) i95.n0.c(o72.u4.class))).Ai(q2Var.n(), q2Var.f144743v, q2Var.f144742u, 5);
                try {
                    o72.r2 F = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(q2Var.n().getLongExtra("kFavInfoLocalId", -1L));
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15378, java.lang.Integer.valueOf(F.field_id), java.lang.Integer.valueOf(F.field_type));
                    q2Var.v(F);
                    q2Var.x(activity, F, true, new r45.dq0());
                    activity.finish();
                    return;
                } catch (java.lang.Throwable unused) {
                    dp.a.makeText(activity, com.tencent.mm.R.string.cco, 0).show();
                    return;
                }
            case 8:
            default:
                return;
            case 9:
                q2Var.l();
                return;
            case 10:
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                java.lang.String str2 = locationInfo.f144591m;
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (str2 == null) {
                    str2 = "";
                }
                sb6.append(str2);
                sb6.append(" ");
                java.lang.String str3 = locationInfo.f144589h;
                sb6.append(str3 != null ? str3 : "");
                com.tencent.mm.sdk.platformtools.b0.e(sb6.toString());
                dp.a.makeText(activity, com.tencent.mm.R.string.f490361st, 0).show();
                q2Var.G("copy_more_poi");
                return;
            case 11:
                q2Var.w();
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                com.tencent.mm.plugin.finder.service.p3 p3Var = com.tencent.mm.plugin.finder.service.p3.f126174a;
                p3Var.c(null, false, true, "poi_info_from_qqmap_guide", null);
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                p3Var.c(null, true, false, "click_report_addr_in_menu_in_poi_page", hashMap);
                q2Var.G("feedback_more_poi");
                return;
            case 12:
                long longExtra2 = q2Var.n().getLongExtra("kFavOriginFavInfoLocalId", -1L);
                java.lang.String stringExtra = q2Var.n().getStringExtra("KFavOriginDataId");
                if (longExtra2 < 0 || com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.ViewMapUI", "favLocalId < 0 || Util.isNullOrNil(detailDataId)");
                    return;
                }
                o72.r2 F2 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(longExtra2);
                if (F2 == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.ViewMapUI", "goFavDetails() favItemInfo is null");
                    return;
                }
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                java.lang.String str4 = F2.field_id + "_" + (java.lang.System.currentTimeMillis() / 1000);
                java.util.LinkedList linkedList = F2.field_tagProto.f385096e;
                if (!com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
                    java.util.Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        sb7.append((java.lang.String) it.next());
                        sb7.append(";");
                    }
                }
                r45.dq0 dq0Var = new r45.dq0();
                dq0Var.f372653d = 9;
                dq0Var.f372654e = 0;
                dq0Var.f372657h = "";
                dq0Var.f372656g = str4;
                dq0Var.f372658i = sb7.toString();
                F2.E1 = stringExtra;
                ((x82.i) ((o72.l4) i95.n0.c(o72.l4.class))).wi(q2Var.f144741t.getContext(), F2, dq0Var);
                return;
        }
    }

    public abstract void A();

    public final void B(db5.g4 g4Var) {
        boolean booleanExtra = n().getBooleanExtra("kFavCanRemark", true);
        android.app.Activity activity = this.f144728d;
        if (booleanExtra) {
            g4Var.g(9, activity.getString(com.tencent.mm.R.string.guk), com.tencent.mm.R.raw.icons_outlined_pencil);
        }
        if (n().getBooleanExtra("kFavCanDel", true)) {
            g4Var.l(7, activity.getString(com.tencent.mm.R.string.ccm), com.tencent.mm.R.raw.icons_outlined_pencil, this.F);
            g4Var.g(5, activity.getString(com.tencent.mm.R.string.f491196ca5), com.tencent.mm.R.raw.fav_tags_icon);
            g4Var.g(4, activity.getString(com.tencent.mm.R.string.f490367t0), com.tencent.mm.R.raw.icons_outlined_delete);
            int intExtra = n().getIntExtra("kFavShowIconType", 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.ViewMapUI", "[onCreateFavMenu], showIcon type = " + intExtra);
            if (intExtra == 2) {
                g4Var.c(0, 12, 0, i65.a.r(activity, com.tencent.mm.R.string.f491197cb0), com.tencent.mm.R.raw.icons_outlined_chats);
            }
            if (intExtra == 1) {
                g4Var.c(0, 12, 0, i65.a.r(activity, com.tencent.mm.R.string.f491197cb0), com.tencent.mm.R.raw.note_filled);
            }
        }
    }

    public void C() {
    }

    public abstract void D();

    public void E(double d17, double d18, int i17, double d19) {
    }

    public void F(java.lang.String str, java.lang.String str2) {
        ((com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation) ((vg3.f4) i95.n0.c(vg3.f4.class))).Ai().g(str);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Retr_Msg_content", va3.w.b(this.f144731g));
        intent.putExtra("Retr_Msg_Type", 9);
        intent.putExtra("Retr_MsgQuickShare", true);
        intent.putExtra("custom_send_text", str2);
        intent.putExtra("Select_Conv_User", str);
        j45.l.u(this.f144728d, ".ui.transmit.MsgRetransmitUI", intent, null);
        o72.u4 u4Var = (o72.u4) i95.n0.c(o72.u4.class);
        android.content.Intent n17 = n();
        java.lang.String str3 = this.f144743v;
        long j17 = this.f144742u;
        int i17 = o72.u4.W0;
        ((o82.i) u4Var).Ai(n17, str3, j17, 3);
    }

    public void G(java.lang.String str) {
    }

    public void H() {
    }

    public boolean I() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ViewMapUI", "tryShowMoreSheet: ");
        final boolean q17 = q();
        android.app.Activity activity = this.f144728d;
        boolean z17 = false;
        if (q17) {
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) activity, 0, false);
            this.C = k0Var;
            int i17 = this.f144730f;
            if (i17 == 2 || i17 == 12 || i17 == 13) {
                k0Var.f211874o = new db5.o4() { // from class: com.tencent.mm.plugin.location.ui.impl.q2$$a
                    @Override // db5.o4
                    public final void onCreateMMMenu(db5.g4 g4Var) {
                        com.tencent.mm.plugin.location.ui.impl.q2.this.B(g4Var);
                    }
                };
            } else {
                k0Var.f211874o = new db5.o4() { // from class: com.tencent.mm.plugin.location.ui.impl.q2$$b
                    @Override // db5.o4
                    public final void onCreateMMMenu(db5.g4 g4Var) {
                        com.tencent.mm.plugin.location.ui.impl.q2 q2Var = com.tencent.mm.plugin.location.ui.impl.q2.this;
                        android.app.Activity activity2 = q2Var.f144728d;
                        g4Var.l(10, activity2.getString(com.tencent.mm.R.string.guw), com.tencent.mm.R.raw.location_copy, false);
                        if (q2Var.f144730f != 10) {
                            com.tencent.mm.plugin.location.model.LocationInfo locationInfo = q2Var.f144731g;
                            if (com.tencent.mm.sdk.platformtools.t8.K0(locationInfo.f144589h)) {
                                return;
                            }
                            java.lang.String str = locationInfo.f144594p;
                            if (str == null || !str.startsWith("UgcPoiEx_")) {
                                g4Var.l(11, activity2.getString(com.tencent.mm.R.string.gux), com.tencent.mm.R.raw.location_correct, q2Var.F);
                            }
                        }
                    }
                };
            }
            k0Var.f211884v = new db5.t4() { // from class: com.tencent.mm.plugin.location.ui.impl.q2$$c
                @Override // db5.t4
                public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i18) {
                    com.tencent.mm.plugin.location.ui.impl.q2.t(com.tencent.mm.plugin.location.ui.impl.q2.this, menuItem, i18);
                }
            };
            k0Var.f211881s = new db5.t4() { // from class: com.tencent.mm.plugin.location.ui.impl.q2$$c
                @Override // db5.t4
                public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i18) {
                    com.tencent.mm.plugin.location.ui.impl.q2.t(com.tencent.mm.plugin.location.ui.impl.q2.this, menuItem, i18);
                }
            };
            if (!this.F) {
                java.lang.String str = this.f144731g.f144594p;
                if (str != null && str.startsWith("UgcPoiEx_")) {
                    z17 = true;
                }
                if (!z17) {
                    ((com.tencent.mm.pluginsdk.forward.m) this.I).Di(this.f144728d, this.C, 1, null, new yz5.l() { // from class: com.tencent.mm.plugin.location.ui.impl.q2$$d
                        @Override // yz5.l
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            final java.lang.String str2 = (java.lang.String) obj;
                            final com.tencent.mm.plugin.location.ui.impl.q2 q2Var = com.tencent.mm.plugin.location.ui.impl.q2.this;
                            q2Var.getClass();
                            ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
                            id5.a aVar = new id5.a();
                            o15.b bVar = new o15.b();
                            bVar.fromXml(va3.w.b(q2Var.f144731g));
                            aVar.k(bVar);
                            n13.a0 a0Var = (n13.a0) i95.n0.c(n13.a0.class);
                            ((dk5.y) a0Var).wi(q2Var.f144728d, aVar, str2, n13.t.a(new com.tencent.mm.ui.widget.dialog.j() { // from class: com.tencent.mm.plugin.location.ui.impl.q2$$h
                                @Override // com.tencent.mm.ui.widget.dialog.j
                                public final void a(boolean z18, java.lang.String str3, int i18) {
                                    com.tencent.mm.plugin.location.ui.impl.q2 q2Var2 = com.tencent.mm.plugin.location.ui.impl.q2.this;
                                    q2Var2.p();
                                    if (z18) {
                                        q2Var2.F(str2, str3);
                                    }
                                }
                            }));
                            java.util.HashMap hashMap = new java.util.HashMap();
                            hashMap.put("chat_name", str2);
                            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                            hashMap.put("view_id", "forward_recent_user_in_menu_in_poi_page");
                            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_clk", null, hashMap, 27051);
                            q2Var.G("forward_recent_more_poi");
                            return jz5.f0.f302826a;
                        }
                    });
                }
            }
        } else {
            com.tencent.mm.ui.widget.dialog.k0 k0Var2 = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) activity, 1, false);
            this.C = k0Var2;
            k0Var2.f211881s = new db5.t4() { // from class: com.tencent.mm.plugin.location.ui.impl.q2$$c
                @Override // db5.t4
                public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i18) {
                    com.tencent.mm.plugin.location.ui.impl.q2.t(com.tencent.mm.plugin.location.ui.impl.q2.this, menuItem, i18);
                }
            };
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var3 = this.C;
        k0Var3.f211872n = new db5.o4() { // from class: com.tencent.mm.plugin.location.ui.impl.q2$$e
            @Override // db5.o4
            public final void onCreateMMMenu(db5.g4 g4Var) {
                com.tencent.mm.plugin.location.ui.impl.q2 q2Var = com.tencent.mm.plugin.location.ui.impl.q2.this;
                android.app.Activity activity2 = q2Var.f144728d;
                g4Var.j(1, activity2.getString(com.tencent.mm.R.string.f490559yh), com.tencent.mm.R.raw.icons_filled_share, com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.f478502m), q2Var.F);
                int i18 = q2Var.f144730f;
                boolean z18 = q17;
                if (i18 != 2) {
                    if (i18 != 7) {
                        switch (i18) {
                            case 11:
                            case 14:
                                break;
                            case 12:
                            case 13:
                                break;
                            default:
                                return;
                        }
                    }
                    if (z18) {
                        java.lang.String str2 = q2Var.f144731g.f144594p;
                        if (str2 != null && str2.startsWith("UgcPoiEx_")) {
                            g4Var.clear();
                            ((db5.h4) g4Var.j(1, activity2.getString(com.tencent.mm.R.string.guz), com.tencent.mm.R.raw.icons_filled_share, com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.f478502m), true)).f228372p = android.text.TextUtils.TruncateAt.END;
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (z18) {
                    return;
                }
                q2Var.B(g4Var);
            }
        };
        k0Var3.v();
        return true;
    }

    @Override // ab3.e
    public boolean b(android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.Q = motionEvent.getX();
            this.R = motionEvent.getY();
            java.lang.System.currentTimeMillis();
            this.P = false;
            C();
        } else if (action == 1) {
            if (!this.P) {
                java.lang.System.currentTimeMillis();
            }
            D();
        } else if (action == 2 && (java.lang.Math.abs(motionEvent.getX() - this.Q) > 10.0f || java.lang.Math.abs(motionEvent.getY() - this.R) > 10.0f)) {
            this.P = true;
            A();
        }
        return false;
    }

    @Override // ab3.e
    public void c(int i17, int i18, android.content.Intent intent) {
        if (-1 == i18) {
            if (4096 == i17) {
                if (this.f144733i.f144807i != null) {
                    java.lang.CharSequence charSequenceExtra = intent.getCharSequenceExtra("key_result");
                    this.f144736o = charSequenceExtra == null ? "" : charSequenceExtra.toString();
                    r();
                }
            } else if (4100 == i17 && this.f144733i.f144808j != null) {
                this.f144738q = intent.getStringArrayListExtra("key_fav_result_list");
                r();
            }
        }
        if (i17 == 4098 || i17 == 4099) {
            za3.d dVar = this.f144729e;
            dVar.getClass();
            if (i17 != 4098) {
                if (i17 == 4099 && -1 == i18 && intent != null) {
                    java.lang.String stringExtra = intent.getStringExtra("selectpkg");
                    android.content.Intent intent2 = new android.content.Intent((android.content.Intent) intent.getBundleExtra("transferback").getParcelable("targetintent"));
                    intent2.setPackage(stringExtra);
                    intent2.addFlags(524288);
                    android.content.Context context = dVar.f470900a;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent2);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/location/ui/MapHelper", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(context, "com/tencent/mm/plugin/location/ui/MapHelper", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    return;
                }
                return;
            }
            if (-1 == i18 && intent != null) {
                java.lang.String stringExtra2 = intent.getStringExtra("selectpkg");
                android.os.Bundle bundleExtra = intent.getBundleExtra("transferback");
                boolean booleanExtra = intent.getBooleanExtra("isalways", false);
                java.util.ArrayList parcelableArrayList = bundleExtra.getParcelableArrayList("locations");
                dVar.g((com.tencent.mm.plugin.location.model.LocationInfo) parcelableArrayList.get(0), (com.tencent.mm.plugin.location.model.LocationInfo) parcelableArrayList.get(1), stringExtra2, booleanExtra, false);
                return;
            }
            if (4097 == i18) {
                if (intent.getBooleanExtra("isalways", false)) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11091, 6, 2);
                } else {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11091, 6, 1);
                }
                java.util.ArrayList parcelableArrayList2 = intent.getBundleExtra("transferback").getParcelableArrayList("locations");
                com.tencent.mm.plugin.location.model.LocationInfo locationInfo = (com.tencent.mm.plugin.location.model.LocationInfo) parcelableArrayList2.get(0);
                com.tencent.mm.plugin.location.model.LocationInfo locationInfo2 = (com.tencent.mm.plugin.location.model.LocationInfo) parcelableArrayList2.get(1);
                android.content.Intent intent3 = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(java.lang.String.format("http://maps.google.com/maps?f=d&saddr=%f,%f&daddr=%f,%f&hl=" + (com.tencent.mm.sdk.platformtools.t8.K0(locationInfo.f144590i) ? "zh-cn" : locationInfo.f144590i), java.lang.Double.valueOf(locationInfo2.f144586e), java.lang.Double.valueOf(locationInfo2.f144587f), java.lang.Double.valueOf(locationInfo.f144586e), java.lang.Double.valueOf(locationInfo.f144587f))));
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putParcelable("targetintent", intent3);
                android.content.Intent intent4 = new android.content.Intent();
                android.content.Context context2 = dVar.f470900a;
                intent4.setClassName(context2, "com.tencent.mm.pluginsdk.ui.tools.AppChooserUI");
                intent4.putExtra("type", 1);
                intent4.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, context2.getResources().getString(com.tencent.mm.R.string.ggk));
                intent4.putExtra("targetintent", intent3);
                intent4.putExtra("transferback", bundle);
                intent4.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 6);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(4099);
                arrayList2.add(intent4);
                java.util.Collections.reverse(arrayList2);
                yj0.a.k((android.app.Activity) context2, arrayList2.toArray(), "com/tencent/mm/plugin/location/ui/MapHelper", "webMap", "(Lcom/tencent/mm/plugin/location/model/LocationInfo;Lcom/tencent/mm/plugin/location/model/LocationInfo;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            }
        }
    }

    @Override // ab3.e
    public void e(android.os.Bundle bundle) {
        com.tencent.tencentmap.mapsdk.maps.CustomLocationProvider.getInstance().setMyLocationSource(null, this.H);
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        this.f144744w = i11.h.e();
        android.app.Activity activity = this.f144728d;
        java.lang.String f17 = com.tencent.mm.sdk.platformtools.m2.f(activity);
        this.f144731g.f144590i = f17;
        this.f144732h.f144590i = f17;
        o25.n1.e(activity);
        activity.requestWindowFeature(1);
        activity.setContentView(o());
        com.tencent.mm.ui.v9.d(activity);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) m(com.tencent.mm.R.id.jbp);
        this.f144741t = com.tencent.mm.plugin.location.ui.impl.x.wi(activity);
        if ((this instanceof com.tencent.mm.plugin.location.ui.impl.y1) || ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ri(d85.g0.LOCAION, null)) {
            frameLayout.addView(this.f144741t);
        }
        if (com.tencent.mm.ui.bk.C()) {
            this.f144741t.enableDarkMode();
        } else {
            this.f144741t.disableDarkMode();
        }
        this.f144729e = new za3.d(activity);
        this.f144733i = new com.tencent.mm.plugin.location.ui.impl.f(this);
        this.f144736o = n().getStringExtra("kRemark");
        this.f144738q = n().getStringArrayListExtra("kTags");
        this.f144730f = n().getIntExtra("map_view_type", 0);
        this.f144742u = java.lang.System.currentTimeMillis();
        ((o82.i) ((o72.u4) i95.n0.c(o72.u4.class))).getClass();
        java.lang.String a17 = v82.b.a();
        kotlin.jvm.internal.o.f(a17, "getSearchId(...)");
        this.f144743v = a17;
        this.E = n().getSerializableExtra("key_from_type");
        double doubleExtra = n().getDoubleExtra("kwebmap_slat", 0.0d);
        double doubleExtra2 = n().getDoubleExtra("kwebmap_lng", 0.0d);
        java.lang.String stringExtra = n().getStringExtra("kPoiid");
        com.tencent.mars.xlog.Log.i("MicroMsg.ViewMapUI", "poiClassifyId " + stringExtra);
        if (stringExtra != null && stringExtra.contains("UgcPoiEx_")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ViewMapUI", "poi is ugc, dslat " + doubleExtra + " " + doubleExtra2);
            ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
            double[] dArr = new double[2];
            com.tencent.map.geolocation.sapp.TencentLocationUtils.wgs84ToGcj02(new double[]{doubleExtra, doubleExtra2}, dArr);
            doubleExtra = dArr[0];
            doubleExtra2 = dArr[1];
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ViewMapUI", "start dslat " + doubleExtra + " " + doubleExtra2);
        int intExtra = n().getIntExtra("kwebmap_scale", 15);
        this.f144739r = intExtra;
        if (intExtra <= 0) {
            this.f144739r = 15;
        }
        this.f144737p = n().getStringExtra("kPoiName");
        java.lang.String stringExtra2 = n().getStringExtra("Kwebmap_locaion");
        com.tencent.mm.plugin.location.model.LocationInfo locationInfo = this.f144731g;
        locationInfo.f144586e = doubleExtra;
        locationInfo.f144587f = doubleExtra2;
        locationInfo.f144589h = stringExtra2;
        locationInfo.f144588g = this.f144739r;
        locationInfo.f144591m = this.f144737p;
        locationInfo.f144595q = n().getBooleanExtra("KIsFromPoiList", false);
        this.f144731g.f144596r = n().getStringExtra("KPoiCategoryTips");
        this.f144731g.f144597s = n().getStringExtra("kPoiBusinessHour");
        this.f144731g.f144598t = n().getStringExtra("KPoiPhone");
        this.f144731g.f144599u = n().getFloatExtra("KPoiPriceTips", 0.0f);
        this.f144731g.f144594p = n().getStringExtra("kPoiid");
        this.f144731g.f144600v = n().getStringExtra("kBuildingID");
        this.f144731g.f144600v = n().getStringExtra("kFloorName");
        this.f144876y = n().getLongExtra("kMsgId", -1L);
        this.f144740s = n().getStringExtra("map_talker_name");
        this.f144733i.f144806h = (android.widget.LinearLayout) m(com.tencent.mm.R.id.gy8);
        com.tencent.mm.plugin.location.ui.impl.f fVar = this.f144733i;
        fVar.f144804f = this.f144741t;
        fVar.f144799a = (android.widget.RelativeLayout) m(com.tencent.mm.R.id.f487323oa0);
        this.f144733i.f144800b = (android.widget.ImageView) m(com.tencent.mm.R.id.obw);
        this.f144733i.f144801c = (android.widget.ImageButton) m(com.tencent.mm.R.id.oby);
        this.f144733i.f144802d = m(com.tencent.mm.R.id.obz);
        this.f144733i.f144803e = (android.widget.TextView) m(com.tencent.mm.R.id.f482486fu);
        this.f144733i.f144805g = (android.widget.TextView) m(com.tencent.mm.R.id.f485937jl4);
        this.f144733i.f144804f.getIController().setZoom(15);
        int i17 = this.f144730f;
        if (i17 != 0 && i17 != 3) {
            this.f144733i.f144801c.setVisibility(0);
            android.view.View view = this.f144733i.f144802d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/location/ui/impl/BaseMapUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/location/ui/impl/BaseMapUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f144733i.f144801c.setEnabled(false);
            this.f144733i.f144801c.setImageResource(com.tencent.mm.R.raw.icons_outlined_more);
        }
        this.f144733i.f144804f.setBuiltInZoomControls(false);
        this.f144733i.f144800b.setOnClickListener(new com.tencent.mm.plugin.location.ui.impl.d(this));
        this.f144733i.f144803e.setOnClickListener(new com.tencent.mm.plugin.location.ui.impl.e(this));
        y();
        s(com.tencent.mm.sdk.platformtools.x2.f193075e.getColor(com.tencent.mm.R.color.a9e));
        this.f144733i.f144804f.setMapAnchor(0.5f, 0.5f);
    }

    @Override // ab3.e
    public void f() {
        this.A.d();
        this.M.removeCallbacks(this.N);
        this.M = null;
        gm0.j1.d().q(com.tencent.wxmm.v2helper.EMethodSetSpkEnhance, this);
        android.app.ProgressDialog progressDialog = this.L;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.L = null;
        }
        ((i11.g) this.f144735n).c(this.f144745x);
        this.f144734m.clear();
        this.f144733i.f144804f.destroy();
        java.lang.System.gc();
    }

    @Override // ab3.e
    public boolean g(int i17, android.view.KeyEvent keyEvent) {
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.C;
        if (k0Var == null || !k0Var.i()) {
            I();
            return true;
        }
        this.C.u();
        return true;
    }

    @Override // com.tencent.mm.plugin.location.ui.impl.a
    public void j() {
        android.content.Intent intent = new android.content.Intent();
        this.f144729e.getClass();
        intent.putExtra("kopenGmapNums", 0);
        this.f144729e.getClass();
        intent.putExtra("kopenOthersNums", 0);
        this.f144729e.getClass();
        intent.putExtra("kopenreportType", -1);
        java.lang.String str = this.f144736o;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        intent.putExtra("kRemark", str);
        intent.putExtra("soso_street_view_url", this.f144877z);
        this.f144728d.setResult(-1, intent);
    }

    @Override // com.tencent.mm.plugin.location.ui.impl.a
    public void k() {
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        m1Var.getType();
        if (m1Var.getType() == 424) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.ViewMapUI", "msg failed.errtype:%d, errcode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    public boolean u(com.tencent.mm.plugin.location.model.LocationInfo locationInfo) {
        if (this.f144733i.f144804f.getIController() == null || !va3.w.d(locationInfo.f144586e, locationInfo.f144587f)) {
            return false;
        }
        this.f144733i.f144804f.getIController().animateTo(locationInfo.f144586e, locationInfo.f144587f);
        com.tencent.mars.xlog.Log.i("MicroMsg.ViewMapUI", "map animToLat: lat %s lng %s", java.lang.Double.valueOf(locationInfo.f144586e), java.lang.Double.valueOf(locationInfo.f144587f));
        return true;
    }

    public final void v(o72.r2 r2Var) {
        r2Var.field_flag = 0;
        r2Var.field_updateTime = java.lang.System.currentTimeMillis();
        r2Var.field_localId = -1L;
        r2Var.field_sourceType = 6;
        r45.jq0 jq0Var = r2Var.field_favProto.f370962d;
        if (jq0Var != null) {
            jq0Var.i("");
            r2Var.field_favProto.f370962d.g(6);
            r2Var.field_favProto.f370962d.e(c01.z1.r());
        }
        r2Var.field_fromUser = c01.z1.r();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.gp0 gp0Var = new r45.gp0();
        r45.hp0 hp0Var = new r45.hp0();
        hp0Var.f376354e = r2Var.field_favProto.f370966h;
        gp0Var.J1 = hp0Var;
        gp0Var.t0("WeNote_0");
        gp0Var.h0(6);
        linkedList.add(0, gp0Var);
        r2Var.field_favProto.d(linkedList);
        r2Var.field_type = 18;
        r2Var.field_xml = o72.r2.G0(r2Var);
    }

    public void w() {
        android.view.ViewGroup.LayoutParams layoutParams;
        android.app.Activity activity = this.f144728d;
        final com.tencent.mm.ui.widget.dialog.y1 y1Var = new com.tencent.mm.ui.widget.dialog.y1(activity);
        android.view.View inflate = android.view.LayoutInflater.from(activity).inflate(com.tencent.mm.R.layout.bso, (android.view.ViewGroup) null);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.c9x);
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.bys);
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.h5n);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.obc);
        findViewById2.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.location.ui.impl.q2$$f
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                java.lang.Object obj = new java.lang.Object();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                com.tencent.mm.ui.widget.dialog.y1 y1Var2 = com.tencent.mm.ui.widget.dialog.y1.this;
                arrayList.add(y1Var2);
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/location/ui/impl/ViewMapUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", obj, array);
                java.lang.Object obj2 = new java.lang.Object();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(y1Var2);
                arrayList2.add(view);
                java.lang.Object[] array2 = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/plugin/location/ui/impl/ViewMapUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", obj2, array2);
                y1Var2.q();
                yj0.a.h(new java.lang.Object(), "com/tencent/mm/plugin/location/ui/impl/ViewMapUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                yj0.a.h(new java.lang.Object(), "com/tencent/mm/plugin/location/ui/impl/ViewMapUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        findViewById.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.location.ui.impl.q2$$g
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                java.lang.Object obj = new java.lang.Object();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                com.tencent.mm.ui.widget.dialog.y1 y1Var2 = com.tencent.mm.ui.widget.dialog.y1.this;
                arrayList.add(y1Var2);
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/location/ui/impl/ViewMapUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", obj, array);
                java.lang.Object obj2 = new java.lang.Object();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(y1Var2);
                arrayList2.add(view);
                java.lang.Object[] array2 = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/plugin/location/ui/impl/ViewMapUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", obj2, array2);
                y1Var2.q();
                yj0.a.h(new java.lang.Object(), "com/tencent/mm/plugin/location/ui/impl/ViewMapUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                yj0.a.h(new java.lang.Object(), "com/tencent/mm/plugin/location/ui/impl/ViewMapUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        float q17 = i65.a.q(activity);
        if (q17 != 1.0f && (layoutParams = findViewById3.getLayoutParams()) != null) {
            int dimension = (int) (activity.getResources().getDimension(com.tencent.mm.R.dimen.f479723df) * q17);
            layoutParams.width = dimension;
            layoutParams.height = dimension;
            findViewById3.setLayoutParams(layoutParams);
        }
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        y1Var.k(inflate);
        y1Var.s();
    }

    public final void x(android.content.Context context, o72.r2 r2Var, boolean z17, r45.dq0 dq0Var) {
        com.tencent.mm.autogen.events.NotifyWNNoteOperationEvent notifyWNNoteOperationEvent = new com.tencent.mm.autogen.events.NotifyWNNoteOperationEvent();
        am.zl zlVar = notifyWNNoteOperationEvent.f54554g;
        zlVar.field_localId = r2Var.field_localId;
        zlVar.f8588k = 5;
        zlVar.f8579b = r2Var.field_xml;
        zlVar.f8581d = context;
        android.os.Bundle bundle = new android.os.Bundle();
        r45.sp0 sp0Var = r2Var.field_favProto.G;
        if (sp0Var != null) {
            bundle.putString("noteauthor", sp0Var.f385891d);
            bundle.putString("noteeditor", sp0Var.f385892e);
        }
        bundle.putLong("edittime", r2Var.field_updateTime);
        am.zl zlVar2 = notifyWNNoteOperationEvent.f54554g;
        zlVar2.f8585h = bundle;
        zlVar2.field_favProto = r2Var.field_favProto;
        zlVar2.f8578a = 2;
        zlVar2.f8589l = z17;
        zlVar2.f8590m = dq0Var;
        notifyWNNoteOperationEvent.e();
    }

    public void y() {
        java.io.Serializable serializable;
        boolean z17 = true;
        this.f144733i.f144803e.setEnabled(true);
        boolean z18 = q() && n().getIntExtra("intent_map_key", -1) == 4 && ((serializable = this.E) == zy2.o9.f477517e || serializable == zy2.o9.f477516d);
        this.F = z18;
        com.tencent.mm.plugin.location.model.LocationInfo locationInfo = this.f144731g;
        if (!z18) {
            u(locationInfo);
        }
        this.f144733i.f144804f.getIController().setZoom(this.f144739r);
        this.f144733i.f144801c.setEnabled(true);
        if (n().getBooleanExtra("kShowshare", true)) {
            this.f144733i.f144801c.setVisibility(0);
        } else {
            this.f144733i.f144801c.setVisibility(8);
        }
        java.lang.String stringExtra = n().getStringExtra("soso_street_view_url");
        this.f144877z = stringExtra;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra) && (com.tencent.mm.sdk.platformtools.m2.n() || com.tencent.mm.sdk.platformtools.m2.m())) {
            this.D = true;
        } else if (com.tencent.mm.sdk.platformtools.m2.n() || com.tencent.mm.sdk.platformtools.m2.m()) {
            this.D = false;
        }
        this.f144733i.f144801c.setOnClickListener(new com.tencent.mm.plugin.location.ui.impl.t2(this));
        ab3.h hVar = this.f144733i.f144804f;
        android.app.Activity activity = this.f144728d;
        za3.l1 l1Var = new za3.l1(hVar, activity, false);
        this.B = l1Var;
        com.tencent.mm.plugin.location_soso.ViewManager viewManager = l1Var.f470990p;
        if (viewManager != null) {
            android.widget.ImageView imageView = l1Var.f470986i;
            viewManager.addView(imageView, 0.0d, 0.0d);
            viewManager.setMarkerTag(imageView, "info_window_tag");
        }
        if (!this.F) {
            za3.l1 l1Var2 = this.B;
            l1Var2.getClass();
            double d17 = locationInfo.f144586e;
            l1Var2.f470982e = d17;
            double d18 = locationInfo.f144587f;
            l1Var2.f470983f = d18;
            if (!va3.w.d(d17, d18)) {
                za3.l1 l1Var3 = this.B;
                l1Var3.f470981d = false;
                l1Var3.f470987m.setVisibility(8);
            }
        }
        if (2 == this.f144730f) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ViewMapUI", "location id %s", locationInfo.f144585d);
            if (n().getBooleanExtra("kFavCanRemark", true) && !q()) {
                this.f144733i.f144799a.removeAllViews();
                android.view.View inflate = android.view.View.inflate(activity, com.tencent.mm.R.layout.bsm, null);
                this.f144733i.f144799a.addView(inflate, new android.widget.LinearLayout.LayoutParams(-1, -2));
                this.f144733i.f144807i = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.inq);
                this.f144733i.f144807i.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.location.ui.impl.a$$a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        com.tencent.mm.plugin.location.ui.impl.a aVar = com.tencent.mm.plugin.location.ui.impl.a.this;
                        aVar.getClass();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(view);
                        java.lang.Object[] array = arrayList.toArray();
                        arrayList.clear();
                        yj0.a.b("com/tencent/mm/plugin/location/ui/impl/BaseMapUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", aVar, array);
                        aVar.l();
                        yj0.a.h(aVar, "com/tencent/mm/plugin/location/ui/impl/BaseMapUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    }
                });
                this.f144733i.f144808j = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.inv);
                this.f144733i.f144808j.setOnClickListener(new com.tencent.mm.plugin.location.ui.impl.b(this));
                r();
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(locationInfo.f144589h)) {
                this.f144733i.f144799a.setVisibility(0);
            }
        }
        this.f144734m.put(locationInfo.f144585d, this.B);
        if (com.tencent.mm.sdk.platformtools.t8.K0(locationInfo.f144589h) && com.tencent.mm.sdk.platformtools.t8.K0(locationInfo.f144591m)) {
            z17 = false;
        }
        if (z17) {
            java.lang.String str = this.f144737p;
            if (str != null && !str.equals("")) {
                this.B.f470989o = this.f144737p;
            }
            za3.l1 l1Var4 = this.B;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
            this.B.getClass();
            sb6.append(locationInfo.f144589h);
            l1Var4.setText(sb6.toString());
        } else if (va3.w.d(locationInfo.f144586e, locationInfo.f144587f)) {
            u60.h hVar2 = new u60.h(locationInfo.f144586e, locationInfo.f144587f);
            hVar2.f424873f = locationInfo.f144585d;
            ((i11.g) this.f144735n).b(hVar2, this.f144745x);
        }
        this.B.getClass();
    }

    public void z() {
        com.tencent.mm.plugin.location.model.LocationInfo locationInfo = this.f144731g;
        double d17 = locationInfo.f144586e;
        double d18 = locationInfo.f144587f;
        com.tencent.mm.plugin.location.model.LocationInfo locationInfo2 = this.f144732h;
        double d19 = locationInfo2.f144586e;
        double d27 = locationInfo2.f144587f;
        if (locationInfo2.a()) {
            H();
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12809, 3, "");
        this.K = true;
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.M;
        if (n3Var == null) {
            return;
        }
        java.lang.Runnable runnable = this.N;
        if (runnable != null) {
            n3Var.removeCallbacks(runnable);
        }
        this.M.postDelayed(runnable, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
        android.app.Activity activity = this.f144728d;
        this.L = db5.e1.Q(activity, activity.getString(com.tencent.mm.R.string.f490573yv), this.f144728d.getString(com.tencent.mm.R.string.fry), true, true, new com.tencent.mm.plugin.location.ui.impl.w2(this));
    }
}
