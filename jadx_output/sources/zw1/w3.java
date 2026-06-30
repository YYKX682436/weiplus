package zw1;

/* loaded from: classes15.dex */
public class w3 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zw1.x3 f476837d;

    public w3(zw1.x3 x3Var) {
        this.f476837d = x3Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        zw1.x3 x3Var = this.f476837d;
        if (itemId != 1) {
            int itemId2 = (menuItem.getItemId() - 1) - 1;
            if (itemId2 < 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WalletCollectQrCodeUI", "illegal pos: %s", java.lang.Integer.valueOf(itemId2));
                return;
            }
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.d(25983, 10, java.lang.Integer.valueOf(x3Var.f476844a));
            r45.uk4 uk4Var = (r45.uk4) x3Var.f476845b.get(itemId2);
            int i18 = uk4Var.f387431d;
            if (i18 == 1) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WalletCollectQrCodeUI", "wrong native type: %s", uk4Var.f387433f);
                g0Var.d(14526, 2, 1, uk4Var.f387432e, "", "", "", 2);
                return;
            }
            if (i18 == 2) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(uk4Var.f387433f)) {
                    return;
                }
                com.tencent.mm.wallet_core.ui.r1.V(x3Var.f476846c.getContext(), uk4Var.f387433f, false);
                g0Var.d(14526, 2, 2, uk4Var.f387432e, "", "", uk4Var.f387433f, 2);
                return;
            }
            if (i18 == 3) {
                com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent();
                java.lang.String str = uk4Var.f387434g;
                am.nx nxVar = startAppBrandUIFromOuterEvent.f54857g;
                nxVar.f7466a = str;
                java.lang.String str2 = uk4Var.f387435h;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (str2 == null) {
                    str2 = "";
                }
                nxVar.f7467b = str2;
                nxVar.f7469d = 1072;
                nxVar.f7468c = 0;
                startAppBrandUIFromOuterEvent.e();
                g0Var.d(14526, 2, 3, uk4Var.f387432e, uk4Var.f387434g, uk4Var.f387435h, "", 2);
                return;
            }
            return;
        }
        if (com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI.W6(x3Var.f476846c, x3Var.f476844a)) {
            com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI = x3Var.f476846c;
            int i19 = x3Var.f476844a;
            if (i19 == 0) {
                i19 = walletCollectQrCodeUI.f96435d;
            }
            if (i19 != 1) {
                walletCollectQrCodeUI.getClass();
                if (i19 != 2) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "unknown type");
                } else {
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_F2F_RING_TONE_MCH_STRING, "in.caf");
                    ww1.a3 a3Var = walletCollectQrCodeUI.f96437f;
                    pq5.g l17 = new ww1.q(3, a3Var.T ? a3Var.U : 0L).l();
                    l17.f(walletCollectQrCodeUI);
                    l17.h(new zw1.a4(walletCollectQrCodeUI));
                }
            } else {
                walletCollectQrCodeUI.f96454z &= -32769;
                gm0.j1.i();
                gm0.j1.u().c().w(147457, java.lang.Long.valueOf(walletCollectQrCodeUI.f96454z));
                r45.no4 no4Var = new r45.no4();
                no4Var.f381559d = 2;
                ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(209, no4Var));
                tw1.f.Di().wi();
            }
            dp.a.makeText(x3Var.f476846c.getContext(), com.tencent.mm.R.string.b_2, 1).show();
            com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var2.d(13944, 8);
            g0Var2.d(25983, 9, java.lang.Integer.valueOf(x3Var.f476844a));
            return;
        }
        com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI2 = x3Var.f476846c;
        int i27 = x3Var.f476844a;
        if (i27 == 0) {
            i27 = walletCollectQrCodeUI2.f96435d;
        }
        if (i27 != 1) {
            walletCollectQrCodeUI2.getClass();
            if (i27 != 2) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "unknown type");
            } else {
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_F2F_RING_TONE_MCH_STRING, "cash.caf");
                ww1.a3 a3Var2 = walletCollectQrCodeUI2.f96437f;
                pq5.g l18 = new ww1.q(2, a3Var2.T ? a3Var2.U : 0L).l();
                l18.f(walletCollectQrCodeUI2);
                l18.h(new zw1.z3(walletCollectQrCodeUI2));
            }
        } else {
            walletCollectQrCodeUI2.f96454z |= 32768;
            gm0.j1.i();
            gm0.j1.u().c().w(147457, java.lang.Long.valueOf(walletCollectQrCodeUI2.f96454z));
            r45.no4 no4Var2 = new r45.no4();
            no4Var2.f381559d = 1;
            ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(209, no4Var2));
            tw1.f.Di().Ai();
        }
        dp.a.makeText(x3Var.f476846c.getContext(), com.tencent.mm.R.string.b_d, 1).show();
        com.tencent.mm.plugin.collect.model.voice.m.d().k(false);
        com.tencent.mm.plugin.report.service.g0 g0Var3 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var3.d(13944, 7);
        g0Var3.d(25983, 8, java.lang.Integer.valueOf(x3Var.f476844a));
    }
}
