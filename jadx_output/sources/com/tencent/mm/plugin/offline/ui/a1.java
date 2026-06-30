package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class a1 {

    /* renamed from: a, reason: collision with root package name */
    public android.app.Activity f152577a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.offline.ui.e f152578b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.ui.n8 f152579c;

    /* renamed from: d, reason: collision with root package name */
    public android.os.Vibrator f152580d;

    public a1(android.app.Activity activity, com.tencent.mm.plugin.offline.ui.e eVar) {
        this.f152577a = activity;
        this.f152578b = eVar;
    }

    public final java.lang.String a(int i17) {
        return this.f152577a.getString(i17);
    }

    public void b(com.tencent.mm.modelbase.m1 m1Var, int i17, java.lang.String str, wo3.x xVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineLogicMgr", "handleErrorEvent errCode :" + i17 + " msg:" + str);
        com.tencent.mm.plugin.wallet_core.ui.n8 n8Var = this.f152579c;
        if (n8Var != null) {
            n8Var.dismiss();
            this.f152579c = null;
        }
        if (i17 == 409) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OfflineLogicMgr", "goLimitChangeUI msg:" + str);
            db5.e1.A(this.f152577a, str, "", a(com.tencent.mm.R.string.l1w), a(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.offline.ui.z0(this), new com.tencent.mm.plugin.offline.ui.i0(this));
            return;
        }
        if (i17 == 410) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OfflineLogicMgr", "showBindNewBankcardDialog msg:" + str);
            db5.e1.A(this.f152577a, str, "", a(com.tencent.mm.R.string.f493589kv1), a(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.offline.ui.x0(this), new com.tencent.mm.plugin.offline.ui.y0(this));
            return;
        }
        if (i17 == 413) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OfflineLogicMgr", "goChangeBankcard msg:" + str);
            db5.e1.A(this.f152577a, str, "", a(com.tencent.mm.R.string.l1e), a(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.offline.ui.j0(this), new com.tencent.mm.plugin.offline.ui.k0(this));
            return;
        }
        if (i17 != 411) {
            android.app.Activity activity = this.f152577a;
            if (!(activity instanceof com.tencent.mm.wallet_core.ui.WalletBaseUI)) {
                com.tencent.mm.plugin.offline.ui.h0.a(activity, str, xVar);
                return;
            } else {
                if (np5.t.a((com.tencent.mm.wallet_core.ui.WalletBaseUI) activity, m1Var, 1000, i17, str)) {
                    return;
                }
                com.tencent.mm.plugin.offline.ui.h0.a(this.f152577a, str, xVar);
                return;
            }
        }
        if (((pg0.a3) i95.n0.c(pg0.a3.class)).fj().y() || ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().x()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OfflineLogicMgr", "is unreg or simplereg");
            return;
        }
        if (to3.c0.f420951i) {
            android.app.Activity activity2 = this.f152577a;
            if (activity2 instanceof com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI) {
                com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = (com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI) activity2;
                walletOfflineCoinPurseUI.E.setVisibility(4);
                walletOfflineCoinPurseUI.R1.f(walletOfflineCoinPurseUI.f152540w, new com.tencent.mm.plugin.offline.ui.p2(walletOfflineCoinPurseUI), 6);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(135L, 1L, 1L, true);
            }
        }
        android.app.Activity activity3 = this.f152577a;
        db5.e1.K(activity3, false, str, "", activity3.getString(com.tencent.mm.R.string.l1z), activity3.getString(com.tencent.mm.R.string.f490347sg), new yo3.g(activity3), new yo3.h(activity3));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(135L, 1L, 1L, true);
    }

    public boolean c(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper realnameGuideHelper;
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineLogicMgr", "errType:" + i17 + "  errCode" + i18 + " errMsg:" + str + " cgi type:" + m1Var.getType());
        if (i17 == 0 && i18 == 0) {
            boolean z17 = m1Var instanceof wo3.f;
            if (!z17) {
                return false;
            }
            wo3.f fVar = (wo3.f) m1Var;
            java.lang.String str2 = fVar.f448153f;
            com.tencent.mm.plugin.wallet_core.ui.n8 n8Var = this.f152579c;
            if (n8Var != null) {
                n8Var.dismiss();
                this.f152579c = null;
            }
            if (fVar.f448155h == 0 && !android.text.TextUtils.isEmpty(str2)) {
                android.app.Activity activity = this.f152577a;
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineUtil", "hy: only transid coming. do old way");
                if (android.text.TextUtils.isEmpty(str2)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WalletOfflineUtil", "transid == null");
                } else if (yo3.m.m()) {
                    android.os.Bundle bundle = new android.os.Bundle();
                    if (z17 && (realnameGuideHelper = fVar.f448158n) != null) {
                        bundle.putParcelable("key_realname_guide_helper", realnameGuideHelper);
                    }
                    bundle.putString("key_trans_id", str2);
                    bundle.putInt("key_pay_type", 2);
                    if (activity instanceof com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI) {
                        android.content.Intent intent = activity.getIntent();
                        bundle.putString("key_appid", intent.getStringExtra("key_appid"));
                        bundle.putInt("key_from_scene", intent.getIntExtra("key_from_scene", 0));
                    }
                    com.tencent.mm.wallet_core.a.j(activity, to3.b0.class, bundle, null);
                }
                this.f152577a.setResult(-1);
                this.f152577a.finish();
            } else if (fVar.f448155h != 0 && fVar.f448154g != 0 && fVar.f448157m == 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.OfflineLogicMgr", "input pwd, but respon exist error!");
                b(fVar, fVar.f448155h, fVar.f448156i, null);
            }
        } else {
            if (!(m1Var instanceof wo3.f)) {
                return false;
            }
            wo3.f fVar2 = (wo3.f) m1Var;
            com.tencent.mm.plugin.wallet_core.ui.n8 n8Var2 = this.f152579c;
            if (n8Var2 != null) {
                n8Var2.dismiss();
                this.f152579c = null;
            }
            if (fVar2.f448157m == 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.OfflineLogicMgr", "input pwd, but respon exist error!");
                b(m1Var, i18, str, null);
            }
        }
        return true;
    }

    public void d(wo3.t tVar) {
        if (tVar == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineLogicMgr", "showFreeMsg");
        if ("1".equals(tVar.f448213d)) {
            db5.e1.K(this.f152577a, false, tVar.f448214e, "", a(com.tencent.mm.R.string.l1q), a(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.offline.ui.l0(this), new com.tencent.mm.plugin.offline.ui.m0(this));
        }
    }
}
