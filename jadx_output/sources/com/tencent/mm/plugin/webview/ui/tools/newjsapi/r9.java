package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes12.dex */
public final class r9 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.r9 f186489d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.r9();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        java.lang.Object obj;
        java.lang.Integer num;
        nw4.g gVar;
        nw4.y2 y2Var;
        java.lang.Object obj2;
        java.lang.Object obj3;
        boolean z17;
        java.lang.String string;
        android.app.Application application;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.Object obj4 = ((java.util.HashMap) msg.f340790a).get("type");
        boolean z18 = obj4 == null;
        nw4.g gVar2 = env.f340863d;
        if (z18) {
            gVar2.a(msg, "missing arguments");
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOperateStreamVoiceInput", "nativeVoice: handleMsg, opType: " + obj4 + ", params: " + msg.f340790a);
        boolean equals = "start".equals(obj4);
        com.tencent.mm.ui.widget.MMWebView mMWebView = env.f340864e;
        if (equals) {
            int e17 = com.tencent.mm.plugin.websearch.l2.e(msg.f340790a, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 14);
            float d17 = com.tencent.mm.plugin.websearch.l2.d(msg.f340790a, "vad_s_n_ration", 2.5f);
            boolean c17 = com.tencent.mm.plugin.websearch.l2.c(msg.f340790a, "setLangBySystem", false);
            su4.c1 c1Var = (su4.c1) i95.n0.c(su4.c1.class);
            java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(mMWebView instanceof com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView ? (com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView) mMWebView : null);
            s50.l1 l1Var = (s50.l1) c1Var;
            l1Var.getClass();
            l1Var.f403081e = weakReference;
            int n17 = gm0.j1.d().n();
            if (!(n17 == 4 || n17 == 6)) {
                l1Var.Zi(l1Var.f403081e, s50.w0.f403131g, "network is not reachable");
            } else if (iq.b.C(com.tencent.mm.sdk.platformtools.x2.f193071a) || iq.b.v(com.tencent.mm.sdk.platformtools.x2.f193071a) || iq.b.e(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                l1Var.Zi(l1Var.f403081e, s50.w0.f403129e, "audio conflict");
            } else {
                tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                ((sb0.f) jVar).getClass();
                if (j35.u.d(context, "android.permission.RECORD_AUDIO", true)) {
                    l1Var.Di(e17, d17, c17);
                } else {
                    ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Zi(80, new s50.k1(l1Var, e17, d17, c17), "android.permission.RECORD_AUDIO");
                }
            }
        } else if ("stop".equals(obj4)) {
            s50.l1 l1Var2 = (s50.l1) ((su4.c1) i95.n0.c(su4.c1.class));
            l1Var2.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.VoiceSearchService", "stopStreamVoiceInput");
            l1Var2.f403085i = s50.x0.f403140g;
            z21.e eVar = l1Var2.f403080d;
            if (eVar != null) {
                eVar.stop(false);
            }
            s50.e1 e1Var = l1Var2.f403089p;
            e1Var.removeMessages(101);
            e1Var.removeMessages(102);
            e1Var.sendEmptyMessageDelayed(101, 3000L);
            e1Var.sendEmptyMessageDelayed(102, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
        } else if ("cancel".equals(obj4)) {
            s50.l1 l1Var3 = (s50.l1) ((su4.c1) i95.n0.c(su4.c1.class));
            if (l1Var3.f403085i != s50.x0.f403137d) {
                l1Var3.f403085i = s50.x0.f403142i;
                l1Var3.Bi();
            }
        } else {
            if (!"startNativeVoiceInput".equals(obj4)) {
                obj = "msg";
                if ("showNativeVoiceInputEntry".equals(obj4)) {
                    android.content.Context context2 = env.f340860a;
                    com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI baseSearchWebViewUI = context2 instanceof com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI ? (com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI) context2 : null;
                    if (baseSearchWebViewUI != null) {
                        baseSearchWebViewUI.ea();
                    }
                    java.lang.String f17 = com.tencent.mm.plugin.websearch.l2.f(msg.f340790a, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                    int i17 = baseSearchWebViewUI != null ? baseSearchWebViewUI.f184251h4 : 3;
                    num = 0;
                    int e18 = com.tencent.mm.plugin.websearch.l2.e(msg.f340790a, "sceneType", 2);
                    boolean c18 = com.tencent.mm.plugin.websearch.l2.c(msg.f340790a, "enableGreenStyle", false);
                    gVar = gVar2;
                    boolean c19 = com.tencent.mm.plugin.websearch.l2.c(msg.f340790a, "enableBindWithKeyboard", false);
                    java.lang.String f18 = com.tencent.mm.plugin.websearch.l2.f(msg.f340790a, "extInfo");
                    su4.c1 c1Var2 = (su4.c1) i95.n0.c(su4.c1.class);
                    android.content.Context context3 = env.f340860a;
                    java.lang.ref.WeakReference weakReference2 = new java.lang.ref.WeakReference(mMWebView instanceof com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView ? (com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView) mMWebView : null);
                    kotlin.jvm.internal.o.d(f17);
                    kotlin.jvm.internal.o.d(f18);
                    s50.l1 l1Var4 = (s50.l1) c1Var2;
                    l1Var4.getClass();
                    kotlin.jvm.internal.o.g(context3, "context");
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("nativeVoice: showNativeVoiceForWebView, sceneType: ");
                    sb6.append(e18);
                    sb6.append(", searchScene: ");
                    sb6.append(i17);
                    sb6.append(", modelCount: ");
                    java.util.Map map = l1Var4.f403082f;
                    sb6.append(map.size());
                    sb6.append(", thirdExtInfo: ");
                    sb6.append(f18);
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.VoiceSearchService", sb6.toString());
                    l1Var4.f403088o = f18;
                    java.util.Set entrySet = ((java.util.LinkedHashMap) map).entrySet();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj5 : entrySet) {
                        if (((java.lang.ref.WeakReference) ((java.util.Map.Entry) obj5).getValue()).get() == null) {
                            arrayList.add(obj5);
                        }
                    }
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(java.lang.Integer.valueOf(((java.lang.Number) ((java.util.Map.Entry) it.next()).getKey()).intValue()));
                    }
                    java.util.Iterator it6 = arrayList2.iterator();
                    while (it6.hasNext()) {
                        map.remove(java.lang.Integer.valueOf(((java.lang.Number) it6.next()).intValue()));
                    }
                    if (context3 instanceof com.tencent.mm.ui.MMActivity) {
                        int identityHashCode = java.lang.System.identityHashCode(context3);
                        k23.v0 Ri = l1Var4.Ri(identityHashCode);
                        if (Ri != null) {
                            if (kotlin.jvm.internal.o.b(Ri.f303713h, java.lang.Boolean.valueOf(c18))) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "setBtnStyleForFinderSearch, style unchanged: " + c18 + ", skip");
                            } else {
                                Ri.f303713h = java.lang.Boolean.valueOf(c18);
                                com.tencent.mm.ui.MMActivity mMActivity = Ri.f303706a;
                                if (c18) {
                                    int d18 = i65.a.d(mMActivity, com.tencent.mm.R.color.Brand_120);
                                    int d19 = i65.a.d(mMActivity, com.tencent.mm.R.color.aby);
                                    android.view.View startBtn = Ri.q().getStartBtn();
                                    startBtn.setBackgroundColor(d18);
                                    Ri.q().setButtonTextColor(d19);
                                    com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) startBtn.findViewById(com.tencent.mm.R.id.ugo);
                                    if (weImageView != null) {
                                        weImageView.setImageResource(com.tencent.mm.R.raw.mike_on_filled);
                                        weImageView.setIconColor(d19);
                                    }
                                } else {
                                    int d27 = i65.a.d(mMActivity, com.tencent.mm.R.color.f478494f);
                                    int d28 = i65.a.d(mMActivity, com.tencent.mm.R.color.abw);
                                    android.view.View startBtn2 = Ri.q().getStartBtn();
                                    startBtn2.setBackgroundColor(d27);
                                    Ri.q().setButtonTextColor(d28);
                                    com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) startBtn2.findViewById(com.tencent.mm.R.id.ugo);
                                    if (weImageView2 != null) {
                                        weImageView2.setImageResource(com.tencent.mm.R.raw.mike_on_medium);
                                        weImageView2.setIconColor(d28);
                                    }
                                }
                            }
                            Ri.q().setButtonText(f17);
                            Ri.C();
                            if (c19) {
                                if (!Ri.f303723r) {
                                    Ri.i();
                                }
                            } else if (Ri.f303723r) {
                                Ri.h();
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.VoiceSearchService", "nativeVoice: showNativeVoiceForWebView, " + identityHashCode + " already showStartRecognizingButton!");
                        } else {
                            com.tencent.mm.ui.MMActivity mMActivity2 = (com.tencent.mm.ui.MMActivity) context3;
                            android.view.ViewGroup Ni = l1Var4.Ni(weakReference2);
                            if (Ni == null) {
                                android.view.View findViewById = mMActivity2.findViewById(com.tencent.mm.R.id.jlt);
                                kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
                                Ni = (android.view.ViewGroup) findViewById;
                            }
                            k23.v0 v0Var = new k23.v0(mMActivity2);
                            k23.d0 d0Var = new k23.d0(Ni, new android.widget.FrameLayout.LayoutParams(-1, -1, 81), new s50.g1(l1Var4, weakReference2, v0Var), Ni, k23.w0.f303737g, e18, i17, f17, c18 ? k23.u2.f303702e : k23.u2.f303701d, null, null, com.tencent.mm.plugin.appbrand.jsapi.mc.CTRL_INDEX, null);
                            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.VoiceSearchService", "hitest nativeVoice: showNativeVoiceForWebView, frostedContentView=" + Ni.getClass().getSimpleName() + ", id=" + Ni.getId() + ", childCount=" + Ni.getChildCount() + ", width=" + Ni.getWidth() + ", height=" + Ni.getHeight());
                            v0Var.t(d0Var);
                            v0Var.E();
                            k23.i1 q17 = v0Var.q();
                            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("hitest nativeVoice: after showStartRecognizingButton, btnParent=");
                            android.view.ViewParent parent = q17.getParent();
                            sb7.append(parent != null ? parent.getClass().getSimpleName() : null);
                            sb7.append(", btnVisibility=");
                            sb7.append(q17.getVisibility());
                            sb7.append(" (VISIBLE=0 GONE=8), btnWidth=");
                            sb7.append(q17.getWidth());
                            sb7.append(", btnHeight=");
                            sb7.append(q17.getHeight());
                            sb7.append(", containerChildCount=");
                            sb7.append(Ni.getChildCount());
                            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.VoiceSearchService", sb7.toString());
                            map.put(java.lang.Integer.valueOf(identityHashCode), new java.lang.ref.WeakReference(v0Var));
                            l1Var4.fj(mMActivity2, weakReference2, v0Var);
                            z50.e.f470163a.a(vu4.a.f440239f, vu4.b.C, i17, e18, new org.json.JSONObject(), "");
                            if (c19) {
                                v0Var.i();
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.VoiceSearchService", "nativeVoice: showNativeVoiceForWebView, contextID: " + identityHashCode + ", enableBindWithKeyboard: " + c19);
                        }
                    } else {
                        com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.VoiceSearchService", "nativeVoice: showNativeVoiceForWebView, context is not MMActivity");
                    }
                } else {
                    num = 0;
                    gVar = gVar2;
                    if (!"hideNativeVoiceInputEntry".equals(obj4)) {
                        if ("configBottomAiContinue".equals(obj4)) {
                            android.content.Context context4 = env.f340860a;
                            com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI baseSearchWebViewUI2 = context4 instanceof com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI ? (com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI) context4 : null;
                            if (baseSearchWebViewUI2 != null) {
                                baseSearchWebViewUI2.ea();
                            }
                            y2Var = msg;
                            boolean c27 = com.tencent.mm.plugin.websearch.l2.c(y2Var.f340790a, "visible", true);
                            int e19 = com.tencent.mm.plugin.websearch.l2.e(y2Var.f340790a, "modeType", 1);
                            java.lang.String f19 = com.tencent.mm.plugin.websearch.l2.f(y2Var.f340790a, com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT);
                            int i18 = baseSearchWebViewUI2 != null ? baseSearchWebViewUI2.f184251h4 : 3;
                            int e27 = com.tencent.mm.plugin.websearch.l2.e(y2Var.f340790a, "sceneType", 2);
                            java.lang.String f27 = com.tencent.mm.plugin.websearch.l2.f(y2Var.f340790a, "extInfo");
                            boolean c28 = com.tencent.mm.plugin.websearch.l2.c(y2Var.f340790a, "enableGreenStyle", false);
                            int e28 = com.tencent.mm.plugin.websearch.l2.e(y2Var.f340790a, "styleType", 0);
                            su4.c1 c1Var3 = (su4.c1) i95.n0.c(su4.c1.class);
                            android.content.Context context5 = env.f340860a;
                            java.lang.ref.WeakReference weakReference3 = new java.lang.ref.WeakReference(mMWebView instanceof com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView ? (com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView) mMWebView : null);
                            kotlin.jvm.internal.o.d(f19);
                            kotlin.jvm.internal.o.d(f27);
                            s50.l1 l1Var5 = (s50.l1) c1Var3;
                            l1Var5.getClass();
                            kotlin.jvm.internal.o.g(context5, "context");
                            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.VoiceSearchService", "configBottomAiContinue: visible=" + c27 + ", modeType=" + e19 + ", text=" + f19 + ", styleType=" + e28 + ", thirdExtInfo=" + f27);
                            l1Var5.f403088o = f27;
                            if (context5 instanceof com.tencent.mm.ui.MMActivity) {
                                int identityHashCode2 = java.lang.System.identityHashCode(context5);
                                java.util.Map map2 = l1Var5.f403090q;
                                ((java.util.LinkedHashMap) map2).entrySet().removeIf(s50.y0.f403146a);
                                if (c27) {
                                    if (f19.length() == 0) {
                                        if (e19 == 2) {
                                            string = context5.getString(com.tencent.mm.R.string.niw);
                                            kotlin.jvm.internal.o.d(string);
                                        } else {
                                            string = context5.getString(com.tencent.mm.R.string.niu);
                                            kotlin.jvm.internal.o.d(string);
                                        }
                                        f19 = string;
                                    }
                                    k23.f0.f303563e.getClass();
                                    java.util.Iterator it7 = ((kz5.h) k23.f0.f303567i).iterator();
                                    while (true) {
                                        if (!it7.hasNext()) {
                                            obj2 = null;
                                            break;
                                        }
                                        obj2 = it7.next();
                                        if (((k23.f0) obj2).f303568d == e19) {
                                            break;
                                        }
                                    }
                                    k23.f0 f0Var = (k23.f0) obj2;
                                    if (f0Var == null) {
                                        f0Var = k23.f0.f303564f;
                                    }
                                    kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
                                    k23.v0 Ui = l1Var5.Ui(identityHashCode2);
                                    h0Var.f310123d = Ui;
                                    if (Ui != null) {
                                        com.tencent.mars.xlog.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "configModeSwitch: mode=" + f0Var + ", text=" + f19 + ", isTriggeredByConfig=true");
                                        Ui.A = true;
                                        k23.j2 m17 = Ui.m();
                                        if (m17 != null) {
                                            if (f19.length() > 0) {
                                                com.tencent.mars.xlog.Log.i("MicroMsg.FTSStartRecognizeBtnModeSwitch", "configCustomText: ".concat(f19));
                                                m17.f303598p = f19;
                                                m17.f303599q = true;
                                            }
                                            z17 = false;
                                            m17.n(f0Var, false);
                                        } else {
                                            z17 = false;
                                        }
                                        Ui.A = z17;
                                        ((k23.v0) h0Var.f310123d).C();
                                        k23.v0 v0Var2 = (k23.v0) h0Var.f310123d;
                                        v0Var2.q().post(new s50.z0(l1Var5, weakReference3, v0Var2));
                                    } else {
                                        com.tencent.mm.ui.MMActivity mMActivity3 = (com.tencent.mm.ui.MMActivity) context5;
                                        android.view.ViewGroup Ni2 = l1Var5.Ni(weakReference3);
                                        if (Ni2 == null) {
                                            android.view.View findViewById2 = mMActivity3.findViewById(com.tencent.mm.R.id.jlt);
                                            kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
                                            Ni2 = (android.view.ViewGroup) findViewById2;
                                        }
                                        android.view.ViewGroup viewGroup = Ni2;
                                        k23.v0 v0Var3 = new k23.v0(mMActivity3);
                                        k23.b0.f303518e.getClass();
                                        java.util.Iterator it8 = ((kz5.h) k23.b0.f303522i).iterator();
                                        while (true) {
                                            if (!it8.hasNext()) {
                                                obj3 = null;
                                                break;
                                            }
                                            obj3 = it8.next();
                                            if (((k23.b0) obj3).f303523d == e28) {
                                                break;
                                            }
                                        }
                                        k23.b0 b0Var = (k23.b0) obj3;
                                        k23.b0 b0Var2 = b0Var == null ? k23.b0.f303519f : b0Var;
                                        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1, 81);
                                        s50.c1 c1Var4 = new s50.c1(l1Var5, weakReference3, v0Var3);
                                        k23.w0 w0Var = k23.w0.f303738h;
                                        v0Var3.t(new k23.d0(viewGroup, layoutParams, c1Var4, viewGroup, w0Var, e27, i18, f19, c28 ? k23.u2.f303702e : k23.u2.f303701d, null, b0Var2, 512, null));
                                        s50.b1 b1Var = new s50.b1(l1Var5, weakReference3);
                                        com.tencent.mars.xlog.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "initModeSwitch: initialMode=" + f0Var);
                                        k23.d0 d0Var2 = v0Var3.f303707b;
                                        if (d0Var2 == null) {
                                            kotlin.jvm.internal.o.o("params");
                                            throw null;
                                        }
                                        if (d0Var2.f303548e != w0Var) {
                                            com.tencent.mars.xlog.Log.w("MicroMsg.FTSFloatingVoiceInputViewModel", "initModeSwitch: not in MODE_SWITCH scene");
                                        } else {
                                            v0Var3.f303731z = b1Var;
                                            k23.j2 m18 = v0Var3.m();
                                            if (m18 != null) {
                                                m18.n(f0Var, false);
                                                m18.setModeSwitchListener(new k23.k0(v0Var3));
                                            }
                                            y50.m.a(y50.m.f459460a, v0Var3.f303706a, v0Var3.q().getTargetActivityBarColor(), 0L, null, null, 28, null);
                                        }
                                        v0Var3.q().setButtonText(f19);
                                        v0Var3.C();
                                        h0Var.f310123d = v0Var3;
                                        map2.put(java.lang.Integer.valueOf(identityHashCode2), new java.lang.ref.WeakReference(v0Var3));
                                        ((k23.v0) h0Var.f310123d).q().post(new s50.a1(l1Var5, weakReference3, h0Var));
                                    }
                                    l1Var5.fj((com.tencent.mm.ui.MMActivity) context5, weakReference3, (k23.v0) h0Var.f310123d);
                                } else {
                                    k23.v0 Ui2 = l1Var5.Ui(identityHashCode2);
                                    if (Ui2 != null) {
                                        Ui2.r();
                                    }
                                }
                            } else {
                                com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.VoiceSearchService", "configBottomAiContinue: context is not MMActivity");
                            }
                        } else {
                            y2Var = msg;
                            if (!"startActionTriggerShimmerAnimation".equals(obj4)) {
                                gVar.a(y2Var, "unsupported type: " + obj4);
                                return true;
                            }
                            su4.c1 c1Var5 = (su4.c1) i95.n0.c(su4.c1.class);
                            android.content.Context context6 = env.f340860a;
                            s50.l1 l1Var6 = (s50.l1) c1Var5;
                            l1Var6.getClass();
                            kotlin.jvm.internal.o.g(context6, "context");
                            int identityHashCode3 = java.lang.System.identityHashCode(context6);
                            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.VoiceSearchService", "startActionTriggerShimmerAnimation, contextID: " + identityHashCode3);
                            k23.v0 Ui3 = l1Var6.Ui(identityHashCode3);
                            if (Ui3 != null) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "startActionTriggerShimmerAnimation");
                                k23.j2 m19 = Ui3.m();
                                if (m19 != null) {
                                    if (m19.f303597o != k23.f0.f303564f) {
                                        com.tencent.mars.xlog.Log.i("MicroMsg.FTSStartRecognizeBtnModeSwitch", "startActionTriggerShimmerAnimation: not in H5KeyBoard mode, skip");
                                    } else if (m19.G) {
                                        com.tencent.mars.xlog.Log.i("MicroMsg.FTSStartRecognizeBtnModeSwitch", "startActionTriggerShimmerAnimation: already animating, skip");
                                    } else {
                                        com.tencent.mars.xlog.Log.i("MicroMsg.FTSStartRecognizeBtnModeSwitch", "startActionTriggerShimmerAnimation");
                                        m19.G = true;
                                        m19.getStartBtn().post(new k23.h2(m19));
                                    }
                                }
                            }
                        }
                        gVar.getClass();
                        java.lang.String str = y2Var.f341019i + ":ok";
                        java.util.HashMap hashMap = new java.util.HashMap();
                        java.lang.Integer num2 = num;
                        hashMap.put("retCode", num2);
                        hashMap.put("err_code", num2);
                        hashMap.put(obj, str);
                        gVar.e(y2Var.f341013c, str, hashMap);
                        return true;
                    }
                    su4.c1 c1Var6 = (su4.c1) i95.n0.c(su4.c1.class);
                    android.content.Context context7 = env.f340860a;
                    new java.lang.ref.WeakReference(mMWebView instanceof com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView ? (com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView) mMWebView : null);
                    s50.l1 l1Var7 = (s50.l1) c1Var6;
                    l1Var7.getClass();
                    kotlin.jvm.internal.o.g(context7, "context");
                    int identityHashCode4 = java.lang.System.identityHashCode(context7);
                    k23.v0 Ri2 = l1Var7.Ri(identityHashCode4);
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder("hitest nativeVoice: hideNativeVoiceForWebView, contextID: ");
                    sb8.append(identityHashCode4);
                    sb8.append(", hasViewModel=");
                    sb8.append(Ri2 != null);
                    sb8.append(", btnVisible=");
                    sb8.append(Ri2 != null ? java.lang.Boolean.valueOf(Ri2.q().getVisibility() == 0) : null);
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.VoiceSearchService", sb8.toString());
                    if (Ri2 != null) {
                        Ri2.r();
                        Ri2.h();
                    }
                    if ((context7 instanceof com.tencent.mm.ui.MMActivity) && (application = ((com.tencent.mm.ui.MMActivity) context7).getApplication()) != null) {
                        android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (android.app.Application.ActivityLifecycleCallbacks) l1Var7.f403083g.remove(java.lang.Integer.valueOf(java.lang.System.identityHashCode(context7)));
                        if (activityLifecycleCallbacks != null) {
                            application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
                        }
                    }
                }
                y2Var = msg;
                gVar.getClass();
                java.lang.String str2 = y2Var.f341019i + ":ok";
                java.util.HashMap hashMap2 = new java.util.HashMap();
                java.lang.Integer num22 = num;
                hashMap2.put("retCode", num22);
                hashMap2.put("err_code", num22);
                hashMap2.put(obj, str2);
                gVar.e(y2Var.f341013c, str2, hashMap2);
                return true;
            }
            android.content.Context context8 = env.f340860a;
            com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI baseSearchWebViewUI3 = context8 instanceof com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI ? (com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI) context8 : null;
            if (baseSearchWebViewUI3 != null) {
                baseSearchWebViewUI3.ea();
            }
            java.lang.String f28 = com.tencent.mm.plugin.websearch.l2.f(msg.f340790a, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            int i19 = baseSearchWebViewUI3 != null ? baseSearchWebViewUI3.f184251h4 : 3;
            int e29 = com.tencent.mm.plugin.websearch.l2.e(msg.f340790a, "sceneType", 2);
            boolean c29 = com.tencent.mm.plugin.websearch.l2.c(msg.f340790a, "enableGreenStyle", false);
            java.lang.String f29 = com.tencent.mm.plugin.websearch.l2.f(msg.f340790a, "extInfo");
            su4.c1 c1Var7 = (su4.c1) i95.n0.c(su4.c1.class);
            android.content.Context context9 = env.f340860a;
            java.lang.ref.WeakReference weakReference4 = new java.lang.ref.WeakReference(mMWebView instanceof com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView ? (com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView) mMWebView : null);
            kotlin.jvm.internal.o.d(f28);
            kotlin.jvm.internal.o.d(f29);
            s50.l1 l1Var8 = (s50.l1) c1Var7;
            l1Var8.getClass();
            kotlin.jvm.internal.o.g(context9, "context");
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.VoiceSearchService", "nativeVoice: startNativeVoiceInput, thirdExtInfo: ".concat(f29));
            l1Var8.f403088o = f29;
            com.tencent.mm.plugin.fts.ui.voice.FTSFloatingVoiceHalfScreenActivity.f138204f.a(context9, new s50.h1(l1Var8, weakReference4), i19, e29, k23.w0.f303736f, f28, c29);
        }
        y2Var = msg;
        obj = "msg";
        num = 0;
        gVar = gVar2;
        gVar.getClass();
        java.lang.String str22 = y2Var.f341019i + ":ok";
        java.util.HashMap hashMap22 = new java.util.HashMap();
        java.lang.Integer num222 = num;
        hashMap22.put("retCode", num222);
        hashMap22.put("err_code", num222);
        hashMap22.put(obj, str22);
        gVar.e(y2Var.f341013c, str22, hashMap22);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return -2;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "operateStreamVoiceInput";
    }
}
