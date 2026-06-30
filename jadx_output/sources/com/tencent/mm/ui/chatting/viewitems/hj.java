package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class hj implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f204116d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f204117e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f204118f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f204119g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f204120h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f204121i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f204122m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f204123n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f204124o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f204125p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f204126q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f204127r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f204128s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f204129t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f204130u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f204131v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate f204132w;

    public hj(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate, java.lang.String str, java.lang.String str2, java.util.Map map, java.lang.String str3, int i17, int i18, java.lang.String str4, int i19, int i27, com.tencent.mm.storage.f9 f9Var, int i28, java.lang.String str5, int i29, java.lang.String str6, java.lang.String str7, int i37) {
        this.f204132w = chattingItemDyeingTemplate;
        this.f204116d = str;
        this.f204117e = str2;
        this.f204118f = map;
        this.f204119g = str3;
        this.f204120h = i17;
        this.f204121i = i18;
        this.f204122m = str4;
        this.f204123n = i19;
        this.f204124o = i27;
        this.f204125p = f9Var;
        this.f204126q = i28;
        this.f204127r = str5;
        this.f204128s = i29;
        this.f204129t = str6;
        this.f204130u = str7;
        this.f204131v = i37;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$56", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.viewitems.er erVar = (com.tencent.mm.ui.chatting.viewitems.er) view.getTag();
        java.lang.String str = this.f204116d;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", "on app brand(%s) clickArea click", str);
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(erVar.c().I0());
        sb6.append(":");
        sb6.append(erVar.f203906b);
        sb6.append(":");
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate = this.f204132w;
        sb6.append(chattingItemDyeingTemplate.f203175s.x());
        sb6.append(":");
        java.lang.String str2 = this.f204117e;
        sb6.append(str2);
        appBrandStatObject.f87791g = sb6.toString();
        java.lang.String str3 = this.f204119g + ".ecs_jump_info";
        java.util.Map map = this.f204118f;
        java.lang.String str4 = (java.lang.String) map.get(str3);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str4 == null) {
            str4 = "";
        }
        if (android.text.TextUtils.isEmpty(str4)) {
            if (((com.tencent.mm.plugin.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Bi(erVar.f203906b)) {
                appBrandStatObject.f87790f = com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.d0(str2);
                l81.b1 b1Var = new l81.b1();
                b1Var.f317012a = str;
                b1Var.f317016c = this.f204120h;
                b1Var.f317018d = this.f204121i;
                b1Var.f317022f = this.f204122m;
                int i17 = this.f204123n;
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", "weappUseTransparentBackground:%d", java.lang.Integer.valueOf(i17));
                if (i17 == 1) {
                    b1Var.H = k91.z3.TRANSPARENT;
                    k91.y3 y3Var = k91.y3.DISABLED;
                    b1Var.S = y3Var;
                    b1Var.T = y3Var;
                }
                b1Var.a(appBrandStatObject);
                ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(chattingItemDyeingTemplate.f203175s.g(), b1Var);
            } else {
                appBrandStatObject.f87790f = 1043;
                this.f204132w.i1(erVar.f203906b, this.f204116d, this.f204120h, this.f204121i, this.f204122m, appBrandStatObject);
            }
        } else {
            chattingItemDyeingTemplate.b(str4, "ecs_jump_info_template_msg");
        }
        int i18 = this.f204124o;
        com.tencent.mm.storage.f9 f9Var = this.f204125p;
        if (i18 == 1) {
            com.tencent.mm.ui.chatting.viewitems.ar.f203405a.a(f9Var, java.lang.Integer.valueOf(this.f204126q));
        }
        tb5.a.f417025a.b(6, chattingItemDyeingTemplate.X, chattingItemDyeingTemplate.f203175s.x(), chattingItemDyeingTemplate.Y, 1L);
        chattingItemDyeingTemplate.u0(9, chattingItemDyeingTemplate.I, chattingItemDyeingTemplate.H);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.String str5 = chattingItemDyeingTemplate.H;
        java.lang.String str6 = this.f204127r;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f204128s);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(chattingItemDyeingTemplate.P);
        java.lang.String str7 = chattingItemDyeingTemplate.N;
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.Y0(map));
        java.lang.Integer valueOf4 = java.lang.Integer.valueOf(chattingItemDyeingTemplate.W0());
        j31.c cVar = chattingItemDyeingTemplate.X;
        java.lang.String str8 = cVar.f297374f;
        java.lang.Integer valueOf5 = java.lang.Integer.valueOf(chattingItemDyeingTemplate.F1(cVar.f297375g));
        j31.c cVar2 = chattingItemDyeingTemplate.X;
        g0Var.d(11608, str5, str6, valueOf, valueOf2, str7, valueOf3, valueOf4, str8, valueOf5, cVar2.f297376h, cVar2.f297380l, java.lang.Integer.valueOf(chattingItemDyeingTemplate.b1()));
        this.f204132w.p1(5, this.f204118f, this.f204129t, "", this.f204130u);
        chattingItemDyeingTemplate.s1(3, chattingItemDyeingTemplate.f203175s.x(), str);
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.e0(chattingItemDyeingTemplate, erVar, map);
        if (f9Var.B2()) {
            ((b00.a0) ((c00.u3) i95.n0.c(c00.u3.class))).aj("view_clk", f9Var, "ecs_kf_card_template_bt" + (this.f204131v + 1));
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$56", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
