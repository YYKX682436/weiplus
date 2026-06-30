package yl2;

/* loaded from: classes3.dex */
public final class g1 {

    /* renamed from: g */
    public static final yl2.j f463007g = new yl2.j(null);

    /* renamed from: a */
    public final com.tencent.mm.ui.MMFragmentActivity f463008a;

    /* renamed from: b */
    public int f463009b;

    /* renamed from: c */
    public long f463010c;

    /* renamed from: d */
    public final int f463011d;

    /* renamed from: e */
    public boolean f463012e;

    /* renamed from: f */
    public final com.tencent.mm.plugin.finder.assist.d9 f463013f;

    public g1(com.tencent.mm.ui.MMFragmentActivity context, int i17, long j17) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f463008a = context;
        this.f463009b = i17;
        this.f463010c = j17;
        this.f463011d = 5000;
        this.f463012e = true;
        this.f463013f = com.tencent.mm.plugin.finder.assist.a9.a(com.tencent.mm.plugin.finder.assist.d9.f102093f, context, context.getResources().getString(com.tencent.mm.R.string.f9y), 500L, null, 8, null);
    }

    public static java.lang.Object e(yl2.g1 g1Var, java.lang.String str, r45.qp1 qp1Var, boolean z17, kotlin.coroutines.Continuation continuation, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            qp1Var = null;
        }
        if ((i17 & 4) != 0) {
            z17 = false;
        }
        g1Var.getClass();
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        com.tencent.mars.xlog.Log.i("Finder.FinderLivePostHelper", "gotoFaceVerify " + str + ", skipIntermediatePage=" + z17);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("LIVE_HELP_TYPE", 1);
        intent.putExtra("FACE_VERIFY_URL", str);
        intent.putExtra("SKIP_INTERMEDIATE_PAGE", z17);
        if (qp1Var != null) {
            intent.putExtra("LIVE_ERROR_PAGE", qp1Var.toByteArray());
        }
        java.lang.Class<?> a17 = jz2.x0.f302754a.a();
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = g1Var.f463008a;
        intent.setClass(mMFragmentActivity, a17);
        ((com.tencent.mm.ui.bd) mMFragmentActivity.startActivityForResult(intent)).f197877a = new yl2.f0(rVar);
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f359186d;
        return j17;
    }

    public static /* synthetic */ java.lang.Object r(yl2.g1 g1Var, int i17, int i18, r45.qp1 qp1Var, kotlin.coroutines.Continuation continuation, int i19, java.lang.Object obj) {
        if ((i19 & 1) != 0) {
            i17 = 2;
        }
        if ((i19 & 4) != 0) {
            qp1Var = null;
        }
        return g1Var.q(i17, i18, qp1Var, continuation);
    }

    public static /* synthetic */ java.lang.Object t(yl2.g1 g1Var, yl2.k kVar, boolean z17, kotlin.coroutines.Continuation continuation, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            kVar = null;
        }
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        return g1Var.s(kVar, z17, continuation);
    }

    public final boolean a() {
        boolean z17;
        boolean a17 = hl2.a.f282099a.a();
        r45.i22 a18 = dk2.ya.f234386a.a();
        boolean z18 = false;
        java.lang.String string = a18 != null ? a18.getString(0) : null;
        if (!(string == null || string.length() == 0)) {
            java.lang.String string2 = a18 != null ? a18.getString(1) : null;
            if (!(string2 == null || string2.length() == 0)) {
                java.lang.String string3 = a18 != null ? a18.getString(2) : null;
                if (!(string3 == null || string3.length() == 0)) {
                    z17 = true;
                    android.content.Intent intent = new android.content.Intent();
                    intent.setComponent(new android.content.ComponentName("cn.cyberIdentity.certification", "cn.wh.project.view.v.authorization.WAuthActivity"));
                    boolean I0 = com.tencent.mm.sdk.platformtools.t8.I0(this.f463008a, intent, false, false);
                    if (a17 && z17 && I0) {
                        z18 = true;
                    }
                    com.tencent.mars.xlog.Log.i("Finder.FinderLivePostHelper", "[CTID] canUseCTIDAuth(PostHelper): switch=" + a17 + ", paramsValid=" + z17 + ", installed=" + I0 + ", result=" + z18);
                    return z18;
                }
            }
        }
        z17 = false;
        android.content.Intent intent2 = new android.content.Intent();
        intent2.setComponent(new android.content.ComponentName("cn.cyberIdentity.certification", "cn.wh.project.view.v.authorization.WAuthActivity"));
        boolean I02 = com.tencent.mm.sdk.platformtools.t8.I0(this.f463008a, intent2, false, false);
        if (a17) {
            z18 = true;
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderLivePostHelper", "[CTID] canUseCTIDAuth(PostHelper): switch=" + a17 + ", paramsValid=" + z17 + ", installed=" + I02 + ", result=" + z18);
        return z18;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(int r12, java.lang.String r13, boolean r14, kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yl2.g1.b(int, java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean c(yl2.k kVar) {
        return (kVar != null && kVar.f463034a == 0) && kVar.f463036c != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x00b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(yl2.k r25) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yl2.g1.d(yl2.k):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r5, int r6, boolean r7, kotlin.coroutines.Continuation r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof yl2.h0
            if (r0 == 0) goto L13
            r0 = r8
            yl2.h0 r0 = (yl2.h0) r0
            int r1 = r0.f463020f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f463020f = r1
            goto L18
        L13:
            yl2.h0 r0 = new yl2.h0
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f463018d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f463020f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.throwOnFailure(r8)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.ResultKt.throwOnFailure(r8)
            r0.f463020f = r3
            java.lang.Object r8 = r4.g(r5, r6, r7, r0)
            if (r8 != r1) goto L3b
            return r1
        L3b:
            jz5.l r8 = (jz5.l) r8
            if (r8 == 0) goto L40
            goto L41
        L40:
            r3 = 0
        L41:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: yl2.g1.f(java.lang.String, int, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0152 A[PHI: r13
  0x0152: PHI (r13v10 java.lang.Object) = (r13v7 java.lang.Object), (r13v1 java.lang.Object) binds: [B:24:0x014f, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0151 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r10, int r11, boolean r12, kotlin.coroutines.Continuation r13) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yl2.g1.g(java.lang.String, int, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void h(android.content.Intent intent, r45.j01 j01Var, boolean z17) {
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.putExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_TYPE", this.f463009b);
        intent.putExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_ID", this.f463010c);
        ((com.tencent.mm.plugin.finder.assist.i0) ((c61.ub) i95.n0.c(c61.ub.class))).Kj(this.f463008a, j01Var, intent, z17);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(yl2.m r7, boolean r8, kotlin.coroutines.Continuation r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof yl2.k0
            if (r0 == 0) goto L13
            r0 = r9
            yl2.k0 r0 = (yl2.k0) r0
            int r1 = r0.f463039f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f463039f = r1
            goto L18
        L13:
            yl2.k0 r0 = new yl2.k0
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f463037d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f463039f
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.ResultKt.throwOnFailure(r9)
            goto L6f
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L86
        L39:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L96
        L3d:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r2 = "handleAuthRequirement: precheckType="
            r9.<init>(r2)
            int r2 = r7.f463044a
            r9.append(r2)
            java.lang.String r2 = ", skipIntermediatePage="
            r9.append(r2)
            r9.append(r8)
            java.lang.String r9 = r9.toString()
            java.lang.String r2 = "Finder.FinderLivePostHelper"
            com.tencent.mars.xlog.Log.i(r2, r9)
            r9 = -1
            int r2 = r7.f463044a
            if (r2 == r9) goto L89
            java.lang.String r7 = r7.f463045b
            if (r2 == r5) goto L7d
            r0.f463039f = r3
            java.lang.Object r9 = r6.f(r7, r2, r8, r0)
            if (r9 != r1) goto L6f
            return r1
        L6f:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r7 = r9.booleanValue()
            if (r7 == 0) goto L7a
            yl2.h r7 = yl2.h.f463014d
            goto Laa
        L7a:
            yl2.h r7 = yl2.h.f463015e
            goto Laa
        L7d:
            r0.f463039f = r4
            java.lang.Object r7 = r6.f(r7, r2, r8, r0)
            if (r7 != r1) goto L86
            return r1
        L86:
            yl2.h r7 = yl2.h.f463016f
            goto Laa
        L89:
            yl2.q r7 = r7.f463046c
            if (r7 == 0) goto La8
            r0.f463039f = r5
            java.lang.Object r9 = r6.l(r7, r8, r0)
            if (r9 != r1) goto L96
            return r1
        L96:
            jz5.l r9 = (jz5.l) r9
            java.lang.Object r7 = r9.f302833d
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto La5
            yl2.h r7 = yl2.h.f463014d
            goto Laa
        La5:
            yl2.h r7 = yl2.h.f463015e
            goto Laa
        La8:
            yl2.h r7 = yl2.h.f463015e
        Laa:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: yl2.g1.i(yl2.m, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000a. Please report as an issue. */
    public final java.lang.Object j(int i17, kotlin.coroutines.Continuation continuation) {
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 != -200018) {
            com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = this.f463008a;
            switch (i17) {
                case -200012:
                    break;
                case -200011:
                    java.lang.Object r17 = r(this, 3, com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NULL, null, continuation, 4, null);
                    return r17 == pz5.a.f359186d ? r17 : f0Var;
                case -200010:
                    db5.t7.makeText(mMFragmentActivity, mMFragmentActivity.getResources().getString(com.tencent.mm.R.string.d4k), 0).show();
                    return f0Var;
                case -200009:
                    db5.t7.makeText(mMFragmentActivity, mMFragmentActivity.getResources().getString(com.tencent.mm.R.string.f491461d53), 0).show();
                    return f0Var;
                default:
                    db5.t7.makeText(mMFragmentActivity, mMFragmentActivity.getResources().getString(com.tencent.mm.R.string.dcd), 0).show();
                    return f0Var;
            }
        }
        java.lang.Object r18 = r(this, 0, com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NULL, null, continuation, 5, null);
        return r18 == pz5.a.f359186d ? r18 : f0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
    
        if (r12 == null) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(r45.qc6 r11, kotlin.coroutines.Continuation r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof yl2.l0
            if (r0 == 0) goto L13
            r0 = r12
            yl2.l0 r0 = (yl2.l0) r0
            int r1 = r0.f463043f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f463043f = r1
            goto L18
        L13:
            yl2.l0 r0 = new yl2.l0
            r0.<init>(r10, r12)
        L18:
            r5 = r0
            java.lang.Object r12 = r5.f463041d
            pz5.a r0 = pz5.a.f359186d
            int r1 = r5.f463043f
            java.lang.String r8 = "Finder.FinderLivePostHelper"
            r9 = 0
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3b
            if (r1 == r3) goto L37
            if (r1 != r2) goto L2f
            kotlin.ResultKt.throwOnFailure(r12)
            goto Lc0
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L37:
            kotlin.ResultKt.throwOnFailure(r12)
            goto L93
        L3b:
            kotlin.ResultKt.throwOnFailure(r12)
            java.lang.String r12 = r11.getString(r3)
            com.tencent.mm.ui.MMFragmentActivity r1 = r10.f463008a
            r4 = 0
            if (r12 == 0) goto L56
            int r6 = r12.length()
            if (r6 <= 0) goto L4f
            r6 = r3
            goto L50
        L4f:
            r6 = r4
        L50:
            if (r6 == 0) goto L53
            goto L54
        L53:
            r12 = r9
        L54:
            if (r12 != 0) goto L5d
        L56:
            r12 = 2131781047(0x7f1065b7, float:1.9193697E38)
            java.lang.String r12 = r1.getString(r12)
        L5d:
            kotlin.jvm.internal.o.d(r12)
            r45.qp1 r6 = new r45.qp1
            r6.<init>()
            r7 = 2131781048(0x7f1065b8, float:1.9193699E38)
            java.lang.String r1 = r1.getString(r7)
            r6.set(r2, r1)
            r6.set(r3, r12)
            java.lang.String r11 = r11.getString(r4)
            if (r11 != 0) goto L7a
            java.lang.String r11 = ""
        L7a:
            int r12 = r11.length()
            if (r12 <= 0) goto L81
            r4 = r3
        L81:
            if (r4 == 0) goto La9
            r4 = 0
            r12 = 4
            r7 = 0
            r5.f463043f = r3
            r1 = r10
            r2 = r11
            r3 = r6
            r6 = r12
            java.lang.Object r12 = e(r1, r2, r3, r4, r5, r6, r7)
            if (r12 != r0) goto L93
            return r0
        L93:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r11 = r12.booleanValue()
            if (r11 != 0) goto La8
            java.lang.String r11 = "#startLive skipRealnameCheck face verify failed"
            com.tencent.mars.xlog.Log.i(r8, r11)
            yl2.x r11 = new yl2.x
            r12 = 10002(0x2712, float:1.4016E-41)
            r11.<init>(r12)
            return r11
        La8:
            return r9
        La9:
            java.lang.String r11 = "#startLive skipRealnameCheck spam_jump_url is empty, show error page"
            com.tencent.mars.xlog.Log.e(r8, r11)
            r11 = 0
            r3 = 10002(0x2712, float:1.4016E-41)
            r12 = 1
            r7 = 0
            r5.f463043f = r2
            r1 = r10
            r2 = r11
            r4 = r6
            r6 = r12
            java.lang.Object r12 = r(r1, r2, r3, r4, r5, r6, r7)
            if (r12 != r0) goto Lc0
            return r0
        Lc0:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: yl2.g1.k(r45.qc6, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(yl2.s r17, boolean r18, kotlin.coroutines.Continuation r19) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yl2.g1.l(yl2.s, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(kotlin.coroutines.Continuation r13) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yl2.g1.m(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(kotlin.coroutines.Continuation r26) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yl2.g1.n(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final java.lang.Object o(yl2.k kVar, kotlin.coroutines.Continuation continuation) {
        java.lang.String str;
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        java.lang.String str2 = kVar != null ? kVar.f463035b : null;
        boolean z17 = str2 == null || str2.length() == 0;
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = this.f463008a;
        if (z17) {
            str = mMFragmentActivity.getResources().getString(com.tencent.mm.R.string.e5_);
        } else if (kVar == null || (str = kVar.f463035b) == null) {
            str = "";
        }
        kotlin.jvm.internal.o.d(str);
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(mMFragmentActivity);
        u1Var.g(str);
        u1Var.m(com.tencent.mm.R.string.f490454vi);
        u1Var.a(true);
        u1Var.e(new yl2.u0(rVar));
        u1Var.q(false);
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f359186d;
        return j17;
    }

    public final java.lang.Object p(kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        v65.n nVar = new v65.n(rVar);
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = this.f463008a;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) mMFragmentActivity, 1, true);
        k0Var.q(mMFragmentActivity.getString(com.tencent.mm.R.string.oyi), 17);
        k0Var.f211872n = new yl2.v0(1, this, 2);
        k0Var.f211881s = new yl2.w0(1, nVar, 2);
        k0Var.f211854d = new yl2.x0(nVar);
        k0Var.v();
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f359186d;
        return j17;
    }

    public final java.lang.Object q(int i17, int i18, r45.qp1 qp1Var, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        com.tencent.mars.xlog.Log.i("Finder.FinderLivePostHelper", "showErrPage type:" + i17 + ", errCode:" + i18);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("LIVE_HELP_TYPE", i17);
        if (qp1Var != null) {
            intent.putExtra("LIVE_ERROR_PAGE", qp1Var.toByteArray());
        }
        java.lang.Class<?> a17 = jz2.x0.f302754a.a();
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = this.f463008a;
        intent.setClass(mMFragmentActivity, a17);
        ((com.tencent.mm.ui.bd) mMFragmentActivity.startActivityForResult(intent)).f197877a = new yl2.c1(rVar, i18);
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f359186d;
        return j17;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0038. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x06e1  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x073a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0749 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x073c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0617 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0a03  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0a23  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0a30  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0a47  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0a89  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x06ee  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0a8b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0a51  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0a3a  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x08f2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x091d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0925  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0969  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0809  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0886  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0766  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x07a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(yl2.k r40, boolean r41, kotlin.coroutines.Continuation r42) {
        /*
            Method dump skipped, instructions count: 2816
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yl2.g1.s(yl2.k, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(yl2.p r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof yl2.f1
            if (r0 == 0) goto L13
            r0 = r6
            yl2.f1 r0 = (yl2.f1) r0
            int r1 = r0.f463000f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f463000f = r1
            goto L18
        L13:
            yl2.f1 r0 = new yl2.f1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f462998d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f463000f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.throwOnFailure(r6)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.ResultKt.throwOnFailure(r6)
            int r5 = r5.f463055a
            r0.f463000f = r3
            java.lang.Object r5 = r4.j(r5, r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            yl2.x r5 = new yl2.x
            r6 = 10003(0x2713, float:1.4017E-41)
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: yl2.g1.u(yl2.p, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public /* synthetic */ g1(com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity, int i17, long j17, int i18, kotlin.jvm.internal.i iVar) {
        this(mMFragmentActivity, (i18 & 2) != 0 ? 0 : i17, (i18 & 4) != 0 ? java.lang.System.currentTimeMillis() : j17);
    }
}
