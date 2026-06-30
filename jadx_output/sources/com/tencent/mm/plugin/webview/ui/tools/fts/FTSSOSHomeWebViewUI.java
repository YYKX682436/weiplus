package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class FTSSOSHomeWebViewUI extends com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI implements tj5.l {
    public static final /* synthetic */ int R5 = 0;
    public boolean B5;
    public android.animation.ValueAnimator I5;
    public android.view.View Z4;

    /* renamed from: a5, reason: collision with root package name */
    public android.view.View f184286a5;

    /* renamed from: b5, reason: collision with root package name */
    public android.view.View f184287b5;

    /* renamed from: c5, reason: collision with root package name */
    public android.view.View f184288c5;

    /* renamed from: d5, reason: collision with root package name */
    public android.widget.TextView f184289d5;

    /* renamed from: e5, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.ui.tools.fts.z4 f184290e5;

    /* renamed from: f5, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.ui.tools.fts.c5 f184291f5;

    /* renamed from: g5, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.ui.tools.fts.e5 f184292g5;

    /* renamed from: j5, reason: collision with root package name */
    public android.view.View f184295j5;

    /* renamed from: k5, reason: collision with root package name */
    public android.view.View f184296k5;

    /* renamed from: l5, reason: collision with root package name */
    public android.view.View f184297l5;

    /* renamed from: m5, reason: collision with root package name */
    public boolean f184298m5;

    /* renamed from: n5, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.ui.tools.fts.j3 f184299n5;

    /* renamed from: p5, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.ui.tools.fts.o2 f184301p5;

    /* renamed from: q5, reason: collision with root package name */
    public int f184302q5;

    /* renamed from: t5, reason: collision with root package name */
    public java.lang.String f184305t5;

    /* renamed from: u5, reason: collision with root package name */
    public boolean f184306u5;

    /* renamed from: v5, reason: collision with root package name */
    public boolean f184307v5;

    /* renamed from: w5, reason: collision with root package name */
    public boolean f184308w5;

    /* renamed from: x5, reason: collision with root package name */
    public int f184309x5;

    /* renamed from: y5, reason: collision with root package name */
    public android.view.View f184310y5;

    /* renamed from: h5, reason: collision with root package name */
    public float f184293h5 = 0.0f;

    /* renamed from: i5, reason: collision with root package name */
    public float f184294i5 = 0.0f;

    /* renamed from: o5, reason: collision with root package name */
    public int f184300o5 = 0;

    /* renamed from: r5, reason: collision with root package name */
    public int f184303r5 = 0;

    /* renamed from: s5, reason: collision with root package name */
    public java.lang.String f184304s5 = "";

    /* renamed from: z5, reason: collision with root package name */
    public int f184311z5 = 0;
    public java.lang.String A5 = "";
    public com.tencent.mm.plugin.webview.ui.tools.fts.i2 C5 = com.tencent.mm.plugin.webview.ui.tools.fts.i2.None;
    public com.tencent.mm.plugin.webview.ui.tools.fts.i2 D5 = com.tencent.mm.plugin.webview.ui.tools.fts.i2.Back;
    public boolean E5 = false;
    public boolean F5 = false;
    public boolean G5 = false;
    public boolean H5 = true;
    public final androidx.lifecycle.k0 J5 = new com.tencent.mm.plugin.webview.ui.tools.fts.t1(this);
    public final com.tencent.mm.sdk.platformtools.n3 K5 = new com.tencent.mm.plugin.webview.ui.tools.fts.z1(this);
    public android.animation.ObjectAnimator L5 = null;
    public final com.tencent.mm.plugin.webview.ui.tools.fts.t4 M5 = new com.tencent.mm.plugin.webview.ui.tools.fts.n1(this);
    public final com.tencent.mm.plugin.webview.ui.tools.fts.t4 N5 = new com.tencent.mm.plugin.webview.ui.tools.fts.o1(this);
    public final com.tencent.mm.plugin.webview.ui.tools.fts.t4 O5 = new com.tencent.mm.plugin.webview.ui.tools.fts.p1(this);
    public boolean P5 = true;
    public final android.view.View.OnClickListener Q5 = new com.tencent.mm.plugin.webview.ui.tools.fts.u1(this);

    public static void wa(com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI, com.tencent.mm.plugin.webview.ui.tools.fts.u4 u4Var) {
        fTSSOSHomeWebViewUI.f184292g5.f184691q = u4Var;
        fTSSOSHomeWebViewUI.f184291f5.f184691q = u4Var;
        fTSSOSHomeWebViewUI.f184290e5.f184691q = u4Var;
    }

    public static void xa(com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI) {
        fTSSOSHomeWebViewUI.getClass();
        boolean z17 = ((tb0.j) i95.n0.c(tb0.j.class)) != null && j35.u.a(fTSSOSHomeWebViewUI, "android.permission.RECORD_AUDIO", 80, "", "");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "summerper checkPermission checkmicrophone[%s], stack[%s], activity[%s]", valueOf, new com.tencent.mm.sdk.platformtools.z3(), fTSSOSHomeWebViewUI);
        if (z17) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, fTSSOSHomeWebViewUI.B3);
            intent.putExtra("subSessionId", fTSSOSHomeWebViewUI.C3);
            intent.putExtra("key_scene", fTSSOSHomeWebViewUI.Y3);
            intent.putExtra("key_is_nav_voice", fTSSOSHomeWebViewUI.X9() ? 1 : 2);
            j45.l.v(fTSSOSHomeWebViewUI, ".ui.websearch.WebSearchVoiceUI", intent, 1);
            fTSSOSHomeWebViewUI.overridePendingTransition(0, 0);
        }
    }

    public static void ya(com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI, int i17, int i18, int i19, float f17) {
        fTSSOSHomeWebViewUI.getClass();
        int i27 = (int) (i18 * f17);
        int g17 = e3.b.g(i17 | (i27 << 24), i19);
        fTSSOSHomeWebViewUI.P8(g17);
        fTSSOSHomeWebViewUI.setNavigationbarColor(g17);
        android.view.View view = fTSSOSHomeWebViewUI.f184288c5;
        float f18 = i27 / 255.0f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(f18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "setNavBarShadow", "(IIIF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "setNavBarShadow", "(IIIF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    public static void za(com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI) {
        fTSSOSHomeWebViewUI.f184303r5--;
        fTSSOSHomeWebViewUI.Ta(true);
        boolean z17 = fTSSOSHomeWebViewUI.T4;
        if (!z17) {
            com.tencent.mm.plugin.webview.ui.tools.fts.u4 u4Var = fTSSOSHomeWebViewUI.f184290e5.f184691q;
            com.tencent.mm.plugin.webview.ui.tools.fts.u4 u4Var2 = com.tencent.mm.plugin.webview.ui.tools.fts.u4.Search;
            boolean z18 = u4Var == u4Var2;
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = java.lang.Boolean.valueOf(z17);
            objArr[1] = java.lang.Boolean.valueOf(z18);
            com.tencent.mm.plugin.webview.ui.tools.fts.u4 u4Var3 = fTSSOSHomeWebViewUI.f184290e5.f184691q;
            objArr[2] = u4Var3;
            objArr[3] = java.lang.Boolean.valueOf(u4Var3 == u4Var2);
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "updateSearchBarStatus, needSosEditTextToBeTouchOnly = %s, isSearchState = %s, state = %s, state = %s.", objArr);
            com.tencent.mm.plugin.webview.ui.tools.fts.u4 u4Var4 = com.tencent.mm.plugin.webview.ui.tools.fts.u4.Init;
            if (z18) {
                fTSSOSHomeWebViewUI.La();
            } else if (fTSSOSHomeWebViewUI.Q4 && fTSSOSHomeWebViewUI.f184290e5.f184691q == u4Var4) {
                fTSSOSHomeWebViewUI.Sa(0);
                android.view.View view = fTSSOSHomeWebViewUI.H4;
                if (view != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "searchBarShowDefault", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "searchBarShowDefault", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view2 = fTSSOSHomeWebViewUI.H4;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(java.lang.Float.valueOf(0.0f));
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "searchBarShowDefault", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "searchBarShowDefault", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    int i17 = fTSSOSHomeWebViewUI.H3;
                    if (i17 == 1) {
                        fTSSOSHomeWebViewUI.H4.setBackgroundDrawable(fTSSOSHomeWebViewUI.getResources().getDrawable(com.tencent.mm.R.drawable.d9h));
                    } else if (i17 == 2) {
                        fTSSOSHomeWebViewUI.H4.setBackgroundDrawable(fTSSOSHomeWebViewUI.getResources().getDrawable(com.tencent.mm.R.drawable.d9i));
                    } else {
                        fTSSOSHomeWebViewUI.H4.setBackgroundDrawable(fTSSOSHomeWebViewUI.getResources().getDrawable(com.tencent.mm.R.drawable.b3a));
                    }
                }
                fTSSOSHomeWebViewUI.J4.setCommonRightBtnForceHide(false);
                fTSSOSHomeWebViewUI.J4.setCommonRightImageButtonVisibile(0);
                fTSSOSHomeWebViewUI.J4.setSearchIconGone(8);
            }
            if (fTSSOSHomeWebViewUI.f184290e5.f184691q == u4Var4) {
                fTSSOSHomeWebViewUI.F5 = false;
            }
        }
        fTSSOSHomeWebViewUI.Ja();
    }

    public final void Aa() {
        int i17 = this.H3;
        if (i17 == 0) {
            return;
        }
        int color = i17 == 1 ? getResources().getColor(com.tencent.mm.R.color.aib) : getResources().getColor(com.tencent.mm.R.color.aic);
        com.tencent.mm.plugin.websearch.widget.SOSEditTextView sOSEditTextView = this.J4;
        if (sOSEditTextView != null && sOSEditTextView.getIconView() != null) {
            this.J4.getIconView().setIconColor(color);
        }
        try {
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.p5c);
            if (findViewById instanceof com.tencent.mm.ui.widget.imageview.WeImageView) {
                ((com.tencent.mm.ui.widget.imageview.WeImageView) findViewById).setIconColor(color);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "applyThemeModeForSearchIcon, voice_btn not found or not WeImageView: %s", findViewById);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "applyThemeModeForSearchIcon, set voice_btn iconColor failed: %s", th6.getMessage());
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "applyThemeModeForSearchIcon, themeMode=%s, iconColor=#%08X", java.lang.Integer.valueOf(this.H3), java.lang.Integer.valueOf(color));
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI, com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public void B8() {
        super.B8();
        try {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("key", "searchID");
            this.f184304s5 = this.K1.tb(6, bundle).getString("result");
        } catch (java.lang.Exception unused) {
        }
        try {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putString("key", "educationTab");
            android.os.Bundle tb6 = this.K1.tb(2, bundle2);
            java.lang.String string = tb6.getString("result");
            java.lang.String string2 = tb6.getString("result_1");
            if (string2 != null) {
                string = string2;
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject(string);
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("items");
            java.lang.String optString = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            if (optJSONArray == null) {
                optJSONArray = new org.json.JSONArray("[{\"businessType\":8,\"hotword\":\"朋友圈\",\"optype\":5},{\"businessType\":2,\"hotword\":\"文章\",\"optype\":5},{\"businessType\":1,\"hotword\":\"公众号\",\"optype\":5}]");
            }
            o9(new com.tencent.mm.plugin.webview.ui.tools.fts.l1(this, optJSONArray, optString));
        } catch (java.lang.Exception unused2) {
        }
        this.f184295j5.post(new com.tencent.mm.plugin.webview.ui.tools.fts.k1(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String Ba(int r4) {
        /*
            r3 = this;
            r0 = 1
            if (r4 == r0) goto L59
            r1 = 2
            if (r4 == r1) goto L55
            r1 = 8
            if (r4 == r1) goto L51
            r1 = 16
            if (r4 == r1) goto L4d
            r1 = 64
            if (r4 == r1) goto L49
            r1 = 128(0x80, float:1.8E-43)
            if (r4 == r1) goto L45
            r1 = 256(0x100, float:3.59E-43)
            if (r4 == r1) goto L41
            r1 = 384(0x180, float:5.38E-43)
            if (r4 == r1) goto L41
            r1 = 512(0x200, float:7.17E-43)
            if (r4 == r1) goto L3d
            r1 = 1024(0x400, float:1.435E-42)
            if (r4 == r1) goto L39
            r1 = 262208(0x40040, float:3.67432E-40)
            if (r4 == r1) goto L49
            r1 = 51
            if (r4 == r1) goto L59
            r1 = 52
            if (r4 == r1) goto L35
            r4 = -1
            goto L5c
        L35:
            r4 = 2131774957(0x7f104ded, float:1.9181345E38)
            goto L5c
        L39:
            r4 = 2131768619(0x7f10352b, float:1.916849E38)
            goto L5c
        L3d:
            r4 = 2131768618(0x7f10352a, float:1.9168487E38)
            goto L5c
        L41:
            r4 = 2131768607(0x7f10351f, float:1.9168465E38)
            goto L5c
        L45:
            r4 = 2131768608(0x7f103520, float:1.9168467E38)
            goto L5c
        L49:
            r4 = 2131755635(0x7f100273, float:1.9142155E38)
            goto L5c
        L4d:
            r4 = 2131768620(0x7f10352c, float:1.9168492E38)
            goto L5c
        L51:
            r4 = 2131780348(0x7f1062fc, float:1.9192279E38)
            goto L5c
        L55:
            r4 = 2131774955(0x7f104deb, float:1.918134E38)
            goto L5c
        L59:
            r4 = 2131774956(0x7f104dec, float:1.9181342E38)
        L5c:
            int r1 = r3.Y3
            r2 = 36
            if (r1 != r2) goto L63
            goto L64
        L63:
            r0 = 0
        L64:
            if (r0 != 0) goto L6a
            r0 = 53
            if (r1 != r0) goto L6d
        L6a:
            r4 = 2131774993(0x7f104e11, float:1.9181418E38)
        L6d:
            r0 = 179(0xb3, float:2.51E-43)
            if (r1 != r0) goto L74
            r4 = 2131774972(0x7f104dfc, float:1.9181375E38)
        L74:
            r0 = 2131774954(0x7f104dea, float:1.9181338E38)
            if (r4 >= 0) goto L94
            java.lang.String r4 = r3.A5
            boolean r4 = com.tencent.mm.sdk.platformtools.t8.K0(r4)
            if (r4 != 0) goto L8c
            java.lang.String r4 = r3.A5
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r4 = r3.getString(r0, r4)
            return r4
        L8c:
            r4 = 2131774973(0x7f104dfd, float:1.9181377E38)
            java.lang.String r4 = r3.getString(r4)
            return r4
        L94:
            java.lang.String r4 = r3.getString(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r4 = r3.getString(r0, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI.Ba(int):java.lang.String");
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI, tj5.m
    public void C3(java.lang.String str, java.lang.String str2, java.util.List list, tj5.o oVar) {
        com.tencent.mm.plugin.websearch.widget.SOSEditTextView sOSEditTextView;
        tj5.o oVar2 = tj5.o.UserInput;
        if (this.f184298m5 && this.P5 != com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
            this.P5 = K0;
            Ma((K0 && this.f183853r3 == -3) ? 0 : 8);
        }
        if (Da() && this.J4 != null) {
            boolean z17 = !com.tencent.mm.sdk.platformtools.t8.K0(str);
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "onEditTextChange camera control, hasText = %b, commonRightImageButton = %s", java.lang.Boolean.valueOf(z17), this.J4.getVoiceImageButton());
            if (z17) {
                this.J4.setCommonRightBtnForceHide(true);
                this.J4.setCommonRightImageButtonVisibile(8);
            } else {
                this.J4.setCommonRightBtnForceHide(false);
                this.J4.setCommonRightImageButtonVisibile(0);
            }
        }
        if (oVar == oVar2 && com.tencent.mm.sdk.platformtools.t8.K0(str2) && ((list == null || list.isEmpty()) && (sOSEditTextView = this.J4) != null)) {
            sOSEditTextView.setRecommendSearchHint("");
            this.J4.setHint(ia());
        }
        super.C3(str, str2, list, oVar);
    }

    public final boolean Ca(com.tencent.mm.plugin.webview.ui.tools.fts.i2 i2Var) {
        nw4.n nVar;
        boolean z17;
        com.tencent.mm.plugin.webview.ui.tools.fts.i2 i2Var2 = this.C5;
        if (i2Var2 != com.tencent.mm.plugin.webview.ui.tools.fts.i2.None) {
            Ka();
            i2Var = i2Var2;
        }
        if (this.E5) {
            Ga();
            android.view.View view = this.f184288c5;
            if (view != null) {
                view.post(new com.tencent.mm.plugin.webview.ui.tools.fts.v1(this, 0.0f));
            }
        }
        if (this.B5 && (nVar = this.f183844p0) != null) {
            if (nVar.f340895i) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "onClientNavAction success, ready");
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("action", "willExitSearch");
                com.tencent.mm.sdk.platformtools.u3.h(new nw4.b1(nVar, nw4.x2.c("onClientNavAction", hashMap, nVar.f340903q, nVar.f340904r)));
                z17 = true;
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onClientNavAction fail, not ready");
                z17 = false;
            }
            if (z17) {
                this.D5 = i2Var;
                return true;
            }
        }
        if (i2Var == com.tencent.mm.plugin.webview.ui.tools.fts.i2.Back) {
            ma();
        }
        return false;
    }

    public final boolean Da() {
        int i17 = this.Y3;
        return i17 == 3147 || i17 == 4501 || this.f184256m4;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI
    public void E9() {
        com.tencent.mm.plugin.websearch.widget.SOSEditTextView sOSEditTextView = this.J4;
        if (sOSEditTextView != null) {
            sOSEditTextView.e();
            this.J4.getEditText().setEllipsize(null);
            this.J4.getEditText().setKeyListener(new android.text.method.TextKeyListener(android.text.method.TextKeyListener.Capitalize.NONE, false));
            if (!this.J4.k()) {
                this.J4.m();
                showVKB();
            }
            this.J4.setHint(ia());
        }
    }

    public final void Ea(int i17) {
        com.tencent.mm.plugin.websearch.widget.SOSEditTextView.T = i17 == 3147 || i17 == 4501 || ((s50.u0) ((u50.z) i95.n0.c(u50.z.class))).Ai(i17);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI, al5.o2
    public void F3(int i17, int i18, int i19, int i27) {
        super.F3(i17, i18, i19, i27);
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f183815f;
        if (mMWebView == null) {
            return;
        }
        int min = java.lang.Math.min(i18, java.lang.Math.max(i65.a.b(this, mMWebView.getContentHeight()) - this.f183815f.getHeight(), 0));
        com.tencent.mm.plugin.webview.ui.tools.fts.z4 z4Var = this.f184290e5;
        int i28 = this.f184311z5;
        z4Var.f184689o[0][0] = i28 - min;
        this.f184291f5.f184689o[0][0] = i28 - min;
        this.f184292g5.f184689o[0][0] = i28 - min;
        if (!this.f184301p5.q()) {
            float f17 = -min;
            this.Z4.setTranslationY(f17);
            this.F4.setTranslationY(f17);
        }
        if (i18 != 0) {
            this.J4.d();
            hideVKB();
        }
    }

    public boolean Fa(boolean z17) {
        if (!this.X4) {
            return true;
        }
        this.J4.v(false);
        this.f184301p5.l(0);
        va(z17);
        return true;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI, tj5.n
    public boolean G0() {
        java.util.ArrayList<java.lang.String> stringArrayListExtra;
        int intExtra = getIntent().getIntExtra(com.tencent.mm.ui.w2.f211201n, 0);
        if (intExtra != 0 && (stringArrayListExtra = getIntent().getStringArrayListExtra(com.tencent.mm.ui.w2.f211202o)) != null) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(intExtra, stringArrayListExtra);
        }
        Fa(true);
        return true;
    }

    public final void Ga() {
        nw4.n nVar = this.f183844p0;
        if (nVar != null) {
            if (!nVar.f340895i) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onNavBarShadowManuallyHidden fail, not ready");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "onNavBarShadowManuallyHidden success, ready");
                com.tencent.mm.sdk.platformtools.u3.h(new nw4.c1(nVar, nw4.x2.c("onNavBarShadowManuallyHidden", new java.util.HashMap(), nVar.f340903q, nVar.f340904r)));
            }
        }
    }

    public final void Ha(int i17, java.lang.String str, int i18) {
        com.tencent.mm.autogen.mmdata.rpt.ChatImageWebSearchActionStruct chatImageWebSearchActionStruct = new com.tencent.mm.autogen.mmdata.rpt.ChatImageWebSearchActionStruct();
        chatImageWebSearchActionStruct.f55627e = i17;
        chatImageWebSearchActionStruct.f55628f = 0;
        chatImageWebSearchActionStruct.t(str);
        chatImageWebSearchActionStruct.f55629g = i18;
        chatImageWebSearchActionStruct.f55635m = java.lang.System.currentTimeMillis();
        chatImageWebSearchActionStruct.k();
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI
    public void I9() {
        G0();
    }

    public final void Ia(java.lang.String str) {
        android.widget.TextView textView = this.f184289d5;
        if (textView != null && textView.getVisibility() == 0 && !com.tencent.mm.sdk.platformtools.t8.J0(this.f184289d5.getText())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "reportAction25147, show hide searchtitle.");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stack = ");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(new com.tencent.mm.sdk.platformtools.z3());
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", sb6.toString());
        java.lang.String string = com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).getString("sos_fts_search_data_tmp", "");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            try {
                jSONObject = new org.json.JSONObject(string);
            } catch (java.lang.Exception unused) {
            }
        }
        java.lang.String optString = jSONObject.optString("requestId");
        this.f184252i4 = jSONObject.optInt("type");
        java.lang.String optString2 = jSONObject.optString("url");
        this.f184254k4 = jSONObject.optString("parentSearchID");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "requestId = %s, type = %s, searchData = %s, rawUrl = %s.", optString, java.lang.Long.valueOf(this.f184252i4), jSONObject.toString(), optString2);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "reportAction25147 searchData = %s, searchDataTmp = %s, mapRawUrl= %s.", jSONObject, string, this.f184254k4);
        com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI.ha(this.B3, this.f184304s5, optString, 2, this.Y3, 2, str, this.f184252i4, this.f184254k4);
    }

    public final void Ja() {
        android.widget.TextView textView = this.f184289d5;
        if (textView != null && textView.getVisibility() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "reportExpose, show hide searchtitle.");
        } else {
            if (this.G5) {
                return;
            }
            this.G5 = true;
            this.K5.postDelayed(new com.tencent.mm.plugin.webview.ui.tools.fts.h2(this), 1000L);
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI
    public java.lang.String K9() {
        com.tencent.mm.plugin.websearch.widget.SOSEditTextView sOSEditTextView = this.J4;
        return sOSEditTextView != null ? sOSEditTextView.getInEditTextQuery() : "";
    }

    public void Ka() {
        int i17 = this.f184309x5;
        if (i17 == 1) {
            if (com.tencent.mm.ui.bk.C()) {
                this.O4.setImageDrawable(com.tencent.mm.ui.uk.e(this, com.tencent.mm.R.raw.icons_outlined_close, -1));
                return;
            } else {
                this.O4.setImageDrawable(com.tencent.mm.ui.uk.e(this, com.tencent.mm.R.raw.icons_outlined_close, -16777216));
                return;
            }
        }
        if (i17 != 2) {
            this.O4.setImageDrawable(com.tencent.mm.ui.uk.e(this, com.tencent.mm.R.raw.actionbar_icon_dark_back, -16777216));
        } else {
            this.O4.setVisibility(8);
            this.f184302q5 = 0;
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI
    public int L9() {
        return this.f184300o5;
    }

    public final void La() {
        Ra(8);
        this.Q4 = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "updateSearchBarStatus hasHappenQuery = %s.", java.lang.Boolean.valueOf(this.F5));
        if ((this.F5 || this.T4) ? false : true) {
            this.J4.setCancelBtnForceHide(true);
            this.J4.setSearchBarCancelTextContainerVisibile(8);
        }
        this.J4.setForceShowClearBtn(true);
        this.J4.setActionSearchDoneListener(this);
        this.J4.setCancelVisableChangeListener(new com.tencent.mm.plugin.webview.ui.tools.fts.x1(this));
        this.J4.setSearchIconGone(0);
        this.J4.g();
        this.J4.setIconMarginVisable(8);
        if (this.J4.getSearchBarCancelTextContainer() != null) {
            com.tencent.mm.plugin.websearch.widget.SOSEditTextView sOSEditTextView = this.J4;
            sOSEditTextView.u(sOSEditTextView.getSearchBarCancelTextContainer().getVisibility() == 0);
        }
        Qa();
        Sa((int) getResources().getDimension(com.tencent.mm.R.dimen.f479688cn));
        if (!Da()) {
            this.J4.setCommonRightBtnForceHide(true);
            this.J4.setCommonRightImageButtonVisibile(8);
        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(P9())) {
            this.J4.setCommonRightBtnForceHide(true);
            this.J4.setCommonRightImageButtonVisibile(8);
        } else {
            this.J4.setCommonRightBtnForceHide(false);
            this.J4.setCommonRightImageButtonVisibile(0);
        }
        android.view.View view = this.H4;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "searchBarShowStrengthenType", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "searchBarShowStrengthenType", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        if (this.J4.getSearchDone() != null) {
            android.view.View searchDone = this.J4.getSearchDone();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(searchDone, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "searchBarShowStrengthenType", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            searchDone.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(searchDone, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "searchBarShowStrengthenType", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI
    public android.graphics.drawable.Drawable M9(int i17) {
        return !this.T4 ? getResources().getDrawable(com.tencent.mm.R.drawable.b7w) : this.f184255l4 ? getResources().getDrawable(com.tencent.mm.R.raw.icons_outlined_wechat_search_one_search) : super.M9(i17);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Ma(int r11) {
        /*
            r10 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "setFtsVoiceBtnsLayoutVisibile stack = "
            r0.<init>(r1)
            boolean r1 = com.tencent.mm.sdk.platformtools.t8.f192989a
            com.tencent.mm.sdk.platformtools.z3 r1 = new com.tencent.mm.sdk.platformtools.z3
            r1.<init>()
            r0.append(r1)
            java.lang.String r1 = ", visibility = "
            r0.append(r1)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.WebSearch.FTSSOSHomeWebViewUI"
            com.tencent.mars.xlog.Log.i(r1, r0)
            int r0 = r10.Y3
            r2 = 130(0x82, float:1.82E-43)
            r3 = 8
            if (r0 == r2) goto L72
            r2 = 197(0xc5, float:2.76E-43)
            if (r0 == r2) goto L72
            r2 = 3147(0xc4b, float:4.41E-42)
            if (r0 == r2) goto L72
            r2 = 3205(0xc85, float:4.491E-42)
            if (r0 == r2) goto L72
            r2 = 8100(0x1fa4, float:1.135E-41)
            if (r0 < r2) goto L3f
            r2 = 8500(0x2134, float:1.1911E-41)
            if (r0 <= r2) goto L72
        L3f:
            r2 = 224(0xe0, float:3.14E-43)
            if (r0 < r2) goto L47
            r2 = 227(0xe3, float:3.18E-43)
            if (r0 <= r2) goto L72
        L47:
            r2 = 4001(0xfa1, float:5.607E-42)
            if (r0 < r2) goto L4f
            r2 = 4500(0x1194, float:6.306E-42)
            if (r0 <= r2) goto L72
        L4f:
            r2 = 4501(0x1195, float:6.307E-42)
            if (r0 < r2) goto L58
            r2 = 4600(0x11f8, float:6.446E-42)
            if (r0 > r2) goto L58
            goto L72
        L58:
            android.view.View r0 = r10.F4
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L67
            java.lang.String r11 = "setFtsVoiceBtnsLayoutVisibile GONE, searchInput: INVISIBLE"
            com.tencent.mars.xlog.Log.i(r1, r11)
            goto L86
        L67:
            boolean r0 = r10.f184256m4
            if (r0 == 0) goto L87
            java.lang.String r11 = "setFtsVoiceBtnsLayoutVisibile GONE, isFinderVoiceCameraEnabled"
            com.tencent.mars.xlog.Log.i(r1, r11)
            goto L86
        L72:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "setFtsVoiceBtnsLayoutVisibile GONE, scene: "
            r11.<init>(r0)
            int r0 = r10.Y3
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            com.tencent.mars.xlog.Log.i(r1, r11)
        L86:
            r11 = r3
        L87:
            android.view.View r8 = r10.f184297l5
            if (r8 == 0) goto Ld2
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.lang.ThreadLocal r0 = zj0.c.f473285a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r9.add(r11)
            java.util.Collections.reverse(r9)
            java.lang.Object[] r1 = r9.toArray()
            java.lang.String r2 = "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI"
            java.lang.String r3 = "setFtsVoiceBtnsLayoutVisibile"
            java.lang.String r4 = "(I)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            r0 = r8
            yj0.a.d(r0, r1, r2, r3, r4, r5, r6, r7)
            r11 = 0
            java.lang.Object r11 = r9.get(r11)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r8.setVisibility(r11)
            java.lang.String r1 = "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI"
            java.lang.String r2 = "setFtsVoiceBtnsLayoutVisibile"
            java.lang.String r3 = "(I)V"
            java.lang.String r4 = "android/view/View_EXEC_"
            java.lang.String r5 = "setVisibility"
            java.lang.String r6 = "(I)V"
            r0 = r8
            yj0.a.f(r0, r1, r2, r3, r4, r5, r6)
        Ld2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI.Ma(int):void");
    }

    public final void Na(boolean z17) {
        androidx.lifecycle.j0 Di;
        sg0.u3 u3Var = (sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class));
        u3Var.getClass();
        java.util.Set<java.lang.String> set = ug0.q.f427472n ? (java.util.Set) ((jz5.n) ug0.q.T6(u3Var).f427473f).getValue() : null;
        if (set == null || set.isEmpty()) {
            return;
        }
        zy2.ca caVar = (zy2.ca) i95.n0.c(zy2.ca.class);
        for (java.lang.String str : set) {
            if (str != null && !str.isEmpty() && (Di = ((c61.t8) caVar).Di(str)) != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "switchRedDotObserver, shouldStart: " + z17 + ", eachRedDotPath: " + str);
                androidx.lifecycle.k0 k0Var = this.J5;
                if (z17) {
                    Di.observe(this, k0Var);
                } else {
                    Di.removeObserver(k0Var);
                }
            }
        }
    }

    public void Oa(com.tencent.mm.plugin.webview.ui.tools.fts.i2 i2Var) {
        android.widget.ImageView imageView;
        com.tencent.mm.plugin.webview.ui.tools.fts.i2 i2Var2 = com.tencent.mm.plugin.webview.ui.tools.fts.i2.Back;
        com.tencent.mm.plugin.webview.ui.tools.fts.i2 i2Var3 = com.tencent.mm.plugin.webview.ui.tools.fts.i2.cancel;
        if ((i2Var == i2Var2 || i2Var == i2Var3) && (imageView = this.O4) != null) {
            if (i2Var == i2Var2) {
                if (com.tencent.mm.ui.bk.C()) {
                    this.O4.setImageDrawable(com.tencent.mm.ui.uk.e(this, com.tencent.mm.R.raw.actionbar_icon_dark_back, -1));
                } else {
                    this.O4.setImageDrawable(com.tencent.mm.ui.uk.e(this, com.tencent.mm.R.raw.actionbar_icon_dark_back, -16777216));
                }
            } else if (i2Var == i2Var3) {
                imageView.setImageDrawable(com.tencent.mm.ui.uk.e(this, com.tencent.mm.R.raw.icons_outlined_close, -16777216));
            }
            this.O4.setVisibility(0);
        }
    }

    public final void Pa(int i17) {
        if (!this.T4) {
            this.J4.getIconView().setImageDrawable(getResources().getDrawable(com.tencent.mm.R.drawable.b7w));
            return;
        }
        this.J4.getIconView().setImageDrawable(M9(i17));
        this.J4.getIconView().setIconColor(getResources().getColor(com.tencent.mm.R.color.FG_2));
        Aa();
    }

    public final void Qa() {
        android.view.View view = this.H4;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "updateSearchInputBg", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "updateSearchInputBg", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int i17 = this.H3;
            if (i17 == 1) {
                this.H4.setBackgroundDrawable(getResources().getDrawable(com.tencent.mm.R.drawable.d9h));
            } else if (i17 == 2) {
                this.H4.setBackgroundDrawable(getResources().getDrawable(com.tencent.mm.R.drawable.d9i));
            } else {
                this.H4.setBackgroundDrawable(getResources().getDrawable(com.tencent.mm.R.drawable.b3a));
            }
            if (this.J4.getCancelTextView() != null) {
                this.J4.getCancelTextView().post(new com.tencent.mm.plugin.webview.ui.tools.fts.y1(this));
            }
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI, com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI, com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI, com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public void R7(int i17, android.os.Bundle bundle) {
        java.lang.String string;
        android.view.View view;
        super.R7(i17, bundle);
        if (i17 == 119) {
            this.f184301p5.l(8);
            return;
        }
        if (i17 == 122) {
            this.f184301p5.l(10);
            return;
        }
        if (i17 == 136) {
            bundle.getString("fts_key_new_query", "");
            this.f184301p5.l(13);
            return;
        }
        if (i17 == 161) {
            boolean z17 = bundle.getBoolean("fts_key_interactivepopgesture_enabled", true);
            this.H5 = z17;
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "set controlBackPressEnable = %s", java.lang.Boolean.valueOf(z17));
            return;
        }
        switch (i17) {
            case 154:
                java.lang.String string2 = bundle.getString("fts_key_data", "exit");
                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "handleFTSAction, action = " + string2);
                boolean equals = android.text.TextUtils.equals("resignControl", string2);
                com.tencent.mm.plugin.webview.ui.tools.fts.i2 i2Var = com.tencent.mm.plugin.webview.ui.tools.fts.i2.None;
                if (equals) {
                    this.B5 = false;
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "AC_ON_NAV_CONTROL, forceBackType = " + this.C5);
                    if (this.C5 != i2Var) {
                        Ka();
                    }
                    this.C5 = i2Var;
                } else if (android.text.TextUtils.equals("controlExit", string2)) {
                    java.lang.String string3 = bundle.getString("fts_key_leftBar_button_type", "");
                    this.B5 = true;
                    if (android.text.TextUtils.equals("exit", string3)) {
                        com.tencent.mm.plugin.webview.ui.tools.fts.i2 i2Var2 = com.tencent.mm.plugin.webview.ui.tools.fts.i2.cancel;
                        this.C5 = i2Var2;
                        Oa(i2Var2);
                    } else if (android.text.TextUtils.equals("back", string3)) {
                        com.tencent.mm.plugin.webview.ui.tools.fts.i2 i2Var3 = com.tencent.mm.plugin.webview.ui.tools.fts.i2.Back;
                        this.C5 = i2Var3;
                        Oa(i2Var3);
                    } else {
                        this.C5 = i2Var;
                    }
                } else if (android.text.TextUtils.equals("exit", string2)) {
                    this.B5 = false;
                    this.C5 = i2Var;
                    boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(this.f184246c4);
                    java.util.HashMap hashMap = this.f184261s4;
                    if (K0) {
                        hashMap.put("query", N9());
                    } else {
                        hashMap.put("query", this.f184246c4);
                    }
                    hashMap.put("exittype", "3");
                    oa();
                } else if (android.text.TextUtils.equals("configNavBar", string2)) {
                    java.lang.String string4 = bundle.getString("recommendSearchQuery", "");
                    int i18 = bundle.getInt("key_back_btn_type", 0);
                    if (i18 == 1) {
                        if (com.tencent.mm.ui.bk.C()) {
                            this.O4.setImageDrawable(com.tencent.mm.ui.uk.e(this, com.tencent.mm.R.raw.icons_outlined_close, -1));
                        } else {
                            this.O4.setImageDrawable(com.tencent.mm.ui.uk.e(this, com.tencent.mm.R.raw.icons_outlined_close, -16777216));
                        }
                    } else if (i18 == 2) {
                        this.O4.setVisibility(8);
                        this.f184302q5 = 0;
                    } else if (i18 == 3) {
                        if (com.tencent.mm.ui.bk.C()) {
                            this.O4.setImageDrawable(com.tencent.mm.ui.uk.e(this, com.tencent.mm.R.raw.actionbar_icon_dark_back, -1));
                        } else {
                            this.O4.setImageDrawable(com.tencent.mm.ui.uk.e(this, com.tencent.mm.R.raw.actionbar_icon_dark_back, -16777216));
                        }
                    }
                    if (bundle.getInt("key_share_btn_type", 0) == 1) {
                        this.P4.setVisibility(0);
                        this.P4.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI$$f
                            @Override // android.view.View.OnClickListener
                            public final void onClick(android.view.View view2) {
                                int i19 = com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI.R5;
                                final com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI = com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI.this;
                                fTSSOSHomeWebViewUI.getClass();
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                arrayList.add(view2);
                                java.lang.Object[] array = arrayList.toArray();
                                arrayList.clear();
                                yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", fTSSOSHomeWebViewUI, array);
                                android.content.Intent intent = new android.content.Intent();
                                try {
                                    if (fTSSOSHomeWebViewUI.f183844p0 != null) {
                                        fTSSOSHomeWebViewUI.o9(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI$$g
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                int i27 = com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI.R5;
                                                com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI.this.f183844p0.k0();
                                            }
                                        });
                                    }
                                    intent.putExtra("Retr_Msg_content", fTSSOSHomeWebViewUI.f184289d5.getText().toString());
                                    intent.putExtra("Retr_Msg_Type", 4);
                                    j45.l.v(fTSSOSHomeWebViewUI, ".ui.transmit.MsgRetransmitUI", intent, 2);
                                } catch (java.lang.Exception e17) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "share failed for " + e17);
                                }
                                yj0.a.h(fTSSOSHomeWebViewUI, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                            }
                        });
                    }
                    java.lang.String string5 = bundle.getString("key_search_bar_text_color");
                    if ("placeholderColor".equals(string5)) {
                        this.J4.setTextColor(getResources().getColor(com.tencent.mm.R.color.f479232tk));
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "handleFTSAction, searchBarTextColor = %s.", string5);
                    if (bundle.getBoolean("key_search_hide_nav_bottom_line") && (view = this.I4) != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(8);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "handleFTSAction", "(ILandroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "handleFTSAction", "(ILandroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    boolean z18 = bundle.getBoolean("ftsneedkeyboard", false);
                    int i19 = bundle.getInt("hideSearchInput", 0);
                    if (i19 != 0) {
                        if (i19 == 1) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "first enter, hideSearchBarType = " + i19 + ", isHideSearchInput = " + this.f184306u5);
                            this.f184306u5 = true;
                            android.view.View view2 = this.F4;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                            arrayList2.add(8);
                            java.util.Collections.reverse(arrayList2);
                            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "handleFTSAction", "(ILandroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                            yj0.a.f(view2, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "handleFTSAction", "(ILandroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            if (!this.f184307v5) {
                                android.view.View view3 = this.f184295j5;
                                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                arrayList3.add(0);
                                java.util.Collections.reverse(arrayList3);
                                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "handleFTSAction", "(ILandroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                                yj0.a.f(view3, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "handleFTSAction", "(ILandroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            }
                            if (getIntent().hasExtra("customize_status_bar_color")) {
                                this.f184296k5.setBackgroundColor(this.Y1);
                                if (getIntent().hasExtra("status_bar_style")) {
                                    Q8(this.Y1, "black".equals(this.Z1));
                                }
                            }
                            this.f184289d5.setVisibility(0);
                            java.lang.String stringExtra = getIntent().getStringExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                            if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                                stringExtra = getString(com.tencent.mm.R.string.f491241cg4);
                            }
                            this.f184289d5.setText(stringExtra);
                            android.view.View view4 = this.f184296k5;
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            arrayList4.add(0);
                            java.util.Collections.reverse(arrayList4);
                            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "handleFTSAction", "(ILandroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                            yj0.a.f(view4, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "handleFTSAction", "(ILandroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            getIntent().putExtra("hideSearchInput", this.f184306u5);
                        } else if (i19 == 2 && (this.T4 || !z18)) {
                            this.f184306u5 = false;
                            android.view.View view5 = this.F4;
                            java.util.ArrayList arrayList5 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                            arrayList5.add(0);
                            java.util.Collections.reverse(arrayList5);
                            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "handleFTSAction", "(ILandroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                            yj0.a.f(view5, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "handleFTSAction", "(ILandroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            this.O4.setVisibility(0);
                            this.f184289d5.setVisibility(8);
                            android.view.View view6 = this.f184296k5;
                            java.util.ArrayList arrayList6 = new java.util.ArrayList();
                            arrayList6.add(8);
                            java.util.Collections.reverse(arrayList6);
                            yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "handleFTSAction", "(ILandroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                            yj0.a.f(view6, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "handleFTSAction", "(ILandroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            getIntent().putExtra("hideSearchInput", this.f184306u5);
                        } else if (!this.T4) {
                            this.f184306u5 = false;
                            android.view.View view7 = this.F4;
                            java.util.ArrayList arrayList7 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                            arrayList7.add(0);
                            java.util.Collections.reverse(arrayList7);
                            yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "handleFTSAction", "(ILandroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                            yj0.a.f(view7, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "handleFTSAction", "(ILandroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            this.O4.setVisibility(0);
                            this.f184289d5.setVisibility(8);
                            this.J4.m();
                            this.J4.s();
                            android.view.View view8 = this.f184296k5;
                            java.util.ArrayList arrayList8 = new java.util.ArrayList();
                            arrayList8.add(8);
                            java.util.Collections.reverse(arrayList8);
                            yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "handleFTSAction", "(ILandroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                            yj0.a.f(view8, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "handleFTSAction", "(ILandroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            getIntent().putExtra("hideSearchInput", this.f184306u5);
                        }
                    }
                    if (this.f184306u5) {
                        string = bundle.getString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                            this.f184289d5.setText(string);
                        }
                    } else {
                        if (z18) {
                            getContentView().postDelayed(new com.tencent.mm.plugin.webview.ui.tools.fts.q1(this), 128L);
                        }
                        string = "";
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "backButtonType = " + i18 + ", pageTitle = " + string + ", hideSearchBarType = " + i19 + ", ftsNeedKeyBoard = " + z18);
                    if (com.tencent.mm.sdk.platformtools.t8.K0(string4)) {
                        this.J4.setRecommendSearchHint("");
                        this.J4.setHint(ia());
                    } else {
                        this.J4.setRecommendSearchHint(string4);
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "AC_ON_NAV_CONTROL mIsExitControl:%b, lastClickType:%s", java.lang.Boolean.valueOf(this.B5), this.D5);
                return;
            case 155:
                int i27 = bundle.getInt("fts_key_data");
                int i28 = bundle.getInt("fts_key_cache");
                float f17 = bundle.getFloat("fts_key_custom_query");
                android.view.View view9 = this.f184288c5;
                if (view9 != null) {
                    view9.post(new com.tencent.mm.plugin.webview.ui.tools.fts.r1(this, i28, i27, f17));
                    return;
                }
                return;
            case 156:
                float f18 = bundle.getFloat("fts_key_custom_query");
                android.view.View view10 = this.f184288c5;
                if (view10 != null) {
                    view10.post(new com.tencent.mm.plugin.webview.ui.tools.fts.v1(this, f18));
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI
    public void R9() {
        Ma(8);
    }

    public final void Ra(int i17) {
        android.view.View view = this.f184287b5;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "updateShadowView", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "updateShadowView", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int S6() {
        boolean z17 = false;
        if (getIntent() != null && getIntent().getBooleanExtra("ftsInitToSearch", false)) {
            z17 = true;
        }
        this.K4 = z17;
        if (!fp.h.c(23)) {
            return getActionbarColor();
        }
        u75.d.g();
        return this.K4 ? getResources().getColor(com.tencent.mm.R.color.aaw) : getResources().getColor(com.tencent.mm.R.color.aac);
    }

    public final void Sa(int i17) {
        com.tencent.mm.plugin.websearch.widget.SOSEditTextView sOSEditTextView = this.J4;
        if (sOSEditTextView != null) {
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) sOSEditTextView.getLayoutParams();
            layoutParams.leftMargin = i17;
            this.J4.setLayoutParams(layoutParams);
        }
    }

    public final void Ta(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "updateWebViewStatus isCancelling:%b visible:%s", java.lang.Boolean.valueOf(this.W4), java.lang.Boolean.valueOf(z17));
        com.tencent.mm.plugin.webview.ui.tools.WebViewKeyboardLinearLayout webViewKeyboardLinearLayout = this.f183865w;
        if (webViewKeyboardLinearLayout != null) {
            if (this.W4 || !z17) {
                webViewKeyboardLinearLayout.setAlpha(0.0f);
            } else {
                webViewKeyboardLinearLayout.setAlpha(1.0f);
            }
        }
        if (this.J4.getEditText() == null || !com.tencent.mm.sdk.platformtools.t8.J0(this.J4.getEditText().getText())) {
            return;
        }
        this.J4.setClearBtnVisable(8);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI, tj5.n
    public void U1(boolean z17) {
        com.tencent.mm.plugin.webview.ui.tools.fts.o2 o2Var = this.f184301p5;
        if (o2Var == null) {
            return;
        }
        if (o2Var.q()) {
            super.U1(z17);
        }
        if (this.T4) {
            return;
        }
        this.f184301p5.l(5);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI, com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI
    public boolean X9() {
        com.tencent.mm.plugin.webview.ui.tools.fts.o2 o2Var = this.f184301p5;
        if (o2Var == null) {
            return false;
        }
        return o2Var.q();
    }

    @Override // tj5.l
    public boolean Y3(android.view.View view) {
        Ia("3");
        Fa(false);
        return true;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI
    public void da(java.lang.String str) {
        com.tencent.mm.plugin.websearch.widget.SOSEditTextView sOSEditTextView = this.J4;
        if (sOSEditTextView != null) {
            sOSEditTextView.p(str, null, tj5.o.UserInput, false, true);
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI, com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        int i17 = this.Y3;
        if (i17 == 67 || i17 == 81 || i17 == 83 || i17 == 100) {
            Ha(11, getIntent().getStringExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID), this.Y3);
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI
    public boolean ga() {
        return (!X9() || this.f184290e5.f184692r || this.f184291f5.f184692r || this.f184292g5.f184692r) ? false : true;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        Ea(getIntent().getIntExtra("ftsbizscene", 0));
        return com.tencent.mm.R.layout.cv8;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI
    public java.lang.String ia() {
        return !com.tencent.mm.sdk.platformtools.t8.K0(this.f184258p4) ? this.f184258p4 : this.f184255l4 ? com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f490549y8) : Ba(this.f184245b4);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI
    public int ja() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI
    public java.lang.String ka() {
        return "";
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI
    public void la(java.util.List list) {
        if (this.T4) {
            return;
        }
        if (!this.F5 && list.size() == 1) {
            this.F5 = true;
            this.J4.setCancelBtnForceHide(true);
            this.J4.setSearchBarCancelTextContainerVisibile(8);
        } else if (list.size() > 1) {
            this.J4.setCancelBtnForceHide(false);
            this.J4.setSearchBarCancelTextContainerVisibile(0);
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI
    public void na() {
        com.tencent.mm.plugin.websearch.widget.SOSEditTextView sOSEditTextView;
        int i17;
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.K5;
        n3Var.removeMessages(101);
        n3Var.sendEmptyMessageDelayed(101, 500L);
        com.tencent.mm.plugin.webview.ui.tools.fts.m1 m1Var = new com.tencent.mm.plugin.webview.ui.tools.fts.m1(this);
        java.util.List list = this.R4;
        boolean z17 = false;
        com.tencent.mm.plugin.webview.ui.tools.fts.b0 b0Var = (list == null || ((java.util.ArrayList) list).size() <= 0) ? null : (com.tencent.mm.plugin.webview.ui.tools.fts.b0) ((java.util.ArrayList) this.R4).get(0);
        if (b0Var != null && (sOSEditTextView = this.J4) != null && (((i17 = this.S4) == 3 || i17 == 6) && sOSEditTextView.getEditText() != null)) {
            ((java.util.ArrayList) this.R4).remove(0);
            this.J4.n(b0Var.f184344b, b0Var.f184345c);
            m1Var.run();
            z17 = true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BaseSOSWebViewUI", "needHideSuggestionFrist = %s", java.lang.Boolean.valueOf(z17));
        if (z17) {
            return;
        }
        boolean z18 = this.B5;
        com.tencent.mm.plugin.webview.ui.tools.fts.i2 i2Var = com.tencent.mm.plugin.webview.ui.tools.fts.i2.Back;
        if (z18 && Ca(i2Var)) {
            return;
        }
        if (ma() || !Ca(i2Var)) {
            super.na();
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI
    public void oa() {
        if (this.f184303r5 <= 0 && !Ca(com.tencent.mm.plugin.webview.ui.tools.fts.i2.cancel)) {
            super.oa();
            this.f183815f.scrollTo(0, 0);
            Pa(0);
            this.J4.g();
            this.J4.setHint(ia());
            this.f184301p5.l(2);
            this.F4.setBackgroundResource(com.tencent.mm.R.drawable.b3_);
            Ra(8);
            android.view.View view = this.f184286a5;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "onClickCancelBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "onClickCancelBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15521, java.lang.Integer.valueOf(this.Y3), 1, this.J4.getInEditTextQuery(), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Integer.valueOf(this.f184245b4));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0065, code lost:
    
        r9 = r9.substring(0, r5) + (char) 8230;
     */
    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI, com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityResult(int r9, final int r10, android.content.Intent r11) {
        /*
            r8 = this;
            super.onActivityResult(r9, r10, r11)
            r0 = 1
            if (r9 == r0) goto L18
            r11 = 2
            if (r9 == r11) goto La
            return
        La:
            nw4.n r9 = r8.f183844p0
            if (r9 == 0) goto La1
            com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI$$a r9 = new com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI$$a
            r9.<init>()
            r8.o9(r9)
            goto La1
        L18:
            if (r11 != 0) goto L1c
            goto La1
        L1c:
            java.lang.String r9 = "text"
            java.lang.String r9 = r11.getStringExtra(r9)
            boolean r10 = android.text.TextUtils.isEmpty(r9)
            if (r10 != 0) goto La1
            r10 = 0
            if (r9 == 0) goto L80
            int r11 = com.tencent.mm.ui.tools.v4.f(r9)     // Catch: java.lang.Exception -> L80
            r1 = 100
            if (r11 > r1) goto L35
            goto L80
        L35:
            int r11 = r9.length()     // Catch: java.lang.Exception -> L80
            r2 = 200(0xc8, float:2.8E-43)
            if (r11 <= r2) goto L41
            java.lang.String r9 = r9.substring(r10, r2)     // Catch: java.lang.Exception -> L80
        L41:
            char[] r11 = r9.toCharArray()     // Catch: java.lang.Exception -> L80
            int r2 = r11.length     // Catch: java.lang.Exception -> L80
            r3 = r10
            r4 = r3
            r5 = r4
        L49:
            if (r3 >= r2) goto L80
            char r6 = r11[r3]     // Catch: java.lang.Exception -> L80
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L80
            r7.<init>()     // Catch: java.lang.Exception -> L80
            r7.append(r6)     // Catch: java.lang.Exception -> L80
            java.lang.String r6 = ""
            r7.append(r6)     // Catch: java.lang.Exception -> L80
            java.lang.String r6 = r7.toString()     // Catch: java.lang.Exception -> L80
            int r6 = com.tencent.mm.ui.tools.v4.f(r6)     // Catch: java.lang.Exception -> L80
            int r4 = r4 + r6
            if (r4 < r1) goto L7b
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L80
            r11.<init>()     // Catch: java.lang.Exception -> L80
            java.lang.String r1 = r9.substring(r10, r5)     // Catch: java.lang.Exception -> L80
            r11.append(r1)     // Catch: java.lang.Exception -> L80
            r1 = 8230(0x2026, float:1.1533E-41)
            r11.append(r1)     // Catch: java.lang.Exception -> L80
            java.lang.String r9 = r11.toString()     // Catch: java.lang.Exception -> L80
            goto L80
        L7b:
            int r5 = r5 + 1
            int r3 = r3 + 1
            goto L49
        L80:
            int r11 = r9.length()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Object[] r11 = new java.lang.Object[]{r11, r9}
            java.lang.String r1 = "MicroMsg.WebSearch.FTSSOSHomeWebViewUI"
            java.lang.String r2 = "voice input final text len %d , text %s"
            com.tencent.mars.xlog.Log.i(r1, r2, r11)
            r8.f184247d4 = r0
            r8.f184248e4 = r9
            com.tencent.mm.plugin.websearch.widget.SOSEditTextView r11 = r8.J4
            r0 = 0
            r11.n(r9, r0)
            r8.va(r10)
        La1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI, com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI, com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "onBackPressed, controlBackPressEnable = %s.", java.lang.Boolean.valueOf(this.H5));
        if (this.H5) {
            super.onBackPressed();
            this.J4.f();
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI, tj5.n
    public void onClickClearTextBtn(android.view.View view) {
        com.tencent.mm.plugin.webview.ui.tools.fts.j3 j3Var;
        super.onClickClearTextBtn(view);
        if (this.f184298m5 && (j3Var = this.f184299n5) != null) {
            com.tencent.mm.sdk.platformtools.n3 n3Var = j3Var.B;
            n3Var.removeMessages(1);
            n3Var.sendEmptyMessageDelayed(1, 0L);
            j3Var.D = "";
        }
        Ia("1");
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI, com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI, com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI, com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        int i17;
        Ea(getIntent().getIntExtra("ftsbizscene", 0));
        super.onCreate(bundle);
        this.f184298m5 = j62.e.g().c(new com.tencent.mm.repairer.config.search.RepairerConfigVoiceSearchNewStyle()) == 1 && j62.e.g().c(new com.tencent.mm.repairer.config.search.RepairerConfigFTSFloatingVoiceSearch()) <= 0 && !com.tencent.mm.ui.bk.U();
        this.f184301p5 = new com.tencent.mm.plugin.webview.ui.tools.fts.o2(this, "sos_home_webview_ui", getMainLooper());
        this.f184295j5 = findViewById(com.tencent.mm.R.id.f487336oc0);
        this.f184296k5 = findViewById(com.tencent.mm.R.id.f487337oc1);
        if (this.f184298m5) {
            this.f184297l5 = findViewById(com.tencent.mm.R.id.f485075rq1);
            if (com.tencent.mm.ui.bk.C()) {
                this.f184297l5.setBackgroundColor(-13619152);
            } else {
                this.f184297l5.setBackgroundColor(-855310);
            }
        } else {
            this.f184297l5 = findViewById(com.tencent.mm.R.id.ggg);
            android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f487617p71);
            if (imageView != null) {
                imageView.setImageDrawable(com.tencent.mm.ui.uk.e(this, com.tencent.mm.R.raw.icons_outlined_mike, i65.a.d(getContext(), com.tencent.mm.R.color.BW_0_Alpha_0_5)));
            }
        }
        Ma(0);
        this.f184286a5 = findViewById(com.tencent.mm.R.id.cg7);
        this.Z4 = findViewById(com.tencent.mm.R.id.odi);
        this.f184289d5 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.h07);
        this.f184288c5 = findViewById(com.tencent.mm.R.id.ndu);
        this.f184310y5 = findViewById(com.tencent.mm.R.id.meb);
        android.view.View view = this.F4;
        android.view.View view2 = this.Z4;
        com.tencent.mm.ui.widget.imageview.WeImageView iconView = this.J4.getIconView();
        android.widget.ImageView imageView2 = this.O4;
        com.tencent.mm.plugin.webview.ui.tools.fts.z4 z4Var = new com.tencent.mm.plugin.webview.ui.tools.fts.z4(this, view, view2, iconView, imageView2, imageView2, this.J4.getEditText(), this.f184295j5, this.f184296k5, this.H4, this.J4.getSearchDone());
        this.f184290e5 = z4Var;
        z4Var.f184693s = this.M5;
        android.view.View view3 = this.F4;
        android.view.View view4 = this.Z4;
        com.tencent.mm.ui.widget.imageview.WeImageView iconView2 = this.J4.getIconView();
        android.widget.ImageView imageView3 = this.O4;
        com.tencent.mm.plugin.webview.ui.tools.fts.c5 c5Var = new com.tencent.mm.plugin.webview.ui.tools.fts.c5(this, view3, view4, iconView2, imageView3, imageView3, this.J4.getEditText(), this.f184295j5, this.f184296k5, this.H4, this.J4.getSearchDone());
        this.f184291f5 = c5Var;
        c5Var.f184693s = this.O5;
        android.view.View view5 = this.F4;
        android.view.View view6 = this.Z4;
        com.tencent.mm.ui.widget.imageview.WeImageView iconView3 = this.J4.getIconView();
        android.widget.ImageView imageView4 = this.O4;
        com.tencent.mm.plugin.webview.ui.tools.fts.e5 e5Var = new com.tencent.mm.plugin.webview.ui.tools.fts.e5(this, view5, view6, iconView3, imageView4, imageView4, this.J4.getEditText(), this.f184295j5, this.f184296k5, this.H4, this.J4.getSearchDone());
        this.f184292g5 = e5Var;
        e5Var.f184693s = this.N5;
        this.f184287b5 = findViewById(com.tencent.mm.R.id.ndv);
        findViewById(com.tencent.mm.R.id.che).setOnTouchListener(new com.tencent.mm.plugin.webview.ui.tools.fts.a2(this));
        this.f184302q5 = i65.a.h(this, com.tencent.mm.R.dimen.f479688cn);
        com.tencent.mm.plugin.websearch.widget.SOSEditTextView sOSEditTextView = this.J4;
        sOSEditTextView.getEditText().setOnFocusChangeListener(sOSEditTextView.H);
        this.J4.g();
        this.K4 = getIntent().getBooleanExtra("ftsInitToSearch", false);
        this.f184306u5 = getIntent().getBooleanExtra("hideSearchInput", false);
        this.f184309x5 = getIntent().getIntExtra("key_back_btn_type", 0);
        if (getIntent().getIntExtra("key_share_btn_type", 0) == 1) {
            this.P4.setVisibility(0);
            this.P4.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI$$b
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view7) {
                    int i18 = com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI.R5;
                    final com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI = com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI.this;
                    fTSSOSHomeWebViewUI.getClass();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view7);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", fTSSOSHomeWebViewUI, array);
                    android.content.Intent intent = new android.content.Intent();
                    try {
                        if (fTSSOSHomeWebViewUI.f183844p0 != null) {
                            fTSSOSHomeWebViewUI.o9(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI$$d
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i19 = com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI.R5;
                                    com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI.this.f183844p0.k0();
                                }
                            });
                        }
                        intent.putExtra("Retr_Msg_content", fTSSOSHomeWebViewUI.f184289d5.getText().toString());
                        intent.putExtra("Retr_Msg_Type", 4);
                        j45.l.v(fTSSOSHomeWebViewUI, ".ui.transmit.MsgRetransmitUI", intent, 2);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "share failed for " + e17);
                    }
                    yj0.a.h(fTSSOSHomeWebViewUI, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
        }
        int i18 = this.H3;
        if (i18 == 1) {
            this.f183815f.getSettings().B(2);
            setNavigationbarColor(getResources().getColor(com.tencent.mm.R.color.anj));
            Q8(getResources().getColor(com.tencent.mm.R.color.anl), false);
            findViewById(com.tencent.mm.R.id.che).setBackground(getResources().getDrawable(com.tencent.mm.R.color.anj));
            findViewById(com.tencent.mm.R.id.mel).setBackground(getResources().getDrawable(com.tencent.mm.R.drawable.d9f));
            findViewById(com.tencent.mm.R.id.mek).setBackground(getResources().getDrawable(com.tencent.mm.R.drawable.d9j));
            findViewById(com.tencent.mm.R.id.mde).setBackground(getResources().getDrawable(com.tencent.mm.R.color.f479494am3));
            i17 = com.tencent.mm.R.id.f487337oc1;
            findViewById(com.tencent.mm.R.id.f487337oc1).setBackground(getResources().getDrawable(com.tencent.mm.R.color.anj));
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.aa8);
            if (findViewById instanceof com.tencent.mm.ui.widget.imageview.WeImageView) {
                ((com.tencent.mm.ui.widget.imageview.WeImageView) findViewById).setIconColor(getResources().getColor(com.tencent.mm.R.color.aib));
            }
        } else {
            i17 = com.tencent.mm.R.id.f487337oc1;
            if (i18 == 2) {
                this.f183815f.getSettings().B(0);
                setNavigationbarColor(getResources().getColor(com.tencent.mm.R.color.ank));
                Q8(getResources().getColor(com.tencent.mm.R.color.anm), true);
                findViewById(com.tencent.mm.R.id.che).setBackground(getResources().getDrawable(com.tencent.mm.R.color.ank));
                findViewById(com.tencent.mm.R.id.mel).setBackground(getResources().getDrawable(com.tencent.mm.R.drawable.d9g));
                findViewById(com.tencent.mm.R.id.mek).setBackground(getResources().getDrawable(com.tencent.mm.R.drawable.d9k));
                findViewById(com.tencent.mm.R.id.mde).setBackground(getResources().getDrawable(com.tencent.mm.R.color.f479495am4));
                findViewById(com.tencent.mm.R.id.f487337oc1).setBackground(getResources().getDrawable(com.tencent.mm.R.color.ank));
                android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.aa8);
                if (findViewById2 instanceof com.tencent.mm.ui.widget.imageview.WeImageView) {
                    ((com.tencent.mm.ui.widget.imageview.WeImageView) findViewById2).setIconColor(getResources().getColor(com.tencent.mm.R.color.aic));
                }
            }
        }
        int i19 = this.H3;
        if (i19 != 0) {
            boolean z17 = i19 == 1;
            int color = z17 ? getResources().getColor(com.tencent.mm.R.color.anl) : getResources().getColor(com.tencent.mm.R.color.anm);
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "applyThemeModeForSosBars, themeMode=%s, isDark=%s, unifiedColor=#%08X", java.lang.Integer.valueOf(this.H3), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(color));
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                try {
                    getWindow().setNavigationBarContrastEnforced(false);
                    getWindow().setStatusBarContrastEnforced(false);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "setBarContrastEnforced failed: %s", th6.getMessage());
                }
            }
            Q8(color, !z17);
            setNavigationbarColor(color);
            try {
                android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.che);
                if (findViewById3 != null) {
                    findViewById3.setBackgroundColor(color);
                }
                android.view.View findViewById4 = findViewById(i17);
                if (findViewById4 != null) {
                    findViewById4.setBackgroundColor(color);
                }
            } catch (java.lang.Throwable th7) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "applyThemeModeForSosBars, set bg failed: %s", th7.getMessage());
            }
            Aa();
        }
        this.f184305t5 = getIntent().getStringExtra("key_search_bar_text_color");
        com.tencent.mm.plugin.webview.ui.tools.fts.o2 o2Var = this.f184301p5;
        if (o2Var != null) {
            if (this.K4) {
                android.view.View view7 = this.F4;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view7, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view7, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f184296k5.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.a9e));
                com.tencent.mm.plugin.webview.ui.tools.fts.o2 o2Var2 = this.f184301p5;
                o2Var2.m(o2Var2.f184565i);
                if (fp.h.c(23)) {
                    if (this.f184265w4) {
                        Q8(getResources().getColor(com.tencent.mm.R.color.aaw), false);
                    } else {
                        C9(getResources().getColor(com.tencent.mm.R.color.aaw));
                    }
                }
            } else {
                o2Var.f184567n.J4.setSearchBarCancelTextContainerVisibile(0);
                o2Var.m(o2Var.f184563g);
            }
            this.f184301p5.n();
        }
        this.f184307v5 = getIntent().getBooleanExtra("hideSearchTitle", false);
        this.f184308w5 = getIntent().getBooleanExtra("hideSearchCancel", false);
        if (this.f184306u5 && this.f184307v5) {
            android.view.View view8 = this.f184295j5;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view8, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view8, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
            layoutParams.setMargins(0, 0, 0, 0);
            this.f183865w.setLayoutParams(layoutParams);
        }
        int i27 = this.f184309x5;
        if (i27 == 1) {
            if (com.tencent.mm.ui.bk.C()) {
                this.O4.setImageDrawable(com.tencent.mm.ui.uk.e(this, com.tencent.mm.R.raw.icons_outlined_close, -1));
            } else {
                this.O4.setImageDrawable(com.tencent.mm.ui.uk.e(this, com.tencent.mm.R.raw.icons_outlined_close, -16777216));
            }
        } else if (i27 == 2) {
            this.O4.setVisibility(8);
            this.f184302q5 = 0;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "searchBarTextColor = %s,", this.f184305t5);
        if ("placeholderColor".equals(this.f184305t5)) {
            this.J4.setTextColor(getResources().getColor(com.tencent.mm.R.color.FG_2));
        }
        int i28 = this.Y3;
        su4.j3 j3Var = su4.k3.f412979a;
        j3Var.f412964a = i28;
        j3Var.f412965b = 1;
        j3Var.f412966c = java.lang.System.currentTimeMillis();
        j3Var.f412967d = 0L;
        j3Var.f412968e = java.lang.System.currentTimeMillis();
        j3Var.f412969f = 0L;
        j3Var.f412970g = false;
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f183815f;
        if (mMWebView != null) {
            android.view.View view9 = mMWebView.getView();
            view9.setOnTouchListener(new com.tencent.mm.plugin.webview.ui.tools.fts.i1(this, view9));
        }
        this.F4.postDelayed(new com.tencent.mm.plugin.webview.ui.tools.fts.b2(this), 100L);
        this.J4.setCameraBtnClickListener(new com.tencent.mm.plugin.webview.ui.tools.fts.c2(this));
        this.J4.setCancelTextViewClickListener(new com.tencent.mm.plugin.webview.ui.tools.fts.d2(this));
        if (this.J4.getEditText() != null) {
            this.J4.getEditText().setText(this.f184246c4);
        }
        com.tencent.mm.plugin.websearch.widget.SOSEditTextView sOSEditTextView2 = this.J4;
        boolean z18 = this.T4;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = sOSEditTextView2.f209813d;
        if (weImageView != null) {
            if (z18) {
                android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) weImageView.getLayoutParams();
                layoutParams2.width = (int) (sOSEditTextView2.getResources().getDimension(com.tencent.mm.R.dimen.f479693cs) * i65.a.m(sOSEditTextView2.getContext()));
                layoutParams2.height = (int) (sOSEditTextView2.getResources().getDimension(com.tencent.mm.R.dimen.f479693cs) * i65.a.m(sOSEditTextView2.getContext()));
                layoutParams2.rightMargin = (int) sOSEditTextView2.getResources().getDimension(com.tencent.mm.R.dimen.f479738dv);
                sOSEditTextView2.f209813d.setLayoutParams(layoutParams2);
            } else {
                android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) weImageView.getLayoutParams();
                layoutParams3.width = (int) (sOSEditTextView2.getResources().getDimension(com.tencent.mm.R.dimen.f479672c9) * i65.a.m(sOSEditTextView2.getContext()));
                layoutParams3.rightMargin = 0;
                sOSEditTextView2.f209813d.setLayoutParams(layoutParams3);
            }
        }
        Pa(this.f184244a4);
        com.tencent.mm.plugin.websearch.widget.SOSEditTextView sOSEditTextView3 = this.J4;
        int color2 = getResources().getColor(com.tencent.mm.R.color.FG_0);
        android.graphics.PorterDuff.Mode mode = android.graphics.PorterDuff.Mode.SRC_ATOP;
        android.widget.ImageButton imageButton = sOSEditTextView3.f209815f;
        if (imageButton != null) {
            imageButton.getDrawable().setColorFilter(color2, mode);
        }
        int i29 = this.H3;
        if (i29 == 1) {
            this.J4.setClearBtnImageDrawable(getResources().getDrawable(com.tencent.mm.R.raw.actionbar_icon_dark_clear));
            this.J4.setClearBtnIconColor(-1);
        } else if (i29 == 2) {
            this.J4.setClearBtnImageDrawable(getResources().getDrawable(com.tencent.mm.R.raw.actionbar_icon_light_clear));
            this.J4.setClearBtnIconColor(-16777216);
        }
        android.view.View view10 = this.f184310y5;
        if (view10 != null) {
            view10.setOnClickListener(new com.tencent.mm.plugin.webview.ui.tools.fts.e2(this));
        }
        int i37 = this.Y3;
        if ((i37 == 36) || i37 == 53 || i37 == 130 || this.f184308w5) {
            this.J4.setCancelTextViewVisibile(8);
        }
        if (this.f184298m5) {
            com.tencent.mm.plugin.webview.ui.tools.fts.j3 j3Var2 = new com.tencent.mm.plugin.webview.ui.tools.fts.j3(getContext(), new java.lang.ref.WeakReference(this));
            this.f184299n5 = j3Var2;
            j3Var2.e(getContext(), this.f184297l5);
        } else {
            this.f184297l5.setOnClickListener(new com.tencent.mm.plugin.webview.ui.tools.fts.g2(this));
        }
        Sa((int) getResources().getDimension(com.tencent.mm.R.dimen.f479688cn));
        if (!this.T4) {
            if (this.K4) {
                La();
            } else {
                Qa();
                Sa(0);
                android.view.View view11 = this.H4;
                if (view11 != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view11, arrayList3.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view11.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view11, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
        if (this.M4 && this.J4.getEditText() != null && !com.tencent.mm.sdk.platformtools.t8.K0(this.f184246c4)) {
            this.J4.getEditText().setText(this.f184246c4);
            this.J4.setForceShowClearBtn(true);
            this.J4.setClearBtnVisable(0);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "onCreate, needSosEditTextToBeTouchOnly = %s, isInitToSearch = %s, WeUIUtil,getNavigationBarVisibility = %s.", java.lang.Boolean.valueOf(this.T4), java.lang.Boolean.valueOf(this.K4), java.lang.Boolean.valueOf(com.tencent.mm.ui.dl.f(this)));
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        if (rVar != null) {
            ((cy1.a) ((cy1.a) rVar).ak(this, iy1.c.FTSSOSHomeWebViewUI)).Rj(this, iy1.a.Search);
        }
        observe(new e75.a() { // from class: com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI$$c
            @Override // e75.a
            public final void onChanged(java.lang.Object obj) {
                int i38 = com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI.R5;
                final com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI = com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI.this;
                fTSSOSHomeWebViewUI.getClass();
                ((wu4.b) obj).b(wu4.a.class, new j75.l() { // from class: com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI$$e
                    @Override // j75.l
                    public final void a(j75.d dVar) {
                        wu4.a aVar = (wu4.a) dVar;
                        int i39 = com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI.R5;
                        com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI2 = com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI.this;
                        fTSSOSHomeWebViewUI2.getClass();
                        int i47 = aVar.f449839b;
                        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "onKeyboardHeightChanged, height:%s", java.lang.Integer.valueOf(i47));
                        if (fTSSOSHomeWebViewUI2.Y3 != 130) {
                            android.animation.ObjectAnimator objectAnimator = fTSSOSHomeWebViewUI2.L5;
                            if (objectAnimator != null && objectAnimator.isRunning()) {
                                fTSSOSHomeWebViewUI2.L5.cancel();
                            }
                            android.view.View view12 = fTSSOSHomeWebViewUI2.f184297l5;
                            if (view12 != null) {
                                if (i47 > 0) {
                                    fTSSOSHomeWebViewUI2.f184300o5 = i47;
                                    if (view12.getTranslationY() != 0.0f) {
                                        view12.setTranslationY(0.0f);
                                    }
                                    fTSSOSHomeWebViewUI2.L5 = android.animation.ObjectAnimator.ofFloat(view12, "translationY", 0.0f, -i47);
                                    if (com.tencent.mm.sdk.platformtools.t8.K0(fTSSOSHomeWebViewUI2.J4.getTotalQuery())) {
                                        fTSSOSHomeWebViewUI2.Ma(0);
                                    }
                                } else {
                                    fTSSOSHomeWebViewUI2.L5 = android.animation.ObjectAnimator.ofFloat(view12, "translationY", view12.getTranslationY(), 0.0f);
                                    fTSSOSHomeWebViewUI2.Ma(8);
                                }
                                fTSSOSHomeWebViewUI2.L5.setDuration(200L);
                                fTSSOSHomeWebViewUI2.L5.setInterpolator(new y3.b());
                                fTSSOSHomeWebViewUI2.L5.addUpdateListener(new com.tencent.mm.plugin.webview.ui.tools.fts.j1(fTSSOSHomeWebViewUI2));
                                fTSSOSHomeWebViewUI2.L5.start();
                            }
                        }
                        int i48 = aVar.f449839b > 0 ? -3 : -2;
                        if (i48 == -2) {
                            fTSSOSHomeWebViewUI2.f184301p5.l(12);
                        }
                        fTSSOSHomeWebViewUI2.f183853r3 = i48;
                    }
                });
            }
        });
        tg0.w1 w1Var = (tg0.w1) i95.n0.c(tg0.w1.class);
        if (w1Var != null) {
            ((sg0.u3) w1Var).Zi(new tg0.n2(androidx.lifecycle.m.ON_CREATE, this.Y3));
        }
        Na(true);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "updateCameraBtnVisibility scene = " + this.Y3 + ", isVoiceCameraEnabled = " + this.f184256m4);
        if (!Da()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "updateCameraBtnVisibility: Keep default camera button visibility (scene not matched)");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "updateCameraBtnVisibility: Before - needForceHideCameraIcon = " + this.J4);
        this.J4.setNeedForceHideCameraIcon(false);
        this.J4.setCommonRightBtnForceHide(false);
        this.J4.setCommonRightImageButtonVisibile(0);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "updateCameraBtnVisibility: After - Camera button set to VISIBLE");
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI, com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI, com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI, com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.webview.ui.tools.fts.j3 j3Var;
        z21.e eVar;
        super.onDestroy();
        qx4.d0 d0Var = this.E3;
        if (d0Var != null) {
            nw4.n nVar = d0Var.f367394c;
            if (nVar != null) {
                nVar.f340889c = null;
            }
            d0Var.f14326a = null;
        }
        su4.j3 j3Var2 = su4.k3.f412979a;
        j3Var2.f412969f += java.lang.System.currentTimeMillis() - j3Var2.f412968e;
        su4.k3.h();
        if (this.f184298m5 && (j3Var = this.f184299n5) != null && (eVar = j3Var.A) != null) {
            eVar.cancel(true);
            j3Var.A = null;
        }
        Na(false);
        ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).Zi(new tg0.n2(androidx.lifecycle.m.ON_DESTROY, this.Y3));
        ((sg0.a2) ((su4.z0) i95.n0.c(su4.z0.class))).hj(this.Y3, this.B3, new org.json.JSONObject(this.f184261s4));
        s50.l1 l1Var = (s50.l1) ((su4.c1) i95.n0.c(su4.c1.class));
        if (l1Var.f403085i == s50.x0.f403137d) {
            return;
        }
        l1Var.f403085i = s50.x0.f403142i;
        l1Var.Bi();
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI, com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI, com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        su4.k3.l();
        pv.d0 d0Var = (pv.d0) i95.n0.c(pv.d0.class);
        if (d0Var != null) {
            ov.i0 i0Var = (ov.i0) d0Var;
            if (i0Var.Ai() != null) {
                i0Var.Ai().d(105, false, false);
            }
        }
        if (((su4.h1) i95.n0.c(su4.h1.class)) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearchScreenShotHelper", "unregisterScreenShotShareContentProvider");
            ct.e3 e3Var = (ct.e3) i95.n0.c(ct.e3.class);
            if (e3Var != null) {
                ((com.tencent.mm.ui.feature.api.screenshot.j1) e3Var).Ni(null);
            }
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI, com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI, com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        su4.k3.f412979a.f412966c = java.lang.System.currentTimeMillis();
        if (((su4.h1) i95.n0.c(su4.h1.class)) != null) {
            getContext();
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearchScreenShotHelper", "registerScreenShotShareContentProvider");
            ct.e3 e3Var = (ct.e3) i95.n0.c(ct.e3.class);
            if (e3Var != null) {
                ((com.tencent.mm.ui.feature.api.screenshot.j1) e3Var).Ni(new zv4.j());
            }
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        if (this.K4) {
            Ja();
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI
    public void pa() {
        this.f184301p5.l(11);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public void q8(int i17) {
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f183815f;
        if (mMWebView == null || mMWebView.getSettings() == null) {
            return;
        }
        com.tencent.mm.plugin.websearch.w1 w1Var = (com.tencent.mm.plugin.websearch.w1) ((su4.x0) i95.n0.c(su4.x0.class));
        if (w1Var.f181703r == null) {
            w1Var.f181703r = new com.tencent.mm.plugin.websearch.c0();
        }
        com.tencent.mm.plugin.websearch.c0 c0Var = w1Var.f181703r;
        boolean booleanValue = ((java.lang.Boolean) ((jz5.n) c0Var.f181471a).getValue()).booleanValue();
        int i18 = 100;
        if (booleanValue) {
            i18 = a06.d.b(c0Var.a() * 100);
        } else {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            float b17 = j65.c.b(context);
            if (b17 >= i65.a.v(context) || b17 >= i65.a.u(context) || b17 >= i65.a.t(context)) {
                i18 = 140;
            } else if (b17 >= i65.a.s(context)) {
                i18 = 130;
            } else if (b17 >= i65.a.z(context)) {
                i18 = 120;
            } else if (b17 >= i65.a.w(context)) {
                i18 = 110;
            } else {
                i65.a.x(context);
                if (b17 < 1.0f) {
                    i18 = b17 >= i65.a.y(context) ? 90 : 80;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSWebViewFontSizeLogic", "getTextZoomForWebView: textZoom=%d, newLogic=%b", java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(booleanValue));
        this.f183815f.getSettings().O(i18);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI
    public void qa() {
        Ta(true);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI
    public void ra() {
        this.J4.setHint(Ba(this.f184245b4));
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI
    public nw4.n s9() {
        return this.f183844p0;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI
    public void sa() {
        super.sa();
        Ta(true);
        int i17 = this.Y3;
        if (i17 == 67 || i17 == 81 || i17 == 100) {
            Ha(10, getIntent().getStringExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID), this.Y3);
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI, com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(x13.d.class);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI
    public java.util.Map t9() {
        java.util.Map t96 = super.t9();
        if (this.f184295j5 == null) {
            return t96;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "getOnUiInitParams");
        java.util.HashMap hashMap = (java.util.HashMap) t96;
        hashMap.put("nativeHeight", 0);
        java.lang.String str = null;
        try {
            android.os.Bundle tb6 = this.K1.tb(7, null);
            java.lang.String string = tb6 == null ? "" : tb6.getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
            if (!android.text.TextUtils.isEmpty(string)) {
                hashMap.put("operationData", string);
            }
            java.lang.Object obj = ((java.util.HashMap) w9()).get("pRequestId");
            if (obj != null) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("reqId", (java.lang.String) obj);
                android.os.Bundle tb7 = this.K1.tb(8, bundle);
                if (tb7 != null) {
                    java.lang.String string2 = tb7.getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
                    if (!android.text.TextUtils.isEmpty(string2)) {
                        hashMap.put("preGetData", string2);
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", e17, "", new java.lang.Object[0]);
        }
        java.lang.String stringExtra = getIntent().getStringExtra("first_page_result");
        hashMap.put("cachePageResult", android.text.TextUtils.isEmpty(stringExtra) ? "" : stringExtra);
        com.tencent.mm.plugin.websearch.w1 w1Var = (com.tencent.mm.plugin.websearch.w1) ((su4.x0) i95.n0.c(su4.x0.class));
        if (w1Var.f181703r == null) {
            w1Var.f181703r = new com.tencent.mm.plugin.websearch.c0();
        }
        com.tencent.mm.plugin.websearch.c0 c0Var = w1Var.f181703r;
        if (((java.lang.Boolean) ((jz5.n) c0Var.f181471a).getValue()).booleanValue()) {
            float a17 = c0Var.a();
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSWebViewFontSizeLogic", "getLimitedFontRatio: ratio=%.2f", java.lang.Float.valueOf(a17));
            str = java.lang.String.valueOf(a17);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSWebViewFontSizeLogic", "getLimitedFontRatio: newLogic disabled, return null");
        }
        if (str != null) {
            hashMap.put("limitedFontRatio", str);
        }
        return t96;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI
    public void ta() {
        super.ta();
        int i17 = this.Y3;
        if (i17 == 67 || i17 == 81 || i17 == 100) {
            Ha(9, getIntent().getStringExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID), this.Y3);
        }
    }
}
