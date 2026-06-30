package rn2;

/* loaded from: classes3.dex */
public final class n0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f397801d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f397802e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rn2.c1 f397803f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(rn2.c1 c1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f397803f = c1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        rn2.n0 n0Var = new rn2.n0(this.f397803f, continuation);
        n0Var.f397802e = obj;
        return n0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rn2.n0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x004b  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r5.f397801d
            r2 = 1
            if (r1 == 0) goto L19
            if (r1 != r2) goto L11
            java.lang.Object r0 = r5.f397802e
            kotlinx.coroutines.y0 r0 = (kotlinx.coroutines.y0) r0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L39
        L11:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L19:
            kotlin.ResultKt.throwOnFailure(r6)
            java.lang.Object r6 = r5.f397802e
            kotlinx.coroutines.y0 r6 = (kotlinx.coroutines.y0) r6
            gk2.e r1 = gk2.e.f272471n
            if (r1 == 0) goto L3c
            java.lang.Class<on2.z2> r3 = on2.z2.class
            androidx.lifecycle.c1 r1 = r1.a(r3)
            on2.z2 r1 = (on2.z2) r1
            r5.f397802e = r6
            r5.f397801d = r2
            java.lang.Object r1 = r1.Y6(r2, r5)
            if (r1 != r0) goto L37
            return r0
        L37:
            r0 = r6
            r6 = r1
        L39:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            goto L40
        L3c:
            r0 = 0
            r4 = r0
            r0 = r6
            r6 = r4
        L40:
            kotlinx.coroutines.z0.g(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r6 = kotlin.jvm.internal.o.b(r6, r0)
            if (r6 == 0) goto L55
            rn2.m0 r6 = new rn2.m0
            rn2.c1 r0 = r5.f397803f
            r6.<init>(r0)
            pm0.v.X(r6)
        L55:
            jz5.f0 r6 = jz5.f0.f302826a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: rn2.n0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
