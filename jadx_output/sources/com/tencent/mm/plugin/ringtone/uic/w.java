package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes10.dex */
public final class w extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f158523d;

    /* renamed from: e, reason: collision with root package name */
    public int f158524e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t45.l0 f158525f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f158526g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f158527h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(t45.l0 l0Var, java.lang.String str, kotlin.coroutines.Continuation continuation, kotlin.coroutines.Continuation continuation2) {
        super(2, continuation2);
        this.f158525f = l0Var;
        this.f158526g = str;
        this.f158527h = continuation;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.ringtone.uic.w(this.f158525f, this.f158526g, this.f158527h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.ringtone.uic.w) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x005e  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r12.f158524e
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            java.lang.Object r0 = r12.f158523d
            kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
            kotlin.ResultKt.throwOnFailure(r13)
            goto L5a
        L14:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1c:
            kotlin.ResultKt.throwOnFailure(r13)
            goto L3c
        L20:
            kotlin.ResultKt.throwOnFailure(r13)
            mx3.s r13 = mx3.u.f332620f
            r4 = 1
            r5 = 3
            t45.l0 r6 = r12.f158525f
            int r7 = r6.f415602e
            int r8 = r6.f415603f
            java.lang.String r9 = r12.f158526g
            r12.f158524e = r3
            java.lang.String r10 = ""
            r3 = r13
            r11 = r12
            java.lang.Object r13 = r3.c(r4, r5, r6, r7, r8, r9, r10, r11)
            if (r13 != r0) goto L3c
            return r0
        L3c:
            rm0.i r13 = (rm0.i) r13
            boolean r13 = r13.f397421a
            kotlin.coroutines.Continuation r1 = r12.f158527h
            if (r13 == 0) goto L6a
            r12.f158523d = r1
            r12.f158524e = r2
            kotlinx.coroutines.p0 r13 = kotlinx.coroutines.q1.f310570c
            vx3.j r2 = new vx3.j
            r3 = 0
            t45.l0 r4 = r12.f158525f
            r2.<init>(r4, r3)
            java.lang.Object r13 = kotlinx.coroutines.l.g(r13, r2, r12)
            if (r13 != r0) goto L59
            return r0
        L59:
            r0 = r1
        L5a:
            vx3.i r13 = (vx3.i) r13
            if (r13 == 0) goto L75
            kotlin.Result$Companion r13 = kotlin.Result.INSTANCE
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            java.lang.Object r13 = kotlin.Result.m521constructorimpl(r13)
            r0.resumeWith(r13)
            goto L75
        L6a:
            kotlin.Result$Companion r13 = kotlin.Result.INSTANCE
            java.lang.Boolean r13 = java.lang.Boolean.FALSE
            java.lang.Object r13 = kotlin.Result.m521constructorimpl(r13)
            r1.resumeWith(r13)
        L75:
            jz5.f0 r13 = jz5.f0.f302826a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.ringtone.uic.w.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
