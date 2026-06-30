package my0;

/* loaded from: classes5.dex */
public final class e extends ly0.n {

    /* renamed from: m, reason: collision with root package name */
    public final byte[] f332656m;

    /* renamed from: n, reason: collision with root package name */
    public final int f332657n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.util.List cndUrls, byte[] bArr, int i17, s26.a aVar, yz5.l rawCompletionCallback, kotlin.jvm.internal.i iVar) {
        super(ly0.p.f322228d, cndUrls, aVar, rawCompletionCallback, null);
        kotlin.jvm.internal.o.g(cndUrls, "cndUrls");
        kotlin.jvm.internal.o.g(rawCompletionCallback, "rawCompletionCallback");
        this.f332656m = bArr;
        this.f332657n = i17;
    }

    @Override // ly0.n
    public void c() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
    
        if (r7 == true) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // ly0.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(java.lang.String r6, ly0.d r7, kotlin.coroutines.Continuation r8) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: my0.e.e(java.lang.String, ly0.d, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // ly0.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(java.util.List r7, kotlin.coroutines.Continuation r8) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: my0.e.g(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(1:24))|11|12|(1:17)(2:14|15)))|27|6|7|(0)(0)|11|12|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008d, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008e, code lost:
    
        r11 = kotlin.Result.INSTANCE;
        r10 = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(r10));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.String r10, byte[] r11, int r12, kotlin.coroutines.Continuation r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof my0.b
            if (r0 == 0) goto L13
            r0 = r13
            my0.b r0 = (my0.b) r0
            int r1 = r0.f332649f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f332649f = r1
            goto L18
        L13:
            my0.b r0 = new my0.b
            r0.<init>(r9, r13)
        L18:
            r5 = r0
            java.lang.Object r13 = r5.f332647d
            pz5.a r0 = pz5.a.f359186d
            int r1 = r5.f332649f
            r2 = 1
            r8 = 0
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            kotlin.ResultKt.throwOnFailure(r13)     // Catch: java.lang.Throwable -> L8d
            goto L86
        L29:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L31:
            kotlin.ResultKt.throwOnFailure(r13)
            kotlin.Result$Companion r13 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L8d
            com.tencent.mm.modelbase.i r1 = new com.tencent.mm.modelbase.i     // Catch: java.lang.Throwable -> L8d
            r1.<init>()     // Catch: java.lang.Throwable -> L8d
            com.tencent.mm.modelbase.l r13 = new com.tencent.mm.modelbase.l     // Catch: java.lang.Throwable -> L8d
            r13.<init>()     // Catch: java.lang.Throwable -> L8d
            r45.ys0 r3 = new r45.ys0     // Catch: java.lang.Throwable -> L8d
            r3.<init>()     // Catch: java.lang.Throwable -> L8d
            r4 = 2
            r3.set(r4, r10)     // Catch: java.lang.Throwable -> L8d
            com.tencent.mm.protobuf.g r10 = new com.tencent.mm.protobuf.g     // Catch: java.lang.Throwable -> L8d
            int r4 = r11.length     // Catch: java.lang.Throwable -> L8d
            r10.<init>(r11, r8, r4)     // Catch: java.lang.Throwable -> L8d
            r11 = 4
            r3.set(r11, r10)     // Catch: java.lang.Throwable -> L8d
            java.lang.Integer r10 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> L8d
            r11 = 5
            r3.set(r11, r10)     // Catch: java.lang.Throwable -> L8d
            r13.f70664a = r3     // Catch: java.lang.Throwable -> L8d
            r45.zs0 r10 = new r45.zs0     // Catch: java.lang.Throwable -> L8d
            r10.<init>()     // Catch: java.lang.Throwable -> L8d
            r13.f70665b = r10     // Catch: java.lang.Throwable -> L8d
            r10 = 15438(0x3c4e, float:2.1633E-41)
            r13.f70667d = r10     // Catch: java.lang.Throwable -> L8d
            java.lang.String r10 = "/cgi-bin/micromsg-bin/finderaimediagenerate"
            r13.f70666c = r10     // Catch: java.lang.Throwable -> L8d
            r13.f70668e = r8     // Catch: java.lang.Throwable -> L8d
            r13.f70669f = r8     // Catch: java.lang.Throwable -> L8d
            com.tencent.mm.modelbase.o r10 = r13.a()     // Catch: java.lang.Throwable -> L8d
            r1.p(r10)     // Catch: java.lang.Throwable -> L8d
            r10 = 0
            r4 = 0
            r6 = 3
            r7 = 0
            r5.f332649f = r2     // Catch: java.lang.Throwable -> L8d
            r2 = r10
            java.lang.Object r13 = rm0.h.a(r1, r2, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L8d
            if (r13 != r0) goto L86
            return r0
        L86:
            r45.zs0 r13 = (r45.zs0) r13     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r10 = kotlin.Result.m521constructorimpl(r13)     // Catch: java.lang.Throwable -> L8d
            goto L98
        L8d:
            r10 = move-exception
            kotlin.Result$Companion r11 = kotlin.Result.INSTANCE
            java.lang.Object r10 = kotlin.ResultKt.createFailure(r10)
            java.lang.Object r10 = kotlin.Result.m521constructorimpl(r10)
        L98:
            java.lang.Throwable r11 = kotlin.Result.m524exceptionOrNullimpl(r10)
            if (r11 != 0) goto L9f
            goto La9
        L9f:
            java.lang.String r10 = "requestAIMediaGenerate cgi error"
            java.lang.Object[] r12 = new java.lang.Object[r8]
            java.lang.String r13 = "MicroMsg.AIGC.AIMGFinderSinglePollingTask"
            com.tencent.mars.xlog.Log.printErrStackTrace(r13, r11, r10, r12)
            r10 = 0
        La9:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: my0.e.h(java.lang.String, byte[], int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(1:24))|11|12|(1:17)(2:14|15)))|27|6|7|(0)(0)|11|12|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007b, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007c, code lost:
    
        r11 = kotlin.Result.INSTANCE;
        r10 = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(r10));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.String r10, kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof my0.d
            if (r0 == 0) goto L13
            r0 = r11
            my0.d r0 = (my0.d) r0
            int r1 = r0.f332655f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f332655f = r1
            goto L18
        L13:
            my0.d r0 = new my0.d
            r0.<init>(r9, r11)
        L18:
            r5 = r0
            java.lang.Object r11 = r5.f332653d
            pz5.a r0 = pz5.a.f359186d
            int r1 = r5.f332655f
            r2 = 1
            r8 = 0
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            kotlin.ResultKt.throwOnFailure(r11)     // Catch: java.lang.Throwable -> L7b
            goto L74
        L29:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L31:
            kotlin.ResultKt.throwOnFailure(r11)
            kotlin.Result$Companion r11 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L7b
            com.tencent.mm.modelbase.i r1 = new com.tencent.mm.modelbase.i     // Catch: java.lang.Throwable -> L7b
            r1.<init>()     // Catch: java.lang.Throwable -> L7b
            com.tencent.mm.modelbase.l r11 = new com.tencent.mm.modelbase.l     // Catch: java.lang.Throwable -> L7b
            r11.<init>()     // Catch: java.lang.Throwable -> L7b
            r45.o41 r3 = new r45.o41     // Catch: java.lang.Throwable -> L7b
            r3.<init>()     // Catch: java.lang.Throwable -> L7b
            r4 = 2
            r3.set(r4, r10)     // Catch: java.lang.Throwable -> L7b
            r11.f70664a = r3     // Catch: java.lang.Throwable -> L7b
            r45.p41 r10 = new r45.p41     // Catch: java.lang.Throwable -> L7b
            r10.<init>()     // Catch: java.lang.Throwable -> L7b
            r11.f70665b = r10     // Catch: java.lang.Throwable -> L7b
            r10 = 20628(0x5094, float:2.8906E-41)
            r11.f70667d = r10     // Catch: java.lang.Throwable -> L7b
            java.lang.String r10 = "/cgi-bin/micromsg-bin/findergetaimediaresult"
            r11.f70666c = r10     // Catch: java.lang.Throwable -> L7b
            r11.f70668e = r8     // Catch: java.lang.Throwable -> L7b
            r11.f70669f = r8     // Catch: java.lang.Throwable -> L7b
            com.tencent.mm.modelbase.o r10 = r11.a()     // Catch: java.lang.Throwable -> L7b
            r1.p(r10)     // Catch: java.lang.Throwable -> L7b
            r10 = 0
            r4 = 0
            r6 = 3
            r7 = 0
            r5.f332655f = r2     // Catch: java.lang.Throwable -> L7b
            r2 = r10
            java.lang.Object r11 = rm0.h.a(r1, r2, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L7b
            if (r11 != r0) goto L74
            return r0
        L74:
            r45.p41 r11 = (r45.p41) r11     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r10 = kotlin.Result.m521constructorimpl(r11)     // Catch: java.lang.Throwable -> L7b
            goto L86
        L7b:
            r10 = move-exception
            kotlin.Result$Companion r11 = kotlin.Result.INSTANCE
            java.lang.Object r10 = kotlin.ResultKt.createFailure(r10)
            java.lang.Object r10 = kotlin.Result.m521constructorimpl(r10)
        L86:
            java.lang.Throwable r11 = kotlin.Result.m524exceptionOrNullimpl(r10)
            if (r11 != 0) goto L8d
            goto L97
        L8d:
            java.lang.String r10 = "FinderGetAIMediaResult cgi error"
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.String r1 = "MicroMsg.AIGC.AIMGFinderSinglePollingTask"
            com.tencent.mars.xlog.Log.printErrStackTrace(r1, r11, r10, r0)
            r10 = 0
        L97:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: my0.e.i(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
