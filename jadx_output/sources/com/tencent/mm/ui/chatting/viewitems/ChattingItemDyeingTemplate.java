package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class ChattingItemDyeingTemplate extends com.tencent.mm.ui.chatting.viewitems.a0 {
    public static final java.lang.String B1;
    public static java.lang.Integer C1;
    public static java.lang.Integer D1;
    public static java.lang.Integer E1;
    public static int F1;
    public static int G1;
    public static final int H1;
    public static final int I1;
    public com.tencent.mm.pluginsdk.ui.span.z0 A;
    public com.tencent.mm.ui.chatting.viewitems.ik A1;
    public com.tencent.mm.pluginsdk.ui.span.z0 B;
    public final com.tencent.mm.sdk.event.IListener C;
    public final yn.l D;
    public final android.view.View.OnClickListener E;
    public final o11.g F;
    public java.lang.String H;
    public java.lang.String I;
    public int K;
    public final e31.k L;
    public final e31.k M;
    public final int V;

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f203175s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f203176t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View.OnClickListener f203177u;

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.viewitems.bk f203178v;

    /* renamed from: w, reason: collision with root package name */
    public final android.view.View.OnClickListener f203179w;

    /* renamed from: x, reason: collision with root package name */
    public final android.view.View.OnClickListener f203180x;

    /* renamed from: y, reason: collision with root package name */
    public final android.view.View.OnClickListener f203183y;

    /* renamed from: y1, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f203185y1;

    /* renamed from: z, reason: collision with root package name */
    public final android.view.View.OnClickListener f203186z;

    /* renamed from: z1, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.viewitems.ek f203187z1;
    public e31.j G = new e31.j(true, false);

    /* renamed from: J, reason: collision with root package name */
    public int f203171J = 0;
    public java.lang.String N = "";
    public int P = -1;
    public java.lang.String Q = "";
    public boolean R = false;
    public boolean S = false;
    public int T = -1;
    public int U = -1;
    public boolean W = false;
    public final j31.c X = new j31.c();
    public java.lang.String Y = null;
    public java.lang.String Z = "";

    /* renamed from: p0, reason: collision with root package name */
    public int f203173p0 = 1;

    /* renamed from: x0, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f203181x0 = null;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f203184y0 = false;

    /* renamed from: l1, reason: collision with root package name */
    public final java.lang.ref.WeakReference f203172l1 = new java.lang.ref.WeakReference(this);

    /* renamed from: p1, reason: collision with root package name */
    public final boolean f203174p1 = te5.s1.f418747a.a();

    /* renamed from: x1, reason: collision with root package name */
    public final boolean f203182x1 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_pay_receipt_msg_table_reddot_open, false);

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate$3, reason: invalid class name */
    /* loaded from: classes9.dex */
    public class AnonymousClass3 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.OnWxaOptionsChangedEvent> {
        public AnonymousClass3(androidx.lifecycle.y yVar) {
            super(yVar);
            this.__eventId = 495598387;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.OnWxaOptionsChangedEvent onWxaOptionsChangedEvent) {
            yb5.d dVar = com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.this.f203175s;
            if (dVar == null) {
                return true;
            }
            dVar.g().runOnUiThread(new com.tencent.mm.ui.chatting.viewitems.xh(this));
            return true;
        }
    }

    static {
        com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fy9);
        com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fy9);
        B1 = "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fy9) + "/mp/infringement?from=8&username=%s&template_id=%s&template_msg_id=%s1&screenshot_localId=%s#wechat_redirect";
        C1 = null;
        D1 = null;
        E1 = null;
        F1 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f478873jj);
        G1 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f478873jj);
        H1 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f479308vo);
        I1 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_1);
    }

    public ChattingItemDyeingTemplate() {
        this.V = 0;
        o11.f fVar = new o11.f();
        fVar.f342096t = true;
        fVar.f342086j = 132;
        fVar.f342087k = 132;
        fVar.f342091o = com.tencent.mm.R.drawable.bgo;
        this.F = fVar.a();
        this.V = i65.a.B(com.tencent.mm.sdk.platformtools.x2.f193071a);
        e31.n nVar = e31.n.f247087a;
        this.L = nVar.a("name_biz");
        this.M = nVar.a("name_wxa");
        this.f203178v = new com.tencent.mm.ui.chatting.viewitems.bk(this, null);
        this.E = new com.tencent.mm.ui.chatting.viewitems.lh(this);
        this.f203179w = new com.tencent.mm.ui.chatting.viewitems.wh(this);
        this.C = new com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.AnonymousClass3(com.tencent.mm.app.a0.f53288d);
        this.D = new com.tencent.mm.ui.chatting.viewitems.yi(this);
        this.f203180x = new com.tencent.mm.ui.chatting.viewitems.lj(this);
        this.f203183y = new com.tencent.mm.ui.chatting.viewitems.sj(this);
        this.f203186z = new com.tencent.mm.ui.chatting.viewitems.tj(this);
    }

    public static int Y0(java.util.Map map) {
        return com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.mmreader.template_header.business_type"), 0);
    }

    public static int Z0(java.lang.String str) {
        int i17;
        if (str == null) {
            str = "-1";
        }
        try {
            i17 = java.lang.Integer.valueOf(str).intValue();
        } catch (java.lang.NumberFormatException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemDyeingTemplate", e17.getMessage());
            i17 = -1;
        }
        return com.tencent.mm.sdk.platformtools.t8.o1(java.lang.Integer.valueOf(i17), -1);
    }

    public static void a(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate, int i17, java.util.Map map, java.lang.String str) {
        chattingItemDyeingTemplate.getClass();
        if (r01.z.n(str) && chattingItemDyeingTemplate.g1(map)) {
            j31.e.b(i17, chattingItemDyeingTemplate.X, Y0(map), te5.v1.f418758b);
        }
    }

    public static int a1(java.util.Map map) {
        return Z0((java.lang.String) map.get(".msg.appmsg.mmreader.template_detail.new_tmpl_type"));
    }

    public static int d0(java.lang.String str) {
        return (str == null || !str.startsWith("SUBSCRIPTION")) ? 1014 : 1107;
    }

    public static void e0(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate, com.tencent.mm.ui.chatting.viewitems.er erVar, java.util.Map map) {
        chattingItemDyeingTemplate.getClass();
        if (map == null || map.size() == 0) {
            return;
        }
        int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.mmreader.template_detail.is_top_msg"), 0);
        java.lang.String str = (java.lang.String) map.get(".msg.appmsg.mmreader.template_detail.top_msg_content");
        if (str == null) {
            str = "";
        }
        chattingItemDyeingTemplate.x0(erVar, P, str);
        if (erVar == null || !com.tencent.mm.storage.c2.f(erVar.c())) {
            return;
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Bj("conv_template_msg", "view_clk", new com.tencent.mm.ui.chatting.viewitems.rj(chattingItemDyeingTemplate, erVar), 12, false);
    }

    public static boolean f0(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate, java.util.Map map) {
        chattingItemDyeingTemplate.getClass();
        return chattingItemDyeingTemplate.h1(a1(map));
    }

    public static void g0(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate, int i17, com.tencent.mm.storage.f9 f9Var) {
        yb5.d dVar = chattingItemDyeingTemplate.f203175s;
        if (dVar == null) {
            return;
        }
        if (((com.tencent.mm.ui.chatting.component.g9) ((sb5.k0) dVar.f460708c.a(sb5.k0.class))).s0()) {
            ((com.tencent.mm.ui.chatting.component.g9) ((sb5.k0) chattingItemDyeingTemplate.f203175s.f460708c.a(sb5.k0.class))).t0(i17, f9Var);
        } else {
            ((com.tencent.mm.ui.chatting.component.n7) ((sb5.g0) chattingItemDyeingTemplate.f203175s.f460708c.a(sb5.g0.class))).v0(i17, f9Var);
        }
    }

    public static void h0(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate, int i17, java.lang.String str, int i18, int i19) {
        if (chattingItemDyeingTemplate.f203184y0) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(21825, java.lang.Integer.valueOf(i17), str, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()), null, chattingItemDyeingTemplate.H, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), 0, java.lang.Integer.valueOf(com.tencent.mm.ui.chatting.viewitems.qg.c(str)), te5.v1.f418758b);
        }
    }

    public static void i0(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate, android.content.Context context, java.lang.String str, long j17) {
        chattingItemDyeingTemplate.getClass();
        if (str == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemDyeingTemplate", "[gotoChattingUIWithPosition] username is null");
            return;
        }
        com.tencent.mm.storage.f9 o27 = j17 > 0 ? ((com.tencent.mm.storage.g9) c01.d9.b().u()).o2(str, j17) : null;
        if (o27 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingItemDyeingTemplate", "[gotoChattingUIWithPosition] msg is null");
        }
        long msgId = o27 == null ? -1L : o27.getMsgId();
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", "[gotoChattingUIWithPosition] msgLocalId:%s", java.lang.Long.valueOf(msgId));
        if (!com.tencent.mm.storage.z3.R4(str)) {
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(str, true);
            if (n17 == null || !n17.r2()) {
                if (n17 == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.ChattingItemDyeingTemplate", "[gotoChattingUIWithPosition] contact is null! username:%s", str);
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.ChattingItemDyeingTemplate", "[gotoChattingUIWithPosition] isContact not ! username:%s", str);
                }
                db5.e1.t(context, context.getString(com.tencent.mm.R.string.hy6), context.getString(com.tencent.mm.R.string.jz9), null);
                return;
            }
        } else if (((com.tencent.mm.storage.b3) c01.d9.b().l()).z0(str) == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingItemDyeingTemplate", "[gotoChattingUIWithPosition] member is null! username:%s", str);
            db5.e1.t(context, context.getString(com.tencent.mm.R.string.hy6), context.getString(com.tencent.mm.R.string.jz9), null);
            return;
        }
        android.content.Intent putExtra = new android.content.Intent().putExtra("Chat_User", str).putExtra("finish_direct", true).putExtra("from_global_search", true).putExtra("need_hight_item", true).putExtra("msg_local_id", msgId);
        putExtra.setClass(context, com.tencent.mm.ui.chatting.ChattingUI.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(putExtra);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "gotoChattingUIWithPosition", "(Landroid/content/Context;Ljava/lang/String;J)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "gotoChattingUIWithPosition", "(Landroid/content/Context;Ljava/lang/String;J)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public static void j0(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate, long j17, long j18, java.lang.String str, int i17, java.lang.String str2) {
        chattingItemDyeingTemplate.getClass();
        ((com.tencent.mm.feature.finder.live.c) ((s40.p0) i95.n0.c(s40.p0.class))).getClass();
        ml2.q1 q1Var = ml2.q1.f327812e;
        ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
        a52.a.d("temp_7");
        ((ml2.j0) i95.n0.c(ml2.j0.class)).pj(j17, j18, null, str, i17, 0L, ml2.x1.f328207n, "temp_7", "", 0, null);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        c50.c1.l9((c50.c1) c17, ml2.i5.f327574i, str, j18, 0, "", str2, 1L, "", "", "", "", "", "", 0L, 0, null, 57344, null);
    }

    public static void k0(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate, java.lang.ref.WeakReference weakReference, android.view.View view, com.tencent.mm.storage.f9 f9Var, java.util.Map map, java.lang.String str) {
        chattingItemDyeingTemplate.getClass();
        com.tencent.mm.autogen.mmdata.rpt.BrandTmplExposeReportStruct brandTmplExposeReportStruct = new com.tencent.mm.autogen.mmdata.rpt.BrandTmplExposeReportStruct();
        brandTmplExposeReportStruct.f55457d = 2L;
        brandTmplExposeReportStruct.f55458e = java.lang.System.currentTimeMillis();
        brandTmplExposeReportStruct.f55459f = brandTmplExposeReportStruct.b(dm.i4.COL_USERNAME, str, true);
        brandTmplExposeReportStruct.f55460g = brandTmplExposeReportStruct.b("templateId", chattingItemDyeingTemplate.H, true);
        brandTmplExposeReportStruct.f55461h = brandTmplExposeReportStruct.b("templateTitle", chattingItemDyeingTemplate.N, true);
        brandTmplExposeReportStruct.f55462i = brandTmplExposeReportStruct.b("templateContent", chattingItemDyeingTemplate.X.f297374f, true);
        brandTmplExposeReportStruct.f55464k = brandTmplExposeReportStruct.b("objectType", com.tencent.mm.ui.chatting.viewitems.qg.b(str), true);
        brandTmplExposeReportStruct.k();
        chattingItemDyeingTemplate.s1(5, f9Var.Q0(), str);
        tb5.o0.c(chattingItemDyeingTemplate.f203175s, f9Var, map, 5);
        c01.d9.e().a(1198, new com.tencent.mm.ui.chatting.viewitems.kh(chattingItemDyeingTemplate, view, f9Var, map, weakReference));
        k01.n0 n0Var = (k01.n0) i95.n0.c(k01.n0.class);
        java.lang.String j17 = f9Var.j();
        ((k01.a) n0Var).getClass();
        k01.b1 b1Var = new k01.b1(j17);
        com.tencent.mm.ui.widget.dialog.u3 u3Var = chattingItemDyeingTemplate.f203176t;
        if (u3Var != null && u3Var.isShowing()) {
            chattingItemDyeingTemplate.f203176t.dismiss();
        }
        chattingItemDyeingTemplate.f203176t = db5.e1.Q(view.getContext(), view.getResources().getString(com.tencent.mm.R.string.f490573yv), view.getResources().getString(com.tencent.mm.R.string.f490604zq), true, true, new com.tencent.mm.ui.chatting.viewitems.mh(chattingItemDyeingTemplate, b1Var));
        c01.d9.e().g(b1Var);
    }

    public static boolean l0(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate) {
        chattingItemDyeingTemplate.getClass();
        int n17 = gm0.j1.d().n();
        boolean z17 = n17 == 6 || n17 == 4;
        if (!z17) {
            dp.a.makeText(chattingItemDyeingTemplate.f203175s.g(), chattingItemDyeingTemplate.f203175s.s().getString(com.tencent.mm.R.string.f490500wu), 0).show();
        }
        return z17;
    }

    public static int l1(java.util.Map map, java.lang.String str, int i17) {
        java.lang.String str2;
        if (map == null || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return i17;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) map.get(str))) {
            try {
                str2 = (java.lang.String) map.get(str);
                if (str2 == null) {
                    str2 = "";
                }
            } catch (java.lang.Exception unused) {
                return i17;
            }
        }
        return android.graphics.Color.parseColor(str2);
    }

    public static void m0(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate, java.util.Map map, boolean z17, boolean z18, com.tencent.mm.ui.chatting.viewitems.as asVar, java.lang.String str, boolean z19) {
        chattingItemDyeingTemplate.getClass();
        int Z0 = Z0((java.lang.String) map.get(".msg.appmsg.mmreader.template_detail.new_tmpl_type"));
        db5.t7.m(chattingItemDyeingTemplate.f203175s.g(), z17 ? chattingItemDyeingTemplate.f203175s.s().getString(com.tencent.mm.R.string.hdh) : chattingItemDyeingTemplate.f203175s.s().getString(com.tencent.mm.R.string.hde));
        e31.k kVar = z19 ? chattingItemDyeingTemplate.M : chattingItemDyeingTemplate.L;
        if (com.tencent.mm.sdk.platformtools.t8.K0(chattingItemDyeingTemplate.Z) && Z0 != 7) {
            chattingItemDyeingTemplate.v1(asVar, z17 ? 0 : 8, map);
            e31.j jVar = chattingItemDyeingTemplate.G;
            boolean z27 = !z17;
            jVar.f247075a = z27;
            com.tencent.mm.msgsubscription.SubscribeMsgTmpItem subscribeMsgTmpItem = new com.tencent.mm.msgsubscription.SubscribeMsgTmpItem(chattingItemDyeingTemplate.H, Z0, z27 ? 1 : 0, z18);
            e31.j jVar2 = chattingItemDyeingTemplate.G;
            subscribeMsgTmpItem.f71815u = jVar2.f247078d;
            subscribeMsgTmpItem.f71814t = jVar2.f247077c;
            subscribeMsgTmpItem.f71817w = jVar2.f247079e;
            subscribeMsgTmpItem.f71818x = jVar2.f247080f && !z17;
            subscribeMsgTmpItem.f71819y = Y0(map);
            e31.j jVar3 = chattingItemDyeingTemplate.G;
            subscribeMsgTmpItem.B = jVar3.f247081g;
            subscribeMsgTmpItem.C = jVar3.f247082h;
            subscribeMsgTmpItem.A = jVar3.f247085k;
            kVar.h(str, subscribeMsgTmpItem, new com.tencent.mm.ui.chatting.viewitems.pi(chattingItemDyeingTemplate));
            return;
        }
        java.lang.String subId = chattingItemDyeingTemplate.Z;
        int i17 = !z17 ? 1 : 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", "setServiceVoipSubIdStatus subId: %s, status: %d", subId, java.lang.Integer.valueOf(i17));
        if (!com.tencent.mm.sdk.platformtools.t8.K0(subId)) {
            com.tencent.mm.plugin.appbrand.service.p5 p5Var = (com.tencent.mm.plugin.appbrand.service.p5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.p5.class);
            com.tencent.mm.ui.chatting.viewitems.wi wiVar = new com.tencent.mm.ui.chatting.viewitems.wi(chattingItemDyeingTemplate);
            ((gi1.a) p5Var).getClass();
            java.util.HashMap hashMap = gi1.n.f272248a;
            if (com.tencent.mm.sdk.platformtools.t8.K0(subId)) {
                wiVar.a(subId, -1, false);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoiceServiceVoipCallSubIdStatusCache", "setVoipCallSubIdStatus: subId = " + subId + ", status = " + i17);
                kotlin.jvm.internal.o.g(subId, "subId");
                com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
                r45.ve7 ve7Var = new r45.ve7();
                ve7Var.f388179d = subId;
                ve7Var.f388180e = i17;
                lVar.f70664a = ve7Var;
                lVar.f70665b = new r45.we7();
                lVar.f70666c = "/cgi-bin/mmbiz-bin/wxaruntime/setvoipcallsubidstatus";
                lVar.f70667d = 29288;
                com.tencent.mm.modelbase.z2.d(lVar.a(), new gi1.e(wiVar, subId, i17), true);
            }
        }
        chattingItemDyeingTemplate.v1(asVar, 8, map);
    }

    public static void n0(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate, boolean z17, java.lang.String str, com.tencent.mm.ui.chatting.viewitems.as asVar) {
        db5.e1.C(chattingItemDyeingTemplate.f203175s.g(), z17 ? chattingItemDyeingTemplate.f203175s.g().getString(com.tencent.mm.R.string.hcb) : chattingItemDyeingTemplate.f203175s.g().getString(com.tencent.mm.R.string.hdb), z17 ? chattingItemDyeingTemplate.f203175s.g().getString(com.tencent.mm.R.string.hcc) : chattingItemDyeingTemplate.f203175s.g().getString(com.tencent.mm.R.string.hdc), chattingItemDyeingTemplate.f203175s.g().getString(com.tencent.mm.R.string.hdf), chattingItemDyeingTemplate.f203175s.g().getString(com.tencent.mm.R.string.f490347sg), true, new com.tencent.mm.ui.chatting.viewitems.li(chattingItemDyeingTemplate, str, z17), null).setCanceledOnTouchOutside(false);
    }

    public static void o0(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate, java.util.Map map, e31.j jVar, java.lang.String str, boolean z17) {
        chattingItemDyeingTemplate.getClass();
        int Z0 = Z0((java.lang.String) map.get(".msg.appmsg.mmreader.template_detail.new_tmpl_type"));
        java.lang.String str2 = chattingItemDyeingTemplate.H;
        boolean z18 = jVar.f247075a;
        com.tencent.mm.msgsubscription.SubscribeMsgTmpItem subscribeMsgTmpItem = new com.tencent.mm.msgsubscription.SubscribeMsgTmpItem(str2, Z0, z18 ? 1 : 0, jVar.f247076b);
        subscribeMsgTmpItem.f71814t = jVar.f247077c;
        subscribeMsgTmpItem.f71817w = jVar.f247079e;
        subscribeMsgTmpItem.B = jVar.f247081g;
        subscribeMsgTmpItem.f71808n = jVar.f247076b;
        subscribeMsgTmpItem.f71815u = jVar.f247078d;
        subscribeMsgTmpItem.f71818x = jVar.f247080f;
        subscribeMsgTmpItem.C = z17;
        subscribeMsgTmpItem.f71819y = Y0(map);
        chattingItemDyeingTemplate.L.h(str, subscribeMsgTmpItem, new com.tencent.mm.ui.chatting.viewitems.ih(chattingItemDyeingTemplate));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void p0(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate r10, com.tencent.mm.ui.chatting.viewitems.vq r11, com.tencent.mm.ui.chatting.viewitems.er r12, int r13) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.p0(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate, com.tencent.mm.ui.chatting.viewitems.vq, com.tencent.mm.ui.chatting.viewitems.er, int):void");
    }

    public static void r0(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate, com.tencent.mm.ui.chatting.viewitems.xq xqVar, java.util.Map map, rd5.d dVar, java.lang.String str) {
        chattingItemDyeingTemplate.getClass();
        java.lang.Object tag = xqVar.f206013i.getTag();
        chattingItemDyeingTemplate.L0(xqVar, map, dVar, str, tag instanceof com.tencent.mm.ui.chatting.viewitems.er ? ((com.tencent.mm.ui.chatting.viewitems.er) tag).f203908d : null);
    }

    public final void A0(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        try {
            ((r10.q) ((pq.q) i95.n0.c(pq.q.class))).Ri(new pq.a(this.f203175s.g()), str, null, null);
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", "ecsPreloadIfNeeded[%s], jumpInfoBase64Str len=%d", str2, java.lang.Integer.valueOf(str.length()));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemDyeingTemplate", "ecsPreloadIfNeeded[%s] error: %s", str2, th6);
        }
    }

    public final void A1(com.tencent.mm.ui.chatting.viewitems.as asVar, java.util.Map map) {
        java.lang.String str;
        int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.mmreader.template_detail.pay_recepit_detail_op_type"), -1);
        final java.lang.String str2 = (java.lang.String) map.get(".msg.appmsg.mmreader.template_detail.pay_recepit_detail.weapp_username");
        str = "";
        if (P == 7) {
            try {
                java.lang.String str3 = (java.lang.String) map.get(".msg.appmsg.mmreader.template_detail.pay_recepit_detail_general_string");
                if (str3 != null) {
                    str = str3;
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    return;
                }
                y1(asVar.Z, new cl0.g(str));
                return;
            } catch (cl0.f e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChattingItemDyeingTemplate", e17, "pay_recepit_detail_general_string json parse failed", new java.lang.Object[0]);
                return;
            }
        }
        if (P != 1 || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            java.lang.String str4 = (java.lang.String) map.get(".msg.appmsg.mmreader.template_detail.pay_recepit_detail_url");
            str = str4 != null ? str4 : "";
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                return;
            }
            asVar.Z.setOnClickListener(new com.tencent.mm.ui.chatting.viewitems.th(this, str));
            return;
        }
        java.lang.String str5 = (java.lang.String) map.get(".msg.appmsg.mmreader.template_detail.pay_recepit_detail.weapp_path");
        if (str5 == null) {
            str5 = "";
        }
        final int P2 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.mmreader.template_detail.pay_recepit_detail.weapp_version"), 0);
        final int P3 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.mmreader.template_detail.pay_recepit_detail.weapp_state"), 0);
        java.lang.String str6 = (java.lang.String) map.get(".msg.appmsg.template_id");
        com.tencent.mm.ui.chatting.viewitems.es esVar = new com.tencent.mm.ui.chatting.viewitems.es(str2, str5, P3, P2, str6 == null ? "" : str6, this.f203175s);
        android.view.ViewGroup viewGroup = asVar.Z;
        final java.lang.String str7 = str5;
        yz5.p pVar = new yz5.p() { // from class: com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate$$e
            @Override // yz5.p
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.this.i1((java.lang.String) obj, str2, P3, P2, str7, (com.tencent.mm.plugin.appbrand.report.AppBrandStatObject) obj2);
                return null;
            }
        };
        if (viewGroup != null) {
            viewGroup.setOnClickListener(new com.tencent.mm.ui.chatting.viewitems.zq(esVar, pVar));
        }
    }

    public final void B0(com.tencent.mm.ui.chatting.viewitems.as asVar, java.util.Map map) {
        if (asVar.f203413d.getVisibility() != 0) {
            return;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.mmreader.template_header.show_header_background_img"), 0) == 1;
        java.lang.String str = (java.lang.String) map.get(".msg.appmsg.mmreader.template_header.header_background_img_url");
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = (java.lang.String) map.get(".msg.appmsg.mmreader.template_header.header_background_img_url_darkmode");
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = (java.lang.String) map.get(".msg.appmsg.mmreader.template_header.header_background_color");
        if (str3 == null) {
            str3 = "";
        }
        java.lang.String str4 = (java.lang.String) map.get(".msg.appmsg.mmreader.template_header.header_background_color_darkmode");
        java.lang.String str5 = str4 != null ? str4 : "";
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", "[fillHeaderVBackground] isShowHeaderBackground: %s headerBackgroundUrl：%s backgroundColor：%s", java.lang.Boolean.valueOf(z17), str, str3);
        if (!z17) {
            u1(asVar.f203415e);
            asVar.f203413d.setBackground(null);
            return;
        }
        int Di = ((pg0.s3) ((qg0.h0) i95.n0.c(qg0.h0.class))).Di(str3, str5);
        if (Di != -1) {
            android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setColor(Di);
            float b17 = i65.a.b(this.f203175s.g(), 8);
            gradientDrawable.setCornerRadii(new float[]{b17, b17, b17, b17, 0.0f, 0.0f, 0.0f, 0.0f});
            asVar.f203413d.setBackground(gradientDrawable);
            asVar.f203417f.setBackgroundResource(com.tencent.mm.R.drawable.f481981ap3);
        } else {
            asVar.f203413d.setBackground(null);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            u1(asVar.f203415e);
            return;
        }
        if (com.tencent.mm.ui.bk.C() && !com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            str = str2;
        }
        asVar.f203417f.post(new com.tencent.mm.ui.chatting.viewitems.oj(this, asVar, str));
    }

    public final void B1(android.view.View view, cl0.g gVar) {
        cl0.g gVar2 = null;
        if (gVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemDyeingTemplate", "jump to search, json data is null");
            view.setOnClickListener(null);
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(gVar.optString("query"))) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemDyeingTemplate", "can't parse query params object");
            view.setOnClickListener(null);
            return;
        }
        int optInt = gVar.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 162);
        ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).getClass();
        java.lang.String l17 = o13.n.l(optInt);
        final su4.j2 j2Var = new su4.j2();
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        j2Var.f412938a = context;
        j2Var.f412952o = i65.a.d(context, com.tencent.mm.R.color.aaw);
        j2Var.f412939b = optInt;
        j2Var.f412940c = gVar.optInt("biz_type");
        j2Var.f412941d = gVar.optString("query");
        j2Var.f412954q = gVar.optString("nav_bar_title");
        j2Var.f412942e = l17;
        j2Var.f412943f = gVar.optBoolean("is_home_page");
        j2Var.f412946i = gVar.optBoolean("hide_search_bar");
        try {
            java.lang.String optString = gVar.optString("ext_params");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                gVar2 = new cl0.g(optString);
            }
        } catch (cl0.f e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChattingItemDyeingTemplate", e17, "ext_params json parse failed", new java.lang.Object[0]);
        }
        if (gVar2 != null) {
            java.util.Iterator keys = gVar2.keys();
            while (keys.hasNext()) {
                java.lang.String str = (java.lang.String) keys.next();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    j2Var.f412944g.put(str, gVar2.optString(str));
                }
            }
        }
        j2Var.f412944g.put("thirdExtParam", gVar.optString("third_ext_param"));
        view.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate$$f
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate = com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.this;
                chattingItemDyeingTemplate.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                su4.j2 j2Var2 = j2Var;
                arrayList.add(j2Var2);
                arrayList.add(view2);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", chattingItemDyeingTemplate, array);
                ((com.tencent.mm.plugin.websearch.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Vi(j2Var2);
                chattingItemDyeingTemplate.s1(3, chattingItemDyeingTemplate.f203175s.x(), "");
                yj0.a.h(chattingItemDyeingTemplate, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean C() {
        return this.K == 0;
    }

    public final void C0(com.tencent.mm.ui.chatting.viewitems.g0 g0Var, yb5.d dVar, com.tencent.mm.storage.f9 f9Var, java.lang.String str) {
        l(g0Var, dVar, ((com.tencent.mm.ui.chatting.component.p0) ((sb5.j) dVar.f460708c.a(sb5.j.class))).m0(f9Var), str);
    }

    public final void C1(com.tencent.mm.ui.chatting.viewitems.as asVar, int i17) {
        asVar.f203425j.setVisibility(i17);
        if (i17 == 0) {
            asVar.f203425j.setText(com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.hct));
        } else if (!this.G.f247080f) {
            asVar.f203425j.setText("");
        } else {
            asVar.f203425j.setVisibility(0);
            asVar.f203425j.setText(com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.oay));
        }
    }

    public final void D0(com.tencent.mm.ui.chatting.viewitems.as asVar, java.lang.String str, java.lang.String str2, java.util.Map map, rd5.d dVar, boolean z17) {
        android.widget.TextView textView = asVar.f203423i;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.app.Activity g17 = this.f203175s.g();
        float textSize = asVar.f203423i.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(g17, str2, textSize));
        n11.a b17 = n11.a.b();
        android.widget.ImageView imageView = asVar.f203419g;
        o11.g gVar = this.F;
        b17.h(str, imageView, gVar);
        asVar.f203419g.setTag(null);
        asVar.f203419g.setOnClickListener(null);
        asVar.f203417f.setTag(null);
        asVar.f203417f.setOnClickListener(null);
        android.view.View view = asVar.f203417f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingAvatarAndName", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingAvatarAndName", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = asVar.f203413d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingAvatarAndName", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingAvatarAndName", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.mmreader.template_header.header_jump_type"), -1);
        android.view.View.OnClickListener onClickListener = this.E;
        if (P == -1 || P == 0) {
            java.lang.String str3 = (java.lang.String) map.get(".msg.appmsg.mmreader.template_header.weapp_username");
            if (str3 == null) {
                str3 = "";
            }
            java.lang.String str4 = (java.lang.String) map.get(".msg.appmsg.mmreader.template_header.header_jump_url");
            if (str4 == null) {
                str4 = "";
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(str3) && com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                asVar.f203417f.setTag(null);
                asVar.f203417f.setOnClickListener(null);
            } else {
                java.lang.String str5 = (java.lang.String) map.get(".msg.fromusername");
                if (str5 == null) {
                    str5 = "";
                }
                asVar.f203417f.setTag(new com.tencent.mm.ui.chatting.viewitems.er(dVar, str5));
                asVar.f203417f.setOnClickListener(onClickListener);
            }
        } else if (P == 1 || P == 2) {
            java.lang.String str6 = (java.lang.String) map.get(".msg.fromusername");
            if (str6 == null) {
                str6 = "";
            }
            asVar.f203417f.setTag(new com.tencent.mm.ui.chatting.viewitems.er(dVar, str6));
            asVar.f203417f.setOnClickListener(onClickListener);
        } else if (P == 3) {
            java.lang.String str7 = (java.lang.String) map.get(".msg.appmsg.mmreader.template_header.finder_user_name");
            if (str7 == null) {
                str7 = "";
            }
            asVar.f203417f.setTag(new com.tencent.mm.ui.chatting.viewitems.er(dVar, str7));
            asVar.f203417f.setOnClickListener(new com.tencent.mm.ui.chatting.viewitems.vh(this, str7, map));
        } else {
            asVar.f203417f.setTag(null);
            asVar.f203417f.setOnClickListener(null);
        }
        java.lang.String str8 = (java.lang.String) map.get(".msg.appmsg.mmreader.template_header.shortcut_icon_url");
        java.lang.String str9 = str8 != null ? str8 : "";
        if (!z17 || com.tencent.mm.sdk.platformtools.t8.K0(str9)) {
            android.view.View view3 = (android.view.View) asVar.f203427k.getParent();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingAvatarAndName", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingAvatarAndName", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view4 = (android.view.View) asVar.f203427k.getParent();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingAvatarAndName", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingAvatarAndName", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        n11.a.b().h(str9, asVar.f203427k, gVar);
    }

    public final boolean D1(int i17) {
        return i17 == 0 || i17 == 1 || i17 == 3 || i17 == 13;
    }

    public void E0(android.widget.ImageView imageView, yb5.d dVar, java.lang.String str, rd5.d dVar2, java.lang.String str2, java.util.Map map) {
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        if (imageView == null) {
            return;
        }
        if (c01.e2.D(str)) {
            imageView.setVisibility(8);
            return;
        }
        imageView.setVisibility(0);
        if (((com.tencent.mm.plugin.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Bi(str)) {
            n11.a.b().h(str2, imageView, this.F);
            imageView.setTag(new com.tencent.mm.ui.chatting.viewitems.er(dVar2, str));
            imageView.setOnClickListener(this.f203179w);
        } else {
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ni(imageView, str);
            com.tencent.mm.ui.chatting.viewitems.er erVar = new com.tencent.mm.ui.chatting.viewitems.er(str, dVar.D() ? dVar.x() : null);
            if (((com.tencent.mm.ui.chatting.component.h0) ((sb5.g) dVar.f460708c.a(sb5.g.class))).n0()) {
                erVar.f203905a = dVar2;
            }
            imageView.setTag(erVar);
            if (com.tencent.mm.sdk.platformtools.t8.y((java.lang.String) map.get(".msg.appmsg.mmreader.template_detail.template_ext.block"), false)) {
                imageView.setOnClickListener(null);
            } else {
                imageView.setOnClickListener(new com.tencent.mm.ui.chatting.viewitems.oh(this, dVar, str, f9Var, map));
            }
        }
        if (this.f203228i == null) {
            this.f203228i = new com.tencent.mm.ui.chatting.a6(dVar);
        }
        imageView.setOnLongClickListener(this.f203228i);
    }

    public final boolean E1(int i17) {
        return i17 == 3 || i17 == 4 || i17 == 5 || i17 == 10 || i17 == 12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0006, code lost:
    
        if (r0 == null) goto L5;
     */
    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View F(android.view.LayoutInflater r8, android.view.View r9) {
        /*
            r7 = this;
            if (r9 == 0) goto L8
            java.lang.Object r0 = r9.getTag()
            if (r0 != 0) goto Lac
        L8:
            com.tencent.mm.ui.chatting.viewitems.xg r9 = new com.tencent.mm.ui.chatting.viewitems.xg
            int r0 = r7.X0()
            r9.<init>(r8, r0)
            boolean r8 = r7.f203174p1
            if (r8 == 0) goto L9c
            android.content.Context r8 = r9.getContext()
            r0 = 2131300164(0x7f090f44, float:1.821835E38)
            android.view.View r0 = r9.findViewById(r0)
            r1 = 3
            r2 = 2131300473(0x7f091079, float:1.8218977E38)
            if (r0 == 0) goto L37
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            boolean r4 = r3 instanceof android.widget.RelativeLayout.LayoutParams
            if (r4 == 0) goto L37
            r4 = r3
            android.widget.RelativeLayout$LayoutParams r4 = (android.widget.RelativeLayout.LayoutParams) r4
            r4.addRule(r1, r2)
            r0.setLayoutParams(r3)
        L37:
            com.tencent.mm.ui.chatting.view.ServiceNotifyHeaderView r0 = new com.tencent.mm.ui.chatting.view.ServiceNotifyHeaderView
            r3 = 0
            r4 = 2131820873(0x7f110149, float:1.9274473E38)
            r0.<init>(r8, r3, r4)
            r0.setId(r2)
            r2 = 8
            r0.setVisibility(r2)
            android.widget.RelativeLayout$LayoutParams r2 = new android.widget.RelativeLayout$LayoutParams
            r3 = 2131165508(0x7f070144, float:1.7945235E38)
            int r3 = i65.a.h(r8, r3)
            r4 = -1
            r2.<init>(r4, r3)
            r3 = 2131300478(0x7f09107e, float:1.8218987E38)
            r2.addRule(r1, r3)
            android.content.res.Resources r1 = r8.getResources()
            r3 = 2131165487(0x7f07012f, float:1.7945193E38)
            int r1 = r1.getDimensionPixelSize(r3)
            android.content.res.Resources r4 = r8.getResources()
            int r3 = r4.getDimensionPixelSize(r3)
            r4 = 0
            r2.setMargins(r1, r4, r3, r4)
            android.content.res.Resources r1 = r8.getResources()
            r3 = 2131165465(0x7f070119, float:1.7945148E38)
            int r1 = r1.getDimensionPixelSize(r3)
            android.content.res.Resources r5 = r8.getResources()
            r6 = 2131165390(0x7f0700ce, float:1.7944996E38)
            int r5 = r5.getDimensionPixelSize(r6)
            android.content.res.Resources r8 = r8.getResources()
            int r8 = r8.getDimensionPixelSize(r3)
            r0.setPadding(r1, r5, r8, r4)
            r8 = 16
            r0.setGravity(r8)
            r9.addView(r0, r2)
            goto La1
        L9c:
            com.tencent.mm.ui.chatting.viewitems.sm r8 = new com.tencent.mm.ui.chatting.viewitems.sm
            r8.<init>(r9)
        La1:
            com.tencent.mm.ui.chatting.viewitems.vq r8 = new com.tencent.mm.ui.chatting.viewitems.vq
            r8.<init>()
            r8.a(r9)
            r9.setTag(r8)
        Lac:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.F(android.view.LayoutInflater, android.view.View):android.view.View");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x07be  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0850  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x086d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x094c  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0724  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0747  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F0(com.tencent.mm.ui.chatting.viewitems.as r47, rd5.d r48, java.util.Map r49) {
        /*
            Method dump skipped, instructions count: 2416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.F0(com.tencent.mm.ui.chatting.viewitems.as, rd5.d, java.util.Map):void");
    }

    public final int F1(int i17) {
        int i18 = 1;
        if (i17 != 1) {
            i18 = 2;
            if (i17 != 2) {
                return 0;
            }
        }
        return i18;
    }

    public final void G0(com.tencent.mm.ui.chatting.viewitems.as asVar, java.util.Map map, int i17) {
        if (com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.mmreader.template_header.show_finder_feed_entry"), 0) == 1) {
            java.lang.String str = (java.lang.String) map.get(".msg.appmsg.mmreader.template_header.finder_feed_thumnail");
            if (str == null) {
                str = "";
            }
            int b17 = com.tencent.mm.ui.bk.h(this.f203175s.g()).x - i65.a.b(this.f203175s.g(), 64);
            int i18 = (int) (b17 / 1.7525f);
            android.view.ViewGroup.LayoutParams layoutParams = asVar.f203409b.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = b17;
                layoutParams.height = i18;
                asVar.f203409b.setLayoutParams(layoutParams);
            }
            j1(asVar.f203409b, str, b17, i18);
            asVar.f203409b.setVisibility(0);
            asVar.f203409b.setOnClickListener(new com.tencent.mm.ui.chatting.viewitems.xi(this, map));
            if (fp.h.c(23)) {
                asVar.f203409b.setForeground(this.f203175s.g().getDrawable(com.tencent.mm.R.drawable.f481363rh));
            }
            asVar.f203411c.setVisibility(0);
        } else {
            asVar.f203409b.setImageBitmap(null);
            asVar.f203411c.setVisibility(8);
        }
        java.lang.String str2 = (java.lang.String) map.get(".msg.appmsg.mmreader.template_header.first_data");
        asVar.f203438u.setText(str2 != null ? str2 : "");
    }

    public final void H0(com.tencent.mm.ui.chatting.viewitems.as asVar, java.util.Map map) {
        java.lang.String f27;
        java.lang.String str;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", "[fillingCustomView]");
        asVar.C.setVisibility(8);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) asVar.C.getParent();
        android.view.View findViewById = viewGroup.findViewById(com.tencent.mm.R.id.cpm);
        if (findViewById == null) {
            findViewById = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.cdy, (android.view.ViewGroup) null);
            com.tencent.mm.ui.chatting.viewitems.uq uqVar = new com.tencent.mm.ui.chatting.viewitems.uq();
            uqVar.f205729d = (android.widget.ImageView) findViewById.findViewById(com.tencent.mm.R.id.a9m);
            uqVar.f205728c = (android.widget.TextView) findViewById.findViewById(com.tencent.mm.R.id.kbf);
            uqVar.f205727b = (android.widget.TextView) findViewById.findViewById(com.tencent.mm.R.id.o7i);
            uqVar.f205726a = (android.widget.TextView) findViewById.findViewById(com.tencent.mm.R.id.obc);
            findViewById.setTag(uqVar);
            viewGroup.addView(findViewById);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingCustomView", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingCustomView", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.ui.chatting.viewitems.uq uqVar2 = (com.tencent.mm.ui.chatting.viewitems.uq) findViewById.getTag();
        java.lang.String str2 = (java.lang.String) map.get(".msg.appmsg.mmreader.category.item.schedule_content");
        java.lang.String str3 = (java.lang.String) map.get(".msg.appmsg.mmreader.category.item.schedule_username");
        java.lang.String str4 = (java.lang.String) map.get(".msg.appmsg.mmreader.category.item.schedule_nickname");
        java.lang.String str5 = (java.lang.String) map.get(".msg.appmsg.mmreader.category.item.schedule_time");
        int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.mmreader.category.item.schedule_remindsubtype"), -1);
        android.widget.TextView textView = uqVar2.f205726a;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = uqVar2.f205726a.getContext();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, str2));
        android.widget.TextView textView2 = uqVar2.f205728c;
        le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context2 = uqVar2.f205726a.getContext();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            str = "";
        } else {
            if (com.tencent.mm.storage.z3.R4(str3)) {
                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(str3, true);
                f27 = n17 != null ? com.tencent.mm.sdk.platformtools.t8.K0(n17.w0()) ? n17.P0() : n17.w0() : null;
            } else {
                com.tencent.mm.storage.z3 n18 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(str3, true);
                f27 = n18.g2() == null ? n18.f2() : n18.g2();
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(f27)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", "[getDisplayName] username:%s nickname:%s", str3, str4);
                if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                    str4 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.b5v);
                }
                str = str4;
            } else {
                str = f27;
            }
        }
        ((ke0.e) xVar2).getClass();
        textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context2, str));
        uqVar2.f205727b.setText(str5);
        if (P == 2) {
            uqVar2.f205729d.setImageDrawable(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDrawable(com.tencent.mm.R.drawable.f480769bv3));
        } else {
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(uqVar2.f205729d, str3, null);
        }
    }

    public final void I0(com.tencent.mm.ui.chatting.viewitems.xq xqVar, java.util.Map map, com.tencent.mm.storage.f9 f9Var) {
        if (f9Var.B2()) {
            int b17 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 12);
            int b18 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 5);
            ((android.view.ViewGroup) xqVar.f206006b.getParent()).setPadding(0, 0, 0, 0);
            xqVar.f206006b.setPadding(0, 0, 0, 0);
            ((android.view.ViewGroup) xqVar.f206008d.f203407a.getParent()).setPadding(0, 0, 0, 0);
            ((android.view.ViewGroup) xqVar.f206008d.Y.getParent()).setPadding(b17, b17, b17, b17);
            xqVar.f206008d.f203407a.setBackground(i65.a.i(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.drawable.f481145lu));
            xqVar.f206008d.f203407a.setForeground(i65.a.i(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.drawable.f481145lu));
            xqVar.f206008d.f203407a.setPadding(b18, 0, 0, 0);
            xqVar.f206008d.f203439v.setPadding(0, 0, 0, 0);
            xqVar.f206008d.C.setPadding(0, 0, 0, 0);
            com.tencent.mm.ui.chatting.viewitems.as asVar = xqVar.f206008d;
            o11.f fVar = new o11.f();
            fVar.f342078b = true;
            fVar.f342095s = true;
            n11.a.b().h((java.lang.String) map.get(".msg.appmsg.mmreader.template_header.ecs_kf_template_msg_order_info.img_url"), asVar.f203422h0, fVar.a());
            asVar.f203420g0.setVisibility(0);
            android.widget.TextView textView = asVar.f203424i0;
            java.lang.String str = (java.lang.String) map.get(".msg.appmsg.mmreader.template_header.ecs_kf_template_msg_order_info.title_prefix");
            if (str == null) {
                str = "";
            }
            textView.setText(str);
            android.widget.TextView textView2 = asVar.f203426j0;
            java.lang.String str2 = (java.lang.String) map.get(".msg.appmsg.mmreader.template_header.ecs_kf_template_msg_order_info.title_suffix");
            if (str2 == null) {
                str2 = "";
            }
            textView2.setText(str2);
            android.widget.TextView textView3 = asVar.f203428k0;
            java.lang.String str3 = (java.lang.String) map.get(".msg.appmsg.mmreader.template_header.ecs_kf_template_msg_order_info.des");
            textView3.setText(str3 != null ? str3 : "");
        }
    }

    public final void J0(com.tencent.mm.ui.chatting.viewitems.xq xqVar, java.util.Map map, rd5.d dVar, java.lang.String str) {
        if (!(com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.mmreader.template_detail.msg_control_info.need_fold"), 0) == 1)) {
            xqVar.f206010f.f203748b.setText((java.lang.CharSequence) null);
            android.view.View view = xqVar.f206010f.f203747a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingFoldItemStyle", "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingItemHolder;Ljava/util/Map;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingFoldItemStyle", "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingItemHolder;Ljava/util/Map;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.lang.String str2 = (java.lang.String) map.get(".msg.appmsg.mmreader.template_detail.msg_control_info.fold_wording");
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = (java.lang.String) map.get(".msg.appmsg.mmreader.template_detail.msg_control_info.fold_action_wording");
        java.lang.String str4 = str3 != null ? str3 : "";
        java.lang.String format = java.lang.String.format("%s%s", str2, str4);
        android.text.SpannableString spannableString = new android.text.SpannableString(format);
        int indexOf = format.indexOf(str4);
        int length = str4.length() + indexOf;
        xqVar.f206010f.f203748b.setTag(new com.tencent.mm.ui.chatting.viewitems.er(dVar, str));
        this.B = new com.tencent.mm.ui.chatting.viewitems.zg(this, H1, I1, xqVar);
        com.tencent.mm.ui.chatting.viewitems.cr crVar = xqVar.f206010f;
        crVar.f203748b.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0(this.f203175s.g()));
        spannableString.setSpan(this.B, indexOf, length, 17);
        crVar.f203748b.setText(spannableString);
        android.view.View view2 = crVar.f203747a;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingFoldItemStyle", "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingItemHolder;Ljava/util/Map;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingFoldItemStyle", "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingItemHolder;Ljava/util/Map;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (xqVar.timeTV.getVisibility() == 0) {
            android.view.View view3 = crVar.f203747a;
            view3.setPadding(view3.getPaddingLeft(), 0, crVar.f203747a.getPaddingRight(), 0);
        } else {
            android.view.View view4 = crVar.f203747a;
            view4.setPadding(view4.getPaddingLeft(), D1.intValue(), crVar.f203747a.getPaddingRight(), D1.intValue());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        if (r5 == null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K0(com.tencent.mm.ui.chatting.viewitems.vq r24, java.util.Map r25, rd5.d r26, com.tencent.mm.ui.chatting.adapter.q r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 777
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.K0(com.tencent.mm.ui.chatting.viewitems.vq, java.util.Map, rd5.d, com.tencent.mm.ui.chatting.adapter.q, int, int):void");
    }

    public final void L0(com.tencent.mm.ui.chatting.viewitems.xq xqVar, java.util.Map map, rd5.d dVar, java.lang.String str, com.tencent.mm.ui.chatting.adapter.q qVar) {
        com.tencent.mm.storage.f9 f9Var = dVar.f394254d.f445300b;
        if (!(com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.mmreader.template_detail.msg_control_info.need_footer"), 0) == 1) || !(true ^ (xqVar.f206008d.f203407a.getVisibility() == 0 && (xqVar.f206008d.f203436s.getVisibility() == 0 || xqVar.f206008d.f203425j.getVisibility() == 0)))) {
            xqVar.f206013i.setText((java.lang.CharSequence) null);
            xqVar.f206013i.setVisibility(8);
            return;
        }
        java.lang.String str2 = (java.lang.String) map.get(".msg.appmsg.mmreader.template_detail.msg_control_info.footer_wording");
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = (java.lang.String) map.get(".msg.appmsg.mmreader.template_detail.msg_control_info.footer_action_wording");
        java.lang.String str4 = str3 != null ? str3 : "";
        java.lang.String format = java.lang.String.format("%s%s", str2, str4);
        android.text.SpannableString spannableString = new android.text.SpannableString(format);
        int indexOf = format.indexOf(str4);
        int length = str4.length() + indexOf;
        com.tencent.mm.ui.chatting.viewitems.er erVar = new com.tencent.mm.ui.chatting.viewitems.er(dVar, str);
        erVar.f203908d = qVar;
        xqVar.f206013i.setTag(erVar);
        this.A = new com.tencent.mm.ui.chatting.viewitems.ah(this, H1, I1, xqVar);
        xqVar.f206013i.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0(this.f203175s.g()));
        spannableString.setSpan(this.A, indexOf, length, 17);
        xqVar.f206013i.setText(spannableString);
        xqVar.f206013i.setVisibility(0);
        r1(false, f9Var, map, str);
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return false;
    }

    public void M0(com.tencent.mm.ui.chatting.viewitems.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        int i17;
        com.tencent.mm.ui.chatting.viewitems.as asVar;
        j31.c cVar;
        com.tencent.mm.ui.chatting.viewitems.yq yqVar;
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        this.f203175s = dVar;
        if (C1 == null) {
            C1 = java.lang.Integer.valueOf(i65.a.f(dVar.g(), com.tencent.mm.R.dimen.f479738dv));
            D1 = java.lang.Integer.valueOf(i65.a.f(dVar.g(), com.tencent.mm.R.dimen.f479688cn));
            E1 = java.lang.Integer.valueOf(i65.a.f(dVar.g(), com.tencent.mm.R.dimen.f479714d7));
        }
        F1 = dVar.g().getResources().getColor(com.tencent.mm.R.color.f478873jj);
        G1 = dVar.g().getResources().getColor(com.tencent.mm.R.color.f478873jj);
        com.tencent.mm.ui.chatting.manager.c cVar2 = dVar.f460708c;
        this.f203184y0 = ((com.tencent.mm.ui.chatting.component.g9) ((sb5.k0) cVar2.a(sb5.k0.class))).r0();
        com.tencent.mm.ui.chatting.viewitems.xq xqVar = (com.tencent.mm.ui.chatting.viewitems.xq) g0Var;
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(f9Var.j(), "msg", null);
        if (d17 == null || d17.size() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemDyeingTemplate", "filling fail, values is empty");
            xqVar.f206006b.setVisibility(8);
            return;
        }
        xqVar.f206006b.setVisibility(0);
        int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msg.appmsg.mmreader.template_detail.template_show_type"), 0);
        int P2 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msg.appmsg.mmreader.category.item.template_op_type"), 0);
        int P3 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msg.appmsg.mmreader.template_detail.is_pay_recepit"), 0);
        java.lang.String str2 = (java.lang.String) d17.get(".msg.appmsg.template_id");
        if (str2 == null) {
            str2 = "";
        }
        this.H = str2;
        this.P = a1(d17);
        this.K = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msg.appmsg.mmreader.template_header.pay_style"), 0);
        java.lang.String str3 = (java.lang.String) d17.get(".msg.appmsg.mmreader.template_header.transaction_id");
        if (str3 == null) {
            str3 = "";
        }
        this.Q = str3;
        java.lang.String str4 = this.H;
        j31.c cVar3 = this.X;
        cVar3.getClass();
        kotlin.jvm.internal.o.g(str4, "<set-?>");
        cVar3.f297371c = str4;
        cVar3.f297372d = this.P;
        cVar3.f297380l = pm0.v.u(f9Var.I0());
        java.lang.String str5 = (java.lang.String) d17.get(".msg.appmsg.template_unique_msgid");
        if (str5 == null) {
            str5 = "";
        }
        cVar3.f297385q = str5;
        cVar3.f297386r = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msg.appmsg.mmreader.template_detail.template_ext.template_sub_type"), 0);
        cVar3.f297381m = P2;
        this.C.dead();
        ((com.tencent.mm.ui.chatting.component.y4) ((yn.j) cVar2.a(yn.j.class))).c(this.D);
        if (xqVar instanceof com.tencent.mm.ui.chatting.viewitems.vq) {
            com.tencent.mm.ui.chatting.viewitems.vq vqVar = (com.tencent.mm.ui.chatting.viewitems.vq) xqVar;
            vqVar.f205887k.setVisibility(8);
            sb5.k0 k0Var = (sb5.k0) cVar2.a(sb5.k0.class);
            com.tencent.mm.ui.chatting.viewitems.wq wqVar = vqVar.f205890n;
            com.tencent.mm.ui.chatting.viewitems.yq yqVar2 = vqVar.f205889m;
            if (k0Var != null) {
                i17 = P;
                long msgId = f9Var.getMsgId();
                com.tencent.mm.ui.chatting.component.g9 g9Var = (com.tencent.mm.ui.chatting.component.g9) k0Var;
                if (g9Var.q0(msgId)) {
                    long n07 = g9Var.n0(msgId);
                    if (n07 < 0) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", "filling content of group, id: %d", java.lang.Long.valueOf(msgId));
                        vqVar.f206006b.setVisibility(8);
                        vqVar.timeTV.setVisibility(8);
                        yqVar2.f206100a.setVisibility(8);
                        wqVar.f205957a.setVisibility(8);
                        return;
                    }
                    int size = g9Var.p0(n07) == null ? 0 : g9Var.p0(n07).size();
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", "filling end of group, id: %d, head id: %d, group size: %d", java.lang.Long.valueOf(msgId), java.lang.Long.valueOf(n07), java.lang.Integer.valueOf(size));
                    com.tencent.mm.ui.chatting.viewitems.er erVar = new com.tencent.mm.ui.chatting.viewitems.er(dVar2, str);
                    erVar.f203908d = xqVar;
                    vqVar.f205887k.setVisibility(0);
                    android.widget.TextView textView = vqVar.f205887k;
                    textView.setText(textView.getContext().getString(com.tencent.mm.R.string.f490892b66, java.lang.Integer.valueOf(size)));
                    vqVar.f205887k.setTag(erVar);
                    wqVar.f205957a.setTag(erVar);
                    vqVar.f205887k.setOnClickListener(new com.tencent.mm.ui.chatting.viewitems.yj(this, vqVar));
                    wqVar.f205957a.setOnBackgroundCardClickListener(new com.tencent.mm.ui.chatting.viewitems.yg(this, vqVar));
                    vqVar.timeTV.setVisibility(0);
                    vqVar.timeTV.setText(k35.m1.f(xqVar.timeTV.getContext(), f9Var.getCreateTime(), false, false));
                    yqVar2.f206100a.setVisibility(8);
                    K0(vqVar, d17, dVar2, xqVar, size, i17);
                    wqVar.f205957a.setVisibility(0);
                    return;
                }
                yqVar = yqVar2;
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", "normal msg, id: %d", java.lang.Long.valueOf(msgId));
            } else {
                yqVar = yqVar2;
                i17 = P;
            }
            yqVar.f206100a.setVisibility(0);
            wqVar.f205957a.setVisibility(8);
        } else {
            i17 = P;
        }
        com.tencent.mm.ui.chatting.viewitems.as asVar2 = xqVar.f206011g;
        xqVar.f206008d = asVar2;
        com.tencent.mm.ui.chatting.viewitems.br brVar = xqVar.f206007c;
        com.tencent.mm.ui.chatting.viewitems.cr crVar = xqVar.f206010f;
        com.tencent.mm.ui.chatting.viewitems.as asVar3 = xqVar.f206009e;
        if (i17 != 0) {
            android.view.View view = brVar.f203503a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingForWCPay", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingForWCPay", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (P3 == 1) {
                android.view.View view2 = xqVar.f206008d.f203407a;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingForWCPay", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingForWCPay", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view3 = asVar3.f203407a;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingForWCPay", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingForWCPay", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                xqVar.f206008d = asVar3;
            } else {
                android.view.View view4 = xqVar.f206008d.f203407a;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingForWCPay", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingForWCPay", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view5 = asVar3.f203407a;
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.add(8);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingForWCPay", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingForWCPay", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view6 = crVar.f203747a;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingForWCPay", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingForWCPay", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            asVar = asVar3;
            cVar = cVar3;
            Q0(xqVar, d17, dVar2, xqVar, i17);
            android.view.View view7 = xqVar.f206008d.f203407a;
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(0);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingForWCPay", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(view7, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingForWCPay", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            asVar = asVar3;
            cVar = cVar3;
            android.view.View view8 = asVar2.f203407a;
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList8.add(8);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingForWCPay", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(view8, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingForWCPay", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view9 = asVar.f203407a;
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            arrayList9.add(8);
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(view9, arrayList9.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingForWCPay", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
            yj0.a.f(view9, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingForWCPay", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view10 = crVar.f203747a;
            java.util.ArrayList arrayList10 = new java.util.ArrayList();
            arrayList10.add(8);
            java.util.Collections.reverse(arrayList10);
            yj0.a.d(view10, arrayList10.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingForWCPay", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view10.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
            yj0.a.f(view10, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingForWCPay", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            R0(xqVar, d17, dVar2, xqVar);
            android.view.View view11 = brVar.f203503a;
            java.util.ArrayList arrayList11 = new java.util.ArrayList();
            arrayList11.add(0);
            java.util.Collections.reverse(arrayList11);
            yj0.a.d(view11, arrayList11.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingForWCPay", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view11.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
            yj0.a.f(view11, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingForWCPay", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        V0(xqVar);
        if (com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msg.appmsg.mmreader.template_detail.msg_control_info.need_fold"), 0) == 1) {
            android.view.View view12 = xqVar.f206008d.f203407a;
            java.util.ArrayList arrayList12 = new java.util.ArrayList();
            arrayList12.add(8);
            java.util.Collections.reverse(arrayList12);
            yj0.a.d(view12, arrayList12.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingForWCPay", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view12.setVisibility(((java.lang.Integer) arrayList12.get(0)).intValue());
            yj0.a.f(view12, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingForWCPay", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view13 = asVar.f203407a;
            java.util.ArrayList arrayList13 = new java.util.ArrayList();
            arrayList13.add(8);
            java.util.Collections.reverse(arrayList13);
            yj0.a.d(view13, arrayList13.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingForWCPay", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view13.setVisibility(((java.lang.Integer) arrayList13.get(0)).intValue());
            yj0.a.f(view13, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingForWCPay", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view14 = brVar.f203503a;
            java.util.ArrayList arrayList14 = new java.util.ArrayList();
            arrayList14.add(8);
            java.util.Collections.reverse(arrayList14);
            yj0.a.d(view14, arrayList14.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingForWCPay", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view14.setVisibility(((java.lang.Integer) arrayList14.get(0)).intValue());
            yj0.a.f(view14, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingForWCPay", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view15 = crVar.f203747a;
            java.util.ArrayList arrayList15 = new java.util.ArrayList();
            arrayList15.add(0);
            java.util.Collections.reverse(arrayList15);
            yj0.a.d(view15, arrayList15.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingForWCPay", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view15.setVisibility(((java.lang.Integer) arrayList15.get(0)).intValue());
            yj0.a.f(view15, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingForWCPay", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            J0(xqVar, d17, dVar2, str);
        }
        if (com.tencent.mm.storage.z3.P4(f9Var.Q0())) {
            com.tencent.mm.storage.f9 Li = pt0.f0.Li(f9Var.Q0(), f9Var.getMsgId());
            if (!((Li.F & 16384) != 0)) {
                java.lang.String str6 = com.tencent.mm.ui.chatting.viewitems.dk.a(d17).f203804b;
                com.tencent.mm.autogen.mmdata.rpt.WeGamePluginReportStruct weGamePluginReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WeGamePluginReportStruct();
                weGamePluginReportStruct.f62911d = 1L;
                weGamePluginReportStruct.f62912e = 2L;
                weGamePluginReportStruct.f62913f = weGamePluginReportStruct.b("BizContent", str6, true);
                weGamePluginReportStruct.k();
                Li.l1(Li.F | 16384);
                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(f9Var.getMsgId(), Li, true);
            }
        }
        long msgId2 = f9Var.getMsgId();
        sb5.g0 g0Var2 = (sb5.g0) cVar2.a(sb5.g0.class);
        if (g0Var2 == null) {
            j31.c cVar4 = cVar;
            com.tencent.mm.plugin.report.service.g0 g0Var3 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[12];
            objArr[0] = this.H;
            java.lang.String str7 = (java.lang.String) d17.get(".msg.fromusername");
            objArr[1] = str7 != null ? str7 : "";
            objArr[2] = 111111;
            objArr[3] = java.lang.Integer.valueOf(this.P);
            objArr[4] = this.N;
            objArr[5] = java.lang.Integer.valueOf(Y0(d17));
            objArr[6] = java.lang.Integer.valueOf(W0());
            objArr[7] = cVar4.f297374f;
            objArr[8] = java.lang.Integer.valueOf(F1(cVar4.f297375g));
            objArr[9] = cVar4.f297376h;
            objArr[10] = cVar4.f297380l;
            objArr[11] = 0;
            g0Var3.d(11608, objArr);
            return;
        }
        com.tencent.mm.ui.chatting.component.n7 n7Var = (com.tencent.mm.ui.chatting.component.n7) g0Var2;
        if (((java.util.HashSet) n7Var.f199558q).contains(java.lang.Long.valueOf(msgId2))) {
            return;
        }
        ((java.util.HashSet) n7Var.f199558q).add(java.lang.Long.valueOf(msgId2));
        int i18 = n7Var.f199557p;
        com.tencent.mm.plugin.report.service.g0 g0Var4 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr2 = new java.lang.Object[12];
        objArr2[0] = this.H;
        java.lang.String str8 = (java.lang.String) d17.get(".msg.fromusername");
        objArr2[1] = str8 != null ? str8 : "";
        objArr2[2] = 111111;
        objArr2[3] = java.lang.Integer.valueOf(this.P);
        objArr2[4] = this.N;
        objArr2[5] = java.lang.Integer.valueOf(Y0(d17));
        objArr2[6] = java.lang.Integer.valueOf(W0());
        j31.c cVar5 = cVar;
        objArr2[7] = cVar5.f297374f;
        objArr2[8] = java.lang.Integer.valueOf(F1(cVar5.f297375g));
        objArr2[9] = cVar5.f297376h;
        objArr2[10] = cVar5.f297380l;
        objArr2[11] = java.lang.Integer.valueOf(i18);
        g0Var4.d(11608, objArr2);
    }

    public final void N0(com.tencent.mm.ui.chatting.viewitems.as asVar, java.util.Map map) {
        android.widget.LinearLayout linearLayout;
        java.util.ArrayList arrayList;
        int i17;
        int i18;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        boolean z17 = false;
        int i19 = 0;
        int i27 = 0;
        while (true) {
            if (i19 >= 100) {
                break;
            }
            java.lang.String str = ".msg.appmsg.mmreader.template_detail.line_content.lines.line";
            if (i19 != 0) {
                str = ".msg.appmsg.mmreader.template_detail.line_content.lines.line" + i19;
            }
            java.lang.String str2 = (java.lang.String) map.get(str + ".value.word");
            java.lang.String str3 = (java.lang.String) map.get(str + ".key.word");
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2) && com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", "fillingLines: lines count=%d", java.lang.Integer.valueOf(i19));
                break;
            }
            java.lang.String str4 = (java.lang.String) map.get(str + ".value.strikethrough_word");
            com.tencent.mm.ui.chatting.viewitems.yr yrVar = new com.tencent.mm.ui.chatting.viewitems.yr();
            yrVar.f206102b = str2;
            yrVar.f206103c = str4;
            yrVar.f206101a = str3 != null ? str3 : "";
            if (com.tencent.mm.ui.bk.C()) {
                yrVar.f206104d = l1(map, str + ".key.wxcolors.wxcolor1", l1(map, str + ".key.wxcolors.wxcolor", l1(map, str + ".key.color", F1)));
                int l17 = l1(map, str + ".value.wxcolors.wxcolor1", l1(map, str + ".value.wxcolors.wxcolor", l1(map, str + ".value.color", this.f203175s.g().getResources().getColor(com.tencent.mm.R.color.a0c))));
                yrVar.f206105e = l17;
                yrVar.f206105e = com.tencent.mm.ui.bk.d(l17);
            } else {
                yrVar.f206104d = l1(map, str + ".key.wxcolors.wxcolor", l1(map, str + ".key.color", F1));
                yrVar.f206105e = l1(map, str + ".value.wxcolors.wxcolor", l1(map, str + ".value.color", this.f203175s.g().getResources().getColor(com.tencent.mm.R.color.a0c)));
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            sb6.append(".key.hide");
            yrVar.f206106f = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(sb6.toString()), 0) != 0;
            java.lang.String str5 = yrVar.f206101a;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
                i18 = 0;
            } else {
                int i28 = 0;
                i18 = 0;
                while (i28 < str5.length()) {
                    int i29 = i28 + 1;
                    i18 = str5.substring(i28, i29).matches("[Α-￥]") ? i18 + 2 : i18 + 1;
                    i28 = i29;
                }
            }
            int i37 = (i18 + 1) / 2;
            if (i37 > i27) {
                i27 = i37;
            }
            arrayList2.add(yrVar);
            i19++;
        }
        float q17 = i65.a.q(com.tencent.mm.sdk.platformtools.x2.f193071a);
        if (i27 > 8 || (i27 >= 7 && q17 > 1.12f)) {
            i27 = java.lang.Math.round((java.lang.Math.min(8, i27) * 1.0f) / java.lang.Math.max(1.0f, q17));
        }
        android.widget.LinearLayout linearLayout2 = asVar.C;
        linearLayout2.setVisibility(0);
        android.view.View findViewById = ((android.view.ViewGroup) asVar.C.getParent()).findViewById(com.tencent.mm.R.id.cpm);
        if (findViewById != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingLines", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingLines", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (linearLayout2.getChildCount() > arrayList2.size()) {
            if (arrayList2.size() == 0) {
                linearLayout2.removeAllViews();
            } else {
                linearLayout2.removeViews(arrayList2.size(), linearLayout2.getChildCount() - arrayList2.size());
            }
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        int childCount = linearLayout2.getChildCount();
        int i38 = 0;
        while (i38 < arrayList2.size()) {
            com.tencent.mm.ui.chatting.viewitems.yr yrVar2 = (com.tencent.mm.ui.chatting.viewitems.yr) arrayList2.get(i38);
            if (i38 < childCount) {
                linearLayout = (android.widget.LinearLayout) linearLayout2.getChildAt(i38);
            } else {
                linearLayout = (android.widget.LinearLayout) android.view.LayoutInflater.from(this.f203175s.g()).inflate(com.tencent.mm.R.layout.f488431t4, (android.view.ViewGroup) null, z17);
                com.tencent.mm.ui.chatting.viewitems.zr zrVar = new com.tencent.mm.ui.chatting.viewitems.zr();
                zrVar.f206175a = (android.widget.TextView) linearLayout.findViewById(com.tencent.mm.R.id.i28);
                zrVar.f206176b = (android.widget.TextView) linearLayout.findViewById(com.tencent.mm.R.id.i2h);
                linearLayout.setTag(zrVar);
                linearLayout.setImportantForAccessibility(1);
                linearLayout2.addView(linearLayout);
            }
            if (asVar.f203416e0) {
                arrayList = arrayList2;
                linearLayout.setPadding(linearLayout.getPaddingLeft(), i65.a.b(this.f203175s.g(), 8), linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
            } else {
                arrayList = arrayList2;
                linearLayout.setPadding(linearLayout.getPaddingLeft(), i65.a.b(this.f203175s.g(), 12), linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
            }
            if (i38 == 0) {
                i17 = 0;
                linearLayout.setPadding(linearLayout.getPaddingLeft(), 0, linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
            } else {
                i17 = 0;
            }
            com.tencent.mm.ui.chatting.viewitems.zr zrVar2 = (com.tencent.mm.ui.chatting.viewitems.zr) linearLayout.getTag();
            if (yrVar2.f206106f) {
                zrVar2.f206175a.setVisibility(8);
            } else {
                zrVar2.f206175a.setVisibility(i17);
                zrVar2.f206175a.setEms(i27);
                zrVar2.f206175a.setTextColor(com.tencent.mm.ui.bk.d(yrVar2.f206104d));
                zrVar2.f206175a.setText(yrVar2.f206101a);
            }
            boolean z18 = (zrVar2.f206176b.getPaint().getFlags() & 16) != 0;
            if (com.tencent.mm.sdk.platformtools.t8.K0(yrVar2.f206103c)) {
                zrVar2.f206176b.setText(yrVar2.f206102b);
                if (z18) {
                    zrVar2.f206176b.getPaint().setFlags(zrVar2.f206176b.getPaintFlags() & (-17));
                }
            } else {
                zrVar2.f206176b.setText(yrVar2.f206103c);
                if (!z18) {
                    zrVar2.f206176b.getPaint().setFlags(zrVar2.f206176b.getPaintFlags() | 16);
                }
            }
            zrVar2.f206176b.setTextColor(com.tencent.mm.ui.bk.d(yrVar2.f206105e));
            zrVar2.f206175a.setImportantForAccessibility(2);
            zrVar2.f206176b.setImportantForAccessibility(2);
            int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.mmreader.category.item.template_op_type"), -1);
            if (((com.tencent.mm.ui.chatting.component.n7) ((sb5.g0) this.f203175s.f460708c.a(sb5.g0.class))).u0() && D1(P)) {
                android.view.View view = asVar.f203407a;
                if (view != null) {
                    view.setBackgroundResource(com.tencent.mm.R.drawable.f481364ri);
                }
                zrVar2.f206176b.setBackgroundResource(com.tencent.mm.R.drawable.f481208n7);
                zrVar2.f206176b.setTag(new com.tencent.mm.ui.chatting.viewitems.jk(yrVar2.f206101a, yrVar2.f206102b, yrVar2.f206106f));
                zrVar2.f206176b.setLongClickable(true);
                zrVar2.f206176b.setClickable(true);
                android.widget.TextView textView = zrVar2.f206176b;
                yb5.d dVar = this.f203175s;
                if (this.A1 == null) {
                    this.A1 = new com.tencent.mm.ui.chatting.viewitems.ik(dVar);
                }
                textView.setOnLongClickListener(this.A1);
                android.widget.TextView textView2 = zrVar2.f206176b;
                if (this.f203187z1 == null) {
                    this.f203187z1 = new com.tencent.mm.ui.chatting.viewitems.ek(null);
                }
                textView2.setOnClickListener(this.f203187z1);
            } else {
                android.view.View view2 = asVar.f203407a;
                if (view2 != null) {
                    view2.setBackgroundResource(com.tencent.mm.R.drawable.f481367rl);
                }
                zrVar2.f206176b.setTag(null);
                zrVar2.f206176b.setLongClickable(false);
                zrVar2.f206176b.setClickable(false);
                if (fp.h.c(16)) {
                    zrVar2.f206176b.setBackground(null);
                } else {
                    zrVar2.f206176b.setBackgroundDrawable(null);
                }
            }
            java.lang.String str6 = yrVar2.f206101a;
            if (str6 == null) {
                str6 = "";
            }
            sb7.append(str6);
            sb7.append(":");
            java.lang.String str7 = yrVar2.f206102b;
            if (str7 == null) {
                str7 = "";
            }
            sb7.append(str7);
            sb7.append("\n");
            i38++;
            arrayList2 = arrayList;
            z17 = false;
        }
        java.lang.String sb8 = sb7.toString();
        try {
            sb8 = java.net.URLEncoder.encode(sb8, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
        } catch (java.io.UnsupportedEncodingException e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingItemDyeingTemplate", e17.toString());
        }
        java.lang.String str8 = (java.lang.String) map.get(".msg.fromusername");
        boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str8 == null) {
            str8 = "";
        }
        java.lang.String str9 = r01.z.n(str8) ? "" : sb8;
        j31.c cVar = this.X;
        cVar.getClass();
        kotlin.jvm.internal.o.g(str9, "<set-?>");
        cVar.f297374f = str9;
        if (linearLayout2.getChildCount() == 0) {
            android.view.View view3 = asVar.B;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingLines", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingLines", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            linearLayout2.setVisibility(8);
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.mmreader.template_detail.line_content.topline.key.hide_dash_line"), 0) != 0) {
            android.view.View view4 = asVar.B;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view4, arrayList5.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingLines", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingLines", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view5 = asVar.B;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view5, arrayList6.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingLines", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingLines", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        linearLayout2.setVisibility(0);
    }

    public final void O0(com.tencent.mm.ui.chatting.viewitems.as asVar, java.util.Map map, com.tencent.mm.storage.f9 f9Var) {
        java.lang.String str = (java.lang.String) map.get(".msg.fromusername");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        boolean Bi = ((com.tencent.mm.plugin.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Bi(str);
        if (this.f203184y0 && asVar.f203429l.getTag(com.tencent.mm.R.id.k8v) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", "fillingMoreVNew handled by app single talker chat");
            asVar.f203430m.setTag(com.tencent.mm.R.id.k8v, f9Var);
            asVar.f203430m.setOnClickListener(this.f203177u);
            android.view.View view = asVar.f203430m;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVNew", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVNew", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = asVar.f203429l;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVNew", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVNew", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (Bi && ((com.tencent.mm.ui.chatting.component.y2) ((sb5.p) this.f203175s.f460708c.a(sb5.p.class))).f198580d.f460717l.getBooleanExtra("key_is_service_voip_template_msg", false).booleanValue()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", "fillingMoreVNew showMoreV by app brand service voip");
            asVar.f203429l.setTag(null);
            asVar.f203430m.setTag(null);
            android.view.View view3 = asVar.f203429l;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVNew", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVNew", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = asVar.f203430m;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVNew", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVNew", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (Bi && "notifymessage".equals(f9Var.Q0())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", "fillingMoreVNew handled by app brand");
            asVar.f203430m.setTag(null);
            android.view.View view5 = asVar.f203430m;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVNew", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVNew", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (com.tencent.mm.storage.z3.j4(f9Var.Q0()) && r01.z.n(str) && h1(a1(map))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", "fillingMoreVNew handled by biz subscribe msg");
            asVar.f203430m.setTag(null);
            android.view.View view6 = asVar.f203430m;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVNew", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVNew", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (!(com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.mmreader.template_header.show_complaint_button"), 0) == 1)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", "fillingMoreVNew showMoreV false");
            asVar.f203429l.setTag(null);
            asVar.f203430m.setTag(null);
            android.view.View view7 = asVar.f203429l;
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
            arrayList7.add(8);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVNew", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(view7, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVNew", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view8 = asVar.f203430m;
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(8);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVNew", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(view8, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVNew", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        com.tencent.mm.ui.chatting.viewitems.bk bkVar = this.f203178v;
        bkVar.f203494d = asVar;
        if (asVar.f203417f.getVisibility() == 0) {
            asVar.f203429l.setTag(f9Var);
            asVar.f203429l.setOnClickListener(bkVar);
            android.view.View view9 = asVar.f203429l;
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
            arrayList9.add(0);
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(view9, arrayList9.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVNew", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
            yj0.a.f(view9, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVNew", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view10 = asVar.f203430m;
            java.util.ArrayList arrayList10 = new java.util.ArrayList();
            arrayList10.add(8);
            java.util.Collections.reverse(arrayList10);
            yj0.a.d(view10, arrayList10.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVNew", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view10.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
            yj0.a.f(view10, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVNew", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (asVar.f203439v.getVisibility() == 0) {
            asVar.f203430m.setTag(f9Var);
            asVar.f203430m.setOnClickListener(bkVar);
            android.view.View view11 = asVar.f203430m;
            java.util.ArrayList arrayList11 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal7 = zj0.c.f473285a;
            arrayList11.add(0);
            java.util.Collections.reverse(arrayList11);
            yj0.a.d(view11, arrayList11.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVNew", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view11.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
            yj0.a.f(view11, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVNew", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view12 = asVar.f203429l;
            java.util.ArrayList arrayList12 = new java.util.ArrayList();
            arrayList12.add(8);
            java.util.Collections.reverse(arrayList12);
            yj0.a.d(view12, arrayList12.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVNew", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view12.setVisibility(((java.lang.Integer) arrayList12.get(0)).intValue());
            yj0.a.f(view12, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVNew", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            asVar.f203429l.setTag(null);
            asVar.f203430m.setTag(null);
            android.view.View view13 = asVar.f203429l;
            java.util.ArrayList arrayList13 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal8 = zj0.c.f473285a;
            arrayList13.add(8);
            java.util.Collections.reverse(arrayList13);
            yj0.a.d(view13, arrayList13.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVNew", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view13.setVisibility(((java.lang.Integer) arrayList13.get(0)).intValue());
            yj0.a.f(view13, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVNew", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view14 = asVar.f203430m;
            java.util.ArrayList arrayList14 = new java.util.ArrayList();
            arrayList14.add(8);
            java.util.Collections.reverse(arrayList14);
            yj0.a.d(view14, arrayList14.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVNew", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view14.setVisibility(((java.lang.Integer) arrayList14.get(0)).intValue());
            yj0.a.f(view14, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVNew", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (((com.tencent.mm.ui.chatting.component.y2) ((sb5.p) this.f203175s.f460708c.a(sb5.p.class))).f200273m) {
            android.view.View view15 = asVar.f203429l;
            java.util.ArrayList arrayList15 = new java.util.ArrayList();
            arrayList15.add(8);
            java.util.Collections.reverse(arrayList15);
            yj0.a.d(view15, arrayList15.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVNew", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view15.setVisibility(((java.lang.Integer) arrayList15.get(0)).intValue());
            yj0.a.f(view15, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVNew", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view16 = asVar.f203430m;
            java.util.ArrayList arrayList16 = new java.util.ArrayList();
            arrayList16.add(8);
            java.util.Collections.reverse(arrayList16);
            yj0.a.d(view16, arrayList16.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVNew", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view16.setVisibility(((java.lang.Integer) arrayList16.get(0)).intValue());
            yj0.a.f(view16, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVNew", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        if (f9Var != null && menuItem.getItemId() == 102) {
            tt0.c a17 = tt0.c.a(f9Var.j());
            if ((((com.tencent.mm.ui.chatting.component.n7) ((sb5.g0) dVar.f460708c.a(sb5.g0.class))).u0() || ((com.tencent.mm.ui.chatting.component.h0) ((sb5.g) dVar.f460708c.a(sb5.g.class))).n0() || f9Var.B2()) && D1(a17.f421786a)) {
                int i17 = a17.f421791f;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(a17.f421788c);
                sb6.append("\n");
                if (i17 != 0) {
                    java.util.List list = a17.f421794i;
                    if (list != null) {
                        java.util.ArrayList arrayList = (java.util.ArrayList) list;
                        if (!arrayList.isEmpty()) {
                            java.util.Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                tt0.b bVar = (tt0.b) it.next();
                                sb6.append(bVar.f421784a);
                                sb6.append(":");
                                sb6.append(bVar.f421785b);
                                sb6.append("\n");
                            }
                            if (sb6.length() > 0) {
                                sb6.setLength(sb6.length() - 1);
                            }
                            java.lang.String sb7 = sb6.toString();
                            com.tencent.mm.sdk.platformtools.b0.d(com.tencent.mm.sdk.platformtools.x2.f193071a, sb7, sb7, null);
                            dp.a.makeText(dVar.g(), com.tencent.mm.R.string.f490361st, 0).show();
                        }
                    }
                } else if (!com.tencent.mm.sdk.platformtools.t8.K0(a17.f421793h)) {
                    sb6.append(a17.f421793h);
                    java.lang.String sb8 = sb6.toString();
                    com.tencent.mm.sdk.platformtools.b0.d(com.tencent.mm.sdk.platformtools.x2.f193071a, sb8, sb8, null);
                    dp.a.makeText(dVar.g(), com.tencent.mm.R.string.f490361st, 0).show();
                }
            }
        }
        return false;
    }

    public final void P0(com.tencent.mm.ui.chatting.viewitems.br brVar, java.util.Map map, com.tencent.mm.storage.f9 f9Var) {
        if (!(com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.mmreader.category.item.show_complaint_button"), 0) == 1)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", "fillingMoreVNew showMoreV false");
            brVar.f203505c.setTag(null);
            brVar.f203506d.setTag(null);
            android.view.View view = brVar.f203505c;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVOld", "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingTopSlot;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVOld", "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingTopSlot;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = brVar.f203506d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVOld", "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingTopSlot;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVOld", "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingTopSlot;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        int visibility = brVar.f203504b.getVisibility();
        com.tencent.mm.ui.chatting.viewitems.bk bkVar = this.f203178v;
        if (visibility == 0) {
            brVar.f203505c.setTag(f9Var);
            brVar.f203505c.setOnClickListener(bkVar);
            android.view.View view3 = brVar.f203505c;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVOld", "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingTopSlot;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVOld", "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingTopSlot;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = brVar.f203506d;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVOld", "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingTopSlot;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVOld", "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingTopSlot;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            brVar.f203506d.setTag(f9Var);
            brVar.f203506d.setOnClickListener(bkVar);
            android.view.View view5 = brVar.f203506d;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVOld", "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingTopSlot;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVOld", "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingTopSlot;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view6 = brVar.f203505c;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVOld", "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingTopSlot;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVOld", "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingTopSlot;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (((com.tencent.mm.ui.chatting.component.y2) ((sb5.p) this.f203175s.f460708c.a(sb5.p.class))).f200273m) {
            android.view.View view7 = brVar.f203505c;
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(8);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVOld", "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingTopSlot;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(view7, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVOld", "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingTopSlot;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view8 = brVar.f203506d;
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(8);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVOld", "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingTopSlot;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(view8, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVOld", "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingTopSlot;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        com.tencent.mm.storage.f9 f9Var = dVar.f394254d.f445300b;
        com.tencent.mm.ui.chatting.viewitems.er erVar = (com.tencent.mm.ui.chatting.viewitems.er) view.getTag();
        if (erVar == null) {
            return false;
        }
        int d17 = erVar.d();
        tt0.c a17 = tt0.c.a(f9Var.j());
        if ((((com.tencent.mm.ui.chatting.component.n7) ((sb5.g0) this.f203175s.f460708c.a(sb5.g0.class))).u0() || ((com.tencent.mm.ui.chatting.component.h0) ((sb5.g) this.f203175s.f460708c.a(sb5.g.class))).n0() || f9Var.B2()) && D1(a17.f421786a)) {
            g4Var.c(d17, 102, 0, this.f203175s.s().getString(com.tencent.mm.R.string.b3m), com.tencent.mm.R.raw.icons_filled_copy);
        }
        if (this.f203175s.F()) {
            return true;
        }
        g4Var.c(d17, 100, 0, view.getContext().getString(com.tencent.mm.R.string.b3p), com.tencent.mm.R.raw.icons_filled_delete);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x076f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0797  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x07b0  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x07ba  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0812  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0870  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x08f2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0bee  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0d05  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0d28  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0d65  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0d6a  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0db6  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0dd4  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0d84  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0d67  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x087c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0873  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x081b  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x07cf  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x07b3  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x079b  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0782  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x071f  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0710  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x070b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x071c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q0(com.tencent.mm.ui.chatting.viewitems.xq r46, java.util.Map r47, rd5.d r48, com.tencent.mm.ui.chatting.adapter.q r49, int r50) {
        /*
            Method dump skipped, instructions count: 3559
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.Q0(com.tencent.mm.ui.chatting.viewitems.xq, java.util.Map, rd5.d, com.tencent.mm.ui.chatting.adapter.q, int):void");
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        return false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(40:92|(31:(2:94|(2:284|285)(2:96|(1:99)(1:98)))|101|102|103|104|(4:105|(1:107)(1:280)|108|(1:209)(6:110|(1:112)(3:173|(1:208)(2:181|(1:207)(9:185|186|187|188|(1:190)(1:202)|191|(1:193)(2:198|(1:200)(1:201))|194|(1:196)(1:197)))|206)|(1:114)(2:118|(1:120)(20:121|(1:123)|124|(1:126)|127|(5:162|163|164|165|166)(1:129)|(2:157|158)|131|(2:152|153)|133|(1:135)|136|(1:138)|139|140|141|142|143|145|117))|115|116|117))|210|(4:211|(1:213)(1:279)|214|(1:248)(11:216|217|218|219|(1:221)(1:244)|222|(1:224)(2:240|(1:242)(1:243))|225|(1:227)(1:239)|228|(4:230|231|(2:233|234)(2:236|237)|235)(3:238|(0)(0)|235)))|249|(2:250|(11:252|(1:254)(1:273)|255|(2:256|(1:258)(1:259))|260|(1:262)|263|(1:265)(1:272)|266|(2:268|269)(1:271)|270)(1:274))|275|(1:277)(1:278)|23|(1:25)(1:88)|26|(1:28)(1:87)|29|(4:76|(1:78)|79|(2:83|(1:85)(1:86)))(4:33|(1:35)|36|(5:40|(1:42)|43|(1:45)|46))|47|(3:72|(1:74)|75)(1:51)|52|(1:54)|55|(1:57)|58|(1:60)(1:71)|61|(1:63)(1:70)|(1:65)(1:69)|66|67)(1:286)|100|101|102|103|104|(5:105|(0)(0)|108|(0)(0)|117)|210|(5:211|(0)(0)|214|(0)(0)|235)|249|(3:250|(0)(0)|270)|275|(0)(0)|23|(0)(0)|26|(0)(0)|29|(1:31)|76|(0)|79|(3:81|83|(0)(0))|47|(1:49)|72|(0)|75|52|(0)|55|(0)|58|(0)(0)|61|(0)(0)|(0)(0)|66|67) */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x02ad, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x02ae, code lost:
    
        com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemDyeingTemplateDecorator", "decorateStyle setSpan error: %s", r0.getMessage());
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0926  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0b98  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0bb6  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0b73 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0b58 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0302 A[EDGE_INSN: B:209:0x0302->B:210:0x0302 BREAK  A[LOOP:1: B:105:0x02bc->B:117:0x0bec], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x07dd  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x08eb  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x08fd  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0344 A[EDGE_INSN: B:248:0x0344->B:249:0x0344 BREAK  A[LOOP:2: B:211:0x031b->B:235:0x0900], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x03f4 A[EDGE_INSN: B:274:0x03f4->B:275:0x03f4 BREAK  A[LOOP:3: B:250:0x0356->B:270:0x03dc], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x07a9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x07ae  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x07c4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x07ab  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0704  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0459  */
    /* JADX WARN: Type inference failed for: r7v23, types: [java.lang.Object, com.tencent.mm.ui.chatting.viewitems.lh, android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R0(com.tencent.mm.ui.chatting.viewitems.xq r40, java.util.Map r41, rd5.d r42, com.tencent.mm.ui.chatting.adapter.q r43) {
        /*
            Method dump skipped, instructions count: 3077
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.R0(com.tencent.mm.ui.chatting.viewitems.xq, java.util.Map, rd5.d, com.tencent.mm.ui.chatting.adapter.q):void");
    }

    public final void S0(android.widget.ImageView imageView, com.tencent.mm.storage.f9 f9Var, java.util.Map map) {
        java.lang.String str = (java.lang.String) map.get(".msg.appmsg.mmreader.category.item.right_cover_url");
        if (imageView != null) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                imageView.setVisibility(8);
            } else {
                n11.a.b().m(str, imageView, new com.tencent.mm.ui.chatting.viewitems.gj(this, imageView));
            }
        }
    }

    public final void T0(com.tencent.mm.ui.chatting.viewitems.as asVar, java.util.Map map) {
        android.widget.LinearLayout linearLayout;
        java.lang.String str = (java.lang.String) map.get(".msg.appmsg.mmreader.template_detail.line_content.topline.key.word");
        java.lang.String str2 = (java.lang.String) map.get(".msg.appmsg.mmreader.template_detail.line_content.topline.value.word");
        java.lang.String str3 = (java.lang.String) map.get(".msg.appmsg.mmreader.template_detail.line_content.topline.value.strikethrough_word");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            asVar.f203440w.setVisibility(8);
            return;
        }
        int color = this.f203175s.g().getResources().getColor(com.tencent.mm.R.color.a0c);
        int d17 = com.tencent.mm.ui.bk.d(!com.tencent.mm.ui.bk.C() ? l1(map, ".msg.appmsg.mmreader.template_detail.line_content.topline.key.wxcolors.wxcolor", l1(map, ".msg.appmsg.mmreader.template_detail.line_content.topline.key.color", color)) : l1(map, ".msg.appmsg.mmreader.template_detail.line_content.topline.key.wxcolors.wxcolor1", l1(map, ".msg.appmsg.mmreader.template_detail.line_content.topline.key.wxcolors.wxcolor", l1(map, ".msg.appmsg.mmreader.template_detail.line_content.topline.key.color", color))));
        int d18 = com.tencent.mm.ui.bk.d(l1(map, ".msg.appmsg.mmreader.template_detail.line_content.topline.value.color", this.f203175s.g().getResources().getColor(com.tencent.mm.R.color.a0c)));
        int d19 = com.tencent.mm.ui.bk.d(l1(map, ".msg.appmsg.mmreader.template_detail.line_content.topline.value.strikethrough_word_color", this.f203175s.g().getResources().getColor(com.tencent.mm.R.color.t_)));
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.mmreader.template_detail.template_ext.business_scene"), 0) == 1;
        int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.mmreader.template_detail.line_content.topline.value.small_text_count"), 0);
        asVar.f203441x.setTextColor(d17);
        asVar.f203443z.setTextColor(d18);
        asVar.A.setTextColor(d19);
        asVar.A.getPaint().setFlags(16);
        asVar.A.getPaint().setAntiAlias(true);
        asVar.A.setTextSize(0, i65.a.h(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479673ca));
        asVar.f203441x.setText(str);
        if (P <= 0 || P >= str2.length()) {
            asVar.f203442y.setTypeface(android.graphics.Typeface.DEFAULT);
            asVar.f203442y.setVisibility(8);
            if (str2.contains("￥") || str2.contains("¥") || str2.contains("$") || str2.contains("＄")) {
                android.widget.TextView textView = asVar.f203443z;
                qg0.h0 h0Var = (qg0.h0) i95.n0.c(qg0.h0.class);
                android.app.Activity g17 = this.f203175s.g();
                ((pg0.s3) h0Var).getClass();
                textView.setTypeface(com.tencent.mm.wallet_core.ui.r1.F(g17, 0));
                asVar.f203443z.setTextSize(1, 40.0f);
                asVar.f203443z.setIncludeFontPadding(true);
            } else {
                asVar.f203443z.setTypeface(android.graphics.Typeface.DEFAULT);
                com.tencent.mm.ui.bk.r0(asVar.f203443z.getPaint(), 0.8f);
                asVar.f203443z.setTextSize(1, z17 ? 22.0f : 32.0f);
                asVar.f203443z.setIncludeFontPadding(false);
            }
            asVar.f203443z.setText(str2);
        } else {
            asVar.f203442y.setVisibility(0);
            asVar.f203442y.setText(str2.substring(0, P));
            asVar.f203442y.setTextColor(d18);
            android.widget.TextView textView2 = asVar.f203442y;
            qg0.h0 h0Var2 = (qg0.h0) i95.n0.c(qg0.h0.class);
            android.app.Activity g18 = this.f203175s.g();
            ((pg0.s3) h0Var2).getClass();
            textView2.setTypeface(com.tencent.mm.wallet_core.ui.r1.F(g18, 0));
            android.widget.TextView textView3 = asVar.f203443z;
            qg0.h0 h0Var3 = (qg0.h0) i95.n0.c(qg0.h0.class);
            android.app.Activity g19 = this.f203175s.g();
            ((pg0.s3) h0Var3).getClass();
            textView3.setTypeface(com.tencent.mm.wallet_core.ui.r1.F(g19, 0));
            asVar.f203443z.setTextSize(1, 40.0f);
            asVar.f203442y.setTextSize(1, 40.0f);
            asVar.f203443z.setIncludeFontPadding(true);
            asVar.f203443z.setText(str2.substring(P));
        }
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str3);
        boolean z18 = asVar.f203416e0;
        if (K0) {
            asVar.A.setVisibility(8);
        } else {
            asVar.A.setText(str3);
            if (z18) {
                android.widget.TextView textView4 = asVar.A;
                qg0.h0 h0Var4 = (qg0.h0) i95.n0.c(qg0.h0.class);
                android.app.Activity g27 = this.f203175s.g();
                ((pg0.s3) h0Var4).getClass();
                textView4.setTypeface(com.tencent.mm.wallet_core.ui.r1.F(g27, 7));
            } else {
                asVar.A.setTypeface(android.graphics.Typeface.DEFAULT);
            }
            asVar.A.setVisibility(0);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            sb6.append(str);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            sb6.append(str2);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            sb6.append(" ");
            sb6.append(this.f203175s.s().getString(com.tencent.mm.R.string.b3d));
            sb6.append(str3);
        }
        java.lang.String str4 = (java.lang.String) map.get(".msg.appmsg.mmreader.template_detail.pay_recepit_middle_tips_word");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            sb6.append(str4);
        }
        java.lang.String str5 = (java.lang.String) map.get(".msg.appmsg.mmreader.template_detail.pay_recepit_detail_word");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
            sb6.append(str5);
        }
        asVar.f203440w.setContentDescription(sb6.toString());
        asVar.f203440w.setVisibility(0);
        if ((z18 || z17) && (linearLayout = asVar.f203440w) != null) {
            android.view.ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, (z17 || z18) ? 20 : 16), marginLayoutParams.rightMargin, z17 ? i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 40) : marginLayoutParams.bottomMargin);
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(50:23|(1:25)|26|(6:290|291|292|293|294|295)(1:28)|29|(1:31)|289|33|(1:288)|37|(1:39)(1:287)|40|(1:42)(1:286)|43|(1:45)(1:285)|46|(1:48)(1:284)|49|(1:51)|52|(1:54)(14:239|240|241|242|243|244|(7:246|247|248|249|250|251|(33:253|254|(1:256)(1:267)|257|258|(1:265)(2:261|(2:263|264))|(1:238)(3:60|(1:237)(2:64|(1:66))|67)|68|(1:70)(3:232|(1:234)(1:236)|235)|71|(3:73|(3:75|(1:77)(1:79)|78)|80)(1:231)|81|(1:83)(1:230)|84|(2:86|(4:88|(3:90|(1:92)(1:94)|93)|95|(5:97|(1:99)|(1:101)|(1:103)|(2:105|(1:225)(1:108))(1:226))(1:227))(1:228))(1:229)|109|(1:111)(1:224)|112|(1:114)(1:223)|115|116|117|118|119|(1:121)|122|(6:124|(1:126)(1:219)|127|(1:129)(1:218)|130|(1:132)(1:217))(1:220)|133|(1:135)(7:142|(2:152|(1:154)(2:155|(1:(1:158))(2:159|(10:192|193|194|195|196|(1:198)|199|(4:201|202|203|204)(1:210)|205|206)(7:161|(1:163)(2:165|(5:181|182|(1:184)|185|(1:187)(1:188))(2:167|(5:170|171|(1:173)|174|(1:176)(1:177))(5:169|151|(1:138)(1:141)|139|140)))|164|151|(0)(0)|139|140))))(3:146|(1:148)|149)|150|151|(0)(0)|139|140)|136|(0)(0)|139|140))(1:276)|268|254|(0)(0)|257|258|(0)|265)|55|(1:57)|238|68|(0)(0)|71|(0)(0)|81|(0)(0)|84|(0)(0)|109|(0)(0)|112|(0)(0)|115|116|117|118|119|(0)|122|(0)(0)|133|(0)(0)|136|(0)(0)|139|140) */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0829, code lost:
    
        r25 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x04ec, code lost:
    
        if (r4 != 0) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x02ac, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.K0(r1) == false) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0790  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x07fc  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0845  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x084d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x08d9  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0b0e  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0b16  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x08f5  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x08c5  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x07fe  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0792  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0758  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x05fa  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x04a2 A[Catch: Exception -> 0x047e, TryCatch #1 {Exception -> 0x047e, blocks: (B:251:0x0475, B:253:0x0479, B:254:0x048d, B:256:0x04a2, B:257:0x04a6, B:261:0x04b7, B:265:0x04d3), top: B:250:0x0475 }] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x064b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U0(com.tencent.mm.ui.chatting.viewitems.as r35, rd5.d r36, java.util.Map r37) {
        /*
            Method dump skipped, instructions count: 2860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.U0(com.tencent.mm.ui.chatting.viewitems.as, rd5.d, java.util.Map):void");
    }

    public final void V0(com.tencent.mm.ui.chatting.viewitems.xq xqVar) {
        boolean z17;
        com.tencent.mm.storage.f9 item;
        java.util.Map d17;
        android.widget.TextView textView = xqVar.timeTV;
        if (textView == null) {
            return;
        }
        if (textView.getVisibility() == 0) {
            android.widget.LinearLayout linearLayout = xqVar.f206006b;
            linearLayout.setPadding(linearLayout.getPaddingLeft(), 0, xqVar.f206006b.getPaddingRight(), xqVar.f206006b.getPaddingBottom());
            return;
        }
        int adapterPosition = xqVar.getAdapterPosition() - 1;
        if (adapterPosition < 0 || (item = ((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) this.f203175s.f460708c.a(sb5.z.class))).getItem(adapterPosition)) == null || (d17 = com.tencent.mm.sdk.platformtools.aa.d(item.j(), "msg", null)) == null || d17.size() <= 0) {
            z17 = false;
        } else {
            z17 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msg.appmsg.mmreader.template_detail.msg_control_info.need_footer"), 0) == 1;
            if (xqVar.f206008d.f203407a.getVisibility() == 0) {
                java.lang.String str = (java.lang.String) d17.get(".msg.appmsg.template_id");
                if (str == null) {
                    str = "";
                }
                z17 &= !(!((java.util.HashMap) ((com.tencent.mm.ui.chatting.component.n7) ((sb5.g0) this.f203175s.f460708c.a(sb5.g0.class))).f199556o).containsKey(str) ? false : ((java.lang.Boolean) r4.get(str)).booleanValue());
            }
        }
        if (z17) {
            android.widget.LinearLayout linearLayout2 = xqVar.f206006b;
            linearLayout2.setPadding(linearLayout2.getPaddingLeft(), i65.a.h(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479870hj), xqVar.f206006b.getPaddingRight(), xqVar.f206006b.getPaddingBottom());
        } else {
            android.widget.LinearLayout linearLayout3 = xqVar.f206006b;
            linearLayout3.setPadding(linearLayout3.getPaddingLeft(), 0, xqVar.f206006b.getPaddingRight(), xqVar.f206006b.getPaddingBottom());
        }
    }

    public final int W0() {
        return ((com.tencent.mm.ui.chatting.component.y2) ((sb5.p) this.f203175s.f460708c.a(sb5.p.class))).f200273m ? 1 : 0;
    }

    public int X0() {
        return com.tencent.mm.R.layout.f488477ud;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Y(int i17) {
        return i17 != 13;
    }

    public final void b(java.lang.String str, java.lang.String str2) {
        try {
            bw5.x7 parseFrom = new bw5.x7().parseFrom(android.util.Base64.decode(str, 0));
            c("view_clk", str2, this.f203175s.x(), parseFrom, null, null);
            pq.a aVar = new pq.a(this.f203175s.g());
            java.lang.String a17 = com.tencent.mm.feature.ecs.share.s.f66001a.a(this.f203175s.x());
            cl0.g gVar = new cl0.g();
            gVar.h("encryptUserName", a17);
            aVar.b(gVar);
            ((r10.q) ((pq.q) i95.n0.c(pq.q.class))).wi(aVar, parseFrom, null);
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", "ecsJump %d", java.lang.Integer.valueOf(str.length()));
        } catch (cl0.f e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemDyeingTemplate", "put encryptUserName error: %s", e17);
        } catch (java.io.IOException e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemDyeingTemplate", "parse jumpInfo error: %s", e18);
        }
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean b0() {
        return this instanceof com.tencent.mm.ui.chatting.viewitems.ok;
    }

    public final int b1() {
        sb5.g0 g0Var = (sb5.g0) this.f203175s.f460708c.a(sb5.g0.class);
        if (g0Var != null) {
            return ((com.tencent.mm.ui.chatting.component.n7) g0Var).f199557p;
        }
        return 0;
    }

    public final void c(java.lang.String str, java.lang.String str2, java.lang.String str3, bw5.x7 x7Var, java.lang.String str4, java.util.Map map) {
        j31.c cVar = this.X;
        try {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("view_id", str2);
            hashMap.put("chat_username", str3);
            hashMap.put("jump_biz_type", java.lang.Integer.valueOf(x7Var.f34973d));
            hashMap.put("ecs_jump_info_data", android.util.Base64.encodeToString(x7Var.toByteArray(), 0));
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            java.lang.String str5 = "";
            if (str4 == null) {
                str4 = "";
            }
            hashMap.put("product_id", str4);
            java.lang.String str6 = this.H;
            if (str6 == null) {
                str6 = "";
            }
            hashMap.put("template_id", str6);
            if (str3 == null) {
                str3 = "";
            }
            hashMap.put("from_username", str3);
            hashMap.put("template_type", java.lang.Integer.valueOf(this.P));
            hashMap.put("business_type", java.lang.Integer.valueOf(Y0(map)));
            java.lang.String str7 = this.N;
            if (str7 == null) {
                str7 = "";
            }
            hashMap.put("template_title", str7);
            hashMap.put("jump_info", cVar.f297376h);
            hashMap.put("msg_svr_id", cVar.f297380l);
            hashMap.put("action_type", 0);
            hashMap.put("container_type", java.lang.Integer.valueOf(W0()));
            java.lang.String str8 = cVar.f297374f;
            if (str8 == null) {
                str8 = "";
            }
            hashMap.put("msg_content", str8);
            hashMap.put("jump_type", java.lang.Integer.valueOf(F1(cVar.f297375g)));
            hashMap.put("custom_session_id", java.lang.Integer.valueOf(b1()));
            java.lang.String str9 = (java.lang.String) map.get(".msg.appmsg.ecsInfo.reportExtraInfoJson");
            if (str9 != null) {
                str5 = str9;
            }
            hashMap.put("report_extra_data", str5);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej(str, hashMap, 38165);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemDyeingTemplate", "reportEcsJumpInfoEvent error: " + e17.getMessage());
        }
    }

    public final void c1(final java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        com.tencent.mm.plugin.appbrand.service.p5 p5Var = (com.tencent.mm.plugin.appbrand.service.p5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.p5.class);
        final com.tencent.mm.ui.chatting.viewitems.vi viVar = new com.tencent.mm.ui.chatting.viewitems.vi(this);
        ((gi1.a) p5Var).getClass();
        java.util.HashMap hashMap = gi1.n.f272248a;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            viVar.a(str, -1, false);
            return;
        }
        synchronized (gi1.n.f272249b) {
            java.util.HashMap hashMap2 = gi1.n.f272248a;
            if (hashMap2.containsKey(str)) {
                viVar.a(str, ((java.lang.Integer) hashMap2.get(str)).intValue(), true);
            } else {
                ((ku5.t0) ku5.t0.f312615d).q(new java.lang.Runnable() { // from class: gi1.n$$b
                    @Override // java.lang.Runnable
                    public final void run() {
                        java.lang.String subId = str;
                        com.tencent.mm.plugin.appbrand.service.n5 n5Var = viVar;
                        int o17 = com.tencent.mm.sdk.platformtools.o4.J("appbrand_service_voip_call_id_status_mmkv_name", gm0.j1.b().h(), 2).o(subId, -1);
                        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoiceServiceVoipCallSubIdStatusCache", "getVoipCallSubIdStatus: subId = " + subId + ", status = " + o17);
                        if (o17 != -1) {
                            synchronized (gi1.n.f272249b) {
                                gi1.n.f272248a.put(subId, java.lang.Integer.valueOf(o17));
                            }
                            ((com.tencent.mm.ui.chatting.viewitems.vi) n5Var).a(subId, o17, true);
                            return;
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoiceServiceVoipCallSubIdStatusCache", "getVoipCallSubIdStatus from cgi: subId = " + subId);
                        kotlin.jvm.internal.o.g(subId, "subId");
                        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
                        r45.se7 se7Var = new r45.se7();
                        se7Var.f385661d = subId;
                        lVar.f70664a = se7Var;
                        lVar.f70665b = new r45.te7();
                        lVar.f70666c = "/cgi-bin/mmbiz-bin/wxaruntime/getvoipcallsubidstatus";
                        lVar.f70667d = 28830;
                        com.tencent.mm.modelbase.z2.d(lVar.a(), new gi1.d(n5Var, subId), true);
                    }
                });
            }
        }
    }

    public final java.lang.String d1(android.view.View view) {
        try {
            view.setDrawingCacheEnabled(true);
            view.buildDrawingCache();
            android.graphics.Bitmap drawingCache = view.getDrawingCache();
            com.tencent.mm.vfs.r7 r7Var = com.tencent.mm.vfs.q7.f213141a;
            java.lang.String str = (lp0.b.h0("WebImageCache").o() + "/") + java.lang.String.format(java.util.Locale.US, "mmexport_%s_%d", "biz_service_complaint_img", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            com.tencent.mm.sdk.platformtools.x.D0(drawingCache, 100, android.graphics.Bitmap.CompressFormat.JPEG, str, false);
            com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem d17 = com.tencent.mm.plugin.webview.model.m4.d(str);
            com.tencent.mm.plugin.webview.modeltools.z.Zi().a(d17);
            return d17.f182736e;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemDyeingTemplate", e17.getMessage());
            return "";
        }
    }

    public final void e1(java.util.Map map, com.tencent.mm.storage.f9 f9Var, com.tencent.mm.ui.chatting.viewitems.as asVar, boolean z17, e31.j jVar, boolean z18) {
        boolean z19 = !jVar.f247075a;
        boolean z27 = jVar.f247076b;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", "handleAppBrandMsgLogic isTmpBanned: %b, isNewTmpl: %b, templateId: %s, templateTitle: %s, isSwitchOpened: %b", java.lang.Boolean.valueOf(z19), java.lang.Boolean.valueOf(z18), this.H, this.N, java.lang.Boolean.valueOf(z27));
        asVar.S.setVisibility(8);
        if (z19 || (z18 && !z27)) {
            v1(asVar, 0, map);
            asVar.T.setText(this.f203175s.s().getString(z18 ? com.tencent.mm.R.string.hda : com.tencent.mm.R.string.f492656hd4));
        } else {
            v1(asVar, 8, map);
            asVar.T.setText(this.f203175s.s().getString(z18 ? com.tencent.mm.R.string.hd_ : com.tencent.mm.R.string.hcd));
        }
        asVar.S.setTag(com.tencent.mm.R.id.k7s, f9Var);
        if (jVar.f247077c) {
            asVar.f203435r.setVisibility(0);
        } else {
            asVar.f203435r.setVisibility(8);
        }
    }

    public final void f1(com.tencent.mm.ui.chatting.viewitems.xq xqVar, java.util.Map map, rd5.d dVar) {
        java.lang.Integer num;
        com.tencent.mm.ui.chatting.viewitems.as asVar;
        java.lang.Object obj;
        com.tencent.mm.storage.f9 f9Var;
        java.lang.String str;
        boolean z17;
        com.tencent.mm.ui.chatting.viewitems.as asVar2;
        com.tencent.mm.storage.f9 f9Var2;
        this.S = false;
        java.lang.String str2 = (java.lang.String) map.get(".msg.fromusername");
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            str2 = "";
        }
        boolean Bi = ((com.tencent.mm.plugin.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Bi(str2);
        boolean z19 = true;
        j31.c cVar = this.X;
        if (Bi) {
            com.tencent.mm.storage.f9 f9Var3 = dVar.f394254d.f445300b;
            com.tencent.mm.ui.chatting.viewitems.as asVar3 = xqVar.f206008d;
            boolean h17 = h1(a1(map));
            if ("notifymessage".equals(f9Var3.Q0())) {
                this.S = true;
                java.lang.String str3 = (java.lang.String) map.get(".msg.fromusername");
                java.lang.String str4 = str3 == null ? "" : str3;
                com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.mmreader.template_detail.template_ext.is_audio_template"), 0);
                cVar.getClass();
                cVar.f297369a = str4;
                cVar.f297370b = 2;
                ((com.tencent.mm.ui.chatting.component.y4) ((yn.j) this.f203175s.f460708c.a(yn.j.class))).b(this.D);
                this.C.alive();
                if (h17) {
                    k91.v5 Bi2 = ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Bi(str4);
                    if (Bi2 != null) {
                        this.I = Bi2.field_appId;
                    } else {
                        ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Di(str4, new com.tencent.mm.ui.chatting.viewitems.qi(this));
                    }
                    asVar3.S.setVisibility(8);
                    v1(asVar3, 8, map);
                    asVar3.T.setText(this.f203175s.s().getString(com.tencent.mm.R.string.hd_));
                    e31.j jVar = this.G;
                    jVar.f247075a = true;
                    jVar.f247076b = true;
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", "try2HandleAppBrandLogic, getSubscribeStatus username %s, templateId: %s", str4, this.H);
                    java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(xqVar);
                    g31.a aVar = g31.l.f268085h;
                    aVar.b(this.H, asVar3.S.hashCode() + "");
                    f9Var2 = f9Var3;
                    aVar.a(this.H, asVar3.S.hashCode() + "", new com.tencent.mm.ui.chatting.viewitems.ri(this, str4, weakReference, map, f9Var2, dVar));
                    this.M.d(str4, this.H);
                    asVar2 = asVar3;
                } else {
                    asVar2 = asVar3;
                    f9Var2 = f9Var3;
                    this.G.f247076b = false;
                    k91.v5 Bi3 = ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Bi(str4);
                    if (Bi3 != null) {
                        this.I = Bi3.field_appId;
                        this.G.f247075a = !((Bi3.field_appOpt & 1) > 0);
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", "try2HandleAppBrandLogic, sync attr username %s", str4);
                        this.G.f247075a = true;
                        ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Di(str4, new com.tencent.mm.ui.chatting.viewitems.ti(this, map, f9Var2, asVar2, xqVar, dVar, str4));
                    }
                    e1(map, f9Var2, asVar2, true, this.G, false);
                }
            } else {
                asVar2 = asVar3;
                f9Var2 = f9Var3;
            }
            android.view.View view = asVar2.f203429l;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "try2HandleAppBrandLogic", "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingItemHolder;Ljava/util/Map;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "try2HandleAppBrandLogic", "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingItemHolder;Ljava/util/Map;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            asVar2.f203429l.setTag(com.tencent.mm.R.id.k8v, f9Var2);
            com.tencent.mm.ui.chatting.viewitems.uj ujVar = new com.tencent.mm.ui.chatting.viewitems.uj(this, asVar2);
            this.f203177u = ujVar;
            asVar2.f203429l.setOnClickListener(ujVar);
            return;
        }
        if (!r01.z.n(str2)) {
            xqVar.f206008d.S.setVisibility(8);
            v1(xqVar.f206008d, 8, map);
            return;
        }
        com.tencent.mm.storage.f9 f9Var4 = dVar.f394254d.f445300b;
        this.S = true;
        com.tencent.mm.ui.chatting.viewitems.as asVar4 = xqVar.f206008d;
        boolean equals = "notifymessage".equals(f9Var4.Q0());
        e31.k kVar = this.L;
        if (!equals) {
            obj = ".msg.fromusername";
            num = 0;
            z17 = true;
            f9Var = f9Var4;
            asVar = asVar4;
            str = "MicroMsg.ChattingItemDyeingTemplate";
            z19 = false;
        } else if (h1(this.P)) {
            java.lang.String str5 = (java.lang.String) map.get(".msg.fromusername");
            java.lang.String str6 = str5 == null ? "" : str5;
            cVar.getClass();
            cVar.f297369a = str6;
            cVar.f297370b = 1;
            java.lang.String str7 = this.H;
            if (str7 == null) {
                str7 = "";
            }
            cVar.f297371c = str7;
            cVar.f297372d = this.P;
            java.lang.String str8 = this.N;
            if (str8 == null) {
                str8 = "";
            }
            cVar.f297373e = str8;
            asVar4.S.setVisibility(8);
            v1(asVar4, 8, map);
            asVar4.T.setText(this.f203175s.s().getString(com.tencent.mm.R.string.hd_));
            java.lang.ref.WeakReference weakReference2 = new java.lang.ref.WeakReference(xqVar);
            g31.a aVar2 = g31.l.f268085h;
            aVar2.b(this.H, asVar4.S.hashCode() + "");
            java.lang.String str9 = str6;
            num = 0;
            asVar = asVar4;
            obj = ".msg.fromusername";
            f9Var = f9Var4;
            str = "MicroMsg.ChattingItemDyeingTemplate";
            aVar2.a(this.H, asVar4.S.hashCode() + "", new com.tencent.mm.ui.chatting.viewitems.ei(this, map, f9Var4, weakReference2, dVar, str9));
            kVar.d(str9, this.H);
            z19 = true;
            z17 = true;
        } else {
            this.S = false;
            obj = ".msg.fromusername";
            z17 = false;
            num = 0;
            f9Var = f9Var4;
            asVar = asVar4;
            str = "MicroMsg.ChattingItemDyeingTemplate";
        }
        if (!z19 || !z17) {
            asVar.S.setVisibility(8);
            v1(asVar, 8, map);
            if (g1(map)) {
                java.lang.ref.WeakReference weakReference3 = new java.lang.ref.WeakReference(asVar);
                g31.a aVar3 = g31.l.f268085h;
                aVar3.b(this.H, asVar.S.hashCode() + "");
                aVar3.a(this.H, asVar.S.hashCode() + "", new com.tencent.mm.ui.chatting.viewitems.fi(this, map, weakReference3));
                java.lang.String str10 = (java.lang.String) map.get(obj);
                ((g31.l) kVar).q(str10 != null ? str10 : "", this.H, Y0(map));
            } else {
                com.tencent.mars.xlog.Log.i(str, "business type is unavailable, ignore");
            }
        }
        if (z19 && z17) {
            android.view.View view2 = asVar.f203429l;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(num);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "try2HandleBrandSubscribeMsgLogic", "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingItemHolder;Ljava/util/Map;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "try2HandleBrandSubscribeMsgLogic", "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingItemHolder;Ljava/util/Map;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            asVar.f203429l.setTag(com.tencent.mm.R.id.k8v, f9Var);
            com.tencent.mm.ui.chatting.viewitems.uj ujVar2 = new com.tencent.mm.ui.chatting.viewitems.uj(this, asVar);
            this.f203177u = ujVar2;
            asVar.f203429l.setOnClickListener(ujVar2);
        }
    }

    public final boolean g1(java.util.Map map) {
        int Y0 = Y0(map);
        return Y0 == 5 || Y0 == 4;
    }

    public final boolean h1(int i17) {
        return i17 == 2 || i17 == 3 || i17 == 6 || i17 == 7;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public com.tencent.mm.storage.a9 i(com.tencent.mm.storage.f9 f9Var, android.content.Context context, yb5.q qVar, yb5.a aVar) {
        com.tencent.mm.storage.a9 a9Var;
        if (!this.f203174p1 || f9Var == null || (a9Var = f9Var.f193927g2) == null) {
            return null;
        }
        return a9Var;
    }

    public final void i1(java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject) {
        qk.o oVar;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String trim = (str == null ? "" : str).trim();
        if (com.tencent.mm.sdk.platformtools.t8.K0(trim)) {
            oVar = null;
        } else {
            oVar = r01.z.b(trim);
            if (oVar == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ChattingItemDyeingTemplate", "prepare to launch weapp, but bizInfo is null, username: %s", trim);
                com.tencent.mm.ui.chatting.viewitems.c.a(10);
                km5.d h17 = ((km5.q) km5.u.d()).h(new com.tencent.mm.ui.chatting.viewitems.ci(this)).i(new com.tencent.mm.ui.chatting.viewitems.bi(this, trim)).n(new com.tencent.mm.ui.chatting.viewitems.ai(this, trim)).h(new com.tencent.mm.ui.chatting.viewitems.zh(this));
                lm5.j jVar = lm5.d.f319600a;
                km5.q qVar = (km5.q) h17;
                qVar.t(jVar, new com.tencent.mm.ui.chatting.viewitems.yh(this));
                qVar.b(jVar, new com.tencent.mm.ui.chatting.viewitems.di(this, trim, str2, i17, i18, str3, appBrandStatObject));
                com.tencent.mm.ui.chatting.viewitems.c.a(0);
            }
        }
        java.lang.String str4 = oVar != null ? oVar.field_appId : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", "prepare to launch weapp, from(username:%s, appId:%s), weappUsername:%s", trim, str4, str2);
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).Vi(this.f203175s.g(), str2, null, i17, i18, str3, appBrandStatObject, str4);
        com.tencent.mm.ui.chatting.viewitems.c.a(1);
        com.tencent.mm.ui.chatting.viewitems.c.a(0);
    }

    public final void j1(android.widget.ImageView imageView, java.lang.String str, int i17, int i18) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || imageView == null) {
            return;
        }
        o11.f fVar = new o11.f();
        fVar.f342083g = g83.a.b();
        fVar.f342078b = true;
        fVar.f342095s = true;
        fVar.f342086j = i17;
        fVar.f342087k = i18;
        n11.a.b().h(str, imageView, fVar.a());
    }

    public final void k1(java.util.Map map, e31.j jVar, java.lang.String str, boolean z17, boolean z18, boolean z19) {
        com.tencent.mm.msgsubscription.SubscribeMsgTmpItem subscribeMsgTmpItem = new com.tencent.mm.msgsubscription.SubscribeMsgTmpItem(this.H, Z0((java.lang.String) map.get(".msg.appmsg.mmreader.template_detail.new_tmpl_type")), (jVar.f247075a || z17 || z18) ? 1 : 0, jVar.f247076b);
        subscribeMsgTmpItem.f71814t = jVar.f247077c;
        subscribeMsgTmpItem.f71817w = jVar.f247079e;
        subscribeMsgTmpItem.f71808n = jVar.f247076b;
        subscribeMsgTmpItem.f71815u = z17;
        subscribeMsgTmpItem.f71818x = z18;
        subscribeMsgTmpItem.A = jVar.f247085k;
        this.M.h(str, subscribeMsgTmpItem, new com.tencent.mm.ui.chatting.viewitems.hh(this, z19, z18));
    }

    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x08dc  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x083f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x082e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x081f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0839  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0851  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x095d  */
    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 r43, final yb5.d r44, rd5.d r45, final java.lang.String r46) {
        /*
            Method dump skipped, instructions count: 2704
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.l(com.tencent.mm.ui.chatting.viewitems.g0, yb5.d, rd5.d, java.lang.String):void");
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void n(com.tencent.mm.ui.chatting.viewitems.g0 g0Var, yb5.d dVar, com.tencent.mm.storage.f9 f9Var, java.lang.String str) {
        if (str == null || g0Var.userTV == null) {
            return;
        }
        java.lang.CharSequence s07 = ((com.tencent.mm.ui.chatting.component.q2) ((sb5.n) dVar.f460708c.a(sb5.n.class))).s0(str);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.app.Activity g17 = dVar.g();
        float textSize = g0Var.userTV.getTextSize();
        ((ke0.e) xVar).getClass();
        X(g0Var, com.tencent.mm.pluginsdk.ui.span.c0.j(g17, s07, textSize));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n1(int r26, java.util.Map r27, java.lang.String r28, int r29) {
        /*
            r25 = this;
            java.lang.String r1 = ""
            r0 = 4
            r2 = r26
            if (r2 != r0) goto Lb6
            r2 = 0
            java.lang.String r0 = ".msg.appmsg.mmreader.category.item.general_string"
            r4 = r27
            java.lang.Object r0 = r4.get(r0)     // Catch: java.lang.Exception -> L3c
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L3c
            boolean r4 = com.tencent.mm.sdk.platformtools.t8.f192989a     // Catch: java.lang.Exception -> L3c
            if (r0 != 0) goto L18
            r0 = r1
        L18:
            cl0.g r4 = new cl0.g     // Catch: java.lang.Exception -> L3c
            r4.<init>(r0)     // Catch: java.lang.Exception -> L3c
            java.lang.String r0 = "live_id"
            java.lang.String r0 = r4.optString(r0)     // Catch: java.lang.Exception -> L3c
            long r2 = pm0.v.Z(r0)     // Catch: java.lang.Exception -> L3c
            java.lang.String r0 = "force_push_info"
            java.lang.String r0 = r4.optString(r0)     // Catch: java.lang.Exception -> L3c
            if (r0 == 0) goto L4c
            cl0.g r4 = new cl0.g     // Catch: java.lang.Exception -> L3c
            r4.<init>(r0)     // Catch: java.lang.Exception -> L3c
            java.lang.String r0 = "forcePushId"
            java.lang.String r0 = r4.optString(r0)     // Catch: java.lang.Exception -> L3c
            r1 = r0
            goto L4c
        L3c:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r4 = "MicroMsg.ChattingItemDyeingTemplate"
            java.lang.String r5 = "opExtraInfo, liveId, crash: %s"
            com.tencent.mars.xlog.Log.e(r4, r5, r0)
        L4c:
            r13 = r1
            r9 = r2
            java.lang.Class<n30.q> r0 = n30.q.class
            i95.m r0 = i95.n0.c(r0)
            n30.q r0 = (n30.q) r0
            java.lang.Class<n30.r> r1 = n30.r.class
            i95.m r1 = i95.n0.c(r1)
            n30.r r1 = (n30.r) r1
            m30.m r1 = (m30.m) r1
            r1.getClass()
            java.lang.String r1 = b52.b.q(r9)
            m30.m r0 = (m30.m) r0
            r0.getClass()
            boolean r0 = a52.a.f1581i
            java.util.List r2 = a52.a.f1580h
            if (r0 != 0) goto L78
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r2.clear()
            goto L85
        L78:
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            boolean r0 = r2.contains(r1)
            if (r0 == 0) goto L82
            r0 = 1
            goto L86
        L82:
            r2.add(r1)
        L85:
            r0 = 0
        L86:
            if (r0 == 0) goto L89
            return
        L89:
            java.lang.Class<c50.c1> r0 = c50.c1.class
            i95.m r0 = i95.n0.c(r0)
            c50.c1 r0 = (c50.c1) r0
            ml2.i5 r7 = ml2.i5.f327573h
            r11 = 0
            java.lang.String r12 = ""
            r1 = 1
            java.lang.Long r14 = java.lang.Long.valueOf(r1)
            java.lang.String r15 = ""
            java.lang.String r16 = ""
            java.lang.String r17 = ""
            java.lang.String r18 = ""
            java.lang.String r19 = ""
            java.lang.String r20 = ""
            r21 = 0
            r23 = 0
            java.lang.String r24 = ""
            r6 = r0
            ml2.r0 r6 = (ml2.r0) r6
            r8 = r28
            r6.nj(r7, r8, r9, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r23, r24)
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.n1(int, java.util.Map, java.lang.String, int):void");
    }

    public final void o1(int i17, java.util.Map map, java.lang.String str) {
        p1(i17, map, str, "", "");
    }

    public final void p1(int i17, java.util.Map map, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String str4 = (java.lang.String) map.get(".msg.appmsg.mmreader.template_header.transaction_id");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String str5 = str4 == null ? "" : str4;
        java.lang.String str6 = (java.lang.String) map.get(".msg.appmsg.mmreader.template_header.finder_user_name");
        java.lang.String str7 = str6 == null ? "" : str6;
        java.lang.String str8 = (java.lang.String) map.get(".msg.appmsg.mmreader.template_header.finder_feedid");
        java.lang.String str9 = !com.tencent.mm.sdk.platformtools.t8.K0(str2) ? str2 : str8 != null ? str8 : "";
        if (com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
            return;
        }
        q1(i17, str5, str7, str9, str, str3);
    }

    public final void q1(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(22516, java.lang.Integer.valueOf(i17), str, java.lang.Integer.valueOf(!com.tencent.mm.sdk.platformtools.t8.K0(str2) ? 1 : 0), str2, str3, str4, str5);
    }

    public final void r1(boolean z17, com.tencent.mm.storage.f9 f9Var, java.util.Map map, java.lang.String str) {
        boolean z18;
        boolean z19;
        boolean t07 = ((com.tencent.mm.ui.chatting.component.n7) ((sb5.g0) this.f203175s.f460708c.a(sb5.g0.class))).t0();
        int i17 = z17 ? 14 : 13;
        int W0 = t07 ? 2 : W0();
        if (z17) {
            z18 = z17;
        } else {
            sb5.y1 y1Var = (sb5.y1) this.f203175s.f460708c.a(sb5.y1.class);
            if (y1Var != null) {
                com.tencent.mm.ui.chatting.component.wk wkVar = (com.tencent.mm.ui.chatting.component.wk) y1Var;
                if (!wkVar.m0(f9Var.getMsgId(), 11608)) {
                    wkVar.n0(f9Var.getMsgId(), 11608);
                    z19 = true;
                    z18 = !z19 || y1Var == null;
                }
            }
            z19 = z17;
            if (z19) {
            }
        }
        j31.c cVar = this.X;
        if (z18) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11608, this.H, str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.P), this.N, java.lang.Integer.valueOf(Y0(map)), java.lang.Integer.valueOf(W0), cVar.f297374f, java.lang.Integer.valueOf(F1(cVar.f297375g)), cVar.f297376h, cVar.f297380l, java.lang.Integer.valueOf(b1()));
        }
        tb5.o0.c(this.f203175s, f9Var, map, i17);
        if (h1(this.P) && com.tencent.mm.storage.z3.j4(f9Var.Q0())) {
            j31.e.a(i17, cVar, Y0(map), W0, te5.v1.f418758b);
        }
    }

    public final void s1(int i17, java.lang.String str, java.lang.String str2) {
        t1(i17, str, str2, -1L);
    }

    public final void t0(com.tencent.mm.ui.widget.dialog.k0 k0Var, db5.g4 g4Var, java.lang.String str, boolean z17, boolean z18, boolean z19) {
        android.view.MenuItem f17;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", "addAppBrandSubscribeOperateMenu title: %s", this.N);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.Z) || this.P == 7) {
            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.p5b);
            f17 = this.f203173p0 == 0 ? g4Var.f(1, java.lang.String.format(this.f203175s.s().getString(com.tencent.mm.R.string.p5a), string)) : g4Var.d(0, this.f203175s.s().getColor(com.tencent.mm.R.color.f479482a31), java.lang.String.format(this.f203175s.s().getString(com.tencent.mm.R.string.p5_), string));
        } else if (!z17 || (z19 && !z18)) {
            f17 = g4Var.f(1, z19 ? java.lang.String.format(this.f203175s.s().getString(com.tencent.mm.R.string.hd7), this.N) : this.f203175s.s().getString(com.tencent.mm.R.string.hd8));
        } else {
            f17 = g4Var.d(0, this.f203175s.s().getColor(com.tencent.mm.R.color.f479482a31), z19 ? java.lang.String.format(this.f203175s.s().getString(com.tencent.mm.R.string.hcg), this.N) : this.f203175s.s().getString(com.tencent.mm.R.string.hci));
        }
        if (f17 instanceof db5.h4) {
            ((db5.h4) f17).K = new com.tencent.mm.ui.chatting.viewitems.gi(this);
        }
        android.view.View inflate = com.tencent.mm.ui.id.b(this.f203175s.g()).inflate(com.tencent.mm.R.layout.f488594y4, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.nrc);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.nrb);
        com.tencent.mm.ui.bk.s0(textView.getPaint());
        k91.v5 Bi = ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Bi(str);
        java.lang.String str2 = Bi == null ? null : Bi.field_nickname;
        java.lang.String str3 = Bi != null ? Bi.field_brandIconURL : null;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.app.Activity g17 = this.f203175s.g();
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(g17, str2, textSize));
        o11.f fVar = new o11.f();
        fVar.f342097u = 0.0f;
        fVar.f342096t = false;
        fVar.f342091o = com.tencent.mm.R.drawable.bgo;
        n11.a.b().h(str3, imageView, fVar.a());
        k0Var.s(inflate, false);
    }

    public final void t1(int i17, java.lang.String str, java.lang.String str2, long j17) {
        sb5.y1 y1Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", "reportSubscribeMsgOp opType:%d, mTemplateType:%d, talker:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.P), str);
        if (h1(this.P) && com.tencent.mm.storage.z3.j4(str)) {
            if (i17 == 1 && (y1Var = (sb5.y1) this.f203175s.f460708c.a(sb5.y1.class)) != null) {
                com.tencent.mm.ui.chatting.component.wk wkVar = (com.tencent.mm.ui.chatting.component.wk) y1Var;
                if (wkVar.m0(j17, 21811)) {
                    return;
                } else {
                    wkVar.n0(j17, 21811);
                }
            }
            java.lang.String str3 = te5.v1.f418758b;
            j31.e eVar = j31.e.f297392a;
            j31.c reportInfo = this.X;
            kotlin.jvm.internal.o.g(reportInfo, "reportInfo");
            com.tencent.mars.xlog.Log.i("MicroMsg.SubscribeMsgReporter", "reportSubscribeMsgOpInNotifyMessage opType: %s, username: %s, jumpType: %s, jumpInfo: %s", java.lang.Integer.valueOf(i17), reportInfo.f297369a, java.lang.Integer.valueOf(reportInfo.f297375g), reportInfo.f297376h);
            jx3.f fVar = jx3.f.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[28];
            objArr[0] = reportInfo.f297369a;
            objArr[1] = reportInfo.f297371c;
            objArr[2] = java.lang.Integer.valueOf(reportInfo.f297372d);
            objArr[3] = reportInfo.f297373e;
            objArr[4] = reportInfo.f297374f;
            objArr[5] = java.lang.Integer.valueOf(i17);
            objArr[6] = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
            objArr[7] = java.lang.Integer.valueOf(reportInfo.f297375g);
            objArr[8] = reportInfo.f297376h;
            objArr[9] = java.lang.Integer.valueOf(reportInfo.f297370b);
            objArr[10] = 0;
            objArr[11] = 0;
            objArr[12] = java.lang.Integer.valueOf(reportInfo.f297377i);
            objArr[13] = java.lang.Integer.valueOf(reportInfo.f297378j);
            objArr[14] = java.lang.Integer.valueOf(reportInfo.f297379k);
            objArr[15] = reportInfo.f297380l;
            objArr[16] = java.lang.Integer.valueOf(reportInfo.f297381m);
            objArr[17] = reportInfo.f297383o;
            objArr[18] = reportInfo.f297382n;
            objArr[19] = str3;
            objArr[20] = i17 == 17 ? reportInfo.f297384p : null;
            objArr[21] = reportInfo.f297385q;
            objArr[22] = java.lang.Integer.valueOf(reportInfo.f297386r);
            objArr[23] = java.lang.Integer.valueOf(reportInfo.f297387s);
            objArr[24] = java.lang.Integer.valueOf(reportInfo.f297388t);
            objArr[25] = reportInfo.f297389u;
            objArr[26] = java.lang.Integer.valueOf(reportInfo.f297390v);
            objArr[27] = reportInfo.f297391w;
            fVar.d(21811, objArr);
        }
    }

    public final void u0(int i17, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13796, java.lang.Integer.valueOf(i17), str, str2, 0, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()));
    }

    public final void u1(android.widget.ImageView imageView) {
        if (imageView != null) {
            imageView.setTag(com.tencent.mm.R.id.k7p, "");
            imageView.setImageBitmap(null);
            imageView.setVisibility(8);
        }
    }

    public final boolean v0(java.util.Map map) {
        com.tencent.mm.storage.z3 n17;
        if (!((g31.l) this.L).f268094g || !this.G.f247081g) {
            return false;
        }
        java.lang.String str = (java.lang.String) map.get(".msg.fromusername");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || !g1(map) || com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.mmreader.template_detail.template_show_type"), 0) == 0) {
            return false;
        }
        return (((zv.o0) ((bw.j) i95.n0.c(bw.j.class))).Ri(this.f203175s.x()) || com.tencent.mm.storage.z3.F4(this.f203175s.x())) && (n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(str, true)) != null && n17.r2() && !n17.w2() && c01.e2.P(n17);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00af, code lost:
    
        if (r9.f247075a != false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v1(com.tencent.mm.ui.chatting.viewitems.as r7, int r8, java.util.Map r9) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.v1(com.tencent.mm.ui.chatting.viewitems.as, int, java.util.Map):void");
    }

    public final boolean w0(java.util.Map map, int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(".msg.appmsg.mmreader.template_detail.opitems.opitem");
        sb6.append(i17 == 0 ? "" : java.lang.Integer.valueOf(i17));
        sb6.append(".device_list.device");
        java.lang.String sb7 = sb6.toString();
        int i18 = 0;
        do {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(sb7);
            sb8.append(i18 == 0 ? "" : java.lang.Integer.valueOf(i18));
            java.lang.String sb9 = sb8.toString();
            if (!map.containsKey(sb9)) {
                return false;
            }
            if (com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(sb9 + ".device_type"), 0) == 2) {
                int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(sb9 + ".device_op_type"), 0);
                java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
                sb10.append(sb9);
                sb10.append(".device_client_version");
                return P == 1 && o45.wf.f343029g >= com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(sb10.toString()), 0);
            }
            i18++;
        } while (i18 <= 10);
        return false;
    }

    public final void w1(android.view.View view, cl0.g gVar) {
        if (gVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemDyeingTemplate", "json data is null");
            view.setOnClickListener(null);
            return;
        }
        final java.lang.String optString = gVar.optString("author_finder_username");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            view.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate$$d
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate = com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.this;
                    chattingItemDyeingTemplate.getClass();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.String authorFinderUsername = optString;
                    arrayList.add(authorFinderUsername);
                    arrayList.add(view2);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", chattingItemDyeingTemplate, array);
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("key_member_inlet_source", 11);
                    ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                    android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    kotlin.jvm.internal.o.g(context, "context");
                    kotlin.jvm.internal.o.g(authorFinderUsername, "authorFinderUsername");
                    ((com.tencent.mm.plugin.finder.assist.i0) ((c61.ub) i95.n0.c(c61.ub.class))).Nk(context, intent, authorFinderUsername, 0, 0);
                    chattingItemDyeingTemplate.s1(3, chattingItemDyeingTemplate.f203175s.x(), "");
                    yj0.a.h(chattingItemDyeingTemplate, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemDyeingTemplate", "can't parse params object");
            view.setOnClickListener(null);
        }
    }

    public final void x0(com.tencent.mm.ui.chatting.viewitems.er erVar, int i17, java.lang.String str) {
        com.tencent.mm.storage.f9 c17;
        if (erVar == null || i17 != 1 || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        java.lang.String str2 = erVar.f203906b;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", "checkDeletePayTopMsg，username：%s", str2);
        if (!"gh_f0a92aa7146c".equals(str2) || (c17 = erVar.c()) == null) {
            return;
        }
        java.lang.String Q0 = c17.Q0();
        java.lang.String l17 = java.lang.Long.toString(c17.I0());
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", "checkDeletePayTopMsg，username：%s，svrId: %s", Q0, l17);
        if (com.tencent.mm.sdk.platformtools.t8.K0(Q0) || com.tencent.mm.sdk.platformtools.t8.K0(l17)) {
            return;
        }
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_REPORT_LAST_TIME_REPORT_DYNACFG_VER_LONG;
        Q0.getClass();
        if (!Q0.equals("gh_f0a92aa7146c")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", "unknown msgUsername");
            return;
        }
        com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.USERINFO_WALLET_COLLECT_TOPMSG_STRING_SYNC;
        gm0.j1.i();
        java.lang.String str3 = (java.lang.String) gm0.j1.u().c().m(u3Var2, "");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            return;
        }
        r45.j67 j67Var = new r45.j67();
        try {
            j67Var.parseFrom(str3.getBytes(java.nio.charset.StandardCharsets.ISO_8859_1));
            java.util.LinkedList linkedList = j67Var.f377616e;
            if (linkedList == null || linkedList.size() <= 0) {
                return;
            }
            java.util.Iterator it = j67Var.f377616e.iterator();
            while (it.hasNext()) {
                r45.i67 i67Var = (r45.i67) it.next();
                if (i67Var.f376769d.equals(l17)) {
                    ((li3.g) ((h45.s) i95.n0.c(h45.s.class))).Ni(Q0, i67Var);
                    return;
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemDyeingTemplate", "parse cacheString exp：%s", e17.getLocalizedMessage());
        }
    }

    public final void x1(android.view.View view, cl0.g gVar) {
        if (gVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemDyeingTemplate", "json data is null");
            view.setOnClickListener(null);
            return;
        }
        final java.lang.String optString = gVar.optString("aigc_task_id");
        final int optInt = gVar.optInt("aigc_task_status", 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", "[FinderPublisherEditingPage] aigcTaskId:" + optString + " aigcTaskStatus:" + optInt);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            view.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate$$c
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate = com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.this;
                    chattingItemDyeingTemplate.getClass();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.String str = optString;
                    arrayList.add(str);
                    int i17 = optInt;
                    arrayList.add(java.lang.Integer.valueOf(i17));
                    arrayList.add(view2);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", chattingItemDyeingTemplate, array);
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", "[FinderPublisherEditingPage] onClick aigcTaskId:" + str);
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("KEY_FINDER_POST_OPEN_AIGC_DRAFT_PREVIEW_ONLY", true);
                    intent.putExtra("KEY_FINDER_POST_ASYNC_AIGC_TASK_ID", str);
                    intent.putExtra("KEY_FINDER_POST_ASYNC_AIGC_TASK_STATUS", i17);
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).wj(chattingItemDyeingTemplate.f203175s.g(), intent);
                    yj0.a.h(chattingItemDyeingTemplate, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemDyeingTemplate", "can't parse params object");
            view.setOnClickListener(null);
        }
    }

    public final android.view.View y0(java.lang.String str) {
        android.view.View inflate = com.tencent.mm.ui.id.b(this.f203175s.g()).inflate(com.tencent.mm.R.layout.f488594y4, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.nrc);
        com.tencent.mm.ui.bk.s0(textView.getPaint());
        java.lang.CharSequence s07 = ((com.tencent.mm.ui.chatting.component.q2) ((sb5.n) this.f203175s.f460708c.a(sb5.n.class))).s0(str);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.app.Activity g17 = this.f203175s.g();
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(g17, s07, textSize));
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ri((android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.nrb), str, 0.1f);
        return inflate;
    }

    public final void y1(android.view.View view, final cl0.g gVar) {
        final android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", gVar.optString("appid"));
        bundle.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, gVar.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH));
        bundle.putString("query", gVar.optString("query"));
        bundle.putString("minVersion", gVar.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_MIN_VERSION));
        bundle.putBoolean("isHalfScreen", gVar.optInt("open_type") == 2);
        bundle.putBoolean(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_TRANSPARENT, gVar.optBoolean("is_transparent"));
        bundle.putBoolean("forbidRightGesture", gVar.optBoolean("is_forbid_rightgesture"));
        bundle.putDouble("heightPercent", gVar.optDouble(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_HEIGHT_PERCENT));
        view.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate$$b
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                android.os.Bundle bundle2 = bundle;
                com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate = com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.this;
                chattingItemDyeingTemplate.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(bundle2);
                cl0.g gVar2 = gVar;
                arrayList.add(gVar2);
                arrayList.add(view2);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", chattingItemDyeingTemplate, array);
                chattingItemDyeingTemplate.s1(3, chattingItemDyeingTemplate.f203175s.x(), "");
                ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(chattingItemDyeingTemplate.f203175s.g(), bundle2, true, false, new com.tencent.mm.ui.chatting.viewitems.sh(chattingItemDyeingTemplate, gVar2));
                yj0.a.h(chattingItemDyeingTemplate, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
    }

    public final void z0(java.util.Map map) {
        if (map == null) {
            return;
        }
        java.lang.String str = (java.lang.String) map.get(".msg.appmsg.mmreader.template_header.ecs_overall_jump_info");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        A0(str, "overall");
        for (int i17 = 0; i17 < 10; i17++) {
            java.lang.String str2 = i17 != 0 ? ".msg.appmsg.mmreader.template_detail.opitems.opitem" + i17 : ".msg.appmsg.mmreader.template_detail.opitems.opitem";
            java.lang.String str3 = (java.lang.String) map.get(str2 + ".word");
            java.lang.String str4 = (java.lang.String) map.get(str2 + ".ecs_jump_info");
            if (str4 == null) {
                str4 = "";
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(str3) && android.text.TextUtils.isEmpty(str4)) {
                return;
            }
            A0(str4, "opitem" + i17);
        }
    }

    public final void z1(android.view.View view, com.tencent.mm.storage.f9 f9Var, java.util.Map map, java.lang.String str, int i17, java.lang.String str2, int i18) {
        if (f9Var == null) {
            return;
        }
        if ("notifymessage".equals(f9Var.Q0()) || i17 == 10) {
            com.tencent.mm.ui.chatting.viewitems.er erVar = (com.tencent.mm.ui.chatting.viewitems.er) view.getTag();
            erVar.H = i17;
            erVar.I = str2;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("click_area_type", i18);
            bundle.putInt("is_top_msg", com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.mmreader.template_detail.is_top_msg"), 0));
            java.lang.String str3 = (java.lang.String) map.get(".msg.appmsg.mmreader.template_detail.top_msg_content");
            if (str3 == null) {
                str3 = "";
            }
            bundle.putString("top_msg_content", str3);
            erVar.f203904J = bundle;
            java.lang.String str4 = (java.lang.String) map.get(".msg.appmsg.mmreader.template_header.transaction_id");
            if (str4 == null) {
                str4 = "";
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                java.lang.String str5 = (java.lang.String) map.get(".msg.appmsg.mmreader.template_header.finder_user_name");
                if (str5 == null) {
                    str5 = "";
                }
                java.lang.String str6 = (java.lang.String) map.get(".msg.appmsg.mmreader.template_header.finder_feedid");
                java.lang.String str7 = str6 != null ? str6 : "";
                erVar.K = str4;
                erVar.L = str5;
                erVar.M = str7;
                j31.c cVar = this.X;
                cVar.getClass();
                cVar.f297382n = str7;
                if (com.tencent.mm.sdk.platformtools.t8.K0(cVar.f297369a)) {
                    cVar.getClass();
                    cVar.f297369a = str5;
                }
            }
            view.setTag(erVar);
            view.setOnClickListener(this.f203186z);
        }
    }
}
