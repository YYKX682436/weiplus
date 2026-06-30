package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public class v0 extends com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 implements eb4.k {
    public static com.tencent.mm.ui.widget.MMWebView E;
    public final java.lang.Runnable A;
    public com.tencent.mm.ui.widget.dialog.u3 B;
    public final ca4.a0 C;
    public final yz5.q D;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMWebView f165553s;

    /* renamed from: t, reason: collision with root package name */
    public zg0.v2 f165554t;

    /* renamed from: u, reason: collision with root package name */
    public volatile boolean f165555u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.sdk.event.IListener f165556v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String[] f165557w;

    /* renamed from: x, reason: collision with root package name */
    public volatile boolean f165558x;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f165559y;

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.Runnable f165560z;

    public v0(android.content.Context context, ab4.d0 d0Var, android.view.ViewGroup viewGroup) {
        super(context, d0Var, viewGroup);
        this.f165555u = false;
        this.f165557w = new java.lang.String[]{"weixin.qq.com", "wxs.qq.com", "h5.gdt.qq.com", "xj.gdt.qq.com", "test-xj.gdt.qq.com", "bricks.e.qq.com", "test.bricks.e.qq.com"};
        this.f165559y = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.f165560z = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.g1(this);
        this.A = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.l1(this);
        this.B = null;
        this.C = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a1(this);
        this.D = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.e1(this);
    }

    public static /* synthetic */ boolean O(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v0 v0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        boolean z17 = v0Var.f165558x;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        return z17;
    }

    public static /* synthetic */ com.tencent.mm.ui.widget.MMWebView P(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v0 v0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        com.tencent.mm.ui.widget.MMWebView mMWebView = v0Var.f165553s;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        return mMWebView;
    }

    public static void R(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v0 v0Var) {
        android.view.ViewGroup viewGroup;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        v0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fixWebViewWhiteLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        com.tencent.mm.ui.widget.MMWebView mMWebView = v0Var.f165553s;
        if (mMWebView != null && mMWebView.isAttachedToWindow() && (viewGroup = (android.view.ViewGroup) mMWebView.getChildAt(0)) != null && viewGroup.getChildCount() > 0) {
            viewGroup.setPadding(0, 0, 0, 0);
            android.view.View childAt = viewGroup.getChildAt(0);
            if (childAt != null) {
                childAt.requestLayout();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fixWebViewWhiteLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
    }

    public static void S(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v0 v0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        v0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideLoading", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z0(v0Var));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideLoading", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
    }

    public static /* synthetic */ void T(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v0 v0Var, java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        v0Var.Y(str, z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
    }

    public static /* synthetic */ void U(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v0 v0Var, java.lang.String str, java.lang.String str2, java.util.Map map) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        v0Var.Z(str, str2, map);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
    }

    public static /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 V(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v0 v0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        com.tencent.mm.ui.widget.dialog.u3 u3Var = v0Var.B;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        return u3Var;
    }

    public static void W(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v0 v0Var, int i17) {
        com.tencent.mm.ui.widget.MMWebView mMWebView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        v0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onOwnerActivityLifeCycle", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        com.tencent.mm.sdk.event.IListener iListener = v0Var.f165556v;
        if (iListener != null) {
            iListener.dead();
            v0Var.f165556v = null;
        }
        if (5 == i17 && (mMWebView = v0Var.f165553s) != null) {
            com.tencent.mars.xlog.Log.i("AdLandingNewH5Comp", "onDestroy");
            mMWebView.setCleanOnDetached(true);
            try {
                mMWebView.E0();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("AdLandingNewH5Comp", "cleanUpClient exp=" + e17.toString());
                ca4.q.c("AdLandingNewH5Comp cleanUpClient", e17);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onOwnerActivityLifeCycle", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
    }

    public static void e0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("preloadWebView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        com.tencent.mars.xlog.Log.i("AdLandingNewH5Comp", "try preloadWebView sWebViewInstance= " + E);
        try {
            if (ca4.m0.q()) {
                ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.f1());
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preloadWebView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void G() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        android.view.ViewGroup.LayoutParams layoutParams = this.f165056n.getLayoutParams();
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            ab4.d0 d0Var = this.f165050e;
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).setMargins((int) d0Var.f2821h, (int) d0Var.f2819f, (int) d0Var.f2822i, (int) d0Var.f2820g);
        }
        this.f165056n.setLayoutParams(layoutParams);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void K() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        super.K();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("requestWebViewLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        try {
            com.tencent.mm.ui.widget.MMWebView mMWebView = this.f165553s;
            if (mMWebView != null) {
                mMWebView.postOnAnimation(this.A);
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestWebViewLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void L() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        super.L();
        ab4.v0 v0Var = (ab4.v0) y();
        if (v0Var != null && v0Var.f2902J) {
            this.f165559y.removeCallbacks(this.f165560z);
        }
        x();
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f165553s;
        if (mMWebView != null && mMWebView.getParent() != null) {
            ((android.view.ViewGroup) mMWebView.getParent()).removeView(mMWebView);
            mMWebView.setTag(null);
            mMWebView.destroy();
        }
        this.f165555u = true;
        this.f165554t = null;
        this.f165056n = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
    }

    public final void X(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("acquireDeviceInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        java.lang.String url = this.f165553s.getUrl();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkDeviceInfoUrlPermission", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        boolean z17 = true;
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ad_landing_page_form_device_id, 1) == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkDeviceInfoUrlPermission", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        } else if (android.text.TextUtils.isEmpty(url)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkDeviceInfoUrlPermission", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        } else {
            java.lang.String host = android.net.Uri.parse(url).getHost();
            if (host != null) {
                java.lang.String[] strArr = this.f165557w;
                if (a84.b0.g(strArr)) {
                    for (java.lang.String str2 : strArr) {
                        if (str2 != null && host.contains(str2)) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkDeviceInfoUrlPermission", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                            break;
                        }
                    }
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkDeviceInfoUrlPermission", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        }
        z17 = false;
        if (!z17) {
            g0(str, -2, "url permission denied", "");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("acquireDeviceInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
            return;
        }
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        if (!j35.u.h(this.f165049d, "android.permission.READ_PHONE_STATE")) {
            g0(str, -3, "system permission denied", "");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("acquireDeviceInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
            return;
        }
        java.lang.String g17 = wo.w0.g(false);
        if (android.text.TextUtils.isEmpty(g17)) {
            g0(str, -1, "id is empty", "");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("acquireDeviceInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        } else {
            g0(str, 0, "ok", com.tencent.mm.sdk.platformtools.w2.a(g17));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("acquireDeviceInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        }
    }

    public final void Y(java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callbackQRResultToJS", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        com.tencent.mars.xlog.Log.i("AdLandingNewH5Comp", "callbackQRResultToJS, isSucc=" + z17 + ", callbackId=" + str);
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x0(this, z17, str));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callbackQRResultToJS", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044 A[Catch: all -> 0x004e, TRY_ENTER, TryCatch #3 {all -> 0x004e, blocks: (B:7:0x001d, B:9:0x0027, B:15:0x0044, B:39:0x0047), top: B:6:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0047 A[Catch: all -> 0x004e, TRY_LEAVE, TryCatch #3 {all -> 0x004e, blocks: (B:7:0x001d, B:9:0x0027, B:15:0x0044, B:39:0x0047), top: B:6:0x001d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z(java.lang.String r16, java.lang.String r17, java.util.Map r18) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v0.Z(java.lang.String, java.lang.String, java.util.Map):void");
    }

    public final java.lang.reflect.Method a0(java.lang.Class cls) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("findJsapiMethod", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        java.lang.reflect.Method method = null;
        try {
            java.lang.reflect.Method[] declaredMethods = cls.getDeclaredMethods();
            int length = declaredMethods.length;
            int i17 = 0;
            while (true) {
                if (i17 >= length) {
                    break;
                }
                java.lang.reflect.Method method2 = declaredMethods[i17];
                method2.getReturnType();
                if (a84.b0.d(method2.getParameterTypes())) {
                    method = method2;
                    break;
                }
                i17++;
            }
            if (method == null) {
                com.tencent.mars.xlog.Log.w("AdLandingNewH5Comp", "there is no method satisfying the condition");
            }
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("AdLandingNewH5Comp", "finding the js method occurs something exception");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findJsapiMethod", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        return method;
    }

    public void b0(java.lang.String str, org.json.JSONObject jSONObject) {
        java.lang.String str2;
        java.lang.String str3;
        android.view.View view;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleBindPhoneNumber", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        java.lang.String phoneNumber = com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().getPhoneNumber();
        java.lang.String optString = jSONObject.optString("requestName");
        java.lang.String optString2 = jSONObject.optString("requestIconUrl");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleBindPhoneNumber, phone.len=");
        sb6.append(phoneNumber == null ? 0 : phoneNumber.length());
        sb6.append(", name=");
        sb6.append(optString);
        sb6.append(", iconUrl=");
        sb6.append(optString2);
        com.tencent.mars.xlog.Log.i("AdLandingNewH5Comp", sb6.toString());
        if (android.text.TextUtils.isEmpty(optString) || android.text.TextUtils.isEmpty(optString2)) {
            str2 = "handleBindPhoneNumber";
            str3 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp";
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("ret", "-3");
            hashMap.put("err_msg", "params error");
            Z(str, "params error", hashMap);
            com.tencent.mars.xlog.Log.i("AdLandingNewH5Comp", "handleBindPhoneNumber, params error");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showRequestPhoneNumDialog", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
            android.content.Context context = this.f165049d;
            com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(context, 0, 0, false);
            z2Var.f212058g.setBackgroundColor(context.getResources().getColor(com.tencent.mm.R.color.aaw));
            android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.coy, null);
            android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.lzs);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.lzw);
            android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.kuo);
            android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.kup);
            str2 = "handleBindPhoneNumber";
            android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.b3v);
            android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.b3w);
            android.view.View findViewById4 = inflate.findViewById(com.tencent.mm.R.id.lzn);
            android.view.View findViewById5 = inflate.findViewById(com.tencent.mm.R.id.lzx);
            if (android.text.TextUtils.isEmpty(phoneNumber)) {
                view = findViewById5;
                textView2.setVisibility(0);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingNewH5Comp", "showRequestPhoneNumDialog", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingNewH5Comp", "showRequestPhoneNumDialog", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingNewH5Comp", "showRequestPhoneNumDialog", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingNewH5Comp", "showRequestPhoneNumDialog", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingNewH5Comp", "showRequestPhoneNumDialog", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingNewH5Comp", "showRequestPhoneNumDialog", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                textView2.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f479232tk));
                textView2.setText(context.getText(com.tencent.mm.R.string.j8b));
            } else {
                view = findViewById5;
                textView2.setVisibility(0);
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(findViewById, arrayList4.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingNewH5Comp", "showRequestPhoneNumDialog", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingNewH5Comp", "showRequestPhoneNumDialog", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.add(0);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(findViewById2, arrayList5.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingNewH5Comp", "showRequestPhoneNumDialog", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingNewH5Comp", "showRequestPhoneNumDialog", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                arrayList6.add(8);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(findViewById3, arrayList6.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingNewH5Comp", "showRequestPhoneNumDialog", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingNewH5Comp", "showRequestPhoneNumDialog", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                textView2.setText(phoneNumber);
            }
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (optString == null) {
                optString = "";
            }
            textView.setText(optString);
            if (!android.text.TextUtils.isEmpty(optString2)) {
                o11.f fVar = new o11.f();
                fVar.f342079c = true;
                fVar.f342091o = com.tencent.mm.R.raw.default_avatar_round;
                fVar.f342096t = true;
                n11.a.b().h(optString2, imageView, fVar.a());
            }
            findViewById4.setOnClickListener(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.b1(this, z2Var, str));
            view.setOnClickListener(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.c1(this, z2Var, phoneNumber, str));
            findViewById3.setOnClickListener(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.d1(this, z2Var, str));
            z2Var.j(inflate);
            z2Var.C();
            str3 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp";
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showRequestPhoneNumDialog", str3);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, str3);
    }

    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [int, boolean] */
    public void c0(java.lang.String str, int i17, int i18, java.lang.String str2) {
        ?? r27;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleQR", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        try {
            com.tencent.mars.xlog.Log.i("AdLandingNewH5Comp", "handleQR, qrDirectJump=" + i17 + ", syncQrImageDownload=" + i18 + ", jsCallbackId=" + str2 + ", url=" + str);
            boolean z17 = true;
            boolean z18 = i17 == 1;
            if (i18 != 1) {
                z17 = false;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            ab4.v0 v0Var = (ab4.v0) y();
            bundle.putString("qrExtInfo", v0Var != null ? v0Var.I : "");
            bundle.putInt("qrIsDirectJump", i17);
            bundle.putString("jsCallbackId", str2);
            ca4.b0 b0Var = new ca4.b0(this.f165049d, u(), 2, bundle);
            java.lang.String l17 = za4.t0.l("adId", str);
            if (android.text.TextUtils.isEmpty(l17) || !com.tencent.mm.vfs.w6.j(l17)) {
                ab4.v0 v0Var2 = (ab4.v0) y();
                if (!z17) {
                    android.graphics.Bitmap b07 = com.tencent.mm.sdk.platformtools.x.b0(this.f165056n);
                    if (b07 != null) {
                        com.tencent.mars.xlog.Log.i("AdLandingNewH5Comp", "shoot webView succ");
                        java.lang.String l18 = za4.t0.l("adId", str + "_shoot");
                        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(l18);
                        java.lang.String str3 = a17.f213279f;
                        if (str3 != null) {
                            java.lang.String l19 = com.tencent.mm.vfs.e8.l(str3, false, false);
                            if (!a17.f213279f.equals(l19)) {
                                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l19, a17.f213280g, a17.f213281h);
                            }
                        }
                        java.io.OutputStream I = com.tencent.mm.vfs.w6.I(a17, com.tencent.mm.vfs.a3.f212781a.m(a17, null), false);
                        boolean compress = b07.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, I);
                        I.flush();
                        I.close();
                        if (compress) {
                            com.tencent.mars.xlog.Log.i("AdLandingNewH5Comp", "shoot save succ");
                            if (z18) {
                                b0Var.k(l18, str, this.C);
                            } else {
                                b0Var.l(l18, str, this.C);
                            }
                        } else {
                            com.tencent.mars.xlog.Log.e("AdLandingNewH5Comp", "compressBitmap failed");
                            Y(str2, false);
                        }
                        r27 = 0;
                    } else {
                        com.tencent.mars.xlog.Log.e("AdLandingNewH5Comp", "getBitmapFromView==null");
                        r27 = 0;
                        Y(str2, false);
                    }
                    za4.t0.c(str, r27, v0Var2.f2818e, r27, new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.w0(this, str));
                } else if (android.text.TextUtils.isEmpty(str)) {
                    com.tencent.mars.xlog.Log.e("AdLandingNewH5Comp", "imageUrl is empty");
                    Y(str2, false);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleQR", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                    return;
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showLoading", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                    ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.y0(this));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showLoading", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                    za4.t0.c(str, false, v0Var2.f2818e, 0, new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.n1(this, str, str2, z18, b0Var));
                }
            } else {
                com.tencent.mars.xlog.Log.i("AdLandingNewH5Comp", "local file exists, imageUrl=" + str);
                if (z18) {
                    b0Var.k(l17, str, this.C);
                } else {
                    b0Var.l(l17, str, this.C);
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdLandingNewH5Comp", "handleQR, exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleQR", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
    }

    public final void d0(java.lang.String str, org.json.JSONObject jSONObject) {
        java.lang.String str2;
        boolean z17;
        java.lang.String str3;
        java.lang.String str4;
        android.content.Intent intent;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("openWeApp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        java.lang.String optString = jSONObject.optString("weAppUserName");
        java.lang.String optString2 = jSONObject.optString("weAppPath");
        java.lang.String optString3 = jSONObject.optString("version");
        android.content.Context context = this.f165049d;
        ab4.n0 u17 = u();
        java.lang.String z18 = z();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("jumpWeApp", "com.tencent.mm.plugin.sns.ad.utils.AdLandingPageH5Jumper");
        if (android.text.TextUtils.isEmpty(optString) || u17 == null) {
            str2 = "openWeApp";
            com.tencent.mars.xlog.Log.w("AdLandingPageH5Jumper", "the we app name is null or page data is null, Please check the input parameters!!!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpWeApp", "com.tencent.mm.plugin.sns.ad.utils.AdLandingPageH5Jumper");
            z17 = false;
        } else {
            java.lang.String o17 = u17.o();
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            java.lang.String str5 = o17 == null ? "" : o17;
            java.lang.String j17 = u17.j();
            java.lang.String str6 = j17 == null ? "" : j17;
            java.lang.String c17 = u17.c();
            if (c17 == null) {
                c17 = "";
            }
            java.lang.String m17 = u17.m();
            if (m17 == null) {
                m17 = "";
            }
            int d17 = u17.d();
            if ((context instanceof android.app.Activity) && d17 == 2 && (intent = ((android.app.Activity) context).getIntent()) != null) {
                str2 = "openWeApp";
                java.lang.String l17 = com.tencent.mm.sdk.platformtools.c2.l(intent, "sns_landing_pages_sessionId");
                str3 = l17 == null ? "" : l17;
                java.lang.String l18 = com.tencent.mm.sdk.platformtools.c2.l(intent, "sns_landing_pages_ad_buffer");
                if (l18 == null) {
                    l18 = "";
                }
                str4 = l18;
            } else {
                str2 = "openWeApp";
                str3 = "";
                str4 = str3;
            }
            ca4.z0.q0(context, optString, optString2 == null ? "" : optString2, optString3 == null ? "" : optString3, c17, m17, java.lang.String.format("%s:%s:%s:%s:%d:%s:%s:%d", str3, str4, z18 == null ? "" : z18, java.lang.String.valueOf(java.lang.System.currentTimeMillis() / 1000), java.lang.Integer.valueOf(d17), str5, str6, java.lang.Integer.valueOf(u17.l())), str5, 1084);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpWeApp", "com.tencent.mm.plugin.sns.ad.utils.AdLandingPageH5Jumper");
            z17 = true;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("ret", java.lang.Integer.valueOf(z17 ? 0 : -1));
        Z(str, z17 ? "ok" : "fail", hashMap);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
    }

    @Override // eb4.k
    public void e(java.lang.String str, java.lang.String str2, java.util.Map map) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callJs", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        Z(str, str2, map);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callJs", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("applyLayoutParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        ab4.v0 v0Var = (ab4.v0) y();
        if (v0Var != null && v0Var.H != null && v0Var.f2826p == 2) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("applyLayoutParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        } else {
            super.g();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("applyLayoutParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        }
    }

    public final void g0(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resultDeviceId", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("ret", java.lang.Integer.valueOf(i17));
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str3 == null) {
            str3 = "";
        }
        hashMap.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_DEVICE_ID, str3);
        Z(str, str2, hashMap);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resultDeviceId", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public android.view.View j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("customLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        this.f165555u = false;
        boolean z17 = ca4.m0.u0(e42.c0.clicfg_sns_ad_disable_input_out_of_keyboard_landing_page, 0) == 1;
        com.tencent.mm.ui.widget.MMWebView mMWebView = E;
        if (mMWebView != null) {
            this.f165553s = mMWebView;
            E = null;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1911, 0);
            com.tencent.mars.xlog.Log.i("AdLandingNewH5Comp", "is preload webView, disableFixAdKeyboardLandingPage is " + z17);
        } else {
            com.tencent.mm.plugin.webview.ui.tools.widget.b2 b2Var = com.tencent.mm.plugin.webview.ui.tools.widget.a2.f187099a;
            android.content.Context context = this.f165049d;
            ((yg0.z2) b2Var).getClass();
            this.f165553s = com.tencent.mm.plugin.webview.ui.tools.widget.p4.a(context);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1911, 1);
            com.tencent.mars.xlog.Log.i("AdLandingNewH5Comp", "just new webView, disableFixAdKeyboardLandingPage is " + z17);
        }
        this.f165553s.setCleanOnDetached(false);
        this.f165553s.getSettings().k(true);
        this.f165553s.getSettings().s(-1);
        this.f165553s.getSettings().z(true);
        if (!z17) {
            k54.s.f304449a.b(this.f165553s, false);
        }
        ab4.v0 v0Var = (ab4.v0) y();
        if (v0Var != null && v0Var.f2902J) {
            this.f165553s.setAlpha(0.0f);
        }
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this.f165553s, "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.addListener(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h1(this));
        com.tencent.mm.ui.widget.MMWebView mMWebView2 = this.f165553s;
        com.tencent.mm.plugin.webview.ui.tools.widget.w1 w1Var = com.tencent.mm.plugin.webview.ui.tools.widget.v1.f187579a;
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i1 i1Var = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i1(this, v0Var, ofFloat);
        ((yg0.w2) w1Var).getClass();
        mMWebView2.setWebViewClient(new com.tencent.mm.plugin.webview.ui.tools.widget.w3(mMWebView2, false, i1Var, null));
        if (v0Var == null || v0Var.H == null || v0Var.f2826p != 2) {
            com.tencent.mm.ui.widget.MMWebView mMWebView3 = this.f165553s;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("customLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
            return mMWebView3;
        }
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.j1 j1Var = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.j1(this, this.f165049d);
        j1Var.addView(this.f165553s);
        android.view.ViewGroup.LayoutParams layoutParams = this.f165553s.getLayoutParams();
        layoutParams.width = -1;
        float k17 = i65.a.k(this.f165049d);
        double d17 = v0Var.G;
        ab4.a1 a1Var = v0Var.H;
        layoutParams.height = (int) (k17 - za4.z0.o(d17, a1Var.f2806a, a1Var.f2807b, a1Var.f2808c));
        this.f165553s.setLayoutParams(layoutParams);
        java.lang.Object obj = this.f165049d;
        if ((obj instanceof com.tencent.mm.plugin.sns.ui.nd) && (obj instanceof androidx.lifecycle.y)) {
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = (com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI) ((com.tencent.mm.plugin.sns.ui.nd) obj);
            snsAdNativeLandingPagesUI.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRootViewHeight", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            androidx.lifecycle.j0 j0Var = snsAdNativeLandingPagesUI.H2;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRootViewHeight", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            j0Var.observe((androidx.lifecycle.y) this.f165049d, new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.k1(this, v0Var));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("customLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        return j1Var;
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void k() {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        ab4.v0 v0Var = (ab4.v0) y();
        if (v0Var != null) {
            x();
            com.tencent.mm.ui.widget.MMWebView mMWebView = this.f165553s;
            if (mMWebView != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUrl", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                ab4.v0 v0Var2 = (ab4.v0) y();
                if (android.text.TextUtils.isEmpty(v0Var2.F)) {
                    com.tencent.mars.xlog.Log.e("AdLandingNewH5Comp", "final url empty");
                    str = v0Var2.F;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUrl", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                } else {
                    java.lang.String str2 = v0Var2.F;
                    java.lang.String adWuid = com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().getAdWuid();
                    if (android.text.TextUtils.isEmpty(adWuid)) {
                        com.tencent.mars.xlog.Log.e("AdLandingNewH5Comp", "AdWuidHelper, wuid is empty");
                    } else {
                        str2 = ca4.z0.e(str2, "wuid", adWuid);
                    }
                    str = ca4.z0.b(str2, u().o());
                    java.lang.String b17 = u().b();
                    if (!android.text.TextUtils.isEmpty(b17)) {
                        str = ca4.z0.e(str, "adRewardParams", b17);
                    }
                    if (v0Var2.f2826p == 1) {
                        java.lang.String adVoteInfo = com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().getAdVoteInfo(v0Var2.F, u().o(), adWuid);
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(adVoteInfo)) {
                            str = str + "&" + adVoteInfo;
                        }
                    }
                    com.tencent.mars.xlog.Log.i("AdLandingNewH5Comp", "final url=" + str);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUrl", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                }
                mMWebView.loadUrl(str);
                if (v0Var.f2902J) {
                    com.tencent.mm.sdk.platformtools.n3 n3Var = this.f165559y;
                    java.lang.Runnable runnable = this.f165560z;
                    n3Var.removeCallbacks(runnable);
                    n3Var.postDelayed(runnable, 3000L);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("ensureNativeActivityLifeCycleListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        try {
            if (this.f165556v == null) {
                final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
                com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsAdNativePageLifecycleEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsAdNativePageLifecycleEvent>(a0Var) { // from class: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$15
                    {
                        this.__eventId = 1181431009;
                    }

                    @Override // com.tencent.mm.sdk.event.IListener
                    public boolean callback(com.tencent.mm.autogen.events.SnsAdNativePageLifecycleEvent snsAdNativePageLifecycleEvent) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$15");
                        com.tencent.mm.autogen.events.SnsAdNativePageLifecycleEvent snsAdNativePageLifecycleEvent2 = snsAdNativePageLifecycleEvent;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$15");
                        try {
                            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v0.W(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v0.this, snsAdNativePageLifecycleEvent2.f54796g.f6611a);
                        } catch (java.lang.Throwable unused) {
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$15");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$15");
                        return false;
                    }
                };
                this.f165556v = iListener;
                iListener.alive();
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("ensureNativeActivityLifeCycleListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
    }
}
