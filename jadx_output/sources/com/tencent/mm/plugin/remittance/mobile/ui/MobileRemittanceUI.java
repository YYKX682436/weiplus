package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes9.dex */
public class MobileRemittanceUI extends com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitBaseUI {

    /* renamed from: y0, reason: collision with root package name */
    public static final /* synthetic */ int f156612y0 = 0;
    public android.widget.TextView A;
    public android.view.View B;
    public android.widget.TextView C;
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView D;
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView E;
    public android.widget.RelativeLayout F;
    public android.widget.TextView G;
    public android.widget.RelativeLayout H;
    public android.widget.LinearLayout I;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.TextView f156613J;
    public android.widget.TextView K;
    public android.widget.RelativeLayout L;
    public android.widget.TextView M;
    public java.lang.String N;
    public double P;
    public java.lang.String Q;
    public int R;
    public java.lang.String U;
    public android.content.Intent V;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f156614d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f156615e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f156616f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f156617g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f156618h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f156619i;

    /* renamed from: m, reason: collision with root package name */
    public int f156620m;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f156622o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f156623p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f156625q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f156626r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f156627s;

    /* renamed from: t, reason: collision with root package name */
    public int f156628t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f156629u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.ScrollView f156630v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.wallet_core.keyboard.WcPayKeyboard f156631w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.LinearLayout f156632x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f156634y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.TextView f156635z;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f156621n = new java.util.ArrayList();
    public int S = 0;
    public int T = 0;
    public final java.util.Map W = new java.util.HashMap();
    public final java.util.Map X = new java.util.HashMap();
    public final com.tencent.mm.sdk.event.IListener Y = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MobilePayCheckEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI.1
        {
            this.__eventId = 251598728;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.MobilePayCheckEvent mobilePayCheckEvent) {
            java.lang.String str = mobilePayCheckEvent.f54496g.f8017a;
            com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemittanceUI", "MobilePayCheckEvent reqKey:%s", str);
            com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI mobileRemittanceUI = com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI.this;
            java.util.HashMap hashMap = (java.util.HashMap) mobileRemittanceUI.W;
            com.tencent.mm.plugin.remittance.mobile.ui.b2 b2Var = (com.tencent.mm.plugin.remittance.mobile.ui.b2) hashMap.get(str);
            hashMap.size();
            if (b2Var == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemittanceUI", "no data for: %s", str);
            } else {
                gm0.j1.d().g(new sw3.j(str, b2Var.f156645a, b2Var.f156646b, b2Var.f156647c, b2Var.f156648d, b2Var.f156649e, b2Var.f156650f, b2Var.f156651g));
            }
            java.util.Map map = mobileRemittanceUI.X;
            if (map == null || !((java.util.HashMap) map).containsKey(str)) {
                return false;
            }
            com.tencent.mm.plugin.remittance.mobile.ui.b2 b2Var2 = (com.tencent.mm.plugin.remittance.mobile.ui.b2) ((java.util.HashMap) mobileRemittanceUI.W).get(str);
            java.lang.String str2 = b2Var2 != null ? b2Var2.f156645a : "";
            if (((java.lang.Boolean) ((java.util.HashMap) map).get(str)).booleanValue()) {
                mobileRemittanceUI.Y6(7, str2);
                return false;
            }
            mobileRemittanceUI.Y6(6, str2);
            return false;
        }
    };
    public int Z = 0;

    /* renamed from: p0, reason: collision with root package name */
    public final java.lang.Runnable f156624p0 = new com.tencent.mm.plugin.remittance.mobile.ui.e1(this);

    /* renamed from: x0, reason: collision with root package name */
    public final tw3.a f156633x0 = new com.tencent.mm.plugin.remittance.mobile.ui.l1(this);

    public static void V6(com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI mobileRemittanceUI) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(mobileRemittanceUI.Q)) {
            mobileRemittanceUI.f156613J.setVisibility(8);
            mobileRemittanceUI.K.setText(com.tencent.mm.R.string.hyc);
            mobileRemittanceUI.K.setVisibility(0);
            return;
        }
        new com.tencent.mm.plugin.wallet_core.ui.b4(mobileRemittanceUI.getContext());
        java.lang.String string = mobileRemittanceUI.getString(com.tencent.mm.R.string.f492824i05);
        java.lang.String string2 = mobileRemittanceUI.getString(com.tencent.mm.R.string.b9z, mobileRemittanceUI.Q, string);
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
        android.text.SpannableString i17 = com.tencent.mm.pluginsdk.ui.span.c0.i(mobileRemittanceUI, string2);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(i17);
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(mobileRemittanceUI.getResources().getColor(com.tencent.mm.R.color.f479308vo)), i17.length() - string.length(), i17.length(), 34);
        mobileRemittanceUI.f156613J.setText(spannableStringBuilder);
        mobileRemittanceUI.K.setVisibility(8);
        mobileRemittanceUI.f156613J.setVisibility(0);
    }

    public final void W6(int i17) {
        com.tencent.mm.autogen.mmdata.rpt.WCPayTransferToPhoneActionReportStruct wCPayTransferToPhoneActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WCPayTransferToPhoneActionReportStruct();
        wCPayTransferToPhoneActionReportStruct.f62121d = i17;
        wCPayTransferToPhoneActionReportStruct.k();
    }

    public final void X6(boolean z17, boolean z18) {
        doSceneProgress(new sw3.k(this.f156614d, this.f156615e, this.f156625q, this.P, this.Q, this.R, this.f156627s, this.f156626r, z17, this.f156629u, z18), true);
    }

    public final void Y6(int i17, java.lang.String str) {
        com.tencent.mm.autogen.mmdata.rpt.WCPayTransferToPhonePlaceOrderExceptionReportStruct wCPayTransferToPhonePlaceOrderExceptionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WCPayTransferToPhonePlaceOrderExceptionReportStruct();
        wCPayTransferToPhonePlaceOrderExceptionReportStruct.f62124d = i17;
        wCPayTransferToPhonePlaceOrderExceptionReportStruct.f62125e = wCPayTransferToPhonePlaceOrderExceptionReportStruct.b("ReqKey", str, true);
        wCPayTransferToPhonePlaceOrderExceptionReportStruct.k();
    }

    public final void Z6(sw3.k kVar) {
        r45.rp6 rp6Var = kVar.f413476t;
        com.tencent.mm.plugin.remittance.mobile.ui.b2 b2Var = new com.tencent.mm.plugin.remittance.mobile.ui.b2((rp6Var == null ? null : rp6Var).f385088o, (rp6Var == null ? null : rp6Var).f385089p, (rp6Var == null ? null : rp6Var).f385090q, this.f156614d, kVar.f413477u, (rp6Var == null ? null : rp6Var).f385092s, this.f156615e, (rp6Var == null ? null : rp6Var).f385091r, kVar.f413478v, kVar.f413479w, kVar.f413480x);
        java.util.Map map = this.W;
        if (rp6Var == null) {
            rp6Var = null;
        }
        ((java.util.HashMap) map).put(rp6Var.f385088o, b2Var);
    }

    public final void a7(int i17) {
        showCircleStWcKb();
        com.tencent.mm.plugin.remittance.ui.b0 b0Var = new com.tencent.mm.plugin.remittance.ui.b0(this);
        java.lang.String str = this.f156622o;
        java.lang.String str2 = this.f156623p;
        b0Var.f157641b = new com.tencent.mm.plugin.remittance.mobile.ui.z1(this, i17);
        android.view.View inflate = android.view.View.inflate(this, com.tencent.mm.R.layout.ccc, null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.ht7);
        android.widget.EditText editText = (android.widget.EditText) inflate.findViewById(com.tencent.mm.R.id.g6u);
        ((com.tencent.mm.ui.widget.MMNeat7extView) inflate.findViewById(com.tencent.mm.R.id.cgi)).b(str);
        textView.setText(str2);
        com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
        aVar.f211709a = getString(com.tencent.mm.R.string.gxh);
        aVar.L = inflate;
        ck5.f b17 = ck5.f.b(editText);
        b17.f42562g = com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_1;
        b17.f42561f = 1;
        b17.f42560e = 1;
        b17.f42556a = false;
        b17.d(null);
        com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.remittance.ui.u(b0Var, editText), 200L);
        aVar.f211732v = getResources().getString(com.tencent.mm.R.string.gxd);
        aVar.W = -2141754475;
        aVar.E = new com.tencent.mm.plugin.remittance.ui.v(b0Var, editText);
        aVar.Z = false;
        aVar.f211733w = getResources().getString(com.tencent.mm.R.string.apj);
        aVar.F = new com.tencent.mm.plugin.remittance.ui.w(b0Var);
        com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(this, com.tencent.mm.R.style.f494791wd);
        j0Var.e(aVar);
        com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
        if (d0Var != null) {
            d0Var.a(j0Var.f211837r);
        }
        j0Var.show();
        editText.addTextChangedListener(new com.tencent.mm.plugin.remittance.ui.x(b0Var, editText, j0Var));
    }

    public final void b7(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemittanceUI", "startPay() reqKey:%s", str);
        com.tencent.mm.plugin.remittance.mobile.ui.b2 b2Var = (com.tencent.mm.plugin.remittance.mobile.ui.b2) ((java.util.HashMap) this.W).get(str);
        if (b2Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.mobileRemit.MobileRemittanceUI", "startPay() strut == null fail!!");
            return;
        }
        if (b2Var.f156653i) {
            ((java.util.HashMap) this.X).put(str, java.lang.Boolean.valueOf(b2Var.f156654j));
        }
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = new com.tencent.mm.pluginsdk.wallet.PayInfo();
        payInfo.f192114m = str;
        payInfo.f192109e = 56;
        payInfo.f192111g = tw3.b.f422479a;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("extinfo_key_1", b2Var.f156645a);
        bundle.putString("extinfo_key_2", b2Var.f156646b);
        bundle.putString("extinfo_key_3", b2Var.f156647c);
        bundle.putString("extinfo_key_4", b2Var.f156650f);
        bundle.putInt("extinfo_key_5", b2Var.f156648d);
        bundle.putString("extinfo_key_6", b2Var.f156651g);
        bundle.putString("extinfo_key_7", b2Var.f156649e);
        bundle.putInt("extinfo_key_8", b2Var.f156652h);
        bundle.putString("extinfo_key_9", this.f156616f);
        bundle.putString("extinfo_key_10", this.f156617g);
        bundle.putString("extinfo_key_11", str);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.N)) {
            bundle.putString("extinfo_key_12", getString(com.tencent.mm.R.string.gwv, this.f156616f, this.N));
        }
        payInfo.f192122u = bundle;
        com.tencent.mm.wallet_core.b.a().getClass();
        com.tencent.mm.wallet_core.b.a().getClass();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemittanceUI", "isKindaEnable: %s，isKindaMobileRemittanceEnable ：%s", bool, bool);
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemittanceUI", "startPay() for kinda");
        hideProgress();
        hideLoading();
        android.content.Intent intent = new android.content.Intent(getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitResultUI.class);
        this.V = intent;
        intent.putExtras(bundle);
        showProgress();
        ((h45.q) i95.n0.c(h45.q.class)).startSNSPay(getContext(), payInfo);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.c2_;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01fa  */
    @Override // com.tencent.mm.ui.MMActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void initView() {
        /*
            Method dump skipped, instructions count: 886
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI.initView():void");
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean isHandleAutoShowNormalStWcKb() {
        return this.f156631w.o();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemittanceUI", "reqcode=" + i17 + ", resultCode=" + i18);
        if (i17 == 1) {
            boolean z17 = i18 == -1;
            com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemittanceUI", "processResult() isOk:%s", java.lang.Boolean.valueOf(z17));
            if (z17) {
                finish();
            } else if (com.tencent.mm.wallet_core.model.b2.b(intent)) {
                finish();
            } else {
                com.tencent.mm.wallet_core.model.b2.c(intent);
            }
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitBaseUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f156614d = getIntent().getStringExtra("key_rcvr_openid");
        this.f156615e = getIntent().getStringExtra("key_rcvr_token");
        this.f156616f = getIntent().getStringExtra("key_wx_name");
        this.f156617g = getIntent().getStringExtra("key_real_name");
        this.f156618h = getIntent().getStringExtra("key_phone");
        this.f156619i = getIntent().getStringExtra("key_img_url");
        this.f156620m = getIntent().getIntExtra("key_amount_remind_bit", 4);
        java.util.ArrayList<com.tencent.mm.plugin.remittance.mobile.cgi.NetSceneMobileRemitGetRecvInfo$DelayOptionParcel> parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("key_delay_options");
        if (parcelableArrayListExtra != null && !parcelableArrayListExtra.isEmpty()) {
            java.util.List list = this.f156621n;
            int i17 = sw3.h.f413468w;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (com.tencent.mm.plugin.remittance.mobile.cgi.NetSceneMobileRemitGetRecvInfo$DelayOptionParcel netSceneMobileRemitGetRecvInfo$DelayOptionParcel : parcelableArrayListExtra) {
                r45.bd0 bd0Var = new r45.bd0();
                bd0Var.f370673d = netSceneMobileRemitGetRecvInfo$DelayOptionParcel.f156554d;
                bd0Var.f370674e = netSceneMobileRemitGetRecvInfo$DelayOptionParcel.f156555e;
                arrayList.add(bd0Var);
            }
            ((java.util.ArrayList) list).addAll(arrayList);
        }
        this.f156622o = getIntent().getStringExtra("key_check_name_wording");
        this.f156623p = getIntent().getStringExtra("key_check_name_mask");
        this.f156625q = getIntent().getStringExtra("key_get_rcvr_ext");
        this.f156626r = getIntent().getStringExtra("key_timestamp_ms");
        initView();
        addSceneEndListener(2878);
        addSceneEndListener(2694);
        this.Y.alive();
        this.Z = 1;
    }

    @Override // com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitBaseUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.Y.dead();
        removeSceneEndListener(2878);
        removeSceneEndListener(2694);
        java.util.Map map = this.W;
        if (map != null) {
            ((java.util.HashMap) map).clear();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.widget.dialog.l
    public void onDialogDismiss(android.app.Dialog dialog) {
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemittanceUI", "onDialogDismiss()");
        com.tencent.mm.sdk.platformtools.u3.i(this.f156624p0, 300L);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard = this.f156631w;
        if (wcPayKeyboard == null || !wcPayKeyboard.onKeyUp(i17, keyEvent)) {
            return super.onKeyUp(i17, keyEvent);
        }
        return true;
    }

    @Override // com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitBaseUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemittanceUI", "onPause()");
        if (this.f156631w.p()) {
            return;
        }
        this.Z = 3;
    }

    @Override // com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitBaseUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemittanceUI", "onResume()");
        if (this.Z == 3 && isHandleAutoShowNormalStWcKb()) {
            showNormalStWcKb();
        }
        this.Z = 2;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemittanceUI", "errType:" + i17 + " errCode:" + i18 + " errMsg:" + str + " scenetype:" + m1Var.getType());
        if (i17 == 0 && i18 == 0) {
            if (m1Var instanceof sw3.b) {
                sw3.b bVar = (sw3.b) m1Var;
                r45.dp6 dp6Var = bVar.f413461t;
                if (dp6Var == null) {
                    dp6Var = null;
                }
                if (dp6Var == null) {
                    db5.e1.E(getContext(), getString(com.tencent.mm.R.string.kkk), "", getResources().getString(com.tencent.mm.R.string.gww), false, null).show();
                } else {
                    if (dp6Var.f372652h != null) {
                        com.tencent.mm.wallet_core.model.f0.d(getContext(), dp6Var.f372652h, null, new com.tencent.mm.plugin.remittance.mobile.ui.f1(this));
                    } else if (dp6Var.f372648d == 0) {
                        this.C.setText(com.tencent.mm.R.string.gxf);
                        this.C.setTextColor(getResources().getColor(com.tencent.mm.R.color.a09));
                        this.C.setOnClickListener(null);
                        this.C.setOnTouchListener(null);
                        this.f156635z.setText(getString(com.tencent.mm.R.string.gxe, dp6Var.f372651g));
                        this.N = dp6Var.f372651g;
                        this.f156627s = dp6Var.f372650f;
                        if (bVar.f413462u == 2) {
                            X6(true, true);
                            Y6(2, "");
                        } else {
                            android.widget.Toast makeText = dp.a.makeText(getContext(), "", 0);
                            android.view.View inflate = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.f488379rq, null);
                            ((com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(com.tencent.mm.R.id.f487356oe2)).setImageResource(com.tencent.mm.R.raw.icons_filled_done);
                            ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f487357oe3)).setText(getContext().getResources().getString(com.tencent.mm.R.string.gxg));
                            makeText.setGravity(17, 0, 0);
                            makeText.setView(inflate);
                            makeText.show();
                            new com.tencent.mm.sdk.platformtools.n3().postDelayed(new com.tencent.mm.plugin.remittance.mobile.ui.g1(this, makeText, m1Var), 750L);
                        }
                        W6(9);
                    } else {
                        db5.e1.E(getContext(), com.tencent.mm.sdk.platformtools.t8.K0(dp6Var.f372649e) ? getString(com.tencent.mm.R.string.kkk) : dp6Var.f372649e, "", getResources().getString(com.tencent.mm.R.string.gww), false, null).show();
                    }
                    this.f156627s = dp6Var.f372650f;
                }
                return true;
            }
            if (m1Var instanceof sw3.k) {
                sw3.k kVar = (sw3.k) m1Var;
                r45.rp6 rp6Var = kVar.f413476t;
                if (rp6Var == null) {
                    rp6Var = null;
                }
                if (rp6Var == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.mobileRemit.MobileRemittanceUI", "NetSceneMobileRemitPlaceOrder placeOrderResp is null");
                    return true;
                }
                int i19 = rp6Var.f385080d;
                if (i19 == 0) {
                    this.f156629u = rp6Var.f385093t;
                    this.U = rp6Var.f385094u;
                    if (rp6Var.f385083g != null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemittanceUI", "NetSceneMobileRemitPlaceOrder show jump_win");
                        com.tencent.mm.wallet_core.model.f0.d(getContext(), rp6Var.f385083g, null, new com.tencent.mm.plugin.remittance.mobile.ui.i1(this));
                    } else if (rp6Var.f385084h != 0) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemittanceUI", "NetSceneMobileRemitPlaceOrder show verify dilog");
                        a7(2);
                        Y6(1, "");
                    } else {
                        r45.po5 po5Var = rp6Var.f385085i;
                        tw3.a aVar = this.f156633x0;
                        if (po5Var != null) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemittanceUI", "NetSceneMobileRemitPlaceOrder show remind_win");
                            com.tencent.mm.wallet_core.model.f0.d(getContext(), rp6Var.f385085i, rp6Var.f385088o, aVar);
                            Z6(kVar);
                        } else if (rp6Var.f385086m != null) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemittanceUI", "NetSceneMobileRemitPlaceOrder show check_win");
                            androidx.appcompat.app.AppCompatActivity context = getContext();
                            r45.e30 e30Var = rp6Var.f385086m;
                            java.lang.String str2 = rp6Var.f385088o;
                            com.tencent.mm.plugin.remittance.mobile.ui.j1 j1Var = new com.tencent.mm.plugin.remittance.mobile.ui.j1(this, rp6Var);
                            com.tencent.mm.plugin.remittance.mobile.ui.k1 k1Var = new com.tencent.mm.plugin.remittance.mobile.ui.k1(this, rp6Var);
                            if (e30Var == null) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.JumpItemUtil", "showCheckWin() checkWin == null");
                            } else if (e30Var.f372966g == null || e30Var.f372967h == null) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.JumpItemUtil", "showCheckWin() left_button == null || right_button == null");
                            } else {
                                java.util.LinkedList linkedList = e30Var.f372965f;
                                if (linkedList == null || linkedList.isEmpty()) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.JumpItemUtil", "showCheckWin() check_item == null || check_item.isEmpty()");
                                } else {
                                    android.view.View inflate2 = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f488601yb, (android.view.ViewGroup) null);
                                    ((android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.nrk)).setText(e30Var.f372964e);
                                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate2.findViewById(com.tencent.mm.R.id.hhb);
                                    for (int i27 = 0; i27 < linkedList.size(); i27++) {
                                        android.view.View inflate3 = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f488600ya, (android.view.ViewGroup) null);
                                        ((android.widget.TextView) inflate3.findViewById(com.tencent.mm.R.id.f485380hi0)).setText(((r45.f44) linkedList.get(i27)).f374006d);
                                        ((android.widget.TextView) inflate3.findViewById(com.tencent.mm.R.id.hjw)).setText(((r45.f44) linkedList.get(i27)).f374007e);
                                        linearLayout.addView(inflate3);
                                    }
                                    db5.e1.I(context, false, e30Var.f372963d, inflate2, e30Var.f372967h.f381048d, e30Var.f372966g.f381048d, new com.tencent.mm.wallet_core.model.x(context, e30Var, str2, k1Var), new com.tencent.mm.wallet_core.model.y(context, e30Var, str2, j1Var)).show();
                                }
                            }
                            Z6(kVar);
                        } else if (rp6Var.f385087n != null) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemittanceUI", "NetSceneMobileRemitPlaceOrder show dup_pay_win");
                            androidx.appcompat.app.AppCompatActivity context2 = getContext();
                            r45.oo5 oo5Var = rp6Var.f385087n;
                            java.lang.String str3 = rp6Var.f385088o;
                            if (oo5Var == null) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.JumpItemUtil", "showRemindWin3() remindWin3 == null");
                            } else {
                                java.lang.String str4 = oo5Var.f382398d;
                                java.lang.String str5 = oo5Var.f382400f.f381048d;
                                java.lang.String str6 = oo5Var.f382399e.f381048d;
                                com.tencent.mm.wallet_core.model.z zVar = new com.tencent.mm.wallet_core.model.z(context2, oo5Var, str3, aVar);
                                com.tencent.mm.wallet_core.model.a0 a0Var = new com.tencent.mm.wallet_core.model.a0(context2, oo5Var, str3, aVar);
                                com.tencent.mm.ui.widget.dialog.a aVar2 = new com.tencent.mm.ui.widget.dialog.a();
                                aVar2.f211709a = "";
                                aVar2.f211729s = str4;
                                aVar2.f211732v = str5;
                                aVar2.E = zVar;
                                aVar2.f211733w = str6;
                                aVar2.F = a0Var;
                                aVar2.A = false;
                                aVar2.B = true;
                                com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(context2, com.tencent.mm.R.style.f494791wd);
                                j0Var.e(aVar2);
                                com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar2.f211723m;
                                if (d0Var != null) {
                                    d0Var.a(j0Var.f211837r);
                                }
                                j0Var.show();
                                db5.e1.a(context2, j0Var);
                            }
                            Z6(kVar);
                        } else {
                            com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemittanceUI", "go to start pay");
                            Z6(kVar);
                            b7(rp6Var.f385088o);
                        }
                    }
                    return true;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemittanceUI", "NetSceneMobileRemitPlaceOrder ret_code:%s ret_code_action:%s", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(rp6Var.f385082f));
                db5.e1.E(getContext(), com.tencent.mm.sdk.platformtools.t8.K0(rp6Var.f385081e) ? getString(com.tencent.mm.R.string.kkk) : rp6Var.f385081e, "", getResources().getString(com.tencent.mm.R.string.gww), false, new com.tencent.mm.plugin.remittance.mobile.ui.h1(this, rp6Var)).show();
            }
        } else {
            if (!(m1Var instanceof sw3.b)) {
                boolean z17 = m1Var instanceof sw3.k;
            }
            if (i18 == 0) {
                db5.e1.E(getContext(), com.tencent.mm.sdk.platformtools.t8.K0(str) ? getString(com.tencent.mm.R.string.gwx) : str, "", getResources().getString(com.tencent.mm.R.string.gww), false, null).show();
            }
        }
        return false;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(com.tencent.mm.plugin.remittance.mobile.ui.d2.class);
    }
}
