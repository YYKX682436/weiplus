package ut2;

/* loaded from: classes3.dex */
public final class p extends in5.r0 {
    public final android.widget.TextView A;
    public final android.widget.ImageView B;
    public final android.view.View C;
    public final android.widget.TextView D;
    public final android.widget.TextView E;
    public final com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView F;
    public final jz5.g G;
    public final jz5.g H;
    public final android.widget.TextView I;

    /* renamed from: J, reason: collision with root package name */
    public final android.widget.TextView f431026J;
    public final android.widget.TextView K;
    public final android.view.View L;

    /* renamed from: e, reason: collision with root package name */
    public final gk2.e f431027e;

    /* renamed from: f, reason: collision with root package name */
    public final tt2.e1 f431028f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.l f431029g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMRoundCornerImageView f431030h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f431031i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopPromoteContainer f431032m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f431033n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.TextView f431034o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.LinearLayout f431035p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f431036q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.TextView f431037r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View f431038s;

    /* renamed from: t, reason: collision with root package name */
    public final android.widget.LinearLayout f431039t;

    /* renamed from: u, reason: collision with root package name */
    public final android.widget.TextView f431040u;

    /* renamed from: v, reason: collision with root package name */
    public final android.widget.ImageView f431041v;

    /* renamed from: w, reason: collision with root package name */
    public final android.widget.LinearLayout f431042w;

    /* renamed from: x, reason: collision with root package name */
    public final android.widget.TextView f431043x;

    /* renamed from: y, reason: collision with root package name */
    public final android.widget.ImageView f431044y;

