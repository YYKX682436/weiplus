package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class WalletLqtPlanAddUI extends com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtBasePresenterUI implements mp5.v {

    /* renamed from: y0, reason: collision with root package name */
    public static final /* synthetic */ int f177980y0 = 0;
    public int C;
    public java.lang.String E;
    public java.lang.String F;
    public r45.be5 H;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.LinearLayout f177981J;
    public long K;
    public int L;
    public java.lang.String M;
    public java.lang.String N;
    public java.lang.String[] P;
    public android.widget.Button Q;
    public android.widget.Button R;
    public android.widget.Button S;
    public android.widget.RelativeLayout T;
    public com.tencent.mm.wallet_core.ui.m Y;
    public hs4.d Z;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ScrollView f177982e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f177983f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f177984g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f177985h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f177986i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f177987m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f177988n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView f177989o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f177990p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.LinearLayout f177992q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f177993r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.LinearLayout f177994s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.Button f177995t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.CheckBox f177996u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.LinearLayout f177997v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.wallet_core.keyboard.WcPayKeyboard f177998w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f177999x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.View f178001y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f178002z;
    public final com.tencent.mm.plugin.wallet.balance.model.lqt.u1 A = (com.tencent.mm.plugin.wallet.balance.model.lqt.u1) this.f177946d.a(this, com.tencent.mm.plugin.wallet.balance.model.lqt.u1.class);
    public int B = 0;
    public boolean D = false;
    public final java.util.List G = new java.util.ArrayList();
    public r45.n85 I = new r45.n85();
    public java.util.List U = new java.util.ArrayList();
    public boolean V = false;
    public boolean W = true;
    public boolean X = true;

    /* renamed from: p0, reason: collision with root package name */
    public final java.util.HashMap f177991p0 = new java.util.HashMap();

    /* renamed from: x0, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f178000x0 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.KindaBindCardEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI.26
        {
            this.__eventId = 572563856;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.KindaBindCardEvent kindaBindCardEvent) {
            com.tencent.mm.autogen.events.KindaBindCardEvent kindaBindCardEvent2 = kindaBindCardEvent;
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtPlanAddUI", "KindaBindCardEvent callback");
            if (kindaBindCardEvent2 == null) {
                return false;
            }
            com.tencent.mm.wallet_core.model.i1.a();
            com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI walletLqtPlanAddUI = com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI.this;
            am.di diVar = kindaBindCardEvent2.f54454g;
            if (diVar != null) {
                if (diVar.f6453a) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtPlanAddUI", "KindaBindCardEvent bindCard Succ");
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtPlanAddUI", "bind card serial: %s", diVar.f6455c);
                    java.lang.String str = diVar.f6455c;
                    int i17 = com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI.f177980y0;
                    com.tencent.mm.plugin.wallet_core.model.Bankcard c76 = walletLqtPlanAddUI.c7(str);
                    if (c76 != null) {
                        r45.n85 n85Var = walletLqtPlanAddUI.I;
                        n85Var.f381167h = c76.field_bindSerial;
                        n85Var.f381165f = c76.field_bankcardType;
                        n85Var.f381174r = c76.field_bankName;
                        n85Var.f381166g = c76.field_bankcardTail;
                        walletLqtPlanAddUI.f7();
                    }
                    walletLqtPlanAddUI.b7(false);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtPlanAddUI", "KindaBindCardEvent bindCard Cancel");
                }
            }
            walletLqtPlanAddUI.f178000x0.dead();
            return true;
        }
    };

    static {
        i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 48);
        i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 8);
    }

    public static void X6(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI walletLqtPlanAddUI, r45.hb5 hb5Var, boolean z17) {
        com.tencent.mm.plugin.wallet_core.model.Bankcard c76;
        walletLqtPlanAddUI.getClass();
        r45.jz3 jz3Var = hb5Var.f376009f;
        walletLqtPlanAddUI.H = hb5Var.f376010g;
        walletLqtPlanAddUI.N = hb5Var.f376015o;
        walletLqtPlanAddUI.E = hb5Var.f376018r;
        walletLqtPlanAddUI.F = hb5Var.f376020t;
        walletLqtPlanAddUI.U = hb5Var.f376023w;
        java.util.LinkedList linkedList = hb5Var.f376012i;
        if (linkedList != null && !linkedList.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtPlanAddUI", "array size: %s", linkedList);
            java.util.ArrayList arrayList = (java.util.ArrayList) walletLqtPlanAddUI.G;
            arrayList.clear();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            if (!linkedList.isEmpty()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BankcardParser", "record size: %s", java.lang.Integer.valueOf(linkedList.size()));
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(at4.i.b((r45.qv) it.next()));
                }
            }
            java.util.Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) it6.next();
                if (bankcard.field_support_lqt_turn_in == 1) {
                    arrayList.add(bankcard);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtPlanAddUI", "not support: %s", bankcard.field_bankcardTypeName);
                }
            }
        }
        if (z17 && (c76 = walletLqtPlanAddUI.c7(hb5Var.f376011h)) != null) {
            r45.n85 n85Var = walletLqtPlanAddUI.I;
            n85Var.f381167h = hb5Var.f376011h;
            n85Var.f381165f = c76.field_bankcardType;
            n85Var.f381174r = c76.field_bankName;
            n85Var.f381166g = c76.field_bankcardTail;
        }
        r45.n85 n85Var2 = walletLqtPlanAddUI.I;
        n85Var2.f381172p = hb5Var.f376014n;
        int i17 = walletLqtPlanAddUI.C;
        if (i17 == 1 || i17 == 3) {
            n85Var2.f381163d = hb5Var.f376016p;
            n85Var2.f381164e = hb5Var.f376017q;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(hb5Var.f376018r)) {
            walletLqtPlanAddUI.f177983f.setText(hb5Var.f376018r);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(hb5Var.f376019s)) {
            walletLqtPlanAddUI.f177984g.setText(hb5Var.f376019s);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(hb5Var.f376021u)) {
            walletLqtPlanAddUI.f177985h.setText(hb5Var.f376021u);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(hb5Var.f376022v)) {
            walletLqtPlanAddUI.f177986i.setText(hb5Var.f376022v);
        }
        walletLqtPlanAddUI.i7();
        walletLqtPlanAddUI.f177982e.postDelayed(new com.tencent.mm.plugin.wallet.balance.ui.lqt.s2(walletLqtPlanAddUI), 100L);
        if (walletLqtPlanAddUI.U.isEmpty()) {
            walletLqtPlanAddUI.Q.setText(walletLqtPlanAddUI.getString(com.tencent.mm.R.string.kqp, "" + walletLqtPlanAddUI.e7(20000L)));
            walletLqtPlanAddUI.R.setText(walletLqtPlanAddUI.getString(com.tencent.mm.R.string.kqp, "" + walletLqtPlanAddUI.e7(80000L)));
            walletLqtPlanAddUI.S.setText(walletLqtPlanAddUI.getString(com.tencent.mm.R.string.kqp, "" + walletLqtPlanAddUI.e7(2000000L)));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtPlanAddUI", "mRecommendedAmt Money: %s，%s,%s", java.lang.Long.valueOf(((r45.ql5) walletLqtPlanAddUI.U.get(0)).f384089d), java.lang.Long.valueOf(((r45.ql5) walletLqtPlanAddUI.U.get(1)).f384089d), java.lang.Long.valueOf(((r45.ql5) walletLqtPlanAddUI.U.get(2)).f384089d));
        walletLqtPlanAddUI.Q.setText(walletLqtPlanAddUI.getString(com.tencent.mm.R.string.kqp, "" + walletLqtPlanAddUI.e7(((r45.ql5) walletLqtPlanAddUI.U.get(0)).f384089d)));
        walletLqtPlanAddUI.R.setText(walletLqtPlanAddUI.getString(com.tencent.mm.R.string.kqp, "" + walletLqtPlanAddUI.e7(((r45.ql5) walletLqtPlanAddUI.U.get(1)).f384089d)));
        walletLqtPlanAddUI.S.setText(walletLqtPlanAddUI.getString(com.tencent.mm.R.string.kqp, "" + walletLqtPlanAddUI.e7(((r45.ql5) walletLqtPlanAddUI.U.get(2)).f384089d)));
    }

    public static void Y6(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI walletLqtPlanAddUI) {
        walletLqtPlanAddUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtPlanAddUI", "go to bindcard");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("key_bind_scene", 20);
        boolean z17 = true;
        bundle.putBoolean("key_need_bind_response", true);
        bundle.putBoolean("key_is_bind_bankcard", true);
        if (com.tencent.mm.wallet_core.b.a().b()) {
            walletLqtPlanAddUI.f178000x0.alive();
            com.tencent.mm.wallet_core.model.n1.d(6, bundle.getInt("key_bind_scene"));
            com.tencent.mm.wallet_core.model.i1.b(bundle.getInt("key_bind_scene"));
            ((h45.q) i95.n0.c(h45.q.class)).startBindCardUseCase(walletLqtPlanAddUI, bundle);
        } else {
            z17 = false;
        }
        if (z17) {
            return;
        }
        com.tencent.mm.wallet_core.a.j(walletLqtPlanAddUI, com.tencent.mm.plugin.wallet.balance.ui.lqt.f.class, bundle, new com.tencent.mm.plugin.wallet.balance.ui.lqt.m3(walletLqtPlanAddUI));
    }

    public static void Z6(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI walletLqtPlanAddUI) {
        double F = com.tencent.mm.sdk.platformtools.t8.F(walletLqtPlanAddUI.f177987m.getText(), 0.0d);
        com.tencent.mm.plugin.wallet_core.model.Bankcard c76 = walletLqtPlanAddUI.c7(walletLqtPlanAddUI.I.f381167h);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(walletLqtPlanAddUI.C);
        java.lang.Double valueOf2 = java.lang.Double.valueOf(F);
        r45.n85 n85Var = walletLqtPlanAddUI.I;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtPlanAddUI", "mode: %s, money: %s, bankcard: %s, day: %s", valueOf, valueOf2, n85Var.f381165f, java.lang.Integer.valueOf(n85Var.f381163d));
        if (c76 == null || walletLqtPlanAddUI.I.f381163d < 1 || F <= 0.0d || F > c76.field_onceQuotaKind) {
            walletLqtPlanAddUI.f177995t.setEnabled(false);
            return;
        }
        if (walletLqtPlanAddUI.C == 2) {
            if (com.tencent.mm.wallet_core.ui.r1.h0("" + F, "100", 2, java.math.RoundingMode.HALF_UP).doubleValue() == walletLqtPlanAddUI.K) {
                r45.n85 n85Var2 = walletLqtPlanAddUI.I;
                if (n85Var2.f381163d == walletLqtPlanAddUI.L && n85Var2.f381167h.equals(walletLqtPlanAddUI.M)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtPlanAddUI", "no changed old");
                    walletLqtPlanAddUI.f177995t.setEnabled(false);
                    return;
                }
            }
        }
        walletLqtPlanAddUI.f177995t.setEnabled(true);
    }

    public static void a7(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI walletLqtPlanAddUI, java.lang.Boolean bool) {
        android.animation.ObjectAnimator ofFloat;
        android.animation.ObjectAnimator ofFloat2;
        walletLqtPlanAddUI.getClass();
        if (bool.booleanValue()) {
            ofFloat = android.animation.ObjectAnimator.ofFloat(walletLqtPlanAddUI.T, "translationY", 0.0f, (-walletLqtPlanAddUI.f177998w.getHeight()) + 10);
            ofFloat2 = android.animation.ObjectAnimator.ofFloat(walletLqtPlanAddUI.f178002z, "translationY", 0.0f, (-walletLqtPlanAddUI.f177998w.getHeight()) / 5);
        } else {
            ofFloat = android.animation.ObjectAnimator.ofFloat(walletLqtPlanAddUI.T, "translationY", (-walletLqtPlanAddUI.f177998w.getHeight()) + 10, 0.0f);
            ofFloat2 = android.animation.ObjectAnimator.ofFloat(walletLqtPlanAddUI.f178002z, "translationY", (-walletLqtPlanAddUI.f177998w.getHeight()) / 5, 0.0f);
        }
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(new android.view.animation.LinearInterpolator());
        ofFloat2.setDuration(300L);
        ofFloat2.setInterpolator(new android.view.animation.LinearInterpolator());
        ofFloat.addListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.o3(walletLqtPlanAddUI, bool));
        ofFloat2.addListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.p3(walletLqtPlanAddUI, bool));
        ofFloat.start();
        ofFloat2.start();
    }

    public final void b7(boolean z17) {
        r45.n85 n85Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtPlanAddUI", "do pre add plan: %s", java.lang.Boolean.valueOf(z17));
        int i17 = 0;
        android.app.Dialog dialog = null;
        if (this.C == 2 && (n85Var = this.I) != null) {
            int i18 = n85Var.f381172p;
            dialog = com.tencent.mm.wallet_core.ui.b2.e(getContext(), false, false, null);
            i17 = i18;
        }
        com.tencent.mm.plugin.wallet.balance.model.lqt.d0 d0Var = new com.tencent.mm.plugin.wallet.balance.model.lqt.d0();
        d0Var.f213885c = new com.tencent.mm.plugin.wallet.balance.model.lqt.v(this.C, i17);
        d0Var.c(new com.tencent.mm.plugin.wallet.balance.ui.lqt.t2(this, z17, dialog), true);
    }

    public final com.tencent.mm.plugin.wallet_core.model.Bankcard c7(java.lang.String str) {
        java.util.Iterator it = ((java.util.ArrayList) this.G).iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) it.next();
            if (bankcard.field_bindSerial.equals(str)) {
                return bankcard;
            }
        }
        return ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().e(str);
    }

    public final void d7(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtPlanAddUI", "go to check pwd");
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdNewUI.class);
        intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 3);
        intent.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "");
        intent.putExtra("subtitle", com.tencent.mm.plugin.wallet.balance.model.lqt.e3.a(i17));
        startActivityForResult(intent, i17);
    }

    public final java.lang.String e7(long j17) {
        java.lang.String str = j17 + "";
        if (str.length() == 1) {
            return androidx.camera.core.processing.util.GLUtils.VERSION_UNKNOWN + j17;
        }
        if (str.length() != 2) {
            return str.substring(0, str.length() - 2);
        }
        return "0." + j17;
    }

    public final void f7() {
        com.tencent.mm.plugin.wallet_core.model.Bankcard c76 = c7(this.I.f381167h);
        if (c76 == null) {
            this.f177986i.setVisibility(0);
            return;
        }
        this.f177986i.setVisibility(8);
        if (com.tencent.mm.sdk.platformtools.t8.K0(c76.field_bankcardTypeName)) {
            android.widget.TextView textView = this.f177990p;
            r45.n85 n85Var = this.I;
            textView.setText(java.lang.String.format("%s(%s)", n85Var.f381174r, n85Var.f381166g));
        } else {
            android.widget.TextView textView2 = this.f177990p;
            r45.n85 n85Var2 = this.I;
            textView2.setText(java.lang.String.format("%s %s(%s)", n85Var2.f381174r, c76.field_bankcardTypeName, n85Var2.f381166g));
        }
        this.f177989o.setTag(this.I.f381167h);
        if (c76.v0()) {
            this.f177989o.setImageResource(com.tencent.mm.R.drawable.ch9);
            return;
        }
        at4.k c17 = dt4.b.c(this, c76.field_bankcardType, c76.F0());
        java.lang.String str = c17 != null ? c17.f13878a : "";
        y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
        gt4.c1 c1Var = new gt4.c1(str);
        ((x60.e) fVar).getClass();
        android.graphics.Bitmap d17 = x51.w0.d(c1Var);
        if (d17 != null) {
            this.f177989o.setImageBitmap(d17);
        }
        ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).wi(new com.tencent.mm.plugin.wallet.balance.ui.lqt.l3(this, c76));
    }

    public final void g7() {
        int i17 = this.I.f381163d - 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtPlanAddUI", "select day index: %s", java.lang.Integer.valueOf(i17));
        if (i17 < 0 || i17 >= this.P.length) {
            this.f177985h.setVisibility(0);
        } else {
            this.f177985h.setVisibility(8);
            this.f177993r.setText(this.P[i17]);
        }
    }

    @Override // com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtBasePresenterUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bts;
    }

    @Override // mp5.v
    public void h4(float f17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtPlanAddUI", "onUpdateWcPayKeyboardHeight");
        if (this.X) {
            this.X = false;
            int height = ((android.view.WindowManager) getSystemService("window")).getDefaultDisplay().getHeight();
            android.graphics.Rect rect = new android.graphics.Rect();
            this.f177992q.getGlobalVisibleRect(rect);
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtPlanAddUI", "screenHeight：%s，mWcKeyboard.getHeight():%s,pageBottomRect.bottom:%s", java.lang.Integer.valueOf(height), java.lang.Integer.valueOf(this.mWcKeyboard.getHeight()), java.lang.Integer.valueOf(rect.bottom));
            this.W = (height - this.mWcKeyboard.getHeight()) - rect.bottom <= com.tencent.mm.ui.zk.a(this, 22);
        }
    }

    public final void h7() {
        double F = com.tencent.mm.sdk.platformtools.t8.F(this.f177987m.getText(), 0.0d);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtPlanAddUI", "money: %s", java.lang.Double.valueOf(F));
        com.tencent.mm.plugin.wallet_core.model.Bankcard c76 = c7(this.I.f381167h);
        if (c76 == null || F <= c76.field_dayQuotaKind) {
            this.f177988n.setText(this.F);
            this.f177988n.setTextColor(getResources().getColor(com.tencent.mm.R.color.a09));
            this.f177981J.setVisibility(0);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtPlanAddUI", "show over alert");
            this.f177988n.setText(this.N);
            this.f177988n.setTextColor(getResources().getColor(com.tencent.mm.R.color.f479482a31));
            this.f177981J.setVisibility(0);
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public void hideWcKb() {
        if (this.mWcKeyboard != null) {
            com.tencent.mm.wallet_core.ui.m mVar = this.Y;
            if (mVar != null) {
                ((com.tencent.mm.plugin.wallet.balance.ui.lqt.e4) mVar).onVisibleStateChange(false);
            }
            this.mWcKeyboard.i();
        }
    }

    public final void i7() {
        if (this.C == 2) {
            java.math.BigDecimal i17 = com.tencent.mm.wallet_core.ui.r1.i("" + this.I.f381164e, "100", 2, java.math.RoundingMode.HALF_UP);
            if (i17.intValue() == i17.doubleValue()) {
                this.f177987m.setText("" + i17.intValue());
            } else {
                this.f177987m.setText(i17.toString());
            }
        }
        f7();
        g7();
        this.f177997v.setVisibility(8);
        h7();
        this.f177982e.post(new com.tencent.mm.plugin.wallet.balance.ui.lqt.j3(this));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f177982e = (android.widget.ScrollView) findViewById(com.tencent.mm.R.id.itt);
        this.f177983f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.itk);
        this.f177984g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.itj);
        this.f177985h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ito);
        this.f177986i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.itm);
        this.f177987m = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.ite);
        this.f177988n = (android.widget.TextView) findViewById(com.tencent.mm.R.id.itd);
        this.f177989o = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) findViewById(com.tencent.mm.R.id.it8);
        this.f177990p = (android.widget.TextView) findViewById(com.tencent.mm.R.id.it_);
        this.f177992q = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.it9);
        this.f177993r = (android.widget.TextView) findViewById(com.tencent.mm.R.id.itp);
        this.f177994s = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.itn);
        this.f177995t = (android.widget.Button) findViewById(com.tencent.mm.R.id.itb);
        this.f177996u = (android.widget.CheckBox) findViewById(com.tencent.mm.R.id.itq);
        this.f177997v = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.itr);
        this.f177981J = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.itc);
        this.f177998w = (com.tencent.mm.wallet_core.keyboard.WcPayKeyboard) findViewById(com.tencent.mm.R.id.pok);
        this.f177999x = findViewById(com.tencent.mm.R.id.itu);
        this.f178001y = findViewById(com.tencent.mm.R.id.itv);
        this.f178002z = findViewById(com.tencent.mm.R.id.ita);
        this.T = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.lnl);
        this.Q = (android.widget.Button) findViewById(com.tencent.mm.R.id.lnm);
        this.R = (android.widget.Button) findViewById(com.tencent.mm.R.id.lnn);
        this.S = (android.widget.Button) findViewById(com.tencent.mm.R.id.lno);
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = this.f177987m.f214161h;
        if (tenpaySecureEditText != null) {
            tenpaySecureEditText.setPadding(0, 0, 0, 0);
        }
        this.f177987m.setTitleText(com.tencent.mm.wallet_core.model.c2.b());
        setWPKeyboard(this.f177987m.getContentEt(), false, false);
        if (fp.h.c(28)) {
            this.f177987m.post(new com.tencent.mm.plugin.wallet.balance.ui.lqt.f3(this));
        }
        this.f177998w.setActionText(getString(com.tencent.mm.R.string.f490568yq));
        this.f177998w.e(false);
        ((android.widget.RelativeLayout.LayoutParams) this.f177998w.getLayoutParams()).addRule(12);
        this.f177987m.getContentEt().setOnEditorActionListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.q3(this));
        this.f177995t.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.y3(this));
        this.f177996u.setOnCheckedChangeListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.z3(this));
        this.f177992q.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.a4(this));
        this.f177994s.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.b4(this));
        this.f177987m.b(new com.tencent.mm.plugin.wallet.balance.ui.lqt.c4(this));
        com.tencent.mm.plugin.wallet.balance.ui.lqt.e4 e4Var = new com.tencent.mm.plugin.wallet.balance.ui.lqt.e4(this);
        this.Y = e4Var;
        setTenpayKBStateListener(e4Var);
        this.f177982e.setOnTouchListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.f4(this));
        setResult(0);
        this.T.setVisibility(8);
        android.widget.Button button = this.Q;
        button.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.n3(this, button));
        android.widget.Button button2 = this.R;
        button2.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.n3(this, button2));
        android.widget.Button button3 = this.S;
        button3.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.n3(this, button3));
        setWcKbHeightListener(this);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtPlanAddUI", "activity result: %s, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.tencent.mm.plugin.wallet.balance.model.lqt.u1 u1Var = this.A;
        if (i17 == 0) {
            if (i18 == -1) {
                java.lang.String stringExtra = intent.getStringExtra("encrypt_pwd");
                int i07 = com.tencent.mm.wallet_core.ui.r1.i0(this.f177987m.getText(), "100");
                r45.n85 n85Var = this.I;
                java.lang.String str = n85Var.f381165f;
                java.lang.String str2 = n85Var.f381166g;
                java.lang.String str3 = n85Var.f381167h;
                int i19 = n85Var.f381163d;
                int i27 = n85Var.f381172p;
                android.app.Dialog e17 = com.tencent.mm.wallet_core.ui.b2.e(getContext(), false, false, null);
                com.tencent.mm.plugin.wallet.balance.model.lqt.r1 r1Var = u1Var.f177721b;
                r1Var.getClass();
                java.lang.Integer valueOf = java.lang.Integer.valueOf(i07);
                java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i19);
                java.lang.Integer valueOf3 = java.lang.Integer.valueOf(i27);
                km5.q qVar = new km5.q();
                qVar.y(stringExtra, str, str2, str3, valueOf, valueOf2, valueOf3);
                qVar.n(r1Var);
                ((km5.q) qVar.h(new com.tencent.mm.plugin.wallet.balance.ui.lqt.v2(this, e17))).s(new com.tencent.mm.plugin.wallet.balance.ui.lqt.u2(this, e17));
            }
        } else if (i17 == 4 && i18 == -1) {
            java.lang.String stringExtra2 = intent.getStringExtra("encrypt_pwd");
            int i08 = com.tencent.mm.wallet_core.ui.r1.i0(this.f177987m.getText(), "100");
            r45.n85 n85Var2 = this.I;
            int i28 = n85Var2.f381172p;
            java.lang.String str4 = n85Var2.f381165f;
            java.lang.String str5 = n85Var2.f381166g;
            java.lang.String str6 = n85Var2.f381167h;
            int i29 = n85Var2.f381163d;
            android.app.Dialog e18 = com.tencent.mm.wallet_core.ui.b2.e(getContext(), false, false, null);
            com.tencent.mm.plugin.wallet.balance.model.lqt.s1 s1Var = u1Var.f177722c;
            s1Var.getClass();
            java.lang.Integer valueOf4 = java.lang.Integer.valueOf(i28);
            java.lang.Integer valueOf5 = java.lang.Integer.valueOf(i08);
            java.lang.Integer valueOf6 = java.lang.Integer.valueOf(i29);
            km5.q qVar2 = new km5.q();
            qVar2.y(valueOf4, str4, str5, str6, valueOf5, valueOf6, stringExtra2);
            qVar2.n(s1Var);
            ((km5.q) qVar2.h(new com.tencent.mm.plugin.wallet.balance.ui.lqt.x2(this, e18))).s(new com.tencent.mm.plugin.wallet.balance.ui.lqt.w2(this, e18));
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtBasePresenterUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        fixStatusbar(true);
        super.onCreate(bundle);
        setMMTitle("");
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        hideActionbarLine();
        int i17 = 0;
        int intExtra = getIntent().getIntExtra("key_mode", 0);
        this.C = intExtra;
        if (intExtra == 2) {
            try {
                r45.n85 n85Var = new r45.n85();
                byte[] byteArrayExtra = getIntent().getByteArrayExtra("key_plan_item");
                if (byteArrayExtra != null) {
                    r45.n85 n85Var2 = (r45.n85) n85Var.parseFrom(byteArrayExtra);
                    this.I = n85Var2;
                    this.K = n85Var2.f381164e;
                    this.L = n85Var2.f381163d;
                    this.M = n85Var2.f381167h;
                }
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletLqtPlanAddUI", e17, "", new java.lang.Object[0]);
            }
        }
        this.P = new java.lang.String[28];
        while (i17 < 28) {
            int i18 = i17 + 1;
            this.P[i17] = getString(com.tencent.mm.R.string.f493563kq5, java.lang.String.valueOf(i18));
            i17 = i18;
        }
        initView();
        i7();
        b7(true);
    }

    @Override // com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtBasePresenterUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (!this.f177998w.isShown() || !com.tencent.mm.sdk.platformtools.t8.K0(this.f177987m.getText())) {
            return super.onKeyUp(i17, keyEvent);
        }
        hideWcKb();
        return true;
    }
}
