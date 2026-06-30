package com.tencent.mm.plugin.luckymoney.ui;

@db5.a(3)
/* loaded from: classes9.dex */
public class LuckyMoneyNewYearSendUI extends com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI {
    public static final /* synthetic */ int F1 = 0;
    public android.widget.TextView A;
    public final com.tencent.mm.sdk.event.IListener A1;
    public android.widget.Button B;
    public final android.view.View.OnClickListener B1;
    public java.lang.String C;
    public int C1;
    public int D;
    public final qr.a D1;
    public java.lang.String E;
    public int E1;
    public int G;
    public java.lang.String H;
    public int I;
    public java.util.LinkedList M;
    public com.tencent.mm.pluginsdk.ui.ChatFooterPanel P;
    public com.tencent.mm.plugin.luckymoney.ui.b Q;
    public android.view.ViewGroup R;
    public android.view.View S;
    public com.tencent.mm.api.IEmojiInfo T;
    public com.tencent.mm.api.IEmojiInfo U;
    public com.tencent.mm.autogen.mmdata.rpt.HBReportNewStruct V;
    public com.tencent.mm.autogen.mmdata.rpt.HbSessionReportStruct W;
    public int X;
    public int Y;
    public int Z;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f146369g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f146370h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f146371i;

    /* renamed from: l1, reason: collision with root package name */
    public int f146372l1;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f146373m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f146374n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.emoji.view.BaseEmojiView f146375o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f146376p;

    /* renamed from: p0, reason: collision with root package name */
    public int f146377p0;

    /* renamed from: p1, reason: collision with root package name */
    public long f146378p1;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ImageView f146379q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f146380r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.LinearLayout f146381s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.gif.MMAnimateView f146382t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f146383u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.LinearLayout f146384v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.LinearLayout f146385w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f146386x;

    /* renamed from: x0, reason: collision with root package name */
    public int f146387x0;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f146388x1;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f146389y;

    /* renamed from: y0, reason: collision with root package name */
    public int f146390y0;

    /* renamed from: y1, reason: collision with root package name */
    public java.lang.String f146391y1;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyAutoScrollView f146392z;

    /* renamed from: z1, reason: collision with root package name */
    public java.lang.String f146393z1;
    public android.app.Dialog F = null;

