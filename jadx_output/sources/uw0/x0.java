package uw0;

/* loaded from: classes5.dex */
public final class x0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f431624d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uw0.e1 f431625e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(uw0.e1 e1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f431625e = e1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new uw0.x0(this.f431625e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((uw0.x0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0077 A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r8.f431624d
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            uw0.e1 r6 = r8.f431625e
            if (r1 == 0) goto L26
            if (r1 == r5) goto L22
            if (r1 == r4) goto L1e
            if (r1 != r3) goto L16
            kotlin.ResultKt.throwOnFailure(r9)
            goto L78
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1e:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L65
        L22:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L38
        L26:
            kotlin.ResultKt.throwOnFailure(r9)
            kotlinx.coroutines.r2 r9 = r6.A7()
            if (r9 == 0) goto L38
            r8.f431624d = r5
            java.lang.Object r9 = r9.C(r8)
            if (r9 != r0) goto L38
            return r0
        L38:
            xw0.r r9 = r6.u7()
            sw0.b r1 = r6.f349118q
            if (r1 == 0) goto L43
            java.lang.String r5 = r1.f413415b
            goto L44
        L43:
            r5 = r2
        L44:
            if (r1 == 0) goto L4a
            java.lang.String r1 = r1.f413416c
            if (r1 != 0) goto L54
        L4a:
            xw0.r r1 = r6.u7()
            ug.m r7 = ug.m.Caption
            java.lang.String r1 = r1.f(r7)
        L54:
            xw0.r r7 = r6.u7()
            com.tencent.maas.material.MJMaterialInfo r7 = r7.f457644h
            java.lang.String r7 = r7.f48224b
            r8.f431624d = r4
            java.lang.Object r9 = r9.g(r5, r1, r7, r8)
            if (r9 != r0) goto L65
            return r0
        L65:
            xw0.r r9 = r6.u7()
            sw0.b r1 = r6.f349118q
            if (r1 == 0) goto L6f
            java.lang.String r2 = r1.f413417d
        L6f:
            r8.f431624d = r3
            java.lang.Object r9 = r9.n(r2, r8)
            if (r9 != r0) goto L78
            return r0
        L78:
            jz5.f0 r9 = jz5.f0.f302826a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: uw0.x0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
