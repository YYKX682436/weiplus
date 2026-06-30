package com.tencent.mm.plugin.wallet_core.ui.view;

/* loaded from: classes9.dex */
public class WalletSuccPageAwardWidget extends android.widget.FrameLayout {
    public boolean A;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView f180732d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f180733e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f180734f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f180735g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.ViewGroup f180736h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f180737i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f180738m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.ui.view.WalletScratchShakeView f180739n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.ui.view.WalletAwardShakeAnimView f180740o;

    /* renamed from: p, reason: collision with root package name */
    public a36.c f180741p;

    /* renamed from: q, reason: collision with root package name */
    public a36.i f180742q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f180743r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.WalletBaseUI f180744s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f180745t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f180746u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f180747v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f180748w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f180749x;

    /* renamed from: y, reason: collision with root package name */
    public a36.a f180750y;

    /* renamed from: z, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f180751z;

    public WalletSuccPageAwardWidget(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f180746u = false;
        this.f180747v = false;
        this.f180748w = true;
        this.f180749x = false;
        this.f180750y = null;
        this.f180751z = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.A = false;
        h(context);
    }

    public static void a(com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget walletSuccPageAwardWidget) {
        walletSuccPageAwardWidget.f180744s.doSceneProgress(new ss4.o(walletSuccPageAwardWidget.f180741p.f1108h.f1096i, walletSuccPageAwardWidget.f180745t));
    }

    public static void b(com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget walletSuccPageAwardWidget, int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletSuccPageAwardWidget", "doDrawLottery, is_query_other: %s", java.lang.Integer.valueOf(walletSuccPageAwardWidget.f180741p.f1105e));
        a36.c cVar = walletSuccPageAwardWidget.f180741p;
        if (cVar.f1105e != 0) {
            walletSuccPageAwardWidget.f180744s.doSceneProgress(new ss4.m(cVar.f1106f, i17, walletSuccPageAwardWidget.f180745t), z17);
        }
    }

    public static void c(com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget walletSuccPageAwardWidget) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletSuccPageAwardWidget", "delayCheckStartMiniApp, isMiniAppReturn: %s", java.lang.Boolean.valueOf(walletSuccPageAwardWidget.A));
        if (walletSuccPageAwardWidget.A) {
            return;
        }
        walletSuccPageAwardWidget.p();
        walletSuccPageAwardWidget.A = true;
    }

    public static boolean e(a36.c cVar) {
        java.util.LinkedList linkedList;
        return cVar != null && (((linkedList = cVar.f1104d) != null && linkedList.size() > 0) || cVar.f1114q != null);
    }

    private java.lang.String getAccImagesPath() {
        return lp0.b.D() + "wallet/images/";
    }

    public final java.lang.String d(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.N0(new java.lang.String[0])) {
            return null;
        }
        com.tencent.mm.vfs.w6.u(getAccImagesPath());
        java.lang.String str2 = getAccImagesPath() + kk.k.g(str.getBytes());
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletSuccPageAwardWidget", "buildImagePathByUrl, url: %s, path: %s", str, str2);
        return str2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.wallet_core.ui.view.WalletScratchShakeView walletScratchShakeView = this.f180739n;
        if (walletScratchShakeView != null && walletScratchShakeView.getVisibility() == 0) {
            com.tencent.mm.plugin.wallet_core.ui.view.WalletScratchShakeView walletScratchShakeView2 = this.f180739n;
            boolean z17 = false;
            if (walletScratchShakeView2 != null) {
                gt4.r1 r1Var = walletScratchShakeView2.f180727d;
                if (r1Var != null) {
                    r1Var.a(motionEvent);
                }
                com.tencent.mm.plugin.wallet_core.ui.view.WalletScratchShakeView walletScratchShakeView3 = this.f180739n;
                gt4.r1 r1Var2 = walletScratchShakeView3.f180727d;
                if (!(r1Var2 != null ? r1Var2.A : true)) {
                    z17 = walletScratchShakeView3.dispatchTouchEvent(motionEvent);
                }
            }
            android.view.ViewGroup viewGroup = this.f180736h;
            if (viewGroup != null && !z17) {
                return viewGroup.dispatchTouchEvent(motionEvent);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final java.lang.String f(a36.c cVar) {
        if (cVar != null) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                java.util.LinkedList linkedList = cVar.f1104d;
                if (linkedList != null && linkedList.size() > 0) {
                    java.util.Iterator it = cVar.f1104d.iterator();
                    while (it.hasNext()) {
                        a36.i iVar = (a36.i) it.next();
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                        jSONObject2.put("logo", iVar.f1149d);
                        jSONObject2.put("award_name", iVar.f1150e);
                        jSONObject2.put("award_description", iVar.f1151f);
                        jSONObject2.put("background_img", iVar.f1152g);
                        jSONObject2.put("award_name_color", iVar.f1153h);
                        jSONObject2.put("award_description_color", iVar.f1154i);
                        jSONArray.put(jSONObject2);
                    }
                }
                jSONObject.put("single_exposure_info_list", jSONArray);
                jSONObject.put("is_query_others", cVar.f1105e);
                jSONObject.put("draw_lottery_params", cVar.f1106f);
                jSONObject.put("is_show_btn", cVar.f1107g);
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                a36.a aVar = cVar.f1108h;
                if (aVar != null) {
                    jSONObject3.put("btn_words", aVar.f1091d);
                    jSONObject3.put("btn_color", cVar.f1108h.f1092e);
                    jSONObject3.put("btn_op_type", cVar.f1108h.f1093f);
                    jSONObject3.put("url", cVar.f1108h.f1094g);
                    org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                    a36.g gVar = cVar.f1108h.f1095h;
                    if (gVar != null) {
                        jSONObject4.put("activity_tinyapp_username", gVar.f1142d);
                        jSONObject4.put("activity_tinyapp_path", cVar.f1108h.f1095h.f1143e);
                        jSONObject4.put("activity_tinyapp_version", cVar.f1108h.f1095h.f1144f);
                    }
                    jSONObject3.put("mini_app_info", jSONObject4);
                    jSONObject3.put("get_lottery_params", cVar.f1108h.f1096i);
                }
                jSONObject.put("btn_info", jSONObject3);
                jSONObject.put("exposure_info_modify_params", cVar.f1109i);
                jSONObject.put("user_opertaion_type", cVar.f1110m);
                jSONObject.put("is_show_layer", cVar.f1111n);
                jSONObject.put("background_img_whole", cVar.f1113p);
                if (cVar.f1114q != null) {
                    org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                    jSONObject5.put("animation_wording", cVar.f1114q.f1099f);
                    jSONObject5.put("animation_wording_color", cVar.f1114q.f1100g);
                    jSONObject5.put("url", cVar.f1114q.f1098e);
                    jSONObject5.put("op_type", cVar.f1114q.f1101h);
                    jSONObject5.put("after_animation_wording", cVar.f1114q.f1102i);
                    jSONObject5.put("after_animation_wording_color", cVar.f1114q.f1103m);
                    org.json.JSONObject jSONObject6 = new org.json.JSONObject();
                    a36.g gVar2 = cVar.f1114q.f1097d;
                    if (gVar2 != null) {
                        jSONObject6.put("activity_tinyapp_username", gVar2.f1142d);
                        jSONObject6.put("activity_tinyapp_path", cVar.f1114q.f1097d.f1143e);
                        jSONObject6.put("activity_tinyapp_version", cVar.f1114q.f1097d.f1144f);
                    }
                    jSONObject5.put("mini_app_info", jSONObject6);
                    jSONObject.put("draw_lottery_info", jSONObject5);
                }
                return jSONObject.toString();
            } catch (java.lang.Exception unused) {
            }
        }
        return "";
    }

    public void g() {
        if (this.f180744s != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletSuccPageAwardWidget", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
            this.f180744s.addSceneEndListener(1859);
            this.f180744s.addSceneEndListener(2547);
            this.f180744s.addSceneEndListener(2803);
            this.f180744s.addSceneEndListener(2508);
            this.f180744s.addSceneEndListener(2529);
            this.f180744s.addSceneEndListener(2888);
        }
    }

    public final void h(android.content.Context context) {
        com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.d8e, (android.view.ViewGroup) this, true);
        this.f180736h = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.che);
        this.f180732d = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) findViewById(com.tencent.mm.R.id.ipk);
        this.f180733e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.k3s);
        this.f180734f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.cut);
        this.f180735g = (android.widget.Button) findViewById(com.tencent.mm.R.id.b2z);
        this.f180739n = (com.tencent.mm.plugin.wallet_core.ui.view.WalletScratchShakeView) findViewById(com.tencent.mm.R.id.f486739mb2);
        this.f180737i = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.aai);
        this.f180740o = (com.tencent.mm.plugin.wallet_core.ui.view.WalletAwardShakeAnimView) findViewById(com.tencent.mm.R.id.msb);
        this.f180733e.setTextSize(1, 17.0f);
        this.f180734f.setTextSize(1, 14.0f);
        this.f180735g.setTextSize(1, 16.0f);
        this.f180732d.setRoundCorner(true);
        this.f180732d.setUseSdcardCache(true);
    }

    public final void i() {
        a36.a aVar;
        boolean z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletSuccPageAwardWidget", "initBaseLotteryView");
        java.util.LinkedList linkedList = this.f180741p.f1104d;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = linkedList;
        objArr[1] = java.lang.Integer.valueOf(linkedList != null ? linkedList.size() : 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletSuccPageAwardWidget", "singleExposureInfoList %s, size: %s", objArr);
        if (linkedList != null && linkedList.size() > 0) {
            this.f180742q = (a36.i) linkedList.get(0);
            a36.i iVar = this.f180742q;
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletSuccPageAwardWidget", "singleExposureInfo %s, award_name: %s, award_description: %s, logo: %s", 0, iVar.f1150e, iVar.f1151f, iVar.f1149d);
            this.f180732d.setUrl(this.f180742q.f1149d);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f180742q.f1149d)) {
                this.f180732d.setVisibility(0);
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f180742q.f1150e)) {
                z17 = false;
            } else {
                this.f180733e.setText(this.f180742q.f1150e);
                this.f180733e.setVisibility(0);
                try {
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f180742q.f1153h)) {
                        this.f180733e.setTextColor(com.tencent.mm.plugin.wallet_core.utils.z1.b(this.f180742q.f1153h, true));
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletSuccPageAwardWidget", e17, "parse award_name_color error: %s", e17.getMessage());
                }
                z17 = true;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f180742q.f1151f)) {
                this.f180734f.setText(this.f180742q.f1151f);
                this.f180734f.setVisibility(0);
                try {
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f180742q.f1154i)) {
                        this.f180734f.setTextColor(com.tencent.mm.plugin.wallet_core.utils.z1.b(this.f180742q.f1154i, true));
                    }
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletSuccPageAwardWidget", e18, "parse award_description_color error: %s", e18.getMessage());
                }
                z17 = true;
            }
            if (z17) {
                android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f180733e.getLayoutParams();
                android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) this.f180734f.getLayoutParams();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f180742q.f1150e) && com.tencent.mm.sdk.platformtools.t8.K0(this.f180742q.f1151f)) {
                    layoutParams.addRule(15, -1);
                    layoutParams2.addRule(15, 0);
                    this.f180733e.setLayoutParams(layoutParams);
                    this.f180734f.setLayoutParams(layoutParams2);
                    this.f180733e.setVisibility(0);
                    this.f180734f.setVisibility(8);
                } else if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f180742q.f1150e) || com.tencent.mm.sdk.platformtools.t8.K0(this.f180742q.f1151f)) {
                    layoutParams.addRule(15, 0);
                    layoutParams2.addRule(15, 0);
                    this.f180733e.setLayoutParams(layoutParams);
                    this.f180734f.setLayoutParams(layoutParams2);
                    this.f180733e.setVisibility(0);
                    this.f180734f.setVisibility(0);
                } else {
                    layoutParams.addRule(15, 0);
                    layoutParams2.addRule(15, -1);
                    this.f180733e.setLayoutParams(layoutParams);
                    this.f180734f.setLayoutParams(layoutParams2);
                    this.f180733e.setVisibility(8);
                    this.f180734f.setVisibility(0);
                }
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f180742q.f1152g)) {
                this.f180737i.setVisibility(8);
                android.view.View findViewById = findViewById(com.tencent.mm.R.id.kks);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/view/WalletSuccPageAwardWidget", "initBaseLotteryView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/wallet_core/ui/view/WalletSuccPageAwardWidget", "initBaseLotteryView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.kkt);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/wallet_core/ui/view/WalletSuccPageAwardWidget", "initBaseLotteryView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/wallet_core/ui/view/WalletSuccPageAwardWidget", "initBaseLotteryView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletSuccPageAwardWidget", "background_img: %s", this.f180742q.f1152g);
                o11.f fVar = new o11.f();
                fVar.f342078b = true;
                fVar.f342079c = true;
                fVar.f342082f = d(this.f180742q.f1152g);
                n11.a.b().j(this.f180742q.f1152g, null, fVar.a(), new gt4.e2(this));
            }
        }
        java.lang.Object[] objArr2 = new java.lang.Object[3];
        objArr2[0] = java.lang.Integer.valueOf(this.f180741p.f1107g);
        a36.a aVar2 = this.f180741p.f1108h;
        objArr2[1] = aVar2;
        objArr2[2] = aVar2 != null ? aVar2.f1091d : "";
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletSuccPageAwardWidget", "is_show_btn: %s, btn_info: %s, btn_words: %s", objArr2);
        a36.c cVar = this.f180741p;
        if (cVar.f1107g == 0 || (aVar = cVar.f1108h) == null || com.tencent.mm.sdk.platformtools.t8.K0(aVar.f1091d)) {
            this.f180735g.setVisibility(8);
        } else {
            a36.a aVar3 = this.f180741p.f1108h;
            if (aVar3 != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletSuccPageAwardWidget", "btn_words: %s, type: %s, color: %s, url: %s", aVar3.f1091d, java.lang.Integer.valueOf(aVar3.f1093f), aVar3.f1092e, aVar3.f1094g);
                this.f180735g.setText(aVar3.f1091d);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(aVar3.f1092e)) {
                    android.graphics.drawable.Drawable drawable = getContext().getResources().getDrawable(com.tencent.mm.R.drawable.f481057jk);
                    drawable.setColorFilter(com.tencent.mm.plugin.wallet_core.utils.z1.b(aVar3.f1092e, false), android.graphics.PorterDuff.Mode.SRC);
                    this.f180735g.setBackground(drawable);
                }
                this.f180735g.setOnClickListener(new gt4.h2(this));
                this.f180735g.setVisibility(0);
                if (this.f180748w || this.f180746u) {
                    com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                    java.lang.Object[] objArr3 = new java.lang.Object[2];
                    objArr3[0] = 1;
                    objArr3[1] = java.lang.Integer.valueOf(this.f180746u ? 2 : 1);
                    g0Var.d(15225, objArr3);
                }
            }
        }
        if (this.f180733e.getVisibility() == 0) {
            this.f180733e.setSingleLine();
            this.f180733e.post(new gt4.i2(this));
        }
        if (this.f180735g.getVisibility() != 0) {
            this.f180733e.setEllipsize(android.text.TextUtils.TruncateAt.END);
        }
        int i17 = this.f180741p.f1111n;
        if (i17 != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletSuccPageAwardWidget", "exposureInfo.is_show_layer is true: %s, direct show layer", java.lang.Integer.valueOf(i17));
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f180741p.f1113p)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletSuccPageAwardWidget", "background_img_whole: %s", this.f180741p.f1113p);
        android.widget.ImageView imageView = this.f180738m;
        if (imageView != null) {
            imageView.setVisibility(0);
            o11.f fVar2 = new o11.f();
            fVar2.f342078b = true;
            fVar2.f342079c = true;
            fVar2.f342082f = d(this.f180741p.f1113p);
            n11.a.b().j(this.f180741p.f1113p, null, fVar2.a(), new gt4.k2(this));
        }
    }

    public void j() {
        com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI = this.f180744s;
        if (walletBaseUI != null) {
            walletBaseUI.removeSceneEndListener(1859);
            this.f180744s.removeSceneEndListener(2547);
            this.f180744s.removeSceneEndListener(2803);
            this.f180744s.removeSceneEndListener(2508);
            this.f180744s.removeSceneEndListener(2529);
            this.f180744s.removeSceneEndListener(2888);
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletSuccPageAwardWidget", "onDestroy, isShakeOrScratch: %s, isClickAwardButton: %s", java.lang.Boolean.valueOf(this.f180747v), java.lang.Boolean.valueOf(this.f180749x));
            if (!this.f180747v && !this.f180749x) {
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                java.lang.Object[] objArr = new java.lang.Object[2];
                objArr[0] = 6;
                objArr[1] = java.lang.Integer.valueOf(this.f180746u ? 2 : 1);
                g0Var.d(15225, objArr);
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletSuccPageAwardWidget", "user do nothing and quit ui, call drawlottery");
                this.f180744s.doSceneProgress(new ss4.m(this.f180741p.f1106f, 4, this.f180745t), false);
            }
        }
        com.tencent.mm.plugin.wallet_core.ui.view.WalletScratchShakeView walletScratchShakeView = this.f180739n;
        if (walletScratchShakeView != null) {
            walletScratchShakeView.a();
        }
        com.tencent.mm.plugin.wallet_core.ui.view.WalletAwardShakeAnimView walletAwardShakeAnimView = this.f180740o;
        if (walletAwardShakeAnimView != null) {
            walletAwardShakeAnimView.a();
        }
    }

    public void k() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletSuccPageAwardWidget", "onResume, isClickH5OrTinyApp: %s, exposureInfo: %s, isMiniAppReturn: %s", java.lang.Boolean.valueOf(this.f180746u), f(this.f180741p), java.lang.Boolean.valueOf(this.A));
        if (this.A) {
            return;
        }
        this.A = true;
        p();
    }

    public boolean l(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.util.LinkedList linkedList;
        a36.g gVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletSuccPageAwardWidget", "onSceneEnd, errType: %s, errCode: %s, errMsg: %s, scene: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, m1Var);
        java.lang.String str2 = "";
        if (m1Var instanceof ss4.o) {
            ss4.o oVar = (ss4.o) m1Var;
            if (i17 == 0 && i18 == 0) {
                r45.di3 di3Var = oVar.f412112d;
                if (di3Var == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WalletSuccPageAwardWidget", "getLottery end, response is null!!");
                    return true;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletSuccPageAwardWidget", "getLottery ret_code: %s, ret_msg: %s, alert_wording: %s, exposure_info: %s", java.lang.Integer.valueOf(di3Var.f372504d), di3Var.f372505e, di3Var.f372507g, di3Var.f372506f);
                if (di3Var.f372504d != 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletSuccPageAwardWidget", "getLotteryFailed");
                    o();
                } else {
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(di3Var.f372507g)) {
                        dp.a.makeText(getContext(), di3Var.f372507g, 1).show();
                        return true;
                    }
                    a36.c cVar = di3Var.f372506f;
                    if (cVar != null) {
                        a36.a aVar = this.f180741p.f1108h;
                        int i19 = aVar != null ? aVar.f1093f : 0;
                        this.f180741p = cVar;
                        a36.a aVar2 = cVar.f1108h;
                        if (aVar2 != null && aVar2 != null) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.WalletSuccPageAwardWidget", "getLottery end, btn_op_type: %s", java.lang.Integer.valueOf(aVar2.f1093f));
                            if (di3Var.f372506f.f1108h.f1093f == 4) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.WalletSuccPageAwardWidget", "update exposureInfo, new btn_op_type is 4");
                                this.f180741p.f1108h.f1093f = i19;
                            }
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.WalletSuccPageAwardWidget", "update exposureInfo");
                        m();
                    }
                    a36.a aVar3 = this.f180750y;
                    if (aVar3 != null && this.f180749x) {
                        int i27 = aVar3.f1093f;
                        if (i27 == 8) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.WalletSuccPageAwardWidget", "on getLotteryEnd, btn_op_type==GET_LOTTERY_AND_JUMP_URL, goto h5");
                            com.tencent.mm.wallet_core.ui.r1.V(this.f180744s, this.f180750y.f1094g, false);
                            this.f180746u = true;
                        } else if (i27 == 9 && (gVar = aVar3.f1095h) != null) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.WalletSuccPageAwardWidget", "on getLotteryEnd, btn_op_type==GET_LOTTERY_AND_JUMP_MINI_APP, jump tiny app, userName: %s, path: %s, version: %s", gVar.f1142d, gVar.f1143e, java.lang.Integer.valueOf(gVar.f1144f));
                            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent();
                            java.lang.String str3 = gVar.f1142d;
                            am.nx nxVar = startAppBrandUIFromOuterEvent.f54857g;
                            nxVar.f7466a = str3;
                            java.lang.String str4 = gVar.f1143e;
                            java.lang.String str5 = str2;
                            if (str4 != null) {
                                str5 = str4;
                            }
                            nxVar.f7467b = str5;
                            nxVar.f7469d = ad1.d.CTRL_INDEX;
                            nxVar.f7470e = this.f180743r;
                            nxVar.f7468c = 0;
                            int i28 = gVar.f1144f;
                            if (i28 > 0) {
                                nxVar.f7474i = i28;
                            }
                            nxVar.f7471f = this.f180744s;
                            startAppBrandUIFromOuterEvent.e();
                            this.f180746u = true;
                            this.A = false;
                            this.f180751z.postDelayed(new gt4.w1(this), 3000L);
                        }
                    }
                    this.f180750y = null;
                }
            } else {
                o();
            }
            return true;
        }
        if (m1Var instanceof ss4.p) {
            ss4.p pVar = (ss4.p) m1Var;
            if (i17 == 0 && i18 == 0) {
                r45.fm0 fm0Var = pVar.f412120d;
                if (fm0Var == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WalletSuccPageAwardWidget", "modifyExposure end, response is null!!");
                    return true;
                }
                java.lang.Object[] objArr = new java.lang.Object[6];
                objArr[0] = java.lang.Integer.valueOf(fm0Var.f374436d);
                objArr[1] = fm0Var.f374437e;
                java.util.LinkedList linkedList2 = fm0Var.f374438f;
                objArr[2] = linkedList2;
                objArr[3] = java.lang.Integer.valueOf(fm0Var.f374439g);
                a36.a aVar4 = fm0Var.f374440h;
                objArr[4] = aVar4;
                objArr[5] = java.lang.Integer.valueOf(aVar4 != null ? aVar4.f1093f : 0);
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletSuccPageAwardWidget", "modifyExposure, ret_code: %s, ret_msg: %s, single_exposure_info_list: %s, is_show_btn: %s, btn_info: %s, btn_op_type: %s", objArr);
                if (fm0Var.f374436d == 0) {
                    a36.c cVar2 = this.f180741p;
                    cVar2.f1104d = linkedList2;
                    cVar2.f1107g = fm0Var.f374439g;
                    a36.a aVar5 = cVar2.f1108h;
                    int i29 = aVar5 != null ? aVar5.f1093f : 0;
                    a36.a aVar6 = fm0Var.f374440h;
                    if (aVar6 != null) {
                        cVar2.f1108h = aVar6;
                        if (aVar6 != null && aVar6.f1093f == 4) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.WalletSuccPageAwardWidget", "update exposureInfo, new btn_op_type is 4");
                            this.f180741p.f1108h.f1093f = i29;
                        }
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletSuccPageAwardWidget", "after modify, exposureInfo: %s", f(this.f180741p));
                    i();
                }
            }
            this.f180746u = false;
            return true;
        }
        if (!(m1Var instanceof ss4.m)) {
            return false;
        }
        ss4.m mVar = (ss4.m) m1Var;
        if (i17 == 0 && i18 == 0) {
            r45.yf0 yf0Var = mVar.f412092d;
            if (yf0Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WalletSuccPageAwardWidget", "drawLottery end, response is null!!");
                return true;
            }
            java.lang.Object[] objArr2 = new java.lang.Object[4];
            objArr2[0] = java.lang.Integer.valueOf(yf0Var.f391031d);
            objArr2[1] = yf0Var.f391032e;
            a36.c cVar3 = yf0Var.f391033f;
            objArr2[2] = cVar3;
            java.lang.Object obj = str2;
            if (cVar3 != null) {
                obj = cVar3.f1104d;
            }
            objArr2[3] = obj;
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletSuccPageAwardWidget", "drawLottery end, retcode: %s, retmsg: %s, exposure_info: %s, single_exposure_info_list: %s", objArr2);
            a36.c cVar4 = yf0Var.f391033f;
            if (cVar4 == null || (linkedList = cVar4.f1104d) == null || linkedList.size() <= 0) {
                o();
            } else {
                java.lang.Object[] objArr3 = new java.lang.Object[3];
                a36.c cVar5 = yf0Var.f391033f;
                objArr3[0] = cVar5;
                a36.a aVar7 = cVar5.f1108h;
                objArr3[1] = aVar7;
                objArr3[2] = java.lang.Integer.valueOf(aVar7 != null ? aVar7.f1093f : 0);
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletSuccPageAwardWidget", "drawLottery end, exposureInfo: %s, btninfo: %s, btn_op_type: %s", objArr3);
                a36.a aVar8 = this.f180741p.f1108h;
                int i37 = aVar8 != null ? aVar8.f1093f : 0;
                a36.c cVar6 = yf0Var.f391033f;
                this.f180741p = cVar6;
                a36.a aVar9 = cVar6.f1108h;
                if (aVar9 != null && aVar9 != null && aVar9.f1093f == 4) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletSuccPageAwardWidget", "update exposureInfo, new btn_op_type is 4");
                    this.f180741p.f1108h.f1093f = i37;
                }
                m();
            }
        } else {
            o();
        }
        return true;
    }

    public final void m() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletSuccPageAwardWidget", "setViewByData, exposureInfo: %s, isFirstShow: %s", f(this.f180741p), java.lang.Boolean.valueOf(this.f180748w));
        a36.c cVar = this.f180741p;
        if (cVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletSuccPageAwardWidget", "setViewByData, exposureInfo is null!");
            return;
        }
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.WalletSuccPageAwardWidget", "setViewByData, user_operation_type: %s, single_exposure_info_list size: %s, isClickH5OrTinyApp: %s", java.lang.Integer.valueOf(cVar.f1110m), java.lang.Integer.valueOf(this.f180741p.f1104d.size()), java.lang.Boolean.valueOf(this.f180746u));
        a36.c cVar2 = this.f180741p;
        int i17 = cVar2.f1110m;
        if (i17 < 1 || i17 > 5 || !e(cVar2)) {
            return;
        }
        int i18 = this.f180741p.f1110m;
        if (i18 == 4) {
            i();
            if (this.f180739n.getVisibility() != 8) {
                this.f180739n.setVisibility(8);
                this.f180739n.a();
            }
            if (this.f180740o.getVisibility() != 8) {
                this.f180740o.setVisibility(8);
                this.f180740o.a();
            }
        } else if (i18 == 1 || i18 == 2 || i18 == 3) {
            i();
            if (this.f180740o.getVisibility() != 8) {
                this.f180740o.setVisibility(8);
                this.f180740o.a();
            }
            if (this.f180739n.getVisibility() != 0) {
                this.f180739n.setVisibility(0);
                this.f180739n.post(new gt4.x1(this));
            }
        } else if (i18 == 5) {
            i();
            if (this.f180739n.getVisibility() != 8) {
                this.f180739n.setVisibility(8);
                this.f180739n.a();
            }
            a36.b bVar = this.f180741p.f1114q;
            if (bVar != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletSuccPageAwardWidget", "setWithNewShakeView, op_type: %s", java.lang.Integer.valueOf(bVar.f1101h));
                a36.b bVar2 = this.f180741p.f1114q;
                int i19 = bVar2.f1101h;
                if (i19 != 1) {
                    com.tencent.mm.sdk.platformtools.n3 n3Var = this.f180751z;
                    if (i19 == 2) {
                        a36.g gVar = bVar2.f1097d;
                        if (gVar != null) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.WalletSuccPageAwardWidget", "setWithNewShakeView, jump tiny app, userName: %s, path: %s, version: %s", gVar.f1142d, gVar.f1143e, java.lang.Integer.valueOf(gVar.f1144f));
                            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent();
                            java.lang.String str = gVar.f1142d;
                            am.nx nxVar = startAppBrandUIFromOuterEvent.f54857g;
                            nxVar.f7466a = str;
                            java.lang.String str2 = gVar.f1143e;
                            if (str2 == null) {
                                str2 = "";
                            }
                            nxVar.f7467b = str2;
                            nxVar.f7469d = ad1.d.CTRL_INDEX;
                            nxVar.f7470e = this.f180743r;
                            nxVar.f7468c = 0;
                            int i27 = gVar.f1144f;
                            if (i27 > 0) {
                                nxVar.f7474i = i27;
                            }
                            nxVar.f7471f = this.f180744s;
                            startAppBrandUIFromOuterEvent.e();
                            this.f180746u = true;
                            this.A = false;
                            n3Var.postDelayed(new gt4.a2(this), 3000L);
                        }
                    } else if (i19 == 3) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WalletSuccPageAwardWidget", "setWithNewShakeView, goto h5, url: %s", bVar2.f1098e);
                        com.tencent.mm.wallet_core.ui.r1.V(this.f180744s, this.f180741p.f1114q.f1098e, false);
                        this.f180746u = true;
                        this.A = false;
                        n3Var.postDelayed(new gt4.b2(this), 3000L);
                    } else if (i19 != 4) {
                        this.f180740o.setVisibility(8);
                        this.f180740o.a();
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WalletSuccPageAwardWidget", "setWithNewShakeView, directly show info");
                        this.f180739n.setVisibility(8);
                        this.f180739n.a();
                        this.f180740o.setVisibility(8);
                        this.f180740o.a();
                    }
                } else {
                    if (this.f180740o.getVisibility() != 0) {
                        this.f180740o.setVisibility(0);
                        this.f180740o.post(new gt4.y1(this));
                    }
                    this.f180740o.a();
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f180741p.f1114q.f1099f)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WalletSuccPageAwardWidget", "animation_wording: %s", this.f180741p.f1114q.f1099f);
                        this.f180740o.setShakeHintWording(this.f180741p.f1114q.f1099f);
                    }
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f180741p.f1114q.f1100g)) {
                        try {
                            com.tencent.mars.xlog.Log.i("MicroMsg.WalletSuccPageAwardWidget", "animation_wording_color: %s", this.f180741p.f1114q.f1100g);
                            this.f180740o.setShakeHintWordingColor(com.tencent.mm.plugin.wallet_core.utils.z1.b(this.f180741p.f1114q.f1100g, true));
                        } catch (java.lang.Exception e17) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletSuccPageAwardWidget", e17, "parse animation_wording_color %s error %s", this.f180741p.f1114q.f1100g, e17.getMessage());
                        }
                    }
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f180741p.f1114q.f1102i)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WalletSuccPageAwardWidget", "after_animation_wording: %s", this.f180741p.f1114q.f1102i);
                        this.f180740o.setAfterHintWording(this.f180741p.f1114q.f1102i);
                    }
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f180741p.f1114q.f1103m)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WalletSuccPageAwardWidget", "after_animation_wording_color: %s", this.f180741p.f1114q.f1103m);
                        try {
                            this.f180740o.setAfterHintWordingColor(com.tencent.mm.plugin.wallet_core.utils.z1.b(this.f180741p.f1114q.f1103m, true));
                        } catch (java.lang.Exception e18) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletSuccPageAwardWidget", e18, "parse after_animation_wording_color %s error %s", this.f180741p.f1114q.f1103m, e18.getMessage());
                        }
                    }
                    this.f180740o.setShakeOrClickCallback(new gt4.z1(this));
                    com.tencent.mm.plugin.wallet_core.ui.view.WalletAwardShakeAnimView walletAwardShakeAnimView = this.f180740o;
                    walletAwardShakeAnimView.getClass();
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletAwardShakeAnimView", "startShake");
                    q35.d dVar = new q35.d(walletAwardShakeAnimView.getContext());
                    walletAwardShakeAnimView.f180704f = dVar;
                    dVar.a(new gt4.u(walletAwardShakeAnimView));
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    walletAwardShakeAnimView.f180705g = android.os.SystemClock.elapsedRealtime();
                    walletAwardShakeAnimView.setOnClickListener(new gt4.v(walletAwardShakeAnimView));
                    java.lang.Runnable runnable = walletAwardShakeAnimView.f180714s;
                    com.tencent.mm.sdk.platformtools.u3.l(runnable);
                    com.tencent.mm.sdk.platformtools.u3.i(runnable, 3000L);
                }
            } else {
                this.f180740o.setVisibility(8);
                this.f180740o.a();
            }
        }
        if (this.f180748w || this.f180746u) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = 3;
            objArr[1] = java.lang.Integer.valueOf(this.f180746u ? 2 : 1);
            g0Var.d(15225, objArr);
        }
        this.f180748w = false;
    }

    public void n(com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI, a36.c cVar, java.lang.String str, boolean z17, android.widget.ImageView imageView) {
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = f(cVar);
        objArr[1] = java.lang.Boolean.valueOf(cVar == null || cVar.f1112o == null);
        objArr[2] = java.lang.Boolean.valueOf(imageView == null);
        objArr[3] = java.lang.Boolean.valueOf(this.f180746u);
        objArr[4] = java.lang.Boolean.valueOf(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletSuccPageAwardWidget", "setWidgetData, exposureInfo: %s, layerInfo==null: %s, hostUIBackgroundView==null:%s, isClickH5OrTinyApp: %s, isF2F: %s", objArr);
        this.f180744s = walletBaseUI;
        this.f180741p = cVar;
        this.f180745t = z17;
        this.f180743r = str;
        this.f180738m = imageView;
        m();
    }

    public final void o() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletSuccPageAwardWidget", "showNetFailedView");
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f180733e.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) this.f180734f.getLayoutParams();
        layoutParams.addRule(15, -1);
        layoutParams2.addRule(15, 0);
        this.f180733e.setLayoutParams(layoutParams);
        this.f180734f.setLayoutParams(layoutParams2);
        this.f180733e.setVisibility(0);
        this.f180734f.setVisibility(8);
        this.f180733e.setText(com.tencent.mm.R.string.kzx);
        this.f180733e.setTextColor(getResources().getColor(com.tencent.mm.R.color.a0c));
        this.f180734f.setTextColor(getResources().getColor(com.tencent.mm.R.color.f479232tk));
        this.f180737i.setVisibility(8);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.kks);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/view/WalletSuccPageAwardWidget", "showNetFailedView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/wallet_core/ui/view/WalletSuccPageAwardWidget", "showNetFailedView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.kkt);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/wallet_core/ui/view/WalletSuccPageAwardWidget", "showNetFailedView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/wallet_core/ui/view/WalletSuccPageAwardWidget", "showNetFailedView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f180735g.setVisibility(8);
        this.f180732d.setVisibility(0);
        this.f180732d.setImageResource(com.tencent.mm.R.drawable.chx);
        this.f180739n.setVisibility(8);
        this.f180739n.a();
        this.f180740o.setVisibility(8);
        this.f180740o.a();
    }

    public final void p() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletSuccPageAwardWidget", "updateViewAfterMiniAppReturn");
        a36.b bVar = this.f180741p.f1114q;
        if (bVar != null && bVar.f1101h != 1) {
            this.f180739n.setVisibility(8);
            this.f180739n.a();
            this.f180740o.setVisibility(8);
            this.f180740o.a();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletSuccPageAwardWidget", "tryDoModifyExposure, isClickH5OrTinyApp: %s", java.lang.Boolean.valueOf(this.f180746u));
        if (this.f180746u) {
            this.f180744s.doSceneProgress(new ss4.p(this.f180741p.f1109i, this.f180745t), false);
        }
    }

    public WalletSuccPageAwardWidget(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f180746u = false;
        this.f180747v = false;
        this.f180748w = true;
        this.f180749x = false;
        this.f180750y = null;
        this.f180751z = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.A = false;
        h(context);
    }
}
