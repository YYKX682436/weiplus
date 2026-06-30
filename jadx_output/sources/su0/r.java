package su0;

/* loaded from: classes5.dex */
public final class r implements yu0.f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f412692a;

    /* renamed from: b, reason: collision with root package name */
    public final su0.l f412693b;

    /* renamed from: c, reason: collision with root package name */
    public final su0.k f412694c;

    public r(java.lang.String finderUserName, su0.l subtitleCallback) {
        kotlin.jvm.internal.o.g(finderUserName, "finderUserName");
        kotlin.jvm.internal.o.g(subtitleCallback, "subtitleCallback");
        this.f412692a = finderUserName;
        this.f412693b = subtitleCallback;
        this.f412694c = new su0.k(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // yu0.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(yu0.c r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof su0.q
            if (r0 == 0) goto L13
            r0 = r8
            su0.q r0 = (su0.q) r0
            int r1 = r0.f412691g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f412691g = r1
            goto L18
        L13:
            su0.q r0 = new su0.q
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f412689e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f412691g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r7 = r0.f412688d
            yu0.c r7 = (yu0.c) r7
            kotlin.ResultKt.throwOnFailure(r8)
            goto L64
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r2 = "submitTask: groupID "
            r8.<init>(r2)
            java.lang.String r2 = r7.f465781a
            r8.append(r2)
            java.lang.String r2 = " taskID "
            r8.append(r2)
            java.lang.String r2 = r7.f465782b
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.lang.String r2 = "VideoSubtitleCgiTaskExecutor"
            com.tencent.mars.xlog.Log.i(r2, r8)
            yu0.r r8 = r7.f465783c
            yu0.a r8 = (yu0.a) r8
            r0.f412688d = r7
            r0.f412691g = r3
            java.lang.Object r8 = r6.d(r8, r0)
            if (r8 != r1) goto L64
            return r1
        L64:
            com.tencent.maas.speech.MJAsyncSpeechSubmitResponseInfo r8 = (com.tencent.maas.speech.MJAsyncSpeechSubmitResponseInfo) r8
            yu0.b r0 = new yu0.b
            yu0.r r1 = r7.f465783c
            r2 = r1
            yu0.a r2 = (yu0.a) r2
            long r4 = r2.f465774b
            yu0.a r1 = (yu0.a) r1
            float r1 = r1.f465775c
            r0.<init>(r8, r4, r1)
            yu0.e r1 = new yu0.e
            if (r8 != 0) goto L7b
            goto L7c
        L7b:
            r3 = 0
        L7c:
            r1.<init>(r7, r0, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: su0.r.a(yu0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // yu0.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(java.lang.String r12, yu0.e r13, kotlin.coroutines.Continuation r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof su0.n
            if (r0 == 0) goto L13
            r0 = r14
            su0.n r0 = (su0.n) r0
            int r1 = r0.f412676h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f412676h = r1
            goto L18
        L13:
            su0.n r0 = new su0.n
            r0.<init>(r11, r14)
        L18:
            r8 = r0
            java.lang.Object r14 = r8.f412674f
            pz5.a r0 = pz5.a.f359186d
            int r1 = r8.f412676h
            r9 = 0
            r10 = 1
            if (r1 == 0) goto L39
            if (r1 != r10) goto L31
            java.lang.Object r12 = r8.f412673e
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r8.f412672d
            su0.r r13 = (su0.r) r13
            kotlin.ResultKt.throwOnFailure(r14)
            goto L88
        L31:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L39:
            kotlin.ResultKt.throwOnFailure(r14)
            yu0.s r14 = r13.f465787b
            yu0.b r14 = (yu0.b) r14
            com.tencent.maas.speech.MJAsyncSpeechSubmitResponseInfo r1 = r14.f465778a
            if (r1 != 0) goto L54
            java.lang.String r13 = "VideoSubtitleCgiTaskExecutor"
            java.lang.String r14 = "queryGroupResult: responseInfo  == null"
            com.tencent.mars.xlog.Log.e(r13, r14)
            su0.k r13 = r11.f412694c
            r14 = 0
            r13.a(r12, r14)
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            return r12
        L54:
            java.nio.ByteBuffer r1 = r1.f48546d
            r1.rewind()
            int r2 = r1.remaining()
            byte[] r3 = new byte[r2]
            r1.get(r3)
            com.tencent.mm.protobuf.g r4 = new com.tencent.mm.protobuf.g
            r4.<init>(r3, r9, r2)
            yu0.c r13 = r13.f465786a
            yu0.r r13 = r13.f465783c
            yu0.a r13 = (yu0.a) r13
            java.lang.String r2 = r13.f465773a
            com.tencent.maas.speech.MJAsyncSpeechSubmitResponseInfo r13 = r14.f465778a
            int r13 = r13.f48545c
            long r5 = r14.f465779b
            float r7 = r14.f465780c
            r8.f412672d = r11
            r8.f412673e = r12
            r8.f412676h = r10
            r1 = r11
            r3 = r4
            r4 = r13
            java.lang.Object r14 = r1.e(r2, r3, r4, r5, r7, r8)
            if (r14 != r0) goto L87
            return r0
        L87:
            r13 = r11
        L88:
            r45.ne4 r14 = (r45.ne4) r14
            su0.k r13 = r13.f412694c
            r13.a(r12, r14)
            if (r14 == 0) goto L92
            r9 = r10
        L92:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r9)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: su0.r.b(java.lang.String, yu0.e, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x022e A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v10, types: [kz5.p0] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r28, com.tencent.mm.protobuf.g r29, long r30, float r32, kotlin.coroutines.Continuation r33) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: su0.r.c(java.lang.String, com.tencent.mm.protobuf.g, long, float, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // yu0.f
    public void cancel() {
        this.f412694c.onCancel();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(yu0.a r14, kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: su0.r.d(yu0.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0076 A[PHI: r0
  0x0076: PHI (r0v6 java.lang.Object) = (r0v5 java.lang.Object), (r0v3 java.lang.Object) binds: [B:17:0x0073, B:10:0x0027] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r9, com.tencent.mm.protobuf.g r10, int r11, long r12, float r14, kotlin.coroutines.Continuation r15) {
        /*
            r8 = this;
            boolean r0 = r15 instanceof su0.p
            if (r0 == 0) goto L13
            r0 = r15
            su0.p r0 = (su0.p) r0
            int r1 = r0.f412687n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f412687n = r1
            goto L18
        L13:
            su0.p r0 = new su0.p
            r0.<init>(r8, r15)
        L18:
            r15 = r0
            java.lang.Object r0 = r15.f412685i
            pz5.a r1 = pz5.a.f359186d
            int r2 = r15.f412687n
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            kotlin.ResultKt.throwOnFailure(r0)
            goto L76
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            float r14 = r15.f412684h
            long r12 = r15.f412683g
            java.lang.Object r9 = r15.f412682f
            r10 = r9
            com.tencent.mm.protobuf.g r10 = (com.tencent.mm.protobuf.g) r10
            java.lang.Object r9 = r15.f412681e
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r11 = r15.f412680d
            su0.r r11 = (su0.r) r11
            kotlin.ResultKt.throwOnFailure(r0)
            r7 = r10
            r10 = r9
            r9 = r11
            r11 = r7
            goto L66
        L4c:
            kotlin.ResultKt.throwOnFailure(r0)
            long r5 = (long) r11
            r15.f412680d = r8
            r15.f412681e = r9
            r15.f412682f = r10
            r15.f412683g = r12
            r15.f412684h = r14
            r15.f412687n = r4
            java.lang.Object r11 = kotlinx.coroutines.k1.b(r5, r15)
            if (r11 != r1) goto L63
            return r1
        L63:
            r11 = r10
            r10 = r9
            r9 = r8
        L66:
            r0 = 0
            r15.f412680d = r0
            r15.f412681e = r0
            r15.f412682f = r0
            r15.f412687n = r3
            java.lang.Object r0 = r9.c(r10, r11, r12, r14, r15)
            if (r0 != r1) goto L76
            return r1
        L76:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su0.r.e(java.lang.String, com.tencent.mm.protobuf.g, int, long, float, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
