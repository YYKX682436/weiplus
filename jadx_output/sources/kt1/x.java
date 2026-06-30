package kt1;

/* loaded from: classes4.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f311964d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u26.w f311965e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(u26.w wVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f311965e = wVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new kt1.x(this.f311965e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((kt1.x) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(2:23|(1:(1:26)(2:27|28))(5:29|30|11|12|(1:14)(4:15|5|6|(1:8)(4:10|11|12|(0)(0)))))(1:3)|4|5|6|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        r7 = r0;
        r0 = r9;
        r9 = r1;
        r1 = r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0046 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0037 A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r8.f311964d
            java.lang.String r2 = "MicroMsg.ReliableSync.Service"
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L24
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L20
            goto L2c
        L12:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1a:
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L20
            r1 = r0
            r0 = r8
            goto L3c
        L20:
            r9 = move-exception
            r1 = r0
            r0 = r8
            goto L4e
        L24:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.String r9 = "ReliableSync channel start receive"
            com.tencent.mars.xlog.Log.i(r2, r9)
        L2c:
            r9 = r8
        L2d:
            u26.w r1 = r9.f311965e     // Catch: java.lang.Throwable -> L49
            r9.f311964d = r4     // Catch: java.lang.Throwable -> L49
            java.lang.Object r1 = r1.r(r9)     // Catch: java.lang.Throwable -> L49
            if (r1 != r0) goto L38
            return r0
        L38:
            r7 = r0
            r0 = r9
            r9 = r1
            r1 = r7
        L3c:
            kt1.h0 r9 = (kt1.h0) r9     // Catch: java.lang.Throwable -> L47
            r0.f311964d = r3     // Catch: java.lang.Throwable -> L47
            java.lang.Object r9 = r9.a(r0)     // Catch: java.lang.Throwable -> L47
            if (r9 != r1) goto L57
            return r1
        L47:
            r9 = move-exception
            goto L4e
        L49:
            r1 = move-exception
            r7 = r0
            r0 = r9
            r9 = r1
            r1 = r7
        L4e:
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "taskChannel receive err"
            com.tencent.mars.xlog.Log.printErrStackTrace(r2, r9, r6, r5)
        L57:
            r9 = r0
            r0 = r1
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: kt1.x.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
