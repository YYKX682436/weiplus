package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes9.dex */
public class MobileRemitNumberInputUI extends com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitBaseUI {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f156574v = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.InputPanelFrameLayout f156575d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.RelativeLayout f156576e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f156577f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f156578g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f156579h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f156580i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f156581m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.Button f156582n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f156583o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f156584p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.WcPayBannerView f156585q;

    /* renamed from: r, reason: collision with root package name */
    public r45.np6 f156586r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f156587s;

    /* renamed from: t, reason: collision with root package name */
    public int f156588t = 0;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f156589u;

    public final void V6(boolean z17) {
        int height = ((android.view.WindowManager) getSystemService("window")).getDefaultDisplay().getHeight();
        int b17 = i65.a.b(getContext(), 96);
        int b18 = i65.a.b(getContext(), 64);
        int b19 = i65.a.b(getContext(), 48);
        int b27 = i65.a.b(getContext(), 40);
        int j17 = (height - com.tencent.mm.ui.bl.j(getContext())) - o25.n1.a(getContext());
        if (z17) {
            b17 = b18;
        }
        int i17 = j17 - b27;
        int i18 = this.f156588t;
        int i19 = (i17 - i18) - b17;
        if ((i17 - i18) - b17 < this.f156583o.getBottom() + b19) {
            i19 = this.f156583o.getBottom() + b19;
        }
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(this.f156584p.getTop(), i19);
        ofFloat.setDuration(1000L);
        ofFloat.setInterpolator(new y3.b());
        ofFloat.setDuration(175L);
        final java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this.f156584p);
        ofFloat.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitNumberInputUI$$a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                int i27 = com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitNumberInputUI.f156574v;
                int intValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).intValue();
                android.view.View view = (android.view.View) weakReference.get();
                if (view != null) {
                    view.layout(r1, intValue, view.getWidth() + r1, view.getHeight() + intValue);
                }
            }
        });
        ofFloat.addListener(new com.tencent.mm.plugin.remittance.mobile.ui.a0(this, weakReference, i19));
        ofFloat.start();
    }

    public final void W6() {
        java.lang.String sb6;
        java.lang.String sb7;
        java.lang.Object[] objArr = new java.lang.Object[1];
        r45.np6 np6Var = this.f156586r;
        int i17 = sw3.d.f413464u;
        if (np6Var == null) {
            sb7 = "TransferPhoneHomePageResp{null}";
        } else {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("TransferPhoneHomePageResp{ret_code=");
            sb8.append(np6Var.f381577d);
            sb8.append(", ret_msg='");
            sb8.append(np6Var.f381578e);
            sb8.append("', title='");
            sb8.append(np6Var.f381579f);
            sb8.append("', subtitle='");
            sb8.append(np6Var.f381580g);
            sb8.append("', has_his_rcvr=");
            sb8.append(np6Var.f381581h);
            sb8.append(", menu=");
            java.util.LinkedList linkedList = np6Var.f381582i;
            if (linkedList == null) {
                sb6 = "LinkedList<JumpItem>{null}";
            } else {
                java.lang.StringBuilder sb9 = new java.lang.StringBuilder("LinkedList<JumpItem>{");
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    sb9.append(com.tencent.mm.wallet_core.model.f0.e((r45.n34) it.next()));
                    sb9.append(", ");
                }
                sb9.append("}");
                sb6 = sb9.toString();
            }
            sb8.append(sb6);
            sb8.append(", announcement=");
            sb8.append(com.tencent.mm.wallet_core.model.f0.e(np6Var.f381583m));
            sb8.append(", homepage_ext='");
            sb8.append(np6Var.f381584n);
            sb8.append("'}");
            sb7 = sb8.toString();
        }
        objArr[0] = sb7;
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemitNumberInputUI", "updateView() mResponse:%s", objArr);
        if (this.f156586r == null) {
            this.f156576e.setVisibility(4);
            return;
        }
        this.f156576e.setVisibility(0);
        r45.np6 np6Var2 = this.f156586r;
        r45.tw4 tw4Var = np6Var2.f381585o;
        if (tw4Var != null && tw4Var.f386831d == 1) {
            this.f156585q.setBannerData(tw4Var);
        } else if (np6Var2.f381583m != null) {
            this.f156577f.setVisibility(0);
            this.f156578g.setText(this.f156586r.f381583m.f381048d);
            this.f156577f.setOnClickListener(new com.tencent.mm.plugin.remittance.mobile.ui.i0(this));
        } else {
            this.f156577f.setVisibility(8);
        }
        this.f156579h.setText(this.f156586r.f381579f);
        this.f156580i.setText(this.f156586r.f381580g);
        int i18 = this.f156586r.f381581h;
        if (i18 == 0) {
            this.f156581m.getInfoIv().setVisibility(8);
        } else if (i18 == 1) {
            this.f156581m.getInfoIv().setVisibility(0);
        }
        if (this.f156586r.f381582i.size() > 0) {
            addIconOptionMenu(0, com.tencent.mm.R.raw.actionbar_icon_dark_more, new com.tencent.mm.plugin.remittance.mobile.ui.m0(this));
        } else {
            removeOptionMenu(0);
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        try {
            hideVKB();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.mobileRemit.MobileRemitNumberInputUI", "%s %s", e17.getClass().getSimpleName(), e17.getMessage());
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.c27;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        super.initView();
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        setBackGroundColorResource(com.tencent.mm.R.color.aaw);
        setBackBtn(new com.tencent.mm.plugin.remittance.mobile.ui.b0(this));
        this.f156575d = (com.tencent.mm.ui.widget.InputPanelFrameLayout) findViewById(com.tencent.mm.R.id.m7j);
        this.f156576e = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.jnx);
        this.f156577f = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.jnw);
        this.f156578g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.af7);
        this.f156579h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.jny);
        this.f156580i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.jns);
        this.f156581m = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.jnz);
        com.tencent.mm.wallet_core.ui.WcPayBannerView wcPayBannerView = (com.tencent.mm.wallet_core.ui.WcPayBannerView) findViewById(com.tencent.mm.R.id.pga);
        this.f156585q = wcPayBannerView;
        wcPayBannerView.a();
        android.widget.TextView titleTv = this.f156581m.getTitleTv();
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) titleTv.getLayoutParams();
        layoutParams.width = -2;
        titleTv.setLayoutParams(layoutParams);
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = (com.tenpay.android.wechat.TenpaySecureEditText) this.f156581m.getContentEt();
        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) tenpaySecureEditText.getLayoutParams();
        layoutParams2.leftMargin = i65.a.b(getContext(), 24);
        tenpaySecureEditText.setLayoutParams(layoutParams2);
        tenpaySecureEditText.setFocusable(true);
        com.tencent.mm.pluginsdk.ui.wallet.WalletIconImageView infoIv = this.f156581m.getInfoIv();
        int color = getResources().getColor(com.tencent.mm.R.color.FG_2);
        infoIv.f192041u = com.tencent.mm.R.raw.icons_filled_close2;
        infoIv.f192042v = color;
        this.f156581m.getInfoIv().setIconContentDescription(getString(com.tencent.mm.R.string.hhv));
        this.f156582n = (android.widget.Button) findViewById(com.tencent.mm.R.id.jnt);
        this.f156583o = findViewById(com.tencent.mm.R.id.jnv);
        this.f156584p = findViewById(com.tencent.mm.R.id.auj);
        this.f156575d.setExternalListener(new com.tencent.mm.plugin.remittance.mobile.ui.c0(this));
        this.f156582n.setEnabled(false);
        this.f156582n.setOnClickListener(new com.tencent.mm.plugin.remittance.mobile.ui.d0(this));
        this.f156581m.getInfoIv().setOnClickListener(new com.tencent.mm.plugin.remittance.mobile.ui.e0(this));
        this.f156581m.b(new com.tencent.mm.plugin.remittance.mobile.ui.f0(this));
        this.f156581m.getContentEt().requestFocus();
    }

    @Override // com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitBaseUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        r45.n34 n34Var;
        super.onCreate(bundle);
        this.f156589u = getIntent().getStringExtra("key_content");
        overridePendingTransition(com.tencent.mm.R.anim.f477886ea, com.tencent.mm.R.anim.f477882e6);
        initView();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f156589u)) {
            this.f156581m.setText(this.f156589u);
            this.f156582n.setEnabled(true);
        }
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_MOBILE_REMITTANCE_HOME_PAGE_INFO_STRING_SYNC, "");
        com.tencent.mm.sdk.platformtools.t8.K0(str);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            int i17 = sw3.d.f413464u;
            r45.np6 np6Var = new r45.np6();
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                np6Var.f381577d = jSONObject.optInt("ret_code");
                np6Var.f381578e = jSONObject.optString("ret_msg");
                np6Var.f381579f = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                np6Var.f381580g = jSONObject.optString("subtitle");
                np6Var.f381581h = jSONObject.optInt("has_his_rcvr");
                org.json.JSONArray optJSONArray = jSONObject.optJSONArray("menu");
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    for (int i18 = 0; i18 < length; i18++) {
                        np6Var.f381582i.add(com.tencent.mm.wallet_core.model.f0.a(optJSONArray.getJSONObject(i18)));
                    }
                }
                try {
                    n34Var = com.tencent.mm.wallet_core.model.f0.a(new org.json.JSONObject(jSONObject.optString("announcement")));
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.JumpItemUtil", "createFromJSONObject() Exception:%s", e17.getMessage());
                    n34Var = null;
                }
                np6Var.f381583m = n34Var;
                np6Var.f381584n = jSONObject.optString("homepage_ext");
            } catch (org.json.JSONException e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.mobileRemit.NetSceneMobileRemitGetHomePage", "createFromJson() Exception:%s", e18.getMessage());
                np6Var = null;
            }
            this.f156586r = np6Var;
        }
        W6();
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemitNumberInputUI", "doNetSceneMobileRemitGetHomePage() isShowProgress:%s", java.lang.Boolean.valueOf(K0));
        this.f156587s = K0;
        doSceneProgress(new sw3.d(true), K0);
        addSceneEndListener(2952);
        addSceneEndListener(2993);
        addSceneEndListener(1495);
    }

    @Override // com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitBaseUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(2952);
        removeSceneEndListener(2993);
        removeSceneEndListener(1495);
    }

    @Override // com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitBaseUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f156581m.getContentEt().clearFocus();
        hideVKB();
        this.f156575d.getInputPanelHelper().f5896p = false;
        this.f156588t = 0;
        V6(false);
    }

    @Override // com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitBaseUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f156575d.postDelayed(new com.tencent.mm.plugin.remittance.mobile.ui.g0(this, new java.lang.ref.WeakReference(this.f156581m)), 500L);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.util.ArrayList arrayList;
        java.lang.String str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemitNumberInputUI", "errType:" + i17 + " errCode:" + i18 + " errMsg:" + str + " scenetype:" + m1Var.getType());
        if (i17 != 0 || i18 != 0) {
            if (m1Var instanceof sw3.d) {
                if (this.f156587s) {
                    androidx.appcompat.app.AppCompatActivity context = getContext();
                    if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                        str = getString(com.tencent.mm.R.string.kkk);
                    }
                    db5.t7.makeText(context, str, 0).show();
                }
                return true;
            }
            if (!(m1Var instanceof sw3.f)) {
                boolean z17 = m1Var instanceof sw3.h;
            }
            if (i18 == 0) {
                androidx.appcompat.app.AppCompatActivity context2 = getContext();
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    str = getString(com.tencent.mm.R.string.gwx);
                }
                db5.t7.makeText(context2, str, 0).show();
            }
            return true;
        }
        if (m1Var instanceof sw3.d) {
            r45.np6 np6Var = ((sw3.d) m1Var).f413465t;
            r45.np6 np6Var2 = np6Var != null ? np6Var : null;
            this.f156586r = np6Var2;
            if (np6Var2 != null && np6Var2.f381577d == 0) {
                W6();
                com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
                com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_MOBILE_REMITTANCE_HOME_PAGE_INFO_STRING_SYNC;
                r45.np6 np6Var3 = this.f156586r;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put("ret_code", np6Var3.f381577d);
                    jSONObject.put("ret_msg", np6Var3.f381578e);
                    jSONObject.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, np6Var3.f381579f);
                    jSONObject.put("subtitle", np6Var3.f381580g);
                    jSONObject.put("has_his_rcvr", np6Var3.f381581h);
                    java.util.LinkedList linkedList = np6Var3.f381582i;
                    if (linkedList != null) {
                        org.json.JSONArray jSONArray = new org.json.JSONArray();
                        java.util.Iterator it = linkedList.iterator();
                        while (it.hasNext()) {
                            jSONArray.put(com.tencent.mm.wallet_core.model.f0.b((r45.n34) it.next()));
                        }
                        jSONObject.put("menu", jSONArray);
                    }
                    jSONObject.put("announcement", np6Var3.f381583m);
                    jSONObject.put("homepage_ext", np6Var3.f381584n);
                    str2 = jSONObject.toString();
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.mobileRemit.NetSceneMobileRemitGetHomePage", "getJsonStrFromHomePageInfo() Exception: %s", e17.getMessage());
                    str2 = "";
                }
                c17.x(u3Var, str2);
            } else if (this.f156587s) {
                androidx.appcompat.app.AppCompatActivity context3 = getContext();
                r45.np6 np6Var4 = this.f156586r;
                db5.t7.makeText(context3, (np6Var4 == null || com.tencent.mm.sdk.platformtools.t8.K0(np6Var4.f381578e)) ? getString(com.tencent.mm.R.string.kkk) : this.f156586r.f381578e, 0).show();
            }
        } else if (m1Var instanceof sw3.f) {
            r45.hp6 hp6Var = ((sw3.f) m1Var).f413467t;
            if (hp6Var == null) {
                hp6Var = null;
            }
            if (hp6Var == null || hp6Var.f376378d != 0) {
                db5.t7.makeText(getContext(), (hp6Var == null || com.tencent.mm.sdk.platformtools.t8.K0(hp6Var.f376379e)) ? getString(com.tencent.mm.R.string.kkk) : hp6Var.f376379e, 0).show();
            } else {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_homepage_ext", this.f156586r.f381584n);
                intent.putExtra("key_finish", hp6Var.f376381g);
                intent.putExtra("key_last_id", hp6Var.f376382h);
                java.util.LinkedList linkedList2 = hp6Var.f376380f;
                if (linkedList2 == null) {
                    arrayList = null;
                } else {
                    arrayList = new java.util.ArrayList();
                    java.util.Iterator it6 = linkedList2.iterator();
                    while (it6.hasNext()) {
                        arrayList.add(new com.tencent.mm.plugin.remittance.mobile.cgi.NetSceneMobileRemitGetRecord$HisRcvrParcel((r45.ow3) it6.next()));
                    }
                }
                intent.putExtra("key_history_record", arrayList);
                j45.l.j(getContext(), "remittance", ".mobile.ui.MobileRemitHistoryRecodUI", intent, null);
                com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemitNumberInputUI", "TransferPhoneGetHisRcvrsResp finish:%s lastId:%s hisRecord.size:%s", java.lang.Boolean.valueOf(hp6Var.f376381g), hp6Var.f376382h, java.lang.Integer.valueOf(linkedList2.size()));
            }
        } else if (m1Var instanceof sw3.h) {
            sw3.h hVar = (sw3.h) m1Var;
            r45.jp6 jp6Var = hVar.f413471v;
            if (jp6Var == null) {
                jp6Var = null;
            }
            if (jp6Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.mobileRemit.MobileRemitNumberInputUI", "NetSceneMobileRemitGetRecvInfo rcvrResp is null");
                return true;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemitNumberInputUI", "NetSceneMobileRemitGetRecvInfo phone:%s ret_code:%s ret_msg:%s", hVar.f413470u, java.lang.Integer.valueOf(jp6Var.f378017d), jp6Var.f378018e);
            if (jp6Var.f378017d == 0) {
                if (jp6Var.f378020g != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemitNumberInputUI", "show remark or nickname change dialog!");
                    com.tencent.mm.wallet_core.model.f0.d(this, jp6Var.f378020g, null, new com.tencent.mm.plugin.remittance.mobile.ui.n0(this, jp6Var));
                } else if (jp6Var.f378033w != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemitNumberInputUI", "show free oneself from dialog!");
                    com.tencent.mm.wallet_core.model.f0.d(this, jp6Var.f378033w, null, new com.tencent.mm.plugin.remittance.mobile.ui.z(this, jp6Var));
                } else {
                    tw3.b.a(getContext(), jp6Var);
                }
                return true;
            }
            if (jp6Var.f378019f == 1) {
                com.tencent.mars.xlog.Log.w("MicroMsg.mobileRemit.MobileRemitNumberInputUI", "why here???");
            }
            db5.e1.E(getContext(), com.tencent.mm.sdk.platformtools.t8.K0(jp6Var.f378018e) ? getString(com.tencent.mm.R.string.kkk) : jp6Var.f378018e, "", getResources().getString(com.tencent.mm.R.string.gww), false, null).show();
        }
        return false;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(com.tencent.mm.plugin.remittance.mobile.ui.o0.class);
    }
}
