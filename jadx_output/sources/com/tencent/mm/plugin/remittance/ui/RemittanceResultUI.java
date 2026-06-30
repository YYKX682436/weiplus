package com.tencent.mm.plugin.remittance.ui;

@db5.a(3)
/* loaded from: classes9.dex */
public class RemittanceResultUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.Orders f157594d;

    public boolean U6() {
        return !(this instanceof com.tencent.mm.plugin.remittance.ui.RemittanceResultNewUI);
    }

    public final void V6(java.lang.Class cls) {
        if (getProcess() == null) {
            startActivity((java.lang.Class<?>) cls, getIntent());
        } else {
            getProcess().B(this, cls, getInput());
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (U6()) {
            setContentViewVisibility(4);
            getWindow().setBackgroundDrawableResource(com.tencent.mm.R.color.a9e);
            this.f157594d = (com.tencent.mm.plugin.wallet_core.model.Orders) getInput().getParcelable("key_orders");
            com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = (com.tencent.mm.pluginsdk.wallet.PayInfo) getInput().getParcelable("key_pay_info");
            int i17 = payInfo != null ? payInfo.f192109e : 0;
            boolean z17 = (i17 == 31 || i17 == 5) ? false : true;
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = java.lang.Boolean.valueOf(this.f157594d == null);
            objArr[1] = java.lang.Integer.valueOf(i17);
            objArr[2] = java.lang.Boolean.valueOf(z17);
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceResultUI", "orders==null:%s, paysScene: %s, needFetchF2fData: %s", objArr);
            com.tencent.mm.plugin.wallet_core.model.Orders orders = this.f157594d;
            if (orders != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceResultUI", "is_use_new_paid_succ_page: %s", java.lang.Integer.valueOf(orders.V));
                com.tencent.mm.plugin.wallet_core.model.Orders orders2 = this.f157594d;
                if (orders2.V != 1) {
                    V6(com.tencent.mm.plugin.remittance.ui.RemittanceResultOldUI.class);
                } else if (!z17) {
                    V6(com.tencent.mm.plugin.remittance.ui.RemittanceResultNewUI.class);
                    finish();
                } else if (payInfo == null || payInfo.f192122u == null) {
                    V6(com.tencent.mm.plugin.remittance.ui.RemittanceResultNewUI.class);
                    finish();
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceResultUI", "fetch f2f data");
                    java.lang.String string = payInfo.f192122u.getString("extinfo_key_11");
                    java.lang.String str = (orders2 == null || ((java.util.ArrayList) orders2.M).size() <= 0) ? "" : ((com.tencent.mm.plugin.wallet_core.model.Orders.Commodity) ((java.util.ArrayList) orders2.M).get(0)).f179714r;
                    int i18 = payInfo.f192122u.getInt("extinfo_key_15", 0);
                    java.lang.String string2 = payInfo.f192122u.getString("extinfo_key_7");
                    java.lang.String string3 = payInfo.f192122u.getString("extinfo_key_3");
                    int i19 = payInfo.f192122u.getInt("extinfo_key_12", 0);
                    java.lang.String string4 = payInfo.f192122u.getString("extinfo_key_13");
                    java.lang.String string5 = payInfo.f192122u.getString("extinfo_key_14");
                    java.lang.String string6 = payInfo.f192122u.getString("extinfo_key_16");
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(string6)) {
                        str = string6;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceResultUI", "fetchF2fData, f2fid: %s, transid: %s, amount: %s, payerDesc: %s, recvDesc: %s, scanScene: %s, paySuccSign: %s, paySuccExtend: %s, channel: %s, payscene: %s", string, str, java.lang.Integer.valueOf(i18), string2, string3, java.lang.Integer.valueOf(i19), string4, string5, java.lang.Integer.valueOf(payInfo.f192111g), java.lang.Integer.valueOf(payInfo.f192109e));
                    addSceneEndListener(2773);
                    doSceneProgress(new com.tencent.mm.plugin.remittance.model.x(string, str, i18, string2, string3, payInfo.f192111g, i19, string4, string5, payInfo.f192109e));
                }
            } else {
                V6(com.tencent.mm.plugin.remittance.ui.RemittanceResultNewUI.class);
                finish();
            }
            com.tencent.mm.pluginsdk.wallet.PayInfo payInfo2 = (com.tencent.mm.pluginsdk.wallet.PayInfo) getInput().getParcelable("key_pay_info");
            int i27 = payInfo2 != null ? payInfo2.f192109e : 0;
            if (i27 == 33 || i27 == 32 || i27 == 48 || i27 == 31) {
                com.tencent.mm.autogen.events.F2fPayCheckEvent f2fPayCheckEvent = new com.tencent.mm.autogen.events.F2fPayCheckEvent();
                java.lang.String str2 = payInfo2.f192114m;
                am.g9 g9Var = f2fPayCheckEvent.f54224g;
                g9Var.f6743a = str2;
                com.tencent.mm.plugin.wallet_core.model.Orders orders3 = this.f157594d;
                if (orders3 != null && !((java.util.ArrayList) orders3.M).isEmpty()) {
                    g9Var.f6744b = ((com.tencent.mm.plugin.wallet_core.model.Orders.Commodity) ((java.util.ArrayList) this.f157594d.M).get(0)).f179714r;
                }
                f2fPayCheckEvent.e();
            }
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(2773);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (!(m1Var instanceof com.tencent.mm.plugin.remittance.model.x)) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceResultUI", "on f2f succpage scene end, errType: %s, errCode: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.tencent.mm.plugin.remittance.model.x xVar = (com.tencent.mm.plugin.remittance.model.x) m1Var;
        if (i17 == 0 && i18 == 0) {
            r45.zv zvVar = xVar.f157057d;
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceResultUI", "on f2f succpage scene end, retcode: %s, retmsg: %s, exposesureInfo: %s", java.lang.Integer.valueOf(zvVar.f392381d), zvVar.f392382e, zvVar.f392384g);
            if (zvVar.f392381d == 0) {
                try {
                    getInput().putByteArray("key_succpage_resp", zvVar.toByteArray());
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.RemittanceResultUI", e17, "pass succ page resp error: %s", e17.getMessage());
                }
                V6(com.tencent.mm.plugin.remittance.ui.RemittanceResultNewUI.class);
            } else {
                dp.a.makeText(this, zvVar.f392382e, 1).show();
                V6(com.tencent.mm.plugin.remittance.ui.RemittanceResultNewUI.class);
            }
        } else {
            V6(com.tencent.mm.plugin.remittance.ui.RemittanceResultNewUI.class);
        }
        finish();
        return true;
    }
}
