package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public class i1 implements com.tencent.mm.plugin.webview.ui.tools.widget.y1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ab4.v0 f165251a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.animation.ObjectAnimator f165252b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v0 f165253c;

    public i1(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v0 v0Var, ab4.v0 v0Var2, android.animation.ObjectAnimator objectAnimator) {
        this.f165253c = v0Var;
        this.f165251a = v0Var2;
        this.f165252b = objectAnimator;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.y1
    public void a(com.tencent.mm.ui.widget.MMWebView mMWebView, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPageStarted", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$4");
        com.tencent.mars.xlog.Log.i("AdLandingNewH5Comp", "onPageStarted, cid is " + this.f165253c.z());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPageStarted", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$4");
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.y1
    public boolean b(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("closeWindow", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$4");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("closeWindow", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$4");
        return false;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.y1
    public boolean c(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleUrlLoading", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$4");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleUrlLoading", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$4");
        return false;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.x1
    public boolean callback(int i17, android.os.Bundle bundle) {
        boolean z17;
        org.json.JSONObject jSONObject;
        java.lang.String optString;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$4");
        com.tencent.mars.xlog.Log.i("AdLandingNewH5Comp", "callback, actionCode=" + i17);
        final com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v0 v0Var = this.f165253c;
        switch (i17) {
            case 150:
                ab4.v0 v0Var2 = (ab4.v0) v0Var.y();
                com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().saveAdVoteInfo(v0Var2.F, v0Var.u().o(), com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().getAdWuid(), bundle.getInt("sns_landing_pages_ad_vote_index"), 0, bundle.getString("sns_landing_pages_ad_vote_result"));
                break;
            case 151:
                try {
                    android.content.Intent intent = new android.content.Intent();
                    java.lang.String b17 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ka.b(bundle.getString("sns_landing_pages_ad_jumpurl"), "traceid=" + v0Var.u().m(), "aid=" + v0Var.u().c());
                    java.lang.String n17 = v0Var.u().n();
                    if (android.text.TextUtils.isEmpty(n17)) {
                        n17 = v0Var.u().o();
                        com.tencent.mars.xlog.Log.i("AdLandingNewH5Comp", "opJumpView, use orig_UxInfo:" + n17);
                    } else {
                        com.tencent.mars.xlog.Log.i("AdLandingNewH5Comp", "opJumpView, use updated_UxInfo:" + n17);
                    }
                    java.lang.String b18 = ca4.z0.b(b17, n17);
                    ca4.z0.c(intent, n17);
                    intent.putExtra("rawUrl", b18);
                    intent.putExtra("useJs", true);
                    intent.putExtra("type", -255);
                    ca4.z0.a(intent, 84);
                    j45.l.j(v0Var.f165049d, "webview", ".ui.tools.WebViewUI", intent, null);
                    com.tencent.mars.xlog.Log.i("AdLandingNewH5Comp", "jumpUrl, finalUrl=" + b18);
                    break;
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("AdLandingNewH5Comp", "OptJump exp=" + e17.toString());
                    break;
                }
            case 152:
                java.lang.String string = bundle.getString("sns_landing_pages_h5_params");
                final java.lang.String string2 = bundle.getString("callbackId");
                v0Var.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleJSAPI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                try {
                    com.tencent.mars.xlog.Log.i("AdLandingNewH5Comp", "handleJSAPI, params=" + string + ", callbackId=" + string2);
                    jSONObject = new org.json.JSONObject(string);
                    optString = jSONObject.optString("funcName");
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.e("AdLandingNewH5Comp", "handleJSAPI, exp=" + th6.toString());
                }
                if ("opUpdateContentHeight".equals(optString)) {
                    int i18 = jSONObject.getInt("height");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("adJuestHeight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                    com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m1(v0Var, i18));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adJuestHeight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                } else {
                    if (!"opStartQRScan".equals(optString)) {
                        if ("opEndQRScan".equals(optString)) {
                            v0Var.c0(jSONObject.getString("scanUrl"), jSONObject.optInt("directJump"), jSONObject.optInt("syncQrImageDownload"), string2);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleJSAPI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                        } else {
                            boolean equals = "opGetLocation".equals(optString);
                            yz5.q qVar = v0Var.D;
                            if (equals) {
                                java.lang.String optString2 = jSONObject.optString("type");
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleGeoLocation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                                eb4.s.c(string2, optString2, v0Var.f165049d, false, true, null, qVar);
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleGeoLocation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleJSAPI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                            } else if ("opGetDeviceInfo".equals(optString)) {
                                v0Var.X(string2);
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleJSAPI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                            } else if ("requestBindPhoneNumber".equals(optString)) {
                                v0Var.b0(string2, jSONObject);
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleJSAPI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                            } else {
                                boolean equals2 = "openWheelPicker".equals(optString);
                                android.content.Context context = v0Var.f165049d;
                                if (equals2) {
                                    fb4.e.a(context, string2, jSONObject, v0Var);
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleJSAPI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                                } else if ("getCanAutoFillData".equals(optString)) {
                                    eb4.s.a(string2, qVar);
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleJSAPI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                                } else if ("setCanAutoFillData".equals(optString)) {
                                    eb4.s.e(jSONObject.optString("status"), string2, qVar);
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleJSAPI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                                } else {
                                    jz5.g gVar = eb4.g.f250886a;
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getJsapiMap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.AdJsApiPool");
                                    jz5.g gVar2 = eb4.g.f250886a;
                                    java.util.Map map = (java.util.Map) ((jz5.n) gVar2).getValue();
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getJsapiMap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.AdJsApiPool");
                                    if (map.containsKey(optString)) {
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getJsapiMap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.AdJsApiPool");
                                        java.util.Map map2 = (java.util.Map) ((jz5.n) gVar2).getValue();
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getJsapiMap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.AdJsApiPool");
                                        ((eb4.e) map2.get(optString)).a(jSONObject, context, new yz5.p() { // from class: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v0$$a
                                            @Override // yz5.p
                                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v0 v0Var3 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v0.this;
                                                v0Var3.getClass();
                                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$handleJSAPI$0", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                                                java.util.HashMap hashMap = new java.util.HashMap((java.util.Map) obj2);
                                                v0Var3.Z(string2, (java.lang.String) obj, hashMap);
                                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$handleJSAPI$0", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                                                return jz5.f0.f302826a;
                                            }
                                        });
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleJSAPI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                                    } else if ("opOpenFinderProfile".equals(optString)) {
                                        b54.e.d(context, string2, jSONObject, v0Var, v0Var.u());
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleJSAPI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                                    } else if ("opFinderFollow".equals(optString)) {
                                        b54.e.c(string2, jSONObject, v0Var, v0Var.u());
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleJSAPI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                                    } else if ("opQueryFinderFollowState".equals(optString)) {
                                        b54.e.e(string2, jSONObject, v0Var, v0Var.u());
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleJSAPI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                                    } else if ("opJumpWeApp".equals(optString)) {
                                        v0Var.d0(string2, jSONObject);
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleJSAPI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                                    } else {
                                        com.tencent.mars.xlog.Log.w("AdLandingNewH5Comp", "handleJSAPI without processor! func=" + optString);
                                    }
                                }
                            }
                        }
                        z17 = true;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$4");
                        return z17;
                    }
                    jSONObject.getString("scanUrl");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleJSAPI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                z17 = false;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$4");
                return z17;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$4");
        return false;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.y1
    public void d(com.tencent.mm.ui.widget.MMWebView mMWebView, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPageFinished", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$4");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPageFinished, cid is ");
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v0 v0Var = this.f165253c;
        sb6.append(v0Var.z());
        sb6.append(", showLoadAnimation is ");
        ab4.v0 v0Var2 = this.f165251a;
        sb6.append(v0Var2 != null ? java.lang.Boolean.valueOf(v0Var2.f2902J) : "info is null");
        sb6.append(", mPageStartDisplay is ");
        sb6.append(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v0.O(v0Var));
        com.tencent.mars.xlog.Log.i("AdLandingNewH5Comp", sb6.toString());
        if (v0Var2 != null && v0Var2.f2902J && !com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v0.O(v0Var)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
            v0Var.f165558x = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
            this.f165252b.start();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPageFinished", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$4");
    }
}
