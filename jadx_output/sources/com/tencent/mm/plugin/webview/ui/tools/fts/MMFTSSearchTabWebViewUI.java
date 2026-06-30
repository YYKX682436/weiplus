package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class MMFTSSearchTabWebViewUI extends com.tencent.mm.plugin.webview.ui.tools.fts.FTSSearchTabWebViewUI {

    /* renamed from: h5, reason: collision with root package name */
    public static final /* synthetic */ int f184324h5 = 0;

    /* renamed from: d5, reason: collision with root package name */
    public java.lang.Boolean f184325d5;

    /* renamed from: e5, reason: collision with root package name */
    public java.lang.Boolean f184326e5;

    /* renamed from: f5, reason: collision with root package name */
    public android.view.View f184327f5;

    /* renamed from: g5, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f184328g5;

    public MMFTSSearchTabWebViewUI() {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.f184325d5 = bool;
        this.f184326e5 = bool;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI, com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI
    public void B9(int i17, java.lang.String str, java.util.Map map) {
        super.B9(i17, str, map);
        if (this.f184325d5.booleanValue()) {
            androidx.appcompat.app.AppCompatActivity activity = getContext();
            kotlin.jvm.internal.o.g(activity, "activity");
            ((rx4.h2) pf5.z.f353948a.a(activity).a(rx4.h2.class)).f401168g = i17;
        }
        pa();
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.FTSSearchTabWebViewUI, com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI, tj5.m
    public void C3(java.lang.String str, java.lang.String str2, java.util.List list, tj5.o oVar) {
        super.C3(str, str2, list, oVar);
        if (this.V4 && this.f184323b5 != com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
            this.f184323b5 = K0;
            android.view.View view = this.W4;
            if (view != null) {
                int i17 = (K0 && this.f183853r3 == -3) ? 0 : 8;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(i17));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/MMFTSSearchTabWebViewUI", "onEditTextChange", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/ui/search/FTSEditTextView$TextChangeStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/fts/MMFTSSearchTabWebViewUI", "onEditTextChange", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/ui/search/FTSEditTextView$TextChangeStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (this.f184328g5 != null) {
            this.f184328g5.setVisibility(com.tencent.mm.sdk.platformtools.t8.K0(P9()) ? 0 : 8);
        }
        if (this.f184325d5.booleanValue()) {
            this.Q2.post(new com.tencent.mm.plugin.webview.ui.tools.fts.c4(this));
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI, tj5.n
    public void U1(boolean z17) {
        super.U1(z17);
        if (z17) {
            return;
        }
        U7();
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI
    public java.lang.Boolean W9() {
        return java.lang.Boolean.valueOf(this.f184325d5.booleanValue() && P9().length() <= 0 && this.P4.isEmpty());
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI
    public void aa(int i17, java.lang.String str, java.util.Map map) {
        if (this.f184325d5.booleanValue()) {
            androidx.appcompat.app.AppCompatActivity activity = getContext();
            kotlin.jvm.internal.o.g(activity, "activity");
            ((rx4.h2) pf5.z.f353948a.a(activity).a(rx4.h2.class)).f401168g = i17;
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI
    public void ba() {
        super.ba();
        if (this.K3) {
            androidx.appcompat.app.AppCompatActivity activity = getContext();
            kotlin.jvm.internal.o.g(activity, "activity");
            com.tencent.mm.plugin.webview.ui.tools.fts.uic.FTSFlutterSearchUIC fTSFlutterSearchUIC = (com.tencent.mm.plugin.webview.ui.tools.fts.uic.FTSFlutterSearchUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.webview.ui.tools.fts.uic.FTSFlutterSearchUIC.class);
            java.lang.Long valueOf = java.lang.Long.valueOf(fTSFlutterSearchUIC.f184643g);
            sg0.w2 w2Var = (sg0.w2) fTSFlutterSearchUIC.f184644h;
            w2Var.getClass();
            kotlinx.coroutines.y0 b17 = kotlinx.coroutines.z0.b();
            kotlinx.coroutines.l.d(b17, null, null, new sg0.r2(w2Var, valueOf, b17, null), 3, null);
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI
    public boolean ja() {
        return na();
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI
    public void la(int i17, com.tencent.mm.plugin.webview.ui.tools.fts.b0 b0Var) {
        if (!this.f184325d5.booleanValue() || !com.tencent.mm.sdk.platformtools.t8.K0(P9())) {
            super.la(i17, b0Var);
            return;
        }
        androidx.appcompat.app.AppCompatActivity activity = getContext();
        kotlin.jvm.internal.o.g(activity, "activity");
        rx4.h2 h2Var = (rx4.h2) pf5.z.f353948a.a(activity).a(rx4.h2.class);
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) h2Var.f401180v;
        java.lang.String str = (java.lang.String) linkedHashMap.get("placeholder");
        java.lang.String str2 = (java.lang.String) linkedHashMap.get(ya.b.SOURCE);
        java.lang.String str3 = (java.lang.String) linkedHashMap.get("mixerCommonContext");
        if (str != null) {
            h2Var.a7();
            java.lang.String b17 = fp.s0.b(str, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
            h2Var.t7(67, str, str3, kz5.b1.e(new jz5.l("flutterSearchDirectlyAddToKvHistory", java.lang.Boolean.FALSE)));
            h2Var.q7(vu4.a.f440243m, "0|50|" + fp.s0.b("底纹词", com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding), "1|1|" + b17 + '|' + b17 + "|1||0||placeholder|" + str2, false, kz5.c1.k(new jz5.l("items", h2Var.f401176r), new jz5.l("clickId", h2Var.f401183y)));
            ((sg0.a2) ((su4.z0) i95.n0.c(su4.z0.class))).bj(h2Var.f401167f, 14, new org.json.JSONObject(kz5.b1.e(new jz5.l("teachData", kz5.c1.k(new jz5.l("type", 50), new jz5.l("item", kz5.c1.k(new jz5.l("placeholder", str), new jz5.l(ya.b.SOURCE, str2), new jz5.l("mixerCommonContext", str3))))))));
        }
        U7();
    }

    public final boolean na() {
        if (this.K3) {
            return false;
        }
        return ((s50.u0) ((u50.z) i95.n0.c(u50.z.class))).Bi(getIntent().getIntExtra("ftsbizscene", 0)) && j62.e.g().i("clicfg_fts_native_teach_page_style_android", 0, true, true) > 0;
    }

    public void oa(int i17, java.lang.String query, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.Map map) {
        java.lang.String str5;
        if (!this.K3) {
            map.remove("flutterSearchDirectlyAddToKvHistory");
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.webview.ui.tools.fts.d4(this, query, map, i17, str, str2, str3, str4));
            return;
        }
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        if (map.containsKey("flutterSearchDirectlyAddToKvHistory")) {
            bool = (java.lang.Boolean) map.get("flutterSearchDirectlyAddToKvHistory");
            map.remove("flutterSearchDirectlyAddToKvHistory");
        }
        this.F4.getFtsEditText().n(query, new java.util.LinkedList());
        this.F4.getFtsEditText().d();
        U7();
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            str5 = java.net.URLEncoder.encode(new org.json.JSONObject(map).toString(), com.tencent.mapsdk.internal.rv.f51270c);
        } catch (java.io.UnsupportedEncodingException unused) {
            str5 = "";
        }
        hashMap.put("parentSearchID", java.lang.String.format("%d:%s:%s:%s:%s", java.lang.Integer.valueOf(i17), str, str2, str3, str5));
        if (!android.text.TextUtils.isEmpty(str4)) {
            hashMap.put("mixerCommonContext", str4);
        }
        java.lang.String recommendSearchHint = this.F4.getFtsEditText().getRecommendSearchHint();
        androidx.appcompat.app.AppCompatActivity activity = getContext();
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.webview.ui.tools.fts.uic.FTSFlutterSearchUIC fTSFlutterSearchUIC = (com.tencent.mm.plugin.webview.ui.tools.fts.uic.FTSFlutterSearchUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.webview.ui.tools.fts.uic.FTSFlutterSearchUIC.class);
        java.lang.String str6 = recommendSearchHint != null ? recommendSearchHint : "";
        boolean booleanValue = bool.booleanValue();
        fTSFlutterSearchUIC.getClass();
        kotlin.jvm.internal.o.g(query, "query");
        com.tencent.mars.xlog.Log.i("MicroMsg.hitest.FTSFlutterSearchUIC", "searchQuery, query: " + query + ", hintText: " + str6 + ", addToKvHistory " + booleanValue + " cgiParams " + hashMap);
        fTSFlutterSearchUIC.V6(query, booleanValue, hashMap);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.FTSSearchTabWebViewUI, com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI, com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI, com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI, com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        android.view.View view;
        android.view.View findViewById;
        android.view.View view2;
        super.onCreate(bundle);
        int i17 = -1;
        if (!na()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.MMFTSSearchTabWebViewUI", "applyTeachPageNewStyleSearchBarIfNeeded, not enabled");
        } else if (this.J4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.MMFTSSearchTabWebViewUI", "applyTeachPageNewStyleSearchBarIfNeeded, skip due to forceShowNightMode");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.MMFTSSearchTabWebViewUI", "applyTeachPageNewStyleSearchBarIfNeeded, applying new style search bar");
            com.tencent.mm.ui.search.WebSearchView webSearchView = this.F4;
            if (webSearchView == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.MMFTSSearchTabWebViewUI", "applyTeachPageNewStyleSearchBarIfNeeded, searchView null");
            } else {
                android.view.ViewGroup.LayoutParams layoutParams = webSearchView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = i65.a.b(this, 64);
                    webSearchView.setLayoutParams(layoutParams);
                }
                android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.f487336oc0);
                if (findViewById2 != null) {
                    android.view.ViewGroup.LayoutParams layoutParams2 = findViewById2.getLayoutParams();
                    int b17 = i65.a.b(this, 64);
                    if (layoutParams2 != null && layoutParams2.height != b17) {
                        layoutParams2.height = b17;
                        findViewById2.setLayoutParams(layoutParams2);
                        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.MMFTSSearchTabWebViewUI", "applyTeachPageNewStyleSearchBarIfNeeded, title_container height -> 64dp");
                    }
                }
                android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.pil);
                if (findViewById3 != null) {
                    android.view.ViewGroup.LayoutParams layoutParams3 = findViewById3.getLayoutParams();
                    if (layoutParams3 instanceof android.view.ViewGroup.MarginLayoutParams) {
                        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams3;
                        int b18 = i65.a.b(this, 64);
                        if (marginLayoutParams.topMargin != b18) {
                            marginLayoutParams.topMargin = b18;
                            findViewById3.setLayoutParams(marginLayoutParams);
                            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.MMFTSSearchTabWebViewUI", "applyTeachPageNewStyleSearchBarIfNeeded, webview_keyboard_ll marginTop -> 64dp");
                        }
                    }
                }
                android.view.View view3 = webSearchView.webActionbarSearchviewContainer;
                if (view3 != null) {
                    view3.setPadding(view3.getPaddingLeft(), view3.getPaddingTop(), i65.a.b(this, 8), view3.getPaddingBottom());
                }
                com.tencent.mm.ui.search.FTSEditTextView ftsEditText = webSearchView.getFtsEditText();
                if (ftsEditText != null) {
                    android.view.View tagPanel = ftsEditText.getTagPanel();
                    if (tagPanel != null) {
                        tagPanel.setBackgroundResource(com.tencent.mm.R.drawable.f481853d54);
                        android.view.ViewGroup.LayoutParams layoutParams4 = tagPanel.getLayoutParams();
                        if (layoutParams4 != null) {
                            layoutParams4.height = i65.a.b(this, 48);
                            tagPanel.setLayoutParams(layoutParams4);
                        }
                    }
                    boolean C = com.tencent.mm.ui.bk.C();
                    android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.ggf);
                    if (findViewById4 != null) {
                        findViewById4.setBackgroundColor(C ? -15132391 : -1);
                    }
                    android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.aa8);
                    if (findViewById5 instanceof com.tencent.mm.ui.widget.imageview.WeImageView) {
                        ((com.tencent.mm.ui.widget.imageview.WeImageView) findViewById5).setIconColor(C ? -855638017 : -452984832);
                    }
                    android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.aaf);
                    if (textView != null) {
                        textView.setTextColor(C ? -855638017 : -452984832);
                    }
                    android.view.View findViewById6 = view3 != null ? view3.findViewById(com.tencent.mm.R.id.f482323bc) : null;
                    if (findViewById6 != null) {
                        findViewById6.setPadding(findViewById6.getPaddingLeft(), findViewById6.getPaddingTop(), 0, findViewById6.getPaddingBottom());
                    }
                    android.view.ViewGroup.LayoutParams layoutParams5 = ftsEditText.getLayoutParams();
                    if (layoutParams5 instanceof android.view.ViewGroup.MarginLayoutParams) {
                        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) layoutParams5;
                        marginLayoutParams2.setMarginStart(i65.a.b(this, 12));
                        marginLayoutParams2.setMarginEnd(0);
                        ftsEditText.setLayoutParams(marginLayoutParams2);
                    }
                    if (ftsEditText.getEditText() != null) {
                        android.widget.EditText editText = ftsEditText.getEditText();
                        editText.setTextSize(2, 17.0f);
                        editText.setTextColor(C ? -855638017 : -452984832);
                        editText.setHintTextColor(C ? -2130706433 : Integer.MIN_VALUE);
                        editText.setPadding(i65.a.b(this, 12), editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
                    }
                    if (ftsEditText.getEditText() != null && (view2 = (android.view.View) ftsEditText.getEditText().getParent()) != null) {
                        android.view.ViewGroup.LayoutParams layoutParams6 = view2.getLayoutParams();
                        if (layoutParams6 instanceof android.view.ViewGroup.MarginLayoutParams) {
                            android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = (android.view.ViewGroup.MarginLayoutParams) layoutParams6;
                            marginLayoutParams3.setMarginEnd(i65.a.b(this, 12));
                            view2.setLayoutParams(marginLayoutParams3);
                        }
                    }
                    android.view.View searchDone = ftsEditText.getSearchDone();
                    if (searchDone instanceof android.widget.TextView) {
                        android.widget.TextView textView2 = (android.widget.TextView) searchDone;
                        android.view.ViewGroup.LayoutParams layoutParams7 = textView2.getLayoutParams();
                        layoutParams7.width = i65.a.b(this, 52);
                        layoutParams7.height = i65.a.b(this, 32);
                        if (layoutParams7 instanceof android.view.ViewGroup.MarginLayoutParams) {
                            ((android.view.ViewGroup.MarginLayoutParams) layoutParams7).setMarginEnd(i65.a.b(this, 8));
                        }
                        textView2.setLayoutParams(layoutParams7);
                        textView2.setBackgroundResource(com.tencent.mm.R.drawable.f481852d53);
                        textView2.setMinWidth(0);
                        textView2.setPadding(0, 0, 0, 0);
                    }
                    if (ftsEditText.getEditText() != null && (view = (android.view.View) ftsEditText.getEditText().getParent()) != null && (findViewById = view.findViewById(com.tencent.mm.R.id.rfy)) != null) {
                        findViewById.setBackground(new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0, C ? -14671840 : -526345}));
                    }
                }
            }
        }
        if (this.f184256m4) {
            com.tencent.mm.ui.search.FTSEditTextView ftsEditText2 = this.F4.getFtsEditText();
            if (ftsEditText2 == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.MMFTSSearchTabWebViewUI", "initFinderCameraButtonIfNeeded, ftsEditText is null");
            } else {
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView = new com.tencent.mm.ui.widget.imageview.WeImageView(this);
                this.f184328g5 = weImageView;
                weImageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_camera);
                this.f184328g5.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
                this.f184328g5.setContentDescription("camera");
                if (na()) {
                    int b19 = i65.a.b(this, 20);
                    int b27 = i65.a.b(this, 16);
                    android.widget.LinearLayout.LayoutParams layoutParams8 = new android.widget.LinearLayout.LayoutParams(b19, b19);
                    layoutParams8.gravity = 16;
                    layoutParams8.setMarginEnd(b27);
                    this.f184328g5.setLayoutParams(layoutParams8);
                    this.f184328g5.setPadding(0, 0, 0, 0);
                } else {
                    int b28 = i65.a.b(this, 24);
                    int b29 = i65.a.b(this, 8);
                    int b37 = i65.a.b(this, 8);
                    android.widget.LinearLayout.LayoutParams layoutParams9 = new android.widget.LinearLayout.LayoutParams(b28 + (b29 * 2), -1);
                    layoutParams9.setMarginEnd(b37);
                    this.f184328g5.setLayoutParams(layoutParams9);
                    this.f184328g5.setPadding(b29, b29, b29, b29);
                }
                android.widget.ImageButton clearBtn = ftsEditText2.getClearBtn();
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) clearBtn.getParent();
                int i18 = 0;
                while (true) {
                    if (i18 >= viewGroup.getChildCount()) {
                        break;
                    }
                    if (viewGroup.getChildAt(i18) == clearBtn) {
                        i17 = i18;
                        break;
                    }
                    i18++;
                }
                if (i17 >= 0) {
                    viewGroup.addView(this.f184328g5, i17);
                } else {
                    viewGroup.addView(this.f184328g5);
                }
                this.f184328g5.setVisibility(com.tencent.mm.sdk.platformtools.t8.K0(P9()) ? 0 : 8);
                this.f184328g5.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.webview.ui.tools.fts.MMFTSSearchTabWebViewUI$$a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view4) {
                        int i19 = com.tencent.mm.plugin.webview.ui.tools.fts.MMFTSSearchTabWebViewUI.f184324h5;
                        com.tencent.mm.plugin.webview.ui.tools.fts.MMFTSSearchTabWebViewUI mMFTSSearchTabWebViewUI = com.tencent.mm.plugin.webview.ui.tools.fts.MMFTSSearchTabWebViewUI.this;
                        mMFTSSearchTabWebViewUI.getClass();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(view4);
                        java.lang.Object[] array = arrayList.toArray();
                        arrayList.clear();
                        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/fts/MMFTSSearchTabWebViewUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", mMFTSSearchTabWebViewUI, array);
                        mMFTSSearchTabWebViewUI.G9(vu4.a.I, vu4.b.F);
                        java.util.HashMap hashMap = new java.util.HashMap();
                        hashMap.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, mMFTSSearchTabWebViewUI.B3);
                        hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.String.valueOf(mMFTSSearchTabWebViewUI.K4));
                        mMFTSSearchTabWebViewUI.F9(hashMap, mMFTSSearchTabWebViewUI.f184328g5.getContext());
                        yj0.a.h(mMFTSSearchTabWebViewUI, "com/tencent/mm/plugin/webview/ui/tools/fts/MMFTSSearchTabWebViewUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    }
                });
                G9(vu4.a.f440239f, vu4.b.F);
                boolean C2 = com.tencent.mm.ui.bk.C();
                this.f184328g5.setIconColor(C2 ? -855638017 : -452984832);
                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.MMFTSSearchTabWebViewUI", "initFinderCameraButtonIfNeeded, camera button added for scene: " + this.K4 + ", systemDark=" + C2);
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.MMFTSSearchTabWebViewUI", "initFinderCameraButtonIfNeeded, not enabled for scene: " + this.K4);
        }
        if (this.K3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.MMFTSSearchTabWebViewUI", "preLoadFlutterEngine");
            ((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Zi();
        }
        if (this.M3) {
            getWindow().setCallback(null);
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.FTSSearchTabWebViewUI, com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI, com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI, com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI, com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.FTSSearchTabWebViewUI, com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI, com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI, com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        pa();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.tencent.mm.ui.MMActivity, com.tencent.mm.plugin.webview.ui.tools.fts.MMFTSSearchTabWebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI, com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI] */
    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI, com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        ?? w96;
        int i17;
        if (this.K3) {
            androidx.appcompat.app.AppCompatActivity activity = getContext();
            kotlin.jvm.internal.o.g(activity, "activity");
            this.f184327f5 = ((com.tencent.mm.plugin.webview.ui.tools.fts.uic.FTSFlutterSearchUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.webview.ui.tools.fts.uic.FTSFlutterSearchUIC.class)).f184641e;
        } else {
            this.f184327f5 = this.f183815f;
        }
        super.onStart();
        if (!this.M3 || this.f184326e5.booleanValue()) {
            return;
        }
        this.f184326e5 = java.lang.Boolean.TRUE;
        java.lang.String stringExtra = getIntent().getStringExtra("ftsrealurl");
        if (stringExtra == null || android.text.TextUtils.isEmpty(stringExtra)) {
            w96 = w9();
        } else {
            w96 = new java.util.HashMap();
            android.net.Uri parse = android.net.Uri.parse(stringExtra);
            for (java.lang.String str : parse.getQueryParameterNames()) {
                w96.put(str, parse.getQueryParameter(str));
            }
        }
        java.lang.String str2 = w96.get("referer") instanceof java.lang.String ? (java.lang.String) w96.get("referer") : "";
        java.lang.String stringExtra2 = getIntent().getStringExtra("ftsQuery");
        int i18 = this.K4;
        if (i18 != 1001) {
            if (i18 == 1014) {
                i17 = 92;
            } else if (i18 != 1022) {
                i17 = i18 != 1028 ? 0 : 134;
            }
            int i19 = i17;
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("flutterSearchDirectlyAddToKvHistory", java.lang.Boolean.FALSE);
            oa(i19, stringExtra2, str2, "", "", "", hashMap);
        }
        i17 = 76;
        int i192 = i17;
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("flutterSearchDirectlyAddToKvHistory", java.lang.Boolean.FALSE);
        oa(i192, stringExtra2, str2, "", "", "", hashMap2);
    }

    public final void pa() {
        if (na() && com.tencent.mm.sdk.platformtools.t8.K0(P9())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.MMFTSSearchTabWebViewUI", "syncCancelBtnVisibilityForNewStyle, query empty, hide cancel btn");
            this.F4.setCancelBtnVisible(8);
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI
    public android.view.View r9() {
        if (this.K3) {
            return this.f184327f5;
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI, com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        this.f184325d5 = java.lang.Boolean.valueOf(getIntent().getBooleanExtra("KNativeTeach", false));
        this.M3 = getIntent().getBooleanExtra("KHalfScreenSearchUseFlutter", false);
        this.K3 = getIntent().getBooleanExtra("KSearchUseFlutter", false) || this.M3;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = this.f184325d5.booleanValue() ? "yes" : "no";
        objArr[1] = this.K3 ? "yes" : "no";
        objArr[2] = this.M3 ? "yes" : "no";
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.MMFTSSearchTabWebViewUI", "superImportUIComponents, isOpenNativeTeach: %s, isUseFlutter: %s, isHalfScreenFlutter: %s", objArr);
        if (this.f184325d5.booleanValue()) {
            hashSet.add(rx4.h2.class);
            hashSet.add(rx4.e0.class);
            hashSet.add(rx4.u0.class);
            hashSet.add(rx4.k0.class);
            hashSet.add(rx4.s.class);
        }
        if (this.K3) {
            hashSet.add(com.tencent.mm.plugin.webview.ui.tools.fts.uic.FTSFlutterSearchUIC.class);
        }
    }
}
