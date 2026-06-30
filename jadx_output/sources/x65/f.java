package x65;

/* loaded from: classes12.dex */
public final class f extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public int f452355d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w65.m f452356e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(w65.m mVar, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f452356e = mVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new x65.f(this.f452356e, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return ((x65.f) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x007d A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r8.f452355d
            jz5.f0 r2 = jz5.f0.f302826a
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            w65.m r7 = r8.f452356e
            if (r1 == 0) goto L28
            if (r1 == r6) goto L24
            if (r1 == r5) goto L20
            if (r1 != r4) goto L18
            kotlin.ResultKt.throwOnFailure(r9)
            goto L75
        L18:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L20:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L59
        L24:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L3e
        L28:
            kotlin.ResultKt.throwOnFailure(r9)
            r9 = r7
            w65.g r9 = (w65.g) r9
            r9.j()
            r8.f452355d = r6
            r9.getClass()
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r3)
            if (r9 != r0) goto L3e
            return r0
        L3e:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            if (r9 >= 0) goto L47
            return r2
        L47:
            r7.f1()
            r9 = r7
            w65.g r9 = (w65.g) r9
            r9.m()
            r8.f452355d = r5
            java.lang.Object r9 = r7.c(r8)
            if (r9 != r0) goto L59
            return r0
        L59:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            if (r9 >= 0) goto L62
            return r2
        L62:
            r7.f1()
            r9 = r7
            w65.g r9 = (w65.g) r9
            r9.i()
            r8.f452355d = r4
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r3)
            if (r9 != r0) goto L75
            return r0
        L75:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            if (r9 >= 0) goto L7e
            return r2
        L7e:
            r7.f1()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: x65.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
