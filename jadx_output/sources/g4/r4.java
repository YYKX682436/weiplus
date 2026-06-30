package g4;

/* loaded from: classes14.dex */
public final class r4 {

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.sync.d f268540a;

    /* renamed from: b, reason: collision with root package name */
    public kotlinx.coroutines.r2 f268541b;

    /* renamed from: c, reason: collision with root package name */
    public int f268542c;

    /* renamed from: d, reason: collision with root package name */
    public final g4.u4 f268543d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f268544e;

    public r4(g4.u4 singleRunner, boolean z17) {
        kotlin.jvm.internal.o.g(singleRunner, "singleRunner");
        this.f268543d = singleRunner;
        this.f268544e = z17;
        this.f268540a = kotlinx.coroutines.sync.l.a(false, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0059 A[Catch: all -> 0x0063, TRY_LEAVE, TryCatch #0 {all -> 0x0063, blocks: (B:11:0x0055, B:13:0x0059), top: B:10:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r6v6, types: [kotlinx.coroutines.sync.d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlinx.coroutines.r2 r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof g4.p4
            if (r0 == 0) goto L13
            r0 = r7
            g4.p4 r0 = (g4.p4) r0
            int r1 = r0.f268492e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f268492e = r1
            goto L18
        L13:
            g4.p4 r0 = new g4.p4
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f268491d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f268492e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r6 = r0.f268496i
            kotlinx.coroutines.sync.d r6 = (kotlinx.coroutines.sync.d) r6
            java.lang.Object r1 = r0.f268495h
            kotlinx.coroutines.r2 r1 = (kotlinx.coroutines.r2) r1
            java.lang.Object r0 = r0.f268494g
            g4.r4 r0 = (g4.r4) r0
            kotlin.ResultKt.throwOnFailure(r7)
            r7 = r6
            r6 = r1
            goto L55
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3e:
            kotlin.ResultKt.throwOnFailure(r7)
            kotlinx.coroutines.sync.d r7 = r5.f268540a
            r0.f268494g = r5
            r0.f268495h = r6
            r0.f268496i = r7
            r0.f268492e = r3
            kotlinx.coroutines.sync.k r7 = (kotlinx.coroutines.sync.k) r7
            java.lang.Object r0 = r7.b(r4, r0)
            if (r0 != r1) goto L54
            return r1
        L54:
            r0 = r5
        L55:
            kotlinx.coroutines.r2 r1 = r0.f268541b     // Catch: java.lang.Throwable -> L63
            if (r6 != r1) goto L5b
            r0.f268541b = r4     // Catch: java.lang.Throwable -> L63
        L5b:
            kotlinx.coroutines.sync.k r7 = (kotlinx.coroutines.sync.k) r7
            r7.d(r4)
            jz5.f0 r6 = jz5.f0.f302826a
            return r6
        L63:
            r6 = move-exception
            kotlinx.coroutines.sync.k r7 = (kotlinx.coroutines.sync.k) r7
            r7.d(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.r4.a(kotlinx.coroutines.r2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x008b, code lost:
    
        r12.b(new g4.o4(r6.f268543d));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0097 A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:12:0x0035, B:14:0x00ac, B:15:0x00b0, B:23:0x0072, B:25:0x0076, B:27:0x007c, B:30:0x0082, B:35:0x008b, B:37:0x0097), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlinx.coroutines.r2] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(int r10, kotlinx.coroutines.r2 r11, kotlin.coroutines.Continuation r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof g4.q4
            if (r0 == 0) goto L13
            r0 = r12
            g4.q4 r0 = (g4.q4) r0
            int r1 = r0.f268523e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f268523e = r1
            goto L18
        L13:
            g4.q4 r0 = new g4.q4
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.f268522d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f268523e
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L57
            if (r2 == r5) goto L45
            if (r2 != r3) goto L3d
            int r10 = r0.f268528m
            java.lang.Object r11 = r0.f268527i
            kotlinx.coroutines.sync.d r11 = (kotlinx.coroutines.sync.d) r11
            java.lang.Object r1 = r0.f268526h
            kotlinx.coroutines.r2 r1 = (kotlinx.coroutines.r2) r1
            java.lang.Object r0 = r0.f268525g
            g4.r4 r0 = (g4.r4) r0
            kotlin.ResultKt.throwOnFailure(r12)     // Catch: java.lang.Throwable -> L3a
            goto Laa
        L3a:
            r10 = move-exception
            goto Lba
        L3d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L45:
            int r10 = r0.f268528m
            java.lang.Object r11 = r0.f268527i
            kotlinx.coroutines.sync.d r11 = (kotlinx.coroutines.sync.d) r11
            java.lang.Object r2 = r0.f268526h
            kotlinx.coroutines.r2 r2 = (kotlinx.coroutines.r2) r2
            java.lang.Object r6 = r0.f268525g
            g4.r4 r6 = (g4.r4) r6
            kotlin.ResultKt.throwOnFailure(r12)
            goto L72
        L57:
            kotlin.ResultKt.throwOnFailure(r12)
            kotlinx.coroutines.sync.d r12 = r9.f268540a
            r0.f268525g = r9
            r0.f268526h = r11
            r0.f268527i = r12
            r0.f268528m = r10
            r0.f268523e = r5
            kotlinx.coroutines.sync.k r12 = (kotlinx.coroutines.sync.k) r12
            java.lang.Object r2 = r12.b(r4, r0)
            if (r2 != r1) goto L6f
            return r1
        L6f:
            r6 = r9
            r2 = r11
            r11 = r12
        L72:
            kotlinx.coroutines.r2 r12 = r6.f268541b     // Catch: java.lang.Throwable -> L3a
            if (r12 == 0) goto L89
            boolean r7 = r12.a()     // Catch: java.lang.Throwable -> L3a
            if (r7 == 0) goto L89
            int r7 = r6.f268542c     // Catch: java.lang.Throwable -> L3a
            if (r7 < r10) goto L89
            if (r7 != r10) goto L87
            boolean r7 = r6.f268544e     // Catch: java.lang.Throwable -> L3a
            if (r7 == 0) goto L87
            goto L89
        L87:
            r5 = 0
            goto Lb0
        L89:
            if (r12 == 0) goto L95
            g4.o4 r7 = new g4.o4     // Catch: java.lang.Throwable -> L3a
            g4.u4 r8 = r6.f268543d     // Catch: java.lang.Throwable -> L3a
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L3a
            r12.b(r7)     // Catch: java.lang.Throwable -> L3a
        L95:
            if (r12 == 0) goto Lac
            r0.f268525g = r6     // Catch: java.lang.Throwable -> L3a
            r0.f268526h = r2     // Catch: java.lang.Throwable -> L3a
            r0.f268527i = r11     // Catch: java.lang.Throwable -> L3a
            r0.f268528m = r10     // Catch: java.lang.Throwable -> L3a
            r0.f268523e = r3     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r12 = r12.C(r0)     // Catch: java.lang.Throwable -> L3a
            if (r12 != r1) goto La8
            return r1
        La8:
            r1 = r2
            r0 = r6
        Laa:
            r6 = r0
            r2 = r1
        Lac:
            r6.f268541b = r2     // Catch: java.lang.Throwable -> L3a
            r6.f268542c = r10     // Catch: java.lang.Throwable -> L3a
        Lb0:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L3a
            kotlinx.coroutines.sync.k r11 = (kotlinx.coroutines.sync.k) r11
            r11.d(r4)
            return r10
        Lba:
            kotlinx.coroutines.sync.k r11 = (kotlinx.coroutines.sync.k) r11
            r11.d(r4)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.r4.b(int, kotlinx.coroutines.r2, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
