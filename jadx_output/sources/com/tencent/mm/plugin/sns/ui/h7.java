package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public abstract class h7 {
    /* JADX WARN: Removed duplicated region for block: B:20:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.content.Context r8, com.tencent.mm.plugin.sns.ui.ns r9, r45.q1 r10) {
        /*
            java.lang.String r0 = "fillActionContent"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.OpenActionContent"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            r2 = 0
            if (r10 == 0) goto Lc9
            r45.m1 r3 = r10.f383556m
            if (r3 == 0) goto Lc9
            java.lang.Class<lt.i0> r3 = lt.i0.class
            i95.m r3 = i95.n0.c(r3)
            lt.i0 r3 = (lt.i0) r3
            r45.m1 r4 = r10.f383556m
            java.lang.String r4 = r4.f380054d
            kt.c r3 = (kt.c) r3
            boolean r3 = r3.Ai(r4)
            if (r3 == 0) goto Lc9
            r9.W = r2
            java.lang.String r3 = ""
            r45.z8 r4 = r10.f383560q
            if (r4 == 0) goto L77
            r45.z8 r4 = r10.f383561r
            if (r4 == 0) goto L77
            java.lang.Class<ct.u2> r3 = ct.u2.class
            i95.m r3 = i95.n0.c(r3)
            ct.u2 r3 = (ct.u2) r3
            bt.d r3 = (bt.d) r3
            o25.s1 r3 = r3.wi()
            r45.m1 r4 = r10.f383556m
            java.lang.String r4 = r4.f380054d
            com.tencent.mm.app.o7 r3 = (com.tencent.mm.app.o7) r3
            boolean r8 = r3.Bi(r8, r4)
            if (r8 == 0) goto L4b
            r45.z8 r8 = r10.f383560q
            goto L4d
        L4b:
            r45.z8 r8 = r10.f383561r
        L4d:
            java.lang.String r3 = com.tencent.mm.sdk.platformtools.m2.d()
            java.lang.String r4 = "zh_CN"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L5e
            java.lang.String r8 = r8.f391786e
        L5c:
            r3 = r8
            goto L97
        L5e:
            java.lang.String r4 = "zh_TW"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L74
            java.lang.String r4 = "zh_HK"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L71
            goto L74
        L71:
            java.lang.String r8 = r8.f391785d
            goto L5c
        L74:
            java.lang.String r8 = r8.f391787f
            goto L5c
        L77:
            java.lang.String r4 = c(r8, r10)
            boolean r5 = com.tencent.mm.sdk.platformtools.t8.K0(r4)     // Catch: java.lang.Exception -> L97
            if (r5 != 0) goto L97
            android.content.res.Resources r5 = r8.getResources()     // Catch: java.lang.Exception -> L97
            java.lang.String r6 = "string"
            java.lang.String r7 = r8.getPackageName()     // Catch: java.lang.Exception -> L97
            int r4 = r5.getIdentifier(r4, r6, r7)     // Catch: java.lang.Exception -> L97
            if (r4 <= 0) goto L97
            java.lang.String r8 = r8.getString(r4)     // Catch: java.lang.Exception -> L97
            goto L5c
        L97:
            int r8 = r10.f383550d
            r4 = 4
            r5 = 1
            if (r8 == r4) goto Lb4
            r4 = 5
            if (r8 == r4) goto Lab
            r10 = 6
            if (r8 == r10) goto La6
            r9.W = r2
            goto Lb8
        La6:
            r9.X = r3
            r9.W = r5
            goto Lb8
        Lab:
            int r8 = r10.f383552f
            if (r8 != r5) goto Lb8
            r9.X = r3
            r9.W = r5
            goto Lb8
        Lb4:
            r9.X = r3
            r9.W = r5
        Lb8:
            boolean r8 = com.tencent.mm.sdk.platformtools.t8.K0(r3)
            if (r8 == 0) goto Lcb
            java.lang.String r8 = "MicroMsg.OpenActionContent"
            java.lang.String r10 = "text can not load ?"
            com.tencent.mars.xlog.Log.e(r8, r10)
            r9.W = r2
            goto Lcb
        Lc9:
            r9.W = r2
        Lcb:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.h7.a(android.content.Context, com.tencent.mm.plugin.sns.ui.ns, r45.q1):void");
    }

    public static int b(android.content.Context context, r45.q1 q1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getScene", "com.tencent.mm.plugin.sns.ui.OpenActionContent");
        if (q1Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getScene", "com.tencent.mm.plugin.sns.ui.OpenActionContent");
            return 0;
        }
        if (q1Var.f383550d != 6) {
            int i17 = q1Var.f383552f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getScene", "com.tencent.mm.plugin.sns.ui.OpenActionContent");
            return i17;
        }
        if (q1Var.f383558o == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getScene", "com.tencent.mm.plugin.sns.ui.OpenActionContent");
            return 0;
        }
        if (q1Var.f383556m == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getScene", "com.tencent.mm.plugin.sns.ui.OpenActionContent");
            return 0;
        }
        if (((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Bi(context, q1Var.f383556m.f380054d)) {
            int i18 = q1Var.f383558o.f374975d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getScene", "com.tencent.mm.plugin.sns.ui.OpenActionContent");
            return i18;
        }
        int i19 = q1Var.f383558o.f374976e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getScene", "com.tencent.mm.plugin.sns.ui.OpenActionContent");
        return i19;
    }

    public static java.lang.String c(android.content.Context context, r45.q1 q1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWordingKey", "com.tencent.mm.plugin.sns.ui.OpenActionContent");
        if (q1Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWordingKey", "com.tencent.mm.plugin.sns.ui.OpenActionContent");
            return "";
        }
        if (q1Var.f383550d != 6) {
            java.lang.String str = q1Var.f383557n;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWordingKey", "com.tencent.mm.plugin.sns.ui.OpenActionContent");
            return str;
        }
        if (q1Var.f383559p == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWordingKey", "com.tencent.mm.plugin.sns.ui.OpenActionContent");
            return "";
        }
        if (((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Bi(context, q1Var.f383556m.f380054d)) {
            java.lang.String str2 = q1Var.f383559p.f369834d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWordingKey", "com.tencent.mm.plugin.sns.ui.OpenActionContent");
            return str2;
        }
        java.lang.String str3 = q1Var.f383559p.f369835e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWordingKey", "com.tencent.mm.plugin.sns.ui.OpenActionContent");
        return str3;
    }
}
