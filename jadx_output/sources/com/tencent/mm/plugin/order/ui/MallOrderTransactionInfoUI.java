package com.tencent.mm.plugin.order.ui;

/* loaded from: classes9.dex */
public class MallOrderTransactionInfoUI extends com.tencent.mm.wallet_core.ui.WalletPreferenceUI {

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f152863g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.order.model.MallTransactionObject f152864h = null;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.w f152865i;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.wallet_core.ui.WalletPreferenceUI
    public boolean W6(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.order.model.a aVar;
        gp3.n nVar;
        java.util.List a17;
        if (i17 != 0 || i18 != 0) {
            return false;
        }
        if (!(m1Var instanceof dp3.n) || (aVar = ((dp3.n) m1Var).f242223d) == null) {
            return true;
        }
        this.f152864h = aVar.f152819a;
        ((com.tencent.mm.ui.base.preference.h0) this.f152863g).t();
        androidx.appcompat.app.AppCompatActivity context = getContext();
        com.tencent.mm.ui.base.preference.r rVar = this.f152863g;
        com.tencent.mm.plugin.order.model.MallTransactionObject mallTransactionObject = this.f152864h;
        java.lang.Object[] objArr = {this.f152865i};
        if (mallTransactionObject == null) {
            a17 = null;
        } else {
            if (mallTransactionObject.f152782e != 21) {
                gp3.k kVar = new gp3.k();
                java.lang.Object obj = objArr[0];
                nVar = kVar;
                if (obj instanceof com.tencent.mm.wallet_core.ui.w) {
                    kVar.f274380a = (com.tencent.mm.wallet_core.ui.w) obj;
                    nVar = kVar;
                }
            } else {
                nVar = new gp3.n();
            }
            a17 = nVar.a(context, rVar, mallTransactionObject);
        }
        if (a17 != null) {
            for (int i19 = 0; i19 < a17.size(); i19++) {
                ((com.tencent.mm.ui.base.preference.h0) this.f152863g).d((com.tencent.mm.ui.base.preference.Preference) a17.get(i19), -1);
            }
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f152863g).notifyDataSetChanged();
        return true;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bwt;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494902b3;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.grg);
        setBackBtn(new fp3.y(this));
        this.f152863g = getPreferenceScreen();
        com.tencent.mm.wallet_core.ui.w wVar = new com.tencent.mm.wallet_core.ui.w(this, false);
        this.f152865i = wVar;
        wVar.a();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletPreferenceUI, com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String stringExtra;
        java.lang.String stringExtra2;
        super.onCreate(bundle);
        com.tencent.mm.wallet_core.h g17 = com.tencent.mm.wallet_core.a.g(this);
        if (g17 != null && (g17 instanceof bp3.e)) {
            android.os.Bundle e17 = com.tencent.mm.wallet_core.a.e(this);
            if (e17 == null) {
                e17 = new android.os.Bundle();
            }
            stringExtra = e17.getString("key_trans_id");
            android.os.Bundle e18 = com.tencent.mm.wallet_core.a.e(this);
            if (e18 == null) {
                e18 = new android.os.Bundle();
            }
            stringExtra2 = e18.getString("bill_id");
        } else if (getIntent().getIntExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0) == 1 || getIntent().getIntExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0) == 2) {
            stringExtra = getIntent().getStringExtra("trans_id");
            stringExtra2 = getIntent().getStringExtra("bill_id");
        } else {
            stringExtra = null;
            stringExtra2 = null;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            com.tencent.mars.xlog.Log.w(com.tencent.mm.ui.base.preference.MMPreference.TAG, "mOrders info is Illegal!");
            db5.e1.m(getContext(), com.tencent.mm.R.string.ks_, 0, new fp3.x(this));
        }
        android.os.Bundle e19 = com.tencent.mm.wallet_core.a.e(this);
        if (e19 == null) {
            e19 = new android.os.Bundle();
        }
        e19.getInt("key_pay_type");
        initView();
        V6().d(new dp3.n(stringExtra, stringExtra2, -1), true);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletPreferenceUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.wallet_core.ui.w wVar = this.f152865i;
        if (wVar != null) {
            wVar.b();
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        return false;
    }
}
