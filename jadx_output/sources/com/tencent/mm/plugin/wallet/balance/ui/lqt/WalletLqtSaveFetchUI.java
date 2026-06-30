package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class WalletLqtSaveFetchUI extends com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtBasePresenterUI implements mp5.v {
    public static final /* synthetic */ int R1 = 0;
    public android.widget.LinearLayout A;
    public int A1;
    public android.widget.LinearLayout B;
    public java.lang.String B1;
    public android.widget.LinearLayout C;
    public com.tencent.mm.plugin.wallet.balance.ui.lqt.d C1;
    public android.widget.TextView D;
    public boolean D1;
    public android.widget.TextView E;
    public long E1;
    public boolean F;
    public int F1;
    public com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtArriveTimeLayout G;
    public com.tencent.mm.ui.widget.dialog.z2 G1;
    public android.widget.ScrollView H;
    public boolean H1;
    public android.widget.TextView I;
    public boolean I1;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.TextView f178052J;
    public final com.tencent.mm.plugin.wallet.balance.model.lqt.k0 J1;
    public android.widget.LinearLayout K;
    public final java.util.HashMap K1;
    public android.widget.TextView L;
    public final android.view.View.OnClickListener L1;
    public android.widget.TextView M;
    public final com.tencent.mm.sdk.event.IListener M1;
    public android.widget.TextView N;
    public int N1;
    public final java.lang.Runnable O1;
    public com.tencent.mm.plugin.wallet.balance.ui.lqt.LqtSaveKeyboardToolBarLayout P;
    public final java.lang.Runnable P1;
    public java.lang.CharSequence Q;
    public final com.tencent.mm.sdk.event.IListener Q1;
    public com.tencent.mm.plugin.wallet_core.model.Bankcard R;
    public int S;
    public long T;
    public com.tencent.mm.plugin.wallet_core.model.Bankcard U;
    public boolean V;
    public java.lang.String W;
    public com.tencent.mm.plugin.wallet_core.model.Bankcard X;
    public java.lang.String Y;
    public int Z;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet.balance.model.lqt.w2 f178053e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet.balance.model.lqt.b3 f178054f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.ViewGroup f178055g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f178056h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f178057i;

    /* renamed from: l1, reason: collision with root package name */
    public boolean f178058l1;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f178059m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f178060n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ImageView f178061o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f178062p;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f178063p0;

    /* renamed from: p1, reason: collision with root package name */
    public boolean f178064p1;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f178065q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.ViewGroup f178066r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f178067s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.CheckBox f178068t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f178069u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.LinearLayout f178070v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.LinearLayout f178071w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.LinearLayout f178072x;

    /* renamed from: x0, reason: collision with root package name */
    public java.util.List f178073x0;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f178074x1;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f178075y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f178076y0;

    /* renamed from: y1, reason: collision with root package name */
    public java.lang.String f178077y1;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.LinearLayout f178078z;

    /* renamed from: z1, reason: collision with root package name */
    public boolean f178079z1;

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI$42, reason: invalid class name */
    /* loaded from: classes9.dex */
    public class AnonymousClass42 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WCPayLqtSaveFetchUIShowDialogEvent> {
        public AnonymousClass42(androidx.lifecycle.y yVar) {
            super(yVar);
            this.__eventId = -2140026809;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.WCPayLqtSaveFetchUIShowDialogEvent wCPayLqtSaveFetchUIShowDialogEvent) {
            com.tencent.mm.autogen.events.WCPayLqtSaveFetchUIShowDialogEvent wCPayLqtSaveFetchUIShowDialogEvent2 = wCPayLqtSaveFetchUIShowDialogEvent;
            am.b10 b10Var = wCPayLqtSaveFetchUIShowDialogEvent2.f54948g;
            r45.ce4 ce4Var = b10Var.f6205a;
            com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI = com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.this;
            if (ce4Var != null) {
                walletLqtSaveFetchUI.C1.a(ce4Var, new com.tencent.mm.plugin.wallet.balance.ui.lqt.g7(this));
            } else {
                java.lang.Long l17 = null;
                if (b10Var.f6206b != null) {
                    if (walletLqtSaveFetchUI.E1 != 0) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.WalletLqtSaveFetchUI", "last compliance usecase wast not stopped as expected!");
                    }
                    byte[] data = wCPayLqtSaveFetchUIShowDialogEvent2.f54948g.f6206b;
                    com.tencent.mm.plugin.wallet.balance.ui.lqt.h7 h7Var = new com.tencent.mm.plugin.wallet.balance.ui.lqt.h7(this);
                    kotlin.jvm.internal.o.g(data, "data");
                    if (!(data.length == 0)) {
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
                        create.putBinary("half_page_view_data", data);
                        create.putLong("usecase_platform_session", currentTimeMillis);
                        h45.q qVar = (h45.q) i95.n0.c(h45.q.class);
                        if (qVar != null) {
                            qVar.startUseCase("complianceHalfPage", create, new com.tencent.mm.plugin.wallet_core.utils.z(h7Var));
                        }
                        l17 = java.lang.Long.valueOf(currentTimeMillis);
                    }
                    walletLqtSaveFetchUI.E1 = l17 != null ? l17.longValue() : 0L;
                } else {
                    r45.na5 na5Var = b10Var.f6207c;
                    if (na5Var != null) {
                        com.tencent.mm.plugin.wallet.balance.model.lqt.f0 f0Var = new com.tencent.mm.plugin.wallet.balance.model.lqt.f0();
                        f0Var.f177629a = na5Var;
                        com.tencent.mm.plugin.wallet.balance.model.lqt.g0 g0Var = new com.tencent.mm.plugin.wallet.balance.model.lqt.g0(f0Var);
                        int i17 = com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.R1;
                        com.tencent.mm.ui.widget.dialog.z2 o76 = walletLqtSaveFetchUI.o7(null, g0Var, null);
                        walletLqtSaveFetchUI.b7(o76, g0Var);
                        o76.C();
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI$46, reason: invalid class name */
    /* loaded from: classes9.dex */
    public class AnonymousClass46 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.KindaBindCardEvent> {
        public AnonymousClass46(androidx.lifecycle.y yVar) {
            super(yVar);
            this.__eventId = 572563856;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.KindaBindCardEvent kindaBindCardEvent) {
            com.tencent.mm.autogen.events.KindaBindCardEvent kindaBindCardEvent2 = kindaBindCardEvent;
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtSaveFetchUI", "KindaBindCardEvent callback");
            if (kindaBindCardEvent2 == null) {
                return false;
            }
            com.tencent.mm.wallet_core.model.i1.a();
            com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI = com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.this;
            am.di diVar = kindaBindCardEvent2.f54454g;
            if (diVar != null) {
                if (diVar.f6453a) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtSaveFetchUI", "KindaBindCardEvent bindCard Succ");
                    int i17 = com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.R1;
                    walletLqtSaveFetchUI.f178054f.f177621d.b(walletLqtSaveFetchUI.S, walletLqtSaveFetchUI.Z, 1).h(new com.tencent.mm.plugin.wallet.balance.ui.lqt.l7(this, walletLqtSaveFetchUI.e7()));
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtSaveFetchUI", "KindaBindCardEvent bindCard Cancel");
                }
            }
            walletLqtSaveFetchUI.Q1.dead();
            return true;
        }
    }

    public WalletLqtSaveFetchUI() {
        com.tencent.mm.plugin.wallet.balance.model.lqt.w2 w2Var = new com.tencent.mm.plugin.wallet.balance.model.lqt.w2((com.tencent.mm.plugin.wallet.balance.model.lqt.d2) this.f177946d.b(this, com.tencent.mm.plugin.wallet.balance.model.lqt.d2.class), (com.tencent.mm.plugin.wallet.balance.model.lqt.i2) this.f177946d.a(this, com.tencent.mm.plugin.wallet.balance.model.lqt.i2.class), this, 1, 0);
        this.f178053e = w2Var;
        this.f178054f = new com.tencent.mm.plugin.wallet.balance.model.lqt.b3(w2Var);
        this.T = -1L;
        this.V = false;
        this.f178063p0 = false;
        this.f178076y0 = false;
        this.f178058l1 = false;
        this.f178064p1 = false;
        this.f178074x1 = false;
        this.f178077y1 = "";
        this.f178079z1 = false;
        this.A1 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.FG_1);
        this.B1 = "";
        this.D1 = false;
        this.E1 = 0L;
        this.H1 = true;
        this.I1 = false;
        this.J1 = new com.tencent.mm.plugin.wallet.balance.ui.lqt.d7(this);
        this.K1 = new java.util.HashMap();
        this.L1 = new com.tencent.mm.plugin.wallet.balance.ui.lqt.u6(this);
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.M1 = new com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.AnonymousClass42(a0Var);
        this.N1 = 0;
        this.O1 = new com.tencent.mm.plugin.wallet.balance.ui.lqt.i7(this);
        this.P1 = new com.tencent.mm.plugin.wallet.balance.ui.lqt.j7(this);
        this.Q1 = new com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.AnonymousClass46(a0Var);
    }

    public static void U6(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI, int i17) {
        walletLqtSaveFetchUI.getClass();
        if (i17 == 0) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(20287, 15);
        } else if (i17 == 1) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(17084, 27);
        } else {
            if (i17 != 2) {
                return;
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(17084, 29);
        }
    }

    public static void V6(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtSaveFetchUI", "reportSelectCardClicked, has show tips: %s", java.lang.Boolean.valueOf(walletLqtSaveFetchUI.F));
        if (walletLqtSaveFetchUI.F) {
            walletLqtSaveFetchUI.F = false;
            walletLqtSaveFetchUI.f178070v.setVisibility(8);
            com.tencent.mm.plugin.wallet.balance.model.lqt.l0 l0Var = com.tencent.mm.plugin.wallet.balance.model.lqt.l0.f177669q;
            boolean z17 = walletLqtSaveFetchUI.S == 1;
            l0Var.a(z17);
            r45.be4 be4Var = z17 ? l0Var.f177672a : l0Var.f177673b;
            if (be4Var != null) {
                be4Var.f370706q = null;
            }
        }
    }

    public static void W6(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI, com.tencent.mm.ui.widget.dialog.z2 z2Var, r45.bq bqVar) {
        walletLqtSaveFetchUI.getClass();
        if (z2Var == null || bqVar == null) {
            return;
        }
        z2Var.B();
        boolean z17 = true;
        walletLqtSaveFetchUI.f178064p1 = true;
        int i17 = bqVar.f370957d;
        if (i17 == 1) {
            walletLqtSaveFetchUI.finish();
            return;
        }
        if (i17 == 2) {
            com.tencent.mm.wallet_core.ui.r1.V(walletLqtSaveFetchUI.getContext(), bqVar.f370958e, true);
            return;
        }
        if (i17 == 3) {
            com.tencent.mm.wallet_core.ui.r1.b0(bqVar.f370959f, bqVar.f370958e, 0, 1000);
            return;
        }
        if (i17 != 4) {
            walletLqtSaveFetchUI.f178064p1 = false;
            z2Var.B();
            return;
        }
        if ("weixin://weui/selectbackcarddialog".equals(bqVar.f370958e)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(20287, 14);
            walletLqtSaveFetchUI.m7(walletLqtSaveFetchUI.B1, 0);
            return;
        }
        boolean equals = "weixin://mmpaylqt/lqtfetchui".equals(bqVar.f370958e);
        android.view.View.OnClickListener onClickListener = walletLqtSaveFetchUI.L1;
        if (equals) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(20287, 13);
            if (onClickListener != null) {
                onClickListener.onClick(null);
                return;
            }
            return;
        }
        if ("weixin://mmpaylqt/lqtsaveui".equals(bqVar.f370958e)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtSaveFetchUI", "bottom dialog click continue to save");
            if (onClickListener != null) {
                onClickListener.onClick(null);
                return;
            }
            return;
        }
        if (!"weixin://mmpaylqt/continuesave".equals(bqVar.f370958e)) {
            if ("weixin://mmpaylqt/continuefetch".equals(bqVar.f370958e)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtSaveFetchUI", "bottom dialog click continue fetch lqt, show cashier");
                com.tencent.mm.plugin.wallet.balance.model.lqt.w2 w2Var = walletLqtSaveFetchUI.f178053e;
                w2Var.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.LqtSaveFetchLogic", "continue fetch from halfpage");
                if (com.tencent.mm.sdk.platformtools.t8.K0(w2Var.f177737g)) {
                    z17 = false;
                } else {
                    w2Var.a();
                }
                if (z17) {
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtSaveFetchUI", "continue show fetch cashier fail, request fetch");
                if (onClickListener != null) {
                    onClickListener.onClick(null);
                    return;
                }
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtSaveFetchUI", "bottom dialog click continue save lqt, show cashier");
        com.tencent.mm.plugin.wallet.balance.model.lqt.w2 w2Var2 = walletLqtSaveFetchUI.f178053e;
        w2Var2.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.LqtSaveFetchLogic", "continue save from halfpage");
        r45.ff5 ff5Var = w2Var2.f177745o;
        if (ff5Var != null) {
            w2Var2.f177744n = true;
            ((java.util.HashMap) w2Var2.f177743m).put(ff5Var.f374282f, w2Var2.f177733c);
            w2Var2.c(w2Var2.f177745o, w2Var2.f177746p);
        } else {
            w2Var2.f177744n = false;
            z17 = false;
        }
        if (z17) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtSaveFetchUI", "continue show save cashier fail, request save");
        if (onClickListener != null) {
            onClickListener.onClick(null);
        }
    }

    public static void X6(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI, r45.na5 na5Var, int i17, r45.bq bqVar) {
        walletLqtSaveFetchUI.getClass();
        java.lang.String str = na5Var.f381208p;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = "";
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(29133, str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(bqVar.f370957d), bqVar.f370958e);
    }

    public static void Y6(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI) {
        if (walletLqtSaveFetchUI.D1) {
            return;
        }
        walletLqtSaveFetchUI.D1 = true;
        if (walletLqtSaveFetchUI.g7().f381756r) {
            walletLqtSaveFetchUI.mWcKeyboard.u();
        }
    }

    public final void Z6(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtSaveFetchUI", "check enable: %s, %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(this.f178076y0));
        if (!z17 || this.f178076y0) {
            d7(false);
            return;
        }
        if (this.S != 1) {
            if (!this.f178063p0 || (this.G.getSelectRedeemType() == null && this.G.getRedeemTypeList() != null && !this.G.getRedeemTypeList().isEmpty())) {
                d7(false);
                return;
            }
            if (this.G.getSelectRedeemType() != null) {
                int i17 = this.G.getSelectRedeemType().f370896d;
            }
            d7(true);
            return;
        }
        if (this.f178066r.getVisibility() != 0) {
            if (this.f178063p0) {
                d7(true);
            }
        } else if (this.f178068t.isChecked() && this.f178063p0) {
            d7(true);
        } else {
            d7(false);
        }
    }

    public final void a7() {
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtArriveTimeLayout walletLqtArriveTimeLayout = this.G;
        walletLqtArriveTimeLayout.f177930h = false;
        java.util.List list = walletLqtArriveTimeLayout.f177926d;
        if (list != null) {
            list.clear();
        }
        walletLqtArriveTimeLayout.f177928f = null;
        walletLqtArriveTimeLayout.f177927e.clear();
        walletLqtArriveTimeLayout.setVisibility(4);
    }

    public final void b7(com.tencent.mm.ui.widget.dialog.z2 z2Var, com.tencent.mm.plugin.wallet.balance.model.lqt.g0 g0Var) {
        r45.na5 na5Var;
        r45.bq bqVar;
        if (z2Var == null) {
            return;
        }
        long j07 = com.tencent.mm.wallet_core.ui.r1.j0(this.f178056h.getText() + "", "100");
        char c17 = (g0Var == null || (na5Var = g0Var.f177635a) == null || ((bqVar = na5Var.f381203h) == null && na5Var.f381204i == null)) ? (char) 0 : (bqVar == null || na5Var.f381204i == null) ? (char) 2 : (char) 1;
        r45.na5 na5Var2 = g0Var.f177635a;
        if (c17 == 2) {
            z2Var.F = new com.tencent.mm.plugin.wallet.balance.ui.lqt.w6(this, na5Var2, z2Var);
            return;
        }
        if (c17 == 1) {
            com.tencent.mm.plugin.wallet.balance.ui.lqt.x6 x6Var = new com.tencent.mm.plugin.wallet.balance.ui.lqt.x6(this, z2Var, na5Var2, g0Var, j07);
            com.tencent.mm.plugin.wallet.balance.ui.lqt.y6 y6Var = new com.tencent.mm.plugin.wallet.balance.ui.lqt.y6(this, z2Var, na5Var2, g0Var, j07);
            z2Var.D = x6Var;
            z2Var.E = y6Var;
        }
        z2Var.l(new com.tencent.mm.plugin.wallet.balance.ui.lqt.z6(this));
    }

    public final double c7(java.lang.String str, java.lang.String str2, int i17) {
        try {
            return new java.math.BigDecimal(com.tencent.mm.sdk.platformtools.t8.F(str.trim(), 0.0d) == 0.0d ? "0" : str.trim()).divide(new java.math.BigDecimal(str2.trim()), 5, i17).doubleValue();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletLqtSaveFetchUI", e17, "", new java.lang.Object[0]);
            return 0.0d;
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public void cleanUiData(int i17) {
        android.view.View.OnClickListener onClickListener;
        if (i17 != 1 || (onClickListener = this.L1) == null) {
            return;
        }
        onClickListener.onClick(null);
    }

    public final void d7(boolean z17) {
        this.mWcKeyboard.e(z17);
    }

    public final java.util.List e7() {
        java.util.List<com.tencent.mm.plugin.wallet_core.model.Bankcard> c17 = com.tencent.mm.plugin.wallet.balance.model.lqt.l0.f177669q.c(this.S == 1);
        if (c17 == null || c17.size() == 0) {
            c17 = vr4.f1.wi().Ai().n(true);
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard : c17) {
            if (!bankcard.v0() || vr4.f1.wi().Ai().y()) {
                if (this.S == 1 && (bankcard.field_support_lqt_turn_in == 1 || bankcard.v0())) {
                    linkedList.add(bankcard);
                }
                if (this.S == 2 && (bankcard.field_support_lqt_turn_out == 1 || bankcard.v0())) {
                    linkedList.add(bankcard);
                }
            } else {
                linkedList.add(bankcard);
            }
        }
        return linkedList;
    }

    public final int f7() {
        com.tencent.mm.plugin.wallet.balance.model.lqt.m1 b17 = com.tencent.mm.plugin.wallet.balance.model.lqt.m1.b();
        return b17.a() == null ? getIntent().getIntExtra("lqt_balance", 0) : b17.a().f385286f;
    }

    public final r45.ny4 g7() {
        int intExtra = getIntent().getIntExtra("entrance_type", 0);
        com.tencent.mm.plugin.wallet.balance.model.lqt.l0.f177669q.getClass();
        byte[] decode = android.util.Base64.decode(com.tencent.mm.sdk.platformtools.o4.M("WCPay.OnClickPurchaseRes").getString(((java.lang.String) gm0.j1.u().c().l(2, "")) + intExtra, ""), 0);
        r45.ny4 ny4Var = new r45.ny4();
        if (decode.length > 0) {
            try {
                ny4Var.parseFrom(decode);
            } catch (java.lang.Exception unused) {
            }
        }
        return ny4Var;
    }

    @Override // com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtBasePresenterUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d76;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        if (r4 == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0061, code lost:
    
        if ((r0 != null && (r0.isEmpty() ^ true)) != false) goto L43;
     */
    @Override // mp5.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h4(float r7) {
        /*
            r6 = this;
            android.widget.ScrollView r0 = r6.H
            if (r0 == 0) goto Lc6
            com.tencent.mm.plugin.wallet.balance.ui.lqt.LqtSaveKeyboardToolBarLayout r0 = r6.P
            if (r0 == 0) goto Lc6
            r45.nw3 r0 = r0.G
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L11
            goto L65
        L11:
            com.tencent.mm.plugin.wallet.balance.ui.lqt.g r4 = com.tencent.mm.plugin.wallet.balance.ui.lqt.h.f178188d
            int r5 = r0.f381707e
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.getClass()
            if (r5 != 0) goto L1f
            goto L27
        L1f:
            int r4 = r5.intValue()
            if (r4 != r2) goto L27
            r4 = r2
            goto L28
        L27:
            r4 = r3
        L28:
            if (r4 == 0) goto L3f
            java.lang.String r4 = r0.f381708f
            if (r4 == 0) goto L3b
            int r4 = r4.length()
            if (r4 <= 0) goto L36
            r4 = r2
            goto L37
        L36:
            r4 = r3
        L37:
            if (r4 != r2) goto L3b
            r4 = r2
            goto L3c
        L3b:
            r4 = r3
        L3c:
            if (r4 == 0) goto L3f
            goto L63
        L3f:
            int r4 = r0.f381707e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            if (r4 != 0) goto L48
            goto L50
        L48:
            int r4 = r4.intValue()
            if (r4 != r1) goto L50
            r4 = r2
            goto L51
        L50:
            r4 = r3
        L51:
            if (r4 == 0) goto L65
            java.util.LinkedList r0 = r0.f381709g
            if (r0 == 0) goto L60
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r2
            if (r0 != r2) goto L60
            r0 = r2
            goto L61
        L60:
            r0 = r3
        L61:
            if (r0 == 0) goto L65
        L63:
            r0 = r2
            goto L66
        L65:
            r0 = r3
        L66:
            if (r0 == 0) goto Lc6
            int[] r0 = new int[r1]
            android.widget.ScrollView r4 = r6.H
            r4.getLocationOnScreen(r0)
            r0 = r0[r2]
            android.widget.ScrollView r4 = r6.H
            int r4 = r4.getHeight()
            int r0 = r0 + r4
            int r7 = (int) r7
            int r0 = r0 - r7
            int[] r1 = new int[r1]
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r4 = r6.f178056h
            r4.getLocationOnScreen(r1)
            r1 = r1[r2]
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r2 = r6.f178056h
            int r2 = r2.getHeight()
            int r1 = r1 + r2
            java.lang.String r2 = "MicroMsg.WalletLqtSaveFetchUI"
            if (r7 == 0) goto Lb2
            if (r0 < r1) goto L91
            goto Lb2
        L91:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            java.lang.String r1 = "keyboard covered saveForm, %d < %d"
            com.tencent.mars.xlog.Log.i(r2, r1, r0)
            android.widget.ScrollView r0 = r6.H
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r0 = (android.widget.RelativeLayout.LayoutParams) r0
            r0.bottomMargin = r7
            android.widget.ScrollView r7 = r6.H
            r7.setLayoutParams(r0)
            goto Lc6
        Lb2:
            java.lang.String r7 = "keyboard not covering saveForm, reset"
            com.tencent.mars.xlog.Log.i(r2, r7)
            android.widget.ScrollView r7 = r6.H
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r7 = (android.widget.RelativeLayout.LayoutParams) r7
            r7.bottomMargin = r3
            android.widget.ScrollView r0 = r6.H
            r0.setLayoutParams(r7)
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.h4(float):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:183:0x059a, code lost:
    
        if ((r4 != null && r4.intValue() == 0) != false) goto L232;
     */
    /* JADX WARN: Removed duplicated region for block: B:188:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0810  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x05ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h7(boolean r30) {
        /*
            Method dump skipped, instructions count: 2583
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.h7(boolean):void");
    }

    public final int i7(java.lang.String str, java.lang.String str2) {
        try {
            double F = com.tencent.mm.sdk.platformtools.t8.F(str, 0.0d);
            double F2 = com.tencent.mm.sdk.platformtools.t8.F(str2, 0.0d);
            if (F == 0.0d) {
                str = "0";
            }
            java.math.BigDecimal bigDecimal = new java.math.BigDecimal(str);
            if (F2 == 0.0d) {
                str2 = "0";
            }
            return bigDecimal.multiply(new java.math.BigDecimal(str2)).intValue();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletLqtSaveFetchUI", e17, "", new java.lang.Object[0]);
            return 0;
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean isHandleAutoShowNormalStWcKb() {
        this.mWcKeyboard.o();
        return !this.f178074x1 && this.mWcKeyboard.o();
    }

    public void j7() {
        com.tencent.mm.sdk.platformtools.u3.l(this.O1);
        com.tencent.mm.sdk.platformtools.u3.l(this.P1);
    }

    public final void k7(java.lang.CharSequence charSequence) {
        this.f178062p.setText(charSequence);
        if (com.tencent.mm.sdk.platformtools.t8.J0(charSequence)) {
            this.f178062p.setVisibility(8);
        } else {
            this.f178062p.setVisibility(0);
        }
    }

    public final void l7(java.lang.String str, java.lang.String str2, java.lang.String str3, android.widget.TextView textView, com.tencent.mm.wallet_core.ui.z zVar) {
        if (str == null) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            textView.setText(sb6.toString());
            return;
        }
        int length = sb6.length();
        sb6.append(str2);
        textView.setText(sb6.toString());
        com.tencent.mm.wallet_core.ui.r1.w0(textView, sb6.toString(), length, sb6.length(), new com.tencent.mm.wallet_core.ui.a0((com.tencent.mm.wallet_core.ui.z) new com.tencent.mm.plugin.wallet.balance.ui.lqt.m7(this, str, str2, str3, zVar), true), this);
    }

    public final void m7(java.lang.String str, int i17) {
        this.K1.clear();
        hs4.d dVar = new hs4.d(this);
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_payment_select_remove_confirm_button_android, false);
        com.tencent.mm.plugin.wallet.balance.model.lqt.l0 l0Var = com.tencent.mm.plugin.wallet.balance.model.lqt.l0.f177669q;
        int i18 = this.S;
        l0Var.getClass();
        java.util.List<com.tencent.mm.plugin.wallet_core.model.Bankcard> c17 = l0Var.c(i18 == 1);
        if (c17 == null || c17.size() == 0) {
            c17 = vr4.f1.wi().Ai().n(true);
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard : c17) {
            if (!bankcard.v0() || vr4.f1.wi().Ai().y()) {
                if (i18 == 1 && (bankcard.field_support_lqt_turn_in == 1 || bankcard.v0())) {
                    linkedList.add(bankcard);
                }
                if (i18 == 2 && (bankcard.field_support_lqt_turn_out == 1 || bankcard.v0())) {
                    linkedList.add(bankcard);
                }
            } else {
                linkedList.add(bankcard);
            }
        }
        this.f178073x0 = linkedList;
        com.tencent.mm.plugin.wallet.balance.model.lqt.l0 l0Var2 = com.tencent.mm.plugin.wallet.balance.model.lqt.l0.f177669q;
        boolean z17 = this.S == 1;
        l0Var2.a(z17);
        r45.be4 be4Var = z17 ? l0Var2.f177672a : l0Var2.f177673b;
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard2 = this.U;
        java.lang.String str2 = bankcard2 != null ? bankcard2.field_bindSerial : null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            str2 = this.W;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                gm0.j1.i();
                str2 = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_LQT_DEFAULTCARD_STRING_SYNC, "");
            }
        }
        int i19 = 0;
        while (true) {
            if (i19 >= ((java.util.LinkedList) this.f178073x0).size()) {
                i19 = 0;
                break;
            }
            com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard3 = (com.tencent.mm.plugin.wallet_core.model.Bankcard) ((java.util.LinkedList) this.f178073x0).get(i19);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(bankcard3.field_bindSerial) && str2.equals(bankcard3.field_bindSerial)) {
                break;
            } else {
                i19++;
            }
        }
        dVar.f284618c = new com.tencent.mm.plugin.wallet.balance.ui.lqt.s5(this, dVar);
        com.tencent.mm.ui.widget.dialog.z2 z2Var = dVar.f284616a;
        if (fj6) {
            dVar.f284619d = new com.tencent.mm.plugin.wallet.balance.ui.lqt.t5(this, dVar, i17, str);
        } else {
            z2Var.F = new com.tencent.mm.plugin.wallet.balance.ui.lqt.u5(this, dVar, i17, str);
        }
        android.view.View inflate = android.view.View.inflate(this, com.tencent.mm.R.layout.btw, null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.ixu);
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.ixt);
        if (be4Var != null && !android.text.TextUtils.isEmpty(be4Var.f370707r)) {
            textView.setText(be4Var.f370707r);
            if (android.text.TextUtils.isEmpty(be4Var.f370708s)) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(be4Var.f370708s);
                textView2.setVisibility(0);
            }
        } else if (this.S == 1) {
            textView.setText(com.tencent.mm.R.string.kqt);
            textView2.setText(com.tencent.mm.R.string.kqs);
        } else {
            textView.setText(com.tencent.mm.R.string.f493557kp5);
            textView2.setText(com.tencent.mm.R.string.f493556kp4);
        }
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.cx_);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchUI", "showBankCardDialog", "(Ljava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchUI", "showBankCardDialog", "(Ljava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate.findViewById(com.tencent.mm.R.id.iwt).setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.v5(this, dVar));
        inflate.findViewById(com.tencent.mm.R.id.iwt).setContentDescription(getString(com.tencent.mm.R.string.kdv));
        com.tencent.mm.plugin.wallet.balance.model.lqt.l0 l0Var3 = com.tencent.mm.plugin.wallet.balance.model.lqt.l0.f177669q;
        boolean z18 = this.S == 1;
        l0Var3.a(z18);
        r45.be4 be4Var2 = z18 ? l0Var3.f177672a : l0Var3.f177673b;
        if (be4Var2 != null ? be4Var2.f370698f : false) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtSaveFetchUI", "isNoSupportLqtBank");
        } else {
            db5.g4 g4Var = new db5.g4(this);
            int i27 = this.S;
            if (i27 == 1) {
                g4Var.r(0, getString(com.tencent.mm.R.string.kqy), null, getResources().getDrawable(com.tencent.mm.R.raw.icons_outlined_pay_cards), getResources().getColor(com.tencent.mm.R.color.FG_2), false);
            } else if (i27 == 2) {
                g4Var.r(0, getString(com.tencent.mm.R.string.kpd), null, getResources().getDrawable(com.tencent.mm.R.raw.icons_outlined_pay_cards), getResources().getColor(com.tencent.mm.R.color.FG_2), false);
            }
            if (fj6) {
                g4Var.t(1, "", true);
            }
            com.tencent.mm.plugin.wallet.balance.ui.lqt.w5 w5Var = new com.tencent.mm.plugin.wallet.balance.ui.lqt.w5(this, dVar);
            dVar.f284622g = g4Var;
            dVar.f284620e = w5Var;
        }
        if (fj6) {
            dVar.f284626k = false;
        } else {
            dVar.f284626k = true;
        }
        z2Var.y(getResources().getString(com.tencent.mm.R.string.kl_));
        dVar.f284628m = i19;
        dVar.f284627l = true;
        z2Var.t(inflate);
        dVar.f284625j = inflate;
        dVar.d();
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.iuk);
        linearLayout.setFocusable(true);
        linearLayout.setContentDescription(textView.getText().toString() + textView2.getText().toString());
        com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.wallet.balance.ui.lqt.x5(this, linearLayout), 500L);
    }

    public final void n7(android.widget.TextView textView, boolean z17, r45.c70 c70Var, com.tencent.mm.ui.widget.dialog.z2 z2Var, com.tencent.mm.plugin.wallet.balance.model.lqt.g0 g0Var, com.tencent.mm.plugin.wallet.balance.model.lqt.g0 g0Var2, int i17) {
        if (c70Var != null) {
            java.lang.String str = (!z17 || android.text.TextUtils.isEmpty(c70Var.f371343d)) ? "" : c70Var.f371343d;
            if (android.text.TextUtils.isEmpty(c70Var.f371344e)) {
                if (android.text.TextUtils.isEmpty(str)) {
                    return;
                }
                textView.setVisibility(0);
                textView.setText(str);
                return;
            }
            int length = str.length();
            java.lang.String str2 = str + c70Var.f371344e;
            com.tencent.mm.wallet_core.ui.r1.w0(textView, str2, length, str2.length(), new com.tencent.mm.wallet_core.ui.a0((com.tencent.mm.wallet_core.ui.z) new com.tencent.mm.plugin.wallet.balance.ui.lqt.e7(this, i17, c70Var, g0Var, g0Var2, z2Var), true), getContext());
            textView.setVisibility(0);
        }
    }

    public final com.tencent.mm.ui.widget.dialog.z2 o7(com.tencent.mm.plugin.wallet.balance.model.lqt.g0 g0Var, com.tencent.mm.plugin.wallet.balance.model.lqt.g0 g0Var2, com.tencent.mm.plugin.wallet.balance.model.lqt.g0 g0Var3) {
        r45.na5 na5Var;
        int i17;
        int i18;
        int i19;
        int i27;
        android.view.View view;
        r45.bq bqVar;
        if (g0Var2 == null || (na5Var = g0Var2.f177635a) == null) {
            return null;
        }
        int i28 = (na5Var.f381201f == 0 && android.text.TextUtils.isEmpty(na5Var.f381199d)) ? 0 : 3;
        int i29 = (na5Var == null || ((bqVar = na5Var.f381203h) == null && na5Var.f381204i == null)) ? 0 : (bqVar == null || na5Var.f381204i == null) ? 2 : 1;
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(getContext(), i29, i28);
        if (i28 == 3) {
            if (na5Var.f381201f == 0) {
                android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this);
                linearLayout.setPadding(i65.a.f(this, com.tencent.mm.R.dimen.f479704cz), i65.a.f(this, com.tencent.mm.R.dimen.f479718db), i65.a.f(this, com.tencent.mm.R.dimen.f479704cz), i65.a.f(this, com.tencent.mm.R.dimen.f479738dv));
                linearLayout.setOrientation(1);
                if (!android.text.TextUtils.isEmpty(na5Var.f381199d)) {
                    android.widget.TextView textView = new android.widget.TextView(this);
                    linearLayout.addView(textView);
                    textView.setGravity(3);
                    android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(textView.getLayoutParams());
                    layoutParams.width = -1;
                    layoutParams.height = -2;
                    layoutParams.gravity = 3;
                    textView.setTextSize(1, 17.0f);
                    textView.setTextColor(getResources().getColor(com.tencent.mm.R.color.f478719fa));
                    com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
                    textView.setText(na5Var.f381199d);
                    textView.setLayoutParams(layoutParams);
                }
                i17 = -2;
                view = linearLayout;
            } else {
                android.view.View inflate = android.view.View.inflate(this, com.tencent.mm.R.layout.btw, null);
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(com.tencent.mm.R.id.iwt);
                weImageView.setContentDescription(getString(com.tencent.mm.R.string.b9a));
                android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.ixu);
                com.tencent.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
                android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.ixt);
                if (na5Var.f381201f == 2) {
                    weImageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_back);
                    weImageView.setIconColor(getResources().getColor(com.tencent.mm.R.color.FG_0));
                    weImageView.setContentDescription(getString(com.tencent.mm.R.string.f490012ig));
                }
                i17 = -2;
                weImageView.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.c7(this, z2Var, na5Var, g0Var, g0Var2));
                if (android.text.TextUtils.isEmpty(na5Var.f381199d)) {
                    textView2.setVisibility(8);
                    i27 = 0;
                } else {
                    i27 = 0;
                    textView2.setVisibility(0);
                    textView2.setText(na5Var.f381199d);
                }
                if (android.text.TextUtils.isEmpty(na5Var.f381200e)) {
                    textView3.setVisibility(8);
                } else {
                    textView3.setVisibility(i27);
                    textView3.setText(na5Var.f381200e);
                }
                view = inflate;
            }
            z2Var.t(view);
        } else {
            i17 = -2;
        }
        r45.c70 c70Var = na5Var.f381202g;
        if (c70Var != null) {
            android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(this);
            linearLayout2.setOrientation(1);
            if (android.text.TextUtils.isEmpty(c70Var.f371343d)) {
                i19 = com.tencent.mm.R.dimen.f479738dv;
            } else {
                android.widget.TextView textView4 = new android.widget.TextView(this);
                linearLayout2.addView(textView4);
                android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(textView4.getLayoutParams());
                layoutParams2.width = -1;
                layoutParams2.height = i17;
                if (android.text.TextUtils.isEmpty(na5Var.f381199d)) {
                    layoutParams2.topMargin = i65.a.f(this, com.tencent.mm.R.dimen.f479718db);
                    i19 = com.tencent.mm.R.dimen.f479738dv;
                } else {
                    i19 = com.tencent.mm.R.dimen.f479738dv;
                    layoutParams2.topMargin = i65.a.f(this, com.tencent.mm.R.dimen.f479738dv);
                }
                textView4.setTextColor(getResources().getColor(com.tencent.mm.R.color.f478719fa));
                if (na5Var.f381201f != 0 || android.text.TextUtils.isEmpty(na5Var.f381199d)) {
                    textView4.setTextSize(1, 17.0f);
                    com.tencent.mm.ui.bk.r0(textView4.getPaint(), 0.8f);
                } else {
                    textView4.setTextSize(1, 15.0f);
                }
                textView4.setText(c70Var.f371343d);
                textView4.setLayoutParams(layoutParams2);
            }
            if (!android.text.TextUtils.isEmpty(c70Var.f371344e)) {
                android.widget.TextView textView5 = new android.widget.TextView(this);
                linearLayout2.addView(textView5);
                android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(textView5.getLayoutParams());
                layoutParams3.width = -1;
                layoutParams3.height = i17;
                layoutParams3.topMargin = i65.a.f(this, i19);
                textView5.setTextSize(1, 14.0f);
                com.tencent.mm.ui.bk.r0(textView5.getPaint(), 0.8f);
                textView5.setLayoutParams(layoutParams3);
                textView5.setText(c70Var.f371344e);
                n7(textView5, false, c70Var, z2Var, g0Var2, g0Var3, g0Var2.f177636b);
                textView5.setClickable(true);
                textView5.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0(this));
            }
            z2Var.j(linearLayout2);
            if (i29 == 0) {
                android.widget.LinearLayout.LayoutParams layoutParams4 = new android.widget.LinearLayout.LayoutParams(linearLayout2.getLayoutParams());
                layoutParams4.bottomMargin = i65.a.f(this, com.tencent.mm.R.dimen.f479731dn);
                linearLayout2.setLayoutParams(layoutParams4);
            }
        }
        if (i29 == 2) {
            r45.bq bqVar2 = na5Var.f381203h;
            if (bqVar2 != null) {
                z2Var.y(bqVar2.f370960g);
            }
            r45.bq bqVar3 = na5Var.f381204i;
            if (bqVar3 != null) {
                z2Var.y(bqVar3.f370960g);
            }
            i18 = 1;
            z2Var.x(1);
        } else {
            i18 = 1;
        }
        if (i29 == i18) {
            z2Var.m(na5Var.f381203h.f370960g, na5Var.f381204i.f370960g);
        }
        return z2Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.util.List list;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtSaveFetchUI", "onActivityResult() requestCode:%s", java.lang.Integer.valueOf(i17));
        super.onActivityResult(i17, i18, intent);
        if (i17 == 1) {
            this.f178054f.f177621d.b(this.S, this.Z, 1).h(new com.tencent.mm.plugin.wallet.balance.ui.lqt.k7(this));
            return;
        }
        if (i17 == 4097) {
            setResult(i18);
            finish();
            return;
        }
        if (intent != null) {
            intent.putExtra("key_bind_serial", this.W);
        }
        com.tencent.mm.plugin.wallet.balance.model.lqt.w2 w2Var = this.f178053e;
        com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI = w2Var.f177732b;
        if (i17 == 123 && i18 == -1) {
            java.lang.String stringExtra = intent.getStringExtra("key_bind_serial");
            com.tencent.mm.plugin.wallet_core.model.Orders orders = (com.tencent.mm.plugin.wallet_core.model.Orders) intent.getParcelableExtra("key_orders");
            if (orders == null || (list = orders.M) == null || ((java.util.ArrayList) list).size() <= 0) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.LqtSaveFetchLogic", "%s onActivityResult, doQueryPurchaseResult, accountType: %s, reqkey: %s", java.lang.Integer.valueOf(w2Var.hashCode()), java.lang.Integer.valueOf(w2Var.f177738h), orders.f179675e);
            w2Var.f177734d = ((com.tencent.mm.plugin.wallet_core.model.Orders.Commodity) ((java.util.ArrayList) orders.M).get(0)).f179714r;
            java.lang.String str = (java.lang.String) ((java.util.HashMap) w2Var.f177743m).get(orders.f179675e);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                w2Var.f177733c = str;
            }
            if (walletBaseUI instanceof com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI) {
                com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI = (com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI) walletBaseUI;
                walletLqtSaveFetchUI.f178074x1 = true;
                walletLqtSaveFetchUI.j7();
            }
            w2Var.b(stringExtra, 0);
            return;
        }
        if (i17 == 456 && i18 == -1) {
            java.lang.String stringExtra2 = intent.getStringExtra("key_bind_serial");
            java.lang.String stringExtra3 = intent.getStringExtra("lqt_fetch_enc_pwd");
            java.lang.String stringExtra4 = intent.getStringExtra("lqt_redeem_listid");
            com.tencent.mars.xlog.Log.i("MicroMsg.LqtSaveFetchLogic", "%s onActivityResult, doRedeemFund, accountType: %s, redeemListId: %s", java.lang.Integer.valueOf(w2Var.hashCode()), java.lang.Integer.valueOf(w2Var.f177738h), stringExtra4);
            if (walletBaseUI instanceof com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI) {
                com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI2 = (com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI) walletBaseUI;
                walletLqtSaveFetchUI2.f178074x1 = true;
                walletLqtSaveFetchUI2.j7();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.LqtSaveFetchLogic", "%s doRedeemFund, redeemListId: %s", java.lang.Integer.valueOf(w2Var.hashCode()), stringExtra4);
            if (com.tencent.mm.sdk.platformtools.t8.K0(w2Var.f177737g)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LqtSaveFetchLogic", "%s redeemListId is null!!, update from activity result: %s", java.lang.Integer.valueOf(w2Var.hashCode()), stringExtra4);
                w2Var.f177737g = stringExtra4;
            }
            java.lang.String stringExtra5 = walletBaseUI.getIntent().getStringExtra("operate_id");
            walletBaseUI.showLoading(true);
            com.tencent.mm.plugin.wallet.balance.model.lqt.g2 g2Var = w2Var.f177731a.f177657d;
            int i19 = w2Var.f177736f;
            java.lang.String str2 = w2Var.f177737g;
            int i27 = w2Var.f177738h;
            g2Var.getClass();
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i19);
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i27);
            km5.q qVar = new km5.q();
            qVar.y(valueOf, stringExtra3, str2, valueOf2, stringExtra5);
            qVar.n(g2Var);
            ((km5.q) qVar.h(new com.tencent.mm.plugin.wallet.balance.model.lqt.j2(w2Var, stringExtra2))).s(new com.tencent.mm.plugin.wallet.balance.model.lqt.v2(w2Var));
        }
    }

    @Override // com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtBasePresenterUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        fixStatusbar(true);
        super.onCreate(bundle);
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.a07));
        hideActionbarLine();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtSaveFetchUI", "WalletLqtSaveFetchUI onCreate");
        this.C1 = new com.tencent.mm.plugin.wallet.balance.ui.lqt.d(this);
        this.f178056h = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.ixn);
        this.f178061o = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.ael);
        this.f178062p = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ixk);
        this.f178065q = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ixl);
        this.f178057i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ixo);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.iu9);
        this.f178059m = textView;
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        this.E = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f487682pf5);
        this.I = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ixs);
        this.f178052J = (android.widget.TextView) findViewById(com.tencent.mm.R.id.iul);
        this.N = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ixm);
        this.f178066r = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.ixp);
        this.f178067s = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ixr);
        this.f178068t = (android.widget.CheckBox) findViewById(com.tencent.mm.R.id.ixq);
        this.f178055g = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.j8i);
        this.f178069u = (android.widget.TextView) findViewById(com.tencent.mm.R.id.h0a);
        this.f178070v = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.lcz);
        this.f178071w = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.iui);
        this.f178072x = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.iug);
        this.f178075y = (android.widget.TextView) findViewById(com.tencent.mm.R.id.iuh);
        this.f178078z = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.iud);
        this.A = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.iuf);
        this.B = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.iwu);
        this.D = (android.widget.TextView) findViewById(com.tencent.mm.R.id.iuc);
        this.f178060n = (android.widget.TextView) findViewById(com.tencent.mm.R.id.acv);
        this.G = (com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtArriveTimeLayout) findViewById(com.tencent.mm.R.id.ixi);
        this.H = (android.widget.ScrollView) findViewById(com.tencent.mm.R.id.ixe);
        this.K = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.iwg);
        this.L = (android.widget.TextView) findViewById(com.tencent.mm.R.id.iwh);
        this.M = (android.widget.TextView) findViewById(com.tencent.mm.R.id.iwi);
        this.C = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.h0e);
        com.tencent.mm.ui.bk.r0(this.M.getPaint(), 0.8f);
        this.S = getIntent().getIntExtra("lqt_save_fetch_mode", 1);
        int intExtra = getIntent().getIntExtra("entrance_type", 0);
        this.F1 = intExtra;
        com.tencent.mm.plugin.wallet.balance.model.lqt.w2 w2Var = this.f178053e;
        w2Var.f177740j = this.S;
        w2Var.f177741k = intExtra;
        getIntent().getIntExtra("lqt_max_redeem_amount", -1);
        getIntent().getStringExtra("lqt_redeem_invalid_amount_hint");
        this.Z = getIntent().getIntExtra("lqt_account_type", 0);
        if (com.tencent.mm.ui.bk.C()) {
            this.f178070v.setBackground(getResources().getDrawable(com.tencent.mm.R.drawable.ale));
        }
        if (this.S == 1) {
            gm0.j1.i();
            java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_LQT_DEFAULTCARD_SAVE_STRING_SYNC, "");
            this.W = str;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                gm0.j1.i();
                this.W = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_LQT_DEFAULTCARD_STRING_SYNC, "");
            }
            this.Y = getIntent().getStringExtra("card_serial");
            this.f178071w.setVisibility(8);
            this.f178072x.setVisibility(0);
            this.f178078z.setVisibility(8);
            this.A.setVisibility(0);
        }
        this.I1 = getIntent().getBooleanExtra("need_pull_keyboard", false);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtSaveFetchUI", "onCreate, accountType: %s, mode: %s, mCurrentSerial: %s", java.lang.Integer.valueOf(this.Z), java.lang.Integer.valueOf(this.S), this.W);
        this.f178056h.getTitleTv().setText(com.tencent.mm.wallet_core.model.c2.b());
        com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard = (com.tencent.mm.wallet_core.keyboard.WcPayKeyboard) findViewById(com.tencent.mm.R.id.pok);
        this.mWcKeyboard = wcPayKeyboard;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) wcPayKeyboard.getLayoutParams();
        layoutParams.addRule(12);
        this.mWcKeyboard.setLayoutParams(layoutParams);
        if (this.S == 1) {
            setWPKeyboard(this.f178056h.getContentEt(), false, false);
            this.mWcKeyboard.setActionText(getString(com.tencent.mm.R.string.f493566kr2));
            androidx.appcompat.app.AppCompatActivity activity = getContext();
            kotlin.jvm.internal.o.g(activity, "activity");
            ((or4.e) pf5.z.f353948a.a(activity).a(or4.e.class)).setValue("keyboard_title_key", getString(com.tencent.mm.R.string.f493566kr2));
        } else {
            this.isVKBFirstTimeShown = false;
            setWPKeyboard(this.f178056h.getContentEt(), false, false);
            this.mWcKeyboard.setActionText(getString(com.tencent.mm.R.string.kpn));
            androidx.appcompat.app.AppCompatActivity activity2 = getContext();
            kotlin.jvm.internal.o.g(activity2, "activity");
            ((or4.e) pf5.z.f353948a.a(activity2).a(or4.e.class)).setValue("keyboard_title_key", getString(com.tencent.mm.R.string.kpn));
        }
        if (fp.h.b(27)) {
            this.f178056h.p();
        }
        setWcKbHeightListener(this);
        int i17 = this.S;
        if (i17 == 1) {
            this.f178057i.setText(getString(com.tencent.mm.R.string.kqu));
            this.E.setText(getString(com.tencent.mm.R.string.kqx));
            com.tencent.mm.plugin.wallet.balance.ui.lqt.LqtSaveKeyboardToolBarLayout lqtSaveKeyboardToolBarLayout = new com.tencent.mm.plugin.wallet.balance.ui.lqt.LqtSaveKeyboardToolBarLayout(getContext());
            this.P = lqtSaveKeyboardToolBarLayout;
            lqtSaveKeyboardToolBarLayout.setOnSelectAmount(new com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI$$a(this));
        } else if (i17 == 2) {
            this.f178057i.setText(getString(com.tencent.mm.R.string.kp6));
            this.E.setText(getString(com.tencent.mm.R.string.kpc));
        }
        if (this.F1 == 14) {
            this.f178056h.getContentEt().setOnTouchListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.g6(this));
        }
        this.f178056h.b(new com.tencent.mm.plugin.wallet.balance.ui.lqt.h6(this));
        setTenpayKBStateListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.i6(this));
        this.f178056h.getContentEt().setOnEditorActionListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.j6(this));
        if (this.S == 2) {
            this.G.setCallback(new com.tencent.mm.plugin.wallet.balance.ui.lqt.k6(this));
        }
        int width = this.E.getWidth();
        if (width <= 0) {
            this.E.post(new com.tencent.mm.plugin.wallet.balance.ui.lqt.n6(this));
        } else {
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) this.C.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.leftMargin = width;
            }
            this.C.setLayoutParams(layoutParams2);
        }
        k7("");
        this.f178062p.setClickable(true);
        this.f178062p.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0(this));
        Z6(false);
        this.L.setClickable(true);
        this.L.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0(this));
        this.M.setClickable(true);
        this.M.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0(this));
        if (this.S == 1) {
            this.f178055g.setVisibility(4);
            int i18 = this.F1;
            if (i18 == 8 || i18 == 14) {
                setMMTitle(com.tencent.mm.R.string.f493565kr1);
            } else {
                setMMTitle(com.tencent.mm.R.string.f493566kr2);
            }
        } else {
            setMMTitle(com.tencent.mm.R.string.kpn);
        }
        if (this.f178059m.findViewById(com.tencent.mm.R.id.f487681pf4) != null) {
            android.view.View findViewById = this.f178059m.findViewById(com.tencent.mm.R.id.f487681pf4);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.wallet.balance.ui.lqt.y5 y5Var = new com.tencent.mm.plugin.wallet.balance.ui.lqt.y5(this);
        this.f178059m.setOnClickListener(y5Var);
        if (findViewById(com.tencent.mm.R.id.iu_) != null) {
            findViewById(com.tencent.mm.R.id.iu_).setOnClickListener(y5Var);
        }
        com.tencent.mm.plugin.wallet.balance.model.lqt.l0.f177669q.f177687p.add(this.J1);
        t7();
        this.f178055g.setOnTouchListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.l6(this));
        this.N1 = 1;
        java.lang.String stringExtra = getIntent().getStringExtra("fill_money");
        if (com.tencent.mm.sdk.platformtools.t8.F(stringExtra, 0.0d) > 0.0d) {
            this.f178056h.setText(stringExtra);
            s7(stringExtra, false);
        }
        android.widget.EditText contentEt = this.f178056h.getContentEt();
        android.widget.TextView titleTv = this.f178056h.getTitleTv();
        float q17 = i65.a.q(this);
        float f17 = j65.f.f297943g;
        if (q17 == 1.0f && f17 == 1.0f) {
            return;
        }
        if (q17 > 1.4f) {
            q17 = 1.4f;
        }
        float textSize = (contentEt.getTextSize() / q17) / f17;
        contentEt.setTextSize(0, textSize);
        float textSize2 = (titleTv.getTextSize() / q17) / f17;
        titleTv.setTextSize(0, textSize2);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtSaveFetchUI", "et:" + textSize + " tv:" + textSize2 + " fontScale:" + q17 + " viewScale:" + f17);
    }

    @Override // com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtBasePresenterUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        j7();
        com.tencent.mm.plugin.wallet.balance.model.lqt.l0 l0Var = com.tencent.mm.plugin.wallet.balance.model.lqt.l0.f177669q;
        l0Var.f177687p.remove(this.J1);
        l0Var.f177673b = null;
        this.f178053e = null;
        this.f178054f = null;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.widget.dialog.l
    public void onDialogDismiss(android.app.Dialog dialog) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtSaveFetchUI", "onDialogDismiss()");
        com.tencent.mm.sdk.platformtools.u3.i(this.O1, 300L);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard = this.mWcKeyboard;
        if (wcPayKeyboard == null || !wcPayKeyboard.onKeyUp(i17, keyEvent)) {
            return super.onKeyUp(i17, keyEvent);
        }
        return true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtSaveFetchUI", "onNewIntent");
        super.onNewIntent(intent);
        this.f178054f.f177621d.b(this.S, this.Z, 1).h(new com.tencent.mm.plugin.wallet.balance.ui.lqt.z5(this, e7()));
    }

    @Override // com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtBasePresenterUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtSaveFetchUI", "onPause()");
        this.M1.dead();
        if (this.mWcKeyboard.p()) {
            return;
        }
        this.N1 = 3;
    }

    @Override // com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtBasePresenterUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtSaveFetchUI", "onResume() ");
        this.M1.alive();
        if (this.N1 == 3 && isHandleAutoShowNormalStWcKb()) {
            com.tencent.mm.sdk.platformtools.u3.i(this.P1, 300L);
        }
        this.N1 = 2;
        if (this.f178058l1) {
            showLoading(false);
            this.f178058l1 = false;
            com.tencent.mm.autogen.events.WCPayUpdateSaveFetchUIEvent wCPayUpdateSaveFetchUIEvent = new com.tencent.mm.autogen.events.WCPayUpdateSaveFetchUIEvent();
            wCPayUpdateSaveFetchUIEvent.f54950g.f6427a = this.S;
            wCPayUpdateSaveFetchUIEvent.e();
            return;
        }
        if (this.f178064p1) {
            this.f178064p1 = false;
            com.tencent.mm.autogen.events.WCPayUpdateSaveFetchUIEvent wCPayUpdateSaveFetchUIEvent2 = new com.tencent.mm.autogen.events.WCPayUpdateSaveFetchUIEvent();
            wCPayUpdateSaveFetchUIEvent2.f54950g.f6427a = this.S;
            wCPayUpdateSaveFetchUIEvent2.e();
        }
    }

    @Override // com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtBasePresenterUI, com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.wallet.balance.model.lqt.w2 w2Var = this.f178053e;
        w2Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.LqtSaveFetchLogic", "onSceneEnd, errType: %s, errCode: %s, errMsg: %s, scene: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, m1Var);
        if (m1Var instanceof ss4.e0) {
            w2Var.f177739i = vr4.f1.wi().Ai().f13999h;
            km5.b bVar = w2Var.f177742l;
            if (bVar != null) {
                bVar.c(m1Var);
                w2Var.f177742l.resume();
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtSaveFetchUI", "onSceneEnd");
        t7();
        return false;
    }

    public final void p7(java.lang.String str) {
        db5.e1.E(getContext(), !com.tencent.mm.sdk.platformtools.t8.K0(str) ? str : getString(com.tencent.mm.R.string.kp8), "", getString(com.tencent.mm.R.string.kmf), false, new com.tencent.mm.plugin.wallet.balance.ui.lqt.p7(this));
    }

    public final boolean q7(java.lang.String str) {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                java.lang.String optString = jSONObject.optString("guide_flag");
                java.lang.String optString2 = jSONObject.optString("guide_wording");
                java.lang.String optString3 = jSONObject.optString("left_button_wording");
                java.lang.String optString4 = jSONObject.optString("right_button_wording");
                java.lang.String optString5 = jSONObject.optString("upload_credit_url");
                if ("2".equals(optString)) {
                    androidx.appcompat.app.AppCompatActivity context = getContext();
                    com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
                    aVar.A = false;
                    aVar.f211729s = optString2;
                    aVar.f211733w = optString3;
                    aVar.f211732v = optString4;
                    aVar.E = new com.tencent.mm.plugin.wallet.balance.ui.lqt.v7(this, optString5);
                    aVar.Z = true;
                    com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(context, com.tencent.mm.R.style.f494791wd);
                    j0Var.e(aVar);
                    com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
                    if (d0Var != null) {
                        d0Var.a(j0Var.f211837r);
                    }
                    j0Var.show();
                    return true;
                }
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletLqtSaveFetchUI", e17, "", new java.lang.Object[0]);
            }
        }
        return false;
    }

    public final void r7(boolean z17, java.lang.String str) {
        if (this.S == 2) {
            r45.ry4 a17 = com.tencent.mm.plugin.wallet.balance.model.lqt.m1.b().a();
            if (this.G.f177930h) {
                if (z17) {
                    if (this.U.v0()) {
                        this.G.b(a17.f385291n, true);
                    } else {
                        java.util.LinkedList linkedList = a17.f385292o;
                        if (linkedList != null) {
                            java.util.Iterator it = linkedList.iterator();
                            while (it.hasNext()) {
                                r45.pd pdVar = (r45.pd) it.next();
                                if (pdVar.f382952d.equals(this.U.field_bindSerial)) {
                                    this.G.b(pdVar.f382953e, true);
                                }
                            }
                        }
                    }
                }
                this.G.setVisibility(4);
                this.G.c(str);
                return;
            }
            if (a17 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WalletLqtSaveFetchUI", "no cache!");
                return;
            }
            com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = this.U;
            if (bankcard == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WalletLqtSaveFetchUI", "no mDefaultBankcard!");
                return;
            }
            if (bankcard.v0()) {
                this.G.b(a17.f385291n, false);
                this.G.c(str);
            } else {
                java.util.LinkedList linkedList2 = a17.f385292o;
                if (linkedList2 != null) {
                    java.util.Iterator it6 = linkedList2.iterator();
                    while (it6.hasNext()) {
                        r45.pd pdVar2 = (r45.pd) it6.next();
                        if (pdVar2.f382952d.equals(this.U.field_bindSerial)) {
                            this.G.b(pdVar2.f382953e, false);
                            this.G.c(str);
                        }
                    }
                }
            }
            this.G.setVisibility(4);
            this.H.postDelayed(new com.tencent.mm.plugin.wallet.balance.ui.lqt.v6(this), 100L);
        }
    }

    public final void s7(java.lang.String str, boolean z17) {
        boolean z18;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtSaveFetchUI", "update tips: %s", str);
        long j07 = com.tencent.mm.wallet_core.ui.r1.j0(str + "", "100");
        if (j07 <= 0) {
            if (this.S == 1) {
                com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = this.U;
                if (bankcard == null || !bankcard.v0()) {
                    k7("");
                } else {
                    k7(this.Q);
                }
            } else {
                k7(this.Q);
                a7();
            }
            this.f178062p.setTextColor(this.A1);
            this.f178063p0 = false;
            Z6(false);
            return;
        }
        int i17 = this.S;
        if (i17 == 1) {
            com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard2 = this.U;
            if (bankcard2 == null) {
                this.f178063p0 = true;
                Z6(true);
                return;
            }
            if (!bankcard2.v0()) {
                if (this.U.field_dayQuotaKind > 0.0d) {
                    if (j07 > i7("" + this.U.field_dayQuotaKind, "100")) {
                        k7(getString(com.tencent.mm.R.string.kqw));
                        this.f178062p.setTextColor(getResources().getColor(com.tencent.mm.R.color.Red_100));
                        this.f178062p.announceForAccessibility(getContext().getString(com.tencent.mm.R.string.kqw));
                        this.f178063p0 = false;
                        Z6(false);
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(21467, this.U.field_bankcardType, java.lang.Long.valueOf(j07), 1, java.lang.Double.valueOf(this.U.field_dayQuotaKind));
                        return;
                    }
                }
                k7("");
                this.f178063p0 = true;
                Z6(true);
                return;
            }
            if (this.R != null) {
                if (j07 > i7(this.R.O2 + "", "100")) {
                    k7(getString(com.tencent.mm.R.string.kqv));
                    this.f178062p.setTextColor(getResources().getColor(com.tencent.mm.R.color.Red_100));
                    this.f178062p.announceForAccessibility(getContext().getString(com.tencent.mm.R.string.kqv));
                    this.f178063p0 = false;
                    Z6(false);
                    return;
                }
            }
            com.tencent.mm.plugin.wallet.balance.model.lqt.l0 l0Var = com.tencent.mm.plugin.wallet.balance.model.lqt.l0.f177669q;
            int i18 = l0Var.f177682k;
            if (i18 < 0 || j07 <= i18 || com.tencent.mm.sdk.platformtools.t8.K0(l0Var.f177679h) || com.tencent.mm.sdk.platformtools.t8.K0(l0Var.f177680i) || com.tencent.mm.sdk.platformtools.t8.K0(l0Var.f177681j)) {
                k7(this.Q);
                this.f178062p.setTextColor(this.A1);
                this.f178063p0 = true;
                Z6(true);
                return;
            }
            com.tencent.mm.plugin.wallet_core.ui.d7 d7Var = new com.tencent.mm.plugin.wallet_core.ui.d7(2, new com.tencent.mm.plugin.wallet.balance.ui.lqt.a7(this));
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
            spannableStringBuilder.append((java.lang.CharSequence) l0Var.f177679h);
            spannableStringBuilder.append((java.lang.CharSequence) l0Var.f177680i);
            spannableStringBuilder.setSpan(d7Var, l0Var.f177679h.length(), spannableStringBuilder.length(), 18);
            if (this.f178062p.getText() == null || !this.f178062p.getText().equals(spannableStringBuilder.toString())) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(17084, 9);
            }
            this.f178062p.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0(getContext()));
            this.f178062p.setClickable(true);
            k7(spannableStringBuilder);
            this.f178062p.setTextColor(this.A1);
            this.f178063p0 = false;
            Z6(false);
            return;
        }
        if (i17 == 2) {
            r45.ry4 a17 = com.tencent.mm.plugin.wallet.balance.model.lqt.m1.b().a();
            int i19 = a17 == null ? 0 : a17.f385286f;
            int i27 = a17 == null ? 0 : a17.f385288h;
            com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard3 = this.U;
            if (bankcard3 == null || !bankcard3.v0()) {
                z18 = false;
            } else {
                i27 = f7();
                z18 = true;
            }
            if (z18) {
                if (j07 <= i27) {
                    k7(this.Q);
                    this.f178062p.setTextColor(this.A1);
                    this.f178063p0 = true;
                    r7(z17, str);
                    Z6(true);
                    this.K.setVisibility(8);
                    return;
                }
                k7(getString(com.tencent.mm.R.string.kp9));
                this.f178062p.setTextColor(getResources().getColor(com.tencent.mm.R.color.Red_100));
                this.f178062p.announceForAccessibility(getContext().getString(com.tencent.mm.R.string.kp9));
                this.f178063p0 = false;
                a7();
                Z6(false);
                this.K.setVisibility(8);
                return;
            }
            if (j07 > i19) {
                k7(getString(com.tencent.mm.R.string.kp9));
                this.f178062p.setTextColor(getResources().getColor(com.tencent.mm.R.color.Red_100));
                this.f178062p.announceForAccessibility(getContext().getString(com.tencent.mm.R.string.kp9));
                this.K.setVisibility(8);
                this.f178063p0 = false;
                a7();
                Z6(false);
                this.K.setVisibility(8);
                return;
            }
            long j17 = i27;
            if (j07 <= j17) {
                com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard4 = this.U;
                if (bankcard4 != null && !bankcard4.v0() && this.U.field_dayQuotaKind > 0.0d) {
                    if (j07 > i7("" + this.U.field_dayQuotaKind, "100")) {
                        this.K.setVisibility(0);
                        this.L.setText(getString(com.tencent.mm.R.string.kpa, java.lang.Double.valueOf(this.U.field_dayQuotaKind)));
                        this.M.setVisibility(8);
                        this.K.announceForAccessibility(this.L.getText().toString());
                        this.f178063p0 = false;
                        a7();
                        Z6(false);
                        return;
                    }
                }
                k7(this.Q);
                this.f178062p.setTextColor(this.A1);
                this.f178063p0 = true;
                r7(z17, str);
                Z6(true);
                this.K.setVisibility(8);
                return;
            }
            long j08 = com.tencent.mm.wallet_core.ui.r1.j0(this.f178077y1 + "", "100");
            if (j07 >= j08) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(20287, 9);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtSaveFetchUI", "balance > lqtBalance, balance: %s, previousBalance: %s", java.lang.Long.valueOf(j07), java.lang.Long.valueOf(j08));
            java.lang.String string = getString(com.tencent.mm.R.string.kov, java.lang.Double.valueOf(c7(i19 + "", "100", 2)));
            this.f178062p.setTextColor(this.A1);
            k7(string);
            if (a17 == null || (android.text.TextUtils.isEmpty(a17.f385301x) && a17.f385302y == null)) {
                this.K.setVisibility(0);
                java.lang.String string2 = getString(com.tencent.mm.R.string.kpi, java.lang.Double.valueOf(c7(i27 + "", "100", 2)));
                int length = string2.length();
                java.lang.String str2 = string2 + getString(com.tencent.mm.R.string.kpk);
                com.tencent.mm.wallet_core.ui.r1.w0(this.L, str2, length, str2.length(), new com.tencent.mm.wallet_core.ui.a0((com.tencent.mm.wallet_core.ui.z) new com.tencent.mm.plugin.wallet.balance.ui.lqt.b7(this, a17), true), getContext());
                this.M.setVisibility(8);
                this.K.announceForAccessibility(this.L.getText().toString());
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtSaveFetchUI", "balance > lqtBalance, go to new redeem to bank exceed tips");
                java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                if (!android.text.TextUtils.isEmpty(a17.f385301x)) {
                    this.K.setVisibility(0);
                    java.lang.String str3 = a17.f385301x;
                    try {
                        str3 = java.lang.String.format(str3, com.tencent.mm.wallet_core.ui.r1.o(c7(i27 + "", "100", 2)));
                    } catch (java.lang.Exception unused) {
                    }
                    this.M.setText(str3);
                    this.M.setVisibility(0);
                    stringBuffer.append(this.M.getText().toString());
                }
                r45.c70 c70Var = a17.f385302y;
                if (c70Var != null && !android.text.TextUtils.isEmpty(c70Var.f371343d)) {
                    java.lang.String str4 = c70Var.f371343d;
                    try {
                        str4 = java.lang.String.format(str4, com.tencent.mm.wallet_core.ui.r1.o(c7((j07 - j17) + "", "100", 2)));
                    } catch (java.lang.Exception unused2) {
                    }
                    r45.c70 c70Var2 = new r45.c70();
                    c70Var2.f371343d = str4;
                    c70Var2.f371345f = c70Var.f371345f;
                    c70Var2.f371344e = c70Var.f371344e;
                    c70Var2.f371346g = c70Var.f371346g;
                    c70Var2.f371347h = c70Var.f371347h;
                    r45.na5 na5Var = a17.f385303z;
                    com.tencent.mm.plugin.wallet.balance.model.lqt.f0 f0Var = new com.tencent.mm.plugin.wallet.balance.model.lqt.f0();
                    f0Var.f177629a = na5Var;
                    n7(this.L, true, c70Var2, null, null, new com.tencent.mm.plugin.wallet.balance.model.lqt.g0(f0Var), 10);
                    stringBuffer.append(this.L.getText().toString());
                }
                if (!com.tencent.mm.sdk.platformtools.t8.K0(stringBuffer.toString())) {
                    this.K.announceForAccessibility(stringBuffer.toString());
                }
            }
            this.f178063p0 = false;
            a7();
            Z6(false);
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(or4.e.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void t7() {
        /*
            Method dump skipped, instructions count: 681
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.t7():void");
    }
}
