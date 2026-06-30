package df2;

/* loaded from: classes5.dex */
public final class ca extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f229869d;

    /* renamed from: e, reason: collision with root package name */
    public int f229870e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.xe1 f229871f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ df2.zb f229872g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f229873h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca(r45.xe1 xe1Var, df2.zb zbVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f229871f = xe1Var;
        this.f229872g = zbVar;
        this.f229873h = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.ca(this.f229871f, this.f229872g, this.f229873h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.ca) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r8.f229870e
            java.lang.String r2 = r8.f229873h
            df2.zb r3 = r8.f229872g
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r1 == 0) goto L30
            if (r1 == r6) goto L2c
            if (r1 == r5) goto L24
            if (r1 != r4) goto L1c
            java.lang.Object r0 = r8.f229869d
            xg2.h r0 = (xg2.h) r0
            kotlin.ResultKt.throwOnFailure(r9)
            goto L7d
        L1c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L24:
            java.lang.Object r1 = r8.f229869d
            xg2.h r1 = (xg2.h) r1
            kotlin.ResultKt.throwOnFailure(r9)
            goto L61
        L2c:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L42
        L30:
            kotlin.ResultKt.throwOnFailure(r9)
            r45.xe1 r9 = r8.f229871f
            com.tencent.mm.modelbase.i r9 = r9.d()
            r8.f229870e = r6
            java.lang.Object r9 = xg2.g.d(r9, r7, r8, r6, r7)
            if (r9 != r0) goto L42
            return r0
        L42:
            r1 = r9
            xg2.h r1 = (xg2.h) r1
            boolean r9 = r1 instanceof xg2.i
            if (r9 == 0) goto L61
            oz5.l r9 = r1.f454392a
            if (r9 != 0) goto L51
            oz5.l r9 = r8.getContext()
        L51:
            df2.ba r6 = new df2.ba
            r6.<init>(r1, r7, r3, r2)
            r8.f229869d = r1
            r8.f229870e = r5
            java.lang.Object r9 = kotlinx.coroutines.l.g(r9, r6, r8)
            if (r9 != r0) goto L61
            return r0
        L61:
            boolean r9 = r1 instanceof xg2.b
            if (r9 == 0) goto L7d
            oz5.l r9 = r1.f454392a
            if (r9 != 0) goto L6d
            oz5.l r9 = r8.getContext()
        L6d:
            df2.aa r5 = new df2.aa
            r5.<init>(r1, r7, r3, r2)
            r8.f229869d = r1
            r8.f229870e = r4
            java.lang.Object r9 = kotlinx.coroutines.l.g(r9, r5, r8)
            if (r9 != r0) goto L7d
            return r0
        L7d:
            jz5.f0 r9 = jz5.f0.f302826a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.ca.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
