package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class WalletLuckyMoneyRefundWayUI extends com.tencent.mm.ui.base.preference.MMPreference {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f178912d;

    /* renamed from: e, reason: collision with root package name */
    public long f178913e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.Preference f178914f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet.pwd.ui.RadioBelowSummarytAndIconPreference f178915g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet.pwd.ui.RadioBelowSummarytAndIconPreference f178916h;

    /* renamed from: i, reason: collision with root package name */
    public gs4.f f178917i;

    public final void V6(int i17) {
        com.tencent.mm.autogen.mmdata.rpt.WCPayHongBaoRefundClickReportStruct wCPayHongBaoRefundClickReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WCPayHongBaoRefundClickReportStruct();
        wCPayHongBaoRefundClickReportStruct.f62101d = com.tencent.mm.sdk.platformtools.t8.B0(this.f178913e & 3, 2L) ? 2 : 1;
        wCPayHongBaoRefundClickReportStruct.f62102e = i17;
        wCPayHongBaoRefundClickReportStruct.k();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f178914f = ((com.tencent.mm.ui.base.preference.h0) this.f178912d).h("refund_way_detail");
        this.f178915g = (com.tencent.mm.plugin.wallet.pwd.ui.RadioBelowSummarytAndIconPreference) ((com.tencent.mm.ui.base.preference.h0) this.f178912d).h("refund_way_detail_lq");
        this.f178916h = (com.tencent.mm.plugin.wallet.pwd.ui.RadioBelowSummarytAndIconPreference) ((com.tencent.mm.ui.base.preference.h0) this.f178912d).h("refund_way_detail_origin");
        com.tencent.mm.ui.base.preference.Preference preference = this.f178914f;
        if (preference != null) {
            preference.L(this.f178917i.f275088h);
        }
        com.tencent.mm.plugin.wallet.pwd.ui.RadioBelowSummarytAndIconPreference radioBelowSummarytAndIconPreference = this.f178915g;
        if (radioBelowSummarytAndIconPreference != null) {
            radioBelowSummarytAndIconPreference.L(this.f178917i.f275084d);
            this.f178915g.H(this.f178917i.f275085e);
        }
        com.tencent.mm.plugin.wallet.pwd.ui.RadioBelowSummarytAndIconPreference radioBelowSummarytAndIconPreference2 = this.f178916h;
        if (radioBelowSummarytAndIconPreference2 != null) {
            radioBelowSummarytAndIconPreference2.L(this.f178917i.f275086f);
            this.f178916h.H(this.f178917i.f275087g);
            com.tencent.mm.plugin.wallet.pwd.ui.RadioBelowSummarytAndIconPreference radioBelowSummarytAndIconPreference3 = this.f178916h;
            com.tencent.mm.plugin.wallet.pwd.ui.g1 g1Var = new com.tencent.mm.plugin.wallet.pwd.ui.g1(this);
            radioBelowSummarytAndIconPreference3.Q = com.tencent.mm.R.drawable.cdu;
            radioBelowSummarytAndIconPreference3.R = g1Var;
        }
        if (com.tencent.mm.sdk.platformtools.t8.B0(this.f178913e & 3, 2L)) {
            this.f178915g.H = com.tencent.mm.R.layout.c0t;
            this.f178916h.H = com.tencent.mm.R.layout.c0s;
        } else {
            this.f178915g.H = com.tencent.mm.R.layout.c0s;
            this.f178916h.H = com.tencent.mm.R.layout.c0t;
        }
        setBackBtn(new com.tencent.mm.plugin.wallet.pwd.ui.h1(this));
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        fixStatusbar(true);
        super.onCreate(bundle);
        setActionbarColor(getActionbarColor());
        java.lang.String stringExtra = getIntent().getStringExtra("key_hb_refund_config");
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletLuckyMoneyRefundWayUI", "mHbRefundConfig == null");
            finish();
        } else {
            this.f178917i = gs4.f.a(stringExtra);
        }
        com.tencent.mm.ui.base.preference.r preferenceScreen = getPreferenceScreen();
        this.f178912d = preferenceScreen;
        ((com.tencent.mm.ui.base.preference.h0) preferenceScreen).g(com.tencent.mm.R.xml.f494973d2);
        setMMTitle(this.f178917i.f275082b);
        gm0.j1.i();
        long longValue = ((java.lang.Long) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_EXT_PAY_SETTING_LONG_SYNC, 0L)).longValue();
        this.f178913e = longValue;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLuckyMoneyRefundWayUI", "origin extStatus: %s", java.lang.Long.toBinaryString(longValue));
        initView();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        r45.oo4 oo4Var = new r45.oo4();
        long j17 = this.f178913e;
        if ((((long) 1) & j17) != 0) {
            oo4Var.f382396d = 1L;
            oo4Var.f382397e = 2L;
        } else {
            if ((((long) 2) & j17) != 0) {
                oo4Var.f382396d = 2L;
                oo4Var.f382397e = 1L;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLuckyMoneyRefundWayUI", "doSettingsOplog() extStatus: %s, set_bitmask: %s, clear_bitmask:%s", java.lang.Long.toBinaryString(j17), java.lang.Long.toBinaryString(oo4Var.f382396d), java.lang.Long.toBinaryString(oo4Var.f382397e));
        ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(218, oo4Var));
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        java.lang.String str = preference.f197780q;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLuckyMoneyRefundWayUI", "onPreferenceTreeClick() key:%s", str);
        if ("refund_way_detail_lq".equals(str)) {
            this.f178915g.H = com.tencent.mm.R.layout.c0s;
            this.f178916h.H = com.tencent.mm.R.layout.c0t;
            V6(1);
            this.f178913e = (this.f178913e | 1) & (-3);
        } else if ("refund_way_detail_origin".equals(str)) {
            this.f178915g.H = com.tencent.mm.R.layout.c0t;
            this.f178916h.H = com.tencent.mm.R.layout.c0s;
            V6(2);
            this.f178913e = (this.f178913e & (-2)) | 2;
        }
        gm0.j1.i();
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_EXT_PAY_SETTING_LONG_SYNC, java.lang.Long.valueOf(this.f178913e));
        ((com.tencent.mm.ui.base.preference.h0) this.f178912d).notifyDataSetChanged();
        finish();
        return true;
    }
}
