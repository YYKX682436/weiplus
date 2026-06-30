package ni2;

/* loaded from: classes3.dex */
public final class o0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f337394d;

    public o0(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ni2.o0(continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new ni2.o0((kotlin.coroutines.Continuation) obj2).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0077  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r5.f337394d
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L23
            if (r1 == r4) goto L1f
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            kotlin.ResultKt.throwOnFailure(r6)
            goto L6b
        L13:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1b:
            kotlin.ResultKt.throwOnFailure(r6)
            goto L4e
        L1f:
            kotlin.ResultKt.throwOnFailure(r6)
            goto L33
        L23:
            kotlin.ResultKt.throwOnFailure(r6)
            ko0.l r6 = ko0.l.f309870a
            ko0.d r1 = ko0.d.f309836f
            r5.f337394d = r4
            java.lang.Object r6 = r6.a(r1, r5)
            if (r6 != r0) goto L33
            return r0
        L33:
            ko0.l r6 = ko0.l.f309870a
            r6.d()
            dk2.d r1 = dk2.d.f233301a
            lo0.t r6 = r6.b()
            r1.e(r6)
            ko0.l0 r6 = ko0.l0.f309878a
            ko0.e0 r1 = ko0.e0.f309848e
            r5.f337394d = r3
            java.lang.Object r6 = r6.a(r1, r5)
            if (r6 != r0) goto L4e
            return r0
        L4e:
            ko0.l0 r6 = ko0.l0.f309878a
            dk2.ug r1 = dk2.ug.f234218a
            boolean r3 = dk2.ug.f234219b
            r6.c(r3)
            lo0.p0 r6 = r6.b()
            r1.c(r6)
            ko0.c0 r6 = ko0.c0.f309825a
            ko0.u r1 = ko0.u.f309905e
            r5.f337394d = r2
            java.lang.Object r6 = r6.a(r1, r5)
            if (r6 != r0) goto L6b
            return r0
        L6b:
            dk2.ef r6 = dk2.ef.f233372a
            java.lang.Class<mm2.c1> r0 = mm2.c1.class
            androidx.lifecycle.c1 r6 = r6.i(r0)
            mm2.c1 r6 = (mm2.c1) r6
            if (r6 == 0) goto L79
            boolean r4 = r6.O3
        L79:
            ko0.c0 r6 = ko0.c0.f309825a
            r6.d(r4)
            jz5.f0 r6 = jz5.f0.f302826a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ni2.o0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
