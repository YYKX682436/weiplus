package mx3;

/* loaded from: classes10.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f332614d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f332615e;

    /* renamed from: f, reason: collision with root package name */
    public int f332616f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f332617g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f332618h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(kotlin.coroutines.Continuation continuation, kotlin.coroutines.Continuation continuation2) {
        super(2, continuation2);
        this.f332618h = continuation;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        mx3.r rVar = new mx3.r(this.f332618h, continuation);
        rVar.f332617g = obj;
        return rVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mx3.r) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x006b  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r10.f332616f
            kotlin.coroutines.Continuation r2 = r10.f332618h
            r3 = 1
            if (r1 == 0) goto L23
            if (r1 != r3) goto L1b
            java.lang.Object r0 = r10.f332615e
            kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
            java.lang.Object r1 = r10.f332614d
            vx3.i r1 = (vx3.i) r1
            java.lang.Object r3 = r10.f332617g
            kotlinx.coroutines.y0 r3 = (kotlinx.coroutines.y0) r3
            kotlin.ResultKt.throwOnFailure(r11)
            goto L56
        L1b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L23:
            kotlin.ResultKt.throwOnFailure(r11)
            java.lang.Object r11 = r10.f332617g
            kotlinx.coroutines.y0 r11 = (kotlinx.coroutines.y0) r11
            mx3.f0 r1 = mx3.f0.f332548a
            androidx.lifecycle.j0 r1 = mx3.f0.f332551d
            java.lang.Object r1 = r1.getValue()
            vx3.i r1 = (vx3.i) r1
            if (r1 == 0) goto L68
            mx3.s r4 = mx3.u.f332620f
            r10.f332617g = r11
            r10.f332614d = r1
            r10.f332615e = r2
            r10.f332616f = r3
            java.lang.String r6 = c01.z1.r()
            java.lang.String r11 = "getUsernameFromUserInfo(...)"
            kotlin.jvm.internal.o.f(r6, r11)
            r7 = 0
            java.lang.String r8 = ""
            r5 = r1
            r9 = r10
            java.lang.Object r11 = r4.e(r5, r6, r7, r8, r9)
            if (r11 != r0) goto L55
            return r0
        L55:
            r0 = r2
        L56:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            java.lang.Object r11 = kotlin.Result.m521constructorimpl(r11)
            r0.resumeWith(r11)
            goto L69
        L68:
            r1 = 0
        L69:
            if (r1 != 0) goto L76
            kotlin.Result$Companion r11 = kotlin.Result.INSTANCE
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            java.lang.Object r11 = kotlin.Result.m521constructorimpl(r11)
            r2.resumeWith(r11)
        L76:
            jz5.f0 r11 = jz5.f0.f302826a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: mx3.r.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
