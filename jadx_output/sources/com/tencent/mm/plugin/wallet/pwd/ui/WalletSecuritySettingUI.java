package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class WalletSecuritySettingUI extends com.tencent.mm.ui.base.preference.MMPreference implements com.tencent.mm.modelbase.u0 {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f178942e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet.pwd.ui.WalletSecuritySettingHeaderPref f178943f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.IconPreference f178944g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.IconPreference f178945h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.IconPreference f178946i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.IconPreference f178947m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.IconPreference f178948n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet.pwd.ui.q2 f178949o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet.pwd.ui.x2 f178950p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet.pwd.ui.w2 f178951q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet.pwd.ui.t2 f178952r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet.pwd.ui.p2 f178953s;

    /* renamed from: t, reason: collision with root package name */
    public android.app.ProgressDialog f178954t;

    /* renamed from: d, reason: collision with root package name */
    public boolean f178941d = true;

    /* renamed from: u, reason: collision with root package name */
    public int f178955u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.Map f178956v = new java.util.HashMap();

    public final void V6(java.lang.String str, com.tencent.mm.ui.base.preference.IconPreference iconPreference) {
        if (iconPreference == null) {
            return;
        }
        android.graphics.Bitmap Bi = ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Bi(str);
        if (Bi != null) {
            iconPreference.U = new android.graphics.drawable.BitmapDrawable(getContext().getResources(), Bi);
        } else {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                return;
            }
            com.tencent.mm.plugin.wallet.pwd.ui.o2 o2Var = new com.tencent.mm.plugin.wallet.pwd.ui.o2(this, iconPreference);
            ((java.util.HashMap) this.f178956v).put(str, o2Var);
            ((j70.e) ((k70.g0) i95.n0.c(k70.g0.class))).Ui(str, o2Var);
        }
    }

    public final void W6(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletSecuritySettingUI", "security info json is null");
            java.lang.String string = getString(com.tencent.mm.R.string.kyr);
            android.app.ProgressDialog progressDialog = this.f178954t;
            if (progressDialog != null && progressDialog.isShowing()) {
                this.f178954t.dismiss();
            }
            db5.e1.G(this, string, "", false, new com.tencent.mm.plugin.wallet.pwd.ui.n2(this));
            return;
        }
        try {
            this.f178942e = getPreferenceScreen();
            if (jSONObject.has("basic_security_item")) {
                org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("basic_security_item");
                com.tencent.mm.plugin.wallet.pwd.ui.q2 q2Var = new com.tencent.mm.plugin.wallet.pwd.ui.q2(this, null);
                this.f178949o = q2Var;
                q2Var.f179060a = jSONObject2.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                this.f178949o.f179061b = jSONObject2.optString("desc");
                com.tencent.mm.plugin.wallet.pwd.ui.q2 q2Var2 = this.f178949o;
                jSONObject2.optString("logo_url");
                q2Var2.getClass();
            }
            if (jSONObject.has("wallet_lock_info")) {
                org.json.JSONObject jSONObject3 = jSONObject.getJSONObject("wallet_lock_info");
                com.tencent.mm.plugin.wallet.pwd.ui.x2 x2Var = new com.tencent.mm.plugin.wallet.pwd.ui.x2(this, null);
                this.f178950p = x2Var;
                x2Var.f179113a = jSONObject3.optString("wallet_lock_title");
                this.f178950p.f179114b = jSONObject3.optString("wallet_lock_desc");
                this.f178950p.f179115c = jSONObject3.getString("wallet_lock_logo_url");
                com.tencent.mm.plugin.wallet.pwd.ui.x2 x2Var2 = this.f178950p;
                jSONObject3.optInt("wallet_lock_status");
                x2Var2.getClass();
                this.f178950p.f179116d = jSONObject3.optString("wallet_lock_status_name");
                com.tencent.mm.plugin.wallet.pwd.ui.x2 x2Var3 = this.f178950p;
                jSONObject3.optBoolean("is_open_touch_pay", false);
                x2Var3.getClass();
            }
            if (jSONObject.has("property_security_info")) {
                org.json.JSONObject jSONObject4 = jSONObject.getJSONObject("property_security_info");
                com.tencent.mm.plugin.wallet.pwd.ui.w2 w2Var = new com.tencent.mm.plugin.wallet.pwd.ui.w2(this, null);
                this.f178951q = w2Var;
                w2Var.f179101a = jSONObject4.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "");
                this.f178951q.f179102b = jSONObject4.optString("desc", "");
                this.f178951q.f179103c = jSONObject4.optString("logo_url", "");
                com.tencent.mm.plugin.wallet.pwd.ui.w2 w2Var2 = this.f178951q;
                jSONObject4.optInt("status", 0);
                w2Var2.getClass();
                this.f178951q.f179104d = jSONObject4.optString("status_name");
                this.f178951q.f179105e = jSONObject4.optInt("jump_type");
                this.f178951q.f179106f = jSONObject4.optString("jump_h5_url");
                this.f178951q.f179107g = jSONObject4.optString("tinyapp_username");
                this.f178951q.f179108h = jSONObject4.optString("tinyapp_path");
            }
            if (jSONObject.has("safe_manager_info")) {
                org.json.JSONObject jSONObject5 = jSONObject.getJSONObject("safe_manager_info");
                if (this.f178952r == null) {
                    this.f178952r = new com.tencent.mm.plugin.wallet.pwd.ui.t2(this, this);
                }
                this.f178952r.f179073a = jSONObject5.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "");
                this.f178952r.f179074b = jSONObject5.optString("desc", "");
                this.f178952r.f179075c = jSONObject5.optString("logo_url", "");
                this.f178952r.f179077e = jSONObject5.optString("installed_status_name");
                this.f178952r.f179076d = jSONObject5.optString("uninstall_status_name");
                this.f178952r.f179078f = jSONObject5.optString("protected_mode_name");
                this.f178952r.f179079g = jSONObject5.optString("jump_h5_url");
                com.tencent.mm.plugin.wallet.pwd.ui.t2 t2Var = this.f178952r;
                t2Var.getClass();
                if (com.tencent.mm.pluginsdk.model.app.j1.f(this, "com.tencent.qqpimsecure")) {
                    t2Var.f179080h = 3;
                    ((ku5.t0) ku5.t0.f312615d).j(new com.tencent.mm.plugin.wallet.pwd.ui.s2(t2Var), "check_qq_security_status");
                } else {
                    t2Var.f179080h = 0;
                }
            }
            if (jSONObject.has("balance_privacy_info")) {
                org.json.JSONObject jSONObject6 = jSONObject.getJSONObject("balance_privacy_info");
                com.tencent.mm.plugin.wallet.pwd.ui.p2 p2Var = new com.tencent.mm.plugin.wallet.pwd.ui.p2(this, null);
                this.f178953s = p2Var;
                p2Var.f179051a = jSONObject6.optString("icon", "");
                this.f178953s.f179052b = jSONObject6.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "");
                this.f178953s.f179053c = jSONObject6.optString("desc", "");
                com.tencent.mm.plugin.wallet.pwd.ui.p2 p2Var2 = this.f178953s;
                jSONObject6.optInt("switch_state");
                p2Var2.getClass();
                this.f178953s.f179054d = jSONObject6.optString("switch_state_info");
            }
            com.tencent.mm.wallet_core.model.p1.c().d(jSONObject);
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLETLOCK_CURRENT_JSON_TYPE_STRING_SYNC, jSONObject.toString());
            Z6();
            c7();
            Y6();
            a7();
            b7();
            X6();
            ((com.tencent.mm.ui.base.preference.h0) this.f178942e).notifyDataSetChanged();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletSecuritySettingUI", e17, "", new java.lang.Object[0]);
            java.lang.String string2 = getString(com.tencent.mm.R.string.kyr);
            android.app.ProgressDialog progressDialog2 = this.f178954t;
            if (progressDialog2 != null && progressDialog2.isShowing()) {
                this.f178954t.dismiss();
            }
            db5.e1.G(this, string2, "", false, new com.tencent.mm.plugin.wallet.pwd.ui.n2(this));
        }
        android.app.ProgressDialog progressDialog3 = this.f178954t;
        if (progressDialog3 == null || !progressDialog3.isShowing()) {
            return;
        }
        this.f178954t.dismiss();
    }

    public final void X6() {
        if (this.f178953s == null) {
            ((com.tencent.mm.ui.base.preference.h0) this.f178942e).m("balance_privacy_info", true);
            return;
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f178942e).m("balance_privacy_info", false);
        com.tencent.mm.ui.base.preference.IconPreference iconPreference = (com.tencent.mm.ui.base.preference.IconPreference) ((com.tencent.mm.ui.base.preference.h0) this.f178942e).h("balance_privacy_info");
        this.f178948n = iconPreference;
        V6(this.f178953s.f179051a, iconPreference);
        this.f178948n.L(this.f178953s.f179052b);
        this.f178948n.H(this.f178953s.f179054d);
        this.f178948n.O(this.f178953s.f179053c);
        this.f178948n.Q(0);
    }

    public final void Y6() {
        ((com.tencent.mm.ui.base.preference.h0) this.f178942e).m("wallet_security_digital_certificate", false);
        this.f178944g = (com.tencent.mm.ui.base.preference.IconPreference) ((com.tencent.mm.ui.base.preference.h0) this.f178942e).h("wallet_security_digital_certificate");
        com.tencent.mm.wallet_core.model.p1.c().getClass();
        gm0.j1.i();
        if (!(((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLETDIGITAL_CERT_SHOW_INT_SYNC, 0)).intValue() > 0)) {
            ((com.tencent.mm.ui.base.preference.h0) this.f178942e).m("wallet_security_digital_certificate", true);
            return;
        }
        if (this.f178944g == null) {
            return;
        }
        com.tencent.mm.wallet_core.model.p1 c17 = com.tencent.mm.wallet_core.model.p1.c();
        c17.getClass();
        if (!(!com.tencent.mm.sdk.platformtools.t8.K0(com.tencent.mm.wallet_core.model.p1.b()) && c17.f213976a > 0)) {
            this.f178944g.G(com.tencent.mm.R.string.kyx);
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(com.tencent.mm.wallet_core.model.p1.c().f213979d)) {
            this.f178944g.G(com.tencent.mm.R.string.kyw);
        } else {
            this.f178944g.H(com.tencent.mm.wallet_core.model.p1.c().f213979d);
        }
        V6(com.tencent.mm.wallet_core.model.p1.c().f213980e, this.f178944g);
        this.f178944g.L(com.tencent.mm.wallet_core.model.p1.c().f213978c);
        this.f178944g.O(com.tencent.mm.wallet_core.model.p1.c().f213977b);
        this.f178944g.Q(0);
    }

    public final void Z6() {
        android.widget.TextView textView;
        com.tencent.mm.plugin.wallet.pwd.ui.WalletSecuritySettingHeaderPref walletSecuritySettingHeaderPref = (com.tencent.mm.plugin.wallet.pwd.ui.WalletSecuritySettingHeaderPref) ((com.tencent.mm.ui.base.preference.h0) this.f178942e).h("wallet_security_basic_info");
        this.f178943f = walletSecuritySettingHeaderPref;
        com.tencent.mm.plugin.wallet.pwd.ui.q2 q2Var = this.f178949o;
        if (q2Var != null) {
            java.lang.String str = q2Var.f179060a;
            java.lang.String str2 = q2Var.f179061b;
            q2Var.getClass();
            walletSecuritySettingHeaderPref.Q = str;
            walletSecuritySettingHeaderPref.R = str2;
            walletSecuritySettingHeaderPref.S = null;
            walletSecuritySettingHeaderPref.M();
            this.f178949o.getClass();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(null) || (textView = this.f178943f.N) == null) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    public final void a7() {
        this.f178945h = (com.tencent.mm.ui.base.preference.IconPreference) ((com.tencent.mm.ui.base.preference.h0) this.f178942e).h("wallet_security_pay_guard");
        if (this.f178952r == null) {
            ((com.tencent.mm.ui.base.preference.h0) this.f178942e).m("wallet_security_pay_guard", true);
            return;
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f178942e).m("wallet_security_pay_guard", false);
        V6(this.f178952r.f179075c, this.f178945h);
        this.f178945h.L(this.f178952r.f179073a);
        com.tencent.mm.plugin.wallet.pwd.ui.t2 t2Var = this.f178952r;
        int i17 = t2Var.f179080h;
        java.lang.String str = i17 == 0 ? t2Var.f179076d : i17 == 1 ? t2Var.f179077e : i17 == 3 ? null : t2Var.f179078f;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            this.f178945h.H(str);
        }
        this.f178945h.O(this.f178952r.f179074b);
        this.f178945h.Q(0);
    }

    public final void b7() {
        com.tencent.mm.ui.base.preference.r preferenceScreen = getPreferenceScreen();
        this.f178942e = preferenceScreen;
        ((com.tencent.mm.ui.base.preference.h0) preferenceScreen).m("wallet_security_safety_insurance", false);
        com.tencent.mm.ui.base.preference.IconPreference iconPreference = (com.tencent.mm.ui.base.preference.IconPreference) ((com.tencent.mm.ui.base.preference.h0) this.f178942e).h("wallet_security_safety_insurance");
        this.f178947m = iconPreference;
        if (iconPreference != null) {
            iconPreference.G(com.tencent.mm.R.string.kyy);
        }
        com.tencent.mm.plugin.wallet.pwd.ui.w2 w2Var = this.f178951q;
        if (w2Var == null) {
            ((com.tencent.mm.ui.base.preference.h0) this.f178942e).m("wallet_security_safety_insurance", true);
            return;
        }
        V6(w2Var.f179103c, this.f178947m);
        this.f178947m.L(this.f178951q.f179101a);
        this.f178947m.H(this.f178951q.f179104d);
        this.f178947m.O(this.f178951q.f179102b);
        this.f178947m.Q(0);
    }

    public final void c7() {
        if (this.f178950p == null) {
            ((com.tencent.mm.ui.base.preference.h0) this.f178942e).m("wallet_security_wallet_lock", true);
            return;
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f178942e).m("wallet_security_wallet_lock", false);
        com.tencent.mm.ui.base.preference.IconPreference iconPreference = (com.tencent.mm.ui.base.preference.IconPreference) ((com.tencent.mm.ui.base.preference.h0) this.f178942e).h("wallet_security_wallet_lock");
        this.f178946i = iconPreference;
        V6(this.f178950p.f179115c, iconPreference);
        this.f178946i.L(this.f178950p.f179113a);
        this.f178946i.H(this.f178950p.f179116d);
        this.f178946i.O(this.f178950p.f179114b);
        this.f178946i.Q(0);
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        super.initView();
        com.tencent.mm.ui.base.preference.r preferenceScreen = getPreferenceScreen();
        this.f178942e = preferenceScreen;
        if (preferenceScreen != null) {
            ((com.tencent.mm.ui.base.preference.h0) preferenceScreen).g(com.tencent.mm.R.xml.f494976d5);
        }
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLETLOCK_CURRENT_JSON_TYPE_STRING_SYNC, "");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        try {
            W6(new org.json.JSONObject(str));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletSecuritySettingUI", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f178955u = getIntent().getIntExtra("wallet_lock_jsapi_scene", 0);
        com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct wCPaySaftyClickReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct();
        wCPaySaftyClickReportStruct.f62116d = 11L;
        wCPaySaftyClickReportStruct.f62117e = 1L;
        wCPaySaftyClickReportStruct.f62118f = this.f178955u;
        wCPaySaftyClickReportStruct.k();
        initView();
        setBackBtn(new com.tencent.mm.plugin.wallet.pwd.ui.h2(this));
        if (fp.h.c(23)) {
            getWindow().setStatusBarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
            updataStatusBarIcon(com.tencent.mm.ui.bk.C());
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        java.util.Map map = this.f178956v;
        for (java.util.Map.Entry entry : ((java.util.HashMap) map).entrySet()) {
            ((j70.e) ((k70.g0) i95.n0.c(k70.g0.class))).wi((java.lang.String) entry.getKey(), (k70.f0) entry.getValue());
        }
        ((java.util.HashMap) map).clear();
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        gm0.j1.i();
        gm0.j1.n().f273288b.q(385, this);
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        if ("wallet_security_digital_certificate".equals(preference.f197780q)) {
            com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct wCPaySaftyClickReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct();
            wCPaySaftyClickReportStruct.f62116d = 12L;
            wCPaySaftyClickReportStruct.f62117e = 1L;
            wCPaySaftyClickReportStruct.k();
            j45.l.j(this, "wallet", ".pwd.ui.WalletDigitalCertUI", new android.content.Intent(), null);
            return true;
        }
        if ("wallet_security_pay_guard".equals(preference.f197780q)) {
            com.tencent.mm.plugin.wallet.pwd.ui.t2 t2Var = this.f178952r;
            if (t2Var == null) {
                return true;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletSecuritySettingUI", "jump url %s ", t2Var.b());
            java.lang.String b17 = this.f178952r.b();
            java.util.regex.Pattern pattern = com.tencent.mm.wallet_core.ui.r1.f214222a;
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", b17);
            intent.putExtra("showShare", false);
            intent.putExtra("pay_channel", 1);
            intent.putExtra(com.tencent.mm.ui.w2.f211205r, true);
            j45.l.j(this, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, null);
            return true;
        }
        if ("wallet_security_wallet_lock".equals(preference.f197780q)) {
            ((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).wi().l(this, new android.content.Intent());
            return true;
        }
        if (!"wallet_security_safety_insurance".equals(preference.f197780q)) {
            if ("balance_privacy_info".equals(preference.f197780q)) {
                if (this.f178953s == null) {
                    return true;
                }
                if (j62.e.g().i("clicfg_open_wallet_entrance_switch_state_cpp_version_android", 0, true, true) == 1) {
                    ((h45.q) i95.n0.c(h45.q.class)).startUseCase("WalletEntranceStateUseCase", com.tencent.kinda.gen.ITransmitKvData.create(), new com.tencent.mm.plugin.wallet.pwd.ui.m2(this));
                } else {
                    j45.l.h(this, "wallet", ".pwd.ui.WalletBalancePrivacyUI");
                }
                com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct wCPaySaftyClickReportStruct2 = new com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct();
                wCPaySaftyClickReportStruct2.f62116d = 16L;
                wCPaySaftyClickReportStruct2.f62117e = 1L;
                wCPaySaftyClickReportStruct2.k();
            }
            return false;
        }
        if (this.f178951q == null) {
            return true;
        }
        com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct wCPaySaftyClickReportStruct3 = new com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct();
        wCPaySaftyClickReportStruct3.f62116d = 15L;
        wCPaySaftyClickReportStruct3.f62117e = 1L;
        wCPaySaftyClickReportStruct3.k();
        if (this.f178951q.f179105e == 2) {
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent();
            am.nx nxVar = startAppBrandUIFromOuterEvent.f54857g;
            nxVar.f7474i = 0;
            com.tencent.mm.plugin.wallet.pwd.ui.w2 w2Var = this.f178951q;
            nxVar.f7466a = w2Var.f179107g;
            nxVar.f7467b = w2Var.f179108h;
            startAppBrandUIFromOuterEvent.e();
        } else {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("rawUrl", this.f178951q.f179106f);
            intent2.getStringExtra("rawUrl");
            intent2.putExtra(com.tencent.mm.ui.w2.f211205r, true);
            com.tencent.mm.wallet_core.ui.r1.T(getContext(), intent2);
        }
        return true;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mm.plugin.wallet.pwd.ui.WalletSecuritySettingHeaderPref walletSecuritySettingHeaderPref = (com.tencent.mm.plugin.wallet.pwd.ui.WalletSecuritySettingHeaderPref) ((com.tencent.mm.ui.base.preference.h0) this.f178942e).h("wallet_security_basic_info");
        this.f178943f = walletSecuritySettingHeaderPref;
        if (walletSecuritySettingHeaderPref != null) {
            com.tencent.mm.plugin.wallet.pwd.ui.i2 i2Var = new com.tencent.mm.plugin.wallet.pwd.ui.i2(this);
            walletSecuritySettingHeaderPref.T = i2Var;
            android.widget.TextView textView = walletSecuritySettingHeaderPref.N;
            if (textView != null) {
                textView.setOnClickListener(i2Var);
            }
            com.tencent.mm.plugin.wallet.pwd.ui.WalletSecuritySettingHeaderPref walletSecuritySettingHeaderPref2 = this.f178943f;
            com.tencent.mm.plugin.wallet.pwd.ui.j2 j2Var = new com.tencent.mm.plugin.wallet.pwd.ui.j2(this);
            walletSecuritySettingHeaderPref2.U = j2Var;
            android.widget.ImageView imageView = walletSecuritySettingHeaderPref2.P;
            if (imageView != null) {
                imageView.setOnClickListener(j2Var);
            }
        }
        gm0.j1.i();
        gm0.j1.n().f273288b.a(385, this);
        if (this.f178941d) {
            this.f178954t = db5.e1.Q(this, "", getString(com.tencent.mm.R.string.f490604zq), false, false, null);
            this.f178941d = false;
        }
        boolean a17 = ((mz2.a) ((pz2.a) gm0.j1.s(pz2.a.class))).a();
        re4.v a18 = re4.u.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletSecuritySettingUI", "getSecurityInfo isOpenTouchPay: %b", java.lang.Boolean.valueOf(a17));
        gm0.j1.d().g(new gs4.q(false, a17, a18.f394553a, a18.f394554b));
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.wallet.pwd.ui.v2 v2Var;
        if (m1Var instanceof gs4.q) {
            org.json.JSONObject jSONObject = ((gs4.q) m1Var).f275134d;
            W6(jSONObject);
            if (jSONObject == null) {
                return;
            }
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_HAD_SHOW_WALLET_SECURITY_TIPS_BOOLEAN;
            if (((java.lang.Boolean) c17.m(u3Var, java.lang.Boolean.FALSE)).booleanValue()) {
                return;
            }
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("dialog_info");
            if (optJSONObject == null) {
                v2Var = null;
            } else {
                v2Var = new com.tencent.mm.plugin.wallet.pwd.ui.v2();
                v2Var.f179094a = optJSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                v2Var.f179095b = optJSONObject.optString("wording");
                v2Var.f179096c = optJSONObject.optString("logo");
                v2Var.f179097d = com.tencent.mm.plugin.wallet.pwd.ui.u2.a(optJSONObject.optJSONObject("left_btn"));
                v2Var.f179098e = com.tencent.mm.plugin.wallet.pwd.ui.u2.a(optJSONObject.optJSONObject("right_btn"));
            }
            if (v2Var != null) {
                com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
                android.view.View inflate = android.view.LayoutInflater.from(this).inflate(com.tencent.mm.R.layout.d8i, (android.view.ViewGroup) null, false);
                com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) inflate.findViewById(com.tencent.mm.R.id.f487761pr0);
                android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f487762pr1);
                cdnImageView.b(v2Var.f179096c, 0, 0, com.tencent.mm.R.drawable.chz);
                textView.setText(v2Var.f179095b);
                aVar.B = true;
                aVar.A = false;
                aVar.L = inflate;
                aVar.f211709a = v2Var.f179094a;
                com.tencent.mm.plugin.wallet.pwd.ui.u2 u2Var = v2Var.f179098e;
                if (u2Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(u2Var.f179085a)) {
                    aVar.f211732v = v2Var.f179098e.f179085a;
                    aVar.E = new com.tencent.mm.plugin.wallet.pwd.ui.k2(this, v2Var);
                    aVar.Z = true;
                }
                com.tencent.mm.plugin.wallet.pwd.ui.u2 u2Var2 = v2Var.f179097d;
                if (u2Var2 != null && !com.tencent.mm.sdk.platformtools.t8.K0(u2Var2.f179085a)) {
                    aVar.f211733w = v2Var.f179097d.f179085a;
                    aVar.F = new com.tencent.mm.plugin.wallet.pwd.ui.l2(this, v2Var);
                }
                com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(this, com.tencent.mm.R.style.f494791wd);
                j0Var.e(aVar);
                com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
                if (d0Var != null) {
                    d0Var.a(j0Var.f211837r);
                }
                j0Var.show();
                gm0.j1.u().c().x(u3Var, java.lang.Boolean.TRUE);
            }
        }
    }
}