    /* renamed from: J, reason: collision with root package name */
    public boolean f146368J = true;
    public int K = 0;
    public int L = 0;
    public int N = 0;

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUI$1, reason: invalid class name */
    /* loaded from: classes9.dex */
    public class AnonymousClass1 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.HKCashierJSApiPayResultEvent> {
        public AnonymousClass1(androidx.lifecycle.y yVar) {
            super(yVar);
            this.__eventId = -1594159370;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.HKCashierJSApiPayResultEvent hKCashierJSApiPayResultEvent) {
            com.tencent.mm.autogen.events.HKCashierJSApiPayResultEvent hKCashierJSApiPayResultEvent2 = hKCashierJSApiPayResultEvent;
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "hkCashierPayResultIListener callback");
            if (hKCashierJSApiPayResultEvent2.f54428g.f6451a == 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "hkCashierPayResultIListener callback paysucc");
                hKCashierJSApiPayResultEvent2.f54428g.f6452b = 1;
                ku5.u0 u0Var = ku5.t0.f312615d;
                java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUI$1$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUI.this.finish();
                    }
                };
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                t0Var.z(runnable, 200L, false);
            }
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUI.this.A1.dead();
            return true;
        }
    }

    public LuckyMoneyNewYearSendUI() {
        new com.tencent.mm.sdk.platformtools.n3();
        this.X = 1;
        this.Y = 0;
        this.Z = 0;
        this.f146377p0 = 0;
        this.f146387x0 = 0;
        this.f146390y0 = 0;
        this.f146372l1 = 0;
        this.f146378p1 = 0L;
        this.f146388x1 = false;
        this.f146391y1 = "";
        this.f146393z1 = "";
        this.A1 = new com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUI.AnonymousClass1(com.tencent.mm.app.a0.f53288d);
        this.B1 = new com.tencent.mm.plugin.luckymoney.ui.bh(this);
        this.C1 = 0;
        this.D1 = new com.tencent.mm.plugin.luckymoney.ui.yg(this);
        this.E1 = 0;
    }

    public static void V6(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUI luckyMoneyNewYearSendUI) {
        int i17 = luckyMoneyNewYearSendUI.L;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (i17 == 1) {
            if (!(luckyMoneyNewYearSendUI.K == 1)) {
                luckyMoneyNewYearSendUI.b7();
                return;
            }
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) luckyMoneyNewYearSendUI.getContext(), 1, false);
            k0Var.f211872n = new com.tencent.mm.plugin.luckymoney.ui.dh(luckyMoneyNewYearSendUI);
            k0Var.f211881s = new com.tencent.mm.plugin.luckymoney.ui.eh(luckyMoneyNewYearSendUI);
            k0Var.v();
        }
    }

    public final void W6(int i17) {
        java.lang.String str;
        int i18;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "doSend()");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11701, 15, 3, 0, 1, 1);
        android.app.Dialog dialog = this.F;
        if (dialog == null) {
            this.F = com.tencent.mm.wallet_core.ui.b2.h(getContext(), true, new com.tencent.mm.plugin.luckymoney.ui.fh(this));
        } else if (!dialog.isShowing()) {
            this.F.show();
        }
        java.lang.String r17 = c01.z1.r();
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = this.T;
        if (iEmojiInfo != null) {
            str = iEmojiInfo.getMd5();
            i18 = this.T.getType();
        } else {
            str = "";
            i18 = 0;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "doSend() mUniqueId:%s userConfirmJump:%s lastPayResult:%s mSendId:%s", this.f146393z1, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.E1), this.f146391y1);
        if (!this.f146388x1) {
            doSceneProgress(new com.tencent.mm.plugin.luckymoney.model.k6(this.I, this.H, com.tencent.mm.plugin.luckymoney.model.m5.j(r17), this.C, r17, c01.z1.l(), this.D, str, i18, this.f146393z1, i17, this.E1, this.f146391y1, null), false);
        } else {
            int i19 = this.I;
            doSceneProgress(new com.tencent.mm.plugin.luckymoney.model.z5(1, i19, i19, 3, this.H, this.C, com.tencent.mm.plugin.luckymoney.model.m5.l(), c01.z1.r(), 2), false);
        }
    }

    public final void X6() {
        int i17;
        this.Z++;
        java.util.LinkedList linkedList = this.M;
        if (linkedList == null || linkedList.size() <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyNewYearSendUI", "genRandomAmountIndex yearMessList is empty!");
            i17 = -1;
        } else {
            gm0.j1.i();
            int h17 = gm0.j1.b().h();
            int size = this.M.size();
            i17 = (((int) (java.lang.System.currentTimeMillis() % size)) + new java.util.Random(h17).nextInt(size)) % size;
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "genRandomAmountIndex retRand:" + i17);
        }
        this.N = i17;
        if (i17 >= 0 && i17 < this.M.size()) {
            this.I = ((com.tencent.mm.plugin.luckymoney.model.f5) this.M.get(this.N)).f145274a;
            this.H = ((com.tencent.mm.plugin.luckymoney.model.f5) this.M.get(this.N)).f145275b;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "mSelectIndex:" + this.N + " randomAmount:" + this.I + " randomWishing:" + this.H);
        this.f146392z.setFinalText(com.tencent.mm.wallet_core.ui.r1.o(((double) this.I) / 100.0d));
        c7(false);
        this.f146392z.setFocusable(false);
        this.f146392z.setContentDescription("");
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyAutoScrollView luckyMoneyAutoScrollView = this.f146392z;
        luckyMoneyAutoScrollView.f145971x = new com.tencent.mm.plugin.luckymoney.ui.hh(this);
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.luckymoney.ui.j(luckyMoneyAutoScrollView));
    }

    public final void Y6(int i17) {
        int i18 = this.L;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (i18 == 0) {
            this.f146370h.setVisibility(0);
            android.view.View view = this.f146371i;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f146374n;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        this.f146370h.setVisibility(8);
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "exchangeExpressionState() state:%s", java.lang.Integer.valueOf(i17));
        if (i17 == 0) {
            android.view.View view3 = this.f146371i;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f146373m.setText(com.tencent.mm.R.string.gj7);
            android.view.View view4 = this.f146374n;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (i17 == 1) {
            android.view.View view5 = this.f146371i;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view6 = this.f146374n;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f146376p.setVisibility(0);
            this.f146375o.setVisibility(8);
            this.f146379q.setVisibility(8);
            this.f146380r.setVisibility(8);
            this.f146381s.setVisibility(8);
            return;
        }
        if (i17 == 2) {
            if (this.U != null) {
                com.tencent.mm.autogen.mmdata.rpt.HBReportNewStruct hBReportNewStruct = new com.tencent.mm.autogen.mmdata.rpt.HBReportNewStruct();
                this.V = hBReportNewStruct;
                hBReportNewStruct.f58415d = 4L;
                hBReportNewStruct.k();
            }
            this.U = this.T;
            int i19 = this.Y;
            if (i19 == 0) {
                com.tencent.mm.feature.emoji.api.j6 j6Var = (com.tencent.mm.feature.emoji.api.j6) i95.n0.c(com.tencent.mm.feature.emoji.api.j6.class);
                com.tencent.mm.api.IEmojiInfo iEmojiInfo = this.T;
                ((com.tencent.mm.feature.emoji.h2) j6Var).getClass();
                if (n22.m.j(iEmojiInfo)) {
                    this.X = 2;
                } else {
                    com.tencent.mm.feature.emoji.api.j6 j6Var2 = (com.tencent.mm.feature.emoji.api.j6) i95.n0.c(com.tencent.mm.feature.emoji.api.j6.class);
                    com.tencent.mm.api.IEmojiInfo iEmojiInfo2 = this.T;
                    ((com.tencent.mm.feature.emoji.h2) j6Var2).getClass();
                    if (n22.m.p(iEmojiInfo2)) {
                        this.X = 4;
                    } else {
                        this.X = 3;
                    }
                }
            } else if (i19 == 1) {
                this.X = 2;
                this.f146377p0++;
            } else if (i19 == 2) {
                com.tencent.mm.feature.emoji.api.j6 j6Var3 = (com.tencent.mm.feature.emoji.api.j6) i95.n0.c(com.tencent.mm.feature.emoji.api.j6.class);
                com.tencent.mm.api.IEmojiInfo iEmojiInfo3 = this.T;
                ((com.tencent.mm.feature.emoji.h2) j6Var3).getClass();
                if (n22.m.j(iEmojiInfo3)) {
                    this.X = 2;
                    this.f146372l1++;
                } else {
                    com.tencent.mm.feature.emoji.api.j6 j6Var4 = (com.tencent.mm.feature.emoji.api.j6) i95.n0.c(com.tencent.mm.feature.emoji.api.j6.class);
                    com.tencent.mm.api.IEmojiInfo iEmojiInfo4 = this.T;
                    ((com.tencent.mm.feature.emoji.h2) j6Var4).getClass();
                    if (n22.m.p(iEmojiInfo4)) {
                        this.X = 4;
                        this.f146390y0++;
                    } else {
                        this.X = 3;
                        this.f146387x0++;
                    }
                }
            }
            android.view.View view7 = this.f146371i;
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList7.add(8);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(view7, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view8 = this.f146374n;
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(0);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(view8, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f146376p.setVisibility(8);
            this.f146375o.setVisibility(0);
            this.f146379q.setVisibility(0);
            this.f146380r.setVisibility(8);
            this.f146381s.setVisibility(8);
            return;
        }
        if (i17 == 3) {
            android.view.View view9 = this.f146371i;
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
            arrayList9.add(8);
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(view9, arrayList9.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
            yj0.a.f(view9, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view10 = this.f146374n;
            java.util.ArrayList arrayList10 = new java.util.ArrayList();
            arrayList10.add(0);
            java.util.Collections.reverse(arrayList10);
            yj0.a.d(view10, arrayList10.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view10.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
            yj0.a.f(view10, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f146376p.setVisibility(8);
            this.f146375o.setVisibility(8);
            this.f146379q.setVisibility(8);
            this.f146380r.setVisibility(0);
            this.f146381s.setVisibility(8);
            return;
        }
        if (i17 != 4) {
            if (i17 != 5) {
                return;
            }
            android.view.View view11 = this.f146371i;
            java.util.ArrayList arrayList11 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
            arrayList11.add(0);
            java.util.Collections.reverse(arrayList11);
            yj0.a.d(view11, arrayList11.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view11.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
            yj0.a.f(view11, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f146373m.setText(com.tencent.mm.R.string.f492428gm1);
            android.view.View view12 = this.f146374n;
            java.util.ArrayList arrayList12 = new java.util.ArrayList();
            arrayList12.add(8);
            java.util.Collections.reverse(arrayList12);
            yj0.a.d(view12, arrayList12.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view12.setVisibility(((java.lang.Integer) arrayList12.get(0)).intValue());
            yj0.a.f(view12, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view13 = this.f146371i;
        java.util.ArrayList arrayList13 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal7 = zj0.c.f473285a;
        arrayList13.add(8);
        java.util.Collections.reverse(arrayList13);
        yj0.a.d(view13, arrayList13.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view13.setVisibility(((java.lang.Integer) arrayList13.get(0)).intValue());
        yj0.a.f(view13, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view14 = this.f146374n;
        java.util.ArrayList arrayList14 = new java.util.ArrayList();
        arrayList14.add(0);
        java.util.Collections.reverse(arrayList14);
        yj0.a.d(view14, arrayList14.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view14.setVisibility(((java.lang.Integer) arrayList14.get(0)).intValue());
        yj0.a.f(view14, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f146376p.setVisibility(8);
        this.f146375o.setVisibility(8);
        this.f146379q.setVisibility(8);
        this.f146380r.setVisibility(8);
        this.f146381s.setVisibility(0);
        this.f146382t.setImageResource(com.tencent.mm.R.raw.lucky_money_newyear_creat_loading);
    }

    public final void Z6(int i17) {
        com.tencent.mm.autogen.mmdata.rpt.HbSessionReportStruct hbSessionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.HbSessionReportStruct();
        this.W = hbSessionReportStruct;
        hbSessionReportStruct.f58416d = i17;
        hbSessionReportStruct.f58417e = this.X;
        hbSessionReportStruct.f58418f = this.Z;
        hbSessionReportStruct.f58419g = this.f146377p0;
        hbSessionReportStruct.f58420h = this.f146387x0;
        hbSessionReportStruct.f58423k = this.f146390y0;
        hbSessionReportStruct.f58421i = this.f146372l1;
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = this.T;
        hbSessionReportStruct.f58422j = hbSessionReportStruct.b("EmoticonMd5", iEmojiInfo == null ? "" : iEmojiInfo.getMd5(), true);
        this.W.k();
    }

    public final void a7(java.lang.String str) {
        com.tencent.mm.api.IEmojiInfo wi6 = ((com.tencent.mm.feature.emoji.r1) ((com.tencent.mm.feature.emoji.api.g6) i95.n0.c(com.tencent.mm.feature.emoji.api.g6.class))).wi(str);
        this.T = wi6;
        this.f146375o.setEmojiInfo(wi6);
        Y6(2);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_HONGBAO_NEW_YEAR_LAST_SEND_EMOJI_MD5_STRING, str);
    }

    public final void b7() {
        com.tencent.mm.autogen.mmdata.rpt.HBReportNewStruct hBReportNewStruct = new com.tencent.mm.autogen.mmdata.rpt.HBReportNewStruct();
        this.V = hBReportNewStruct;
        hBReportNewStruct.f58415d = 10L;
        hBReportNewStruct.k();
        this.Y = 2;
        this.Q.show();
        int i17 = com.tencent.mm.pluginsdk.ui.ChatFooterPanel.f189765e;
        int i18 = this.K;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (i18 == 1) {
            this.P.setHBScene(4);
        } else {
            this.P.setHBScene(1);
        }
        fc3.j.c("", this.R, this.P, 0, new com.tencent.mm.plugin.luckymoney.ui.ch(this));
    }

    public final void c7(boolean z17) {
        this.B.setClickable(z17);
        if (z17) {
            if (this.B.getBackground() != null && this.B.getBackground().mutate() != null) {
                this.B.getBackground().mutate().setAlpha(255);
            }
            this.B.setTextColor(getResources().getColor(com.tencent.mm.R.color.f479362xh));
            return;
        }
        if (this.B.getBackground() != null && this.B.getBackground().mutate() != null) {
            this.B.getBackground().mutate().setAlpha(128);
        }
        this.B.setTextColor(getResources().getColor(com.tencent.mm.R.color.f479363xi));
    }

    public void d7() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "ljd:updateView");
        java.util.LinkedList linkedList = this.M;
        if (linkedList == null || linkedList.size() <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "ljd:year mess list is not valid!");
            this.f146384v.setVisibility(8);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "ljd:year mess list is valid!");
            this.f146384v.setVisibility(0);
        }
        this.A.setTextSize(1, 21.0f);
        this.f146383u.setTextSize(1, 15.0f);
        this.f146392z.c(getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.a58), getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f480553a56));
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f146392z.getLayoutParams();
        layoutParams.topMargin = getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f480547a50);
        this.f146392z.setLayoutParams(layoutParams);
        this.f146392z.invalidate();
        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) this.f146384v.getLayoutParams();
        layoutParams2.topMargin = getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f480549a52);
        this.f146384v.setLayoutParams(layoutParams2);
        this.f146384v.invalidate();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bus;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setActionbarColor(-839716110);
        setContentViewVisibility(8);
        this.f146369g = findViewById(com.tencent.mm.R.id.j4q);
        this.f146383u = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f485757iy4);
        this.f146392z = (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyAutoScrollView) findViewById(com.tencent.mm.R.id.j3c);
        this.A = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j4a);
        android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.f485802j43);
        this.B = button;
        android.view.View.OnClickListener onClickListener = this.B1;
        button.setOnClickListener(onClickListener);
        ((android.widget.ImageView) findViewById(com.tencent.mm.R.id.f485805j46)).setOnClickListener(onClickListener);
        this.f146370h = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.j3p);
        this.f146371i = findViewById(com.tencent.mm.R.id.j3n);
        this.f146373m = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j3o);
        ((android.widget.ImageView) findViewById(com.tencent.mm.R.id.j3g)).setOnClickListener(onClickListener);
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.j3o)).setOnClickListener(onClickListener);
        this.f146374n = findViewById(com.tencent.mm.R.id.j3m);
        com.tencent.mm.emoji.view.BaseEmojiView baseEmojiView = (com.tencent.mm.emoji.view.BaseEmojiView) findViewById(com.tencent.mm.R.id.j3f);
        this.f146375o = baseEmojiView;
        baseEmojiView.setOnClickListener(onClickListener);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.j3k);
        this.f146379q = imageView;
        imageView.setOnClickListener(onClickListener);
        this.f146376p = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.j3j);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f485800j41);
        this.f146380r = textView;
        textView.setOnClickListener(onClickListener);
        this.f146381s = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.j3e);
        this.f146382t = (com.tencent.mm.plugin.gif.MMAnimateView) findViewById(com.tencent.mm.R.id.f485684im5);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.f485799j40);
        this.f146384v = linearLayout;
        linearLayout.setOnClickListener(onClickListener);
        this.Q = new com.tencent.mm.plugin.luckymoney.ui.b(this);
        android.view.View inflate = getLayoutInflater().inflate(com.tencent.mm.R.layout.buc, (android.view.ViewGroup) null);
        this.S = inflate;
        this.Q.setContentView(inflate, new android.view.ViewGroup.LayoutParams(-1, -1));
        this.S.findViewById(com.tencent.mm.R.id.j0q).setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.zg(this));
        this.Q.f146732f = new com.tencent.mm.plugin.luckymoney.ui.ah(this);
        this.R = (android.view.ViewGroup) this.S.findViewById(com.tencent.mm.R.id.j0s);
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel wi6 = ((g30.c0) com.tencent.mm.pluginsdk.ui.chat.i6.a()).wi(getContext());
        this.P = wi6;
        wi6.setTalkerName(this.C);
        fc3.j.b(this.P);
        this.f146385w = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.j3q);
        this.f146386x = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f485787j22);
        this.f146389y = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f485786j21);
        if (this.f146388x1) {
            this.f146385w.setVisibility(4);
            this.f146369g.setBackgroundResource(com.tencent.mm.R.drawable.c_n);
            this.f146386x.setVisibility(0);
            this.f146389y.setVisibility(4);
            this.f146383u.setVisibility(8);
        }
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.luckymoney.model.d6 d6Var;
        com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper realnameGuideHelper;
        if (i17 != 1) {
            if (i17 == 5) {
                if (intent == null || !intent.hasExtra("result_data")) {
                    return;
                }
                android.os.Bundle bundleExtra = intent.getBundleExtra("result_data");
                if (bundleExtra == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyNewYearSendUI", "onActivityResult REQUEST_CODE_H5_PAY bundle is null");
                    return;
                }
                int P = com.tencent.mm.sdk.platformtools.t8.P(bundleExtra.getString("payState", "2"), 0);
                com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyNewYearSendUI", "onActivityResult REQUEST_CODE_H5_PAY payState is " + P);
                if (P == 0) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11701, 15, 3, 0, 1, 2);
                    finish();
                    return;
                }
                return;
            }
            if (i17 != 1111) {
                return;
            }
            if (i18 != -1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "go emoji capture failed!");
                return;
            }
            if (intent != null) {
                this.f146378p1 = intent.getLongExtra("key_enter_time", 0L);
            }
            if (com.tencent.mm.sdk.platformtools.t8.B0(this.f146378p1, 0L)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "mTimeEnter == 0L go emoji capture failed!");
                return;
            }
            Y6(4);
            c7(false);
            qr.e eVar = qr.e.f366008a;
            long j17 = this.f146378p1;
            qr.a callback = this.D1;
            kotlin.jvm.internal.o.g(callback, "callback");
            pm0.v.X(new qr.c(j17, callback));
            return;
        }
        if (i18 == -1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "do pay success!");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11701, 15, 3, 0, 1, 2);
            boolean z17 = (intent == null || !intent.hasExtra("key_realname_guide_helper") || (realnameGuideHelper = (com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper) intent.getParcelableExtra("key_realname_guide_helper")) == null) ? false : !realnameGuideHelper.a(this, null, new com.tencent.mm.plugin.luckymoney.ui.xg(this), null);
            if (this.T == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "dealXmlAddEmojiInfo() mEmojiInfo == null");
            } else {
                try {
                    int indexOf = this.E.indexOf("<wcpayinfo>");
                    if (indexOf > 0 && indexOf < this.E.length()) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        com.tencent.mm.api.IEmojiInfo iEmojiInfo = this.T;
                        if (iEmojiInfo == null) {
                            ((com.tencent.mm.feature.emoji.k0) ((com.tencent.mm.feature.emoji.api.v5) i95.n0.c(com.tencent.mm.feature.emoji.api.v5.class))).getClass();
                            iEmojiInfo = new com.tencent.mm.storage.emotion.EmojiInfo();
                        }
                        gb3.q.a(sb6, iEmojiInfo, 0);
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder(this.E.substring(0, indexOf));
                        java.lang.String trim = this.E.substring(indexOf).trim();
                        sb7.append((java.lang.CharSequence) sb6);
                        sb7.append(trim);
                        this.E = sb7.toString();
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "dealXmlAddEmojiInfo() success");
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "dealXmlAddEmojiInfo() Exception:%s", e17.getMessage());
                }
            }
            java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(this.E, "msg", null);
            if (d17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyNewYearSendUI", "luckymoneyNewYearSendUI onActivityResult values is null");
                finish();
                return;
            }
            if (hb3.o.Ni().Ui().a((java.lang.String) d17.get(".msg.appmsg.wcpayinfo.paymsgid"))) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "sendLocalMsg() for hb! mMsgXml:%s", this.E);
                com.tencent.mm.plugin.luckymoney.model.m5.C(this.E, this.C, 3);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyNewYearSendUI", "it is a duplicate msg");
            }
            if (!z17) {
                finish();
            }
            com.tencent.mm.autogen.mmdata.rpt.HBReportNewStruct hBReportNewStruct = new com.tencent.mm.autogen.mmdata.rpt.HBReportNewStruct();
            this.V = hBReportNewStruct;
            int i19 = this.X;
            if (i19 == 1) {
                hBReportNewStruct.f58415d = 8L;
            } else if (i19 == 2) {
                hBReportNewStruct.f58415d = 6L;
            } else if (i19 == 3) {
                hBReportNewStruct.f58415d = 7L;
            } else if (i19 == 4) {
                hBReportNewStruct.f58415d = 14L;
            }
            hBReportNewStruct.k();
            Z6(1);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "do pay cancel or failed!");
        }
        java.lang.String r17 = c01.z1.r();
        if (i18 == -1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "onActivityResult() resultCode == RESULT_OK");
            this.E1 = 1;
            java.lang.String str = this.f146391y1;
            java.lang.String str2 = this.f146393z1;
            java.lang.String str3 = this.C;
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            d6Var = new com.tencent.mm.plugin.luckymoney.model.d6(str, str2, 1, r17, str3 == null ? "" : str3);
        } else {
            if (intent != null) {
                this.E1 = intent.getIntExtra("key_pay_reslut_type", 3);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "doNetSceneLuckyMoneyReport() data == null");
                this.E1 = 3;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "onActivityResult() resultCode != RESULT_OK  payType:%s", java.lang.Integer.valueOf(this.E1));
            java.lang.String str4 = this.f146391y1;
            java.lang.String str5 = this.f146393z1;
            int i27 = this.E1;
            java.lang.String str6 = this.C;
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            d6Var = new com.tencent.mm.plugin.luckymoney.model.d6(str4, str5, i27, r17, str6 == null ? "" : str6);
        }
        gm0.j1.n().f273288b.g(d6Var);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Z6(2);
        finish();
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "lucky send ui create");
        this.C = getIntent().getStringExtra("key_username");
        this.D = getIntent().getIntExtra("key_way", 0);
        this.G = getIntent().getIntExtra("pay_channel", -1);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.C)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LuckyMoneyNewYearSendUI", "name null finish");
            finish();
        }
        this.f146388x1 = com.tencent.mm.plugin.luckymoney.model.m5.s();
        initView();
        boolean z17 = this.f146388x1;
        com.tencent.mm.sdk.event.IListener iListener = this.A1;
        if (z17) {
            doSceneProgress(new yb3.f());
            iListener.alive();
        } else {
            doSceneProgress(new com.tencent.mm.plugin.luckymoney.model.x5(8, "v1.0", ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_ENVELOPE_HAS_SOURCE_INT_SYNC, 0)).intValue()));
            iListener.dead();
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13079, 1, 1);
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        android.app.Dialog dialog = this.F;
        if (dialog != null && dialog.isShowing()) {
            this.F.dismiss();
        }
        if (this.P != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "commentfooter release");
            this.P.h();
            this.P.getClass();
            this.P.a();
        }
        qr.e.f366008a.b(this.f146378p1, this.D1);
        this.A1.dead();
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "onSceneEnd() errType:" + i17 + " errCode:" + i18 + " errMsg:" + str + " netsceneType:" + m1Var.getType());
        if (m1Var instanceof com.tencent.mm.plugin.luckymoney.model.x5) {
            if (i17 == 0 && i18 == 0) {
                com.tencent.mm.plugin.luckymoney.model.x5 x5Var = (com.tencent.mm.plugin.luckymoney.model.x5) m1Var;
                this.I = x5Var.f145698m;
                this.H = x5Var.f145696h;
                int i19 = x5Var.f145711z;
                this.K = i19;
                this.L = x5Var.A;
                this.f146393z1 = x5Var.f145704s;
                this.M = x5Var.D;
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "enableSelfIe is %s", java.lang.Integer.valueOf(i19));
                X6();
                d7();
                java.lang.String str2 = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_HONGBAO_NEW_YEAR_LAST_SEND_EMOJI_MD5_STRING, "");
                if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                    Y6(0);
                } else {
                    a7(str2);
                }
                setContentViewVisibility(0);
                com.tencent.mm.plugin.luckymoney.model.m5.B(this.f146369g, null);
                return true;
            }
            finish();
        } else if (m1Var instanceof yb3.f) {
            if (i17 == 0 && i18 == 0) {
                yb3.f fVar = (yb3.f) m1Var;
                int i27 = fVar.f460695p;
                if (i27 == 1) {
                    this.I = fVar.f460692m;
                    this.H = fVar.f460693n;
                    this.M = fVar.f460696q;
                    X6();
                    d7();
                    setContentViewVisibility(0);
                    com.tencent.mm.plugin.luckymoney.model.m5.B(this.f146369g, null);
                    return true;
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyNewYearSendUI", "hk sceneSwitch is %d", java.lang.Integer.valueOf(i27));
                finish();
            } else {
                finish();
            }
        } else if (m1Var instanceof com.tencent.mm.plugin.luckymoney.model.z5) {
            android.app.Dialog dialog = this.F;
            if (dialog != null && dialog.isShowing()) {
                this.F.dismiss();
            }
            if (i17 == 0 && i18 == 0) {
                java.lang.String str3 = ((com.tencent.mm.plugin.luckymoney.model.z5) m1Var).f145738h;
                if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyNewYearSendUI", "payUrl is null");
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "payUrl is not null");
                    com.tencent.mm.wallet_core.ui.r1.W(getContext(), str3, false, 5);
                }
            }
        } else if (m1Var instanceof com.tencent.mm.plugin.luckymoney.model.h6) {
            android.app.Dialog dialog2 = this.F;
            if (dialog2 != null && dialog2.isShowing()) {
                this.F.dismiss();
            }
            if (i17 == 0 && i18 == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "send hb success!");
                com.tencent.mm.plugin.luckymoney.model.h6 h6Var = (com.tencent.mm.plugin.luckymoney.model.h6) m1Var;
                this.E = h6Var.f145325m;
                com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = new com.tencent.mm.pluginsdk.wallet.PayInfo();
                payInfo.f192114m = h6Var.f145324i;
                payInfo.f192109e = 37;
                payInfo.f192111g = this.G;
                h45.a0.f(this, payInfo, 1);
                return true;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyNewYearSendUI", "send hb failed!");
        } else {
            if (m1Var instanceof com.tencent.mm.plugin.luckymoney.model.k6) {
                android.app.Dialog dialog3 = this.F;
                if (dialog3 != null && dialog3.isShowing()) {
                    this.F.dismiss();
                }
                if (i17 != 0 || i18 != 0) {
                    if (i18 == 268502454) {
                        db5.e1.t(this, str, "", new com.tencent.mm.plugin.luckymoney.ui.vg(this, m1Var));
                        return true;
                    }
                    com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyNewYearSendUI", "send hb failed!");
                    this.E1 = 2;
                    if (android.text.TextUtils.isEmpty(str)) {
                        str = getString(com.tencent.mm.R.string.l0g);
                    }
                    setContentViewVisibility(4);
                    db5.e1.G(this, str, null, false, new com.tencent.mm.plugin.luckymoney.ui.wg(this, this));
                    return true;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "send hb success!");
                com.tencent.mm.plugin.luckymoney.model.k6 k6Var = (com.tencent.mm.plugin.luckymoney.model.k6) m1Var;
                this.E = k6Var.f145400m;
                this.f146391y1 = k6Var.f145398h;
                if (k6Var.isJumpRemind()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "onSceneEnd() NetScenePrepareNewYearLuckyMoney show JumpRemind Alert");
                    k6Var.f145515f.h(this, new com.tencent.mm.plugin.luckymoney.ui.ug(this));
                    return true;
                }
                com.tencent.mm.pluginsdk.wallet.PayInfo payInfo2 = new com.tencent.mm.pluginsdk.wallet.PayInfo();
                payInfo2.f192114m = k6Var.f145399i;
                payInfo2.f192109e = 37;
                payInfo2.f192111g = this.G;
                h45.a0.f(this, payInfo2, 1);
                return true;
            }
            if (m1Var instanceof com.tencent.mm.plugin.luckymoney.model.d6) {
                return true;
            }
        }
        return false;
    }
}
