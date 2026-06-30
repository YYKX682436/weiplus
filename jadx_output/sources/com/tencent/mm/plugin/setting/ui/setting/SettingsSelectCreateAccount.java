package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public class SettingsSelectCreateAccount extends com.tencent.mm.ui.base.preference.MMPreference {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f160662d;

    /* renamed from: e, reason: collision with root package name */
    public int f160663e = 0;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f160664f = null;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f160665g = null;

    public final void V6() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 5298;
        lVar.f70666c = "/cgi-bin/micromsg-bin/precheckaffiliatedacct";
        r45.tb5 tb5Var = new r45.tb5();
        tb5Var.f386275e = this.f160665g;
        fo3.s sVar = fo3.s.INSTANCE;
        byte[] h17 = sVar.h();
        r45.k57 k57Var = new r45.k57();
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(h17);
        k57Var.f378396f = cu5Var;
        r45.cu5 cu5Var2 = new r45.cu5();
        cu5Var2.d(sVar.L9());
        k57Var.f378400m = cu5Var2;
        r45.cu5 cu5Var3 = new r45.cu5();
        cu5Var3.d(k57Var.toByteArray());
        tb5Var.f386274d = cu5Var3;
        tb5Var.f386276f = this.f160663e;
        lVar.f70664a = tb5Var;
        lVar.f70665b = new r45.ub5();
        com.tencent.mm.modelbase.z2.d(lVar.a(), new com.tencent.mm.plugin.setting.ui.setting.zl(this), false);
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public android.view.View getBottomView() {
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.ckx, (android.view.ViewGroup) null);
        linearLayout.findViewById(com.tencent.mm.R.id.mq6).setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.xl(this));
        return linearLayout;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getHeaderResourceId() {
        return com.tencent.mm.R.layout.cky;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return this.f160663e == 0 ? com.tencent.mm.R.layout.f489453cm2 : com.tencent.mm.R.layout.f489452cm1;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        android.os.Bundle bundleExtra;
        super.onActivityResult(i17, i18, intent);
        if (i17 == 702) {
            if (intent != null) {
                java.util.Map map = (java.util.Map) intent.getBundleExtra("result_data").getSerializable("next_params");
                if (map != null) {
                    this.f160664f = (java.lang.String) map.get("ticket");
                }
                if (this.f160664f != null) {
                    c71.b.c(this, getString(com.tencent.mm.R.string.gbc, com.tencent.mm.sdk.platformtools.m2.d(), u11.b.d("CN"), "reg", 1, 0), 703, false);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(23530, this.f160665g, wo.w0.k(), 0, 1, 1002, 0, null, java.lang.Integer.valueOf(this.f160663e));
                }
            }
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f160662d;
            if (u3Var == null || !u3Var.isShowing()) {
                return;
            }
            this.f160662d.dismiss();
            return;
        }
        if (i17 != 703) {
            if (i17 == 704) {
                com.tencent.mm.ui.widget.dialog.u3 u3Var2 = this.f160662d;
                if (u3Var2 != null && u3Var2.isShowing()) {
                    this.f160662d.dismiss();
                }
                setResult(i18, intent);
                finish();
                return;
            }
            return;
        }
        if (intent != null && (bundleExtra = intent.getBundleExtra("result_data")) != null && bundleExtra.getString("go_next", "").equals("agree_privacy")) {
            android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.RegAffiliateAccountUI.class);
            intent2.putExtra("RegTicket", this.f160664f);
            intent2.putExtra("sessionID", this.f160665g);
            intent2.putExtra("RegScene", this.f160663e);
            startActivityForResult(intent2, 704);
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var3 = this.f160662d;
        if (u3Var3 == null || !u3Var3.isShowing()) {
            return;
        }
        this.f160662d.dismiss();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        this.f160663e = getIntent().getIntExtra("RegScene", 0);
        super.onCreate(bundle);
        setMMTitle("");
        setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478491c));
        setBackGroundColorResource(com.tencent.mm.R.color.aaw);
        setBackGroundColorResource(com.tencent.mm.R.color.aaw);
        if (getListView() != null) {
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479704cz);
            getListView().setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
            getListView().setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        }
        java.lang.String str = java.lang.System.currentTimeMillis() + "";
        this.f160665g = str;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(23530, str, wo.w0.k(), 0, 1, 1001, 0, null, java.lang.Integer.valueOf(this.f160663e));
        setBackBtn(new com.tencent.mm.plugin.setting.ui.setting.yl(this));
        ((com.tencent.mm.ui.base.preference.SummaryBelowPreference) ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h("register_by_phone")).I = true;
        com.tencent.mm.ui.base.preference.SummaryBelowPreference summaryBelowPreference = (com.tencent.mm.ui.base.preference.SummaryBelowPreference) ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h("register_by_weixin");
        summaryBelowPreference.I = true;
        if (this.f160663e == 0) {
            summaryBelowPreference.H(getString(com.tencent.mm.R.string.ixk, c01.z1.l()));
        } else {
            summaryBelowPreference.H(getString(com.tencent.mm.R.string.ixj, c01.z1.l()));
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        java.lang.String str = preference.f197780q;
        if ("register_by_phone".equals(str)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(23530, this.f160665g, wo.w0.k(), 0, 2, 1001, 10101, null, java.lang.Integer.valueOf(this.f160663e));
            setResult(1);
            finish();
        } else if ("register_by_weixin".equals(str)) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[8];
            objArr[0] = this.f160665g;
            objArr[1] = wo.w0.k();
            objArr[2] = 0;
            objArr[3] = 2;
            objArr[4] = 1001;
            objArr[5] = java.lang.Integer.valueOf(this.f160663e == 0 ? 10102 : 10104);
            objArr[6] = null;
            objArr[7] = java.lang.Integer.valueOf(this.f160663e);
            g0Var.d(23530, objArr);
            try {
                this.f160662d = db5.e1.Q(getContext(), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f490604zq), true, true, null);
                V6();
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SettingsSelectCreateAccount", e17, null, new java.lang.Object[0]);
            }
        }
        return false;
    }
}
