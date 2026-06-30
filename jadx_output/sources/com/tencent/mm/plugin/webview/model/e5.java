package com.tencent.mm.plugin.webview.model;

/* loaded from: classes8.dex */
public final class e5 extends com.tencent.mm.plugin.webview.core.i3 {

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.ArrayList f182862c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.ArrayList f182863d;

    /* renamed from: b, reason: collision with root package name */
    public boolean f182864b;

    static {
        com.tencent.mm.plugin.webview.model.d5 d5Var = new com.tencent.mm.plugin.webview.model.d5(null);
        java.util.ArrayList d17 = kz5.c0.d("weixin.qq.com", "tenpay.com", "pay.weixin.qq.com", "payapp.weixin.qq.com", "wx.tenpay.com", "support.weixin.qq.com", "action.weixin.qq.com", "log.weixin.qq.com", "api.mch.weixin.qq.com", "act.weixin.qq.com", "res.wx.qq.com", "res2.wx.qq.com", "pingjs.qq.com", "badjs.weixinbridge.com", "mmbiz.qpic.cn", "wx.qlogo.cn", "wx.gtimg.com", "weixin110.qq.com", "security.wechat.com", "shminorshort.weixin.qq.com", "kf.qq.com", "act.wechatpay.cn", "gtimg.wechatpay.cn", "tenpay.wechatpay.cn", "reswx.wechatpay.cn", "pay.wechatpay.cn", "payapp.wechatpay.cn", "reswx2.wechatpay.cn", "support.wechat.com");
        f182862c = d17;
        java.util.ArrayList d18 = kz5.c0.d("game.weixin.qq.com");
        f182863d = d18;
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_teen_mode_h5_domain_allow_list_1_v2, "", true);
        kotlin.jvm.internal.o.d(Zi);
        com.tencent.mm.plugin.webview.model.d5.a(d5Var, Zi);
        java.lang.String Zi2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_teen_mode_h5_domain_allow_list_2_v2, "", true);
        kotlin.jvm.internal.o.d(Zi2);
        com.tencent.mm.plugin.webview.model.d5.a(d5Var, Zi2);
        java.lang.String Zi3 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_teen_mode_h5_domain_block_list_1_v2, "", true);
        kotlin.jvm.internal.o.d(Zi3);
        com.tencent.mm.plugin.webview.model.d5.b(d5Var, Zi3);
        java.lang.String Zi4 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_teen_mode_h5_domain_block_list_2_v2, "", true);
        kotlin.jvm.internal.o.d(Zi4);
        com.tencent.mm.plugin.webview.model.d5.b(d5Var, Zi4);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewTeenModeInterceptor", "initWebViewTeenModeInterceptor blockList size: %d, %s, allowList size: %d, %s", java.lang.Integer.valueOf(d18.size()), d18, java.lang.Integer.valueOf(d17.size()), d17);
    }

    @Override // com.tencent.mm.plugin.webview.core.i3
    public boolean i() {
        qk.s6 s6Var = (qk.s6) gm0.j1.s(qk.s6.class);
        boolean z17 = false;
        if (!(s6Var != null ? s6Var.isTeenMode() : false)) {
            return true;
        }
        java.lang.String str = c().f181942n;
        if (str == null || r26.n0.N(str)) {
            return true;
        }
        zq1.a0 a0Var = (zq1.a0) gm0.j1.s(zq1.a0.class);
        if (a0Var != null && ((yq1.z) a0Var).o(str)) {
            z17 = true;
        }
        int i17 = z17 ? 2 : 3;
        java.lang.String c17 = hy4.c.f286089a.c(str);
        boolean v17 = v(i17, c17);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewTeenModeInterceptor", "onTeenModeStatusChange bizType=" + i17 + ", bizKey = " + c17 + " hasAuthorized=" + this.f182864b + ", newHasAuthorized=" + v17 + ", url=" + str);
        if (v17 && !this.f182864b) {
            this.f182864b = v17;
            c().f181916a.loadUrl("about:blank");
            c().f181921c0 = true;
            c().V0(str, true, 8);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Override // com.tencent.mm.plugin.webview.core.i3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean p(java.lang.String r11, android.content.Intent r12) {
        /*
            r10 = this;
            java.lang.String r0 = "url"
            kotlin.jvm.internal.o.g(r11, r0)
            r0 = 0
            java.lang.String r1 = "MicroMsg.WebViewTeenModeInterceptor"
            r2 = 1
            r3 = 0
            if (r12 == 0) goto L1f
            java.lang.String r4 = "key_enable_teen_mode_check"
            boolean r12 = r12.getBooleanExtra(r4, r3)     // Catch: java.lang.Exception -> L14
            goto L20
        L14:
            r12 = move-exception
            java.lang.String r4 = "overrideStartLoadBefore get enableTeenModeCheck exception"
            java.lang.Object[] r5 = new java.lang.Object[r3]
            com.tencent.mars.xlog.Log.printErrStackTrace(r1, r12, r4, r5)
            r10.y(r2, r0)
        L1f:
            r12 = r3
        L20:
            if (r12 != 0) goto L2b
            java.lang.String r11 = "overrideStartLoadBefore not enableTeenModeCheck"
            com.tencent.mars.xlog.Log.i(r1, r11)
            r10.y(r2, r0)
            return r3
        L2b:
            java.lang.Class<qk.s6> r12 = qk.s6.class
            lm0.a r4 = gm0.j1.s(r12)
            qk.s6 r4 = (qk.s6) r4
            boolean r4 = r4.isTeenMode()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            java.lang.Object[] r5 = new java.lang.Object[]{r11, r5}
            java.lang.String r6 = "overrideStartLoadBefore url: %s, isTeenMode: %s"
            com.tencent.mars.xlog.Log.i(r1, r6, r5)
            if (r4 != 0) goto L4a
            r10.y(r2, r0)
            return r3
        L4a:
            android.net.Uri r4 = android.net.Uri.parse(r11)
            java.lang.String r4 = r4.getHost()
            if (r4 == 0) goto L5d
            int r5 = r4.length()
            if (r5 != 0) goto L5b
            goto L5d
        L5b:
            r5 = r3
            goto L5e
        L5d:
            r5 = r2
        L5e:
            if (r5 == 0) goto L64
            r10.y(r2, r0)
            return r3
        L64:
            boolean r5 = r10.w(r4)
            boolean r6 = r10.x(r4)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            java.lang.Object[] r5 = new java.lang.Object[]{r4, r5, r6}
            java.lang.String r6 = "overrideStartLoadBefore host: %s, allow: %b, block: %b"
            com.tencent.mars.xlog.Log.i(r1, r6, r5)
            boolean r5 = r10.w(r4)
            if (r5 == 0) goto L8d
            boolean r4 = r10.x(r4)
            if (r4 != 0) goto L8d
            r10.y(r2, r0)
            return r3
        L8d:
            hy4.c r0 = hy4.c.f286089a
            java.lang.String r0 = r0.c(r11)
            r4 = 3
            boolean r0 = r10.v(r4, r0)
            r10.f182864b = r0
            if (r0 == 0) goto La2
            java.lang.String r11 = "overrideStartLoadBefore hasAuthorized"
            com.tencent.mars.xlog.Log.i(r1, r11)
            return r3
        La2:
            r10.y(r0, r11)
            com.tencent.mm.plugin.webview.core.r0 r4 = r10.c()
            lm0.a r11 = gm0.j1.s(r12)
            qk.s6 r11 = (qk.s6) r11
            java.lang.String r5 = r11.Hg()
            java.lang.String r11 = "getWebViewTeenModeNoAccessUrl(...)"
            kotlin.jvm.internal.o.f(r5, r11)
            r6 = 1
            r7 = 0
            r8 = 4
            r9 = 0
            com.tencent.mm.plugin.webview.core.r0.W0(r4, r5, r6, r7, r8, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.model.e5.p(java.lang.String, android.content.Intent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:
    
        if (((yq1.z) r1).o(r4) == true) goto L13;
     */
    @Override // com.tencent.mm.plugin.webview.core.i3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean s(int r1, boolean r2, java.lang.String r3, java.lang.String r4) {
        /*
            r0 = this;
            java.lang.String r1 = "reqUrl"
            kotlin.jvm.internal.o.g(r3, r1)
            java.lang.String r1 = "fullUrl"
            kotlin.jvm.internal.o.g(r4, r1)
            java.lang.Class<qk.s6> r1 = qk.s6.class
            lm0.a r1 = gm0.j1.s(r1)
            qk.s6 r1 = (qk.s6) r1
            r2 = 0
            if (r1 == 0) goto L1b
            boolean r1 = r1.isTeenMode()
            goto L1c
        L1b:
            r1 = r2
        L1c:
            if (r1 == 0) goto L6b
            java.lang.Class<zq1.a0> r1 = zq1.a0.class
            lm0.a r1 = gm0.j1.s(r1)
            zq1.a0 r1 = (zq1.a0) r1
            if (r1 == 0) goto L32
            yq1.z r1 = (yq1.z) r1
            boolean r1 = r1.o(r4)
            r3 = 1
            if (r1 != r3) goto L32
            goto L33
        L32:
            r3 = r2
        L33:
            if (r3 == 0) goto L6b
            hy4.c r1 = hy4.c.f286089a
            java.lang.String r1 = r1.c(r4)
            r3 = 2
            boolean r1 = r0.v(r3, r1)
            r0.f182864b = r1
            r0.y(r1, r4)
            com.tencent.mm.plugin.webview.core.r0 r1 = r0.c()
            java.util.Map r1 = r1.S
            boolean r3 = r0.f182864b
            if (r3 == 0) goto L53
            java.lang.String r3 = "true"
            goto L55
        L53:
            java.lang.String r3 = "false"
        L55:
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            java.lang.String r4 = "teenModeTemporaryAuthorized"
            r1.put(r4, r3)
            com.tencent.mm.plugin.webview.core.r0 r1 = r0.c()
            java.util.Map r1 = r1.S
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            java.lang.Object r1 = r1.get(r4)
            java.lang.String r1 = (java.lang.String) r1
        L6b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.model.e5.s(int, boolean, java.lang.String, java.lang.String):boolean");
    }

    @Override // com.tencent.mm.plugin.webview.core.i3
    public boolean t() {
        i();
        return false;
    }

    public final boolean v(int i17, java.lang.String bizKey) {
        kotlin.jvm.internal.o.g(bizKey, "bizKey");
        try {
            com.tencent.mm.plugin.webview.stub.v0 e07 = c().e0();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("bizType", i17);
            bundle.putString("bizKey", bizKey);
            android.os.Bundle i18 = e07.i(257, bundle);
            kotlin.jvm.internal.o.e(i18, "null cannot be cast to non-null type android.os.Bundle");
            boolean z17 = i18.getBoolean("authorized", false);
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewTeenModeInterceptor", "hasAuthorization:bizType=" + i17 + ", bizKey = " + bizKey + ", authorized = " + z17);
            return z17;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewTeenModeInterceptor", "get hasAuthorization error " + th6.getMessage());
            return false;
        }
    }

    public final boolean w(java.lang.String str) {
        for (java.lang.String str2 : f182862c) {
            if (kotlin.jvm.internal.o.b(str, str2)) {
                return true;
            }
            if (r26.i0.n(str, "." + str2, false)) {
                return true;
            }
        }
        return false;
    }

    public final boolean x(java.lang.String str) {
        for (java.lang.String str2 : f182863d) {
            if (kotlin.jvm.internal.o.b(str, str2)) {
                return true;
            }
            if (r26.i0.n(str, "." + str2, false)) {
                return true;
            }
        }
        return false;
    }

    public final void y(boolean z17, java.lang.String str) {
        this.f182864b = z17;
        c().f181940m = !z17;
        c().f181942n = str;
    }
}
