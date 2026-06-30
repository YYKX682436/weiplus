package com.tencent.mm.plugin.wallet.pay.ui;

@db5.a(7)
/* loaded from: classes9.dex */
public class WalletPayUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI implements com.tencent.mm.plugin.wallet.pay.ui.c {
    public static boolean C1;
    public static final java.util.List D1 = new java.util.ArrayList();
    public android.widget.TextView A;
    public android.widget.TextView B;
    public android.widget.TextView C;
    public android.widget.TextView D;
    public android.widget.TextView E;
    public android.widget.ImageView F;
    public android.widget.TextView G;
    public android.widget.TextView H;
    public android.widget.LinearLayout I;

    /* renamed from: J, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet.pay.ui.m1 f178711J;
    public android.app.Dialog K;
    public com.tencent.mm.plugin.wallet_core.ui.i0 L;
    public com.tencent.mm.plugin.wallet.pay.ui.d M;
    public android.widget.TextView P;
    public android.widget.LinearLayout Q;
    public java.lang.String U;
    public cs4.f Z;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.Button f178735y;

    /* renamed from: y1, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet.pay.ui.n1 f178737y1;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.TextView f178738z;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f178712d = "MicroMsg.WalletPayUI";

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.Orders f178713e = null;

    /* renamed from: f, reason: collision with root package name */
    public cs4.f f178714f = null;

    /* renamed from: g, reason: collision with root package name */
    public int f178715g = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f178716h = null;

    /* renamed from: i, reason: collision with root package name */
    public java.util.ArrayList f178717i = null;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.Bankcard f178719m = null;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.FavorPayInfo f178720n = null;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.ui.g0 f178721o = null;

    /* renamed from: p, reason: collision with root package name */
    public boolean f178722p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f178725q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f178726r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f178727s = false;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f178728t = "";

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.wallet.PayInfo f178729u = null;

    /* renamed from: v, reason: collision with root package name */
    public boolean f178730v = false;

    /* renamed from: w, reason: collision with root package name */
    public android.os.Bundle f178731w = null;

    /* renamed from: x, reason: collision with root package name */
    public boolean f178732x = false;
    public long N = 0;
    public boolean R = true;
    public boolean S = false;
    public boolean T = false;
    public boolean V = false;
    public int W = -1;
    public boolean X = false;
    public boolean Y = false;

    /* renamed from: p0, reason: collision with root package name */
    public nr4.a f178723p0 = null;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f178733x0 = false;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f178736y0 = false;

    /* renamed from: l1, reason: collision with root package name */
    public zr4.d f178718l1 = null;

    /* renamed from: p1, reason: collision with root package name */
    public int f178724p1 = 0;

    /* renamed from: x1, reason: collision with root package name */
    public final java.lang.Runnable f178734x1 = new com.tencent.mm.plugin.wallet.pay.ui.m0(this);

