package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class rg extends com.tencent.mm.ui.tools.fd implements com.tencent.mm.modelbase.u0 {

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f209735x = {2, 1, 10, 20};

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f209736y = {2, 1, 10};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f209737z = {2, 1, 10};

    /* renamed from: q, reason: collision with root package name */
    public final android.view.LayoutInflater f209738q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.ui.mg f209739r;

    /* renamed from: s, reason: collision with root package name */
    public android.util.SparseArray f209740s;

    /* renamed from: t, reason: collision with root package name */
    public final android.content.Context f209741t;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.ui.MainTabUI f209742u;

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.ui.gg f209743v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f209744w;

    public rg(androidx.appcompat.app.AppCompatActivity appCompatActivity, com.tencent.mm.ui.MainTabUI mainTabUI) {
        super(appCompatActivity);
        this.f209743v = null;
        this.f209741t = appCompatActivity;
        this.f209742u = mainTabUI;
        this.f209738q = android.view.LayoutInflater.from(appCompatActivity);
        this.f210430n = false;
        this.f210431o = com.tencent.mm.R.style.f494150fi;
        if (com.tencent.mm.ui.gg.f208692h == null) {
            com.tencent.mm.ui.gg.f208692h = new com.tencent.mm.ui.gg();
        }
        this.f209743v = com.tencent.mm.ui.gg.f208692h;
    }

    public static com.tencent.mm.ui.pg f(int i17) {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (i17 == 22) {
            ((java.lang.Integer) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue();
        } else if (i17 != 24) {
            if (i17 == 2147483646) {
                return new com.tencent.mm.ui.pg(2147483646, "TIT", "", com.tencent.mm.R.raw.ofm_card_icon, 0);
            }
            switch (i17) {
                case 1:
                    return com.tencent.mm.ui.HomeUI.f196738a0.booleanValue() ? new com.tencent.mm.ui.pg(1, context.getString(com.tencent.mm.R.string.gum), "", com.tencent.mm.R.raw.ofm_add_green_icon, com.tencent.mm.R.color.aaq) : new com.tencent.mm.ui.pg(1, context.getString(com.tencent.mm.R.string.gum), "", com.tencent.mm.R.raw.ofm_add_icon, 0);
                case 2:
                    return com.tencent.mm.ui.HomeUI.f196739b0.booleanValue() ? new com.tencent.mm.ui.pg(2, context.getString(com.tencent.mm.R.string.guq), "", com.tencent.mm.R.raw.ofm_group_chat_green_icon, com.tencent.mm.R.color.aaq) : new com.tencent.mm.ui.pg(2, context.getString(com.tencent.mm.R.string.guq), "", com.tencent.mm.R.raw.ofm_group_chat_icon, 0);
                case 3:
                    return new com.tencent.mm.ui.pg(3, context.getString(com.tencent.mm.R.string.gus), "", com.tencent.mm.R.raw.camera, 0);
                case 4:
                    return 1 == com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("VOIPCallType"), 0) ? new com.tencent.mm.ui.pg(4, context.getString(com.tencent.mm.R.string.guv), "", com.tencent.mm.R.raw.ofm_video_icon, 0) : new com.tencent.mm.ui.pg(4, context.getString(com.tencent.mm.R.string.gun), "", com.tencent.mm.R.raw.ofm_audio_icon, 0);
                case 5:
                    return new com.tencent.mm.ui.pg(5, context.getString(com.tencent.mm.R.string.itn), "", com.tencent.mm.R.raw.ofm_pic_icon, 0);
                case 6:
                    return new com.tencent.mm.ui.pg(6, context.getString(com.tencent.mm.R.string.iss), "", com.tencent.mm.R.raw.ofm_favourite_icon, 0);
                case 7:
                    return new com.tencent.mm.ui.pg(7, context.getString(com.tencent.mm.R.string.isu), "", com.tencent.mm.R.raw.ofm_card_icon, 0);
                case 8:
                    return new com.tencent.mm.ui.pg(8, context.getString(com.tencent.mm.R.string.byb), "", com.tencent.mm.R.raw.ofm_emostore_icon, 0);
                case 9:
                    return new com.tencent.mm.ui.pg(9, context.getString(com.tencent.mm.R.string.its), "", com.tencent.mm.R.raw.ofm_myqrcode_icon, 0);
                case 10:
                    return new com.tencent.mm.ui.pg(10, context.getString(com.tencent.mm.R.string.cfs), "", com.tencent.mm.R.raw.ofm_qrcode_icon, 0);
                case 11:
                    return new com.tencent.mm.ui.pg(11, context.getString(com.tencent.mm.R.string.j_b), "", com.tencent.mm.R.raw.ofm_moment_icon, 0);
                case 12:
                    return new com.tencent.mm.ui.pg(12, context.getString(com.tencent.mm.R.string.fow), "", com.tencent.mm.R.raw.ofm_gamecenter_icon, 0);
                case 13:
                    return new com.tencent.mm.ui.pg(13, context.getString(com.tencent.mm.R.string.j39), "", com.tencent.mm.R.raw.ofm_shake_icon, 0);
                case 14:
                    return new com.tencent.mm.ui.pg(14, context.getString(com.tencent.mm.R.string.h6j), "", com.tencent.mm.R.raw.ofm_nearby_icon, 0);
                default:
                    switch (i17) {
                        case 16:
                            return new com.tencent.mm.ui.pg(16, context.getString(com.tencent.mm.R.string.ior), "", com.tencent.mm.R.raw.ofm_webwechat_icon, 0);
                        case 17:
                            return new com.tencent.mm.ui.pg(17, context.getString(com.tencent.mm.R.string.gt9), "", com.tencent.mm.R.raw.ofm_groupmessage_icon, 0);
                        case 18:
                            return new com.tencent.mm.ui.pg(18, context.getString(com.tencent.mm.R.string.cfu), "", com.tencent.mm.R.raw.ofm_radar_icon, 0);
                        case 19:
                            return new com.tencent.mm.ui.pg(19, context.getString(com.tencent.mm.R.string.cfx), "", com.tencent.mm.R.raw.actionbar_facefriend_icon, 0);
                        case 20:
                            if (((java.lang.Integer) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue() <= 1) {
                                return new com.tencent.mm.ui.pg(20, context.getString(com.tencent.mm.R.string.f489932fv), "", com.tencent.mm.R.raw.receipt_payment_icon, 0, "plus_receiveorpay");
                            }
                        default:
                            return null;
                    }
            }
        } else if (((java.lang.Integer) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue() == 8) {
            return new com.tencent.mm.ui.pg(24, context.getString(com.tencent.mm.R.string.hkz), "", com.tencent.mm.R.raw.receipt_payment_icon, 0);
        }
        return null;
    }

    @Override // com.tencent.mm.ui.tools.fd
    public android.widget.BaseAdapter b() {
        if (this.f209739r == null) {
            this.f209739r = new com.tencent.mm.ui.mg(this, null);
        }
        return this.f209739r;
    }

    public final void e(boolean z17) {
        qg0.b0 b0Var = (qg0.b0) i95.n0.c(qg0.b0.class);
        gm0.j1.i();
        int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue();
        ((pg0.a3) b0Var).getClass();
        gm0.j1.n().f273288b.g(new ot4.b(intValue));
        this.f209744w = z17;
    }

    public final boolean g() {
        java.lang.String n07 = com.tencent.mm.sdk.platformtools.t8.n0(this.f209741t);
        if (com.tencent.mm.sdk.platformtools.t8.K0(n07) || !n07.equals("LauncherUI")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PlusSubMenuHelper", "LauncherUI is not on ActivityTask Top：%s", n07);
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PlusSubMenuHelper", "LauncherUI is on ActivityTask Top ");
        return true;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x00b2. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:36:0x075e  */
    @Override // android.widget.AdapterView.OnItemClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onItemClick(android.widget.AdapterView r18, android.view.View r19, int r20, long r21) {
        /*
            Method dump skipped, instructions count: 2006
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.rg.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.String str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.PlusSubMenuHelper", "on Scene End：errType %s , errCode：%s，errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (m1Var.getType() == 2540) {
            android.content.Context context = this.f209741t;
            if (i17 == 0 && i18 == 0) {
                r45.o65 o65Var = (r45.o65) ((com.tencent.mm.modelbase.o) m1Var.getReqResp()).f70711b.f70700a;
                if (o65Var.f381986d == 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.PlusSubMenuHelper", "NetScenePayIBGQuickGetOverseaWallet on SceneEnd ok，pay_wallet_wxapp_h5_url：%s, cache_time：%s", o65Var.f381988f, java.lang.Integer.valueOf(o65Var.f381989g));
                    if (!this.f209744w && g() && !com.tencent.mm.sdk.platformtools.t8.K0(o65Var.f381988f)) {
                        if (o65Var.f381988f.equals("wxpay://bizmall/hk_offlinepay")) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.PlusSubMenuHelper", "goto native hk offlinepay");
                            ((h45.q) i95.n0.c(h45.q.class)).startHKOfflinePrePay(context, 2);
                        } else {
                            com.tencent.mars.xlog.Log.i("MicroMsg.PlusSubMenuHelper", "on Scene End jump h5 ");
                            qg0.h0.fe(context, o65Var.f381988f, false);
                        }
                    }
                    long currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
                    o65Var.f381990h = currentTimeMillis;
                    com.tencent.mars.xlog.Log.i("MicroMsg.PlusSubMenuHelper", "on Scene End currentTime ：%s ", java.lang.Long.valueOf(currentTimeMillis));
                    com.tencent.mars.xlog.Log.i("MicroMsg.PlusSubMenuHelper", "OfflineH5 setConfig");
                    try {
                        str2 = new java.lang.String(o65Var.toByteArray(), com.tencent.kinda.framework.app.KindaConfigCacheStg.SAVE_CHARSET);
                    } catch (java.io.IOException e17) {
                        e = e17;
                        str2 = " ";
                    }
                    try {
                        com.tencent.mars.xlog.Log.i("MicroMsg.PlusSubMenuHelper", "OfflineH5 setConfig success");
                    } catch (java.io.IOException e18) {
                        e = e18;
                        com.tencent.mars.xlog.Log.e("MicroMsg.PlusSubMenuHelper", "save config exp, " + e.getLocalizedMessage());
                        qg0.b0 b0Var = (qg0.b0) i95.n0.c(qg0.b0.class);
                        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_WX_PAY_HK_WALLET_ADD_CONFIG_STRING_SYNC;
                        ((pg0.a3) b0Var).getClass();
                        ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().j(u3Var, str2);
                        ((pg0.a3) ((qg0.b0) i95.n0.c(qg0.b0.class))).getClass();
                        ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().g(true);
                        gm0.j1.d().q(2540, this);
                    }
                    qg0.b0 b0Var2 = (qg0.b0) i95.n0.c(qg0.b0.class);
                    com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.USERINFO_WX_PAY_HK_WALLET_ADD_CONFIG_STRING_SYNC;
                    ((pg0.a3) b0Var2).getClass();
                    ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().j(u3Var2, str2);
                    ((pg0.a3) ((qg0.b0) i95.n0.c(qg0.b0.class))).getClass();
                    ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().g(true);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.PlusSubMenuHelper", "NetScenePayIBGQuickGetOverseaWallet on SceneEnd failed show dialog ");
                    if (!this.f209744w && g()) {
                        db5.e1.E(context, o65Var.f381987e, "", context.getString(com.tencent.mm.R.string.l_e), false, new com.tencent.mm.ui.kg(this));
                    }
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.PlusSubMenuHelper", "NetScenePayIBGQuickGetOverseaWallet on SceneEnd faile show error dialog ");
                if (!this.f209744w && g()) {
                    db5.e1.E(context, str, "", context.getString(com.tencent.mm.R.string.l_e), false, new com.tencent.mm.ui.lg(this));
                }
            }
            gm0.j1.d().q(2540, this);
        }
    }
}
