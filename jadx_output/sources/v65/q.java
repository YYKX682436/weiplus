package v65;

/* loaded from: classes5.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f433586d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f433587e;

    /* renamed from: f, reason: collision with root package name */
    public int f433588f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u26.w f433589g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(u26.w wVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f433589g = wVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new v65.q(this.f433589g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((v65.q) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055 A[Catch: all -> 0x0075, TRY_LEAVE, TryCatch #0 {all -> 0x0075, blocks: (B:16:0x004d, B:18:0x0055), top: B:15:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x006a -> B:10:0x0039). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r7.f433588f
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2f
            if (r1 == r3) goto L21
            if (r1 != r2) goto L19
            java.lang.Object r1 = r7.f433587e
            u26.y r1 = (u26.y) r1
            java.lang.Object r4 = r7.f433586d
            u26.t0 r4 = (u26.t0) r4
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L78
            r8 = r1
            goto L38
        L19:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L21:
            java.lang.Object r1 = r7.f433587e
            u26.y r1 = (u26.y) r1
            java.lang.Object r4 = r7.f433586d
            u26.t0 r4 = (u26.t0) r4
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L78
            r5 = r4
            r4 = r7
            goto L4d
        L2f:
            kotlin.ResultKt.throwOnFailure(r8)
            u26.w r4 = r7.f433589g
            u26.y r8 = r4.iterator()     // Catch: java.lang.Throwable -> L78
        L38:
            r1 = r7
        L39:
            r1.f433586d = r4     // Catch: java.lang.Throwable -> L78
            r1.f433587e = r8     // Catch: java.lang.Throwable -> L78
            r1.f433588f = r3     // Catch: java.lang.Throwable -> L78
            u26.a r8 = (u26.a) r8     // Catch: java.lang.Throwable -> L78
            java.lang.Object r5 = r8.a(r1)     // Catch: java.lang.Throwable -> L78
            if (r5 != r0) goto L48
            return r0
        L48:
            r6 = r1
            r1 = r8
            r8 = r5
            r5 = r4
            r4 = r6
        L4d:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L75
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L75
            if (r8 == 0) goto L6e
            u26.a r1 = (u26.a) r1     // Catch: java.lang.Throwable -> L75
            java.lang.Object r8 = r1.b()     // Catch: java.lang.Throwable -> L75
            kotlinx.coroutines.r2 r8 = (kotlinx.coroutines.r2) r8     // Catch: java.lang.Throwable -> L75
            r4.f433586d = r5     // Catch: java.lang.Throwable -> L75
            r4.f433587e = r1     // Catch: java.lang.Throwable -> L75
            r4.f433588f = r2     // Catch: java.lang.Throwable -> L75
            java.lang.Object r8 = r8.C(r4)     // Catch: java.lang.Throwable -> L75
            if (r8 != r0) goto L6a
            return r0
        L6a:
            r8 = r1
            r1 = r4
            r4 = r5
            goto L39
        L6e:
            r8 = 0
            u26.d0.a(r5, r8)
            jz5.f0 r8 = jz5.f0.f302826a
            return r8
        L75:
            r8 = move-exception
            r4 = r5
            goto L79
        L78:
            r8 = move-exception
        L79:
            throw r8     // Catch: java.lang.Throwable -> L7a
        L7a:
            r0 = move-exception
            u26.d0.a(r4, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v65.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
