package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class FTSWeAppBaseWebViewUI extends com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI implements tj5.y, tj5.n, tj5.l {
    public tj5.z F4;
    public android.view.View G4;
    public android.view.View H4;
    public int I4;
    public boolean J4;
    public int K4;
    public boolean L4;
    public boolean M4;
    public boolean N4;
    public boolean O4;
    public final java.util.LinkedList P4 = new java.util.LinkedList();
    public boolean Q4 = true;
    public int R4 = 0;
    public boolean S4 = true;
    public boolean T4 = false;
    public final com.tencent.mm.plugin.webview.ui.tools.fts.b4 U4 = new com.tencent.mm.plugin.webview.ui.tools.fts.b4(this, null);
    public boolean V4 = false;

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI
    public void B9(int i17, java.lang.String str, java.util.Map map) {
        java.util.LinkedList linkedList = this.P4;
        linkedList.remove(str);
        linkedList.add(str);
        if (linkedList != null) {
            linkedList.size();
            if (linkedList.size() > 1 || this.N4 || this.O4) {
                this.F4.setCancelBtnVisible(0);
            }
        }
    }

    @Override // tj5.m
    public void C3(java.lang.String str, java.lang.String str2, java.util.List list, tj5.o oVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSWeAppBaseWebViewUI", "onEditTextChange %s %s %s", str, str2, oVar);
        if (oVar == tj5.o.UserInput || oVar == tj5.o.ClearText) {
            Y9(0, 1);
        }
    }

    @Override // tj5.n
    public boolean G0() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSWeAppBaseWebViewUI", "onSearchKeyDown");
        ja();
        return false;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI
    public java.lang.String N9() {
        return this.F4.getFtsEditText().getInEditTextQuery();
    }

    @Override // qx4.b
    public void O5() {
        this.F4.getFtsEditText().d();
        hideVKB();
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI
    public org.json.JSONArray O9() {
        java.util.List<tj5.x> tagList = this.F4.getFtsEditText().getTagList();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator<tj5.x> it = tagList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.webview.ui.tools.fts.z3 z3Var = (com.tencent.mm.plugin.webview.ui.tools.fts.z3) it.next();
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("tagName", z3Var.f184740d);
                jSONObject.put("tagType", z3Var.f184741e);
                jSONObject.put("userName", z3Var.f184742f);
                jSONArray.put(jSONObject);
            } catch (org.json.JSONException unused) {
            }
        }
        return jSONArray;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI
    public java.lang.String P9() {
        return this.F4.getFtsEditText().getTotalQuery();
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI, com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI, com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public void R7(int i17, android.os.Bundle bundle) {
        if (i17 != 144) {
            if (i17 == 147) {
                this.Q2.post(new com.tencent.mm.plugin.webview.ui.tools.fts.l3(this, bundle.getInt("ret"), bundle.getLong("reqId"), bundle.getString("json", "")));
                return;
            }
            if (i17 != 154) {
                if (i17 != 100001) {
                    switch (i17) {
                        case 60:
                        case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_TYPE_INITLIB /* 61 */:
                        case 62:
                            return;
                        default:
                            switch (i17) {
                                case 119:
                                    o9(new com.tencent.mm.plugin.webview.ui.tools.fts.v3(this, bundle.getBundle("fts_key_data"), bundle.getString("fts_key_json_data"), bundle.getBoolean("fts_key_new_query", true), bundle.getString("fts_key_req_id")));
                                    return;
                                case 120:
                                    this.Q2.post(new com.tencent.mm.plugin.webview.ui.tools.fts.w3(this, bundle.getInt("fts_key_ret", 0), bundle.getString("fts_key_data")));
                                    return;
                                case 121:
                                    o9(new com.tencent.mm.plugin.webview.ui.tools.fts.x3(this, bundle.getInt("fts_key_teach_request_type", 0), bundle.getString("fts_key_json_data"), bundle.getInt("fts_key_is_cache_data", 0)));
                                    return;
                                case 122:
                                    java.lang.String string = bundle.getString("fts_key_new_query");
                                    java.lang.String string2 = bundle.getString("fts_key_custom_query");
                                    boolean z17 = bundle.getBoolean("fts_key_need_keyboard", false);
                                    java.lang.String string3 = bundle.getString("fts_key_tag_list");
                                    boolean z18 = bundle.getBoolean("fts_key_cache", false);
                                    java.lang.String P9 = P9();
                                    boolean z19 = (com.tencent.mm.sdk.platformtools.t8.K0(P9) || com.tencent.mm.sdk.platformtools.t8.K0(string) || !P9.equals(string)) ? false : true;
                                    com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSWeAppBaseWebViewUI", "onFTSSearchQueryChange: totalQuery: %s isInputChange: %b isNoChange: %b", string, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z19));
                                    java.util.ArrayList arrayList = new java.util.ArrayList();
                                    try {
                                        if (!com.tencent.mm.sdk.platformtools.t8.K0(string3)) {
                                            org.json.JSONArray jSONArray = new org.json.JSONArray(string3);
                                            for (int i18 = 0; i18 < jSONArray.length(); i18++) {
                                                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i18);
                                                com.tencent.mm.plugin.webview.ui.tools.fts.z3 z3Var = new com.tencent.mm.plugin.webview.ui.tools.fts.z3(this);
                                                z3Var.f184740d = jSONObject.getString("tagName");
                                                z3Var.f184741e = jSONObject.getInt("tagType");
                                                z3Var.f184742f = jSONObject.getString("userName");
                                                arrayList.add(z3Var);
                                            }
                                        }
                                    } catch (java.lang.Exception unused) {
                                    }
                                    if (this.F4 != null) {
                                        int size = arrayList.size();
                                        tj5.o oVar = tj5.o.UserInput;
                                        tj5.o oVar2 = tj5.o.SetText;
                                        if (size > 0) {
                                            com.tencent.mm.ui.search.FTSEditTextView ftsEditText = this.F4.getFtsEditText();
                                            if (!z17) {
                                                oVar = oVar2;
                                            }
                                            ftsEditText.o(string2, arrayList, oVar);
                                            if (z18) {
                                                B9(0, string2, null);
                                            }
                                        } else {
                                            com.tencent.mm.ui.search.FTSEditTextView ftsEditText2 = this.F4.getFtsEditText();
                                            if (!z17) {
                                                oVar = oVar2;
                                            }
                                            ftsEditText2.o(string, arrayList, oVar);
                                            if (z18) {
                                                B9(0, string, null);
                                            }
                                        }
                                    }
                                    if (z17) {
                                        Y9(0, 1);
                                        return;
                                    }
                                    tj5.z zVar = this.F4;
                                    if (zVar != null) {
                                        this.T4 = !z19 && zVar.getFtsEditText().k();
                                        this.F4.getFtsEditText().d();
                                        T9(java.lang.Boolean.FALSE);
                                        return;
                                    }
                                    return;
                                default:
                                    switch (i17) {
                                        case 124:
                                            this.Q2.post(new com.tencent.mm.plugin.webview.ui.tools.fts.y3(this, bundle.getString("fts_key_json_data")));
                                            return;
                                        case 125:
                                            this.Q2.post(new com.tencent.mm.plugin.webview.ui.tools.fts.k3(this, bundle.getString("fts_key_sns_id"), bundle.getInt("fts_key_status", 0)));
                                            return;
                                        case 126:
                                            bundle.getString("fts_key_json_data");
                                            bundle.getBoolean("fts_key_new_query", true);
                                            java.util.HashMap hashMap = new java.util.HashMap();
                                            for (java.lang.String str : bundle.keySet()) {
                                                hashMap.put(str, bundle.get(str));
                                            }
                                            this.Q2.post(new com.tencent.mm.plugin.webview.ui.tools.fts.u3(this, hashMap));
                                            return;
                                    }
                            }
                    }
                }
                return;
            }
            if (bundle.getString("fts_key_data", "").equals("configNavBar")) {
                java.lang.String string4 = bundle.getString("recommendSearchQuery", "");
                if (com.tencent.mm.sdk.platformtools.t8.K0(string4)) {
                    this.F4.getFtsEditText().setRecommendSearchHint("");
                    this.F4.getFtsEditText().setHint(ga());
                } else {
                    this.F4.getFtsEditText().setRecommendSearchHint(string4);
                }
            }
            super.R7(i17, bundle);
        }
    }

    @Override // tj5.n
    public void U1(boolean z17) {
        if (z17) {
            if (this.T4) {
                this.T4 = false;
            } else {
                Y9(0, 1);
            }
        }
    }

    @Override // tj5.l
    public boolean Y3(android.view.View view) {
        ja();
        return false;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI, com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public com.tencent.mm.plugin.webview.core.e3 e7() {
        com.tencent.mm.plugin.webview.core.e3 e76 = super.e7();
        e76.E(this.U4);
        return e76;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public boolean f8() {
        return true;
    }

    public java.lang.String ga() {
        return null;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bdd;
    }

    public final boolean ha() {
        java.util.LinkedList linkedList = this.P4;
        if (linkedList.size() > 1) {
            linkedList.removeLast();
            this.F4.getFtsEditText().n((java.lang.String) linkedList.getLast(), null);
            this.F4.getFtsEditText().d();
            this.F4.setCancelBtnVisible(0);
            hideVKB();
            this.Q2.post(new com.tencent.mm.plugin.webview.ui.tools.fts.t3(this, 1));
            return false;
        }
        if (!this.G3 || this.F4.getFtsEditText().getTotalQuery().isEmpty()) {
            hideVKB();
            finish();
            return true;
        }
        if (!linkedList.isEmpty()) {
            linkedList.removeLast();
        }
        this.F4.getFtsEditText().e();
        this.F4.getFtsEditText().d();
        return false;
    }

    public void ia() {
        this.F4.getFtsEditText().n("", null);
        Z9(1, 1, true, null);
        this.F4.getFtsEditText().d();
        hideVKB();
        G9(vu4.a.K, vu4.b.A);
    }

    public final void ja() {
        tj5.z zVar = this.F4;
        if (zVar != null && zVar.getFtsEditText() != null) {
            this.F4.getFtsEditText().d();
            this.F4.getFtsEditText().v(false);
        }
        hideVKB();
        this.Q2.post(new com.tencent.mm.plugin.webview.ui.tools.fts.t3(this, 0));
    }

    @Override // tj5.n
    public void o3(int i17, tj5.x xVar) {
        if (this.F4.getFtsEditText().k()) {
            return;
        }
        this.F4.getFtsEditText().m();
        showVKB();
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public boolean o7() {
        return false;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public void o8() {
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(this.f184246c4);
        java.util.HashMap hashMap = this.f184261s4;
        if (K0) {
            hashMap.put("query", N9());
        } else {
            hashMap.put("query", this.f184246c4);
        }
        hashMap.put("exittype", "4");
        ha();
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI, com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 800) {
            this.F4.setCancelBtnVisible(0);
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI, com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (ha()) {
            boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(this.f184246c4);
            java.util.HashMap hashMap = this.f184261s4;
            if (K0) {
                hashMap.put("query", N9());
            } else {
                hashMap.put("query", this.f184246c4);
            }
            hashMap.put("exittype", "4");
            super.onBackPressed();
        }
    }

    @Override // tj5.y
    public void onClickBackBtn(android.view.View view) {
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(this.f184246c4);
        java.util.HashMap hashMap = this.f184261s4;
        if (K0) {
            hashMap.put("query", N9());
        } else {
            hashMap.put("query", this.f184246c4);
        }
        hashMap.put("exittype", "3");
        ha();
    }

    @Override // tj5.y
    public void onClickCancelBtn(android.view.View view) {
        if (this.V4) {
            return;
        }
        this.V4 = true;
        com.tencent.mm.ui.search.WeAppWebSearchView weAppWebSearchView = (com.tencent.mm.ui.search.WeAppWebSearchView) this.F4;
        float x17 = weAppWebSearchView.getX();
        float y17 = weAppWebSearchView.getY();
        float scaleX = weAppWebSearchView.getScaleX();
        float scaleY = weAppWebSearchView.getScaleY();
        float translationX = weAppWebSearchView.getTranslationX();
        float translationY = weAppWebSearchView.getTranslationY();
        int measuredWidth = weAppWebSearchView.getMeasuredWidth();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(weAppWebSearchView, "scaleY", 1.0f, 0.7f);
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(measuredWidth, 200);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSWeAppBaseWebViewUI", "ljd x:%f, transX:%f, originalWidth:%d", java.lang.Float.valueOf(x17), java.lang.Float.valueOf(translationX), java.lang.Integer.valueOf(measuredWidth));
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(weAppWebSearchView, "translationX", measuredWidth + org.chromium.net.NetError.ERR_CERT_COMMON_NAME_INVALID);
        arrayList.add(ofFloat);
        arrayList.add(ofInt);
        arrayList.add(ofFloat2);
        ofInt.addUpdateListener(new com.tencent.mm.plugin.webview.ui.tools.fts.m3(this, measuredWidth, weAppWebSearchView));
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(300L);
        animatorSet.addListener(new com.tencent.mm.plugin.webview.ui.tools.fts.o3(this, weAppWebSearchView, scaleX, scaleY, x17, y17, translationX, translationY, measuredWidth));
        animatorSet.start();
    }

    @Override // tj5.n
    public void onClickClearTextBtn(android.view.View view) {
        tj5.z zVar = this.F4;
        if (zVar != null) {
            if (!zVar.getFtsEditText().k()) {
                this.F4.getFtsEditText().m();
            }
            this.F4.getFtsEditText().setHint(ga());
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI, com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI, com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        boolean booleanExtra = getIntent().getBooleanExtra("ftsForceShowDarkMode", false);
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_page_support_force_night_mode, 1) == 1;
        this.J4 = booleanExtra && z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSWeAppBaseWebViewUI", "isOpenForceNightMode = %s， showDarkMode = %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(booleanExtra));
        super.onCreate(bundle);
        if (getSupportActionBar() != null) {
            getSupportActionBar().o();
        }
        int i17 = com.tencent.mm.ui.search.FTSEditTextView.I;
        this.Q4 = j62.e.g().i("clicfg_websearch_input_back_btn", 0, true, true) == 0;
        this.R4 = com.tencent.mm.ui.search.FTSEditTextView.getSearchInputType();
        this.S4 = j62.e.g().i("clicfg_websearch_input_cancel_btn", 1, true, true) == 1;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Boolean.valueOf(this.Q4);
        objArr[1] = java.lang.Boolean.valueOf(this.R4 == 0);
        objArr[2] = java.lang.Boolean.valueOf(this.S4);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSWeAppBaseWebViewUI", "initData, isSearchInputBackLast = %s, isSearchInputTypeOld = %s, isSearchInputShowCancel = %s.", objArr);
        this.G4 = findViewById(com.tencent.mm.R.id.ggf);
        java.lang.String stringExtra = getIntent().getStringExtra("ftsQuery");
        if (stringExtra == null) {
            stringExtra = "";
        }
        java.lang.String trim = stringExtra.trim();
        this.K4 = getIntent().getIntExtra("ftsbizscene", 0);
        this.I4 = getIntent().getIntExtra("ftsType", 0);
        this.L4 = getIntent().getBooleanExtra("ftscaneditable", true);
        this.M4 = getIntent().getBooleanExtra("key_hide_cancel_btn", false);
        getIntent().getBooleanExtra("key_from_whole_search", true);
        this.N4 = getIntent().getBooleanExtra("ftsismorebutton", false);
        this.O4 = getIntent().getBooleanExtra("ftsisshowcancel", false);
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f183815f;
        if (mMWebView != null) {
            mMWebView.setOnTouchListener(new com.tencent.mm.plugin.webview.ui.tools.fts.p3(this));
        }
        tj5.z zVar = (tj5.z) findViewById(com.tencent.mm.R.id.phy);
        this.F4 = zVar;
        zVar.setVisible(8);
        com.tencent.mm.ui.search.WeAppWebSearchView weAppWebSearchView = new com.tencent.mm.ui.search.WeAppWebSearchView(this, !com.tencent.mm.ui.bk.C());
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.ajj);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, dimensionPixelOffset);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this);
        linearLayout.addView(weAppWebSearchView, layoutParams);
        ((android.widget.RelativeLayout) this.G4).addView(linearLayout, new android.widget.RelativeLayout.LayoutParams(-1, dimensionPixelOffset));
        if (com.tencent.mm.ui.bk.C()) {
            this.f183815f.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.ael));
            weAppWebSearchView.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.ael));
            linearLayout.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.ael));
            weAppWebSearchView.searchContainer.setBackgroundResource(com.tencent.mm.R.drawable.cqc);
        } else {
            this.f183815f.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.a9e));
            this.G4.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.aem));
            weAppWebSearchView.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.aem));
            linearLayout.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.aem));
            weAppWebSearchView.searchContainer.setBackgroundResource(com.tencent.mm.R.drawable.cqd);
        }
        weAppWebSearchView.mCancelBtn.setTextColor(getResources().getColorStateList(com.tencent.mm.R.color.aek));
        this.F4 = weAppWebSearchView;
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f487336oc0);
        this.H4 = findViewById;
        if (this.L4) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSWeAppBaseWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSWeAppBaseWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.F4.setSearchViewListener(this);
            this.F4.getFtsEditText().setHint(ga());
            this.F4.getFtsEditText().setFtsEditTextListener(this);
            this.F4.getFtsEditText().setActionSearchDoneListener(this);
            if (this.M4) {
                this.F4.setCancelBtnVisible(8);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(trim)) {
                this.F4.getFtsEditText().n(trim, null);
                java.util.LinkedList linkedList = this.P4;
                linkedList.remove(trim);
                linkedList.add(trim);
            }
            if (this.R3) {
                this.F4.getFtsEditText().m();
                this.F4.getFtsEditText().t();
            }
            if (getIntent().getBooleanExtra("key_change_search_icon", false)) {
                this.F4.getFtsEditText().getIconView().setImageDrawable(M9(this.I4));
                this.F4.getFtsEditText().getIconView().setIconColor(getResources().getColor(com.tencent.mm.R.color.FG_2));
            }
            if (this.N4 || this.O4) {
                this.F4.setCancelBtnVisible(0);
            }
        } else {
            this.F4.setVisible(8);
            if (this.K4 == 130) {
                android.view.View view = this.H4;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSWeAppBaseWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSWeAppBaseWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.f183865w.getLayoutParams();
                marginLayoutParams.topMargin = 0;
                this.f183865w.setLayoutParams(marginLayoutParams);
            } else {
                java.lang.String stringExtra2 = getIntent().getStringExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
                    ((android.widget.TextView) findViewById(com.tencent.mm.R.id.aaf)).setText(stringExtra2);
                }
                findViewById(com.tencent.mm.R.id.aa8).setOnClickListener(new com.tencent.mm.plugin.webview.ui.tools.fts.q3(this));
            }
        }
        if (this.J4) {
            android.view.View view2 = this.G4;
            if (view2 != null) {
                view2.setBackgroundColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478512u));
            }
            android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.aa8);
            if (findViewById2 instanceof com.tencent.mm.ui.widget.imageview.WeImageView) {
                ((com.tencent.mm.ui.widget.imageview.WeImageView) findViewById2).setIconColor(getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8));
            }
            android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.aaf);
            if (textView != null) {
                textView.setTextColor(getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_9));
            }
            android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.f485075rq1);
            if (findViewById3 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSWeAppBaseWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSWeAppBaseWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (this.F4.getFtsEditText() != null) {
                this.F4.getFtsEditText().setTextColor(getResources().getColor(com.tencent.mm.R.color.by));
                this.F4.getFtsEditText().setHintColor(getResources().getColor(com.tencent.mm.R.color.f478810hv));
                this.F4.getFtsEditText().getTagPanel().setBackgroundResource(com.tencent.mm.R.drawable.f481850ae3);
            }
            if (this.F4.getCancelBtn() != null) {
                this.F4.getCancelBtn().setTextColor(getResources().getColor(com.tencent.mm.R.color.f478548ai));
            }
        }
        showOptionMenu(false);
        com.tencent.mm.plugin.webview.ui.tools.s7 s7Var = this.f183804a3;
        if (s7Var != null) {
            s7Var.e(true);
        }
        com.tencent.mm.ui.widget.MMWebView mMWebView2 = this.f183815f;
        if (mMWebView2 != null) {
            mMWebView2.setOnLongClickListener(new com.tencent.mm.plugin.webview.ui.tools.fts.r3(this));
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
        com.tencent.mm.plugin.webview.ui.tools.fts.b4 b4Var = this.U4;
        e3Var.M0(b4Var);
        this.L1.K0(b4Var.f184355b);
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

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public int r7() {
        return com.tencent.mm.R.raw.actionbar_icon_dark_back;
    }
}
