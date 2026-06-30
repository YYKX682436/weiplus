package mq0;

@j95.b
/* loaded from: classes7.dex */
public final class s0 extends i95.w implements mq0.d0 {

    /* renamed from: f, reason: collision with root package name */
    public static final mq0.m0 f330613f = new mq0.m0(null);

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Map f330614g = kz5.c1.k(new jz5.l(mq0.a.f330513e, 1000), new jz5.l(mq0.a.f330524s, 1000), new jz5.l(mq0.a.f330525t, 1000), new jz5.l(mq0.a.f330526u, 1000), new jz5.l(mq0.a.f330527v, 1000), new jz5.l(mq0.a.f330528w, 1000), new jz5.l(mq0.a.f330529x, 1000), new jz5.l(mq0.a.f330530y, 1000));

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f330615d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f330616e = kz5.b0.c("MagicAdMiniProgram");

    public void Ai(java.lang.String bizScene, java.lang.String bizSubScene, java.lang.String cardId, mq0.a action, boolean z17, java.lang.String traceId, java.util.Map extMap) {
        kotlin.jvm.internal.o.g(bizScene, "bizScene");
        kotlin.jvm.internal.o.g(bizSubScene, "bizSubScene");
        kotlin.jvm.internal.o.g(cardId, "cardId");
        kotlin.jvm.internal.o.g(action, "action");
        kotlin.jvm.internal.o.g(traceId, "traceId");
        kotlin.jvm.internal.o.g(extMap, "extMap");
        if (this.f330616e.contains(bizScene)) {
            if (mq0.m0.a(f330613f, action)) {
                ym5.a1.f(new mq0.q0(action, this, cardId, bizScene, bizSubScene, z17, traceId, extMap));
                return;
            }
            com.tencent.mars.xlog.Log.i("MagicCardIndexSystemReporter", "report action " + action.name() + " skipped due to sampling");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0063 A[Catch: Exception -> 0x0094, TryCatch #0 {Exception -> 0x0094, blocks: (B:16:0x0053, B:18:0x0057, B:23:0x0063, B:24:0x0075, B:26:0x0070), top: B:15:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070 A[Catch: Exception -> 0x0094, TryCatch #0 {Exception -> 0x0094, blocks: (B:16:0x0053, B:18:0x0057, B:23:0x0063, B:24:0x0075, B:26:0x0070), top: B:15:0x0053 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Bi(mq0.a r9, java.util.Map r10, mq0.f0 r11) {
        /*
            r8 = this;
            java.lang.String r0 = ";"
            java.lang.String r1 = "action"
            kotlin.jvm.internal.o.g(r9, r1)
            java.lang.String r1 = "implType"
            kotlin.jvm.internal.o.g(r11, r1)
            mq0.m0 r1 = mq0.s0.f330613f
            boolean r1 = mq0.m0.a(r1, r9)
            java.lang.String r2 = "MagicCardIndexSystemReporter"
            if (r1 != 0) goto L31
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "reportSimply action "
            r10.<init>(r11)
            java.lang.String r9 = r9.name()
            r10.append(r9)
            java.lang.String r9 = " skipped due to sampling"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            com.tencent.mars.xlog.Log.i(r2, r9)
            return
        L31:
            com.tencent.mm.autogen.mmdata.rpt.MagicCardIndexSystemReporterStruct r1 = new com.tencent.mm.autogen.mmdata.rpt.MagicCardIndexSystemReporterStruct
            r1.<init>()
            java.lang.String r9 = r9.name()
            r1.p(r9)
            int r9 = r11.f330556d
            r1.f59070f = r9
            r9 = 1
            r11 = 0
            if (r10 == 0) goto L4e
            boolean r3 = r10.isEmpty()
            r3 = r3 ^ r9
            if (r3 != r9) goto L4e
            r3 = r9
            goto L4f
        L4e:
            r3 = r11
        L4f:
            java.lang.String r4 = ","
            if (r3 == 0) goto Lc0
            java.lang.String r3 = r1.f59072h     // Catch: java.lang.Exception -> L94
            if (r3 == 0) goto L60
            int r5 = r3.length()     // Catch: java.lang.Exception -> L94
            if (r5 != 0) goto L5e
            goto L60
        L5e:
            r5 = r11
            goto L61
        L60:
            r5 = r9
        L61:
            if (r5 != 0) goto L70
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Exception -> L94
            kotlin.jvm.internal.o.d(r3)     // Catch: java.lang.Exception -> L94
            java.lang.String r3 = r26.i0.t(r3, r0, r4, r11)     // Catch: java.lang.Exception -> L94
            r5.<init>(r3)     // Catch: java.lang.Exception -> L94
            goto L75
        L70:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Exception -> L94
            r5.<init>()     // Catch: java.lang.Exception -> L94
        L75:
            pm0.b0.f(r10, r5)     // Catch: java.lang.Exception -> L94
            java.lang.String r3 = "timestamp"
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L94
            r5.put(r3, r6)     // Catch: java.lang.Exception -> L94
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Exception -> L94
            java.lang.String r5 = "toString(...)"
            kotlin.jvm.internal.o.f(r3, r5)     // Catch: java.lang.Exception -> L94
            java.lang.String r3 = r26.i0.t(r3, r4, r0, r11)     // Catch: java.lang.Exception -> L94
            r1.q(r3)     // Catch: java.lang.Exception -> L94
            goto Lc0
        L94:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "[rewardAD] "
            r5.<init>(r6)
            java.lang.String r6 = r1.f59071g
            r5.append(r6)
            java.lang.String r6 = ": JSON processing failed"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            com.tencent.mars.xlog.Log.e(r2, r5, r3)
            org.json.JSONObject r10 = ri.l0.a(r10)
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r10 = r26.i0.t(r10, r4, r0, r11)
            r1.q(r10)
        Lc0:
            java.lang.String r10 = "ReportSource"
            java.lang.String r0 = "native"
            java.lang.String r9 = r1.b(r10, r0, r9)
            r1.f59074j = r9
            r1.l()
            java.lang.String r9 = r1.n()
            java.lang.String r10 = "toShowString(...)"
            kotlin.jvm.internal.o.f(r9, r10)
            java.lang.String r10 = "\r\n"
            java.lang.String r9 = r26.i0.t(r9, r10, r4, r11)
            java.lang.String r10 = "[MBAd] innerReport, struct: "
            java.lang.String r9 = r10.concat(r9)
            com.tencent.mars.xlog.Log.i(r2, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mq0.s0.Bi(mq0.a, java.util.Map, mq0.f0):void");
    }

    public void Di(java.lang.String event, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.o.g(event, "event");
        if (str == null || str.length() == 0) {
            return;
        }
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        kotlin.jvm.internal.h0 h0Var2 = new kotlin.jvm.internal.h0();
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        java.lang.String optString = jSONObject.optString("bizName");
        h0Var.f310123d = optString;
        if (this.f330616e.contains(optString)) {
            h0Var2.f310123d = jSONObject.optString("frameSetName");
            ym5.a1.f(new mq0.r0(event, h0Var, h0Var2, str2));
        }
    }

    public void wi(mq0.g0 jumpTo) {
        kotlin.jvm.internal.o.g(jumpTo, "jumpTo");
        ym5.a1.f(new mq0.o0(this, jumpTo));
    }
}
