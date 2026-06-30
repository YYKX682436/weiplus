package gu0;

/* loaded from: classes5.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f275628d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gu0.k2 f275629e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f275630f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(gu0.k2 k2Var, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f275629e = k2Var;
        this.f275630f = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gu0.b0(this.f275629e, this.f275630f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gu0.b0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0085 A[Catch: Exception -> 0x0031, TRY_LEAVE, TryCatch #0 {Exception -> 0x0031, blocks: (B:7:0x0015, B:8:0x007e, B:10:0x0085, B:14:0x0019, B:15:0x0074, B:18:0x001d, B:19:0x006a, B:22:0x0021, B:23:0x0060, B:26:0x0025, B:27:0x0056, B:30:0x0029, B:31:0x004a, B:34:0x002d, B:35:0x0040, B:39:0x0037), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0049 A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r5.f275628d
            yz5.l r2 = r5.f275630f
            java.lang.String r3 = "MJCC.Session"
            gu0.k2 r4 = r5.f275629e
            switch(r1) {
                case 0: goto L33;
                case 1: goto L2d;
                case 2: goto L29;
                case 3: goto L25;
                case 4: goto L21;
                case 5: goto L1d;
                case 6: goto L19;
                case 7: goto L15;
                default: goto Ld;
            }
        Ld:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L15:
            kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.lang.Exception -> L31
            goto L7e
        L19:
            kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.lang.Exception -> L31
            goto L74
        L1d:
            kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.lang.Exception -> L31
            goto L6a
        L21:
            kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.lang.Exception -> L31
            goto L60
        L25:
            kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.lang.Exception -> L31
            goto L56
        L29:
            kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.lang.Exception -> L31
            goto L4a
        L2d:
            kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.lang.Exception -> L31
            goto L40
        L31:
            r6 = move-exception
            goto L8a
        L33:
            kotlin.ResultKt.throwOnFailure(r6)
            r6 = 1
            r5.f275628d = r6     // Catch: java.lang.Exception -> L31
            java.lang.Object r6 = gu0.k2.c(r4, r5)     // Catch: java.lang.Exception -> L31
            if (r6 != r0) goto L40
            return r0
        L40:
            r6 = 2
            r5.f275628d = r6     // Catch: java.lang.Exception -> L31
            java.lang.Object r6 = gu0.k2.k(r4, r5)     // Catch: java.lang.Exception -> L31
            if (r6 != r0) goto L4a
            return r0
        L4a:
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L31
            r1 = 3
            r5.f275628d = r1     // Catch: java.lang.Exception -> L31
            java.lang.Object r6 = gu0.k2.g(r4, r6, r5)     // Catch: java.lang.Exception -> L31
            if (r6 != r0) goto L56
            return r0
        L56:
            r6 = 4
            r5.f275628d = r6     // Catch: java.lang.Exception -> L31
            java.lang.Object r6 = gu0.k2.i(r4, r5)     // Catch: java.lang.Exception -> L31
            if (r6 != r0) goto L60
            return r0
        L60:
            r6 = 5
            r5.f275628d = r6     // Catch: java.lang.Exception -> L31
            java.lang.Object r6 = gu0.k2.d(r4, r5)     // Catch: java.lang.Exception -> L31
            if (r6 != r0) goto L6a
            return r0
        L6a:
            r6 = 6
            r5.f275628d = r6     // Catch: java.lang.Exception -> L31
            java.lang.Object r6 = gu0.k2.f(r4, r5)     // Catch: java.lang.Exception -> L31
            if (r6 != r0) goto L74
            return r0
        L74:
            r6 = 7
            r5.f275628d = r6     // Catch: java.lang.Exception -> L31
            java.lang.Object r6 = r4.v(r5)     // Catch: java.lang.Exception -> L31
            if (r6 != r0) goto L7e
            return r0
        L7e:
            java.lang.String r6 = "applyEditResult: timeline rebuilt and playback started"
            com.tencent.mars.xlog.Log.i(r3, r6)     // Catch: java.lang.Exception -> L31
            if (r2 == 0) goto Lb6
            r6 = 0
            r2.invoke(r6)     // Catch: java.lang.Exception -> L31
            goto Lb6
        L8a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "applyEditResult: exception: "
            r0.<init>(r1)
            java.lang.String r1 = r6.getMessage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.mars.xlog.Log.e(r3, r0)
            if (r2 == 0) goto Lb6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Exception: "
            r0.<init>(r1)
            java.lang.String r6 = r6.getMessage()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r2.invoke(r6)
        Lb6:
            jz5.f0 r6 = jz5.f0.f302826a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: gu0.b0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
