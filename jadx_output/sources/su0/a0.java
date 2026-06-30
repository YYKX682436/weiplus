package su0;

/* loaded from: classes5.dex */
public final class a0 implements yu0.f {

    /* renamed from: a, reason: collision with root package name */
    public final pp0.s0 f412622a;

    /* renamed from: b, reason: collision with root package name */
    public final su0.l f412623b;

    /* renamed from: c, reason: collision with root package name */
    public final su0.s f412624c;

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f412625d;

    public a0(pp0.s0 internalService, su0.l subtitleCallback) {
        kotlin.jvm.internal.o.g(internalService, "internalService");
        kotlin.jvm.internal.o.g(subtitleCallback, "subtitleCallback");
        this.f412622a = internalService;
        this.f412623b = subtitleCallback;
        this.f412624c = new su0.s(this);
        this.f412625d = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // yu0.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(yu0.c r27, kotlin.coroutines.Continuation r28) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: su0.a0.a(yu0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // yu0.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(java.lang.String r13, yu0.e r14, kotlin.coroutines.Continuation r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof su0.u
            if (r0 == 0) goto L13
            r0 = r15
            su0.u r0 = (su0.u) r0
            int r1 = r0.f412706i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f412706i = r1
            goto L18
        L13:
            su0.u r0 = new su0.u
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.f412704g
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f412706i
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r13 = r0.f412702e
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r0.f412701d
            su0.a0 r14 = (su0.a0) r14
            kotlin.ResultKt.throwOnFailure(r15)
            goto L93
        L2f:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L37:
            kotlin.ResultKt.throwOnFailure(r15)
            yu0.s r14 = r14.f465787b
            yu0.b r14 = (yu0.b) r14
            com.tencent.maas.speech.MJAsyncSpeechSubmitResponseInfo r15 = r14.f465778a
            if (r15 != 0) goto L52
            java.lang.String r14 = "VideoSubtitleTaskExecutor"
            java.lang.String r15 = "queryGroupResult: responseInfo  == null"
            com.tencent.mars.xlog.Log.e(r14, r15)
            su0.s r14 = r12.f412624c
            r15 = 0
            r14.a(r13, r15)
            java.lang.Boolean r13 = java.lang.Boolean.FALSE
            return r13
        L52:
            r0.f412701d = r12
            r0.f412702e = r13
            r0.f412703f = r14
            r0.f412706i = r3
            oz5.n r15 = new oz5.n
            kotlin.coroutines.Continuation r0 = pz5.f.b(r0)
            r15.<init>(r0)
            com.tencent.maas.speech.MJAsyncSpeechSubmitResponseInfo r0 = r14.f465778a
            java.lang.String r6 = r0.f48543a
            java.lang.String r2 = "getSubmitTaskID(...)"
            kotlin.jvm.internal.o.f(r6, r2)
            long r7 = r14.f465779b
            float r9 = r14.f465780c
            java.lang.String r14 = "getContextBuff(...)"
            java.nio.ByteBuffer r10 = r0.f48546d
            kotlin.jvm.internal.o.f(r10, r14)
            su0.v r11 = new su0.v
            r11.<init>(r15)
            android.os.Handler r14 = r12.f412625d
            su0.x r2 = new su0.x
            r4 = r2
            r5 = r12
            r4.<init>(r5, r6, r7, r9, r10, r11)
            int r0 = r0.f48545c
            long r4 = (long) r0
            r14.postDelayed(r2, r4)
            java.lang.Object r15 = r15.a()
            if (r15 != r1) goto L92
            return r1
        L92:
            r14 = r12
        L93:
            r45.ne4 r15 = (r45.ne4) r15
            su0.s r14 = r14.f412624c
            r14.a(r13, r15)
            if (r15 == 0) goto L9d
            goto L9e
        L9d:
            r3 = 0
        L9e:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r3)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: su0.a0.b(java.lang.String, yu0.e, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // yu0.f
    public void cancel() {
        this.f412625d.removeCallbacksAndMessages(null);
        this.f412624c.onCancel();
    }
}
