package qn4;

/* loaded from: classes12.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public boolean f365279a;

    /* renamed from: b, reason: collision with root package name */
    public long f365280b;

    /* renamed from: e, reason: collision with root package name */
    public boolean f365283e;

    /* renamed from: g, reason: collision with root package name */
    public long f365285g;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.Runnable f365288j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.Runnable f365289k;

    /* renamed from: l, reason: collision with root package name */
    public qn4.a f365290l;

    /* renamed from: n, reason: collision with root package name */
    public pn4.q0 f365292n;

    /* renamed from: o, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f365293o;

    /* renamed from: p, reason: collision with root package name */
    public kotlinx.coroutines.r2 f365294p;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f365281c = "";

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f365282d = "";

    /* renamed from: f, reason: collision with root package name */
    public boolean f365284f = true;

    /* renamed from: h, reason: collision with root package name */
    public int f365286h = 1;

    /* renamed from: i, reason: collision with root package name */
    public final android.os.Handler f365287i = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: m, reason: collision with root package name */
    public final y21.h f365291m = new y21.h(false, true, 1, null);

    public t() {
        oz5.i a17 = kotlinx.coroutines.t3.a(null, 1, null);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        this.f365293o = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) a17).plus(kotlinx.coroutines.internal.b0.f310484a));
    }

    public static final void a(qn4.t tVar, float f17, qn4.a aVar) {
        if (tVar.f365283e) {
            ((qn4.w) aVar).getClass();
            com.tencent.mars.xlog.Log.i("TranslationSpeechMenuItem", "onHideLoading");
            qn4.i iVar = qn4.y.f365305d;
            iVar.getClass();
            qn4.v.f365297a.a(new qn4.d(iVar), null);
            tVar.f365283e = false;
        }
        tVar.b();
        if (tVar.f365284f) {
            tVar.f365284f = false;
            ((qn4.w) aVar).getClass();
            com.tencent.mars.xlog.Log.i("TranslationSpeechMenuItem", "onSpeechPlaying");
            qn4.i iVar2 = qn4.y.f365305d;
            iVar2.getClass();
            qn4.v.f365297a.a(new qn4.g(iVar2), new qn4.h(iVar2));
        }
        float e17 = e06.p.e(f17, 0.0f, 1.0f);
        if (e17 >= 1.0f) {
            ((qn4.w) aVar).getClass();
            com.tencent.mars.xlog.Log.i("TranslationSpeechMenuItem", "onSpeechComplete");
            qn4.y.f365302a.f();
            tVar.f365279a = false;
            return;
        }
        ((qn4.w) aVar).getClass();
        qn4.m mVar = qn4.y.f365304c;
        if (mVar.f365259e) {
            qn4.v.f365297a.a(new qn4.l(mVar, e17), null);
        }
    }

    public final void b() {
        java.lang.Runnable runnable = this.f365289k;
        android.os.Handler handler = this.f365287i;
        if (runnable != null) {
            handler.removeCallbacks(runnable);
        }
        java.lang.Runnable runnable2 = this.f365288j;
        if (runnable2 != null) {
            handler.removeCallbacks(runnable2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0029 A[Catch: all -> 0x00ac, TryCatch #0 {all -> 0x00ac, blocks: (B:3:0x0006, B:5:0x000e, B:7:0x00a7, B:16:0x0016, B:18:0x001d, B:23:0x0029, B:24:0x002f, B:27:0x0049, B:29:0x0053, B:30:0x0062, B:34:0x007b, B:37:0x0090, B:38:0x0088, B:39:0x0071), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002f A[Catch: all -> 0x00ac, TRY_LEAVE, TryCatch #0 {all -> 0x00ac, blocks: (B:3:0x0006, B:5:0x000e, B:7:0x00a7, B:16:0x0016, B:18:0x001d, B:23:0x0029, B:24:0x002f, B:27:0x0049, B:29:0x0053, B:30:0x0062, B:34:0x007b, B:37:0x0090, B:38:0x0088, B:39:0x0071), top: B:2:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String c() {
        /*
            r13 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = "TranslationSpeechController"
            java.lang.String r2 = "getSpeechPath: mkdir "
            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> Lac
            gm0.b0 r3 = gm0.j1.u()     // Catch: java.lang.Throwable -> Lac
            if (r3 != 0) goto L16
            java.lang.String r2 = "getSpeechPath: MMKernel.storage() is null"
            com.tencent.mars.xlog.Log.e(r1, r2)     // Catch: java.lang.Throwable -> Lac
        L13:
            r3 = r0
            goto La7
        L16:
            java.lang.String r3 = r3.h()     // Catch: java.lang.Throwable -> Lac
            r4 = 0
            if (r3 == 0) goto L26
            int r5 = r3.length()     // Catch: java.lang.Throwable -> Lac
            if (r5 != 0) goto L24
            goto L26
        L24:
            r5 = r4
            goto L27
        L26:
            r5 = 1
        L27:
            if (r5 == 0) goto L2f
            java.lang.String r2 = "getSpeechPath: getPrivateAccountPath is null or empty"
            com.tencent.mars.xlog.Log.e(r1, r2)     // Catch: java.lang.Throwable -> Lac
            goto L13
        L2f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lac
            r5.<init>()     // Catch: java.lang.Throwable -> Lac
            r5.append(r3)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r3 = "imSpeech"
            r5.append(r3)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> Lac
            com.tencent.mm.vfs.z7 r5 = com.tencent.mm.vfs.z7.a(r3)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r6 = r5.f213279f
            if (r6 == 0) goto L62
            java.lang.String r10 = com.tencent.mm.vfs.e8.l(r6, r4, r4)     // Catch: java.lang.Throwable -> Lac
            boolean r6 = r6.equals(r10)     // Catch: java.lang.Throwable -> Lac
            if (r6 != 0) goto L62
            com.tencent.mm.vfs.z7 r6 = new com.tencent.mm.vfs.z7     // Catch: java.lang.Throwable -> Lac
            java.lang.String r8 = r5.f213277d     // Catch: java.lang.Throwable -> Lac
            java.lang.String r9 = r5.f213278e     // Catch: java.lang.Throwable -> Lac
            java.lang.String r11 = r5.f213280g     // Catch: java.lang.Throwable -> Lac
            java.lang.String r12 = r5.f213281h     // Catch: java.lang.Throwable -> Lac
            r7 = r6
            r7.<init>(r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> Lac
            r5 = r6
        L62:
            com.tencent.mm.vfs.b3 r6 = com.tencent.mm.vfs.a3.f212781a     // Catch: java.lang.Throwable -> Lac
            r7 = 0
            com.tencent.mm.vfs.z2 r6 = r6.m(r5, r7)     // Catch: java.lang.Throwable -> Lac
            boolean r7 = r6.a()     // Catch: java.lang.Throwable -> Lac
            if (r7 != 0) goto L71
            r7 = r4
            goto L79
        L71:
            com.tencent.mm.vfs.q2 r7 = r6.f213266a     // Catch: java.lang.Throwable -> Lac
            java.lang.String r8 = r6.f213267b     // Catch: java.lang.Throwable -> Lac
            boolean r7 = r7.F(r8)     // Catch: java.lang.Throwable -> Lac
        L79:
            if (r7 != 0) goto La7
            com.tencent.mm.vfs.b3 r7 = com.tencent.mm.vfs.a3.f212781a     // Catch: java.lang.Throwable -> Lac
            com.tencent.mm.vfs.z2 r5 = r7.m(r5, r6)     // Catch: java.lang.Throwable -> Lac
            boolean r6 = r5.a()     // Catch: java.lang.Throwable -> Lac
            if (r6 != 0) goto L88
            goto L90
        L88:
            com.tencent.mm.vfs.q2 r4 = r5.f213266a     // Catch: java.lang.Throwable -> Lac
            java.lang.String r5 = r5.f213267b     // Catch: java.lang.Throwable -> Lac
            boolean r4 = r4.r(r5)     // Catch: java.lang.Throwable -> Lac
        L90:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lac
            r5.<init>(r2)     // Catch: java.lang.Throwable -> Lac
            r5.append(r3)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r2 = ", result="
            r5.append(r2)     // Catch: java.lang.Throwable -> Lac
            r5.append(r4)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> Lac
            com.tencent.mars.xlog.Log.i(r1, r2)     // Catch: java.lang.Throwable -> Lac
        La7:
            java.lang.Object r2 = kotlin.Result.m521constructorimpl(r3)     // Catch: java.lang.Throwable -> Lac
            goto Lb7
        Lac:
            r2 = move-exception
            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE
            java.lang.Object r2 = kotlin.ResultKt.createFailure(r2)
            java.lang.Object r2 = kotlin.Result.m521constructorimpl(r2)
        Lb7:
            java.lang.Throwable r3 = kotlin.Result.m524exceptionOrNullimpl(r2)
            if (r3 != 0) goto Lbf
            r0 = r2
            goto Ld4
        Lbf:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "getSpeechPath error: "
            r2.<init>(r4)
            java.lang.String r3 = r3.getMessage()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.mars.xlog.Log.e(r1, r2)
        Ld4:
            java.lang.String r0 = (java.lang.String) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qn4.t.c():java.lang.String");
    }

    public final void d() {
        java.lang.Object m521constructorimpl;
        jz5.f0 f0Var = jz5.f0.f302826a;
        y21.h hVar = this.f365291m;
        com.tencent.mars.xlog.Log.i("TranslationSpeechController", "stopSpeech");
        if (this.f365279a) {
            if (this.f365280b > 0) {
                if (this.f365281c.length() > 0) {
                    if (this.f365282d.length() > 0) {
                        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f365285g;
                        long j17 = this.f365280b;
                        java.lang.String talker = this.f365281c;
                        java.lang.String langCode = this.f365282d;
                        int i17 = this.f365286h;
                        kotlin.jvm.internal.o.g(talker, "talker");
                        kotlin.jvm.internal.o.g(langCode, "langCode");
                        java.util.HashMap hashMap = new java.util.HashMap();
                        hashMap.put("msgid", java.lang.String.valueOf(j17));
                        hashMap.put("chat_username", talker);
                        hashMap.put("translated_language", langCode);
                        hashMap.put("read_aloud_end_type", java.lang.Integer.valueOf(i17));
                        hashMap.put("read_aloud_duration", java.lang.Long.valueOf(currentTimeMillis));
                        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("translate_read_aloud_end", hashMap, 35268);
                    }
                }
            }
            this.f365279a = false;
            b();
            kotlinx.coroutines.r2 r2Var = this.f365294p;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            this.f365294p = null;
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                if (hVar.a()) {
                    y21.h.e(hVar, false, false, 3, null);
                }
                hVar.c(null);
                pn4.q0 q0Var = this.f365292n;
                if (q0Var != null) {
                    q0Var.close();
                }
                this.f365292n = null;
                m521constructorimpl = kotlin.Result.m521constructorimpl(f0Var);
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            }
            java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
            if (m524exceptionOrNullimpl != null) {
                com.tencent.mars.xlog.Log.e("TranslationSpeechController", "Stop speech failed", m524exceptionOrNullimpl);
            }
            try {
                if (this.f365283e) {
                    if (this.f365290l != null) {
                        com.tencent.mars.xlog.Log.i("TranslationSpeechMenuItem", "onHideLoading");
                        qn4.i iVar = qn4.y.f365305d;
                        iVar.getClass();
                        qn4.v.f365297a.a(new qn4.d(iVar), null);
                    }
                    this.f365283e = false;
                }
                kotlin.Result.m521constructorimpl(f0Var);
            } catch (java.lang.Throwable th7) {
                kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th7));
            }
            this.f365290l = null;
        }
    }
}
