package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class co extends com.tencent.mm.plugin.luckymoney.ui.rm {
    public final android.widget.TextView A;
    public final android.widget.ImageView B;
    public final android.widget.TextView C;
    public final android.view.View D;
    public final android.widget.ImageView E;
    public final android.widget.ProgressBar F;
    public final android.widget.TextView G;
    public final android.widget.TextView H;
    public final android.widget.TextView I;

    /* renamed from: J, reason: collision with root package name */
    public final android.view.ViewGroup f146808J;
    public final android.widget.ProgressBar K;
    public final android.widget.Button L;
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI M;

    /* renamed from: e, reason: collision with root package name */
    public final int f146809e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f146810f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f146811g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageView f146812h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f146813i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.chatting.component.ListScrollPAGView f146814m;

    /* renamed from: n, reason: collision with root package name */
    public ym5.w1 f146815n;

    /* renamed from: o, reason: collision with root package name */
    public ym5.v1 f146816o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f146817p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f146818q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.chatting.component.ListScrollPAGView f146819r;

    /* renamed from: s, reason: collision with root package name */
    public ym5.w1 f146820s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View f146821t;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.ViewGroup f146822u;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View f146823v;

    /* renamed from: w, reason: collision with root package name */
    public final android.view.View f146824w;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.chatting.component.ListScrollPAGView f146825x;

    /* renamed from: y, reason: collision with root package name */
    public ym5.w1 f146826y;

    /* renamed from: z, reason: collision with root package name */
    public final android.view.View f146827z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public co(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI, android.view.View view, int i17) {
        super(view);
        this.M = luckyMoneyPickEnvelopeUI;
        this.f146817p = false;
        this.f146809e = i17;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.ij9);
        this.f146808J = viewGroup;
        this.f146810f = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.ik_);
        this.f146811g = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.ikh);
        this.f146812h = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.ikj);
        this.f146813i = view.findViewById(com.tencent.mm.R.id.f485674il1);
        this.f146814m = (com.tencent.mm.chatting.component.ListScrollPAGView) view.findViewById(com.tencent.mm.R.id.f485673il0);
        this.f146818q = view.findViewById(com.tencent.mm.R.id.ikw);
        this.f146819r = (com.tencent.mm.chatting.component.ListScrollPAGView) view.findViewById(com.tencent.mm.R.id.ikv);
        this.f146821t = view.findViewById(com.tencent.mm.R.id.iku);
        this.f146822u = (android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.ikg);
        this.f146823v = view.findViewById(com.tencent.mm.R.id.qun);
        this.f146824w = view.findViewById(com.tencent.mm.R.id.qum);
        this.f146825x = (com.tencent.mm.chatting.component.ListScrollPAGView) view.findViewById(com.tencent.mm.R.id.qul);
        this.f146827z = view.findViewById(com.tencent.mm.R.id.ij8);
        this.A = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.ike);
        this.B = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.ij7);
        this.C = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.ikt);
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.ikz);
        this.D = findViewById;
        this.E = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.iks);
        this.F = (android.widget.ProgressBar) view.findViewById(com.tencent.mm.R.id.ij6);
        this.G = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.ikx);
        this.H = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.ika);
        this.I = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.iky);
        android.widget.Button button = (android.widget.Button) view.findViewById(com.tencent.mm.R.id.ikf);
        this.L = button;
        java.lang.String o17 = com.tencent.mm.sdk.platformtools.m2.o(com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0), com.tencent.mm.sdk.platformtools.x2.f193071a);
        if (o17 == null || o17.length() <= 0 || (!o17.equals("zh_CN") && !o17.equals("zh_TW") && !o17.equals("zh_HK"))) {
            button.setBackgroundResource(com.tencent.mm.R.drawable.ccz);
            button.setText(com.tencent.mm.R.string.gmm);
        }
        this.K = (android.widget.ProgressBar) view.findViewById(com.tencent.mm.R.id.ikr);
        if (com.tencent.mm.ui.bk.C()) {
            viewGroup.setBackgroundResource(com.tencent.mm.R.drawable.amo);
        } else {
            viewGroup.setBackgroundResource(com.tencent.mm.R.drawable.amm);
        }
        if (i17 == 0) {
            com.tencent.mm.plugin.luckymoney.ui.nn nnVar = new com.tencent.mm.plugin.luckymoney.ui.nn(this, luckyMoneyPickEnvelopeUI);
            view.setOnLongClickListener(nnVar);
            findViewById.setOnLongClickListener(nnVar);
        }
    }

    public static void o(com.tencent.mm.plugin.luckymoney.ui.co coVar, android.view.View view, int i17, java.lang.String str) {
        r45.wv3 wv3Var;
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI = coVar.M;
        if (luckyMoneyPickEnvelopeUI.f146536x) {
            if (i17 == 1) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    return;
                }
                if ("0".equals(str)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "can not delete default envelope");
                    return;
                }
                com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) luckyMoneyPickEnvelopeUI.getContext(), 1, true);
                android.widget.TextView textView = new android.widget.TextView(luckyMoneyPickEnvelopeUI.getContext());
                textView.setPadding(0, 0, 0, i65.a.b(luckyMoneyPickEnvelopeUI.getContext(), 9));
                textView.setMinHeight(i65.a.h(luckyMoneyPickEnvelopeUI.getContext(), com.tencent.mm.R.dimen.f479579v));
                textView.setTextSize(14.0f);
                textView.setTextColor(luckyMoneyPickEnvelopeUI.getResources().getColor(com.tencent.mm.R.color.t_));
                textView.setText(com.tencent.mm.R.string.gms);
                textView.setGravity(81);
                k0Var.s(textView, true);
                k0Var.f211872n = new com.tencent.mm.plugin.luckymoney.ui.wn(coVar);
                k0Var.f211881s = new com.tencent.mm.plugin.luckymoney.ui.xn(coVar, str);
                k0Var.v();
                return;
            }
            android.view.View l07 = luckyMoneyPickEnvelopeUI.f146521i.l0(view);
            int u07 = luckyMoneyPickEnvelopeUI.f146521i.u0(l07);
            android.view.View n17 = luckyMoneyPickEnvelopeUI.D.n(luckyMoneyPickEnvelopeUI.f146523m);
            if (u07 >= 0) {
                java.util.List list = luckyMoneyPickEnvelopeUI.f146532t;
                if (u07 >= ((java.util.ArrayList) list).size() || l07 != n17) {
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "delete pos: %s", java.lang.Integer.valueOf(u07));
                com.tencent.mm.plugin.luckymoney.ui.zm zmVar = (com.tencent.mm.plugin.luckymoney.ui.zm) ((java.util.ArrayList) list).get(u07);
                if (zmVar == null || (wv3Var = zmVar.f147793b) == null) {
                    return;
                }
                if ("0".equals(wv3Var.f389500f)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "can not delete default envelope");
                    return;
                }
                com.tencent.mm.ui.widget.dialog.k0 k0Var2 = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) luckyMoneyPickEnvelopeUI.getContext(), 1, true);
                android.widget.TextView textView2 = new android.widget.TextView(luckyMoneyPickEnvelopeUI.getContext());
                textView2.setPadding(0, 0, 0, i65.a.b(luckyMoneyPickEnvelopeUI.getContext(), 9));
                textView2.setMinHeight(i65.a.h(luckyMoneyPickEnvelopeUI.getContext(), com.tencent.mm.R.dimen.f479579v));
                textView2.setTextSize(14.0f);
                textView2.setTextColor(luckyMoneyPickEnvelopeUI.getResources().getColor(com.tencent.mm.R.color.t_));
                textView2.setText(com.tencent.mm.R.string.gms);
                textView2.setGravity(81);
                k0Var2.s(textView2, true);
                k0Var2.f211872n = new com.tencent.mm.plugin.luckymoney.ui.yn(coVar);
                k0Var2.f211881s = new com.tencent.mm.plugin.luckymoney.ui.zn(coVar, zmVar);
                k0Var2.v();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r2v62 */
    @Override // com.tencent.mm.plugin.luckymoney.ui.rm
    public void l(com.tencent.mm.plugin.luckymoney.ui.zm zmVar, int i17) {
        java.lang.Integer num;
        int i18;
        ?? r27;
        boolean z17;
        this.itemView.setSelected(zmVar.f147792a);
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(this.B, c01.z1.r(), 0.06f);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI = this.M;
        this.C.setText(luckyMoneyPickEnvelopeUI.getString(com.tencent.mm.R.string.god, ((ke0.e) xVar).bj(luckyMoneyPickEnvelopeUI.getContext(), c01.z1.l(), i65.a.h(luckyMoneyPickEnvelopeUI.getContext(), com.tencent.mm.R.dimen.f479929j9))));
        android.widget.ImageView imageView = this.f146810f;
        imageView.setVisibility(0);
        imageView.setImageBitmap(null);
        android.widget.ImageView imageView2 = this.f146812h;
        imageView2.setImageBitmap(null);
        android.view.View view = this.D;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "resetEnvelopeDecoration", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "resetEnvelopeDecoration", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int i19 = this.f146809e;
        android.view.ViewGroup viewGroup = this.f146822u;
        if (i19 == 1) {
            viewGroup.setBackgroundResource(com.tencent.mm.R.drawable.f481947am5);
        } else {
            viewGroup.setBackgroundResource(com.tencent.mm.R.drawable.f481946am4);
        }
        android.view.ViewGroup viewGroup2 = this.f146808J;
        viewGroup2.setBackgroundResource(com.tencent.mm.R.drawable.amm);
        android.widget.ImageView imageView3 = this.f146811g;
        imageView3.setVisibility(0);
        imageView3.setImageResource(com.tencent.mm.R.drawable.c9t);
        com.tencent.mm.chatting.component.ListScrollPAGView listScrollPAGView = this.f146819r;
        if (listScrollPAGView != null) {
            listScrollPAGView.n();
            listScrollPAGView.i(this.f146820s);
            this.f146820s = null;
            android.view.View view2 = this.f146818q;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            num = 8;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "resetEnvelopeDecoration", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "resetEnvelopeDecoration", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            num = 8;
        }
        com.tencent.mm.chatting.component.ListScrollPAGView listScrollPAGView2 = this.f146814m;
        if (listScrollPAGView2 != null) {
            listScrollPAGView2.n();
            listScrollPAGView2.i(this.f146815n);
            listScrollPAGView2.j(this.f146816o);
            this.f146815n = null;
            this.f146816o = null;
            android.view.View view3 = this.f146813i;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(num);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "resetEnvelopeDecoration", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "resetEnvelopeDecoration", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.chatting.component.ListScrollPAGView listScrollPAGView3 = this.f146825x;
        if (listScrollPAGView3 != null) {
            listScrollPAGView3.n();
            listScrollPAGView3.i(this.f146826y);
            this.f146826y = null;
            android.view.View view4 = this.f146823v;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(num);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "resetEnvelopeDecoration", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "resetEnvelopeDecoration", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView = this.A;
        android.view.View view5 = this.f146821t;
        android.view.View view6 = this.D;
        android.widget.TextView textView2 = this.H;
        if (i19 == 1) {
            r45.xv3 xv3Var = zmVar.f147793b.f389501g;
            android.view.View view7 = this.f146827z;
            android.view.ViewGroup.LayoutParams layoutParams = view7.getLayoutParams();
            layoutParams.width = luckyMoneyPickEnvelopeUI.Q;
            layoutParams.height = luckyMoneyPickEnvelopeUI.R;
            view7.setLayoutParams(layoutParams);
            android.view.ViewGroup.LayoutParams layoutParams2 = view6.getLayoutParams();
            layoutParams2.width = luckyMoneyPickEnvelopeUI.Q;
            layoutParams2.height = luckyMoneyPickEnvelopeUI.R;
            view6.setLayoutParams(layoutParams2);
            android.view.ViewGroup.LayoutParams layoutParams3 = viewGroup2.getLayoutParams();
            layoutParams3.width = luckyMoneyPickEnvelopeUI.S;
            layoutParams3.height = luckyMoneyPickEnvelopeUI.T;
            viewGroup2.setLayoutParams(layoutParams3);
            android.view.ViewGroup.LayoutParams layoutParams4 = imageView3.getLayoutParams();
            layoutParams4.height = luckyMoneyPickEnvelopeUI.U;
            imageView3.setLayoutParams(layoutParams4);
            android.widget.Button button = this.L;
            android.view.ViewGroup.LayoutParams layoutParams5 = button.getLayoutParams();
            int i27 = luckyMoneyPickEnvelopeUI.X;
            layoutParams5.width = i27;
            layoutParams5.height = i27;
            button.setLayoutParams(layoutParams5);
            if ((xv3Var == null || com.tencent.mm.sdk.platformtools.t8.K0(xv3Var.f390485o) || com.tencent.mm.sdk.platformtools.t8.K0(xv3Var.f390486p)) ? false : true) {
                android.view.ViewGroup.LayoutParams layoutParams6 = imageView2.getLayoutParams();
                layoutParams6.width = luckyMoneyPickEnvelopeUI.V;
                layoutParams6.height = luckyMoneyPickEnvelopeUI.W;
                imageView2.setLayoutParams(layoutParams6);
                i18 = 8;
            } else {
                i18 = 8;
                imageView2.setVisibility(8);
            }
            if ((xv3Var == null || com.tencent.mm.sdk.platformtools.t8.K0(xv3Var.f390494x) || xv3Var.D != 1) ? false : true) {
                float b17 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 4);
                android.view.View view8 = this.f146818q;
                if (view8 == null) {
                    z17 = true;
                } else {
                    z17 = true;
                    view8.setOutlineProvider(new zl5.a(true, true, b17));
                }
                if (view8 != null) {
                    view8.setClipToOutline(z17);
                }
                android.view.ViewGroup.LayoutParams layoutParams7 = view8.getLayoutParams();
                layoutParams7.width = luckyMoneyPickEnvelopeUI.S;
                layoutParams7.height = luckyMoneyPickEnvelopeUI.T;
                view8.setLayoutParams(layoutParams7);
                android.view.View view9 = this.f146813i;
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.add(num);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view9, arrayList5.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "initThumbItemSize", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSourceLocal;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view9.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view9, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "initThumbItemSize", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSourceLocal;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                if ((xv3Var == null || com.tencent.mm.sdk.platformtools.t8.K0(xv3Var.f390494x) || xv3Var.D != 2) ? false : true) {
                    android.view.View view10 = this.f146813i;
                    android.view.ViewGroup.LayoutParams layoutParams8 = view10.getLayoutParams();
                    layoutParams8.width = luckyMoneyPickEnvelopeUI.V;
                    layoutParams8.height = luckyMoneyPickEnvelopeUI.W;
                    view10.setLayoutParams(layoutParams8);
                    android.view.ViewGroup.LayoutParams layoutParams9 = view5.getLayoutParams();
                    layoutParams9.width = luckyMoneyPickEnvelopeUI.S;
                    layoutParams9.height = luckyMoneyPickEnvelopeUI.T;
                    view5.setLayoutParams(layoutParams9);
                    android.view.View view11 = this.f146818q;
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    arrayList6.add(num);
                    java.util.Collections.reverse(arrayList6);
                    yj0.a.d(view11, arrayList6.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "initThumbItemSize", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSourceLocal;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view11.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                    yj0.a.f(view11, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "initThumbItemSize", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSourceLocal;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    android.view.View view12 = this.f146818q;
                    java.util.ArrayList arrayList7 = new java.util.ArrayList();
                    arrayList7.add(num);
                    java.util.Collections.reverse(arrayList7);
                    yj0.a.d(view12, arrayList7.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "initThumbItemSize", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSourceLocal;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view12.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                    yj0.a.f(view12, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "initThumbItemSize", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSourceLocal;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view13 = this.f146813i;
                    java.util.ArrayList arrayList8 = new java.util.ArrayList();
                    arrayList8.add(num);
                    java.util.Collections.reverse(arrayList8);
                    yj0.a.d(view13, arrayList8.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "initThumbItemSize", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSourceLocal;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view13.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                    yj0.a.f(view13, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "initThumbItemSize", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSourceLocal;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            textView.setVisibility(i18);
            textView2.setVisibility(i18);
            com.tencent.mm.plugin.luckymoney.ui.un unVar = new com.tencent.mm.plugin.luckymoney.ui.un(this, zmVar);
            com.tencent.mm.plugin.luckymoney.ui.vn vnVar = new com.tencent.mm.plugin.luckymoney.ui.vn(this, zmVar);
            this.itemView.setOnClickListener(unVar);
            this.itemView.setOnLongClickListener(vnVar);
            view6.setOnClickListener(unVar);
            view6.setOnLongClickListener(vnVar);
        } else {
            i18 = 8;
        }
        r45.wv3 wv3Var = zmVar.f147793b;
        if (wv3Var != null) {
            textView.setText(wv3Var.f389498d);
            if (zmVar.f147793b.f389501g != null) {
                imageView3.setImageResource(com.tencent.mm.R.drawable.c9u);
                q(zmVar.f147793b, false);
            }
            if (i19 == 0) {
                view6.setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.tn(this, zmVar));
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(zmVar.f147793b.f389502h)) {
                r27 = 0;
                textView2.setText("");
            } else {
                textView2.setText(zmVar.f147793b.f389502h);
                r27 = 0;
                textView2.setVisibility(0);
            }
            textView2.setOnTouchListener(null);
            textView2.setClickable(r27);
            int i28 = zmVar.f147793b.f389506o;
            android.widget.TextView textView3 = this.I;
            if (i28 == 2) {
                textView3.setVisibility(r27);
            } else {
                textView3.setVisibility(i18);
            }
            r45.wv3 wv3Var2 = zmVar.f147793b;
            if (wv3Var2.f389506o != 1 || com.tencent.mm.sdk.platformtools.t8.K0(wv3Var2.f389509r)) {
                r45.wv3 wv3Var3 = zmVar.f147793b;
                if (wv3Var3.f389507p == 1) {
                    this.itemView.setSelected(r27);
                    viewGroup2.setEnabled(r27);
                    textView2.setVisibility(r27);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(zmVar.f147793b.f389508q)) {
                        textView2.setText(zmVar.f147793b.f389508q);
                    }
                    p();
                } else if (wv3Var3.f389503i == 1) {
                    this.itemView.setSelected(false);
                    viewGroup2.setEnabled(false);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(zmVar.f147793b.f389502h)) {
                        textView2.setText(zmVar.f147793b.f389502h);
                        textView2.setVisibility(0);
                    }
                    android.view.View view14 = this.D;
                    java.util.ArrayList arrayList9 = new java.util.ArrayList();
                    arrayList9.add(num);
                    java.util.Collections.reverse(arrayList9);
                    yj0.a.d(view14, arrayList9.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "showExpiredCover2", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view14.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                    yj0.a.f(view14, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "showExpiredCover2", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    this.E.setVisibility(i18);
                    this.F.setVisibility(i18);
                    this.G.setVisibility(i18);
                    view6.setOnClickListener(null);
                } else {
                    java.lang.String str = wv3Var3.f389500f;
                    int i29 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI.f146514x1;
                    if (luckyMoneyPickEnvelopeUI.f7(str)) {
                        this.itemView.setSelected(false);
                        viewGroup2.setEnabled(false);
                        textView2.setText(com.tencent.mm.R.string.gkb);
                        textView2.setVisibility(0);
                        p();
                    } else {
                        viewGroup2.setEnabled(true);
                        if (com.tencent.mm.sdk.platformtools.t8.J0(textView2.getText())) {
                            textView2.setVisibility(4);
                        }
                        android.view.View view15 = this.D;
                        java.util.ArrayList arrayList10 = new java.util.ArrayList();
                        arrayList10.add(num);
                        java.util.Collections.reverse(arrayList10);
                        yj0.a.d(view15, arrayList10.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "setData", "(Lcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$EnvelopeModel;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view15.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
                        yj0.a.f(view15, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "setData", "(Lcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$EnvelopeModel;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
            } else {
                textView2.setVisibility(r27);
                textView2.setText(zmVar.f147793b.f389509r);
            }
            if (i19 == 0) {
                if (!luckyMoneyPickEnvelopeUI.f146533u) {
                    int b18 = i65.a.b(luckyMoneyPickEnvelopeUI.getContext(), 3);
                    android.widget.RelativeLayout.LayoutParams layoutParams10 = (android.widget.RelativeLayout.LayoutParams) viewGroup2.getLayoutParams();
                    layoutParams10.topMargin = b18;
                    viewGroup2.setLayoutParams(layoutParams10);
                    if (view5 != null) {
                        android.widget.RelativeLayout.LayoutParams layoutParams11 = (android.widget.RelativeLayout.LayoutParams) view5.getLayoutParams();
                        layoutParams11.topMargin = b18;
                        view5.setLayoutParams(layoutParams11);
                        return;
                    }
                    return;
                }
                int b19 = i65.a.b(luckyMoneyPickEnvelopeUI.getContext(), 256);
                int b27 = i65.a.b(luckyMoneyPickEnvelopeUI.getContext(), com.tencent.wxmm.v2helper.EMethodSetSpkEnhance);
                float f17 = b19 * 1.0993f;
                java.lang.Math.round(f17);
                int round = (((java.lang.Math.round(f17 * 1.72f) - b27) / 2) - i65.a.b(luckyMoneyPickEnvelopeUI.getContext(), 12)) + ((int) (i65.a.q(com.tencent.mm.sdk.platformtools.x2.f193071a) * 1.0f));
                android.widget.RelativeLayout.LayoutParams layoutParams12 = (android.widget.RelativeLayout.LayoutParams) viewGroup2.getLayoutParams();
                layoutParams12.topMargin = round;
                viewGroup2.setLayoutParams(layoutParams12);
                if (view5 != null) {
                    android.widget.RelativeLayout.LayoutParams layoutParams13 = (android.widget.RelativeLayout.LayoutParams) view5.getLayoutParams();
                    layoutParams13.topMargin = round;
                    view5.setLayoutParams(layoutParams13);
                }
            }
        }
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.rm
    public void n(boolean z17) {
        this.itemView.setSelected(z17);
    }

    public final void p() {
        android.view.View view = this.D;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "showExpiredCover", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "showExpiredCover", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.E.setVisibility(8);
        this.F.setVisibility(8);
        this.G.setVisibility(8);
        this.D.setOnClickListener(null);
    }

    public final void q(r45.wv3 wv3Var, boolean z17) {
        int i17;
        int i18;
        int i19;
        android.widget.ImageView imageView;
        r45.xv3 xv3Var;
        android.view.View view;
        r45.xv3 xv3Var2;
        int i27;
        int i28;
        if (z17) {
            this.E.setVisibility(8);
            this.F.setVisibility(0);
            this.G.setVisibility(8);
        } else if ("0".equals(wv3Var.f389500f)) {
            return;
        } else {
            this.K.setVisibility(0);
        }
        android.widget.ImageView imageView2 = this.f146812h;
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI = this.M;
        int i29 = this.f146809e;
        if (imageView2 != null) {
            r45.xv3 xv3Var3 = wv3Var.f389501g;
            if (xv3Var3 == null || com.tencent.mm.sdk.platformtools.t8.K0(xv3Var3.f390485o) || com.tencent.mm.sdk.platformtools.t8.K0(wv3Var.f389501g.f390486p)) {
                imageView2.setVisibility(8);
            } else {
                imageView2.post(new com.tencent.mm.plugin.luckymoney.ui.qn(this));
                imageView2.setVisibility(0);
                if (i29 == 1) {
                    i27 = luckyMoneyPickEnvelopeUI.V;
                    i28 = luckyMoneyPickEnvelopeUI.W;
                } else {
                    i27 = 0;
                    i28 = 0;
                }
                ((com.tencent.mm.plugin.luckymoney.model.w2) ((gb3.j) i95.n0.c(gb3.j.class))).bj(this.f146812h, wv3Var, new com.tencent.mm.plugin.luckymoney.ui.sn(this, wv3Var), i27, i28);
            }
        }
        android.widget.ImageView imageView3 = this.f146810f;
        imageView3.setVisibility(0);
        if (i29 == 1) {
            i17 = luckyMoneyPickEnvelopeUI.S;
            i18 = luckyMoneyPickEnvelopeUI.T;
            i19 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 3);
        } else {
            i17 = 0;
            i18 = 0;
            i19 = 0;
        }
        ((com.tencent.mm.plugin.luckymoney.model.w2) ((gb3.j) i95.n0.c(gb3.j.class))).aj(this.f146810f, wv3Var, new com.tencent.mm.plugin.luckymoney.ui.bo(this, wv3Var), i17, i18, i19);
        if (i29 != 1 && (view = this.f146818q) != null && this.f146813i != null) {
            boolean z18 = luckyMoneyPickEnvelopeUI.Y;
            com.tencent.mm.chatting.component.ListScrollPAGView listScrollPAGView = this.f146814m;
            com.tencent.mm.chatting.component.ListScrollPAGView listScrollPAGView2 = this.f146819r;
            if (z18 || (xv3Var2 = wv3Var.f389501g) == null || com.tencent.mm.sdk.platformtools.t8.K0(xv3Var2.f390494x)) {
                imageView = imageView3;
                listScrollPAGView2.n();
                listScrollPAGView.n();
                android.view.View view2 = this.f146818q;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "renderEnvelopeDynamic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "renderEnvelopeDynamic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view3 = this.f146813i;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "renderEnvelopeDynamic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "renderEnvelopeDynamic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                int i37 = wv3Var.f389501g.D;
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                if (i37 == 2) {
                    com.tencent.mm.plugin.luckymoney.ui.cn cnVar = new com.tencent.mm.plugin.luckymoney.ui.cn(this);
                    this.f146815n = cnVar;
                    this.f146816o = new com.tencent.mm.plugin.luckymoney.ui.en(this);
                    listScrollPAGView.a(cnVar);
                    listScrollPAGView.b(this.f146816o);
                    listScrollPAGView.setRepeatCount(0);
                    listScrollPAGView.setScaleMode(3);
                    android.view.View view4 = this.f146818q;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "renderEnvelopeDynamic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view4, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "renderEnvelopeDynamic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    listScrollPAGView2.n();
                    imageView2.post(new com.tencent.mm.plugin.luckymoney.ui.fn(this));
                    com.tencent.mm.plugin.luckymoney.model.n3.f145460a.b(wv3Var, 1, this.f293120d, new com.tencent.mm.plugin.luckymoney.ui.gn(this, currentTimeMillis, wv3Var));
                } else {
                    android.view.View view5 = this.f146818q;
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                    arrayList4.add(4);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "renderEnvelopeDynamic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(view5, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "renderEnvelopeDynamic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    com.tencent.mm.plugin.luckymoney.ui.hn hnVar = new com.tencent.mm.plugin.luckymoney.ui.hn(this);
                    this.f146820s = hnVar;
                    listScrollPAGView2.a(hnVar);
                    listScrollPAGView2.b(new com.tencent.mm.plugin.luckymoney.ui.in(this));
                    listScrollPAGView2.setRepeatCount(0);
                    listScrollPAGView2.setScaleMode(3);
                    android.view.View view6 = this.f146813i;
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    arrayList5.add(8);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(view6, arrayList5.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "renderEnvelopeDynamic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view6.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(view6, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "renderEnvelopeDynamic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    listScrollPAGView.n();
                    view.setOutlineProvider(new zl5.a(true, true, i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 8)));
                    view.setClipToOutline(true);
                    imageView = imageView3;
                    imageView.post(new com.tencent.mm.plugin.luckymoney.ui.jn(this));
                    com.tencent.mm.plugin.luckymoney.model.n3.f145460a.b(wv3Var, 1, this.f293120d, new com.tencent.mm.plugin.luckymoney.ui.kn(this, currentTimeMillis, wv3Var));
                }
            }
            if (i29 != 1 || this.f146823v == null) {
            }
            boolean z19 = luckyMoneyPickEnvelopeUI.Z;
            com.tencent.mm.chatting.component.ListScrollPAGView listScrollPAGView3 = this.f146825x;
            if (z19 || (xv3Var = wv3Var.f389501g) == null || com.tencent.mm.sdk.platformtools.t8.K0(xv3Var.F)) {
                listScrollPAGView3.n();
                android.view.View view7 = this.f146823v;
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                arrayList6.add(8);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(view7, arrayList6.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "renderEnvelopeAtmosphereDynamic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(view7, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "renderEnvelopeAtmosphereDynamic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(wv3Var.f389501g.I)) {
                r45.xv3 xv3Var4 = wv3Var.f389501g;
                xv3Var4.F = xv3Var4.I;
            }
            ((com.tencent.mm.plugin.luckymoney.model.w2) ((gb3.j) i95.n0.c(gb3.j.class))).uj(luckyMoneyPickEnvelopeUI.f146521i, this.f146824w, true);
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            android.view.View view8 = this.f146823v;
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
            arrayList7.add(4);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(view8, arrayList7.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "renderEnvelopeAtmosphereDynamic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(view8, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH", "renderEnvelopeAtmosphereDynamic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.plugin.luckymoney.ui.ln lnVar = new com.tencent.mm.plugin.luckymoney.ui.ln(this);
            this.f146826y = lnVar;
            listScrollPAGView3.a(lnVar);
            listScrollPAGView3.b(new com.tencent.mm.plugin.luckymoney.ui.mn(this));
            listScrollPAGView3.setRepeatCount(0);
            listScrollPAGView3.setScaleMode(3);
            imageView.postDelayed(new com.tencent.mm.plugin.luckymoney.ui.on(this, wv3Var), 100L);
            com.tencent.mm.plugin.luckymoney.model.n3.f145460a.b(wv3Var, 10, this.f293120d, new com.tencent.mm.plugin.luckymoney.ui.pn(this, currentTimeMillis2, wv3Var));
            return;
        }
        imageView = imageView3;
        if (i29 != 1) {
        }
    }
}
