package qz0;

/* loaded from: classes.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f367820d;

    /* renamed from: e, reason: collision with root package name */
    public int f367821e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ny0.f f367822f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.test.TemplateTestUI f367823g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ny0.f fVar, com.tencent.mm.mj_template.test.TemplateTestUI templateTestUI, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f367822f = fVar;
        this.f367823g = templateTestUI;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qz0.f(this.f367822f, this.f367823g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qz0.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r9.f367821e
            jz5.f0 r2 = jz5.f0.f302826a
            com.tencent.mm.mj_template.test.TemplateTestUI r3 = r9.f367823g
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r1 == 0) goto L2c
            if (r1 == r6) goto L24
            if (r1 == r5) goto L20
            if (r1 != r4) goto L18
            kotlin.ResultKt.throwOnFailure(r10)
            goto L7f
        L18:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L20:
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L5a
            goto L55
        L24:
            java.lang.Object r1 = r9.f367820d
            com.tencent.mm.mj_template.test.TemplateTestUI r1 = (com.tencent.mm.mj_template.test.TemplateTestUI) r1
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L5a
            goto L3f
        L2c:
            kotlin.ResultKt.throwOnFailure(r10)
            ny0.f r10 = r9.f367822f
            kotlin.Result$Companion r1 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L5a
            r9.f367820d = r3     // Catch: java.lang.Throwable -> L5a
            r9.f367821e = r6     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r10 = r10.c(r7, r9)     // Catch: java.lang.Throwable -> L5a
            if (r10 != r0) goto L3e
            return r0
        L3e:
            r1 = r3
        L3f:
            ny0.e r10 = (ny0.e) r10     // Catch: java.lang.Throwable -> L5a
            kotlinx.coroutines.p0 r6 = kotlinx.coroutines.q1.f310568a     // Catch: java.lang.Throwable -> L5a
            kotlinx.coroutines.g3 r6 = kotlinx.coroutines.internal.b0.f310484a     // Catch: java.lang.Throwable -> L5a
            qz0.d r8 = new qz0.d     // Catch: java.lang.Throwable -> L5a
            r8.<init>(r1, r10, r7)     // Catch: java.lang.Throwable -> L5a
            r9.f367820d = r7     // Catch: java.lang.Throwable -> L5a
            r9.f367821e = r5     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r10 = kotlinx.coroutines.l.g(r6, r8, r9)     // Catch: java.lang.Throwable -> L5a
            if (r10 != r0) goto L55
            return r0
        L55:
            java.lang.Object r10 = kotlin.Result.m521constructorimpl(r2)     // Catch: java.lang.Throwable -> L5a
            goto L65
        L5a:
            r10 = move-exception
            kotlin.Result$Companion r1 = kotlin.Result.INSTANCE
            java.lang.Object r10 = kotlin.ResultKt.createFailure(r10)
            java.lang.Object r10 = kotlin.Result.m521constructorimpl(r10)
        L65:
            java.lang.Throwable r1 = kotlin.Result.m524exceptionOrNullimpl(r10)
            if (r1 == 0) goto L7f
            kotlinx.coroutines.p0 r5 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r5 = kotlinx.coroutines.internal.b0.f310484a
            qz0.e r6 = new qz0.e
            r6.<init>(r3, r1, r7)
            r9.f367820d = r10
            r9.f367821e = r4
            java.lang.Object r10 = kotlinx.coroutines.l.g(r5, r6, r9)
            if (r10 != r0) goto L7f
            return r0
        L7f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: qz0.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
