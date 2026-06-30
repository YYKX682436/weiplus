package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class d1 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.model.c1 f145214a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.model.m f145215b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.model.m f145216c;

    public d1() {
        e();
    }

    public final com.tencent.mm.plugin.luckymoney.model.c1 a() {
        if (this.f145214a == null) {
            com.tencent.mars.xlog.Log.e(d(), "[getConfig] mConfig == null, need init");
            e();
        } else {
            com.tencent.mars.xlog.Log.i(d(), "[getConfig] has config");
        }
        return this.f145214a;
    }

    public java.lang.String b() {
        java.lang.Object l17 = gm0.j1.u().c().l(356355, "");
        java.lang.String str = l17 instanceof java.lang.String ? (java.lang.String) l17 : null;
        return str == null ? "" : str;
    }

    public final com.tencent.mm.plugin.luckymoney.model.m c() {
        r45.wv3 wv3Var;
        com.tencent.mm.plugin.luckymoney.model.l lVar = com.tencent.mm.plugin.luckymoney.model.m.f145434e;
        if (!lVar.d()) {
            if (this.f145215b == null) {
                e();
            }
            com.tencent.mm.plugin.luckymoney.model.m mVar = this.f145215b;
            jz5.f0 f0Var = null;
            if (mVar != null && (wv3Var = mVar.f145435a) != null) {
                com.tencent.mars.xlog.Log.i(d(), "[getEnvelopSourceMac] use envelopSourceMacV1, is default source ? %s, id：%s ", java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.K0(wv3Var.f389500f)), wv3Var.f389500f);
                f0Var = jz5.f0.f302826a;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.e(d(), "[getEnvelopSourceMac] use envelopSourceMacV1, but envelopSourceMac or showSource is null ");
            }
            return this.f145215b;
        }
        com.tencent.mm.plugin.luckymoney.model.m mVar2 = this.f145216c;
        if (mVar2 == null) {
            com.tencent.mars.xlog.Log.e(d(), "[getEnvelopSourceMac] use envelopSourceMacV2, but is null , use default");
            return lVar.a();
        }
        r45.wv3 wv3Var2 = mVar2.f145435a;
        if (wv3Var2 == null) {
            com.tencent.mars.xlog.Log.e(d(), "[getEnvelopSourceMac] use envelopSourceMacV2：showSource is null, use default");
            return lVar.a();
        }
        com.tencent.mars.xlog.Log.i(d(), "[getEnvelopSourceMac] use envelopSourceMacV2, is default source? %s , id:：%s , expired_time: %s", java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.K0(wv3Var2.f389500f)), wv3Var2.f389500f, java.lang.Integer.valueOf(wv3Var2.F));
        int i17 = wv3Var2.F;
        if (i17 > 0 && i17 > com.tencent.mm.plugin.luckymoney.model.m5.h() / 1000) {
            return mVar2;
        }
        mVar2.f145436b = "";
        wv3Var2.f389500f = "";
        wv3Var2.F = 0;
        wv3Var2.f389499e = 0;
        wv3Var2.f389498d = "";
        r45.xv3 xv3Var = wv3Var2.f389501g;
        boolean z17 = xv3Var != null ? xv3Var.L : false;
        com.tencent.mars.xlog.Log.e(d(), "[getEnvelopSourceMac] use envelopSourceMacV2, but has expired, use default, useThumbUrl：" + z17);
        wv3Var2.f389501g = lVar.b(z17);
        return mVar2;
    }

    public java.lang.String d() {
        return "MicroMsg.LuckyMoneyConfigManager";
    }

    public final void e() {
        com.tencent.mm.plugin.luckymoney.model.c1 c1Var = new com.tencent.mm.plugin.luckymoney.model.c1();
        this.f145214a = c1Var;
        java.lang.String b17 = b();
        if (b17 == null || b17.length() == 0) {
            com.tencent.mars.xlog.Log.e(d(), "[initData] config is null");
            j(c1Var);
        } else {
            try {
                java.nio.charset.Charset forName = java.nio.charset.Charset.forName(com.tencent.kinda.framework.app.KindaConfigCacheStg.SAVE_CHARSET);
                kotlin.jvm.internal.o.f(forName, "forName(...)");
                byte[] bytes = b17.getBytes(forName);
                kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
                c1Var.parseFrom(bytes);
                f();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e(d(), "[initData] parseConfig failed: %s ", e17.getLocalizedMessage());
                j(c1Var);
            }
        }
        com.tencent.mars.xlog.Log.i(d(), "[initData] maxTotalAmount: %s、maxTotalNum：%s、perGroupMaxValue：%s、perMinValue：%s、perPersonMaxValue：%s", java.lang.Double.valueOf(c1Var.f145183e), java.lang.Integer.valueOf(c1Var.f145182d), java.lang.Double.valueOf(c1Var.f145187i), java.lang.Double.valueOf(c1Var.f145188m), java.lang.Double.valueOf(c1Var.f145186h));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c0  */
    /* JADX WARN: Type inference failed for: r3v1, types: [jz5.f0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            r9 = this;
            com.tencent.mm.plugin.luckymoney.model.c1 r0 = r9.f145214a
            if (r0 != 0) goto Le
            java.lang.String r0 = r9.d()
            java.lang.String r1 = "[initEnvelopSourceMac] mConfig is null"
            com.tencent.mars.xlog.Log.e(r0, r1)
            return
        Le:
            com.tencent.mm.plugin.luckymoney.model.l r1 = com.tencent.mm.plugin.luckymoney.model.m.f145434e
            java.lang.String r2 = r0.f145195t
            java.lang.String r3 = ""
            boolean r4 = com.tencent.mm.sdk.platformtools.t8.K0(r2)
            r5 = 0
            r6 = 0
            if (r4 == 0) goto L1e
        L1c:
            r1 = r6
            goto L34
        L1e:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> L2b
            if (r2 != 0) goto L23
            r2 = r3
        L23:
            r4.<init>(r2)     // Catch: org.json.JSONException -> L2b
            com.tencent.mm.plugin.luckymoney.model.m r1 = r1.e(r4)     // Catch: org.json.JSONException -> L2b
            goto L34
        L2b:
            r1 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.String r4 = "MicroMsg.EnvelopSourceMac"
            com.tencent.mars.xlog.Log.printErrStackTrace(r4, r1, r3, r2)
            goto L1c
        L34:
            r9.f145215b = r1
            if (r1 == 0) goto Lbe
            r45.wv3 r2 = r1.f145435a
            jz5.f0 r3 = jz5.f0.f302826a
            if (r2 == 0) goto Lb2
            java.lang.String r4 = r9.d()
            java.lang.String r7 = r2.f389500f
            boolean r7 = com.tencent.mm.sdk.platformtools.t8.K0(r7)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            java.lang.String r8 = r2.f389500f
            java.lang.Object[] r7 = new java.lang.Object[]{r7, r8}
            java.lang.String r8 = "[initEnvelopSourceMacV] has v1：init success，is default source？ %s, id：%s"
            com.tencent.mars.xlog.Log.i(r4, r8, r7)
            java.lang.Class<gb3.j> r4 = gb3.j.class
            i95.m r4 = i95.n0.c(r4)
            gb3.j r4 = (gb3.j) r4
            if (r4 == 0) goto L68
            r45.wv3 r1 = r1.f145435a
            com.tencent.mm.plugin.luckymoney.model.w2 r4 = (com.tencent.mm.plugin.luckymoney.model.w2) r4
            r4.vj(r1)
        L68:
            gm0.b0 r1 = gm0.j1.u()
            com.tencent.mm.storage.n3 r1 = r1.c()
            com.tencent.mm.storage.u3 r4 = com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_ENVELOPE_HAS_SOURCE_INT_SYNC
            r7 = 1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r1.x(r4, r7)
            java.lang.String r1 = r0.f145196u
            boolean r1 = com.tencent.mm.sdk.platformtools.t8.K0(r1)
            if (r1 != 0) goto Lb1
            r45.jm5 r1 = new r45.jm5     // Catch: java.io.IOException -> L9f
            r1.<init>()     // Catch: java.io.IOException -> L9f
            java.lang.String r0 = r0.f145196u     // Catch: java.io.IOException -> L9f
            byte[] r0 = android.util.Base64.decode(r0, r5)     // Catch: java.io.IOException -> L9f
            com.tencent.mm.protobuf.f r0 = r1.parseFrom(r0)     // Catch: java.io.IOException -> L9f
            boolean r1 = r0 instanceof r45.jm5     // Catch: java.io.IOException -> L9f
            if (r1 == 0) goto L98
            r6 = r0
            r45.jm5 r6 = (r45.jm5) r6     // Catch: java.io.IOException -> L9f
        L98:
            if (r6 == 0) goto L9c
            int r5 = r6.f377949u     // Catch: java.io.IOException -> L9f
        L9c:
            r2.f389506o = r5     // Catch: java.io.IOException -> L9f
            goto Lb1
        L9f:
            r0 = move-exception
            java.lang.String r1 = r9.d()
            java.lang.String r0 = r0.getLocalizedMessage()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r2 = "[initEnvelopSourceMacV] has v1 - coverinfo failed: %s "
            com.tencent.mars.xlog.Log.e(r1, r2, r0)
        Lb1:
            r6 = r3
        Lb2:
            if (r6 != 0) goto Lbd
            java.lang.String r0 = r9.d()
            java.lang.String r1 = "[initEnvelopSourceMacV] has v1 - showSource is null , init failed"
            com.tencent.mars.xlog.Log.i(r0, r1)
        Lbd:
            r6 = r3
        Lbe:
            if (r6 != 0) goto Lc9
            java.lang.String r0 = r9.d()
            java.lang.String r1 = "[initEnvelopSourceMacV] has v1 - envelopSourceMac is null ,init failed"
            com.tencent.mars.xlog.Log.i(r0, r1)
        Lc9:
            r9.g()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.luckymoney.model.d1.f():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.tencent.mm.plugin.luckymoney.model.m g() {
        /*
            Method dump skipped, instructions count: 571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.luckymoney.model.d1.g():com.tencent.mm.plugin.luckymoney.model.m");
    }

    public void h(java.lang.String str) {
        gm0.j1.u().c().w(356355, str);
        gm0.j1.u().c().i(true);
    }

    public final void i(com.tencent.mm.plugin.luckymoney.model.c1 c1Var) {
        if (c1Var == null) {
            com.tencent.mars.xlog.Log.e(d(), "[setConfig] config is null");
            return;
        }
        this.f145214a = c1Var;
        com.tencent.mars.xlog.Log.i(d(), "[setConfig] maxTotalAmount: %s、maxTotalNum：%s、perGroupMaxValue：%s、perMinValue：%s、perPersonMaxValue：%s", java.lang.Double.valueOf(c1Var.f145183e), java.lang.Integer.valueOf(c1Var.f145182d), java.lang.Double.valueOf(c1Var.f145187i), java.lang.Double.valueOf(c1Var.f145188m), java.lang.Double.valueOf(c1Var.f145186h));
        f();
        try {
            byte[] byteArray = c1Var.toByteArray();
            kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
            java.nio.charset.Charset forName = java.nio.charset.Charset.forName(com.tencent.kinda.framework.app.KindaConfigCacheStg.SAVE_CHARSET);
            kotlin.jvm.internal.o.f(forName, "forName(...)");
            h(new java.lang.String(byteArray, forName));
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e(d(), "save config exception, " + e17.getLocalizedMessage());
        }
    }

    public final void j(com.tencent.mm.plugin.luckymoney.model.c1 c1Var) {
        jz5.f0 f0Var;
        com.tencent.mars.xlog.Log.i(d(), "[setDefaultConfig] use default config");
        if (c1Var != null) {
            c1Var.f145183e = 2000.0d;
            c1Var.f145182d = 100;
            c1Var.f145187i = 200.0d;
            c1Var.f145188m = 0.01d;
            c1Var.f145186h = 200.0d;
            c1Var.A = 2000.0d;
            c1Var.f145199x = 100;
            c1Var.f145201z = 0.01d;
            c1Var.f145200y = 200.0d;
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e(d(), "[setDefaultConfig] config is null");
        }
    }
}
