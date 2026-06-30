package ni2;

/* loaded from: classes10.dex */
public final class c1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f337261d;

    /* renamed from: e, reason: collision with root package name */
    public int f337262e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f337263f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ni2.f1 f337264g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f337265h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(ni2.f1 f1Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f337264g = f1Var;
        this.f337265h = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        ni2.c1 c1Var = new ni2.c1(this.f337264g, this.f337265h, continuation);
        c1Var.f337263f = obj;
        return c1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ni2.c1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r9.f337262e
            jz5.f0 r2 = jz5.f0.f302826a
            ni2.f1 r3 = r9.f337264g
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r1 == 0) goto L35
            if (r1 == r6) goto L29
            if (r1 == r5) goto L21
            if (r1 != r4) goto L19
            kotlin.ResultKt.throwOnFailure(r10)
            goto L8d
        L19:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L21:
            java.lang.Object r1 = r9.f337263f
            kotlinx.coroutines.y0 r1 = (kotlinx.coroutines.y0) r1
            kotlin.ResultKt.throwOnFailure(r10)
            goto L72
        L29:
            java.lang.Object r1 = r9.f337261d
            ni2.f1 r1 = (ni2.f1) r1
            java.lang.Object r6 = r9.f337263f
            kotlinx.coroutines.y0 r6 = (kotlinx.coroutines.y0) r6
            kotlin.ResultKt.throwOnFailure(r10)
            goto L54
        L35:
            kotlin.ResultKt.throwOnFailure(r10)
            java.lang.Object r10 = r9.f337263f
            kotlinx.coroutines.y0 r10 = (kotlinx.coroutines.y0) r10
            xh2.a r1 = r3.f337296q
            if (r1 == 0) goto L74
            lj2.x0 r8 = r3.f337292m
            r9.f337263f = r10
            r9.f337261d = r3
            r9.f337262e = r6
            java.lang.String r6 = r9.f337265h
            java.lang.Object r1 = r8.O(r1, r6, r9)
            if (r1 != r0) goto L51
            return r0
        L51:
            r6 = r10
            r10 = r1
            r1 = r3
        L54:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L72
            kotlinx.coroutines.p0 r10 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r10 = kotlinx.coroutines.internal.b0.f310484a
            ni2.a1 r8 = new ni2.a1
            r8.<init>(r1, r7)
            r9.f337263f = r6
            r9.f337261d = r7
            r9.f337262e = r5
            java.lang.Object r10 = kotlinx.coroutines.l.g(r10, r8, r9)
            if (r10 != r0) goto L72
            return r0
        L72:
            r10 = r2
            goto L75
        L74:
            r10 = r7
        L75:
            if (r10 != 0) goto L8d
            kotlinx.coroutines.p0 r10 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r10 = kotlinx.coroutines.internal.b0.f310484a
            ni2.b1 r1 = new ni2.b1
            r1.<init>(r3, r7)
            r9.f337263f = r7
            r9.f337261d = r7
            r9.f337262e = r4
            java.lang.Object r10 = kotlinx.coroutines.l.g(r10, r1, r9)
            if (r10 != r0) goto L8d
            return r0
        L8d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ni2.c1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
