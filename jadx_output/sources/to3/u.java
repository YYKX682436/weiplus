package to3;

/* loaded from: classes9.dex */
public class u extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ to3.v f420983c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(to3.v vVar, com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var) {
        super(mMActivity, b0Var);
        this.f420983c = vVar;
    }

    @Override // np5.g
    public java.lang.CharSequence a(int i17) {
        com.tencent.mm.ui.MMActivity mMActivity = this.f338833a;
        return i17 != 0 ? i17 != 1 ? "" : mMActivity.getString(com.tencent.mm.R.string.f493519kk4) : mMActivity.getString(com.tencent.mm.R.string.f493520kk5);
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        java.lang.String str = (java.lang.String) objArr[0];
        to3.v vVar = this.f420983c;
        vVar.f213801c.putString("key_pwd1", str);
        com.tencent.mm.plugin.wallet_core.model.Bankcard d17 = yo3.m.d(true);
        if (d17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OfflineProcess", "no support bank car for offline");
            ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().getClass();
            d17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().k(null, null, true, true);
            if (d17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WalletUserInfoManger", "defaultBankcards == null");
            }
        }
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = d17;
        if (bankcard == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OfflineProcess", "no any bank car for offline");
            return false;
        }
        java.lang.String string = vVar.f213801c.getString("oper");
        boolean k17 = yo3.m.k();
        np5.b0 b0Var = this.f338834b;
        if (!k17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OfflineProcess", "Offline is not Create ");
            b0Var.d(new wo3.k(bankcard, (java.lang.String) objArr[0], vVar.f213801c.getInt("offline_chg_fee", 0)), true);
        } else if (string != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OfflineProcess", "oper == ".concat(string));
            if (string.equals("create")) {
                b0Var.d(new wo3.k(bankcard, (java.lang.String) objArr[0], vVar.f213801c.getInt("offline_chg_fee", 0)), true);
            } else if (string.equals("clr")) {
                b0Var.d(new wo3.i(bankcard, str, "clr", 0, ""), true);
            } else if (string.equals("changeto")) {
                b0Var.d(new wo3.i(bankcard, str, "changeto", vVar.f213801c.getInt("offline_chg_fee"), ""), true);
            } else {
                if (!string.equals("freeze")) {
                    return false;
                }
                b0Var.d(new wo3.o(str), true);
            }
        }
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.ui.MMActivity mMActivity = this.f338833a;
        if (i17 != 0 || i18 != 0) {
            if (m1Var instanceof wo3.k) {
                com.tencent.mars.xlog.Log.i("MicroMsg.OfflineProcess", "Offline Create is failed!");
                wo3.k kVar = (wo3.k) m1Var;
                if (i18 == 410) {
                    db5.e1.A(mMActivity, str, "", mMActivity.getString(com.tencent.mm.R.string.f493589kv1), mMActivity.getString(com.tencent.mm.R.string.f490347sg), new to3.s(this, mMActivity, kVar.f448181s), new to3.t(this, mMActivity));
                    return true;
                }
            }
            return false;
        }
        boolean z17 = m1Var instanceof wo3.k;
        np5.b0 b0Var = this.f338834b;
        to3.v vVar = this.f420983c;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OfflineProcess", "Offline is Create ");
            b0Var.d(new wo3.p(vVar.f213801c.getInt("offline_from_scene", -1), null, 8, 0, ""), true);
            vVar.f213801c.putBoolean("is_offline_create", true);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(22805, 3);
        } else if ((m1Var instanceof wo3.m) || (m1Var instanceof wo3.p)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OfflineProcess", "OfflineQueryUser is ok ");
            ((com.tencent.mm.wallet_core.ui.WalletBaseUI) mMActivity).showLoading(false);
            com.tencent.mm.autogen.events.WalletGetUserInfoEvent walletGetUserInfoEvent = new com.tencent.mm.autogen.events.WalletGetUserInfoEvent();
            walletGetUserInfoEvent.f54958g.f7215a = 8;
            walletGetUserInfoEvent.f54959h.f7292a = new to3.r(this);
            walletGetUserInfoEvent.e();
        } else if (m1Var instanceof wo3.i) {
            wo3.i iVar = (wo3.i) m1Var;
            if ("1".equals(iVar.f448166d)) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putParcelable("key_authen", new com.tencent.mm.plugin.wallet_core.model.Authen());
                bundle.putString("key_pwd1", vVar.f213801c.getString("key_pwd1"));
                bundle.putString("key_mobile", iVar.f448167e);
                bundle.putInt("verify_scene", 1);
                bundle.putInt("offline_add_fee", vVar.f213801c.getInt("offline_chg_fee", 0));
                com.tencent.mm.wallet_core.a.j(mMActivity, to3.f0.class, bundle, null);
                vVar.o(mMActivity, 0, vVar.f213801c);
            } else {
                vVar.f213801c.putBoolean("back_to_coin_purse_ui", true);
                b0Var.d(new wo3.m("" + java.lang.System.currentTimeMillis(), vVar.f213801c.getInt("offline_from_scene", -1)), false);
            }
        } else if (m1Var instanceof wo3.o) {
            to3.c0.Ai().Vi(196631, "");
            to3.c0.Ai().Ri().f448145b = null;
            vVar.o(mMActivity, 0, vVar.f213801c);
        }
        return true;
    }
}
