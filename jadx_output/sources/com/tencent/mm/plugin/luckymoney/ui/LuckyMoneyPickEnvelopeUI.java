package com.tencent.mm.plugin.luckymoney.ui;

@db5.a(1)
/* loaded from: classes9.dex */
public class LuckyMoneyPickEnvelopeUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: x1, reason: collision with root package name */
    public static final /* synthetic */ int f146514x1 = 0;
    public java.lang.String A;
    public android.app.Dialog B;
    public android.view.View C;
    public com.tencent.mm.plugin.luckymoney.scaledLayout.b D;
    public android.widget.Button E;
    public android.widget.TextView F;
    public java.util.LinkedList G;
    public androidx.recyclerview.widget.w2 H;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f146515J;
    public java.lang.String K;
    public java.lang.String L;
    public java.lang.String M;
    public long N;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f146520h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyEnvelopeTouchRecyclerView f146521i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.scaledLayout.ScaleLayoutManager f146523m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.ui.ym f146524n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f146525o;

    /* renamed from: p, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f146526p;

    /* renamed from: q, reason: collision with root package name */
    public androidx.recyclerview.widget.GridLayoutManager f146529q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.ui.ym f146530r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f146531s;

    /* renamed from: x0, reason: collision with root package name */
    public r45.r74 f146537x0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f146516d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f146517e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f146518f = false;

    /* renamed from: g, reason: collision with root package name */
    public int f146519g = 0;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.List f146532t = new java.util.ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public boolean f146533u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f146534v = -1;

    /* renamed from: w, reason: collision with root package name */
    public int f146535w = -1;

    /* renamed from: x, reason: collision with root package name */
    public boolean f146536x = false;

    /* renamed from: y, reason: collision with root package name */
    public boolean f146538y = false;

    /* renamed from: z, reason: collision with root package name */
    public int f146540z = 0;
    public boolean I = true;
    public boolean P = false;
    public boolean Y = false;
    public boolean Z = false;

    /* renamed from: p0, reason: collision with root package name */
    public r45.lm5 f146527p0 = null;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f146539y0 = false;

    /* renamed from: l1, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f146522l1 = new com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI.AnonymousClass6(com.tencent.mm.app.a0.f53288d);

    /* renamed from: p1, reason: collision with root package name */
    public boolean f146528p1 = false;

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI$6, reason: invalid class name */
    /* loaded from: classes9.dex */
    public class AnonymousClass6 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RefreshLuckyMoneyEnvelopeListEvent> {
        public AnonymousClass6(androidx.lifecycle.y yVar) {
            super(yVar);
            this.__eventId = 220103977;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.RefreshLuckyMoneyEnvelopeListEvent refreshLuckyMoneyEnvelopeListEvent) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.luckymoney.ui.nm(this));
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void T6(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI r11) {
        /*
            r11.getClass()
            java.lang.String r0 = "MicroMsg.LuckyMoneyPickEnvelopeUI"
            java.lang.String r1 = "[doCancel]"
            com.tencent.mars.xlog.Log.i(r0, r1)
            int r0 = r11.f146534v
            if (r0 < 0) goto L25
            java.util.List r1 = r11.f146532t
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r2 = r1.size()
            if (r0 >= r2) goto L25
            int r0 = r11.f146534v
            java.lang.Object r0 = r1.get(r0)
            com.tencent.mm.plugin.luckymoney.ui.zm r0 = (com.tencent.mm.plugin.luckymoney.ui.zm) r0
            r45.wv3 r0 = r0.f147793b
            java.lang.String r0 = r0.f389500f
            goto L27
        L25:
            java.lang.String r0 = ""
        L27:
            r5 = r0
            com.tencent.mm.plugin.report.service.g0 r0 = com.tencent.mm.plugin.report.service.g0.INSTANCE
            r1 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r2 = r11.f146535w
            int r2 = r2 + 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r11.f146534v
            int r3 = r3 + 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = r11.K
            java.lang.String r6 = r11.f146515J
            com.tencent.mm.plugin.luckymoney.ui.ym r7 = r11.f146524n
            int r7 = r7.getItemCount()
            int r7 = r7 + (-1)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            int r8 = r11.a7()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            int r9 = r11.k7()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r10 = r11.j7()
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10}
            r2 = 18892(0x49cc, float:2.6473E-41)
            r0.d(r2, r1)
            java.lang.String r1 = r11.M
            boolean r1 = com.tencent.mm.sdk.platformtools.t8.K0(r1)
            if (r1 != 0) goto L92
            java.lang.String r1 = r11.M
            r2 = 4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            long r3 = r11.N
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r5 = r5 - r3
            r3 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 / r3
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2, r3}
            r2 = 22104(0x5658, float:3.0974E-41)
            r0.d(r2, r1)
        L92:
            r0 = 0
            r11.setResult(r0)
            r11.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI.T6(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI):void");
    }

    public static r45.wv3 U6(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI, java.lang.String str) {
        java.lang.String str2;
        java.util.Iterator it = ((java.util.ArrayList) luckyMoneyPickEnvelopeUI.f146532t).iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.luckymoney.ui.zm zmVar = (com.tencent.mm.plugin.luckymoney.ui.zm) it.next();
            r45.wv3 wv3Var = zmVar.f147793b;
            if (wv3Var != null && (str2 = wv3Var.f389500f) != null && str2.equals(str)) {
                return zmVar.f147793b;
            }
        }
        return null;
    }

    public static void V6(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "thumbMode doSelectItem newPos: %s lastSelect：%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(luckyMoneyPickEnvelopeUI.f146534v));
        if (i17 == luckyMoneyPickEnvelopeUI.f146534v || i17 < 0) {
            return;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) luckyMoneyPickEnvelopeUI.f146532t;
        if (i17 < arrayList.size()) {
            com.tencent.mm.plugin.luckymoney.ui.zm zmVar = (com.tencent.mm.plugin.luckymoney.ui.zm) arrayList.get(i17);
            r45.wv3 wv3Var = zmVar.f147793b;
            if (wv3Var != null && (wv3Var.f389503i == 1 || wv3Var.f389507p == 1)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "expired: %s", java.lang.Integer.valueOf(i17));
                int i18 = luckyMoneyPickEnvelopeUI.f146534v;
                if (i18 < 0 || i18 >= arrayList.size()) {
                    return;
                }
                ((com.tencent.mm.plugin.luckymoney.ui.zm) arrayList.get(luckyMoneyPickEnvelopeUI.f146534v)).f147792a = false;
                luckyMoneyPickEnvelopeUI.m7(luckyMoneyPickEnvelopeUI.f146534v, false);
                luckyMoneyPickEnvelopeUI.f146534v = -1;
                return;
            }
            if (zmVar.f147794c) {
                luckyMoneyPickEnvelopeUI.f146534v = -2;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "do select pos: %s", java.lang.Integer.valueOf(i17));
                int i19 = luckyMoneyPickEnvelopeUI.f146534v;
                if (i19 >= 0 && i19 < arrayList.size()) {
                    ((com.tencent.mm.plugin.luckymoney.ui.zm) arrayList.get(luckyMoneyPickEnvelopeUI.f146534v)).f147792a = false;
                    luckyMoneyPickEnvelopeUI.m7(luckyMoneyPickEnvelopeUI.f146534v, false);
                }
                zmVar.f147792a = true;
                luckyMoneyPickEnvelopeUI.f146534v = i17;
                luckyMoneyPickEnvelopeUI.m7(i17, true);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "thumb mode finalSelect: %s", java.lang.Integer.valueOf(luckyMoneyPickEnvelopeUI.f146534v));
        }
    }

    public static void W6(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI, java.lang.String str) {
        luckyMoneyPickEnvelopeUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "do delete show source: %s", str);
        luckyMoneyPickEnvelopeUI.B = db5.e1.O(luckyMoneyPickEnvelopeUI.getContext(), null, 3, com.tencent.mm.R.style.f494256i6, luckyMoneyPickEnvelopeUI.getString(com.tencent.mm.R.string.ggc), true, false, new com.tencent.mm.plugin.luckymoney.ui.vl(luckyMoneyPickEnvelopeUI));
        new com.tencent.mm.plugin.luckymoney.model.c(str).l().h(new com.tencent.mm.plugin.luckymoney.ui.xl(luckyMoneyPickEnvelopeUI, str));
    }

    public final void X6(r45.wv3 wv3Var) {
        r45.wv3 wv3Var2;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "click confirm: %s", java.lang.Integer.valueOf(this.f146534v));
        java.util.List list = this.f146532t;
        if (wv3Var != null) {
            java.lang.String str = !com.tencent.mm.sdk.platformtools.t8.K0(wv3Var.f389500f) ? wv3Var.f389500f : "0";
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "thumbMode click confirm: %s", str);
            Y6(str);
        } else {
            int i17 = this.f146534v;
            if (i17 >= 0 && i17 < ((java.util.ArrayList) list).size()) {
                com.tencent.mm.plugin.luckymoney.ui.zm zmVar = (com.tencent.mm.plugin.luckymoney.ui.zm) ((java.util.ArrayList) list).get(this.f146534v);
                if (zmVar.f147792a && (wv3Var2 = zmVar.f147793b) != null) {
                    java.lang.String str2 = wv3Var2.f389500f;
                    if (wv3Var2.f389506o == 3) {
                        java.lang.String str3 = wv3Var2.D;
                        int i18 = this.f146534v;
                        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "do doCheckAndUseTimeLimitPromo: %s", str2);
                        this.B = db5.e1.O(getContext(), null, 3, com.tencent.mm.R.style.f494256i6, getString(com.tencent.mm.R.string.gk8), true, false, new com.tencent.mm.plugin.luckymoney.ui.nl(this));
                        new com.tencent.mm.plugin.luckymoney.model.a(str2, str3).l().h(new com.tencent.mm.plugin.luckymoney.ui.ol(this, str2, i18)).f(this);
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(22104, zmVar.f147793b.f389500f, 3);
                    } else {
                        Y6(str2);
                    }
                }
            }
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.d(16822, 3);
        int i19 = this.f146534v;
        if (i19 < 0 || i19 >= ((java.util.ArrayList) list).size()) {
            return;
        }
        g0Var.d(18892, 1, java.lang.Integer.valueOf(this.f146535w + 1), java.lang.Integer.valueOf(this.f146534v + 1), this.K, ((com.tencent.mm.plugin.luckymoney.ui.zm) ((java.util.ArrayList) list).get(this.f146534v)).f147793b.f389500f, this.f146515J, java.lang.Integer.valueOf(this.f146524n.getItemCount() - 1), java.lang.Integer.valueOf(a7()), java.lang.Integer.valueOf(k7()), j7());
    }

    public final void Y6(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "do confirm source: %s", str);
        this.B = db5.e1.O(getContext(), null, 3, com.tencent.mm.R.style.f494256i6, getString(com.tencent.mm.R.string.ggc), true, false, new com.tencent.mm.plugin.luckymoney.ui.sl(this));
        pq5.g l17 = new com.tencent.mm.plugin.luckymoney.model.b(str).l();
        l17.f(this);
        l17.h(new com.tencent.mm.plugin.luckymoney.ui.ul(this, str));
    }

    public final void Z6(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "do get show source: %s, %s", java.lang.Boolean.valueOf(z17), this.A);
        if (z17) {
            this.A = "";
        }
        this.B = db5.e1.O(getContext(), null, 3, com.tencent.mm.R.style.f494256i6, getString(com.tencent.mm.R.string.ggc), true, false, new com.tencent.mm.plugin.luckymoney.ui.om(this));
        this.f146538y = true;
        com.tencent.mm.plugin.luckymoney.model.n0 g17 = com.tencent.mm.plugin.luckymoney.model.n0.g();
        g17.f213885c = new com.tencent.mm.plugin.luckymoney.model.h(this.A, 1);
        g17.c(new com.tencent.mm.plugin.luckymoney.ui.pm(this, z17), true);
    }

    public final int a7() {
        return this.f146519g == 1 ? 2 : 1;
    }

    public final java.lang.String b7() {
        int i17 = this.f146534v;
        if (i17 < 0) {
            return "";
        }
        java.util.List list = this.f146532t;
        if (i17 >= ((java.util.ArrayList) list).size()) {
            return "";
        }
        if (((com.tencent.mm.plugin.luckymoney.ui.zm) ((java.util.ArrayList) list).get(this.f146534v)).f147793b == null) {
            return "";
        }
        return ((com.tencent.mm.plugin.luckymoney.ui.zm) ((java.util.ArrayList) list).get(this.f146534v)).f147793b.f389500f;
    }

    public r45.lm5 c7() {
        if (this.f146527p0 == null) {
            this.f146527p0 = com.tencent.mm.plugin.luckymoney.model.m5.n();
        }
        return this.f146527p0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
    
        if (r5 == 2) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d7() {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI.d7():boolean");
    }

    public final void e7(boolean z17) {
        android.graphics.drawable.Drawable e17;
        android.graphics.drawable.Drawable e18;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "initActionBarModeSwitch， mViewMode: %s isInitial:%s", java.lang.Integer.valueOf(this.f146519g), java.lang.Boolean.valueOf(z17));
        if (this.f146516d) {
            return;
        }
        if (getSupportActionBar() == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "getSupportActionBar() == null");
            return;
        }
        android.view.View j17 = getSupportActionBar().j();
        if (j17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "actionBarCustomView() == null");
            return;
        }
        android.view.View findViewById = j17.findViewById(com.tencent.mm.R.id.oct);
        android.widget.TextView textView = (android.widget.TextView) j17.findViewById(android.R.id.text1);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) j17.findViewById(com.tencent.mm.R.id.ocr);
        if (findViewById == null || textView == null || weImageView == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "subview == null");
            return;
        }
        if (!z17) {
            if (this.f146519g == 1) {
                findViewById.setContentDescription(getResources().getString(com.tencent.mm.R.string.lf9));
                e17 = com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.lucky_money_pick_top_title_icon_thumb, getResources().getColor(com.tencent.mm.R.color.FG_0));
            } else {
                findViewById.setContentDescription(getResources().getString(com.tencent.mm.R.string.lf8));
                e17 = com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.lucky_money_pick_top_title_icon_normal, getResources().getColor(com.tencent.mm.R.color.FG_0));
            }
            weImageView.setImageDrawable(e17);
            return;
        }
        textView.setPadding(0, 0, 0, 0);
        textView.setTextColor(getResources().getColor(com.tencent.mm.R.color.FG_0));
        int b17 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 4);
        int b18 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 12);
        findViewById.setPadding(b18, b17, b18, b17);
        android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        layoutParams.height = -2;
        findViewById.setLayoutParams(layoutParams);
        if (com.tencent.mm.ui.bk.C()) {
            findViewById.setBackgroundResource(com.tencent.mm.R.drawable.amr);
        } else {
            findViewById.setBackgroundResource(com.tencent.mm.R.drawable.ams);
        }
        findViewById.setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.hm(this));
        findViewById.post(new com.tencent.mm.plugin.luckymoney.ui.im(this, findViewById));
        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) weImageView.getLayoutParams();
        layoutParams2.height = com.tencent.mm.ui.zk.a(getContext(), 16);
        layoutParams2.width = com.tencent.mm.ui.zk.a(getContext(), 16);
        layoutParams2.rightMargin = com.tencent.mm.ui.zk.a(getContext(), 4);
        weImageView.setLayoutParams(layoutParams2);
        if (this.f146519g == 1) {
            findViewById.setContentDescription(getResources().getString(com.tencent.mm.R.string.lf9));
            e18 = com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.lucky_money_pick_top_title_icon_thumb, getResources().getColor(com.tencent.mm.R.color.FG_0));
        } else {
            findViewById.setContentDescription(getResources().getString(com.tencent.mm.R.string.lf8));
            e18 = com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.lucky_money_pick_top_title_icon_normal, getResources().getColor(com.tencent.mm.R.color.FG_0));
        }
        weImageView.setImageDrawable(e18);
        weImageView.setVisibility(0);
    }

    public final boolean f7(java.lang.String str) {
        java.util.LinkedList linkedList = this.G;
        if (linkedList == null || linkedList.isEmpty()) {
            return false;
        }
        java.util.Iterator it = this.G.iterator();
        while (it.hasNext()) {
            if (((java.lang.String) it.next()).equals(str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "[isIllegalEnvelope] illegalId: %s", str);
                return true;
            }
        }
        return false;
    }

    public final boolean g7() {
        r45.wv3 wv3Var;
        int i17 = this.f146534v;
        if (i17 >= 0) {
            java.util.List list = this.f146532t;
            if (i17 < ((java.util.ArrayList) list).size()) {
                com.tencent.mm.plugin.luckymoney.ui.zm zmVar = (com.tencent.mm.plugin.luckymoney.ui.zm) ((java.util.ArrayList) list).get(this.f146534v);
                if (zmVar.f147792a && (wv3Var = zmVar.f147793b) != null && wv3Var.f389506o == 3) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489246bv3;
    }

    public final boolean h7() {
        r45.wv3 wv3Var;
        int i17 = this.f146534v;
        if (i17 >= 0) {
            java.util.List list = this.f146532t;
            if (i17 < ((java.util.ArrayList) list).size()) {
                com.tencent.mm.plugin.luckymoney.ui.zm zmVar = (com.tencent.mm.plugin.luckymoney.ui.zm) ((java.util.ArrayList) list).get(this.f146534v);
                if (zmVar.f147792a && (wv3Var = zmVar.f147793b) != null && wv3Var.f389506o == 4) {
                    return true;
                }
            }
        }
        return false;
    }

    public void i7(int i17) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(18892, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f146535w + 1), java.lang.Integer.valueOf(this.f146534v + 1), this.K, b7(), this.f146515J, java.lang.Integer.valueOf(this.f146524n.getItemCount() - 1), java.lang.Integer.valueOf(a7()), java.lang.Integer.valueOf(k7()), j7());
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f146520h = findViewById(com.tencent.mm.R.id.f485678il5);
        this.f146521i = (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyEnvelopeTouchRecyclerView) findViewById(com.tencent.mm.R.id.il_);
        this.f146531s = findViewById(com.tencent.mm.R.id.il6);
        this.E = (android.widget.Button) findViewById(com.tencent.mm.R.id.il7);
        this.F = (android.widget.TextView) findViewById(com.tencent.mm.R.id.il9);
        com.tencent.mm.plugin.luckymoney.ui.ym ymVar = new com.tencent.mm.plugin.luckymoney.ui.ym(this, 0);
        this.f146524n = ymVar;
        ymVar.setHasStableIds(true);
        this.f146521i.setAdapter(this.f146524n);
        this.f146521i.setItemAnimator(null);
        com.tencent.mm.plugin.luckymoney.ui.jm jmVar = new com.tencent.mm.plugin.luckymoney.ui.jm(this, this, 0);
        this.f146523m = jmVar;
        jmVar.assertNotInLayoutOrScroll(null);
        if (jmVar.Q != 0.8f) {
            jmVar.Q = 0.8f;
            jmVar.removeAllViews();
        }
        this.f146521i.setLayoutManager(this.f146523m);
        com.tencent.mm.plugin.luckymoney.scaledLayout.b bVar = new com.tencent.mm.plugin.luckymoney.scaledLayout.b();
        this.D = bVar;
        bVar.f145751g = this;
        bVar.b(this.f146521i);
        this.f146521i.f146115b2 = new com.tencent.mm.plugin.luckymoney.ui.km(this);
        getIntent().getStringExtra("key_exchange_title");
        getIntent().getStringExtra("key_exchange_url");
        this.E.setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.lm(this));
        java.lang.String string = getResources().getString(com.tencent.mm.R.string.gn9);
        com.tencent.mm.wallet_core.ui.r1.w0(this.F, string, 0, string.length(), new com.tencent.mm.wallet_core.ui.a0((com.tencent.mm.wallet_core.ui.z) new com.tencent.mm.plugin.luckymoney.ui.mm(this), true), getContext());
        int a17 = sp5.c.a(8);
        int i17 = com.tencent.mm.ui.bh.a(getContext()).f197135a;
        if (i17 <= 0) {
            android.graphics.Rect rect = new android.graphics.Rect();
            getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            i17 = rect.right - rect.left;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "calculateThumbItemSize : %s", java.lang.Integer.valueOf(i17));
        int i18 = (i17 - (a17 * 4)) / 3;
        this.Q = i18;
        float f17 = i18;
        int i19 = (int) (1.72f * f17);
        this.R = i19;
        int i27 = (int) (f17 / 1.0993f);
        this.S = i27;
        float f18 = i27;
        this.T = (int) (1.656f * f18);
        this.U = (int) (1.38f * f18);
        this.V = i18;
        this.W = i19;
        this.X = (int) (f18 / 2.9f);
        this.f146525o = findViewById(com.tencent.mm.R.id.ila);
        com.tencent.mm.plugin.luckymoney.ui.ym ymVar2 = new com.tencent.mm.plugin.luckymoney.ui.ym(this, 1);
        this.f146530r = ymVar2;
        ymVar2.setHasStableIds(true);
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.ilb);
        this.f146526p = recyclerView;
        recyclerView.setAdapter(this.f146530r);
        this.f146526p.setItemAnimator(null);
        androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = new androidx.recyclerview.widget.GridLayoutManager(getContext(), 3);
        this.f146529q = gridLayoutManager;
        gridLayoutManager.B = new com.tencent.mm.plugin.luckymoney.ui.em(this);
        this.f146526p.i(new com.tencent.mm.plugin.luckymoney.ui.fm(this));
        this.f146526p.setLayoutManager(this.f146529q);
        this.f146526p.N(new com.tencent.mm.plugin.luckymoney.ui.gm(this));
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_lucky_money_thumb_mode_close_config, false);
        boolean fj7 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_lucky_money_thumb_machine_close_config, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "initThumbMode, isOpenOldMachineCheck：%s", java.lang.Boolean.valueOf(fj7));
        boolean booleanValue = ((!fj7 || java.lang.Runtime.getRuntime().maxMemory() > 268435456 || android.os.Build.VERSION.SDK_INT >= 26) ? java.lang.Boolean.FALSE : java.lang.Boolean.TRUE).booleanValue();
        this.f146516d = fj6 || booleanValue;
        this.f146517e = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_lucky_money_thumb_mode_pag_close_config, false);
        java.util.HashMap hashMap = com.tencent.mm.plugin.luckymoney.model.m5.f145452a;
        boolean fj8 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_lucky_money_atmosphere_thumb_mode_detail_close_switch, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyUtil", "needCloseLuckyMoneyAtmosphereDynamicConfigPickThumb：%s ", java.lang.Boolean.valueOf(fj8));
        this.f146518f = fj8;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "initThumbMode, closeThumbModeConfig1 ：%s, oldMachine:%s, needCloseThumbMode:%s isCloseThumbPagView：%s，isCloseThumbAtmospherePagView ：%s", java.lang.Boolean.valueOf(fj6), java.lang.Boolean.valueOf(booleanValue), java.lang.Boolean.valueOf(this.f146516d), java.lang.Boolean.valueOf(this.f146517e), java.lang.Boolean.valueOf(this.f146518f));
        if (this.f146516d) {
            this.f146519g = 0;
        } else {
            this.f146519g = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_ENVELOPE_PICK_UI_MODE_SWITCH_INT_SYNC, 0)).intValue();
        }
        if (this.f146519g == 1) {
            android.view.View view = this.f146525o;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI", "initThumbMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI", "initThumbMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f146520h;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI", "initThumbMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI", "initThumbMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view3 = this.f146520h;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI", "initThumbMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI", "initThumbMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = this.f146525o;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI", "initThumbMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI", "initThumbMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        e7(true);
        androidx.appcompat.app.AppCompatActivity activity = getContext();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((com.tencent.mm.plugin.luckymoney.ui.jo) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.luckymoney.ui.jo.class)).getClass();
    }

    public final java.lang.String j7() {
        androidx.appcompat.app.AppCompatActivity activity = getContext();
        kotlin.jvm.internal.o.g(activity, "activity");
        return ((com.tencent.mm.plugin.luckymoney.ui.jo) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.luckymoney.ui.jo.class)).O6() ? com.tencent.mm.plugin.luckymoney.model.m5.g(c7()) : "";
    }

    public final int k7() {
        r45.lm5 c76;
        androidx.appcompat.app.AppCompatActivity activity = getContext();
        kotlin.jvm.internal.o.g(activity, "activity");
        if (((com.tencent.mm.plugin.luckymoney.ui.jo) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.luckymoney.ui.jo.class)).O6() && (c76 = c7()) != null && c76.f379628m) {
            return c76.f379622d == 1 ? 3 : 4;
        }
        return 1;
    }

    public final void l7() {
        com.tencent.mm.plugin.luckymoney.ui.ym ymVar;
        int i17;
        if (!(this.f146519g == 1) || this.f146525o.getVisibility() != 0 || (ymVar = this.f146530r) == null || this.f146526p == null || this.f146529q == null || (i17 = this.f146534v) < 0 || i17 >= ymVar.getItemCount()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "thumb scroll，pos: %s", java.lang.Integer.valueOf(this.f146534v));
        androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = this.f146529q;
        int i18 = this.f146534v;
        int i19 = this.R / 4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i19));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(gridLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI", "runScrollThumb", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        gridLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.f(gridLayoutManager, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI", "runScrollThumb", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
    }

    public final void m7(int i17, boolean z17) {
        com.tencent.mm.plugin.luckymoney.ui.rm rmVar = (com.tencent.mm.plugin.luckymoney.ui.rm) this.f146521i.p0(i17);
        com.tencent.mm.plugin.luckymoney.ui.rm rmVar2 = (com.tencent.mm.plugin.luckymoney.ui.rm) this.f146526p.p0(i17);
        if (rmVar != null) {
            rmVar.n(z17);
            if (rmVar instanceof com.tencent.mm.plugin.luckymoney.ui.co) {
                com.tencent.mm.plugin.luckymoney.ui.co coVar = (com.tencent.mm.plugin.luckymoney.ui.co) rmVar;
                com.tencent.mm.chatting.component.ListScrollPAGView listScrollPAGView = coVar.f146819r;
                if (listScrollPAGView != null && listScrollPAGView.getVisibility() == 0) {
                    com.tencent.mm.chatting.component.ListScrollPAGView listScrollPAGView2 = coVar.f146819r;
                    if (z17) {
                        if (!(this.f146519g == 1)) {
                            com.tencent.mm.plugin.luckymoney.model.n3.f145460a.i(listScrollPAGView2);
                        }
                    }
                    com.tencent.mm.plugin.luckymoney.model.n3.f145460a.j(listScrollPAGView2);
                }
                com.tencent.mm.chatting.component.ListScrollPAGView listScrollPAGView3 = coVar.f146814m;
                if (listScrollPAGView3 != null && listScrollPAGView3.getVisibility() == 0) {
                    if (z17) {
                        if (!(this.f146519g == 1)) {
                            coVar.f146817p = false;
                            com.tencent.mm.plugin.luckymoney.model.n3.f145460a.i(listScrollPAGView3);
                        }
                    }
                    coVar.f146817p = false;
                    com.tencent.mm.plugin.luckymoney.model.n3.f145460a.j(listScrollPAGView3);
                }
                com.tencent.mm.chatting.component.ListScrollPAGView listScrollPAGView4 = coVar.f146825x;
                if (listScrollPAGView4 != null && listScrollPAGView4.getVisibility() == 0) {
                    if (z17) {
                        if (!(this.f146519g == 1)) {
                            com.tencent.mm.plugin.luckymoney.model.n3.f145460a.i(listScrollPAGView4);
                        }
                    }
                    com.tencent.mm.plugin.luckymoney.model.n3.f145460a.j(listScrollPAGView4);
                }
            }
        }
        if (rmVar2 != null) {
            rmVar2.n(z17);
        }
    }

    public final void n7() {
        android.view.View view = this.f146531s;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI", "setEmptyStyle", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI", "setEmptyStyle", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = this.f146520h;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI", "setEmptyStyle", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI", "setEmptyStyle", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view3 = this.f146525o;
        if (view3 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI", "setEmptyStyle", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI", "setEmptyStyle", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final void o7(r45.r74 r74Var, java.lang.String str) {
        if (r74Var == null || com.tencent.mm.sdk.platformtools.t8.K0(r74Var.f384585d)) {
            java.lang.String stringExtra = getIntent().getStringExtra("key_exchange_url");
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "[dealOpenExchangeUrl] url ：%s , exchangeUrlDefault：%s", str, stringExtra);
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyPickEnvelopeUI", "[dealOpenExchangeUrl] exchangeUrl is null");
                    return;
                }
                str = stringExtra;
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(18892, 21, java.lang.Integer.valueOf(this.f146535w + 1), java.lang.Integer.valueOf(this.f146534v + 1), this.K, b7(), this.f146515J, java.lang.Integer.valueOf(this.f146524n.getItemCount() - 1), java.lang.Integer.valueOf(a7()), java.lang.Integer.valueOf(k7()), j7());
            addTextOptionMenu(1, getString(com.tencent.mm.R.string.gk6), i65.a.d(getContext(), com.tencent.mm.R.color.f479311vr), new com.tencent.mm.plugin.luckymoney.ui.dm(this, str));
            return;
        }
        this.f146537x0 = r74Var;
        boolean Jj = ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Jj(r74Var.f384585d);
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "[dealOpenLiteApp] enableLiteApp：%s, appid：%s，query：%s，path：%s", java.lang.Boolean.valueOf(Jj), r74Var.f384585d, r74Var.f384586e, r74Var.f384587f);
        if (!Jj) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyPickEnvelopeUI", "[dealOpenLiteApp] enableLiteApp failed");
            db5.t7.m(getContext(), getString(com.tencent.mm.R.string.lha));
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(18892, 23, java.lang.Integer.valueOf(this.f146535w + 1), java.lang.Integer.valueOf(this.f146534v + 1), this.K, b7(), this.f146515J, java.lang.Integer.valueOf(this.f146524n.getItemCount() - 1), java.lang.Integer.valueOf(a7()), java.lang.Integer.valueOf(k7()), j7());
        addTextOptionMenu(1, getString(com.tencent.mm.R.string.lf7), i65.a.d(getContext(), com.tencent.mm.R.color.FG_0), new com.tencent.mm.plugin.luckymoney.ui.yl(this));
        androidx.appcompat.app.AppCompatActivity activity = getContext();
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.luckymoney.ui.jo joVar = (com.tencent.mm.plugin.luckymoney.ui.jo) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.luckymoney.ui.jo.class);
        androidx.appcompat.app.b supportActionBar = joVar.getActivity().getSupportActionBar();
        if (supportActionBar == null || supportActionBar.j() == null) {
            return;
        }
        supportActionBar.j().postDelayed(new com.tencent.mm.plugin.luckymoney.ui.io(joVar), 100L);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 2 && i18 == -1 && intent != null) {
            r45.wv3 wv3Var = new r45.wv3();
            wv3Var.f389500f = intent.getStringExtra("key_source_materialId");
            wv3Var.f389506o = intent.getIntExtra("key_source_material_flag", 0);
            wv3Var.D = intent.getStringExtra("key_source_timelimit_promo_signature");
            X6(wv3Var);
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        r45.co3 a17;
        fixStatusbar(true);
        super.onCreate(bundle);
        hideActionbarLine();
        setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478489a));
        initView();
        setMMTitle(com.tencent.mm.R.string.gmw);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.N = android.os.SystemClock.elapsedRealtime();
        getIntent().getByteArrayExtra("key_source_resp");
        getIntent().getBooleanExtra("key_has_source", true);
        boolean z18 = false;
        getIntent().getBooleanExtra("key_has_reddot", false);
        this.f146515J = getIntent().getStringExtra("key_session_id");
        this.L = getIntent().getStringExtra("packetId");
        java.util.HashMap hashMap = com.tencent.mm.plugin.luckymoney.model.m5.f145452a;
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_lucky_money_dynamic_pick_close_switch, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyUtil", "needCloseLuckyMoneyDynamicConfigPick：%s ", java.lang.Boolean.valueOf(fj6));
        this.Y = fj6;
        boolean fj7 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_lucky_money_atmosphere_dynamic_pick_close_switch, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyUtil", "needCloseLuckyMoneyDynamicConfigPick：%s ", java.lang.Boolean.valueOf(fj7));
        this.Z = fj7;
        boolean booleanExtra = getIntent().getBooleanExtra("key_has_resp", false);
        if (bundle != null) {
            this.f146539y0 = bundle.getBoolean("hasRestoredState", false);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "[onCreate] shouldScrollPacketId: %s ， hasResp: %s , isRestoreCreate: %s", this.L, java.lang.Boolean.valueOf(booleanExtra), java.lang.Boolean.valueOf(this.f146539y0));
        if (booleanExtra && !this.f146539y0 && (a17 = com.tencent.mm.plugin.luckymoney.model.n0.g().a()) != null && a17.f371703d == 0) {
            this.A = a17.f371706g;
            this.f146540z = a17.f371707h;
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "[onCreate] updateByResp use cache");
            p7(a17, true);
            this.f146521i.post(new com.tencent.mm.plugin.luckymoney.ui.ml(this));
            l7();
            z18 = true;
        }
        if (!z18) {
            Z6(true);
        }
        setBackBtn(new com.tencent.mm.plugin.luckymoney.ui.am(this));
        q7();
        this.f146522l1.alive();
        com.tencent.mm.wallet_core.ui.b0.c(getClass().getSimpleName());
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f146522l1.dead();
        com.tencent.mm.wallet_core.ui.b0.d(getClass().getSimpleName());
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity
    public void onRestoreInstanceState(android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "onRestoreInstanceState");
        this.f146539y0 = true;
        super.onRestoreInstanceState(bundle);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "onSaveInstanceState");
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            bundle.putBoolean("hasRestoredState", true);
        }
    }

    public final void p7(r45.co3 co3Var, boolean z17) {
        java.util.List list;
        boolean z18;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "[updateByResp]");
        this.f146536x = co3Var.f371710n == 1;
        java.lang.String str = "";
        if (!com.tencent.mm.sdk.platformtools.t8.K0(co3Var.f371708i)) {
            java.util.ArrayList arrayList = new java.util.ArrayList(com.tencent.mm.sdk.platformtools.t8.O1((java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_ENVELOPE_ILLEGAL2_STRING_SYNC, ""), ","));
            java.util.LinkedList linkedList = co3Var.f371709m;
            this.G = linkedList;
            if (linkedList == null || linkedList.isEmpty()) {
                z18 = false;
            } else {
                java.util.Iterator it = this.G.iterator();
                z18 = false;
                while (it.hasNext()) {
                    java.lang.String str2 = (java.lang.String) it.next();
                    if (!arrayList.contains(str2)) {
                        arrayList.add(str2);
                        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "show illegal id: %s", str2);
                        z18 = true;
                    }
                }
            }
            if (z18) {
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_ENVELOPE_ILLEGAL2_STRING_SYNC, com.tencent.mm.sdk.platformtools.t8.c1(arrayList, ","));
                db5.e1.E(this, co3Var.f371708i, "", getString(com.tencent.mm.R.string.f490455vj), false, new com.tencent.mm.plugin.luckymoney.ui.qm(this));
            }
        }
        java.util.LinkedList linkedList2 = co3Var.f371705f;
        if (linkedList2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyPickEnvelopeUI", "[updateByResp] resp list is null");
        } else if (linkedList2.isEmpty()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyPickEnvelopeUI", "[updateByResp] resp.sourcelist.isEmpty()");
            n7();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "[updateByResp] original resp list size: %s", java.lang.Integer.valueOf(linkedList2.size()));
            r45.r74 r74Var = new r45.r74();
            boolean z19 = !com.tencent.mm.sdk.platformtools.t8.K0(this.L);
            java.util.Iterator it6 = linkedList2.iterator();
            int i17 = -1;
            int i18 = 0;
            while (true) {
                boolean hasNext = it6.hasNext();
                list = this.f146532t;
                if (!hasNext) {
                    break;
                }
                r45.wv3 wv3Var = (r45.wv3) it6.next();
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "[updateByResp] id: %s , flag: %s , is_expired: %s", wv3Var.f389500f, java.lang.Integer.valueOf(wv3Var.f389507p), java.lang.Integer.valueOf(wv3Var.f389503i));
                if (wv3Var.f389507p == 1 || wv3Var.f389503i == 1 || f7(wv3Var.f389500f)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "[updateByResp] filter unused envelope: %s", wv3Var.f389500f);
                } else {
                    com.tencent.mm.plugin.luckymoney.ui.zm zmVar = new com.tencent.mm.plugin.luckymoney.ui.zm(null);
                    zmVar.f147793b = wv3Var;
                    if (z17) {
                        if (z19) {
                            java.lang.String str3 = wv3Var.f389500f;
                            if (str3 != null && str3.equals(this.L)) {
                                zmVar.f147792a = true;
                            }
                        } else {
                            boolean z27 = (wv3Var.f389503i == 1 || wv3Var.f389507p == 1 || f7(wv3Var.f389500f)) ? false : true;
                            zmVar.f147792a = wv3Var.f389504m == 1 && z27;
                            if (i17 < 0 && z27) {
                                r45.wv3 wv3Var2 = zmVar.f147793b;
                                r45.r74 r74Var2 = wv3Var2.E;
                                str = wv3Var2.f389515x;
                                r74Var = r74Var2;
                                i17 = i18;
                            }
                        }
                        if (zmVar.f147792a) {
                            this.f146534v = i18;
                            r45.wv3 wv3Var3 = zmVar.f147793b;
                            o7(wv3Var3.E, wv3Var3.f389515x);
                        }
                    }
                    if (wv3Var.f389506o == 3) {
                        java.lang.String str4 = wv3Var.f389500f;
                        this.M = str4;
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(22104, str4, 1);
                    }
                    r45.xv3 xv3Var = wv3Var.f389501g;
                    if (xv3Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(xv3Var.f390485o)) {
                        this.f146533u = true;
                    }
                    r45.xv3 xv3Var2 = wv3Var.f389501g;
                    if (xv3Var2 != null && !com.tencent.mm.sdk.platformtools.t8.K0(xv3Var2.F)) {
                        this.f146521i.setClipChildren(false);
                        this.f146521i.setClipToPadding(false);
                    }
                    ((java.util.ArrayList) list).add(zmVar);
                    i18++;
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "[updateByResp] final resp list size: %s, mSelectPos：%s, is_show_expired_entry：%s", java.lang.Integer.valueOf(((java.util.ArrayList) list).size()), java.lang.Integer.valueOf(this.f146534v), java.lang.Integer.valueOf(co3Var.f371712p));
            if (((java.util.ArrayList) list).isEmpty()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyPickEnvelopeUI", "[updateByResp] final envelopeModelList isEmpty");
                n7();
            } else {
                if (this.f146534v < 0) {
                    if (i17 >= 0) {
                        this.f146534v = i17;
                    } else {
                        this.f146534v = 0;
                    }
                    o7(r74Var, str);
                    int i19 = this.f146534v;
                    if (i19 >= 0 && i19 < ((java.util.ArrayList) list).size()) {
                        ((com.tencent.mm.plugin.luckymoney.ui.zm) ((java.util.ArrayList) list).get(this.f146534v)).f147792a = true;
                    }
                }
                if (co3Var.f371712p == 1) {
                    com.tencent.mm.plugin.luckymoney.ui.zm zmVar2 = new com.tencent.mm.plugin.luckymoney.ui.zm(null);
                    zmVar2.f147793b = new r45.wv3();
                    zmVar2.f147794c = true;
                    ((java.util.ArrayList) list).add(zmVar2);
                }
                if (this.I) {
                    this.I = false;
                    int i27 = this.f146534v;
                    this.f146535w = i27;
                    if (i27 >= 0 && i27 < ((java.util.ArrayList) list).size()) {
                        this.K = ((com.tencent.mm.plugin.luckymoney.ui.zm) ((java.util.ArrayList) list).get(this.f146535w)).f147793b.f389500f;
                    }
                }
            }
        }
        this.f146524n.notifyDataSetChanged();
        this.f146530r.notifyDataSetChanged();
        q7();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(18892, 11, java.lang.Integer.valueOf(this.f146535w + 1), java.lang.Integer.valueOf(this.f146534v + 1), this.K, b7(), this.f146515J, java.lang.Integer.valueOf(this.f146524n.getItemCount() - 1), java.lang.Integer.valueOf(a7()), java.lang.Integer.valueOf(k7()), j7());
    }

    public final void q7() {
        int i17 = this.f146534v;
        if (i17 == -1) {
            this.E.setEnabled(false);
            this.E.setText(com.tencent.mm.R.string.gko);
            this.E.setVisibility(0);
        } else if (i17 == -2) {
            if (!this.P) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(22302, 2);
                this.P = true;
            }
            this.F.setVisibility(4);
            this.E.setVisibility(4);
        } else if (h7()) {
            this.F.setVisibility(4);
            this.E.setVisibility(4);
        } else {
            this.E.setEnabled(true);
            if (g7()) {
                this.E.setText(com.tencent.mm.R.string.gkd);
            } else {
                this.E.setText(com.tencent.mm.R.string.gko);
            }
            if (this.f146534v == 0) {
                this.F.setVisibility(4);
            } else {
                this.F.setVisibility(0);
            }
            this.E.setVisibility(0);
        }
        java.util.List list = this.f146532t;
        if (list == null || !((java.util.ArrayList) list).isEmpty()) {
            return;
        }
        this.E.setVisibility(4);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(com.tencent.mm.plugin.luckymoney.ui.jo.class);
    }
}
