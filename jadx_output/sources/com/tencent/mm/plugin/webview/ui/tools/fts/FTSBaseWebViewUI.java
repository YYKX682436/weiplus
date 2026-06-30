package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class FTSBaseWebViewUI extends com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI implements tj5.y, tj5.n, tj5.l {
    public com.tencent.mm.ui.search.WebSearchView F4;
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
    public final com.tencent.mm.plugin.webview.ui.tools.fts.h1 U4 = new com.tencent.mm.plugin.webview.ui.tools.fts.h1(this, null);

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI
    public void B9(int i17, java.lang.String str, java.util.Map map) {
        ga(str, i17);
        java.util.LinkedList linkedList = this.P4;
        if (linkedList != null) {
            linkedList.size();
            if (linkedList.size() > 1 || this.N4 || this.O4) {
                this.F4.setCancelBtnVisible(0);
            } else {
                this.F4.setCancelBtnVisible(8);
            }
        }
    }

    public void C3(java.lang.String str, java.lang.String str2, java.util.List list, tj5.o textChangeStatus) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSBaseWebViewUI", "onEditTextChange %s %s %s, %s %s", str, str2, textChangeStatus, P9(), N9());
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSBaseWebViewUI", "[hitest] onEditTextChange, textChangeStatus=%s, isSettingTextFromJS=%s", textChangeStatus, java.lang.Boolean.valueOf(this.T4));
        tj5.o oVar = tj5.o.UserInput;
        if (textChangeStatus != oVar && textChangeStatus != tj5.o.ClearText) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSBaseWebViewUI", "[hitest] onEditTextChange SKIPPED notifySearchInputChange, textChangeStatus=%s", textChangeStatus);
            return;
        }
        if (!this.K3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSBaseWebViewUI", "[hitest] onEditTextChange -> notifySearchInputChange(0, 1)");
            Y9(0, 1);
            return;
        }
        androidx.appcompat.app.AppCompatActivity activity = getContext();
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.webview.ui.tools.fts.uic.FTSFlutterSearchUIC fTSFlutterSearchUIC = (com.tencent.mm.plugin.webview.ui.tools.fts.uic.FTSFlutterSearchUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.webview.ui.tools.fts.uic.FTSFlutterSearchUIC.class);
        java.lang.String totalText = P9();
        java.lang.String inEditText = N9();
        fTSFlutterSearchUIC.getClass();
        kotlin.jvm.internal.o.g(totalText, "totalText");
        kotlin.jvm.internal.o.g(inEditText, "inEditText");
        kotlin.jvm.internal.o.g(textChangeStatus, "textChangeStatus");
        com.tencent.mars.xlog.Log.i("MicroMsg.hitest.FTSFlutterSearchUIC", "onEditTextChange, totalText: " + totalText + ", inEditText: " + inEditText + ", textChangeStatus: " + textChangeStatus);
        long j17 = fTSFlutterSearchUIC.f184643g;
        tg0.r1 r1Var = fTSFlutterSearchUIC.f184644h;
        if (textChangeStatus == oVar) {
            if (!(totalText.length() == 0)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showFlutterAndShowSug visibility ");
                android.view.ViewGroup viewGroup = fTSFlutterSearchUIC.f184641e;
                sb6.append(viewGroup != null ? java.lang.Integer.valueOf(viewGroup.getVisibility()) : null);
                sb6.append(" flutterInit ");
                sb6.append(fTSFlutterSearchUIC.f184642f);
                sb6.append(" totalText ");
                sb6.append(totalText);
                sb6.append(" inEditText ");
                sb6.append(inEditText);
                com.tencent.mars.xlog.Log.i("MicroMsg.hitest.FTSFlutterSearchUIC", sb6.toString());
                if (!fTSFlutterSearchUIC.f184642f) {
                    fTSFlutterSearchUIC.U6(totalText, true, false, null);
                    ((sg0.w2) r1Var).mj(totalText, inEditText, java.lang.Long.valueOf(j17));
                    return;
                }
                sg0.w2 w2Var = (sg0.w2) r1Var;
                w2Var.mj(totalText, inEditText, java.lang.Long.valueOf(j17));
                w2Var.nj(true, java.lang.Long.valueOf(j17));
                android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
                java.lang.Runnable runnable = fTSFlutterSearchUIC.f184648o;
                handler.removeCallbacks(runnable);
                if (!(totalText.length() > 0)) {
                    if (!(inEditText.length() > 0)) {
                        return;
                    }
                }
                fTSFlutterSearchUIC.f184647n = true;
                new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(runnable, 1000L);
                return;
            }
        }
        ((sg0.w2) r1Var).mj("", "", java.lang.Long.valueOf(j17));
        ((yg0.o3) ((tg0.l1) i95.n0.c(tg0.l1.class))).aj(8);
        fTSFlutterSearchUIC.T6();
    }

    public boolean G0() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSBaseWebViewUI", "onSearchKeyDown");
        ka();
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
            com.tencent.mm.plugin.webview.ui.tools.fts.f1 f1Var = (com.tencent.mm.plugin.webview.ui.tools.fts.f1) it.next();
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("tagName", f1Var.f184407d);
                jSONObject.put("tagType", f1Var.f184408e);
                jSONObject.put("userName", f1Var.f184409f);
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
    public void R7(int i17, android.os.Bundle data) {
        if (i17 != 144) {
            if (i17 == 147) {
                this.Q2.post(new com.tencent.mm.plugin.webview.ui.tools.fts.u0(this, data.getInt("ret"), data.getLong("reqId"), data.getString("json", "")));
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
                                    com.tencent.mm.plugin.webview.ui.tools.fts.l4 l4Var = this.J3;
                                    if (l4Var != null) {
                                        kotlin.jvm.internal.o.g(data, "data");
                                        if (((ch0.j) l4Var).f41228a.a(119, data)) {
                                            return;
                                        }
                                    }
                                    o9(new com.tencent.mm.plugin.webview.ui.tools.fts.b1(this, data.getBundle("fts_key_data"), data.getString("fts_key_json_data"), data.getBoolean("fts_key_new_query", true), data.getString("fts_key_req_id")));
                                    return;
                                case 120:
                                    this.Q2.post(new com.tencent.mm.plugin.webview.ui.tools.fts.c1(this, data.getInt("fts_key_ret", 0), data.getString("fts_key_data")));
                                    return;
                                case 121:
                                    o9(new com.tencent.mm.plugin.webview.ui.tools.fts.d1(this, data.getInt("fts_key_teach_request_type", 0), data.getString("fts_key_json_data"), data.getInt("fts_key_is_cache_data", 0)));
                                    return;
                                case 122:
                                    java.lang.String string = data.getString("fts_key_new_query");
                                    java.lang.String string2 = data.getString("fts_key_custom_query");
                                    boolean z17 = data.getBoolean("fts_key_need_keyboard", false);
                                    java.lang.String string3 = data.getString("fts_key_tag_list");
                                    boolean z18 = data.getBoolean("fts_key_cache", false);
                                    java.lang.String P9 = P9();
                                    boolean z19 = (com.tencent.mm.sdk.platformtools.t8.K0(P9) || com.tencent.mm.sdk.platformtools.t8.K0(string) || !P9.equals(string)) ? false : true;
                                    com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSBaseWebViewUI", "onFTSSearchQueryChange: totalQuery: %s isInputChange: %b isNoChange: %b", string, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z19));
                                    java.lang.Object[] objArr = new java.lang.Object[5];
                                    objArr[0] = string;
                                    objArr[1] = java.lang.Boolean.valueOf(z17);
                                    objArr[2] = java.lang.Boolean.valueOf(z19);
                                    com.tencent.mm.ui.search.WebSearchView webSearchView = this.F4;
                                    objArr[3] = webSearchView != null ? java.lang.Boolean.valueOf(webSearchView.getFtsEditText().k()) : "null";
                                    objArr[4] = java.lang.Boolean.valueOf(this.T4);
                                    com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSBaseWebViewUI", "[hitest] AC_ON_FTS_SEARCH_QUERY_CHANGE, query=%s, isInputChange=%s, isNoChange=%s, hasFocus=%s, isSettingTextFromJS=%s", objArr);
                                    java.util.ArrayList arrayList = new java.util.ArrayList();
                                    try {
                                        if (!com.tencent.mm.sdk.platformtools.t8.K0(string3)) {
                                            org.json.JSONArray jSONArray = new org.json.JSONArray(string3);
                                            for (int i18 = 0; i18 < jSONArray.length(); i18++) {
                                                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i18);
                                                com.tencent.mm.plugin.webview.ui.tools.fts.f1 f1Var = new com.tencent.mm.plugin.webview.ui.tools.fts.f1(this);
                                                f1Var.f184407d = jSONObject.getString("tagName");
                                                f1Var.f184408e = jSONObject.getInt("tagType");
                                                f1Var.f184409f = jSONObject.getString("userName");
                                                arrayList.add(f1Var);
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
                                        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSBaseWebViewUI", "[hitest] AC_ON_FTS_SEARCH_QUERY_CHANGE isInputChange=true -> notifySearchInputChange(0, 1)");
                                        Y9(0, 1);
                                        return;
                                    }
                                    com.tencent.mm.ui.search.WebSearchView webSearchView2 = this.F4;
                                    if (webSearchView2 != null) {
                                        boolean z27 = !z19 && webSearchView2.getFtsEditText().k();
                                        this.T4 = z27;
                                        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSBaseWebViewUI", "[hitest] AC_ON_FTS_SEARCH_QUERY_CHANGE isInputChange=false, isSettingTextFromJS=%s, about to clearEditTextFocus", java.lang.Boolean.valueOf(z27));
                                        this.F4.getFtsEditText().d();
                                        T9(java.lang.Boolean.FALSE);
                                        return;
                                    }
                                    return;
                                default:
                                    switch (i17) {
                                        case 124:
                                            this.Q2.post(new com.tencent.mm.plugin.webview.ui.tools.fts.e1(this, data.getString("fts_key_json_data")));
                                            return;
                                        case 125:
                                            this.Q2.post(new com.tencent.mm.plugin.webview.ui.tools.fts.t0(this, data.getString("fts_key_sns_id"), data.getInt("fts_key_status", 0)));
                                            return;
                                        case 126:
                                            data.getString("fts_key_json_data");
                                            data.getBoolean("fts_key_new_query", true);
                                            java.util.HashMap hashMap = new java.util.HashMap();
                                            for (java.lang.String str : data.keySet()) {
                                                hashMap.put(str, data.get(str));
                                            }
                                            this.Q2.post(new com.tencent.mm.plugin.webview.ui.tools.fts.a1(this, hashMap));
                                            return;
                                    }
                            }
                    }
                }
                return;
            }
            if (data.getString("fts_key_data", "").equals("configNavBar")) {
                java.lang.String string4 = data.getString("recommendSearchQuery", "");
                if (com.tencent.mm.sdk.platformtools.t8.K0(string4)) {
                    this.F4.getFtsEditText().setRecommendSearchHint("");
                    this.F4.getFtsEditText().setHint(ha());
                } else {
                    this.F4.getFtsEditText().setRecommendSearchHint(string4);
                }
            }
            super.R7(i17, data);
        }
    }

    @Override // tj5.n
    public void U1(boolean z17) {
        if (!this.K3) {
            if (z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSBaseWebViewUI", "onEditTextFocusChange, query = %s, isFromVoice = %s, isSettingTextFromJS = %s.", P9(), java.lang.Boolean.valueOf(this.f184247d4), java.lang.Boolean.valueOf(this.T4));
                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSBaseWebViewUI", "[hitest] onEditTextFocusChange hasFocus=true, isSettingTextFromJS=%s, query=%s", java.lang.Boolean.valueOf(this.T4), P9());
                if (this.T4) {
                    this.T4 = false;
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSBaseWebViewUI", "[hitest] onEditTextFocusChange SKIPPED (isSettingTextFromJS was true), reset to false");
                    return;
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSBaseWebViewUI", "[hitest] onEditTextFocusChange -> notifySearchInputChange(0, 1)");
                    Y9(0, 1);
                    return;
                }
            }
            return;
        }
        androidx.appcompat.app.AppCompatActivity activity = getContext();
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.webview.ui.tools.fts.uic.FTSFlutterSearchUIC fTSFlutterSearchUIC = (com.tencent.mm.plugin.webview.ui.tools.fts.uic.FTSFlutterSearchUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.webview.ui.tools.fts.uic.FTSFlutterSearchUIC.class);
        fTSFlutterSearchUIC.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.hitest.FTSFlutterSearchUIC", "onEditTextFocusChange, hasFocus: " + z17);
        if (z17) {
            androidx.appcompat.app.AppCompatActivity activity2 = fTSFlutterSearchUIC.getActivity();
            kotlin.jvm.internal.o.e(activity2, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.fts.MMFTSSearchTabWebViewUI");
            if (((com.tencent.mm.plugin.webview.ui.tools.fts.MMFTSSearchTabWebViewUI) activity2).M3) {
                androidx.appcompat.app.AppCompatActivity activity3 = fTSFlutterSearchUIC.getActivity();
                kotlin.jvm.internal.o.e(activity3, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.fts.MMFTSSearchTabWebViewUI");
                ((com.tencent.mm.plugin.webview.ui.tools.fts.MMFTSSearchTabWebViewUI) activity3).fa(-1.0f, 1.0f, 300, false);
            }
        }
        android.view.ViewGroup viewGroup = fTSFlutterSearchUIC.f184641e;
        if (viewGroup != null) {
            ((yg0.o3) ((tg0.l1) i95.n0.c(tg0.l1.class))).bj(z17);
            if (viewGroup.getVisibility() != 0) {
                return;
            }
            java.lang.Long valueOf = java.lang.Long.valueOf(fTSFlutterSearchUIC.f184643g);
            sg0.w2 w2Var = (sg0.w2) fTSFlutterSearchUIC.f184644h;
            w2Var.getClass();
            kotlinx.coroutines.y0 b17 = kotlinx.coroutines.z0.b();
            kotlinx.coroutines.l.d(b17, null, null, new sg0.o2(w2Var, valueOf, z17, b17, null), 3, null);
        }
    }

    @Override // tj5.l
    public boolean Y3(android.view.View view) {
        ka();
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

    public final void ga(java.lang.String str, int i17) {
        com.tencent.mm.plugin.webview.ui.tools.fts.b0 b0Var = new com.tencent.mm.plugin.webview.ui.tools.fts.b0();
        b0Var.f184346d = i17;
        b0Var.f184344b = str;
        b0Var.f184343a = str;
        java.util.LinkedList linkedList = this.P4;
        if (linkedList.isEmpty()) {
            linkedList.addFirst(b0Var);
        } else {
            if (b0Var.equals((com.tencent.mm.plugin.webview.ui.tools.fts.b0) linkedList.peekFirst())) {
                return;
            }
            linkedList.addFirst(b0Var);
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bdd;
    }

    public java.lang.String ha() {
        return null;
    }

    public final boolean ia(boolean z17) {
        java.util.LinkedList linkedList = this.P4;
        if (linkedList.size() > 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSBaseWebViewUI", "handleClickBackBtn, realStartSearch");
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSBaseWebViewUI", "[hitest] handleClickBackBtn else branch, searchHistory.size=%d", java.lang.Integer.valueOf(linkedList.size()));
            linkedList.pollFirst();
            com.tencent.mm.plugin.webview.ui.tools.fts.b0 b0Var = (com.tencent.mm.plugin.webview.ui.tools.fts.b0) linkedList.peekFirst();
            if (b0Var == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSBaseWebViewUI", "[hitest] handleClickBackBtn, peekFirst null after pollFirst, finish");
                finish();
                return false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSBaseWebViewUI", "[hitest] handleClickBackBtn, about to setText, query=%s, hasFocus=%s", b0Var.f184344b, java.lang.Boolean.valueOf(this.F4.getFtsEditText().k()));
            this.F4.getFtsEditText().n(b0Var.f184344b, null);
            this.T4 = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSBaseWebViewUI", "[hitest] handleClickBackBtn, after setText, isSettingTextFromJS=true, about to clearEditTextFocus");
            this.F4.getFtsEditText().d();
            this.F4.setCancelBtnVisible(0);
            hideVKB();
            la(1, b0Var);
            return false;
        }
        if (this.K3) {
            androidx.appcompat.app.AppCompatActivity activity = getContext();
            kotlin.jvm.internal.o.g(activity, "activity");
            com.tencent.mm.plugin.webview.ui.tools.fts.uic.FTSFlutterSearchUIC fTSFlutterSearchUIC = (com.tencent.mm.plugin.webview.ui.tools.fts.uic.FTSFlutterSearchUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.webview.ui.tools.fts.uic.FTSFlutterSearchUIC.class);
            fTSFlutterSearchUIC.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.hitest.FTSFlutterSearchUIC", "onSearchBack");
            fTSFlutterSearchUIC.T6();
        }
        if (!this.G3 || this.F4.getFtsEditText().getTotalQuery().isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSBaseWebViewUI", "handleClickBackBtn, finish");
            hideVKB();
            if (z17) {
                G9(vu4.a.K, vu4.b.f440273w);
            } else {
                G9(vu4.a.K, vu4.b.f440275y);
            }
            finish();
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSBaseWebViewUI", "handleClickBackBtn, backAndClearQuery");
        if (!linkedList.isEmpty()) {
            linkedList.pollFirst();
        }
        this.F4.getFtsEditText().e();
        this.F4.getFtsEditText().d();
        if (ja()) {
            this.F4.setCancelBtnVisible(8);
        }
        return false;
    }

    public boolean ja() {
        return false;
    }

    public final void ka() {
        com.tencent.mm.ui.search.WebSearchView webSearchView = this.F4;
        if (webSearchView != null && webSearchView.getFtsEditText() != null) {
            this.F4.getFtsEditText().d();
            this.F4.getFtsEditText().v(false);
        }
        hideVKB();
        la(0, null);
    }

    public void la(int i17, com.tencent.mm.plugin.webview.ui.tools.fts.b0 b0Var) {
        if (!this.K3) {
            this.Q2.post(new com.tencent.mm.plugin.webview.ui.tools.fts.z0(this, i17, b0Var));
            return;
        }
        java.lang.String query = P9();
        if (com.tencent.mm.sdk.platformtools.t8.K0(query)) {
            query = this.F4.getFtsEditText().getRecommendSearchHint();
            this.F4.getFtsEditText().o(this.F4.getFtsEditText().getRecommendSearchHint(), null, tj5.o.SetText);
            this.F4.getFtsEditText().d();
            this.F4.getFtsEditText().h();
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(query)) {
            return;
        }
        androidx.appcompat.app.AppCompatActivity activity = getContext();
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.webview.ui.tools.fts.uic.FTSFlutterSearchUIC fTSFlutterSearchUIC = (com.tencent.mm.plugin.webview.ui.tools.fts.uic.FTSFlutterSearchUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.webview.ui.tools.fts.uic.FTSFlutterSearchUIC.class);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(b0Var != null ? b0Var.f184346d : this.I4);
        fTSFlutterSearchUIC.getClass();
        kotlin.jvm.internal.o.g(query, "query");
        com.tencent.mars.xlog.Log.i("MicroMsg.hitest.FTSFlutterSearchUIC", "realStartSearch, isBackButtonClick: " + i17 + ", query: " + query + " type: " + valueOf);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        if (i17 == 1) {
            if (valueOf != null) {
                linkedHashMap.put("type", java.lang.Integer.valueOf(valueOf.intValue()));
            }
            linkedHashMap.put("isBackButtonClick", 1);
        }
        fTSFlutterSearchUIC.V6(query, true, linkedHashMap);
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
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSBaseWebViewUI", "onClickBackBtn");
        ia(false);
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
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSBaseWebViewUI", "onBackPressed");
        if (ia(true)) {
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
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSBaseWebViewUI", "onClickBackBtn");
        ia(false);
    }

    @Override // tj5.y
    public void onClickCancelBtn(android.view.View view) {
        this.F4.getFtsEditText().n("", null);
        Z9(1, 1, true, null);
        this.F4.getFtsEditText().d();
        hideVKB();
        G9(vu4.a.K, vu4.b.A);
    }

    @Override // tj5.n
    public void onClickClearTextBtn(android.view.View view) {
        com.tencent.mm.ui.search.WebSearchView webSearchView = this.F4;
        if (webSearchView != null) {
            if (!webSearchView.getFtsEditText().k()) {
                this.F4.getFtsEditText().m();
            }
            this.F4.getFtsEditText().setHint(ha());
            this.F4.setCancelBtnVisible(8);
        }
        if (this.K3) {
            androidx.appcompat.app.AppCompatActivity activity = getContext();
            kotlin.jvm.internal.o.g(activity, "activity");
            com.tencent.mm.plugin.webview.ui.tools.fts.uic.FTSFlutterSearchUIC fTSFlutterSearchUIC = (com.tencent.mm.plugin.webview.ui.tools.fts.uic.FTSFlutterSearchUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.webview.ui.tools.fts.uic.FTSFlutterSearchUIC.class);
            fTSFlutterSearchUIC.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.hitest.FTSFlutterSearchUIC", "onClearInputTextBar");
            ((yg0.o3) ((tg0.l1) i95.n0.c(tg0.l1.class))).aj(8);
            fTSFlutterSearchUIC.T6();
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI, com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI, com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        int i17;
        boolean booleanExtra = getIntent().getBooleanExtra("ftsForceShowDarkMode", false);
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_page_support_force_night_mode, 1) == 1;
        this.J4 = booleanExtra && z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSBaseWebViewUI", "isOpenForceNightMode = %s， showDarkMode = %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(booleanExtra));
        super.onCreate(bundle);
        if (getSupportActionBar() != null) {
            getSupportActionBar().o();
        }
        int i18 = com.tencent.mm.ui.search.FTSEditTextView.I;
        this.Q4 = j62.e.g().i("clicfg_websearch_input_back_btn", 0, true, true) == 0;
        this.R4 = com.tencent.mm.ui.search.FTSEditTextView.getSearchInputType();
        this.S4 = j62.e.g().i("clicfg_websearch_input_cancel_btn", 1, true, true) == 1;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Boolean.valueOf(this.Q4);
        objArr[1] = java.lang.Boolean.valueOf(this.R4 == 0);
        objArr[2] = java.lang.Boolean.valueOf(this.S4);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSBaseWebViewUI", "initData, isSearchInputBackLast = %s, isSearchInputTypeOld = %s, isSearchInputShowCancel = %s.", objArr);
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
            mMWebView.setOnTouchListener(new com.tencent.mm.plugin.webview.ui.tools.fts.v0(this));
        }
        this.F4 = (com.tencent.mm.ui.search.WebSearchView) findViewById(com.tencent.mm.R.id.phy);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f487336oc0);
        this.H4 = findViewById;
        if (this.L4) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            i17 = 8;
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSBaseWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSBaseWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.F4.setSearchViewListener(this);
            this.F4.getFtsEditText().setHint(ha());
            this.F4.getFtsEditText().setFtsEditTextListener(this);
            this.F4.getFtsEditText().setActionSearchDoneListener(this);
            if (this.M4) {
                this.F4.getCancelBtn().setVisibility(8);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(trim)) {
                this.F4.getFtsEditText().n(trim, null);
                ga(trim, this.I4);
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
            i17 = 8;
            this.F4.setVisibility(8);
            if (this.K4 == 130) {
                android.view.View view = this.H4;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSBaseWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSBaseWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.f183865w.getLayoutParams();
                marginLayoutParams.topMargin = 0;
                this.f183865w.setLayoutParams(marginLayoutParams);
            } else {
                java.lang.String stringExtra2 = getIntent().getStringExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
                    ((android.widget.TextView) findViewById(com.tencent.mm.R.id.aaf)).setText(stringExtra2);
                }
                findViewById(com.tencent.mm.R.id.aa8).setOnClickListener(new com.tencent.mm.plugin.webview.ui.tools.fts.w0(this));
            }
        }
        if (this.J4) {
            android.view.View view2 = this.G4;
            if (view2 != null) {
                view2.setBackgroundColor(view2.getContext().getResources().getColor(com.tencent.mm.R.color.f478512u));
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
                arrayList3.add(java.lang.Integer.valueOf(i17));
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSBaseWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSBaseWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.tencent.mm.ui.search.WebSearchView webSearchView = this.F4;
            android.view.View view3 = webSearchView.webActionbarSearchviewContainer;
            if (view3 != null) {
                view3.setBackgroundColor(webSearchView.getContext().getResources().getColor(com.tencent.mm.R.color.f478512u));
            }
            if (this.F4.getFtsEditText() != null) {
                this.F4.getFtsEditText().setTextColor(this.F4.getContext().getResources().getColor(com.tencent.mm.R.color.by));
                this.F4.getFtsEditText().setHintColor(this.F4.getContext().getResources().getColor(com.tencent.mm.R.color.f478810hv));
                this.F4.getFtsEditText().getTagPanel().setBackgroundResource(com.tencent.mm.R.drawable.f481850ae3);
            }
            if (this.F4.getCancelBtn() != null) {
                this.F4.getCancelBtn().setTextColor(this.F4.getContext().getResources().getColor(com.tencent.mm.R.color.f478548ai));
            }
        }
        com.tencent.mm.ui.search.FTSEditTextView ftsEditText = this.F4.getFtsEditText();
        if (ftsEditText instanceof com.tencent.mm.ui.search.FTSSearchEditTextView) {
            ((com.tencent.mm.ui.search.FTSSearchEditTextView) ftsEditText).setIsInFlutter(this.K3);
        }
        showOptionMenu(false);
        com.tencent.mm.plugin.webview.ui.tools.s7 s7Var = this.f183804a3;
        if (s7Var != null) {
            s7Var.e(true);
        }
        com.tencent.mm.ui.widget.MMWebView mMWebView2 = this.f183815f;
        if (mMWebView2 != null) {
            mMWebView2.setOnLongClickListener(new com.tencent.mm.plugin.webview.ui.tools.fts.x0(this));
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
        com.tencent.mm.plugin.webview.ui.tools.fts.h1 h1Var = this.U4;
        e3Var.M0(h1Var);
        this.L1.K0(h1Var.f184427b);
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