    /* renamed from: z1, reason: collision with root package name */
    public long f178739z1 = 0;
    public final com.tencent.mm.sdk.event.IListener A1 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WalletRealNameResultNotifyMoreEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI.2
        {
            this.__eventId = 586120621;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.WalletRealNameResultNotifyMoreEvent walletRealNameResultNotifyMoreEvent) {
            com.tencent.mm.autogen.events.WalletRealNameResultNotifyMoreEvent walletRealNameResultNotifyMoreEvent2 = walletRealNameResultNotifyMoreEvent;
            com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI walletPayUI = com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI.this;
            com.tencent.mars.xlog.Log.i(walletPayUI.f178712d, "WalletRealNameResultNotifyMoreEvent %s", java.lang.Integer.valueOf(walletRealNameResultNotifyMoreEvent2.f54974g.f6210a));
            if (walletRealNameResultNotifyMoreEvent2.f54974g.f6210a != -1) {
                return false;
            }
            walletPayUI.f178733x0 = true;
            walletPayUI.f178736y0 = true;
            walletPayUI.d7();
            return false;
        }
    };
    public boolean B1 = false;

    @Override // com.tencent.mm.plugin.wallet.pay.ui.c
    public void R0(boolean z17, java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i(this.f178712d, "onGenFinish callback");
        if (!z17) {
            com.tencent.mars.xlog.Log.e(this.f178712d, "onGenFinish callback, result.isSuccess is false");
            c7(false);
            com.tencent.mm.plugin.wallet_core.utils.b1.e();
        } else {
            com.tencent.mars.xlog.Log.i(this.f178712d, "onGenFinish callback, result.isSuccess is true");
            com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = this.f178729u;
            payInfo.A = str;
            payInfo.B = str2;
            c7(false);
            com.tencent.mm.plugin.wallet_core.utils.b1.e();
        }
    }

    public boolean V6() {
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = this.f178729u;
        return (payInfo == null || payInfo.f192109e == 11) ? false : true;
    }

    public boolean W6() {
        java.util.List list;
        com.tencent.mm.plugin.wallet_core.model.Orders orders = this.f178713e;
        if (orders == null || (list = orders.M) == null || ((java.util.ArrayList) list).size() < 1) {
            com.tencent.mars.xlog.Log.w(this.f178712d, "mOrders info is Illegal!");
            cs4.f fVar = this.f178714f;
            if (fVar != null && fVar.isJumpRemind()) {
                return false;
            }
            java.lang.String string = getString(com.tencent.mm.R.string.ks_);
            cs4.f fVar2 = this.f178714f;
            if (fVar2 != null && !com.tencent.mm.sdk.platformtools.t8.K0(fVar2.f222125q)) {
                string = this.f178714f.f222125q;
            }
            com.tencent.mars.xlog.Log.i(this.f178712d, "checkInfo() errMsg:%s", string);
            db5.e1.t(getContext(), string, "", new com.tencent.mm.plugin.wallet.pay.ui.u0(this));
            return false;
        }
        if (!this.f178727s || com.tencent.mm.sdk.platformtools.t8.K0(this.f178728t) || f7() != null) {
            return true;
        }
        cs4.f fVar3 = this.f178714f;
        if (fVar3 != null && fVar3.isJumpRemind()) {
            return false;
        }
        com.tencent.mars.xlog.Log.w(this.f178712d, "hy: should use given bankcard, but resolved as null. show error msg and quit");
        java.lang.String string2 = getString(com.tencent.mm.R.string.ks_);
        cs4.f fVar4 = this.f178714f;
        if (fVar4 != null && !com.tencent.mm.sdk.platformtools.t8.K0(fVar4.f222125q)) {
            string2 = this.f178714f.f222125q;
        }
        com.tencent.mars.xlog.Log.i(this.f178712d, "checkInfo() errMsg:%s", string2);
        db5.e1.t(getContext(), string2, "", new com.tencent.mm.plugin.wallet.pay.ui.v0(this));
        return false;
    }

    public final void X6(cs4.f fVar) {
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo;
        com.tencent.mm.plugin.wallet_core.model.Orders.SimpleCashierInfo simpleCashierInfo;
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo2;
        com.tencent.mars.xlog.Log.i(this.f178712d, "stopRealname realnameGuideFlag %s guide_type %s", fVar.f222118g, java.lang.Integer.valueOf(fVar.f222117f));
        if ("1".equals(fVar.f222118g) || "2".equals(fVar.f222118g)) {
            this.Z = fVar;
        } else {
            this.Z = null;
        }
        this.f178718l1 = fVar.f222123o;
        this.X = true;
        com.tencent.mm.plugin.wallet_core.model.Orders orders = fVar.f222115d;
        this.f178713e = orders;
        this.f178715g = orders != null ? ((java.util.ArrayList) orders.M).size() : 0;
        com.tencent.mm.plugin.wallet_core.model.Orders orders2 = this.f178713e;
        java.util.Objects.toString(orders2 != null ? java.lang.Integer.valueOf(orders2.f179679i) : "");
        W6();
        com.tencent.mm.plugin.wallet_core.model.Orders orders3 = this.f178713e;
        if (orders3 != null && orders3.N != null) {
            com.tencent.mm.plugin.wallet_core.ui.g0 a17 = com.tencent.mm.plugin.wallet_core.ui.h0.INSTANCE.a(orders3);
            this.f178721o = a17;
            if (a17 != null) {
                if (((java.util.LinkedList) a17.i()).size() > 0) {
                    this.f178722p = true;
                }
                com.tencent.mm.plugin.wallet_core.model.FavorPayInfo g17 = this.f178721o.g(this.f178713e.N.f439756g);
                this.f178720n = g17;
                g17.f179667d = this.f178721o.a(g17.f179667d);
                java.lang.String str = this.f178712d;
                java.lang.String str2 = this.f178713e.N.f439756g;
                com.tencent.mm.plugin.wallet_core.model.FavorPayInfo favorPayInfo = this.f178720n;
                java.lang.String str3 = favorPayInfo.f179667d;
                com.tencent.mars.xlog.Log.i(str, "onSceneEnd init favInfo id favorComposeId %s selectedFavorCompId %s selectedFavorCompId %s  mFavorPayInfo %s", str2, str3, str3, favorPayInfo.toString());
            }
        }
        com.tencent.mm.plugin.wallet_core.model.Orders orders4 = this.f178713e;
        if (orders4 != null && this.f178717i != null && (payInfo2 = this.f178729u) != null) {
            com.tencent.mm.plugin.wallet_core.utils.b1.c(this, payInfo2, orders4, 1);
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[5];
            objArr[0] = java.lang.Integer.valueOf(this.f178729u.f192109e);
            objArr[1] = 0;
            objArr[2] = java.lang.Integer.valueOf(vr4.f1.wi().Ai().w() ? 2 : 1);
            objArr[3] = java.lang.Integer.valueOf((int) (this.f178713e.f179678h * 100.0d));
            objArr[4] = this.f178713e.f179681m;
            g0Var.d(10690, objArr);
        }
        com.tencent.mm.plugin.wallet_core.model.Orders orders5 = this.f178713e;
        if (orders5 != null && orders5.M != null) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.Iterator it = ((java.util.ArrayList) this.f178713e.M).iterator();
            while (it.hasNext()) {
                linkedList.add(((com.tencent.mm.plugin.wallet_core.model.Orders.Commodity) it.next()).f179714r);
            }
            if (linkedList.size() > 0) {
                com.tencent.mm.autogen.events.WalletPayOrdersEvent walletPayOrdersEvent = new com.tencent.mm.autogen.events.WalletPayOrdersEvent();
                walletPayOrdersEvent.f54964g.getClass();
                walletPayOrdersEvent.e();
                nr4.a aVar = this.f178723p0;
                if (aVar != null) {
                    aVar.a(10001, (java.lang.String) linkedList.get(0));
                }
            }
        }
        com.tencent.mm.plugin.wallet_core.model.Orders orders6 = this.f178713e;
        if (orders6 != null && (simpleCashierInfo = orders6.B1) != null && simpleCashierInfo.f179814d == 1 && !com.tencent.mm.sdk.platformtools.t8.K0(simpleCashierInfo.f179816f)) {
            this.f178727s = true;
            this.f178728t = this.f178713e.B1.f179816f;
        }
        this.f178717i = vr4.f1.wi().Ai().a(V6());
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f178728t)) {
            this.f178719m = vr4.f1.wi().Ai().k(null, null, V6(), false);
        } else {
            this.f178719m = f7();
        }
        java.lang.String stringExtra = getIntent().getStringExtra("key_is_use_default_card");
        if (stringExtra == null) {
            stringExtra = "";
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            this.f178719m = g7(stringExtra);
        }
        this.f178735y.setClickable(true);
        if (com.tencent.mm.sdk.platformtools.t8.K0(((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f14012u)) {
            this.G.setVisibility(8);
            this.G.setText("");
        } else {
            this.G.setVisibility(0);
            this.G.setText(((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f14012u);
        }
        com.tencent.mm.plugin.wallet_core.model.Orders orders7 = this.f178713e;
        if (orders7 != null && this.f178717i != null && (payInfo = this.f178729u) != null) {
            com.tencent.mm.plugin.wallet_core.utils.b1.c(this, payInfo, orders7, 1);
            com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr2 = new java.lang.Object[5];
            objArr2[0] = java.lang.Integer.valueOf(this.f178729u.f192109e);
            objArr2[1] = 0;
            objArr2[2] = java.lang.Integer.valueOf(vr4.f1.wi().Ai().w() ? 2 : 1);
            objArr2[3] = java.lang.Integer.valueOf((int) (this.f178713e.f179678h * 100.0d));
            objArr2[4] = this.f178713e.f179681m;
            g0Var2.d(10690, objArr2);
        }
        if (this.S) {
            i7(0, false);
        }
        long j17 = h7().f192122u == null ? 0L : h7().f192122u.getLong("wallet_pay_key_check_time");
        if (j17 > 0) {
            com.tencent.mm.plugin.report.service.g0 g0Var3 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var3.idkeyStat(641L, 4L, 1L, true);
            g0Var3.idkeyStat(641L, 5L, java.lang.System.currentTimeMillis() - j17, true);
        }
        if (this.f178739z1 > 0) {
            com.tencent.mm.plugin.report.service.g0 g0Var4 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var4.idkeyStat(641L, 7L, 1L, true);
            g0Var4.idkeyStat(641L, 8L, java.lang.System.currentTimeMillis() - this.f178739z1, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Y6(boolean r15) {
        /*
            Method dump skipped, instructions count: 549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI.Y6(boolean):void");
    }

    public void Z6() {
        android.os.Bundle extras = getIntent().getExtras();
        extras.putInt("key_pay_flag", vr4.f1.wi().Ai().w() ? 2 : 1);
        extras.putParcelable("key_orders", this.f178713e);
        extras.putParcelable("key_pay_info", this.f178729u);
        extras.putParcelable("key_favor_pay_info", this.f178720n);
        r7(extras);
    }

    public final boolean a7(cs4.f fVar) {
        if (!"1".equals(fVar.f222118g)) {
            if ("2".equals(fVar.f222118g)) {
                com.tencent.mars.xlog.Log.i(this.f178712d, "need upload credit");
                zs4.q.h(this, fVar.f222119h, fVar.f222122n, fVar.f222120i, fVar.f222121m, isTransparent(), null);
                return true;
            }
            com.tencent.mars.xlog.Log.i(this.f178712d, "realnameGuideFlag =  " + fVar.f222118g);
            return false;
        }
        com.tencent.mars.xlog.Log.i(this.f178712d, "need realname verify");
        this.T = true;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("realname_verify_process_jump_activity", ".pay.ui.WalletPayUI");
        bundle.putString("realname_verify_process_jump_plugin", "wallet");
        java.lang.String str = fVar.f222119h;
        java.lang.String str2 = fVar.f222120i;
        java.lang.String str3 = fVar.f222121m;
        boolean isTransparent = isTransparent();
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = this.f178729u;
        return zs4.q.g(this, str, 0, str2, str3, bundle, isTransparent, null, null, payInfo != null ? payInfo.f192109e : 0, 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b7() {
        /*
            Method dump skipped, instructions count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI.b7():void");
    }

    public void c7(boolean z17) {
        android.os.Bundle bundle;
        as4.b a17 = zr4.a.a(e7(), this.f178713e, z17);
        if (this.f178713e != null) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putString("key_reqKey", this.f178713e.f179675e);
            java.util.List list = this.f178713e.M;
            if (list != null && ((java.util.ArrayList) list).size() > 0) {
                bundle2.putString("key_TransId", ((com.tencent.mm.plugin.wallet_core.model.Orders.Commodity) ((java.util.ArrayList) this.f178713e.M).get(0)).f179714r);
            }
            bundle2.putLong("key_SessionId", this.N);
            a17.setProcessName("PayProcess");
            a17.setProcessBundle(bundle2);
        }
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = this.f178729u;
        if (payInfo != null) {
            int i17 = payInfo.f192109e;
            if (i17 == 6 && payInfo.f192110f == 100) {
                a17.setScene(100);
            } else {
                a17.setScene(i17);
            }
        }
        doSceneProgress(a17);
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo2 = this.f178729u;
        if (payInfo2 == null || 8 != payInfo2.f192109e || (bundle = payInfo2.f192122u) == null) {
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13956, 2, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - bundle.getLong("extinfo_key_9")));
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean checkProcLife() {
        return false;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public void cleanUiData(int i17) {
        if (i17 == 0) {
            if (isTransparent()) {
                finish();
            }
        } else if (i17 == 1) {
            o7(false);
        }
    }

    public void d7() {
        com.tencent.mm.wallet_core.model.d1 d1Var;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11850, 2, java.lang.Integer.valueOf(this.f178729u.f192109e));
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = this.f178729u;
        int i17 = payInfo.f192109e == 11 ? 3 : 2;
        if (payInfo == null || com.tencent.mm.sdk.platformtools.t8.K0(payInfo.f192114m)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CgiManager", "no payInfo or reqKey");
            d1Var = null;
        } else {
            java.lang.String str = payInfo.f192114m;
            com.tencent.mars.xlog.Log.i("MicroMsg.CgiManager", "qrorderinfo reqKey: %s", str);
            com.tencent.mars.xlog.Log.i("MicroMsg.CgiManager", "qrorderinfo go new split cgi");
            d1Var = str.startsWith("sns_aa_") ? new cs4.a(payInfo, i17) : str.startsWith("sns_tf_") ? new cs4.j(payInfo, i17) : str.startsWith("sns_ff_") ? new cs4.c(payInfo, i17) : str.startsWith("ts_") ? new cs4.d(payInfo, i17) : str.startsWith("sns_") ? new cs4.h(payInfo, i17) : str.startsWith("offline_") ? new cs4.e(payInfo, i17) : str.startsWith("up_") ? new cs4.k(payInfo, i17) : str.startsWith("seb_ff_") ? new cs4.g(payInfo, i17) : str.startsWith("tax_") ? new cs4.i(payInfo, i17) : str.startsWith("dc_") ? new cs4.b(payInfo, i17) : new cs4.f(payInfo, i17);
        }
        if (d1Var != null) {
            d1Var.setProcessName("PayProcess");
            d1Var.setProcessSessionId(this.N);
            com.tencent.mm.pluginsdk.wallet.PayInfo payInfo2 = this.f178729u;
            int i18 = payInfo2.f192109e;
            if (i18 == 6 && payInfo2.f192110f == 100) {
                d1Var.setScene(100);
            } else {
                d1Var.setScene(i18);
            }
            doSceneProgress(d1Var, true, this.f178729u.f192113i);
        }
    }

    public com.tencent.mm.plugin.wallet_core.model.Authen e7() {
        com.tencent.mm.plugin.wallet_core.ui.g0 g0Var;
        com.tencent.mm.plugin.wallet_core.model.Authen authen = new com.tencent.mm.plugin.wallet_core.model.Authen();
        if (j7()) {
            authen.f179542d = 3;
        } else {
            authen.f179542d = 6;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f178716h)) {
            authen.f179544f = this.f178716h;
        }
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = this.f178719m;
        if (bankcard != null) {
            authen.f179546h = bankcard.field_bindSerial;
            authen.f179545g = bankcard.field_bankcardType;
        }
        if (this.f178720n != null && (g0Var = this.f178721o) != null) {
            java.util.Map map = g0Var.f180280b;
            if (map != null && ((java.util.HashMap) map).size() > 0) {
                com.tencent.mm.plugin.wallet_core.model.FavorPayInfo favorPayInfo = this.f178720n;
                authen.H = favorPayInfo.f179667d;
                authen.G = favorPayInfo.f179670g;
            }
        }
        authen.f179557v = this.f178729u;
        return authen;
    }

    public final com.tencent.mm.plugin.wallet_core.model.Bankcard f7() {
        java.util.ArrayList a17 = vr4.f1.wi().Ai().a(true);
        if (a17.size() == 0) {
            return null;
        }
        java.util.Iterator it = a17.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) it.next();
            java.lang.String str = this.f178728t;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
            if (str.equals(bankcard.field_bindSerial)) {
                com.tencent.mars.xlog.Log.i(this.f178712d, "hy: get given bankcard");
                return bankcard;
            }
        }
        return null;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        java.lang.String str = this.f178712d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(hashCode());
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i(str, "finish %s %s mPayResultType:%s", valueOf, com.tencent.mm.sdk.platformtools.z3.b(true), java.lang.Integer.valueOf(this.mPayResultType));
        cancelQRPay();
        com.tencent.mm.plugin.wallet_core.model.Orders orders = this.f178713e;
        if (orders != null && !((java.util.ArrayList) orders.M).isEmpty()) {
            getIntent().putExtra("key_trans_id", ((com.tencent.mm.plugin.wallet_core.model.Orders.Commodity) ((java.util.ArrayList) this.f178713e.M).get(0)).f179714r);
        }
        if (this.f178729u != null) {
            getIntent().putExtra("key_reqKey", this.f178729u.f192114m);
        }
        if (this.f178725q) {
            if (this.f178713e != null) {
                getIntent().putExtra("key_total_fee", this.f178713e.f179678h);
            }
            getIntent().putExtra("key_pay_reslut_type", 1);
            q7(-1, getIntent());
            setResult(-1, getIntent());
        } else {
            com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = this.f178729u;
            if (payInfo != null && payInfo.f192109e == 8 && this.f178713e != null) {
                payInfo.K = 0;
                doSceneProgress(zr4.a.a(e7(), this.f178713e, true), false);
                android.os.Bundle bundle = this.f178729u.f192122u;
                if (bundle != null) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13956, 3, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - bundle.getLong("extinfo_key_9")));
                }
            }
            q7(0, getIntent());
            getIntent().putExtra("key_pay_reslut_type", this.mPayResultType);
            int i17 = this.f178724p1;
            if (i17 == 1) {
                getIntent().putExtra("key_pay_reslut_type", 1000);
            } else if (i17 == 2) {
                getIntent().putExtra("key_pay_reslut_type", 1001);
            }
            setResult(0, getIntent());
            if (vr4.f1.wi().Ai().y()) {
                com.tencent.mm.pluginsdk.wallet.PayInfo payInfo2 = this.f178729u;
                com.tencent.mm.wallet_core.model.a2.a(payInfo2 != null ? payInfo2.f192109e : 0, payInfo2 == null ? "" : payInfo2.f192114m, 18, "");
            } else if (vr4.f1.wi().Ai().x()) {
                com.tencent.mm.pluginsdk.wallet.PayInfo payInfo3 = this.f178729u;
                com.tencent.mm.wallet_core.model.a2.a(payInfo3 != null ? payInfo3.f192109e : 0, payInfo3 == null ? "" : payInfo3.f192114m, 4, "");
            } else {
                com.tencent.mm.pluginsdk.wallet.PayInfo payInfo4 = this.f178729u;
                com.tencent.mm.wallet_core.model.a2.a(payInfo4 != null ? payInfo4.f192109e : 0, payInfo4 == null ? "" : payInfo4.f192114m, 7, "");
            }
            java.util.Iterator it = ((java.util.ArrayList) com.tencent.mm.wallet_core.a.f("PayProcess")).iterator();
            while (it.hasNext()) {
                com.tencent.mm.wallet_core.h hVar = (com.tencent.mm.wallet_core.h) it.next();
                hVar.a("specEndProcessWithoutFinish");
                android.os.Bundle bundle2 = hVar.f213801c;
                if (bundle2 != null) {
                    bundle2.clear();
                }
                com.tencent.mm.wallet_core.a.i(hVar.getClass().hashCode());
                hVar.x();
            }
        }
        com.tencent.mm.wallet_core.h process = getProcess();
        if (process != null) {
            java.lang.ref.WeakReference weakReference = process.f213800b;
            if (this == (weakReference != null ? (android.content.Context) weakReference.get() : null)) {
                com.tencent.mars.xlog.Log.i(this.f178712d, "remove process end callback to prevent ui leak");
                process.f213799a = null;
                process.f213800b = null;
            }
        }
        super.finish();
    }

    public final com.tencent.mm.plugin.wallet_core.model.Bankcard g7(java.lang.String str) {
        java.util.ArrayList a17 = vr4.f1.wi().Ai().a(true);
        if (a17.size() == 0) {
            return null;
        }
        java.util.Iterator it = a17.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) it.next();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if ((str == null ? "" : str).equals(bankcard.field_bindSerial)) {
                com.tencent.mars.xlog.Log.i(this.f178712d, "hy: get given bankcard");
                return bankcard;
            }
        }
        return null;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean getCancelable() {
        return false;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d7u;
    }

    public com.tencent.mm.pluginsdk.wallet.PayInfo h7() {
        if (this.f178729u == null) {
            this.f178729u = (com.tencent.mm.pluginsdk.wallet.PayInfo) getIntent().getParcelableExtra("key_pay_info");
        }
        return this.f178729u;
    }

    public void i7(int i17, boolean z17) {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.d(13958, 2);
        g0Var.d(13955, 4);
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = this.f178729u;
        com.tencent.mm.wallet_core.model.a2.a(payInfo == null ? 0 : payInfo.f192109e, payInfo == null ? "" : payInfo.f192114m, 11, "");
        android.os.Bundle input = getInput();
        input.putInt("key_main_bankcard_state", i17);
        input.putParcelable("key_orders", this.f178713e);
        input.putParcelable("key_pay_info", this.f178729u);
        input.putParcelable("key_authen", e7());
        input.putString("key_pwd1", this.f178716h);
        input.putInt("key_pay_flag", 3);
        input.putInt("key_err_code", com.tencent.live.TXLivePluginDef.ErrorCode.CODE_VALUEISNULL);
        input.putParcelable("key_favor_pay_info", this.f178720n);
        input.putBoolean("key_is_filter_bank_type", z17);
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = this.f178719m;
        if (bankcard != null) {
            input.putString("key_is_cur_bankcard_bind_serial", bankcard.field_bindSerial);
        }
        r7(input);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        com.tencent.mm.ui.bk.k0(getWindow());
        com.tencent.mm.wallet_core.ui.MMScrollView mMScrollView = (com.tencent.mm.wallet_core.ui.MMScrollView) findViewById(com.tencent.mm.R.id.f487680pf3);
        mMScrollView.a(mMScrollView, mMScrollView);
        android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.pei);
        this.f178735y = button;
        button.setClickable(false);
        this.f178735y.setEnabled(false);
        this.f178738z = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pe8);
        this.A = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pe7);
        this.C = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pdo);
        this.H = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pdk);
        this.B = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pdw);
        this.G = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pee);
        this.B.getPaint().setFlags(16);
        this.D = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pej);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pef);
        this.E = textView;
        textView.setOnClickListener(new com.tencent.mm.plugin.wallet.pay.ui.c1(this));
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.pdh);
        this.F = imageView;
        imageView.setOnClickListener(new com.tencent.mm.plugin.wallet.pay.ui.d1(this));
        this.I = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.pdt);
        this.f178711J = new com.tencent.mm.plugin.wallet.pay.ui.m1(this);
        this.f178735y.setOnClickListener(new com.tencent.mm.plugin.wallet.pay.ui.e1(this));
        this.f178735y.setText(com.tencent.mm.R.string.kuy);
        this.P = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ksn);
        this.Q = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.ksm);
        v7();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean isTransparent() {
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard;
        if (!this.X) {
            com.tencent.mars.xlog.Log.i(this.f178712d, "get isTransparent5");
            return true;
        }
        java.lang.String str = this.f178712d;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Boolean.valueOf(h7() == null || !h7().f192112h);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        objArr[1] = com.tencent.mm.sdk.platformtools.z3.b(true);
        com.tencent.mars.xlog.Log.i(str, "case 1 %s,  stack %s", objArr);
        vr4.f1.wi().Ai().w();
        java.util.ArrayList arrayList = this.f178717i;
        if (arrayList != null) {
            arrayList.size();
        }
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard2 = this.f178719m;
        if (bankcard2 != null) {
            java.lang.String str2 = bankcard2.field_forbidWord;
        }
        if (h7() == null || !h7().f192112h) {
            com.tencent.mars.xlog.Log.i(this.f178712d, "get isTransparent1");
            return false;
        }
        int i17 = this.f178729u.f192109e;
        if (i17 == 45 || i17 == 52) {
            com.tencent.mars.xlog.Log.i(this.f178712d, "lqt must be transparent");
            return true;
        }
        if (!vr4.f1.wi().Ai().w()) {
            com.tencent.mars.xlog.Log.i(this.f178712d, "get isTransparent2");
            return false;
        }
        java.util.ArrayList arrayList2 = this.f178717i;
        if (arrayList2 == null || (arrayList2.size() != 0 && ((bankcard = this.f178719m) == null || com.tencent.mm.sdk.platformtools.t8.K0(bankcard.field_forbidWord)))) {
            com.tencent.mars.xlog.Log.i(this.f178712d, "get isTransparent4");
            return true;
        }
        java.lang.String str3 = this.f178712d;
        java.lang.Object[] objArr2 = new java.lang.Object[2];
        java.util.ArrayList arrayList3 = this.f178717i;
        objArr2[0] = java.lang.Boolean.valueOf(arrayList3 != null && arrayList3.size() == 0);
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard3 = this.f178719m;
        objArr2[1] = java.lang.Boolean.valueOf((bankcard3 == null || com.tencent.mm.sdk.platformtools.t8.K0(bankcard3.field_forbidWord)) ? false : true);
        com.tencent.mars.xlog.Log.i(str3, "get isTransparent3 1 %s 2 %s", objArr2);
        return false;
    }

    public boolean j7() {
        com.tencent.mm.plugin.wallet_core.model.Orders orders;
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = this.f178719m;
        if (bankcard != null && (orders = this.f178713e) != null && orders.f179679i == 3) {
            return bankcard.y0();
        }
        com.tencent.mm.plugin.wallet_core.model.Orders orders2 = this.f178713e;
        if (orders2 != null) {
            int i17 = orders2.f179679i;
            l75.e0 e0Var = com.tencent.mm.plugin.wallet_core.model.Bankcard.A3;
            if (!((i17 & 2) > 0)) {
                return true;
            }
        }
        return false;
    }

    public final boolean k7() {
        android.os.Bundle extras = getIntent().getExtras();
        if (extras == null || !extras.containsKey("intent_pay_end")) {
            if (extras != null && extras.getBoolean("key_is_realname_verify_process")) {
                return extras.getInt("realname_verify_process_ret", 0) == -1;
            }
            com.tencent.mars.xlog.Log.i(this.f178712d, "hy: pay not end");
            return false;
        }
        com.tencent.mars.xlog.Log.i(this.f178712d, "hy: pay end. finish the activity");
        if (extras.getBoolean("intent_pay_end", false)) {
            extras.getInt("intent_pay_end_errcode");
            extras.getString("intent_pay_app_url");
            extras.getBoolean("intent_pay_end", false);
            q7(-1, getIntent());
            this.f178725q = true;
        } else {
            q7(0, getIntent());
            this.f178725q = false;
        }
        return true;
    }

    public void l7(int i17) {
        this.f178724p1 = i17;
        java.lang.String str = this.f178712d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i(str, "markForceFinish errorType %s %s", valueOf, com.tencent.mm.sdk.platformtools.z3.b(true));
    }

    public final boolean m7() {
        com.tencent.mm.plugin.wallet_core.model.Orders orders;
        int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FORCE_USE_NEW_CASHIER_INT_SYNC, 0)).intValue();
        if (z65.c.a()) {
            intValue = 1;
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        }
        return intValue == 1 || ((orders = this.f178713e) != null && orders.A1 == 1);
    }

    public void n7(boolean z17, int i17, java.lang.String str) {
        vr4.f1.wi().Ai().w();
        if (!z17) {
            Z6();
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = com.tencent.mm.plugin.wallet_core.model.Bankcard.u0(this, i17);
        }
        db5.e1.A(this, str, "", getString(com.tencent.mm.R.string.f493589kv1), getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.wallet.pay.ui.l0(this), new com.tencent.mm.plugin.wallet.pay.ui.n0(this));
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean needConfirmFinish() {
        return true;
    }

    public void o7(boolean z17) {
        vr4.b bVar;
        if (W6()) {
            this.B1 = false;
            java.lang.String str = this.f178712d;
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.i(str, "pay with old bankcard! from statck %s", com.tencent.mm.sdk.platformtools.z3.b(true));
            com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = this.f178729u;
            com.tencent.mm.wallet_core.model.a2.a(payInfo == null ? 0 : payInfo.f192109e, payInfo == null ? "" : payInfo.f192114m, 8, "");
            if (this.K != null) {
                com.tencent.mars.xlog.Log.w(this.f178712d, "close previous cashier dialog");
                this.K.dismiss();
            }
            this.B1 = false;
            if (!m7()) {
                com.tencent.mm.plugin.wallet_core.ui.n8 x17 = com.tencent.mm.plugin.wallet_core.ui.n8.x(this, !this.f178727s, this.f178713e, this.f178720n, this.f178719m, this.f178729u, this.U, new com.tencent.mm.plugin.wallet.pay.ui.i0(this), new com.tencent.mm.plugin.wallet.pay.ui.j0(this), new com.tencent.mm.plugin.wallet.pay.ui.k0(this));
                this.K = x17;
                this.L = x17;
                return;
            }
            com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog wcPayCashierDialog = new com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog(getContext());
            this.K = wcPayCashierDialog;
            com.tencent.mm.pluginsdk.wallet.PayInfo payInfo2 = this.f178729u;
            com.tencent.mm.plugin.wallet_core.model.Orders orders = this.f178713e;
            com.tencent.mm.plugin.wallet_core.model.FavorPayInfo favorPayInfo = this.f178720n;
            com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = this.f178719m;
            boolean z19 = !this.f178727s;
            com.tencent.mars.xlog.Log.i("MicroMsg.WcPayCashierDialog", "set view data: %s, %s, %s", java.lang.Boolean.valueOf(z19), java.lang.Boolean.valueOf(z17), bankcard);
            wcPayCashierDialog.L = payInfo2;
            wcPayCashierDialog.M = orders;
            wcPayCashierDialog.N = favorPayInfo;
            if (!z17) {
                wcPayCashierDialog.P = bankcard;
            }
            wcPayCashierDialog.R = z19;
            wcPayCashierDialog.V = "";
            wcPayCashierDialog.r();
            wcPayCashierDialog.u();
            wcPayCashierDialog.s();
            if (wcPayCashierDialog.S && (bVar = wcPayCashierDialog.M.N.f439769w) != null && bVar.f439681e == 1) {
                wcPayCashierDialog.f180214t.setUrl(bVar.f439688o);
                wcPayCashierDialog.f180215u.setText(bVar.f439683g);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(bVar.f439684h)) {
                    wcPayCashierDialog.f180215u.setTextColor(com.tencent.mm.plugin.wallet_core.utils.z1.b(bVar.f439684h, true));
                }
                wcPayCashierDialog.f180217w.setText(bVar.f439685i);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(bVar.f439686m)) {
                    wcPayCashierDialog.f180217w.setTextColor(com.tencent.mm.plugin.wallet_core.utils.z1.b(bVar.f439686m, true));
                }
                wcPayCashierDialog.f180217w.setOnClickListener(new et4.t(wcPayCashierDialog, bVar));
                wcPayCashierDialog.B(0);
            } else {
                wcPayCashierDialog.B(8);
            }
            wcPayCashierDialog.p();
            wcPayCashierDialog.z();
            if (wcPayCashierDialog.U) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WcPayCashierDialog", "don't show foreign currency");
                com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDetailItemLayout wcPayCashierDetailItemLayout = wcPayCashierDialog.D;
                if (wcPayCashierDetailItemLayout != null) {
                    wcPayCashierDialog.f180207n.removeView(wcPayCashierDetailItemLayout);
                    wcPayCashierDialog.D = null;
                }
            } else if (!com.tencent.mm.sdk.platformtools.t8.K0(wcPayCashierDialog.M.f179680l1) && !com.tencent.mm.sdk.platformtools.t8.K0(wcPayCashierDialog.M.f179686p1)) {
                com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDetailItemLayout wcPayCashierDetailItemLayout2 = new com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDetailItemLayout(wcPayCashierDialog.getContext());
                wcPayCashierDialog.D = wcPayCashierDetailItemLayout2;
                wcPayCashierDialog.f180207n.addView(wcPayCashierDetailItemLayout2, 0);
                wcPayCashierDialog.D.f180192e.setVisibility(8);
                wcPayCashierDialog.D.f180194g.setVisibility(8);
                wcPayCashierDialog.D.f180191d.setText(com.tencent.mm.R.string.l3t);
                wcPayCashierDialog.D.a();
                if (!wcPayCashierDialog.M.f179680l1.equals("CNY") || com.tencent.mm.sdk.platformtools.t8.K0(wcPayCashierDialog.M.f179698y0)) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder(wcPayCashierDialog.M.f179686p1);
                    sb6.append(wcPayCashierDialog.M.f179698y0);
                    wcPayCashierDialog.D.f180193f.setText(sb6);
                } else {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder(wcPayCashierDialog.M.f179686p1);
                    sb7.append(wcPayCashierDialog.M.f179698y0);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(wcPayCashierDialog.M.f179699y1) && !com.tencent.mm.sdk.platformtools.t8.K0(wcPayCashierDialog.M.f179701z1)) {
                        com.tencent.mm.plugin.wallet_core.model.Orders orders2 = wcPayCashierDialog.M;
                        sb7.append(java.lang.String.format("(%s%s)", orders2.f179701z1, orders2.f179696x1));
                    }
                    wcPayCashierDialog.D.f180193f.setText(sb7);
                }
            }
            wcPayCashierDialog.w(wcPayCashierDialog.M.field_infos);
            wcPayCashierDialog.x();
            wcPayCashierDialog.A();
            wcPayCashierDialog.f();
            if (z17) {
                wcPayCashierDialog.setOnShowListener(new et4.m(wcPayCashierDialog));
            }
            wcPayCashierDialog.f180210p0 = new com.tencent.mm.plugin.wallet.pay.ui.h0(this);
            wcPayCashierDialog.show();
            addDialog(wcPayCashierDialog);
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.wallet_core.model.Orders.DeductInfo deductInfo;
        com.tencent.mars.xlog.Log.i(this.f178712d, "onAcvityResult requestCode:" + i17 + ", resultCode:" + i18);
        if (i17 != 0) {
            if (i17 != 1) {
                return;
            }
            this.K.dismiss();
            this.f178732x = false;
            d7();
            return;
        }
        if (i18 == -1) {
            if (intent != null) {
                int intExtra = intent.getIntExtra("auto_deduct_flag", -1);
                this.W = intExtra;
                com.tencent.mm.plugin.wallet_core.model.Orders orders = this.f178713e;
                if (orders != null && (deductInfo = orders.S) != null) {
                    deductInfo.f179725f = intExtra;
                }
                com.tencent.mm.pluginsdk.wallet.PayInfo h76 = h7();
                int i19 = this.W;
                h76.H = i19;
                if (i19 == 1) {
                    h7().I = intent.getStringExtra("deduct_bank_type");
                    h7().f192107J = intent.getStringExtra("deduct_bind_serial");
                }
            }
            this.V = true;
            onProgressFinish();
        } else {
            finish();
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13958, 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01de  */
    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r25) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.wallet.pay.ui.d dVar = this.M;
        if (dVar != null) {
            dVar.a();
            com.tencent.mm.plugin.wallet.pay.ui.d dVar2 = this.M;
            dVar2.f178754c = null;
            dVar2.f178753b = null;
        }
        this.A1.dead();
        this.L = null;
        getWindow().getDecorView().removeCallbacks(this.f178734x1);
        java.util.ArrayList arrayList = (java.util.ArrayList) D1;
        arrayList.remove(this.f178737y1);
        C1 = false;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        for (com.tencent.mm.plugin.wallet.pay.ui.n1 n1Var : (com.tencent.mm.plugin.wallet.pay.ui.n1[]) arrayList.toArray(new com.tencent.mm.plugin.wallet.pay.ui.n1[arrayList.size()])) {
            com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI walletPayUI = (com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI) n1Var.f178791b.get();
            if (walletPayUI != null && currentTimeMillis - n1Var.f178790a > 600000) {
                com.tencent.mars.xlog.Log.w(this.f178712d, "has old payui, both finish");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(965L, 2L, 1L);
                arrayList.remove(n1Var);
                walletPayUI.l7(1);
                walletPayUI.finish();
            }
        }
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = this.f178729u;
        if (payInfo != null) {
            java.lang.String str = payInfo.N;
            java.util.Map map = zr4.b.f475197a;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                ((java.util.concurrent.ConcurrentHashMap) zr4.b.f475199c).remove(str);
            }
        }
        setAuthState(false);
        super.onDestroy();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo;
        if (i17 != 4) {
            return super.onKeyUp(i17, keyEvent);
        }
        if (isAuthDoing()) {
            com.tencent.mars.xlog.Log.w(this.f178712d, "block when authening");
            return true;
        }
        if (this.K == null || (payInfo = this.f178729u) == null || !payInfo.f192112h || this.mNetSceneMgr.g()) {
            hideVKB();
            showDialog(1000);
        } else {
            finish();
        }
        return true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        boolean z17;
        com.tencent.mars.xlog.Log.i(this.f178712d, "onNewIntent");
        setIntent(intent);
        if (!k7()) {
            com.tencent.mars.xlog.Log.w(this.f178712d, "hy: pay not end if judge from intent, but should finish this ui, and set cancel event");
            if (intent.getBooleanExtra("send_cancel_event", true)) {
                q7(0, getIntent());
            }
            this.f178725q = false;
        }
        if (intent.getBooleanExtra("direc_change_bankcard", false)) {
            o7(true);
            return;
        }
        if (intent.getBooleanExtra("intent_bind_end", false)) {
            this.S = true;
            z17 = true;
        } else {
            z17 = false;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i(this.f178712d, "isFromBindCard is true");
            d7();
            return;
        }
        if (intent.getBooleanExtra("key_is_realname_verify_process", false)) {
            com.tencent.mars.xlog.Log.i(this.f178712d, "isFromRealNameVerify is true");
            finish();
        } else {
            com.tencent.mars.xlog.Log.e(this.f178712d, "isFromBindCard is false,isFromRealNameVerify is false");
        }
        finish();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mm.plugin.wallet_core.ui.i0 i0Var = this.L;
        if (i0Var != null) {
            i0Var.onActivityPause();
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onProgressFinish() {
        com.tencent.mm.plugin.wallet_core.model.Orders orders;
        boolean z17;
        com.tencent.mars.xlog.Log.i(this.f178712d, "onProgressFinish isFromH5RealNameVerify %s", java.lang.Boolean.valueOf(this.f178733x0));
        new com.tencent.mm.autogen.events.WalletCloseProgressEvent().e();
        com.tencent.mm.plugin.wallet_core.model.Orders orders2 = this.f178713e;
        boolean z18 = (orders2 == null || orders2.S == null || this.V) ? false : true;
        if (!z18) {
            if (isTransparent()) {
                setContentViewVisibility(4);
                com.tencent.mm.ui.bk.p0(this, 0);
                z17 = false;
            } else {
                setContentViewVisibility(0);
                com.tencent.mm.ui.bk.p0(this, getActionbarColor());
                z17 = true;
            }
            if (!z17) {
                com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = this.f178729u;
                com.tencent.mm.wallet_core.model.a2.a(payInfo == null ? 0 : payInfo.f192109e, payInfo == null ? "" : payInfo.f192114m, 2, "");
            }
        }
        if (this.f178733x0) {
            Y6(true);
            return true;
        }
        if (this.T) {
            return true;
        }
        if (z18) {
            android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.wallet.pay.ui.WalletPayDeductUI.class);
            intent.putExtra("orders", this.f178713e);
            startActivityForResult(intent, 0);
            return true;
        }
        if (getContentView().getVisibility() != 0) {
            if (this.f178732x || !W6()) {
                return true;
            }
            Y6(true);
            this.f178732x = true;
            return true;
        }
        if (getContentView().getVisibility() == 0 && (orders = this.f178713e) != null && orders.S != null && this.f178735y.isEnabled() && !this.Y) {
            this.f178735y.performClick();
            this.Y = true;
        }
        return false;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        android.app.Dialog dialog;
        com.tencent.mars.xlog.Log.i(this.f178712d, "hy: onResume isFromH5RealNameVerify %s", java.lang.Boolean.valueOf(this.f178733x0));
        if (!isProcessing()) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f178728t)) {
                this.f178719m = f7();
            } else if (this.f178719m == null) {
                this.f178719m = vr4.f1.wi().Ai().k(null, null, V6(), false);
            } else {
                this.f178719m = vr4.f1.wi().Ai().k(null, this.f178719m.field_bindSerial, V6(), false);
            }
        }
        if (this.f178736y0) {
            com.tencent.mars.xlog.Log.i(this.f178712d, "onResume isResumePassFinish");
            this.f178736y0 = false;
        } else if (!this.f178726r || getContentViewVisibility() == 0 || ((dialog = this.K) != null && dialog.isShowing())) {
            com.tencent.mm.plugin.wallet_core.ui.i0 i0Var = this.L;
            if (i0Var != null) {
                i0Var.M0();
            }
        } else {
            com.tencent.mars.xlog.Log.i(this.f178712d, "hy: has started process and is transparent and no pwd appeared. finish self");
            finish();
        }
        super.onResume();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, np5.f
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var, boolean z17) {
        super.onSceneEnd(i17, i18, str, m1Var, z17);
        if (m1Var instanceof as4.b) {
            setAuthState(false);
        }
    }

    public void p7(boolean z17, int i17, java.lang.String str) {
        if (z17) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                str = com.tencent.mm.plugin.wallet_core.model.Bankcard.u0(this, i17);
            }
            db5.e1.A(this, str, "", getString(com.tencent.mm.R.string.kvg), getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.wallet.pay.ui.o0(this, i17), new com.tencent.mm.plugin.wallet.pay.ui.p0(this));
        } else if (m7()) {
            o7(true);
        } else {
            i7(i17, false);
        }
    }

    public final void q7(int i17, android.content.Intent intent) {
        com.tencent.mm.plugin.wallet_core.model.Orders orders;
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = this.f178729u;
        if (payInfo != null && payInfo.f192109e == 46 && (orders = this.f178713e) != null) {
            intent.putExtra("key_total_fee", orders.f179678h);
            com.tencent.mars.xlog.Log.i(this.f178712d, "sentCancelEvent set fee:%s", java.lang.Double.valueOf(this.f178713e.f179678h));
        }
        com.tencent.mm.autogen.events.WalletPayResultEvent walletPayResultEvent = new com.tencent.mm.autogen.events.WalletPayResultEvent();
        am.s10 s10Var = walletPayResultEvent.f54965g;
        s10Var.f7861a = intent;
        int i18 = this.f178724p1;
        if (i18 == 1) {
            s10Var.f7862b = 1000;
        } else if (i18 == 2) {
            s10Var.f7862b = 1001;
        }
        s10Var.f7863c = i17;
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo2 = this.f178729u;
        s10Var.f7864d = payInfo2 == null ? "" : payInfo2.f192114m;
        s10Var.f7866f = 1;
        if (payInfo2 != null && i17 == 0) {
            bs4.b.a(payInfo2.f192114m, payInfo2.f192109e, payInfo2.f192111g);
        }
        walletPayResultEvent.e();
    }

    public void r7(android.os.Bundle bundle) {
        this.f178726r = true;
        com.tencent.mm.plugin.wallet_core.model.Orders orders = this.f178713e;
        if (orders != null) {
            bundle.putInt("key_support_bankcard", orders.f179679i);
            bundle.putString("key_reqKey", this.f178713e.f179675e);
            java.util.List list = this.f178713e.M;
            if (list != null && ((java.util.ArrayList) list).size() > 0) {
                bundle.putString("key_TransId", ((com.tencent.mm.plugin.wallet_core.model.Orders.Commodity) ((java.util.ArrayList) this.f178713e.M).get(0)).f179714r);
            }
            bundle.putLong("key_SessionId", this.N);
        }
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = this.f178729u;
        if (payInfo != null) {
            bundle.putInt("key_scene", payInfo.f192109e);
        }
        bundle.putBoolean("key_is_oversea", true ^ j7());
        bundle.putInt("is_deduct_open", this.W);
        com.tencent.mm.wallet_core.a.j(this, yr4.u.class, bundle, new com.tencent.mm.plugin.wallet.pay.ui.a1(this));
    }

    public void s7() {
        java.lang.String str;
        boolean z17;
        boolean z18;
        double d17;
        vr4.l0 f17 = this.f178721o.f(this.f178720n.f179667d);
        java.util.List i17 = this.f178721o.i();
        vr4.j0 j0Var = this.f178721o.f180279a;
        if (f17 != null) {
            d17 = f17.f439779m;
            if (d17 > 0.0d) {
                str = f17.f439781o;
                z18 = true;
                if (com.tencent.mm.sdk.platformtools.t8.K0(f17.f439782p)) {
                    z17 = false;
                } else {
                    str = str + "," + f17.f439782p;
                    z17 = true;
                }
            } else {
                str = "";
                z17 = false;
                z18 = false;
            }
        } else {
            str = "";
            z17 = false;
            z18 = false;
            d17 = 0.0d;
        }
        if (!z18 && ((java.util.LinkedList) i17).size() > 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            sb6.append(z17 ? "," : "");
            sb6.append(getContext().getString(com.tencent.mm.R.string.kwr));
            str = sb6.toString();
        }
        if (d17 <= 0.0d || j0Var == null || j0Var.f439759m != 0) {
            this.f178738z.setText(com.tencent.mm.wallet_core.ui.r1.o(this.f178713e.f179678h));
            this.C.setText(com.tencent.mm.wallet_core.ui.r1.l(this.f178713e.f179681m));
            this.B.setVisibility(8);
        } else {
            if (f17 != null) {
                this.f178738z.setText(com.tencent.mm.wallet_core.ui.r1.o(f17.f439778i));
            }
            this.C.setText(com.tencent.mm.wallet_core.ui.r1.l(this.f178713e.f179681m));
            android.widget.TextView textView = this.B;
            com.tencent.mm.plugin.wallet_core.model.Orders orders = this.f178713e;
            textView.setText(com.tencent.mm.wallet_core.ui.r1.n(orders.f179678h, orders.f179681m));
            this.B.setVisibility(0);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        this.H.setText(str);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean shouldEnsureSoterConnection() {
        return true;
    }

    public final void t7() {
        if (this.R) {
            this.f178735y.setOnClickListener(new com.tencent.mm.plugin.wallet.pay.ui.c0(this));
        } else {
            this.f178735y.setOnClickListener(new com.tencent.mm.plugin.wallet.pay.ui.d0(this));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u7() {
        /*
            Method dump skipped, instructions count: 892
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI.u7():void");
    }

    public void v7() {
        java.util.List list;
        com.tencent.mm.plugin.wallet_core.model.Orders orders = this.f178713e;
        if (orders != null && (list = orders.M) != null && ((java.util.ArrayList) list).size() > 0) {
            this.f178738z.setText(com.tencent.mm.wallet_core.ui.r1.o(this.f178713e.f179678h));
            this.C.setText(com.tencent.mm.wallet_core.ui.r1.l(this.f178713e.f179681m));
            this.f178711J.a();
            if (((java.util.ArrayList) this.f178713e.M).size() > 1) {
                this.F.setVisibility(0);
                this.A.setText(getString(com.tencent.mm.R.string.f493594kw0, ((com.tencent.mm.plugin.wallet_core.model.Orders.Commodity) ((java.util.ArrayList) this.f178713e.M).get(0)).f179707h, ((java.util.ArrayList) this.f178713e.M).size() + ""));
            } else {
                this.A.setText(((com.tencent.mm.plugin.wallet_core.model.Orders.Commodity) ((java.util.ArrayList) this.f178713e.M).get(0)).f179707h);
                this.F.setVisibility(8);
            }
            this.f178730v = false;
            int i17 = this.f178713e.f179684p;
        }
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = this.f178729u;
        if (payInfo != null && payInfo.f192109e == 48) {
            this.A.setText(com.tencent.mm.R.string.hox);
        }
        this.D.setVisibility(8);
        this.E.setVisibility(8);
        this.P.setVisibility(8);
        this.Q.setVisibility(8);
        this.f178735y.setText(com.tencent.mm.R.string.kuy);
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = this.f178719m;
        if (bankcard == null || !bankcard.v0()) {
            if (vr4.f1.wi().Ai().y()) {
                u7();
            }
        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f178719m.field_forbidWord)) {
            this.D.setText(this.f178719m.field_forbidWord);
            this.D.setVisibility(4);
            this.E.setVisibility(8);
            if (vr4.f1.wi().Ai().x()) {
                u7();
            }
        } else if (vr4.f1.wi().Ai().x()) {
            u7();
        }
        boolean z17 = vr4.f1.wi().Ai().x() || vr4.f1.wi().Ai().y();
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.pdl);
        if (!z17 || this.f178720n == null || this.f178721o == null || !this.f178722p || this.f178713e == null) {
            linearLayout.setVisibility(8);
        } else {
            s7();
            this.H.setOnClickListener(new com.tencent.mm.plugin.wallet.pay.ui.j1(this));
            linearLayout.setVisibility(0);
        }
        if (this.f178713e == null || this.f178717i == null || this.f178729u == null) {
            this.f178735y.setClickable(false);
            this.f178735y.setEnabled(false);
        } else {
            this.f178735y.setClickable(true);
            this.f178735y.setEnabled(true);
        }
        if (this.f178713e == null) {
            this.E.setVisibility(8);
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.String str2;
        com.tencent.mm.plugin.wallet_core.model.Orders orders;
        int i19;
        boolean z17;
        int i27;
        int i28;
        com.tencent.mars.xlog.Log.i(this.f178712d, "errorType %s errCode %s, errmsg %s, scene %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, m1Var);
        if (i17 == 0 && i18 == 0) {
            if (m1Var instanceof cs4.f) {
                this.mPayResultType = 1;
                cs4.f fVar = (cs4.f) m1Var;
                this.f178714f = fVar;
                if (fVar.isJumpRemind()) {
                    com.tencent.mm.wallet_core.model.p0 jumpRemind = fVar.getJumpRemind();
                    jumpRemind.a();
                    jumpRemind.i(this, new com.tencent.mm.plugin.wallet.pay.ui.q0(this, jumpRemind, fVar));
                    return true;
                }
                X6(fVar);
            } else if (m1Var instanceof as4.b) {
                this.mPayResultType = 1;
                as4.b bVar = (as4.b) m1Var;
                android.os.Bundle input = getInput();
                input.putParcelable("key_pay_info", this.f178729u);
                input.putParcelable("key_bankcard", this.f178719m);
                input.putString("key_bank_type", this.f178719m.field_bankcardType);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f178716h)) {
                    input.putString("key_pwd1", this.f178716h);
                }
                input.putString("kreq_token", bVar.C);
                com.tencent.mm.plugin.wallet_core.model.Authen authen = bVar.B;
                input.putParcelable("key_authen", authen);
                input.putBoolean("key_need_verify_sms", !bVar.f13550z);
                input.putInt("key_can_verify_tail", bVar.F);
                input.putString("key_verify_tail_wording", bVar.G);
                getInput().putBoolean("key_block_bind_new_card", bVar.H == 1);
                if (com.tencent.mm.sdk.platformtools.t8.K0(bVar.D)) {
                    input.putString("key_mobile", this.f178719m.field_mobile);
                } else {
                    input.putString("key_mobile", bVar.D);
                }
                input.putString("key_QADNA_URL", bVar.E);
                if (bVar.isPaySuccess) {
                    nr4.a aVar = this.f178723p0;
                    if (aVar != null) {
                        aVar.a(com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NULL, "");
                        nr4.a aVar2 = this.f178723p0;
                        aVar2.getClass();
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13455, aVar2.f339339a, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), aVar2.f339341c);
                    }
                    input.putParcelable("key_orders", bVar.A);
                    com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = this.f178729u;
                    if (payInfo != null) {
                        com.tencent.mars.xlog.Log.i(this.f178712d, "payscene %d", java.lang.Integer.valueOf(payInfo.f192109e));
                        if (8 == this.f178729u.f192109e) {
                            gm0.j1.i();
                            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_ADDRESS_HAS_SHOW_WALLETOFFLINE2_DIALOG_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
                        }
                    }
                } else {
                    input.putParcelable("key_orders", this.f178713e);
                }
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("pwd", this.f178716h);
                nz2.o oVar = (nz2.o) gm0.j1.s(nz2.o.class);
                nz2.a aVar3 = (nz2.a) oVar;
                aVar3.getClass();
                if (mz2.m0.a()) {
                    i28 = 1;
                } else {
                    i28 = aVar3.a() ? 2 : 0;
                }
                bundle.putInt("key_open_biometric_type", i28);
                oVar.Mf(authen.f179557v.f192125x == 1, true, this.f178729u.f192127z, bundle);
                input.putInt("key_pay_flag", 3);
                android.os.Parcelable parcelable = bVar.f214061s;
                if (parcelable != null) {
                    input.putParcelable("key_realname_guide_helper", parcelable);
                }
                r7(input);
                return true;
            }
            v7();
            return true;
        }
        if (m1Var instanceof as4.b) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putString("pwd", this.f178716h);
            ((pz2.a) gm0.j1.s(pz2.a.class)).Ge(this.f178729u.f192125x == 1, false, bundle2);
            if (i18 != -1 && i18 != -500) {
                this.mPayResultType = 2;
            } else {
                this.mPayResultType = 3;
            }
            switch (i18) {
                case 402:
                case 403:
                case 408:
                    as4.b bVar2 = (as4.b) m1Var;
                    android.os.Bundle input2 = getInput();
                    this.f178731w = input2;
                    input2.putParcelable("key_pay_info", this.f178729u);
                    this.f178731w.putParcelable("key_bankcard", this.f178719m);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f178716h)) {
                        this.f178731w.putString("key_pwd1", this.f178716h);
                    }
                    this.f178731w.putString("kreq_token", bVar2.C);
                    this.f178731w.putParcelable("key_authen", bVar2.B);
                    this.f178731w.putBoolean("key_need_verify_sms", !bVar2.f13550z);
                    this.f178731w.putString("key_mobile", this.f178719m.field_mobile);
                    this.f178731w.putInt("key_err_code", i18);
                    this.f178731w.putParcelable("key_orders", this.f178713e);
                    if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = this.f178719m;
                        str2 = getString(com.tencent.mm.R.string.kvx, bankcard.field_desc, bankcard.field_mobile);
                    } else {
                        str2 = str;
                    }
                    db5.e1.A(this, str2, "", getString(com.tencent.mm.R.string.kvw), getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.wallet.pay.ui.r0(this), new com.tencent.mm.plugin.wallet.pay.ui.s0(this));
                    return true;
                case 404:
                    com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard2 = this.f178719m;
                    if (bankcard2 == null || (orders = this.f178713e) == null) {
                        return false;
                    }
                    bankcard2.N2 = orders.f179675e;
                    com.tencent.mm.pluginsdk.wallet.PayInfo payInfo2 = this.f178729u;
                    if (payInfo2 != null && ((i27 = payInfo2.f192109e) == 45 || i27 == 52)) {
                        db5.e1.y(getContext(), str, "", getString(com.tencent.mm.R.string.f490507x1), new com.tencent.mm.plugin.wallet.pay.ui.t0(this, i18));
                        return true;
                    }
                    java.util.ArrayList arrayList = this.f178717i;
                    if (arrayList != null) {
                        z17 = true;
                        if (arrayList.size() > 1) {
                            p7(true, 4, str);
                            return true;
                        }
                        i19 = 4;
                    } else {
                        i19 = 4;
                        z17 = true;
                    }
                    n7(z17, i19, str);
                    return z17;
                case 100000:
                case 100001:
                case 100102:
                    this.f178729u.E = i18;
                    o7(false);
                    return true;
                case 100100:
                case 100101:
                    com.tencent.mm.pluginsdk.wallet.PayInfo payInfo3 = this.f178729u;
                    payInfo3.E = i18;
                    boolean z18 = i18 == 100100;
                    if (this.M == null) {
                        this.M = new com.tencent.mm.plugin.wallet.pay.ui.d(this, this);
                    }
                    this.M.b(z18, payInfo3.C, payInfo3.f192114m);
                    com.tencent.mars.xlog.Log.i(this.f178712d, "mRegenFingerPrintRsaKey.genRsaKey isGenRsa is " + z18);
                    return true;
                default:
                    return false;
            }
        }
        if (!(m1Var instanceof cs4.f)) {
            return false;
        }
        this.X = true;
        if (isTransparent()) {
            setContentViewVisibility(4);
            com.tencent.mm.ui.bk.p0(this, 0);
        } else {
            setContentViewVisibility(0);
            com.tencent.mm.ui.bk.p0(this, getActionbarColor());
        }
        if (i18 == 416) {
            com.tencent.mars.xlog.Log.e(this.f178712d, "errCode is 416 need real name verify!");
            this.mPayResultType = 2;
            this.T = true;
            android.os.Bundle bundle3 = new android.os.Bundle();
            bundle3.putString("realname_verify_process_jump_activity", ".pay.ui.WalletPayUI");
            bundle3.putString("realname_verify_process_jump_plugin", "wallet");
            com.tencent.mm.pluginsdk.wallet.PayInfo payInfo4 = this.f178729u;
            return zs4.q.a(this, i18, str, m1Var, bundle3, false, null, null, payInfo4 != null ? payInfo4.f192109e : 0);
        }
        this.mPayResultType = 3;
        com.tencent.mars.xlog.Log.i(this.f178712d, "errCode is %d , not need real name verify!", java.lang.Integer.valueOf(i18));
        return false;
    }
}
