package we0;

@j95.b
/* loaded from: classes11.dex */
public final class u0 extends i95.w implements xe0.c0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f445169d = "MicroMsg.FlutterStatusFeatureService";

    /* renamed from: e, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f445170e = kotlinx.coroutines.z0.b();

    /* renamed from: f, reason: collision with root package name */
    public boolean f445171f;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(we0.u0 r12, java.util.Map r13, kotlin.coroutines.Continuation r14) {
        /*
            r12.getClass()
            boolean r0 = r14 instanceof m.b
            if (r0 == 0) goto L16
            r0 = r14
            m.b r0 = (m.b) r0
            int r1 = r0.P
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.P = r1
            goto L1b
        L16:
            m.b r0 = new m.b
            r0.<init>(r12, r14)
        L1b:
            java.lang.Object r12 = r0.M
            pz5.a r14 = pz5.a.f359186d
            int r1 = r0.P
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            java.lang.Object r13 = r0.L
            pi0.l1 r13 = (pi0.l1) r13
            kotlin.ResultKt.throwOnFailure(r12)
            r14 = r13
            goto L98
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            kotlin.ResultKt.throwOnFailure(r12)
            java.lang.Class<f50.y> r12 = f50.y.class
            i95.m r12 = i95.n0.c(r12)
            f50.y r12 = (f50.y) r12
            e50.z0 r12 = (e50.z0) r12
            pi0.q r4 = r12.Ui()
            java.lang.Class<com.tencent.mm.feature.emoji.api.t5> r12 = com.tencent.mm.feature.emoji.api.t5.class
            i95.m r12 = i95.n0.c(r12)
            com.tencent.mm.feature.emoji.api.t5 r12 = (com.tencent.mm.feature.emoji.api.t5) r12
            vr.h r12 = (vr.h) r12
            r12.getClass()
            vr.w r12 = new vr.w
            r12.<init>()
            java.lang.Class<s03.g> r1 = s03.g.class
            i95.m r1 = i95.n0.c(r1)
            s03.g r1 = (s03.g) r1
            r3 = 0
            r03.e r1 = (r03.e) r1
            io.flutter.embedding.engine.plugins.FlutterPlugin r1 = r1.wi(r3)
            pi0.l1 r11 = new pi0.l1
            java.lang.String r5 = "status"
            r3 = 3
            io.flutter.embedding.engine.plugins.FlutterPlugin[] r3 = new io.flutter.embedding.engine.plugins.FlutterPlugin[r3]
            yi4.e r6 = new yi4.e
            r6.<init>()
            r7 = 0
            r3[r7] = r6
            r3[r2] = r1
            r1 = 2
            r3[r1] = r12
            java.util.List r6 = kz5.c0.i(r3)
            r8 = 0
            r9 = 24
            r10 = 0
            r3 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r0.L = r11
            r0.P = r2
            java.lang.String r12 = "StatusPublishPageV2"
            java.lang.Object r12 = r11.o(r12, r13, r0)
            if (r12 != r14) goto L97
            goto L98
        L97:
            r14 = r11
        L98:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: we0.u0.a(we0.u0, java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final com.tencent.mm.flutter.ui.FlutterPageStyle b(we0.u0 u0Var) {
        u0Var.getClass();
        com.tencent.mm.flutter.ui.FlutterPageStyle flutterPageStyle = new com.tencent.mm.flutter.ui.FlutterPageStyle(0, 0, null, false, false, false, null, 0, false, false, false, null, 4095, null);
        flutterPageStyle.f68117d = 0;
        flutterPageStyle.f68120g = false;
        flutterPageStyle.f68118e = 1;
        return flutterPageStyle;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object Bi(java.lang.String r13, java.util.Map r14, kotlin.coroutines.Continuation r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof we0.p0
            if (r0 == 0) goto L13
            r0 = r15
            we0.p0 r0 = (we0.p0) r0
            int r1 = r0.f445150g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f445150g = r1
            goto L18
        L13:
            we0.p0 r0 = new we0.p0
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.f445148e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f445150g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r13 = r0.f445147d
            pi0.l1 r13 = (pi0.l1) r13
            kotlin.ResultKt.throwOnFailure(r15)
            goto L79
        L2b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L33:
            kotlin.ResultKt.throwOnFailure(r15)
            java.lang.Class<f50.y> r15 = f50.y.class
            i95.m r15 = i95.n0.c(r15)
            f50.y r15 = (f50.y) r15
            e50.z0 r15 = (e50.z0) r15
            pi0.q r5 = r15.Ui()
            pi0.l1 r15 = new pi0.l1
            java.lang.String r6 = "status"
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 28
            r11 = 0
            r4 = r15
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            java.lang.String r2 = en1.a.a()
            jz5.l r4 = new jz5.l
            java.lang.String r5 = "user_name"
            r4.<init>(r5, r2)
            jz5.l[] r2 = new jz5.l[]{r4}
            java.util.Map r2 = kz5.c1.l(r2)
            r14.putAll(r2)
            r14.toString()
            r0.f445147d = r15
            r0.f445150g = r3
            java.lang.Object r13 = r15.o(r13, r14, r0)
            if (r13 != r1) goto L78
            return r1
        L78:
            r13 = r15
        L79:
            java.lang.Class<com.tencent.mm.feature.emoji.api.t5> r14 = com.tencent.mm.feature.emoji.api.t5.class
            i95.m r14 = i95.n0.c(r14)
            com.tencent.mm.feature.emoji.api.t5 r14 = (com.tencent.mm.feature.emoji.api.t5) r14
            vr.h r14 = (vr.h) r14
            r14.getClass()
            vr.w r14 = new vr.w
            r14.<init>()
            java.lang.Class<s03.g> r15 = s03.g.class
            i95.m r15 = i95.n0.c(r15)
            s03.g r15 = (s03.g) r15
            r0 = 0
            r03.e r15 = (r03.e) r15
            io.flutter.embedding.engine.plugins.FlutterPlugin r15 = r15.wi(r0)
            r0 = 3
            io.flutter.embedding.engine.plugins.FlutterPlugin[] r0 = new io.flutter.embedding.engine.plugins.FlutterPlugin[r0]
            yi4.e r1 = new yi4.e
            r1.<init>()
            r2 = 0
            r0[r2] = r1
            r0[r3] = r15
            r15 = 2
            r0[r15] = r14
            java.util.List r14 = kz5.c0.i(r0)
            r13.a(r14)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: we0.u0.Bi(java.lang.String, java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public boolean Ni(android.content.Context context, java.lang.String str, java.util.Map pageExtraArguments, java.lang.String activityClassName, com.tencent.mm.flutter.ui.FlutterPageStyle pageStyle) {
        kotlin.jvm.internal.o.g(pageExtraArguments, "pageExtraArguments");
        kotlin.jvm.internal.o.g(activityClassName, "activityClassName");
        kotlin.jvm.internal.o.g(pageStyle, "pageStyle");
        if (context != null) {
            if (!(str == null || str.length() == 0)) {
                kotlinx.coroutines.l.d(this.f445170e, null, null, new we0.s0(this, str, pageExtraArguments, activityClassName, context, pageStyle, null), 3, null);
                return true;
            }
        }
        com.tencent.mars.xlog.Log.i(this.f445169d, "openStatusPage: failed, " + context + ", " + str);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x031a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c(android.content.Context r24, bi4.d1 r25, android.os.ResultReceiver r26, int r27) {
        /*
            Method dump skipped, instructions count: 847
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: we0.u0.c(android.content.Context, bi4.d1, android.os.ResultReceiver, int):boolean");
    }

    public final bw5.bn0 d(pj4.j0 j0Var) {
        bw5.bn0 bn0Var = new bw5.bn0();
        java.lang.String str = j0Var.f355139d;
        if (str == null) {
            str = "";
        }
        bn0Var.f25763d = str;
        boolean[] zArr = bn0Var.f25767h;
        zArr[1] = true;
        java.lang.String str2 = j0Var.f355140e;
        if (str2 == null) {
            str2 = "";
        }
        bn0Var.f25764e = str2;
        zArr[2] = true;
        java.lang.String str3 = j0Var.f355141f;
        if (str3 == null) {
            str3 = "";
        }
        bn0Var.f25765f = str3;
        zArr[3] = true;
        java.lang.String str4 = j0Var.f355142g;
        bn0Var.f25766g = str4 != null ? str4 : "";
        zArr[4] = true;
        return bn0Var;
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountInitialized(context);
    }
}
