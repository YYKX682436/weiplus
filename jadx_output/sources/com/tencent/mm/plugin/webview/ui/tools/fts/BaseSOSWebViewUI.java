package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class BaseSOSWebViewUI extends com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI implements tj5.n {
    public android.view.View F4;
    public android.view.View G4;
    public android.view.View H4;
    public android.view.View I4;
    public com.tencent.mm.plugin.websearch.widget.SOSEditTextView J4;
    public boolean K4;
    public boolean L4;
    public boolean M4;
    public boolean N4;
    public android.widget.ImageView O4;
    public android.widget.ImageView P4;
    public java.util.List R4;
    public boolean V4;
    public boolean X4;
    public boolean Q4 = false;
    public int S4 = 0;
    public boolean T4 = false;
    public boolean U4 = false;
    public boolean W4 = false;
    public final com.tencent.mm.plugin.webview.ui.tools.fts.a0 Y4 = new com.tencent.mm.plugin.webview.ui.tools.fts.a0(this, null);

    public static void ha(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, int i19, java.lang.String str4, long j17, java.lang.String str5) {
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.webview.ui.tools.fts.o(str, str2, str3, i17, i18, i19, str4, j17, str5));
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI
    public void B9(int i17, java.lang.String str, java.util.Map map) {
        int i18 = this.f184245b4;
        this.f184245b4 = i17;
        if (i18 != i17) {
            ra();
        }
        if (this.R4 == null) {
            this.R4 = new java.util.ArrayList();
        }
        boolean z17 = false;
        if (P9().length() > 0) {
            com.tencent.mm.plugin.webview.ui.tools.fts.b0 b0Var = new com.tencent.mm.plugin.webview.ui.tools.fts.b0();
            b0Var.f184346d = this.f184245b4;
            b0Var.f184345c = new java.util.ArrayList(this.J4.getTagList());
            b0Var.f184344b = this.J4.getInEditTextQuery();
            b0Var.f184343a = this.J4.getTotalQuery();
            if (this.R4.size() == 0) {
                this.R4.add(b0Var);
            } else if (!b0Var.equals((com.tencent.mm.plugin.webview.ui.tools.fts.b0) this.R4.get(0))) {
                this.R4.add(0, b0Var);
            }
            la(this.R4);
        }
        java.util.List list = this.R4;
        if (list == null || list.isEmpty()) {
            return;
        }
        com.tencent.mm.plugin.webview.ui.tools.fts.b0 b0Var2 = (com.tencent.mm.plugin.webview.ui.tools.fts.b0) this.R4.get(0);
        com.tencent.mm.plugin.webview.ui.tools.fts.b0 b0Var3 = new com.tencent.mm.plugin.webview.ui.tools.fts.b0();
        b0Var3.f184346d = i17;
        b0Var3.f184343a = str;
        b0Var3.f184347e = map;
        if (b0Var2 != null) {
            boolean z18 = true;
            if (b0Var2 != b0Var3) {
                if (i17 == b0Var2.f184346d && str.trim().equals(b0Var2.f184343a.trim())) {
                    z17 = true;
                }
                z18 = z17;
            }
            if (z18) {
                b0Var2.f184347e = map;
            }
        }
    }

    @Override // tj5.m
    public void C3(java.lang.String str, java.lang.String str2, java.util.List list, tj5.o oVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BaseSOSWebViewUI", "onEditTextChange %s %s %s %s %s %s", str, str2, this.f184248e4, oVar, java.lang.Boolean.valueOf(this.T4), java.lang.Boolean.valueOf(this.f184247d4));
        if (this.f184247d4 && (com.tencent.mm.sdk.platformtools.t8.K0(this.f184248e4) || !this.f184248e4.contentEquals(str))) {
            this.f184247d4 = false;
        }
        if (oVar == tj5.o.UserInput || oVar == tj5.o.ClearText) {
            Y9(0, 1);
        } else if (oVar == tj5.o.SetText && this.J4.k()) {
            this.J4.r();
        }
    }

    @Override // tj5.n
    public boolean G0() {
        va(true);
        return true;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public java.lang.String G7() {
        return this.B3;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI
    public java.lang.String N9() {
        return this.J4.getInEditTextQuery();
    }

    @Override // qx4.b
    public void O5() {
        this.J4.d();
        hideVKB();
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI
    public org.json.JSONArray O9() {
        java.util.List<tj5.x> tagList = this.J4.getTagList();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator<tj5.x> it = tagList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.webview.ui.tools.fts.x xVar = (com.tencent.mm.plugin.webview.ui.tools.fts.x) it.next();
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("tagName", xVar.f184715d);
                jSONObject.put("tagType", xVar.f184716e);
                jSONObject.put("userName", xVar.f184717f);
                jSONArray.put(jSONObject);
            } catch (org.json.JSONException unused) {
            }
        }
        return jSONArray;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI
    public java.lang.String P9() {
        com.tencent.mm.plugin.websearch.widget.SOSEditTextView sOSEditTextView = this.J4;
        return sOSEditTextView != null ? sOSEditTextView.getTotalQuery() : "";
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI, com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI, com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public void R7(int i17, android.os.Bundle bundle) {
        if (i17 == 138) {
            java.lang.String string = bundle.getString("fts_key_data");
            if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                this.S4 = 0;
            } else if (ya.b.INDEX.equals(string)) {
                this.S4 = 1;
            } else if ("result".equals(string)) {
                this.S4 = 2;
            } else if ("suggestion".equals(string)) {
                this.S4 = 3;
            } else if ("teach".equals(string)) {
                this.S4 = 4;
            } else if (com.google.android.gms.common.internal.ImagesContract.LOCAL.equals(string)) {
                this.S4 = 5;
            } else if ("history".equals(string)) {
                this.S4 = 6;
            } else {
                this.S4 = 0;
            }
            this.f184253j4 = this.S4;
            return;
        }
        if (i17 == 147) {
            this.Q2.post(new com.tencent.mm.plugin.webview.ui.tools.fts.n(this, bundle.getInt("ret"), bundle.getLong("reqId"), bundle.getString("json", "")));
            return;
        }
        if (i17 != 100001) {
            if (i17 == 143) {
                this.Q2.post(new com.tencent.mm.plugin.webview.ui.tools.fts.h(this, bundle.getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA)));
                return;
            }
            if (i17 != 144) {
                switch (i17) {
                    case 60:
                        if (ga()) {
                            return;
                        }
                        com.tencent.mars.xlog.Log.w("MicroMsg.WebSearch.BaseSOSWebViewUI", "current state is not search");
                        return;
                    case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_TYPE_INITLIB /* 61 */:
                    case 62:
                        return;
                    default:
                        switch (i17) {
                            case 119:
                                this.Q2.post(new com.tencent.mm.plugin.webview.ui.tools.fts.f(this, bundle.getBundle("fts_key_data"), bundle.getString("fts_key_json_data"), bundle.getBoolean("fts_key_new_query", true), bundle.getString("fts_key_req_id")));
                                return;
                            case 120:
                                this.Q2.post(new com.tencent.mm.plugin.webview.ui.tools.fts.i(this, bundle.getInt("fts_key_ret", 0), bundle.getString("fts_key_data")));
                                return;
                            case 121:
                                o9(new com.tencent.mm.plugin.webview.ui.tools.fts.j(this, bundle.getInt("fts_key_teach_request_type", 0), bundle.getString("fts_key_json_data"), bundle.getInt("fts_key_is_cache_data", 0)));
                                return;
                            case 122:
                                java.lang.String string2 = bundle.getString("fts_key_new_query");
                                java.lang.String string3 = bundle.getString("fts_key_custom_query");
                                boolean z17 = bundle.getBoolean("fts_key_need_keyboard", false);
                                java.lang.String string4 = bundle.getString("fts_key_tag_list");
                                java.lang.String P9 = P9();
                                boolean z18 = (com.tencent.mm.sdk.platformtools.t8.K0(P9) || com.tencent.mm.sdk.platformtools.t8.K0(string2) || !P9.equals(string2)) ? false : true;
                                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BaseSOSWebViewUI", "onFTSSearchQueryChange: totalQuery: %s isInputChange %b, needSosEditTextToBeTouchOnly %b, isFromVoice %b, isNoChange %b", string2, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(this.T4), java.lang.Boolean.valueOf(this.f184247d4), java.lang.Boolean.valueOf(z18));
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                try {
                                    if (!com.tencent.mm.sdk.platformtools.t8.K0(string4)) {
                                        org.json.JSONArray jSONArray = new org.json.JSONArray(string4);
                                        for (int i18 = 0; i18 < jSONArray.length(); i18++) {
                                            org.json.JSONObject jSONObject = jSONArray.getJSONObject(i18);
                                            com.tencent.mm.plugin.webview.ui.tools.fts.x xVar = new com.tencent.mm.plugin.webview.ui.tools.fts.x(this);
                                            xVar.f184715d = jSONObject.getString("tagName");
                                            xVar.f184716e = jSONObject.getInt("tagType");
                                            xVar.f184717f = jSONObject.getString("userName");
                                            arrayList.add(xVar);
                                        }
                                    }
                                } catch (java.lang.Exception unused) {
                                }
                                if (this.J4 != null) {
                                    int size = arrayList.size();
                                    tj5.o oVar = tj5.o.UserInput;
                                    tj5.o oVar2 = tj5.o.SetText;
                                    if (size > 0) {
                                        com.tencent.mm.plugin.websearch.widget.SOSEditTextView sOSEditTextView = this.J4;
                                        if (!z17) {
                                            oVar = oVar2;
                                        }
                                        sOSEditTextView.o(string3, arrayList, oVar);
                                    } else {
                                        com.tencent.mm.plugin.websearch.widget.SOSEditTextView sOSEditTextView2 = this.J4;
                                        if (!z17) {
                                            oVar = oVar2;
                                        }
                                        sOSEditTextView2.o(string2, arrayList, oVar);
                                    }
                                }
                                if (z17) {
                                    Y9(0, 1);
                                    return;
                                }
                                com.tencent.mm.plugin.websearch.widget.SOSEditTextView sOSEditTextView3 = this.J4;
                                if (sOSEditTextView3 != null) {
                                    this.U4 = !z18 && sOSEditTextView3.k();
                                    this.J4.d();
                                    return;
                                }
                                return;
                            default:
                                switch (i17) {
                                    case 124:
                                        this.Q2.post(new com.tencent.mm.plugin.webview.ui.tools.fts.k(this, bundle.getString("fts_key_json_data")));
                                        return;
                                    case 125:
                                        this.Q2.post(new com.tencent.mm.plugin.webview.ui.tools.fts.m(this, bundle.getString("fts_key_sns_id"), bundle.getInt("fts_key_status", 0)));
                                        return;
                                    case 126:
                                        bundle.getString("fts_key_json_data");
                                        bundle.getBoolean("fts_key_new_query", true);
                                        java.util.HashMap hashMap = new java.util.HashMap();
                                        for (java.lang.String str : bundle.keySet()) {
                                            hashMap.put(str, bundle.get(str));
                                        }
                                        this.Q2.post(new com.tencent.mm.plugin.webview.ui.tools.fts.d(this, hashMap));
                                        return;
                                    case 127:
                                        o9(new com.tencent.mm.plugin.webview.ui.tools.fts.g(this, bundle.getString("fts_key_json_data"), bundle.getString("fts_key_req_id")));
                                        return;
                                    default:
                                        super.R7(i17, bundle);
                                        return;
                                }
                        }
                }
            }
        }
    }

    @Override // tj5.n
    public void U1(boolean z17) {
        if (!z17 || com.tencent.mm.sdk.platformtools.t8.K0(P9())) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BaseSOSWebViewUI", "needSosEditTextToBeTouchOnly = %s, isFromVoice = %s, isSettingTextFromJS = %s.", java.lang.Boolean.valueOf(this.T4), java.lang.Boolean.valueOf(this.f184247d4), java.lang.Boolean.valueOf(this.U4));
        if (this.T4) {
            return;
        }
        if (this.U4) {
            this.U4 = false;
        } else {
            Y9(0, 1);
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI
    public boolean X9() {
        return false;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI
    public void ba() {
        super.ba();
        try {
            java.lang.String encode = java.net.URLEncoder.encode(N9(), com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
            com.tencent.mm.autogen.mmdata.rpt.MMSearchBoxActionKvReportStruct mMSearchBoxActionKvReportStruct = new com.tencent.mm.autogen.mmdata.rpt.MMSearchBoxActionKvReportStruct();
            mMSearchBoxActionKvReportStruct.f58856d = mMSearchBoxActionKvReportStruct.b("Query", encode, true);
            mMSearchBoxActionKvReportStruct.f58858f = this.Y3;
            mMSearchBoxActionKvReportStruct.f58863k = 6010L;
            mMSearchBoxActionKvReportStruct.f58868p = mMSearchBoxActionKvReportStruct.b("SessionId", this.B3, true);
            mMSearchBoxActionKvReportStruct.f58872t = java.lang.System.currentTimeMillis();
            mMSearchBoxActionKvReportStruct.k();
            mMSearchBoxActionKvReportStruct.o();
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI, com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public com.tencent.mm.plugin.webview.core.e3 e7() {
        com.tencent.mm.plugin.webview.core.e3 e76 = super.e7();
        e76.E(this.Y4);
        return e76;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public boolean f8() {
        return true;
    }

    public boolean ga() {
        return true;
    }

    public java.lang.String ia() {
        return null;
    }

    public int ja() {
        return 0;
    }

    public java.lang.String ka() {
        return "";
    }

    public void la(java.util.List list) {
    }

    public boolean ma() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BaseSOSWebViewUI", "isBackToHistory isHomePage = %s", java.lang.Boolean.valueOf(this.N4));
        java.util.List list = this.R4;
        return list != null && ((java.util.ArrayList) list).size() > 1;
    }

    public void na() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BaseSOSWebViewUI", "onClickBackBtn isHomePage = %s", java.lang.Boolean.valueOf(this.N4));
        ua(false);
    }

    @Override // tj5.n
    public void o3(int i17, tj5.x xVar) {
        if (this.J4.k()) {
            return;
        }
        this.J4.m();
        showVKB();
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public boolean o7() {
        return false;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public void o8() {
        na();
    }

    public void oa() {
        if (!this.K4) {
            this.J4.n("", null);
        }
        hideVKB();
        this.W4 = true;
        Z9(1, 1, true, new com.tencent.mm.plugin.webview.ui.tools.fts.b(this));
        this.R4 = null;
        this.V4 = false;
        G9(vu4.a.K, vu4.b.A);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI, com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(this.f184246c4);
        java.util.HashMap hashMap = this.f184261s4;
        if (K0) {
            hashMap.put("query", N9());
        } else {
            hashMap.put("query", this.f184246c4);
        }
        hashMap.put("exittype", "4");
        ua(true);
    }

    @Override // tj5.n
    public void onClickClearTextBtn(android.view.View view) {
        com.tencent.mm.plugin.websearch.widget.SOSEditTextView sOSEditTextView = this.J4;
        if (sOSEditTextView != null) {
            if (!sOSEditTextView.k()) {
                this.J4.m();
                showVKB();
            }
            this.J4.setHint(ia());
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI, com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI, com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.K4 = getIntent().getBooleanExtra("ftsInitToSearch", false);
        this.L4 = getIntent().getBooleanExtra("ftsNeedShowCamera", true);
        this.M4 = getIntent().getBooleanExtra("need_show_query_first", false);
        this.N4 = "1".equals(((java.util.HashMap) w9()).get("isHomePage"));
        this.T4 = getIntent().getBooleanExtra("fts_need_sos_edittext_tobe_touch_only", false);
        getSupportActionBar().o();
        this.G4 = findViewById(com.tencent.mm.R.id.mfi);
        this.H4 = findViewById(com.tencent.mm.R.id.mek);
        this.I4 = findViewById(com.tencent.mm.R.id.mde);
        this.F4 = findViewById(com.tencent.mm.R.id.mel);
        com.tencent.mm.plugin.websearch.widget.SOSEditTextView sOSEditTextView = (com.tencent.mm.plugin.websearch.widget.SOSEditTextView) findViewById(com.tencent.mm.R.id.ndt);
        this.J4 = sOSEditTextView;
        sOSEditTextView.setFtsEditTextListener(this);
        this.J4.setHint(ia());
        this.J4.setCancelTextViewClickListener(new com.tencent.mm.plugin.webview.ui.tools.fts.l(this));
        if (this.J4.getEditText() != null) {
            this.J4.getEditText().setText(this.f184246c4);
        }
        this.O4 = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.aa8);
        this.P4 = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.msh);
        if (this.T4) {
            android.view.View view = this.I4;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/BaseSOSWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/fts/BaseSOSWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.J4.setFocusable(false);
            this.J4.d();
            android.view.View view2 = this.H4;
            if (view2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/BaseSOSWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/webview/ui/tools/fts/BaseSOSWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view3 = this.G4;
            if (view3 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/BaseSOSWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/webview/ui/tools/fts/BaseSOSWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.G4.setOnClickListener(new com.tencent.mm.plugin.webview.ui.tools.fts.p(this));
                this.J4.setCancelTextViewCallback(new com.tencent.mm.plugin.webview.ui.tools.fts.q(this));
            }
            this.J4.setForceDisable(true);
            this.J4.f();
            android.view.View view4 = this.F4;
            if (view4 != null) {
                view4.setBackgroundDrawable(getResources().getDrawable(com.tencent.mm.R.drawable.b3b));
            }
            if (this.J4.getSearchBarCancelTextContainer() != null) {
                this.J4.getSearchBarCancelTextContainer().postDelayed(new com.tencent.mm.plugin.webview.ui.tools.fts.r(this), 200L);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BaseSOSWebViewUI", "searchInputLayout = " + this.F4 + ", searchSosEditTextMask = " + this.G4);
        } else {
            android.view.View view5 = this.G4;
            if (view5 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/BaseSOSWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/webview/ui/tools/fts/BaseSOSWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        this.O4.setOnClickListener(new com.tencent.mm.plugin.webview.ui.tools.fts.s(this));
        this.f183815f.setOnTouchListener(new com.tencent.mm.plugin.webview.ui.tools.fts.t(this));
        if (this.R3) {
            getContentView().postDelayed(new com.tencent.mm.plugin.webview.ui.tools.fts.u(this), 128L);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BaseSOSWebViewUI", "oncreate isNeedShowCamera = " + this.L4);
        if (!this.L4) {
            this.J4.setNeedForceHideCameraIcon(true);
            this.J4.setCommonRightImageButtonVisibile(8);
        }
        com.tencent.mm.plugin.webview.ui.tools.s7 s7Var = this.f183804a3;
        if (s7Var != null) {
            s7Var.e(true);
        }
        int i17 = this.H3;
        if (i17 == 1) {
            this.J4.getEditText().setHintTextColor(i65.a.d(this, com.tencent.mm.R.color.BW_100_Alpha_0_3));
            this.J4.getEditText().setTextColor(i65.a.d(this, com.tencent.mm.R.color.BW_100_Alpha_0_8));
        } else if (i17 == 2) {
            this.J4.getEditText().setHintTextColor(i65.a.d(this, com.tencent.mm.R.color.UN_BW_0_Alpha_0_3));
            this.J4.getEditText().setTextColor(i65.a.d(this, com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI, com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI, com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        try {
            if (this.K1 != null) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putInt("webview_id", hashCode());
                this.K1.U6(1, bundle);
            }
        } catch (android.os.RemoteException unused) {
        }
        hideVKB();
        com.tencent.mm.plugin.webview.core.e3 e3Var = this.L1;
        com.tencent.mm.plugin.webview.ui.tools.fts.a0 a0Var = this.Y4;
        e3Var.M0(a0Var);
        this.L1.K0(a0Var.f184333b);
        super.onDestroy();
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI, com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI, com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    public void pa() {
    }

    public void qa() {
    }

    public void ra() {
    }

    public void sa() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BaseSOSWebViewUI", "onWebViewPageLoaded %b", java.lang.Boolean.valueOf(this.A3));
    }

    public void ta() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BaseSOSWebViewUI", "onWebViewPageStartLoad");
    }

    public void ua(boolean z17) {
        hideVKB();
        Q9();
        if (ma()) {
            ((java.util.ArrayList) this.R4).remove(0);
            com.tencent.mm.plugin.webview.ui.tools.fts.b0 b0Var = (com.tencent.mm.plugin.webview.ui.tools.fts.b0) ((java.util.ArrayList) this.R4).get(0);
            this.J4.n(b0Var.f184344b, b0Var.f184345c);
            this.Q2.post(new com.tencent.mm.plugin.webview.ui.tools.fts.a(this, b0Var));
            return;
        }
        java.util.List list = this.R4;
        if ((list == null || ((java.util.ArrayList) list).size() <= 1) && this.G3 && !this.J4.getTotalQuery().isEmpty()) {
            java.util.List list2 = this.R4;
            if (list2 != null && !((java.util.ArrayList) list2).isEmpty()) {
                ((java.util.ArrayList) this.R4).clear();
            }
            this.J4.setForceShowClearBtn(false);
            this.J4.e();
            this.J4.d();
            return;
        }
        if (!this.V4) {
            if (z17) {
                G9(vu4.a.K, vu4.b.f440273w);
            } else {
                G9(vu4.a.K, vu4.b.f440275y);
            }
            finish();
            return;
        }
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(this.f184246c4);
        java.util.HashMap hashMap = this.f184261s4;
        if (K0) {
            hashMap.put("query", N9());
        } else {
            hashMap.put("query", this.f184246c4);
        }
        hashMap.put("exittype", "3");
        oa();
    }

    public void va(boolean z17) {
        int i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BaseSOSWebViewUI", "shouldReturnStartSearch, isKeyBoardSearch: ".concat(z17 ? "YES" : "NO"));
        this.J4.d();
        hideVKB();
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.J4.getRecommendSearchHint()) || P9().length() > 0) {
            i17 = 0;
        } else {
            com.tencent.mm.plugin.websearch.widget.SOSEditTextView sOSEditTextView = this.J4;
            sOSEditTextView.n(sOSEditTextView.getRecommendSearchHint(), this.J4.getTagList());
            i17 = 1;
        }
        if (P9().length() > 0) {
            this.Q2.post(new com.tencent.mm.plugin.webview.ui.tools.fts.c(this, i17, z17));
            hideVKB();
            this.V4 = true;
        }
    }
}
