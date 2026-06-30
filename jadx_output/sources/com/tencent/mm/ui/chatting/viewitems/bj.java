package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class bj implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f203484d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f203485e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f203486f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f203487g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f203488h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f203489i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f203490m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f203491n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f203492o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate f203493p;

    public bj(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate, java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3, int i19, java.lang.String str4, java.util.Map map, com.tencent.mm.storage.f9 f9Var) {
        this.f203493p = chattingItemDyeingTemplate;
        this.f203484d = str;
        this.f203485e = str2;
        this.f203486f = i17;
        this.f203487g = i18;
        this.f203488h = str3;
        this.f203489i = i19;
        this.f203490m = str4;
        this.f203491n = map;
        this.f203492o = f9Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$52", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.viewitems.er erVar = (com.tencent.mm.ui.chatting.viewitems.er) view.getTag();
        java.lang.String str = this.f203484d;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", "on app brand(%s) tplButton2 click", str);
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(erVar.c().I0());
        sb6.append(":");
        sb6.append(erVar.f203906b);
        sb6.append(":");
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate = this.f203493p;
        sb6.append(chattingItemDyeingTemplate.f203175s.x());
        sb6.append(":");
        java.lang.String str2 = this.f203485e;
        sb6.append(str2);
        appBrandStatObject.f87791g = sb6.toString();
        if (((com.tencent.mm.plugin.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Bi(erVar.f203906b)) {
            appBrandStatObject.f87790f = com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.d0(str2);
            l81.b1 b1Var = new l81.b1();
            b1Var.f317012a = str;
            b1Var.f317016c = this.f203486f;
            b1Var.f317018d = this.f203487g;
            b1Var.f317022f = this.f203488h;
            int i17 = this.f203489i;
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
            this.f203493p.i1(erVar.f203906b, this.f203484d, this.f203486f, this.f203487g, this.f203488h, appBrandStatObject);
        }
        chattingItemDyeingTemplate.u0(9, chattingItemDyeingTemplate.I, chattingItemDyeingTemplate.H);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.String str3 = chattingItemDyeingTemplate.H;
        java.lang.String str4 = this.f203490m;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(chattingItemDyeingTemplate.P);
        java.lang.String str5 = chattingItemDyeingTemplate.N;
        java.util.Map map = this.f203491n;
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.Y0(map));
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(chattingItemDyeingTemplate.W0());
        j31.c cVar = chattingItemDyeingTemplate.X;
        java.lang.String str6 = cVar.f297374f;
        java.lang.Integer valueOf4 = java.lang.Integer.valueOf(chattingItemDyeingTemplate.F1(cVar.f297375g));
        j31.c cVar2 = chattingItemDyeingTemplate.X;
        g0Var.d(11608, str3, str4, 2, valueOf, str5, valueOf2, valueOf3, str6, valueOf4, cVar2.f297376h, cVar2.f297380l, java.lang.Integer.valueOf(chattingItemDyeingTemplate.b1()));
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.g0(chattingItemDyeingTemplate, 7, erVar.c());
        tb5.a.f417025a.b(6, chattingItemDyeingTemplate.X, chattingItemDyeingTemplate.f203175s.x(), chattingItemDyeingTemplate.Y, 1L);
        yb5.d dVar = chattingItemDyeingTemplate.f203175s;
        com.tencent.mm.storage.f9 f9Var = this.f203492o;
        tb5.o0.c(dVar, f9Var, map, 3);
        if (f9Var.B2()) {
            ((b00.a0) ((c00.u3) i95.n0.c(c00.u3.class))).aj("view_clk", f9Var, "ecs_kf_card_template_bt2");
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$52", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
