package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class zi implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f206147d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f206148e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f206149f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f206150g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f206151h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f206152i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f206153m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f206154n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f206155o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate f206156p;

    public zi(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate, java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3, int i19, java.util.Map map, java.lang.String str4, com.tencent.mm.storage.f9 f9Var) {
        this.f206156p = chattingItemDyeingTemplate;
        this.f206147d = str;
        this.f206148e = str2;
        this.f206149f = i17;
        this.f206150g = i18;
        this.f206151h = str3;
        this.f206152i = i19;
        this.f206153m = map;
        this.f206154n = str4;
        this.f206155o = f9Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.Map map;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$50", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.viewitems.er erVar = (com.tencent.mm.ui.chatting.viewitems.er) view.getTag();
        java.lang.String str = this.f206147d;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", "on app brand(%s) tplButton1 click", str);
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(erVar.c().I0());
        sb6.append(":");
        sb6.append(erVar.f203906b);
        sb6.append(":");
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate = this.f206156p;
        sb6.append(chattingItemDyeingTemplate.f203175s.x());
        sb6.append(":");
        java.lang.String str2 = this.f206148e;
        sb6.append(str2);
        appBrandStatObject.f87791g = sb6.toString();
        boolean Bi = ((com.tencent.mm.plugin.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Bi(erVar.f203906b);
        java.util.Map map2 = this.f206153m;
        if (Bi) {
            appBrandStatObject.f87790f = com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.d0(str2);
            l81.b1 b1Var = new l81.b1();
            b1Var.f317012a = str;
            b1Var.f317016c = this.f206149f;
            b1Var.f317018d = this.f206150g;
            b1Var.f317022f = this.f206151h;
            int i17 = this.f206152i;
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", "weappUseTransparentBackground:%d", java.lang.Integer.valueOf(i17));
            if (i17 == 1) {
                b1Var.H = k91.z3.TRANSPARENT;
                k91.y3 y3Var = k91.y3.DISABLED;
                b1Var.S = y3Var;
                b1Var.T = y3Var;
            }
            b1Var.a(appBrandStatObject);
            final java.lang.String str3 = (java.lang.String) map2.get(".msg.appmsg.mmreader.template_detail.template_ext.native_extra_data");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str3 == null) {
                str3 = "";
            }
            if (!android.text.TextUtils.isEmpty(str3)) {
                b1Var.f317028i = new l81.p0() { // from class: com.tencent.mm.ui.chatting.viewitems.zi$$a
                    @Override // l81.p0
                    public final java.lang.String a() {
                        return str3;
                    }
                };
            }
            ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(chattingItemDyeingTemplate.f203175s.g(), b1Var);
            map = map2;
        } else {
            appBrandStatObject.f87790f = 1043;
            map = map2;
            this.f206156p.i1(erVar.f203906b, this.f206147d, this.f206149f, this.f206150g, this.f206151h, appBrandStatObject);
        }
        chattingItemDyeingTemplate.u0(9, chattingItemDyeingTemplate.I, chattingItemDyeingTemplate.H);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.String str4 = chattingItemDyeingTemplate.H;
        java.lang.String str5 = this.f206154n;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(chattingItemDyeingTemplate.P);
        java.lang.String str6 = chattingItemDyeingTemplate.N;
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.Y0(map));
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(chattingItemDyeingTemplate.W0());
        j31.c cVar = chattingItemDyeingTemplate.X;
        java.lang.String str7 = cVar.f297374f;
        java.lang.Integer valueOf4 = java.lang.Integer.valueOf(chattingItemDyeingTemplate.F1(cVar.f297375g));
        j31.c cVar2 = chattingItemDyeingTemplate.X;
        g0Var.d(11608, str4, str5, 1, valueOf, str6, valueOf2, valueOf3, str7, valueOf4, cVar2.f297376h, cVar2.f297380l, java.lang.Integer.valueOf(chattingItemDyeingTemplate.b1()));
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.g0(chattingItemDyeingTemplate, 7, erVar.c());
        tb5.a.f417025a.b(6, chattingItemDyeingTemplate.X, chattingItemDyeingTemplate.f203175s.x(), chattingItemDyeingTemplate.Y, 1L);
        yb5.d dVar = chattingItemDyeingTemplate.f203175s;
        com.tencent.mm.storage.f9 f9Var = this.f206155o;
        tb5.o0.c(dVar, f9Var, map, 3);
        chattingItemDyeingTemplate.s1(3, chattingItemDyeingTemplate.f203175s.x(), "");
        if (f9Var.B2()) {
            ((b00.a0) ((c00.u3) i95.n0.c(c00.u3.class))).aj("view_clk", f9Var, "ecs_kf_card_template_bt1");
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$50", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
