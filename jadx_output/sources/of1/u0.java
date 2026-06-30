package of1;

/* loaded from: classes8.dex */
public final class u0 extends of1.m2 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ of1.v0 f345012h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMWebView f345013i;

    public u0(of1.v0 v0Var, com.tencent.mm.ui.widget.MMWebView mMWebView) {
        this.f345012h = v0Var;
        this.f345013i = mMWebView;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.x3, com.tencent.mm.plugin.webview.stub.z0
    public java.lang.String Ni() {
        return this.f345012h.E;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.x3, com.tencent.mm.plugin.webview.stub.z0
    public void W1(java.lang.String str) {
        int P = com.tencent.mm.sdk.platformtools.t8.P(str, 0);
        ((ku5.t0) ku5.t0.f312615d).B(new of1.t0(this.f345012h, P, str));
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.x3, com.tencent.mm.plugin.webview.stub.z0
    public boolean aj(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, boolean z17) {
        ((ku5.t0) ku5.t0.f312615d).B(new of1.s0(this.f345012h, str, str2, bundle, z17));
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x013e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x013f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.x3, com.tencent.mm.plugin.webview.stub.z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean callback(int r11, android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: of1.u0.callback(int, android.os.Bundle):boolean");
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.x3, com.tencent.mm.plugin.webview.stub.z0
    public java.lang.String getCurrentUrl() {
        return this.f345012h.Z();
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.x3, com.tencent.mm.plugin.webview.stub.z0
    public android.os.Bundle i(int i17, android.os.Bundle bundle) {
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07;
        java.lang.String string;
        java.lang.String string2;
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putString("key_webview_container_env", "miniProgram");
        of1.v0 v0Var = this.f345012h;
        if (i17 == 18) {
            com.tencent.mm.plugin.appbrand.jsapi.webview.o oVar = v0Var.W1;
            if (oVar == null) {
                kotlin.jvm.internal.o.o("mView");
                throw null;
            }
            android.app.Activity a17 = q75.a.a(((of1.w1) oVar).getAndroidContext());
            if (a17 == null) {
                java.lang.String D1 = v0Var.D1();
                java.lang.Object[] objArr = new java.lang.Object[3];
                objArr[0] = v0Var.Y();
                com.tencent.mm.plugin.appbrand.jsapi.webview.o oVar2 = v0Var.W1;
                if (oVar2 == null) {
                    kotlin.jvm.internal.o.o("mView");
                    throw null;
                }
                objArr[1] = java.lang.Integer.valueOf(oVar2.hashCode());
                com.tencent.mm.plugin.appbrand.jsapi.webview.o oVar3 = v0Var.W1;
                if (oVar3 == null) {
                    kotlin.jvm.internal.o.o("mView");
                    throw null;
                }
                objArr[2] = ((of1.w1) oVar3).getWebView().getUrl();
                com.tencent.mars.xlog.Log.e(D1, "AC_GET_PUBLISHER_ID invalid context(%s) hash(%d) url(%s)", objArr);
                return bundle2;
            }
            android.content.Intent intent = a17.getIntent();
            bundle2.putString("KPublisherId", intent != null ? intent.getStringExtra("KPublisherId") : null);
            java.lang.String valueOf = java.lang.String.valueOf(v0Var.O().f183390j);
            if (valueOf == null) {
                valueOf = "";
            }
            bundle2.putString("KPublisherReqId", valueOf);
            bundle2.putString("serverMsgID", v0Var.O().A.toString());
            bundle2.putString("geta8key_username", v0Var.O().f183386f);
            android.content.Intent intent2 = a17.getIntent();
            bundle2.putString("sns_local_id", intent2 != null ? intent2.getStringExtra("sns_local_id") : null);
            bundle2.putInt("getA8KeyScene", v0Var.f181918b.f472753f);
            bundle2.putString("url", v0Var.Z());
            ft.f4 f4Var = (ft.f4) i95.n0.c(ft.f4.class);
            com.tencent.mm.plugin.appbrand.jsapi.webview.o oVar4 = v0Var.W1;
            if (oVar4 == null) {
                kotlin.jvm.internal.o.o("mView");
                throw null;
            }
            com.tencent.mm.plugin.appbrand.page.v5 m533getPageView = ((of1.w1) oVar4).m533getPageView();
            ((et.s) f4Var).getClass();
            if (m533getPageView != null) {
                bundle2.putString("wxappPathWithQuery", m533getPageView.Y1());
                com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime = m533getPageView.getRuntime();
                com.tencent.mm.plugin.appbrand.o6 o6Var = runtime instanceof com.tencent.mm.plugin.appbrand.o6 ? (com.tencent.mm.plugin.appbrand.o6) runtime : null;
                java.lang.String str = (o6Var == null || (u07 = o6Var.u0()) == null) ? null : u07.f47276v;
                java.lang.String str2 = str != null ? str : "";
                com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime2 = m533getPageView.getRuntime();
                com.tencent.mm.plugin.appbrand.o6 o6Var2 = runtime2 instanceof com.tencent.mm.plugin.appbrand.o6 ? (com.tencent.mm.plugin.appbrand.o6) runtime2 : null;
                int g27 = o6Var2 != null ? o6Var2.g2() : 0;
                bundle2.putString("wxappSessionId", str2);
                bundle2.putInt("wxappScene", g27);
            }
        } else if (i17 == 87) {
            boolean z17 = v0Var.F0;
            java.lang.String str3 = v0Var.f345026e2;
            java.util.Map map = v0Var.S;
            if (z17) {
                bundle2.putString("result", "not_return");
            } else {
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                bundle2.putString("full_url", str3 == null ? "" : str3);
                if (map != null) {
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) map;
                    if (!concurrentHashMap.isEmpty()) {
                        bundle2.putInt("set_cookie", 1);
                        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
                            java.lang.String str4 = (java.lang.String) entry.getKey();
                            java.lang.String str5 = (java.lang.String) entry.getValue();
                            com.tencent.xweb.d.g().b(str3 == null ? "" : str3, str4 + '=' + str5);
                        }
                        com.tencent.xweb.d.g().flush();
                        java.lang.String D12 = v0Var.D1();
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        objArr2[0] = com.tencent.xweb.d.g().a(str3 != null ? str3 : "");
                        com.tencent.mars.xlog.Log.i(D12, "cookies:%s", objArr2);
                    }
                }
                bundle2.putInt("set_cookie", 0);
            }
        } else {
            if (i17 == 99) {
                bundle2.putInt("geta8key_scene", v0Var.Q());
                return bundle2;
            }
            if (i17 == 101) {
                if (bundle == null) {
                    return bundle2;
                }
                bundle.setClassLoader(of1.v0.class.getClassLoader());
                com.tencent.mm.plugin.appbrand.jsapi.webview.o oVar5 = v0Var.W1;
                if (oVar5 == null) {
                    kotlin.jvm.internal.o.o("mView");
                    throw null;
                }
                android.content.Context a18 = q75.a.a(((of1.w1) oVar5).getAndroidContext());
                android.content.Intent intent3 = new android.content.Intent();
                android.os.Bundle bundle3 = bundle.getBundle("open_ui_with_webview_ui_extras");
                if (bundle3 == null) {
                    bundle3 = android.os.Bundle.EMPTY;
                }
                android.content.Intent putExtras = intent3.putExtras(bundle3);
                kotlin.jvm.internal.o.f(putExtras, "putExtras(...)");
                if (a18 == null) {
                    a18 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    putExtras.addFlags(268435456);
                }
                java.lang.String string3 = bundle.getString("open_ui_with_webview_ui_plugin_name");
                kotlin.jvm.internal.o.d(string3);
                java.lang.String string4 = bundle.getString("open_ui_with_webview_ui_plugin_entry");
                kotlin.jvm.internal.o.d(string4);
                if (r26.i0.n(string4, ".BaseScanUI", false) && (a18 instanceof android.app.Activity)) {
                    of1.r0 r0Var = of1.r0.f344996a;
                    nf.g.a(a18).f(r0Var);
                    j45.l.n(a18, string3, string4, putExtras, cf.b.a(r0Var));
                } else {
                    j45.l.j(a18, string3, string4, putExtras, null);
                }
            } else if (i17 == 145) {
                com.tencent.mm.plugin.appbrand.jsapi.webview.o oVar6 = v0Var.W1;
                if (oVar6 == null) {
                    kotlin.jvm.internal.o.o("mView");
                    throw null;
                }
                bundle2.putStringArray("key_webview_apbrand_jsapi_report_args", ((of1.w1) oVar6).getJsApiReportArgs());
            } else {
                if (i17 == 302) {
                    com.tencent.mm.plugin.appbrand.jsapi.webview.o oVar7 = v0Var.W1;
                    if (oVar7 == null) {
                        kotlin.jvm.internal.o.o("mView");
                        throw null;
                    }
                    android.app.Activity a19 = q75.a.a(((of1.w1) oVar7).getAndroidContext());
                    if (a19 != null) {
                        bundle2.putParcelable("delegate", com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate.a(a19));
                        return bundle2;
                    }
                    java.lang.String D13 = v0Var.D1();
                    java.lang.Object[] objArr3 = new java.lang.Object[3];
                    objArr3[0] = v0Var.Y();
                    com.tencent.mm.plugin.appbrand.jsapi.webview.o oVar8 = v0Var.W1;
                    if (oVar8 == null) {
                        kotlin.jvm.internal.o.o("mView");
                        throw null;
                    }
                    objArr3[1] = java.lang.Integer.valueOf(oVar8.hashCode());
                    com.tencent.mm.plugin.appbrand.jsapi.webview.o oVar9 = v0Var.W1;
                    if (oVar9 == null) {
                        kotlin.jvm.internal.o.o("mView");
                        throw null;
                    }
                    objArr3[2] = ((of1.w1) oVar9).getWebView().getUrl();
                    com.tencent.mars.xlog.Log.e(D13, "AC_GET_OPEN_WEAPP_ACTIVITY_IPC_DELEGATE invalid context(%s) hash(%d) url(%s)", objArr3);
                    return bundle2;
                }
                if (i17 == 1020) {
                    com.tencent.mm.plugin.webview.permission.d O = v0Var.O();
                    bundle2.putInt("key_get_a8key_req_params_req_id", O.f183390j);
                    bundle2.putString("key_get_a8key_req_params_msg_id", O.A);
                    bundle2.putString("key_get_a8key_req_params_username", O.f183386f);
                    bundle2.putString("key_get_a8key_req_params_msg_username", O.f183402v);
                    return bundle2;
                }
                if (i17 != 4008) {
                    if (i17 == 90001) {
                        java.lang.String a27 = com.tencent.xweb.d.g().a(getCurrentUrl());
                        com.tencent.mars.xlog.Log.i(v0Var.D1(), "AC_GET_CURRENT_COOKIE, url:" + getCurrentUrl() + ", cookie:" + a27);
                        bundle2.putString("cookie", a27);
                        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f345013i;
                        bundle2.putFloat("density", mMWebView.getMMDensity());
                        bundle2.putInt("topOffset", pm0.v.s(mMWebView)[1]);
                        if (bundle != null && (string = bundle.getString("currentPicUrl")) != null) {
                            bundle2.putString("currentUrlPath", com.tencent.mm.plugin.webview.modeltools.x0.d(string));
                        }
                        return bundle2;
                    }
                    if (i17 == 121004) {
                        v0Var.f345023b2.e(bundle != null ? bundle.getBoolean("key_on_secure_video_action_is_live", false) : false);
                    } else if (i17 != 139) {
                        if (i17 == 140) {
                            bundle2.putInt("key_webview_preverify_info_scene", 1);
                            com.tencent.mm.plugin.appbrand.jsapi.webview.o oVar10 = v0Var.W1;
                            if (oVar10 != null) {
                                bundle2.putString("key_webview_preverify_info_source_appid", ((of1.w1) oVar10).getAppId());
                                return bundle2;
                            }
                            kotlin.jvm.internal.o.o("mView");
                            throw null;
                        }
                        switch (i17) {
                        }
                    } else {
                        if (bundle == null || (string2 = bundle.getString("info")) == null) {
                            return bundle2;
                        }
                        try {
                            org.json.JSONObject jSONObject = new org.json.JSONObject(string2);
                            com.tencent.mm.plugin.appbrand.jsapi.webview.o oVar11 = v0Var.W1;
                            if (oVar11 == null) {
                                kotlin.jvm.internal.o.o("mView");
                                throw null;
                            }
                            ((of1.w1) oVar11).F(jSONObject);
                        } catch (java.lang.Exception unused) {
                        }
                    }
                }
                com.tencent.mm.autogen.events.ApduEngineFuncEvent apduEngineFuncEvent = new com.tencent.mm.autogen.events.ApduEngineFuncEvent();
                android.content.Context Y = v0Var.Y();
                am.o oVar12 = apduEngineFuncEvent.f53975g;
                oVar12.f7494b = Y;
                oVar12.f7493a = i17;
                if (4003 == i17) {
                    kotlin.jvm.internal.o.d(bundle);
                    oVar12.f7495c = bundle.getString("apdu");
                } else if (4004 == i17) {
                    kotlin.jvm.internal.o.d(bundle);
                    java.lang.String string5 = bundle.getString("apdus");
                    boolean z19 = bundle.getBoolean("breakIfFail", true);
                    boolean z27 = bundle.getBoolean("breakIfTrue", false);
                    oVar12.f7495c = string5;
                    oVar12.f7496d = z19;
                    oVar12.f7497e = z27;
                }
                com.tencent.mm.plugin.webview.modeltools.w.a(apduEngineFuncEvent);
                android.os.Bundle bundle4 = apduEngineFuncEvent.f53976h.f7588a;
                if (bundle4 != null) {
                    bundle2.putAll(bundle4);
                }
            }
        }
        return bundle2;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.x3, com.tencent.mm.plugin.webview.stub.z0
    public void t3(java.lang.String str, java.lang.String str2, int i17, int i18) {
        of1.m mVar = this.f345012h.X1;
        if (mVar == null) {
            kotlin.jvm.internal.o.o("viewScanHelper");
            throw null;
        }
        hy4.s sVar = mVar.f344971r;
        if (sVar == null || str == null || !str.equals(sVar.f286196c)) {
            return;
        }
        boolean o17 = ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).o(mVar.b());
        kd0.l2 l2Var = (kd0.l2) i95.n0.c(kd0.l2.class);
        com.tencent.mm.plugin.appbrand.jsapi.webview.o oVar = mVar.f344880d;
        of1.w1 w1Var = (of1.w1) oVar;
        boolean q27 = w1Var.f345033d.q2();
        ((jd0.z1) l2Var).getClass();
        if (!com.tencent.mm.plugin.scanner.z0.c(i17, str2, o17, q27)) {
            ((et.s) ((ft.f4) i95.n0.c(ft.f4.class))).wi(w1Var.m533getPageView(), false, i17, str2, true, false, mVar.b());
            mVar.f344966m = null;
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            mVar.f344970q = com.tencent.mm.vfs.w6.N(str, 0, -1);
        }
        hy4.s sVar2 = mVar.f344971r;
        if (sVar2 != null) {
            sVar2.b();
        }
        mVar.f344968o = i17;
        mVar.f344969p = i18;
        if (str2 == null || mVar.f344964h == null) {
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.HTMLViewScanHelper", "processGetWXACodeNickName mResultOfImageUrl nil");
        } else {
            kd0.l2 l2Var2 = (kd0.l2) i95.n0.c(kd0.l2.class);
            int i19 = mVar.f344968o;
            ((jd0.z1) l2Var2).getClass();
            if (com.tencent.mm.plugin.scanner.z0.e(i19, str2)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.HTMLViewScanHelper", "processGetWXACodeNickName");
                kd0.p2 p2Var = mVar.f344972s;
                int i27 = mVar.f344968o;
                java.lang.String b17 = mVar.b();
                kd0.f2 f2Var = new kd0.f2(str2);
                f2Var.f306635b = 4;
                f2Var.f306636c = b17;
                ((com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic) p2Var).i(i27, f2Var);
            }
        }
        mVar.f344966m = str2;
        com.tencent.mm.ui.tools.s6 s6Var = mVar.f344964h;
        if (s6Var == null || !s6Var.f210721e.i()) {
            return;
        }
        ((of1.w1) oVar).f345034e.P0(new of1.e(mVar));
    }
}
