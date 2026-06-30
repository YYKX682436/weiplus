package nt4;

/* loaded from: classes11.dex */
public class e implements com.tencent.mm.modelbase.u0, qg0.y {

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f339819d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f339820e = false;

    /* renamed from: f, reason: collision with root package name */
    public android.app.Dialog f339821f = null;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.modelbase.m1 f339822g;

    public final void a(boolean z17) {
        if (!z17 && this.f339821f == null) {
            android.content.Context context = this.f339819d;
            this.f339821f = db5.e1.O(context, null, 3, com.tencent.mm.R.style.f494256i6, context.getString(com.tencent.mm.R.string.ggc), true, true, new nt4.b(this));
        }
        gm0.j1.i();
        this.f339822g = new ot4.b(((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue());
        gm0.j1.d().g(this.f339822g);
        this.f339820e = z17;
    }

    public void b(android.content.Context context) {
        this.f339819d = context;
        this.f339821f = null;
        this.f339820e = false;
        this.f339822g = null;
        gm0.j1.d().a(2540, this);
        r45.o65 o65Var = new r45.o65();
        java.lang.String str = (java.lang.String) ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().i(com.tencent.mm.storage.u3.USERINFO_WX_PAY_HK_WALLET_ADD_CONFIG_STRING_SYNC, null);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.HKOfflineLogic", "OfflineH5 get PayIBGQuickGetOverseaWalletConfig failed");
        } else {
            try {
                o65Var.parseFrom(str.getBytes(java.nio.charset.StandardCharsets.ISO_8859_1));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.HKOfflineLogic", "OfflineH5 parse PayIBGQuickGetOverseaWalletConfig fail, " + e17.getLocalizedMessage());
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(o65Var.f381988f)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.HKOfflineLogic", "hk OfflineH5 has no cache");
            a(false);
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
        long j17 = currentTimeMillis - o65Var.f381990h;
        com.tencent.mars.xlog.Log.i("MicroMsg.HKOfflineLogic", "hk currentTime ：%s ,lastTime：%s,internalTime ：%s", java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(o65Var.f381990h), java.lang.Long.valueOf(j17));
        if (j17 <= 0 || j17 >= o65Var.f381989g) {
            com.tencent.mars.xlog.Log.i("MicroMsg.HKOfflineLogic", "hk OfflineH5 is expired");
            a(false);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.HKOfflineLogic", "hk OfflineH5 dont expired，url：%s", o65Var.f381988f);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(o65Var.f381988f)) {
            if (o65Var.f381988f.equals("wxpay://bizmall/hk_offlinepay")) {
                com.tencent.mars.xlog.Log.i("MicroMsg.HKOfflineLogic", "goto native hk offlinepay");
                ((h45.q) i95.n0.c(h45.q.class)).startHKOfflinePrePay(this.f339819d, 2);
            } else {
                com.tencent.mm.wallet_core.ui.r1.X(this.f339819d, o65Var.f381988f, false);
            }
        }
        a(true);
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.String str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.HKOfflineLogic", "on Scene End：errType %s , errCode：%s，errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        android.app.Dialog dialog = this.f339821f;
        if (dialog != null && dialog.isShowing()) {
            this.f339821f.dismiss();
            this.f339821f = null;
        }
        if ((m1Var instanceof ot4.b) && m1Var.equals(this.f339822g)) {
            if (i17 == 0 && i18 == 0) {
                r45.o65 o65Var = ((ot4.b) m1Var).f348870f;
                if (o65Var == null) {
                    o65Var = new r45.o65();
                }
                if (o65Var.f381986d == 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.HKOfflineLogic", "NetScenePayIBGQuickGetOverseaWallet on SceneEnd ok，pay_wallet_wxapp_h5_url：%s, cache_time：%s", o65Var.f381988f, java.lang.Integer.valueOf(o65Var.f381989g));
                    if (!this.f339820e && !com.tencent.mm.sdk.platformtools.t8.K0(o65Var.f381988f)) {
                        if (o65Var.f381988f.equals("wxpay://bizmall/hk_offlinepay")) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.HKOfflineLogic", "goto native hk offlinepay");
                            ((h45.q) i95.n0.c(h45.q.class)).startHKOfflinePrePay(this.f339819d, 2);
                        } else {
                            com.tencent.mars.xlog.Log.i("MicroMsg.HKOfflineLogic", "on Scene End jump h5 ");
                            com.tencent.mm.wallet_core.ui.r1.X(this.f339819d, o65Var.f381988f, false);
                        }
                    }
                    o65Var.f381990h = java.lang.System.currentTimeMillis() / 1000;
                    try {
                        str2 = new java.lang.String(o65Var.toByteArray(), java.nio.charset.StandardCharsets.ISO_8859_1);
                    } catch (java.io.IOException e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.HKOfflineLogic", "save config exp, " + e17.getLocalizedMessage());
                        str2 = " ";
                    }
                    ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().j(com.tencent.mm.storage.u3.USERINFO_WX_PAY_HK_WALLET_ADD_CONFIG_STRING_SYNC, str2);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.HKOfflineLogic", "NetScenePayIBGQuickGetOverseaWallet on SceneEnd failed show dialog ");
                    if (!this.f339820e) {
                        java.lang.String n07 = com.tencent.mm.sdk.platformtools.t8.n0(this.f339819d);
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(n07) && n07.equals("LauncherUI")) {
                            android.content.Context context = this.f339819d;
                            db5.e1.E(context, o65Var.f381987e, "", context.getString(com.tencent.mm.R.string.l_e), false, new nt4.c(this));
                        }
                    }
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.HKOfflineLogic", "NetScenePayIBGQuickGetOverseaWallet on SceneEnd faile show error dialog ");
                if (!this.f339820e) {
                    java.lang.String n08 = com.tencent.mm.sdk.platformtools.t8.n0(this.f339819d);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(n08) && n08.equals("LauncherUI")) {
                        android.content.Context context2 = this.f339819d;
                        db5.e1.E(context2, str, "", context2.getString(com.tencent.mm.R.string.l_e), false, new nt4.d(this));
                    }
                }
            }
        }
        gm0.j1.d().q(2540, this);
        this.f339822g = null;
    }
}