    /* renamed from: z, reason: collision with root package name */
    public final android.widget.LinearLayout f431045z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(android.view.View itemView, gk2.e liveData, tt2.e1 adapter, com.tencent.mm.plugin.finder.live.plugin.l lVar) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(liveData, "liveData");
        kotlin.jvm.internal.o.g(adapter, "adapter");
        this.f431027e = liveData;
        this.f431028f = adapter;
        this.f431029g = lVar;
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.f486441l74);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f431030h = (com.tencent.mm.ui.widget.MMRoundCornerImageView) findViewById;
        this.f431031i = jz5.h.b(new ut2.i(itemView));
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.lce);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f431032m = (com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopPromoteContainer) findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.obc);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f431033n = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = itemView.findViewById(com.tencent.mm.R.id.f486476lc3);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f431034o = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = itemView.findViewById(com.tencent.mm.R.id.uus);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f431035p = (android.widget.LinearLayout) findViewById5;
        android.view.View findViewById6 = itemView.findViewById(com.tencent.mm.R.id.jqq);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f431036q = findViewById6;
        android.view.View findViewById7 = itemView.findViewById(com.tencent.mm.R.id.jrw);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f431037r = (android.widget.TextView) findViewById7;
        android.view.View findViewById8 = itemView.findViewById(com.tencent.mm.R.id.vnq);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f431038s = findViewById8;
        android.view.View findViewById9 = itemView.findViewById(com.tencent.mm.R.id.f485364u64);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        this.f431039t = (android.widget.LinearLayout) findViewById9;
        android.view.View findViewById10 = itemView.findViewById(com.tencent.mm.R.id.u66);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        this.f431040u = (android.widget.TextView) findViewById10;
        android.view.View findViewById11 = itemView.findViewById(com.tencent.mm.R.id.f485365u65);
        kotlin.jvm.internal.o.f(findViewById11, "findViewById(...)");
        this.f431041v = (android.widget.ImageView) findViewById11;
        android.view.View findViewById12 = itemView.findViewById(com.tencent.mm.R.id.sfh);
        kotlin.jvm.internal.o.f(findViewById12, "findViewById(...)");
        this.f431042w = (android.widget.LinearLayout) findViewById12;
        android.view.View findViewById13 = itemView.findViewById(com.tencent.mm.R.id.sfj);
        kotlin.jvm.internal.o.f(findViewById13, "findViewById(...)");
        this.f431043x = (android.widget.TextView) findViewById13;
        android.view.View findViewById14 = itemView.findViewById(com.tencent.mm.R.id.sfi);
        kotlin.jvm.internal.o.f(findViewById14, "findViewById(...)");
        this.f431044y = (android.widget.ImageView) findViewById14;
        android.view.View findViewById15 = itemView.findViewById(com.tencent.mm.R.id.vmq);
        kotlin.jvm.internal.o.f(findViewById15, "findViewById(...)");
        this.f431045z = (android.widget.LinearLayout) findViewById15;
        android.view.View findViewById16 = itemView.findViewById(com.tencent.mm.R.id.vms);
        kotlin.jvm.internal.o.f(findViewById16, "findViewById(...)");
        this.A = (android.widget.TextView) findViewById16;
        android.view.View findViewById17 = itemView.findViewById(com.tencent.mm.R.id.vmr);
        kotlin.jvm.internal.o.f(findViewById17, "findViewById(...)");
        this.B = (android.widget.ImageView) findViewById17;
        android.view.View findViewById18 = itemView.findViewById(com.tencent.mm.R.id.f482987sd3);
        kotlin.jvm.internal.o.f(findViewById18, "findViewById(...)");
        this.C = findViewById18;
        android.view.View findViewById19 = itemView.findViewById(com.tencent.mm.R.id.hbp);
        kotlin.jvm.internal.o.f(findViewById19, "findViewById(...)");
        this.D = (android.widget.TextView) findViewById19;
        android.view.View findViewById20 = itemView.findViewById(com.tencent.mm.R.id.dke);
        kotlin.jvm.internal.o.f(findViewById20, "findViewById(...)");
        this.E = (android.widget.TextView) findViewById20;
        android.view.View findViewById21 = itemView.findViewById(com.tencent.mm.R.id.l7m);
        kotlin.jvm.internal.o.f(findViewById21, "findViewById(...)");
        this.F = (com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView) findViewById21;
        this.G = jz5.h.b(new ut2.j(itemView));
        this.H = jz5.h.b(new ut2.k(itemView));
        android.view.View findViewById22 = itemView.findViewById(com.tencent.mm.R.id.v4j);
        kotlin.jvm.internal.o.f(findViewById22, "findViewById(...)");
        this.I = (android.widget.TextView) findViewById22;
        android.view.View findViewById23 = itemView.findViewById(com.tencent.mm.R.id.v4i);
        kotlin.jvm.internal.o.f(findViewById23, "findViewById(...)");
        this.f431026J = (android.widget.TextView) findViewById23;
        android.view.View findViewById24 = itemView.findViewById(com.tencent.mm.R.id.sdj);
        kotlin.jvm.internal.o.f(findViewById24, "findViewById(...)");
        this.K = (android.widget.TextView) findViewById24;
        android.view.View findViewById25 = itemView.findViewById(com.tencent.mm.R.id.rc9);
        kotlin.jvm.internal.o.f(findViewById25, "findViewById(...)");
        this.L = findViewById25;
    }

    public static final void l(ut2.p pVar, r45.hw0 hw0Var, gk2.e eVar) {
        pVar.getClass();
        r45.ce0 ce0Var = (r45.ce0) hw0Var.getCustom(15);
        if (ce0Var != null) {
            i95.m c17 = i95.n0.c(c61.yb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            android.content.Context context = pVar.itemView.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            r45.ac4 ac4Var = new r45.ac4();
            ac4Var.set(1, (com.tencent.mm.protocal.protobuf.FinderJumpInfo) ce0Var.getCustom(9));
            c61.yb.Yi((c61.yb) c17, context, ac4Var, null, null, 8, null);
        }
    }

    public final boolean b() {
        if (zl2.r4.f473950a.w1()) {
            return true;
        }
        gk2.e eVar = gk2.e.f272471n;
        return eVar != null && ((mm2.c1) eVar.a(mm2.c1.class)).T;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(r45.hw0 r10, r45.bd5 r11, android.view.View r12, android.widget.TextView r13, android.widget.ImageView r14) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ut2.p.n(r45.hw0, r45.bd5, android.view.View, android.widget.TextView, android.widget.ImageView):void");
    }

    public final void o(cm2.i0 i0Var) {
        if (!((mm2.c1) this.f431027e.a(mm2.c1.class)).S) {
            android.view.View p17 = p();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/shopping/holder/FinderLiveBulkBuyViewHolder", "bindPromoteBtn", "(Lcom/tencent/mm/plugin/finder/live/view/convert/ShopWindowBulkBuyItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/shopping/holder/FinderLiveBulkBuyViewHolder", "bindPromoteBtn", "(Lcom/tencent/mm/plugin/finder/live/view/convert/ShopWindowBulkBuyItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View p18 = p();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/shopping/holder/FinderLiveBulkBuyViewHolder", "bindPromoteBtn", "(Lcom/tencent/mm/plugin/finder/live/view/convert/ShopWindowBulkBuyItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(p18, "com/tencent/mm/plugin/finder/shopping/holder/FinderLiveBulkBuyViewHolder", "bindPromoteBtn", "(Lcom/tencent/mm/plugin/finder/live/view/convert/ShopWindowBulkBuyItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (i0Var.f43354v.getInteger(14) == 1) {
            q().setText(this.itemView.getContext().getResources().getString(com.tencent.mm.R.string.eep));
            q().setTextColor(this.itemView.getContext().getResources().getColor(com.tencent.mm.R.color.f479100pz));
            p().setBackgroundResource(com.tencent.mm.R.drawable.a2z);
        } else {
            q().setText(this.itemView.getContext().getResources().getString(com.tencent.mm.R.string.eeo));
            q().setTextColor(this.itemView.getContext().getResources().getColor(com.tencent.mm.R.color.f478553an));
            p().setBackgroundResource(com.tencent.mm.R.drawable.a8d);
        }
        p().setOnClickListener(new ut2.h(this, i0Var));
    }

    public final android.view.View p() {
        java.lang.Object value = ((jz5.n) this.G).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final android.widget.TextView q() {
        java.lang.Object value = ((jz5.n) this.H).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.TextView) value;
    }

    public final void s(r45.hw0 hw0Var, long j17, java.lang.String str) {
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        ml2.b4 b4Var = ml2.b4.f327264s;
        cl0.g gVar = new cl0.g();
        ml2.f4 f4Var = ml2.f4.f327431e;
        gVar.o("commerceAction", 1081);
        boolean z17 = false;
        gVar.p(com.tencent.mm.opensdk.constants.ConstantsAPI.WXWebPage.KEY_ACTIVITY_ID, hw0Var.getLong(0));
        gVar.h("request_id", hw0Var.getString(23));
        gVar.h("extra_report_json", hw0Var.getString(22));
        if (j17 > 0) {
            gVar.p("productId", j17);
        }
        if (str.length() > 0) {
            gVar.h("btn_word", str);
        }
        r45.x23 x23Var = (r45.x23) hw0Var.getCustom(12);
        if (x23Var != null && x23Var.getInteger(0) == 2) {
            z17 = true;
        }
        gVar.r("if_require_explaining", z17);
        ml2.r0.hj(r0Var, b4Var, gVar.toString(), 0L, null, null, null, null, null, 252, null);
    }

    public final void v(boolean z17, so2.j5 j5Var, gk2.e liveData, com.tencent.mm.plugin.finder.live.plugin.l lVar) {
        kotlin.jvm.internal.o.g(liveData, "liveData");
        this.f431032m.d(z17, liveData, j5Var, lVar);
        if (z17) {
            android.view.View view = this.itemView;
            view.setBackground(view.getContext().getDrawable(com.tencent.mm.R.drawable.cjx));
        } else {
            android.view.View view2 = this.itemView;
            view2.setBackground(view2.getContext().getDrawable(com.tencent.mm.R.drawable.a8n));
        }
    }
}
